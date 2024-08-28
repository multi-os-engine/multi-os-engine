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

package c.tests.natjgen;

import org.moe.natj.general.ptr.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static c.binding.c.Globals.*;

public class FunctionsWithPrimitivesTest {

    private static final int COUNT = 10;
    private static final int COUNT_N = COUNT - 1;
    private static final Random random = new Random();

    @Test
    public void testBool() {
        boolean a = NGBoolCreate(random.nextBoolean());
        boolean b = NGBoolCreate(!a);
        Assert.assertTrue(NGBoolCompare(a, a));
        Assert.assertTrue(NGBoolCompare(b, b));
        Assert.assertFalse(NGBoolCompare(a, b));
        Assert.assertFalse(NGBoolCompare(b, a));
    }

    @Test
    public void testBoolPtr() {
        // Create a
        BoolPtr a = NGBoolCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextBoolean());
        }
        a.setValue(COUNT_N, true);

        // Create b & compare a with b
        BoolPtr b = NGBoolCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextBoolean());
        }
        b.setValue(COUNT_N, false);
        Assert.assertFalse(NGBoolArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, true);
        Assert.assertTrue(NGBoolArrayCompare(a, b, COUNT));

        // Free a & b
        NGBoolArrayFree(a);
        NGBoolArrayFree(b);
    }

    @Test
    public void testBoolPtrPtr() {
        // Create a
        BoolPtr a = NGBoolCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextBoolean());
        }

        // Create b & compare a with b
        Ptr<BoolPtr> b = NGBoolCreateArrayRef(a);
        Assert.assertTrue(NGBoolArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGBoolArrayFree(a);
        NGBoolArrayRefFree(b);
    }

    @Test
    public void testByte() {
        byte a = NGByteCreate((byte) random.nextInt());
        byte b = NGByteCreate((byte) (a + 50));
        Assert.assertTrue(NGByteCompare(a, a));
        Assert.assertTrue(NGByteCompare(b, b));
        Assert.assertFalse(NGByteCompare(a, b));
        Assert.assertFalse(NGByteCompare(b, a));
    }

    @Test
    public void testBytePtr() {
        // Create a
        BytePtr a = NGByteCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (byte) random.nextInt());
        }
        a.setValue(COUNT_N, (byte) 1);

        // Create b & compare a with b
        BytePtr b = NGByteCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (byte) random.nextInt());
        }
        b.setValue(COUNT_N, (byte) 0);
        Assert.assertFalse(NGByteArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (byte) 1);
        Assert.assertTrue(NGByteArrayCompare(a, b, COUNT));

        // Free a & b
        NGByteArrayFree(a);
        NGByteArrayFree(b);
    }

    @Test
    public void testBytePtrPtr() {
        // Create a
        BytePtr a = NGByteCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (byte) random.nextInt());
        }

        // Create b & compare a with b
        Ptr<BytePtr> b = NGByteCreateArrayRef(a);
        Assert.assertTrue(NGByteArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGByteArrayFree(a);
        NGByteArrayRefFree(b);
    }

    @Test
    public void testShort() {
        short a = NGShortCreate((short) random.nextInt());
        short b = NGShortCreate((short) (a + 50));
        Assert.assertTrue(NGShortCompare(a, a));
        Assert.assertTrue(NGShortCompare(b, b));
        Assert.assertFalse(NGShortCompare(a, b));
        Assert.assertFalse(NGShortCompare(b, a));
    }

    @Test
    public void testShortPtr() {
        // Create a
        ShortPtr a = NGShortCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (short) random.nextInt());
        }
        a.setValue(COUNT_N, (short) 1);

        // Create b & compare a with b
        ShortPtr b = NGShortCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (short) random.nextInt());
        }
        b.setValue(COUNT_N, (short) 0);
        Assert.assertFalse(NGShortArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (short) 1);
        Assert.assertTrue(NGShortArrayCompare(a, b, COUNT));

        // Free a & b
        NGShortArrayFree(a);
        NGShortArrayFree(b);
    }

    @Test
    public void testShortPtrPtr() {
        // Create a
        ShortPtr a = NGShortCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (short) random.nextInt());
        }

        // Create b & compare a with b
        Ptr<ShortPtr> b = NGShortCreateArrayRef(a);
        Assert.assertTrue(NGShortArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGShortArrayFree(a);
        NGShortArrayRefFree(b);
    }

    @Test
    public void testChar() {
        char a = NGCharCreate((char) random.nextInt());
        char b = NGCharCreate((char) (a + 50 % 0xFF));
        Assert.assertTrue(NGCharCompare(a, a));
        Assert.assertTrue(NGCharCompare(b, b));
        Assert.assertFalse(NGCharCompare(a, b));
        Assert.assertFalse(NGCharCompare(b, a));
    }

    @Test
    public void testCharPtr() {
        // Create a
        CharPtr a = NGCharCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, (char) random.nextInt());
        }
        a.setValue(COUNT_N, (char) 1);

        // Create b & compare a with b
        CharPtr b = NGCharCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, (char) random.nextInt());
        }
        b.setValue(COUNT_N, (char) 0);
        Assert.assertFalse(NGCharArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, (char) 1);
        Assert.assertTrue(NGCharArrayCompare(a, b, COUNT));

        // Free a & b
        NGCharArrayFree(a);
        NGCharArrayFree(b);
    }

    @Test
    public void testCharPtrPtr() {
        // Create a
        CharPtr a = NGCharCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, (char) random.nextInt());
        }

        // Create b & compare a with b
        Ptr<CharPtr> b = NGCharCreateArrayRef(a);
        Assert.assertTrue(NGCharArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGCharArrayFree(a);
        NGCharArrayRefFree(b);
    }

    @Test
    public void testInt() {
        int a = NGIntCreate(random.nextInt());
        int b = NGIntCreate(a + 50);
        Assert.assertTrue(NGIntCompare(a, a));
        Assert.assertTrue(NGIntCompare(b, b));
        Assert.assertFalse(NGIntCompare(a, b));
        Assert.assertFalse(NGIntCompare(b, a));
    }

    @Test
    public void testIntPtr() {
        // Create a
        IntPtr a = NGIntCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextInt());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        IntPtr b = NGIntCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextInt());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(NGIntArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(NGIntArrayCompare(a, b, COUNT));

        // Free a & b
        NGIntArrayFree(a);
        NGIntArrayFree(b);
    }

    @Test
    public void testIntPtrPtr() {
        // Create a
        IntPtr a = NGIntCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextInt());
        }

        // Create b & compare a with b
        Ptr<IntPtr> b = NGIntCreateArrayRef(a);
        Assert.assertTrue(NGIntArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGIntArrayFree(a);
        NGIntArrayRefFree(b);
    }

    @Test
    public void testLong() {
        long a = NGLongCreate(random.nextLong());
        long b = NGLongCreate(a + 50);
        Assert.assertTrue(NGLongCompare(a, a));
        Assert.assertTrue(NGLongCompare(b, b));
        Assert.assertFalse(NGLongCompare(a, b));
        Assert.assertFalse(NGLongCompare(b, a));
    }

    @Test
    public void testLongPtr() {
        // Create a
        LongPtr a = NGLongCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextLong());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        LongPtr b = NGLongCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextLong());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(NGLongArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(NGLongArrayCompare(a, b, COUNT));

        // Free a & b
        NGLongArrayFree(a);
        NGLongArrayFree(b);
    }

    @Test
    public void testLongPtrPtr() {
        // Create a
        LongPtr a = NGLongCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextLong());
        }

        // Create b & compare a with b
        Ptr<LongPtr> b = NGLongCreateArrayRef(a);
        Assert.assertTrue(NGLongArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGLongArrayFree(a);
        NGLongArrayRefFree(b);
    }

    @Test
    public void testFloat() {
        float a = NGFloatCreate(random.nextFloat());
        float b = NGFloatCreate(a + 50);
        Assert.assertTrue(NGFloatCompare(a, a));
        Assert.assertTrue(NGFloatCompare(b, b));
        Assert.assertFalse(NGFloatCompare(a, b));
        Assert.assertFalse(NGFloatCompare(b, a));
    }

    @Test
    public void testFloatPtr() {
        // Create a
        FloatPtr a = NGFloatCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextFloat());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        FloatPtr b = NGFloatCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextFloat());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(NGFloatArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(NGFloatArrayCompare(a, b, COUNT));

        // Free a & b
        NGFloatArrayFree(a);
        NGFloatArrayFree(b);
    }

    @Test
    public void testFloatPtrPtr() {
        // Create a
        FloatPtr a = NGFloatCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextFloat());
        }

        // Create b & compare a with b
        Ptr<FloatPtr> b = NGFloatCreateArrayRef(a);
        Assert.assertTrue(NGFloatArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGFloatArrayFree(a);
        NGFloatArrayRefFree(b);
    }

    @Test
    public void testDouble() {
        double a = NGDoubleCreate(random.nextDouble());
        double b = NGDoubleCreate(a + 50);
        Assert.assertTrue(NGDoubleCompare(a, a));
        Assert.assertTrue(NGDoubleCompare(b, b));
        Assert.assertFalse(NGDoubleCompare(a, b));
        Assert.assertFalse(NGDoubleCompare(b, a));
    }

    @Test
    public void testDoublePtr() {
        // Create a
        DoublePtr a = NGDoubleCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            a.setValue(idx, random.nextDouble());
        }
        a.setValue(COUNT_N, 1);

        // Create b & compare a with b
        DoublePtr b = NGDoubleCreateArray(COUNT);
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, random.nextDouble());
        }
        b.setValue(COUNT_N, 0);
        Assert.assertFalse(NGDoubleArrayCompare(a, b, COUNT));

        // Update b & compare a with b
        for (int idx = 0; idx < COUNT_N; ++idx) {
            b.setValue(idx, a.getValue(idx));
        }
        b.setValue(COUNT_N, 1);
        Assert.assertTrue(NGDoubleArrayCompare(a, b, COUNT));

        // Free a & b
        NGDoubleArrayFree(a);
        NGDoubleArrayFree(b);
    }

    @Test
    public void testDoublePtrPtr() {
        // Create a
        DoublePtr a = NGDoubleCreateArray(COUNT);
        for (int idx = 0; idx < COUNT; ++idx) {
            a.setValue(idx, random.nextDouble());
        }

        // Create b & compare a with b
        Ptr<DoublePtr> b = NGDoubleCreateArrayRef(a);
        Assert.assertTrue(NGDoubleArrayRefCompare(b, a, COUNT));

        // Free a & b
        NGDoubleArrayFree(a);
        NGDoubleArrayRefFree(b);
    }

}
