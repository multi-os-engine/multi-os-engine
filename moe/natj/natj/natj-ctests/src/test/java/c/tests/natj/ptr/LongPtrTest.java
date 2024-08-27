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

import c.tests.NatJTest;
import c.util.DataSource;
import org.moe.natj.general.ptr.LongPtr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class LongPtrTest extends NatJTest {

    private static final long VALUES[] = DataSource.getRawLongs();
    private static final Long OBJECT_VALUES[] = DataSource.getObjectLongs();

    private static final int NUM_VALUES = VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private LongPtr getTestPtr() {
        return DataSource.getLongTestPtr();
    }

    private LongPtr getZeroPtr() {
        return DataSource.getLongZeroPtr();
    }

    private void failIfConst(LongPtr ptr) {
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
        Long exp = OBJECT_VALUES[0];
        Long act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        LongPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Long exp = OBJECT_VALUES[idx];
            Long act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        Long[] exp = OBJECT_VALUES;
        Long[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        Long[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Long[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        Long[] exp = OBJECT_VALUES;
        Long[] act = new Long[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        Long[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        Long[] act = new Long[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        Long[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Long[] act = new Long[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        Long exp = OBJECT_VALUES[0];
        LongPtr ptr = getZeroPtr();
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
    public void test_set_idx_value__Ptr() {
        LongPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Long exp = OBJECT_VALUES[idx];
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
    public void test_copyFrom_src__Ptr() {
        Long[] exp = OBJECT_VALUES;
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        Long[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        Long[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        Long[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Long[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_getValue() {
        long exp = VALUES[0];
        long act = getTestPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getValue_idx() {
        LongPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            long exp = VALUES[idx];
            long act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_toLongArray_len() {
        long[] exp = VALUES;
        long[] act = getTestPtr().toLongArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toLongArray_from_to() {
        long[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        long[] act = getTestPtr().toLongArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest() {
        long[] exp = VALUES;
        long[] act = new long[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest_len() {
        long[] exp = Arrays.copyOfRange(VALUES, 0, SUB_LENGTH);
        long[] act = new long[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len() {
        long[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        long[] act = new long[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_value() {
        long exp = VALUES[0];
        LongPtr ptr = getZeroPtr();
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
    public void test_setValue_idx_value() {
        LongPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            long exp = VALUES[idx];
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
    public void test_copyFrom_src() {
        long[] exp = VALUES;
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff() {
        long[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff_len() {
        long[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len() {
        long[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        LongPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        long[] act = ptr.toLongArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_ofs_idx() {
        long[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        LongPtr ofs = getTestPtr().ofs(SUB_FROM);
        long[] act = ofs.toLongArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        LongPtr ptr = getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        LongPtr ptr = getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
