package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * Describes text formatting change that is a result of user action.
 * Contains type of change, any associated value that may be applicable to that change.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextFormattingViewControllerChangeValue extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextFormattingViewControllerChangeValue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextFormattingViewControllerChangeValue alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITextFormattingViewControllerChangeValue allocWithZone(VoidPtr zone);

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

    /**
     * Type of change.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("changeType")
    @NotNull
    public native String changeType();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Any color value that may be associated with the change.
     * For example, this property will be available if user has changed text color.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("color")
    @Nullable
    public native UIColor color();

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
     * Any font that may be associated with the change.
     * For example, this property will be available in case of font typography settings change or new font selection.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("font")
    @Nullable
    public native UIFont font();

    /**
     * On formatting style change, use this property to determine selected style.
     * 
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
     * Text highlight associated with the `UITextFormattingViewControllerHighlightChangeType`.
     * If property is nil for `UITextFormattingViewControllerHighlightChangeType`, it indicates highlight has been
     * removed.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("highlight")
    @Nullable
    public native String highlight();

    @Generated
    @Selector("init")
    public native UITextFormattingViewControllerChangeValue init();

    @Generated
    @Selector("initWithCoder:")
    public native UITextFormattingViewControllerChangeValue initWithCoder(@NotNull NSCoder coder);

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
    public static native UITextFormattingViewControllerChangeValue new_objc();

    /**
     * Any number value that may be associated with the change.
     * For example, if case of font point size change, this property will reflect new point size.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("numberValue")
    @Nullable
    public native NSNumber numberValue();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Text alignment associated with the `UITextFormattingViewControllerTextAlignmentChangeType`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * Text list style associated with the `UITextFormattingViewControllerTextListChangeType`.
     * If property is nil for `UITextFormattingViewControllerTextListChangeType`, it indicates text list has been
     * removed.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textList")
    @Nullable
    public native String textList();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}