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
 * Encapsulates the frame-level parameters necessary for processing a source frame using temporal noise-filter
 * processor.
 * 
 * This object is intended for sending input parameters into the `processWithParameters` method of the
 * `VTFrameProcessor`
 * class. Temporal noise-filter processor utilizes past and future reference frames, provided in presentation time
 * order,
 * to reduce noise from the source frame. The `previousFrameCount` and `nextFrameCount` properties in
 * ``VTTemporalNoiseFilterConfiguration`` represent the maximum number of past and future reference frames that the
 * processor can use to achieve optimum noise reduction quality. The number of reference frames provided shall depend
 * on their availability, but at a minimum, you must provide one reference frame, either past or future. The parameter
 * `destinationFrame` stores the output frame that the processor returns to the caller upon the successful completion
 * of the `processWithParameters` operation.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTTemporalNoiseFilterParameters extends NSObject implements VTFrameProcessorParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected VTTemporalNoiseFilterParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTTemporalNoiseFilterParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTTemporalNoiseFilterParameters allocWithZone(VoidPtr zone);

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

    /**
     * A parameter to control the strength of noise-filtering. The value can range from the minimum strength of 0.0 to
     * the maximum strength of 1.0. Change in filter strength causes the processor to flush all frames in the queue
     * prior to processing the source frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("filterStrength")
    public native float filterStrength();

    /**
     * A Boolean that indicates sequence discontinuity, forcing the processor to reset prior to processing the source
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("hasDiscontinuity")
    public native boolean hasDiscontinuity();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VTTemporalNoiseFilterParameters init();

    /**
     * Creates a new `VTTemporalNoiseFilterParameters` object.
     * 
     * - Parameters:
     * - sourceFrame: Current source frame; must be non `nil`.
     * - nextFrames: Future reference frames in presentation time order to use for processing the source frame. The
     * number
     * of frames can vary from 0 to the number specified by ``VTTemporalNoiseFilterConfiguration/nextFrameCount``
     * property.
     * - previousFrames: Past reference frames in presentation time order to use for processing the source frame. The
     * number
     * of frames can vary from 0 to the number specified by ``VTTemporalNoiseFilterConfiguration/previousFrameCount``
     * property.
     * - destinationFrame: User-allocated pixel buffer that receives the output frame. The pixel format of
     * `destinationFrame`
     * must match with that of the `sourceFrame`.
     * - filterStrength: Strength of the noise-filtering to use. The value can range from the minimum strength of 0.0 to
     * the
     * maximum strength of 1.0. Change in filter strength causes the processor to flush all frames in the queue prior to
     * processing the source frame.
     * - hasDiscontinuity: Marks sequence discontinuity, forcing the processor to reset prior to processing the source
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithSourceFrame:nextFrames:previousFrames:destinationFrame:filterStrength:hasDiscontinuity:")
    public native VTTemporalNoiseFilterParameters initWithSourceFrameNextFramesPreviousFramesDestinationFrameFilterStrengthHasDiscontinuity(
            @NotNull VTFrameProcessorFrame sourceFrame, @NotNull NSArray<? extends VTFrameProcessorFrame> nextFrames,
            @NotNull NSArray<? extends VTFrameProcessorFrame> previousFrames,
            @NotNull VTFrameProcessorFrame destinationFrame, float filterStrength, byte hasDiscontinuity);

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
    public static native VTTemporalNoiseFilterParameters new_objc();

    /**
     * Future reference frames in presentation time order that you use to process the source frame.
     * 
     * The number of frames can vary from 0 to the number specified by the `nextFrameCount` property in
     * `VTTemporalNoiseFilterConfiguration`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("nextFrames")
    @NotNull
    public native NSArray<? extends VTFrameProcessorFrame> nextFrames();

    /**
     * Past reference frames in presentation time order that you use to process the source frame.
     * 
     * The number of frames can vary from 0 to the number specified by the `previousFrameCount` property in
     * `VTTemporalNoiseFilterConfiguration`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("previousFrames")
    @NotNull
    public native NSArray<? extends VTFrameProcessorFrame> previousFrames();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A parameter to control the strength of noise-filtering. The value can range from the minimum strength of 0.0 to
     * the maximum strength of 1.0. Change in filter strength causes the processor to flush all frames in the queue
     * prior to processing the source frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFilterStrength:")
    public native void setFilterStrength(float value);

    /**
     * A Boolean that indicates sequence discontinuity, forcing the processor to reset prior to processing the source
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setHasDiscontinuity:")
    public native void setHasDiscontinuity(boolean value);

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