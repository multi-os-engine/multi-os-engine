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
import org.moe.natj.general.ann.MappedReturn;
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

    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * If @c URL is blocked or not.
     * <p>
     * This property can be used for pausing media and ending any Picture in Picture video. It will change at a random delay (for user privacy reasons)
     * after the URL should be blocked, and is KVO-compliant.
     */
    @Generated
    @Selector("URLIsBlocked")
    public native boolean URLIsBlocked();

    /**
     * Whether or not the webpage has a video displayed in a floating Picture in Picture window.
     */
    @Generated
    @Selector("URLIsPictureInPicture")
    public native boolean URLIsPictureInPicture();

    /**
     * Whether or not there are one or more videos that are currently playing in the webpage.
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    public native STWebpageController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native STWebpageController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

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

    /**
     * Changes the bundle identifier used to report web usage.
     * <p>
     * This is only supported for web browsers that have been properly registered with Screen Time.
     *
     * @param bundleIdentifier Defaults to @c NSBundle.mainBundle.bundleIdentifier but can be changed to facilitate reporting web usage
     *                         for a parent web browser from one of its helper processes or extensions.
     * @param error            Any error that occurred while changing the bundle identifier.
     */
    @Generated
    @Selector("setBundleIdentifier:error:")
    public native boolean setBundleIdentifierError(String bundleIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Suppresses the recording of web usage.
     * <p>
     * When this property is set to @c YES, the current usage recording is stopped, and no further usage is recorded in Screen Time.
     */
    @Generated
    @Selector("setSuppressUsageRecording:")
    public native void setSuppressUsageRecording(boolean value);

    @Generated
    @Selector("setURL:")
    public native void setURL(NSURL value);

    /**
     * Whether or not the webpage has a video displayed in a floating Picture in Picture window.
     */
    @Generated
    @Selector("setURLIsPictureInPicture:")
    public native void setURLIsPictureInPicture(boolean value);

    /**
     * Whether or not there are one or more videos that are currently playing in the webpage.
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
     * Suppresses the recording of web usage.
     * <p>
     * When this property is set to @c YES, the current usage recording is stopped, and no further usage is recorded in Screen Time.
     */
    @Generated
    @Selector("suppressUsageRecording")
    public native boolean suppressUsageRecording();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
