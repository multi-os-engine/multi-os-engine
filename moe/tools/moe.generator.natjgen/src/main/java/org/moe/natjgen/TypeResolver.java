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

import org.clang.enums.CXTypeNullabilityKind;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ChildPropertyDescriptor;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.WildcardType;

import java.util.HashSet;
import java.util.Set;

public class TypeResolver extends AbstractASTBase {

    public static final int RETURN = 1;
    public static final int ARGUMENT = 2;
    public static final int BOTH = RETURN | ARGUMENT;

    public static final int VOID = 0;
    public static final int PRIMITIVE = 1;
    public static final int STRUCT = 2;
    public static final int OPAQUE = 3;
    public static final int FUNCTION_CB = 4;
    public static final int OBJC_OBJECT = 5;
    public static final int OBJC_CLASS = 6;
    public static final int OBJC_SELECTOR = 7;
    public static final int OBJC_BLOCK = 8;
    public static final int OBJC_GENERICS = 9;
    public static final int LAST_OPTION = OBJC_GENERICS;

    public static final TypeResolver PRIMITIVE_RESOLVER;

    static {
        PRIMITIVE_RESOLVER = new TypeResolver("Primitive", Constants.CRuntime, Context.C);
        PRIMITIVE_RESOLVER.set(PRIMITIVE, BOTH, true, false, true);
        PRIMITIVE_RESOLVER.set(VOID, RETURN, true, false, true);
    }

    private final String resolverName;
    private final String runtime;

    public enum Context {
        C, CALLBACK, OTHER
    }
    private final Context context;

    private final int tSupport[] = new int[LAST_OPTION + 1];
    private final Set<String> supportedMappers = new HashSet<String>();

    private AbstractUnitManager manager;
    private ASTNode node;
    private ChildPropertyDescriptor property;
    private ModifierEditor modifiers;
    private Type type;
    private boolean isInstanceType;
    private boolean isArg;
    private boolean isSupportCheck;

    private static final int RETURN_OFFSET = 0;
    private static final int ARGUMENT_OFFSET = 16;

    private static final int RAW_MASK = 1 << 0;
    private static final int PTR_MASK = 1 << 1;
    private static final int MULTI_PTR_MASK = 1 << 2;

    public synchronized void set(int type, int category, boolean raw, boolean ptr, boolean multiptr) {
        int sub = (raw ? RAW_MASK : 0) + (ptr ? PTR_MASK : 0) + (multiptr ? MULTI_PTR_MASK : 0);
        int value = ((category & RETURN) > 0 ? sub << RETURN_OFFSET : 0) + ((category & ARGUMENT) > 0 ?
                sub << ARGUMENT_OFFSET :
                0);
        tSupport[type] = value;
    }

    public synchronized void add(int type, int category, boolean raw, boolean ptr, boolean multiptr) {
        int sub = (raw ? RAW_MASK : 0) + (ptr ? PTR_MASK : 0) + (multiptr ? MULTI_PTR_MASK : 0);
        int value = ((category & RETURN) > 0 ? sub << RETURN_OFFSET : 0) + ((category & ARGUMENT) > 0 ?
                sub << ARGUMENT_OFFSET :
                0);
        tSupport[type] = tSupport[type] | value;
    }

    private boolean _supports(int type, int depth) {
        int offs = isArg ? ARGUMENT_OFFSET : RETURN_OFFSET;
        int mask = depth == 0 ? RAW_MASK : (depth == 1 ? PTR_MASK : MULTI_PTR_MASK);
        return (tSupport[type] & (mask << offs)) > 0;
    }

    public TypeResolver(String name, String runtime, Context resolverContext) {
        if (runtime != Constants.CRuntime && runtime != Constants.ObjCRuntime) {
            throw new IllegalArgumentException();
        }
        if (resolverContext == null) {
            throw new NullPointerException();
        }
        this.resolverName = name;
        this.runtime = runtime;
        this.context = resolverContext;
    }

    @Override
    protected AbstractUnitManager getManager() {
        return manager;
    }

    @Override
    protected AST getAST() {
        if (manager == null) {
            throw new NullPointerException();
        }
        return manager.getAST();
    }

    public synchronized String getName() {
        return resolverName;
    }

    public synchronized void setSupportedMappers(String supportedMappers[]) {
        this.supportedMappers.clear();
        for (String mapper : supportedMappers) {
            this.supportedMappers.add(mapper);
        }
    }

