/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.natj;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Require;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;

import java.util.Arrays;
import java.util.function.Consumer;

import static org.objectweb.asm.Opcodes.ACC_INTERFACE;

/**
 * Class representing a Java class.
 */
public class NatJClass<T extends NatJClass> {

    /**
     * Name of the class.
     */
    @NotNull private String name;

    /**
     * Name of the superclass.
     */
    @Nullable private String superName;

    /**
     * Name of the super interfaces.
     */
    @NotNull private String[] superInterfaces;

    /**
     * Optional value of the @ObjCClassName annotation.
     */
    @Nullable private String objcClassName;

    /**
     * Optional value of the @ObjCClassBinding annotation.
     */
    @Nullable private String objcClassBinding;

    /**
     * Optional value of the @ObjCProtocolName annotation.
     */
    @Nullable private String objcProtocolName;

    /**
     * Optional value of the @ObjCProtocolSourceName annotation.
     */
    @Nullable private String objcProtocolSourceName;

    /**
     * Optional binding of the @Library annotation.
     */
    @Nullable private String library;

    /**
     * Flag for existence of @Generated annotation.
     */
    private boolean isGenerated;

    /**
     * Flag for marking as class.
     */
    private boolean isClass;

    @NotNull
    public String getName() {
        return name;
    }

    @Nullable
    public String getSuperName() {
        return superName;
    }

    @NotNull
    public String[] getSuperInterfaces() {
        return superInterfaces;
    }

    @Nullable
    public boolean hasObjcClassName() {
        return objcClassName != null;
    }

    @Nullable
    public String getObjcClassName() {
        return objcClassName;
    }

    @Nullable
    public boolean hasObjcClassBinding() {
        return objcClassBinding != null;
    }

    @Nullable
    public String getObjcClassBinding() {
        return objcClassBinding;
    }

    public boolean hasObjcProtocolName() {
        return objcProtocolName != null;
    }

    @Nullable
    public String getObjcProtocolName() {
        return objcProtocolName;
    }

    public boolean hasObjcProtocolSourceName() {
        return objcProtocolSourceName != null;
    }

    @Nullable
    public String getObjcProtocolSourceName() {
        return objcProtocolSourceName;
    }

    @Nullable
    public boolean hasLibrary() {
        return library != null;
    }

    @Nullable
    public String getLibrary() {
        return library;
    }

    public boolean isGenerated() {
        return isGenerated;
    }

    public boolean isClass() {
        return isClass;
    }

    public ClassVisitor getInitializingVisitor(int api, Consumer<T> consumer) {
        return new ClassVisitor(api) {
            @Override
            public void visit(int version, int access, String name, String signature, String superName,
                    String[] interfaces) {
                NatJClass.this.name = Require.nonNull(name);
                NatJClass.this.superName = superName;
                NatJClass.this.superInterfaces = Arrays.copyOf(Require.nonNull(interfaces), interfaces.length);
                NatJClass.this.isClass = (access & ACC_INTERFACE) == 0;
            }

            @Override
            public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
                if ("Lorg/moe/natj/objc/ann/ObjCClassName;".equals(desc)) {
                    return new AnnotationVisitor(api) {
                        @Override
                        public void visit(String name, Object value) {
                            if ("value".equals(name)) {
                                objcClassName = (String)value;
                            }
                        }

                        @Override
                        public void visitEnd() {
                            if (objcClassName == null) {
                                throw new GradleException("Found ObjCClassName annotation without a value");
                            }
                        }
                    };
                } else if ("Lorg/moe/natj/objc/ann/ObjCClassBinding;".equals(desc)) {
                    return new AnnotationVisitor(api) {
                        @Override
                        public void visit(String name, Object value) {
                            if ("value".equals(name)) {
                                objcClassBinding = (String)value;
                            }
                        }

                        @Override
                        public void visitEnd() {
                            if (objcClassBinding == null) {
                                objcClassBinding = name.substring(name.lastIndexOf('/') + 1, name.length());
                            }
                        }
                    };
                } else if ("Lorg/moe/natj/objc/ann/ObjCProtocolName;".equals(desc)) {
                    return new AnnotationVisitor(api) {
                        @Override
                        public void visit(String name, Object value) {
                            if ("value".equals(name)) {
                                objcProtocolName = (String)value;
                            }
                        }

                        @Override
                        public void visitEnd() {
                            if (objcProtocolName == null) {
                                throw new GradleException("Found ObjCProtocolName annotation without a value");
                            }
                        }
                    };
                } else if ("Lorg/moe/natj/objc/ann/ObjCProtocolSourceName;".equals(desc)) {
                    return new AnnotationVisitor(api) {
                        @Override
                        public void visit(String name, Object value) {
                            if ("value".equals(name)) {
                                objcProtocolSourceName = (String)value;
                            }
                        }

                        @Override
                        public void visitEnd() {
                            if (objcProtocolSourceName == null) {
                                throw new GradleException("Found ObjCProtocolSourceName annotation without a value");
                            }
                        }
                    };
                } else if ("Lorg/moe/natj/general/ann/Generated;".equals(desc)) {
                    isGenerated = true;
                } else if ("Lorg/moe/natj/general/ann/Library;".equals(desc)) {
                    return new AnnotationVisitor(api) {
                        @Override
                        public void visit(String name, Object value) {
                            if ("value".equals(name)) {
                                library = (String)value;
                            }
                        }

                        @Override
                        public void visitEnd() {
                            if (library == null) {
                                throw new GradleException("Found Library annotation without value");
                            }
                        }
                    };
                }
                return null;
            }

            @Override
            public void visitEnd() {
                if (consumer != null) {
                    consumer.accept((T)NatJClass.this);
                }
            }
        };
    }
}
