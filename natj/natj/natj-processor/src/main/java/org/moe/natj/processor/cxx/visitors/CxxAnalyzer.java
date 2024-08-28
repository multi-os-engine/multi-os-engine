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

import org.moe.natj.processor.Config;
import org.moe.natj.processor.cxx.*;
import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.moe.natj.processor.cxx.utility.DiagClassVisitor;
import org.moe.natj.processor.cxx.utility.ProcessorException;
import org.moe.natj.processor.signature.JavaTypeSignature;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Type;

import java.util.*;

import static org.objectweb.asm.Opcodes.ACC_INTERFACE;

/**
 * This class analyzes class/interface hierarchy and annotation correctness.
 */
public class CxxAnalyzer {
    /**
     * Map for Type -> CxxClassInfo binding.
     */
    private final Map<Type, CxxClassInfo> javaTypeToClassInfoMap = new HashMap<>();

    /**
     * Map for CxxClassInfo -> Java super interfaces binding.
     */
    private final Map<CxxClassInfo, String[]> classInfoForSuperInterfacesMap = new HashMap<>();

    /**
     * Map for Type signature -> Type binding.
     */
    private final Map<String, Type> typeSignatureTojavaTypeMap = new HashMap<>();

    /**
     * Collected header file paths.
     */
    private final HashSet<String> headers = new HashSet<>();

    /**
     * Collected user header file paths.
     */
    private final HashSet<String> userHeaders = new HashSet<>();

    /**
     * Map for internal type name -> CxxDeclCollection binding.
     */
    private final Map<String, CxxDeclCollection> declCollectionMap = new HashMap<>();

    /**
     * List of already post-processed class infos.
     */
    private final List<CxxClassInfo> postProcessedClassInfos = new ArrayList<>();

    /**
     * Map for type name -> Specialized signature binding.
     */
    final Map<String, String> typeToSpecializedSignatureMap = new HashMap<>();

    /**
     * Returns collected header file paths.
     *
     * @return Collected header file paths
     */
    public HashSet<String> getHeaders() {
        return headers;
    }

    /**
     * Returns collected user header file paths.
     *
     * @return Collected user header file paths
     */
    public HashSet<String> getUserHeaders() {
        return userHeaders;
    }

    /**
     * Class type enum.
     */
    private enum ClassType {
        /**
         * Class is unmarked.
         */
        UNANNOTATED,
        /**
         * Class is marked with @CxxClass.
         */
        CxxClass,
        /**
         * Class is marked with @CxxInheritedClass.
         */
        CxxInheritedClass,
    }

