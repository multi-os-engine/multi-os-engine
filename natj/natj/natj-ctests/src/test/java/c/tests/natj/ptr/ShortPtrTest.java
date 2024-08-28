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
import org.moe.natj.general.ptr.ShortPtr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ShortPtrTest extends NatJTest {

    private static final short VALUES[] = DataSource.getRawShorts();
    private static final Short OBJECT_VALUES[] = DataSource.getObjectShorts();

    private static final int NUM_VALUES = VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private ShortPtr getTestPtr() {
        return DataSource.getShortTestPtr();
    }

    private ShortPtr getZeroPtr() {
        return DataSource.getShortZeroPtr();
    }

    private void failIfConst(ShortPtr ptr) {
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
        Short exp = OBJECT_VALUES[0];
        Short act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        ShortPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Short exp = OBJECT_VALUES[idx];
            Short act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        Short[] exp = OBJECT_VALUES;
        Short[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        Short[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Short[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        Short[] exp = OBJECT_VALUES;
        Short[] act = new Short[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        Short[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        Short[] act = new Short[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        Short[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Short[] act = new Short[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        Short exp = OBJECT_VALUES[0];
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Short act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_idx_value__Ptr() {
        ShortPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Short exp = OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Short act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_copyFrom_src__Ptr() {
        Short[] exp = OBJECT_VALUES;
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Short[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        Short[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Short[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        Short[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Short[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        Short[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Short[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_getValue() {
        short exp = VALUES[0];
        short act = getTestPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getValue_idx() {
        ShortPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            short exp = VALUES[idx];
            short act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_toShortArray_len() {
        short[] exp = VALUES;
        short[] act = getTestPtr().toShortArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toShortArray_from_to() {
        short[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        short[] act = getTestPtr().toShortArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest() {
        short[] exp = VALUES;
        short[] act = new short[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest_len() {
        short[] exp = Arrays.copyOfRange(VALUES, 0, SUB_LENGTH);
        short[] act = new short[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len() {
        short[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        short[] act = new short[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_value() {
        short exp = VALUES[0];
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        short act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_idx_value() {
        ShortPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            short exp = VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            short act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_copyFrom_src() {
        short[] exp = VALUES;
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        short[] act = ptr.toShortArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff() {
        short[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        short[] act = ptr.toShortArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff_len() {
        short[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        short[] act = ptr.toShortArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len() {
        short[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        ShortPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        short[] act = ptr.toShortArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_ofs_idx() {
        short[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        ShortPtr ofs = getTestPtr().ofs(SUB_FROM);
        short[] act = ofs.toShortArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        ShortPtr ptr = getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        ShortPtr ptr = getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
