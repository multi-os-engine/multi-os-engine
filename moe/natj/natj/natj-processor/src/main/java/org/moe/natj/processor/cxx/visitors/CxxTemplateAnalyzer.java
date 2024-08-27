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

package org.moe.natj.processor.cxx.visitors;

import org.moe.natj.processor.cxx.BCGen;
import org.moe.natj.processor.cxx.CxxClassInfo;
import org.moe.natj.processor.cxx.CxxSupport;
import org.moe.natj.processor.cxx.utility.DiagClassVisitor;
import org.moe.natj.processor.cxx.utility.DiagMethodVisitor;
import org.moe.natj.processor.cxx.utility.MethodDiagInfo;
import org.moe.natj.processor.signature.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/**
 * This class analyzes class files for template specialization.
 */
public class CxxTemplateAnalyzer implements Opcodes {

    /**
     * C++ analyzer.
     */
    private final CxxAnalyzer analyzer;

    /**
     * Template class infos.
     */
    private final List<TemplateInfo> templateClasses = new ArrayList<>();

    /**
     * Specialized template classes.
     */
    private final Set<Specialization> specializedClasses = new HashSet<>();

    /**
     * Map for Specialized signature -> type name binding.
     */
    final Map<String, String> specializedSignatureToTypeMap = new HashMap<>();

    /**
     * Create a new CxxTemplateAnalyzer instance.
     *
     * @param analyzer C++ class analyzer
     */
    public CxxTemplateAnalyzer(CxxAnalyzer analyzer) {
        if (analyzer == null) {
            throw new NullPointerException();
        }
        this.analyzer = analyzer;
    }

    /**
     * Template class info.
     */
    private static class TemplateInfo {
        /**
         * Class version.
         */
        private final int version;

        /**
         * Class access flags.
         */
        private final int access;

        /**
         * Class name.
         */
        private final String name;

        /**
         * Class signature.
         */
        private final String signature;

        /**
         * Number of template arguments.
         */
        private int numTemplateArgs;

        /**
         * C++ class base name.
         */
        private String cxxClassName;

        /**
         * Methods in the class.
         */
        private final List<MethodNode> methods = new ArrayList<>();

        /**
         * Annotations on the class.
         */
        private final List<AnnotationNode> annotations = new ArrayList<>();

        /**
         * Forward specializations.
         */
        private final Set<ClassTypeSignature> forwardSpecializations = new HashSet<>();

        /**
         * Number of specialized classes.
         */
        private int numSpecializedClasses;

        /**
         * Create a new TemplateInfo instance.
         *
         * @param version   Class version
         * @param access    Class access flags
         * @param name      Class name
         * @param signature Class signature
         */
        public TemplateInfo(int version, int access, String name, String signature) {
            this.version = version;
            this.access = access;
            this.name = name;
            this.signature = signature;
        }

