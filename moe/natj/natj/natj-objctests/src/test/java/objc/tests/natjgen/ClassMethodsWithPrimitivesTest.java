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

package objc.tests.natjgen;

import org.moe.natj.general.ptr.*;
import objc.binding.PrimitiveClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ClassMethodsWithPrimitivesTest {

    private static final int COUNT = 10;
    private static final int COUNT_N = COUNT - 1;
    private static final Random random = new Random();

    @Test
    public void testBool() {
        boolean a = PrimitiveClass.boolCreate_static(random.nextBoolean());
        boolean b = PrimitiveClass.boolCreate_static(!a);
        Assert.assertTrue(PrimitiveClass.boolCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.boolCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.boolCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.boolCompare_static(b, a));
    }

    @Test
    public void testBoolPtr() {
        // Create_static a
        BoolPtr a = PrimitiveClass.boolCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextBoolean());
        }
        a.setValue(COUNT_N, true);

        // Create_static b & Compare_static a with b
        BoolPtr b = PrimitiveClass.boolCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextBoolean());
        }
        b.setValue(COUNT_N, false);
        Assert.assertFalse(PrimitiveClass.boolArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, true);
        Assert.assertTrue(PrimitiveClass.boolArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.boolArrayFree_static(a);
        PrimitiveClass.boolArrayFree_static(b);
    }

    @Test
    public void testBoolPtrPtr() {
        // Create_static a
        BoolPtr a = PrimitiveClass.boolCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextBoolean());
        }

        // Create_static b & Compare_static a with b
        Ptr<BoolPtr> b = PrimitiveClass.boolCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass
                .boolArrayRefCompare_static(b, a, COUNT));

        // Free a & b
        PrimitiveClass.boolArrayFree_static(a);
        PrimitiveClass.boolArrayRefFree_static(b);
    }

    @Test
    public void testByte() {
        byte a = PrimitiveClass.byteCreate_static((byte) random.nextInt());
        byte b = PrimitiveClass.byteCreate_static((byte) (a + 50));
        Assert.assertTrue(PrimitiveClass.byteCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.byteCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.byteCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.byteCompare_static(b, a));
    }

    @Test
    public void testBytePtr() {
        // Create_static a
        BytePtr a = PrimitiveClass.byteCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (byte) random.nextInt());
        }
        a.setValue(COUNT_N, (byte) 1);

        // Create_static b & Compare_static a with b
        BytePtr b = PrimitiveClass.byteCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (byte) random.nextInt());
        }
        b.setValue(COUNT_N, (byte) 0);
        Assert.assertFalse(PrimitiveClass.byteArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (byte) 1);
        Assert.assertTrue(PrimitiveClass.byteArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.byteArrayFree_static(a);
        PrimitiveClass.byteArrayFree_static(b);
    }

    @Test
    public void testBytePtrPtr() {
        // Create_static a
        BytePtr a = PrimitiveClass.byteCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (byte) random.nextInt());
        }

        // Create_static b & Compare_static a with b
        Ptr<BytePtr> b = PrimitiveClass.byteCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass
                .byteArrayRefCompare_static(b, a, COUNT));

        // Free a & b
        PrimitiveClass.byteArrayFree_static(a);
        PrimitiveClass.byteArrayRefFree_static(b);
    }

    @Test
    public void testShort() {
        short a = PrimitiveClass.shortCreate_static((short) random.nextInt());
        short b = PrimitiveClass.shortCreate_static((short) (a + 50));
        Assert.assertTrue(PrimitiveClass.shortCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.shortCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.shortCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.shortCompare_static(b, a));
    }

    @Test
    public void testShortPtr() {
        // Create_static a
        ShortPtr a = PrimitiveClass.shortCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (short) random.nextInt());
        }
        a.setValue(COUNT_N, (short) 1);

        // Create_static b & Compare_static a with b
        ShortPtr b = PrimitiveClass.shortCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (short) random.nextInt());
        }
        b.setValue(COUNT_N, (short) 0);
        Assert.assertFalse(PrimitiveClass.shortArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (short) 1);
        Assert.assertTrue(PrimitiveClass.shortArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.shortArrayFree_static(a);
        PrimitiveClass.shortArrayFree_static(b);
    }

    @Test
    public void testShortPtrPtr() {
        // Create_static a
        ShortPtr a = PrimitiveClass.shortCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (short) random.nextInt());
        }

        // Create_static b & Compare_static a with b
        Ptr<ShortPtr> b = PrimitiveClass.shortCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass.shortArrayRefCompare_static(b, a,
                COUNT));

        // Free a & b
        PrimitiveClass.shortArrayFree_static(a);
        PrimitiveClass.shortArrayRefFree_static(b);
    }

    @Test
    public void testChar() {
        char a = PrimitiveClass.charCreate_static((char) random.nextInt());
        char b = PrimitiveClass.charCreate_static((char) (a + 50 % 0xFF));
        Assert.assertTrue(PrimitiveClass.charCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.charCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.charCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.charCompare_static(b, a));
    }

    @Test
    public void testCharPtr() {
        // Create_static a
        CharPtr a = PrimitiveClass.charCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (char) random.nextInt());
        }
        a.setValue(COUNT_N, (char) 1);

        // Create_static b & Compare_static a with b
        CharPtr b = PrimitiveClass.charCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (char) random.nextInt());
        }
        b.setValue(COUNT_N, (char) 0);
        Assert.assertFalse(PrimitiveClass.charArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (char) 1);
        Assert.assertTrue(PrimitiveClass.charArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.charArrayFree_static(a);
        PrimitiveClass.charArrayFree_static(b);
    }

    @Test
    public void testCharPtrPtr() {
        // Create_static a
        CharPtr a = PrimitiveClass.charCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (char) random.nextInt());
        }

        // Create_static b & Compare_static a with b
        Ptr<CharPtr> b = PrimitiveClass.charCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass
                .charArrayRefCompare_static(b, a, COUNT));

        // Free a & b
        PrimitiveClass.charArrayFree_static(a);
        PrimitiveClass.charArrayRefFree_static(b);
    }

    @Test
    public void testInt() {
        int a = PrimitiveClass.intCreate_static(random.nextInt());
        int b = PrimitiveClass.intCreate_static(a + 50);
        Assert.assertTrue(PrimitiveClass.intCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.intCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.intCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.intCompare_static(b, a));
    }

    @Test
    public void testIntPtr() {
        // Create_static a
        IntPtr a = PrimitiveClass.intCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextInt());
        }
        a.setValue(COUNT_N, 1);

        // Create_static b & Compare_static a with b
        IntPtr b = PrimitiveClass.intCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextInt());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(PrimitiveClass.intArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(PrimitiveClass.intArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.intArrayFree_static(a);
        PrimitiveClass.intArrayFree_static(b);
    }

    @Test
    public void testIntPtrPtr() {
        // Create_static a
        IntPtr a = PrimitiveClass.intCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextInt());
        }

        // Create_static b & Compare_static a with b
        Ptr<IntPtr> b = PrimitiveClass.intCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass.intArrayRefCompare_static(b, a, COUNT));

        // Free a & b
        PrimitiveClass.intArrayFree_static(a);
        PrimitiveClass.intArrayRefFree_static(b);
    }

    @Test
    public void testLong() {
        long a = PrimitiveClass.longCreate_static(random.nextLong());
        long b = PrimitiveClass.longCreate_static(a + 50);
        Assert.assertTrue(PrimitiveClass.longCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.longCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.longCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.longCompare_static(b, a));
    }

    @Test
    public void testLongPtr() {
        // Create_static a
        LongPtr a = PrimitiveClass.longCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextLong());
        }
        a.setValue(COUNT_N, 1);

        // Create_static b & Compare_static a with b
        LongPtr b = PrimitiveClass.longCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextLong());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(PrimitiveClass.longArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(PrimitiveClass.longArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.longArrayFree_static(a);
        PrimitiveClass.longArrayFree_static(b);
    }

    @Test
    public void testLongPtrPtr() {
        // Create_static a
        LongPtr a = PrimitiveClass.longCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextLong());
        }

        // Create_static b & Compare_static a with b
        Ptr<LongPtr> b = PrimitiveClass.longCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass
                .longArrayRefCompare_static(b, a, COUNT));

        // Free a & b
        PrimitiveClass.longArrayFree_static(a);
        PrimitiveClass.longArrayRefFree_static(b);
    }

    @Test
    public void testFloat() {
        float a = PrimitiveClass.floatCreate_static(random.nextFloat());
        float b = PrimitiveClass.floatCreate_static(a + 50);
        Assert.assertTrue(PrimitiveClass.floatCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.floatCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.floatCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.floatCompare_static(b, a));
    }

    @Test
    public void testFloatPtr() {
        // Create_static a
        FloatPtr a = PrimitiveClass.floatCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextFloat());
        }
        a.setValue(COUNT_N, 1);

        // Create_static b & Compare_static a with b
        FloatPtr b = PrimitiveClass.floatCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextFloat());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(PrimitiveClass.floatArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(PrimitiveClass.floatArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.floatArrayFree_static(a);
        PrimitiveClass.floatArrayFree_static(b);
    }

    @Test
    public void testFloatPtrPtr() {
        // Create_static a
        FloatPtr a = PrimitiveClass.floatCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextFloat());
        }

        // Create_static b & Compare_static a with b
        Ptr<FloatPtr> b = PrimitiveClass.floatCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass.floatArrayRefCompare_static(b, a,
                COUNT));

        // Free a & b
        PrimitiveClass.floatArrayFree_static(a);
        PrimitiveClass.floatArrayRefFree_static(b);
    }

    @Test
    public void testDouble() {
        double a = PrimitiveClass.doubleCreate_static(random.nextDouble());
        double b = PrimitiveClass.doubleCreate_static(a + 50);
        Assert.assertTrue(PrimitiveClass.doubleCompare_static(a, a));
        Assert.assertTrue(PrimitiveClass.doubleCompare_static(b, b));
        Assert.assertFalse(PrimitiveClass.doubleCompare_static(a, b));
        Assert.assertFalse(PrimitiveClass.doubleCompare_static(b, a));
    }

    @Test
    public void testDoublePtr() {
        // Create_static a
        DoublePtr a = PrimitiveClass.doubleCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextDouble());
        }
        a.setValue(COUNT_N, 1);

        // Create_static b & Compare_static a with b
        DoublePtr b = PrimitiveClass.doubleCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextDouble());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(PrimitiveClass
                .doubleArrayCompare_static(a, b, COUNT));

        // Update b & Compare_static a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(PrimitiveClass.doubleArrayCompare_static(a, b, COUNT));

        // Free a & b
        PrimitiveClass.doubleArrayFree_static(a);
        PrimitiveClass.doubleArrayFree_static(b);
    }

    @Test
    public void testDoublePtrPtr() {
        // Create_static a
        DoublePtr a = PrimitiveClass.doubleCreateArray_static(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextDouble());
        }

        // Create_static b & Compare_static a with b
        Ptr<DoublePtr> b = PrimitiveClass.doubleCreateArrayRef_static(a);
        Assert.assertTrue(PrimitiveClass.doubleArrayRefCompare_static(b, a,
                COUNT));

        // Free a & b
        PrimitiveClass.doubleArrayFree_static(a);
        PrimitiveClass.doubleArrayRefFree_static(b);
    }
}
