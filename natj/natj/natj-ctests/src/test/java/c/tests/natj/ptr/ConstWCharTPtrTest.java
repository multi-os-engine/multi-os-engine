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
import org.moe.natj.general.ptr.WCharTPtr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConstWCharTPtrTest extends NatJTest {

    private static final int VALUES[] = DataSource.getRawWCharTs();
    private static final Integer OBJECT_VALUES[] = DataSource.getObjectWCharTs();

    private static final int NUM_VALUES = VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private WCharTPtr getTestPtr() {
        return (WCharTPtr) NativeDataSource.getWCharTestPtr();
    }

    private WCharTPtr getZeroPtr() {
        return (WCharTPtr) NativeDataSource.getWCharTZeroPtr();
    }

    private void failIfConst(WCharTPtr ptr) {
        if (ptr.isConstPtr()) {
            Assert.fail("failed to throw exception (const ptr)");
        }
    }

    @Before
    public void prepare() {
        Assert.assertNotNull("test values did not initialize", VALUES);
        Assert.assertNotNull("test values did not initialize (object)", OBJECT_VALUES);
    }

    @Test
    public void test_get__ConstPtr() {
        Integer exp = OBJECT_VALUES[0];
        Integer act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        WCharTPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Integer exp = OBJECT_VALUES[idx];
            Integer act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        Integer[] exp = OBJECT_VALUES;
        Integer[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        Integer[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Integer[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        Integer[] exp = OBJECT_VALUES;
        Integer[] act = new Integer[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        Integer[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        Integer[] act = new Integer[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        Integer[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Integer[] act = new Integer[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        Integer exp = OBJECT_VALUES[0];
        WCharTPtr ptr = getZeroPtr();
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
    public void test_set_idx_value__Ptr() {
        WCharTPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Integer exp = OBJECT_VALUES[idx];
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
    public void test_copyFrom_src__Ptr() {
        Integer[] exp = OBJECT_VALUES;
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        Integer[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        Integer[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        Integer[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Integer[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_getValue() {
        int exp = VALUES[0];
        int act = getTestPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getValue_idx() {
        WCharTPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            int exp = VALUES[idx];
            int act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_toLongArray_len() {
        int[] exp = VALUES;
        int[] act = getTestPtr().toIntArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toLongArray_from_to() {
        int[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        int[] act = getTestPtr().toIntArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest() {
        int[] exp = VALUES;
        int[] act = new int[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest_len() {
        int[] exp = Arrays.copyOfRange(VALUES, 0, SUB_LENGTH);
        int[] act = new int[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len() {
        int[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        int[] act = new int[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_value() {
        int exp = VALUES[0];
        WCharTPtr ptr = getZeroPtr();
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
    public void test_setValue_idx_value() {
        WCharTPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            int exp = VALUES[idx];
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
    public void test_copyFrom_src() {
        int[] exp = VALUES;
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff() {
        int[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff_len() {
        int[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len() {
        int[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        int[] act = ptr.toIntArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_ofs_idx() {
        int[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        WCharTPtr ofs = getTestPtr().ofs(SUB_FROM);
        int[] act = ofs.toIntArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        WCharTPtr ptr = getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        WCharTPtr ptr = getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
