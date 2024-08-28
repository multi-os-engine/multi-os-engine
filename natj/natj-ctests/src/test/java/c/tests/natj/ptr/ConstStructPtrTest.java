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
import c.binding.struct.NJRect;
import c.tests.NatJTest;
import c.util.DataSource;
import org.moe.natj.general.ptr.Ptr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ConstStructPtrTest extends NatJTest {

    private static final NJRect OBJECT_VALUES[] = DataSource.getStructs();

    private static final int NUM_VALUES = OBJECT_VALUES.length;
    private static final int SUB_FROM = 1;
    private static final int SUB_TO = NUM_VALUES - 1;
    private static final int SUB_LENGTH = SUB_TO - SUB_FROM;

    private Ptr<NJRect> getTestPtr() {
        return (Ptr<NJRect>) NativeDataSource.getStructTestPtr();
    }

    private Ptr<NJRect> getZeroPtr() {
        return (Ptr<NJRect>) NativeDataSource.getStructZeroPtr();
    }

    private void failIfConst(Ptr<NJRect> ptr) {
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
        NJRect exp = OBJECT_VALUES[0];
        NJRect act = getTestPtr().get();
        assertEquals(exp, act);
    }

    @Test
    public void test_get_idx__ConstPtr() {
        Ptr<NJRect> ptr = getTestPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            NJRect exp = OBJECT_VALUES[idx];
            NJRect act = ptr.get(idx);
            assertEquals(exp, act);
        }
    }

    @Test
    public void test_toArray_len__ConstPtr() {
        NJRect[] exp = OBJECT_VALUES;
        NJRect[] act = getTestPtr().toArray(NUM_VALUES);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_toArray_from_to__ConstPtr() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        NJRect[] act = getTestPtr().toArray(SUB_FROM, SUB_TO);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest__ConstPtr() {
        NJRect[] exp = OBJECT_VALUES;
        NJRect[] act = new NJRect[NUM_VALUES];
        getTestPtr().copyTo(act);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_dest_len__ConstPtr() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, 0, SUB_LENGTH);
        NJRect[] act = new NJRect[NUM_VALUES];
        getTestPtr().copyTo(act, SUB_LENGTH);
        act = Arrays.copyOfRange(act, 0, SUB_LENGTH);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyTo_srcoff_dest_destoff_len__ConstPtr() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        NJRect[] act = new NJRect[NUM_VALUES];
        getTestPtr().copyTo(SUB_FROM, act, SUB_FROM, SUB_LENGTH);
        act = Arrays.copyOfRange(act, SUB_FROM, SUB_TO);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_set_value__Ptr() {
        NJRect exp = OBJECT_VALUES[0];
        Ptr<NJRect> ptr = getZeroPtr();
        try {
            ptr.set(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NJRect act = ptr.get();
        assertEquals(exp, act);
    }

    @Test
    public void test_set_idx_value__Ptr() {
        Ptr<NJRect> ptr = getZeroPtr();
        for (int idx = 0; idx < NUM_VALUES; ++idx) {
            NJRect exp = OBJECT_VALUES[idx];
            try {
                ptr.set(idx, exp);
                failIfConst(ptr);
            } catch (UnsupportedOperationException ex) {
                if (ptr.isConstPtr()) {
                    return;
                }
                Assert.fail("unexpected exception");
            }
            NJRect act = ptr.get(idx);
            assertEquals(exp, act);
        }
    }

    @Test
    public void test_copyFrom_src__Ptr() {
        NJRect[] exp = OBJECT_VALUES;
        Ptr<NJRect> ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NJRect[] act = ptr.toArray(NUM_VALUES);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff__Ptr() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NJRect> ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NJRect[] act = ptr.toArray(SUB_FROM, SUB_TO);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_destoff_len__Ptr() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NJRect> ptr = getZeroPtr();
        try {
            ptr.copyFrom(exp, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NJRect[] act = ptr.toArray(SUB_FROM, SUB_TO);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_copyFrom_src_srcoff_destoff_len__Ptr() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NJRect> ptr = getZeroPtr();
        try {
            ptr.copyFrom(OBJECT_VALUES, SUB_FROM, SUB_FROM, SUB_LENGTH);
            failIfConst(ptr);
        } catch (UnsupportedOperationException ex) {
            if (ptr.isConstPtr()) {
                return;
            }
            Assert.fail("unexpected exception");
        }
        NJRect[] act = ptr.toArray(SUB_FROM, SUB_TO);
        assertArrayEquals(exp, act);
    }

    @Test
    public void test_ofs_idx() {
        NJRect[] exp = Arrays.copyOfRange(OBJECT_VALUES, SUB_FROM, SUB_TO);
        Ptr<NJRect> ofs = (Ptr<NJRect>) getTestPtr().ofs(SUB_FROM);
        NJRect[] act = ofs.toArray(SUB_LENGTH);
        assertArrayEquals(exp, act);
        Assert.assertEquals(getTestPtr().getClass(), ofs.getClass());
    }

    @Test
    public void test_getGuarded_len() {
        Ptr<NJRect> ptr = (Ptr<NJRect>) getTestPtr().getGuarded(NUM_VALUES);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(0, ptr.getGuardLow());
        Assert.assertEquals(NUM_VALUES, ptr.getGuardHigh());
    }

    @Test
    public void test_getGuarded_from_to() {
        Ptr<NJRect> ptr = (Ptr<NJRect>) getTestPtr().getGuarded(SUB_FROM, SUB_TO);
        Assert.assertNotNull(ptr);
        Assert.assertTrue(ptr.isGuarded());
        Assert.assertTrue(ptr.isConstPtr() == getTestPtr().isConstPtr());
        Assert.assertEquals(SUB_FROM, ptr.getGuardLow());
        Assert.assertEquals(SUB_TO, ptr.getGuardHigh());
    }

}
