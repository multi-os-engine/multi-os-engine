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

package apple.coretext.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFAttributedStringRef;
import apple.corefoundation.opaque.CFCharacterSetRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFNumberRef;
import apple.corefoundation.opaque.CFSetRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.corefoundation.struct.CFRange;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGFontRef;
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coretext.opaque.CTFontCollectionRef;
import apple.coretext.opaque.CTFontDescriptorRef;
import apple.coretext.opaque.CTFontRef;
import apple.coretext.opaque.CTFrameRef;
import apple.coretext.opaque.CTFramesetterRef;
import apple.coretext.opaque.CTGlyphInfoRef;
import apple.coretext.opaque.CTLineRef;
import apple.coretext.opaque.CTParagraphStyleRef;
import apple.coretext.opaque.CTRubyAnnotationRef;
import apple.coretext.opaque.CTRunDelegateRef;
import apple.coretext.opaque.CTRunRef;
import apple.coretext.opaque.CTTextTabRef;
import apple.coretext.opaque.CTTypesetterRef;
import apple.coretext.struct.CTParagraphStyleSetting;
import apple.coretext.struct.CTRunDelegateCallbacks;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("CoreText")
@Runtime(CRuntime.class)
public final class CoreText {
    static {
        NatJ.register();
    }

    @Generated
    private CoreText() {
    }

