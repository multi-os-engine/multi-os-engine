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

import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;
import cxx.tests.NatJTest;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class HierarchyTestBase extends NatJTest {

    protected enum SingleAInvocationID {
        ILLEGAL,
        A_CTOR,
        A_FOO0,
        A_FOO1,
        A_FOO2,
        A_FOO3,
        A_ADD,
        A_SUB,
        A_CAST_BOOL,
        A_BAR_A,
        B_CTOR,
        B_FOO0,
        B_FOO1,
        B_FOO2,
        B_FOO3,
        B_ADD,
        B_SUB,
        B_CAST_BOOL,
        B_BAR_B,
        C_CTOR,
        C_FOO0,
        C_FOO1,
        C_FOO2,
        C_FOO3,
        C_BAR_C,
        D_CTOR,
        D_FOO0,
        D_FOO1,
        D_FOO2,
        D_FOO3,
        D_BAR_D,
    }

    @CxxGlobalGetter("natj::cxx::tests::binding::SingleA::lastInvocation")
    protected static native int SingleALastInvocation();

    protected void assertSingleALastInvocation(SingleAInvocationID inv) {
        Assert.assertNotNull(inv);
        assertEquals(inv.ordinal(), SingleALastInvocation());
    }

    @CxxHeader("binding/Hierarchy.hpp")
    @CxxClass("natj::cxx::tests::binding::SingleA")
    protected interface SingleA extends CxxObject {

        @CxxMethod()
        void foo0();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo1();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo2();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo3();

        @CxxMethod()
        void barA();

        @CxxOperator(value = CxxOperatorKind.ADD, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxByValue
        SingleA add(int value);

        @CxxOperator(value = CxxOperatorKind.SUBTRACT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxByValue
        SingleA sub(int value);

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        boolean toBool();
    }

    @CxxConstructor()
    protected static native SingleA newSingleA();

    @CxxHeader("binding/Hierarchy.hpp")
    @CxxClass("natj::cxx::tests::binding::SingleB")
    protected interface SingleB extends SingleA {

        @CxxMethod
        void foo0();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL /* inherited */)
        void foo1();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo2();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo3();

        @CxxMethod()
        void barB();

        @CxxOperator(value = CxxOperatorKind.ADD, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxByValue
        SingleA add(int value);

        @CxxOperator(value = CxxOperatorKind.SUBTRACT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxByValue
        SingleA sub(@CxxConst @CxxByReference SingleB value);

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        boolean toBool();
    }

    @CxxConstructor()
    protected static native SingleB newSingleB();

    @CxxHeader("binding/Hierarchy.hpp")
    @CxxClass("natj::cxx::tests::binding::SingleC")
    protected interface SingleC extends SingleB {

        @CxxMethod
        void foo0();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL /* inherited */)
        void foo1();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL /* inherited */)
        void foo2();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo3();

        @CxxMethod()
        void barC();
    }

    @CxxConstructor()
    protected static native SingleC newSingleC();

    @CxxHeader("binding/Hierarchy.hpp")
    @CxxClass("natj::cxx::tests::binding::SingleD")
    protected interface SingleD extends SingleC {
        @CxxMethod
        void foo0();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL /* inherited */)
        void foo1();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL /* inherited */)
        void foo2();

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL /* inherited */)
        void foo3();

        @CxxMethod()
        void barD();
    }

    @CxxConstructor()
    protected static native SingleD newSingleD();

    @CxxFunction("natj::cxx::tests::binding::getTrickyCInstance")
    protected static native SingleA getTrickyCInstance();

    @CxxHeader("binding/Hierarchy.hpp")
    @CxxClass("natj::cxx::tests::binding::PureA")
    protected interface PureA extends CxxObject {

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        void foo();
    }

    @CxxConstructor()
    protected static native PureA newPureA();

    @CxxHeader("binding/Hierarchy.hpp")
    @CxxClass("natj::cxx::tests::binding::NonPureB")
    protected interface NonPureB extends PureA {

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void foo();
    }

    @CxxConstructor()
    protected static native NonPureB newNonPureB();
}
