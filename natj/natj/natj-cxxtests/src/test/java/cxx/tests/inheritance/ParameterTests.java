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

public class ParameterTests extends NatJTest {

    @CxxClass("natj::cxx::tests::inheritance::Parameters")
    @CxxHeader("inheritance/Parameters.hpp")
    private interface Parameters {

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        boolean forwardI1(boolean value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        byte forwardC8(byte value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxChar16T
        char forwardC16(@CxxChar16T char value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxChar32T
        int forwardC32(@CxxChar32T int value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @WCharT
        int forwardCWI(@WCharT int value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxSigned
        byte forwardI8(@CxxSigned byte value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        short forwardI16(short value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int forwardI32(int value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @NLong
        long forwardIL(@NLong long value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        long forwardI64(long value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxUnsigned
        byte forwardU8(@CxxUnsigned byte value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        char forwardU16(char value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxUnsigned
        int forwardU32(@CxxUnsigned int value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @NULong
        long forwardUL(@NULong long value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxUnsigned
        long forwardU64(@CxxUnsigned long value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        float forwardF32(float value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        double forwardF64(double value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxJavaObject
        Object forwardJ(@CxxJavaObject Object value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByValue
        MyClass forwardV(@CxxByValue MyClass value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByReference
        MyClass forwardR(@CxxByReference MyClass value);

        @CxxMethod(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        MyClass forwardP(MyClass value);
    }

    @CxxFunction("natj::cxx::tests::inheritance::invokeI1")
    private static native boolean invokeI1(Parameters fwd, boolean value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeC8")
    private static native byte invokeC8(Parameters fwd, byte value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeC16")
    @CxxChar16T
    private static native char invokeC16(Parameters fwd, @CxxChar16T char value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeC32")
    @CxxChar32T
    private static native int invokeC32(Parameters fwd, @CxxChar32T int value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeCWI")
    @WCharT
    private static native int invokeCWI(Parameters fwd, @WCharT int value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI8")
    @CxxSigned
    private static native byte invokeI8(Parameters fwd, @CxxSigned byte value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI16")
    private static native short invokeI16(Parameters fwd, short value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI32")
    private static native int invokeI32(Parameters fwd, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeIL")
    @NLong
    private static native long invokeIL(Parameters fwd, @NLong long value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeI64")
    private static native long invokeI64(Parameters fwd, long value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU8")
    @CxxUnsigned
    private static native byte invokeU8(Parameters fwd, @CxxUnsigned byte value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU16")
    private static native char invokeU16(Parameters fwd, char value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU32")
    @CxxUnsigned
    private static native int invokeU32(Parameters fwd, @CxxUnsigned int value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeUL")
    @NULong
    private static native long invokeUL(Parameters fwd, @NULong long value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeU64")
    @CxxUnsigned
    private static native long invokeU64(Parameters fwd, @CxxUnsigned long value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeF32")
    private static native float invokeF32(Parameters fwd, float value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeF64")
    private static native double invokeF64(Parameters fwd, double value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeJ")
    @CxxJavaObject
    private static native Object invokeJ(Parameters fwd, @CxxJavaObject Object value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeV")
    @CxxByValue
    private static native MyClass invokeV(Parameters fwd, @CxxByValue MyClass value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeR")
    @CxxByReference
    private static native MyClass invokeR(Parameters fwd, @CxxByReference MyClass value);

    @CxxFunction("natj::cxx::tests::inheritance::invokeP")
    private static native MyClass invokeP(Parameters fwd, MyClass value);

    @CxxInheritedClass("natj::java::tests::inheritance::Parameters")
    private static class Inherited extends CxxInheritedObject implements Parameters {

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

        @CxxInheritedConstructor()
        private static native long newInherited(long java);

        public Inherited() {
            super(new ICxxConstructor() {
                @Override
                public long construct(long java) {
                    return Inherited.newInherited(java);
                }
            });
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public boolean forwardI1(boolean value) {
            invokedI1 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public byte forwardC8(byte value) {
            invokedC8 = true;
            return value;
        }


        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxChar16T
        public char forwardC16(@CxxChar16T char value) {
            invokedC16 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxChar32T
        public int forwardC32(@CxxChar32T int value) {
            invokedC32 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @WCharT
        public int forwardCWI(@WCharT int value) {
            invokedCWI = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxSigned
        public byte forwardI8(@CxxSigned byte value) {
            invokedI8 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public short forwardI16(short value) {
            invokedI16 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int forwardI32(int value) {
            invokedI32 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @NLong
        public long forwardIL(@NLong long value) {
            invokedIL = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public long forwardI64(long value) {
            invokedI64 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxUnsigned
        public byte forwardU8(@CxxUnsigned byte value) {
            invokedU8 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public char forwardU16(char value) {
            invokedU16 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxUnsigned
        public int forwardU32(@CxxUnsigned int value) {
            invokedU32 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @NULong
        public long forwardUL(@NULong long value) {
            invokedUL = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxUnsigned
        public long forwardU64(@CxxUnsigned long value) {
            invokedU64 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public float forwardF32(float value) {
            invokedF32 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public double forwardF64(double value) {
            invokedF64 = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxJavaObject
        public Object forwardJ(@CxxJavaObject Object value) {
            invokedJ = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxByValue
        public MyClass forwardV(@CxxByValue MyClass value) {
            invokedV = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        @CxxByReference
        public MyClass forwardR(@CxxByReference MyClass value) {
            invokedR = true;
            return value;
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public MyClass forwardP(MyClass value) {
            invokedP = true;
            return value;
        }
    }

    @Test
    public void testI1Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI1);
        assertEquals(VALUE_I1, invokeI1(inherited, VALUE_I1));
        assertTrue(inherited.invokedI1);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC8Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedC8);
        assertEquals(VALUE_C8, invokeC8(inherited, VALUE_C8));
        assertTrue(inherited.invokedC8);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC16Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedC16);
        assertEquals(VALUE_C16, invokeC16(inherited, VALUE_C16));
        assertTrue(inherited.invokedC16);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC32Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedC32);
        assertEquals(VALUE_C32, invokeC32(inherited, VALUE_C32));
        assertTrue(inherited.invokedC32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testCWIParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedCWI);
        assertEquals(VALUE_CWI, invokeCWI(inherited, VALUE_CWI));
        assertTrue(inherited.invokedCWI);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI8Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI8);
        assertEquals(VALUE_I8, invokeI8(inherited, VALUE_I8));
        assertTrue(inherited.invokedI8);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI16Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI16);
        assertEquals(VALUE_I16, invokeI16(inherited, VALUE_I16));
        assertTrue(inherited.invokedI16);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI32Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI32);
        assertEquals(VALUE_I32, invokeI32(inherited, VALUE_I32));
        assertTrue(inherited.invokedI32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testILParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedIL);
        assertEquals(VALUE_IL, invokeIL(inherited, VALUE_IL));
        assertTrue(inherited.invokedIL);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI64Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedI64);
        assertEquals(VALUE_I64, invokeI64(inherited, VALUE_I64));
        assertTrue(inherited.invokedI64);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU8Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU8);
        assertEquals(VALUE_U8, invokeU8(inherited, VALUE_U8));
        assertTrue(inherited.invokedU8);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU16Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU16);
        assertEquals(VALUE_U16, invokeU16(inherited, VALUE_U16));
        assertTrue(inherited.invokedU16);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU32Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU32);
        assertEquals(VALUE_U32, invokeU32(inherited, VALUE_U32));
        assertTrue(inherited.invokedU32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testULParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedUL);
        assertEquals(VALUE_UL, invokeUL(inherited, VALUE_UL));
        assertTrue(inherited.invokedUL);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU64Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedU64);
        assertEquals(VALUE_U64, invokeU64(inherited, VALUE_U64));
        assertTrue(inherited.invokedU64);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testF32Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedF32);
        assertEquals(VALUE_F32, invokeF32(inherited, VALUE_F32), 0.0f);
        assertTrue(inherited.invokedF32);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testF64Parameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedF64);
        assertEquals(VALUE_F64, invokeF64(inherited, VALUE_F64), 0.0);
        assertTrue(inherited.invokedF64);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testJParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedJ);
        assertEquals(JAVA_OBJECT, invokeJ(inherited, JAVA_OBJECT));
        assertTrue(inherited.invokedJ);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testVParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedV);
        MyClass myClass = invokeV(inherited, MY_CLASS);
        assertNotNull(myClass);
        assertTrue(inherited.invokedV);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testRParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedR);
        assertEquals(MY_CLASS, invokeR(inherited, MY_CLASS));
        assertTrue(inherited.invokedR);
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testPParameter() {
        Inherited inherited = new Inherited();
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertFalse(inherited.invokedP);
        assertEquals(MY_CLASS, invokeP(inherited, MY_CLASS));
        assertTrue(inherited.invokedP);
        CxxRuntime.delete(inherited);
    }
}
