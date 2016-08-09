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

package org.moe.natj.processor.cxx;

import org.moe.natj.processor.cxx.visitors.CxxAnalyzer;
import org.moe.natj.processor.signature.ClassTypeSignature;
import org.moe.natj.processor.signature.JavaTypeSignature;
import org.moe.natj.processor.signature.TypeArgument;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.util.*;

/**
 * Class representing a fully configured Java type.
 */
public class CxxType implements Opcodes {
    /**
     * List holding type resolver plugins.
     */
    private static final List<ITypeResolverPlugin> TYPE_RESOLVER_PLUGINS = new ArrayList<>();
    /**
     * Map holding type resolver plugin configurations.
     */
    private static final Map<ITypeResolverPlugin, TypeResolverPluginConfiguration> TYPE_RESOLVER_PLUGIN_CONFIGS =
            new HashMap<>();

    /**
     * Returns an unmodifiable view of the type resolver plugins list.
     *
     * @return type resolver plugins list
     */
    public static List<ITypeResolverPlugin> getTypeResolverPlugins() {
        return Collections.unmodifiableList(TYPE_RESOLVER_PLUGINS);
    }

    /**
     * Register a new type resolver plugin.
     *
     * @param plugin type resolver plugin
     */
    public static void registerPlugin(ITypeResolverPlugin plugin) {
        if (plugin == null) {
            throw new NullPointerException();
        }
        TypeResolverPluginConfiguration config = new TypeResolverPluginConfiguration();
        plugin.setup(config);
        TYPE_RESOLVER_PLUGINS.add(plugin);
        TYPE_RESOLVER_PLUGIN_CONFIGS.put(plugin, config);
    }

    /**
     * Returns the type resolver for the given type or null if there is none.
     *
     * @param type type
     * @return type resolver or null
     */
    public static ITypeResolverPlugin getTypeResolverForType(CxxType type) {
        if (type == null) {
            throw new NullPointerException();
        }
        if (!type.isCxxObjectKind()) {
            return null;
        }
        final String internalName = type.getClassInfoForCxxObjectType().mapperType.getInternalName();
        for (ITypeResolverPlugin plugin : TYPE_RESOLVER_PLUGINS) {
            if (plugin.match(internalName)) {
                return plugin;
            }
        }
        return null;
    }

    /**
     * Returns the type resolver for the given implementing class.
     *
     * @param internalName implementing class internal name
     * @return type resolver or null
     */
    public static ITypeResolverPlugin getTypeResolverForImplementingClass(String internalName) {
        if (internalName == null) {
            throw new NullPointerException();
        }
        for (ITypeResolverPlugin plugin : TYPE_RESOLVER_PLUGINS) {
            if (internalName.equals(plugin.getImplementingClass())) {
                return plugin;
            }
        }
        return null;
    }

    /**
     * Returns the configuration associated with the type resolver plugin.
     *
     * @param plugin plugin
     * @return configuration
     */
    public static TypeResolverPluginConfiguration getTypeResolverPluginConfig(ITypeResolverPlugin plugin) {
        if (plugin == null) {
            throw new NullPointerException();
        }
        final TypeResolverPluginConfiguration config = TYPE_RESOLVER_PLUGIN_CONFIGS.get(plugin);
        if (config == null) {
            throw new NullPointerException();
        }
        return config;
    }

    /**
     * Kind.
     */
    private CxxTypeKind kind;

    /**
     * Optional data for some kinds.
     * - CxxObject types -> associated CxxClassInfo
     * - Template based CxxObject types -> associated CxxTemplateInfo
     * - Java types -> associated Java type
     * - Ptr types -> element type
     */
    private Object data;

    /**
     * Secondary optional data for some kinds.
     * - Primitive types -> enum type name (CxxEnumName)
     */
    private Object data2;

    /**
     * Creates a new CxxType with the specified kind.
     *
     * @param kind kind
     */
    public CxxType(CxxTypeKind kind) {
        if (kind == null) {
            throw new NullPointerException();
        }
        this.kind = kind;
        this.data = null;
    }

    /**
     * Creates a new CxxType with the specified kind.
     *
     * @param kind      kind
     * @param classInfo class info
     */
    public CxxType(CxxTypeKind kind, CxxClassInfo classInfo) {
        if (kind == null) {
            throw new NullPointerException();
        }
        if (classInfo == null) {
            throw new NullPointerException();
        }
        if (!kind.isCxxObjectKind()) {
            throw new IllegalArgumentException();
        }
        this.kind = kind;
        this.data = classInfo;
    }

