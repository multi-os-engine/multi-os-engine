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

public final class Constants {

    private static final String NatJPackage = "org.moe.natj";

    private static final String GeneralPackage = NatJPackage + ".general";
    private static final String CPackage = NatJPackage + ".c";
    private static final String ObjCPackage = NatJPackage + ".objc";

    private static final String GeneralAnnotationPackage = GeneralPackage + ".ann";
    private static final String CAnnotationPackage = CPackage + ".ann";
    private static final String ObjCAnnotationPackage = ObjCPackage + ".ann";

    private static final String GeneralMapperPackage = GeneralPackage + ".map";
    private static final String CMapperPackage = CPackage + ".map";
    private static final String ObjCMapperPackage = ObjCPackage + ".map";

    public static final String NatJRegisterMethod = "register";

	/* ---- C ---- */

    public static final String CRuntime = "CRuntime";
    public static final String StructObject = "StructObject";
    public static final String OpaquePtr = "OpaquePtr";

    public static final String CRuntimeFQ = CPackage + "." + CRuntime;
    public static final String StructObjectFQ = CPackage + "." + StructObject;
    public static final String OpaquePtrFQ = CPackage + "." + OpaquePtr;

    public static final String FunctionPtrAnnotation = "FunctionPtr";
    public static final String CFunctionAnnotation = "CFunction";
    public static final String InlineAnnotation = "Inline";
    public static final String CVariableAnnotation = "CVariable";
    public static final String StructureAnnotation = "Structure";
    public static final String StructureFieldAnnotation = "StructureField";
    public static final String VariadicAnnotation = "Variadic";

    public static final String FunctionPtrAnnotationFQ = CAnnotationPackage + "." + FunctionPtrAnnotation;
    public static final String CFunctionAnnotationFQ = CAnnotationPackage + "." + CFunctionAnnotation;
    public static final String InlineAnnotationFQ = CAnnotationPackage + "." + InlineAnnotation;
    public static final String CVariableAnnotationFQ = CAnnotationPackage + "." + CVariableAnnotation;
    public static final String StructureAnnotationFQ = CAnnotationPackage + "." + StructureAnnotation;
    public static final String StructureFieldAnnotationFQ = CAnnotationPackage + "." + StructureFieldAnnotation;
    public static final String VariadicAnnotationFQ = CAnnotationPackage + "." + VariadicAnnotation;

    public static final String CCallbackMapper = "CCallbackMapper";
    public static final String CObjectMapper = "CObjectMapper";
    public static final String CStringArrayMapper = "CStringArrayMapper";
    public static final String CStringMapper = "CStringMapper";

    public static final String CCallbackMapperFQ = CMapperPackage + "." + CCallbackMapper;
    public static final String CObjectMapperFQ = CMapperPackage + "." + CObjectMapper;
    public static final String CStringArrayMapperFQ = CMapperPackage + "." + CStringArrayMapper;
    public static final String CStringMapperFQ = CMapperPackage + "." + CStringMapper;

	/* ---- GENERAL ---- */

    public static final String Mapper = "Mapper";
    public static final String NativeException = "NativeException";
    public static final String NativeObject = "NativeObject";
    public static final String NativeRuntime = "NativeRuntime";
    public static final String NatJ = "NatJ";
    public static final String NilException = "NilException";
    public static final String Pointer = "Pointer";
    public static final String Ptr = "Ptr";
    public static final String ValueType = "ValueType";

    public static final String MapperFQ = GeneralPackage + "." + Mapper;
    public static final String NativeExceptionFQ = GeneralPackage + "." + NativeException;
    public static final String NativeObjectFQ = GeneralPackage + "." + NativeObject;
    public static final String NativeRuntimeFQ = GeneralPackage + "." + NativeRuntime;
    public static final String NatJFQ = GeneralPackage + "." + NatJ;
    public static final String NilExceptionFQ = GeneralPackage + "." + NilException;
    public static final String PointerFQ = GeneralPackage + "." + Pointer;
    public static final String ValueTypeFQ = GeneralPackage + "." + ValueType;