        /**
         * Validates template class structure and sets some additional properties.
         *
         * @return This TemplateInfo
         */
        public TemplateInfo init() {
            if ((access & ACC_INTERFACE) != ACC_INTERFACE) {
                throw new RuntimeException("Only interfaces can be marked with @CxxTemplate");
            }
            if (signature == null) {
                throw new RuntimeException("Interfaces marked with @CxxTemplate must have template parameters");
            }
            final ClassSignature classSignature = SignatureParser.parseClassSignature(signature);
            if (classSignature.typeParameters.size() == 0) {
                throw new RuntimeException("Interfaces marked with @CxxTemplate must have at least one template " +
                        "parameter");
            }
            classSignature.typeParameters.forEach(parameter -> {
                boolean failed = false;
                if (parameter.classBound != null) {
                    failed = true;
                } else if (parameter.interfaceBounds.size() != 1) {
                    failed = true;
                } else if (!(parameter.interfaceBounds.get(0) instanceof ClassTypeSignature)) {
                    failed = true;
                } else {
                    final ClassTypeSignature cts = (ClassTypeSignature) parameter.interfaceBounds.get(0);
                    if (!CxxSupport.CXX_OBJECT_ITF.getInternalName().equals(cts.getInternalName())) {
                        failed = true;
                    }
                }
                if (failed) {
                    throw new RuntimeException("Generic type parameter '" + parameter.identifier +
                            "' must be defined as '" + parameter.identifier + " extends CxxObject'");
                }
            });
            if (cxxClassName == null || cxxClassName.length() == 0) {
                throw new RuntimeException("Class name must not be empty");
            }
            numTemplateArgs = classSignature.typeParameters.size();
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TemplateInfo templateInfo = (TemplateInfo) o;
            return Objects.equals(name, templateInfo.name) &&
                    Objects.equals(signature, templateInfo.signature);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, signature);
        }
    }

    /**
     * Save structural information of the specified class if it is a CxxTemplate
     *
     * @param classReader Class reader
     */
    public void saveTemplateClass(ClassReader classReader) {
        final DiagClassVisitor visitor = new DiagClassVisitor() {
            /**
             * Class info.
             */
            private TemplateInfo info;

            /**
             * Top level C++ annotation.
             */
            private Type topLevelAnn;

            /**
             * Is template class flag.
             */
            private boolean isTemplate = false;

            @Override
            protected void diagVisit(int version, int access, String name, String signature, String superName,
                                     String[] interfaces) {
                super.diagVisit(version, access, name, signature, superName, interfaces);
                info = new TemplateInfo(version, access, name, signature);
            }

            @Override
            protected AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
                final Type annType = Type.getType(desc);
                final AnnotationVisitor superAnnVisitor = super.diagVisitAnnotation(desc, visible);
                if (CxxSupport.CXX_CLASS_ANN.equals(annType)) {
                    if (topLevelAnn != null) {
                        throw new RuntimeException("Class " + info.name + " already marked with " + topLevelAnn);
                    }
                    topLevelAnn = annType;
                    return superAnnVisitor;

                } else if (CxxSupport.CXX_INHERITED_CLASS_ANN.equals(annType)) {
                    if (topLevelAnn != null) {
                        throw new RuntimeException("Class " + info.name + " already marked with " + topLevelAnn);
                    }
                    topLevelAnn = annType;
                    return superAnnVisitor;

                } else if (CxxSupport.CXX_TEMPLATE_ANN.equals(annType)) {
                    if (topLevelAnn != null) {
                        throw new RuntimeException("Class " + info.name + " already marked with " + topLevelAnn);
                    }
                    topLevelAnn = annType;
                    isTemplate = true;
                    if (info.signature != null) {
                        final ClassSignature signature = SignatureParser.parseClassSignature(info.signature);
                        signature.superinterfaceSignatures.forEach(this::checkSignatureForForwardSpecialization);
                    }
                    return CxxAnnotationVisitors.CxxTemplate(superAnnVisitor, value -> info.cxxClassName = value);

                } else if (!visible) {
                    return superAnnVisitor;
                }

                final AnnotationNode node = new AnnotationNode(desc);
                info.annotations.add(node);
                return node;
            }

            @Override
            protected MethodVisitor diagVisitMethod(int access, String name, String desc, String signature,
                                                    String[] exceptions) {
                if (CxxSupport.CXX_TEMPLATE_ANN.equals(topLevelAnn) && (access & ACC_STATIC) == 0) {
                    final MethodNode node = new MethodNode(access, name, desc, signature, exceptions);
                    info.methods.add(node);
                    if (signature != null) {
                        final MethodSignature method = SignatureParser.parseMethodSignature(signature);
                        checkSignatureForForwardSpecialization(method.result);
                        method.parameters.forEach(this::checkSignatureForForwardSpecialization);
                    }
                    return node;
                }
                return super.diagVisitMethod(access, name, desc, signature, exceptions);
            }

            /**
             * Checks whether the specified signature is forward template specialization or not.
             *
             * @param signature Signature to check
             */
            private void checkSignatureForForwardSpecialization(JavaTypeSignature signature) {
                if (signature instanceof ClassTypeSignature
                        && isSignatureForForwardSpecialization((ClassTypeSignature) signature)) {
                    info.forwardSpecializations.add((ClassTypeSignature) signature);
                }
            }

            /**
             * Checks whether the specified signature is forward template specialization or not.
             *
             * @param signature Signature to check
             * @return True iff signature is forward template specialization
             */
            private boolean isSignatureForForwardSpecialization(ClassTypeSignature signature) {
                final List<TypeArgument> list = Arrays.asList(signature.getTypeArguments());
                return list.stream().anyMatch(typeArgument -> {
                    if (typeArgument.wildcard != TypeArgument.WC_NONE) {
                        return false;
                    }
                    final ReferenceTypeSignature rts = typeArgument.referenceTypeSignature;
                    return rts instanceof TypeVariableSignature;
                });
            }

            @Override
            protected void diagVisitEnd() {
                super.diagVisitEnd();
                if (isTemplate) {
                    templateClasses.add(info.init());
                }
            }
        };
        classReader.accept(visitor, 0);
    }

    /**
     * Template type specialization.
     */
    private static class Specialization {
        /**
         * Specialized class type signature.
         */
        final String signature;

        /**
         * Template info.
         */
        final TemplateInfo templateInfo;

        /**
         * Parameter types.
         */
        final List<Object> templateParameterTypes;

        /**
         * C++ specialized name.
         */
        private final String cxxSpecializedName;

        /**
         * Template parameter identifier -> Class type map.
         */
        final Map<String, ClassTypeSignature> templateParameterIdentifierMap = new HashMap<>();

        /**
         * Dependency specializations.
         */
        final Set<Specialization> dependencies = new HashSet<>();

        /**
         * Create a new Specialization instance.
         *
         * @param signature              Specialized class type signature
         * @param templateInfo           Template info
         * @param templateParameterTypes Parameter types
         * @param cxxSpecializedName     C++ specialized name
         * @param templateTypes          Class type signature for template parameter identifiers
         */
        public Specialization(String signature, TemplateInfo templateInfo, List<Object> templateParameterTypes,
                              String cxxSpecializedName, List<ClassTypeSignature> templateTypes) {
            if (signature == null) {
                throw new NullPointerException();
            }
            if (templateInfo == null) {
                throw new NullPointerException();
            }
            if (templateParameterTypes == null) {
                throw new NullPointerException();
            }
            if (cxxSpecializedName == null) {
                throw new NullPointerException();
            }
            if (templateTypes == null) {
                throw new NullPointerException();
            }
            this.signature = signature;
            this.templateInfo = templateInfo;
            this.templateParameterTypes = templateParameterTypes;
            this.cxxSpecializedName = cxxSpecializedName;

            // Map identifiers to class type signatures
            final ClassSignature templateSignature = SignatureParser.parseClassSignature(templateInfo.signature);
            final List<TypeParameter> typeParameters = templateSignature.typeParameters;
            if (typeParameters.size() != templateTypes.size()) {
                throw new IllegalStateException("Mismatch in number of templates, expected: " + typeParameters.size() +
                        ", actual: " + templateTypes.size());
            }
            for (int i = 0, size = typeParameters.size(); i < size; i++) {
                TypeParameter typeParameter = typeParameters.get(i);
                templateParameterIdentifierMap.put(typeParameter.identifier, templateTypes.get(i));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Specialization that = (Specialization) o;
            return Objects.equals(signature, that.signature);
        }

        @Override
        public int hashCode() {
            return Objects.hash(signature);
        }

        /**
         * Returns the specialized forward specialization classes from the templateInfo.
         *
         * @return Specialized classes
         */
        public Set<ClassTypeSignature> getForwardSpecializations() {
            HashSet<ClassTypeSignature> results = new HashSet<>();
            templateInfo.forwardSpecializations.forEach(cts -> results.add(getForwardSpecialization(cts)));
            return results;
        }

        /**
         * Returns the specialized version of the forward specialization class.
         *
         * @param cts Signature to specialize
         * @return Specialized classes
         */
        private ClassTypeSignature getForwardSpecialization(ClassTypeSignature cts) {
            // Create a copy of the original object
            cts = SignatureParser.parseClassTypeSignature(cts.toString());

            // Get the last SimpleClassTypeSignature
            final List<SimpleClassTypeSignature> list = cts.simpleClassTypes;
            final SimpleClassTypeSignature last = list.get(list.size() - 1);

            // Handle template args
            last.typeArguments.forEach(typeArgument -> {
                final ReferenceTypeSignature rts = typeArgument.referenceTypeSignature;
                if (rts instanceof ClassTypeSignature) {
                    typeArgument.referenceTypeSignature = getForwardSpecialization((ClassTypeSignature) rts);

                } else if (rts instanceof TypeVariableSignature) {
                    TypeVariableSignature tvs = (TypeVariableSignature) rts;
                    typeArgument.referenceTypeSignature = templateParameterIdentifierMap.get(tvs.identifier);
                }
            });
            return cts;
        }
    }

    /**
     * Collects the references made to template classes.
     *
     * @param classReader Class reader
     */
    public void collectTemplateReferences(ClassReader classReader) {
        final DiagClassVisitor visitor = new DiagClassVisitor() {

            @Override
            protected MethodVisitor diagVisitMethod(int access, String name, String desc, String signature,
                                                    String[] exceptions) {
                // Early exit
                if (signature == null || !descriptorContainsTemplate(desc)) {
                    return super.diagVisitMethod(access, name, desc, signature, exceptions);
                }

                // Process method
                final MethodDiagInfo info = new MethodDiagInfo(getClassDiagInfo(), access, name, desc, signature,
                        exceptions);
                return new DiagMethodVisitor(super.diagVisitMethod(access, name, desc, signature, exceptions), info) {
                    /**
                     * Flag for processing this method.
                     */
                    boolean shouldProcessMethod = false;

                    @Override
                    protected AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
                        final Type annType = Type.getType(desc);
                        if (CxxSupport.CXX_METHOD_ANN.equals(annType)
                                || CxxSupport.CXX_OPERATOR_ANN.equals(annType)
                                || CxxSupport.CXX_CAST_OPERATOR_ANN.equals(annType)
                                || CxxSupport.CXX_FUNCTION_ANN.equals(annType)
                                || CxxSupport.CXX_OPERATOR_FUNCTION_ANN.equals(annType)
                                || CxxSupport.CXX_CONSTRUCTOR_ANN.equals(annType)
                                || CxxSupport.CXX_FIELD_GETTER_ANN.equals(annType)
                                || CxxSupport.CXX_FIELD_SETTER_ANN.equals(annType)
                                || CxxSupport.CXX_GLOBAL_GETTER_ANN.equals(annType)
                                || CxxSupport.CXX_GLOBAL_SETTER_ANN.equals(annType)) {
                            shouldProcessMethod = true;
                        }
                        return super.diagVisitAnnotation(desc, visible);
                    }

                    @Override
                    protected void diagVisitEnd() {
                        super.diagVisitEnd();
                        if (shouldProcessMethod) {
                            processMethod(SignatureParser.parseMethodSignature(signature));
                        }
                    }
                };
            }

            /**
             * Process the method signature looking for template classes.
             *
             * @param signature Method signature
             */
            private void processMethod(MethodSignature signature) {
                storeProcessedTypeResult(processType(signature.result));
                signature.parameters.forEach((paramSignature) -> storeProcessedTypeResult(processType(paramSignature)));
            }

            /**
             * Stores the processed type result.
             *
             * @param result Processed type result
             */
            private void storeProcessedTypeResult(Specialization result) {
                if (result != null) {
                    specializedClasses.add(result);
                    final Set<ClassTypeSignature> forwardSpecializations = result.getForwardSpecializations();

                    // Process forward specialization types
                    forwardSpecializations.forEach(cts -> {
                        if (!specializedClasses.stream().anyMatch(sc -> sc.signature.equals(cts.toString()))) {
                            storeProcessedTypeResult(processType(cts));
                        }
                    });

                    // Add forward specializations as dependency
                    forwardSpecializations.forEach(cts -> {
                        // Don't add self as dependency
                        final String ctsSignature = cts.toString();
                        if (ctsSignature.equals(result.signature)) {
                            return;
                        }

                        // Lookup specialized interface and add
                        final List<Specialization> specialization = specializedClasses.stream()
                                .filter(spec -> Objects.equals(spec.signature, ctsSignature))
                                .collect(Collectors.toList());
                        if (specialization.size() == 1) {
                            result.dependencies.add(specialization.get(0));

                        } else if (specialization.size() > 1) {
                            throw new IllegalStateException("Multiple specializations found for the same type: " +
                                    ctsSignature);

                        } else {
                            throw new IllegalStateException("No specializations found for type: " + ctsSignature);
                        }
                    });
                }
            }

            /**
             * Process the type signature looking for template classes.
             *
             * @param signature Type signature
             * @return Specialized template or null
             */
            private Specialization processType(JavaTypeSignature signature) {
                if (!(signature instanceof ClassTypeSignature)) {
                    return null;
                }
                return processType((ClassTypeSignature) signature);
            }

            /**
             * Process the type signature looking for template classes.
             *
             * @param cts Class type signature
             * @return Specialized template, forward template specialization or null
             */
            private Specialization processType(ClassTypeSignature cts) {
                // Check whether root type is template or not
                final TemplateInfo templateInfo = getTemplateType(cts.getInternalName());
                if (templateInfo == null) {
                    // Not a template class
                    return null;
                }

                // Check whether we already specialized this type
                final String ctsSignature = cts.toString();
                final List<Specialization> specialization = specializedClasses.stream()
                        .filter(spec -> Objects.equals(spec.signature, ctsSignature))
                        .collect(Collectors.toList());
                if (specialization.size() == 1) {
                    // Already specialized
                    return specialization.get(0);

                } else if (specialization.size() > 1) {
                    throw new IllegalStateException("Multiple specializations found for the same type: " +
                            ctsSignature);
                }

                // Specialize
                System.out.println("  Found " + cts);
                final List<TypeArgument> typeArguments = Arrays.asList(cts.getTypeArguments());
                if (typeArguments.size() != templateInfo.numTemplateArgs) {
                    throw new RuntimeException("Illegal number of type arguments on template type " + templateInfo.name);
                }

                // Check wildcard requirements
                typeArguments.forEach(typeArgument -> {
                    if (typeArgument.wildcard != TypeArgument.WC_NONE) {
                        throw new RuntimeException("Illegal wildcard type for type argument " + typeArgument);
                    }
                });

                final List<Object> resolvedTypeArguments = new ArrayList<>();
                final List<String> cxxTemplateTypes = new ArrayList<>();
                final List<ClassTypeSignature> templateTypes = new ArrayList<>();
                final Set<Specialization> dependencies = new HashSet<>();
                final AtomicBoolean isForwardSpecialization = new AtomicBoolean(false);
                typeArguments.forEach(typeArgument -> {
                    final ReferenceTypeSignature rts = typeArgument.referenceTypeSignature;
                    assert rts != null;
                    if (rts instanceof ArrayTypeSignature) {
                        throw new RuntimeException("Unsupported template type argument " + rts);

                    } else if (rts instanceof TypeVariableSignature) {
                        isForwardSpecialization.set(true);
                        return;
                    }
                    final ClassTypeSignature tacts = (ClassTypeSignature) rts;
                    final String tactsInternalName = tacts.getInternalName();
                    final CxxClassInfo cxxClassInfo = analyzer.getCxxClassInfoForName(tactsInternalName);
                    if (cxxClassInfo != null) {
                        // We found a C++ class or inherited class
                        resolvedTypeArguments.add(cxxClassInfo);
                        cxxTemplateTypes.add(cxxClassInfo.cxxClassName);
                        templateTypes.add(tacts);
                        return;
                    }

                    final TemplateInfo taTemplateInfo = getTemplateType(tactsInternalName);
                    if (taTemplateInfo == null) {
                        throw new RuntimeException("Expected some sort of CxxObject as type argument instead of " +
                                typeArgument);
                    }
                    final Specialization dependency = processType(tacts);
                    if (dependency == null) {
                        throw new IllegalStateException("Unexpected null value");
                    }

                    dependencies.add(dependency);
                    resolvedTypeArguments.add(dependency);
                    cxxTemplateTypes.add(dependency.cxxSpecializedName);
                    templateTypes.add(tacts);
                });
                if (isForwardSpecialization.get()) {
                    return null;
                }

                final List<String> cxxSpecializedNameExpansion = new ArrayList<>();
                String cxxSpecializedName = templateInfo.cxxClassName;
                {
                    final List<String> identifiers = SignatureParser.parseClassSignature(templateInfo.signature)
                            .typeParameters.stream().map(parameter -> parameter.identifier)
                            .collect(Collectors.toList());

                    int start;
                    cxxSpecializedNameExpansion.add(cxxSpecializedName);
                    while ((start = cxxSpecializedName.indexOf("{{")) != -1) {
                        int end = cxxSpecializedName.indexOf("}}", start + 2);
                        if (end == -1) {
                            throw new RuntimeException("Template type expansion failed\n" +
                                    "Expansion steps: " + cxxSpecializedNameExpansion + "\n" +
                                    "Identifiers: " + identifiers + "\n" +
                                    "Error: failed to locate closing '}}'\n" +
                                    "Start: " + (start + 2));
                        }
                        String macro = cxxSpecializedName.substring(start + 2, end);
                        final int index = identifiers.indexOf(macro);
                        if (index == -1) {
                            throw new RuntimeException("Template type expansion failed\n" +
                                    "Expansion steps: " + cxxSpecializedNameExpansion + "\n" +
                                    "Identifiers: " + identifiers + "\n" +
                                    "Error: failed to locate macro with name '" + macro + "'\n" +
                                    "Start: " + (start + 2));
                        }
                        String expanded = cxxTemplateTypes.get(index);
                        cxxSpecializedName = cxxSpecializedName.substring(0, start) +
                                expanded + cxxSpecializedName.substring(end + 2, cxxSpecializedName.length());
                    }
                }

                final Specialization spec = new Specialization(ctsSignature, templateInfo, resolvedTypeArguments,
                        cxxSpecializedName, templateTypes);
                spec.dependencies.addAll(dependencies);
                return spec;
            }
        };
        classReader.accept(visitor, ClassReader.SKIP_CODE);
    }

    /**
     * Tells whether or not the descriptor uses template classes as its return type or as argument types.
     *
     * @param desc Method descriptor
     * @return True iff method descriptor contains template class
     */
    private boolean descriptorContainsTemplate(String desc) {
        final Type method = Type.getMethodType(desc);
        if (isTemplateType(method.getReturnType())) {
            return true;
        }
        for (Type type : method.getArgumentTypes()) {
            if (isTemplateType(type)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Tells whether or not the specified type is a template class or not.
     *
     * @param type Type to check
     * @return True iff type is a template class
     */
    private boolean isTemplateType(Type type) {
        return getTemplateType(type) != null;
    }

    /**
     * Returns the template type associated with the specified type.
     *
     * @param internalName Type to check
     * @return Class info or null
     */
    private TemplateInfo getTemplateType(String internalName) {
        if (internalName == null) {
            throw new NullPointerException();
        }
        final List<TemplateInfo> list = templateClasses.stream()
                .filter(classInfo -> internalName.equals(classInfo.name))
                .collect(Collectors.toList());
        if (list.size() == 0) {
            return null;
        } else if (list.size() > 1) {
            throw new IllegalStateException("Multiple matches for class " + internalName);
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the template type associated with the specified type.
     *
     * @param type Type to check
     * @return Class info or null
     */
    private TemplateInfo getTemplateType(Type type) {
        if (type == null) {
            throw new NullPointerException();
        }
        if (type.getSort() != Type.OBJECT) {
            return null;
        }
        final String internalName = type.getInternalName();
        return getTemplateType(internalName);
    }

    /**
     * Creates ClassReaders from template specializations.
     *
     * @return Set of ClassReaders containing reified templates
     */
    public Set<ClassReader> reifySpecializations() {
        final Map<Specialization, ClassReader> completed = new HashMap<>();
        specializedClasses.forEach(spec -> reifySpecialization(spec, completed));
        return new HashSet<>(completed.values());
    }

    /**
     * Reifies the specialization of the specified template.
     *
     * @param specialization Template specialization
     * @param completed      Completed specializations
     */
    private void reifySpecialization(Specialization specialization, Map<Specialization, ClassReader> completed) {
        // Early exit
        if (completed.containsKey(specialization)) {
            return;
        }

        // Do dependencies
        specialization.dependencies.forEach(dep -> reifySpecialization(dep, completed));

        // Reify
        final TemplateInfo templateInfo = specialization.templateInfo;
        final Map<String, ClassTypeSignature> identifierMap = specialization.templateParameterIdentifierMap;
        final ClassTypeSignature cts = SignatureParser.parseClassTypeSignature(specialization.signature);
        final String specName = templateInfo.name + "$__cxx_Spec" + templateInfo.numSpecializedClasses++;
        final String superCls = "java/lang/Object";

        // Construct class signature
        ClassSignature sign;
        final String[] interfaces;
        {
            List<TypeParameter> typeParameters = Collections.emptyList();
            ClassTypeSignature superClass = SignatureParser.parseClassTypeSignature("L" + superCls + ";");
            // TODO: invalid
            List<ClassTypeSignature> superInterfaces = new ArrayList<>();
            superInterfaces.add(cts);
            if (templateInfo.signature != null) {
                final ClassSignature signature = SignatureParser.parseClassSignature(templateInfo.signature);
                signature.superinterfaceSignatures.forEach(classTypeSignature -> {
                    final ClassTypeSignature fwd = specialization.getForwardSpecialization(classTypeSignature);

                    // Simply add non-specialized super interface
                    if (fwd.toString().equals(classTypeSignature.toString())) {
                        superInterfaces.add(fwd);
                        return;
                    }

                    // Lookup specialized super interface
                    final String specType = specializedSignatureToTypeMap.get(fwd.toString());
                    if (specType == null) {
                        throw new IllegalStateException("Missing specialized type dependency");
                    }
                    superInterfaces.add(SignatureParser.parseClassTypeSignature("L" + specType + ";"));
                });
            }
            sign = new ClassSignature(typeParameters, superClass, superInterfaces);

            // Collect super interface types
            List<String> superInterfaceTypes = superInterfaces.stream()
                    .map(ClassTypeSignature::getInternalName)
                    .collect(Collectors.toList());
            interfaces = superInterfaceTypes.toArray(new String[superInterfaceTypes.size()]);
        }

        // Initialize writer
        final ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        writer.visit(templateInfo.version,
                templateInfo.access,
                specName,
                sign.toString(),
                superCls,
                interfaces);
        writer.visitSource(null, null);
        analyzer.typeToSpecializedSignatureMap.put(specName, specialization.signature);
        specializedSignatureToTypeMap.put(specialization.signature, specName);
        templateInfo.annotations.forEach(annotationNode -> {
            final AnnotationVisitor visitor = writer.visitAnnotation(annotationNode.desc, true);
            annotationNode.accept(visitor);
        });
        {
            final AnnotationVisitor visitor = writer.visitAnnotation(CxxSupport.CXX_CLASS_ANN.getDescriptor(), true);
            visitor.visit("value", specialization.cxxSpecializedName);
            visitor.visitEnd();
        }

        // Implement methods
        templateInfo.methods.forEach(node -> {
            // Just forward bridge methods
            if ((node.access & ACC_BRIDGE) == ACC_BRIDGE || node.signature == null) {
                node.accept(writer);
                return;
            }

            final Type methodType = Type.getMethodType(node.desc);
            final MethodSignature methodSignature = SignatureParser.parseMethodSignature(node.signature);
            if (methodType.getArgumentTypes().length != methodSignature.parameters.size()) {
                throw new IllegalStateException("Unexpected number of parameters in method signature");
            }

            // Collect type information
            final List<TypeSignaturePair> pairs = new ArrayList<>();
            pairs.add(new TypeSignaturePair(methodType.getReturnType(), methodSignature.result));
            Type[] argumentTypes = methodType.getArgumentTypes();
            for (int i = 0, length = argumentTypes.length; i < length; i++) {
                Type type = argumentTypes[i];
                final JavaTypeSignature signature = methodSignature.parameters.get(i);
                pairs.add(new TypeSignaturePair(type, signature));
            }

            // Update types
            pairs.forEach(pair -> {
                // Update class type signatures recursively
                if (pair.signature instanceof ClassTypeSignature) {
                    pair.signature = specialization.getForwardSpecialization((ClassTypeSignature) pair.signature);
                }

                // Only update template types
                if (!(pair.signature instanceof TypeVariableSignature)) {
                    return;
                }

                // Get new type
                final TypeVariableSignature signature = (TypeVariableSignature) pair.signature;
                final ClassTypeSignature pcts = identifierMap.get(signature.identifier);

                // Exit if this is a custom template type
                if (pcts == null) {
                    return;
                }

                pair.type = Type.getObjectType(pcts.getInternalName());
                pair.signature = pcts;
            });

            // Update method type and signature
            final TypeSignaturePair returnTypePair = pairs.remove(0);
            final Type newMethodType = Type.getMethodType(returnTypePair.type,
                    pairs.stream().map(pair -> pair.type).collect(Collectors.toList()).toArray(new Type[pairs.size()]));
            final MethodSignature newMethodSignature = new MethodSignature(methodSignature.typeParameters,
                    pairs.stream().map(pair -> pair.signature).collect(Collectors.toList()), returnTypePair.signature,
                    methodSignature.throwsSignatures);

            // Write updated method
            final String[] exceptions = (String[]) node.exceptions.toArray(new String[node.exceptions.size()]);
            final MethodVisitor visitor = writer.visitMethod(node.access, node.name, newMethodType.getDescriptor(),
                    newMethodSignature.toString(), exceptions);
            node.accept(visitor);

            // Check whether a bridge method is needed or not
            if (methodType.equals(newMethodType)) {
                return;
            }

            // Create bridge method
            BCGen.createInterfaceBridgeMethod(specName, writer, node, methodType, newMethodType, true);
        });

        // Close and add to completed
        writer.visitEnd();
        completed.put(specialization, new ClassReader(writer.toByteArray()));
    }

    /**
     * Utility class for storing type-signature pairs.
     */
    private static class TypeSignaturePair {
        /**
         * Type.
         */
        public Type type;
        /**
         * Signature.
         */
        public JavaTypeSignature signature;

        /**
         * Create a new pair.
         *
         * @param type      Type
         * @param signature Signature
         */
        public TypeSignaturePair(Type type, JavaTypeSignature signature) {
            this.type = type;
            this.signature = signature;
        }
    }
}
