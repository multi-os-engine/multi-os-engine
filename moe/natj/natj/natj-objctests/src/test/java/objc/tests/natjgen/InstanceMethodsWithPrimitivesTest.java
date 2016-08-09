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

public class InstanceMethodsWithPrimitivesTest {

    private static final int COUNT = 10;
    private static final int COUNT_N = COUNT - 1;
    private static final Random random = new Random();

    @Test
    public void testBool() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        boolean a = object.boolCreate(random.nextBoolean());
        boolean b = object.boolCreate(!a);
        Assert.assertTrue(object.boolCompare(a, a));
        Assert.assertTrue(object.boolCompare(b, b));
        Assert.assertFalse(object.boolCompare(a, b));
        Assert.assertFalse(object.boolCompare(b, a));
    }

    @Test
    public void testBoolPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        BoolPtr a = object.boolCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextBoolean());
        }
        a.setValue(COUNT_N, true);

        // Create b & compare a with b
        BoolPtr b = object.boolCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextBoolean());
        }
        b.setValue(COUNT_N, false);
        Assert.assertFalse(object.boolArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, true);
        Assert.assertTrue(object.boolArrayCompare(a, b, COUNT));

        // Free a & b
        object.boolArrayFree(a);
        object.boolArrayFree(b);
    }

    @Test
    public void testBoolPtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        BoolPtr a = object.boolCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextBoolean());
        }

        // Create b & compare a with b
        Ptr<BoolPtr> b = object.boolCreateArrayRef(a);
        Assert.assertTrue(object.boolArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.boolArrayFree(a);
        object.boolArrayRefFree(b);
    }

    @Test
    public void testByte() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        byte a = object.byteCreate((byte) random.nextInt());
        byte b = object.byteCreate((byte) (a + 50));
        Assert.assertTrue(object.byteCompare(a, a));
        Assert.assertTrue(object.byteCompare(b, b));
        Assert.assertFalse(object.byteCompare(a, b));
        Assert.assertFalse(object.byteCompare(b, a));
    }

    @Test
    public void testBytePtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        BytePtr a = object.byteCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (byte) random.nextInt());
        }
        a.setValue(COUNT_N, (byte) 1);

        // Create b & compare a with b
        BytePtr b = object.byteCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (byte) random.nextInt());
        }
        b.setValue(COUNT_N, (byte) 0);
        Assert.assertFalse(object.byteArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (byte) 1);
        Assert.assertTrue(object.byteArrayCompare(a, b, COUNT));

        // Free a & b
        object.byteArrayFree(a);
        object.byteArrayFree(b);
    }

    @Test
    public void testBytePtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        BytePtr a = object.byteCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (byte) random.nextInt());
        }

        // Create b & compare a with b
        Ptr<BytePtr> b = object.byteCreateArrayRef(a);
        Assert.assertTrue(object.byteArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.byteArrayFree(a);
        object.byteArrayRefFree(b);
    }

    @Test
    public void testShort() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        short a = object.shortCreate((short) random.nextInt());
        short b = object.shortCreate((short) (a + 50));
        Assert.assertTrue(object.shortCompare(a, a));
        Assert.assertTrue(object.shortCompare(b, b));
        Assert.assertFalse(object.shortCompare(a, b));
        Assert.assertFalse(object.shortCompare(b, a));
    }

    @Test
    public void testShortPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        ShortPtr a = object.shortCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (short) random.nextInt());
        }
        a.setValue(COUNT_N, (short) 1);

        // Create b & compare a with b
        ShortPtr b = object.shortCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (short) random.nextInt());
        }
        b.setValue(COUNT_N, (short) 0);
        Assert.assertFalse(object.shortArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (short) 1);
        Assert.assertTrue(object.shortArrayCompare(a, b, COUNT));

        // Free a & b
        object.shortArrayFree(a);
        object.shortArrayFree(b);
    }

    @Test
    public void testShortPtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        ShortPtr a = object.shortCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (short) random.nextInt());
        }

        // Create b & compare a with b
        Ptr<ShortPtr> b = object.shortCreateArrayRef(a);
        Assert.assertTrue(object.shortArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.shortArrayFree(a);
        object.shortArrayRefFree(b);
    }

    @Test
    public void testChar() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        char a = object.charCreate((char) random.nextInt());
        char b = object.charCreate((char) (a + 50 % 0xFF));
        Assert.assertTrue(object.charCompare(a, a));
        Assert.assertTrue(object.charCompare(b, b));
        Assert.assertFalse(object.charCompare(a, b));
        Assert.assertFalse(object.charCompare(b, a));
    }

    @Test
    public void testCharPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        CharPtr a = object.charCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (char) random.nextInt());
        }
        a.setValue(COUNT_N, (char) 1);

        // Create b & compare a with b
        CharPtr b = object.charCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (char) random.nextInt());
        }
        b.setValue(COUNT_N, (char) 0);
        Assert.assertFalse(object.charArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (char) 1);
        Assert.assertTrue(object.charArrayCompare(a, b, COUNT));

        // Free a & b
        object.charArrayFree(a);
        object.charArrayFree(b);
    }

    @Test
    public void testCharPtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        CharPtr a = object.charCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (char) random.nextInt());
        }

        // Create b & compare a with b
        Ptr<CharPtr> b = object.charCreateArrayRef(a);
        Assert.assertTrue(object.charArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.charArrayFree(a);
        object.charArrayRefFree(b);
    }

    @Test
    public void testInt() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        int a = object.intCreate(random.nextInt());
        int b = object.intCreate(a + 50);
        Assert.assertTrue(object.intCompare(a, a));
        Assert.assertTrue(object.intCompare(b, b));
        Assert.assertFalse(object.intCompare(a, b));
        Assert.assertFalse(object.intCompare(b, a));
    }

    @Test
    public void testIntPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        IntPtr a = object.intCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextInt());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        IntPtr b = object.intCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextInt());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(object.intArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(object.intArrayCompare(a, b, COUNT));

        // Free a & b
        object.intArrayFree(a);
        object.intArrayFree(b);
    }

    @Test
    public void testIntPtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        IntPtr a = object.intCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextInt());
        }

        // Create b & compare a with b
        Ptr<IntPtr> b = object.intCreateArrayRef(a);
        Assert.assertTrue(object.intArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.intArrayFree(a);
        object.intArrayRefFree(b);
    }

    @Test
    public void testLong() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        long a = object.longCreate(random.nextLong());
        long b = object.longCreate(a + 50);
        Assert.assertTrue(object.longCompare(a, a));
        Assert.assertTrue(object.longCompare(b, b));
        Assert.assertFalse(object.longCompare(a, b));
        Assert.assertFalse(object.longCompare(b, a));
    }

    @Test
    public void testLongPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        LongPtr a = object.longCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextLong());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        LongPtr b = object.longCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextLong());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(object.longArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(object.longArrayCompare(a, b, COUNT));

        // Free a & b
        object.longArrayFree(a);
        object.longArrayFree(b);
    }

    @Test
    public void testLongPtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        LongPtr a = object.longCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextLong());
        }

        // Create b & compare a with b
        Ptr<LongPtr> b = object.longCreateArrayRef(a);
        Assert.assertTrue(object.longArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.longArrayFree(a);
        object.longArrayRefFree(b);
    }

    @Test
    public void testFloat() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        float a = object.floatCreate(random.nextFloat());
        float b = object.floatCreate(a + 50);
        Assert.assertTrue(object.floatCompare(a, a));
        Assert.assertTrue(object.floatCompare(b, b));
        Assert.assertFalse(object.floatCompare(a, b));
        Assert.assertFalse(object.floatCompare(b, a));
    }

    @Test
    public void testFloatPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        FloatPtr a = object.floatCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextFloat());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        FloatPtr b = object.floatCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextFloat());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(object.floatArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(object.floatArrayCompare(a, b, COUNT));

        // Free a & b
        object.floatArrayFree(a);
        object.floatArrayFree(b);
    }

    @Test
    public void testFloatPtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        FloatPtr a = object.floatCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextFloat());
        }

        // Create b & compare a with b
        Ptr<FloatPtr> b = object.floatCreateArrayRef(a);
        Assert.assertTrue(object.floatArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.floatArrayFree(a);
        object.floatArrayRefFree(b);
    }

    @Test
    public void testDouble() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        double a = object.doubleCreate(random.nextDouble());
        double b = object.doubleCreate(a + 50);
        Assert.assertTrue(object.doubleCompare(a, a));
        Assert.assertTrue(object.doubleCompare(b, b));
        Assert.assertFalse(object.doubleCompare(a, b));
        Assert.assertFalse(object.doubleCompare(b, a));
    }

    @Test
    public void testDoublePtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        DoublePtr a = object.doubleCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextDouble());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        DoublePtr b = object.doubleCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextDouble());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(object.doubleArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(object.doubleArrayCompare(a, b, COUNT));

        // Free a & b
        object.doubleArrayFree(a);
        object.doubleArrayFree(b);
    }

    @Test
    public void testDoublePtrPtr() {
        PrimitiveClass object = PrimitiveClass.alloc().init();
        // Create a
        DoublePtr a = object.doubleCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextDouble());
        }

        // Create b & compare a with b
        Ptr<DoublePtr> b = object.doubleCreateArrayRef(a);
        Assert.assertTrue(object.doubleArrayRefCompare(b, a, COUNT));

        // Free a & b
        object.doubleArrayFree(a);
        object.doubleArrayRefFree(b);
    }
}
