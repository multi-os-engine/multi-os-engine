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

package c.tests.natj.ptr;

import c.binding.NativeDataSource;
import c.tests.NatJTest;
import c.util.DataSource;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConstIntPtrTest extends NatJTest {

	/*
     * IntPtr test fields
	 */

    private static final int INT_VALUES[] = DataSource.getRawIntegers();
    private static final Integer INT_OBJECT_VALUES[] = DataSource.getObjectIntegers();

    private static final int INT_NUM_VALUES = INT_VALUES.length;
    private static final int INT_SUB_FROM = 1;
    private static final int INT_SUB_TO = INT_NUM_VALUES - 1;
    private static final int INT_SUB_LENGTH = INT_SUB_TO - INT_SUB_FROM;

	/*
	 * NIntPtr test fields
	 */

    private static final long NINT_VALUES[] = DataSource.getRawNIntegers();
    private static final Long NINT_OBJECT_VALUES[] = DataSource.getObjectNIntegers();

    private static final int NINT_NUM_VALUES = NINT_VALUES.length;
    private static final int NINT_SUB_FROM = 1;
    private static final int NINT_SUB_TO = NINT_NUM_VALUES - 1;
    private static final int NINT_SUB_LENGTH = NINT_SUB_TO - NINT_SUB_FROM;


	/*
	 * NUIntPtr test fields
	 */

    private static final long NUINT_VALUES[] = DataSource.getRawNUIntegers();
    private static final Long NUINT_OBJECT_VALUES[] = DataSource.getObjectNUIntegers();

    private static final int NUINT_NUM_VALUES = NUINT_VALUES.length;
    private static final int NUINT_SUB_FROM = 1;
    private static final int NUINT_SUB_TO = NUINT_NUM_VALUES - 1;
    private static final int NUINT_SUB_LENGTH = NUINT_SUB_TO - NUINT_SUB_FROM;

    private IntPtr getTestIntPtr() {
        return (IntPtr) NativeDataSource.getIntTestPtr();
    }

    private NIntPtr getTestNIntPtr() {
        return (NIntPtr) NativeDataSource.getNIntTestPtr();
    }

    private NUIntPtr getTestNUIntPtr() {
        return (NUIntPtr) NativeDataSource.getNUIntTestPtr();
    }

    private IntPtr getZeroIntPtr() {
        return (IntPtr) NativeDataSource.getIntZeroPtr();
    }

    private NIntPtr getZeroNIntPtr() {
        return (NIntPtr) NativeDataSource.getNIntZeroPtr();
    }

    private NUIntPtr getZeroNUIntPtr() {
        return (NUIntPtr) NativeDataSource.getNUIntZeroPtr();
    }

    private void failIfConst(Ptr ptr) {
        if (ptr.isConstPtr()) {
            Assert.fail("failed to throw exception (const ptr)");
        }
    }

    @Before
    public void prepare() {
        Assert.assertNotNull("Int test values did not initialize", INT_VALUES);
        Assert.assertNotNull("Int test values did not initialize (object)", INT_OBJECT_VALUES);

        Assert.assertNotNull("NInt test values did not initialize", NINT_VALUES);
        Assert.assertNotNull("NInt test values did not initialize (object)", NINT_OBJECT_VALUES);

        Assert.assertNotNull("NUInt test values did not initialize", NUINT_VALUES);
        Assert.assertNotNull("NUInt test values did not initialize (object)", NUINT_OBJECT_VALUES);
    }

	/* Test #1 */

    @Test
    public void test_get__ConstIntPtr() {
        Integer exp = INT_OBJECT_VALUES[0];
        Integer act = getTestIntPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get__ConstNIntPtr() {
        Long exp = NINT_OBJECT_VALUES[0];
        Long act = getTestNIntPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get__ConstNUIntPtr() {
        Long exp = NUINT_OBJECT_VALUES[0];
        Long act = getTestNUIntPtr().get();
        Assert.assertEquals(exp, act);
    }

	/* Test #2 */

    @Test
    public void test_get_idx__ConstIntPtr() {
        IntPtr ptr = getTestIntPtr();
        for (int idx = 0; idx < INT_NUM_VALUES; ++idx) {
            Integer exp = INT_OBJECT_VALUES[idx];
            Integer act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_get_idx__ConstNIntPtr() {
        NIntPtr ptr = getTestNIntPtr();
        for (int idx = 0; idx < NINT_NUM_VALUES; ++idx) {
            Long exp = NINT_OBJECT_VALUES[idx];
            Long act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_get_idx__ConstNUIntPtr() {
        NUIntPtr ptr = getTestNUIntPtr();
        for (int idx = 0; idx < NUINT_NUM_VALUES; ++idx) {
            Long exp = NUINT_OBJECT_VALUES[idx];
            Long act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

	/* Test #3 */

    @Test
    public void test_toArray_len__ConstIntPtr() {
        Integer[] exp = INT_OBJECT_VALUES;
        Integer[] act = getTestIntPtr().toArray(INT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_len__ConstNIntPtr() {
        Long[] exp = NINT_OBJECT_VALUES;
        Long[] act = getTestNIntPtr().toArray(NINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_len__ConstNUIntPtr() {
        Long[] exp = NUINT_OBJECT_VALUES;
        Long[] act = getTestNUIntPtr().toArray(NUINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }


	/* Test #4 */

    @Test
    public void test_toArray_from_to__ConstIntPtr() {
        Integer[] exp = Arrays.copyOfRange(INT_OBJECT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        Integer[] act = getTestIntPtr().toArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstNIntPtr() {
        Long[] exp = Arrays.copyOfRange(NINT_OBJECT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        Long[] act = getTestNIntPtr().toArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstNUIntPtr() {
        Long[] exp = Arrays.copyOfRange(NUINT_OBJECT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        Long[] act = getTestNUIntPtr().toArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #5 */

    @Test
    public void test_copyTo_dest__ConstIntPtr() {
        Integer[] exp = INT_OBJECT_VALUES;
        Integer[] act = new Integer[INT_NUM_VALUES];
        getTestIntPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstNIntPtr() {
        Long[] exp = NINT_OBJECT_VALUES;
        Long[] act = new Long[NINT_NUM_VALUES];
        getTestNIntPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstNUIntPtr() {
        Long[] exp = NUINT_OBJECT_VALUES;
        Long[] act = new Long[NUINT_NUM_VALUES];
        getTestNUIntPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #6 */

    @Test
    public void test_copyTo_dest_len__ConstIntPtr() {
        Integer[] exp = Arrays.copyOfRange(INT_OBJECT_VALUES, 0, INT_SUB_LENGTH);
        Integer[] act = new Integer[INT_NUM_VALUES];
        getTestIntPtr().copyTo(act, INT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, INT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstNIntPtr() {
        Long[] exp = Arrays.copyOfRange(NINT_OBJECT_VALUES, 0, NINT_SUB_LENGTH);
        Long[] act = new Long[NINT_NUM_VALUES];
        getTestNIntPtr().copyTo(act, NINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, NINT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstNUIntPtr() {
        Long[] exp = Arrays.copyOfRange(NUINT_OBJECT_VALUES, 0, NUINT_SUB_LENGTH);
        Long[] act = new Long[NUINT_NUM_VALUES];
        getTestNUIntPtr().copyTo(act, NUINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, NUINT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #7 */

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstIntPtr() {
        Integer[] exp = Arrays.copyOfRange(INT_OBJECT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        Integer[] act = new Integer[INT_NUM_VALUES];
        getTestIntPtr().copyTo(INT_SUB_FROM, act, INT_SUB_FROM, INT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstNIntPtr() {
        Long[] exp = Arrays.copyOfRange(NINT_OBJECT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        Long[] act = new Long[NINT_NUM_VALUES];
        getTestNIntPtr().copyTo(NINT_SUB_FROM, act, NINT_SUB_FROM, NINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstNUIntPtr() {
        Long[] exp = Arrays.copyOfRange(NUINT_OBJECT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        Long[] act = new Long[NUINT_NUM_VALUES];
        getTestNUIntPtr().copyTo(NUINT_SUB_FROM, act, NUINT_SUB_FROM, NUINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #8 */

    @Test
    public void test_set_value__IntPtr() {
        Integer exp = INT_OBJECT_VALUES[0];
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_value__NIntPtr() {
        Long exp = NINT_OBJECT_VALUES[0];
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_value__NUIntPtr() {
        Long exp = NUINT_OBJECT_VALUES[0];
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long act = ptr.get();
        Assert.assertEquals(exp, act);
    }

	/* Test #9 */

    @Test
    public void test_set_idx_value__IntPtr() {
        IntPtr ptr = getZeroIntPtr();
        for (int idx = 0; idx < INT_NUM_VALUES; ++idx) {
            Integer exp = INT_OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Integer act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_set_idx_value__NIntPtr() {
        NIntPtr ptr = getZeroNIntPtr();
        for (int idx = 0; idx < NINT_NUM_VALUES; ++idx) {
            Long exp = NINT_OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Long act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_set_idx_value__NUIntPtr() {
        NUIntPtr ptr = getZeroNUIntPtr();
        for (int idx = 0; idx < NUINT_NUM_VALUES; ++idx) {
            Long exp = NUINT_OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Long act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

	/* Test #10 */

    @Test
    public void test_copyFrom_src__IntPtr() {
        Integer[] exp = INT_OBJECT_VALUES;
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(INT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src__NIntPtr() {
        Long[] exp = NINT_OBJECT_VALUES;
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src__NUIntPtr() {
        Long[] exp = NUINT_OBJECT_VALUES;
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NUINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #11 */

    @Test
    public void test_copyFrom_src_destoff__IntPtr() {
        Integer[] exp = Arrays.copyOfRange(INT_OBJECT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(exp, INT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__NIntPtr() {
        Long[] exp = Arrays.copyOfRange(NINT_OBJECT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(exp, NINT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__NUIntPtr() {
        Long[] exp = Arrays.copyOfRange(NUINT_OBJECT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(exp, NUINT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #12 */

    @Test
    public void test_copyFrom_src_destoff_len__IntPtr() {
        Integer[] exp = Arrays.copyOfRange(INT_OBJECT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(exp, INT_SUB_FROM, INT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__NIntPtr() {
        Long[] exp = Arrays.copyOfRange(NINT_OBJECT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(exp, NINT_SUB_FROM, NINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__NUIntPtr() {
        Long[] exp = Arrays.copyOfRange(NUINT_OBJECT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(exp, NUINT_SUB_FROM, NUINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #13 */

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__IntPtr() {
        Integer[] exp = Arrays.copyOfRange(INT_OBJECT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(INT_OBJECT_VALUES, INT_SUB_FROM, INT_SUB_FROM, INT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__NIntPtr() {
        Long[] exp = Arrays.copyOfRange(NINT_OBJECT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(NINT_OBJECT_VALUES, NINT_SUB_FROM, NINT_SUB_FROM, NINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__NUIntPtr() {
        Long[] exp = Arrays.copyOfRange(NUINT_OBJECT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(NUINT_OBJECT_VALUES, NUINT_SUB_FROM, NUINT_SUB_FROM, NUINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #14 */

    @Test
    public void test_getIntValue() {
        int exp = INT_VALUES[0];
        int act = getTestIntPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getNIntValue() {
        long exp = NINT_VALUES[0];
        long act = getTestNIntPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getNUIntValue() {
        long exp = NUINT_VALUES[0];
        long act = getTestNUIntPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

	/* Test #15 */

    @Test
    public void test_getIntValue_idx() {
        IntPtr ptr = getTestIntPtr();
        for (int idx = 0; idx < INT_NUM_VALUES; ++idx) {
            int exp = INT_VALUES[idx];
            int act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_getNIntValue_idx() {
        NIntPtr ptr = getTestNIntPtr();
        for (int idx = 0; idx < NINT_NUM_VALUES; ++idx) {
            long exp = NINT_VALUES[idx];
            long act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_getNUIntValue_idx() {
        NUIntPtr ptr = getTestNUIntPtr();
        for (int idx = 0; idx < NUINT_NUM_VALUES; ++idx) {
            long exp = NUINT_VALUES[idx];
            long act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

	/* Test #16 */

    @Test
    public void test_toIntArray_len() {
        int[] exp = INT_VALUES;
        int[] act = getTestIntPtr().toIntArray(INT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toNIntArray_len() {
        long[] exp = NINT_VALUES;
        long[] act = getTestNIntPtr().toLongArray(NINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toNUIntArray_len() {
        long[] exp = NUINT_VALUES;
        long[] act = getTestNUIntPtr().toLongArray(NUINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #17 */

    @Test
    public void test_toIntArray_from_to() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        int[] act = getTestIntPtr().toIntArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toNIntArray_from_to() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        long[] act = getTestNIntPtr().toLongArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toNUIntArray_from_to() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        long[] act = getTestNUIntPtr().toLongArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #18 */

    @Test
    public void test_copyIntTo_dest() {
        int[] exp = INT_VALUES;
        int[] act = new int[INT_NUM_VALUES];
        getTestIntPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntTo_dest() {
        long[] exp = NINT_VALUES;
        long[] act = new long[NINT_NUM_VALUES];
        getTestNIntPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntTo_dest() {
        long[] exp = NUINT_VALUES;
        long[] act = new long[NUINT_NUM_VALUES];
        getTestNUIntPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #19 */

    @Test
    public void test_copyIntTo_dest_len() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, 0, INT_SUB_LENGTH);
        int[] act = new int[INT_NUM_VALUES];
        getTestIntPtr().copyTo(act, INT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, INT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntTo_dest_len() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, 0, NINT_SUB_LENGTH);
        long[] act = new long[NINT_NUM_VALUES];
        getTestNIntPtr().copyTo(act, NINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, NINT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntTo_dest_len() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, 0, NUINT_SUB_LENGTH);
        long[] act = new long[NUINT_NUM_VALUES];
        getTestNUIntPtr().copyTo(act, NUINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, NUINT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #20 */

    @Test
    public void test_copyIntTo_srcoff_dest_destoff_len() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        int[] act = new int[INT_NUM_VALUES];
        getTestIntPtr().copyTo(INT_SUB_FROM, act, INT_SUB_FROM, INT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntTo_srcoff_dest_destoff_len() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        long[] act = new long[NINT_NUM_VALUES];
        getTestNIntPtr().copyTo(NINT_SUB_FROM, act, NINT_SUB_FROM, NINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntTo_srcoff_dest_destoff_len() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        long[] act = new long[NUINT_NUM_VALUES];
        getTestNUIntPtr().copyTo(NUINT_SUB_FROM, act, NUINT_SUB_FROM, NUINT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #21 */

    @Test
    public void test_setIntValue_value() {
        int exp = INT_VALUES[0];
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setNIntValue_value() {
        long exp = NINT_VALUES[0];
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setNUIntValue_value() {
        long exp = NUINT_VALUES[0];
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

	/* Test #22 */

    @Test
    public void test_setIntValue_idx_value() {
        IntPtr ptr = getZeroIntPtr();
        for (int idx = 0; idx < INT_NUM_VALUES; ++idx) {
            int exp = INT_VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            int act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_setNIntValue_idx_value() {
        NIntPtr ptr = getZeroNIntPtr();
        for (int idx = 0; idx < NINT_NUM_VALUES; ++idx) {
            long exp = NINT_VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            long act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_setNUIntValue_idx_value() {
        NUIntPtr ptr = getZeroNUIntPtr();
        for (int idx = 0; idx < NUINT_NUM_VALUES; ++idx) {
            long exp = NUINT_VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            long act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

	/* Test #23 */

    @Test
    public void test_copyIntFrom_src() {
        int[] exp = INT_VALUES;
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(INT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntFrom_src() {
        long[] exp = NINT_VALUES;
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntFrom_src() {
        long[] exp = NUINT_VALUES;
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NUINT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #24 */

    @Test
    public void test_copyIntFrom_src_destoff() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(exp, INT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntFrom_src_destoff() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(exp, NINT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntFrom_src_destoff() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(exp, NUINT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #25 */

    @Test
    public void test_copyIntFrom_src_destoff_len() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(exp, INT_SUB_FROM, INT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntFrom_src_destoff_len() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(exp, NINT_SUB_FROM, NINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntFrom_src_destoff_len() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(exp, NUINT_SUB_FROM, NUINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #26 */

    @Test
    public void test_copyIntFrom_src_srcoff_destoff_len() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ptr = getZeroIntPtr();
        try {
            ptr.copyFrom(INT_VALUES, INT_SUB_FROM, INT_SUB_FROM, INT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNIntFrom_src_srcoff_destoff_len() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ptr = getZeroNIntPtr();
        try {
            ptr.copyFrom(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_FROM, NINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyNUIntFrom_src_srcoff_destoff_len() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ptr = getZeroNUIntPtr();
        try {
            ptr.copyFrom(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_FROM, NUINT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

	/* Test #27 */

    @Test
    public void test_ofs_idx_Int() {
        int[] exp = Arrays.copyOfRange(INT_VALUES, INT_SUB_FROM, INT_SUB_TO);
        IntPtr ofs = getTestIntPtr().ofs(INT_SUB_FROM);
        int[] act = ofs.toIntArray(INT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestIntPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_ofs_idx_NInt() {
        long[] exp = Arrays.copyOfRange(NINT_VALUES, NINT_SUB_FROM, NINT_SUB_TO);
        NIntPtr ofs = getTestNIntPtr().ofs(NINT_SUB_FROM);
        long[] act = ofs.toLongArray(NINT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestNIntPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_ofs_idx_NUInt() {
        long[] exp = Arrays.copyOfRange(NUINT_VALUES, NUINT_SUB_FROM, NUINT_SUB_TO);
        NUIntPtr ofs = getTestNUIntPtr().ofs(NUINT_SUB_FROM);
        long[] act = ofs.toLongArray(NUINT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestNUIntPtr().getClass(), ofs.getClass());
    }

	/* Test #28 */

    @Test
    public void test_getGuardedInt_len() {
        IntPtr ptr = getTestIntPtr().getGuarded(INT_NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestIntPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(INT_NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuardedNInt_len() {
        NIntPtr ptr = getTestNIntPtr().getGuarded(NINT_NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestNIntPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NINT_NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuardedNUInt_len() {
        NUIntPtr ptr = getTestNUIntPtr().getGuarded(NUINT_NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestNUIntPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUINT_NUM_VALUES, ptr.getGuardHigh());
    }

	/* Test #29 */

    @Test
    public void test_gettGuardedInt_from_to() {
        IntPtr ptr = getTestIntPtr().getGuarded(INT_SUB_FROM, INT_SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestIntPtr().isConstPtr());
        Assert.assertEquals(INT_SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(INT_SUB_TO, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuardedNInt_from_to() {
        NIntPtr ptr = getTestNIntPtr().getGuarded(NINT_SUB_FROM, NINT_SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestNIntPtr().isConstPtr());
        Assert.assertEquals(NINT_SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(NINT_SUB_TO, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuardedNUInt_from_to() {
        NUIntPtr ptr = getTestNUIntPtr().getGuarded(NUINT_SUB_FROM, NUINT_SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestNUIntPtr().isConstPtr());
        Assert.assertEquals(NUINT_SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(NUINT_SUB_TO, ptr.getGuardHigh());
    }

}