    private boolean needsReferenceInfo() {
        if (context == Context.C) {
            return !isArg;
        }
        if (context == Context.CALLBACK) {
            return isArg;
        }
        return true;
    }

    public synchronized boolean supports(Type type, boolean isArg) {
        try {
            this.manager = null;
            this.node = null;
            this.property = null;
            this.modifiers = null;
            this.type = type;
            this.isInstanceType = false;
            this.isArg = isArg;
            this.isSupportCheck = true;
            _R();
        } catch (GeneratorException e) {
            return false;
        } finally {
            this.manager = null;
            this.node = null;
            this.property = null;
            this.modifiers = null;
            this.type = null;
            this.isInstanceType = false;
            this.isArg = false;
            this.isSupportCheck = false;
        }
        return true;
    }

    public synchronized void resolve(AbstractUnitManager manager, ASTNode node, ChildPropertyDescriptor property,
            ModifierEditor modifiers, Type type, boolean isArg) throws GeneratorException {
        try {
            this.manager = manager;
            this.node = node;
            this.property = property;
            this.modifiers = modifiers;
            this.type = type;
            this.isInstanceType = false;
            this.isArg = isArg;
            this.isSupportCheck = false;
            _R();
        } finally {
            this.manager = null;
            this.node = null;
            this.property = null;
            this.modifiers = null;
            this.type = null;
            this.isInstanceType = false;
            this.isArg = false;
            this.isSupportCheck = false;
        }
    }

    private void _R() throws GeneratorException {
        if (type.getNullableKind() == CXTypeNullabilityKind.Nullable || type.getNullableKind() == CXTypeNullabilityKind.NullableResult) {
            if (modifiers != null) {
                modifiers.setNullable();
            }
        }
        if (type.getNullableKind() == CXTypeNullabilityKind.NonNull) {
            if (modifiers != null) {
                modifiers.setNotNull();
            }
        }
        Type root = type.getPonierRootType();
        if (root.getKind() == Type.FullyQualified) {
            _R_FullyQualified();
        } else if (root.isVoid()) {
            _R_Void();
        } else if (root.isPrimitive()) {
            _R_Primitive();
        } else if (root.getKind() == Type.Struct) {
            _R_Struct();
        } else if (root.getKind() == Type.FunctionProto) {
            _R_FunctionProto();
        } else if (root.getKind() == Type.OpaquePtr) {
            _R_OpaquePtr();
        } else if (root.getKind() == Type.ObjCId || root.getKind() == Type.ObjCInstanceType) {
            _R_ObjCId();
        } else if (root.getKind() == Type.ObjCObject) {
            _R_ObjCObject();
        } else if (root.getKind() == Type.ObjCClass) {
            _R_ObjCClass();
        } else if (root.getKind() == Type.ObjCSelector) {
            _R_ObjCSEL();
        } else if (root.getKind() == Type.ObjCBlock) {
            _R_ObjCBlock();
        } else {
            throw new UnsupportedTypeException(type, resolverName);
        }
    }

