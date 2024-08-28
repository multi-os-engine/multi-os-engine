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
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;
import cxx.interfaces.Primitives;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimitivesTests extends NatJTest {

    private enum InvocationID {
        ILLEGAL,
        CTOR_PRIMITIVES,
        CTOR_I1,
        CTOR_I8,
        CTOR_I16,
        CTOR_I32,
        CTOR_IL,
        CTOR_I64,
        CTOR_U8,
        CTOR_U16,
        CTOR_U32,
        CTOR_U64,
        CTOR_UL,
        CTOR_F32,
        CTOR_F64,
        CTOR_C8,
        CTOR_C16,
        CTOR_C32,
        CTOR_CWI,
        GET_I1,
        GET_I8,
        GET_I16,
        GET_I32,
        GET_IL,
        GET_I64,
        GET_U8,
        GET_U16,
        GET_U32,
        GET_UL,
        GET_U64,
        GET_F32,
        GET_F64,
        GET_C8,
        GET_C16,
        GET_C32,
        GET_CWI,
        SET_I1,
        SET_I8,
        SET_I16,
        SET_I32,
        SET_IL,
        SET_I64,
        SET_U8,
        SET_U16,
        SET_U32,
        SET_UL,
        SET_U64,
        SET_F32,
        SET_F64,
        SET_C8,
        SET_C16,
        SET_C32,
        SET_CWI,
        PASS_I1,
        PASS_I8,
        PASS_I16,
        PASS_I32,
        PASS_IL,
        PASS_I64,
        PASS_U8,
        PASS_U16,
        PASS_U32,
        PASS_UL,
        PASS_U64,
        PASS_F32,
        PASS_F64,
        PASS_C8,
        PASS_C16,
        PASS_C32,
        PASS_CWI,
    }

    @CxxGlobalGetter("natj::cxx::tests::binding::Primitives::lastInvocation")
    private static native int lastInvocation();

    @CxxConstructor()
    private static native Primitives newPrimitives();

    @CxxConstructor()
    private static native Primitives newPrimitivesI1(boolean seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesI8(@CxxSigned byte seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesI16(short seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesI32(int seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesIL(@NLong long seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesI64(long seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesU8(@CxxUnsigned byte seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesU16(char seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesU32(@CxxUnsigned int seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesUL(@NULong long seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesU64(@CxxUnsigned long seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesF32(float seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesF64(double seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesC8(byte seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesC16(@CxxChar16T char seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesC32(@CxxChar32T int seed);

    @CxxConstructor()
    private static native Primitives newPrimitivesCWI(@WCharT int seed);

    private static void assertLastInvocation(InvocationID inv) {
        assertNotNull(inv);
        assertEquals(inv.ordinal(), lastInvocation());
    }

    @Test
    public void testInstanceMethodI1() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_I1);
        assertLastInvocation(InvocationID.SET_I1);
        assertTrue(p.getI1());
        assertLastInvocation(InvocationID.GET_I1);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodI8() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__1s(VALUE_I8);
        assertLastInvocation(InvocationID.SET_I8);
        assertEquals(VALUE_I8, p.getI8());
        assertLastInvocation(InvocationID.GET_I8);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodC8() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_C8);
        assertLastInvocation(InvocationID.SET_C8);
        assertEquals(VALUE_C8, p.getC8());
        assertLastInvocation(InvocationID.GET_C8);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodC16() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__3c16(VALUE_C16);
        assertLastInvocation(InvocationID.SET_C16);
        assertEquals(VALUE_C16, p.getC16());
        assertLastInvocation(InvocationID.GET_C16);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodC32() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__3c32(VALUE_C32);
        assertLastInvocation(InvocationID.SET_C32);
        assertEquals(VALUE_C32, p.getC32());
        assertLastInvocation(InvocationID.GET_C32);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodCWI() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__3cwi(VALUE_CWI);
        assertLastInvocation(InvocationID.SET_CWI);
        assertEquals(VALUE_CWI, p.getCWI());
        assertLastInvocation(InvocationID.GET_CWI);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodI16() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_I16);
        assertLastInvocation(InvocationID.SET_I16);
        assertEquals(VALUE_I16, p.getI16());
        assertLastInvocation(InvocationID.GET_I16);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodI32() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_I32);
        assertLastInvocation(InvocationID.SET_I32);
        assertEquals(VALUE_I32, p.getI32());
        assertLastInvocation(InvocationID.GET_I32);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodIL() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__1n(VALUE_IL);
        assertLastInvocation(InvocationID.SET_IL);
        assertEquals(VALUE_IL, p.getIL());
        assertLastInvocation(InvocationID.GET_IL);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodI64() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_I64);
        assertLastInvocation(InvocationID.SET_I64);
        assertEquals(VALUE_I64, p.getI64());
        assertLastInvocation(InvocationID.GET_I64);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodU8() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__1u(VALUE_U8);
        assertLastInvocation(InvocationID.SET_U8);
        assertEquals(VALUE_U8, p.getU8());
        assertLastInvocation(InvocationID.GET_U8);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodU16() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_U16);
        assertLastInvocation(InvocationID.SET_U16);
        assertEquals(VALUE_U16, p.getU16());
        assertLastInvocation(InvocationID.GET_U16);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodU32() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__1u(VALUE_U32);
        assertLastInvocation(InvocationID.SET_U32);
        assertEquals(VALUE_U32, p.getU32());
        assertLastInvocation(InvocationID.GET_U32);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodUL() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__1un(VALUE_UL);
        assertLastInvocation(InvocationID.SET_UL);
        assertEquals(VALUE_UL, p.getUL());
        assertLastInvocation(InvocationID.GET_UL);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodU64() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set__1u(VALUE_U64);
        assertLastInvocation(InvocationID.SET_U64);
        assertEquals(VALUE_U64, p.getU64());
        assertLastInvocation(InvocationID.GET_U64);

        CxxRuntime.delete(p);
    }

    @Test
    public void testInstanceMethodF32() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_F32);
        assertLastInvocation(InvocationID.SET_F32);
        assertEquals(Math.round(VALUE_F32), p.getF32(), DELTA_F);
        assertLastInvocation(InvocationID.GET_F32);

        CxxRuntime.delete(p);
    }


    @Test
    public void testInstanceMethodF64() {
        Primitives p = newPrimitives();
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_PRIMITIVES);

        p.set(VALUE_F64);
        assertLastInvocation(InvocationID.SET_F64);
        assertEquals(Math.round(VALUE_F64), p.getF64(), DELTA_D);
        assertLastInvocation(InvocationID.GET_F64);

        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorI1() {
        Primitives p = newPrimitivesI1(VALUE_I1);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_I1);
        assertEquals(VALUE_I1, p.getI1());
        assertLastInvocation(InvocationID.GET_I1);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorI8() {
        Primitives p = newPrimitivesI8(VALUE_I8);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_I8);
        assertEquals(VALUE_I8, p.getI8());
        assertLastInvocation(InvocationID.GET_I8);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorI16() {
        Primitives p = newPrimitivesI16(VALUE_I16);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_I16);
        assertEquals(VALUE_I16, p.getI16());
        assertLastInvocation(InvocationID.GET_I16);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorI32() {
        Primitives p = newPrimitivesI32(VALUE_I32);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_I32);
        assertEquals(VALUE_I32, p.getI32());
        assertLastInvocation(InvocationID.GET_I32);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorIL() {
        Primitives p = newPrimitivesIL(VALUE_IL);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_IL);
        assertEquals(VALUE_IL, p.getIL());
        assertLastInvocation(InvocationID.GET_IL);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorI64() {
        Primitives p = newPrimitivesI64(VALUE_I64);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_I64);
        assertEquals(VALUE_I64, p.getI64());
        assertLastInvocation(InvocationID.GET_I64);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorU8() {
        Primitives p = newPrimitivesU8(VALUE_U8);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_U8);
        assertEquals(VALUE_U8, p.getU8());
        assertLastInvocation(InvocationID.GET_U8);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorU16() {
        Primitives p = newPrimitivesU16(VALUE_U16);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_U16);
        assertEquals(VALUE_U16, p.getU16());
        assertLastInvocation(InvocationID.GET_U16);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorU32() {
        Primitives p = newPrimitivesU32(VALUE_U32);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_U32);
        assertEquals(VALUE_U32, p.getU32());
        assertLastInvocation(InvocationID.GET_U32);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorUL() {
        Primitives p = newPrimitivesUL(VALUE_UL);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_UL);
        assertEquals(VALUE_UL, p.getUL());
        assertLastInvocation(InvocationID.GET_UL);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorU64() {
        Primitives p = newPrimitivesU64(VALUE_U64);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_U64);
        assertEquals(VALUE_U64, p.getU64());
        assertLastInvocation(InvocationID.GET_U64);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorF32() {
        Primitives p = newPrimitivesF32(VALUE_F32);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_F32);
        assertEquals(Math.round(VALUE_F32), p.getF32(), DELTA_F);
        assertLastInvocation(InvocationID.GET_F32);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorF64() {
        Primitives p = newPrimitivesF64(VALUE_F64);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_F64);
        assertEquals(Math.round(VALUE_F64), p.getF64(), DELTA_D);
        assertLastInvocation(InvocationID.GET_F64);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorC8() {
        Primitives p = newPrimitivesC8(VALUE_C8);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_C8);
        assertEquals(VALUE_C8, p.getC8());
        assertLastInvocation(InvocationID.GET_C8);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorC16() {
        Primitives p = newPrimitivesC16(VALUE_C16);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_C16);
        assertEquals(VALUE_C16, p.getC16());
        assertLastInvocation(InvocationID.GET_C16);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorC32() {
        Primitives p = newPrimitivesC32(VALUE_C32);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_C32);
        assertEquals(VALUE_C32, p.getC32());
        assertLastInvocation(InvocationID.GET_C32);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstructorCWI() {
        Primitives p = newPrimitivesCWI(VALUE_CWI);
        assertNotNull(p);
        assertLastInvocation(InvocationID.CTOR_CWI);
        assertEquals(VALUE_CWI, p.getCWI());
        assertLastInvocation(InvocationID.GET_CWI);
        CxxRuntime.delete(p);
    }

    /* Requires Java 8
    @Test
    public void testClassMethodI1() {
        assertTrue(Primitives.pass(VALUE_I1));
        assertLastInvocation(InvocationID.PASS_I1);
    }

    @Test
    public void testClassMethodI8() {
        assertEquals(VALUE_I8, Primitives.pass__1s(VALUE_I8));
        assertLastInvocation(InvocationID.PASS_I8);
    }

    @Test
    public void testClassMethodC8() {
        assertEquals(VALUE_C8, Primitives.pass(VALUE_C8));
        assertLastInvocation(InvocationID.PASS_C8);
    }

    @Test
    public void testClassMethodI16() {
        assertEquals(VALUE_I16, Primitives.pass(VALUE_I16));
        assertLastInvocation(InvocationID.PASS_I16);
    }

    @Test
    public void testClassMethodI32() {
        assertEquals(VALUE_I32, Primitives.pass(VALUE_I32));
        assertLastInvocation(InvocationID.PASS_I32);
    }

    @Test
    public void testClassMethodIL() {
        assertEquals(VALUE_IL, Primitives.pass__1n(VALUE_IL));
        assertLastInvocation(InvocationID.PASS_IL);
    }

    @Test
    public void testClassMethodI64() {
        assertEquals(VALUE_I64, Primitives.pass(VALUE_I64));
        assertLastInvocation(InvocationID.PASS_I64);
    }

    @Test
    public void testClassMethodU8() {
        assertEquals(VALUE_U8, Primitives.pass__1u(VALUE_U8));
        assertLastInvocation(InvocationID.PASS_U8);
    }
     
    @Test
    public void testClassMethodU16() {
        assertEquals(VALUE_U16, Primitives.pass(VALUE_U16));
        assertLastInvocation(InvocationID.PASS_U16);
    }

    @Test
    public void testClassMethodU32() {
        assertEquals(VALUE_U32, Primitives.pass__1u(VALUE_U32));
        assertLastInvocation(InvocationID.PASS_U32);
    }

    @Test
    public void testClassMethodUL() {
        assertEquals(VALUE_UL, Primitives.pass__1un(VALUE_UL));
        assertLastInvocation(InvocationID.PASS_UL);
    }

    @Test
    public void testClassMethodU64() {
        assertEquals(VALUE_U64, Primitives.pass__1u(VALUE_U64));
        assertLastInvocation(InvocationID.PASS_U64);
    }

    @Test
    public void testClassMethodF32() {
        assertEquals(VALUE_F32, Primitives.pass(VALUE_F32), DELTA_F);
        assertLastInvocation(InvocationID.PASS_F32);
    }

    @Test
    public void testClassMethodF64() {
        assertEquals(VALUE_F64, Primitives.pass(VALUE_F64), DELTA_D);
        assertLastInvocation(InvocationID.PASS_F64);
    }
    */

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native boolean pass(boolean value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native byte pass(byte value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @CxxChar16T
    private static native char pass__3c16(@CxxChar16T char value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @CxxChar32T
    private static native int pass__3c32(@CxxChar32T int value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @WCharT
    private static native int pass__3cwi(@WCharT int value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @CxxSigned
    private static native byte pass__1s(@CxxSigned byte value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native short pass(short value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native int pass(int value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @NLong
    private static native long pass__1n(@NLong long value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native long pass(long value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @CxxUnsigned
    private static native byte pass__1u(@CxxUnsigned byte value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native char pass(char value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @CxxUnsigned
    private static native int pass__1u(@CxxUnsigned int value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @NULong
    private static native long pass__1un(@NULong long value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    @CxxUnsigned
    private static native long pass__1u(@CxxUnsigned long value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native float pass(float value);

    @CxxFunction("natj::cxx::tests::binding::Primitives::pass")
    private static native double pass(double value);

    @Test
    public void testClassMethodI1_Java7() {
        assertTrue(pass(VALUE_I1));
        assertLastInvocation(InvocationID.PASS_I1);
    }

    @Test
    public void testClassMethodI8_Java7() {
        assertEquals(VALUE_I8, pass__1s(VALUE_I8));
        assertLastInvocation(InvocationID.PASS_I8);
    }

    @Test
    public void testClassMethodC8_Java7() {
        assertEquals(VALUE_C8, pass(VALUE_C8));
        assertLastInvocation(InvocationID.PASS_C8);
    }

    @Test
    public void testClassMethodC16_Java7() {
        assertEquals(VALUE_C16, pass__3c16(VALUE_C16));
        assertLastInvocation(InvocationID.PASS_C16);
    }

    @Test
    public void testClassMethodC32_Java7() {
        assertEquals(VALUE_C32, pass__3c32(VALUE_C32));
        assertLastInvocation(InvocationID.PASS_C32);
    }

    @Test
    public void testClassMethodCWI_Java7() {
        assertEquals(VALUE_CWI, pass__3cwi(VALUE_CWI));
        assertLastInvocation(InvocationID.PASS_CWI);
    }

    @Test
    public void testClassMethodI16_Java7() {
        assertEquals(VALUE_I16, pass(VALUE_I16));
        assertLastInvocation(InvocationID.PASS_I16);
    }

    @Test
    public void testClassMethodI32_Java7() {
        assertEquals(VALUE_I32, pass(VALUE_I32));
        assertLastInvocation(InvocationID.PASS_I32);
    }

    @Test
    public void testClassMethodIL_Java7() {
        assertEquals(VALUE_IL, pass__1n(VALUE_IL));
        assertLastInvocation(InvocationID.PASS_IL);
    }

    @Test
    public void testClassMethodI64_Java7() {
        assertEquals(VALUE_I64, pass(VALUE_I64));
        assertLastInvocation(InvocationID.PASS_I64);
    }

    @Test
    public void testClassMethodU8_Java7() {
        assertEquals(VALUE_U8, pass__1u(VALUE_U8));
        assertLastInvocation(InvocationID.PASS_U8);
    }

    @Test
    public void testClassMethodU16_Java7() {
        assertEquals(VALUE_U16, pass(VALUE_U16));
        assertLastInvocation(InvocationID.PASS_U16);
    }

    @Test
    public void testClassMethodU32_Java7() {
        assertEquals(VALUE_U32, pass__1u(VALUE_U32));
        assertLastInvocation(InvocationID.PASS_U32);
    }

    @Test
    public void testClassMethodUL_Java7() {
        assertEquals(VALUE_UL, pass__1un(VALUE_UL));
        assertLastInvocation(InvocationID.PASS_UL);
    }

    @Test
    public void testClassMethodU64_Java7() {
        assertEquals(VALUE_U64, pass__1u(VALUE_U64));
        assertLastInvocation(InvocationID.PASS_U64);
    }

    @Test
    public void testClassMethodF32_Java7() {
        assertEquals(VALUE_F32, pass(VALUE_F32), DELTA_F);
        assertLastInvocation(InvocationID.PASS_F32);
    }

    @Test
    public void testClassMethodF64_Java7() {
        assertEquals(VALUE_F64, pass(VALUE_F64), DELTA_D);
        assertLastInvocation(InvocationID.PASS_F64);
    }
}

