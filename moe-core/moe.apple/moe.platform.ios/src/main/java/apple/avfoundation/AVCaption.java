package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaption
 * 
 * An instance of AVCaption represents a unit of text that is active at a particular time range.
 * 
 * A caption contains one meaningful sentence, paragraph, or otherwise known as a caption cue. Within the active time
 * range, it may perform animation (e.g. Karaoke), rolling-up, changes the visibility, or any other dynamic styling.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaption extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaption(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaption alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaption allocWithZone(VoidPtr zone);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("animation")
    @NInt
    public native long animation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * backgroundColorAtIndex:range:
     * 
     * The background color of the character(s).
     * 
     * A value of NULL means that the color is not specified. The caller must release the returned object via
     * CGColorRelease. The range parameter receives UTF-16 code unit index range the style is effective. After returning
     * from the call, the range will indicate where the current style returned (including NULL) will be active and
     * allows discovery of the next change in the style.
     * 
     * iTT format ignores this property.
     * 
     * CEA608 closed captions support the following 8 colors with 1.0, 0.5 and 0.0 alpha values.
     * White (RGB:1.0, 1.0, 1.0)
     * Red (RGB:1.0, 0.0, 0.0)
     * Blue (RGB:0.0, 0.0, 1.0)
     * Green (RGB:0.0, 1.0, 0.0)
     * Yellow (RGB:1.0, 1.0, 0.0)
     * Cyan (RGB:0.0, 1.0, 1.0)
     * Magenta (RGB:1.0, 0.0, 1.0)
     * Black (RGB:0.0, 0.0, 0.0)
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("backgroundColorAtIndex:range:")
    @Nullable
    public native CGColorRef backgroundColorAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * decorationAtIndex:range:
     * 
     * Character decoration
     * 
     * The value of OR-ed value of AVCaptionDecoration as NSInteger. The range parameter receives UTF-16 code unit index
     * range the style is effective. After returning from the call, the range will indicate where the current style
     * returned will be active and allows discovery of the next change in the style.
     * 
     * CEA608 closed captions support only AVCaptionDecorationNone and AVCaptionDecorationUnderline.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("decorationAtIndex:range:")
    @NUInt
    public native long decorationAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * fontStyleAtIndex:range:
     * 
     * Indicates the font style of the character(s).
     * 
     * The range parameter receives UTF-16 code unit index range the style is effective. After returning from the call,
     * the range will indicate where the current style returned will be active and allows discovery of the next change
     * in the style.
     * 
     * Some writing systems may not have italic glyphs for characters and so fonts with italic forms are not available.
     * For example, Japanese fonts do not typically have italic forms for most characters although there may be special
     * cases for Latin characters. Nevertheless, AVCaption still carries the font style semantics even though there may
     * be no visible rendering distinction between using AVCaptionFontStyleNormal and AVCaptionFontStyleItalic with that
     * language.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("fontStyleAtIndex:range:")
    @NInt
    public native long fontStyleAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    /**
     * fontWeightAtIndex:range:
     * 
     * Indicates the font weight of the character(s).
     * 
     * The range parameter receives UTF-16 code unit index range the style is effective. After returning from the call,
     * the range will indicate where the current style returned will be active and allows discovery of the next change
     * in the style.
     * 
     * CEA608 closed captions ignore this property.
     * 
     * A visible distinction between AVCaptionFontWeightNormal and AVCaptionFontWeightBold may not exist if the font
     * used has only one weight. This can be more common with CJK fonts where individual fonts can be quite large in
     * terms of storage. Nevertheless, AVCaption still carries the font weight semantics so if the same AVCaption is
     * applied to a different font having multiple weights, the distinction will become visible.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("fontWeightAtIndex:range:")
    @NInt
    public native long fontWeightAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaption init();

    @Generated
    @Selector("initWithCoder:")
    public native AVCaption initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithText:timeRange:
     * 
     * Initializes an instance of AVCaption with the given text and time range.
     * 
     * @param text
     *                  The text for the new caption object. See text property for the available character sets and
     *                  other restrictions.
     * @param timeRange
     *                  The time range for the new caption object.
     * @return
     *         An instance of AVCaption that carries the given text and time range.
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithText:timeRange:")
    public native AVCaption initWithTextTimeRange(@NotNull String text, @ByValue CMTimeRange timeRange);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaption new_objc();

    /**
     * [@property] region
     * 
     * The region where the caption is placed.
     * 
     * It can be nil when the underlying caption format doesn't support or use regions.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("region")
    @Nullable
    public native AVCaptionRegion region();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * rubyAtIndex:range:
     * 
     * Get Ruby associated with the characters.
     * 
     * The range parameter receives UTF-16 code unit index range where the ruby text is applied. After returning from
     * the call, the range will indicate where the current style returned (including NULL) will be active and allows
     * discovery of the next change in the style.
     * 
     * It returns nil when the text doesn't have a ruby at the position.
     * 
     * CEA608 closed captions ignore this property.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("rubyAtIndex:range:")
    @Nullable
    public native AVCaptionRuby rubyAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] text
     * 
     * The text content of the caption.
     * 
     * The text may contain any of the line breaking character sequences (LF, CR, or CF+LF) and separating the lines in
     * the presentation.
     * 
     * The Apple iTT format supports all Unicode code points allowed in a XML document. Any XML special characters such
     * as '&' are converted to a corresponding character reference syntax when written to the destination file.
     * 
     * CEA608 closed captions support the following Unicode characters.
     * Range: U+0020 - U+005F
     * Range: U+0061 - U+007E
     * Range: U+00A1 - U+00A5
     * Characters: U+00A9, U+00AB, U+00AE, U+00B0, U+00BB, U+00BD, U+00BF
     * Range: U+00C0-U+00C5
     * Range: U+00C7-U+00CF
     * Range: U+00D1-U+00D6
     * Range: U+00D8-U+00DC
     * Range: U+00DF-U+00E5
     * Range: U+00E7-U+00EF
     * Range: U+00F1-U+00FC
     * Range: U+2018-U+2019
     * Range: U+2018-U+201D
     * Character: U+2022
     * Range: U+2120-U+2122
     * Characters: U+2501, U+2503, U+250F, U+2513, U+2517, U+251B, U+2588, U+266A
     * 
     * CEA608 closed captions don't support the line breaking character sequences (LF, CR, or CF+LF).
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("text")
    @NotNull
    public native String text();

    /**
     * [@property] textAlignment
     * 
     * The text alignment within the containing region.
     * 
     * This property throws an exception if a value is set which is not a valid AVCaptionTextAlignment.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * textColorAtIndex:range:
     * 
     * The color of the character(s).
     * 
     * A value of NULL means that the color is not specified. The caller must release the returned object via
     * CGColorRelease. The range parameter receives UTF-16 code unit index range the style is effective. The range will
     * indicate where the current style returned (including NULL) will be active and allows discovery of the next change
     * in the style.
     * 
     * CEA608 closed captions support the following 8 colors with 1.0 alpha value.
     * White (RGB:1.0, 1.0, 1.0)
     * Red (RGB:1.0, 0.0, 0.0)
     * Blue (RGB:0.0, 0.0, 1.0)
     * Green (RGB:0.0, 1.0, 0.0)
     * Yellow (RGB:1.0, 1.0, 0.0)
     * Cyan (RGB:0.0, 1.0, 1.0)
     * Magenta (RGB:1.0, 0.0, 1.0)
     * Black (RGB:0.0, 0.0, 0.0)
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textColorAtIndex:range:")
    @Nullable
    public native CGColorRef textColorAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    /**
     * textCombineAtIndex:range:
     * 
     * Text combine (Tate-Chu-Yoko)
     * 
     * The style is effective only in a vertical text region.
     * 
     * When specified, the renderer combines all the characters in the style range so that their glyph areas consume the
     * nominal bounding box of a single em square of the surrounding vertical text.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textCombineAtIndex:range:")
    @NInt
    public native long textCombineAtIndexRange(@NInt long index,
            @UncertainArgument("Options: reference, array Fallback: reference") @Nullable NSRange outRange);

    /**
     * [@property] timeRange
     * 
     * The time range during which the caption should be presented.
     * 
     * Apple iTT format doesn't allow two captions to have overlapped time range except when the two captions are
     * associated with different regions.
     * 
     * CEA608 closed caption time ranges can't start with zero, because the decoder needs some transmission time.
     * CEA608 closed caption time ranges should be aligned with the video frame rate because this is how often the
     * commands are delivered.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    public native CMTimeRange timeRange();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}