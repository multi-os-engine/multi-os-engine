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
 * An object that contains both input and output parameters, which the frame-rate conversion processor needs to process
 * a frame.
 * 
 * Use this object as a parameter to the ``VTFrameProcessor/processWithParameters`` method. The output parameter for
 * this class is ``destinationFrame`` where the processor returns output frame (as mutable ``VTFrameProcessorFrame``)
 * back to you once the `processWithParameters` completes.
 * 
 * `VTFrameRateConversionParameters` are frame-level parameters.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTFrameRateConversionParameters extends NSObject implements VTFrameProcessorParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected VTFrameRateConversionParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTFrameRateConversionParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTFrameRateConversionParameters allocWithZone(VoidPtr zone);

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
    public native VTFrameRateConversionParameters init();

    /**
     * Creates new frame rate conversion parameters.
     * 
     * Returns `nil` if `sourceFrame` or `nextFrame` is `nil`, if `sourceFrame` and reference frames don't have the same
     * pixel format, or if `interpolationPhase` array count does not match `destinationFrames` array count.
     * 
     * - Parameters:
     * - sourceFrame: Current source frame; must be non `nil`.
     * - nextFrame: Next source frame in presentation time order; must be non `nil`.
     * - opticalFlow: Optional ``VTFrameProcessorOpticalFlow`` object that contains forward and backward optical flow
     * with
     * next frame. You only need to use this if the optical flow is pre-computed. For the first frame this is always
     * `nil`.
     * - interpolationPhase: Array of float numbers that indicate intervals at which the processor inserts a frame
     * between
     * current and next frame. The array size indicates how many frames to interpolate and this size must match
     * `destinationFrames` size, with one interval for each destination frame. Use float number values between 0 and 1,
     * for example, to insert one frame in the middle use a value of 0.5.
     * - submissionMode: Provides a hint to let the processor know whether you are submitting frames in presentation
     * sequence. For more information about supported modes see ``VTFrameRateConversionParametersSubmissionMode``.
     * - destinationFrames: Caller-allocated array of ``VTFrameProcessorFrame`` that contains pixel buffers to receive
     * the results. Must contain the same number of elements as `interpolationPhase`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithSourceFrame:nextFrame:opticalFlow:interpolationPhase:submissionMode:destinationFrames:")
    public native VTFrameRateConversionParameters initWithSourceFrameNextFrameOpticalFlowInterpolationPhaseSubmissionModeDestinationFrames(
            @NotNull VTFrameProcessorFrame sourceFrame, @NotNull VTFrameProcessorFrame nextFrame,
            @Nullable VTFrameProcessorOpticalFlow opticalFlow, @NotNull NSArray<? extends NSNumber> interpolationPhase,
            @NInt long submissionMode, @NotNull NSArray<? extends VTFrameProcessorFrame> destinationFrame);

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
     * Array of float numbers that indicate intervals at which the processor inserts a frame between the current and
     * next frame.
     * 
     * Array size indicates how many frames to interpolate and must match `destinationFrames` size, one interval for
     * each destination frame. Use float number values between 0 and 1, for example, to insert one frame in the middle
     * use a value of 0.5.
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
    public static native VTFrameRateConversionParameters new_objc();

    /**
     * The next source frame in presentation time order, which is `nil` for the last frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("nextFrame")
    @Nullable
    public native VTFrameProcessorFrame nextFrame();

    /**
     * An optional object that contains forward and backward optical flow with next frame.
     * 
     * Only needed if optical flow is pre-computed. For the last frame this is `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("opticalFlow")
    @Nullable
    public native VTFrameProcessorOpticalFlow opticalFlow();

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

    /**
     * Ordering of the input frames in this submission relative to the previous submission.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("submissionMode")
    @NInt
    public native long submissionMode();

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