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

package cxx.tests.inheritance;

import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnValueTests extends NatJTest {

    @CxxClass("natj::cxx::tests::inheritance::ReturnValues")
    @CxxHeader("inheritance/ReturnValues.hpp")
    private interface ReturnValues {

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        void method();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        boolean methodI1();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        byte methodC8();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxChar16T
        char methodC16();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxChar32T
        int methodC32();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @WCharT
        int methodCWI();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxSigned
        byte methodI8();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        short methodI16();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int methodI32();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @NLong
        long methodIL();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        long methodI64();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxUnsigned
        byte methodU8();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        char methodU16();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxUnsigned
        int methodU32();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @NULong
        long methodUL();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxUnsigned
        long methodU64();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        float methodF32();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        double methodF64();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxJavaObject
        Object methodJ();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByValue
        MyClass methodV();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByReference
        MyClass methodR();

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        MyClass methodP();
    }

    @CxxFunction("natj::cxx::tests::inheritance::invoke")
    private static native void invoke(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI1")
    private static native boolean invokeI1(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeC8")
    private static native byte invokeC8(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeC16")
    @CxxChar16T
    private static native char invokeC16(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeC32")
    @CxxChar32T
    private static native int invokeC32(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeCWI")
    @WCharT
    private static native int invokeCWI(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI8")
    @CxxSigned
    private static native byte invokeI8(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI16")
    private static native short invokeI16(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI32")
    private static native int invokeI32(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeIL")
    @NLong
    private static native long invokeIL(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI64")
    private static native long invokeI64(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU8")
    @CxxUnsigned
    private static native byte invokeU8(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU16")
    private static native char invokeU16(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU32")
    @CxxUnsigned
    private static native int invokeU32(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeUL")
    @NULong
    private static native long invokeUL(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU64")
    @CxxUnsigned
    private static native long invokeU64(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeF32")
    private static native float invokeF32(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeF64")
    private static native double invokeF64(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeJ")
    @CxxJavaObject
    private static native Object invokeJ(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeV")
    @CxxByValue
    private static native MyClass invokeV(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeR")
    @CxxByReference
    private static native MyClass invokeR(ReturnValues returnValues);

    @CxxFunction("natj::cxx::tests::inheritance::invokeP")
    private static native MyClass invokeP(ReturnValues returnValues);

    @CxxInheritedClass("natj::java::tests::inheritance::ReturnValues")
    private static class Inherited extends CxxInheritedObject implements ReturnValues {

        private boolean invokedVoid = false;
        private boolean invokedI1 = false;
        private boolean invokedC8 = false;
        private boolean invokedC16 = false;
        private boolean invokedC32 = false;
        private boolean invokedCWI = false;
        private boolean invokedI8 = false;
        private boolean invokedI16 = false;
        private boolean invokedI32 = false;
        private boolean invokedIL = false;
        private boolean invokedI64 = false;
        private boolean invokedU8 = false;
        private boolean invokedU16 = false;
        private boolean invokedU32 = false;
        private boolean invokedUL = false;
        private boolean invokedU64 = false;
        private boolean invokedF32 = false;
        private boolean invokedF64 = false;
        private boolean invokedJ = false;
        private boolean invokedV = false;
        private boolean invokedR = false;
        private boolean invokedP = false;

        private final MyClass myClass;

        @CxxInheritedConstructor()
        private static native long newInherited(long java);

        public Inherited() {
            super(new ICxxConstructor() {
                @Override
                public long construct(long java) {
                    return Inherited.newInherited(java);
                }
            });
            this.myClass = MY_CLASS;
        }

        public Inherited(MyClass object) {
            super(new ICxxConstructor() {
                @Override
                public long construct(long java) {
                    return Inherited.newInherited(java);
                }
            });
            this.myClass = object;
        }

        @Override
        @CxxMethod
        public void method() {
            invokedVoid = true;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public boolean methodI1() {
            invokedI1 = true;
            return VALUE_I1;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public byte methodC8() {
            invokedC8 = true;
            return VALUE_C8;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxChar16T
        public char methodC16() {
            invokedC16 = true;
            return VALUE_C16;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxChar32T
        public int methodC32() {
            invokedC32 = true;
            return VALUE_C32;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @WCharT
        public int methodCWI() {
            invokedCWI = true;
            return VALUE_CWI;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxSigned
        public byte methodI8() {
            invokedI8 = true;
            return VALUE_I8;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public short methodI16() {
            invokedI16 = true;
            return VALUE_I16;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public int methodI32() {
            invokedI32 = true;
            return VALUE_I32;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @NLong
        public long methodIL() {
            invokedIL = true;
            return VALUE_IL;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public long methodI64() {
            invokedI64 = true;
            return VALUE_I64;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxUnsigned
        public byte methodU8() {
            invokedU8 = true;
            return VALUE_U8;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public char methodU16() {
            invokedU16 = true;
            return VALUE_U16;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxUnsigned
        public int methodU32() {
            invokedU32 = true;
            return VALUE_U32;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @NULong
        public long methodUL() {
            invokedUL = true;
            return VALUE_UL;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxUnsigned
        public long methodU64() {
            invokedU64 = true;
            return VALUE_U64;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public float methodF32() {
            invokedF32 = true;
            return VALUE_F32;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public double methodF64() {
            invokedF64 = true;
            return VALUE_F64;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxJavaObject
        public Object methodJ() {
            invokedJ = true;
            return JAVA_OBJECT;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxByValue
        public MyClass methodV() {
            invokedV = true;
            return myClass;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxByReference
        public MyClass methodR() {
            invokedR = true;
            return myClass;
        }

        @Override
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public MyClass methodP() {
            invokedP = true;
            return myClass;
        }
    }

    @Test
    public void testVoidReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedVoid);
        invoke(inherited);
        assertTrue(inherited.invokedVoid);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI1Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI1);
        assertEquals(VALUE_I1, invokeI1(inherited));
        assertTrue(inherited.invokedI1);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC8Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedC8);
        assertEquals(VALUE_C8, invokeC8(inherited));
        assertTrue(inherited.invokedC8);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC16Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedC16);
        assertEquals(VALUE_C16, invokeC16(inherited));
        assertTrue(inherited.invokedC16);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC32Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedC32);
        assertEquals(VALUE_C32, invokeC32(inherited));
        assertTrue(inherited.invokedC32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testCWIReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedCWI);
        assertEquals(VALUE_CWI, invokeCWI(inherited));
        assertTrue(inherited.invokedCWI);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI8Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI8);
        assertEquals(VALUE_I8, invokeI8(inherited));
        assertTrue(inherited.invokedI8);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI16Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI16);
        assertEquals(VALUE_I16, invokeI16(inherited));
        assertTrue(inherited.invokedI16);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI32Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI32);
        assertEquals(VALUE_I32, invokeI32(inherited));
        assertTrue(inherited.invokedI32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testILReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedIL);
        assertEquals(VALUE_IL, invokeIL(inherited));
        assertTrue(inherited.invokedIL);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI64Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI64);
        assertEquals(VALUE_I64, invokeI64(inherited));
        assertTrue(inherited.invokedI64);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU8Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU8);
        assertEquals(VALUE_U8, invokeU8(inherited));
        assertTrue(inherited.invokedU8);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU16Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU16);
        assertEquals(VALUE_U16, invokeU16(inherited));
        assertTrue(inherited.invokedU16);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU32Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU32);
        assertEquals(VALUE_U32, invokeU32(inherited));
        assertTrue(inherited.invokedU32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testULReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedUL);
        assertEquals(VALUE_UL, invokeUL(inherited));
        assertTrue(inherited.invokedUL);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU64Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU64);
        assertEquals(VALUE_U64, invokeU64(inherited));
        assertTrue(inherited.invokedU64);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testF32Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedF32);
        assertEquals(VALUE_F32, invokeF32(inherited), 0.0f);
        assertTrue(inherited.invokedF32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testF64Return() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedF64);
        assertEquals(VALUE_F64, invokeF64(inherited), 0.0);
        assertTrue(inherited.invokedF64);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testJReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedJ);
        assertEquals(JAVA_OBJECT, invokeJ(inherited));
        assertTrue(inherited.invokedJ);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testVReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedV);
        MyClass myClass = invokeV(inherited);
        assertNotNull(myClass);
        assertNotEquals(0L, myClass._cxx_rt_peer());
        assertTrue(inherited.invokedV);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testRReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedR);
        assertEquals(MY_CLASS, invokeR(inherited));
        assertTrue(inherited.invokedR);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testPReturn() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedP);
        assertEquals(MY_CLASS, invokeP(inherited));
        assertTrue(inherited.invokedP);
        CxxRuntime.delete(inherited);
    }

    @Test(expected = NullPointerException.class)
    public void testNullVReturn() {
        Inherited inherited = new Inherited(null);
        assertNotNull(inherited);
        try {
            assertNotEquals(inherited._cxx_rt_peer(), 0);
            assertFalse(inherited.invokedV);
            invokeV(inherited);
        } finally {
            CxxRuntime.delete(inherited);
        }
    }

    @Test(expected = NullPointerException.class)
    public void testNullRReturn() {
        Inherited inherited = new Inherited(null);
        assertNotNull(inherited);
        try {
            assertNotEquals(inherited._cxx_rt_peer(), 0);
            assertFalse(inherited.invokedR);
            invokeR(inherited);
        } finally {
            CxxRuntime.delete(inherited);
        }
    }
}
