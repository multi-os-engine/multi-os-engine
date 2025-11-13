package apple.videotoolbox;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * An object that contains both input and output parameters that the motion blur processor needs to run on a frame.
 * 
 * Use this object in the `processWithParameters` call of `VTFrameProcessor` class. The output parameter for this class
 * is `destinationFrame` where the processor returns the output frame (as `VTFrameProcessorFrame`) back to you once the
 * `processWithParameters` completes.
 * 
 * `VTMotionBlurParameters` are frame-level parameters.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTMotionBlurParameters extends NSObject implements VTFrameProcessorParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected VTMotionBlurParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTMotionBlurParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTMotionBlurParameters allocWithZone(VoidPtr zone);

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
    @Selector("destinationFrame")
    @NotNull
    public native VTFrameProcessorFrame destinationFrame();

    @Generated
    @IsOptional
    @Selector("destinationFrames")
    @NotNull
    public native NSArray<? extends VTFrameProcessorFrame> destinationFrames();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTMotionBlurParameters init();

    /**
     * Creates a new motion blur parameters object.
     * 
     * Returns `nil` if `sourceFrame` or `destinationFrame` is `nil`, `sourceFrame` and reference frames are different
     * pixel
     * formats, or `motionBlurStrength` is out of range.
     * 
     * - Parameters:
     * - sourceFrame: Current source frame; must be non `nil`.
     * - nextFrame: Next source frame in presentation time order; for the last frame you can set this to `nil`.
     * - previousFrame: Previous source frame in presentation time order; for the first frame you can set this to `nil`.
     * - nextOpticalFlow: Optional `VTFrameProcessorOpticalFlow` object that contains forward and backward optical flow
     * with `nextFrame`. You only need this object if optical flow is pre-computed. For the last frame this is always
     * `nil`.
     * - previousOpticalFlow: Optional VTFrameProcessorOpticalFlow object that contains forward and backward optical
     * flow
     * with `previousFrame`. You only need to use this if the optical flow is pre-computed. For the first frame this is
     * always `nil`.
     * - motionBlurStrength: Number that indicates the strength of blur applied by the processor. Range is from 1 to
     * 100. Default value is 50.
     * - submissionMode: Provides a hint to let the processor know whether you are submitting frames in presenatation
     * sequence. For more information about supported modes see ``VTMotionBlurParametersSubmissionMode``.
     * - destinationFrame: User-allocated pixel buffer that receives a frame with motion blur applied by the processor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithSourceFrame:nextFrame:previousFrame:nextOpticalFlow:previousOpticalFlow:motionBlurStrength:submissionMode:destinationFrame:")
    public native VTMotionBlurParameters initWithSourceFrameNextFramePreviousFrameNextOpticalFlowPreviousOpticalFlowMotionBlurStrengthSubmissionModeDestinationFrame(
            @NotNull VTFrameProcessorFrame sourceFrame, @Nullable VTFrameProcessorFrame nextFrame,
            @Nullable VTFrameProcessorFrame previousFrame, @Nullable VTFrameProcessorOpticalFlow nextOpticalFlow,
            @Nullable VTFrameProcessorOpticalFlow previousOpticalFlow, @NInt long motionBlurStrength,
            @NInt long submissionMode, @NotNull VTFrameProcessorFrame destinationFrame);

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

    /**
     * Number that indicates the strength of motion blur.
     * 
     * The range is from 1 to 100; the default value is 50.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionBlurStrength")
    @NInt
    public native long motionBlurStrength();

    @Generated
    @Owned
    @Selector("new")
    public static native VTMotionBlurParameters new_objc();

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
     * Optional frame processor optical flow object that contains forward and backward optical flow with next frame.
     * 
     * You only need to use this object if the optical flow is pre-computed. For the last frame this is `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("nextOpticalFlow")
    @Nullable
    public native VTFrameProcessorOpticalFlow nextOpticalFlow();

    /**
     * Previous source frame in presentation time order, which is `nil` for the first frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("previousFrame")
    @Nullable
    public native VTFrameProcessorFrame previousFrame();

    /**
     * Optional frame processor optical flow object that contains forward and backward optical flow with previous frame.
     * 
     * You only need to use this object if the optical flow is pre-computed. For the first frame this is `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("previousOpticalFlow")
    @Nullable
    public native VTFrameProcessorOpticalFlow previousOpticalFlow();

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
     * Ordering of the input frames this submission related to the previous submission.
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