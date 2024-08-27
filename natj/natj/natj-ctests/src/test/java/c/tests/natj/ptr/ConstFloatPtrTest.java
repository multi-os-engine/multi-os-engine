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
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.Ptr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConstFloatPtrTest extends NatJTest {

	/*
     * FloatPtr test fields
	 */

    private static final float FLOAT_VALUES[] = DataSource.getRawFloats();
    private static final Float FLOAT_OBJECT_VALUES[] = DataSource.getObjectFloats();

    private static final int FLOAT_NUM_VALUES = FLOAT_VALUES.length;
    private static final int FLOAT_SUB_FROM = 1;
    private static final int FLOAT_SUB_TO = FLOAT_NUM_VALUES - 1;
    private static final int FLOAT_SUB_LENGTH = FLOAT_SUB_TO - FLOAT_SUB_FROM;

	/*
	 * NFloatPtr test fields
	 */

    private static final double NFLOAT_VALUES[] = DataSource.getRawNFloats();
    private static final Double NFLOAT_OBJECT_VALUES[] = DataSource.getObjectNFloats();

    private static final int NFLOAT_NUM_VALUES = NFLOAT_VALUES.length;
    private static final int NFLOAT_SUB_FROM = 1;
    private static final int NFLOAT_SUB_TO = NFLOAT_NUM_VALUES - 1;
    private static final int NFLOAT_SUB_LENGTH = NFLOAT_SUB_TO - NFLOAT_SUB_FROM;

    private FloatPtr getTestFloatPtr() {
        return (FloatPtr) NativeDataSource.getFloatTestPtr();
    }

    private NFloatPtr getTestNFloatPtr() {
        return (NFloatPtr) NativeDataSource.getNFloatTestPtr();
    }

    private FloatPtr getZeroFloatPtr() {
        return (FloatPtr) NativeDataSource.getFloatZeroPtr();
    }

    private NFloatPtr getZeroNFloatPtr() {
        return (NFloatPtr) NativeDataSource.getNFloatZeroPtr();
    }

    private void failIfConst(Ptr ptr) {
        if (ptr.isConstPtr()) {
            Assert.fail("failed to throw exception (const ptr)");
        }
    }

    @Before
    public void prepare() {
        Assert.assertNotNull("Float test values did not initialize", FLOAT_VALUES);
        Assert.assertNotNull("Float test values did not initialize (object)", FLOAT_OBJECT_VALUES);

        Assert.assertNotNull("NFloat test values did not initialize", NFLOAT_VALUES);
        Assert.assertNotNull("NFloat test values did not initialize (object)", NFLOAT_OBJECT_VALUES);
    }

	/* Test #1 */

    @Test
    public void test_get__ConstFloatPtr() {
        Float exp = FLOAT_OBJECT_VALUES[0];
        Float act = getTestFloatPtr().get();
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void test_get__ConstNFloatPtr() {
        Double exp = NFLOAT_OBJECT_VALUES[0];
        Double act = getTestNFloatPtr().get();
        Assert.assertEquals(exp, act, 0);
    }

	/* Test #2 */

    @Test
    public void test_get_idx__ConstFloatPtr() {
        FloatPtr ptr = getTestFloatPtr();
        for (int idx = 0; idx < FLOAT_NUM_VALUES; ++idx) {
            Float exp = FLOAT_OBJECT_VALUES[idx];
            Float act = ptr.get(idx);
            Assert.assertEquals(exp, act, 0);
        }
    }

    @Test
    public void test_get_idx__ConstNFloatPtr() {
        NFloatPtr ptr = getTestNFloatPtr();
        for (int idx = 0; idx < NFLOAT_NUM_VALUES; ++idx) {
            Double exp = NFLOAT_OBJECT_VALUES[idx];
            Double act = ptr.get(idx);
            Assert.assertEquals(exp, act, 0);
        }
    }

	/* Test #3 */

    @Test
    public void test_toArray_len__ConstFloatPtr() {
        Float[] exp = FLOAT_OBJECT_VALUES;
        Float[] act = getTestFloatPtr().toArray(FLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_len__ConstNFloatPtr() {
        Double[] exp = NFLOAT_OBJECT_VALUES;
        Double[] act = getTestNFloatPtr().toArray(NFLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #4 */

    @Test
    public void test_toArray_from_to__ConstFloatPtr() {
        Float[] exp = Arrays.copyOfRange(FLOAT_OBJECT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Float[] act = getTestFloatPtr().toArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstNFloatPtr() {
        Double[] exp = Arrays.copyOfRange(NFLOAT_OBJECT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Double[] act = getTestNFloatPtr().toArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #5 */

    @Test
    public void test_copyTo_dest__ConstFloatPtr() {
        Float[] exp = FLOAT_OBJECT_VALUES;
        Float[] act = new Float[FLOAT_NUM_VALUES];
        getTestFloatPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstNFloatPtr() {
        Double[] exp = NFLOAT_OBJECT_VALUES;
        Double[] act = new Double[NFLOAT_NUM_VALUES];
        getTestNFloatPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #6 */

    @Test
    public void test_copyTo_dest_len__ConstFloatPtr() {
        Float[] exp = Arrays.copyOfRange(FLOAT_OBJECT_VALUES, 0, FLOAT_SUB_LENGTH);
        Float[] act = new Float[FLOAT_NUM_VALUES];
        getTestFloatPtr().copyTo(act, FLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, FLOAT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstNFloatPtr() {
        Double[] exp = Arrays.copyOfRange(NFLOAT_OBJECT_VALUES, 0, NFLOAT_SUB_LENGTH);
        Double[] act = new Double[NFLOAT_NUM_VALUES];
        getTestNFloatPtr().copyTo(act, NFLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, NFLOAT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #7 */

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstFloatPtr() {
        Float[] exp = Arrays.copyOfRange(FLOAT_OBJECT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Float[] act = new Float[FLOAT_NUM_VALUES];
        getTestFloatPtr().copyTo(FLOAT_SUB_FROM, act, FLOAT_SUB_FROM, FLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstNFloatPtr() {
        Double[] exp = Arrays.copyOfRange(NFLOAT_OBJECT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Double[] act = new Double[NFLOAT_NUM_VALUES];
        getTestNFloatPtr().copyTo(NFLOAT_SUB_FROM, act, NFLOAT_SUB_FROM, NFLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #8 */

    @Test
    public void test_set_value__FloatPtr() {
        Float exp = FLOAT_OBJECT_VALUES[0];
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Float act = ptr.get();
        Assert.assertEquals(exp, act, 0);
    }

    @Test
    public void test_set_value__NFloatPtr() {
        Double exp = NFLOAT_OBJECT_VALUES[0];
        NFloatPtr ptr = getZeroNFloatPtr();
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
        Assert.assertEquals(exp, act, 0);
    }

	/* Test #9 */

    @Test
    public void test_set_idx_value__FloatPtr() {
        FloatPtr ptr = getZeroFloatPtr();
        for (int idx = 0; idx < FLOAT_NUM_VALUES; ++idx) {
            Float exp = FLOAT_OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Float act = ptr.get(idx);
            Assert.assertEquals(exp, act, 0);
        }
    }

    @Test
    public void test_set_idx_value__NFloatPtr() {
        NFloatPtr ptr = getZeroNFloatPtr();
        for (int idx = 0; idx < NFLOAT_NUM_VALUES; ++idx) {
            Double exp = NFLOAT_OBJECT_VALUES[idx];
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
            Assert.assertEquals(exp, act, 0);
        }
    }

	/* Test #10 */

    @Test
    public void test_copyFrom_src__FloatPtr() {
        Float[] exp = FLOAT_OBJECT_VALUES;
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Float[] act = ptr.toArray(FLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src__NFloatPtr() {
        Double[] exp = NFLOAT_OBJECT_VALUES;
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(NFLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #11 */

    @Test
    public void test_copyFrom_src_destoff__FloatPtr() {
        Float[] exp = Arrays.copyOfRange(FLOAT_OBJECT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(exp, FLOAT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Float[] act = ptr.toArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__NFloatPtr() {
        Double[] exp = Arrays.copyOfRange(NFLOAT_OBJECT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(exp, NFLOAT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #12 */

    @Test
    public void test_copyFrom_src_destoff_len__FloatPtr() {
        Float[] exp = Arrays.copyOfRange(FLOAT_OBJECT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(exp, FLOAT_SUB_FROM, FLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Float[] act = ptr.toArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__NFloatPtr() {
        Double[] exp = Arrays.copyOfRange(NFLOAT_OBJECT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(exp, NFLOAT_SUB_FROM, NFLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #13 */

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__FloatPtr() {
        Float[] exp = Arrays.copyOfRange(FLOAT_OBJECT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(FLOAT_OBJECT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_FROM, FLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Float[] act = ptr.toArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__NFloatPtr() {
        Double[] exp = Arrays.copyOfRange(NFLOAT_OBJECT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(NFLOAT_OBJECT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_FROM, NFLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Double[] act = ptr.toArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

	/* Test #14 */

    @Test
    public void test_getFloatValue() {
        float exp = FLOAT_VALUES[0];
        float act = getTestFloatPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_getNFloatValue() {
        double exp = NFLOAT_VALUES[0];
        double act = getTestNFloatPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #15 */

    @Test
    public void test_getFloatValue_idx() {
        FloatPtr ptr = getTestFloatPtr();
        for (int idx = 0; idx < FLOAT_NUM_VALUES; ++idx) {
            float exp = FLOAT_VALUES[idx];
            float act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */, 0);
        }
    }

    @Test
    public void test_getNFloatValue_idx() {
        NFloatPtr ptr = getTestNFloatPtr();
        for (int idx = 0; idx < NFLOAT_NUM_VALUES; ++idx) {
            double exp = NFLOAT_VALUES[idx];
            double act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */, 0);
        }
    }

	/* Test #16 */

    @Test
    public void test_toFloatArray_len() {
        float[] exp = FLOAT_VALUES;
        float[] act = getTestFloatPtr().toFloatArray(FLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_toNFloatArray_len() {
        double[] exp = NFLOAT_VALUES;
        double[] act = getTestNFloatPtr().toDoubleArray(NFLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #17 */

    @Test
    public void test_toFloatArray_from_to() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        float[] act = getTestFloatPtr().toFloatArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_toNFloatArray_from_to() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        double[] act = getTestNFloatPtr().toDoubleArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #18 */

    @Test
    public void test_copyFloatTo_dest() {
        float[] exp = FLOAT_VALUES;
        float[] act = new float[FLOAT_NUM_VALUES];
        getTestFloatPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatTo_dest() {
        double[] exp = NFLOAT_VALUES;
        double[] act = new double[NFLOAT_NUM_VALUES];
        getTestNFloatPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #19 */

    @Test
    public void test_copyFloatTo_dest_len() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, 0, FLOAT_SUB_LENGTH);
        float[] act = new float[FLOAT_NUM_VALUES];
        getTestFloatPtr().copyTo(act, FLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, FLOAT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatTo_dest_len() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, 0, NFLOAT_SUB_LENGTH);
        double[] act = new double[NFLOAT_NUM_VALUES];
        getTestNFloatPtr().copyTo(act, NFLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, NFLOAT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #20 */

    @Test
    public void test_copyFloatTo_srcoff_dest_destoff_len() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        float[] act = new float[FLOAT_NUM_VALUES];
        getTestFloatPtr().copyTo(FLOAT_SUB_FROM, act, FLOAT_SUB_FROM, FLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatTo_srcoff_dest_destoff_len() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        double[] act = new double[NFLOAT_NUM_VALUES];
        getTestNFloatPtr().copyTo(NFLOAT_SUB_FROM, act, NFLOAT_SUB_FROM, NFLOAT_SUB_LENGTH);
        act = Arrays.copyOfRange(act, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #21 */

    @Test
    public void test_setFloatValue_value() {
        float exp = FLOAT_VALUES[0];
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        float act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_setNFloatValue_value() {
        double exp = NFLOAT_VALUES[0];
        NFloatPtr ptr = getZeroNFloatPtr();
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
        Assert.assertEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #22 */

    @Test
    public void test_setFloatValue_idx_value() {
        FloatPtr ptr = getZeroFloatPtr();
        for (int idx = 0; idx < FLOAT_NUM_VALUES; ++idx) {
            float exp = FLOAT_VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            float act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */, 0);
        }
    }

    @Test
    public void test_setNFloatValue_idx_value() {
        NFloatPtr ptr = getZeroNFloatPtr();
        for (int idx = 0; idx < NFLOAT_NUM_VALUES; ++idx) {
            double exp = NFLOAT_VALUES[idx];
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
            Assert.assertEquals(exp, act/* FP_DELTA */, 0);
        }
    }

	/* Test #23 */

    @Test
    public void test_copyFloatFrom_src() {
        float[] exp = FLOAT_VALUES;
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        float[] act = ptr.toFloatArray(FLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatFrom_src() {
        double[] exp = NFLOAT_VALUES;
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(NFLOAT_NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #24 */

    @Test
    public void test_copyFloatFrom_src_destoff() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(exp, FLOAT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        float[] act = ptr.toFloatArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatFrom_src_destoff() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(exp, NFLOAT_SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #25 */

    @Test
    public void test_copyFloatFrom_src_destoff_len() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(exp, FLOAT_SUB_FROM, FLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        float[] act = ptr.toFloatArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatFrom_src_destoff_len() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(exp, NFLOAT_SUB_FROM, NFLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #26 */

    @Test
    public void test_copyFloatFrom_src_srcoff_destoff_len() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ptr = getZeroFloatPtr();
        try {
            ptr.copyFrom(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_FROM, FLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        float[] act = ptr.toFloatArray(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

    @Test
    public void test_copyNFloatFrom_src_srcoff_destoff_len() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ptr = getZeroNFloatPtr();
        try {
            ptr.copyFrom(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_FROM, NFLOAT_SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        double[] act = ptr.toDoubleArray(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
    }

	/* Test #27 */

    @Test
    public void test_ofs_idx_Float() {
        float[] exp = Arrays.copyOfRange(FLOAT_VALUES, FLOAT_SUB_FROM, FLOAT_SUB_TO);
        FloatPtr ofs = getTestFloatPtr().ofs(FLOAT_SUB_FROM);
        float[] act = ofs.toFloatArray(FLOAT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
        Assert.assertEquals(getTestFloatPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_ofs_idx_NFloat() {
        double[] exp = Arrays.copyOfRange(NFLOAT_VALUES, NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        NFloatPtr ofs = getTestNFloatPtr().ofs(NFLOAT_SUB_FROM);
        double[] act = ofs.toDoubleArray(NFLOAT_SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */, 0);
        Assert.assertEquals(getTestNFloatPtr().getClass(), ofs.getClass());
    }

	/* Test #28 */

    @Test
    public void test_getGuardedFloat_len() {
        FloatPtr ptr = getTestFloatPtr().getGuarded(FLOAT_NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestFloatPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(FLOAT_NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuardedNFloat_len() {
        NFloatPtr ptr = getTestNFloatPtr().getGuarded(NFLOAT_NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestNFloatPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NFLOAT_NUM_VALUES, ptr.getGuardHigh());
    }

	/* Test #29 */

    @Test
    public void test_gettGuardedFloat_from_to() {
        FloatPtr ptr = getTestFloatPtr().getGuarded(FLOAT_SUB_FROM, FLOAT_SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestFloatPtr().isConstPtr());
        Assert.assertEquals(FLOAT_SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(FLOAT_SUB_TO, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuardedNFloat_from_to() {
        NFloatPtr ptr = getTestNFloatPtr().getGuarded(NFLOAT_SUB_FROM, NFLOAT_SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestNFloatPtr().isConstPtr());
        Assert.assertEquals(NFLOAT_SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(NFLOAT_SUB_TO, ptr.getGuardHigh());
    }

}
