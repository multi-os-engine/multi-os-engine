package apple.avfoundation;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVMutableCaption
 * 
 * Mutable subclass of AVCaption.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableCaption extends AVCaption {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableCaption(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableCaption alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMutableCaption allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native AVMutableCaption init();

    @Generated
    @Selector("initWithCoder:")
    public native AVMutableCaption initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithText:timeRange:")
    public native AVMutableCaption initWithTextTimeRange(@NotNull String text, @ByValue CMTimeRange timeRange);

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
    @Selector("new")
    public static native AVMutableCaption new_objc();

    /**
     * [@property] region
     * 
     * The region where the caption is placed.
     * 
     * It can be nil when the underlying caption format doesn't support or use regions.
     * This property throws an exception if region has unrecognizeable units.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("region")
    @NotNull
    public native AVCaptionRegion region();

    /**
     * removeBackgroundColorInRange:
     * 
     * Remove background color for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeBackgroundColorInRange:")
    public native void removeBackgroundColorInRange(@ByValue NSRange range);

    /**
     * removeDecorationInRange:
     * 
     * Remove text decoration for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeDecorationInRange:")
    public native void removeDecorationInRange(@ByValue NSRange range);

    /**
     * removeFontStyleInRange:
     * 
     * Remove font style for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeFontStyleInRange:")
    public native void removeFontStyleInRange(@ByValue NSRange range);

    /**
     * removeFontWeightInRange:
     * 
     * Remove font weight for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeFontWeightInRange:")
    public native void removeFontWeightInRange(@ByValue NSRange range);

    /**
     * removeRubyInRange:
     * 
     * Remove ruby text for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeRubyInRange:")
    public native void removeRubyInRange(@ByValue NSRange range);

    /**
     * removeTextColorInRange:
     * 
     * Remove text color for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeTextColorInRange:")
    public native void removeTextColorInRange(@ByValue NSRange range);

    /**
     * removeTextCombineInRange:
     * 
     * Remove text combine for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeTextCombineInRange:")
    public native void removeTextCombineInRange(@ByValue NSRange range);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAnimation:")
    public native void setAnimation(@NInt long value);

    /**
     * setBackgroundColor:inRange:
     * 
     * Set background color for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setBackgroundColor:inRange:")
    public native void setBackgroundColorInRange(@NotNull CGColorRef color, @ByValue NSRange range);

    /**
     * setDecoration:inRange:
     * 
     * Set text decoration for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDecoration:inRange:")
    public native void setDecorationInRange(@NUInt long decoration, @ByValue NSRange range);

    /**
     * setFontStyle:inRange:
     * 
     * Set font style for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFontStyle:inRange:")
    public native void setFontStyleInRange(@NInt long fontStyle, @ByValue NSRange range);

    /**
     * setFontWeight:inRange:
     * 
     * Set font weight for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFontWeight:inRange:")
    public native void setFontWeightInRange(@NInt long fontWeight, @ByValue NSRange range);

    /**
     * [@property] region
     * 
     * The region where the caption is placed.
     * 
     * It can be nil when the underlying caption format doesn't support or use regions.
     * This property throws an exception if region has unrecognizeable units.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setRegion:")
    public native void setRegion(@NotNull AVCaptionRegion value);

    /**
     * setRuby:inRange:
     * 
     * Set ruby text for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setRuby:inRange:")
    public native void setRubyInRange(@NotNull AVCaptionRuby ruby, @ByValue NSRange range);

    /**
     * [@property] text
     * 
     * The text content of the caption.
     * 
     * All styling information is cleared on setting this property.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setText:")
    public native void setText(@NotNull String value);

    /**
     * [@property] textAlignment
     * 
     * The text alignemnt within the containing region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    /**
     * setTextColor:inRange:
     * 
     * Set text color for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTextColor:inRange:")
    public native void setTextColorInRange(@NotNull CGColorRef color, @ByValue NSRange range);

    /**
     * setTextCombine:inRange:
     * 
     * Set text combine for the range.
     * 
     * The range parameter uses UTF-16 code unit index range.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTextCombine:inRange:")
    public native void setTextCombineInRange(@NInt long textCombine, @ByValue NSRange range);

    /**
     * [@property] timeRange
     * 
     * The time range during which the caption should be presented.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTimeRange:")
    public native void setTimeRange(@ByValue CMTimeRange value);

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
     * All styling information is cleared on setting this property.
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
     * The text alignemnt within the containing region.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * [@property] timeRange
     * 
     * The time range during which the caption should be presented.
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