package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * Specifies whether any types of sharing should be disabled in Share Sheet, and if so, whether they should provide a
 * reason when tapped
 * If a reason is provided, the corresponding mode will show up as an option, but an alert explaining why it is disabled
 * will show if it is chosen, and the mode will switch back to the supported one
 * Optionally, an extra alert button can be provided for a "recovery suggestion". This can give a user a way to fix
 * whatever is causing this type of sharing to be disabled
 * If no reason is provided, the corresponding mode will not show up as an option
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIActivityCollaborationModeRestriction extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIActivityCollaborationModeRestriction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The label on the alert button which will simply confirm that the alert was viewed and dismiss it
     * Defaults to "OK"
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("alertDismissButtonTitle")
    @Nullable
    public native String alertDismissButtonTitle();

    /**
     * The message of the alert if a reason for disabling is provided
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("alertMessage")
    @Nullable
    public native String alertMessage();

    /**
     * On tapping the recovery suggestion button (if it is provided), the user will be launched to this URL
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("alertRecoverySuggestionButtonLaunchURL")
    @Nullable
    public native NSURL alertRecoverySuggestionButtonLaunchURL();

    /**
     * The label on the recovery suggestion button if it is provided
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("alertRecoverySuggestionButtonTitle")
    @Nullable
    public native String alertRecoverySuggestionButtonTitle();

    /**
     * The title of the alert if a reason for disabling is provided
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("alertTitle")
    @Nullable
    public native String alertTitle();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIActivityCollaborationModeRestriction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIActivityCollaborationModeRestriction allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("description")
    @NotNull
    public native String description();

    /**
     * The type of sharing which should be disabled
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("disabledMode")
    @NInt
    public native long disabledMode();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIActivityCollaborationModeRestriction init();

    @Generated
    @Selector("initWithCoder:")
    public native UIActivityCollaborationModeRestriction initWithCoder(@NotNull NSCoder coder);

    /**
     * - Parameters:
     * - disabledMode: The disabled type of sharing
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithDisabledMode:")
    public native UIActivityCollaborationModeRestriction initWithDisabledMode(@NInt long disabledMode);

    /**
     * - Parameters:
     * - disabledMode: The disabled type of sharing
     * - alertTitle: The alert title
     * - alertMessage: The alert message
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithDisabledMode:alertTitle:alertMessage:")
    public native UIActivityCollaborationModeRestriction initWithDisabledModeAlertTitleAlertMessage(
            @NInt long disabledMode, @NotNull String alertTitle, @NotNull String alertMessage);

    /**
     * - Parameters:
     * - disabledMode: The disabled type of sharing
     * - alertTitle: The alert title
     * - alertMessage: The alert message
     * - alertDismissButtonTitle: The label on the default alert button
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithDisabledMode:alertTitle:alertMessage:alertDismissButtonTitle:")
    public native UIActivityCollaborationModeRestriction initWithDisabledModeAlertTitleAlertMessageAlertDismissButtonTitle(
            @NInt long disabledMode, @NotNull String alertTitle, @NotNull String alertMessage,
            @NotNull String alertDismissButtonTitle);

    /**
     * - Parameters:
     * - disabledMode: The disabled type of sharing
     * - alertTitle: The alert title
     * - alertMessage: The alert message
     * - alertDismissButtonTitle: The label on the default alert button
     * - alertRecoverySuggestionButtonTitle: The label on the optional recovery suggestion button on the alert
     * - alertRecoverySuggestionButtonLaunchURL: The URL which launches when the optional recovery suggestion button is
     * tapped
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithDisabledMode:alertTitle:alertMessage:alertDismissButtonTitle:alertRecoverySuggestionButtonTitle:alertRecoverySuggestionButtonLaunchURL:")
    public native UIActivityCollaborationModeRestriction initWithDisabledModeAlertTitleAlertMessageAlertDismissButtonTitleAlertRecoverySuggestionButtonTitleAlertRecoverySuggestionButtonLaunchURL(
            @NInt long disabledMode, @NotNull String alertTitle, @NotNull String alertMessage,
            @NotNull String alertDismissButtonTitle, @NotNull String alertRecoverySuggestionButtonTitle,
            @NotNull NSURL alertRecoverySuggestionButtonLaunchURL);

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
    public static native UIActivityCollaborationModeRestriction new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}