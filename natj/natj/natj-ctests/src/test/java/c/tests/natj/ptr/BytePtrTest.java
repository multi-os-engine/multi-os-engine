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
import org.moe.natj.general.ptr.BytePtr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BytePtrTest extends NatJTest {

    private static final byte VALUES[] = DataSource.getRawBytes();
    private static final Byte OBJECT_VALUES[] = DataSource.getObjectBytes();

    private static final int NUM_VALUES = VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private BytePtr getTestPtr() {
        return DataSource.getByteTestPtr();
    }

    private BytePtr getZeroPtr() {
        return DataSource.getByteZeroPtr();
    }

    private void failIfConst(BytePtr ptr) {
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
        Byte exp = OBJECT_VALUES[0];
        Byte act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        BytePtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Byte exp = OBJECT_VALUES[idx];
            Byte act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        Byte[] exp = OBJECT_VALUES;
        Byte[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        Byte[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Byte[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        Byte[] exp = OBJECT_VALUES;
        Byte[] act = new Byte[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        Byte[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        Byte[] act = new Byte[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        Byte[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Byte[] act = new Byte[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        Byte exp = OBJECT_VALUES[0];
        BytePtr ptr = getZeroPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Byte act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_idx_value__Ptr() {
        BytePtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Byte exp = OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Byte act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_copyFrom_src__Ptr() {
        Byte[] exp = OBJECT_VALUES;
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Byte[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        Byte[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Byte[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        Byte[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Byte[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        Byte[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Byte[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_getValue() {
        byte exp = VALUES[0];
        byte act = getTestPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getValue_idx() {
        BytePtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            byte exp = VALUES[idx];
            byte act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_toByteArray_len() {
        byte[] exp = VALUES;
        byte[] act = getTestPtr().toByteArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toByteArray_from_to() {
        byte[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        byte[] act = getTestPtr().toByteArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest() {
        byte[] exp = VALUES;
        byte[] act = new byte[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest_len() {
        byte[] exp = Arrays.copyOfRange(VALUES, 0, SUB_LENGTH);
        byte[] act = new byte[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len() {
        byte[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        byte[] act = new byte[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_value() {
        byte exp = VALUES[0];
        BytePtr ptr = getZeroPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        byte act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_idx_value() {
        BytePtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            byte exp = VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            byte act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_copyFrom_src() {
        byte[] exp = VALUES;
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        byte[] act = ptr.toByteArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff() {
        byte[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        byte[] act = ptr.toByteArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff_len() {
        byte[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        byte[] act = ptr.toByteArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len() {
        byte[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        BytePtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        byte[] act = ptr.toByteArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_ofs_idx() {
        byte[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        BytePtr ofs = getTestPtr().ofs(SUB_FROM);
        byte[] act = ofs.toByteArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        BytePtr ptr = getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        BytePtr ptr = getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
