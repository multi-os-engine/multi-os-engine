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

import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.MethodVisitor;

import java.util.function.Consumer;

/**
 * Class representing a Java method.
 */
public class NatJMethod {

    /**
     * Java name of the method.
     */
    @NotNull private final String name;

    /**
     * Java method descriptor.
     */
    @NotNull private final String desc;

    /**
     * Java method static attribute.
     */
    private final boolean isStatic;

    /**
     * Optional Objective-C selector.
     */
    @Nullable private String sel;

    /**
     * Flag for existence of @IBAction annotation.
     */
    private boolean isIBAction;

    /**
     * Flag for existence of @IBOutlet annotation.
     */
    private boolean isIBOutlet;

    /**
     * Flag for existence of @IBOutletCollection annotation.
     */
    private boolean isIBOutletCollection;

    /**
     * Flag for existence of @Property annotation.
     */
    private boolean isProperty;

    /**
     * Flag for existence of @Generated annotation.
     */
    private boolean isGenerated;

    /**
     * Flag for existence of @IsOptional annotation.
     */
    private boolean isOptional;

    /**
     * Flag for existence of @CFunction annotation.
     */
    private boolean isCFunction;

    /**
     * Flag for existence of @CVariable annotation.
     */
    private boolean isCVariable;

    /**
     * Flag for existence of @Variadic annotation.
     */
    private boolean isVariadic;

    public NatJMethod(@NotNull String name, @NotNull String desc, boolean isStatic) {
        this.name = name;
        this.desc = desc;
        this.isStatic = isStatic;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getDesc() {
        return desc;
    }

    public boolean hasSel() {
        return sel != null;
    }

    @Nullable
    public String getSel() {
        return sel;
    }

    public void setSel(@Nullable String sel) {
        this.sel = sel;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public boolean isIBAction() {
        return isIBAction;
    }

    public boolean isIBOutlet() {
        return isIBOutlet;
    }

    public boolean isIBOutletCollection() {
        return isIBOutletCollection;
    }

    public boolean isProperty() {
        return isProperty;
    }

    public boolean isGenerated() {
        return isGenerated;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public boolean isCFunction() {
        return isCFunction;
    }

    public boolean isCVariable() {
        return isCVariable;
    }

    public boolean isVariadic() {
        return isVariadic;
    }

    /**
     * Returns a MethodVisitor used to initialize this object.
     *
     * @param api ASM API version
     * @param consumer Consumer to invoke post-initialization.
     * @return MethodVisitor instance
     */
    public MethodVisitor getInitializingVisitor(int api, Consumer<NatJMethod> consumer) {
        return new MethodVisitor(api) {
            @Override
            public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
                if ("Lorg/moe/natj/general/ann/ByValue;".equals(desc)) {
                    // Ignore
                } else if ("Lorg/moe/natj/general/ann/Generated;".equals(desc)) {
                    isGenerated = true;
                    // } else if ("Lorg/moe/natj/general/ann/MappedReturn;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/general/ann/NFloat;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/general/ann/NInt;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/general/ann/NUInt;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/general/ann/Owned;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/general/ann/ReferenceInfo;".equals(desc)) {
                    //     // Ignore
                } else if ("Lorg/moe/natj/c/ann/CFunction;".equals(desc)) {
                    isCFunction = true;
                } else if ("Lorg/moe/natj/c/ann/CVariable;".equals(desc)) {
                    isCVariable = true;
                    // } else if ("Lorg/moe/natj/c/ann/FunctionPtr;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/c/ann/Inline;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/c/ann/StructureField;".equals(desc)) {
                    //     // Ignore
                } else if ("Lorg/moe/natj/c/ann/Variadic;".equals(desc)) {
                    isVariadic = true;
                } else if ("Lorg/moe/natj/objc/ann/IBAction;".equals(desc)) {
                    isIBAction = true;
                } else if ("Lorg/moe/natj/objc/ann/IBOutlet;".equals(desc)) {
                    isIBOutlet = true;
                } else if ("Lorg/moe/natj/objc/ann/IBOutletCollection;".equals(desc)) {
                    isIBOutletCollection = true;
                } else if ("Lorg/moe/natj/objc/ann/IsOptional;".equals(desc)) {
                    isOptional = true;
                } else if ("Lorg/moe/natj/objc/ann/Property;".equals(desc)) {
                    isProperty = true;
                    // } else if ("Lorg/moe/natj/objc/ann/ProtocolClassMethod;".equals(desc)) {
                    //     // Ignore
                    // } else if ("Lorg/moe/natj/objc/ann/ObjCBlock;".equals(desc)) {
                    //     // Ignore
                } else if ("Lorg/moe/natj/objc/ann/Selector;".equals(desc)) {
                    return new AnnotationVisitor(api) {
                        @Override
                        public void visit(String name, Object value) {
                            if ("value".equals(name)) {
                                sel = (String)value;
                            }
                        }
                    };
                }
                return null;
            }

            @Override
            public void visitEnd() {
                if (consumer != null) {
                    consumer.accept(NatJMethod.this);
                }
            }
        };
    }

    @Override
    public String toString() {
        return name + desc;
    }
}