    /**
     * CTParagraphStyleGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTParagraphStyleRef/index.html#//apple_ref/c/func/CTParagraphStyleGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTParagraphStyleGetTypeID();

    /**
     * CTParagraphStyleCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTParagraphStyleRef/index.html#//apple_ref/c/func/CTParagraphStyleCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTParagraphStyleRef CTParagraphStyleCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") CTParagraphStyleSetting settings,
            @NUInt long settingCount);

    /**
     * CTParagraphStyleCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTParagraphStyleRef/index.html#//apple_ref/c/func/CTParagraphStyleCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTParagraphStyleRef CTParagraphStyleCreateCopy(CTParagraphStyleRef paragraphStyle);

    /**
     * CTParagraphStyleGetValueForSpecifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTParagraphStyleRef/index.html#//apple_ref/c/func/CTParagraphStyleGetValueForSpecifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTParagraphStyleGetValueForSpecifier(CTParagraphStyleRef paragraphStyle, int spec,
            @NUInt long valueBufferSize, VoidPtr valueBuffer);

    /**
     * CTFontDescriptorGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFontDescriptorGetTypeID();

    /**
     * CTFontDescriptorCreateWithNameAndSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateWithNameAndSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateWithNameAndSize(CFStringRef name,
            @NFloat double size);

    /**
     * CTFontDescriptorCreateWithAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateWithAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateWithAttributes(CFDictionaryRef attributes);

    /**
     * CTFontDescriptorCreateCopyWithAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateCopyWithAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithAttributes(CTFontDescriptorRef original,
            CFDictionaryRef attributes);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFamily(CTFontDescriptorRef original,
            CFStringRef family);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithSymbolicTraits(CTFontDescriptorRef original,
            int symTraitValue, int symTraitMask);

    /**
     * CTFontDescriptorCreateCopyWithVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateCopyWithVariation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithVariation(CTFontDescriptorRef original,
            CFNumberRef variationIdentifier, @NFloat double variationValue);

    /**
     * CTFontDescriptorCreateCopyWithFeature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateCopyWithFeature">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFeature(CTFontDescriptorRef original,
            CFNumberRef featureTypeIdentifier, CFNumberRef featureSelectorIdentifier);

    /**
     * CTFontDescriptorCreateMatchingFontDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateMatchingFontDescriptors">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontDescriptorCreateMatchingFontDescriptors(CTFontDescriptorRef descriptor,
            CFSetRef mandatoryAttributes);

    /**
     * CTFontDescriptorCreateMatchingFontDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCreateMatchingFontDescriptor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateMatchingFontDescriptor(
            CTFontDescriptorRef descriptor, CFSetRef mandatoryAttributes);

    @Generated
    @CFunction
    public static native boolean CTFontDescriptorMatchFontDescriptorsWithProgressHandler(CFArrayRef descriptors,
            CFSetRef mandatoryAttributes,
            @ObjCBlock(name = "call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler") Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler progressBlock);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler {
        @Generated
        boolean call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler(int arg0, CFDictionaryRef arg1);
    }

    /**
     * CTFontDescriptorCopyAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCopyAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontDescriptorCopyAttributes(CTFontDescriptorRef descriptor);

    /**
     * CTFontDescriptorCopyAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCopyAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontDescriptorCopyAttribute(CTFontDescriptorRef descriptor,
            CFStringRef attribute);

    /**
     * CTFontDescriptorCopyLocalizedAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontDescriptorRef/index.html#//apple_ref/c/func/CTFontDescriptorCopyLocalizedAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontDescriptorCopyLocalizedAttribute(CTFontDescriptorRef descriptor,
            CFStringRef attribute, Ptr<CFStringRef> language);

    /**
     * CTFontGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFontGetTypeID();

    /**
     * CTFontCreateWithName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateWithName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithName(CFStringRef name, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    /**
     * CTFontCreateWithFontDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateWithFontDescriptor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithFontDescriptor(CTFontDescriptorRef descriptor, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    /**
     * CTFontCreateWithNameAndOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateWithNameAndOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithNameAndOptions(CFStringRef name, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NUInt long options);

    /**
     * CTFontCreateWithFontDescriptorAndOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateWithFontDescriptorAndOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithFontDescriptorAndOptions(CTFontDescriptorRef descriptor,
            @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NUInt long options);

    /**
     * CTFontCreateUIFontForLanguage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateUIFontForLanguage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateUIFontForLanguage(int uiType, @NFloat double size, CFStringRef language);

    /**
     * CTFontCreateCopyWithAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateCopyWithAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithAttributes(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CTFontDescriptorRef attributes);

    /**
     * CTFontCreateCopyWithSymbolicTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateCopyWithSymbolicTraits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithSymbolicTraits(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            int symTraitValue, int symTraitMask);

    /**
     * CTFontCreateCopyWithFamily</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateCopyWithFamily">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithFamily(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CFStringRef family);

    /**
     * CTFontCreateForString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateForString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateForString(CTFontRef currentFont, CFStringRef string,
            @ByValue CFRange range);

    /**
     * CTFontCopyFontDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyFontDescriptor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontCopyFontDescriptor(CTFontRef font);

    /**
     * CTFontCopyAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontCopyAttribute(CTFontRef font, CFStringRef attribute);

    /**
     * CTFontGetSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetSize(CTFontRef font);

    /**
     * CTFontGetMatrix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetMatrix">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CTFontGetMatrix(CTFontRef font);

    /**
     * CTFontGetSymbolicTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetSymbolicTraits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CTFontGetSymbolicTraits(CTFontRef font);

    /**
     * CTFontCopyTraits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyTraits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontCopyTraits(CTFontRef font);

    /**
     * CTFontCopyPostScriptName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyPostScriptName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyPostScriptName(CTFontRef font);

    /**
     * CTFontCopyFamilyName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyFamilyName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyFamilyName(CTFontRef font);

    /**
     * CTFontCopyFullName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyFullName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyFullName(CTFontRef font);

    /**
     * CTFontCopyDisplayName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyDisplayName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyDisplayName(CTFontRef font);

    /**
     * CTFontCopyName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyName(CTFontRef font, CFStringRef nameKey);

    /**
     * CTFontCopyLocalizedName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyLocalizedName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyLocalizedName(CTFontRef font, CFStringRef nameKey,
            Ptr<CFStringRef> actualLanguage);

    /**
     * CTFontCopyCharacterSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyCharacterSet">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CTFontCopyCharacterSet(CTFontRef font);

    /**
     * CTFontGetStringEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetStringEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CTFontGetStringEncoding(CTFontRef font);

    /**
     * CTFontCopySupportedLanguages</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopySupportedLanguages">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopySupportedLanguages(CTFontRef font);

    /**
     * CTFontGetGlyphsForCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetGlyphsForCharacters">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontGetGlyphsForCharacters(CTFontRef font, ConstCharPtr characters, CharPtr glyphs,
            @NInt long count);

    /**
     * CTFontGetAscent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetAscent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetAscent(CTFontRef font);

    /**
     * CTFontGetDescent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetDescent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetDescent(CTFontRef font);

    /**
     * CTFontGetLeading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetLeading">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetLeading(CTFontRef font);

    /**
     * CTFontGetUnitsPerEm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetUnitsPerEm">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CTFontGetUnitsPerEm(CTFontRef font);

    /**
     * CTFontGetGlyphCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetGlyphCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTFontGetGlyphCount(CTFontRef font);

    /**
     * CTFontGetBoundingBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetBoundingBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetBoundingBox(CTFontRef font);

    /**
     * CTFontGetUnderlinePosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetUnderlinePosition">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetUnderlinePosition(CTFontRef font);

    /**
     * CTFontGetUnderlineThickness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetUnderlineThickness">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetUnderlineThickness(CTFontRef font);

    /**
     * CTFontGetSlantAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetSlantAngle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetSlantAngle(CTFontRef font);

    /**
     * CTFontGetCapHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetCapHeight">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetCapHeight(CTFontRef font);

    /**
     * CTFontGetXHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetXHeight">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetXHeight(CTFontRef font);

    /**
     * CTFontGetGlyphWithName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetGlyphWithName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native char CTFontGetGlyphWithName(CTFontRef font, CFStringRef glyphName);

    /**
     * CTFontGetBoundingRectsForGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetBoundingRectsForGlyphs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetBoundingRectsForGlyphs(CTFontRef font, int orientation, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects, @NInt long count);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetOpticalBoundsForGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects, @NInt long count,
            @NUInt long options);

    /**
     * CTFontGetAdvancesForGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetAdvancesForGlyphs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CTFontGetAdvancesForGlyphs(CTFontRef font, int orientation, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize advances, @NInt long count);

    /**
     * CTFontGetVerticalTranslationsForGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetVerticalTranslationsForGlyphs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTFontGetVerticalTranslationsForGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize translations, @NInt long count);

    /**
     * CTFontCreatePathForGlyph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreatePathForGlyph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CTFontCreatePathForGlyph(CTFontRef font, char glyph,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    /**
     * CTFontCopyVariationAxes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyVariationAxes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyVariationAxes(CTFontRef font);

    /**
     * CTFontCopyVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyVariation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontCopyVariation(CTFontRef font);

    /**
     * CTFontCopyFeatures</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyFeatures">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyFeatures(CTFontRef font);

    /**
     * CTFontCopyFeatureSettings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyFeatureSettings">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyFeatureSettings(CTFontRef font);

    /**
     * CTFontCopyGraphicsFont</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyGraphicsFont">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFontRef CTFontCopyGraphicsFont(CTFontRef font, Ptr<CTFontDescriptorRef> attributes);

    /**
     * CTFontCreateWithGraphicsFont</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCreateWithGraphicsFont">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithGraphicsFont(CGFontRef graphicsFont, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CTFontDescriptorRef attributes);

    /**
     * CTFontCopyAvailableTables</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyAvailableTables">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyAvailableTables(CTFontRef font, int options);

    /**
     * CTFontCopyTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontCopyTable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CTFontCopyTable(CTFontRef font, int table, int options);

    /**
     * CTFontDrawGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontDrawGlyphs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTFontDrawGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions, @NUInt long count,
            CGContextRef context);

    /**
     * CTFontGetLigatureCaretPositions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontRef/index.html#//apple_ref/c/func/CTFontGetLigatureCaretPositions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTFontGetLigatureCaretPositions(CTFontRef font, char glyph, NFloatPtr positions,
            @NInt long maxPositions);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyDefaultCascadeListForLanguages(CTFontRef font,
            CFArrayRef languagePrefList);

    /**
     * CTFontCollectionGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontCollectionRef/index.html#//apple_ref/c/func/CTFontCollectionGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFontCollectionGetTypeID();

    /**
     * CTFontCollectionCreateFromAvailableFonts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontCollectionRef/index.html#//apple_ref/c/func/CTFontCollectionCreateFromAvailableFonts">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateFromAvailableFonts(CFDictionaryRef options);

    /**
     * CTFontCollectionCreateWithFontDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontCollectionRef/index.html#//apple_ref/c/func/CTFontCollectionCreateWithFontDescriptors">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateWithFontDescriptors(CFArrayRef queryDescriptors,
            CFDictionaryRef options);

    /**
     * CTFontCollectionCreateCopyWithFontDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontCollectionRef/index.html#//apple_ref/c/func/CTFontCollectionCreateCopyWithFontDescriptors">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateCopyWithFontDescriptors(CTFontCollectionRef original,
            CFArrayRef queryDescriptors, CFDictionaryRef options);

    /**
     * CTFontCollectionCreateMatchingFontDescriptors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontCollectionRef/index.html#//apple_ref/c/func/CTFontCollectionCreateMatchingFontDescriptors">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptors(CTFontCollectionRef collection);

    /**
     * CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFontCollectionRef/index.html#//apple_ref/c/func/CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(
            CTFontCollectionRef collection,
            @FunctionPtr(name = "call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback") Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback sortCallback,
            VoidPtr refCon);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback {
        @Generated
        @NInt
        long call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(VoidPtr arg0, VoidPtr arg1,
                VoidPtr arg2);
    }

    /**
     * CTFontManagerCreateFontDescriptorsFromURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerCreateFontDescriptorsFromURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCreateFontDescriptorsFromURL(CFURLRef fileURL);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontManagerCreateFontDescriptorFromData(CFDataRef data);

    /**
     * CTFontManagerRegisterFontsForURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerRegisterFontsForURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterFontsForURL(CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

    /**
     * CTFontManagerUnregisterFontsForURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerUnregisterFontsForURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterFontsForURL(CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

    /**
     * CTFontManagerRegisterGraphicsFont</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerRegisterGraphicsFont">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterGraphicsFont(CGFontRef font, Ptr<CFErrorRef> error);

    /**
     * CTFontManagerUnregisterGraphicsFont</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerUnregisterGraphicsFont">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterGraphicsFont(CGFontRef font, Ptr<CFErrorRef> error);

    /**
     * CTFontManagerRegisterFontsForURLs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerRegisterFontsForURLs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterFontsForURLs(CFArrayRef fontURLs, int scope,
            Ptr<CFArrayRef> errors);

    /**
     * CTFontManagerUnregisterFontsForURLs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_FontManager_Ref/index.html#//apple_ref/c/func/CTFontManagerUnregisterFontsForURLs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterFontsForURLs(CFArrayRef fontURLs, int scope,
            Ptr<CFArrayRef> errors);

    /**
     * CTFrameGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFrameGetTypeID();

    /**
     * CTFrameGetStringRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetStringRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTFrameGetStringRange(CTFrameRef frame);

    /**
     * CTFrameGetVisibleStringRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetVisibleStringRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTFrameGetVisibleStringRange(CTFrameRef frame);

    /**
     * CTFrameGetPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CTFrameGetPath(CTFrameRef frame);

    /**
     * CTFrameGetFrameAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetFrameAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFrameGetFrameAttributes(CTFrameRef frame);

    /**
     * CTFrameGetLines</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetLines">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFrameGetLines(CTFrameRef frame);

    /**
     * CTFrameGetLineOrigins</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameGetLineOrigins">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTFrameGetLineOrigins(CTFrameRef frame, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint origins);

    /**
     * CTFrameDraw</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFrameRef/index.html#//apple_ref/c/func/CTFrameDraw">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTFrameDraw(CTFrameRef frame, CGContextRef context);

    /**
     * CTLineGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTLineGetTypeID();

    /**
     * CTLineCreateWithAttributedString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineCreateWithAttributedString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateWithAttributedString(CFAttributedStringRef attrString);

    /**
     * CTLineCreateTruncatedLine</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineCreateTruncatedLine">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateTruncatedLine(CTLineRef line, double width, int truncationType,
            CTLineRef truncationToken);

    /**
     * CTLineCreateJustifiedLine</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineCreateJustifiedLine">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateJustifiedLine(CTLineRef line, @NFloat double justificationFactor,
            double justificationWidth);

    /**
     * CTLineGetGlyphCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetGlyphCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTLineGetGlyphCount(CTLineRef line);

    /**
     * CTLineGetGlyphRuns</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetGlyphRuns">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTLineGetGlyphRuns(CTLineRef line);

    /**
     * CTLineGetStringRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetStringRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTLineGetStringRange(CTLineRef line);

    /**
     * CTLineGetPenOffsetForFlush</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetPenOffsetForFlush">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CTLineGetPenOffsetForFlush(CTLineRef line, @NFloat double flushFactor,
            double flushWidth);

    /**
     * CTLineDraw</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineDraw">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTLineDraw(CTLineRef line, CGContextRef context);

    /**
     * CTLineGetTypographicBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetTypographicBounds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CTLineGetTypographicBounds(CTLineRef line, NFloatPtr ascent, NFloatPtr descent,
            NFloatPtr leading);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTLineGetBoundsWithOptions(CTLineRef line, @NUInt long options);

    /**
     * CTLineGetTrailingWhitespaceWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetTrailingWhitespaceWidth">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CTLineGetTrailingWhitespaceWidth(CTLineRef line);

    /**
     * CTLineGetImageBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetImageBounds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTLineGetImageBounds(CTLineRef line, CGContextRef context);

    /**
     * CTLineGetStringIndexForPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetStringIndexForPosition">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTLineGetStringIndexForPosition(CTLineRef line, @ByValue CGPoint position);

    /**
     * CTLineGetOffsetForStringIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTLineRef/index.html#//apple_ref/c/func/CTLineGetOffsetForStringIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTLineGetOffsetForStringIndex(CTLineRef line, @NInt long charIndex,
            NFloatPtr secondaryOffset);

    /**
     * CTTypesetterGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTTypesetterGetTypeID();

    /**
     * CTTypesetterCreateWithAttributedString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterCreateWithAttributedString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTTypesetterRef CTTypesetterCreateWithAttributedString(CFAttributedStringRef string);

    /**
     * CTTypesetterCreateWithAttributedStringAndOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterCreateWithAttributedStringAndOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTTypesetterRef CTTypesetterCreateWithAttributedStringAndOptions(CFAttributedStringRef string,
            CFDictionaryRef options);

    /**
     * CTTypesetterCreateLineWithOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterCreateLineWithOffset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTLineRef CTTypesetterCreateLineWithOffset(CTTypesetterRef typesetter,
            @ByValue CFRange stringRange, double offset);

    /**
     * CTTypesetterCreateLine</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterCreateLine">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTLineRef CTTypesetterCreateLine(CTTypesetterRef typesetter, @ByValue CFRange stringRange);

    /**
     * CTTypesetterSuggestLineBreakWithOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterSuggestLineBreakWithOffset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestLineBreakWithOffset(CTTypesetterRef typesetter, @NInt long startIndex,
            double width, double offset);

    /**
     * CTTypesetterSuggestLineBreak</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterSuggestLineBreak">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestLineBreak(CTTypesetterRef typesetter, @NInt long startIndex,
            double width);

    /**
     * CTTypesetterSuggestClusterBreakWithOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterSuggestClusterBreakWithOffset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestClusterBreakWithOffset(CTTypesetterRef typesetter,
            @NInt long startIndex, double width, double offset);

    /**
     * CTTypesetterSuggestClusterBreak</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTypesetterRef/index.html#//apple_ref/c/func/CTTypesetterSuggestClusterBreak">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestClusterBreak(CTTypesetterRef typesetter, @NInt long startIndex,
            double width);

    /**
     * CTFramesetterGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFramesetterRef/index.html#//apple_ref/c/func/CTFramesetterGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFramesetterGetTypeID();

    /**
     * CTFramesetterCreateWithAttributedString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFramesetterRef/index.html#//apple_ref/c/func/CTFramesetterCreateWithAttributedString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFramesetterRef CTFramesetterCreateWithAttributedString(CFAttributedStringRef string);

    /**
     * CTFramesetterCreateFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFramesetterRef/index.html#//apple_ref/c/func/CTFramesetterCreateFrame">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTFrameRef CTFramesetterCreateFrame(CTFramesetterRef framesetter, @ByValue CFRange stringRange,
            CGPathRef path, CFDictionaryRef frameAttributes);

    /**
     * CTFramesetterGetTypesetter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFramesetterRef/index.html#//apple_ref/c/func/CTFramesetterGetTypesetter">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTTypesetterRef CTFramesetterGetTypesetter(CTFramesetterRef framesetter);

    /**
     * CTFramesetterSuggestFrameSizeWithConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTFramesetterRef/index.html#//apple_ref/c/func/CTFramesetterSuggestFrameSizeWithConstraints">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CTFramesetterSuggestFrameSizeWithConstraints(CTFramesetterRef framesetter,
            @ByValue CFRange stringRange, CFDictionaryRef frameAttributes, @ByValue CGSize constraints,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange fitRange);

    /**
     * CTGlyphInfoGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTGlyphInfoGetTypeID();

    /**
     * CTGlyphInfoCreateWithGlyphName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoCreateWithGlyphName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyphName(CFStringRef glyphName, CTFontRef font,
            CFStringRef baseString);

    /**
     * CTGlyphInfoCreateWithGlyph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoCreateWithGlyph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyph(char glyph, CTFontRef font, CFStringRef baseString);

    /**
     * CTGlyphInfoCreateWithCharacterIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoCreateWithCharacterIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithCharacterIdentifier(char cid, short collection,
            CFStringRef baseString);

    /**
     * CTGlyphInfoGetGlyphName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoGetGlyphName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CTGlyphInfoGetGlyphName(CTGlyphInfoRef glyphInfo);

    /**
     * CTGlyphInfoGetCharacterIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoGetCharacterIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native char CTGlyphInfoGetCharacterIdentifier(CTGlyphInfoRef glyphInfo);

    /**
     * CTGlyphInfoGetCharacterCollection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTGlyphInfoRef/index.html#//apple_ref/c/func/CTGlyphInfoGetCharacterCollection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native short CTGlyphInfoGetCharacterCollection(CTGlyphInfoRef glyphInfo);

    @Generated
    @CFunction
    @NUInt
    public static native long CTRubyAnnotationGetTypeID();

    @Generated
    @CFunction
    public static native CTRubyAnnotationRef CTRubyAnnotationCreateCopy(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    public static native byte CTRubyAnnotationGetAlignment(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    public static native byte CTRubyAnnotationGetOverhang(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    @NFloat
    public static native double CTRubyAnnotationGetSizeFactor(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    public static native CFStringRef CTRubyAnnotationGetTextForPosition(CTRubyAnnotationRef rubyAnnotation,
            byte position);

    /**
     * CTRunGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTRunGetTypeID();

    /**
     * CTRunGetGlyphCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetGlyphCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTRunGetGlyphCount(CTRunRef run);

    /**
     * CTRunGetAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTRunGetAttributes(CTRunRef run);

    /**
     * CTRunGetStatus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetStatus">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CTRunGetStatus(CTRunRef run);

    /**
     * CTRunGetGlyphsPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetGlyphsPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstCharPtr CTRunGetGlyphsPtr(CTRunRef run);

    /**
     * CTRunGetGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetGlyphs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTRunGetGlyphs(CTRunRef run, @ByValue CFRange range, CharPtr buffer);

    /**
     * CTRunGetPositionsPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetPositionsPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CGPoint CTRunGetPositionsPtr(CTRunRef run);

    /**
     * CTRunGetPositions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetPositions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTRunGetPositions(CTRunRef run, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint buffer);

    /**
     * CTRunGetAdvancesPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetAdvancesPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CGSize CTRunGetAdvancesPtr(CTRunRef run);

    /**
     * CTRunGetAdvances</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetAdvances">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTRunGetAdvances(CTRunRef run, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize buffer);

    /**
     * CTRunGetStringIndicesPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetStringIndicesPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstNIntPtr CTRunGetStringIndicesPtr(CTRunRef run);

    /**
     * CTRunGetStringIndices</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetStringIndices">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTRunGetStringIndices(CTRunRef run, @ByValue CFRange range, NIntPtr buffer);

    /**
     * CTRunGetStringRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetStringRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTRunGetStringRange(CTRunRef run);

    /**
     * CTRunGetTypographicBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetTypographicBounds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CTRunGetTypographicBounds(CTRunRef run, @ByValue CFRange range, NFloatPtr ascent,
            NFloatPtr descent, NFloatPtr leading);

    /**
     * CTRunGetImageBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetImageBounds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTRunGetImageBounds(CTRunRef run, CGContextRef context, @ByValue CFRange range);

    /**
     * CTRunGetTextMatrix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunGetTextMatrix">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CTRunGetTextMatrix(CTRunRef run);

    /**
     * CTRunDraw</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTRunRef/index.html#//apple_ref/c/func/CTRunDraw">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CTRunDraw(CTRunRef run, CGContextRef context, @ByValue CFRange range);

    /**
     * CTRunDelegateGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreGraphics/Reference/CTRunDelegateRef/index.html#//apple_ref/c/func/CTRunDelegateGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTRunDelegateGetTypeID();

    /**
     * CTRunDelegateCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreGraphics/Reference/CTRunDelegateRef/index.html#//apple_ref/c/func/CTRunDelegateCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTRunDelegateRef CTRunDelegateCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") CTRunDelegateCallbacks callbacks,
            VoidPtr refCon);

    /**
     * CTRunDelegateGetRefCon</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreGraphics/Reference/CTRunDelegateRef/index.html#//apple_ref/c/func/CTRunDelegateGetRefCon">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CTRunDelegateGetRefCon(CTRunDelegateRef runDelegate);

    /**
     * CTTextTabGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTextTabRef/index.html#//apple_ref/c/func/CTTextTabGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTTextTabGetTypeID();

    /**
     * CTTextTabCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTextTabRef/index.html#//apple_ref/c/func/CTTextTabCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CTTextTabRef CTTextTabCreate(byte alignment, double location, CFDictionaryRef options);

    /**
     * CTTextTabGetAlignment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTextTabRef/index.html#//apple_ref/c/func/CTTextTabGetAlignment">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CTTextTabGetAlignment(CTTextTabRef tab);

    /**
     * CTTextTabGetLocation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTextTabRef/index.html#//apple_ref/c/func/CTTextTabGetLocation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CTTextTabGetLocation(CTTextTabRef tab);

    /**
     * CTTextTabGetOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CTTextTabRef/index.html#//apple_ref/c/func/CTTextTabGetOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTTextTabGetOptions(CTTextTabRef tab);

    /**
     * CTGetCoreTextVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Carbon/Reference/CoreText_Utilities_Ref/index.html#//apple_ref/c/func/CTGetCoreTextVersion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CTGetCoreTextVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSymbolicTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontWeightTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontWidthTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSlantTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontURLAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDisplayNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFamilyNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontStyleNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontTraitsAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSizeAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontMatrixAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCascadeListAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCharacterSetAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLanguagesAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontBaselineAdjustAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontMacintoshEncodingsAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeaturesAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSettingsAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFixedAdvanceAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOrientationAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFormatAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontRegistrationScopeAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPriorityAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontEnabledAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDownloadableAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDownloadedAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingSourceDescriptor();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingDescriptors();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingResult();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingPercentage();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingCurrentAssetSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingTotalDownloadedSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingTotalAssetSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingError();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCopyrightNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFamilyNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSubFamilyNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontStyleNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontUniqueNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFullNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVersionNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPostScriptNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontTrademarkNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManufacturerNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDesignerNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptionNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVendorURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDesignerURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLicenseNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLicenseURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSampleTextNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPostScriptCIDNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisMinimumValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisMaximumValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisDefaultValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpenTypeFeatureTag();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpenTypeFeatureValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeExclusiveKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeSelectorsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorDefaultKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorSettingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassRoman();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicCentered();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicLow();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicHigh();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassHanging();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassMath();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineReferenceFont();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineOriginalFont();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCollectionRemoveDuplicatesOption();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorDomain();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorFontURLsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerRegisteredFontsChangedNotification();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFrameProgressionAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathFillRuleAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathWidthAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFrameClippingPathsAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathClippingPathAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionDisableBidiProcessing();

    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionForcedEmbeddingLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTForegroundColorFromContextAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTKernAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTLigatureAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTForegroundColorAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTParagraphStyleAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTStrokeWidthAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTStrokeColorAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTUnderlineStyleAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTSuperscriptAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTUnderlineColorAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTVerticalFormsAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTGlyphInfoAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTCharacterShapeAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTLanguageAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTRunDelegateAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineInfoAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineReferenceInfoAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTWritingDirectionAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTRubyAnnotationAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTTabColumnTerminatorsAttributeName();

    @Generated
    @CFunction
    public static native void CTLineEnumerateCaretOffsets(CTLineRef line,
            @ObjCBlock(name = "call_CTLineEnumerateCaretOffsets") Block_CTLineEnumerateCaretOffsets block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTLineEnumerateCaretOffsets {
        @Generated
        void call_CTLineEnumerateCaretOffsets(double arg0, @NInt long arg1, boolean arg2, BoolPtr arg3);
    }
}
