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

package org.moe.gradle.internal;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Require;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.io.InputStream;

public class RegisterOnStartupChecker {

    private static final String ANN_REGISTER_ON_STARTUP = "Lorg/moe/natj/general/ann/RegisterOnStartup;";
    private static final String ANN_OBJC_CLASS_BINDING = "Lorg/moe/natj/objc/ann/ObjCClassBinding;";
    private static final String ANN_OBJC_CLASS_NAME = "Lorg/moe/natj/objc/ann/ObjCClassName;";

    /**
     * Returns a RegisterOnStartupChecker for the specified input stream.
     *
     * @param inputStream input stream
     * @return RegisterOnStartupChecker
     */
    public static RegisterOnStartupChecker getRegisterOnStartupChecker(InputStream inputStream) {
        RegisterOnStartupChecker checker = new RegisterOnStartupChecker(inputStream);
        checker.check();
        return checker;
    }

    /**
     * Input stream containing class data.
     */
    @NotNull
    private final InputStream inputStream;

    /**
     * Name of the java class.
     */
    @Nullable
    private String javaClassName;

    /**
     * The corresponding ObjC class name, if this is a hybrid ObjC class.
     */
    @Nullable
    private String objCClassName;

    /**
     * Boolean indicating the search result.
     */
    private boolean isRegisterOnStartup;

    /**
     * Creates a new RegisterOnStartupChecker for the specified steam.
     *
     * @param inputStream    input stream to check
     */
    private RegisterOnStartupChecker(InputStream inputStream) {
        this.inputStream = Require.nonNull(inputStream);
    }

    /**
     * Returns the Java class' name.
     *
     * @return class' name
     */
    @NotNull
    public String getJavaClassName() {
        return Require.nonNull(javaClassName);
    }

    /**
     * Returns the ObjC class' name
     *
     * @return class' name
     */
    @Nullable
    public String getObjCClassName() {
        return objCClassName;
    }

    /**
     * Returns the result of the search.
     *
     * @return true if the class should be registered on startup, otherwise false
     */
    public boolean isRegisterOnStartup() {
        return isRegisterOnStartup;
    }

    /**
     * Checks for the RegisterOnStartup annotation.
     */
    private void check() {
        ClassReader reader;
        try {
            reader = new ClassReader(inputStream);
        } catch (IOException e) {
            throw new GradleException("Failed to create ClassReader", e);
        }
        reader.accept(new ClassVisitor(Opcodes.ASM5) {

            private boolean isObjCBinding = false;
            private String objCClassName = null;

            @Override
            public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
                AnnotationVisitor av = super.visitAnnotation(desc, visible);
                switch (desc) {
                    case ANN_REGISTER_ON_STARTUP:
                        RegisterOnStartupChecker.this.isRegisterOnStartup = true;
                        break;
                    case ANN_OBJC_CLASS_BINDING:
                        isObjCBinding = true;
                        break;
                    case ANN_OBJC_CLASS_NAME:
                        av = new AnnotationVisitor(Opcodes.ASM5, av) {
                            @Override
                            public void visit(String name, Object value) {
                                if ("value".equals(name)) {
                                    objCClassName = (String) Require.nonNull(value);
                                }
                                super.visit(name, value);
                            }
                        };
                        break;
                }
                return av;
            }

            @Override
            public void visit(int version, int access, String name, String signature,
                              String superName, String[] interfaces) {
                RegisterOnStartupChecker.this.javaClassName = Require.nonNull(name);
                super.visit(version, access, name, signature, superName, interfaces);
            }

            @Override
            public void visitEnd() {
                if (isRegisterOnStartup && !isObjCBinding) {
                    if (objCClassName == null) {
                        objCClassName = getJavaClassName().replace('/', '.');
                    }
                    RegisterOnStartupChecker.this.objCClassName = objCClassName;
                }
                super.visitEnd();
            }

            public void visitNestHost(String nestHost) {
                // Do nothing
                // Fix error "NestHost requires ASM7" without the need of updating to ASM7
            }

            public void visitNestMember(String nestMember) {
                // Do nothing
                // Fix error "NestMember requires ASM7" without the need of updating to ASM7
            }
        }, 0);
    }
}
