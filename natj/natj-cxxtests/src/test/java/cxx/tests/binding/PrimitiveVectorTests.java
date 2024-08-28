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
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/*
 REGEX:

  @CxxHeader(value = "vector", useQuotes = false)
  @CxxClass(value = "std::vector<$1>", isConst = true)
  private interface Const_StdVector$8 extends CxxObject {
    @CxxMethod long size();
    @CxxOperator(CxxOperatorKind.SUBSCRIPT) $6 get(@NULong long index);
  }

  @CxxHeader(value = "vector", useQuotes = false)
  @CxxClass(value = "std::vector<$1>")
  private interface StdVector$8 extends Const_StdVector$8 {
    @CxxMethod void push_back($7$6 value);
    @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN) $6 set(@NULong long index, $7$6 value);
  }

  @CxxConstructor(StdVector$8.class)
  public static native StdVector$8 newVector$8();

  private void test$8Vector() {
    logTest();

    StdVector$8 tmp = newVector$8();
    $6[] values = { VALUE_$8, VALUE_$8_2 };

    l(IM, "size " + tmp.size());
    tmp.push_back(values[0]);
    l(IM, "size " + tmp.size());
    tmp.push_back(values[1]);
    l(IM, "size " + tmp.size());
    logln();

    l(O, "get[0] " + tmp.get(0));
    l(O, "get[1] " + tmp.get(1));
    logln();

    l(O, "set[0] " + tmp.set(0, tmp.get(1)));
    logln();

    l(O, "get[0] " + tmp.get(0));
    l(O, "get[1] " + tmp.get(1));

    CxxRuntime.delete(tmp);
    logln();
  }
 */
public class PrimitiveVectorTests extends NatJTest {

    /* Does not work with MinGW STL
    @CxxConstructor(StdVectorI1.class)
    private static native StdVectorI1 newVectorI1();
    */

    @CxxConstructor()
    private static native StdVectorC8 newVectorC8();

    @CxxConstructor()
    private static native StdVectorI8 newVectorI8();

    @CxxConstructor()
    private static native StdVectorI16 newVectorI16();

    @CxxConstructor()
    private static native StdVectorI32 newVectorI32();

    @CxxConstructor()
    private static native StdVectorIL newVectorIL();

    @CxxConstructor()
    private static native StdVectorI64 newVectorI64();

    @CxxConstructor()
    private static native StdVectorU8 newVectorU8();

    @CxxConstructor()
    private static native StdVectorU16 newVectorU16();

    @CxxConstructor()
    private static native StdVectorU32 newVectorU32();

    @CxxConstructor()
    private static native StdVectorUL newVectorUL();

    @CxxConstructor()
    private static native StdVectorU64 newVectorU64();

    @CxxConstructor()
    private static native StdVectorF32 newVectorF32();

    @CxxConstructor()
    private static native StdVectorF64 newVectorF64();

    /* Does not work with MinGW STL
    @Test
    public void testI1Vector() {
        StdVectorI1 tmp = newVectorI1();
        assertNotNull(tmp);
        boolean[] values = {VALUE_I1, VALUE_I1_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_I1, tmp.at_const(0).get());
        assertEquals(VALUE_I1_2, tmp.at_const(1).get());
        assertEquals(VALUE_I1_2, tmp.at(0).set(VALUE_I1_2).get());
        assertEquals(VALUE_I1_2, tmp.at_const(0).get());
        assertEquals(VALUE_I1_2, tmp.at_const(1).get());
        CxxRuntime.delete(tmp);
    }
    */

