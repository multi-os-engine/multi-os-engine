package apple.avfoundation;

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
 * AVVideoPerformanceMetrics
 * 
 * [SPI] An instance of AVVideoPerformanceMetrics provides current performance metrics.
 * 
 * An instance of AVVideoPerformanceMetrics provides named properties for accessing the video playback quality metrics.
 * Subclasses of this type that are used from Swift must fulfill the requirements of a Sendable type.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoPerformanceMetrics extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVVideoPerformanceMetrics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVVideoPerformanceMetrics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVVideoPerformanceMetrics allocWithZone(VoidPtr zone);

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
    public native AVVideoPerformanceMetrics init();

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
    public static native AVVideoPerformanceMetrics new_objc();

    /**
     * [@property] numberOfCorruptedFrames
     * 
     * [SPI] The total number of corrupted frames that have been detected.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("numberOfCorruptedFrames")
    @NInt
    public native long numberOfCorruptedFrames();

    /**
     * [@property] numberOfDroppedFrames
     * 
     * [SPI] The total number of frames dropped prior to decoding or dropped because a frame missed its display
     * deadline.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("numberOfDroppedFrames")
    @NInt
    public native long numberOfDroppedFrames();

    /**
     * [@property] numberOfFramesDisplayedUsingOptimizedCompositing
     * 
     * [SPI] The total number of full screen frames that were rendered in a special power-efficient mode that didn't
     * require the frame to be composited with other UI elements.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("numberOfFramesDisplayedUsingOptimizedCompositing")
    @NInt
    public native long numberOfFramesDisplayedUsingOptimizedCompositing();

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
     * [@property] totalAccumulatedFrameDelay
     * 
     * [SPI] The accumulated amount of time between the prescribed presentation times of displayed video frames and the
     * actual time at which they were displayed.
     * 
     * This delay is always greater than or equal to zero since frames must never be displayed before their presentation
     * time. Non-zero delays are a sign of playback jitter and possible loss of A/V sync.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("totalAccumulatedFrameDelay")
    public native double totalAccumulatedFrameDelay();

    /**
     * [@property] totalNumberOfFrames
     * 
     * [SPI] The total number of frames that would have been displayed if no frames are dropped.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("totalNumberOfFrames")
    @NInt
    public native long totalNumberOfFrames();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}