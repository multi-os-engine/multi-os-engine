package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
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
 * Text formatting view controller configuration object.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextFormattingViewControllerConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextFormattingViewControllerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextFormattingViewControllerConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITextFormattingViewControllerConfiguration allocWithZone(VoidPtr zone);

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
     * Configuration object that will be used to customize `UIFontPickerViewController` if presented by
     * `UITextFormattingViewController`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("fontPickerConfiguration")
    @Nullable
    public native UIFontPickerViewControllerConfiguration fontPickerConfiguration();

    /**
     * Configurations of formatting styles available in text formatting view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("formattingStyles")
    @Nullable
    public native NSArray<? extends UITextFormattingViewControllerFormattingStyle> formattingStyles();

    /**
     * Component groups displayed by text formatting view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("groups")
    @NotNull
    public native NSArray<? extends UITextFormattingViewControllerComponentGroup> groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a default configuration with most common text formatting options.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("init")
    public native UITextFormattingViewControllerConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UITextFormattingViewControllerConfiguration initWithCoder(@NotNull NSCoder coder);

    /**
     * Creates a configuration object with provided component groups.
     * - Parameter groups: Component groups displayed in text formatting view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithGroups:")
    public native UITextFormattingViewControllerConfiguration initWithGroups(
            @NotNull NSArray<? extends UITextFormattingViewControllerComponentGroup> groups);

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
    public static native UITextFormattingViewControllerConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Configuration object that will be used to customize `UIFontPickerViewController` if presented by
     * `UITextFormattingViewController`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFontPickerConfiguration:")
    public native void setFontPickerConfiguration(@Nullable UIFontPickerViewControllerConfiguration value);

    /**
     * Configurations of formatting styles available in text formatting view.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFormattingStyles:")
    public native void setFormattingStyles(
            @Nullable NSArray<? extends UITextFormattingViewControllerFormattingStyle> value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}