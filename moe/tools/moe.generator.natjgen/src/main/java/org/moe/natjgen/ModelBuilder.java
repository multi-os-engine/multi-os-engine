/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natjgen;

import org.clang.c.clang;
import org.clang.enums.CXCursorKind;
import org.clang.enums.CXIdxEntityKind;
import org.clang.enums.CXIdxObjCContainerKind;
import org.clang.enums.CXLinkageKind;
import org.clang.enums.CXObjCPropertyAttrKind;
import org.clang.enums.CXTypeKind;
import org.clang.opaque.CXTranslationUnit;
import org.clang.struct.CXCursor;
import org.clang.struct.CXIdxDeclInfo;
import org.clang.struct.CXIdxEntityInfo;
import org.clang.struct.CXIdxObjCCategoryDeclInfo;
import org.clang.struct.CXIdxObjCInterfaceDeclInfo;
import org.clang.struct.CXIdxObjCPropertyDeclInfo;
import org.clang.struct.CXIdxObjCProtocolRefListInfo;
import org.clang.struct.CXSourceRange;
import org.clang.struct.CXString;
import org.clang.struct.CXToken;
import org.clang.struct.CXType;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natjgen.Configuration.Unit;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;

import static org.clang.c.clang.*;
import static org.clang.c.clang.clang_getTokenSpelling;

class ModelBuilder extends AbstractModelEditor {

    protected ModelBuilder(Indexer indexer, int memModel) {
        super(indexer, memModel);
    }

    @Override
    public void processObjCClass(final CXIdxDeclInfo decl) {
        // Only index @interfaces
        if (decl.getObjCContainerDeclInfo().kind() != CXIdxObjCContainerKind.CXIdxObjCContainer_Interface) {
            return;
        }

        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            disabledObjCClasses.add(unit.getOriginalName());
            return;
        }

