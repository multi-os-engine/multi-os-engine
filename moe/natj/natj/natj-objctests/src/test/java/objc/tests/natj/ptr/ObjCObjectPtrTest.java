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

package objc.tests.natj.ptr;


import org.moe.natj.general.ptr.Ptr;
import mac.foundation.NSNumber;
import objc.tests.NatJTest;
import objc.util.DataSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ObjCObjectPtrTest extends NatJTest {

    private static final NSNumber OBJECT_VALUES[] = DataSource.getObjCObjects();

    private static final int NUM_VALUES = OBJECT_VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private Ptr<NSNumber> getTestPtr() {
        return DataSource.getObjCObjectTestPtr();
    }

    private Ptr<NSNumber> getZeroPtr() {
        return DataSource.getObjCObjectZeroPtr();
    }

    private void failIfConst(Ptr<NSNumber> ptr) {
        if (ptr.isConstPtr()) {
            Assert.fail("failed to throw exception (const ptr)");
        }
    }

    @Before
    public void prepare() {
        Assert.assertNotNull("test values did not initialize", OBJECT_VALUES);
    }

    @Test
    public void test_get__ConstPtr() {
        NSNumber exp = OBJECT_VALUES[0];
        NSNumber act = getTestPtr().get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        Ptr<NSNumber> ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            NSNumber exp = OBJECT_VALUES[idx];
            NSNumber act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        NSNumber[] exp = OBJECT_VALUES;
        NSNumber[] act = getTestPtr().toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        NSNumber[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        NSNumber[] exp = OBJECT_VALUES;
        NSNumber[] act = new NSNumber[NUM_VALUES];
        getTestPtr().copyTo(act);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        NSNumber[] act = new NSNumber[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        NSNumber[] act = new NSNumber[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        NSNumber exp = OBJECT_VALUES[0];
        Ptr<NSNumber> ptr = getZeroPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NSNumber act = ptr.get();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test_set_idx_value__Ptr() {
        Ptr<NSNumber> ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            NSNumber exp = OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            NSNumber act = ptr.get(idx);
            Assert.assertEquals(exp, act);
        }
    }

    @Test
    public void test_copyFrom_src__Ptr() {
        NSNumber[] exp = OBJECT_VALUES;
        Ptr<NSNumber> ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NSNumber[] act = ptr.toArray(NUM_VALUES);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NSNumber> ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NSNumber[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NSNumber> ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NSNumber[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NSNumber> ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NSNumber[] act = ptr.toArray(SUB_FROM, SUB_TO);
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void test_ofs_idx() {
        NSNumber[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NSNumber> ofs = (Ptr<NSNumber>) getTestPtr().ofs(SUB_FROM);
        NSNumber[] act = ofs.toArray(SUB_LENGTH);
        Assert.assertArrayEquals(exp, act);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        Ptr<NSNumber> ptr = (Ptr<NSNumber>) getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertEquals(ptr.isConstPtr(), getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        Ptr<NSNumber> ptr = (Ptr<NSNumber>) getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertEquals(ptr.isConstPtr(), getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }
}
