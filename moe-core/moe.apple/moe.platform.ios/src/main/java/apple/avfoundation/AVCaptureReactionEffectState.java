package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVCaptureReactionEffectState
 * 
 * Reports the state of a reaction performed on an AVCaptureDevice.
 * 
 * AVCaptureReactionEffectState may be obtained by calling -[AVCaptureDevice reactionEffectsInProgress]. When
 * -[AVCaptureDevice canPerformReactionEffects] returns YES, new entries are added either by calling -[AVCaptureDevice
 * performReactionEffect:], or by gesture detection in the capture stream when
 * AVCaptureDevice.reactionEffectGesturesEnabled. The effect rendering is done before frames are given to the capture
 * client, and these status objects let you know when these effects are performed.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureReactionEffectState extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureReactionEffectState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureReactionEffectState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureReactionEffectState allocWithZone(VoidPtr zone);

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

    /**
     * [@property] endTime
     * 
     * Provides the presentation time of the frame following the last frame where the effect is seen.
     * 
     * Will be kCMTimeInvalid while the effect is in progress, but will be updated to a valid time when the reaction
     * effect completes and the AVCaptureReactionEffectState is removed from -[AVCaptureDevice
     * reactionEffectsInProgress]. (If using NSKeyValueObservingOptionOld, you can access completed effects with valid
     * end times via NSKeyValueChangeOldKey.)
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("endTime")
    @ByValue
    public native CMTime endTime();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureReactionEffectState init();

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
    public static native AVCaptureReactionEffectState new_objc();

    /**
     * [@property] reactionType
     * 
     * Indicates the reaction which is running.
     * 
     * There may be multiple reactions of the same type at a given time. Some may come from gesture detection, some may
     * come from calls to -[AVCaptureDevice performReactionEffect:]
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("reactionType")
    @NotNull
    public native String reactionType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] startTime
     * 
     * Provides the presentation time of the first frame where the effect is being rendered.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("startTime")
    @ByValue
    public native CMTime startTime();

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
}