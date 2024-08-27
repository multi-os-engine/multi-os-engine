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
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorTests extends NatJTest {

    private enum InvocationID {
        CTOR_I1,
        CTOR_C8,
        CTOR_C16,
        CTOR_C32,
        CTOR_CWI,
        CTOR_I8,
        CTOR_I16,
        CTOR_I32,
        CTOR_IL,
        CTOR_I64,
        CTOR_U8,
        CTOR_U16,
        CTOR_U32,
        CTOR_UL,
        CTOR_U64,
        CTOR_F32,
        CTOR_F64,
        CTOR_J,
        CTOR_V,
        CTOR_R,
        CTOR_P,
    }

    @CxxClass("natj::cxx::tests::inheritance::Constructors")
    @CxxHeader("inheritance/Constructors.hpp")
    @CxxDefaultConstructorUnavailable
    private interface Constructors {
        @CxxMethod()
        int invoked();
    }

    @CxxInheritedClass("natj::java::tests::inheritance::Constructor")
    private static class Inherited extends CxxInheritedObject implements Constructors {

        @CxxInheritedConstructor()
        private static native long newI1(long java, boolean value);

        @CxxInheritedConstructor()
        private static native long newC8(long java, byte value);

        @CxxInheritedConstructor()
        private static native long newC16(long java, @CxxChar16T char value);

        @CxxInheritedConstructor()
        private static native long newC32(long java, @CxxChar32T int value);

        @CxxInheritedConstructor()
        private static native long newCWI(long java, @WCharT int value);

        @CxxInheritedConstructor()
        private static native long newI8(long java, @CxxSigned byte value);

        @CxxInheritedConstructor()
        private static native long newI16(long java, short value);

        @CxxInheritedConstructor()
        private static native long newI32(long java, int value);

        @CxxInheritedConstructor()
        private static native long newIL(long java, @NLong long value);

        @CxxInheritedConstructor()
        private static native long newI64(long java, long value);

        @CxxInheritedConstructor()
        private static native long newU8(long java, @CxxUnsigned byte value);

        @CxxInheritedConstructor()
        private static native long newU16(long java, char value);

        @CxxInheritedConstructor()
        private static native long newU32(long java, @CxxUnsigned int value);

        @CxxInheritedConstructor()
        private static native long newUL(long java, @NULong long value);

        @CxxInheritedConstructor()
        private static native long newU64(long java, @CxxUnsigned long value);

        @CxxInheritedConstructor()
        private static native long newF32(long java, float value);

        @CxxInheritedConstructor()
        private static native long newF64(long java, double value);

        @CxxInheritedConstructor()
        private static native long newJ(long java, @CxxJavaObject Object value);

        @CxxInheritedConstructor()
        private static native long newV(long java, @CxxByValue MyClass value);

        /* C++ can't choose between this and the by value case
        @CxxInheritedConstructor()
        private static native long newR(long java, @CxxByReference MyClass value);
        */

        @CxxInheritedConstructor()
        private static native long newP(long java, MyClass value);

        public Inherited(final InvocationID ctor) {
            super(new ICxxConstructor() {
                @Override
                public long construct(long java) {
                    switch (ctor) {
                        case CTOR_I1:
                            return newI1(java, VALUE_I1);
                        case CTOR_C8:
                            return newC8(java, VALUE_C8);
                        case CTOR_C16:
                            return newC16(java, VALUE_C16);
                        case CTOR_C32:
                            return newC32(java, VALUE_C32);
                        case CTOR_CWI:
                            return newCWI(java, VALUE_CWI);
                        case CTOR_I8:
                            return newI8(java, VALUE_I8);
                        case CTOR_I16:
                            return newI16(java, VALUE_I16);
                        case CTOR_I32:
                            return newI32(java, VALUE_I32);
                        case CTOR_IL:
                            return newIL(java, VALUE_IL);
                        case CTOR_I64:
                            return newI64(java, VALUE_I64);
                        case CTOR_U8:
                            return newU8(java, VALUE_U8);
                        case CTOR_U16:
                            return newU16(java, VALUE_U16);
                        case CTOR_U32:
                            return newU32(java, VALUE_U32);
                        case CTOR_UL:
                            return newUL(java, VALUE_UL);
                        case CTOR_U64:
                            return newU64(java, VALUE_U64);
                        case CTOR_F32:
                            return newF32(java, VALUE_F32);
                        case CTOR_F64:
                            return newF64(java, VALUE_F64);
                        case CTOR_J:
                            return newJ(java, JAVA_OBJECT);
                        case CTOR_V:
                            return newV(java, MY_CLASS);
                        /* C++ can't choose between this and the by value case
                        case CTOR_R:
                            return newR(java, MY_CLASS);
                        */
                        case CTOR_P:
                            return newP(java, MY_CLASS);
                        default:
                            throw new IllegalStateException();
                    }
                }
            });
        }

        @CxxMethod()
        public native int invoked();
    }

    @Test
    public void testI1Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_I1);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_I1.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC8Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_C8);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_C8.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC16Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_C16);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_C16.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testC32Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_C32);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_C32.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testCWIConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_CWI);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_CWI.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI8Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_I8);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_I8.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI16Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_I16);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_I16.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI32Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_I32);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_I32.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testILConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_IL);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_IL.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testI64Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_I64);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_I64.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU8Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_U8);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_U8.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU16Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_U16);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_U16.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU32Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_U32);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_U32.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testULConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_UL);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_UL.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testU64Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_U64);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_U64.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testF32Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_F32);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(inherited.invoked(), InvocationID.CTOR_F32.ordinal());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testF64Constructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_F64);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_F64.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testJConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_J);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_J.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    @Test
    public void testVConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_V);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_V.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }

    /* C++ can't choose between this and the by value case
    @Test
    public void testRConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_R);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_R.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }
    */

    @Test
    public void testPConstructor() {
        Inherited inherited = new Inherited(InvocationID.CTOR_P);
        assertNotNull(inherited);
        assertNotEquals(inherited._cxx_rt_peer(), 0);
        assertEquals(InvocationID.CTOR_P.ordinal(), inherited.invoked());
        CxxRuntime.delete(inherited);
    }
}
