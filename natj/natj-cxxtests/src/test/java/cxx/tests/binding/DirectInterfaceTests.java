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

import org.moe.natj.cxx.CxxRuntime;
import cxx.interfaces.Primitives;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DirectInterfaceTests extends HierarchyTestBase {

    @Test
    public void testSingleInheritance() {
        SingleD tmp = newSingleD();

        SingleA tmpA = tmp.cxxGetDirectInterface(SingleA.class);
        tmpA.foo0();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO0);
        tmpA.foo1();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO1);
        tmpA.foo2();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO2);
        tmpA.foo3();
        assertSingleALastInvocation(SingleAInvocationID.A_FOO3);

        SingleB tmpB = tmp.cxxGetDirectInterface(SingleB.class);
        tmpB.foo0();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO0);
        tmpB.foo1();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO1);
        tmpB.foo2();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO2);
        tmpB.foo3();
        assertSingleALastInvocation(SingleAInvocationID.B_FOO3);

        SingleC tmpC = tmp.cxxGetDirectInterface(SingleC.class);
        tmpC.foo0();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO0);
        tmpC.foo1();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO1);
        tmpC.foo2();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO2);
        tmpC.foo3();
        assertSingleALastInvocation(SingleAInvocationID.C_FOO3);

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

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalSafeDirectInterface() {
        SingleD tmp = newSingleD();
        assertNotNull(tmp);
        try {
            tmp.cxxGetDirectInterface(Primitives.class);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDestructorCall() {
        SingleD tmp = newSingleD();
        assertNotNull(tmp);
        SingleA tmpA = tmp.cxxGetDirectInterface(SingleA.class);
        assertNotNull(tmpA);
        try {
            CxxRuntime.delete(tmpA);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }
}
