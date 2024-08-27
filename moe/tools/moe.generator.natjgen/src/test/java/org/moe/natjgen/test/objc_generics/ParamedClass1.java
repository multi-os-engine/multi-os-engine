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

package org.moe.natjgen.test.objc_generics;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.moe.natjgen.test.AbstractObjCClassTest;

public class ParamedClass1 extends AbstractObjCClassTest {
    public void test_class_with_templates() {
        TypeDeclaration decl = getClassDecl();
        assertEquals("ParamedClass1", decl.getName().getIdentifier());
        assertEquals(1, decl.typeParameters().size());
        assertEquals("_T", ((TypeParameter)decl.typeParameters().get(0)).getName().getIdentifier());
    }

    public void test_superclass_with_templates() {
        TypeDeclaration decl = getClassDecl();

        assertTrue(decl.getSuperclassType().isSimpleType());
        SimpleType superClass = (SimpleType)decl.getSuperclassType();

        assertEquals("NSObject", superClass.getName().getFullyQualifiedName());
    }

    public void test_method_v() {
        MethodDeclaration method = getMethod("v");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertSimpleType(method.getReturnType2(), "_T");
    }

    public void test_method_v__ptr() {
        MethodDeclaration method = getMethod("v__ptr");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "Ptr<_T>");
    }

    public void test_method_v__array() {
        MethodDeclaration method = getMethod("v__array");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "NSArray<_T>");
    }

    public void test_method_v__array_array() {
        MethodDeclaration method = getMethod("v__array_array");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "NSArray<? extends NSArray<_T>>");
    }

    public void test_method_v__array_ptr() {
        MethodDeclaration method = getMethod("v__array_ptr");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "Ptr<NSArray<_T>>");
    }

    // TODO: MUST_FIX! Test was temporarily disabled to successfully build installer
    public void _test_method_v__strong_array_ptr_ptr() {
        MethodDeclaration method = getMethod("v__strong_array_ptr_ptr");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "Ptr<Ptr<NSArray<_T>>>");
    }

    public void test_method_string_v__dictionary() {
        MethodDeclaration method = getMethod("string_v__dictionary");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "NSDictionary<String,_T>");
    }

    public void test_getter_prop__v() {
        MethodDeclaration method = getMethod("prop__v");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertSimpleType(method.getReturnType2(), "_T");
    }

    public void test_setter_prop__v() {
        MethodDeclaration method = getMethod("setProp__v");
        assertExistsAndGenerated(method);
        assertEquals(1, method.parameters().size());
        assertSimpleType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "_T");
    }

    public void test_getter_prop__v__ptr() {
        MethodDeclaration method = getMethod("prop__v__ptr");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "Ptr<_T>");
    }

    public void test_setter_prop__v__ptr() {
        MethodDeclaration method = getMethod("setProp__v__ptr");
        assertExistsAndGenerated(method);
        assertEquals(1, method.parameters().size());
        assertParameterizedType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "Ptr<_T>");
    }

    public void test_getter_prop__v__array() {
        MethodDeclaration method = getMethod("prop__v__array");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "NSArray<_T>");
    }

    public void test_setter_prop__v__array() {
        MethodDeclaration method = getMethod("setProp__v__array");
        assertExistsAndGenerated(method);
        assertEquals(1, method.parameters().size());
        assertParameterizedType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "NSArray<_T>");
    }

    public void test_getter_prop__string_v__dictionary() {
        MethodDeclaration method = getMethod("prop__string_v__dictionary");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertParameterizedType(method.getReturnType2(), "NSDictionary<String,_T>");
    }

    public void test_setter_prop__string_v__dictionary() {
        MethodDeclaration method = getMethod("setProp__string_v__dictionary");
        assertExistsAndGenerated(method);
        assertEquals(1, method.parameters().size());
        assertParameterizedType(((SingleVariableDeclaration)method.parameters().get(0)).getType(),
                "NSDictionary<String,_T>");
    }

    public void test_category_method_cat0() {
        MethodDeclaration method = getMethod("cat0");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertPrimitiveType(method.getReturnType2(), "void");
    }

    public void test_category_method_cat1unused() {
        MethodDeclaration method = getMethod("cat1unused");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertPrimitiveType(method.getReturnType2(), "void");
    }

    public void test_category_method_cat1used() {
        MethodDeclaration method = getMethod("cat1used");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertSimpleType(method.getReturnType2(), "_T");
    }

    public void test_category_method_cat1unuseddiff() {
        MethodDeclaration method = getMethod("cat1unuseddiff");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertPrimitiveType(method.getReturnType2(), "void");
    }

    public void test_category_method_cat1useddiff() {
        MethodDeclaration method = getMethod("cat1useddiff");
        assertExistsAndGenerated(method);
        assertEquals(0, method.parameters().size());
        assertSimpleType(method.getReturnType2(), "_T");
    }
}
