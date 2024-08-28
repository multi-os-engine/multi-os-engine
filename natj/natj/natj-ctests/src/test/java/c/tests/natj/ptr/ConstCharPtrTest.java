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
import org.moe.natj.general.ptr.CharPtr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConstCharPtrTest extends NatJTest {

    private static final char VALUES[] = DataSource.getRawCharacters();
    private static final Character OBJECT_VALUES[] = DataSource.getObjectCharacters();

    private static final int NUM_VALUES = VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private CharPtr getTestPtr() {
        return (CharPtr) NativeDataSource.getCharTestPtr();
    }

    private CharPtr getZeroPtr() {
        return (CharPtr) NativeDataSource.getCharZeroPtr();
    }

    private void failIfConst(CharPtr ptr) {
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
        Character exp = OBJECT_VALUES[0];
        Character act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        CharPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Character exp = OBJECT_VALUES[idx];
            Character act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        Character[] exp = OBJECT_VALUES;
        Character[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        Character[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Character[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        Character[] exp = OBJECT_VALUES;
        Character[] act = new Character[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        Character[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        Character[] act = new Character[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        Character[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Character[] act = new Character[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        Character exp = OBJECT_VALUES[0];
        CharPtr ptr = getZeroPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Character act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_idx_value__Ptr() {
        CharPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            Character exp = OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            Character act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_copyFrom_src__Ptr() {
        Character[] exp = OBJECT_VALUES;
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Character[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        Character[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Character[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        Character[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Character[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        Character[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        Character[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_getValue() {
        char exp = VALUES[0];
        char act = getTestPtr().getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_getValue_idx() {
        CharPtr ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            char exp = VALUES[idx];
            char act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_toCharArray_len() {
        char[] exp = VALUES;
        char[] act = getTestPtr().toCharArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_toCharArray_from_to() {
        char[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        char[] act = getTestPtr().toCharArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest() {
        char[] exp = VALUES;
        char[] act = new char[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_dest_len() {
        char[] exp = Arrays.copyOfRange(VALUES, 0, SUB_LENGTH);
        char[] act = new char[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len() {
        char[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        char[] act = new char[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_value() {
        char exp = VALUES[0];
        CharPtr ptr = getZeroPtr();
        try {
            ptr.setValue(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        char act = ptr.getValue();
        Assert.assertEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_setValue_idx_value() {
        CharPtr ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            char exp = VALUES[idx];
            try {
                ptr.setValue(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            char act = ptr.getValue(idx);
            Assert.assertEquals(exp, act/* FP_DELTA */);
        }
    }

    @Test
    public void test_copyFrom_src() {
        char[] exp = VALUES;
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        char[] act = ptr.toCharArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff() {
        char[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        char[] act = ptr.toCharArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_destoff_len() {
        char[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        char[] act = ptr.toCharArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len() {
        char[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        CharPtr ptr = getZeroPtr();
        try {
            ptr.copyFrom(VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        char[] act = ptr.toCharArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
    }

    @Test
    public void test_ofs_idx() {
        char[] exp = Arrays.copyOfRange(VALUES, SUB_FROM, SUB_TO);
        CharPtr ofs = getTestPtr().ofs(SUB_FROM);
        char[] act = ofs.toCharArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act/* FP_DELTA */);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        CharPtr ptr = getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        CharPtr ptr = getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
