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
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ptr.*;
import org.moe.natj.general.ptr.impl.PtrFactory;
import cxx.tests.NatJTest;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@CxxHeader("binding/Pointers.hpp")
public class PrimitivePointerTests extends NatJTest {

    @CxxClass("natj::cxx::tests::binding::PointerContainer<bool>")
    private interface I1 extends CxxObject {
        @CxxMethod
        BoolPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstBoolPtr get_const();

        @CxxMethod
        void set(BoolPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstBoolPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<char>")
    private interface C8 extends CxxObject {
        @CxxMethod
        BytePtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstBytePtr get_const();

        @CxxMethod
        void set(BytePtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstBytePtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<char16_t>")
    private interface C16 extends CxxObject {
        @CxxMethod
        @CxxChar16T
        CharPtr get();

        @CxxMethod(value = "get", isConst = true)
        @CxxChar16T
        ConstCharPtr get_const();

        @CxxMethod
        void set(@CxxChar16T CharPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(@CxxChar16T ConstCharPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<char32_t>")
    private interface C32 extends CxxObject {
        @CxxMethod
        @CxxChar32T
        IntPtr get();

        @CxxMethod(value = "get", isConst = true)
        @CxxChar32T
        ConstIntPtr get_const();

        @CxxMethod
        void set(@CxxChar32T IntPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(@CxxChar32T ConstIntPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<wchar_t>")
    private interface CWI extends CxxObject {
        @CxxMethod
        WCharTPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstWCharTPtr get_const();

        @CxxMethod
        void set(WCharTPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstWCharTPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<signed char>")
    private interface I8 extends CxxObject {
        @CxxMethod
        @CxxSigned
        BytePtr get();

        @CxxMethod(value = "get", isConst = true)
        @CxxSigned
        ConstBytePtr get_const();

        @CxxMethod
        void set(@CxxSigned BytePtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(@CxxSigned ConstBytePtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<short>")
    private interface I16 extends CxxObject {
        @CxxMethod
        ShortPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstShortPtr get_const();

        @CxxMethod
        void set(ShortPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstShortPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<int>")
    private interface I32 extends CxxObject {
        @CxxMethod
        IntPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstIntPtr get_const();

        @CxxMethod
        void set(IntPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstIntPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<long>")
    private interface IL extends CxxObject {
        @CxxMethod
        NLongPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstNLongPtr get_const();

        @CxxMethod
        void set(NLongPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstNLongPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<long long>")
    private interface I64 extends CxxObject {
        @CxxMethod
        LongPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstLongPtr get_const();

        @CxxMethod
        void set(LongPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstLongPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<unsigned char>")
    private interface U8 extends CxxObject {
        @CxxMethod
        @CxxUnsigned
        BytePtr get();

        @CxxMethod(value = "get", isConst = true)
        @CxxUnsigned
        ConstBytePtr get_const();

        @CxxMethod
        void set(@CxxUnsigned BytePtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(@CxxUnsigned ConstBytePtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<unsigned short>")
    private interface U16 extends CxxObject {
        @CxxMethod
        CharPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstCharPtr get_const();

        @CxxMethod
        void set(CharPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstCharPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<unsigned int>")
    private interface U32 extends CxxObject {
        @CxxMethod
        @CxxUnsigned
        IntPtr get();

        @CxxMethod(value = "get", isConst = true)
        @CxxUnsigned
        ConstIntPtr get_const();

        @CxxMethod
        void set(@CxxUnsigned IntPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(@CxxUnsigned ConstIntPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<unsigned long>")
    private interface UL extends CxxObject {
        @CxxMethod
        NULongPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstNULongPtr get_const();

        @CxxMethod
        void set(NULongPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstNULongPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<unsigned long long>")
    private interface U64 extends CxxObject {
        @CxxMethod
        @CxxUnsigned
        LongPtr get();

        @CxxMethod(value = "get", isConst = true)
        @CxxUnsigned
        ConstLongPtr get_const();

        @CxxMethod
        void set(@CxxUnsigned LongPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(@CxxUnsigned ConstLongPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<float>")
    private interface F32 extends CxxObject {
        @CxxMethod
        FloatPtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstFloatPtr get_const();

        @CxxMethod
        void set(FloatPtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstFloatPtr ptr, @NULong long size);
    }

    @CxxClass("natj::cxx::tests::binding::PointerContainer<double>")
    private interface F64 extends CxxObject {
        @CxxMethod
        DoublePtr get();

        @CxxMethod(value = "get", isConst = true)
        ConstDoublePtr get_const();

        @CxxMethod
        void set(DoublePtr ptr, @NULong long size);

        @CxxMethod("set")
        void set_const(ConstDoublePtr ptr, @NULong long size);
    }

    @CxxConstructor()
    private static native I1 newI1();

    @CxxConstructor()
    private static native C8 newC8();

    @CxxConstructor()
    private static native C16 newC16();

    @CxxConstructor()
    private static native C32 newC32();

    @CxxConstructor()
    private static native CWI newCWI();

    @CxxConstructor()
    private static native I8 newI8();

    @CxxConstructor()
    private static native I16 newI16();

    @CxxConstructor()
    private static native I32 newI32();

    @CxxConstructor()
    private static native IL newIL();

    @CxxConstructor()
    private static native I64 newI64();

    @CxxConstructor()
    private static native U8 newU8();

    @CxxConstructor()
    private static native U16 newU16();

    @CxxConstructor()
    private static native U32 newU32();

    @CxxConstructor()
    private static native UL newUL();

    @CxxConstructor()
    private static native U64 newU64();

    @CxxConstructor()
    private static native F32 newF32();

    @CxxConstructor()
    private static native F64 newF64();

    private <T> void swapValues(T[] values) {
        assertNotNull(values);
        assertEquals(2, values.length);
        T tmp = values[0];
        values[0] = values[1];
        values[1] = tmp;
    }

    private <T> void doTestInternal(final CxxObject cont, final Ptr<T> ptr, final T[] values) throws
            InvocationTargetException, IllegalAccessException {
        // Pre-check
        assertNotNull(cont);
        assertNotNull(ptr);
        assertNotNull(values);
        assertEquals(2, values.length);
        ptr.copyFrom(values);

        // Lookup methods
        Method mGet = null;
        Method mGetConst = null;
        Method mSet = null;
        Method mSetConst = null;
        {
            final List<Method> methods = Arrays.asList(cont.getClass().getDeclaredMethods());
            for (Method method : methods) {
                final String methodName = method.getName();
                if ("get".equals(methodName)) {
                    assertNull(mGet);
                    mGet = method;
                }
                if ("get_const".equals(methodName)) {
                    assertNull(mGetConst);
                    mGetConst = method;
                }
                if ("set".equals(methodName)) {
                    assertNull(mSet);
                    mSet = method;
                }
                if ("set_const".equals(methodName)) {
                    assertNull(mSetConst);
                    mSetConst = method;
                }
            }
        }
        assertNotNull(mGet);
        assertNotNull(mGetConst);
        assertNotNull(mSet);
        assertNotNull(mSetConst);

        // Do tests
        assertNull(mGet.invoke(cont));
        assertNull(mGetConst.invoke(cont));
        mSet.invoke(cont, ptr, 2);
        assertNotNull(mGet.invoke(cont));
        assertNotNull(mGetConst.invoke(cont));
        assertEquals(((Ptr<T>) mGet.invoke(cont)).getPeer().getPeer(),
                ((Ptr<T>) mGetConst.invoke(cont)).getPeer().getPeer());
        assertArrayEquals(values, ((Ptr<T>) mGet.invoke(cont)).toArray(2));

        swapValues(values);
        ptr.copyFrom(values);
        mSetConst.invoke(cont, ptr, 2);
        assertNotNull(mGet.invoke(cont));
        assertNotNull(mGetConst.invoke(cont));
        assertEquals(((Ptr<T>) mGet.invoke(cont)).getPeer().getPeer(),
                ((Ptr<T>) mGetConst.invoke(cont)).getPeer().getPeer());
        assertArrayEquals(values, ((Ptr<T>) mGet.invoke(cont)).toArray(2));
    }

    //@SafeVarargs
    private final <T> void doTest(final CxxObject cont, final Ptr<T> ptr, final T... values) throws
            InvocationTargetException, IllegalAccessException {
        try {
            doTestInternal(cont, ptr, values);
        } finally {
            if (cont != null) {
                CxxRuntime.delete(cont);
            }
        }
    }

    @Test
    public void testI1() throws InvocationTargetException, IllegalAccessException {
        doTest(newI1(), PtrFactory.newBoolArray(2), VALUE_I1, VALUE_I1_2);
    }

    @Test
    public void testC8() throws InvocationTargetException, IllegalAccessException {
        doTest(newC8(), PtrFactory.newByteArray(2), VALUE_C8, VALUE_C8_2);
    }

    @Test
    public void testC16() throws InvocationTargetException, IllegalAccessException {
        doTest(newC16(), PtrFactory.newCharArray(2), VALUE_C16, VALUE_C16_2);
    }

    @Test
    public void testC32() throws InvocationTargetException, IllegalAccessException {
        doTest(newC32(), PtrFactory.newIntArray(2), VALUE_C32, VALUE_C32_2);
    }

    @Test
    public void testCWI() throws InvocationTargetException, IllegalAccessException {
        doTest(newCWI(), PtrFactory.newWCharTArray(2), VALUE_CWI, VALUE_CWI_2);
    }

    @Test
    public void testI8() throws InvocationTargetException, IllegalAccessException {
        doTest(newI8(), PtrFactory.newByteArray(2), VALUE_I8, VALUE_I8_2);
    }

    @Test
    public void testI16() throws InvocationTargetException, IllegalAccessException {
        doTest(newI16(), PtrFactory.newShortArray(2), VALUE_I16, VALUE_I16_2);
    }

    @Test
    public void testI32() throws InvocationTargetException, IllegalAccessException {
        doTest(newI32(), PtrFactory.newIntArray(2), VALUE_I32, VALUE_I32_2);
    }

    @Test
    public void testIL() throws InvocationTargetException, IllegalAccessException {
        doTest(newIL(), PtrFactory.newNLongArray(2), VALUE_IL, VALUE_IL_2);
    }

    @Test
    public void testI64() throws InvocationTargetException, IllegalAccessException {
        doTest(newI64(), PtrFactory.newLongArray(2), VALUE_I64, VALUE_I64_2);
    }

    @Test
    public void testU8() throws InvocationTargetException, IllegalAccessException {
        doTest(newU8(), PtrFactory.newByteArray(2), VALUE_U8, VALUE_U8_2);
    }

    @Test
    public void testU16() throws InvocationTargetException, IllegalAccessException {
        doTest(newU16(), PtrFactory.newCharArray(2), VALUE_U16, VALUE_U16_2);
    }

    @Test
    public void testU32() throws InvocationTargetException, IllegalAccessException {
        doTest(newU32(), PtrFactory.newIntArray(2), VALUE_U32, VALUE_U32_2);
    }

    @Test
    public void testUL() throws InvocationTargetException, IllegalAccessException {
        doTest(newUL(), PtrFactory.newNULongArray(2), VALUE_UL, VALUE_UL_2);
    }

    @Test
    public void testU64() throws InvocationTargetException, IllegalAccessException {
        doTest(newU64(), PtrFactory.newLongArray(2), VALUE_U64, VALUE_U64_2);
    }

    @Test
    public void testF32() throws InvocationTargetException, IllegalAccessException {
        doTest(newF32(), PtrFactory.newFloatArray(2), VALUE_F32, VALUE_F32_2);
    }

    @Test
    public void testF64() throws InvocationTargetException, IllegalAccessException {
        doTest(newF64(), PtrFactory.newDoubleArray(2), VALUE_F64, VALUE_F64_2);
    }
}
