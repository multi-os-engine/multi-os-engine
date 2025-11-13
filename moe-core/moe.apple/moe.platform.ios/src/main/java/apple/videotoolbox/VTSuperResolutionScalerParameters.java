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
 * An object that contains both input and output parameters that the super-resolution processor needs to run on a frame.
 * 
 * Use this object in the `processWithParameters` call of the `VTFrameProcessor` class. The output parameter for this
 * class is `destinationFrame`, where the processor returns the output frame (as `VTFrameProcessorFrame`) back to you
 * once `processWithParameters` completes.
 * 
 * `VTSuperResolutionScalerParameters` are frame-level parameters.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTSuperResolutionScalerParameters extends NSObject implements VTFrameProcessorParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected VTSuperResolutionScalerParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTSuperResolutionScalerParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTSuperResolutionScalerParameters allocWithZone(VoidPtr zone);

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
    public native VTSuperResolutionScalerParameters init();

    /**
     * Creates a new super-resolution scaler parameters instance.
     * 
     * Returns `nil` if `sourceFrame` or `destinationFrame` is `nil`, or if `sourceFrame` and reference frames have
     * different pixel formats.
     * 
     * - Parameters:
     * - sourceFrame: Current source frame; must be non `nil`.
     * - previousFrame: The previous source frame in presentation time order. For the first frame you can set this to
     * `nil`.
     * - previousOutputFrame: The previous output frame in presentation time order. For the first frame you can set this
     * to `nil`.
     * - opticalFlow: Optional `VTFrameProcessorOpticalFlow` object that contains forward and backward optical flow
     * between the `sourceFrame` and `previousFrame`. You only need this if optical flow is pre-computed.
     * - submissionMode: Provides a hint to let the processor know whether you are submitting frames in presentation
     * sequence. For more information about supported modes see ``VTSuperResolutionScalerParametersSubmissionMode``.
     * - destinationFrame: User-allocated pixel buffer that receives the results.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithSourceFrame:previousFrame:previousOutputFrame:opticalFlow:submissionMode:destinationFrame:")
    public native VTSuperResolutionScalerParameters initWithSourceFramePreviousFramePreviousOutputFrameOpticalFlowSubmissionModeDestinationFrame(
            @NotNull VTFrameProcessorFrame sourceFrame, @Nullable VTFrameProcessorFrame previousFrame,
            @Nullable VTFrameProcessorFrame previousOutputFrame, @Nullable VTFrameProcessorOpticalFlow opticalFlow,
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

    @Generated
    @Owned
    @Selector("new")
    public static native VTSuperResolutionScalerParameters new_objc();

    /**
     * Optional object that contains forward and backward optical flow with the previous frame.
     * 
     * You only need this if optical flow is pre-computed. For the first frame this is `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("opticalFlow")
    @Nullable
    public native VTFrameProcessorOpticalFlow opticalFlow();

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
     * Previous output frame in presentation time order, which is `nil` for the first frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("previousOutputFrame")
    @Nullable
    public native VTFrameProcessorFrame previousOutputFrame();

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