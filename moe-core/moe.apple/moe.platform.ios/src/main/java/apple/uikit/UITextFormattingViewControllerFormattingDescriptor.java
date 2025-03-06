package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ann.NFloat;
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
 * Object that represents current text formatting state.
 * This can apply to formatting state of some selected range of text or currently applicable input formatting.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextFormattingViewControllerFormattingDescriptor extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextFormattingViewControllerFormattingDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextFormattingViewControllerFormattingDescriptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITextFormattingViewControllerFormattingDescriptor allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("fonts")
    @Nullable
    public native NSArray<? extends UIFont> fonts();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("formattingStyleKey")
    @Nullable
    public native String formattingStyleKey();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("highlights")
    @NotNull
    public native NSSet<String> highlights();

    /**
     * Initializes formatting descriptor with default property values.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("init")
    public native UITextFormattingViewControllerFormattingDescriptor init();

    /**
     * Initializes formatting descriptor with attribute dictionary.
     * - Parameter attributes: Attribute dictionary that is being represented by descriptor.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithAttributes:")
    public native UITextFormattingViewControllerFormattingDescriptor initWithAttributes(
            @NotNull NSDictionary<String, ?> attributes);

    @Generated
    @Selector("initWithCoder:")
    public native UITextFormattingViewControllerFormattingDescriptor initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes formatting descriptor with a string and selected range of string.
     * - Parameters:
     * - string: Attributed string for which we are creating formatting descriptor.
     * - range: Range of string that is being represented by descriptor
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithString:range:")
    public native UITextFormattingViewControllerFormattingDescriptor initWithStringRange(
            @NotNull NSAttributedString string, @ByValue NSRange range);

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

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("lineHeight")
    @NFloat
    public native double lineHeight();

    @Generated
    @Owned
    @Selector("new")
    public static native UITextFormattingViewControllerFormattingDescriptor new_objc();

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
    @Selector("setFonts:")
    public native void setFonts(@Nullable NSArray<? extends UIFont> value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFormattingStyleKey:")
    public native void setFormattingStyleKey(@Nullable String value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHighlights:")
    public native void setHighlights(@NotNull NSSet<String> value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setLineHeight:")
    public native void setLineHeight(@NFloat double value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setStrikethroughPresent:")
    public native void setStrikethroughPresent(boolean value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTextAlignments:")
    public native void setTextAlignments(@NotNull NSSet<String> value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTextColors:")
    public native void setTextColors(@Nullable NSArray<? extends UIColor> value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setTextLists:")
    public native void setTextLists(@NotNull NSSet<String> value);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setUnderlinePresent:")
    public native void setUnderlinePresent(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("strikethroughPresent")
    public native boolean strikethroughPresent();

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
     * API-Since: 18.0
     */
    @Generated
    @Selector("textAlignments")
    @NotNull
    public native NSSet<String> textAlignments();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("textColors")
    @Nullable
    public native NSArray<? extends UIColor> textColors();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("textLists")
    @NotNull
    public native NSSet<String> textLists();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("underlinePresent")
    public native boolean underlinePresent();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}