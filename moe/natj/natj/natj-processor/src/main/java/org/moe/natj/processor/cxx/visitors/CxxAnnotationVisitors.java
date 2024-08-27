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

import org.moe.natj.processor.cxx.CxxSupport;
import org.moe.natj.processor.cxx.decl.invokable.MethodVirtuality;
import org.moe.natj.processor.cxx.decl.invokable.OperatorKind;
import org.objectweb.asm.AnnotationVisitor;

import java.util.ArrayList;
import java.util.Collections;

import static org.objectweb.asm.Opcodes.ASM5;

/**
 * Utility class for implementing annotation visitors.
 */
public class CxxAnnotationVisitors {
    /**
     * Disabled public constructor.
     */
    private CxxAnnotationVisitors() {
    }

    /**
     * CxxFunction visitor interface.
     */
    public interface ICxxFunctionVisitor {
        /**
         * Visitor method.
         *
         * @param value Optional C++ function name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxFunction annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxFunction(AnnotationVisitor annotationVisitor, ICxxFunctionVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Optional C++ function name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxMethod visitor interface.
     */
    public interface ICxxMethodVisitor {
        /**
         * Visitor method.
         *
         * @param value      Optional C++ method name
         * @param virtuality Method virtuality
         * @param isConst    Method const qualifier
         */
        void visitValueAndVirtuality(String value, MethodVirtuality virtuality, boolean isConst);
    }

    /**
     * Visits a CxxMethod annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxMethod(AnnotationVisitor annotationVisitor, ICxxMethodVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Optional C++ method name.
             */
            private String value;

            /**
             * Method virtuality.
             */
            private MethodVirtuality virtuality = MethodVirtuality.NON_VIRTUAL;

            /**
             * Method const qualifier.
             */
            private boolean isConst = false;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                } else if ("isConst".equals(name)) {
                    isConst = (Boolean) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnum(String name, String desc, String value) {
                if ("virtuality".equals(name)
                        && CxxSupport.CXX_METHOD_VIRTUALITY_ENUM.getDescriptor().equals(desc)) {
                    virtuality = MethodVirtuality.valueOf(value);
                }
                super.visitEnum(name, desc, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValueAndVirtuality(value, virtuality, isConst);
            }
        };
    }

    /**
     * CxxFieldGetter visitor interface.
     */
    public interface ICxxFieldGetterVisitor {
        /**
         * Visitor method.
         *
         * @param value Optional C++ field name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxFieldGetter annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxFieldGetter(AnnotationVisitor annotationVisitor, ICxxFieldGetterVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Optional C++ field name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxFieldSetter visitor interface.
     */
    public interface ICxxFieldSetterVisitor {
        /**
         * Visitor method.
         *
         * @param value      Optional C++ field name
         * @param isMutating Mutating qualifier
         */
        void visitValue(String value, boolean isMutating);
    }

    /**
     * Visits a CxxFieldSetter annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxFieldSetter(AnnotationVisitor annotationVisitor, ICxxFieldSetterVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Optional C++ field name.
             */
            private String value;