    /**
     * Creates a new CxxType with the specified kind.
     *
     * @param kind         kind
     * @param templateInfo template info
     */
    public CxxType(CxxTypeKind kind, CxxTemplateInfo templateInfo) {
        if (kind == null) {
            throw new NullPointerException();
        }
        if (templateInfo == null) {
            throw new NullPointerException();
        }
        if (!kind.isCxxObjectKind()) {
            throw new IllegalArgumentException();
        }
        this.kind = kind;
        this.data = templateInfo;
    }

    /**
     * Creates a new CxxType with the specified kind.
     *
     * @param kind kind
     * @param type Java type
     */
    public CxxType(CxxTypeKind kind, Type type) {
        if (kind == null) {
            throw new NullPointerException();
        }
        if (type == null) {
            throw new NullPointerException();
        }
        if (!kind.isJavaObjectKind()) {
            throw new IllegalArgumentException();
        }
        this.kind = kind;
        this.data = type;
    }

    /**
     * Creates a new CxxType with the specified kind.
     *
     * @param kind kind
     * @param type Cxx type
     */
    public CxxType(CxxTypeKind kind, CxxType type) {
        if (kind == null) {
            throw new NullPointerException();
        }
        if (type == null) {
            throw new NullPointerException();
        }
        if (!kind.isPtr()) {
            throw new IllegalArgumentException();
        }
        this.kind = kind;
        this.data = type;
    }

    /**
     * Creates a CxxType from a Type object representing a primitive type.
     *
     * @param type Type
     * @return CxxType object
     */
    public static CxxType fromType(Type type) {
        if (type == null) {
            throw new NullPointerException();
        }
        switch (type.getSort()) {
            case Type.VOID:
                return new CxxType(CxxTypeKind.VOID);
            case Type.BOOLEAN:
                return new CxxType(CxxTypeKind.BOOL);
            case Type.BYTE:
                return new CxxType(CxxTypeKind.BYTE);
            case Type.CHAR:
                return new CxxType(CxxTypeKind.USHORT);
            case Type.SHORT:
                return new CxxType(CxxTypeKind.SHORT);
            case Type.INT:
                return new CxxType(CxxTypeKind.INT);
            case Type.LONG:
                return new CxxType(CxxTypeKind.LONGLONG);
            case Type.FLOAT:
                return new CxxType(CxxTypeKind.FLOAT);
            case Type.DOUBLE:
                return new CxxType(CxxTypeKind.DOUBLE);
        }
        throw new RuntimeException("Illegal type sort " + type.toString());
    }

