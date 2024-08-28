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

package org.moe.natjgen.test;

import junit.framework.TestCase;
import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.junit.Assume;
import org.moe.natjgen.Constants;
import org.moe.natjgen.UnitEditContext;
import org.moe.natjgen.helper.MOEICompilationUnit;
import org.moe.natjgen.test.helpers.ClassVal;
import org.moe.natjgen.test.sources.NatJGenTest;

import java.io.File;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("rawtypes")
public abstract class AbstractNatJGenTest extends TestCase {

    private TypeDeclaration classDecl;
    private File sourceFile;

    private static final HashMap<File, TypeDeclaration> DECL_CACHE = new HashMap<File, TypeDeclaration>();

    protected void optionalIgnore() {
    }

    public static TypeDeclaration getClassFromSource(File sourceFile, String packageRoot, String path, String clsName) {
        TypeDeclaration classDecl = DECL_CACHE.get(sourceFile);
        if (classDecl != null) {
            return classDecl;
        }

        MOEICompilationUnit unit;
        try {
            unit = UnitEditContext.getFileCompilationUnit(sourceFile.getAbsolutePath(), "UTF-8");
        } catch (CoreException e) {
            e.printStackTrace();
            fail();
            return null;
        }
        assertNotNull(unit);

        // Build AST for the compilation unit
        ASTParser parser = ASTParser.newParser(AST.JLS8);
        parser.setSource(unit.getSource().toCharArray());
        CompilationUnit astRoot = (CompilationUnit)parser.createAST(null);

        // Get class declaration
        for (Object object : astRoot.types()) {
            AbstractTypeDeclaration decl = (AbstractTypeDeclaration)object;
            if (decl instanceof TypeDeclaration && decl.getName().getIdentifier().equals(clsName)) {
                DECL_CACHE.put(sourceFile, (TypeDeclaration)decl);
                return (TypeDeclaration)decl;
            }
        }
        return null;
    }

    @Override
    protected void setUp() throws Exception {
        throw new UnsupportedOperationException();
    }

    protected final void setUpClass(String packageRoot, String path, String clsName) {
        NatJGenTest.prepare();

        // Optionally ignore tests
        optionalIgnore();

        // Load class
        assertNotNull(clsName);
        sourceFile = NatJGenTest.getSourceFile(packageRoot, path);
        classDecl = getClassFromSource(sourceFile, packageRoot, path, clsName);
        assertNotNull(classDecl);
    }

    public void test_ClassExistance() {
        assertNotNull(sourceFile);
        assertNotNull("Class declaration in file " + sourceFile.getAbsolutePath() + " was not found", classDecl);
    }

    protected final TypeDeclaration getClassDecl() {
        return classDecl;
    }

    protected static MethodDeclaration getStaticMethod(TypeDeclaration classDecl, String name) {
        for (Object object : classDecl.bodyDeclarations()) {
            if (object instanceof MethodDeclaration) {
                MethodDeclaration m = (MethodDeclaration)object;
                if (!hasModifier(m, Modifier.STATIC)) {
                    continue;
                }
                if (!m.getName().getIdentifier().equals(name)) {
                    continue;
                }
                return m;
            }
        }
        return null;
    }

    protected MethodDeclaration getStaticMethod(String name) {
        return getStaticMethod(classDecl, name);
    }

    protected static MethodDeclaration getMethod(TypeDeclaration classDecl, String name) {
        for (Object object : classDecl.bodyDeclarations()) {
            if (object instanceof MethodDeclaration) {
                MethodDeclaration m = (MethodDeclaration)object;
                if (hasModifier(m, Modifier.STATIC)) {
                    continue;
                }
                if (!m.getName().getIdentifier().equals(name)) {
                    continue;
                }
                return m;
            }
        }
        return null;
    }

    protected MethodDeclaration getMethod(String name) {
        return getMethod(classDecl, name);
    }

    protected static FieldDeclaration getField(String name, TypeDeclaration classDecl) {
        for (Object object : classDecl.bodyDeclarations()) {
            if (object instanceof FieldDeclaration) {
                FieldDeclaration m = (FieldDeclaration)object;
                for (Object vardecls : m.fragments()) {
                    if (!(vardecls instanceof VariableDeclarationFragment)) {
                        continue;
                    }
                    VariableDeclarationFragment vdf = (VariableDeclarationFragment)vardecls;
                    if (!vdf.getName().getIdentifier().equals(name)) {
                        continue;
                    }
                    return m;
                }
            }
        }
        return null;
    }