            /**
             * Mutating qualifier.
             */
            private boolean isMutating = false;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                } else if ("isMutable".equals(name)) {
                    isMutating = (Boolean) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value, isMutating);
            }
        };
    }

    /**
     * CxxOperator visitor interface.
     */
    public interface ICxxOperatorVisitor {
        /**
         * Visitor method.
         *
         * @param value      Operator kind
         * @param virtuality Operator method virtuality
         * @param isConst    Operator method const qualifier
         */
        void visitValueAndVirtuality(OperatorKind value, MethodVirtuality virtuality, boolean isConst);
    }

    /**
     * Visits a CxxOperator annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxOperator(AnnotationVisitor annotationVisitor, ICxxOperatorVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Operator kind.
             */
            private OperatorKind value;

            /**
             * Operator method virtuality.
             */
            private MethodVirtuality virtuality = MethodVirtuality.NON_VIRTUAL;

            /**
             * Operator method const qualifier.
             */
            private boolean isConst = false;

            @Override
            public void visit(String name, Object value) {
                if ("isConst".equals(name)) {
                    isConst = (Boolean) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnum(String name, String desc, String value) {
                if ("value".equals(name)
                        && CxxSupport.CXX_OPERATOR_KIND_ENUM.getDescriptor().equals(desc)) {
                    this.value = OperatorKind.valueOf(value);
                } else if ("virtuality".equals(name)
                        && CxxSupport.CXX_METHOD_VIRTUALITY_ENUM.getDescriptor().equals(desc)) {
                    virtuality = MethodVirtuality.valueOf(value);
                }
                super.visitEnum(name, desc, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                if (value == null) {
                    throw new RuntimeException("Operator kind is not set");
                }
                visitor.visitValueAndVirtuality(value, virtuality, isConst);
            }
        };
    }

    /**
     * CxxCastOperator visitor interface.
     */
    public interface ICxxCastOperatorVisitor {
        /**
         * Visitor method.
         *
         * @param virtuality Operator method virtuality
         * @param isConst    Operator method const qualifier
         */
        void visitVirtuality(MethodVirtuality virtuality, boolean isConst);
    }

    /**
     * Visits a CxxCastOperator annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxCastOperator(AnnotationVisitor annotationVisitor, ICxxCastOperatorVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Operator method virtuality.
             */
            private MethodVirtuality virtuality = MethodVirtuality.NON_VIRTUAL;

            /**
             * Operator method const qualifier.
             */
            private boolean isConst = false;

            @Override
            public void visit(String name, Object value) {
                if ("isConst".equals(name)) {
                    isConst = (Boolean) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnum(String name, String desc, String value) {
                if ("virtuality".equals(name)
                        && CxxSupport.CXX_METHOD_VIRTUALITY_ENUM.getDescriptor().equals(desc)) {
                    virtuality = MethodVirtuality.valueOf(value);
                }
                super.visitEnum(name, desc, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitVirtuality(virtuality, isConst);
            }
        };
    }

    /**
     * CxxGlobalGetter visitor interface.
     */
    public interface ICxxGlobalGetterVisitor {
        /**
         * Visitor method.
         *
         * @param value Optional C++ field name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxGlobalGetter annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxGlobalGetter(AnnotationVisitor annotationVisitor, ICxxGlobalGetterVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Optional C++ field name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxGlobalSetter visitor interface.
     */
    public interface ICxxGlobalSetterVisitor {
        /**
         * Visitor method.
         *
         * @param value Optional C++ field name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxGlobalSetter annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxGlobalSetter(AnnotationVisitor annotationVisitor, ICxxGlobalSetterVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Optional C++ field name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxOperatorFunction visitor interface.
     */
    public interface ICxxOperatorFunctionVisitor {
        /**
         * Visitor method.
         *
         * @param value Operator kind
         */
        void visitValue(OperatorKind value);
    }

    /**
     * Visits a CxxOperatorFunction annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxOperatorFunction(AnnotationVisitor annotationVisitor, ICxxOperatorFunctionVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Operator kind.
             */
            private OperatorKind value;

            @Override
            public void visitEnum(String name, String desc, String value) {
                if ("value".equals(name)
                        && CxxSupport.CXX_OPERATOR_KIND_ENUM.getDescriptor().equals(desc)) {
                    this.value = OperatorKind.valueOf(value);
                }
                super.visitEnum(name, desc, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                if (value == null) {
                    throw new RuntimeException("Operator kind is not set");
                }
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxHeader visitor interface.
     */
    public interface ICxxHeaderVisitor {
        /**
         * Visitor method.
         *
         * @param values    Native header file paths
         * @param useQuotes Use quotes instead of angled brackets
         */
        void visitValue(ArrayList<String> values, boolean useQuotes);
    }

    /**
     * Visits a CxxHeader annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxHeader(AnnotationVisitor annotationVisitor, ICxxHeaderVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * Use quotes instead of angled brackets.
             */
            private boolean useQuotes = true;

            /**
             * Native header file paths.
             */
            private final ArrayList<String> headers = new ArrayList<>();

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    String[] strings = (String[]) value;
                    Collections.addAll(headers, strings);
                } else if ("useQuotes".equals(name)) {
                    useQuotes = (Boolean) value;
                } else {
                    throw new RuntimeException("unexpected annotation name");
                }
                super.visit(name, value);
            }

            @Override
            public AnnotationVisitor visitArray(String name) {
                if ("value".equals(name)) {
                    return new AnnotationVisitor(ASM5, super.visitArray(name)) {
                        @Override
                        public void visit(String name, Object value) {
                            headers.add((String) value);
                            super.visit(name, value);
                        }
                    };
                } else {
                    throw new RuntimeException("unexpected annotation name");
                }
            }

            @Override
            public void visitEnd() {
                visitor.visitValue(headers, useQuotes);
                super.visitEnd();
            }
        };
    }

    /**
     * Visits a CxxHeaders annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxHeaders(AnnotationVisitor annotationVisitor, ICxxHeaderVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            @Override
            public AnnotationVisitor visitArray(String name) {
                if (!"value".equals(name)) {
                    return super.visitArray(name);
                }

                return new AnnotationVisitor(ASM5, super.visitArray(name)) {
                    @Override
                    public AnnotationVisitor visitAnnotation(String name, String desc) {
                        final AnnotationVisitor superAnnVisitor = super.visitAnnotation(name, desc);
                        if (CxxSupport.CXX_HEADER_ANN.getDescriptor().equals(desc)) {
                            return CxxAnnotationVisitors.CxxHeader(superAnnVisitor, visitor);
                        }
                        return superAnnVisitor;
                    }
                };
            }
        };
    }

    /**
     * CxxConstructor visitor interface.
     */
    public interface ICxxConstructorVisitor {
        /**
         * Visitor method.
         */
        void visitValue();
    }

    /**
     * Visits a CxxConstructor annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxConstructor(AnnotationVisitor annotationVisitor, ICxxConstructorVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue();
            }
        };
    }

    /**
     * CxxClass visitor interface.
     */
    public interface ICxxClassVisitor {
        /**
         * Visitor method.
         *
         * @param value C++ class name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxClass annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxClass(AnnotationVisitor annotationVisitor, ICxxClassVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * C++ class name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxInheritedClass visitor interface.
     */
    public interface ICxxInheritedClassVisitor {
        /**
         * Visitor method.
         *
         * @param value C++ class name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxInheritedClass annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxInheritedClass(AnnotationVisitor annotationVisitor, ICxxInheritedClassVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * C++ class name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }

    /**
     * CxxTemplate visitor interface.
     */
    public interface ICxxTemplateVisitor {
        /**
         * Visitor method.
         *
         * @param value C++ specialized template class name
         */
        void visitValue(String value);
    }

    /**
     * Visits a CxxTemplate annotation.
     *
     * @param annotationVisitor next visitor
     * @param visitor           annotation visitor
     * @return new visitor
     */
    public static AnnotationVisitor CxxTemplate(AnnotationVisitor annotationVisitor, ICxxTemplateVisitor visitor) {
        if (visitor == null) {
            throw new NullPointerException();
        }
        return new AnnotationVisitor(ASM5, annotationVisitor) {
            /**
             * C++ specialized template class name.
             */
            private String value;

            @Override
            public void visit(String name, Object value) {
                if ("value".equals(name)) {
                    this.value = (String) value;
                }
                super.visit(name, value);
            }

            @Override
            public void visitEnd() {
                super.visitEnd();
                visitor.visitValue(value);
            }
        };
    }
}