    /**
     * Creates a CxxType from a Type object.
     *
     * @param type     Type
     * @param typeTree Type tree (from signature)
     * @param analyzer Analyzer
     * @return CxxType object
     */
    public static CxxType fromType(final Type type, final JavaTypeSignature typeTree, final CxxAnalyzer analyzer) {
        if (type == null) {
            throw new NullPointerException();
        }
        switch (type.getSort()) {
            case Type.OBJECT: {
                CxxClassInfo itf = analyzer.getCxxClassInfoForSpecializedType(typeTree);
                if (itf != null) {
                    final CxxTemplateInfo templateInfo = new CxxTemplateInfo(itf, type.toString());
                    return new CxxType(CxxTypeKind.CXX_OBJECT, templateInfo);
                }

                itf = analyzer.getCxxClassInfoForType(type);
                if (itf != null) {
                    return new CxxType(CxxTypeKind.CXX_OBJECT, itf);

                } else if (CxxSupport.isPrimitivePointerType(type)) {
                    CxxType rootType = new CxxType(CxxSupport.getPointerRootType(type));
                    CxxType topLevelType;
                    if (CxxSupport.isNonConstPointerType(type)) {
                        topLevelType = new CxxType(CxxTypeKind.PTR, rootType);
                    } else if (CxxSupport.isConstPointerType(type)) {
                        topLevelType = new CxxType(CxxTypeKind.CONST_PTR, rootType);
                    } else {
                        throw new IllegalStateException("Illegal pointer type: " + rootType);
                    }
                    return topLevelType;

                } else if (CxxSupport.isGenericPointerType(type)) {
                    System.out.println("DEBUG>>> isGenericPointerType: " + type);
                    // Read complete type from signature
                    if (typeTree == null) {
                        throw new NullPointerException();
                    }
                    if (!(typeTree instanceof ClassTypeSignature)) {
                        throw new IllegalArgumentException("Expected " + ClassTypeSignature.class + " instead of "
                                + typeTree.getClass());
                    }
                    final List<ClassTypeSignature> typeList;
                    try {
                        typeList = getReversePtrList((ClassTypeSignature) typeTree);
                    } catch (IllegalStateException ex) {
                        return new CxxType(CxxTypeKind.JAVA_OBJECT, type);
                    }

                    // Construct root type
                    final ClassTypeSignature root = typeList.remove(0);
                    final Type rootType = Type.getObjectType(root.getInternalName());
                    CxxTypeKind pointerRootType = CxxSupport.getPointerRootType(rootType);
                    CxxType topLevelType = null;
                    if (pointerRootType != null) {
                        CxxType ptrRootType = new CxxType(pointerRootType);
                        if (CxxSupport.isNonConstPointerType(rootType)) {
                            topLevelType = new CxxType(CxxTypeKind.PTR, ptrRootType);
                        } else if (CxxSupport.isConstPointerType(rootType)) {
                            topLevelType = new CxxType(CxxTypeKind.CONST_PTR, ptrRootType);
                        } else {
                            throw new IllegalStateException("Illegal pointer type: " + root);
                        }
                    } else {
                        CxxClassInfo itf2 = analyzer.getCxxClassInfoForSpecializedType(root);
                        if (itf2 != null) {
                            final CxxTemplateInfo templateInfo = new CxxTemplateInfo(itf2, rootType.toString());
                            topLevelType = new CxxType(CxxTypeKind.CXX_OBJECT_BY_VALUE, templateInfo);
                        } else {
                            itf2 = analyzer.getCxxClassInfoForType(rootType);
                            if (itf2 != null) {
                                topLevelType = new CxxType(CxxTypeKind.CXX_OBJECT_BY_VALUE, itf2);
                            }
                        }
                        if (topLevelType != null) {
                            typeList.remove(0);
                            topLevelType = new CxxType(CxxTypeKind.PTR, topLevelType);
                        }
                    }

                    if (topLevelType == null) {
                        pointerRootType = CxxSupport.getPrimitiveTypeForJavaClass(rootType);
                        if (pointerRootType != null) {
                            topLevelType = new CxxType(pointerRootType);
                        }
                    }

                    if (topLevelType == null) {
                        return new CxxType(CxxTypeKind.JAVA_OBJECT, type);
                    }

                    // Wrap in additional pointers
                    while (typeList.size() > 0) {
                        final ClassTypeSignature firstCts = typeList.remove(0);
                        final Type first = Type.getObjectType(firstCts.getInternalName());
                        if (CxxSupport.isNonConstPointerType(first)) {
                            topLevelType = new CxxType(CxxTypeKind.PTR, topLevelType);
                        } else if (CxxSupport.isConstPointerType(first)) {
                            topLevelType = new CxxType(CxxTypeKind.CONST_PTR, topLevelType);
                        } else {
                            throw new IllegalStateException("Illegal pointer type: " + first);
                        }
                    }
                    return topLevelType;

                }
                return new CxxType(CxxTypeKind.JAVA_OBJECT, type);
            }
            case Type.ARRAY:
                return new CxxType(CxxTypeKind.JAVA_OBJECT, type);
            default:
                return fromType(type);
        }
    }

    /**
     * Retrieves the reverse list of Ptr classes.
     *
     * @param cts Class type signature
     * @return Reverse list of Ptr classes
     */
    private static List<ClassTypeSignature> getReversePtrList(ClassTypeSignature cts) {
        if (cts == null) {
            throw new NullPointerException();
        }
        final List<ClassTypeSignature> path = new ArrayList<>();
        while (true) {
            final String name = cts.getInternalName();
            path.add(0, cts);
            if (!CxxSupport.PTR_PTR_ITF.getInternalName().equals(name)
                    && !CxxSupport.PTR_CONSTPTR_ITF.getInternalName().equals(name)) {
                break;
            }
            final TypeArgument[] typeArguments = cts.getTypeArguments();
            if (typeArguments.length != 1) {
                throw new IllegalStateException("unexpected state");
            }
            final TypeArgument typeArgument = typeArguments[0];
            if (typeArgument.referenceTypeSignature instanceof ClassTypeSignature) {
                cts = (ClassTypeSignature) typeArgument.referenceTypeSignature;
            } else {
                throw new IllegalStateException("unexpected state");
            }
        }
        return path;
    }

    /**
     * Returns the kind of this type.
     *
     * @return kind
     */
    public CxxTypeKind getKind() {
        return kind;
    }

    /**
     * Sets the kind of this type.
     *
     * @param kind kind
     */
    private void setKind(CxxTypeKind kind) {
        this.kind = kind;
    }