    /**
     * Analyze the specified ClassReader.
     *
     * @param classReader ClassReader
     */
    public void analyzeClass(ClassReader classReader) {
        if (classReader == null) {
            throw new NullPointerException();
        }
        classReader.accept(new DiagClassVisitor() {
            /**
             * Class type.
             */
            private ClassType classType = ClassType.UNANNOTATED;

            /**
             * Class is interface.
             */
            private boolean classIsInterface;

            /**
             * Java type of the class.
             */
            private String className;

            /**
             * Super interfaces.
             */
            private String[] classInterfaces;

            /**
             * Source file defining the class.
             */
            private String classSourceFile;

            /**
             * C++ class name.
             */
            private String cxxClassName;

            /**
             * Template specialized signature.
             */
            private String specSignature;

            @Override
            public void diagVisit(int version, int access, String name, String signature, String superName,
                                  String[] interfaces) {
                classIsInterface = (access & ACC_INTERFACE) == ACC_INTERFACE;
                className = name;
                classInterfaces = interfaces;
                super.diagVisit(version, access, name, signature, superName, interfaces);
            }

            @Override
            public void diagVisitSource(String source, String debug) {
                classSourceFile = source;
                super.diagVisitSource(source, debug);
            }

            @Override
            public AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
                final AnnotationVisitor superAnnVisitor = super.diagVisitAnnotation(desc, visible);
                if (CxxSupport.CXX_CLASS_ANN.getDescriptor().equals(desc)) {
                    return CxxAnnotationVisitors.CxxClass(superAnnVisitor, (value) -> {
                        setClassType(desc, visible, ClassType.CxxClass);
                        checkAnnValueNonEmpty(desc, visible, value, ClassType.CxxClass);
                        specSignature = typeToSpecializedSignatureMap.get(className);
                        cxxClassName = value;
                    });

                } else if (CxxSupport.CXX_INHERITED_CLASS_ANN.getDescriptor().equals(desc)) {
                    return CxxAnnotationVisitors.CxxInheritedClass(superAnnVisitor, value -> {
                        setClassType(desc, visible, ClassType.CxxInheritedClass);
                        checkAnnValueNonEmpty(desc, visible, value, ClassType.CxxInheritedClass);
                        cxxClassName = value;
                    });

                } else {
                    return superAnnVisitor;
                }
            }

            /**
             * Check whether or not the specified value is empty or not.
             *
             * @param desc Annotation descriptor
             * @param visible Annotation runtime visibility
             * @param value Value to check
             * @param classType Target class type
             */
            private void checkAnnValueNonEmpty(String desc, boolean visible, String value, ClassType classType) {
                if (value == null || value.length() == 0) {
                    throwAnnException(desc, visible, classType.name() + " annotation's parameter must be a " +
                            "non-empty string");
                }
            }

            /**
             * Sets the class type.
             *
             * @param desc Annotation descriptor
             * @param visible Annotation runtime visibility
             * @param classType Target class type
             */
            private void setClassType(String desc, boolean visible, ClassType classType) {
                if (this.classType != ClassType.UNANNOTATED) {
                    throwAnnException(desc, visible, "Failed to mark type as " +
                            classType.name() + ", already marked as " + this.classType.name());
                }
                this.classType = classType;
            }

            /**
             * Throws a pre-configured ProcessorException.
             *
             * @param desc Annotation descriptor
             * @param visible Annotation runtime visibility
             * @param message Exception message
             */
            private void throwAnnException(String desc, boolean visible, String message) {
                ProcessorException pex = new ProcessorException();
                pex.setDiagInfo(getClassDiagInfo());
                pex.setMessage(message);
                pex.put("desc", desc);
                pex.put("visible", visible);
                throw pex;
            }

            @Override
            public void diagVisitEnd() {
                // Don't process unannotated classes
                if (classType == ClassType.UNANNOTATED) {
                    super.diagVisitEnd();
                    return;
                }

                // Check some basic assertions
                if (classType == ClassType.CxxClass && !classIsInterface) {
                    throw new RuntimeException("@CxxClass can only be placed on interfaces");
                } else if (classType == ClassType.CxxInheritedClass && classIsInterface) {
                    throw new RuntimeException("@CxxInheritedClass can only be placed on classes");
                }
                if (cxxClassName == null || cxxClassName.length() == 0) {
                    throw new RuntimeException("Class name must not be empty");
                }

                // Update maps
                CxxClassInfo classInfo = new CxxClassInfo(cxxClassName, className, classSourceFile,
                        classType == ClassType.CxxInheritedClass);
                javaTypeToClassInfoMap.put(classInfo.mapperType, classInfo);
                classInfoForSuperInterfacesMap.put(classInfo, classInterfaces);
                if (specSignature != null) {
                    typeSignatureTojavaTypeMap.put(specSignature, classInfo.mapperType);
                }
            }
        }, ClassReader.SKIP_CODE);
    }

    /**
     * Returns the CxxClassInfo for the specified Java type.
     *
     * @param type Java type
     * @return CxxClassInfo or null
     */
    public CxxClassInfo getCxxClassInfoForType(Type type) {
        if (type == null) {
            throw new NullPointerException();
        }
        return javaTypeToClassInfoMap.get(type);
    }

    /**
     * Returns the CxxClassInfo for the specified internal name.
     *
     * @param name Internal name
     * @return CxxClassInfo or null
     */
    public CxxClassInfo getCxxClassInfoForName(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
        return getCxxClassInfoForType(Type.getObjectType(name));
    }

    /**
     * Returns the CxxClassInfo for the specified type signature.
     *
     * @param signature Type signature
     * @return CxxClassInfo or null
     */
    public CxxClassInfo getCxxClassInfoForSpecializedType(JavaTypeSignature signature) {
        if (signature == null) {
            return null;
        }
        final Type type = typeSignatureTojavaTypeMap.get(signature.toString());
        if (type == null) {
            return null;
        }
        return getCxxClassInfoForType(type);
    }

    /**
     * Complete all class' information.
     */
    public void postProcess() {
        // Add super interfaces
        for (Map.Entry<Type, CxxClassInfo> entry : javaTypeToClassInfoMap.entrySet()) {
            final CxxClassInfo classInfo = entry.getValue();

            // Check whether already processed or not
            if (postProcessedClassInfos.contains(classInfo)) {
                continue;
            }

            // Post process
            postProcessedClassInfos.add(classInfo);
            final String[] supers = classInfoForSuperInterfacesMap.get(classInfo);
            for (String zuper : supers) {
                final Type type = Type.getObjectType(zuper);
                final CxxClassInfo superClassInfo = javaTypeToClassInfoMap.get(type);
                if (superClassInfo == null) {
                    classInfo.addJavaInterface(type);
                } else {
                    classInfo.addSuper(superClassInfo);
                }
            }
        }
        classInfoForSuperInterfacesMap.clear();
    }

    /**
     * Returns a CxxReifier configured to use this analyzer.
     *
     * @param configuration Configuration
     * @return CxxReifier instance
     */
    public CxxReifier getReifier(Config configuration) {
        CxxClassInfoResolver.resolveAll(javaTypeToClassInfoMap.values());
        HashSet<CxxDeclCollection> declCollections = new HashSet<>(declCollectionMap.values());
        for (CxxClassInfo classInfo : javaTypeToClassInfoMap.values()) {
            declCollections.remove(getDeclCollection(classInfo, null));
        }
        CxxType.getTypeResolverPlugins().forEach(iTypeResolverPlugin -> {
            final TypeResolverPluginConfiguration config = CxxType.getTypeResolverPluginConfig(iTypeResolverPlugin);
            if (config != null) {
                headers.addAll(config.headers);
                userHeaders.addAll(config.userHeaders);
            }
        });
        return new CxxReifier(javaTypeToClassInfoMap.values(), headers, userHeaders, declCollections, this,
                configuration);
    }

    /**
     * Gets or creates a CxxDeclCollection for the specified classInfo and name.
     *
     * @param classInfo Class info
     * @param name      Internal name
     * @return CxxDeclCollection instance
     */
    public CxxDeclCollection getDeclCollection(CxxClassInfo classInfo, String name) {
        if (classInfo != null) {
            return getDeclCollection(classInfo.mapperType.getInternalName());
        }
        return getDeclCollection(name);
    }

    /**
     * Gets or creates a CxxDeclCollection for the specified name.
     *
     * @param name Internal name
     * @return CxxDeclCollection instance
     */
    private CxxDeclCollection getDeclCollection(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
        CxxDeclCollection collection = declCollectionMap.get(name);
        if (collection == null) {
            collection = new CxxDeclCollection(name);
            declCollectionMap.put(name, collection);
        }
        return collection;
    }
}
