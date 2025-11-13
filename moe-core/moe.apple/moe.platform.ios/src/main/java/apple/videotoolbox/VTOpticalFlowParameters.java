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
 * An object that contains both input and output parameters the frame processor needs to generate optical flow between
 * two frames.
 * 
 * Use this object in the `processWithParameters` call of `VTFrameProcessor` class. The output parameter for this class
 * is `destinationOpticalFlow` where the processor returns the output flow (as mutable `VTFrameProcessorOpticalFlow`)
 * back to you once the `processWithParameters` completes.
 * 
 * `VTOpticalFlowParameters` are frame-level parameters.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTOpticalFlowParameters extends NSObject implements VTFrameProcessorParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected VTOpticalFlowParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTOpticalFlowParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTOpticalFlowParameters allocWithZone(VoidPtr zone);

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
    @IsOptional
    @Selector("destinationFrames")
    @NotNull
    public native NSArray<? extends VTFrameProcessorFrame> destinationFrames();

    /**
     * Output optical flow calculated by the processor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("destinationOpticalFlow")
    @NotNull
    public native VTFrameProcessorOpticalFlow destinationOpticalFlow();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTOpticalFlowParameters init();

    /**
     * Creates a new optical flow parameters object.
     * 
     * Returns `nil` if `sourceFrame` or `nextFrame` is `nil`, or if `sourceFrame` and `nextFrame` have different pixel
     * formats.
     * 
     * - Parameters:
     * - sourceFrame: Current source frame; must be non `nil`.
     * - nextFrame: Next source frame in presentation time order.
     * - submissionMode: Provides a hint to let the processor know whether you are submitting frames in presentation
     * sequence. For more information about supported modes see ``VTOpticalFlowParametersSubmissionMode``.
     * - destinationOpticalFlow: User allocated `VTFrameProcessorOpticalFlow` that receives the results.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithSourceFrame:nextFrame:submissionMode:destinationOpticalFlow:")
    public native VTOpticalFlowParameters initWithSourceFrameNextFrameSubmissionModeDestinationOpticalFlow(
            @NotNull VTFrameProcessorFrame sourceFrame, @NotNull VTFrameProcessorFrame nextFrame,
            @NInt long submissionMode, @NotNull VTFrameProcessorOpticalFlow destinationOpticalFlow);

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
    public static native VTOpticalFlowParameters new_objc();

    /**
     * The next source frame in presentation time order.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("nextFrame")
    @NotNull
    public native VTFrameProcessorFrame nextFrame();

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