    /**
     * Resolve a fully qualified Java type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_FullyQualified() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (depth > 0) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        switch (depth) {
        case 0: {
            // Java types (i.e. java.lang.String)
            if (isSupportCheck) {
                return;
            }

            _Apply(newSimpleType(type.getElementName()));
            return;
        }

        default:
            throw new GeneratorException("unreachable code");
        }
    }

    /**
     * Resolve a void type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_Void() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(VOID, depth)) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. void)
            _Apply(newPrimitiveType(PrimitiveType.VOID));
            return;
        }

        default: {
            // Level 1+ referenced types (i.e. void*, void**, ...)
            final Type rootType = type.getPonierRootType();
            final String rootTypePtrFQ = Constants.getVoidOrPrimitiveFQPtr(rootType);
            if (depth > 1 && (needsReferenceInfo())) {
                modifiers.setReferenceInfo(manager.addImport("java.lang." + rootType.getPrimitiveJavaClassName()),
                        depth);
            }
            _Apply(_CreateNestedPtr(type, depth - 1, newSimpleType(rootTypePtrFQ)));
            return;
        }
        }
    }

    /**
     * Resolve a primitive type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_Primitive() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(PRIMITIVE, depth)) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. int)
            modifiers.setDowngradeAnnotation(type.getDowngradeAnnotation());
            _Apply(newPrimitiveType(type.getSimpleTypeCode()));
            return;
        }

        case 1: {
            // Level 1+ referenced types (i.e. char*, float*, ...)
            final Type rootType = type.getPonierRootType();
            boolean useSimpleBindingForMapped = false;

            // Uncertain binding
            if (type.isCString() && supportedMappers.contains(Constants.CStringMapper)) {
                // Prepare uncertain binding
                final String C_CONST_BYTE_PTR = "c.const-byte-ptr";
                final String JAVA_STRING = "java.string";
                final ModifierEditor.UncertainDescriptor uncert = new ModifierEditor.UncertainDescriptor(JAVA_STRING,
                        C_CONST_BYTE_PTR);
                uncert.resolve(type);

                // Handle uncertain options
                if (C_CONST_BYTE_PTR.equals(uncert.getResolved())) {
                    useSimpleBindingForMapped = true;

                } else if (JAVA_STRING.equals(uncert.getResolved())) {
                    _Apply(newSimpleType("java.lang.String"));
                    if (runtime != Constants.CRuntime) {
                        String maptypename = manager.addImport(Constants.CStringMapperFQ);
                        modifiers.setMapped(maptypename, !isArg);
                    }

                } else {
                    // Unhandled uncertain binding
                    throw new RuntimeException();
                }

                modifiers.setUncertain(uncert, !isArg);
                if (!useSimpleBindingForMapped) {
                    return;
                }
            }

            // Simple binding
            final String rootTypePtrFQ = Constants.getVoidOrPrimitiveFQPtr(rootType);
            _Apply(newSimpleType(rootTypePtrFQ));
            return;
        }

        default: {
            // Level 2+ referenced types (i.e. char**, int**, ...)
            final Type rootType = type.getPonierRootType();
            boolean useSimpleBindingForMapped = false;

            // Uncertain binding
            if (type.isCStringArray() && supportedMappers.contains(Constants.CStringArrayMapper) && isArg) {
                // Prepare uncertain binding
                final String C_CONST_BYTE_PTR_PTR = "c.const-byte-ptr-ptr";
                final String JAVA_STRING_ARRAY = "java.string.array";
                final ModifierEditor.UncertainDescriptor uncert = new ModifierEditor.UncertainDescriptor(
                        JAVA_STRING_ARRAY, C_CONST_BYTE_PTR_PTR);
                uncert.resolve(type);

                // Handle uncertain options
                if (C_CONST_BYTE_PTR_PTR.equals(uncert.getResolved())) {
                    useSimpleBindingForMapped = true;

                } else if (JAVA_STRING_ARRAY.equals(uncert.getResolved())) {
                    _Apply(manager.getAST().newArrayType(newSimpleType("java.lang.String")));
                    String maptypename = manager.addImport(Constants.CStringArrayMapperFQ);
                    modifiers.setMapped(maptypename, !isArg);

                } else {
                    // Unhandled uncertain binding
                    throw new RuntimeException();
                }

                modifiers.setUncertain(uncert, !isArg);
                if (!useSimpleBindingForMapped) {
                    return;
                }
            }

            // Simple binding
            final String rootTypePtrFQ = Constants.getVoidOrPrimitiveFQPtr(rootType);
            if (depth > 1 && (needsReferenceInfo())) {
                modifiers.setReferenceInfo(manager.addImport("java.lang." + rootType.getPrimitiveJavaClassName()),
                        depth);
            }
            _Apply(_CreateNestedPtr(type, depth - 1, newSimpleType(rootTypePtrFQ)));
            return;
        }
        }
    }

    /**
     * Resolve a C structure type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_Struct() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(STRUCT, depth)) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. CGRect)
            final CStructManager struct = manager.getGenerator().getStruct(type.getElementName());
            if (struct == null) {
                throw new RuntimeException("Couldn't find struct with name: " + type.getElementName());
            }

            _Apply(newSimpleType(struct));
            modifiers.setByValue();
            return;
        }

        default: {
            // Level 1+ referenced types (i.e. CGRect*, CGRect**, ...)
            final Type rootType = type.getPonierRootType();
            boolean useSimpleBindingForMapped = false;

            // Lookup struct
            final CStructManager struct = manager.getGenerator().getStruct(rootType.getElementName());
            if (struct == null) {
                // Fallback to void*
                final Type voidType = new Type();
                final String rootTypePtrFQ = Constants.getVoidOrPrimitiveFQPtr(voidType);
                if (depth > 1 && (needsReferenceInfo())) {
                    modifiers.setReferenceInfo(manager.addImport("java.lang." + voidType.getPrimitiveJavaClassName()),
                            depth);
                }
                _Apply(_CreateNestedPtr(type, depth - 1, newSimpleType(rootTypePtrFQ)));
                return;
            }

            // Uncertain binding
            if (depth == 1) {
                // Prepare uncertain binding
                final String REFERENCE = "reference";
                final String ARRAY = "array";
                final ModifierEditor.UncertainDescriptor uncert = new ModifierEditor.UncertainDescriptor(REFERENCE,
                        ARRAY);
                uncert.resolve(type);

                // Handle uncertain options
                if (REFERENCE.equals(uncert.getResolved())) {
                    _Apply(newSimpleType(struct));

                } else if (ARRAY.equals(uncert.getResolved())) {
                    useSimpleBindingForMapped = true;

                } else {
                    // Unhandled uncertain binding
                    throw new RuntimeException();
                }

                modifiers.setUncertain(uncert, !isArg);
                if (!useSimpleBindingForMapped) {
                    return;
                }
            }

            if (needsReferenceInfo()) {
                modifiers.setReferenceInfo(manager.addImport(struct), depth);
            }
            _Apply(_CreateNestedPtr(type, depth, newSimpleType(struct)));
            return;
        }
        }
    }

    /**
     * Resolve a C function prototype type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_FunctionProto() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(FUNCTION_CB, depth) || depth != 1) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 1: {
            // Non-referenced types (i.e. T*)
            final CallbackManager cbman = type.getCallbackManager();
            if (cbman.getManager() == manager) {
                _Apply(newUnimportedSimpleType(cbman.getName()));
            } else {
                final String ref = manager.addImport(cbman.getManager().getFullyQualifiedName());
                _Apply(newUnimportedSimpleType(ref + "." + cbman.getName()));
            }
            modifiers.setFunctionPtr(cbman.getCallbackName());
            return;
        }

        default:
            throw new GeneratorException("unreachable code");
        }
    }

    /**
     * Resolve a C opaque pointer type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_OpaquePtr() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(OPAQUE, depth) || depth > 1) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0:
        case 1: {
            // Non-referenced and level 1 referenced types (i.e. CFStringRef,
            // CFStringRef*)
            final Type rootType = type.getPonierRootType();

            COpaquePtrManager opaque = manager.getGenerator().getOpaqueTypeManager(rootType.getElementName());
            if (opaque == null && rootType.getInnerType() != null) {
                opaque = manager.getGenerator().getOpaqueTypeManagerWithAlias(rootType.getInnerType().getElementName());
            }
            if (opaque == null /* || depth > 1 */) {
                // Fallback to void*
                final Type voidType = new Type();
                final String rootTypePtrFQ = Constants.getVoidOrPrimitiveFQPtr(voidType);
                if (depth > 0 && (needsReferenceInfo())) {
                    modifiers.setReferenceInfo(manager.addImport("java.lang." + voidType.getPrimitiveJavaClassName()),
                            depth);
                }
                _Apply(_CreateNestedPtr(type, depth, newSimpleType(rootTypePtrFQ)));
                return;
            }

            if (depth > 0 && (needsReferenceInfo())) {
                modifiers.setReferenceInfo(manager.addImport(opaque), depth);
            }
            _Apply(_CreateNestedPtr(type, depth, newSimpleType(opaque)));
            return;
        }

        default:
            throw new GeneratorException("unreachable code");
        }
    }

    private Type getInstanceType() {
        if (manager instanceof ObjCClassManager) {
            return ((ObjCClassManager)manager).toInstanceType();
        } else {
            return new Type(manager.getUnitName());
        }
    }

    /**
     * Resolve an Objective-C generic, id or instancetype type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_ObjCId() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(OBJC_OBJECT, depth)) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. id, instancetype, T, ...)
            if (type.getKind() == Type.ObjCInstanceType) {
                // Replace instancetype to the owner's concrete type
                type = getInstanceType();
                isInstanceType = true;
                // Then retry resolving
                _R();
                return;
            }
            if (_supports(OBJC_GENERICS, depth) && type.getObjCGenericParamType() != null) {
                _Apply(newUnimportedSimpleType(type.getObjCGenericParamType().getName()));
            } else if (type.getObjcProtocolGenerationState() != null && type.getObjcProtocolGenerationState()
                    .isEnabled() && type.getObjCProtocols().size() == 1) {
                ObjCProtocolManager protocol = getManager().getGenerator().getProtocol(type.getObjCProtocols().get(0));
                if (protocol != null && protocol.isSupported() && !"NSCopying".equals(protocol.getOriginalName())) {
                    _Apply(newSimpleType(protocol));
                } else {
                    _Apply(newSimpleType("java.lang.Object"));
                }
            } else {
                _Apply(newSimpleType("java.lang.Object"));
            }
            modifiers.setMapped(manager.addImport(Constants.ObjCObjectMapperFQ), !isArg);
            return;
        }

        default: {
            // Level 1 referenced types (i.e. id*, T*, ...)
            final Type rootType = type.getPonierRootType();

            final String name;
            if (_supports(OBJC_GENERICS, depth) && rootType.getObjCGenericParamType() != null) {
                name = rootType.getObjCGenericParamType().getName();
            } else if (rootType.getObjcProtocolGenerationState() != null && rootType.getObjcProtocolGenerationState()
                    .isEnabled() && rootType.getObjCProtocols().size() == 1) {
                ObjCProtocolManager protocol = getManager().getGenerator()
                        .getProtocol(rootType.getObjCProtocols().get(0));
                if (protocol != null && protocol.isSupported() && !"NSCopying".equals(protocol.getOriginalName())) {
                    name = manager.addImport(protocol);
                } else {
                    name = manager.addImport(Constants.ObjCObjectFQ);
                }
            } else {
                name = manager.addImport(Constants.ObjCObjectFQ);
            }
            if (needsReferenceInfo()) {
                modifiers.setReferenceInfo(manager.addImport(Constants.ObjCObjectFQ), depth);
            }
            _Apply(_CreateNestedPtr(type, depth, newUnimportedSimpleType(name)));
            return;
        }
        }
    }

    /**
     * Resolve an Objective-C interface type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_ObjCObject() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(OBJC_OBJECT, depth)) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. NSArray<T>*, MyClass*, ...)
            final ObjCClassManager clazz = isInstanceType ?
                    (ObjCClassManager) manager : manager.getGenerator().getClass(type.getElementName());
            if (clazz == null) {
                throw new RuntimeException("Couldn't find class with name: " + type.getElementName());
            }

            if (!isInstanceType && clazz.isNSString() && supportedMappers.contains(Constants.ObjCStringMapper)) {
                _Apply(newSimpleType("java.lang.String"));
                if (runtime != Constants.ObjCRuntime) {
                    String maptypename = manager.addImport(Constants.ObjCStringMapperFQ);
                    modifiers.setMapped(maptypename, !isArg);
                }
                return;
            }

            SimpleType simpleType = newSimpleType(clazz);
            if (isInstanceType && clazz instanceof ObjCProtocolManager) {
                // Don't try generic for protocol type
                _Apply(simpleType);
            } else {
                try {
                    _Apply(_CreateObjCGenericType(type, simpleType));
                } catch (GeneratorException ex) {
                    _Apply(simpleType);
                }
            }
            return;
        }

        default: {
            // Level 1+ referenced types (i.e. NSArray<T>**, MyClass**, ...)
            final Type rootType = type.getPonierRootType();

            final ObjCClassManager clazz = isInstanceType ?
                    (ObjCClassManager) manager : manager.getGenerator().getClass(rootType.getElementName());
            if (clazz == null) {
                throw new RuntimeException("Couldn't find class with name: " + rootType.getElementName());
            }
            if (needsReferenceInfo()) {
                modifiers.setReferenceInfo(manager.addImport(clazz), depth);
            }
            SimpleType simpleType = newSimpleType(clazz);
            if (isInstanceType && clazz instanceof ObjCProtocolManager) {
                // Don't try generic for protocol type
                _Apply(_CreateNestedPtr(type, depth, simpleType));
            } else {
                try {
                    _Apply(_CreateNestedPtr(type, depth, _CreateObjCGenericType(rootType, simpleType)));
                } catch (GeneratorException ex) {
                    _Apply(_CreateNestedPtr(type, depth, simpleType));
                }
            }
            return;
        }
        }
    }

    /**
     * Resolve an Objective-C Class type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_ObjCClass() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(OBJC_CLASS, depth) || depth > 0) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. Class)
            _Apply(newSimpleType(Constants.ClassFQ));
            return;
        }

        default:
            throw new GeneratorException("unreachable code");
        }
    }

    /**
     * Resolve an Objective-C SEL type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_ObjCSEL() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(PRIMITIVE, depth) || depth > 0) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. SEL)
            _Apply(newSimpleType(Constants.SELFQ));
            return;
        }

        default:
            throw new GeneratorException("unreachable code");
        }
    }

    /**
     * Resolve an Objective-C block type.
     *
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    private void _R_ObjCBlock() throws GeneratorException {
        final int depth = type.getPointerDepth();
        if (!_supports(OBJC_BLOCK, depth) || depth > 0) {
            throw new UnsupportedTypeException(type, resolverName);
        }
        if (isSupportCheck) {
            return;
        }
        switch (depth) {
        case 0: {
            // Non-referenced types (i.e. int (^Block)(id arg1, id arg2))
            final CallbackManager cbman = type.getCallbackManager();
            if (cbman.getManager() == manager) {
                _Apply(newUnimportedSimpleType(cbman.getName()));
            } else {
                final String ref = manager.addImport(cbman.getManager());
                _Apply(newUnimportedSimpleType(ref + "." + cbman.getName()));
            }
            modifiers.setObjCBlock(cbman.getCallbackName());
            return;
        }

        default:
            throw new GeneratorException("unreachable code");
        }
    }

    /**
     * Apply the specified type to the node's property.
     *
     * @param type type to apply
     */
    private void _Apply(org.eclipse.jdt.core.dom.Type type) {
        manager.getRewrite().set(node, property, type, manager.getEditGroup());
    }

    /**
     * Create a nested pointer type. (Ptr&lt;ConstPtr&lt;T&gt;&gt;)
     *
     * @param type     Complete type
     * @param depth    depth of the nesting
     * @param rootType most inner type to nest
     * @return nested type if depth > 0 and rootType if depth == 0
     * @throws GeneratorException if the type is unsupported or the resolution failed.
     */
    @SuppressWarnings("unchecked")
    private org.eclipse.jdt.core.dom.Type _CreateNestedPtr(Type type, int depth, org.eclipse.jdt.core.dom.Type rootType)
            throws GeneratorException {
        if (depth < 0) {
            throw new IllegalArgumentException();
        }
        if (type == null || rootType == null) {
            throw new NullPointerException();
        }
        if (depth == 0) {
            return rootType;
        }
        if (!type.isPointer()) {
            throw new GeneratorException("Called nestedPtrFrom with non-pointer type");
        }
        String rawPtr = Constants.getFQRawPtr(type.getInnerType().isConst());
        ParameterizedType parameterized = getAST().newParameterizedType(newSimpleType(rawPtr));
        if (depth > 1) {
            parameterized.typeArguments().add(_CreateNestedPtr(type.getInnerType(), depth - 1, rootType));
        } else {
            parameterized.typeArguments().add(rootType);
        }
        return parameterized;
    }

    private org.eclipse.jdt.core.dom.Type _CreateObjCGenericType(Type baseType, SimpleType simpleBaseType)
            throws GeneratorException {
        return _CreateObjCGenericType(this, manager, baseType, simpleBaseType);
    }

    @SuppressWarnings("unchecked")
    private static org.eclipse.jdt.core.dom.Type _CreateObjCGenericType(TypeResolver resolver,
            AbstractUnitManager manager, Type baseType, SimpleType simpleBaseType) throws GeneratorException {
        // Check for errors
        if (resolver == null || manager == null || baseType == null) {
            throw new NullPointerException();
        }
        if (baseType.getKind() != Type.ObjCObject) {
            throw new GeneratorException(
                    "Unsupported type in template (kind: " + baseType.getKind() + ", spelling: " + baseType
                            .getTypeSpelling() + ")");
        }
        final ObjCClassManager clazz = manager.getGenerator().getClass(baseType.getElementName());
        if (clazz == null) {
            throw new RuntimeException("Couldn't find class with name: " + baseType.getElementName());
        }

        // Return simple type if class doesn't have generics
        if (clazz.genericParamTypes.size() == 0) {
            return simpleBaseType;
        }

        // Return wildcarded type 'SimpleType<?>' if class has generics, but it
        // is not specified on the type
        if (baseType.getObjCTypeArgs().size() == 0) {
            final int count = clazz.genericParamTypes.size();
            ParameterizedType parameterizedType = manager.getAST().newParameterizedType(simpleBaseType);
            for (int i = 0; i < count; ++i) {
                parameterizedType.typeArguments().add(manager.getAST().newWildcardType());
            }
            return parameterizedType;
        }

        // Handle possible error
        final int count = baseType.getObjCTypeArgs().size();
        if (count != clazz.genericParamTypes.size()) {
            // Something is very wrong, but still try not to fail
            return simpleBaseType;
        }

        // Try to create parameterized type
        ParameterizedType parameterizedType = manager.getAST().newParameterizedType(simpleBaseType);
        for (int i = 0; i < count; ++i) {
            try {
                final Type argType = baseType.getObjCTypeArgs().get(i);
                final ObjCGenericParamType paramType = clazz.genericParamTypes.get(i);
                org.eclipse.jdt.core.dom.Type type = CreateObjCGenericTypeArgument(resolver, manager, argType);
                if (!(type instanceof WildcardType) && (argType.getKind() != Type.ObjCId
                        || argType.getObjCGenericParamType() == null)) {
                    if (paramType.isInvariant()) {
                        // Nothing to be done
                    } else if (paramType.isCovariant()) {
                        WildcardType wildcardType = manager.getAST().newWildcardType();
                        if (!type.toString().equals("String")) {
                            if (!type.isSimpleType() || !type.toString().equals("Object")) {
                                wildcardType.setBound(type, true);
                            }
                            type = wildcardType;
                        }
                    } else if (paramType.isContravariant()) {
                        WildcardType wildcardType = manager.getAST().newWildcardType();
                        wildcardType.setBound(type, false);
                        type = wildcardType;
                    } else {
                        throw new RuntimeException("Illegal ObjC type variance");
                    }
                }
                parameterizedType.typeArguments().add(type);
            } catch (GeneratorException ex) {
                // Something is very wrong, but still try not to fail
                return simpleBaseType;
            }
        }
        return parameterizedType;
    }

    public static org.eclipse.jdt.core.dom.Type CreateObjCGenericTypeArgument(TypeResolver resolver,
            AbstractUnitManager manager, Type baseType) throws GeneratorException {
        // Check for errors
        if (resolver == null || manager == null || baseType == null) {
            throw new NullPointerException();
        }

        // Handle id/template types
        if (baseType.getKind() == Type.ObjCId) {
            if (resolver._supports(OBJC_GENERICS, 0) && baseType.getObjCGenericParamType() != null) {
                return manager.getAST()
                        .newSimpleType(manager.getAST().newName(baseType.getObjCGenericParamType().getName()));
            } else {
                return manager.getAST().newSimpleType(manager.getAST().newName(manager.addImport("java.lang.Object")));
            }
        }

        // Handle Objective-C Class types
        if (baseType.getKind() == Type.ObjCClass) {
            return manager.getAST().newSimpleType(manager.getAST().newName(manager.addImport(Constants.ClassFQ)));
        }

        // Handle Objective-C block types
        if (baseType.getKind() == Type.ObjCBlock) {
            // For now simply return '?'
            return manager.getAST().newWildcardType();
        }

        // Fail on unsupported types
        if (baseType.getKind() != Type.ObjCObject) {
            throw new GeneratorException(
                    "Unsupported type in template (kind: " + baseType.getKind() + ", spelling: " + baseType
                            .getTypeSpelling() + ")");
        }
        final ObjCClassManager clazz = manager.getGenerator().getClass(baseType.getElementName());
        if (clazz == null) {
            // Default to 'id' if Objective-C class is not found
            if (resolver._supports(OBJC_GENERICS, 0) && baseType.getObjCGenericParamType() != null) {
                return manager.getAST()
                        .newSimpleType(manager.getAST().newName(baseType.getObjCGenericParamType().getName()));
            } else {
                return manager.getAST().newSimpleType(manager.getAST().newName(manager.addImport("java.lang.Object")));
            }
        }

        // Handle NSString
        if (clazz.isNSString() && resolver.supportedMappers.contains(Constants.ObjCStringMapper)) {
            return manager.getAST().newSimpleType(manager.getAST().newName(manager.addImport("java.lang.String")));
        }

        // Handle non-generic type
        SimpleType simpleType = manager.getAST().newSimpleType(manager.getAST().newName(manager.addImport(clazz)));
        if (clazz.genericParamTypes.size() == 0) {
            return simpleType;
        }

        // Handle generic type
        return _CreateObjCGenericType(resolver, manager, baseType, simpleType);
    }
}