    public static String getVoidOrPrimitiveFQPtr(Type type) {
        String _type;

        switch (type.getKind()) {
        case Type.Boolean:
            _type = "Bool";
            break;
        case Type.Byte:
            _type = "Byte";
            break;
        case Type.Short:
            _type = "Short";
            break;
        case Type.Char:
            _type = "Char";
            break;
        case Type.Int:
            _type = "Int";
            break;
        case Type.Long: {
            String da = type.getDowngradeAnnotation();
            if (da == null) {
                _type = "Long";
            } else {
                if (Constants.NIntAnnotationFQ.equals(da)) {
                    _type = "NInt";
                } else {
                    _type = "NUInt";
                }
            }
        }
        break;
        case Type.Float:
            _type = "Float";
            break;
        case Type.Double: {
            String da = type.getDowngradeAnnotation();
            if (da == null) {
                _type = "Double";
            } else {
                _type = "NFloat";
            }
        }
        break;
        case Type.Void:
            _type = "Void";
            break;

        default:
            throw new IllegalArgumentException();
        }

        return getFQPtr(type.isConst(), _type);
    }

    private static final String getFQPtr(boolean isConst, String _type) {
        return GeneralPackage + ".ptr." + (isConst ? "Const" : "") + _type + "Ptr";
    }

    public static final String getFQRawPtr(boolean isConst) {
        return GeneralPackage + ".ptr." + (isConst ? "Const" : "") + "Ptr";
    }

    public static final String OpaquePtrImpl = "OpaquePtrImpl";
    public static final String OpaquePtrImplFQ = GeneralPackage + ".ptr.impl." + OpaquePtrImpl;

    public static final String ByValueAnnotation = "ByValue";
    public static final String GeneratedAnnotation = "Generated";
    public static final String LibraryAnnotation = "Library";
    public static final String MappedAnnotation = "Mapped";
    public static final String MappedReturnAnnotation = "MappedReturn";
    public static final String OwnedAnnotation = "Owned";
    public static final String RegisterOnStartupAnnotation = "RegisterOnStartup";
    public static final String ReferenceInfoAnnotation = "ReferenceInfo";
    public static final String RuntimeAnnotation = "Runtime";
    public static final String UncertainArgumentAnnotation = "UncertainArgument";
    public static final String UncertainReturnAnnotation = "UncertainReturn";
    public static final String NFloatAnnotation = "NFloat";
    public static final String NIntAnnotation = "NInt";
    public static final String NUIntAnnotation = "NUInt";

    public static final String ByValueAnnotationFQ = GeneralAnnotationPackage + "." + ByValueAnnotation;
    public static final String GeneratedAnnotationFQ = GeneralAnnotationPackage + "." + GeneratedAnnotation;
    public static final String LibraryAnnotationFQ = GeneralAnnotationPackage + "." + LibraryAnnotation;
    public static final String MappedAnnotationFQ = GeneralAnnotationPackage + "." + MappedAnnotation;
    public static final String MappedReturnAnnotationFQ = GeneralAnnotationPackage + "." + MappedReturnAnnotation;
    public static final String OwnedAnnotationFQ = GeneralAnnotationPackage + "." + OwnedAnnotation;
    public static final String RegisterOnStartupAnnotationFQ =
            GeneralAnnotationPackage + "." + RegisterOnStartupAnnotation;
    public static final String ReferenceInfoAnnotationFQ = GeneralAnnotationPackage + "." + ReferenceInfoAnnotation;
    public static final String RuntimeAnnotationFQ = GeneralAnnotationPackage + "." + RuntimeAnnotation;
    public static final String UncertainArgumentAnnotationFQ =
            GeneralAnnotationPackage + "." + UncertainArgumentAnnotation;
    public static final String UncertainReturnAnnotationFQ = GeneralAnnotationPackage + "." + UncertainReturnAnnotation;
    public static final String NFloatAnnotationFQ = GeneralAnnotationPackage + "." + NFloatAnnotation;
    public static final String NIntAnnotationFQ = GeneralAnnotationPackage + "." + NIntAnnotation;
    public static final String NUIntAnnotationFQ = GeneralAnnotationPackage + "." + NUIntAnnotation;

    public static final String ReferenceMapper = "ReferenceMapper";

    public static final String ReferenceMapperFQ = GeneralMapperPackage + "." + ReferenceMapper;

	/* ---- Objective-C ---- */

    public static final String BlockObject = "BlockObject";
    public static final String Class = "Class";
    public static final String ObjCException = "ObjCException";
    public static final String ObjCObject = "ObjCObject";
    public static final String ObjCRuntime = "ObjCRuntime";
    public static final String SEL = "SEL";

