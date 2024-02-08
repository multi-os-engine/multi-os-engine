package apple.screentime;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("ScreenTime")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class STWebpageController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected STWebpageController(Pointer peer) {
        super(peer);
    }

    /**
     * The URL for the webpage.
     * 
     * Set this value to the webpage’s URL when the user navigates to a new URL.
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * A Boolean that indicates whether a parent or guardian has blocked the URL.
     * 
     * When a parent or guardian blocks the webpage’s URL, the webpage controller
     * displays a blocking UI and then sets this property to `YES`.
     */
    @Generated
    @Selector("URLIsBlocked")
    public native boolean URLIsBlocked();

    /**
     * A Boolean that indicates whether the webpage is currently displaying a
     * floating picture in picture window.
     * 
     * The default value is `NO`. Set this value when the webpage starts or
     * stops displaying a Picture in Picture window.
     * 
     * - Important: Set this value to `NO` prior to changing
     * ``ScreenTime/STWebpageController/URL`` if the new webpage at that URL ends all
     * currently displayed Picture in Picture windows, and won’t immediately
     * display a new one.
     */
    @Generated
    @Selector("URLIsPictureInPicture")
    public native boolean URLIsPictureInPicture();

    /**
     * A Boolean that indicates whether there are one or more videos currently
     * playing in the webpage.
     * 
     * The default value is `NO`. Set this value when the webpage starts or
     * stops playing video.
     * 
     * - Important: Set this value to `NO` prior to changing
     * ``ScreenTime/STWebpageController/URL`` if the new webpage at that URL stops currently
     * playing media and won’t immediately start playing new media.
     */
    @Generated
    @Selector("URLIsPlayingVideo")
    public native boolean URLIsPlayingVideo();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native STWebpageController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native STWebpageController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public native STWebpageController init();

    @Generated
    @Selector("initWithCoder:")
    public native STWebpageController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native STWebpageController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native STWebpageController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Changes the bundle identifier used to report web usage.
     * 
     * This is only supported for web browsers that have been properly registered with Screen Time.
     * 
     * - Parameters:
     * - bundleIdentifier: The bundle identifier that can be changed to facilitate web usage
     * reporting for a parent web browser from one of its helper processes or extensions.
     * - error: Any error that occurred while changing the bundle identifier.
     */
    @Generated
    @Selector("setBundleIdentifier:error:")
    public native boolean setBundleIdentifierError(@NotNull String bundleIdentifier,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * A Boolean that indicates whether the webpage controller is not recording web
     * usage.
     * 
     * Set to `YES` to stop recording and reporting web-usage data.
     */
    @Generated
    @Selector("setSuppressUsageRecording:")
    public native void setSuppressUsageRecording(boolean value);

    /**
     * The URL for the webpage.
     * 
     * Set this value to the webpage’s URL when the user navigates to a new URL.
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(@Nullable NSURL value);

    /**
     * A Boolean that indicates whether the webpage is currently displaying a
     * floating picture in picture window.
     * 
     * The default value is `NO`. Set this value when the webpage starts or
     * stops displaying a Picture in Picture window.
     * 
     * - Important: Set this value to `NO` prior to changing
     * ``ScreenTime/STWebpageController/URL`` if the new webpage at that URL ends all
     * currently displayed Picture in Picture windows, and won’t immediately
     * display a new one.
     */
    @Generated
    @Selector("setURLIsPictureInPicture:")
    public native void setURLIsPictureInPicture(boolean value);

    /**
     * A Boolean that indicates whether there are one or more videos currently
     * playing in the webpage.
     * 
     * The default value is `NO`. Set this value when the webpage starts or
     * stops playing video.
     * 
     * - Important: Set this value to `NO` prior to changing
     * ``ScreenTime/STWebpageController/URL`` if the new webpage at that URL stops currently
     * playing media and won’t immediately start playing new media.
     */
    @Generated
    @Selector("setURLIsPlayingVideo:")
    public native void setURLIsPlayingVideo(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A Boolean that indicates whether the webpage controller is not recording web
     * usage.
     * 
     * Set to `YES` to stop recording and reporting web-usage data.
     */
    @Generated
    @Selector("suppressUsageRecording")
    public native boolean suppressUsageRecording();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
