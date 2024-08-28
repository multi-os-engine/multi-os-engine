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

package objc.tests.natj.variadic;

import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.VariadicArg;
import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSSet;
import org.junit.Assert;
import org.junit.Test;

public class ObjCVariadicTest {

	/*
     * To-native message tests
	 */

    @Test
    public void testNullTerminatedObjectVariadicSelector() {
        NSObject element = NSObject.alloc().init();
        NSSet set = NSSet.setWithObjects(element, (Object) null);
        Assert.assertEquals(set.count(), 1);
        Assert.assertSame(set.anyObject(), element);
    }

    @Test
    public void testBooleanVariadicSelector() {
        Assert.assertTrue(VariadicClass.testBooleansWithPairNumber(3, true, true, false, false, true, true));
        Assert.assertFalse(VariadicClass.testBooleansWithPairNumber(3, true, true, false, false, true, false));
    }

    @Test
    public void testByteVariadicSelector() {
        Assert.assertTrue(VariadicClass.testBytesWithPairNumber(3, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 7, (byte) 7));
        Assert.assertFalse(VariadicClass.testBytesWithPairNumber(3, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 7, (byte) 8));
    }

    @Test
    public void testCharVariadicSelector() {
        Assert.assertTrue(VariadicClass.testCharsWithPairNumber(3, (char) 5, (char) 5, (char) 6, (char) 6, (char) 7, (char) 7));
        Assert.assertFalse(VariadicClass.testCharsWithPairNumber(3, (char) 5, (char) 5, (char) 6, (char) 6, (char) 7, (char) 8));
    }

    @Test
    public void testShortVariadicSelector() {
        Assert.assertTrue(VariadicClass.testShortsWithPairNumber(3, (short) 5, (short) 5, (short) 6, (short) 6, (short) 7, (short) 7));
        Assert.assertFalse(VariadicClass.testShortsWithPairNumber(3, (short) 5, (short) 5, (short) 6, (short) 6, (short) 7, (short) 8));
    }

    @Test
    public void testIntVariadicSelector() {
        Assert.assertTrue(VariadicClass.testIntsWithPairNumber(3, 5, 5, 6, 6, 7, 7));
        Assert.assertFalse(VariadicClass.testIntsWithPairNumber(3, 5, 5, 6, 6, 7, 8));
    }

    @Test
    public void testLongVariadicSelector() {
        Assert.assertTrue(VariadicClass.testLongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(VariadicClass.testLongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 8L));
    }

