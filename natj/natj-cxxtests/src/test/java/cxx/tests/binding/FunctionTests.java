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
import org.moe.natj.cxx.ann.CxxConst;
import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxGlobalGetter;
import org.moe.natj.cxx.ann.CxxHeader;
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@CxxHeader("binding/Functions.hpp")
public class FunctionTests extends NatJTest {

    private enum FunctionID {
        ILLEGAL,
        SIMPLE,
        UNIQUENAME,
        TEST1,
        TEST2,
    }

    @CxxFunction()
    private static native void testFunctionSimple();

    @CxxFunction("natj::cxx::tests::binding::functions::testFunctionWhichHasAUniqueName")
    private static native void testFunctionUniqueName();

    @CxxGlobalGetter("natj::cxx::tests::binding::functions::lastInvocation")
    private static native int lastInvocation();

    @CxxFunction()
    private static native void testFunctionLotsOfArgsTest1(int a, float b, long c, boolean d, double e);

    @CxxFunction()
    private static native void testFunctionLotsOfArgsTest2(int p1, int p2, int p3, int p4, int p5, int p6, int p7,
                                                           int p8, int p9, int p10, int p11, int p12, int p13, int p14,
                                                           int p15, int p16, int p17, int p18, int p19, int p20,
                                                           int p21, int p22, int p23, int p24, int p25, int p26,
                                                           int p27, int p28, int p29, int p30, int p31, int p32,
                                                           int p33, int p34, int p35, int p36, int p37, int p38,
                                                           int p39, int p40, long p41, int p42, int p43, int p44,
                                                           int p45, int p46, int p47, int p48, int p49, int p50,
                                                           int p51, int p52, int p53, int p54, int p55, int p56,
                                                           int p57, int p58, int p59, int p60, int p61, int p62,
                                                           int p63, int p64);


    @CxxFunction
    @CxxConst
    public static native MyClass getMyClass();

    @CxxFunction
    public static native void checkMyClass(MyClass mc);

    @CxxFunction("addTemplateTypes<int>")
    public static native int addTemplateTypes(int a, int b);

    @Test
    public void testSimple() {
        testFunctionSimple();
        Assert.assertEquals(FunctionID.SIMPLE.ordinal(), lastInvocation());
    }

    @Test
    public void testUniqueName() {
        testFunctionUniqueName();
        assertEquals(FunctionID.UNIQUENAME.ordinal(), lastInvocation());
    }

    @Test
    public void testMultipleArguments() {
        testFunctionLotsOfArgsTest1(1, 3.5f, 156L, false, 89165.4151);
        assertEquals(FunctionID.TEST1.ordinal(), lastInvocation());
    }

    @Test
    public void testLotsOfArguments() {
        testFunctionLotsOfArgsTest2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64);
        assertEquals(FunctionID.TEST2.ordinal(), lastInvocation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstPassedAsNonCosntArgument() {
        MyClass mc = getMyClass();
        try {
            checkMyClass(mc);
        } finally {
            CxxRuntime.delete(mc);
        }
    }

    @Test()
    public void testTemplateFunction() {
        assertEquals(100, addTemplateTypes(40, 60));
    }
}
