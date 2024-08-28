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

import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;
import org.moe.natj.general.ptr.*;
import org.moe.natj.general.ptr.impl.PtrFactory;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimitivesByReferenceTests extends NatJTest {

    @CxxFunction("getAddressOfReferenceAndSet<bool>")
    private static native VoidPtr getAORAndSet_I1(boolean value, @CxxByReference BoolPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<char>")
    private static native VoidPtr getAORAndSet_C8(byte value, @CxxByReference BytePtr target);

    @CxxFunction("getAddressOfReferenceAndSet<signed char>")
    private static native VoidPtr getAORAndSet_I8(@CxxSigned byte value, @CxxByReference @CxxSigned BytePtr target);

    @CxxFunction("getAddressOfReferenceAndSet<short>")
    private static native VoidPtr getAORAndSet_I16(short value, @CxxByReference ShortPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<int>")
    private static native VoidPtr getAORAndSet_I32(int value, @CxxByReference IntPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<long>")
    private static native VoidPtr getAORAndSet_IL(@NLong long value, @CxxByReference NLongPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<long long>")
    private static native VoidPtr getAORAndSet_I64(long value, @CxxByReference LongPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<unsigned char>")
    private static native VoidPtr getAORAndSet_U8(@CxxUnsigned byte value, @CxxByReference @CxxUnsigned BytePtr target);

    @CxxFunction("getAddressOfReferenceAndSet<unsigned short>")
    private static native VoidPtr getAORAndSet_U16(char value, @CxxByReference CharPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<unsigned int>")
    private static native VoidPtr getAORAndSet_U32(@CxxUnsigned int value, @CxxByReference @CxxUnsigned IntPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<unsigned long>")
    private static native VoidPtr getAORAndSet_UL(@NULong long value, @CxxByReference NULongPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<unsigned long long>")
    private static native VoidPtr getAORAndSet_U64(@CxxUnsigned long value, @CxxByReference @CxxUnsigned LongPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<float>")
    private static native VoidPtr getAORAndSet_F32(float value, @CxxByReference FloatPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<double>")
    private static native VoidPtr getAORAndSet_F64(double value, @CxxByReference DoublePtr target);

    @CxxFunction("getAddressOfReferenceAndSet<char16_t>")
    private static native VoidPtr getAORAndSet_C16(@CxxChar16T char value, @CxxByReference @CxxChar16T CharPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<char32_t>")
    private static native VoidPtr getAORAndSet_C32(@CxxChar32T int value, @CxxByReference @CxxChar32T IntPtr target);

    @CxxFunction("getAddressOfReferenceAndSet<wchar_t>")
    private static native VoidPtr getAORAndSet_CWI(@WCharT int value, @CxxByReference WCharTPtr target);

    @Test
    public void testGetAORAndSet_I1() {
        BoolPtr target = PtrFactory.newBoolReference(VALUE_I1);
        final ConstVoidPtr addr = getAORAndSet_I1(VALUE_I1_2, target);
        assertEquals(VALUE_I1_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_C8() {
        BytePtr target = PtrFactory.newByteReference(VALUE_C8);
        final ConstVoidPtr addr = getAORAndSet_C8(VALUE_C8_2, target);
        assertEquals(VALUE_C8_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_I8() {
        BytePtr target = PtrFactory.newByteReference(VALUE_I8);
        final ConstVoidPtr addr = getAORAndSet_I8(VALUE_I8_2, target);
        assertEquals(VALUE_I8_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_I16() {
        ShortPtr target = PtrFactory.newShortReference(VALUE_I16);
        final ConstVoidPtr addr = getAORAndSet_I16(VALUE_I16_2, target);
        assertEquals(VALUE_I16_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_I32() {
        IntPtr target = PtrFactory.newIntReference(VALUE_I32);
        final ConstVoidPtr addr = getAORAndSet_I32(VALUE_I32_2, target);
        assertEquals(VALUE_I32_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_IL() {
        NLongPtr target = PtrFactory.newNLongReference(VALUE_IL);
        final ConstVoidPtr addr = getAORAndSet_IL(VALUE_IL_2, target);
        assertEquals(VALUE_IL_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_I64() {
        LongPtr target = PtrFactory.newLongReference(VALUE_I64);
        final ConstVoidPtr addr = getAORAndSet_I64(VALUE_I64_2, target);
        assertEquals(VALUE_I64_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_U8() {
        BytePtr target = PtrFactory.newByteReference(VALUE_U8);
        final ConstVoidPtr addr = getAORAndSet_U8(VALUE_U8_2, target);
        assertEquals(VALUE_U8_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_U16() {
        CharPtr target = PtrFactory.newCharReference(VALUE_U16);
        final ConstVoidPtr addr = getAORAndSet_U16(VALUE_U16_2, target);
        assertEquals(VALUE_U16_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_U32() {
        IntPtr target = PtrFactory.newIntReference(VALUE_U32);
        final ConstVoidPtr addr = getAORAndSet_U32(VALUE_U32_2, target);
        assertEquals(VALUE_U32_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_UL() {
        NULongPtr target = PtrFactory.newNULongReference(VALUE_UL);
        final ConstVoidPtr addr = getAORAndSet_UL(VALUE_UL_2, target);
        assertEquals(VALUE_UL_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_U64() {
        LongPtr target = PtrFactory.newLongReference(VALUE_U64);
        final ConstVoidPtr addr = getAORAndSet_U64(VALUE_U64_2, target);
        assertEquals(VALUE_U64_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_F32() {
        FloatPtr target = PtrFactory.newFloatReference(VALUE_F32);
        final ConstVoidPtr addr = getAORAndSet_F32(VALUE_F32_2, target);
        assertEquals(VALUE_F32_2, target.getValue(), 0.0);
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_F64() {
        DoublePtr target = PtrFactory.newDoubleReference(VALUE_F64);
        final ConstVoidPtr addr = getAORAndSet_F64(VALUE_F64_2, target);
        assertEquals(VALUE_F64_2, target.getValue(), 0.0);
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_C16() {
        CharPtr target = PtrFactory.newCharReference(VALUE_C16);
        final ConstVoidPtr addr = getAORAndSet_C16(VALUE_C16_2, target);
        assertEquals(VALUE_C16_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_C32() {
        IntPtr target = PtrFactory.newIntReference(VALUE_C32);
        final ConstVoidPtr addr = getAORAndSet_C32(VALUE_C32_2, target);
        assertEquals(VALUE_C32_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @Test
    public void testGetAORAndSet_CWI() {
        WCharTPtr target = PtrFactory.newWCharTReference(VALUE_CWI);
        final ConstVoidPtr addr = getAORAndSet_CWI(VALUE_CWI_2, target);
        assertEquals(VALUE_CWI_2, target.getValue());
        assertEquals(target.getPeer().getPeer(), addr.getPeer().getPeer());
    }

    @CxxFunction("getReferenceFromAddress<bool>")
    @CxxByReference
    private static native ConstBoolPtr getRFA_I1(ConstBoolPtr address);

    @CxxFunction("getReferenceFromAddress<char>")
    @CxxByReference
    private static native ConstBytePtr getRFA_C8(ConstBytePtr address);

    @CxxFunction("getReferenceFromAddress<signed char>")
    @CxxByReference
    @CxxSigned
    private static native ConstBytePtr getRFA_I8(@CxxSigned ConstBytePtr address);

    @CxxFunction("getReferenceFromAddress<short>")
    @CxxByReference
    private static native ConstShortPtr getRFA_I16(ConstShortPtr address);

    @CxxFunction("getReferenceFromAddress<int>")
    @CxxByReference
    private static native ConstIntPtr getRFA_I32(ConstIntPtr address);

    @CxxFunction("getReferenceFromAddress<long>")
    @CxxByReference
    private static native ConstNLongPtr getRFA_IL(ConstNLongPtr address);

    @CxxFunction("getReferenceFromAddress<long long>")
    @CxxByReference
    private static native ConstLongPtr getRFA_I64(ConstLongPtr address);

    @CxxFunction("getReferenceFromAddress<unsigned char>")
    @CxxByReference
    @CxxUnsigned
    private static native ConstBytePtr getRFA_U8(@CxxUnsigned ConstBytePtr address);

    @CxxFunction("getReferenceFromAddress<unsigned short>")
    @CxxByReference
    private static native ConstCharPtr getRFA_U16(ConstCharPtr address);

    @CxxFunction("getReferenceFromAddress<unsigned int>")
    @CxxByReference
    @CxxUnsigned
    private static native ConstIntPtr getRFA_U32(@CxxUnsigned ConstIntPtr address);

    @CxxFunction("getReferenceFromAddress<unsigned long>")
    @CxxByReference
    private static native ConstNULongPtr getRFA_UL(ConstNULongPtr address);

    @CxxFunction("getReferenceFromAddress<unsigned long long>")
    @CxxByReference
    @CxxUnsigned
    private static native ConstLongPtr getRFA_U64(@CxxUnsigned ConstLongPtr address);

    @CxxFunction("getReferenceFromAddress<float>")
    @CxxByReference
    private static native ConstFloatPtr getRFA_F32(ConstFloatPtr address);

    @CxxFunction("getReferenceFromAddress<double>")
    @CxxByReference
    private static native ConstDoublePtr getRFA_F64(ConstDoublePtr address);

    @CxxFunction("getReferenceFromAddress<char16_t>")
    @CxxByReference
    @CxxChar16T
    private static native ConstCharPtr getRFA_C16(@CxxChar16T ConstCharPtr address);

    @CxxFunction("getReferenceFromAddress<char32_t>")
    @CxxByReference
    @CxxChar32T
    private static native ConstIntPtr getRFA_C32(@CxxChar32T ConstIntPtr address);

    @CxxFunction("getReferenceFromAddress<wchar_t>")
    @CxxByReference
    private static native ConstWCharTPtr getRFA_CWI(ConstWCharTPtr address);

    @Test
    public void testRFA_I1() {
        BoolPtr ptr = PtrFactory.newBoolReference(VALUE_I1);
        final ConstBoolPtr ref = getRFA_I1(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_I1);
        ptr.setValue(VALUE_I1_2);
        assertEquals(ref.getValue(), VALUE_I1_2);
    }

    @Test
    public void testRFA_C8() {
        BytePtr ptr = PtrFactory.newByteReference(VALUE_C8);
        final ConstBytePtr ref = getRFA_C8(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_C8);
        ptr.setValue(VALUE_C8_2);
        assertEquals(ref.getValue(), VALUE_C8_2);
    }

    @Test
    public void testRFA_I8() {
        BytePtr ptr = PtrFactory.newByteReference(VALUE_I8);
        final ConstBytePtr ref = getRFA_I8(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_I8);
        ptr.setValue(VALUE_I8_2);
        assertEquals(ref.getValue(), VALUE_I8_2);
    }

    @Test
    public void testRFA_I16() {
        ShortPtr ptr = PtrFactory.newShortReference(VALUE_I16);
        final ConstShortPtr ref = getRFA_I16(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_I16);
        ptr.setValue(VALUE_I16_2);
        assertEquals(ref.getValue(), VALUE_I16_2);
    }

    @Test
    public void testRFA_I32() {
        IntPtr ptr = PtrFactory.newIntReference(VALUE_I32);
        final ConstIntPtr ref = getRFA_I32(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_I32);
        ptr.setValue(VALUE_I32_2);
        assertEquals(ref.getValue(), VALUE_I32_2);
    }

    @Test
    public void testRFA_IL() {
        NLongPtr ptr = PtrFactory.newNLongReference(VALUE_IL);
        final ConstNLongPtr ref = getRFA_IL(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_IL);
        ptr.setValue(VALUE_IL_2);
        assertEquals(ref.getValue(), VALUE_IL_2);
    }

    @Test
    public void testRFA_I64() {
        LongPtr ptr = PtrFactory.newLongReference(VALUE_I64);
        final ConstLongPtr ref = getRFA_I64(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_I64);
        ptr.setValue(VALUE_I64_2);
        assertEquals(ref.getValue(), VALUE_I64_2);
    }

    @Test
    public void testRFA_U8() {
        BytePtr ptr = PtrFactory.newByteReference(VALUE_U8);
        final ConstBytePtr ref = getRFA_U8(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_U8);
        ptr.setValue(VALUE_U8_2);
        assertEquals(ref.getValue(), VALUE_U8_2);
    }

    @Test
    public void testRFA_U16() {
        CharPtr ptr = PtrFactory.newCharReference(VALUE_U16);
        final ConstCharPtr ref = getRFA_U16(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_U16);
        ptr.setValue(VALUE_U16_2);
        assertEquals(ref.getValue(), VALUE_U16_2);
    }

    @Test
    public void testRFA_U32() {
        IntPtr ptr = PtrFactory.newIntReference(VALUE_U32);
        final ConstIntPtr ref = getRFA_U32(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_U32);
        ptr.setValue(VALUE_U32_2);
        assertEquals(ref.getValue(), VALUE_U32_2);
    }

    @Test
    public void testRFA_UL() {
        NULongPtr ptr = PtrFactory.newNULongReference(VALUE_UL);
        final ConstNULongPtr ref = getRFA_UL(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_UL);
        ptr.setValue(VALUE_UL_2);
        assertEquals(ref.getValue(), VALUE_UL_2);
    }

    @Test
    public void testRFA_U64() {
        LongPtr ptr = PtrFactory.newLongReference(VALUE_U64);
        final ConstLongPtr ref = getRFA_U64(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_U64);
        ptr.setValue(VALUE_U64_2);
        assertEquals(ref.getValue(), VALUE_U64_2);
    }

    @Test
    public void testRFA_F32() {
        FloatPtr ptr = PtrFactory.newFloatReference(VALUE_F32);
        final ConstFloatPtr ref = getRFA_F32(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_F32, 0.0);
        ptr.setValue(VALUE_F32_2);
        assertEquals(ref.getValue(), VALUE_F32_2, 0.0);
    }

    @Test
    public void testRFA_F64() {
        DoublePtr ptr = PtrFactory.newDoubleReference(VALUE_F64);
        final ConstDoublePtr ref = getRFA_F64(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_F64, 0.0);
        ptr.setValue(VALUE_F64_2);
        assertEquals(ref.getValue(), VALUE_F64_2, 0.0);
    }

    @Test
    public void testRFA_C16() {
        CharPtr ptr = PtrFactory.newCharReference(VALUE_C16);
        final ConstCharPtr ref = getRFA_C16(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_C16);
        ptr.setValue(VALUE_C16_2);
        assertEquals(ref.getValue(), VALUE_C16_2);
    }

    @Test
    public void testRFA_C32() {
        IntPtr ptr = PtrFactory.newIntReference(VALUE_C32);
        final ConstIntPtr ref = getRFA_C32(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_C32);
        ptr.setValue(VALUE_C32_2);
        assertEquals(ref.getValue(), VALUE_C32_2);
    }

    @Test
    public void testRFA_CWI() {
        WCharTPtr ptr = PtrFactory.newWCharTReference(VALUE_CWI);
        final ConstWCharTPtr ref = getRFA_CWI(ptr);
        assertEquals(ptr.getPeer().getPeer(), ref.getPeer().getPeer());
        assertEquals(ref.getValue(), VALUE_CWI);
        ptr.setValue(VALUE_CWI_2);
        assertEquals(ref.getValue(), VALUE_CWI_2);
    }
}