    public static final String BlockObjectFQ = ObjCPackage + "." + BlockObject;
    public static final String ClassFQ = ObjCPackage + "." + Class;
    public static final String ObjCExceptionFQ = ObjCPackage + "." + ObjCException;
    public static final String ObjCObjectFQ = ObjCPackage + "." + ObjCObject;
    public static final String ObjCRuntimeFQ = ObjCPackage + "." + ObjCRuntime;
    public static final String SELFQ = ObjCPackage + "." + SEL;

    public static final String CategoryClassMethodAnnotation = "CategoryClassMethod";
    public static final String IBActionAnnotation = "IBAction";
    public static final String IBOutletAnnotation = "IBOutlet";

    // TODO MOE fix
    public static final String PropertyAnnotation = "Property";

    public static final String IBOutletCollectionAnnotation = "IBOutletCollection";
    public static final String InstanceVariableAnnotation = "InstanceVariable";
    public static final String IsOptionalAnnotation = "IsOptional";
    public static final String NotImplementedAnnotation = "NotImplemented";
    public static final String ObjCBlockAnnotation = "ObjCBlock";
    public static final String ObjCCategoryAnnotation = "ObjCCategory";
    public static final String ObjCClassBindingAnnotation = "ObjCClassBinding";
    public static final String ObjCClassNameAnnotation = "ObjCClassName";
    public static final String ObjCProtocolNameAnnotation = "ObjCProtocolName";
    public static final String ProtocolClassMethodAnnotation = "ProtocolClassMethod";
    public static final String SelectorAnnotation = "Selector";
    public static final String XIBAnnotation = "XIB";

    public static final String CategoryClassMethodAnnotationFQ =
            ObjCAnnotationPackage + "." + CategoryClassMethodAnnotation;
    public static final String IBActionAnnotationFQ = ObjCAnnotationPackage + "." + IBActionAnnotation;
    public static final String IBOutletAnnotationFQ = ObjCAnnotationPackage + "." + IBOutletAnnotation;

    // TODO MOE fix
    public static final String PropertyAnnotationFQ = ObjCAnnotationPackage + "." + PropertyAnnotation;

    public static final String IBOutletCollectionAnnotationFQ =
            ObjCAnnotationPackage + "." + IBOutletCollectionAnnotation;
    public static final String InstanceVariableAnnotationFQ = ObjCAnnotationPackage + "." + InstanceVariableAnnotation;
    public static final String IsOptionalAnnotationFQ = ObjCAnnotationPackage + "." + IsOptionalAnnotation;
    public static final String NotImplementedAnnotationFQ = ObjCAnnotationPackage + "." + NotImplementedAnnotation;
    public static final String ObjCBlockAnnotationFQ = ObjCAnnotationPackage + "." + ObjCBlockAnnotation;
    public static final String ObjCCategoryAnnotationFQ = ObjCAnnotationPackage + "." + ObjCCategoryAnnotation;
    public static final String ObjCClassBindingAnnotationFQ = ObjCAnnotationPackage + "." + ObjCClassBindingAnnotation;
    public static final String ObjCClassNameAnnotationFQ = ObjCAnnotationPackage + "." + ObjCClassNameAnnotation;
    public static final String ObjCProtocolNameAnnotationFQ = ObjCAnnotationPackage + "." + ObjCProtocolNameAnnotation;
    public static final String ProtocolClassMethodAnnotationFQ =
            ObjCAnnotationPackage + "." + ProtocolClassMethodAnnotation;
    public static final String SelectorAnnotationFQ = ObjCAnnotationPackage + "." + SelectorAnnotation;
    public static final String XIBAnnotationFQ = ObjCAnnotationPackage + "." + XIBAnnotation;

    public static final String ObjCCallbackMapper = "ObjCCallbackMapper";
    public static final String ObjCObjectMapper = "ObjCObjectMapper";
    public static final String ObjCStringMapper = "ObjCStringMapper";

    public static final String ObjCCallbackMapperFQ = ObjCMapperPackage + "." + ObjCCallbackMapper;
    public static final String ObjCObjectMapperFQ = ObjCMapperPackage + "." + ObjCObjectMapper;
    public static final String ObjCStringMapperFQ = ObjCMapperPackage + "." + ObjCStringMapper;

    private Constants() {
    }

}
