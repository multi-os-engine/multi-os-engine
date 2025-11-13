package apple.videotoolbox;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.videotoolbox.protocol.VTFrameProcessorParameters;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object that contains both input and output parameters that the low-latency frame interpolation processor needs.
 * 
 * Use this object in the `processWithParameters` call of `VTFrameProcessor` class.
 * 
 * `VTLowLatencyFrameInterpolationParameters` are frame-level parameters.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTLowLatencyFrameInterpolationParameters extends NSObject implements VTFrameProcessorParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected VTLowLatencyFrameInterpolationParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTLowLatencyFrameInterpolationParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTLowLatencyFrameInterpolationParameters allocWithZone(VoidPtr zone);

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
    @IsOptional
    @Selector("destinationFrame")
    @NotNull
    public native VTFrameProcessorFrame destinationFrame();

    @Generated
    @Selector("destinationFrames")
    @NotNull
    public native NSArray<? extends VTFrameProcessorFrame> destinationFrames();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTLowLatencyFrameInterpolationParameters init();

    /**
     * Creates a new low-latency frame interpolation parameters object.
     * 
     * - Parameters:
     * - sourceFrame: Current frame to use for interpolation; must be non `nil`.
     * - previousFrame: Previous frame used for interpolation; must be non `nil`.
     * - interpolationPhase: Array of float numbers that indicate interpolation phase locations at which the processor
     * interpolates the frames. Must be greater than 0 and less than 1.0; for example 0.5 is midway between the previous
     * frame and the source frame. If you enable spatial scaling, the only supported interpolation phase is 0.5.
     * - destinationFrames: Caller-allocated array of `VTFrameProcessorFrame` to receive the interpolated frames. This
     * must have the same number of elements as the the `interpolationPhase`. If you enable spatial scaling, it must
     * also
     * contain an element to hold the scaled version of sourceFrame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithSourceFrame:previousFrame:interpolationPhase:destinationFrames:")
    public native VTLowLatencyFrameInterpolationParameters initWithSourceFramePreviousFrameInterpolationPhaseDestinationFrames(
            @NotNull VTFrameProcessorFrame sourceFrame, @NotNull VTFrameProcessorFrame previousFrame,
            @NotNull NSArray<? extends NSNumber> interpolationPhase,
            @NotNull NSArray<? extends VTFrameProcessorFrame> destinationFrames);

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

    /**
     * Array of interpolation phases that you provided when creating the low-latency frame interpolation parameters
     * object.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("interpolationPhase")
    @NotNull
    public native NSArray<? extends NSNumber> interpolationPhase();

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
    public static native VTLowLatencyFrameInterpolationParameters new_objc();

    /**
     * Previous frame that you provided when creating the low-latency frame interpolation parameters object.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("previousFrame")
    @NotNull
    public native VTFrameProcessorFrame previousFrame();

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
    @Selector("sourceFrame")
    @NotNull
    public native VTFrameProcessorFrame sourceFrame();

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