    /**
     * Returns the associated class interface for this CxxObject compatible type.
     *
     * @return associated class interface
     */
    public CxxClassInfo getClassInfoForCxxObjectType() {
        if (!kind.isCxxObjectKind()) {
            throw new IllegalStateException("getClassInfoForCxxObjectType must only be invoked on object types");
        }
        if (data instanceof CxxTemplateInfo) {
            final CxxTemplateInfo templateInfo = (CxxTemplateInfo) data;
            return templateInfo.classInfo;
        }
        return (CxxClassInfo) data;
    }

    /**
     * Tells whether or not the specified type is a CxxObject and a template class.
     *
     * @return True iff type is a template class
     */
    public boolean isTemplateCxxClass() {
        if (!kind.isCxxObjectKind()) {
            throw new IllegalStateException("isTemplateCxxClass must only be invoked on object types");
        }
        return data instanceof CxxTemplateInfo;
    }

    /**
     * Returns the associated Java type for this Object compatible type.
     *
     * @return associated Java type
     */
    public Type getTypeForJavaObjectType() {
        if (!kind.isNativeCompatibleJavaObjectKind()) {
            throw new IllegalStateException("getTypeForJavaObjectType must only be invoked on object types");
        }
        return (Type) data;
    }

    /**
     * Returns the associated inner CxxType for this Ptr compatible type.
     *
     * @return associated inner CxxType
     */
    public CxxType getInnerTypeForPtr() {
        if (!kind.isPtr()) {
            throw new IllegalStateException("getInnerTypeForPtr must only be invoked on pointer types");
        }
        return (CxxType) data;
    }

    /**
     * Returns the associated inner CxxType for this Ref compatible type.
     *
     * @return associated inner CxxType
     */
    public CxxType getInnerTypeForRef() {
        if (!kind.isRef()) {
            throw new IllegalStateException("getInnerTypeForRef must only be invoked on reference types");
        }
        return (CxxType) data;
    }

    /**
     * Helper class for storing enum name.
     */
    private static class CxxEnumName {
        /**
         * C++ enum name.
         */
        private final String value;

