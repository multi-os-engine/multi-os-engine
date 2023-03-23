package apple.avkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVPlaybackSpeed
 * 
 * Class used to define a user selectable playback speed in a playback UI.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlaybackSpeed extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlaybackSpeed(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlaybackSpeed alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVPlaybackSpeed allocWithZone(VoidPtr zone);

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
    public native AVPlaybackSpeed init();

    /**
     * initWithRate:localizedName:
     * 
     * Initializes an AVPlaybackSpeed.
     * 
     * @param rate
     *                      The rate to be used when this playback speed is selected.
     * @param localizedName
     *                      A localized name to be displayed representing this playback speed in a UI.
     */
    @Generated
    @Selector("initWithRate:localizedName:")
    public native AVPlaybackSpeed initWithRateLocalizedName(float rate, String localizedName);

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

    /**
     * [@property] localizedName
     * 
     * A localized name for this playback speed.
     * 
     * This name will be used to represent this playback speed in playback UIs where more space is available.
     */
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * [@property] localizedNumericName
     * 
     * A localized name for this playback speed used when space is limited.
     * 
     * This name will be used to represent this playback speed in playback UIs where limited space is available.
     */
    @Generated
    @Selector("localizedNumericName")
    public native String localizedNumericName();

    @Generated
    @Owned
    @Selector("new")
    public static native AVPlaybackSpeed new_objc();

    /**
     * [@property] rate
     * 
     * The rate associated with this object. When this playback speed is selected this rate will be set in response to
     * the play button being pressed.
     */
    @Generated
    @Selector("rate")
    public native float rate();

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

    /**
     * [@property] systemDefaultSpeeds
     * 
     * A list of playback speeds to be used by default across the system.
     */
    @Generated
    @Selector("systemDefaultSpeeds")
    public static native NSArray<? extends AVPlaybackSpeed> systemDefaultSpeeds();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}