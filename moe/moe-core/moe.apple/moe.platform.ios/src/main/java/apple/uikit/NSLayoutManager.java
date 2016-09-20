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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.NSLayoutManagerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutManager extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLayoutManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLayoutManager alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/addTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTextContainer:")
    public native void addTextContainer(NSTextContainer container);

    /**
     * allowsNonContiguousLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/allowsNonContiguousLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("allowsNonContiguousLayout")
    public native boolean allowsNonContiguousLayout();

    /**
     * attachmentSizeForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/attachmentSizeForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("attachmentSizeForGlyphAtIndex:")
    @ByValue
    public native CGSize attachmentSizeForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * boundingRectForGlyphRange:inTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/boundingRectForGlyphRange:inTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("boundingRectForGlyphRange:inTextContainer:")
    @ByValue
    public native CGRect boundingRectForGlyphRangeInTextContainer(@ByValue NSRange glyphRange,
            NSTextContainer container);

    /**
     * characterIndexForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/characterIndexForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterIndexForGlyphAtIndex:")
    @NUInt
    public native long characterIndexForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
    @NUInt
    public native long characterIndexForPointInTextContainerFractionOfDistanceBetweenInsertionPoints(
            @ByValue CGPoint point, NSTextContainer container, NFloatPtr partialFraction);

    /**
     * characterRangeForGlyphRange:actualGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/characterRangeForGlyphRange:actualGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("characterRangeForGlyphRange:actualGlyphRange:")
    @ByValue
    public native NSRange characterRangeForGlyphRangeActualGlyphRange(@ByValue NSRange glyphRange,
            NSRange actualGlyphRange);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSLayoutManagerDelegate delegate();

    /**
     * drawBackgroundForGlyphRange:atPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/drawBackgroundForGlyphRange:atPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawBackgroundForGlyphRange:atPoint:")
    public native void drawBackgroundForGlyphRangeAtPoint(@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

    /**
     * drawGlyphsForGlyphRange:atPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/drawGlyphsForGlyphRange:atPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawGlyphsForGlyphRange:atPoint:")
    public native void drawGlyphsForGlyphRangeAtPoint(@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

    /**
     * drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawStrikethroughForGlyphRangeStrikethroughTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long strikethroughVal, @NFloat double baselineOffset,
            @ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawUnderlineForGlyphRangeUnderlineTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long underlineVal, @NFloat double baselineOffset,
            @ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * drawsOutsideLineFragmentForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/drawsOutsideLineFragmentForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawsOutsideLineFragmentForGlyphAtIndex:")
    public native boolean drawsOutsideLineFragmentForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * ensureGlyphsForCharacterRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/ensureGlyphsForCharacterRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureGlyphsForCharacterRange:")
    public native void ensureGlyphsForCharacterRange(@ByValue NSRange charRange);

    /**
     * ensureGlyphsForGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/ensureGlyphsForGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureGlyphsForGlyphRange:")
    public native void ensureGlyphsForGlyphRange(@ByValue NSRange glyphRange);

    /**
     * ensureLayoutForBoundingRect:inTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/ensureLayoutForBoundingRect:inTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureLayoutForBoundingRect:inTextContainer:")
    public native void ensureLayoutForBoundingRectInTextContainer(@ByValue CGRect bounds, NSTextContainer container);

    /**
     * ensureLayoutForCharacterRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/ensureLayoutForCharacterRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureLayoutForCharacterRange:")
    public native void ensureLayoutForCharacterRange(@ByValue NSRange charRange);

    /**
     * ensureLayoutForGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/ensureLayoutForGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureLayoutForGlyphRange:")
    public native void ensureLayoutForGlyphRange(@ByValue NSRange glyphRange);

    /**
     * ensureLayoutForTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/ensureLayoutForTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("ensureLayoutForTextContainer:")
    public native void ensureLayoutForTextContainer(NSTextContainer container);

    /**
     * enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:")
    public native void enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock(
            @ByValue NSRange glyphRange, @ByValue NSRange selectedRange, NSTextContainer textContainer,
            @ObjCBlock(name = "call_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock") Block_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock block);

    /**
     * enumerateLineFragmentsForGlyphRange:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/enumerateLineFragmentsForGlyphRange:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateLineFragmentsForGlyphRange:usingBlock:")
    public native void enumerateLineFragmentsForGlyphRangeUsingBlock(@ByValue NSRange glyphRange,
            @ObjCBlock(name = "call_enumerateLineFragmentsForGlyphRangeUsingBlock") Block_enumerateLineFragmentsForGlyphRangeUsingBlock block);

    /**
     * extraLineFragmentRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/extraLineFragmentRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("extraLineFragmentRect")
    @ByValue
    public native CGRect extraLineFragmentRect();

    /**
     * extraLineFragmentTextContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/extraLineFragmentTextContainer">iOS Dev Center</a>
     */
    @Generated
    @Selector("extraLineFragmentTextContainer")
    public native NSTextContainer extraLineFragmentTextContainer();

    /**
     * extraLineFragmentUsedRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/extraLineFragmentUsedRect">iOS Dev Center</a>
     */
    @Generated
    @Selector("extraLineFragmentUsedRect")
    @ByValue
    public native CGRect extraLineFragmentUsedRect();

    /**
     * fillBackgroundRectArray:count:forCharacterRange:color:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/fillBackgroundRectArray:count:forCharacterRange:color:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fillBackgroundRectArray:count:forCharacterRange:color:")
    public native void fillBackgroundRectArrayCountForCharacterRangeColor(ConstPtr<CGRect> rectArray,
            @NUInt long rectCount, @ByValue NSRange charRange, UIColor color);

    /**
     * firstUnlaidCharacterIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/firstUnlaidCharacterIndex">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstUnlaidCharacterIndex")
    @NUInt
    public native long firstUnlaidCharacterIndex();

    /**
     * firstUnlaidGlyphIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/firstUnlaidGlyphIndex">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstUnlaidGlyphIndex")
    @NUInt
    public native long firstUnlaidGlyphIndex();

    /**
     * fractionOfDistanceThroughGlyphForPoint:inTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/fractionOfDistanceThroughGlyphForPoint:inTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
    @NFloat
    public native double fractionOfDistanceThroughGlyphForPointInTextContainer(@ByValue CGPoint point,
            NSTextContainer container);

    /**
     * getFirstUnlaidCharacterIndex:glyphIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/getFirstUnlaidCharacterIndex:glyphIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getFirstUnlaidCharacterIndex:glyphIndex:")
    public native void getFirstUnlaidCharacterIndexGlyphIndex(NUIntPtr charIndex, NUIntPtr glyphIndex);

    /**
     * getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:")
    @NUInt
    public native long getGlyphsInRangeGlyphsPropertiesCharacterIndexesBidiLevels(@ByValue NSRange glyphRange,
            CharPtr glyphBuffer, NIntPtr props, NUIntPtr charIndexBuffer, BytePtr bidiLevelBuffer);

    /**
     * getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
    @NUInt
    public native long getLineFragmentInsertionPointsForCharacterAtIndexAlternatePositionsInDisplayOrderPositionsCharacterIndexes(
            @NUInt long charIndex, boolean aFlag, boolean dFlag, NFloatPtr positions, NUIntPtr charIndexes);

    /**
     * glyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphAtIndex:")
    public native char glyphAtIndex(@NUInt long glyphIndex);

    /**
     * glyphAtIndex:isValidIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphAtIndex:isValidIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphAtIndex:isValidIndex:")
    public native char glyphAtIndexIsValidIndex(@NUInt long glyphIndex, BoolPtr isValidIndex);

    /**
     * glyphIndexForCharacterAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphIndexForCharacterAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphIndexForCharacterAtIndex:")
    @NUInt
    public native long glyphIndexForCharacterAtIndex(@NUInt long charIndex);

    /**
     * glyphIndexForPoint:inTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphIndexForPoint:inTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphIndexForPoint:inTextContainer:")
    @NUInt
    public native long glyphIndexForPointInTextContainer(@ByValue CGPoint point, NSTextContainer container);

    /**
     * glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
    @NUInt
    public native long glyphIndexForPointInTextContainerFractionOfDistanceThroughGlyph(@ByValue CGPoint point,
            NSTextContainer container, NFloatPtr partialFraction);

    /**
     * glyphRangeForBoundingRect:inTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphRangeForBoundingRect:inTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphRangeForBoundingRect:inTextContainer:")
    @ByValue
    public native NSRange glyphRangeForBoundingRectInTextContainer(@ByValue CGRect bounds, NSTextContainer container);

    /**
     * glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
    @ByValue
    public native NSRange glyphRangeForBoundingRectWithoutAdditionalLayoutInTextContainer(@ByValue CGRect bounds,
            NSTextContainer container);

    /**
     * glyphRangeForCharacterRange:actualCharacterRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphRangeForCharacterRange:actualCharacterRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphRangeForCharacterRange:actualCharacterRange:")
    @ByValue
    public native NSRange glyphRangeForCharacterRangeActualCharacterRange(@ByValue NSRange charRange,
            NSRange actualCharRange);

    /**
     * glyphRangeForTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/glyphRangeForTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("glyphRangeForTextContainer:")
    @ByValue
    public native NSRange glyphRangeForTextContainer(NSTextContainer container);

    /**
     * hasNonContiguousLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/hasNonContiguousLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasNonContiguousLayout")
    public native boolean hasNonContiguousLayout();

    /**
     * hyphenationFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/hyphenationFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("hyphenationFactor")
    @NFloat
    public native double hyphenationFactor();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSLayoutManager init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLayoutManager initWithCoder(NSCoder coder);

    /**
     * insertTextContainer:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/insertTextContainer:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertTextContainer:atIndex:")
    public native void insertTextContainerAtIndex(NSTextContainer container, @NUInt long index);

    /**
     * invalidateDisplayForCharacterRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/invalidateDisplayForCharacterRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateDisplayForCharacterRange:")
    public native void invalidateDisplayForCharacterRange(@ByValue NSRange charRange);

    /**
     * invalidateDisplayForGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/invalidateDisplayForGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateDisplayForGlyphRange:")
    public native void invalidateDisplayForGlyphRange(@ByValue NSRange glyphRange);

    /**
     * invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
    public native void invalidateGlyphsForCharacterRangeChangeInLengthActualCharacterRange(@ByValue NSRange charRange,
            @NInt long delta, NSRange actualCharRange);

    /**
     * invalidateLayoutForCharacterRange:actualCharacterRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/invalidateLayoutForCharacterRange:actualCharacterRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateLayoutForCharacterRange:actualCharacterRange:")
    public native void invalidateLayoutForCharacterRangeActualCharacterRange(@ByValue NSRange charRange,
            NSRange actualCharRange);

    /**
     * isValidGlyphIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/isValidGlyphIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isValidGlyphIndex:")
    public native boolean isValidGlyphIndex(@NUInt long glyphIndex);

    /**
     * lineFragmentRectForGlyphAtIndex:effectiveRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/lineFragmentRectForGlyphAtIndex:effectiveRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:")
    @ByValue
    public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange);

    /**
     * lineFragmentUsedRectForGlyphAtIndex:effectiveRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/lineFragmentUsedRectForGlyphAtIndex:effectiveRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
    @ByValue
    public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange);

    /**
     * locationForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/locationForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("locationForGlyphAtIndex:")
    @ByValue
    public native CGPoint locationForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * notShownAttributeForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/notShownAttributeForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("notShownAttributeForGlyphAtIndex:")
    public native boolean notShownAttributeForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * numberOfGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/numberOfGlyphs">iOS Dev Center</a>
     */
    @Generated
    @Selector("numberOfGlyphs")
    @NUInt
    public native long numberOfGlyphs();

    /**
     * processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditingForTextStorageEditedRangeChangeInLengthInvalidatedRange(NSTextStorage textStorage,
            @NUInt long editMask, @ByValue NSRange newCharRange, @NInt long delta,
            @ByValue NSRange invalidatedCharRange);

    /**
     * propertyForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/propertyForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyForGlyphAtIndex:")
    @NInt
    public native long propertyForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * rangeOfNominallySpacedGlyphsContainingIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/rangeOfNominallySpacedGlyphsContainingIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfNominallySpacedGlyphsContainingIndex:")
    @ByValue
    public native NSRange rangeOfNominallySpacedGlyphsContainingIndex(@NUInt long glyphIndex);

    /**
     * removeTextContainerAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/removeTextContainerAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeTextContainerAtIndex:")
    public native void removeTextContainerAtIndex(@NUInt long index);

    /**
     * allowsNonContiguousLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/allowsNonContiguousLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllowsNonContiguousLayout:")
    public native void setAllowsNonContiguousLayout(boolean value);

    /**
     * setAttachmentSize:forGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setAttachmentSize:forGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttachmentSize:forGlyphRange:")
    public native void setAttachmentSizeForGlyphRange(@ByValue CGSize attachmentSize, @ByValue NSRange glyphRange);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSLayoutManagerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSLayoutManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * setDrawsOutsideLineFragment:forGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setDrawsOutsideLineFragment:forGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDrawsOutsideLineFragment:forGlyphAtIndex:")
    public native void setDrawsOutsideLineFragmentForGlyphAtIndex(boolean flag, @NUInt long glyphIndex);

    /**
     * setExtraLineFragmentRect:usedRect:textContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setExtraLineFragmentRect:usedRect:textContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExtraLineFragmentRect:usedRect:textContainer:")
    public native void setExtraLineFragmentRectUsedRectTextContainer(@ByValue CGRect fragmentRect,
            @ByValue CGRect usedRect, NSTextContainer container);

    /**
     * setGlyphs:properties:characterIndexes:font:forGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setGlyphs:properties:characterIndexes:font:forGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public native void setGlyphsPropertiesCharacterIndexesFontForGlyphRange(ConstCharPtr glyphs, ConstNIntPtr props,
            ConstNUIntPtr charIndexes, UIFont aFont, @ByValue NSRange glyphRange);

    /**
     * hyphenationFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/hyphenationFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHyphenationFactor:")
    public native void setHyphenationFactor(@NFloat double value);

    /**
     * setLineFragmentRect:forGlyphRange:usedRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setLineFragmentRect:forGlyphRange:usedRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLineFragmentRect:forGlyphRange:usedRect:")
    public native void setLineFragmentRectForGlyphRangeUsedRect(@ByValue CGRect fragmentRect,
            @ByValue NSRange glyphRange, @ByValue CGRect usedRect);

    /**
     * setLocation:forStartOfGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setLocation:forStartOfGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocation:forStartOfGlyphRange:")
    public native void setLocationForStartOfGlyphRange(@ByValue CGPoint location, @ByValue NSRange glyphRange);

    /**
     * setNotShownAttribute:forGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setNotShownAttribute:forGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNotShownAttribute:forGlyphAtIndex:")
    public native void setNotShownAttributeForGlyphAtIndex(boolean flag, @NUInt long glyphIndex);

    /**
     * showsControlCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/showsControlCharacters">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShowsControlCharacters:")
    public native void setShowsControlCharacters(boolean value);

    /**
     * showsInvisibleCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/showsInvisibleCharacters">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShowsInvisibleCharacters:")
    public native void setShowsInvisibleCharacters(boolean value);

    /**
     * setTextContainer:forGlyphRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/setTextContainer:forGlyphRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextContainer:forGlyphRange:")
    public native void setTextContainerForGlyphRange(NSTextContainer container, @ByValue NSRange glyphRange);

    /**
     * textStorage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/textStorage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextStorage:")
    public native void setTextStorage_unsafe(NSTextStorage value);

    /**
     * textStorage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/textStorage">iOS Dev Center</a>
     */
    @Generated
    public void setTextStorage(NSTextStorage value) {
        Object __old = textStorage();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTextStorage_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * usesFontLeading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/usesFontLeading">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesFontLeading:")
    public native void setUsesFontLeading(boolean value);

    /**
     * showCGGlyphs:positions:count:font:matrix:attributes:inContext:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/showCGGlyphs:positions:count:font:matrix:attributes:inContext:">iOS Dev Center</a>
     */
    @Generated
    @Selector("showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
    public native void showCGGlyphsPositionsCountFontMatrixAttributesInContext(ConstCharPtr glyphs,
            ConstPtr<CGPoint> positions, @NUInt long glyphCount, UIFont font, @ByValue CGAffineTransform textMatrix,
            NSDictionary<String, ?> attributes, CGContextRef graphicsContext);

    /**
     * showsControlCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/showsControlCharacters">iOS Dev Center</a>
     */
    @Generated
    @Selector("showsControlCharacters")
    public native boolean showsControlCharacters();

    /**
     * showsInvisibleCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/showsInvisibleCharacters">iOS Dev Center</a>
     */
    @Generated
    @Selector("showsInvisibleCharacters")
    public native boolean showsInvisibleCharacters();

    /**
     * strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:">iOS Dev Center</a>
     */
    @Generated
    @Selector("strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void strikethroughGlyphRangeStrikethroughTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long strikethroughVal, @ByValue CGRect lineRect,
            @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * textContainerChangedGeometry:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/textContainerChangedGeometry:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textContainerChangedGeometry:")
    public native void textContainerChangedGeometry(NSTextContainer container);

    /**
     * textContainerForGlyphAtIndex:effectiveRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/textContainerForGlyphAtIndex:effectiveRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textContainerForGlyphAtIndex:effectiveRange:")
    public native NSTextContainer textContainerForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange);

    /**
     * textContainers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/textContainers">iOS Dev Center</a>
     */
    @Generated
    @Selector("textContainers")
    public native NSArray<? extends NSTextContainer> textContainers();

    /**
     * textStorage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/textStorage">iOS Dev Center</a>
     */
    @Generated
    @Selector("textStorage")
    public native NSTextStorage textStorage();

    /**
     * truncatedGlyphRangeInLineFragmentForGlyphAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/truncatedGlyphRangeInLineFragmentForGlyphAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("truncatedGlyphRangeInLineFragmentForGlyphAtIndex:")
    @ByValue
    public native NSRange truncatedGlyphRangeInLineFragmentForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:">iOS Dev Center</a>
     */
    @Generated
    @Selector("underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void underlineGlyphRangeUnderlineTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long underlineVal, @ByValue CGRect lineRect,
            @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * usedRectForTextContainer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/usedRectForTextContainer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("usedRectForTextContainer:")
    @ByValue
    public native CGRect usedRectForTextContainer(NSTextContainer container);

    /**
     * usesFontLeading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instp/NSLayoutManager/usesFontLeading">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesFontLeading")
    public native boolean usesFontLeading();

    @Generated
    @Selector("CGGlyphAtIndex:")
    public native char CGGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("CGGlyphAtIndex:isValidIndex:")
    public native char CGGlyphAtIndexIsValidIndex(@NUInt long glyphIndex, BoolPtr isValidIndex);

    /**
     * lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    @ByValue
    public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange, boolean flag);

    /**
     * lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    @ByValue
    public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
            @NUInt long glyphIndex, NSRange effectiveGlyphRange, boolean flag);

    /**
     * textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/ApplicationKit/Classes/NSLayoutManager_Class/index.html#//apple_ref/occ/instm/NSLayoutManager/textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:">iOS Dev Center</a>
     */
    @Generated
    @Selector("textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    public native NSTextContainer textContainerForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
            @NUInt long glyphIndex, NSRange effectiveGlyphRange, boolean flag);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock {
        @Generated
        void call_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock(
                @ByValue CGRect arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLineFragmentsForGlyphRangeUsingBlock {
        @Generated
        void call_enumerateLineFragmentsForGlyphRangeUsingBlock(@ByValue CGRect arg0, @ByValue CGRect arg1,
                NSTextContainer arg2, @ByValue NSRange arg3, BoolPtr arg4);
    }
}