    protected FieldDeclaration getField(String name) {
        TypeDeclaration classDecl = getClassDecl();
        return getField(name, classDecl);
    }

    protected static TypeDeclaration getInnerClass(String name, TypeDeclaration classDecl) {
        for (Object object : classDecl.bodyDeclarations()) {
            if (object instanceof TypeDeclaration) {
                TypeDeclaration m = (TypeDeclaration)object;
                if (m.getName().getIdentifier().equals(name)) {
                    return m;
                }
            }
        }
        return null;
    }

    protected TypeDeclaration getInnerClass(String name) {
        TypeDeclaration classDecl = getClassDecl();
        return getInnerClass(name, classDecl);
    }

    protected static boolean hasModifier(List modifier, int modFlag) {
        assertNotNull(modifier);
        for (Object object : modifier) {
            if (object instanceof Modifier) {
                Modifier mod = (Modifier)object;
                if ((mod.getKeyword().toFlagValue() & modFlag) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    protected static boolean hasModifier(MethodDeclaration decl, int modFlag) {
        assertNotNull(decl);
        return hasModifier(decl.modifiers(), modFlag);
    }

    protected static boolean hasModifier(FieldDeclaration decl, int modFlag) {
        assertNotNull(decl);
        return hasModifier(decl.modifiers(), modFlag);
    }

    protected static boolean hasModifier(TypeDeclaration decl, int modFlag) {
        assertNotNull(decl);
        return hasModifier(decl.modifiers(), modFlag);
    }

    protected static void assertIsInterface(TypeDeclaration classDecl) {
        assertTrue("Expected interface", classDecl.isInterface());
    }

    protected static void assertHasModifier(MethodDeclaration decl, int modFlag) {
        assertTrue("Expected modifier " + getModifierName(modFlag), hasModifier(decl, modFlag));
    }

    protected static void assertHasModifier(FieldDeclaration decl, int modFlag) {
        assertTrue("Expected modifier " + getModifierName(modFlag), hasModifier(decl, modFlag));
    }

    protected static void assertHasModifier(TypeDeclaration decl, int modFlag) {
        assertTrue("Expected modifier " + getModifierName(modFlag), hasModifier(decl, modFlag));
    }

    private static String getModifierName(int modFlag) {
        return ModifierKeyword.fromFlagValue(modFlag).toString();
    }

    protected static Annotation getAnnotation(List modifiers, String annFQName) {
        if (annFQName == null || annFQName.indexOf('.') == -1) {
            throw new IllegalArgumentException();
        }
        String annName = annFQName.substring(annFQName.lastIndexOf('.') + 1);
        for (Object modifier : modifiers) {
            if (modifier instanceof Annotation) {
                Annotation annotation = (Annotation)modifier;
                if (annName.equals(annotation.getTypeName().getFullyQualifiedName())) {
                    return annotation;
                }
            }
        }
        return null;
    }

    protected static Annotation getAnnotation(MethodDeclaration decl, String annFQName) {
        return getAnnotation(decl.modifiers(), annFQName);
    }

    protected static Annotation getAnnotation(SingleVariableDeclaration decl, String annFQName) {
        return getAnnotation(decl.modifiers(), annFQName);
    }

    protected static void assertHasNoAnnotation(List modifiers, String annFQName) {
        Annotation annotation = getAnnotation(modifiers, annFQName);
        if (annotation != null) {
            fail("Annotation '" + annFQName + "' was found");
        }
    }

    protected static void assertHasNoAnnotation(MethodDeclaration decl, String annFQName) {
        assertHasNoAnnotation(decl.modifiers(), annFQName);
    }

    protected static void assertHasNoAnnotation(SingleVariableDeclaration decl, String annFQName) {
        assertHasNoAnnotation(decl.modifiers(), annFQName);
    }

    protected static Annotation assertHasAnnotation(List modifiers, String annFQName) {
        Annotation annotation = getAnnotation(modifiers, annFQName);
        if (annotation == null) {
            fail("Annotation '" + annFQName + "' was not found");
        }
        return annotation;
    }

    protected static Annotation assertHasAnnotation(MethodDeclaration decl, String annFQName) {
        return assertHasAnnotation(decl.modifiers(), annFQName);
    }

    protected static Annotation assertHasAnnotation(SingleVariableDeclaration decl, String annFQName) {
        return assertHasAnnotation(decl.modifiers(), annFQName);
    }

    protected static MarkerAnnotation assertHasMarkerAnnotation(List modifiers, String annFQName) {
        Annotation annotation = getAnnotation(modifiers, annFQName);
        if (annotation == null || !(annotation instanceof MarkerAnnotation)) {
            fail("MarkerAnnotation '" + annFQName + "' was not found");
        }
        return (MarkerAnnotation)annotation;
    }

    protected static MarkerAnnotation assertHasMarkerAnnotation(MethodDeclaration decl, String annFQName) {
        return assertHasMarkerAnnotation(decl.modifiers(), annFQName);
    }

    protected static MarkerAnnotation assertHasMarkerAnnotation(FieldDeclaration decl, String annFQName) {
        return assertHasMarkerAnnotation(decl.modifiers(), annFQName);
    }

    protected static MarkerAnnotation assertHasMarkerAnnotation(TypeDeclaration decl, String annFQName) {
        return assertHasMarkerAnnotation(decl.modifiers(), annFQName);
    }

    protected static MarkerAnnotation assertHasMarkerAnnotation(SingleVariableDeclaration decl, String annFQName) {
        return assertHasMarkerAnnotation(decl.modifiers(), annFQName);
    }

    protected static NormalAnnotation assertHasNormalAnnotation(List modifiers, String annFQName) {
        Annotation annotation = getAnnotation(modifiers, annFQName);
        if (annotation == null || !(annotation instanceof NormalAnnotation)) {
            fail("NormalAnnotation '" + annFQName + "' was not found");
        }
        return (NormalAnnotation)annotation;
    }

    protected static NormalAnnotation assertHasNormalAnnotation(MethodDeclaration decl, String annFQName) {
        return assertHasNormalAnnotation(decl.modifiers(), annFQName);
    }

    protected static NormalAnnotation assertHasNormalAnnotation(SingleVariableDeclaration decl, String annFQName) {
        return assertHasNormalAnnotation(decl.modifiers(), annFQName);
    }

    protected static SingleMemberAnnotation assertHasSingleMemberAnnotation(List modifiers, String annFQName) {
        Annotation annotation = getAnnotation(modifiers, annFQName);
        if (annotation == null || !(annotation instanceof SingleMemberAnnotation)) {
            fail("SingleMemberAnnotation '" + annFQName + "' was not found");
        }
        return (SingleMemberAnnotation)annotation;
    }

    protected static SingleMemberAnnotation assertHasSingleMemberAnnotation(MethodDeclaration decl, String annFQName) {
        return assertHasSingleMemberAnnotation(decl.modifiers(), annFQName);
    }

    protected static SingleMemberAnnotation assertHasSingleMemberAnnotation(FieldDeclaration decl, String annFQName) {
        return assertHasSingleMemberAnnotation(decl.modifiers(), annFQName);
    }

    protected static SingleMemberAnnotation assertHasSingleMemberAnnotation(TypeDeclaration decl, String annFQName) {
        return assertHasSingleMemberAnnotation(decl.modifiers(), annFQName);
    }

    protected static SingleMemberAnnotation assertHasSingleMemberAnnotation(SingleVariableDeclaration decl,
            String annFQName) {
        return assertHasSingleMemberAnnotation(decl.modifiers(), annFQName);
    }

    protected static void assertExistsAndGenerated(MethodDeclaration method) {
        assertNotNull(method);
        assertHasMarkerAnnotation(method, Constants.GeneratedAnnotationFQ);
    }

    protected static void assertExistsAndGenerated(FieldDeclaration field) {
        assertNotNull(field);
        assertHasMarkerAnnotation(field, Constants.GeneratedAnnotationFQ);
    }

    protected static void assertExistsAndGenerated(TypeDeclaration decl) {
        assertNotNull(decl);
        assertHasMarkerAnnotation(decl, Constants.GeneratedAnnotationFQ);
    }

    protected static void assertReferenceInfoEquals(NormalAnnotation refInfo, String type, int depth) {
        assertNotNull(refInfo);
        assertNotNull(type);
        assertTrue(depth > 0);
        boolean ftype = false, fdepth = false;
        for (Object object : refInfo.values()) {
            if (ftype && fdepth) {
                return;
            }
            if (object instanceof MemberValuePair) {
                MemberValuePair pair = (MemberValuePair)object;
                String identifier = pair.getName().getIdentifier();
                if (identifier.equals("type")) {
                    assertEquals(type + ".class", pair.getValue().toString());
                    ftype = true;
                } else if (identifier.equals("depth")) {
                    assertEquals(Integer.toString(depth), pair.getValue().toString());
                    fdepth = true;
                }
            }
        }
        if (!ftype) {
            fail("Type field was not found");
        }
        if (!fdepth && depth > 1) {
            fail("Depth field was not found");
        }
    }

    protected static SingleVariableDeclaration getArg(MethodDeclaration method, int idx) {
        return (SingleVariableDeclaration)method.parameters().get(idx);
    }

    protected static Type getArgType(MethodDeclaration method, int idx) {
        return getArg(method, idx).getType();
    }

    protected static void assertNumberOfArguments(MethodDeclaration method, int count) {
        assertNumberOfArguments(method, count, false);
    }

    protected static void assertNumberOfArguments(MethodDeclaration method, int count, boolean isVararg) {
        assertNotNull(method);
        assertTrue(count >= 0);
        assertEquals(isVararg, method.isVarargs());
        assertEquals(count, method.parameters().size());
    }

    protected static void assertSimpleType(Type type, String name) {
        assertNotNull(type);
        assertNotNull(name);
        assertTrue("Real type is " + type.getClass().getName(), type.isSimpleType());
        SimpleType simpleType = (SimpleType)type;
        assertEquals(name, simpleType.getName().getFullyQualifiedName());
    }

    protected static void assertParameterizedType(Type type, String name) {
        assertNotNull(type);
        assertNotNull(name);
        assertTrue("Real type is " + type.getClass().getName(), type.isParameterizedType());
        assertEquals(name, type.toString());
    }

    protected static void assertPrimitiveType(Type type, String name) {
        assertNotNull(type);
        assertNotNull(name);
        assertTrue("Real type is " + type.getClass().getName(), type.isPrimitiveType());
        assertEquals(name, type.toString());
    }

    protected static void assertInitialValue(FieldDeclaration field, String value) {
        assertInitialValue(field, value, (PrimitiveType.Code)null);
    }

    protected static void assertInitialValue(FieldDeclaration field, String value, PrimitiveType.Code castCode) {
        assertNotNull(field);
        assertEquals(1, field.fragments().size());
        VariableDeclarationFragment vdf = (VariableDeclarationFragment)field.fragments().get(0);
        assertNotNull(vdf);

        Expression initializer = vdf.getInitializer();
        assertNumberLiteralEquals(initializer, value, castCode);
    }

    protected static void assertInitialValue(FieldDeclaration field, String value64, String value32) {
        assertInitialValue(field, null, value64, null, value32, null);
    }

    protected static void assertInitialValue(FieldDeclaration field, String value64, String value32,
            PrimitiveType.Code cast32) {
        assertInitialValue(field, null, value64, null, value32, cast32);
    }

    protected static void assertInitialValue(FieldDeclaration field, PrimitiveType.Code castTenary, String value64,
            PrimitiveType.Code cast64, String value32, PrimitiveType.Code cast32) {
        assertNotNull(field);
        assertEquals(1, field.fragments().size());
        VariableDeclarationFragment vdf = (VariableDeclarationFragment)field.fragments().get(0);
        assertNotNull(vdf);

        Expression initializer = vdf.getInitializer();
        if (castTenary != null) {
            CastExpression cast = assertInstanceOf(initializer, CastExpression.class);
            PrimitiveType type = assertInstanceOf(cast.getType(), PrimitiveType.class);
            assertEquals(castTenary, type.getPrimitiveTypeCode());
            ParenthesizedExpression parenthesized = assertInstanceOf(cast.getExpression(),
                    ParenthesizedExpression.class);
            assertNotNull(parenthesized.getExpression());
            initializer = parenthesized.getExpression();
        }
        ConditionalExpression condexpr = assertInstanceOf(initializer, ConditionalExpression.class);

        assertEquals(Constants.NatJFQ + ".is64Bit()", condexpr.getExpression().toString());

        assertNumberLiteralEquals(condexpr.getThenExpression(), value64, cast64);
        assertNumberLiteralEquals(condexpr.getElseExpression(), value32, cast32);
    }

    protected static void assertNumberLiteralEquals(Expression expr, String value, PrimitiveType.Code castCode) {
        if (castCode != null) {
            CastExpression cast = assertInstanceOf(expr, CastExpression.class);
            PrimitiveType type = assertInstanceOf(cast.getType(), PrimitiveType.class);
            assertEquals(castCode, type.getPrimitiveTypeCode());

            // Extract expression
            expr = cast.getExpression();
        }

        if (expr instanceof PrefixExpression) {
            PrefixExpression prefix = assertInstanceOf(expr, PrefixExpression.class);
            String op = prefix.getOperator().toString();
            assertTrue(value.startsWith(op));
            value = value.substring(op.length());

            // Extract expression
            expr = prefix.getOperand();
        }

        NumberLiteral literal = assertInstanceOf(expr, NumberLiteral.class);
        assertEquals(value, literal.getToken());
    }

    @SuppressWarnings("unchecked")
    protected static <T> T assertInstanceOf(Object obj, Class<T> T) {
        assertNotNull(obj);
        assertNotNull(T);
        assertTrue("expected " + T.getSimpleName() + " instead of " + obj.getClass().getSimpleName(),
                T.isAssignableFrom(obj.getClass()));
        return (T)obj;
    }

    @SuppressWarnings("unchecked")
    protected static void assertNormalAnnotationHasValue(NormalAnnotation annotation, String field, Object value) {
        assertNotNull(annotation);
        assertNotNull(field);
        for (MemberValuePair mvp : (List<MemberValuePair>)annotation.values()) {
            if (field.equals(mvp.getName().getIdentifier())) {
                assertExpressionEqualsValue(mvp.getValue(), value);
            }
        }
    }

    protected static void assertSingleMemberAnnotationHasValue(SingleMemberAnnotation annotation, Object value) {
        assertNotNull(annotation);
        assertExpressionEqualsValue(annotation.getValue(), value);
    }

    protected static void assertExpressionEqualsValue(Expression expr, Object value) {
        if (value == null) {
            assertEquals(NullLiteral.class, expr.getClass());
        } else if (value instanceof Integer) {
            int v = ((Integer)value).intValue();
            if (v < 0) {
                expr = assertInstanceOf(expr, PrefixExpression.class).getOperand();
                assertNotNull(expr);
                v = Math.abs(v);
            }
            NumberLiteral literal = assertInstanceOf(expr, NumberLiteral.class);
            assertEquals(Integer.toString(v), literal.getToken());
        } else if (value instanceof Boolean) {
            boolean v = ((Boolean)value).booleanValue();
            BooleanLiteral literal = assertInstanceOf(expr, BooleanLiteral.class);
            assertEquals(v, literal.booleanValue());
        } else if (value instanceof String) {
            StringLiteral literal = assertInstanceOf(expr, StringLiteral.class);
            assertEquals("\"" + value + "\"", StringEscapeUtils.unescapeJava(literal.getEscapedValue()));
        } else if (value instanceof ClassVal) {
            ClassVal clazz = (ClassVal)value;
            assertNotNull(clazz);
            assertNotNull(clazz.get());
            TypeLiteral literal = assertInstanceOf(expr, TypeLiteral.class);
            assertSimpleType(literal.getType(), clazz.get());
        } else {
            fail("Unimplemented value evaluation");
        }
    }

    private static void assumeHasControlMethod(String control) {
        File sourceFile = NatJGenTest.getSourceFile(null, "c/Globals.java");
        TypeDeclaration classDecl = getClassFromSource(sourceFile, null, "c/Globals.java", "Globals");
        MethodDeclaration method = getStaticMethod(classDecl, "natjgen_control_" + control);
        Assume.assumeTrue("Control method for '" + control + "' doesn't exist", method != null);
    }

    protected static void assumeHasControlMethod_HasObjC() {
        assumeHasControlMethod("HasObjC");
    }

    protected static void assumeHasControlMethod_HasSizedEnums() {
        assumeHasControlMethod("HasSizedEnums");
    }

    protected final void debug(Object o) {
        System.out.println(o);
    }

    protected final void debug(String o) {
        System.out.println(o);
    }

}
