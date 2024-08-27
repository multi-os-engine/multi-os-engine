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

package c.tests.natj.variadic;

import c.binding.VariadicFunctions;
import c.binding.struct.NJPoint;
import c.binding.struct.NJRect;
import c.binding.struct.NJSize;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.VariadicArg;
import org.junit.Assert;
import org.junit.Test;

public class CVariadicTest {

    @Test
    public void testBooleanVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testBooleansWithPairNumber(3, true, true, false, false, true, true));
        Assert.assertFalse(VariadicFunctions.testBooleansWithPairNumber(3, true, true, false, false, true, false));
    }

    @Test
    public void testByteVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testBytesWithPairNumber(3, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 7, (byte) 7));
        Assert.assertFalse(VariadicFunctions.testBytesWithPairNumber(3, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 7, (byte) 8));
    }

    @Test
    public void testCharVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testCharsWithPairNumber(3, (char) 5, (char) 5, (char) 6, (char) 6, (char) 7, (char) 7));
        Assert.assertFalse(VariadicFunctions.testCharsWithPairNumber(3, (char) 5, (char) 5, (char) 6, (char) 6, (char) 7, (char) 8));
    }

    @Test
    public void testShortVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testShortsWithPairNumber(3, (short) 5, (short) 5, (short) 6, (short) 6, (short) 7, (short) 7));
        Assert.assertFalse(VariadicFunctions.testShortsWithPairNumber(3, (short) 5, (short) 5, (short) 6, (short) 6, (short) 7, (short) 8));
    }

    @Test
    public void testIntVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testIntsWithPairNumber(3, 5, 5, 6, 6, 7, 7));
        Assert.assertFalse(VariadicFunctions.testIntsWithPairNumber(3, 5, 5, 6, 6, 7, 8));
    }

    @Test
    public void testLongVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testLongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(VariadicFunctions.testLongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 8L));
    }

    @Test
    public void testFloatVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(VariadicFunctions.testFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        Assert.assertTrue(VariadicFunctions.testUnboxingFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(VariadicFunctions.testUnboxingFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicArg.UnboxVariadicArg a = VariadicArg.createUnbox(10f);
        VariadicArg.UnboxVariadicArg b = VariadicArg.createUnbox(9f);

        Assert.assertTrue(VariadicFunctions.testExplicitUnboxingFloatsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitUnboxingFloatsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testDoubleVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testDoublesWithPairNumber(3, 5.0, 5.0, 6.0, 6.0, 7.0, 7.0));
        Assert.assertFalse(VariadicFunctions.testDoublesWithPairNumber(3, 5.0, 5.0, 6.0, 6.0, 7.0, 8.0));
    }

    @Test
    public void testCGRectVariadicFunction() {
        VariadicArg.ByValueVariadicArg a = VariadicArg.createByValue(new NJRect(new NJPoint(0, 0), new NJSize(10, 10)));
        VariadicArg.ByValueVariadicArg b = VariadicArg.createByValue(new NJRect(new NJPoint(0, 0), new NJSize(9, 9)));

        Assert.assertTrue(VariadicFunctions.testCGRectsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testCGRectsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testCStringVariadicFunction() {
        VariadicArg.MapVariadicArg a = VariadicArg.createMap("a", CStringMapper.class);
        VariadicArg.MapVariadicArg b = VariadicArg.createMap("b", CStringMapper.class);

        Assert.assertTrue(VariadicFunctions.testCStringsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testCStringsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNFloatVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testNFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(VariadicFunctions.testNFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicArg.NFloatVariadicArg a = VariadicArg.createNFloat(10.0);
        VariadicArg.NFloatVariadicArg b = VariadicArg.createNFloat(9.0);

        Assert.assertTrue(VariadicFunctions.testExplicitNFloatsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitNFloatsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNUIntVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testNUIntsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(VariadicFunctions.testNUIntsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 8L));

        VariadicArg.NUIntVariadicArg a = VariadicArg.createNUInt(10L);
        VariadicArg.NUIntVariadicArg b = VariadicArg.createNUInt(9L);

        Assert.assertTrue(VariadicFunctions.testExplicitNUIntsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitNUIntsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNIntVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testNIntsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -7L));
        Assert.assertFalse(VariadicFunctions.testNIntsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -8L));

        VariadicArg.NIntVariadicArg a = VariadicArg.createNInt(10L);
        VariadicArg.NIntVariadicArg b = VariadicArg.createNInt(9L);

        Assert.assertTrue(VariadicFunctions.testExplicitNIntsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitNIntsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNULongVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testNULongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(VariadicFunctions.testNULongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 8L));

        VariadicArg.NULongVariadicArg a = VariadicArg.createNULong(10L);
        VariadicArg.NULongVariadicArg b = VariadicArg.createNULong(9L);

        Assert.assertTrue(VariadicFunctions.testExplicitNULongsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitNULongsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNLongVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testNLongsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -7L));
        Assert.assertFalse(VariadicFunctions.testNLongsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -8L));

        VariadicArg.NLongVariadicArg a = VariadicArg.createNLong(10L);
        VariadicArg.NLongVariadicArg b = VariadicArg.createNLong(9L);

        Assert.assertTrue(VariadicFunctions.testExplicitNLongsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitNLongsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testWCharTVariadicFunction() {
        Assert.assertTrue(VariadicFunctions.testWCharTsWithPairNumber(3, 5, 5, 6, 6, 7, 7));
        Assert.assertFalse(VariadicFunctions.testWCharTsWithPairNumber(3, 5, 5, 6, 6, 7, 8));

        VariadicArg.WCharTVariadicArg a = VariadicArg.createWCharT(10);
        VariadicArg.WCharTVariadicArg b = VariadicArg.createWCharT(9);

        Assert.assertTrue(VariadicFunctions.testExplicitWCharTsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicFunctions.testExplicitWCharTsWithPairNumber(3, a, a, b, b, a, b));
    }

}