        /**
         * Create a new CxxEnumName instance.
         *
         * @param value C++ enum name
         */
        public CxxEnumName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.value = value;
        }
    }

    /**
     * Returns the C++ enum class name if present for this primitive type.
     *
     * @return C++ enum class name
     */
    public String getCxxEnumClassName() {
        if (!kind.isPrimitive()) {
            throw new IllegalStateException("getCxxEnumClassName must only be invoked on primitive types");
        }
        return data2 == null ? null : ((CxxEnumName) data2).value;
    }

    /**
     * Returns the native type to which the JNI type can be directly casted to.
     *
     * @return Native type
     */
    public String getJNICompatibleNativeType() {
        return getJNICompatibleNativeType(true);
    }

    /**
     * Returns the native type to which the JNI type can be directly casted to.
     *
     * @param isJNICompatible Flag whether or not to return the JNI compatible native type or the true native type.
     * @return Native type
     */
    public String getJNICompatibleNativeType(boolean isJNICompatible) {
        if (isPrimitive() && getCxxEnumClassName() != null) {
            return getCxxEnumClassName();
        }
        switch (kind) {
            case VOID:
                return "void";
            case BOOL:
                return "bool";
            case BYTE:
                return "char";
            case SBYTE:
                return "signed char";
            case UBYTE:
                return "unsigned char";
            case SHORT:
                return "short";
            case USHORT:
                return "unsigned short";
            case INT:
                return "int";
            case UINT:
                return "unsigned int";
            case LONG:
                return "long";
            case ULONG:
                return "unsigned long";
            case LONGLONG:
                return "long long";
            case ULONGLONG:
                return "unsigned long long";
            case CHAR16T:
                return "char16_t";
            case CHAR32T:
                return "char32_t";
            case WCHART:
                return "wchar_t";
            case FLOAT:
                return "float";
            case DOUBLE:
                return "double";
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
                return getClassInfoForCxxObjectType().cxxClassName + "*";
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return getClassInfoForCxxObjectType().cxxClassName + " const *";
            case PTR:
            case REF: {
                if (isJNICompatible) {
                    if (((CxxType) data).isByValueCxxObjectKind()) {
                        return ((CxxType) data).getClassInfoForCxxObjectType().cxxClassName + "*";
                    } else {
                        return ((CxxType) data).getJNICompatibleNativeType() + "*";
                    }
                } else {
                    return ((CxxType) data).getNativeType() + "*";
                }
            }
            case CONST_PTR:
            case CONST_REF: {
                if (isJNICompatible) {
                    if (((CxxType) data).isByValueCxxObjectKind()) {
                        return ((CxxType) data).getClassInfoForCxxObjectType().cxxClassName + " const *";
                    } else {
                        return ((CxxType) data).getJNICompatibleNativeType() + " const *";
                    }
                } else {
                    return ((CxxType) data).getNativeType() + " const *";
                }
            }
            case CXX_JAVA_OBJECT:
                return "natj_jobject_t";
        }
        throw new IllegalStateException("bad type " + kind.name());
    }

    /**
     * Returns the real native type.
     *
     * @return Real native type
     */
    public String getNativeType() {
        switch (kind) {
            case CXX_OBJECT_BY_VALUE:
                return getClassInfoForCxxObjectType().cxxClassName;
            case CXX_OBJECT_BY_REFERENCE:
                return getClassInfoForCxxObjectType().cxxClassName + "&";
            case CXX_CONST_OBJECT_BY_VALUE:
                return getClassInfoForCxxObjectType().cxxClassName + " const";
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return getClassInfoForCxxObjectType().cxxClassName + " const&";
            default:
                return getJNICompatibleNativeType();
        }
    }

    /**
     * Returns the real non-cv-qualified native type.
     *
     * @return Real native type
     */
    public String getNonCVQualifiedNativeType() {
        switch (kind) {
            case CXX_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_VALUE:
                return getClassInfoForCxxObjectType().cxxClassName;
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return getClassInfoForCxxObjectType().cxxClassName + "&";
            case CXX_OBJECT:
            case CXX_CONST_OBJECT:
                return getClassInfoForCxxObjectType().cxxClassName + "*";
            default:
                throw new IllegalStateException("bad type " + kind.name());
        }
    }

    /**
     * Applies the specified annotation on the type.
     *
     * @param type            Type to apply on
     * @param desc            Annotation descriptor
     * @param superAnnVisitor Super visitor
     * @return Annotation visitor for further processing
     */
    public static AnnotationVisitor applyAnnotation(CxxType type, String desc, AnnotationVisitor superAnnVisitor) {
        if (type == null) {
            throw new NullPointerException();
        }
        if (desc == null) {
            throw new NullPointerException();
        }
        if (CxxSupport.GEN_NLONG_ANN.getDescriptor().equals(desc)) {
            switch (type.getKind()) {
                case LONGLONG:
                    type.setKind(CxxTypeKind.LONG);
                    break;
                case ULONGLONG:
                    type.setKind(CxxTypeKind.ULONG);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.GEN_NLONG_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.GEN_NULONG_ANN.getDescriptor().equals(desc)) {
            switch (type.getKind()) {
                case LONGLONG:
                    type.setKind(CxxTypeKind.ULONG);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.GEN_NULONG_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_UNSIGNED_ANN.getDescriptor().equals(desc)) {
            if (type.isPtr()) {
                applyAnnotation(type.getInnerTypeForPtr(), desc, superAnnVisitor);
                return null;
            }
            if (type.isRef()) {
                applyAnnotation(type.getInnerTypeForRef(), desc, superAnnVisitor);
                return null;
            }
            switch (type.getKind()) {
                case BYTE:
                    type.setKind(CxxTypeKind.UBYTE);
                    break;
                case INT:
                    type.setKind(CxxTypeKind.UINT);
                    break;
                case LONG:
                    type.setKind(CxxTypeKind.ULONG);
                    break;
                case LONGLONG:
                    type.setKind(CxxTypeKind.ULONGLONG);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_UNSIGNED_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_SIGNED_ANN.getDescriptor().equals(desc)) {
            if (type.isPtr()) {
                applyAnnotation(type.getInnerTypeForPtr(), desc, superAnnVisitor);
                return null;
            }
            if (type.isRef()) {
                applyAnnotation(type.getInnerTypeForRef(), desc, superAnnVisitor);
                return null;
            }
            switch (type.getKind()) {
                case BYTE:
                    type.setKind(CxxTypeKind.SBYTE);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_SIGNED_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_CHAR16_T_ANN.getDescriptor().equals(desc)) {
            if (type.isPtr()) {
                applyAnnotation(type.getInnerTypeForPtr(), desc, superAnnVisitor);
                return null;
            }
            if (type.isRef()) {
                applyAnnotation(type.getInnerTypeForRef(), desc, superAnnVisitor);
                return null;
            }
            switch (type.getKind()) {
                case USHORT:
                    type.setKind(CxxTypeKind.CHAR16T);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_CHAR16_T_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_CHAR32_T_ANN.getDescriptor().equals(desc)) {
            if (type.isPtr()) {
                applyAnnotation(type.getInnerTypeForPtr(), desc, superAnnVisitor);
                return null;
            }
            if (type.isRef()) {
                applyAnnotation(type.getInnerTypeForRef(), desc, superAnnVisitor);
                return null;
            }
            switch (type.getKind()) {
                case INT:
                    type.setKind(CxxTypeKind.CHAR32T);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_CHAR32_T_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.GEN_WCHAR_T_ANN.getDescriptor().equals(desc)) {
            if (type.isPtr()) {
                applyAnnotation(type.getInnerTypeForPtr(), desc, superAnnVisitor);
                return null;
            }
            if (type.isRef()) {
                applyAnnotation(type.getInnerTypeForRef(), desc, superAnnVisitor);
                return null;
            }
            switch (type.getKind()) {
                case INT:
                    type.setKind(CxxTypeKind.WCHART);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.GEN_WCHAR_T_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_BY_VALUE_ANN.getDescriptor().equals(desc)) {
            switch (type.getKind()) {
                case CXX_OBJECT:
                    type.setKind(CxxTypeKind.CXX_OBJECT_BY_VALUE);
                    break;
                case CXX_CONST_OBJECT:
                    type.setKind(CxxTypeKind.CXX_CONST_OBJECT_BY_VALUE);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_BY_VALUE_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_BY_REFERENCE_ANN.getDescriptor().equals(desc)) {
            switch (type.getKind()) {
                case CXX_OBJECT:
                    type.setKind(CxxTypeKind.CXX_OBJECT_BY_REFERENCE);
                    break;
                case CXX_CONST_OBJECT:
                    type.setKind(CxxTypeKind.CXX_CONST_OBJECT_BY_REFERENCE);
                    break;
                case PTR:
                    if (type.getInnerTypeForPtr().isPrimitive()) {
                        type.setKind(CxxTypeKind.REF);
                        break;
                    }
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_BY_REFERENCE_ANN.getClassName() + " annotation");
                case CONST_PTR:
                    if (type.getInnerTypeForPtr().isPrimitive()) {
                        type.setKind(CxxTypeKind.CONST_REF);
                        break;
                    }
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_BY_REFERENCE_ANN.getClassName() + " annotation");
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_BY_REFERENCE_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_JAVA_OBJECT_ANN.getDescriptor().equals(desc)) {
            switch (type.getKind()) {
                case JAVA_OBJECT:
                    type.setKind(CxxTypeKind.CXX_JAVA_OBJECT);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_JAVA_OBJECT_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_CONST_ANN.getDescriptor().equals(desc)) {
            switch (type.getKind()) {
                case CXX_OBJECT:
                    type.setKind(CxxTypeKind.CXX_CONST_OBJECT);
                    break;
                case CXX_OBJECT_BY_VALUE:
                    type.setKind(CxxTypeKind.CXX_CONST_OBJECT_BY_VALUE);
                    break;
                case CXX_OBJECT_BY_REFERENCE:
                    type.setKind(CxxTypeKind.CXX_CONST_OBJECT_BY_REFERENCE);
                    break;
                default:
                    throw new RuntimeException("Unsupported type for "
                            + CxxSupport.CXX_CONST_ANN.getClassName() + " annotation");
            }
        } else if (CxxSupport.CXX_ENUM_ANN.getDescriptor().equals(desc)) {
            if (type.isPtr()) {
                return applyAnnotation(type.getInnerTypeForPtr(), desc, superAnnVisitor);
            }
            if (type.isRef()) {
                return applyAnnotation(type.getInnerTypeForRef(), desc, superAnnVisitor);
            }
            if (type.isPrimitive()) {
                return new AnnotationVisitor(ASM5, superAnnVisitor) {
                    @Override
                    public void visit(String name, Object value) {
                        super.visit(name, value);
                        type.data2 = new CxxEnumName((String) value);
                    }
                };
            }
            throw new RuntimeException("Unsupported type for "
                    + CxxSupport.CXX_ENUM_ANN.getClassName() + " annotation");
        }
        return null;
    }

    /**
     * Returns the pointer element class equivalent.
     *
     * @return pointer element class equivalent
     */
    public Type getPtrElementClass() {
        switch (kind) {
            case VOID:
                return Type.getObjectType("java/lang/Void");
            case BOOL:
                return Type.getObjectType("java/lang/Boolean");
            case BYTE:
            case SBYTE:
            case UBYTE:
                return Type.getObjectType("java/lang/Byte");
            case SHORT:
                return Type.getObjectType("java/lang/Short");
            case USHORT:
            case CHAR16T:
                return Type.getObjectType("java/lang/Character");
            case INT:
            case UINT:
            case CHAR32T:
                return Type.getObjectType("java/lang/Integer");
            case WCHART:
                return Type.getObjectType("org/moe/natj/general/ann/WCharT");
            case LONG:
                return Type.getObjectType("org/moe/natj/general/ann/NLong");
            case ULONG:
                return Type.getObjectType("org/moe/natj/general/ann/NULong");
            case LONGLONG:
            case ULONGLONG:
                return Type.getObjectType("java/lang/Long");
            case FLOAT:
                return Type.getObjectType("java/lang/Float");
            case DOUBLE:
                return Type.getObjectType("java/lang/Double");
            case CXX_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_VALUE:
                return getClassInfoForCxxObjectType().mapperType;
        }
        throw new IllegalStateException("bad type " + kind.name());
    }

    /**
     * Returns the pointer class.
     *
     * @return pointer class
     */
    public Type getPtrClass() {
        final CxxType innerType;
        if (isPtr()) {
            innerType = getInnerTypeForPtr();
            if (innerType.isPtr()) {
                return isConstPtr() ? CxxSupport.PTR_CONSTPTR_ITF : CxxSupport.PTR_PTR_ITF;
            }

        } else if (isRef()) {
            innerType = getInnerTypeForRef();
            if (innerType.isPtr()) {
                throw new IllegalStateException("bad type " + kind.name());
            }

        } else {
            throw new IllegalStateException("bad type " + kind.name());
        }

        switch (innerType.kind) {
            case VOID:
                return isConstPtr() ? CxxSupport.PTR_CONSTVOIDPTR_ITF : CxxSupport.PTR_VOIDPTR_ITF;
            case BOOL:
                return isConstPtr() ? CxxSupport.PTR_CONSTBOOLPTR_ITF : CxxSupport.PTR_BOOLPTR_ITF;
            case BYTE:
            case SBYTE:
            case UBYTE:
                return isConstPtr() ? CxxSupport.PTR_CONSTBYTEPTR_ITF : CxxSupport.PTR_BYTEPTR_ITF;
            case SHORT:
                return isConstPtr() ? CxxSupport.PTR_CONSTSHORTPTR_ITF : CxxSupport.PTR_SHORTPTR_ITF;
            case USHORT:
            case CHAR16T:
                return isConstPtr() ? CxxSupport.PTR_CONSTCHARPTR_ITF : CxxSupport.PTR_CHARPTR_ITF;
            case INT:
            case UINT:
            case CHAR32T:
                return isConstPtr() ? CxxSupport.PTR_CONSTINTPTR_ITF : CxxSupport.PTR_INTPTR_ITF;
            case WCHART:
                return isConstPtr() ? CxxSupport.PTR_CONSTWCHARTPTR_ITF : CxxSupport.PTR_WCHARTPTR_ITF;
            case LONG:
                return isConstPtr() ? CxxSupport.PTR_CONSTNLONGPTR_ITF : CxxSupport.PTR_NLONGPTR_ITF;
            case ULONG:
                return isConstPtr() ? CxxSupport.PTR_CONSTNULONGPTR_ITF : CxxSupport.PTR_NULONGPTR_ITF;
            case LONGLONG:
            case ULONGLONG:
                return isConstPtr() ? CxxSupport.PTR_CONSTLONGPTR_ITF : CxxSupport.PTR_LONGPTR_ITF;
            case FLOAT:
                return isConstPtr() ? CxxSupport.PTR_CONSTFLOATPTR_ITF : CxxSupport.PTR_FLOATPTR_ITF;
            case DOUBLE:
                return isConstPtr() ? CxxSupport.PTR_CONSTDOUBLEPTR_ITF : CxxSupport.PTR_DOUBLEPTR_ITF;
            case CXX_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_VALUE:
                return isConstPtr() ? CxxSupport.PTR_CONSTPTR_ITF : CxxSupport.PTR_PTR_ITF;
        }
        throw new IllegalStateException("bad type " + kind.name());
    }

    @Override
    public String toString() {
        switch (kind) {
            case VOID:
            case BOOL:
            case BYTE:
            case SBYTE:
            case UBYTE:
            case SHORT:
            case USHORT:
            case INT:
            case UINT:
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
            case CHAR16T:
            case CHAR32T:
            case WCHART:
            case FLOAT:
            case DOUBLE:
                return kind.name();
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
            case JAVA_OBJECT:
            case CXX_JAVA_OBJECT:
                return kind.name() + "_" + data;
            case PTR:
                return "ptr_" + data;
            case CONST_PTR:
                return "constptr_" + data;
            case REF:
                return "ref_" + data;
            case CONST_REF:
                return "constref_" + data;
        }
        throw new IllegalStateException("bad type " + kind.name());
    }

    /*
    DELEGATE METHODS
     */

    /**
     * Returns the JNI type of this kind as a {@link Type}.
     *
     * @return JNI type
     */
    public Type getJNIType() {
        return kind.getJNIType();
    }

    /**
     * Returns the JNI type of this kind as the native C++ representation.
     *
     * @return JNI type
     */
    public String getNativeJNIType() {
        return kind.getNativeJNIType();
    }

    /**
     * Returns the cast required to convert the native type to the JNI counterpart.
     *
     * @return C++ cast type
     */
    public String getNatJInvokeFn() {
        return kind.getNatJInvokeFn();
    }

    /**
     * Returns the cast required to convert the native type to the JNI counterpart.
     *
     * @return C++ cast type
     */
    public String getJNIToNativeCast() {
        if (isPrimitive() && getCxxEnumClassName() != null) {
            return "static_cast";
        }
        return kind.getJNIToNativeCast();
    }

    /**
     * Returns the cast required to convert the native type to the JNI counterpart.
     *
     * @return C++ cast type
     */
    public String getNativeToJNICast() {
        if (isPrimitive() && getCxxEnumClassName() != null) {
            return "static_cast";
        }
        return kind.getNativeToJNICast();
    }

    /**
     * Tells whether or not this kind is VOID.
     *
     * @return True iff void
     */
    public boolean isVoid() {
        return kind.isVoid();
    }

    /**
     * Tells whether or not this kind is a primitive kind.
     *
     * @return True iff primitive
     */
    public boolean isPrimitive() {
        return kind.isPrimitive();
    }

    /**
     * Tells whether or not this kind is a CxxObject extender or implementer kind.
     *
     * @return True iff CxxObject extender or implementer
     */
    public boolean isCxxObjectKind() {
        return kind.isCxxObjectKind();
    }

    /**
     * Tells whether or not this kind is a non-const CxxObject extender or implementer kind.
     *
     * @return True iff non-const CxxObject extender or implementer
     */
    public boolean isNonConstCxxObjectKind() {
        return kind.isNonConstCxxObjectKind();
    }

    /**
     * Tells whether or not this kind is a const CxxObject extender or implementer kind.
     *
     * @return True iff const CxxObject extender or implementer
     */
    public boolean isConstCxxObjectKind() {
        return kind.isConstCxxObjectKind();
    }

    /**
     * Tells whether or not this kind is a by value CxxObject extender or implementer kind.
     *
     * @return True iff by value CxxObject extender or implementer
     */
    public boolean isByValueCxxObjectKind() {
        return kind.isByValueCxxObjectKind();
    }

    /**
     * Tells whether or not this kind is a by reference CxxObject extender or implementer kind.
     *
     * @return True iff by reference CxxObject extender or implementer
     */
    public boolean isByReferenceCxxObjectKind() {
        return kind.isByReferenceCxxObjectKind();
    }

    /**
     * Tells whether or not this kind is a Java object kind.
     *
     * @return True iff Java object
     */
    public boolean isJavaObjectKind() {
        return kind.isJavaObjectKind();
    }

    /**
     * Tells whether or not this kind is a pointer.
     *
     * @return True iff pointer
     */
    public boolean isPtr() {
        return kind.isPtr();
    }

    /**
     * Tells whether or not this kind is a non-const pointer.
     *
     * @return True iff non-const pointer
     */
    public boolean isNonConstPtr() {
        return kind.isNonConstPtr();
    }

    /**
     * Tells whether or not this kind is a const pointer.
     *
     * @return True iff const pointer
     */
    public boolean isConstPtr() {
        return kind.isConstPtr();
    }

    /**
     * Tells whether or not this kind is a reference.
     *
     * @return True iff reference
     */
    public boolean isRef() {
        return kind.isRef();
    }

    /**
     * Tells whether or not this kind is a non-const reference.
     *
     * @return True iff non-const reference
     */
    public boolean isNonConstRef() {
        return kind.isNonConstRef();
    }

    /**
     * Tells whether or not this kind is a const reference.
     *
     * @return True iff const reference
     */
    public boolean isConstRef() {
        return kind.isConstRef();
    }

    /**
     * Tells whether or not this kind is a Java object passable to native code as Java reference.
     *
     * @return True iff Java object passable to native code as Java reference
     */
    public boolean isNativeCompatibleJavaObjectKind() {
        return kind.isNativeCompatibleJavaObjectKind();
    }
}
