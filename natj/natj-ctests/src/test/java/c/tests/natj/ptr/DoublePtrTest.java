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
import org.moe.natj.general.ptr.DoublePtr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DoublePtrTest extends NatJTest {

    private static final double VALUES[] = DataSource.getRawDoubles();
    private static final Double OBJECT_VALUES[] = DataSource.getObjectDoubles();

    private static final int NUM_VALUES = VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private DoublePtr getTestPtr() {
        return DataSource.getDoubleTestPtr();
    }

    private DoublePtr getZeroPtr() {
        return DataSource.getDoubleZeroPtr();
    }

    private void failIfConst(DoublePtr ptr) {
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
        Double exp = OBJECT_VALUES[0];
        Double act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        DoublePtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Double exp = OBJECT_VALUES[idx];
            Double act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        Double[] exp = OBJECT_VALUES;
        Double[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        Double[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Double[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        Double[] exp = OBJECT_VALUES;
        Double[] act = new Double[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        Double[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        Double[] act = new Double[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        Double[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Double[] act = new Double[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        Double exp = OBJECT_VALUES[0];
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_idx_value__Ptr() {
        DoublePtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Double exp = OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Double act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_copyFrom_src__Ptr() {
        Double[] exp = OBJECT_VALUES;
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        Double[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        Double[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        Double[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_getValue() {
        double exp = VALUES[0];
        double act = getTestPtr().getValue();
        Assert.assertEquals(exp, act, 0.0);
    }

    @Test
    public void test_getValue_idx() {
        DoublePtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            double exp = VALUES[idx];
            double act = ptr.getValue(idx);
            Assert.assertEquals(exp, act, 0.0);
        }
    }

    @Test
    public void test_toDoubleArray_len() {
        double[] exp = VALUES;
        double[] act = getTestPtr().toDoubleArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_toDoubleArray_from_to() {
        double[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        double[] act = getTestPtr().toDoubleArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_copyTo_dest() {
        double[] exp = VALUES;
        double[] act = new double[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_copyTo_dest_len() {
        double[] exp = Arrays.copyOfRange(VALUES, 0, SUB_LENGTH);
        double[] act = new double[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len() {
        double[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        double[] act = new double[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_setValue_value() {
        double exp = VALUES[0];
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double act = ptr.getValue();
        Assert.assertEquals(exp, act, 0.0);
    }

    @Test
    public void test_setValue_idx_value() {
        DoublePtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            double exp = VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            double act = ptr.getValue(idx);
            Assert.assertEquals(exp, act, 0.0);
        }
    }

    @Test
    public void test_copyFrom_src() {
        double[] exp = VALUES;
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_copyFrom_src_destoff() {
        double[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_copyFrom_src_destoff_len() {
        double[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len() {
        double[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        DoublePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act, 0.0);
    }

    @Test
    public void test_ofs_idx() {
        double[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        DoublePtr ofs = getTestPtr().ofs(SUB_FROM);
        double[] act = ofs.toDoubleArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act, 0.0);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        DoublePtr ptr = getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        DoublePtr ptr = getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