    @Test
    public void testFloatVariadicSelector() {
        Assert.assertTrue(VariadicClass.testFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(VariadicClass.testFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        Assert.assertTrue(VariadicClass.testUnboxingFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(VariadicClass.testUnboxingFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicArg.UnboxVariadicArg a = VariadicArg.createUnbox(10f);
        VariadicArg.UnboxVariadicArg b = VariadicArg.createUnbox(9f);

        Assert.assertTrue(VariadicClass.testExplicitUnboxingFloatsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitUnboxingFloatsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testDoubleVariadicSelector() {
        Assert.assertTrue(VariadicClass.testDoublesWithPairNumber(3, 5.0, 5.0, 6.0, 6.0, 7.0, 7.0));
        Assert.assertFalse(VariadicClass.testDoublesWithPairNumber(3, 5.0, 5.0, 6.0, 6.0, 7.0, 8.0));
    }

    @Test
    public void testCGRectVariadicSelector() {
        VariadicArg.ByValueVariadicArg a = VariadicArg.createByValue(new CGRect(new CGPoint(0, 0), new CGSize(10, 10)));
        VariadicArg.ByValueVariadicArg b = VariadicArg.createByValue(new CGRect(new CGPoint(0, 0), new CGSize(9, 9)));

        Assert.assertTrue(VariadicClass.testCGRectsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testCGRectsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testCStringVariadicSelector() {
        VariadicArg.MapVariadicArg a = VariadicArg.createMap("a", CStringMapper.class);
        VariadicArg.MapVariadicArg b = VariadicArg.createMap("b", CStringMapper.class);

        Assert.assertTrue(VariadicClass.testCStringsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testCStringsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testBoxedFloatVariadicSelector() {
        Assert.assertTrue(VariadicClass.testBoxedFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        //Assert.assertFalse(VariadicClass.testBoxedFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicArg.BoxVariadicArg a = VariadicArg.createBox(10f);
        VariadicArg.BoxVariadicArg b = VariadicArg.createBox(9f);

        Assert.assertTrue(VariadicClass.testExplicitBoxedFloatsWithPairNumber(3, a, a, b, b, a, a));
        //Assert.assertFalse(VariadicClass.testExplicitBoxedFloatsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNFloatVariadicSelector() {
        Assert.assertTrue(VariadicClass.testNFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(VariadicClass.testNFloatsWithPairNumber(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicArg.NFloatVariadicArg a = VariadicArg.createNFloat(10.0);
        VariadicArg.NFloatVariadicArg b = VariadicArg.createNFloat(9.0);

        Assert.assertTrue(VariadicClass.testExplicitNFloatsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitNFloatsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNUIntVariadicSelector() {
        Assert.assertTrue(VariadicClass.testNUIntsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(VariadicClass.testNUIntsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 8L));

        VariadicArg.NUIntVariadicArg a = VariadicArg.createNUInt(10L);
        VariadicArg.NUIntVariadicArg b = VariadicArg.createNUInt(9L);

        Assert.assertTrue(VariadicClass.testExplicitNUIntsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitNUIntsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNIntVariadicSelector() {
        Assert.assertTrue(VariadicClass.testNIntsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -7L));
        Assert.assertFalse(VariadicClass.testNIntsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -8L));

        VariadicArg.NIntVariadicArg a = VariadicArg.createNInt(10L);
        VariadicArg.NIntVariadicArg b = VariadicArg.createNInt(9L);

        Assert.assertTrue(VariadicClass.testExplicitNIntsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitNIntsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNLongVariadicSelector() {
        Assert.assertTrue(VariadicClass.testNLongsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -7L));
        Assert.assertFalse(VariadicClass.testNLongsWithPairNumber(3, -5L, -5L, -6L, -6L, -7L, -8L));

        VariadicArg.NLongVariadicArg a = VariadicArg.createNLong(10L);
        VariadicArg.NLongVariadicArg b = VariadicArg.createNLong(9L);

        Assert.assertTrue(VariadicClass.testExplicitNLongsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitNLongsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testNULongVariadicSelector() {
        Assert.assertTrue(VariadicClass.testNULongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(VariadicClass.testNULongsWithPairNumber(3, 5L, 5L, 6L, 6L, 7L, 8L));

        VariadicArg.NULongVariadicArg a = VariadicArg.createNULong(10L);
        VariadicArg.NULongVariadicArg b = VariadicArg.createNULong(9L);

        Assert.assertTrue(VariadicClass.testExplicitNULongsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitNULongsWithPairNumber(3, a, a, b, b, a, b));
    }

    @Test
    public void testWCharTVariadicSelector() {
        Assert.assertTrue(VariadicClass.testWCharTsWithPairNumber(3, 5, 5, 6, 6, 7, 7));
        Assert.assertFalse(VariadicClass.testWCharTsWithPairNumber(3, 5, 5, 6, 6, 7, 8));

        VariadicArg.WCharTVariadicArg a = VariadicArg.createWCharT(10);
        VariadicArg.WCharTVariadicArg b = VariadicArg.createWCharT(9);

        Assert.assertTrue(VariadicClass.testExplicitWCharTsWithPairNumber(3, a, a, b, b, a, a));
        Assert.assertFalse(VariadicClass.testExplicitWCharTsWithPairNumber(3, a, a, b, b, a, b));
    }


	/*
     * To-native block call tests
	 */

    @Test
    public void testBooleanVariadicBlock() {
        VariadicClass.Block_blockForBooleans block = VariadicClass.blockForBooleans();

        Assert.assertTrue(block.call_blockForBooleans(3, true, true, false, false, true, true));
        Assert.assertFalse(block.call_blockForBooleans(3, true, true, false, false, true, false));
    }

    @Test
    public void testByteVariadicBlock() {
        VariadicClass.Block_blockForBytes block = VariadicClass.blockForBytes();

        Assert.assertTrue(block.call_blockForBytes(3, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 7, (byte) 7));
        Assert.assertFalse(block.call_blockForBytes(3, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 7, (byte) 8));
    }

    @Test
    public void testCharVariadicBlock() {
        VariadicClass.Block_blockForChars block = VariadicClass.blockForChars();

        Assert.assertTrue(block.call_blockForChars(3, (char) 5, (char) 5, (char) 6, (char) 6, (char) 7, (char) 7));
        Assert.assertFalse(block.call_blockForChars(3, (char) 5, (char) 5, (char) 6, (char) 6, (char) 7, (char) 8));
    }

    @Test
    public void testShortVariadicBlock() {
        VariadicClass.Block_blockForShorts block = VariadicClass.blockForShorts();

        Assert.assertTrue(block.call_blockForShorts(3, (short) 5, (short) 5, (short) 6, (short) 6, (short) 7, (short) 7));
        Assert.assertFalse(block.call_blockForShorts(3, (short) 5, (short) 5, (short) 6, (short) 6, (short) 7, (short) 8));
    }

    @Test
    public void testIntVariadicBlock() {
        VariadicClass.Block_blockForInts block = VariadicClass.blockForInts();

        Assert.assertTrue(block.call_blockForInts(3, 5, 5, 6, 6, 7, 7));
        Assert.assertFalse(block.call_blockForInts(3, 5, 5, 6, 6, 7, 8));
    }

    @Test
    public void testLongVariadicBlock() {
        VariadicClass.Block_blockForLongs block = VariadicClass.blockForLongs();

        Assert.assertTrue(block.call_blockForLongs(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(block.call_blockForLongs(3, 5L, 5L, 6L, 6L, 7L, 8L));
    }

    @Test
    public void testFloatVariadicBlock() {
        VariadicClass.Block_blockForFloats block1 = VariadicClass.blockForFloats();

        Assert.assertTrue(block1.call_blockForFloats(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(block1.call_blockForFloats(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicClass.Block_blockForUnboxingFloats block2 = VariadicClass.blockForUnboxingFloats();

        Assert.assertTrue(block2.call_blockForUnboxingFloats(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(block2.call_blockForUnboxingFloats(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicClass.Block_blockForExplicitUnboxingFloats block3 = VariadicClass.blockForExplicitUnboxingFloats();

        VariadicArg.UnboxVariadicArg a = VariadicArg.createUnbox(10f);
        VariadicArg.UnboxVariadicArg b = VariadicArg.createUnbox(9f);

        Assert.assertTrue(block3.call_blockForExplicitUnboxingFloats(3, a, a, b, b, a, a));
        Assert.assertFalse(block3.call_blockForExplicitUnboxingFloats(3, a, a, b, b, a, b));
    }

    @Test
    public void testDoubleVariadicBlock() {
        VariadicClass.Block_blockForDoubles block = VariadicClass.blockForDoubles();

        Assert.assertTrue(block.call_blockForDoubles(3, 5.0, 5.0, 6.0, 6.0, 7.0, 7.0));
        Assert.assertFalse(block.call_blockForDoubles(3, 5.0, 5.0, 6.0, 6.0, 7.0, 8.0));
    }

    @Test
    public void testCGRectVariadicBlock() {
        VariadicClass.Block_blockForCGRects block = VariadicClass.blockForCGRects();

        VariadicArg.ByValueVariadicArg a = VariadicArg.createByValue(new CGRect(new CGPoint(0, 0), new CGSize(10, 10)));
        VariadicArg.ByValueVariadicArg b = VariadicArg.createByValue(new CGRect(new CGPoint(0, 0), new CGSize(9, 9)));

        Assert.assertTrue(block.call_blockForCGRects(3, a, a, b, b, a, a));
        Assert.assertFalse(block.call_blockForCGRects(3, a, a, b, b, a, b));
    }

    @Test
    public void testCStringVariadicBlock() {
        VariadicClass.Block_blockForCStrings block = VariadicClass.blockForCStrings();

        VariadicArg.MapVariadicArg a = VariadicArg.createMap("a", CStringMapper.class);
        VariadicArg.MapVariadicArg b = VariadicArg.createMap("b", CStringMapper.class);

        Assert.assertTrue(block.call_blockForCStrings(3, a, a, b, b, a, a));
        Assert.assertFalse(block.call_blockForCStrings(3, a, a, b, b, a, b));
    }

    @Test
    public void testBoxedFloatVariadicBlock() {
        VariadicClass.Block_blockForBoxedFloats block1 = VariadicClass.blockForBoxedFloats();

        Assert.assertTrue(block1.call_blockForBoxedFloats(3, 5f, 5f, 6f, 6f, 7f, 7f));
        //Assert.assertFalse(block1.call_blockForBoxedFloats(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicClass.Block_blockForExplicitBoxedFloats block2 = VariadicClass.blockForExplicitBoxedFloats();

        VariadicArg.BoxVariadicArg a = VariadicArg.createBox(10f);
        VariadicArg.BoxVariadicArg b = VariadicArg.createBox(9f);

        Assert.assertTrue(block2.call_blockForExplicitBoxedFloats(3, a, a, b, b, a, a));
        //Assert.assertFalse(block2.call_blockForExplicitBoxedFloats(3, a, a, b, b, a, b));
    }

    @Test
    public void testNFloatVariadicBlock() {
        VariadicClass.Block_blockForNFloats block1 = VariadicClass.blockForNFloats();

        Assert.assertTrue(block1.call_blockForNFloats(3, 5f, 5f, 6f, 6f, 7f, 7f));
        Assert.assertFalse(block1.call_blockForNFloats(3, 5f, 5f, 6f, 6f, 7f, 8f));

        VariadicClass.Block_blockForExplicitNFloats block2 = VariadicClass.blockForExplicitNFloats();

        VariadicArg.NFloatVariadicArg a = VariadicArg.createNFloat(10.0);
        VariadicArg.NFloatVariadicArg b = VariadicArg.createNFloat(9.0);

        Assert.assertTrue(block2.call_blockForExplicitNFloats(3, a, a, b, b, a, a));
        Assert.assertFalse(block2.call_blockForExplicitNFloats(3, a, a, b, b, a, b));
    }

    @Test
    public void testNUIntVariadicBlock() {
        VariadicClass.Block_blockForNUInts block1 = VariadicClass.blockForNUInts();

        Assert.assertTrue(block1.call_blockForNUInts(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(block1.call_blockForNUInts(3, 5L, 5L, 6L, 6L, 7L, 8L));

        VariadicClass.Block_blockForExplicitNUInts block2 = VariadicClass.blockForExplicitNUInts();

        VariadicArg.NUIntVariadicArg a = VariadicArg.createNUInt(10L);
        VariadicArg.NUIntVariadicArg b = VariadicArg.createNUInt(9L);

        Assert.assertTrue(block2.call_blockForExplicitNUInts(3, a, a, b, b, a, a));
        Assert.assertFalse(block2.call_blockForExplicitNUInts(3, a, a, b, b, a, b));
    }

    @Test
    public void testNIntVariadicBlock() {
        VariadicClass.Block_blockForNInts block1 = VariadicClass.blockForNInts();

        Assert.assertTrue(block1.call_blockForNInts(3, -5L, -5L, -6L, -6L, -7L, -7L));
        Assert.assertFalse(block1.call_blockForNInts(3, -5L, -5L, -6L, -6L, -7L, -8L));

        VariadicClass.Block_blockForExplicitNInts block2 = VariadicClass.blockForExplicitNInts();

        VariadicArg.NIntVariadicArg a = VariadicArg.createNInt(10L);
        VariadicArg.NIntVariadicArg b = VariadicArg.createNInt(9L);

        Assert.assertTrue(block2.call_blockForExplicitNInts(3, a, a, b, b, a, a));
        Assert.assertFalse(block2.call_blockForExplicitNInts(3, a, a, b, b, a, b));
    }

    @Test
    public void testNLongVariadicBlock() {
        VariadicClass.Block_blockForNLongs block1 = VariadicClass.blockForNLongs();

        Assert.assertTrue(block1.call_blockForNLongs(3, -5L, -5L, -6L, -6L, -7L, -7L));
        Assert.assertFalse(block1.call_blockForNLongs(3, -5L, -5L, -6L, -6L, -7L, -8L));

        VariadicClass.Block_blockForExplicitNLongs block2 = VariadicClass.blockForExplicitNLongs();

        VariadicArg.NLongVariadicArg a = VariadicArg.createNLong(10L);
        VariadicArg.NLongVariadicArg b = VariadicArg.createNLong(9L);

        Assert.assertTrue(block2.call_blockForExplicitNLongs(3, a, a, b, b, a, a));
        Assert.assertFalse(block2.call_blockForExplicitNLongs(3, a, a, b, b, a, b));
    }

    @Test
    public void testNULongVariadicBlock() {
        VariadicClass.Block_blockForNULongs block1 = VariadicClass.blockForNULongs();

        Assert.assertTrue(block1.call_blockForNULongs(3, 5L, 5L, 6L, 6L, 7L, 7L));
        Assert.assertFalse(block1.call_blockForNULongs(3, 5L, 5L, 6L, 6L, 7L, 8L));

        VariadicClass.Block_blockForExplicitNULongs block2 = VariadicClass.blockForExplicitNULongs();

        VariadicArg.NULongVariadicArg a = VariadicArg.createNULong(10L);
        VariadicArg.NULongVariadicArg b = VariadicArg.createNULong(9L);

        Assert.assertTrue(block2.call_blockForExplicitNULongs(3, a, a, b, b, a, a));
        Assert.assertFalse(block2.call_blockForExplicitNULongs(3, a, a, b, b, a, b));
    }

    @Test
    public void testWCharTVariadicBlock() {
        VariadicClass.Block_blockForWCharTs block1 = VariadicClass.blockForWCharTs();

        Assert.assertTrue(block1.call_blockForWCharTs(3, 5, 5, 6, 6, 7, 7));
        Assert.assertFalse(block1.call_blockForWCharTs(3, 5, 5, 6, 6, 7, 8));

        VariadicClass.Block_blockForExplicitWCharTs block2 = VariadicClass.blockForExplicitWCharTs();

        VariadicArg.WCharTVariadicArg a = VariadicArg.createWCharT(10);
        VariadicArg.WCharTVariadicArg b = VariadicArg.createWCharT(9);

        Assert.assertTrue(block2.call_blockForExplicitWCharTs(3, a, a, b, b, a, a));
        Assert.assertFalse(block2.call_blockForExplicitWCharTs(3, a, a, b, b, a, b));
    }

    @Test
    public void testFirstArgStringWithVariadics() {
        Assert.assertTrue(VariadicClass.testFirstArgStringWithVariadics("Text", null));
    }
}
