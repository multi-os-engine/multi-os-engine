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
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutManager extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLayoutManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLayoutManager alloc();

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

    @Generated
    @Selector("CGGlyphAtIndex:")
    public native char CGGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("CGGlyphAtIndex:isValidIndex:")
    public native char CGGlyphAtIndexIsValidIndex(@NUInt long glyphIndex, BoolPtr isValidIndex);

    @Generated
    @Selector("addTextContainer:")
    public native void addTextContainer(NSTextContainer container);

    @Generated
    @Selector("allowsNonContiguousLayout")
    public native boolean allowsNonContiguousLayout();

    @Generated
    @Selector("attachmentSizeForGlyphAtIndex:")
    @ByValue
    public native CGSize attachmentSizeForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("boundingRectForGlyphRange:inTextContainer:")
    @ByValue
    public native CGRect boundingRectForGlyphRangeInTextContainer(@ByValue NSRange glyphRange,
            NSTextContainer container);

    @Generated
    @Selector("characterIndexForGlyphAtIndex:")
    @NUInt
    public native long characterIndexForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
    @NUInt
    public native long characterIndexForPointInTextContainerFractionOfDistanceBetweenInsertionPoints(
            @ByValue CGPoint point, NSTextContainer container, NFloatPtr partialFraction);

    @Generated
    @Selector("characterRangeForGlyphRange:actualGlyphRange:")
    @ByValue
    public native NSRange characterRangeForGlyphRangeActualGlyphRange(@ByValue NSRange glyphRange,
            NSRange actualGlyphRange);

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSLayoutManagerDelegate delegate();

    @Generated
    @Selector("drawBackgroundForGlyphRange:atPoint:")
    public native void drawBackgroundForGlyphRangeAtPoint(@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

    @Generated
    @Selector("drawGlyphsForGlyphRange:atPoint:")
    public native void drawGlyphsForGlyphRangeAtPoint(@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

    @Generated
    @Selector("drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawStrikethroughForGlyphRangeStrikethroughTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long strikethroughVal, @NFloat double baselineOffset,
            @ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    @Generated
    @Selector("drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawUnderlineForGlyphRangeUnderlineTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long underlineVal, @NFloat double baselineOffset,
            @ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    @Generated
    @Selector("drawsOutsideLineFragmentForGlyphAtIndex:")
    public native boolean drawsOutsideLineFragmentForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("ensureGlyphsForCharacterRange:")
    public native void ensureGlyphsForCharacterRange(@ByValue NSRange charRange);

    @Generated
    @Selector("ensureGlyphsForGlyphRange:")
    public native void ensureGlyphsForGlyphRange(@ByValue NSRange glyphRange);

    @Generated
    @Selector("ensureLayoutForBoundingRect:inTextContainer:")
    public native void ensureLayoutForBoundingRectInTextContainer(@ByValue CGRect bounds, NSTextContainer container);

    @Generated
    @Selector("ensureLayoutForCharacterRange:")
    public native void ensureLayoutForCharacterRange(@ByValue NSRange charRange);

    @Generated
    @Selector("ensureLayoutForGlyphRange:")
    public native void ensureLayoutForGlyphRange(@ByValue NSRange glyphRange);

    @Generated
    @Selector("ensureLayoutForTextContainer:")
    public native void ensureLayoutForTextContainer(NSTextContainer container);

    @Generated
    @Selector("enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:")
    public native void enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock(
            @ByValue NSRange glyphRange, @ByValue NSRange selectedRange, NSTextContainer textContainer,
            @ObjCBlock(name = "call_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock") Block_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock block);

    @Generated
    @Selector("enumerateLineFragmentsForGlyphRange:usingBlock:")
    public native void enumerateLineFragmentsForGlyphRangeUsingBlock(@ByValue NSRange glyphRange,
            @ObjCBlock(name = "call_enumerateLineFragmentsForGlyphRangeUsingBlock") Block_enumerateLineFragmentsForGlyphRangeUsingBlock block);

    @Generated
    @Selector("extraLineFragmentRect")
    @ByValue
    public native CGRect extraLineFragmentRect();

    @Generated
    @Selector("extraLineFragmentTextContainer")
    public native NSTextContainer extraLineFragmentTextContainer();

    @Generated
    @Selector("extraLineFragmentUsedRect")
    @ByValue
    public native CGRect extraLineFragmentUsedRect();

    @Generated
    @Selector("fillBackgroundRectArray:count:forCharacterRange:color:")
    public native void fillBackgroundRectArrayCountForCharacterRangeColor(
            @ReferenceInfo(type = CGRect.class) ConstPtr<CGRect> rectArray, @NUInt long rectCount,
            @ByValue NSRange charRange, UIColor color);

    @Generated
    @Selector("firstUnlaidCharacterIndex")
    @NUInt
    public native long firstUnlaidCharacterIndex();

    @Generated
    @Selector("firstUnlaidGlyphIndex")
    @NUInt
    public native long firstUnlaidGlyphIndex();

    @Generated
    @Selector("fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
    @NFloat
    public native double fractionOfDistanceThroughGlyphForPointInTextContainer(@ByValue CGPoint point,
            NSTextContainer container);

    @Generated
    @Selector("getFirstUnlaidCharacterIndex:glyphIndex:")
    public native void getFirstUnlaidCharacterIndexGlyphIndex(NUIntPtr charIndex, NUIntPtr glyphIndex);

    @Generated
    @Selector("getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:")
    @NUInt
    public native long getGlyphsInRangeGlyphsPropertiesCharacterIndexesBidiLevels(@ByValue NSRange glyphRange,
            CharPtr glyphBuffer, NIntPtr props, NUIntPtr charIndexBuffer, BytePtr bidiLevelBuffer);

    @Generated
    @Selector("getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
    @NUInt
    public native long getLineFragmentInsertionPointsForCharacterAtIndexAlternatePositionsInDisplayOrderPositionsCharacterIndexes(
            @NUInt long charIndex, boolean aFlag, boolean dFlag, NFloatPtr positions, NUIntPtr charIndexes);

    @Generated
    @Selector("glyphAtIndex:")
    public native char glyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("glyphAtIndex:isValidIndex:")
    public native char glyphAtIndexIsValidIndex(@NUInt long glyphIndex, BoolPtr isValidIndex);

    @Generated
    @Selector("glyphIndexForCharacterAtIndex:")
    @NUInt
    public native long glyphIndexForCharacterAtIndex(@NUInt long charIndex);

    @Generated
    @Selector("glyphIndexForPoint:inTextContainer:")
    @NUInt
    public native long glyphIndexForPointInTextContainer(@ByValue CGPoint point, NSTextContainer container);

    @Generated
    @Selector("glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
    @NUInt
    public native long glyphIndexForPointInTextContainerFractionOfDistanceThroughGlyph(@ByValue CGPoint point,
            NSTextContainer container, NFloatPtr partialFraction);

    @Generated
    @Selector("glyphRangeForBoundingRect:inTextContainer:")
    @ByValue
    public native NSRange glyphRangeForBoundingRectInTextContainer(@ByValue CGRect bounds, NSTextContainer container);

    @Generated
    @Selector("glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
    @ByValue
    public native NSRange glyphRangeForBoundingRectWithoutAdditionalLayoutInTextContainer(@ByValue CGRect bounds,
            NSTextContainer container);

    @Generated
    @Selector("glyphRangeForCharacterRange:actualCharacterRange:")
    @ByValue
    public native NSRange glyphRangeForCharacterRangeActualCharacterRange(@ByValue NSRange charRange,
            NSRange actualCharRange);

    @Generated
    @Selector("glyphRangeForTextContainer:")
    @ByValue
    public native NSRange glyphRangeForTextContainer(NSTextContainer container);

    @Generated
    @Selector("hasNonContiguousLayout")
    public native boolean hasNonContiguousLayout();

    @Generated
    @Selector("hyphenationFactor")
    @NFloat
    public native double hyphenationFactor();

    @Generated
    @Selector("init")
    public native NSLayoutManager init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLayoutManager initWithCoder(NSCoder coder);

    @Generated
    @Selector("insertTextContainer:atIndex:")
    public native void insertTextContainerAtIndex(NSTextContainer container, @NUInt long index);

    @Generated
    @Selector("invalidateDisplayForCharacterRange:")
    public native void invalidateDisplayForCharacterRange(@ByValue NSRange charRange);

    @Generated
    @Selector("invalidateDisplayForGlyphRange:")
    public native void invalidateDisplayForGlyphRange(@ByValue NSRange glyphRange);

    @Generated
    @Selector("invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
    public native void invalidateGlyphsForCharacterRangeChangeInLengthActualCharacterRange(@ByValue NSRange charRange,
            @NInt long delta, NSRange actualCharRange);

    @Generated
    @Selector("invalidateLayoutForCharacterRange:actualCharacterRange:")
    public native void invalidateLayoutForCharacterRangeActualCharacterRange(@ByValue NSRange charRange,
            NSRange actualCharRange);

    @Generated
    @Selector("isValidGlyphIndex:")
    public native boolean isValidGlyphIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:")
    @ByValue
    public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange);

    @Generated
    @Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    @ByValue
    public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange, boolean flag);

    @Generated
    @Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
    @ByValue
    public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange);

    @Generated
    @Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    @ByValue
    public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
            @NUInt long glyphIndex, NSRange effectiveGlyphRange, boolean flag);

    @Generated
    @Selector("locationForGlyphAtIndex:")
    @ByValue
    public native CGPoint locationForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("notShownAttributeForGlyphAtIndex:")
    public native boolean notShownAttributeForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("numberOfGlyphs")
    @NUInt
    public native long numberOfGlyphs();

    @Generated
    @Selector("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditingForTextStorageEditedRangeChangeInLengthInvalidatedRange(NSTextStorage textStorage,
            @NUInt long editMask, @ByValue NSRange newCharRange, @NInt long delta,
            @ByValue NSRange invalidatedCharRange);

    @Generated
    @Selector("propertyForGlyphAtIndex:")
    @NInt
    public native long propertyForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("rangeOfNominallySpacedGlyphsContainingIndex:")
    @ByValue
    public native NSRange rangeOfNominallySpacedGlyphsContainingIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("removeTextContainerAtIndex:")
    public native void removeTextContainerAtIndex(@NUInt long index);

    @Generated
    @Selector("setAllowsNonContiguousLayout:")
    public native void setAllowsNonContiguousLayout(boolean value);

    @Generated
    @Selector("setAttachmentSize:forGlyphRange:")
    public native void setAttachmentSizeForGlyphRange(@ByValue CGSize attachmentSize, @ByValue NSRange glyphRange);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSLayoutManagerDelegate value);

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

    @Generated
    @Selector("setDrawsOutsideLineFragment:forGlyphAtIndex:")
    public native void setDrawsOutsideLineFragmentForGlyphAtIndex(boolean flag, @NUInt long glyphIndex);

    @Generated
    @Selector("setExtraLineFragmentRect:usedRect:textContainer:")
    public native void setExtraLineFragmentRectUsedRectTextContainer(@ByValue CGRect fragmentRect,
            @ByValue CGRect usedRect, NSTextContainer container);

    @Generated
    @Selector("setGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public native void setGlyphsPropertiesCharacterIndexesFontForGlyphRange(ConstCharPtr glyphs, ConstNIntPtr props,
            ConstNUIntPtr charIndexes, UIFont aFont, @ByValue NSRange glyphRange);

    @Generated
    @Selector("setHyphenationFactor:")
    public native void setHyphenationFactor(@NFloat double value);

    @Generated
    @Selector("setLineFragmentRect:forGlyphRange:usedRect:")
    public native void setLineFragmentRectForGlyphRangeUsedRect(@ByValue CGRect fragmentRect,
            @ByValue NSRange glyphRange, @ByValue CGRect usedRect);

    @Generated
    @Selector("setLocation:forStartOfGlyphRange:")
    public native void setLocationForStartOfGlyphRange(@ByValue CGPoint location, @ByValue NSRange glyphRange);

    @Generated
    @Selector("setNotShownAttribute:forGlyphAtIndex:")
    public native void setNotShownAttributeForGlyphAtIndex(boolean flag, @NUInt long glyphIndex);

    @Generated
    @Selector("setShowsControlCharacters:")
    public native void setShowsControlCharacters(boolean value);

    @Generated
    @Selector("setShowsInvisibleCharacters:")
    public native void setShowsInvisibleCharacters(boolean value);

    @Generated
    @Selector("setTextContainer:forGlyphRange:")
    public native void setTextContainerForGlyphRange(NSTextContainer container, @ByValue NSRange glyphRange);

    @Generated
    @Selector("setTextStorage:")
    public native void setTextStorage_unsafe(NSTextStorage value);

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

    @Generated
    @Selector("setUsesFontLeading:")
    public native void setUsesFontLeading(boolean value);

    @Generated
    @Selector("showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
    public native void showCGGlyphsPositionsCountFontMatrixAttributesInContext(ConstCharPtr glyphs,
            @ReferenceInfo(type = CGPoint.class) ConstPtr<CGPoint> positions, @NUInt long glyphCount, UIFont font,
            @ByValue CGAffineTransform textMatrix, NSDictionary<String, ?> attributes, CGContextRef graphicsContext);

    @Generated
    @Selector("showsControlCharacters")
    public native boolean showsControlCharacters();

    @Generated
    @Selector("showsInvisibleCharacters")
    public native boolean showsInvisibleCharacters();

    @Generated
    @Selector("strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void strikethroughGlyphRangeStrikethroughTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long strikethroughVal, @ByValue CGRect lineRect,
            @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    @Generated
    @Selector("textContainerChangedGeometry:")
    public native void textContainerChangedGeometry(NSTextContainer container);

    @Generated
    @Selector("textContainerForGlyphAtIndex:effectiveRange:")
    public native NSTextContainer textContainerForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            NSRange effectiveGlyphRange);

    @Generated
    @Selector("textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    public native NSTextContainer textContainerForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
            @NUInt long glyphIndex, NSRange effectiveGlyphRange, boolean flag);

    @Generated
    @Selector("textContainers")
    public native NSArray<? extends NSTextContainer> textContainers();

    @Generated
    @Selector("textStorage")
    public native NSTextStorage textStorage();

    @Generated
    @Selector("truncatedGlyphRangeInLineFragmentForGlyphAtIndex:")
    @ByValue
    public native NSRange truncatedGlyphRangeInLineFragmentForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void underlineGlyphRangeUnderlineTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long underlineVal, @ByValue CGRect lineRect,
            @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    @Generated
    @Selector("usedRectForTextContainer:")
    @ByValue
    public native CGRect usedRectForTextContainer(NSTextContainer container);

    @Generated
    @Selector("usesFontLeading")
    public native boolean usesFontLeading();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock {
        @Generated
        void call_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock(
                @ByValue CGRect rect, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLineFragmentsForGlyphRangeUsingBlock {
        @Generated
        void call_enumerateLineFragmentsForGlyphRangeUsingBlock(@ByValue CGRect rect, @ByValue CGRect usedRect,
                NSTextContainer textContainer, @ByValue NSRange glyphRange, BoolPtr stop);
    }

    @Generated
    @Selector("limitsLayoutForSuspiciousContents")
    public native boolean limitsLayoutForSuspiciousContents();

    @Generated
    @Selector("setLimitsLayoutForSuspiciousContents:")
    public native void setLimitsLayoutForSuspiciousContents(boolean value);

    @Generated
    @Selector("setUsesDefaultHyphenation:")
    public native void setUsesDefaultHyphenation(boolean value);

    @Generated
    @Selector("showCGGlyphs:positions:count:font:textMatrix:attributes:inContext:")
    public native void showCGGlyphsPositionsCountFontTextMatrixAttributesInContext(ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions,
            @NInt long glyphCount, UIFont font, @ByValue CGAffineTransform textMatrix,
            NSDictionary<String, ?> attributes, CGContextRef CGContext);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("usesDefaultHyphenation")
    public native boolean usesDefaultHyphenation();
}