    @Test
    public void testC8Vector() {
        StdVectorC8 tmp = newVectorC8();
        assertNotNull(tmp);
        byte[] values = {VALUE_C8, VALUE_C8_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_C8, tmp.get(0));
        assertEquals(VALUE_C8_2, tmp.get(1));
        assertEquals(VALUE_C8_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_C8_2, tmp.get(0));
        assertEquals(VALUE_C8_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testI8Vector() {
        StdVectorI8 tmp = newVectorI8();
        assertNotNull(tmp);
        byte[] values = {VALUE_I8, VALUE_I8_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_I8, tmp.get(0));
        assertEquals(VALUE_I8_2, tmp.get(1));
        assertEquals(VALUE_I8_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_I8_2, tmp.get(0));
        assertEquals(VALUE_I8_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testI16Vector() {
        StdVectorI16 tmp = newVectorI16();
        assertNotNull(tmp);
        short[] values = {VALUE_I16, VALUE_I16_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_I16, tmp.get(0));
        assertEquals(VALUE_I16_2, tmp.get(1));
        assertEquals(VALUE_I16_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_I16_2, tmp.get(0));
        assertEquals(VALUE_I16_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testI32Vector() {
        StdVectorI32 tmp = newVectorI32();
        int[] values = {VALUE_I32, VALUE_I32_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_I32, tmp.get(0));
        assertEquals(VALUE_I32_2, tmp.get(1));
        assertEquals(VALUE_I32_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_I32_2, tmp.get(0));
        assertEquals(VALUE_I32_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testILVector() {
        StdVectorIL tmp = newVectorIL();
        long[] values = {VALUE_IL, VALUE_IL_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_IL, tmp.get(0));
        assertEquals(VALUE_IL_2, tmp.get(1));
        assertEquals(VALUE_IL_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_IL_2, tmp.get(0));
        assertEquals(VALUE_IL_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testI64Vector() {
        StdVectorI64 tmp = newVectorI64();
        long[] values = {VALUE_I64, VALUE_I64_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_I64, tmp.get(0));
        assertEquals(VALUE_I64_2, tmp.get(1));
        assertEquals(VALUE_I64_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_I64_2, tmp.get(0));
        assertEquals(VALUE_I64_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testU8Vector() {
        StdVectorU8 tmp = newVectorU8();
        byte[] values = {VALUE_U8, VALUE_U8_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_U8, tmp.get(0));
        assertEquals(VALUE_U8_2, tmp.get(1));
        assertEquals(VALUE_U8_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_U8_2, tmp.get(0));
        assertEquals(VALUE_U8_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testU16Vector() {
        StdVectorU16 tmp = newVectorU16();
        char[] values = {VALUE_U16, VALUE_U16_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_U16, tmp.get(0));
        assertEquals(VALUE_U16_2, tmp.get(1));
        assertEquals(VALUE_U16_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_U16_2, tmp.get(0));
        assertEquals(VALUE_U16_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testU32Vector() {
        StdVectorU32 tmp = newVectorU32();
        int[] values = {VALUE_U32, VALUE_U32_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_U32, tmp.get(0));
        assertEquals(VALUE_U32_2, tmp.get(1));
        assertEquals(VALUE_U32_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_U32_2, tmp.get(0));
        assertEquals(VALUE_U32_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testULVector() {
        StdVectorUL tmp = newVectorUL();
        long[] values = {VALUE_UL, VALUE_UL_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_UL, tmp.get(0));
        assertEquals(VALUE_UL_2, tmp.get(1));
        assertEquals(VALUE_UL_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_UL_2, tmp.get(0));
        assertEquals(VALUE_UL_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testU64Vector() {
        StdVectorU64 tmp = newVectorU64();
        long[] values = {VALUE_U64, VALUE_U64_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_U64, tmp.get(0));
        assertEquals(VALUE_U64_2, tmp.get(1));
        assertEquals(VALUE_U64_2, tmp.set(0, tmp.get(1)));
        assertEquals(VALUE_U64_2, tmp.get(0));
        assertEquals(VALUE_U64_2, tmp.get(1));
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testF32Vector() {
        StdVectorF32 tmp = newVectorF32();
        float[] values = {VALUE_F32, VALUE_F32_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_F32, tmp.get(0), DELTA_F);
        assertEquals(VALUE_F32_2, tmp.get(1), DELTA_F);
        assertEquals(VALUE_F32_2, tmp.set(0, tmp.get(1)), DELTA_F);
        assertEquals(VALUE_F32_2, tmp.get(0), DELTA_F);
        assertEquals(VALUE_F32_2, tmp.get(1), DELTA_F);
        CxxRuntime.delete(tmp);
    }

    @Test
    public void testF64Vector() {
        StdVectorF64 tmp = newVectorF64();
        double[] values = {VALUE_F64, VALUE_F64_2};
        assertEquals(0, tmp.size());
        tmp.push_back(values[0]);
        assertEquals(1, tmp.size());
        tmp.push_back(values[1]);
        assertEquals(2, tmp.size());
        assertEquals(VALUE_F64, tmp.get(0), DELTA_D);
        assertEquals(VALUE_F64_2, tmp.get(1), DELTA_D);
        assertEquals(VALUE_F64_2, tmp.set(0, tmp.get(1)), DELTA_D);
        assertEquals(VALUE_F64_2, tmp.get(0), DELTA_D);
        assertEquals(VALUE_F64_2, tmp.get(1), DELTA_D);
        CxxRuntime.delete(tmp);
    }

    /* Does not work with MinGW STL
    @CxxClass("std::vector<bool>")
    private interface StdVectorI1 extends CxxObject {
        @CxxClass("std::vector<bool>::reference")
        interface Reference extends CxxObject {
            @CxxCastOperator()
            boolean get();

            @CxxOperator(CxxOperatorKind.ASSIGN)
            @CxxByValue
            Reference set(boolean value);
        }

        @CxxClass("std::vector<bool>::const_reference")
        interface ConstReference extends CxxObject {
            @CxxCastOperator(isConst = true)
            boolean get();
        }

        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxByValue
        ConstReference at_const(@NULong long index);

        @CxxMethod
        void push_back(boolean value);

        @CxxOperator(CxxOperatorKind.SUBSCRIPT)
        @CxxByValue
        Reference at(@NULong long index);
    }
    */

    @CxxClass("std::vector<char>")
    private interface StdVectorC8 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        byte get(@NULong long index);

        @CxxMethod
        void push_back(byte value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        byte set(@NULong long index, byte value);
    }

    @CxxClass("std::vector<signed char>")
    private interface StdVectorI8 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxSigned
        byte get(@NULong long index);

        @CxxMethod
        void push_back(@CxxSigned byte value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @CxxSigned
        byte set(@NULong long index, @CxxSigned byte value);
    }

    @CxxClass("std::vector<short>")
    private interface StdVectorI16 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        short get(@NULong long index);

        @CxxMethod
        void push_back(short value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        short set(@NULong long index, short value);
    }

    @CxxClass("std::vector<int>")
    private interface StdVectorI32 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        int get(@NULong long index);

        @CxxMethod
        void push_back(int value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        int set(@NULong long index, int value);
    }

    @CxxClass("std::vector<long>")
    private interface StdVectorIL extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @NLong
        long get(@NULong long index);

        @CxxMethod
        void push_back(@NLong long value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @NLong
        long set(@NULong long index, @NLong long value);
    }

    @CxxClass("std::vector<long long>")
    private interface StdVectorI64 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        long get(@NULong long index);

        @CxxMethod
        void push_back(long value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        long set(@NULong long index, long value);
    }

    @CxxClass("std::vector<unsigned char>")
    private interface StdVectorU8 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxUnsigned
        byte get(@NULong long index);

        @CxxMethod
        void push_back(@CxxUnsigned byte value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @CxxUnsigned
        byte set(@NULong long index, @CxxUnsigned byte value);
    }

    @CxxClass("std::vector<unsigned short>")
    private interface StdVectorU16 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        char get(@NULong long index);

        @CxxMethod
        void push_back(char value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        char set(@NULong long index, char value);
    }

    @CxxClass("std::vector<unsigned int>")
    private interface StdVectorU32 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxUnsigned
        int get(@NULong long index);

        @CxxMethod
        void push_back(@CxxUnsigned int value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @CxxUnsigned
        int set(@NULong long index, @CxxUnsigned int value);
    }

    @CxxClass("std::vector<unsigned long>")
    private interface StdVectorUL extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @NULong
        long get(@NULong long index);

        @CxxMethod
        void push_back(@NULong long value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @NULong
        long set(@NULong long index, @NULong long value);
    }

    @CxxClass("std::vector<unsigned long long>")
    private interface StdVectorU64 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxUnsigned
        long get(@NULong long index);

        @CxxMethod
        void push_back(@CxxUnsigned long value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        @CxxUnsigned
        long set(@NULong long index, @CxxUnsigned long value);
    }

    @CxxClass("std::vector<float>")
    private interface StdVectorF32 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        float get(@NULong long index);

        @CxxMethod
        void push_back(float value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        float set(@NULong long index, float value);
    }

    @CxxClass("std::vector<double>")
    private interface StdVectorF64 extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        double get(@NULong long index);

        @CxxMethod
        void push_back(double value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        double set(@NULong long index, double value);
    }
}
