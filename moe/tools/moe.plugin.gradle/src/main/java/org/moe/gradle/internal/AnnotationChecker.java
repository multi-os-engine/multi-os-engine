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

public class AnnotationChecker {
    /**
     * Returns a RegisterOnStartup AnnotationChecker for the specified input stream.
     *
     * @param inputStream input stream
     * @return AnnotationChecker
     */
    public static AnnotationChecker getRegisterOnStartupChecker(InputStream inputStream) {
        AnnotationChecker checker = new AnnotationChecker(inputStream, "Lorg/moe/natj/general/ann/RegisterOnStartup;");
        checker.check();
        return checker;
    }

    /**
     * Input stream containing class data.
     */
    @NotNull
    private final InputStream inputStream;

    /**
     * The name of the search annotation.
     */
    @NotNull
    private final String annotationName;

    /**
     * Name of the class.
     */
    @Nullable
    private String name;

    /**
     * Boolean indicating the search result.
     */
    private boolean hasAnnotation;

    /**
     * Creates a new AnnotationChecker for the specified steam and annotation.
     *
     * @param inputStream    input stream to check
     * @param annotationName annotation to search for
     */
    private AnnotationChecker(InputStream inputStream, String annotationName) {
        this.inputStream = Require.nonNull(inputStream);
        this.annotationName = Require.nonNull(annotationName);
    }

    /**
     * Returns the class' name.
     *
     * @return class' name
     */
    @NotNull
    public String getName() {
        return Require.nonNull(name);
    }

    /**
     * Returns the result of the search.
     *
     * @return true if the class contains the annotation, otherwise false
     */
    public boolean hasAnnotation() {
        return hasAnnotation;
    }

    /**
     * Checks for the specified annotation.
     */
    private void check() {
        ClassReader reader;
        try {
            reader = new ClassReader(inputStream);
        } catch (IOException e) {
            throw new GradleException("Failed to create ClassReader", e);
        }
        reader.accept(new ClassVisitor(Opcodes.ASM5) {
            @Override
            public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
                if (AnnotationChecker.this.annotationName.equals(desc)) {
                    AnnotationChecker.this.hasAnnotation = true;
                }
                return super.visitAnnotation(desc, visible);
            }

            @Override
            public void visit(int version, int access, String name, String signature,
                              String superName, String[] interfaces) {
                AnnotationChecker.this.name = Require.nonNull(name);
                super.visit(version, access, name, signature, superName, interfaces);
            }
        }, 0);
    }
}
