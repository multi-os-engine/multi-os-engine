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

package cxx.tests.other;

import org.moe.natj.c.CRuntime;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxHeader;
import cxx.interfaces.MyClass;
import cxx.interfaces.MyClass2;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@CxxHeader("other/SizeofTest.hpp")
public class SizeofTests extends NatJTest {

    @Test
    public void testMyClassSizeof() {
        assertEquals(4, CxxRuntime.sizeof(MyClass.class));
        final MyClass tmp = newMyClass();
        try {
            assertEquals(4, CxxRuntime.sizeof(tmp));
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testMyClass2Sizeof() {
        assertEquals(4, CxxRuntime.sizeof(MyClass2.class));
        final MyClass2 tmp = newMyClass2();
        try {
            assertEquals(4, CxxRuntime.sizeof(tmp));
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<bool,1>")
    private interface SizeofWrapper_I1_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I1_x1_Sizeof() {
        assertEquals(1, CxxRuntime.sizeof(SizeofWrapper_I1_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<char,1>")
    private interface SizeofWrapper_C8_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_C8_x1_Sizeof() {
        assertEquals(1, CxxRuntime.sizeof(SizeofWrapper_C8_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<signed char,1>")
    private interface SizeofWrapper_I8_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I8_x1_Sizeof() {
        assertEquals(1, CxxRuntime.sizeof(SizeofWrapper_I8_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<short,1>")
    private interface SizeofWrapper_I16_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I16_x1_Sizeof() {
        assertEquals(2, CxxRuntime.sizeof(SizeofWrapper_I16_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<int,1>")
    private interface SizeofWrapper_I32_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I32_x1_Sizeof() {
        assertEquals(4, CxxRuntime.sizeof(SizeofWrapper_I32_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<long,1>")
    private interface SizeofWrapper_IL_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_IL_x1_Sizeof() {
        assertEquals(CRuntime.NATIVE_LONG_SIZE, CxxRuntime.sizeof(SizeofWrapper_IL_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<long long,1>")
    private interface SizeofWrapper_I64_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I64_x1_Sizeof() {
        assertEquals(8, CxxRuntime.sizeof(SizeofWrapper_I64_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned char,1>")
    private interface SizeofWrapper_U8_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U8_x1_Sizeof() {
        assertEquals(1, CxxRuntime.sizeof(SizeofWrapper_U8_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned short,1>")
    private interface SizeofWrapper_U16_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U16_x1_Sizeof() {
        assertEquals(2, CxxRuntime.sizeof(SizeofWrapper_U16_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned int,1>")
    private interface SizeofWrapper_U32_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U32_x1_Sizeof() {
        assertEquals(4, CxxRuntime.sizeof(SizeofWrapper_U32_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned long,1>")
    private interface SizeofWrapper_UL_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_UL_x1_Sizeof() {
        assertEquals(CRuntime.NATIVE_LONG_SIZE, CxxRuntime.sizeof(SizeofWrapper_UL_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned long long,1>")
    private interface SizeofWrapper_U64_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U64_x1_Sizeof() {
        assertEquals(8, CxxRuntime.sizeof(SizeofWrapper_U64_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<float,1>")
    private interface SizeofWrapper_F32_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_F32_x1_Sizeof() {
        assertEquals(4, CxxRuntime.sizeof(SizeofWrapper_F32_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<double,1>")
    private interface SizeofWrapper_F64_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_F64_x1_Sizeof() {
        assertEquals(8, CxxRuntime.sizeof(SizeofWrapper_F64_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<bool,4>")
    private interface SizeofWrapper_I1_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I1_x4_Sizeof() {
        assertEquals(4 * 1, CxxRuntime.sizeof(SizeofWrapper_I1_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<char,4>")
    private interface SizeofWrapper_C8_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_C8_x4_Sizeof() {
        assertEquals(4 * 1, CxxRuntime.sizeof(SizeofWrapper_C8_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<signed char,4>")
    private interface SizeofWrapper_I8_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I8_x4_Sizeof() {
        assertEquals(4 * 1, CxxRuntime.sizeof(SizeofWrapper_I8_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<short,4>")
    private interface SizeofWrapper_I16_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I16_x4_Sizeof() {
        assertEquals(4 * 2, CxxRuntime.sizeof(SizeofWrapper_I16_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<int,4>")
    private interface SizeofWrapper_I32_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I32_x4_Sizeof() {
        assertEquals(4 * 4, CxxRuntime.sizeof(SizeofWrapper_I32_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<long,4>")
    private interface SizeofWrapper_IL_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_IL_x4_Sizeof() {
        assertEquals(4 * CRuntime.NATIVE_LONG_SIZE, CxxRuntime.sizeof(SizeofWrapper_IL_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<long long,4>")
    private interface SizeofWrapper_I64_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I64_x4_Sizeof() {
        assertEquals(4 * 8, CxxRuntime.sizeof(SizeofWrapper_I64_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned char,4>")
    private interface SizeofWrapper_U8_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U8_x4_Sizeof() {
        assertEquals(4 * 1, CxxRuntime.sizeof(SizeofWrapper_U8_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned short,4>")
    private interface SizeofWrapper_U16_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U16_x4_Sizeof() {
        assertEquals(4 * 2, CxxRuntime.sizeof(SizeofWrapper_U16_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned int,4>")
    private interface SizeofWrapper_U32_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U32_x4_Sizeof() {
        assertEquals(4 * 4, CxxRuntime.sizeof(SizeofWrapper_U32_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned long,4>")
    private interface SizeofWrapper_UL_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_UL_x4_Sizeof() {
        assertEquals(4 * CRuntime.NATIVE_LONG_SIZE, CxxRuntime.sizeof(SizeofWrapper_UL_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned long long,4>")
    private interface SizeofWrapper_U64_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U64_x4_Sizeof() {
        assertEquals(4 * 8, CxxRuntime.sizeof(SizeofWrapper_U64_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<float,4>")
    private interface SizeofWrapper_F32_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_F32_x4_Sizeof() {
        assertEquals(4 * 4, CxxRuntime.sizeof(SizeofWrapper_F32_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<double,4>")
    private interface SizeofWrapper_F64_x4 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_F64_x4_Sizeof() {
        assertEquals(4 * 8, CxxRuntime.sizeof(SizeofWrapper_F64_x4.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<bool*,1>")
    private interface SizeofWrapper_I1_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I1_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_I1_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<char*,1>")
    private interface SizeofWrapper_C8_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_C8_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_C8_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<signed char*,1>")
    private interface SizeofWrapper_I8_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I8_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_I8_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<short*,1>")
    private interface SizeofWrapper_I16_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I16_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_I16_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<int*,1>")
    private interface SizeofWrapper_I32_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I32_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_I32_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<long*,1>")
    private interface SizeofWrapper_IL_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_IL_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_IL_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<long long*,1>")
    private interface SizeofWrapper_I64_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_I64_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_I64_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned char*,1>")
    private interface SizeofWrapper_U8_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U8_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_U8_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned short*,1>")
    private interface SizeofWrapper_U16_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U16_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_U16_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned int*,1>")
    private interface SizeofWrapper_U32_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U32_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_U32_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned long*,1>")
    private interface SizeofWrapper_UL_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_UL_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_UL_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<unsigned long long*,1>")
    private interface SizeofWrapper_U64_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_U64_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_U64_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<float*,1>")
    private interface SizeofWrapper_F32_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_F32_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_F32_Ptr_x1.class));
    }

    @CxxClass("natj::cxx::tests::other::SizeofWrapper<double*,1>")
    private interface SizeofWrapper_F64_Ptr_x1 extends CxxObject {
    }

    @Test
    public void testSizeofWrapper_F64_Ptr_x1_Sizeof() {
        assertEquals(CRuntime.POINTER_SIZE, CxxRuntime.sizeof(SizeofWrapper_F64_Ptr_x1.class));
    }
}
