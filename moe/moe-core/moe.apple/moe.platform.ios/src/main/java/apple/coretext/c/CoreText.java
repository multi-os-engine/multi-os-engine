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
import apple.corefoundation.opaque.CFBundleRef;
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
     * [@function] CTParagraphStyleGetTypeID
     * <p>
     * Returns the CFType of the paragraph style object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTParagraphStyleGetTypeID();

    /**
     * [@function] CTParagraphStyleCreate
     * <p>
     * Creates an immutable paragraph style.
     * <p>
     * Using this function is the easiest and most efficient way to
     * create a paragraph style. Paragraph styles should be kept
     * immutable for totally lock-free operation.
     * <p>
     * If an invalid paragraph style setting specifier is passed into
     * the "settings" parameter, nothing bad will happen but just don't
     * expect to be able to query for this value. This is to allow
     * backwards compatibility with style setting specifiers that may
     * be introduced in future versions.
     *
     * @param settings     The settings that you wish to pre-load the paragraph style
     *                     with. If you wish to specify the default set of settings,
     *                     then this parameter may be set to NULL.
     * @param settingCount The number of settings that you have specified in the
     *                     "settings" parameter. This must be greater than or equal
     *                     to zero.
     * @return If the paragraph style creation was successful, this function
     *         will return a valid reference to an immutable CTParagraphStyle
     *         object. Otherwise, this function will return NULL.
     */
    @Generated
    @CFunction
    public static native CTParagraphStyleRef CTParagraphStyleCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") CTParagraphStyleSetting settings,
            @NUInt long settingCount);

    /**
     * [@function] CTParagraphStyleCreateCopy
     * <p>
     * Creates an immutable copy of a paragraph style.
     *
     * @param paragraphStyle The style that you wish to copy.
     * @return If the "paragraphStyle" reference is valid, then this
     *         function will return valid reference to an immutable
     *         CTParagraphStyle object that is a copy of the one passed into
     *         "paragraphStyle".
     */
    @Generated
    @CFunction
    public static native CTParagraphStyleRef CTParagraphStyleCreateCopy(CTParagraphStyleRef paragraphStyle);

    /**
     * [@function] CTParagraphStyleGetValueForSpecifier
     * <p>
     * Obtains the current value for a single setting specifier.
     * <p>
     * This function will return the current value of the specifier
     * whether or not the user had actually set it. If the user has
     * not set it, this function will return the default value.
     * <p>
     * If an invalid paragraph style setting specifier is passed into
     * the "spec" parameter, nothing bad will happen and the buffer
     * value will simply be zeroed out. This is to allow backwards
     * compatibility with style setting specifier that may be introduced
     * in future versions.
     *
     * @param paragraphStyle  The paragraph style that you wish to get the value from.
     * @param spec            The setting specifier that you want to get the value for.
     * @param valueBufferSize The size of the buffer pointed to by the "valueBuffer" parameter.
     *                        This value must be at least as large as the size the required by
     *                        the CTParagraphSpecifier value set in the "spec" parameter.
     * @param valueBuffer     The buffer where the requested setting value will be written
     *                        upon successful completion. The buffer's size needs to be at least
     *                        as large as the value passed into "valueBufferSize".
     * @return This function will return "true" if the valueBuffer had been
     *         successfully filled. Otherwise, this function will return false,
     *         indicating that one or more of the parameters is not valid.
     */
    @Generated
    @CFunction
    public static native boolean CTParagraphStyleGetValueForSpecifier(CTParagraphStyleRef paragraphStyle, int spec,
            @NUInt long valueBufferSize, VoidPtr valueBuffer);

    /**
     * [@function] CTFontDescriptorGetTypeID
     * <p>
     * Returns the type identifier for Core Text font descriptor
     * references.
     *
     * @return The identifier for the opaque type CTFontDescriptorRef.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFontDescriptorGetTypeID();

    /**
     * [@function] CTFontDescriptorCreateWithNameAndSize
     * <p>
     * Creates a new font descriptor with the provided PostScript name and size.
     * <p>
     * If you are trying to create a system UI font descriptor (with name beginning with a "."), you should create a
     * font with CTFontCreateUIFontForLanguage() or appropriate AppKit/UIKit APIs instead, then use
     * CTFontCopyFontDescriptor() to get its font descriptor.
     *
     * @param name The PostScript name to be used for the font descriptor as a CFStringRef. Any font name beginning with
     *             a "." is reserved for the system and should not be used here.
     * @param size The point size. If 0.0, the kCTFontSizeAttribute will be omitted from the font descriptor.
     * @return This function creates a new font descriptor reference with the given PostScript name and point size.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateWithNameAndSize(CFStringRef name,
            @NFloat double size);

    /**
     * [@function] CTFontDescriptorCreateWithAttributes
     * <p>
     * Creates a new font descriptor reference from a dictionary of attributes.
     *
     * @param attributes A CFDictionaryRef of arbitrary attributes.
     * @return This function creates a new font descriptor with the attributes specified. This dictionary can contain
     *         arbitrary attributes that will be preserved, however unrecognized attributes will be ignored on font
     *         creation and and may not be preserved over the round trip (descriptor -> font -> descriptor).
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateWithAttributes(CFDictionaryRef attributes);

    /**
     * [@function] CTFontDescriptorCreateCopyWithAttributes
     * <p>
     * Creates a copy of the original font descriptor with new attributes.
     *
     * @param original   The original font descriptor reference.
     * @param attributes A CFDictionaryRef of arbitrary attributes.
     * @return This function creates a new copy of the original font descriptor with attributes augmented by those
     *         specified. If there are conflicts between attributes, the new attributes will replace existing ones,
     *         except for kCTFontVariationAttribute and kCTFontFeatureSettingsAttribute which will be merged.
     *         <p>
     *         Starting with macOS 10.12 and iOS 10.0, setting the value of kCTFontFeatureSettingsAttribute to kCFNull
     *         will clear the feature settings of the original font descriptor. Setting the value of any individual
     *         feature settings pair in the kCTFontFeatureSettingsAttribute value array to kCFNull will clear that
     *         feature setting alone. For example, an element like @{
     *         (id)kCTFontFeatureTypeIdentifierKey: @(kLigaturesType), (id)kCTFontFeatureSelectorIdentifierKey:
     *         (id)kCFNull } means clear the kLigatureType feature set in the original font descriptor. An element
     *         like @[ @"liga", (id)kCFNull ] will have the same effect.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithAttributes(CTFontDescriptorRef original,
            CFDictionaryRef attributes);

    /**
     * [@function] CTFontCreateCopyWithFamily
     * <p>
     * Returns a new font descriptor in the specified family based on the traits of the original descriptor.
     *
     * @param original The original font descriptor reference.
     * @param family   The name of the desired family.
     * @return Returns a new font reference with the original traits in the given family, or NULL if none found in the
     *         system.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFamily(CTFontDescriptorRef original,
            CFStringRef family);

    /**
     * [@function] CTFontDescriptorCreateCopyWithSymbolicTraits
     * <p>
     * Returns a new font descriptor based on the original descriptor having the specified symbolic traits.
     *
     * @param original      The original font descriptor reference.
     * @param symTraitValue The value of the symbolic traits. This bitfield is used to indicate the desired value for
     *                      the traits specified by the symTraitMask parameter. Used in conjunction, they can allow for
     *                      trait removal as well as addition.
     * @param symTraitMask  The mask bits of the symbolic traits. This bitfield is used to indicate the traits that
     *                      should be changed.
     * @return Returns a new font descriptor reference in the same family with the given symbolic traits, or NULL if
     *         none found in the system.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithSymbolicTraits(CTFontDescriptorRef original,
            int symTraitValue, int symTraitMask);

    /**
     * [@function] CTFontDescriptorCreateCopyWithVariation
     * <p>
     * Creates a copy of the original font descriptor with a new variation instance.
     *
     * @param original            The original font descriptor reference.
     * @param variationIdentifier The variation axis identifier. This is the four character code of the variation axis
     *                            as a CFNumberRef.
     * @param variationValue      The value corresponding with the variation instance.
     * @return This function returns a copy of the original font descriptor with a new variation instance. This is a
     *         convenience method for easily creating new variation font instances.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithVariation(CTFontDescriptorRef original,
            CFNumberRef variationIdentifier, @NFloat double variationValue);

    /**
     * [@function] CTFontDescriptorCreateCopyWithFeature
     * <p>
     * Copies a font descriptor with new feature setting.
     * <p>
     * This is a convenience method to more easily toggle the state of individual features.
     *
     * @param original                  The original font descriptor reference.
     * @param featureTypeIdentifier     The feature type identifier.
     * @param featureSelectorIdentifier The feature selector identifier.
     * @return A copy of the original font descriptor modified with the given feature settings.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFeature(CTFontDescriptorRef original,
            CFNumberRef featureTypeIdentifier, CFNumberRef featureSelectorIdentifier);

    /**
     * [@function] CTFontDescriptorCreateMatchingFontDescriptors
     * <p>
     * Returns an array of font normalized font descriptors matching the provided descriptor.
     *
     * @param descriptor          The font descriptor reference.
     * @param mandatoryAttributes A set of attribute keys which are required to be identically matched in any returned
     *                            font descriptors. Optional.
     * @return This function returns a retained array of normalized font descriptors matching the attributes present in
     *         descriptor. If descriptor itself is normalized then the array will contain only one item, the original
     *         descriptor.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontDescriptorCreateMatchingFontDescriptors(CTFontDescriptorRef descriptor,
            CFSetRef mandatoryAttributes);

    /**
     * [@function] CTFontDescriptorCreateMatchingFontDescriptor
     * <p>
     * Returns an the single preferred matching font descriptor based on the original descriptor and system precedence.
     *
     * @param descriptor          The font descriptor reference.
     * @param mandatoryAttributes A set of attribute keys which are required to be identically matched in any returned
     *                            font descriptors. Optional.
     * @return This function returns a retained normalized font descriptor matching the attributes present in
     *         descriptor. The original descriptor may be returned in normalized form.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateMatchingFontDescriptor(
            CTFontDescriptorRef descriptor, CFSetRef mandatoryAttributes);

    /**
     * [@function] CTFontDescriptorMatchFontDescriptorsWithProgressHandler
     * This function returns immediately, but can potentially take long time to process. The progress is notified via
     * progressBlock.
     *
     * @param descriptors         An array of descriptors to process.
     * @param mandatoryAttributes
     * @param progressBlock       Callback block to indicate the progress.
     *                            Return true to continue, and return false to cancel the process.
     *                            This block is called on a private serial queue on OS X 10.15, iOS 13, and later.
     * @return false if it couldn't start the work.
     */
    @Generated
    @CFunction
    public static native boolean CTFontDescriptorMatchFontDescriptorsWithProgressHandler(CFArrayRef descriptors,
            CFSetRef mandatoryAttributes,
            @ObjCBlock(name = "call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler") Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler progressBlock);

    /**
     * [@function] CTFontDescriptorCopyAttributes
     * <p>
     * Returns the attributes dictionary of the font descriptor.
     *
     * @param descriptor The font descriptor reference.
     * @return A retained reference to the font descriptor attributes dictionary. This dictionary will contain the
     *         minimum number of attributes to fully specify this particular font descriptor.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontDescriptorCopyAttributes(CTFontDescriptorRef descriptor);

    /**
     * [@function] CTFontDescriptorCopyAttribute
     * <p>
     * Returns the value associated with an arbitrary attribute.
     *
     * @param descriptor The font descriptor.
     * @param attribute  The requested attribute.
     * @return A retained reference to the requested attribute, or NULL if the requested attribute is not present. Refer
     *         to the attribute definitions for documentation as to how each attribute is packaged as a CFType.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontDescriptorCopyAttribute(CTFontDescriptorRef descriptor,
            CFStringRef attribute);

    /**
     * function CTFontDescriptorCopyLocalizedAttribute
     * <p>
     * Returns a localized value for the requested attribute if available.
     * <p>
     * This function returns a localized attribute based on the global language list. If localization is not possible
     * for the attribute the behavior matches CTFontDescriptorCopyAttribute(). Generally, localization of attributes is
     * only applicable to name attributes of a normalized font descriptor.
     *
     * @param descriptor The font descriptor reference.
     * @param attribute  The requested font attribute.
     * @param language   If non-NULL, this will be receive a retained reference to the matched language. The language
     *                   identifier will conform to UTS #35.
     *                   If CoreText can supply its own localized string where the font cannot, this value will be NULL.
     * @return A retained reference to the requested attribute, or NULL if the requested attribute is not present. Refer
     *         to the attribute definitions for documentation as to how each attribute is packaged as a CFType.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontDescriptorCopyLocalizedAttribute(CTFontDescriptorRef descriptor,
            CFStringRef attribute, Ptr<CFStringRef> language);

    /**
     * [@function] CTFontGetTypeID
     * <p>
     * Returns the type identifier for Core Text font references.
     *
     * @return The identifier for the opaque type CTFontRef.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFontGetTypeID();

    /**
     * [@function] CTFontCreateWithName
     * <p>
     * Returns a new font reference for the given name.
     * <p>
     * This function uses font descriptor matching so only registered fonts can be returned; see CTFontManager.h for
     * more information. If you are trying to create a system UI font (with name beginning with a "."), you should use
     * CTFontCreateUIFontForLanguage() or appropriate AppKit/UIKit APIs instead.
     *
     * @param name   The font name for which you wish to create a new font reference. A valid PostScript name is
     *               preferred, although other font name types will be matched in a fallback manner. Any font name
     *               beginning with a "." is reserved for the system and should not be used here.
     * @param size   The point size for the font reference. If 0.0 is specified, the default font size of 12.0 will be
     *               used.
     * @param matrix The transformation matrix for the font. If unspecified, the identity matrix will be used. Optional.
     * @return This function will return a CTFontRef that best matches the name provided with size and matrix
     *         attributes. The name parameter is the only required parameters, and default values will be used for
     *         unspecified parameters. A best match will be found if all parameters cannot be matched identically.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithName(CFStringRef name, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    /**
     * [@function] CTFontCreateWithFontDescriptor
     * <p>
     * Returns a new font reference that best matches the font descriptor.
     *
     * @param descriptor A font descriptor containing attributes that specify the requested font.
     * @param size       The point size for the font reference. If 0.0 is specified, the default font size of 12.0 will
     *                   be used.
     * @param matrix     The transformation matrix for the font. If unspecified, the identity matrix will be used.
     *                   Optional.
     * @return This function will return a CTFontRef that best matches the attributes provided with the font descriptor.
     *         The size and matrix parameters will override any specified in the font descriptor, unless they are
     *         unspecified. A best match font will always be returned, and default values will be used for any
     *         unspecified.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithFontDescriptor(CTFontDescriptorRef descriptor, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    /**
     * [@function] CTFontCreateWithNameAndOptions
     * <p>
     * Returns a new font reference for the given name.
     * <p>
     * This function uses font descriptor matching so only registered fonts can be returned; see CTFontManager.h for
     * more information. If you are trying to create a system UI font (with name beginning with a "."), you should use
     * CTFontCreateUIFontForLanguage() or appropriate AppKit/UIKit APIs instead.
     *
     * @param name    The font name for which you wish to create a new font reference. A valid PostScript name is
     *                preferred, although other font name types will be matched in a fallback manner. Any font name
     *                beginning with a "." is reserved for the system and should not be used here.
     * @param size    The point size for the font reference. If 0.0 is specified, the default font size of 12.0 will be
     *                used.
     * @param matrix  The transformation matrix for the font. If unspecified, the identity matrix will be used.
     *                Optional.
     * @param options Options flags.
     * @return This function will return a CTFontRef that best matches the name provided with size and matrix
     *         attributes. The name parameter is the only required parameters, and default values will be used for
     *         unspecified parameters. A best match will be found if all parameters cannot be matched identically.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithNameAndOptions(CFStringRef name, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NUInt long options);

    /**
     * [@function] CTFontCreateWithFontDescriptorAndOptions
     * <p>
     * Returns a new font reference that best matches the font descriptor.
     *
     * @param descriptor A font descriptor containing attributes that specify the requested font.
     * @param size       The point size for the font reference. If 0.0 is specified, the default font size of 12.0 will
     *                   be used.
     * @param matrix     The transformation matrix for the font. If unspecified, the identity matrix will be used.
     *                   Optional.
     * @param options    Options flags.
     * @return This function will return a CTFontRef that best matches the attributes provided with the font descriptor.
     *         The size and matrix parameters will override any specified in the font descriptor, unless they are
     *         unspecified. A best match font will always be returned, and default values will be used for any
     *         unspecified.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithFontDescriptorAndOptions(CTFontDescriptorRef descriptor,
            @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NUInt long options);

    /**
     * [@function] CTFontCreateUIFontForLanguage
     * <p>
     * Returns the special UI font for the given language and UI type.
     *
     * @param uiType   A uiType constant specifying the intended UI use for the requested font reference.
     * @param size     The point size for the font reference. If 0.0 is specified, the default size for the requested
     *                 uiType is used.
     * @param language Language identifier to select a font for a particular localization. If unspecified, the current
     *                 system language is used. The format of the language identifier should conform to UTS #35.
     * @return This function returns the correct font for various UI uses. The only required parameter is the uiType
     *         selector, unspecified optional parameters will use default values.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateUIFontForLanguage(int uiType, @NFloat double size, CFStringRef language);

    /**
     * [@function] CTFontCreateCopyWithAttributes
     * <p>
     * Returns a new font with additional attributes based on the original font.
     * <p>
     * This function provides a mechanism to quickly change attributes on a given font reference in response to user
     * actions. For instance, the size can be changed in response to a user manipulating a size slider.
     *
     * @param font       Original font reference to base new font on.
     * @param size       The point size for the font reference. If 0.0 is specified, the original font's size will be
     *                   preserved.
     * @param matrix     The transformation matrix for the font. If unspecified, the original font matrix will be
     *                   preserved. Optional.
     * @param attributes A font descriptor containing additional attributes that the new font should contain.
     * @return Returns a new font reference converted from the original with the specified attributes.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithAttributes(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CTFontDescriptorRef attributes);

    /**
     * [@function] CTFontCreateCopyWithSymbolicTraits
     * <p>
     * Returns a new font based on the original font with the specified symbolic traits.
     *
     * @param font          Original font reference on which to base the new font.
     * @param size          The point size for the font reference. If 0.0 is specified, the original font's size will be
     *                      preserved.
     * @param matrix        The transformation matrix for the font. If unspecified, the original font matrix will be
     *                      preserved. Optional.
     * @param symTraitValue The value of the symbolic traits. This bitfield is used to indicate the desired value for
     *                      the traits specified by the symTraitMask parameter. Used in conjunction, they can allow for
     *                      trait removal as well as addition.
     * @param symTraitMask  The mask bits of the symbolic traits. This bitfield is used to indicate the traits that
     *                      should be changed.
     * @return Returns a new font reference in the same family with the given symbolic traits, or NULL if none found in
     *         the system.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithSymbolicTraits(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            int symTraitValue, int symTraitMask);

    /**
     * [@function] CTFontCreateCopyWithFamily
     * <p>
     * Returns a new font in the specified family based on the traits of the original font.
     *
     * @param font   Original font reference to base new font on.
     * @param size   The point size for the font reference. If 0.0 is specified, the original font's size will be
     *               preserved.
     * @param matrix The transformation matrix for the font. If unspecified, the original font matrix will be preserved.
     *               Optional.
     * @param family The name of the desired family.
     * @return Returns a new font reference with the original traits in the given family. NULL if non found in the
     *         system.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithFamily(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CFStringRef family);

    /**
     * [@function] CTFontCreateForString
     * <p>
     * Returns a new font reference that can best map the given string range based on the current font.
     * <p>
     * This function is to be used when the current font does not cover the given range of the string. The current font
     * itself will not be returned, but preference is given to fonts in its cascade list.
     *
     * @param currentFont The current font that contains a valid cascade list.
     * @param string      A unicode string containing characters that cannot be encoded by the current font.
     * @param range       A CFRange specifying the range of the string that needs to be mapped.
     * @return This function returns the best substitute font that can encode the specified string range.
     * @see CTFontCopyCharacterSet
     * @see CTFontGetGlyphsForCharacters
     * @see kCTFontCascadeListAttribute
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateForString(CTFontRef currentFont, CFStringRef string,
            @ByValue CFRange range);

    /**
     * [@function] CTFontCopyFontDescriptor
     * <p>
     * Returns the normalized font descriptors for the given font reference.
     *
     * @param font The font reference.
     * @return This function returns a normalized font descriptor for a font. The font descriptor contains enough
     *         information to recreate this font at a later time.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontCopyFontDescriptor(CTFontRef font);

    /**
     * [@function] CTFontCopyAttribute
     * <p>
     * Returns the value associated with an arbitrary attribute.
     *
     * @param font      The font reference.
     * @param attribute The requested attribute.
     * @return This function returns a retained reference to an arbitrary attribute. If the requested attribute is not
     *         present, NULL is returned. Refer to the attribute definitions for documentation as to how each attribute
     *         is packaged as a CFType.
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontCopyAttribute(CTFontRef font, CFStringRef attribute);

    /**
     * [@function] CTFontGetSize
     * <p>
     * Returns the point size of the font reference.
     *
     * @param font The font reference.
     * @return This function returns the point size of the given font reference. This is the point size provided when
     *         the font was created.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetSize(CTFontRef font);

    /**
     * [@function] CTFontGetMatrix
     * <p>
     * Returns the transformation matrix of the font.
     *
     * @param font The font reference.
     * @return This function returns the transformation matrix for this given font reference. This is the matrix that
     *         was provided when the font was created.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CTFontGetMatrix(CTFontRef font);

    /**
     * [@function] CTFontGetSymbolicTraits
     * <p>
     * Returns the symbolic font traits.
     *
     * @param font The font reference.
     * @return This function returns the symbolic traits of the font. This is equivalent to the kCTFontSymbolicTrait of
     *         traits dictionary. See CTFontTraits.h for a definition of the font traits.
     */
    @Generated
    @CFunction
    public static native int CTFontGetSymbolicTraits(CTFontRef font);

    /**
     * [@function] CTFontCopyTraits
     * <p>
     * Returns the font traits dictionary.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to the font traits dictionary. Individual traits can be
     *         accessed with the trait key constants. See CTFontTraits.h for a definition of the font traits.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontCopyTraits(CTFontRef font);

    /**
     * [@function] CTFontCopyPostScriptName
     * <p>
     * Returns the PostScript name.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to the PostScript name of the font.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyPostScriptName(CTFontRef font);

    /**
     * [@function] CTFontCopyFamilyName
     * <p>
     * Returns the family name.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to the family name of the font.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyFamilyName(CTFontRef font);

    /**
     * [@function] CTFontCopyFullName
     * <p>
     * Returns the display name.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to the full name of the font.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyFullName(CTFontRef font);

    /**
     * [@function] CTFontCopyDisplayName
     * <p>
     * Returns the display name.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to the localized display name of the font.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyDisplayName(CTFontRef font);

    /**
     * [@function] CTFontCopyName
     * <p>
     * Returns a reference to the requested name.
     *
     * @param font    The font reference.
     * @param nameKey The name specifier. See name specifier constants.
     * @return This function creates the requested name for the font, or NULL if the font does not have an entry for the
     *         requested name. The Unicode version of the name will be preferred, otherwise the first available will be
     *         used.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyName(CTFontRef font, CFStringRef nameKey);

    /**
     * [@function] CTFontCopyLocalizedName
     * <p>
     * Returns a reference to a localized font name.
     *
     * @param font           The font reference.
     * @param nameKey        The name specifier. See name specifier constants.
     * @param actualLanguage Pointer to a CFStringRef to receive the language identifier of the returned name string.
     *                       The format of the language identifier will conform to UTS #35.
     *                       If CoreText can supply its own localized string where the font cannot, this value will be
     *                       NULL.
     * @return This function returns a specific localized name from the font reference. The name is localized based on
     *         the user's global language precedence. If the font does not have an entry for the requested name, NULL
     *         will be returned. The matched language will be returned in the caller's buffer.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyLocalizedName(CTFontRef font, CFStringRef nameKey,
            Ptr<CFStringRef> actualLanguage);

    /**
     * [@function] CTFontCopyCharacterSet
     * <p>
     * Returns the Unicode character set of the font.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to the font's character set. This character set covers the
     *         nominal referenced by the font's Unicode cmap table (or equivalent).
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CTFontCopyCharacterSet(CTFontRef font);

    /**
     * [@function] CTFontGetStringEncoding
     * <p>
     * Returns the best string encoding for legacy format support.
     *
     * @param font The font reference.
     * @return This function returns the best string encoding for the font.
     */
    @Generated
    @CFunction
    public static native int CTFontGetStringEncoding(CTFontRef font);

    /**
     * [@function] CTFontCopySupportedLanguages
     * <p>
     * Returns an array of languages supported by the font.
     *
     * @param font The font reference.
     * @return This function returns a retained reference to an array of languages supported by the font. The array
     *         contains language identifier strings as CFStringRefs. The format of the language identifier will conform
     *         to UTS #35.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopySupportedLanguages(CTFontRef font);

    /**
     * [@function] CTFontGetGlyphsForCharacters
     * <p>
     * Performs basic character-to-glyph mapping.
     * <p>
     * This function only provides the nominal mapping as specified by the font's Unicode cmap (or equivalent); such
     * mapping does not constitute proper Unicode layout: it is the caller's responsibility to handle the Unicode
     * properties of the characters.
     *
     * @param font       The font reference.
     * @param characters An array of characters (UTF-16 code units). Non-BMP characters must be encoded as surrogate
     *                   pairs.
     * @param glyphs     A pointer to a buffer to receive the glyphs. Glyphs for non-BMP characters are sparse: the
     *                   first glyph corresponds to the full character and the second glyph will be 0.
     * @param count      The capacity of both the characters and glyphs arrays.
     * @return The return value indicates whether all provided characters were successfully mapped. A return value of
     *         true indicates that the font mapped all characters. A return value of false indicates that some or all of
     *         the characters were not mapped; glyphs for unmapped characters will be 0 (with the exception of those
     *         corresponding non-BMP characters as described above).
     * @see CTFontCopyCharacterSet
     */
    @Generated
    @CFunction
    public static native boolean CTFontGetGlyphsForCharacters(CTFontRef font, ConstCharPtr characters, CharPtr glyphs,
            @NInt long count);

    /**
     * [@function] CTFontGetAscent
     * <p>
     * Returns the scaled font ascent metric.
     *
     * @param font The font reference.
     * @return This function returns the font ascent metric scaled based on the point size and matrix of the font
     *         reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetAscent(CTFontRef font);

    /**
     * [@function] CTFontGetDescent
     * <p>
     * Returns the scaled font descent metric.
     *
     * @param font The font reference.
     * @return This function returns the font descent metric scaled based on the point size and matrix of the font
     *         reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetDescent(CTFontRef font);

    /**
     * [@function] CTFontGetLeading
     * <p>
     * Returns the scaled font leading metric.
     *
     * @param font The font reference.
     * @return This function returns the font leading metric scaled based on the point size and matrix of the font
     *         reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetLeading(CTFontRef font);

    /**
     * [@function] CTFontGetUnitsPerEm
     * <p>
     * Returns the units per em metric.
     *
     * @param font The font reference.
     * @return This function returns the units per em of the font.
     */
    @Generated
    @CFunction
    public static native int CTFontGetUnitsPerEm(CTFontRef font);

    /**
     * [@function] CTFontGetGlyphCount
     * <p>
     * Returns the number of glyphs.
     *
     * @param font The font reference.
     * @return This function returns the number of glyphs in the font.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTFontGetGlyphCount(CTFontRef font);

    /**
     * [@function] CTFontGetBoundingBox
     * <p>
     * Returns the scaled bounding box.
     *
     * @param font The font reference.
     * @return This will return the design bounding box of the font, which is the rectangle defined by xMin, yMin, xMax,
     *         and yMax values for the font.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetBoundingBox(CTFontRef font);

    /**
     * [@function] CTFontGetUnderlinePosition
     * <p>
     * Returns the scaled underline position.
     *
     * @param font The font reference.
     * @return This function returns the font underline position metric scaled based on the point size and matrix of the
     *         font reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetUnderlinePosition(CTFontRef font);

    /**
     * [@function] CTFontGetUnderlineThickness
     * <p>
     * Returns the scaled underline thickness metric.
     *
     * @param font The font reference.
     * @return This function returns the font underline thickness metric scaled based on the point size and matrix of
     *         the font reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetUnderlineThickness(CTFontRef font);

    /**
     * [@function] CTFontGetSlantAngle
     * <p>
     * Returns the slant angle of the font.
     *
     * @param font The font reference.
     * @return This function returns the transformed slant angle of the font. This is equivalent to the italic or caret
     *         angle with any skew from the transformation matrix applied.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetSlantAngle(CTFontRef font);

    /**
     * [@function] CTFontGetCapHeight
     * <p>
     * Returns the cap height metric.
     *
     * @param font The font reference.
     * @return This function returns the font cap height metric scaled based on the point size and matrix of the font
     *         reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetCapHeight(CTFontRef font);

    /**
     * [@function] CTFontGetXHeight
     * <p>
     * Returns the X height metric.
     *
     * @param font The font reference.
     * @return This function returns the font X height metric scaled based on the point size and matrix of the font
     *         reference.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetXHeight(CTFontRef font);

    /**
     * [@function] CTFontGetGlyphWithName
     * <p>
     * Returns the CGGlyph for the specified glyph name.
     *
     * @param font      The font reference.
     * @param glyphName The glyph name as a CFString.
     * @return The glyph with the specified name or 0 if the name is not recognized; this glyph can be used with other
     *         Core Text glyph data accessors or with Quartz.
     */
    @Generated
    @CFunction
    public static native char CTFontGetGlyphWithName(CTFontRef font, CFStringRef glyphName);

    /**
     * [@function] CTFontGetBoundingRectsForGlyphs
     * <p>
     * Calculates the bounding rects for an array of glyphs and returns the overall bounding rect for the run.
     *
     * @param font          The font reference.
     * @param orientation   The intended drawing orientation of the glyphs. Used to determined which glyph metrics to
     *                      return.
     * @param glyphs        An array of count number of glyphs.
     * @param boundingRects An array of count number of CGRects to receive the computed glyph rects. Can be NULL, in
     *                      which case only the overall bounding rect is calculated.
     * @param count         The capacity of the glyphs and boundingRects buffers.
     * @return This function returns the overall bounding rectangle for an array or run of glyphs. The bounding rects of
     *         the individual glyphs are returned through the boundingRects parameter. These are the design metrics from
     *         the font transformed in font space.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetBoundingRectsForGlyphs(CTFontRef font, int orientation, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects, @NInt long count);

    /**
     * [@function] CTFontGetOpticalBoundsForGlyphs
     * <p>
     * Calculates the optical bounding rects for an array of glyphs and returns the overall optical bounding rect for
     * the run.
     * <p>
     * Fonts may specify the optical edges of glyphs that can be used to make the edges of lines of text line up in a
     * more visually pleasing way. This function returns bounding rects corresponding to this information if present in
     * a font, otherwise it returns typographic bounding rects (composed of the font's ascent and descent and a glyph's
     * advance width).
     *
     * @param font          The font reference.
     * @param glyphs        An array of count number of glyphs.
     * @param boundingRects An array of count number of CGRects to receive the computed glyph rects. Can be NULL, in
     *                      which case only the overall bounding rect is calculated.
     * @param count         The capacity of the glyphs and boundingRects buffers.
     * @param options       Reserved, set to zero.
     * @return This function returns the overall bounding rectangle for an array or run of glyphs. The bounding rects of
     *         the individual glyphs are returned through the boundingRects parameter. These are the design metrics from
     *         the font transformed in font space.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetOpticalBoundsForGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects, @NInt long count,
            @NUInt long options);

    /**
     * [@function] CTFontGetAdvancesForGlyphs
     * <p>
     * Calculates the advances for an array of glyphs and returns the summed advance.
     *
     * @param font        The font reference.
     * @param orientation The intended drawing orientation of the glyphs. Used to determined which glyph metrics to
     *                    return.
     * @param glyphs      An array of count number of glyphs.
     * @param advances    An array of count number of CGSize to receive the computed glyph advances. Can be NULL, in
     *                    which case only the overall advance is calculated.
     * @param count       The capacity of the glyphs and advances buffers.
     * @return This function returns the summed glyph advance of an array of glyphs. Individual glyph advances are
     *         passed back via the advances parameter. These are the ideal metrics for each glyph scaled and transformed
     *         in font space.
     */
    @Generated
    @CFunction
    public static native double CTFontGetAdvancesForGlyphs(CTFontRef font, int orientation, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize advances, @NInt long count);

    /**
     * [@function] CTFontGetVerticalTranslationsForGlyphs
     * <p>
     * Calculates the offset from the default (horizontal) origin to the vertical origin for an array of glyphs.
     *
     * @param font         The font reference.
     * @param glyphs       An array of count number of glyphs.
     * @param translations An array of count number of CGSize to receive the computed origin offsets.
     * @param count        The capacity of the glyphs and translations buffers.
     */
    @Generated
    @CFunction
    public static native void CTFontGetVerticalTranslationsForGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize translations, @NInt long count);

    /**
     * [@function] CTFontCreatePathForGlyph
     * <p>
     * Creates a path for the specified glyph.
     * <p>
     * Creates a path from the outlines of the glyph for the specified font. The path will reflect the font point size,
     * matrix, and transform parameter, in that order. The transform parameter will most commonly be used to provide a
     * translation to the desired glyph origin.
     *
     * @param font   The font reference.
     * @param glyph  The glyph.
     * @param matrix An affine transform applied to the path. Can be NULL, in which case CGAffineTransformIdentity will
     *               be used.
     * @return A retained CGPath reference containing the glyph outlines or NULL if there is no such glyph or it has no
     *         outline.
     */
    @Generated
    @CFunction
    public static native CGPathRef CTFontCreatePathForGlyph(CTFontRef font, char glyph,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    /**
     * [@function] CTFontCopyVariationAxes
     * <p>
     * Returns an array of variation axis dictionaries.
     *
     * @param font The font reference.
     * @return This function returns an array of variation axis dictionaries or null if the font does not support
     *         variations. Each variation axis dictionary contains the five kCTFontVariationAxis* keys above.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyVariationAxes(CTFontRef font);

    /**
     * [@function] CTFontCopyVariation
     * <p>
     * Returns a variation dictionary.
     * <p>
     * This function describes the current configuration of a variation font: a dictionary of number values with
     * variation identifier number keys. As of macOS 10.12 and iOS 10.0, only non-default values (as determined by the
     * variation axis) are returned.
     *
     * @param font The font reference.
     * @return This function returns a variation dictionary or null if the font does not support variations.
     * @see kCTFontVariationAxisIdentifierKey
     * @see kCTFontVariationAxisDefaultValueKey
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontCopyVariation(CTFontRef font);

    /**
     * [@function] CTFontCopyFeatures
     * <p>
     * Returns an array of font features
     *
     * @param font The font reference.
     * @return This function returns an array of font feature dictionaries for the font reference.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyFeatures(CTFontRef font);

    /**
     * [@function] CTFontCopyFeatureSettings
     * <p>
     * Returns an array of font feature setting tuples
     * <p>
     * A setting tuple is a dictionary of a kCTFontFeatureTypeIdentifierKey key-value pair and a
     * kCTFontFeatureSelectorIdentifierKey key-value pair. Each tuple corresponds to an enabled non-default setting. It
     * is the caller's responsibility to handle exclusive and non-exclusive settings as necessary.
     *
     * @param font The font reference.
     * @return This function returns a normalized array of font feature setting dictionaries. The array will only
     *         contain the non-default settings that should be applied to the font, or NULL if the default settings
     *         should be used.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyFeatureSettings(CTFontRef font);

    /**
     * [@function] CTFontCopyGraphicsFont
     * <p>
     * Returns a CGFontRef and attributes.
     *
     * @param font       The font reference.
     * @param attributes A pointer to a CTFontDescriptorRef to receive a font descriptor containing additional
     *                   attributes. Can be NULL. Must be released by caller.
     * @return This function returns a CGFontRef for the given font reference. Additional attributes from the font will
     *         be passed back as a font descriptor via the attributes parameter. The result must be released by the
     *         caller.
     */
    @Generated
    @CFunction
    public static native CGFontRef CTFontCopyGraphicsFont(CTFontRef font, Ptr<CTFontDescriptorRef> attributes);

    /**
     * [@function] CTFontCreateWithGraphicsFont
     * <p>
     * Creates a new font reference from a CGFontRef.
     *
     * @param graphicsFont A valid CGFontRef.
     * @param size         The point size for the font reference. If 0.0 is specified, the default font size of 12.0
     *                     will be used.
     * @param matrix       The transformation matrix for the font. If unspecified, the identity matrix will be used.
     *                     Optional.
     * @param attributes   A CTFontDescriptorRef containing additional attributes that should be matched. Optional.
     * @return This function returns a new font reference for an existing CGFontRef with the specified size, matrix, and
     *         additional attributes.
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithGraphicsFont(CGFontRef graphicsFont, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CTFontDescriptorRef attributes);

    /**
     * [@function] CTFontCopyAvailableTables
     * <p>
     * Returns an array of font table tags.
     *
     * @param font    The font reference.
     * @param options The options used when copying font tables.
     * @return This function returns an array of CTFontTableTag values for the given font and the supplied options. The
     *         returned set will contain unboxed values, which may be extracted like so:
     *         <code>CTFontTableTag tag = (CTFontTableTag)(uintptr_t)CFArrayGetValueAtIndex(tags, index);</code>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyAvailableTables(CTFontRef font, int options);

    /**
     * [@function] CTFontCopyTable
     * <p>
     * Returns a reference to the font table data.
     *
     * @param font    The font reference.
     * @param table   The font table identifier as a CTFontTableTag.
     * @param options The options used when copying font table.
     * @return This function returns a retained reference to the font table data as CFDataRef or NULL if the table is
     *         not present.
     */
    @Generated
    @CFunction
    public static native CFDataRef CTFontCopyTable(CTFontRef font, int table, int options);

    /**
     * [@function] CTFontDrawGlyphs
     * <p>
     * Renders the given glyphs from the CTFont at the given positions in the CGContext.
     * <p>
     * This function will modify the CGContext's font, text size, and text matrix if specified in the CTFont. These
     * attributes will not be restored.
     * The given glyphs should be the result of proper Unicode text layout operations (such as CTLine). Results from
     * CTFontGetGlyphsForCharacters (or similar APIs) do not perform any Unicode text layout.
     *
     * @param font      The font to render glyphs from. If the font has a size or matrix attribute, the CGContext will
     *                  be set with these values.
     * @param glyphs    The glyphs to be rendered. See above discussion of how the glyphs should be derived.
     * @param positions The positions (origins) for each glyph. The positions are in user space. The number of positions
     *                  passed in must be equivalent to the number of glyphs.
     * @param count     The number of glyphs to be rendered from the glyphs array.
     * @param context   CGContext used to render the glyphs.
     */
    @Generated
    @CFunction
    public static native void CTFontDrawGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions, @NUInt long count,
            CGContextRef context);

    /**
     * [@function] CTFontGetLigatureCaretPositions
     * <p>
     * Returns caret positions within a glyph.
     * <p>
     * This function is used to obtain caret positions for a specific glyph.
     * The return value is the max number of positions possible, and the function
     * will populate the caller's positions buffer with available positions if possible.
     * This function may not be able to produce positions if the font does not
     * have the appropriate data, in which case it will return 0.
     *
     * @param font         The font reference.
     * @param glyph        The glyph.
     * @param positions    A buffer of at least maxPositions to receive the ligature caret positions for
     *                     the glyph.
     * @param maxPositions The maximum number of positions to return.
     * @return Returns the number of caret positions for the specified glyph.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTFontGetLigatureCaretPositions(CTFontRef font, char glyph, NFloatPtr positions,
            @NInt long maxPositions);

    /**
     * [@function] CTFontCopyDefaultCascadeListForLanguages
     * <p>
     * Return an ordered list of CTFontDescriptorRef's for font fallback derived from the system default fallback region
     * according to the given language preferences. The style of the given is also matched as well as the weight and
     * width of the font is not one of the system UI font, otherwise the UI font fallback is applied.
     *
     * @param font             The font reference.
     * @param languagePrefList The language preference list - ordered array of CFStringRef's of ISO language codes.
     * @return The ordered list of fallback fonts - ordered array of CTFontDescriptors.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyDefaultCascadeListForLanguages(CTFontRef font,
            CFArrayRef languagePrefList);

    /**
     * [@function] CTFontCollectionGetTypeID
     * <p>
     * Returns the type identifier for Core Text font collection references.
     *
     * @return The identifier for the opaque types CTFontCollectionRef or CTMutableFontCollectionRef.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFontCollectionGetTypeID();

    /**
     * [@function] CTFontCollectionCreateFromAvailableFonts
     * <p>
     * Returns a new font collection matching all available fonts.
     *
     * @param options The options dictionary. See constant option keys.
     * @return This function creates a new collection containing all fonts available to the current application.
     */
    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateFromAvailableFonts(CFDictionaryRef options);

    /**
     * [@function] CTFontCollectionCreateWithFontDescriptors
     * <p>
     * Returns a new collection based on the array of font descriptors.
     *
     * @param queryDescriptors An array of font descriptors to use for matching. May be NULL, in which case the matching
     *                         descriptors will be NULL.
     * @param options          The options dictionary. See constant option keys.
     * @return This function creates a new collection based on the provided font descriptors. The contents of this
     *         collection is defined by matching the provided descriptors against all available font descriptors.
     */
    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateWithFontDescriptors(CFArrayRef queryDescriptors,
            CFDictionaryRef options);

    /**
     * [@function] CTFontCollectionCreateCopyWithFontDescriptors
     * <p>
     * Returns a copy of the original collection augmented with the new font descriptors.
     *
     * @param original         The original font collection reference.
     * @param queryDescriptors An array of font descriptors to augment those of the original collection.
     * @param options          The options dictionary. See constant option keys.
     * @return This function creates a copy of the original font collection augmented by the new font descriptors and
     *         options. The new font descriptors are merged with the existing descriptors to create a single set.
     */
    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateCopyWithFontDescriptors(CTFontCollectionRef original,
            CFArrayRef queryDescriptors, CFDictionaryRef options);

    /**
     * [@function] CTFontCollectionCreateMatchingFontDescriptors
     * <p>
     * Returns an array of font descriptors matching the collection.
     *
     * @param collection The font collection reference.
     * @return An array of CTFontDescriptors matching the collection definition or NULL if there are none.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptors(CTFontCollectionRef collection);

    /**
     * [@function] CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback
     * <p>
     * Returns the array of matching font descriptors sorted with the callback function.
     *
     * @param collection   The collection reference.
     * @param sortCallback The sorting callback function that defines the sort order.
     * @param refCon       Pointer to client data define context for the callback.
     * @return An array of CTFontDescriptors matching the criteria of the collection, sorted by the results of the
     *         sorting callback function, or NULL if there are none.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(
            CTFontCollectionRef collection,
            @FunctionPtr(name = "call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback") Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback sortCallback,
            VoidPtr refCon);

    /**
     * [@function] CTFontManagerCopyAvailablePostScriptNames
     * <p>
     * Returns an array of unique PostScript font names.
     *
     * @return An array of CFStrings.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCopyAvailablePostScriptNames();

    /**
     * [@function] CTFontManagerCopyAvailableFontFamilyNames
     * <p>
     * Returns an array of visible font family names sorted for UI display.
     *
     * @return An array of CFStrings.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCopyAvailableFontFamilyNames();

    /**
     * [@function] CTFontManagerCreateFontDescriptorsFromURL
     * <p>
     * Returns an array of font descriptors representing each of the fonts in the specified URL.
     * Note: these font descriptors are not available through font descriptor matching.
     *
     * @param fileURL A file system URL referencing a valid font file.
     * @return An array of CTFontDescriptors or NULL if there are no valid fonts.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCreateFontDescriptorsFromURL(CFURLRef fileURL);

    /**
     * [@function] CTFontManagerCreateFontDescriptorFromData
     * <p>
     * Returns a font descriptor representing the font in the supplied data.
     * Note: the font descriptor is not available through font descriptor matching.
     * <p>
     * If the data contains a font collection (TTC or OTC), only the first font in the collection will be returned.
     *
     * @param data A CFData containing font data.
     * @return A font descriptor created from the data or NULL if it is not a valid font.
     */
    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontManagerCreateFontDescriptorFromData(CFDataRef data);

    /**
     * [@function] CTFontManagerRegisterFontsForURL
     * <p>
     * Registers fonts from the specified font URL with the font manager. Registered fonts participate in font
     * descriptor matching.
     *
     * @param fontURL A file URL for the font or collection (TTC or OTC) to be registered. Once fonts have been
     *                registered from a file, it shouldn't be moved or renamed.
     * @param scope   Scope constant defining the availability and lifetime of the registration. See scope constants for
     *                more details.
     * @param error   Pointer to receive CFError in the case of failed registration.
     * @return Returns true if registration of the fonts was successful.
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterFontsForURL(CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

    /**
     * [@function] CTFontManagerUnregisterFontsForURL
     * <p>
     * Unregisters fonts from the specified font URL with the font manager. Unregistered fonts do not participate in
     * font descriptor matching.
     * iOS note: only fonts registered with CTFontManagerRegisterFontsForURL or CTFontManagerRegisterFontsForURLs can be
     * unregistered with this API.
     *
     * @param fontURL Font URL.
     * @param scope   Scope constant defining the availability and lifetime of the registration. Should match the scope
     *                the fonts are registered in. See scope constants for more details.
     * @param error   Pointer to receive CFError in the case of failed unregistration.
     * @return Returns true if unregistration of the fonts was successful.
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterFontsForURL(CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

    /**
     * [@function] CTFontManagerRegisterGraphicsFont
     * <p>
     * Registers the specified graphics font with the font manager. Registered fonts participate in font descriptor
     * matching.
     * Attempts to register a font that is either already registered or contains the same PostScript name of an already
     * registered font will fail.
     * This functionality is useful for fonts that may be embedded in documents or present/constructed in memory. A
     * graphics font is obtained
     * by calling CGFontCreateWithDataProvider. Fonts that are backed by files should be registered using
     * CTFontManagerRegisterFontsForURL.
     *
     * @param font  Graphics font to be registered.
     * @param error Pointer to receive CFError in the case of failed registration.
     * @return Returns true if registration of the fonts was successful.
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterGraphicsFont(CGFontRef font, Ptr<CFErrorRef> error);

    /**
     * [@function] CTFontManagerUnregisterGraphicsFont
     * <p>
     * Unregisters the specified graphics font with the font manager. Unregistered fonts do not participate in font
     * descriptor matching.
     *
     * @param font  Graphics font to be unregistered.
     * @param error Pointer to receive CFError in the case of failed unregistration.
     * @return Returns true if unregistration of the font was successful.
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterGraphicsFont(CGFontRef font, Ptr<CFErrorRef> error);

    /**
     * [@function] CTFontManagerRegisterFontsForURLs
     * <p>
     * Registers fonts from the specified font URLs with the font manager. Registered fonts are discoverable through
     * font descriptor matching.
     *
     * @param fontURLs An array of file URLs for the fonts or collections (TTC or OTC) to be registered. Once fonts have
     *                 been registered from a file, it shouldn't be moved or renamed.
     * @param scope    Scope constant defining the availability and lifetime of the registration. See scope constants
     *                 for more details.
     * @param errors   Pointer to CFArrayRef to receive array of CFError references. Each error will contain a CFArray
     *                 of font URLs corresponding to kCTFontManagerErrorFontURLsKey. These URLs represent the font files
     *                 that caused the error, and were not successfully registered. Must be released by caller. Can be
     *                 NULL.
     * @return Returns true if registration of all font URLs was successful. Otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterFontsForURLs(CFArrayRef fontURLs, int scope,
            Ptr<CFArrayRef> errors);

    /**
     * [@function] CTFontManagerUnregisterFontsForURLs
     * <p>
     * Unregisters fonts from the specified font URLs with the font manager. Unregistered fonts do not participate in
     * font descriptor matching.
     * iOS note: only fonts registered with CTFontManagerRegisterFontsForURL or CTFontManagerRegisterFontsForURLs can be
     * unregistered with this API.
     *
     * @param fontURLs Array of font URLs.
     * @param scope    Scope constant defining the availability and lifetime of the registration. Should match the scope
     *                 the fonts are registered in. See scope constants for more details.
     * @param errors   Pointer to CFArrayRef to receive array of CFError references. Each error will contain a CFArray
     *                 of font URLs corresponding to kCTFontManagerErrorFontURLsKey. These URLs represent the font files
     *                 that caused the error, and were not successfully unregistered. Must be released by caller. Can be
     *                 NULL.
     * @return Returns true if unregistration of all font URLs was successful. Otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterFontsForURLs(CFArrayRef fontURLs, int scope,
            Ptr<CFArrayRef> errors);

    /**
     * [@function] CTFrameGetTypeID
     * <p>
     * Returns the CFType of the frame object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFrameGetTypeID();

    /**
     * [@function] CTFrameGetStringRange
     * <p>
     * Returns the range of characters that were originally requested
     * to fill the frame.
     *
     * @param frame The frame that you want to get the character range from.
     * @return This function will return a CFRange containing the backing
     *         store range of characters that were originally requested
     *         to fill the frame. If the function call is not successful,
     *         then an empty range will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTFrameGetStringRange(CTFrameRef frame);

    /**
     * [@function] CTFrameGetVisibleStringRange
     * <p>
     * Returns the range of characters that actually fit in the
     * frame.
     * <p>
     * This can be used to chain frames, as it returns the range of
     * characters that can be seen in the frame. The next frame would
     * start where this frame ends.
     *
     * @param frame The frame that you want to get the visible character range
     *              from.
     * @return This function will return a CFRange containing the backing
     *         store range of characters that fit into the frame. If the
     *         function call is not successful, or if no characters fit
     *         in the frame, then an empty range will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTFrameGetVisibleStringRange(CTFrameRef frame);

    /**
     * [@function] CTFrameGetPath
     * <p>
     * Returns the path used to create the frame.
     *
     * @param frame The frame that you want to obtain the path from.
     */
    @Generated
    @CFunction
    public static native CGPathRef CTFrameGetPath(CTFrameRef frame);

    /**
     * [@function] CTFrameGetFrameAttributes
     * <p>
     * Returns the frame attributes used to create the frame.
     * <p>
     * It is possible to create a frame with an attributes dictionary
     * in order to control various aspects of the framing process.
     * These attributes are different from the ones that are used to
     * create an attributed string.
     *
     * @param frame The frame that you want to obtain the frame attributes from.
     * @return This function will return a CFDictionary containing the
     *         frame attributes that were used to create the frame. If the
     *         frame was created without any frame attributes, this function
     *         will return NULL.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTFrameGetFrameAttributes(CTFrameRef frame);

    /**
     * [@function] CTFrameGetLines
     * <p>
     * Returns an array of lines that make up the frame.
     * <p>
     * This function will return an array of CTLine objects that are
     * stored in the frame. These line objects can be accessed and
     * manipulated in any way that normal line objects can be. It is
     * possible that an empty frame exists. That is, a frame in which
     * no lines exist. In this case, the returned array will have 0
     * entries.
     *
     * @param frame The frame that you want to obtain the line array from.
     * @return This function will return a CFArray object containing the
     *         CTLine objects that make up the frame.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFrameGetLines(CTFrameRef frame);

    /**
     * [@function] CTFrameGetLineOrigins
     * <p>
     * Copies a range of line origins for a frame.
     * <p>
     * This function will copy a range of CGPoint structures. Each
     * CGPoint is the origin of the corresponding line in the array of
     * lines returned by CTFrameGetLines, relative to the origin of the
     * frame's path. The maximum number of line origins returned by
     * this function is the count of the array of lines.
     *
     * @param frame   The frame that you want to obtain the line origin array from.
     * @param range   The range of line origins you wish to copy. If the length of the
     *                range is set to 0, then the copy operation will continue from
     *                the range's start index to the last line origin.
     * @param origins The buffer to which the origins will be copied. The buffer must
     *                have at least as many elements as specified by range's length.
     *                When using the origins to calculate measurements for a frame's
     *                contents, remember that line origins do not always correspond to
     *                line metrics; paragraph style settings can affect line origins,
     *                for one. The overall typographic bounds of a frame may generally
     *                be calculated as the difference between the top of the frame and
     *                the descent of the last line. This will obviously exclude any
     *                spacing following the last line, but such spacing has no effect
     *                on framesetting in the first place.
     */
    @Generated
    @CFunction
    public static native void CTFrameGetLineOrigins(CTFrameRef frame, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint origins);

    /**
     * [@function] CTFrameDraw
     * <p>
     * Draws an entire frame to a context.
     * <p>
     * This function will draw an entire frame to the context. Note
     * that this call may leave the context in any state and does not
     * flush it after the draw operation.
     * <p>
     * If both the frame and the context are valid, the frame will be
     * drawn in the context.
     *
     * @param frame   The frame that you want to draw.
     * @param context The context to draw the frame to.
     */
    @Generated
    @CFunction
    public static native void CTFrameDraw(CTFrameRef frame, CGContextRef context);

    /**
     * [@function] CTLineGetTypeID
     * <p>
     * Returns the CFType of the line object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTLineGetTypeID();

    /**
     * [@function] CTLineCreateWithAttributedString
     * <p>
     * Creates a single immutable line object directly from an
     * attributed string.
     * <p>
     * This will allow clients who need very simple line generation to
     * create a line without needing to create a typesetter object. The
     * typesetting will be done under the hood. Without a typesetter
     * object, the line cannot be properly broken. However, for simple
     * things like text labels and other things, this is not an issue.
     *
     * @param attrString The attributed string which the line will be created for.
     * @return This function will return a reference to a CTLine object.
     */
    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateWithAttributedString(CFAttributedStringRef attrString);

    /**
     * [@function] CTLineCreateTruncatedLine
     * <p>
     * Creates a truncated line from an existing line.
     *
     * @param line            The line that you want to create a truncated line for.
     * @param width           The width at which truncation will begin. The line will be
     *                        truncated if its width is greater than the width passed in this.
     * @param truncationType  The type of truncation to perform if needed.
     * @param truncationToken This token will be added to the point where truncation took place
     *                        to indicate that the line was truncated. Usually, the truncation
     *                        token is the ellipsis character (U+2026). If this parameter is
     *                        set to NULL, then no truncation token is used, and the line is
     *                        simply cut off. The line specified in truncationToken should have
     *                        a width less than the width specified by the width parameter. If
     *                        the width of the line specified in truncationToken is greater,
     *                        this function will return NULL if truncation is needed.
     * @return This function will return a reference to a truncated CTLine
     *         object if the call was successful. Otherwise, it will return
     *         NULL.
     */
    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateTruncatedLine(CTLineRef line, double width, int truncationType,
            CTLineRef truncationToken);

    /**
     * [@function] CTLineCreateJustifiedLine
     * <p>
     * Creates a justified line from an existing line.
     *
     * @param line                The line that you want to create a justified line for.
     * @param justificationFactor Allows for full or partial justification. When set to 1.0 or
     *                            greater indicates, full justification will be performed. If less
     *                            than 1.0, varying degrees of partial justification will be
     *                            performed. If set to 0 or less, then no justification will be
     *                            performed.
     * @param justificationWidth  The width to which the resultant line will be justified. If
     *                            justificationWidth is less than the actual width of the line,
     *                            then negative justification will be performed ("text squishing").
     * @return This function will return a reference to a justified CTLine
     *         object if the call was successful. Otherwise, it will return
     *         NULL.
     */
    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateJustifiedLine(CTLineRef line, @NFloat double justificationFactor,
            double justificationWidth);

    /**
     * [@function] CTLineGetGlyphCount
     * <p>
     * Returns the total glyph count for the line object.
     * <p>
     * The total glyph count is equal to the sum of all of the glyphs in
     * the glyph runs forming the line.
     *
     * @param line The line that you want to obtain the glyph count for.
     * @return The total glyph count for the line passed in.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTLineGetGlyphCount(CTLineRef line);

    /**
     * [@function] CTLineGetGlyphRuns
     * <p>
     * Returns the array of glyph runs that make up the line object.
     *
     * @param line The line that you want to obtain the glyph run array for.
     * @return A CFArrayRef containing the CTRun objects that make up the line.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTLineGetGlyphRuns(CTLineRef line);

    /**
     * [@function] CTLineGetStringRange
     * <p>
     * Gets the range of characters that originally spawned the glyphs
     * in the line.
     *
     * @param line The line that you want to obtain the string range from.
     * @return A CFRange that contains the range over the backing store string
     *         that spawned the glyphs. If the function fails for any reason, an
     *         empty range will be returned.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTLineGetStringRange(CTLineRef line);

    /**
     * [@function] CTLineGetPenOffsetForFlush
     * <p>
     * Gets the pen offset required to draw flush text.
     *
     * @param line        The line that you want to obtain a flush position from.
     * @param flushFactor Specifies what kind of flushness you want. A flushFactor of 0 or
     *                    less indicates left flush. A flushFactor of 1.0 or more indicates
     *                    right flush. Flush factors between 0 and 1.0 indicate varying
     *                    degrees of center flush, with a value of 0.5 being totally center
     *                    flush.
     * @param flushWidth  Specifies the width that the flushness operation should apply to.
     * @return A value which can be used to offset the current pen position for
     *         the flush operation.
     */
    @Generated
    @CFunction
    public static native double CTLineGetPenOffsetForFlush(CTLineRef line, @NFloat double flushFactor,
            double flushWidth);

    /**
     * [@function] CTLineDraw
     * <p>
     * Draws a line.
     * <p>
     * This is a convenience call, since the line could be drawn
     * run-by-run by getting the glyph runs and accessing the glyphs out
     * of them. This call may leave the graphics context in any state and
     * does not flush the context after drawing. This call also expects
     * a text matrix with `y` values increasing from bottom to top; a
     * flipped text matrix may result in misplaced diacritics.
     *
     * @param line    The line that you want to draw.
     * @param context The context to which the line will be drawn.
     */
    @Generated
    @CFunction
    public static native void CTLineDraw(CTLineRef line, CGContextRef context);

    /**
     * [@function] CTLineGetTypographicBounds
     * <p>
     * Calculates the typographic bounds for a line.
     * <p>
     * A line's typographic width is the distance to the rightmost
     * glyph advance width edge. Note that this distance includes
     * trailing whitespace glyphs.
     *
     * @param line    The line that you want to calculate the typographic bounds for.
     * @param ascent  Upon return, this parameter will contain the ascent of the line.
     *                This may be set to NULL if not needed.
     * @param descent Upon return, this parameter will contain the descent of the line.
     *                This may be set to NULL if not needed.
     * @param leading Upon return, this parameter will contain the leading of the line.
     *                This may be set to NULL if not needed.
     * @return The typographic width of the line. If line is invalid, this
     *         function will always return zero.
     * @see CTLineGetTrailingWhitespaceWidth
     */
    @Generated
    @CFunction
    public static native double CTLineGetTypographicBounds(CTLineRef line, NFloatPtr ascent, NFloatPtr descent,
            NFloatPtr leading);

    /**
     * [@function] CTLineGetBoundsWithOptions
     * <p>
     * Calculates the bounds for a line.
     *
     * @param line    The line that you want to calculate the bounds for.
     * @param options Desired options or 0 if none.
     * @return The bounds of the line as specified by the type and options,
     *         such that the coordinate origin is coincident with the line
     *         origin and the rect origin is at the bottom left. If the line
     *         is invalid this function will return CGRectNull.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTLineGetBoundsWithOptions(CTLineRef line, @NUInt long options);

    /**
     * [@function] CTLineGetTrailingWhitespaceWidth
     * <p>
     * Calculates the trailing whitespace width for a line.
     *
     * @param line The line that you want to calculate the trailing whitespace width
     *             for. Creating a line for a width can result in a line that is
     *             actually longer than the desired width due to trailing
     *             whitespace. Normally this is not an issue due to whitespace being
     *             invisible, but this function may be used to determine what amount
     *             of a line's width is due to trailing whitespace.
     * @return The width of the line's trailing whitespace. If line is invalid,
     *         this function will always return zero.
     */
    @Generated
    @CFunction
    public static native double CTLineGetTrailingWhitespaceWidth(CTLineRef line);

    /**
     * [@function] CTLineGetImageBounds
     * <p>
     * Calculates the image bounds for a line.
     * <p>
     * The image bounds for a line is the union of all non-empty glyph
     * bounding rects, each positioned as it would be if drawn using
     * CTLineDraw using the current context. Note that the result is
     * ideal and does not account for raster coverage due to rendering.
     * This function is purely a convenience for using glyphs as an
     * image and should not be used for typographic purposes.
     *
     * @param line    The line that you want to calculate the image bounds for.
     * @param context The context which the image bounds will be calculated for or NULL,
     *                in which case the bounds are relative to CGPointZero.
     * @return A rectangle that tightly encloses the paths of the line's glyphs,
     *         which will be translated by the supplied context's text position.
     *         If the line is invalid, CGRectNull will be returned.
     * @see CTLineGetTypographicBounds
     * @see CTLineGetBoundsWithOptions
     * @see CTLineGetPenOffsetForFlush
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTLineGetImageBounds(CTLineRef line, CGContextRef context);

    /**
     * [@function] CTLineGetStringIndexForPosition
     * <p>
     * Performs hit testing.
     * <p>
     * This function can be used to determine the string index for a
     * mouse click or other event. This string index corresponds to the
     * character before which the next character should be inserted.
     * This determination is made by analyzing the string from which a
     * typesetter was created and the corresponding glyphs as embodied
     * by a particular line.
     *
     * @param line     The line being examined.
     * @param position The location of the mouse click relative to the line's origin.
     * @return The string index for the position. Relative to the line's string
     *         range, this value will be no less than the first string index and
     *         no greater than one plus the last string index. In the event of
     *         failure, this function will return kCFNotFound.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTLineGetStringIndexForPosition(CTLineRef line, @ByValue CGPoint position);

    /**
     * [@function] CTLineGetOffsetForStringIndex
     * <p>
     * Determines the graphical offset(s) for a string index.
     * <p>
     * This function returns the graphical offset(s) corresponding to
     * a string index, suitable for movement between adjacent lines or
     * for drawing a custom caret. For the former, the primary offset
     * may be adjusted for any relative indentation of the two lines;
     * a CGPoint constructed with the adjusted offset for its x value
     * and 0.0 for its y value is suitable for passing to
     * CTLineGetStringIndexForPosition. In either case, the primary
     * offset corresponds to the portion of the caret that represents
     * the visual insertion location for a character whose direction
     * matches the line's writing direction.
     *
     * @param line            The line from which the offset is requested.
     * @param charIndex       The string index corresponding to the desired position.
     * @param secondaryOffset An output parameter that will be set to the secondary offset
     *                        along the baseline for charIndex. When a single caret is
     *                        sufficient for a string index, this value will be the same as
     *                        the primary offset, which is the return value of this function.
     *                        This parameter may be NULL.
     * @return The primary offset along the baseline for charIndex, or 0.0 in
     *         the event of failure.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTLineGetOffsetForStringIndex(CTLineRef line, @NInt long charIndex,
            NFloatPtr secondaryOffset);

    /**
     * [@function] CTLineEnumerateCaretOffsets
     * <p>
     * Enumerates caret offsets for characters in a line.
     * <p>
     * The provided block is invoked once for each logical caret edge in the line, in left-to-right visual order.
     *
     * @param block The offset parameter is relative to the line origin. The leadingEdge parameter of this block refers
     *              to logical order.
     */
    @Generated
    @CFunction
    public static native void CTLineEnumerateCaretOffsets(CTLineRef line,
            @ObjCBlock(name = "call_CTLineEnumerateCaretOffsets") Block_CTLineEnumerateCaretOffsets block);

    /**
     * [@function] CTTypesetterGetTypeID
     * <p>
     * Returns the CFType of the typesetter object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTTypesetterGetTypeID();

    /**
     * [@function] CTTypesetterCreateWithAttributedString
     * <p>
     * Creates an immutable typesetter object using an attributed
     * string.
     * <p>
     * The resultant typesetter can be used to create lines, perform
     * line breaking, and do other contextual analysis based on the
     * characters in the string.
     *
     * @param string The CFAttributedStringRef that you want to typeset. This
     *               parameter must be filled in with a valid CFAttributedString.
     * @return This function will return a reference to a CTTypesetter.
     */
    @Generated
    @CFunction
    public static native CTTypesetterRef CTTypesetterCreateWithAttributedString(CFAttributedStringRef string);

    /**
     * [@function] CTTypesetterCreateWithAttributedStringAndOptions
     * <p>
     * Creates an immutable typesetter object using an attributed
     * string and a dictionary of options.
     * <p>
     * The resultant typesetter can be used to create lines, perform
     * line breaking, and do other contextual analysis based on the
     * characters in the string.
     *
     * @param string  The CFAttributedStringRef that you want to typeset. This
     *                parameter must be filled in with a valid CFAttributedString.
     * @param options A CFDictionary of typesetter options, or NULL if there are none.
     * @return This function will return either a reference to a CTTypesetter
     *         or NULL if layout cannot be performed due to an attributed
     *         string that would require unreasonable effort.
     * @see kCTTypesetterOptionAllowUnboundedLayout
     */
    @Generated
    @CFunction
    public static native CTTypesetterRef CTTypesetterCreateWithAttributedStringAndOptions(CFAttributedStringRef string,
            CFDictionaryRef options);

    /**
     * [@function] CTTypesetterCreateLineWithOffset
     * <p>
     * Creates an immutable line from the typesetter.
     * <p>
     * The resultant line will consist of glyphs in the correct visual
     * order, ready to draw.
     *
     * @param typesetter  The typesetter which the line will come from.
     * @param stringRange The string range which the line will be based on. If the length
     *                    portion of range is set to 0, then the typesetter will continue
     *                    to add glyphs to the line until it runs out of characters in the
     *                    string. The location and length of the range must be within the
     *                    bounds of the string, otherwise the call will fail.
     * @param offset      The line position offset.
     * @return This function will return a reference to a CTLine.
     */
    @Generated
    @CFunction
    public static native CTLineRef CTTypesetterCreateLineWithOffset(CTTypesetterRef typesetter,
            @ByValue CFRange stringRange, double offset);

    /**
     * [@function] CTTypesetterCreateLine
     * <p>
     * Equivalent to CTTypesetterCreateLineWithOffset with offset = 0.0.
     */
    @Generated
    @CFunction
    public static native CTLineRef CTTypesetterCreateLine(CTTypesetterRef typesetter, @ByValue CFRange stringRange);

    /**
     * [@function] CTTypesetterSuggestLineBreakWithOffset
     * <p>
     * Suggests a contextual line break point based on the width
     * provided.
     * <p>
     * The line break can be triggered either by a hard break character
     * in the stream or by filling the specified width with characters.
     *
     * @param typesetter The typesetter which the line will come from.
     * @param startIndex The starting point for the line break calculations. The break
     *                   calculations will include the character starting at startIndex.
     * @param width      The requested line break width.
     * @param offset     The line position offset.
     * @return The value returned is a count of the characters from startIndex
     *         that would cause the line break. This value returned can be used
     *         to construct a character range for CTTypesetterCreateLine.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestLineBreakWithOffset(CTTypesetterRef typesetter, @NInt long startIndex,
            double width, double offset);

    /**
     * [@function] CTTypesetterSuggestLineBreak
     * <p>
     * Equivalent to CTTypesetterSuggestLineBreakWithOffset with offset = 0.0.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestLineBreak(CTTypesetterRef typesetter, @NInt long startIndex,
            double width);

    /**
     * [@function] CTTypesetterSuggestClusterBreakWithOffset
     * <p>
     * Suggests a cluster line break point based on the width provided.
     * <p>
     * Suggests a typographic cluster line break point based on the width
     * provided. This cluster break is similar to a character break,
     * except that it will not break apart linguistic clusters. No other
     * contextual analysis will be done. This can be used by the caller
     * to implement a different line breaking scheme, such as
     * hyphenation. Note that a typographic cluster break can also be
     * triggered by a hard break character in the stream.
     *
     * @param typesetter The typesetter which the line will come from.
     * @param startIndex The starting point for the typographic cluster break
     *                   calculations. The break calculations will include the character
     *                   starting at startIndex.
     * @param width      The requested typographic cluster break width.
     * @param offset     The line position offset.
     * @return The value returned is a count of the characters from startIndex
     *         that would cause the cluster break. This value returned can be
     *         used to construct a character range for CTTypesetterCreateLine.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestClusterBreakWithOffset(CTTypesetterRef typesetter,
            @NInt long startIndex, double width, double offset);

    /**
     * [@function] CTTypesetterSuggestClusterBreak
     * <p>
     * Equivalent to CTTypesetterSuggestClusterBreakWithOffset with offset = 0.0.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestClusterBreak(CTTypesetterRef typesetter, @NInt long startIndex,
            double width);

    /**
     * [@function] CTFramesetterGetTypeID
     * <p>
     * Returns the CFType of the framesetter object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTFramesetterGetTypeID();

    /**
     * [@function] CTFramesetterCreateWithAttributedString
     * <p>
     * Creates an immutable framesetter object from an attributed
     * string.
     * <p>
     * The resultant framesetter object can be used to create and
     * fill text frames with the CTFramesetterCreateFrame call.
     *
     * @param attrString The attributed string to construct the framesetter with.
     * @return This function will return a reference to a CTFramesetter object.
     */
    @Generated
    @CFunction
    public static native CTFramesetterRef CTFramesetterCreateWithAttributedString(CFAttributedStringRef attrString);

    /**
     * [@function] CTFramesetterCreateFrame
     * <p>
     * Creates an immutable frame from a framesetter.
     * <p>
     * This call will create a frame full of glyphs in the shape of
     * the path provided by the "path" parameter. The framesetter
     * will continue to fill the frame until it either runs out of
     * text or it finds that text no longer fits.
     *
     * @param framesetter     The framesetter that will be used to create the frame.
     * @param stringRange     The string range which the new frame will be based on. The
     *                        string range is a range over the string that was used to
     *                        create the framesetter. If the length portion of the range
     *                        is set to 0, then the framesetter will continue to add lines
     *                        until it runs out of text or space.
     * @param path            A CGPath object that specifies the shape which the frame will
     *                        take on.
     * @param frameAttributes Additional attributes that control the frame filling process
     *                        can be specified here, or NULL if there are no such attributes.
     *                        See CTFrame.h for available attributes.
     * @return This function will return a reference to a new CTFrame object.
     */
    @Generated
    @CFunction
    public static native CTFrameRef CTFramesetterCreateFrame(CTFramesetterRef framesetter, @ByValue CFRange stringRange,
            CGPathRef path, CFDictionaryRef frameAttributes);

    /**
     * [@function] CTFramesetterGetTypesetter
     * <p>
     * Returns the typesetter object being used by the framesetter.
     * <p>
     * Each framesetter uses a typesetter internally to perform
     * line breaking and other contextual analysis based on the
     * characters in a string; this function returns the typesetter
     * being used by a particular framesetter if the caller would
     * like to perform other operations on that typesetter.
     *
     * @param framesetter The framesetter from which a typesetter is being requested.
     * @return This function will return a reference to a CTTypesetter
     *         object, which should not be released by the caller.
     */
    @Generated
    @CFunction
    public static native CTTypesetterRef CTFramesetterGetTypesetter(CTFramesetterRef framesetter);

    /**
     * [@function] CTFramesetterSuggestFrameSizeWithConstraints
     * <p>
     * Determines the frame size needed for a string range.
     * <p>
     * This function may be used to determine how much space is needed
     * to display a string, optionally by constraining the space along
     * either dimension.
     *
     * @param framesetter     The framesetter that will be used for measuring the frame size.
     * @param stringRange     The string range to which the frame size will apply. The
     *                        string range is a range over the string that was used to
     *                        create the framesetter. If the length portion of the range
     *                        is set to 0, then the framesetter will continue to add lines
     *                        until it runs out of text or space.
     * @param frameAttributes Additional attributes that control the frame filling process
     *                        can be specified here, or NULL if there are no such attributes.
     * @param constraints     The width and height to which the frame size will be constrained,
     *                        A value of CGFLOAT_MAX for either dimension indicates that it
     *                        should be treated as unconstrained.
     * @param fitRange        The range of the string that actually fit in the constrained size.
     * @return The actual dimensions for the given string range and constraints.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CTFramesetterSuggestFrameSizeWithConstraints(CTFramesetterRef framesetter,
            @ByValue CFRange stringRange, CFDictionaryRef frameAttributes, @ByValue CGSize constraints,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange fitRange);

    /**
     * [@function] CTGlyphInfoGetTypeID
     * <p>
     * Returns the CFType of the glyph info object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTGlyphInfoGetTypeID();

    /**
     * [@function] CTGlyphInfoCreateWithGlyphName
     * <p>
     * Creates an immutable glyph info object.
     * <p>
     * This function creates an immutable glyph info object for a glyph
     * name such as "copyright" and a specified font.
     *
     * @param glyphName  The name of the glyph.
     * @param font       The font to be associated with the returned CTGlyphInfo object.
     * @param baseString The part of the string the returned object is intended
     *                   to override.
     * @return This function will return a reference to a CTGlyphInfo object.
     */
    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyphName(CFStringRef glyphName, CTFontRef font,
            CFStringRef baseString);

    /**
     * [@function] CTGlyphInfoCreateWithGlyph
     * <p>
     * Creates an immutable glyph info object.
     * <p>
     * This function creates an immutable glyph info object for a glyph
     * index and a specified font.
     *
     * @param glyph      The glyph identifier.
     * @param font       The font to be associated with the returned CTGlyphInfo object.
     * @param baseString The part of the string the returned object is intended
     *                   to override.
     * @return This function will return a reference to a CTGlyphInfo object.
     */
    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyph(char glyph, CTFontRef font, CFStringRef baseString);

    /**
     * [@function] CTGlyphInfoCreateWithCharacterIdentifier
     * <p>
     * Creates an immutable glyph info object.
     * <p>
     * This function creates an immutable glyph info object for a
     * character identifier and a character collection.
     *
     * @param cid        A character identifier.
     * @param collection A character collection identifier.
     * @param baseString The part of the string the returned object is intended
     *                   to override.
     * @return This function will return a reference to a CTGlyphInfo object.
     */
    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithCharacterIdentifier(char cid, short collection,
            CFStringRef baseString);

    /**
     * [@function] CTGlyphInfoGetGlyphName
     * <p>
     * Gets the glyph name for a glyph info, if applicable.
     * <p>
     * This function will return the glyph name.
     *
     * @param glyphInfo The glyph info for which you would like the glyph name.
     * @return If the glyph info object was created with a glyph name, it will
     *         be returned. Otherwise, this function will return NULL.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTGlyphInfoGetGlyphName(CTGlyphInfoRef glyphInfo);

    /**
     * [@function] CTGlyphInfoGetCharacterIdentifier
     * <p>
     * Gets the character identifier for a glyph info.
     * <p>
     * This function will return the character identifier.
     *
     * @param glyphInfo The glyph info for which you would like the character identifier.
     * @return If the glyph info object was created with a character identifier,
     *         it will be returned. Otherwise, this function will return 0.
     */
    @Generated
    @CFunction
    public static native char CTGlyphInfoGetCharacterIdentifier(CTGlyphInfoRef glyphInfo);

    /**
     * [@function] CTGlyphInfoGetCharacterCollection
     * <p>
     * Gets the character collection for a glyph info.
     * <p>
     * This function will return the character collection. If the glyph
     * info object was created with a glyph name or a glyph index, its
     * character collection will be
     * kCTIdentityMappingCharacterCollection.
     *
     * @param glyphInfo The glyph info for which you would like the character collection.
     * @return This function will return the character collection of the given
     *         glyph info.
     */
    @Generated
    @CFunction
    public static native short CTGlyphInfoGetCharacterCollection(CTGlyphInfoRef glyphInfo);

    /**
     * [@function] CTRubyAnnotationGetTypeID
     * <p>
     * Returns the CFType of the ruby annotation object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTRubyAnnotationGetTypeID();

    /**
     * [@function] CTRubyAnnotationCreateWithAttributes
     * <p>
     * Creates an immutable ruby annotation object.
     * <p>
     * Using this function to create a ruby annotation object with more precise
     * control of the annotation text.
     *
     * @param alignment  Specifies how the ruby text and the base text should be aligned relative to each other.
     * @param overhang   Specifies how the ruby text can overhang adjacent characters.
     * @param position   The position of the annotation text.
     * @param string     A string without any formatting, its format will be derived from the attrs specified below.
     * @param attributes A attribute dictionary to combine with the string specified above. If you don't specify
     *                   kCTFontAttributeName, the font used by the Ruby annotation will be deduced from the base
     *                   text, with a size factor specified by a CFNumberRef value keyed by
     *                   kCTRubyAnnotationSizeFactorAttributeName.
     * @return This function will return a reference to a CTRubyAnnotation object.
     */
    @Generated
    @CFunction
    public static native CTRubyAnnotationRef CTRubyAnnotationCreateWithAttributes(byte alignment, byte overhang,
            byte position, CFStringRef string, CFDictionaryRef attributes);

    /**
     * [@function] CTRubyAnnotationCreateCopy
     * <p>
     * Creates an immutable copy of a ruby annotation object.
     *
     * @param rubyAnnotation The ruby annotation that you wish to copy.
     * @return If the "rubyAnnotation" reference is valid, then this
     *         function will return valid reference to an immutable
     *         CTRubyAnnotation object that is a copy of the one passed into
     *         "rubyAnnotation".
     */
    @Generated
    @CFunction
    public static native CTRubyAnnotationRef CTRubyAnnotationCreateCopy(CTRubyAnnotationRef rubyAnnotation);

    /**
     * [@function] CTRubyAnnotationGetAlignment
     * <p>
     * Get the alignment value of a ruby annotation object.
     *
     * @param rubyAnnotation The ruby annotation object.
     * @return If the "rubyAnnotation" reference is valid, then this
     *         function will return its alignment. Otherwise it will return kCTRubyAlignmentInvalid.
     */
    @Generated
    @CFunction
    public static native byte CTRubyAnnotationGetAlignment(CTRubyAnnotationRef rubyAnnotation);

    /**
     * [@function] CTRubyAnnotationGetOverhang
     * <p>
     * Get the overhang value of a ruby annotation object.
     *
     * @param rubyAnnotation The ruby annotation object.
     * @return If the "rubyAnnotation" reference is valid, then this
     *         function will return its overhang value. Otherwise it will return kCTRubyOverhangInvalid.
     */
    @Generated
    @CFunction
    public static native byte CTRubyAnnotationGetOverhang(CTRubyAnnotationRef rubyAnnotation);

    /**
     * [@function] CTRubyAnnotationGetSizeFactor
     * <p>
     * Get the size factor of a ruby annotation object.
     *
     * @param rubyAnnotation The ruby annotation object.
     * @return If the "rubyAnnotation" reference is valid, then this
     *         function will return its sizeFactor. Otherwise it will return 0.
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CTRubyAnnotationGetSizeFactor(CTRubyAnnotationRef rubyAnnotation);

    /**
     * [@function] CTRubyAnnotationGetTextForPosition
     * <p>
     * Get the ruby text for a particular position in a ruby annotation.
     *
     * @param rubyAnnotation The ruby annotation object.
     * @param position       The position for which you want to get the ruby text.
     * @return If the "rubyAnnotation" reference and the position are valid, then this
     *         function will return a CFStringRef for the text. Otherwise it will return NULL.
     */
    @Generated
    @CFunction
    public static native CFStringRef CTRubyAnnotationGetTextForPosition(CTRubyAnnotationRef rubyAnnotation,
            byte position);

    /**
     * [@function] CTRunGetTypeID
     * <p>
     * Returns the CFType of the run object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTRunGetTypeID();

    /**
     * [@function] CTRunGetGlyphCount
     * <p>
     * Gets the glyph count for the run.
     *
     * @param run The run whose glyph count you wish to access.
     * @return The number of glyphs that the run contains. It is totally
     *         possible that this function could return a value of zero,
     *         indicating that there are no glyphs in this run.
     */
    @Generated
    @CFunction
    @NInt
    public static native long CTRunGetGlyphCount(CTRunRef run);

    /**
     * [@function] CTRunGetAttributes
     * <p>
     * Returns the attribute dictionary that was used to create the
     * glyph run.
     * <p>
     * This dictionary returned is either the same exact one that was
     * set as an attribute dictionary on the original attributed string
     * or a dictionary that has been manufactured by the layout engine.
     * Attribute dictionaries can be manufactured in the case of font
     * substitution or if they are missing critical attributes.
     *
     * @param run The run whose attributes you wish to access.
     * @return The attribute dictionary.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTRunGetAttributes(CTRunRef run);

    /**
     * [@function] CTRunGetStatus
     * <p>
     * Returns the run's status.
     * <p>
     * In addition to attributes, runs also have status that can be
     * used to expedite certain operations. Knowing the direction and
     * ordering of a run's glyphs can aid in string index analysis,
     * whereas knowing whether the positions reference the identity
     * text matrix can avoid expensive comparisons. Note that this
     * status is provided as a convenience, since this information is
     * not strictly necessary but can certainly be helpful.
     *
     * @param run The run whose status you wish to access.
     * @return The run's status.
     */
    @Generated
    @CFunction
    public static native int CTRunGetStatus(CTRunRef run);

    /**
     * [@function] CTRunGetGlyphsPtr
     * <p>
     * Returns a direct pointer for the glyph array stored in the run.
     * <p>
     * The glyph array will have a length equal to the value returned by
     * CTRunGetGlyphCount. The caller should be prepared for this
     * function to return NULL even if there are glyphs in the stream.
     * Should this function return NULL, the caller will need to
     * allocate their own buffer and call CTRunGetGlyphs to fetch the
     * glyphs.
     *
     * @param run The run whose glyphs you wish to access.
     * @return A valid pointer to an array of CGGlyph structures or NULL.
     */
    @Generated
    @CFunction
    public static native ConstCharPtr CTRunGetGlyphsPtr(CTRunRef run);

    /**
     * [@function] CTRunGetGlyphs
     * <p>
     * Copies a range of glyphs into user-provided buffer.
     *
     * @param run    The run whose glyphs you wish to copy.
     * @param range  The range of glyphs to be copied, with the entire range having a
     *               location of 0 and a length of CTRunGetGlyphCount. If the length
     *               of the range is set to 0, then the operation will continue from
     *               the range's start index to the end of the run.
     * @param buffer The buffer where the glyphs will be copied to. The buffer must be
     *               allocated to at least the value specified by the range's length.
     */
    @Generated
    @CFunction
    public static native void CTRunGetGlyphs(CTRunRef run, @ByValue CFRange range, CharPtr buffer);

    /**
     * [@function] CTRunGetPositionsPtr
     * <p>
     * Returns a direct pointer for the glyph position array stored in
     * the run.
     * <p>
     * The glyph positions in a run are relative to the origin of the
     * line containing the run. The position array will have a length
     * equal to the value returned by CTRunGetGlyphCount. The caller
     * should be prepared for this function to return NULL even if there
     * are glyphs in the stream. Should this function return NULL, the
     * caller will need to allocate their own buffer and call
     * CTRunGetPositions to fetch the positions.
     *
     * @param run The run whose positions you wish to access.
     * @return A valid pointer to an array of CGPoint structures or NULL.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CGPoint CTRunGetPositionsPtr(CTRunRef run);

    /**
     * [@function] CTRunGetPositions
     * <p>
     * Copies a range of glyph positions into a user-provided buffer.
     * <p>
     * The glyph positions in a run are relative to the origin of the
     * line containing the run.
     *
     * @param run    The run whose positions you wish to copy.
     * @param range  The range of glyph positions to be copied, with the entire range
     *               having a location of 0 and a length of CTRunGetGlyphCount. If the
     *               length of the range is set to 0, then the operation will continue
     *               from the range's start index to the end of the run.
     * @param buffer The buffer where the glyph positions will be copied to. The buffer
     *               must be allocated to at least the value specified by the range's
     *               length.
     */
    @Generated
    @CFunction
    public static native void CTRunGetPositions(CTRunRef run, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint buffer);

    /**
     * [@function] CTRunGetAdvancesPtr
     * <p>
     * Returns a direct pointer for the glyph advance array stored in
     * the run.
     * <p>
     * The advance array will have a length equal to the value returned
     * by CTRunGetGlyphCount. The caller should be prepared for this
     * function to return NULL even if there are glyphs in the stream.
     * Should this function return NULL, the caller will need to
     * allocate their own buffer and call CTRunGetAdvances to fetch the
     * advances. Note that advances alone are not sufficient for correctly
     * positioning glyphs in a line, as a run may have a non-identity
     * matrix or the initial glyph in a line may have a non-zero origin;
     * callers should consider using positions instead.
     *
     * @param run The run whose advances you wish to access.
     * @return A valid pointer to an array of CGSize structures or NULL.
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CGSize CTRunGetAdvancesPtr(CTRunRef run);

    /**
     * [@function] CTRunGetAdvances
     * <p>
     * Copies a range of glyph advances into a user-provided buffer.
     *
     * @param run    The run whose advances you wish to copy.
     * @param range  The range of glyph advances to be copied, with the entire range
     *               having a location of 0 and a length of CTRunGetGlyphCount. If the
     *               length of the range is set to 0, then the operation will continue
     *               from the range's start index to the end of the run.
     * @param buffer The buffer where the glyph advances will be copied to. The buffer
     *               must be allocated to at least the value specified by the range's
     *               length.
     */
    @Generated
    @CFunction
    public static native void CTRunGetAdvances(CTRunRef run, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize buffer);

    /**
     * [@function] CTRunGetStringIndicesPtr
     * <p>
     * Returns a direct pointer for the string indices stored in the run.
     * <p>
     * The indices are the character indices that originally spawned the
     * glyphs that make up the run. They can be used to map the glyphs in
     * the run back to the characters in the backing store. The string
     * indices array will have a length equal to the value returned by
     * CTRunGetGlyphCount. The caller should be prepared for this
     * function to return NULL even if there are glyphs in the stream.
     * Should this function return NULL, the caller will need to allocate
     * their own buffer and call CTRunGetStringIndices to fetch the
     * indices.
     *
     * @param run The run whose string indices you wish to access.
     * @return A valid pointer to an array of CFIndex structures or NULL.
     */
    @Generated
    @CFunction
    public static native ConstNIntPtr CTRunGetStringIndicesPtr(CTRunRef run);

    /**
     * [@function] CTRunGetStringIndices
     * <p>
     * Copies a range of string indices into a user-provided buffer.
     * <p>
     * The indices are the character indices that originally spawned the
     * glyphs that make up the run. They can be used to map the glyphs
     * in the run back to the characters in the backing store.
     *
     * @param run    The run whose string indices you wish to copy.
     * @param range  The range of string indices to be copied, with the entire range
     *               having a location of 0 and a length of CTRunGetGlyphCount. If the
     *               length of the range is set to 0, then the operation will continue
     *               from the range's start index to the end of the run.
     * @param buffer The buffer where the string indices will be copied to. The buffer
     *               must be allocated to at least the value specified by the range's
     *               length.
     */
    @Generated
    @CFunction
    public static native void CTRunGetStringIndices(CTRunRef run, @ByValue CFRange range, NIntPtr buffer);

    /**
     * [@function] CTRunGetStringRange
     * <p>
     * Gets the range of characters that originally spawned the glyphs
     * in the run.
     *
     * @param run The run whose string range you wish to access.
     * @return Returns the range of characters that originally spawned the
     *         glyphs. If run is invalid, this will return an empty range.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTRunGetStringRange(CTRunRef run);

    /**
     * [@function] CTRunGetTypographicBounds
     * <p>
     * Gets the typographic bounds of the run.
     *
     * @param run     The run that you want to calculate the typographic bounds for.
     * @param range   The range of glyphs to be measured, with the entire range having
     *                a location of 0 and a length of CTRunGetGlyphCount. If the length
     *                of the range is set to 0, then the operation will continue from
     *                the range's start index to the end of the run.
     * @param ascent  Upon return, this parameter will contain the ascent of the run.
     *                This may be set to NULL if not needed.
     * @param descent Upon return, this parameter will contain the descent of the run.
     *                This may be set to NULL if not needed.
     * @param leading Upon return, this parameter will contain the leading of the run.
     *                This may be set to NULL if not needed.
     * @return The typographic width of the run. If run or range is
     *         invalid, then this function will always return zero.
     */
    @Generated
    @CFunction
    public static native double CTRunGetTypographicBounds(CTRunRef run, @ByValue CFRange range, NFloatPtr ascent,
            NFloatPtr descent, NFloatPtr leading);

    /**
     * [@function] CTRunGetImageBounds
     * <p>
     * Calculates the image bounds for a glyph range.
     * <p>
     * The image bounds for a run is the union of all non-empty glyph
     * bounding rects, each positioned as it would be if drawn using
     * CTRunDraw using the current context (for clients linked against
     * macOS High Sierra or iOS 11 and later) or the text position of
     * the supplied context (for all others). Note that the result is
     * ideal and does not account for raster coverage due to rendering.
     * This function is purely a convenience for using glyphs as an
     * image and should not be used for typographic purposes.
     *
     * @param run     The run that you want to calculate the image bounds for.
     * @param context The context which the image bounds will be calculated for or NULL,
     *                in which case the bounds are relative to CGPointZero.
     * @param range   The range of glyphs to be measured, with the entire range having
     *                a location of 0 and a length of CTRunGetGlyphCount. If the length
     *                of the range is set to 0, then the operation will continue from
     *                the range's start index to the end of the run.
     * @return A rect that tightly encloses the paths of the run's glyphs. The
     *         rect origin will match the drawn position of the requested range;
     *         that is, it will be translated by the supplied context's text
     *         position and the positions of the individual glyphs. If the run
     *         or range is invalid, CGRectNull will be returned.
     * @see CTRunGetTypographicBounds
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTRunGetImageBounds(CTRunRef run, CGContextRef context, @ByValue CFRange range);

    /**
     * [@function] CTRunGetTextMatrix
     * <p>
     * Returns the text matrix needed to draw this run.
     * <p>
     * To properly draw the glyphs in a run, the fields 'tx' and 'ty' of
     * the CGAffineTransform returned by this function should be set to
     * the current text position.
     *
     * @param run The run object from which to get the text matrix.
     * @return A CGAffineTransform.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CTRunGetTextMatrix(CTRunRef run);

    /**
     * [@function] CTRunDraw
     * <p>
     * Draws a complete run or part of one.
     * <p>
     * This is a convenience call, since the run could also be drawn by
     * accessing its glyphs, positions, and text matrix. Unlike when
     * drawing the entire line containing the run with CTLineDraw, the
     * run's underline (if any) will not be drawn, since the underline's
     * appearance may depend on other runs in the line. This call may
     * leave the graphics context in any state and does not flush the
     * context after drawing. This call also expects a text matrix with
     * `y` values increasing from bottom to top; a flipped text matrix
     * may result in misplaced diacritics.
     *
     * @param run     The run that you want to draw.
     * @param context The context to draw the run to.
     * @param range   The range of glyphs to be drawn, with the entire range having a
     *                location of 0 and a length of CTRunGetGlyphCount. If the length
     *                of the range is set to 0, then the operation will continue from
     *                the range's start index to the end of the run.
     */
    @Generated
    @CFunction
    public static native void CTRunDraw(CTRunRef run, CGContextRef context, @ByValue CFRange range);

    /**
     * [@function] CTRunDelegateGetTypeID
     * <p>
     * Returns the CFType of CTRunDelegate objects.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTRunDelegateGetTypeID();

    /**
     * [@function] CTRunDelegateCreate
     * <p>
     * Creates an immutable instance of a run delegate.
     * <p>
     * This function creates an immutable instance of a run delegate
     * that can be used for reserving space in a line or for eliding the
     * glyphs for a range of text altogether.
     *
     * @param callbacks The callbacks for this run delegate.
     * @return If run delegate creation was successful, this function will
     *         return a valid reference to an immutable CTRunDelegate
     *         object. Otherwise, this function will return NULL.
     */
    @Generated
    @CFunction
    public static native CTRunDelegateRef CTRunDelegateCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") CTRunDelegateCallbacks callbacks,
            VoidPtr refCon);

    /**
     * [@function] CTRunDelegateGetRefCon
     * <p>
     * Returns a run delegate's refCon value.
     * <p>
     * This function returns the refCon value that a run delegate was
     * created with.
     *
     * @param runDelegate The run delegate to be queried.
     * @return The refCon value of the supplied run delegate.
     */
    @Generated
    @CFunction
    public static native VoidPtr CTRunDelegateGetRefCon(CTRunDelegateRef runDelegate);

    /**
     * [@function] CTTypesetterGetTypeID
     * <p>
     * Returns the CFType of the text tab object
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CTTextTabGetTypeID();

    /**
     * [@function] CTTextTabCreate
     * <p>
     * Creates and initializes a new text tab.
     *
     * @param alignment The tab's alignment. This is used to determine the position of
     *                  text inside the tab column. This parameter must be set to a valid
     *                  CTTextAlignment value or this function will return NULL.
     * @param location  The tab's ruler location, relative to the back margin.
     * @param options   Options to pass in when the tab is created. Currently, the only
     *                  option available is kCTTabColumnTerminatorsAttributeName. This
     *                  parameter is optional and can be set to NULL if not needed.
     * @return The new CTTextTab.
     */
    @Generated
    @CFunction
    public static native CTTextTabRef CTTextTabCreate(byte alignment, double location, CFDictionaryRef options);

    /**
     * [@function] CTTextTabGetAlignment
     * <p>
     * Returns the text alignment of the tab.
     *
     * @param tab The tab whose text alignment you wish to access.
     * @return The tab's text alignment value.
     */
    @Generated
    @CFunction
    public static native byte CTTextTabGetAlignment(CTTextTabRef tab);

    /**
     * [@function] CTTextTabGetLocation
     * <p>
     * Returns the tab's ruler location.
     *
     * @param tab The tab whose location you wish to access.
     * @return The tab's ruler location relative to the back margin.
     */
    @Generated
    @CFunction
    public static native double CTTextTabGetLocation(CTTextTabRef tab);

    /**
     * [@function] CTTextTabGetOptions
     * <p>
     * Returns the dictionary of attributes associated with the tab.
     *
     * @param tab The tab whose attributes you wish to access.
     * @return The dictionary of attributes associated with the tab or NULL if
     *         no dictionary is present.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CTTextTabGetOptions(CTTextTabRef tab);

    /**
     * [@function] CTGetCoreTextVersion
     * <p>
     * Returns the version of the CoreText framework.
     * <p>
     * This function returns a number indicating the version of the
     * CoreText framework. Note that framework version is not always
     * an accurate indicator of feature availability. The recommended
     * way to use this function is first to check that the function
     * pointer is non-NULL, followed by calling it and comparing its
     * result to a defined constant (or constants). For example, to
     * determine whether the CoreText API is available:
     * if (&CTGetCoreTextVersion != NULL && CTGetCoreTextVersion() >= kCTVersionNumber10_5) {
     * // CoreText API is available
     * }
     *
     * @return The version number. This value is for comparison with the
     *         constants beginning with kCTVersionNumber and will not exceed
     *         kCTVersionNumber11_0.
     */
    @Generated
    @CFunction
    public static native int CTGetCoreTextVersion();

    /**
     * [@defined] kCTFontSymbolicTrait
     * <p>
     * Dictionary key to access the symbolic traits value.
     * <p>
     * Use this key to access the symbolic traits value from the font traits dictionary. The value is returned as a
     * CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSymbolicTrait();

    /**
     * [@defined] kCTFontWeightTrait
     * <p>
     * Dictionary key to access the weight trait value.
     * <p>
     * Use this key to access the normalized weight trait from the font traits dictionary. The value returned is a
     * CFNumberRef representing a float value between -1.0 and 1.0 for normalized weight. The value of 0.0 corresponds
     * to the regular or medium font weight.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontWeightTrait();

    /**
     * [@defined] kCTFontWidthTrait
     * <p>
     * Dictionary key to access the width (condense/expand) trait value.
     * <p>
     * Use this key to access the normalized proportion trait from the font traits dictionary. This value corresponds to
     * the relative inter-glyph spacing for a given font. The value returned is a CFNumberRef representing a float
     * between -1.0 and 1.0. The value of 0.0 corresponds to regular glyph spacing while negative values represent
     * condensed glyph spacing.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontWidthTrait();

    /**
     * [@defined] kCTFontSlantTrait
     * <p>
     * Dictionary key to access the slant trait value.
     * <p>
     * Use this key to access the normalized slant angle from the font traits dictionary. The value returned is a
     * CFNumberRef representing a float value between -1.0 and 1.0 for normalized slant angle. The value or 0.0
     * corresponds to 0 degree clockwise rotation from the vertical and 1.0 corresponds to 30 degrees clockwise
     * rotation.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSlantTrait();

    /**
     * [@defined] kCTFontURLAttribute
     * <p>
     * The font URL.
     * <p>
     * This is the key for accessing the font URL from the font descriptor. The value associated with this key is a
     * CFURLRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontURLAttribute();

    /**
     * [@defined] kCTFontNameAttribute
     * <p>
     * The PostScript name.
     * <p>
     * This is the key for retrieving the PostScript name from the font descriptor. When matching, this is treated more
     * generically: the system first tries to find fonts with this PostScript name. If none is found, the system tries
     * to find fonts with this family name, and, finally, if still nothing, tries to find fonts with this display name.
     * The value associated with this key is a CFStringRef. If unspecified, defaults to "Helvetica", if unavailable
     * falls back to global font cascade list.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontNameAttribute();

    /**
     * [@defined] kCTFontDisplayNameAttribute
     * <p>
     * The display name.
     * <p>
     * This is the key for accessing the name used to display the font. Most commonly this is the full name. The value
     * associated with this key is a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDisplayNameAttribute();

    /**
     * [@defined] kCTFontFamilyNameAttribute
     * <p>
     * The family name.
     * <p>
     * This is the key for accessing the family name from the font descriptor. The value associated with this key is a
     * CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFamilyNameAttribute();

    /**
     * [@defined] kCTFontStyleNameAttribute
     * <p>
     * The style name.
     * <p>
     * This is the key for accessing the style name of the font. This name represents the designer's description of the
     * font's style. The value associated with this key is a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontStyleNameAttribute();

    /**
     * [@defined] kCTFontTraitsAttribute
     * <p>
     * The font traits dictionary.
     * <p>
     * This is the key for accessing the dictionary of font traits for stylistic information. See CTFontTraits.h for the
     * list of font traits. The value associated with this key is a CFDictionaryRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontTraitsAttribute();

    /**
     * [@defined] kCTFontVariationAttribute
     * <p>
     * The font variation dictionary.
     * <p>
     * This key is used to obtain the font variation instance as a CFDictionaryRef. If specified in a font descriptor,
     * fonts with the specified axes will be primary match candidates, if no such fonts exist, this attribute will be
     * ignored.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAttribute();

    /**
     * [@defined] kCTFontSizeAttribute
     * <p>
     * The font point size.
     * <p>
     * This key is used to obtain or specify the font point size. Creating a font with this unspecified will default to
     * a point size of 12.0. The value for this key is represented as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSizeAttribute();

    /**
     * [@defined] kCTFontMatrixAttribute
     * <p>
     * The font transformation matrix.
     * <p>
     * This key is used to specify the font transformation matrix when creating a font. The default value is
     * CGAffineTransformIdentity. The value for this key is a CFDataRef containing a CGAffineTransform, of which only
     * the a, b, c, and d fields are used.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontMatrixAttribute();

    /**
     * [@defined] kCTFontCascadeListAttribute
     * <p>
     * The font cascade list.
     * <p>
     * This key is used to specify or obtain the cascade list used for a font reference. The cascade list is a
     * CFArrayRef containing CTFontDescriptorRefs. If unspecified, the global cascade list is used. This list is not
     * consulted for private-use characters on OS X 10.10, iOS 8, or earlier.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCascadeListAttribute();

    /**
     * [@defined] kCTFontCharacterSetAttribute
     * <p>
     * The font Unicode character coverage set.
     * <p>
     * The value for this key is a CFCharacterSetRef. Creating a font with this attribute will restrict the font to a
     * subset of its actual character set.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCharacterSetAttribute();

    /**
     * [@defined] kCTFontLanguagesAttribute
     * <p>
     * The list of supported languages.
     * <p>
     * The value for this key is a CFArrayRef of CFStringRef language identifiers conforming to UTS #35. It can be
     * requested from any font. If present in a descriptor used for matching, only fonts supporting the specified
     * languages will be returned.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLanguagesAttribute();

    /**
     * [@defined] kCTFontBaselineAdjustAttribute
     * <p>
     * The baseline adjustment to apply to font metrics.
     * <p>
     * The value for this key is a floating-point CFNumberRef. This is primarily used when defining font descriptors for
     * a cascade list to keep the baseline of all fonts even.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontBaselineAdjustAttribute();

    /**
     * [@defined] kCTFontMacintoshEncodingsAttribute
     * <p>
     * The Macintosh encodings (legacy script codes).
     * <p>
     * The value associated with this key is a CFNumberRef containing a bitfield of the script codes in
     * <CoreText/SFNTTypes.h>; bit 0 corresponds to kFontRomanScript, and so on. This attribute is provided for legacy
     * compatibility.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontMacintoshEncodingsAttribute();

    /**
     * [@defined] kCTFontFeaturesAttribute
     * <p>
     * The array of font features.
     * <p>
     * This key is used to specify or obtain the font features for a font reference. The value associated with this key
     * is a CFArrayRef of font feature dictionaries. This features list contains the feature information from the 'feat'
     * table of the font. See the CTFontCopyFeatures() API in CTFont.h.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeaturesAttribute();

    /**
     * [@defined] kCTFontFeatureSettingsAttribute
     * <p>
     * The array of typographic feature settings.
     * <p>
     * This key is used to specify an array of zero or more feature settings. Each setting dictionary indicates which
     * setting should be applied. In the case of duplicate or conflicting settings the last setting in the list will
     * take precedence. In the case of AAT settings, it is the caller's responsibility to handle exclusive and
     * non-exclusive settings as necessary.
     * An AAT setting dictionary contains a tuple of a kCTFontFeatureTypeIdentifierKey key-value pair and a
     * kCTFontFeatureSelectorIdentifierKey key-value pair.
     * An OpenType setting dictionary contains a tuple of a kCTFontOpenTypeFeatureTag key-value pair and a
     * kCTFontOpenTypeFeatureValue key-value pair.
     * <p>
     * Starting with OS X 10.10 and iOS 8.0, settings are also accepted (but not returned) in the following simplified
     * forms:
     * An OpenType setting can be either an array pair of tag string and value number, or a tag string on its own. For
     * example: @[ @"c2sc", @1 ] or simply @"c2sc". An unspecified value enables the feature and a value of zero
     * disables it.
     * An AAT setting can be specified as an array pair of type and selector numbers. For
     * example: @[ @(kUpperCaseType), @(kUpperCaseSmallCapsSelector) ].
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSettingsAttribute();

    /**
     * [@defined] kCTFontFixedAdvanceAttribute
     * <p>
     * Specifies advance width.
     * <p>
     * This key is used to specify a constant advance width, which affects the glyph metrics of any font instance
     * created with this key; it overrides font values and the font transformation matrix, if any. The value associated
     * with this key must be a CFNumberRef.
     * <p>
     * Starting with macOS 10.14 and iOS 12.0, this only affects glyph advances that have non-zero width when this
     * attribute is not present.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFixedAdvanceAttribute();

    /**
     * [@defined] kCTFontOrientationAttribute
     * <p>
     * The orientation attribute.
     * <p>
     * This key is used to specify a particular orientation for the glyphs of the font. The value associated with this
     * key is a int as a CFNumberRef. If you want to receive vertical metrics from a font for vertical rendering,
     * specify kCTFontVerticalOrientation. If unspecified, the font will use its native orientation.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOrientationAttribute();

    /**
     * [@defined] kCTFontFormatAttribute
     * <p>
     * Specifies the recognized format of the font.
     * <p>
     * The attribute is used to specify or obtain the format of the font. The returned value is a CFNumber containing
     * one of the constants defined below.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFormatAttribute();

    /**
     * [@defined] kCTFontRegistrationScopeAttribute
     * <p>
     * Specifies the font descriptor's registration scope.
     * <p>
     * The attribute is used to specify or obtain the font registration scope. The value returned is a CFNumberRef
     * containing one of the CTFontManagerScope enumerated values. A value of NULL can be returned for font descriptors
     * that are not registered.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontRegistrationScopeAttribute();

    /**
     * [@defined] kCTFontPriorityAttribute
     * <p>
     * The font descriptors priority when resolving duplicates and sorting match results.
     * <p>
     * This key is used to obtain or specify the font priority. The value returned is a CFNumberRef containing an
     * integer value as defined below. The higher the value, the higher the priority of the font. Only registered fonts
     * will have a priority. Unregistered font descriptors will return NULL.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPriorityAttribute();

    /**
     * [@defined] kCTFontEnabledAttribute
     * <p>
     * The font enabled state.
     * <p>
     * The value associated with this key is a CFBoolean. Unregistered font descriptors will return NULL, which is
     * equivalent to false.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontEnabledAttribute();

    /**
     * [@defined] kCTFontDownloadableAttribute
     * <p>
     * The font downloadable state.
     * <p>
     * The value associated with this key is a CFBoolean. If it is true, CoreText attempts to download a font if
     * necessary when matching a descriptor.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDownloadableAttribute();

    /**
     * [@defined] kCTFontDownloadedAttribute
     * <p>
     * The download state.
     * <p>
     * The value associated with this key is a CFBoolean. If it is true, corresponding FontAsset has been downloaded.
     * (but still it may be necessary to call appropriate API in order to use the font in the FontAsset.)
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDownloadedAttribute();

    /**
     * CTFontDescriptorRef; The current font descriptor. Valid when state is kCTFontDescriptorMatchingDidMatch.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingSourceDescriptor();

    /**
     * CFArray; Array of descriptors to be queried. Valid while downloading or when state is
     * kCTFontDescriptorMatchingWillBeginQuerying.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingDescriptors();

    /**
     * CFArray; Array of matched font descriptors. Valid when state is kCTFontDescriptorMatchingDidMatch or
     * CTFontDescriptorMatchingEnd.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingResult();

    /**
     * CFNumber; Download progress in 0 - 100. Valid during Downloading state.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingPercentage();

    /**
     * CFNumber; Byte size to download for the current descriptor. Valid during Downloading state.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingCurrentAssetSize();

    /**
     * CFNumber; Total downloaded byte size. Valid during Downloading state.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingTotalDownloadedSize();

    /**
     * CFNumber; Total byte size to download. Always valid, but may be Zero when information is not available.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingTotalAssetSize();

    /**
     * CFError; Valid when state kCTFontDescriptorMatchingDidFailWithError.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingError();

    /**
     * Name specifier constants
     * [@defined] kCTFontCopyrightNameKey
     * <p>
     * The name specifier for the copyright name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCopyrightNameKey();

    /**
     * [@defined] kCTFontFamilyNameKey
     * <p>
     * The name specifier for the family name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFamilyNameKey();

    /**
     * [@defined] kCTFontSubFamilyNameKey
     * <p>
     * The name specifier for the subfamily name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSubFamilyNameKey();

    /**
     * [@defined] kCTFontStyleNameKey
     * <p>
     * The name specifier for the style name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontStyleNameKey();

    /**
     * [@defined] kCTFontUniqueNameKey
     * <p>
     * The name specifier for the unique name.
     * <p>
     * Note that this name is often not unique and should not be
     * assumed to be truly unique.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontUniqueNameKey();

    /**
     * [@defined] kCTFontFullNameKey
     * <p>
     * The name specifier for the full name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFullNameKey();

    /**
     * [@defined] kCTFontVersionNameKey
     * <p>
     * The name specifier for the version name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVersionNameKey();

    /**
     * [@defined] kCTFontPostScriptNameKey
     * <p>
     * The name specifier for the PostScript name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPostScriptNameKey();

    /**
     * [@defined] kCTFontTrademarkNameKey
     * <p>
     * The name specifier for the trademark name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontTrademarkNameKey();

    /**
     * [@defined] kCTFontManufacturerNameKey
     * <p>
     * The name specifier for the manufacturer name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManufacturerNameKey();

    /**
     * [@defined] kCTFontDesignerNameKey
     * <p>
     * The name specifier for the designer name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDesignerNameKey();

    /**
     * [@defined] kCTFontDescriptionNameKey
     * <p>
     * The name specifier for the description name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptionNameKey();

    /**
     * [@defined] kCTFontVendorURLNameKey
     * <p>
     * The name specifier for the vendor url name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVendorURLNameKey();

    /**
     * [@defined] kCTFontDesignerURLNameKey
     * <p>
     * The name specifier for the designer url name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDesignerURLNameKey();

    /**
     * [@defined] kCTFontLicenseNameKey
     * <p>
     * The name specifier for the license name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLicenseNameKey();

    /**
     * [@defined] kCTFontLicenseURLNameKey
     * <p>
     * The name specifier for the license url name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLicenseURLNameKey();

    /**
     * [@defined] kCTFontSampleTextNameKey
     * <p>
     * The name specifier for the sample text name string.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSampleTextNameKey();

    /**
     * [@defined] kCTFontPostScriptCIDNameKey
     * <p>
     * The name specifier for the PostScript CID name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPostScriptCIDNameKey();

    /**
     * [@defined] kCTFontVariationAxisIdentifierKey
     * <p>
     * Key to get the variation axis identifier.
     * <p>
     * This key is used with a variation axis dictionary to get the axis identifier value as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisIdentifierKey();

    /**
     * [@defined] kCTFontVariationAxisMinimumValueKey
     * <p>
     * Key to get the variation axis minimum value.
     * <p>
     * This key is used with a variation axis dictionary to get the minimum axis value as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisMinimumValueKey();

    /**
     * [@defined] kCTFontVariationAxisMaximumValueKey
     * <p>
     * Key to get the variation axis maximum value.
     * <p>
     * This key is used with a variation axis dictionary to get the maximum axis value as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisMaximumValueKey();

    /**
     * [@defined] kCTFontVariationAxisDefaultValueKey
     * <p>
     * Key to get the variation axis default value.
     * <p>
     * This key is used with a variation axis dictionary to get the default axis value as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisDefaultValueKey();

    /**
     * [@defined] kCTFontVariationAxisNameKey
     * <p>
     * Key to get the variation axis name string.
     * <p>
     * This key is used with a variation axis dictionary to get the localized variation axis name.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisNameKey();

    /**
     * [@defined] kCTFontOpenTypeFeatureTag
     * <p>
     * Key to get the OpenType feature tag.
     * <p>
     * This key can be used with a font feature dictionary to get the tag as a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpenTypeFeatureTag();

    /**
     * [@defined] kCTFontOpenTypeFeatureValue
     * <p>
     * Key to get the OpenType feature value.
     * <p>
     * This key can be used with a font feature dictionary to get the value as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpenTypeFeatureValue();

    /**
     * [@defined] kCTFontFeatureTypeIdentifierKey
     * <p>
     * Key to get the font feature type value.
     * <p>
     * This key can be used with a font feature dictionary to get the type identifier as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeIdentifierKey();

    /**
     * [@defined] kCTFontFeatureTypeNameKey
     * <p>
     * Key to get the font feature name.
     * <p>
     * This key can be used with a font feature dictionary to get the localized type name string as a CFString.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeNameKey();

    /**
     * [@defined] kCTFontFeatureTypeExclusiveKey
     * <p>
     * Key to get the font feature exclusive setting.
     * <p>
     * This key can be used with a font feature dictionary to get the the exclusive setting of the feature as a
     * CFBoolean. The value associated with this key indicates whether the feature selectors associated with this type
     * should be mutually exclusive.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeExclusiveKey();

    /**
     * [@defined] kCTFontFeatureTypeSelectorsKey
     * <p>
     * Key to get the font feature selectors.
     * <p>
     * This key can be used with a font feature dictionary to get the array of font feature selectors as a CFArrayRef.
     * This is an array of selector dictionaries that contain the values for the following selector keys.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeSelectorsKey();

    /**
     * [@defined] kCTFontFeatureSelectorIdentifierKey
     * <p>
     * Key to get the font feature selector identifier.
     * <p>
     * This key can be used with a selector dictionary corresponding to a feature type to obtain the selector identifier
     * value as a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorIdentifierKey();

    /**
     * [@defined] kCTFontFeatureSelectorNameKey
     * <p>
     * Key to get the font feature selector name.
     * <p>
     * This key is used with a selector dictionary to get the localized name string for the selector as a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorNameKey();

    /**
     * [@defined] kCTFontFeatureSelectorDefaultKey
     * <p>
     * Key to get the font feature selector default setting value.
     * <p>
     * This key is used with a selector dictionary to get the default indicator for the selector. This value is a
     * CFBooleanRef which if present and true indicates that this selector is the default setting for the current
     * feature type.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorDefaultKey();

    /**
     * [@defined] kCTFontFeatureSelectorSettingKey
     * <p>
     * Key to get or specify the current feature setting.
     * <p>
     * This key is used with a selector dictionary to get or specify the current setting for the selector. This value is
     * a CFBooleanRef to indicate whether this selector is on or off. If this key is not present, the default setting is
     * used.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorSettingKey();

    /**
     * [@defined] kCTBaselineClassRoman
     * <p>
     * Key to reference the Roman baseline class.
     * <p>
     * This key can be used with a baseline info dictionary to offset to the Roman baseline as a CFNumberRef float. It
     * can also be used as the value for kCTBaselineClassAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassRoman();

    /**
     * [@defined] kCTBaselineClassIdeographicCentered
     * <p>
     * Key to reference the Ideographic Centered baseline class.
     * <p>
     * This key can be used with a baseline info dictionary to offset to the Ideographic Centered baseline as a
     * CFNumberRef float. It can also be used as the value for kCTBaselineClassAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicCentered();

    /**
     * [@defined] kCTBaselineClassIdeographicLow
     * <p>
     * Key to reference the Ideographic Low baseline class.
     * <p>
     * This key can be used with a baseline info dictionary to offset to the Ideographic Low baseline as a CFNumberRef
     * float. It can also be used as the value for kCTBaselineClassAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicLow();

    /**
     * [@defined] kCTBaselineClassIdeographicHigh
     * <p>
     * Key to reference the Ideographic High baseline class.
     * <p>
     * This key can be used with a baseline info dictionary to offset to the Ideographic High baseline as a CFNumberRef
     * float. It can also be used as the value for kCTBaselineClassAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicHigh();

    /**
     * [@defined] kCTBaselineClassHanging
     * <p>
     * Key to reference the Hanging baseline class.
     * <p>
     * This key can be used with a baseline info dictionary to offset to the Hanging baseline as a CFNumberRef float. It
     * can also be used as the value for kCTBaselineClassAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassHanging();

    /**
     * [@defined] kCTBaselineClassMath
     * <p>
     * Key to reference the Math baseline class.
     * <p>
     * This key can be used with a baseline info dictionary to offset to the Math baseline as a CFNumberRef float. It
     * can also be used as the value for kCTBaselineClassAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassMath();

    /**
     * [@defined] kCTBaselineReferenceFont
     * <p>
     * Key to reference a font for the reference baseline.
     * <p>
     * This key can be used to specify a font for the reference baseline. The value is a CTFontRef or the
     * kCTBaselineOriginalFont constant.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineReferenceFont();

    /**
     * [@defined] kCTBaselineOriginalFont
     * <p>
     * Use the original font for setting the reference baseline.
     * <p>
     * This constant can be used as the value for kCTBaselineReferenceFont to specify that the original font should be
     * used for the reference baseline.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineOriginalFont();

    /**
     * [@defined] kCTFontCollectionRemoveDuplicatesOption
     * <p>
     * Option key to specify filtering of duplicates.
     * <p>
     * Specify this option key in the options dictionary with a non- zero value to enable automatic filtering of
     * duplicate font descriptors.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCollectionRemoveDuplicatesOption();

    /**
     * [@const] kCTFontManagerErrorDomain
     * <p>
     * CFError domain for CTFontManager errors
     * <p>
     * CFErrors with this domain will have error codes corresponding to one of the CTFontManagerErrors above.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorDomain();

    /**
     * [@constant] kCTFontManagerErrorFontURLsKey
     * <p>
     * User info key to be used with CFError references returned from registration functions.
     * <p>
     * The value associated with this key in the user info dictionary of a CFError is a CFArray of font URLs that failed
     * with given error.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorFontURLsKey();

    /**
     * [@constant] kCTFontManagerRegisteredFontsChangedNotification
     * <p>
     * Notification name for font registry changes.
     * <p>
     * This is the string to use as the notification name when subscribing
     * to CTFontManager notifications. This notification will be posted when fonts are added or removed.
     * OS X clients should register as an observer of the notification with the distributed notification center
     * for changes in session or persistent scopes and with the local notification center for changes in process scope.
     * iOS clients should register as an observer of the notification with the local notification center for all
     * changes.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerRegisteredFontsChangedNotification();

    /**
     * [@const] kCTFrameProgressionAttributeName
     * <p>
     * Specifies progression for a frame.
     * <p>
     * Value must be a CFNumberRef containing a CTFrameProgression.
     * Default is kCTFrameProgressionTopToBottom. This value determines
     * the line stacking behavior for a frame and does not affect the
     * appearance of the glyphs within that frame.
     *
     * @see CTFramesetterCreateFrame
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFrameProgressionAttributeName();

    /**
     * [@const] kCTFramePathFillRuleAttributeName
     * <p>
     * Specifies fill rule for a frame if this attribute is used at top level of frameAttributes dictionary, or specify
     * fill rule for a clipping path if used in a dictionary contained in an array specified by
     * kCTFrameClippingPathsAttributeName.
     * <p>
     * Value must be a CFNumberRef containing kCTFramePathFillEvenOdd or kCTFramePathFillWindingNumber.
     * Default is kCTFramePathFillEvenOdd.
     *
     * @see CTFramesetterCreateFrame
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathFillRuleAttributeName();

    /**
     * [@const] kCTFramePathWidthAttributeName
     * <p>
     * Specifies frame width if this attribute is used at top level of frameAttributes dictionary, or specify
     * clipping path width if used in a dictionary contained in an array specified by
     * kCTFrameClippingPathsAttributeName.
     * <p>
     * Value must be a CFNumberRef specifying frame width.
     * Default is zero.
     *
     * @see CTFramesetterCreateFrame
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathWidthAttributeName();

    /**
     * [@const] kCTFrameClippingPathsAttributeName
     * <p>
     * Specifies array of paths to clip frame.
     * <p>
     * Value must be a CFArrayRef containing CFDictionaryRefs or CGPathRef. (CGPathRef is allowed on 10.8 or later.)
     * Each dictionary should have a kCTFramePathClippingPathAttributeName key-value pair, and can have a
     * kCTFramePathFillRuleAttributeName key-value pair
     * and kCTFramePathFillRuleAttributeName key-value pair as optional parameters. In case of CGPathRef, default fill
     * rule (kCTFramePathFillEvenOdd) and width (0.0) are used.
     *
     * @see CTFramesetterCreateFrame
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFrameClippingPathsAttributeName();

    /**
     * [@const] kCTFramePathClippingPathAttributeName
     * <p>
     * Specifies clipping path. This attribute is valid in a dictionary contained in an array specified by
     * kCTFrameClippingPathsAttributeName.
     * On 10.8 or later, This attribute is also valid in frameAttributes dictionary passed to CTFramesetterCreateFrame.
     * <p>
     * Value must be a CGPathRef specifying a clipping path.
     *
     * @see kCTFrameClippingPathsAttributeName
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathClippingPathAttributeName();

    /**
     * [@const] kCTTypesetterOptionDisableBidiProcessing
     * <p>
     * Disables bidi processing.
     * <p>
     * Value must be a CFBooleanRef. Default is false.
     * Normally, typesetting applies the Unicode Bidirectional
     * Algorithm as described in UAX #9. If a typesetter is created
     * with this option set to true, no directional reordering is
     * performed and any directional control characters are ignored.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionDisableBidiProcessing();

    /**
     * [@const] kCTTypesetterOptionForcedEmbeddingLevel
     * <p>
     * Specifies the embedding level.
     * <p>
     * Value must be a CFNumberRef. Default is unset. Normally,
     * typesetting applies the Unicode Bidirectional Algorithm as
     * described in UAX #9. If present, this specifies the embedding
     * level and any directional control characters are ignored.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionForcedEmbeddingLevel();

    /**
     * [@const] kCTRubyAnnotationSizeFactorAttributeName
     * <p>
     * Specifies the size of the annotation text as a percent of the size of the base text.
     * <p>
     * Value must be a CFNumberRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTRubyAnnotationSizeFactorAttributeName();

    /**
     * [@const] kCTRubyAnnotationScaleToFitAttributeName
     * <p>
     * Treat the size specified in kCTRubyAnnotationSizeFactorAttributeName as the maximum
     * scale factor, when the base text size is smaller than annotation text size, we will
     * try to scale the annotation font size down so that it will fit the base text without
     * overhang or adding extra padding between base text.
     * <p>
     * Value must be a CFBooleanRef. Default is false.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTRubyAnnotationScaleToFitAttributeName();

    /**
     * [@const] kCTFontAttributeName
     * <p>
     * The font.
     * <p>
     * Value must be a CTFontRef. Default is Helvetica 12.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontAttributeName();

    /**
     * [@const] kCTForegroundColorFromContextAttributeName
     * <p>
     * Never set a foreground color in the CGContext; use what is set as
     * the context's fill color.
     * <p>
     * Value must be a CFBooleanRef. Default is false. The reason
     * why this exists is because an NSAttributedString defaults to a
     * black color if no color attribute is set. This forces CoreText to
     * set the color in the context. This will allow developers to
     * sidestep this, making CoreText set nothing but font information
     * in the CGContext. If set, this attribute also determines the
     * color used by kCTUnderlineStyleAttributeName, in which case it
     * overrides the foreground color.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTForegroundColorFromContextAttributeName();

    /**
     * [@const] kCTKernAttributeName
     * <p>
     * A kerning adjustment.
     * <p>
     * Value must be a CFNumberRef float. Default is standard kerning.
     * The kerning attribute indicate how many points the following
     * character should be shifted from its default offset as defined
     * by the current character's font in points; a positive kern
     * indicates a shift farther along and a negative kern indicates a
     * shift closer to the current character. If this attribute is not
     * present, standard kerning will be used. If this attribute is
     * set to 0.0, no kerning will be done at all.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTKernAttributeName();

    /**
     * [@const] kCTLigatureAttributeName
     * <p>
     * Controls ligature formation.
     * <p>
     * Value must be a CFNumberRef. Default is int value 1. The ligature
     * attribute determines what kinds of ligatures should be used when
     * displaying the string. A value of 0 indicates that only ligatures
     * essential for proper rendering of text should be used, 1
     * indicates that standard ligatures should be used, and 2 indicates
     * that all available ligatures should be used. Which ligatures are
     * standard depends on the script and possibly the font. Arabic
     * text, for example, requires ligatures for many character
     * sequences, but has a rich set of additional ligatures that
     * combine characters. English text has no essential ligatures, and
     * typically has only two standard ligatures, those for "fi" and
     * "fl" -- all others being considered more advanced or fancy.
     * <p>
     * On iOS releases prior to 6.0 essential ligatures are applied
     * if the font contains glyphs for any of U+FB00 through U+FB04 and
     * the font lacks AAT or OpenType shaping tables, but as of 6.0
     * shaping tables (or the lack thereof) are treated as definitive.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTLigatureAttributeName();

    /**
     * [@const] kCTForegroundColorAttributeName
     * <p>
     * The foreground color.
     * <p>
     * Value must be a CGColorRef. Default value is black.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTForegroundColorAttributeName();

    /**
     * [@const] kCTBackgroundColorAttributeName
     * <p>
     * The background color.
     * <p>
     * Value must be a CGColorRef. Default is no background color.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBackgroundColorAttributeName();

    /**
     * [@const] kCTParagraphStyleAttributeName
     * <p>
     * A CTParagraphStyle object which is used to specify things like
     * line alignment, tab rulers, writing direction, etc.
     * <p>
     * Value must be a CTParagraphStyleRef. Default is an empty
     * CTParagraphStyle object: see CTParagraphStyle.h for more
     * information. The value of this attribute must be uniform over
     * the range of any paragraphs to which it is applied.
     *
     * @see CFStringGetParagraphBounds
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTParagraphStyleAttributeName();

    /**
     * [@const] kCTStrokeWidthAttributeName
     * <p>
     * The stroke width.
     * <p>
     * Value must be a CFNumberRef. Default value is 0.0, or no stroke.
     * This attribute, interpreted as a percentage of font point size,
     * controls the text drawing mode: positive values effect drawing
     * with stroke only; negative values are for stroke and fill. A
     * typical value for outlined text is 3.0.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTStrokeWidthAttributeName();

    /**
     * [@const] kCTStrokeColorAttributeName
     * <p>
     * The stroke color.
     * <p>
     * Value must be a CGColorRef. Default is the foreground color.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTStrokeColorAttributeName();

    /**
     * [@const] kCTUnderlineStyleAttributeName
     * <p>
     * Allows the setting of an underline to be applied at render
     * time.
     * <p>
     * Value must be a CFNumberRef. Default is kCTUnderlineStyleNone.
     * Set a value of something other than kCTUnderlineStyleNone to draw
     * an underline. In addition, the CTUnderlineStyleModifiers can be
     * used to modify the look of the underline. The underline color
     * will be determined by the text's foreground color unless
     * otherwise specified by kCTUnderlineColorAttributeName.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTUnderlineStyleAttributeName();

    /**
     * [@const] kCTSuperscriptAttributeName
     * <p>
     * Controls vertical text positioning.
     * <p>
     * Value must be a CFNumberRef. Default is int value 0. If supported
     * by the specified font, a value of 1 enables superscripting and a
     * value of -1 enables subscripting.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTSuperscriptAttributeName();

    /**
     * [@const] kCTUnderlineColorAttributeName
     * <p>
     * The underline color.
     * <p>
     * Value must be a CGColorRef. Default is the foreground color.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTUnderlineColorAttributeName();

    /**
     * [@const] kCTVerticalFormsAttributeName
     * <p>
     * Controls glyph orientation.
     * <p>
     * Value must be a CFBooleanRef. Default is false. A value of false
     * indicates that horizontal glyph forms are to be used, true
     * indicates that vertical glyph forms are to be used.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTVerticalFormsAttributeName();

    /**
     * [@const] kCTHorizontalInVerticalFormsAttributeName
     * <p>
     * Setting text in tate-chu-yoko form (horizontal numerals in vertical text).
     * <p>
     * Value must be a CFNumberRef. Default is int value 0. A value of 1
     * to 4 indicates the number of digits or letters to set in horizontal
     * form. This is to apply the correct feature settings for the text.
     * This attribute only works when kCTVerticalFormsAttributeName is set
     * to true.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTHorizontalInVerticalFormsAttributeName();

    /**
     * [@const] kCTGlyphInfoAttributeName
     * <p>
     * Allows the use of unencoded glyphs.
     * <p>
     * Value must be a CTGlyphInfoRef. The glyph specified by this
     * CTGlyphInfo object is assigned to the entire attribute range,
     * provided that its contents match the specified base string and
     * that the specified glyph is available in the font specified by
     * kCTFontAttributeName. See CTGlyphInfo.h for more information.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTGlyphInfoAttributeName();

    /**
     * [@const] kCTCharacterShapeAttributeName
     * <p>
     * Controls glyph selection.
     * <p>
     * Value must be a CFNumberRef. Default is value is 0 (disabled).
     * A non-zero value is interpreted as an SFNT kCharacterShapeType
     * selector + 1; see SFNTLayoutTypes.h for selectors. For example,
     * an attribute value of 1 corresponds to kTraditionalCharactersSelector.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCTCharacterShapeAttributeName();

    /**
     * [@const] kCTLanguageAttributeName
     * <p>
     * Specifies text language.
     * <p>
     * Value must be a CFStringRef containing a locale identifier. Default
     * is unset. When this attribute is set to a valid identifier, it will
     * be used to select localized glyphs (if supported by the font) and
     * locale-specific line breaking rules.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTLanguageAttributeName();

    /**
     * [@const] kCTRunDelegateAttributeName
     * <p>
     * Allows customization of certain aspects of a range of text's
     * appearance.
     * <p>
     * Value must be a CTRunDelegateRef. The values returned by the
     * embedded object for an attribute range apply to each glyph
     * resulting from the text in that range. Because an embedded object
     * is only a display-time modification, care should be taken to
     * avoid applying this attribute to a range of text with complex
     * behavior, such as a change of writing direction, combining marks,
     * etc. Consequently, it is recommended that this attribute be
     * applied to a range containing the single character U+FFFC. See
     * CTRunDelegate.h for more information.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTRunDelegateAttributeName();

    /**
     * [@const] kCTBaselineClassAttributeName
     * <p>
     * Key to reference a baseline class override.
     * <p>
     * Value must be one of the kCTBaselineClass constants. Normally,
     * glyphs on the line will be assigned baseline classes according to
     * the 'bsln' or 'BASE' table in the font. This attribute may be
     * used to change this assignment.
     *
     * @see kCTBaselineClassRoman
     * @see kCTBaselineClassIdeographicCentered
     * @see kCTBaselineClassIdeographicLow
     * @see kCTBaselineClassIdeographicHigh
     * @see kCTBaselineClassHanging
     * @see kCTBaselineClassMath
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassAttributeName();

    /**
     * [@const] kCTBaselineInfoAttributeName
     * <p>
     * Key to reference a baseline info dictionary.
     * <p>
     * Value must be a CFDictionaryRef. Normally, baseline offsets will
     * be assigned based on the 'bsln' or 'BASE' table in the font. This
     * attribute may be used to assign different offsets. Each key in
     * the dictionary is one of the kCTBaselineClass constants and the
     * value is a CFNumberRef of the baseline offset in points. You only
     * need to specify the offsets you wish to change.
     *
     * @see kCTBaselineClassRoman
     * @see kCTBaselineClassIdeographicCentered
     * @see kCTBaselineClassIdeographicLow
     * @see kCTBaselineClassIdeographicHigh
     * @see kCTBaselineClassHanging
     * @see kCTBaselineClassMath
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineInfoAttributeName();

    /**
     * [@const] kCTBaselineReferenceInfoAttributeName
     * <p>
     * Key to reference a baseline info dictionary for the reference baseline.
     * <p>
     * Value must be a CFDictionaryRef. All glyphs in a run are assigned
     * a baseline class and then aligned to the offset for that class in
     * the reference baseline baseline info. See the discussion of
     * kCTBaselineInfoAttributeName for information about the contents
     * of the dictionary. You can also use the kCTBaselineReferenceFont
     * key to specify that the baseline offsets of a particular
     * CTFontRef should be used as the reference offsets.
     *
     * @see kCTBaselineClassRoman
     * @see kCTBaselineClassIdeographicCentered
     * @see kCTBaselineClassIdeographicLow
     * @see kCTBaselineClassIdeographicHigh
     * @see kCTBaselineClassHanging
     * @see kCTBaselineClassMath
     * @see kCTBaselineReferenceFont
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineReferenceInfoAttributeName();

    /**
     * [@const] kCTWritingDirectionAttributeName
     * <p>
     * Specifies a bidirectional override or embedding.
     * <p>
     * Value must be a CFArray of CFNumberRefs, each of which should
     * have a value of either kCTWritingDirectionLeftToRight or
     * kCTWritingDirectionRightToLeft, plus one of
     * kCTWritingDirectionEmbedding or kCTWritingDirectionOverride.
     * This array represents a sequence of nested bidirectional
     * embeddings or overrides, in order from outermost to innermost,
     * with (kCTWritingDirectionLeftToRight | kCTWritingDirectionEmbedding)
     * corresponding to a LRE/PDF pair in plain text or
     * <span dir="ltr"></span> in HTML, (kCTWritingDirectionRightToLeft
     * | kCTWritingDirectionEmbedding) corresponding to a RLE/PDF
     * pair in plain text or a <span dir="rtl"></span> in HTML,
     * (kCTWritingDirectionLeftToRight | kCTWritingDirectionOverride)
     * corresponding to a LRO/PDF pair in plain text or
     * <bdo dir="ltr"></bdo> in HTML, and (kCTWritingDirectionRightToLeft
     * | kCTWritingDirectionOverride) corresponding to a RLO/PDF
     * pair in plain text or <bdo dir="rtl"></bdo> in HTML.
     *
     * @see kCTWritingDirectionLeftToRight
     * @see kCTWritingDirectionRightToLeft
     * @see kCTWritingDirectionEmbedding
     * @see kCTWritingDirectionOverride
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTWritingDirectionAttributeName();

    /**
     * [@const] kCTRubyAnnotationAttributeName
     * <p>
     * Key to reference a CTRubyAnnotation.
     * <p>
     * Value must be a CTRubyAnnotationRef. See CTRubyAnnotation.h for
     * more information.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTRubyAnnotationAttributeName();

    /**
     * [@const] kCTTabColumnTerminatorsAttributeName
     * <p>
     * Used to specify the terminating character for a tab column
     * <p>
     * The value associated with this attribute is a CFCharacterSet. The
     * character set is used to determine the terminating character for
     * a tab column. The tab and newline characters are implied even if
     * they don't exist in the character set. This attribute can be used
     * to implement decimal tabs, for instance. This attribute is
     * optional.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTTabColumnTerminatorsAttributeName();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler {
        @Generated
        boolean call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler(int state,
                CFDictionaryRef progressParameter);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback {
        @Generated
        @NInt
        long call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(CTFontDescriptorRef arg0,
                CTFontDescriptorRef arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTLineEnumerateCaretOffsets {
        @Generated
        void call_CTLineEnumerateCaretOffsets(double arg0, @NInt long arg1, boolean arg2, BoolPtr arg3);
    }

    /**
     * [@defined] kCTFontVariationAxisHiddenKey
     * <p>
     * Key to get the hidden axis flag.
     * <p>
     * This key contains a CFBoolean value that is true when the font designer recommends the axis not be exposed
     * directly to end users in application interfaces.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisHiddenKey();

    /**
     * [@const] kCTBaselineOffsetAttributeName
     * <p>
     * Controls vertical text positioning.
     * <p>
     * Value must be a CFNumberRef float. Default is standard positioning.
     * The baseline attribute indicates how many points the characters
     * should be shifted perpendicular to their baseline. A positive
     * baseline value indicates a shift above (or to the right for vertical
     * text) the text baseline and a negative baseline value indicates a
     * shift below (or to the left for vertical text) the text baseline.
     * If this value is set to 0.0, no baseline shift will be performed.
     *
     * @see NSBaselineOffsetAttributeName
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineOffsetAttributeName();

    /**
     * [@function] CTFontCreateForStringWithLanguage
     * <p>
     * Returns a new font reference that can best map the given string range based on the current font and language
     * specified.
     * <p>
     * The current font itself can be returned if it covers the string provided.
     *
     * @param currentFont The current font that contains a valid cascade list.
     * @param string      A unicode string containing characters that cannot be encoded by the current font.
     * @param range       A CFRange specifying the range of the string that needs to be mapped.
     * @param language    Language identifier to select a font for a particular localization. If unspecified, the
     *                    current system language is used. The format of the language identifier should conform to UTS
     *                    #35.
     * @return This function returns the best substitute font that can encode the specified string range.
     * @see CTFontCopyCharacterSet
     * @see CTFontGetGlyphsForCharacters
     * @see kCTFontCascadeListAttribute
     */
    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateForStringWithLanguage(CTFontRef currentFont, CFStringRef string,
            @ByValue CFRange range, CFStringRef language);

    /**
     * [@function] CTFontCollectionCreateMatchingFontDescriptorsWithOptions
     * <p>
     * Returns an array of font descriptors matching the collection.
     *
     * @param collection The font collection reference.
     * @param options    The options dictionary. See constant option keys. May be NULL, in which case this call returns
     *                   the same results as CTFontCollectionCreateMatchingFontDescriptors, using the options passed in
     *                   when the collection was created.
     * @return An array of CTFontDescriptors matching the collection definition or NULL if there are none.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptorsWithOptions(
            CTFontCollectionRef collection, CFDictionaryRef options);

    /**
     * [@function] CTFontManagerCreateFontDescriptorsFromData
     * <p>
     * Returns an array of font descriptors for the fonts in the supplied data.
     * Note: the font descriptors are not available through font descriptor matching.
     *
     * @param data A CFData containing font data.
     * @return An array of font descriptors. This can be an empty array in the event of invalid or unsupported font
     *         data.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCreateFontDescriptorsFromData(CFDataRef data);

    /**
     * [@function] CTFontManagerRegisterFontURLs
     * <p>
     * Registers fonts from the specified font URLs with the font manager. Registered fonts are discoverable through
     * font descriptor matching in the calling process
     * <p>
     * In iOS, fonts registered with the persistent scope are not automatically available to other processes. Other
     * process may call CTFontManagerRequestFonts to get access to these fonts.
     *
     * @param fontURLs            A file URL for the fonts or collections (TTC or OTC) to be registered. Once fonts have
     *                            been registered from a file, it shouldn't be moved or renamed.
     * @param scope               Scope constant defining the availability and lifetime of the registration. See scope
     *                            constants for more details.
     * @param enabled             Boolean value indicating whether the font derived from the URL should be enabled for
     *                            font descriptor matching and/or discoverable via CTFontManagerRequestFonts.
     * @param registrationHandler Block called as errors are discovered or upon completion. The errors parameter
     *                            contains an array of CFError references. An empty array indicates no errors. Each
     *                            error reference will contain a CFArray of font URLs corresponding to
     *                            kCTFontManagerErrorFontURLsKey. These URLs represent the font files that caused the
     *                            error, and were not successfully registered. Note, the handler may be called multiple
     *                            times during the registration process. The done parameter will be set to true when the
     *                            registration process has completed. The handler should return false if the operation
     *                            is to be stopped. This may be desirable after receiving an error.
     */
    @Generated
    @CFunction
    public static native void CTFontManagerRegisterFontURLs(CFArrayRef fontURLs, int scope, boolean enabled,
            @ObjCBlock(name = "call_CTFontManagerRegisterFontURLs") Block_CTFontManagerRegisterFontURLs registrationHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontManagerRegisterFontURLs {
        @Generated
        boolean call_CTFontManagerRegisterFontURLs(CFArrayRef arg0, boolean arg1);
    }

    /**
     * [@function] CTFontManagerUnregisterFontURLs
     * <p>
     * Unregisters fonts from the specified font URLs with the font manager. Unregistered fonts do not participate in
     * font descriptor matching.
     * iOS note: only fonts registered with CTFontManagerRegisterFontsForURL or CTFontManagerRegisterFontsForURLs can be
     * unregistered with this API.
     *
     * @param fontURLs            Array of font URLs.
     * @param scope               Scope constant defining the availability and lifetime of the registration. Should
     *                            match the scope the fonts are registered in. See scope constants for more details.
     * @param registrationHandler Block called as errors are discovered or upon completion. The errors parameter will be
     *                            an empty array if all files are unregistered. Otherwise, it will contain an array of
     *                            CFError references. Each error reference will contain a CFArray of font URLs
     *                            corresponding to kCTFontManagerErrorFontURLsKey. These URLs represent the font files
     *                            that caused the error, and were not successfully unregistered. Note, the handler may
     *                            be called multiple times during the unregistration process. The done parameter will be
     *                            set to true when the unregistration process has completed. The handler should return
     *                            false if the operation is to be stopped. This may be desirable after receiving an
     *                            error.
     */
    @Generated
    @CFunction
    public static native void CTFontManagerUnregisterFontURLs(CFArrayRef fontURLs, int scope,
            @ObjCBlock(name = "call_CTFontManagerUnregisterFontURLs") Block_CTFontManagerUnregisterFontURLs registrationHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontManagerUnregisterFontURLs {
        @Generated
        boolean call_CTFontManagerUnregisterFontURLs(CFArrayRef arg0, boolean arg1);
    }

    /**
     * [@function] CTFontManagerRegisterFontDescriptors
     * <p>
     * Registers font descriptors with the font manager. Registered fonts are discoverable through font descriptor
     * matching in the calling process.
     * <p>
     * Fonts descriptors registered in disabled state are not immediately available for descriptor matching but the font
     * manager will know the descriptors could be made available if necessary. These decriptors can be enabled by making
     * this called again with the enabled parameter set to true. This operation may fail if there is another font
     * registered and enabled with the same Postscript name. In iOS, fonts registered with the persistent scope are not
     * automatically available to other processes. Other process may call CTFontManagerRequestFonts to get access to
     * these fonts.
     *
     * @param fontDescriptors     Array of font descriptors to register. Font descriptor keys used for registration are:
     *                            kCTFontURLAttribute, kCTFontNameAttribute, kCTFontFamilyNameAttribute, or
     *                            kCTFontRegistrationUserInfoAttribute.
     * @param scope               Scope constant defining the availability and lifetime of the registration. See scope
     *                            constants for more details.
     * @param enabled             Boolean value indicating whether the font descriptors should be enabled for font
     *                            descriptor matching and/or discoverable via CTFontManagerRequestFonts.
     * @param registrationHandler Block called as errors are discovered or upon completion. The errors parameter
     *                            contains an array of CFError references. An empty array indicates no errors. Each
     *                            error reference will contain a CFArray of font descriptors corresponding to
     *                            kCTFontManagerErrorFontDescriptorsKey. These represent the font descriptors that
     *                            caused the error, and were not successfully registered. Note, the handler may be
     *                            called multiple times during the registration process. The done parameter will be set
     *                            to true when the registration process has completed. The handler should return false
     *                            if the operation is to be stopped. This may be desirable after receiving an error.
     */
    @Generated
    @CFunction
    public static native void CTFontManagerRegisterFontDescriptors(CFArrayRef fontDescriptors, int scope,
            boolean enabled,
            @ObjCBlock(name = "call_CTFontManagerRegisterFontDescriptors") Block_CTFontManagerRegisterFontDescriptors registrationHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontManagerRegisterFontDescriptors {
        @Generated
        boolean call_CTFontManagerRegisterFontDescriptors(CFArrayRef arg0, boolean arg1);
    }

    /**
     * [@function] CTFontManagerUnregisterFontDescriptors
     * <p>
     * Unregisters font descriptors with the font manager. Unregistered fonts do not participate in font descriptor
     * matching.
     *
     * @param fontDescriptors     Array of font descriptors to unregister.
     * @param scope               Scope constant defining the availability and lifetime of the registration. See scope
     *                            constants for more details.
     * @param registrationHandler Block called as errors are discovered or upon completion. The errors parameter will be
     *                            an empty array if all font descriptors are unregistered. Otherwise, it will contain an
     *                            array of CFError references. Each error reference will contain a CFArray of font
     *                            descriptors corresponding to kCTFontManagerErrorFontDescriptorsKey. These represent
     *                            the font descriptors that caused the error, and were not successfully unregistered.
     *                            Note, the handler may be called multiple times during the unregistration process. The
     *                            done parameter will be set to true when the unregistration process has completed. The
     *                            handler should return false if the operation is to be stopped. This may be desirable
     *                            after receiving an error.
     */
    @Generated
    @CFunction
    public static native void CTFontManagerUnregisterFontDescriptors(CFArrayRef fontDescriptors, int scope,
            @ObjCBlock(name = "call_CTFontManagerUnregisterFontDescriptors") Block_CTFontManagerUnregisterFontDescriptors registrationHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontManagerUnregisterFontDescriptors {
        @Generated
        boolean call_CTFontManagerUnregisterFontDescriptors(CFArrayRef arg0, boolean arg1);
    }

    /**
     * [@function] CTFontManagerRegisterFontsWithAssetNames
     * <p>
     * Registers named font assets in the specified bundle with the font manager. Registered fonts are discoverable
     * through font descriptor matching in the calling process.
     * <p>
     * Font assets are extracted from the asset catalog and registered. This call must be made after the completion
     * handler of either NSBundleResourceRequest beginAccessingResourcesWithCompletionHandler: or
     * conditionallyBeginAccessingResourcesWithCompletionHandler: is called successfully.
     * Name the assets using Postscript names for individual faces, or family names for variable/collection fonts. The
     * same names can be used to unregister the fonts with CTFontManagerUnregisterFontDescriptors. In iOS, fonts
     * registered with the persistent scope are not automatically available to other processes. Other process may call
     * CTFontManagerRequestFonts to get access to these fonts.
     *
     * @param fontAssetNames      Array of font name assets in asset catalog.
     * @param bundle              Bundle containing asset catalog. A null value resolves to the main bundle.
     * @param scope               Scope constant defining the availability and lifetime of the registration.
     *                            kCTFontManagerScopePersistent is the only supported scope for iOS.
     * @param enabled             Boolean value indicating whether the font assets should be enabled for font descriptor
     *                            matching and/or discoverable via CTFontManagerRequestFonts.
     * @param registrationHandler Block called as errors are discovered, or upon completion. The errors parameter
     *                            contains an array of CFError references. An empty array indicates no errors. Each
     *                            error reference will contain a CFArray of font asset names corresponding to
     *                            kCTFontManagerErrorFontAssetNameKey. These represent the font asset names that were
     *                            not successfully registered. Note, the handler may be called multiple times during the
     *                            registration process. The done parameter will be set to true when the registration
     *                            process has completed. The handler should return false if the operation is to be
     *                            stopped. This may be desirable after receiving an error.
     */
    @Generated
    @CFunction
    public static native void CTFontManagerRegisterFontsWithAssetNames(CFArrayRef fontAssetNames, CFBundleRef bundle,
            int scope, boolean enabled,
            @ObjCBlock(name = "call_CTFontManagerRegisterFontsWithAssetNames") Block_CTFontManagerRegisterFontsWithAssetNames registrationHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontManagerRegisterFontsWithAssetNames {
        @Generated
        boolean call_CTFontManagerRegisterFontsWithAssetNames(CFArrayRef arg0, boolean arg1);
    }

    /**
     * [@function] CTFontManagerCopyRegisteredFontDescriptors
     * <p>
     * Returns the font descriptors that were registered with the font manager.
     * <p>
     * In the case the persistent scope is specified, only macOS can return fonts registered by any process. Other
     * platforms can only return font descriptors registered by the application's process.
     *
     * @param scope   Scope constant defining the availability and lifetime of the registration. See scope constants for
     *                more details.
     * @param enabled Boolean value indicating if the caller is interested in registered font descriptors that are
     *                enabled or disabled.
     * @return Array of of font descriptors registered by the application. Array may be empty if nothing is registered.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCopyRegisteredFontDescriptors(int scope, boolean enabled);

    /**
     * [@function] CTFontManagerRequestFonts
     * <p>
     * Resolves font descriptors specified on input. On iOS only, if the font descriptors cannot be found, the user is
     * presented with a dialog indicating fonts that could not be resolved. The user may optionally be provided with a
     * way to resolve the missing fonts if the font manager has a way to enable them.
     * <p>
     * On iOS, fonts registered by font provider applications in the persistent scope are not automatically available to
     * other applications. Client applications must call this function to make the requested fonts available for font
     * descriptor matching.
     *
     * @param fontDescriptors   Array of font descriptors to make available to the process. Keys used to describe the
     *                          fonts may be a combination of: kCTFontNameAttribute, kCTFontFamilyNameAttribute, or
     *                          kCTFontRegistrationUserInfoAttribute.
     * @param completionHandler Block called after request operation completes. Block takes a single parameter
     *                          containing an array of those descriptors that could not be resolved/found. The array can
     *                          be empty if all descriptors were resolved.
     */
    @Generated
    @CFunction
    public static native void CTFontManagerRequestFonts(CFArrayRef fontDescriptors,
            @ObjCBlock(name = "call_CTFontManagerRequestFonts") Block_CTFontManagerRequestFonts completionHandler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontManagerRequestFonts {
        @Generated
        void call_CTFontManagerRequestFonts(CFArrayRef arg0);
    }

    /**
     * [@function] CTFramesetterCreateWithTypesetter
     * <p>
     * Creates a framesetter directly from a typesetter.
     * <p>
     * Each framesetter uses a typesetter internally to perform
     * line breaking and other contextual analysis based on the
     * characters in a string. This function allows use of a
     * typesetter that was constructed using specific options.
     *
     * @param typesetter The typesetter to be used by the newly-created framesetter.
     * @return This function will return a reference to a CTFramesetter object.
     * @see CTTypesetterCreateWithAttributedStringAndOptions
     */
    @Generated
    @CFunction
    public static native CTFramesetterRef CTFramesetterCreateWithTypesetter(CTTypesetterRef typesetter);

    /**
     * [@function] CTGlyphInfoGetGlyph
     * <p>
     * Gets the glyph for a glyph info, if applicable.
     * <p>
     * This function will return the glyph.
     *
     * @param glyphInfo The glyph info from which you would like the glyph.
     * @return If the glyph info object was created with a font, it will be
     *         returned. Otherwise, this function will return 0.
     */
    @Generated
    @CFunction
    public static native char CTGlyphInfoGetGlyph(CTGlyphInfoRef glyphInfo);

    /**
     * [@function] CTRunGetBaseAdvancesAndOrigins
     * <p>
     * Copies a range of base advances and/or origins into user-provided
     * buffers.
     * <p>
     * A run's base advances and origins determine the positions of its
     * glyphs but require additional processing before being used for
     * drawing. Similar to the advances returned by CTRunGetAdvances,
     * base advances are the displacement from the origin of a glyph
     * to the origin of the next glyph, except base advances do not
     * include any positioning the font layout tables may have done
     * relative to another glyph (such as a mark relative to its base).
     * The actual position of the current glyph is determined by the
     * displacement of its origin from the starting position, and the
     * position of the next glyph by the displacement of the current
     * glyph's base advance from the starting position.
     *
     * @param runRef         The run whose base advances and/or origins you wish to copy.
     * @param range          The range of values to be copied. If the length of the
     *                       range is set to 0, then the copy operation will continue from the
     *                       range's start index to the end of the run.
     * @param advancesBuffer The buffer where the base advances will be copied to, or NULL.
     *                       If not NULL, the buffer must allow for at least as many elements
     *                       as specified by the range's length.
     * @param originsBuffer  The buffer where the origins will be copied to, or NULL. If not
     *                       NULL, the buffer must allow for at least as many elements as
     *                       specified by the range's length.
     */
    @Generated
    @CFunction
    public static native void CTRunGetBaseAdvancesAndOrigins(CTRunRef runRef, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize advancesBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint originsBuffer);

    /**
     * [@defined] kCTFontFeatureSampleTextKey
     * <p>
     * Key to get the font feature sample text.
     * <p>
     * This key can be used with a font feature dictionary to get the localized sample text as a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSampleTextKey();

    /**
     * [@defined] kCTFontFeatureTooltipTextKey
     * <p>
     * Key to get the font feature tooltip text.
     * <p>
     * This key can be used with a font feature dictionary to get the localized tooltip text as a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTooltipTextKey();

    /**
     * [@constant] kCTFontManagerErrorFontDescriptorsKey
     * <p>
     * User info key to be used with CFError references returned from registration functions.
     * <p>
     * The value associated with this key in the user info dictionary of a CFError is a CFArray of font descriptors that
     * failed with given error.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorFontDescriptorsKey();

    /**
     * [@constant] kCTFontManagerErrorFontAssetNameKey
     * <p>
     * User info key to be used with CFError references returned from registration functions.
     * <p>
     * The value associated with this key in the user info dictionary of a CFError is a CFArray of font asset name
     * strings that failed with given error.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorFontAssetNameKey();

    /**
     * [@defined] kCTFontRegistrationUserInfoAttribute
     * <p>
     * Optional user defined information that can be attached to an entry in the Font Manager registration catalog.
     * <p>
     * This is the key for accessing font registration user information for the font descriptor. This information can be
     * used in descriptor matching to disambiguate between two fonts with equivalent Postscript names. The value
     * associated with this key is a CFStringRef.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontRegistrationUserInfoAttribute();

    /**
     * [@const] kCTTypesetterOptionAllowUnboundedLayout
     * <p>
     * Allows layout requiring a potentially unbounded amount of work.
     * <p>
     * Value must be a CFBooleanRef. Default is false for clients linked on or after macOS 10.14 or iOS 12.
     * Proper Unicode layout of some text requires unreasonable effort;
     * unless this option is set to kCFBooleanTrue such inputs will
     * result in CTTypesetterCreateWithAttributedStringAndOptions
     * returning NULL.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionAllowUnboundedLayout();

    /**
     * [@const] kCTTrackingAttributeName
     * <p>
     * Applies tracking (letterspacing).
     * <p>
     * Value must be a CFNumber. Default is zero (no tracking).
     * The tracking attribute indicates how much additional space, in
     * points, should be added to each character cluster after layout.
     * The effect of this attribute is similar to kCTKernAttributeName
     * but differs in that the added tracking is treated as trailing
     * whitespace and a non-zero amount disables non-essential ligatures
     * unless overridden by kCTLigatureAttributeName being present.
     * If both kCTKernAttributeName and kCTTrackingAttributeName are
     * present kCTKernAttributeName will be ignored unless zero;
     * kCTTrackingAttributeName will still be honored.
     *
     * @see kCTKernAttributeName
     * @see kCTLigatureAttributeName
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTTrackingAttributeName();

    /**
     * [@function] CTFontCopyNameForGlyph
     * <p>
     * Returns the name for the specified glyph.
     *
     * @param font  The font reference.
     * @param glyph The glyph.
     * @return The glyph name as a CFString or NULL if the glyph is invalid.
     * @see CTFontGetGlyphWithName
     */
    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyNameForGlyph(CTFontRef font, char glyph);

    /**
     * [@defined] kCTFontVariationAxesAttribute
     * <p>
     * An array of variation axis dictionaries or null if the font does not support variations. Each variation axis
     * dictionary contains the five kCTFontVariationAxis* keys.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxesAttribute();

    /**
     * [@defined] kCTFontOpticalSizeAttribute
     * <p>
     * The point size at which this font is intended to be used.
     * <p>
     * The value is a CFNumber used to activate size-specific (not linearly scaled) metrics. Starting with macOS 10.14
     * and iOS 12.0, the CFString "auto" can be used instead to request an optical size matching the point size.
     * Starting with macOS 10.15 and iOS 13.0, the CFString "none" can be used instead to explicitly disable automatic
     * optical sizing enabled by the font.
     */
    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpticalSizeAttribute();

    /**
     * [@function] CTFontCollectionCopyFontAttribute
     * <p>
     * Returns an array of font descriptor attribute values.
     *
     * @param collection    The font collection reference.
     * @param attributeName The attribute to retrieve for each descriptor in the collection.
     * @param options       Options to alter the return value.
     * @return An array containing one value for each descriptor. With kCTFontCollectionCopyDefaultOptions, the values
     *         will be in the same order as the results from CTFontCollectionCreateMatchingFontDescriptors and NULL
     *         values will be transformed to kCFNull. When the kCTFontCollectionCopyUnique is set, duplicate values will
     *         be removed. When kCTFontCollectionCopyStandardSort is set, the values will be sorted in standard UI
     *         order.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCopyFontAttribute(CTFontCollectionRef collection,
            CFStringRef attributeName, int options);

    /**
     * [@function] CTFontCollectionCopyFontAttributes
     * <p>
     * Returns an array of dictionaries containing font descriptor attribute values.
     *
     * @param collection     The font collection reference.
     * @param attributeNames The attributes to retrieve for each descriptor in the collection.
     * @param options        Options to alter the return value.
     * @return An array containing one CFDictionary value for each descriptor mapping the requested attribute names.
     *         With kCTFontCollectionCopyDefaultOptions, the values will be in the same order as the results from
     *         CTFontCollectionCreateMatchingFontDescriptors. When the kCTFontCollectionCopyUnique is set, duplicate
     *         values will be removed. When kCTFontCollectionCopyStandardSort is set, the values will be sorted in
     *         standard UI order.
     */
    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCopyFontAttributes(CTFontCollectionRef collection,
            CFSetRef attributeNames, int options);
}
