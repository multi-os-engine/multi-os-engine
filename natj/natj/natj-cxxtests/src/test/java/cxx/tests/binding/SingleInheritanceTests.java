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

package cxx.tests.binding;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import cxx.interfaces.JavaInterface;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleInheritanceTests extends HierarchyTestBase {

    @Test
    public void testBar() {
        SingleA tmpA = newSingleA();
        assertNotNull(tmpA);
        assertSingleALastInvocation(SingleAInvocationID.A_CTOR);
        tmpA.barA();
        assertSingleALastInvocation(SingleAInvocationID.A_BAR_A);
        CxxRuntime.delete(tmpA);

        SingleB tmpB = newSingleB();
        assertNotNull(tmpB);
        assertSingleALastInvocation(SingleAInvocationID.B_CTOR);
        tmpB.barA();
        assertSingleALastInvocation(SingleAInvocationID.A_BAR_A);
        tmpB.barB();
        assertSingleALastInvocation(SingleAInvocationID.B_BAR_B);
        CxxRuntime.delete(tmpB);

        SingleC tmpC = newSingleC();
        assertNotNull(tmpC);
        assertSingleALastInvocation(SingleAInvocationID.C_CTOR);
        tmpC.barA();
        assertSingleALastInvocation(SingleAInvocationID.A_BAR_A);
        tmpC.barB();
        assertSingleALastInvocation(SingleAInvocationID.B_BAR_B);
        tmpC.barC();
        assertSingleALastInvocation(SingleAInvocationID.C_BAR_C);
        CxxRuntime.delete(tmpC);

        SingleD tmpD = newSingleD();
        assertNotNull(tmpD);
        assertSingleALastInvocation(SingleAInvocationID.D_CTOR);
        tmpD.barA();
        assertSingleALastInvocation(SingleAInvocationID.A_BAR_A);
        tmpD.barB();
        assertSingleALastInvocation(SingleAInvocationID.B_BAR_B);
        tmpD.barC();
        assertSingleALastInvocation(SingleAInvocationID.C_BAR_C);
        tmpD.barD();
        assertSingleALastInvocation(SingleAInvocationID.D_BAR_D);
        CxxRuntime.delete(tmpD);
    }

    @Test
    public void testAFoo() {
        SingleA tmp = newSingleA();
        assertNotNull(tmp);
        assertSingleALastInvocation(SingleAInvocationID.A_CTOR);
        tmp.foo0();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO0);
        tmp.foo1();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO1);
        tmp.foo2();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO2);
        tmp.foo3();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO3);
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testBFoo() {
        SingleB tmp = newSingleB();
        assertNotNull(tmp);
        assertSingleALastInvocation(SingleAInvocationID.B_CTOR);
        tmp.foo0();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO0);
        tmp.foo1();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO1);
        tmp.foo2();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO2);
        tmp.foo3();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO3);
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testCFoo() {
        SingleC tmp = newSingleC();
        assertNotNull(tmp);
        assertSingleALastInvocation(SingleAInvocationID.C_CTOR);
        tmp.foo0();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO0);
        tmp.foo1();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO1);
        tmp.foo2();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO2);
        tmp.foo3();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO3);
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testDFoo() {
        SingleD tmp = newSingleD();
        assertNotNull(tmp);
        assertSingleALastInvocation(SingleAInvocationID.D_CTOR);
        tmp.foo0();
        assertSingleALastInvocation(SingleAInvocationID.D_FOO0);
        tmp.foo1();
        assertSingleALastInvocation(SingleAInvocationID.D_FOO1);
        tmp.foo2();
        assertSingleALastInvocation(SingleAInvocationID.D_FOO2);
        tmp.foo3();
        assertSingleALastInvocation(SingleAInvocationID.D_FOO3);
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testJavaInterface() {
        // Hide the fact that MY_CLASS is a MyClass instance
        CxxObject p = new CxxObject[]{MY_CLASS}[0];
        assertNotNull(p);
        assertTrue("instanceof failed", p instanceof JavaInterface);
    }

    @Test
    public void testVirtualMethod() {
        SingleA trickyCInstance = getTrickyCInstance();
        assertNotNull(trickyCInstance);
        assertFalse("not so tricky after all...", trickyCInstance instanceof SingleC);
        trickyCInstance.foo3();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO3);
    }

    @Test
    public void testVirtualOperator() {
        SingleA trickyCInstance = getTrickyCInstance();
        assertNotNull(trickyCInstance);
        assertFalse("not so tricky after all...", trickyCInstance instanceof SingleC);
        trickyCInstance.add(10);
        assertSingleALastInvocation(SingleAInvocationID.B_ADD);

        SingleB tmp = newSingleB();
        assertNotNull(tmp);
        assertSingleALastInvocation(SingleAInvocationID.B_CTOR);
        tmp.add(10);
        assertSingleALastInvocation(SingleAInvocationID.B_ADD);

        SingleA directInterface = tmp.cxxGetDirectInterface(SingleA.class);
        assertNotNull(directInterface);
        directInterface.add(10);
        assertSingleALastInvocation(SingleAInvocationID.A_ADD);
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testVirtualCastOperator() {
        SingleB tmp = newSingleB();
        assertNotNull(tmp);
        assertSingleALastInvocation(SingleAInvocationID.B_CTOR);
        assertFalse(tmp.toBool());
        assertSingleALastInvocation(SingleAInvocationID.B_CAST_BOOL);

        SingleA directInterface = tmp.cxxGetDirectInterface(SingleA.class);
        assertNotNull(directInterface);
        assertTrue(directInterface.toBool());
        assertSingleALastInvocation(SingleAInvocationID.A_CAST_BOOL);
        CxxRuntime.delete(tmp);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIllegalDirectOnlyMethodCall() {
        SingleB tmp = newSingleB();
        try {
            tmp.sub(12);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test()
    public void testDirectOnlyMethodCall() {
        SingleB tmp = newSingleB();
        try {
            tmp.sub(tmp);
            assertSingleALastInvocation(SingleAInvocationID.B_SUB);
            tmp.cxxGetDirectInterface(SingleA.class).sub(12);
            assertSingleALastInvocation(SingleAInvocationID.A_SUB);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }
}
