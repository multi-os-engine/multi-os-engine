package org.moe.gradle.internal;

import org.junit.Test;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class RegisterOnStartupCheckerTest {

    private static final String REGISTER_ON_STARTUP =
        "Lorg/moe/natj/general/ann/RegisterOnStartup;";
    private static final String OBJC_CLASS_BINDING =
        "Lorg/moe/natj/objc/ann/ObjCClassBinding;";
    private static final String OBJC_CLASS_NAME =
        "Lorg/moe/natj/objc/ann/ObjCClassName;";

    @Test
    public void bareClass_isNeitherStartupNorBinding() {
        ClassWriter cw = newClass("com/example/MyJava");
        cw.visitEnd();

        RegisterOnStartupChecker checker = check(cw);

        assertFalse(checker.isRegisterOnStartup());
        assertFalse(checker.isObjCClassBinding());
        assertNull(checker.getObjCBindingClassName());
        assertNull(checker.getObjCClassName());
    }

    @Test
    public void objCClassBinding_withExplicitObjCClassName() {
        ClassWriter cw = newClass("com/example/MyJava");
        cw.visitAnnotation(OBJC_CLASS_BINDING, true).visitEnd();
        AnnotationVisitor name = cw.visitAnnotation(OBJC_CLASS_NAME, true);
        name.visit("value", "MyObjCName");
        name.visitEnd();
        cw.visitEnd();

        RegisterOnStartupChecker checker = check(cw);

        assertTrue(checker.isObjCClassBinding());
        assertEquals("MyObjCName", checker.getObjCBindingClassName());
    }

    @Test
    public void objCClassBinding_withoutObjCClassName_fallsBackToSimpleName() {
        ClassWriter cw = newClass("com/example/MyJava");
        cw.visitAnnotation(OBJC_CLASS_BINDING, true).visitEnd();
        cw.visitEnd();

        RegisterOnStartupChecker checker = check(cw);

        assertTrue(checker.isObjCClassBinding());
        assertEquals("MyJava", checker.getObjCBindingClassName());
    }

    @Test
    public void registerOnStartup_setsHybridName_butLeavesBindingNameNull() {
        ClassWriter cw = newClass("com/example/MyJava");
        cw.visitAnnotation(REGISTER_ON_STARTUP, true).visitEnd();
        cw.visitEnd();

        RegisterOnStartupChecker checker = check(cw);

        assertTrue(checker.isRegisterOnStartup());
        assertEquals("com.example.MyJava", checker.getObjCClassName());
        assertFalse(checker.isObjCClassBinding());
        assertNull(checker.getObjCBindingClassName());
    }

    private static ClassWriter newClass(String internalName) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, internalName, null,
            "java/lang/Object", null);
        return cw;
    }

    private static RegisterOnStartupChecker check(ClassWriter cw) {
        return RegisterOnStartupChecker.getRegisterOnStartupChecker(
            new ByteArrayInputStream(cw.toByteArray()));
    }
}