        // Check availability
        CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(declCursor)) {
            if (!unit.handlingExternal()) {
                CXIdxObjCInterfaceDeclInfo info = decl.getObjCInterfaceDeclInfo();
                statLog().log(Statistics.UNAVAILABLE, Statistics.OBJC_CLASS,
                        info.containerInfo().declInfo().cursor().toString());
            }
            return;
        }

        // Get super class
        final CXIdxObjCInterfaceDeclInfo info = decl.getObjCInterfaceDeclInfo();
        final String supername = info.superInfo() == null ? null : info.superInfo().cursor().toString();

        // Create manager
        final ObjCClassManager manager = new ObjCClassManager(indexer, unit.getFQName(), unit.getOriginalName(),
                supername, clang_Cursor_getObjCRuntimeName(declCursor).toString());
        manager.setExternalUnit(unit.handlingExternal());
        manager.setLibraryName(unit.getFramework());
        manager.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        manager.setHybridClass(unit.generateHybridClass());
        manager.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

        boolean typeParamsFailed = false;
        int numOLG = clang.clang_Cursor_getNumObjCGenericParams(declCursor);
        if (numOLG > 0) {
            ArrayList<ObjCGenericParamType> params = new ArrayList<ObjCGenericParamType>(numOLG);
            final String className = declCursor.toString();
            for (int index = 0; index < numOLG; ++index) {
                CXType type = clang.clang_Cursor_getObjCGenericParamType(declCursor, index);
                int variance = clang.clang_Cursor_getObjCGenericParamVariance(declCursor, index);
                if (type.kind() == CXTypeKind.Invalid) {
                    typeParamsFailed = true;
                    params.clear();
                    break;
                }
                ObjCGenericParamType param = new ObjCGenericParamType(index, manager, type, variance);
                params.add(param);
            }
            for (ObjCGenericParamType param : params) {
                Type.registerObjCGenericParamTypeForClass(param.getUSR(), className + ":" + param.getLocation(), param);
                manager.addGenericParamType(param);
            }
        }

        // Super type generics, this MUST come after processing the class' own
        // parameter types
        if (!typeParamsFailed) {
            CXType superCXType = clang.clang_Cursor_getObjCInterfaceParameterizedSuperType(declCursor);
            if (superCXType.kind() != CXTypeKind.Invalid) {
                ArrayList<Type> typeArgs = new ArrayList<Type>();
                int NTA = clang.clang_Type_getNumTemplateArguments(superCXType);
                if (NTA > 0) {
                    typeArgs = new ArrayList<Type>();
                    for (int i = 0; i < NTA; ++i) {
                        CXType TAType = clang.clang_Type_getTemplateArgumentAsType(superCXType, i);
                        typeArgs.add(new Type(TAType, memModel));
                    }
                }
                manager.setSuperTypeGenericParams(typeArgs);
            }
        }

        // Add protocols
        final int protocol_count = info.protocols().numProtocols();
        for (int i = 0; i < protocol_count; ++i) {
            manager.addProtocolName(info.protocols().protocols().get(i).get().cursor().toString());
        }

        // Add manager
        getGenerator().put(unit.getOriginalName(), manager);
    }

    @Override
    public void processObjCCategory(final CXIdxDeclInfo decl) {
        // Only index @interfaces
        if (decl.getObjCContainerDeclInfo().kind() != CXIdxObjCContainerKind.CXIdxObjCContainer_Interface) {
            return;
        }

        // Get info
        final CXIdxObjCCategoryDeclInfo info = decl.getObjCCategoryDeclInfo();
        CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(info.objcClass().cursor())) {
            indexer.unavailableCategories.add(declCursor.getCursorUSR().toString());
            return;
        }
        final String class_name = info.classCursor().toString();
        final ObjCClassManager objcclass = getGenerator().getClass(class_name);
        if (objcclass == null) {
            if (disabledObjCClasses.contains(class_name)) {
                return;
            }
            throw new RuntimeException("Class with name " + info.classCursor().toString() + " couldn't be found!");
        }

        int numOLG = clang.clang_Cursor_getNumObjCGenericParams(declCursor);
        if (numOLG > 0) {
            final String className = info.classCursor().toString();
            for (int index = 0; index < numOLG; ++index) {
                CXType type = clang.clang_Cursor_getObjCGenericParamType(declCursor, index);
                if (type.kind() == CXTypeKind.Invalid) continue;
                Type.registerObjCGenericParamTypeForCategory(type.getTypeDeclaration().getCursorUSR().toString(),
                        className + ":" + index);
            }
        }

        // Insert category into categoryClassMap
        indexer.categoryClassMap.put(declCursor.getCursorUSR().toString(), class_name);

        // Inject protocols
        for (int i = 0; i < info.protocols().numProtocols(); ++i) {
            objcclass.addProtocolName(info.protocols().protocols().get(i).get().cursor().toString());
        }
    }

    @Override
    public void processObjCProtocol(final CXIdxDeclInfo decl) {
        // Only index @interfaces
        if (decl.getObjCContainerDeclInfo().kind() != CXIdxObjCContainerKind.CXIdxObjCContainer_Interface) {
            return;
        }

        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Check availability
        final CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(declCursor)) {
            if (!unit.handlingExternal()) {
                statLog().log(Statistics.UNAVAILABLE, Statistics.OBJC_PROTOCOL, declCursor.toString());
            }
            return;
        }

        // Create manager
        final ObjCProtocolManager manager = new ObjCProtocolManager(indexer, unit.getFQName(), unit.getOriginalName(),
                clang_Cursor_getObjCRuntimeName(declCursor).toString());
        manager.setExternalUnit(unit.handlingExternal());
        manager.setLibraryName(unit.getFramework());
        manager.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        manager.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

        // Add protocols
        final CXIdxObjCProtocolRefListInfo info = decl.getObjCProtocolRefListInfo();
        for (int i = 0; i < info.numProtocols(); ++i) {
            manager.addProtocolName(info.protocols().get(i).get().cursor().toString());
        }

        // Add manager
        getGenerator().put(unit.getOriginalName(), manager);
    }

    private void addObjCMemberToContainer(final ObjCClassManager manager, final CXIdxDeclInfo decl,
            final ObjCMethod method) {
        if (manager == null || decl == null || method == null) {
            throw new NullPointerException();
        }
        if (manager instanceof ObjCProtocolManager) {
            method.setProtocolMethod();
            method.setOptional(decl.cursor().isObjCOptional());
        }
        manager.addMethod(method);
    }

    @Override
    public void processObjCMethod(final CXIdxDeclInfo decl) {
        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Check availability
        final ObjCClassManager manager;
        if (!ClangUtil.isObjCDeclAvailable(decl) || (manager = indexer.getObjCManagerForContainer(decl)) == null) {
            if (!unit.handlingExternal()) {
                if (decl.entityInfo().kind() == CXIdxEntityKind.CXIdxEntity_ObjCClassMethod) {
                    statLog().log(Statistics.UNAVAILABLE, Statistics.OBJC_CLASS_METHOD,
                            decl.entityInfo().cursor().toString());
                } else if (decl.entityInfo().kind() == CXIdxEntityKind.CXIdxEntity_ObjCInstanceMethod) {
                    statLog().log(Statistics.UNAVAILABLE, Statistics.OBJC_INSTANCE_METHOD,
                            decl.entityInfo().cursor().toString());
                }
            }
            return;
        }

        // Get Objective-C attribute
        final ObjCAttributeInfo attrInfo = getObjCMemberAttribute(decl);

        // Get selector, type & arguments
        final CXCursor declCursor = decl.cursor();
        final boolean isStatic = declCursor.kind() == CXCursorKind.ObjCClassMethodDecl;
        final String selector = decl.entityInfo().cursor().toString();
        final int count = declCursor.getNumArguments();
        Type returnType = new Type(declCursor.getCursorResultType(), memModel);
        ObjCMethod method = new ObjCMethod(selector, isStatic, returnType, count, ObjCMethodKind.METHOD,
                declCursor.isVariadic(), manager);
        for (int i = 0; i < count; ++i) {
            CXCursor argCursor = declCursor.getArgument(i);
            CXType type = argCursor.getCursorType();
            String name = argCursor.toString();
            method.getArguments().add(new CalleeArgument(name, new Type(type, memModel, argCursor)));
        }
        method.close();
        method.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        method.setAttribute(attrInfo);
        method.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

        // Skip if needed
        if (unit.handlingExternal()) {
            method.setExternalUnit(unit.handlingExternal());
        }

        // Handle injection
        addObjCMemberToContainer(manager, decl, method);

        // Log type info
        typeLog().objcMethod(manager, selector, method.getType(), -1, method.isStatic(), decl);
        for (int i = 0; i < method.getArguments().size(); ++i) {
            indexer.tStats
                    .objcMethod(manager, selector, method.getArguments().get(i).getType(), i, method.isStatic(), decl);
        }
    }

    @Override
    public void processObjCProperty(final CXIdxDeclInfo decl) {
        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Prepare infos
        final CXIdxObjCPropertyDeclInfo info = decl.getObjCPropertyDeclInfo();
        final CXIdxEntityInfo getter_info = info.getter();
        final CXIdxEntityInfo setter_info = info.setter();

        // Check availability
        final ObjCClassManager manager;
        if (!ClangUtil.isObjCDeclAvailable(decl) || (manager = indexer.getObjCManagerForContainer(decl)) == null) {
            if (!unit.handlingExternal()) {
                statLog().log(Statistics.UNAVAILABLE, Statistics.OBJC_PROPERTY_GETTER,
                        decl.entityInfo().cursor().toString());
                if (setter_info != null) {
                    statLog().log(Statistics.UNAVAILABLE, Statistics.OBJC_PROPERTY_SETTER,
                            decl.entityInfo().cursor().toString());
                }
            }
            return;
        }

        // Get Objective-C attribute
        final ObjCAttributeInfo attrInfo = getObjCMemberAttribute(decl);
        final CXCursor declCursor = decl.cursor();
        final CXType type = declCursor.getCursorType();
        final String name = declCursor.toString();
        final int propertyFlags = clang_Cursor_getObjCPropertyAttributes(declCursor, 0);
        final boolean isStatic = (propertyFlags & CXObjCPropertyAttrKind.CXObjCPropertyAttr_class) > 0;

        final String comment = ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform());

        // Create getter
        final ObjCMethod getter = new ObjCMethod(getter_info.cursor().toString(), isStatic, new Type(type, memModel), 0,
                ObjCMethodKind.PROPERTY_GETTER, false, manager);
        getter.close();
        getter.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        getter.setPropertyName(name);
        getter.setAttribute(attrInfo);
        getter.setPropertyFlags(propertyFlags);
        getter.setComment(comment);

        // Skip if needed
        if (unit.handlingExternal()) {
            getter.setExternalUnit(unit.handlingExternal());
        }

        // Handle injection
        addObjCMemberToContainer(manager, decl, getter);

        // Create setter
        if (setter_info != null) {
            final ObjCMethod setter = new ObjCMethod(setter_info.cursor().toString(), isStatic, null, 1,
                    ObjCMethodKind.PROPERTY_SETTER, false, manager);
            setter.getArguments().add(new CalleeArgument("value", new Type(type, memModel)));
            setter.close();
            setter.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
            setter.setPropertyName(name);
            setter.setAttribute(attrInfo);
            setter.setPropertyFlags(propertyFlags);
            setter.setAssociatedGetter(getter);
            setter.setComment(comment);

            // Skip if needed
            if (unit.handlingExternal()) {
                setter.setExternalUnit(unit.handlingExternal());
            }

            // Handle injection
            addObjCMemberToContainer(manager, decl, setter);
        }

        // Log type info
        typeLog().objcProp(manager, name, getter.getType(), setter_info, decl);
    }

    @Override
    public void processStruct(final CXIdxDeclInfo decl) {
        // Only process definitions
        if (decl.isDefinition() == 0) {
            return;
        }

        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Check availability
        if (!ClangUtil.isAvailable(decl.cursor())) {
            if (!unit.handlingExternal()) {
                statLog().log(Statistics.UNAVAILABLE, Statistics.C_STRUCT, decl.entityInfo().USR());
            }
            return;
        }

        final CStructManager existingStruct = getGenerator().getStruct(decl.entityInfo().USR());
        if (existingStruct != null) {
            existingStruct.setDeclarationComplete(true);
            return;
        }

        // Create manager
        final CStructManager manager = new CStructManager(indexer, unit.getFQName(), ClangUtil.getFilePath(decl),
                decl.entityInfo().USR());
        manager.setExternalUnit(unit.handlingExternal());
        manager.setAlignment(decl.cursor().getCursorType().getAlignOf());
        manager.setDeprecated(ClangUtil.isDeprecated(decl.cursor(), indexer.getConfiguration().getPlatform()));
        getGenerator().put(decl.entityInfo().USR(), manager);
    }

    @Override
    public void processField(final CXIdxDeclInfo decl) {
        // Get manager
        final CStructManager struct = getGenerator()
                .getStruct(decl.semanticContainer().cursor().getCursorUSR().toString());
        if (struct == null || struct.isDeclarationComplete()) {
            return;
        }

        // Add field
        final String fieldname = decl.cursor().toString();
        if (fieldname != null) {
            final CStructField field = new CStructField(fieldname, new Type(decl.cursor().getCursorType(), memModel),
                    decl.cursor().isBitField());
            field.setDeprecated(ClangUtil.isDeprecated(decl.cursor(), indexer.getConfiguration().getPlatform()));
            field.setComment(ClangUtil.getComment(decl.cursor(), indexer.getConfiguration().getPlatform()));
            if (field.getConstantArraySize() > 0) {
                struct.getFields().add(field);
            }
        } else {
            struct.setFatal("Field's name is null");
        }
    }

    @Override
    public void processEnum(final CXIdxDeclInfo decl) {
        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled() || unit.handlingExternal()) {
            return;
        }

        // Only process definitions
        if (decl.isDefinition() == 0) {
            return;
        }

        // Check availability
        if (!ClangUtil.isAvailable(decl.cursor())) {
            if (!unit.handlingExternal()) {
                statLog().log(Statistics.UNAVAILABLE, Statistics.C_ENUM, decl.entityInfo().USR());
            }
            return;
        }

        // Create manager
        final String unitKey = ClangUtil.getLocationUID(decl.cursor());
        if (getGenerator().getEnum(unitKey) == null) {
            CEnumManager manager = new CEnumManager(indexer, unit.getFQName(), unit.getOriginalName(), unit.getPath());
            manager.setExternalUnit(unit.handlingExternal());
            manager.setDeprecated(ClangUtil.isDeprecated(decl.cursor(), indexer.getConfiguration().getPlatform()));
            manager.setComment(ClangUtil.getComment(decl.cursor(), indexer.getConfiguration().getPlatform()));
            getGenerator().put(unitKey, manager);
        }
    }

    @Override
    public void processEnumConstant(final CXIdxDeclInfo decl) {
        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Skip generation if needed
        if (unit.handlingExternal()) {
            return;
        }

        // Check availability
        final CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(declCursor)) {
            statLog().log(Statistics.UNAVAILABLE, Statistics.C_ENUM_CONST, declCursor.toString());
            return;
        }

        // Get const's info
        final String const_name = declCursor.toString();
        final long const_value = declCursor.getEnumConstantDeclValue();
        final Type const_type = new Type(decl.semanticContainer().cursor().getEnumDeclIntegerType(), memModel);

        if (const_name == null || const_name.length() == 0) {
            statLog().log(Statistics.SKIPPING, Statistics.C_ENUM_CONST, declCursor.getCursorUSR().toString(),
                    "illegal const name");
            return;
        }

        // Get const's manager
        final String enum_name = ClangUtil.getLocationUID(decl.semanticContainer().cursor());
        final CEnumManager manager = getGenerator().getEnum(enum_name);
        if (manager != null) {
            ConstantValue constantValue = ConstantValue.fromSignExtendedValue(const_type, const_value);
            CEnumConstant constant = new CEnumConstant(const_name, constantValue);
            constant.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
            constant.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

            manager.getConstants().add(constant);
        } else {
            statLog().log(Statistics.SKIPPING, Statistics.C_ENUM_CONST, declCursor.getCursorUSR().toString(),
                    "no manager found");
        }
    }

    @Override
    public void processFunction(final CXIdxDeclInfo decl) {
        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Skip generation if needed
        if (unit.handlingExternal()) {
            return;
        }

        // Check availability
        final CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(declCursor)) {
            statLog().log(Statistics.UNAVAILABLE, Statistics.C_FUNCTION, declCursor.toString());
            return;
        }

        // Check variadic && inline property
        if (declCursor.isVariadic() && declCursor.isInlined()) {
            statLog().log(Statistics.SKIPPING, Statistics.C_FUNCTION, declCursor.toString(),
                    "Inline variadic functions are not supported");
            return;
        }

        final boolean isInline = declCursor.isInlined();
        if (!isInline) {
            int linkage = clang.clang_getCursorLinkage(declCursor);
            if (linkage != CXLinkageKind.External) {
                statLog().log(Statistics.SKIPPING, Statistics.C_FUNCTION, declCursor.toString(),
                        "Unsupported linkage kind (" + ClangUtil.nameForLinkage(linkage) + ")");
                return;
            }
        }

        // Get name, type & arguments
        final String function_name = declCursor.toString();
        final CXType function_type = declCursor.getCursorType();
        final Type ret = new Type(function_type.getResultType(), memModel);

        final int num_args = function_type.getNumArgTypes();
        assert num_args == declCursor.getNumArguments();

        final CFunction function = new CFunction(function_name, ret, num_args, declCursor.isVariadic());
        if (isInline) {
            function.setInlined(true);
            function.addLocation(clang_getFileName(decl.loc().getFileLocation()).toString());
        }
        for (int i = 0; i < num_args; ++i) {
            CXType type = function_type.getArgType(i);
            if (isInline) {
                VoidPtr argtfile = type.getTypeDeclaration().getCursorLocation().getFile();
                if (argtfile != null) {
                    function.addLocation(clang_getFileName(argtfile).toString());
                }
            }
            CXCursor argCursor = declCursor.getArgument(i);
            String name = argCursor.toString();
            if (name == null || name.length() == 0) {
                name = "arg" + (i + 1);
            }
            function.getArguments().add(new CalleeArgument(name, new Type(type, memModel, argCursor)));
        }
        function.close();
        function.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        function.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

        // Add function to manager
        final CManager manager = getGenerator().getCManager(indexer, unit);
        manager.addFunction(function);

        // Log type info
        typeLog().cFunc(function_name, function.getType(), -1, decl);
        for (int i = 0; i < function.getArguments().size(); ++i) {
            typeLog().cFunc(function_name, function.getArguments().get(i).getType(), i, decl);
        }
    }

    @Override
    public void processVariable(final CXIdxDeclInfo decl) {
        // Get unit
        final Unit unit = configuration.getUnit(decl);
        if (unit.handlingDisabled()) {
            return;
        }

        // Skip generation if needed
        if (unit.handlingExternal()) {
            return;
        }

        // Check availability
        final CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(declCursor)) {
            statLog().log(Statistics.UNAVAILABLE, Statistics.C_VARIABLE, declCursor.toString());
            return;
        }

        // Figure out linkage
        int linkage = clang.clang_getCursorLinkage(declCursor);
        if (linkage != CXLinkageKind.External && linkage != CXLinkageKind.Internal) {
            statLog().log(Statistics.SKIPPING, Statistics.C_VARIABLE, declCursor.toString(),
                    "Unsupported linkage kind (" + ClangUtil.nameForLinkage(linkage) + ")");
            return;
        }

        // Get name & type
        final String variable_name = declCursor.toString();
        final Type variable_type = new Type(declCursor.getCursorType(), memModel);
        final CVariable variable = new CVariable(variable_name, variable_type);

        // Get optional value
        if (linkage == CXLinkageKind.Internal) {
            if (!variable_type.isPrimitive()) {
                statLog().log(Statistics.SKIPPING, Statistics.C_VARIABLE, declCursor.toString(),
                        "Internal linkage is only supported with primitive types");
                return;
            }
            LongPtr val = PtrFactory.newLongReference();
            if (clang.clang_cursor_getEvaluatedValue(declCursor, val) == 0) {
                statLog().log(Statistics.SKIPPING, Statistics.C_VARIABLE, declCursor.toString(),
                        "Failed to get Java compatible evaluated value");
                return;
            }
            variable.setValue(ConstantValue.fromRawValue(variable.getType(), val.getValue()));
        }
        variable.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        variable.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

        // Add variable to manager
        final CManager manager = getGenerator().getCManager(indexer, unit);
        assert manager != null;
        manager.addVariable(variable);
    }

    @Override
    public void processTypedef(final CXIdxDeclInfo decl) {
        // Only process definitions
        if (decl.isDefinition() == 0) {
            return;
        }

        final CXType ut = decl.cursor().getTypedefDeclUnderlyingType();

        // Look for simple aliasing
        final int utKind = ut.kind();
        if (utKind == CXTypeKind.Unexposed || utKind == CXTypeKind.Elaborated) {
            final CXType cut;
            if (utKind == CXTypeKind.Elaborated) {
                cut = ut.getNamedType();
            } else {
                cut = ut.getCanonicalType();
            }
            if (cut.kind() == CXTypeKind.Record) {
                Unit unit = configuration.getUnit(decl);
                if (unit.handlingDisabled()) {
                    return;
                }

                final String usr = cut.getTypeDeclaration().getCursorUSR().toString();
                indexer.structAliases.add(new Generator.Alias(usr, unit.getName(), unit.getPath()));
            } else if (cut.kind() == CXTypeKind.Enum) {
                final Unit unit = configuration.getUnit(decl);
                if (unit.handlingDisabled()) {
                    return;
                }

                final String usr = ClangUtil.getLocationUID(cut.getTypeDeclaration());
                indexer.enumAliases.add(new Generator.Alias(usr, unit.getName(), unit.getPath()));
            }
        }
        // Look for opaque reference types
        else {
            final Type type = new Type(decl.cursor().getCursorType(), memModel);
            if (type.getKind() != Type.OpaquePtr) {
                return;
            }

            final Unit unit = configuration.getUnit(decl, type);
            if (unit.handlingDisabled()) {
                return;
            }
            if (getGenerator().getOpaqueTypeManager(unit.getOriginalName()) != null) {
//                System.out.println("Skipping " + decl.cursor() + " -> " + ut.getTypeSpelling());
                return;
            }

            final COpaquePtrManager manager = new COpaquePtrManager(indexer, unit.getFQName(), ut.getPointeeType());
            manager.setExternalUnit(unit.handlingExternal());
            getGenerator().put(unit.getOriginalName(), manager);
        }
    }

    @Override
    public void processMacro(final CXIdxDeclInfo decl) {
        Unit unit;
        try {
            // Get unit
            unit = configuration.getUnit(decl);
        }catch (IllegalStateException e) {
            return;
        }
        if (unit.handlingDisabled()) {
            return;
        }

        // Skip generation if needed
        if (unit.handlingExternal()) {
            return;
        }

        // Check availability
        final CXCursor declCursor = decl.cursor();
        if (!ClangUtil.isAvailable(declCursor)) {
            statLog().log(Statistics.UNAVAILABLE, Statistics.C_VARIABLE, declCursor.toString());
            return;
        }
        CXSourceRange range = clang_getCursorExtent(declCursor);
        CXTranslationUnit tu = clang_Cursor_getTranslationUnit(declCursor);
        Ptr<Ptr<CXToken>> tokens = (Ptr<Ptr<CXToken>>)PtrFactory.newPointerPtr(CXToken.class, 2, 2, true, false);
        IntPtr nTokens = PtrFactory.newIntReference();
        clang_tokenize(tu, range, tokens, nTokens);

        // Get name & type
        CXString name = clang_getTokenSpelling(tu, tokens.get(0).get(0));
        final String variable_name = name.toString();
        clang_disposeString(name);

        String macroValue = "";
        // We are just smashing all tokens together to check, whether the resulting string is a number
        // This is mainly done because signs are independent tokens. With that approach we avoid dealing with edge cases.
        for (int i = 1; i < nTokens.get(); i++) {
            CXString sign = clang_getTokenSpelling(tu, tokens.get(0).get(i));
            macroValue += sign.toString();
            clang_disposeString(sign);
        }
        if (macroValue.isEmpty()) return;


        //final Type variable_type = new Type(declCursor.getCursorType(), memModel);
        if (SourceVersion.isKeyword(variable_name)) {
            statLog().log(Statistics.FAILED, Statistics.C_VARIABLE, declCursor.toString());
            return;
        }
        Type type = new Type(Type.LONG_SIZE);
        type.setKind(Type.Double);
        final CVariable variable = new CVariable(variable_name, type);

        try {
            double valueDouble;
            try {
                valueDouble = Double.parseDouble(macroValue);
            } catch (NumberFormatException ignored) {
                // Maybe it is a 0x hex int
                if (macroValue.contains("0x")) {
                    valueDouble = Integer.decode(macroValue);
                } else {
                    return;
                }
            }

            variable.setValue(ConstantValue.fromRawValue(type, Double.doubleToLongBits(valueDouble)));
        }catch (NumberFormatException ignored) {
            // This is expected since we don't know whether this would be a valid macro
            return;
        }

        variable.setDeprecated(ClangUtil.isDeprecated(declCursor, indexer.getConfiguration().getPlatform()));
        variable.setComment(ClangUtil.getComment(declCursor, indexer.getConfiguration().getPlatform()));

        // Add variable to manager
        final CManager manager = getGenerator().getCManager(indexer, unit);

        assert manager != null;
        manager.addVariable(variable);
    }
}
