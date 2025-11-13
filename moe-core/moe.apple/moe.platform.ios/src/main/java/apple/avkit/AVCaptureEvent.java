package apple.avkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * An object that describes a user interaction with a system hardware button.
 * 
 * Inspect a capture event’s ``phase`` to determine whether the event begins, ends, or is in a canceled state.
 * 
 * API-Since: 17.2
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureEvent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureEvent allocWithZone(VoidPtr zone);

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
    public native AVCaptureEvent init();

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
    public static native AVCaptureEvent new_objc();

    /**
     * The current phase of a capture event.
     * 
     * API-Since: 17.2
     */
    @Generated
    @Selector("phase")
    @NUInt
    public native long phase();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Plays the specified capture sound through AirPods.
     * 
     * - Parameter sound: The capture sound to play for this event.
     * - Returns: A Boolean value that indicates whether the system played the sound.
     * 
     * This method has no effect if ``shouldPlaySound`` is `false` or if the event object's lifetime exceeds 15 seconds.
     * 
     * > Important: To use AirPods Camera Control, it must be available in your country or region. AirPods Camera
     * Control is not currently available in the European Union.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("playSound:")
    public native boolean playSound(@NotNull AVCaptureEventSound sound);

    /**
     * A Boolean value that indicates whether you must play a sound manually.
     * 
     * This property is `true` only when both of the following conditions are true:
     * 1. A person performs an AirPod stem click.
     * 2. You disable the default capture sound.
     * 
     * If this property is `false`, calling ``playSound:`` has no effect. Omitting the sound when expected can
     * significantly impact the user experience.
     * 
     * > Important: To use AirPods Camera Control, it must be available in your country or region. AirPods Camera
     * Control is not currently available in the European Union.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shouldPlaySound")
    public native boolean shouldPlaySound();
}