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

package org.moe.natjgen.test.pointers;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.moe.natjgen.Constants;
import org.moe.natjgen.test.AbstractNatJGenTest;

public abstract class AbstractPointersTest extends AbstractNatJGenTest {

    protected String javaT;
    protected String nativeT;
    protected String natjPtrT;
    protected String natjConstPtrT;

    protected abstract void setUp() throws Exception;

    protected boolean baseTypeIsPrimitive() {
        return true;
    }

    protected void setUp(String javaT, String nativeT, String natjPtrT, String natjConstPtrT) throws Exception {
        this.javaT = javaT;
        this.nativeT = nativeT;
        this.natjPtrT = natjPtrT;
        this.natjConstPtrT = natjConstPtrT;
        assertNotNull(this.nativeT);
        assertNotNull(this.nativeT);
        assertNotNull(this.natjPtrT);
        assertNotNull(this.natjConstPtrT);

        setUpClass(null, "c/Globals.java", "Globals");
    }

    public void test_T_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        if (baseTypeIsPrimitive()) {
            assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        } else {
            NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
            assertReferenceInfoEquals(refInfo, javaT, 1);
        }

        assertEquals(natjPtrT, method.getReturnType2().toString());
    }

    public void test_const_T_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        if (baseTypeIsPrimitive()) {
            assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        } else {
            NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
            assertReferenceInfoEquals(refInfo, javaT, 1);
        }

        assertEquals(natjConstPtrT, method.getReturnType2().toString());
    }

    public void test_T_ptr_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 2);

        assertEquals("Ptr<" + natjPtrT + ">", method.getReturnType2().toString());
    }

    public void test_T_ptr_const_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_const_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 2);

        assertEquals("ConstPtr<" + natjPtrT + ">", method.getReturnType2().toString());
    }

    public void test_const_T_ptr_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 2);

        assertEquals("Ptr<" + natjConstPtrT + ">", method.getReturnType2().toString());
    }

    public void test_const_T_ptr_const_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_const_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 2);

        assertEquals("ConstPtr<" + natjConstPtrT + ">", method.getReturnType2().toString());
    }

    public void test_T_ptr_ptr_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_ptr_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("Ptr<Ptr<" + natjPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_T_ptr_ptr_const_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_ptr_const_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("ConstPtr<Ptr<" + natjPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_T_ptr_const_ptr_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_const_ptr_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("Ptr<ConstPtr<" + natjPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_T_ptr_const_ptr_const_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_const_ptr_const_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("ConstPtr<ConstPtr<" + natjPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_const_T_ptr_ptr_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_ptr_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("Ptr<Ptr<" + natjConstPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_const_T_ptr_ptr_const_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_ptr_const_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("ConstPtr<Ptr<" + natjConstPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_const_T_ptr_const_ptr_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_const_ptr_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("Ptr<ConstPtr<" + natjConstPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_const_T_ptr_const_ptr_const_ptr_fn_ret() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_const_ptr_const_ptr_fn_ret");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        NormalAnnotation refInfo = assertHasNormalAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertReferenceInfoEquals(refInfo, javaT, 3);

        assertEquals("ConstPtr<ConstPtr<" + natjConstPtrT + ">>", method.getReturnType2().toString());
    }

    public void test_T_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals(natjPtrT, getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals(natjConstPtrT, getArgType(method, 0).toString());
    }

    public void test_T_ptr_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("Ptr<" + natjPtrT + ">", getArgType(method, 0).toString());
    }

    public void test_T_ptr_const_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_const_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("ConstPtr<" + natjPtrT + ">", getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("Ptr<" + natjConstPtrT + ">", getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_const_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_const_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("ConstPtr<" + natjConstPtrT + ">", getArgType(method, 0).toString());
    }

    public void test_T_ptr_ptr_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_ptr_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("Ptr<Ptr<" + natjPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_T_ptr_ptr_const_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_ptr_const_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("ConstPtr<Ptr<" + natjPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_T_ptr_const_ptr_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_const_ptr_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("Ptr<ConstPtr<" + natjPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_T_ptr_const_ptr_const_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_const_ptr_const_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("ConstPtr<ConstPtr<" + natjPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_ptr_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_ptr_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("Ptr<Ptr<" + natjConstPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_ptr_const_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_ptr_const_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("ConstPtr<Ptr<" + natjConstPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_const_ptr_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_const_ptr_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("Ptr<ConstPtr<" + natjConstPtrT + ">>", getArgType(method, 0).toString());
    }

    public void test_const_T_ptr_const_ptr_const_ptr_fn_arg() {
        MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_const_ptr_const_ptr_fn_arg");
        assertExistsAndGenerated(method);
        assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
        assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
        assertNumberOfArguments(method, 1);

        assertEquals("ConstPtr<ConstPtr<" + natjConstPtrT + ">>", getArgType(method, 0).toString());
    }
}
