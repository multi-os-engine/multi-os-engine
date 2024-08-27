package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNConvolutionTranspose
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSCNNConvolutionTranspose specifies a transposed convolution.
 * The MPSCNNConvolutionTranspose convolves the input image with a set of filters, each producing one feature map in the
 * output image.
 * 
 * Some third-party frameworks may rotate the weights spatially by 180 degrees for Convolution Transpose. MPS uses the
 * weights
 * specified by the developer as-is and does not perform any rotation. The developer may need to rotate the weights
 * appropriately
 * in case this rotation is needed before the convolution transpose is applied.
 * 
 * When the stride in any dimension is greater than 1, the convolution transpose puts (stride - 1) zeroes in-between the
 * source
 * image pixels to create an expanded image. Then a convolution is done over the expanded image to generate the output
 * of the
 * convolution transpose.
 * 
 * Intermediate image size = (srcSize - 1) * Stride + 1
 * 
 * Examples:
 * 
 * 
 * [@code]
 * So in case of sride == 2 (this behaves same in both dimensions)
 * 
 * Source image:
 * _______________
 * | | | | |
 * | 1 | 2 | 3 | 4 |
 * | | | | |
 * ---------------
 * 
 * Intermediate Image:
 * ___________________________
 * | | | | | | | |
 * | 1 | 0 | 2 | 0 | 3 | 0 | 4 |
 * | | | | | | | |
 * ---------------------------
 * 
 * 
 * NOTE on Offset:
 * There are 2 types of offsets defined:
 * 1) The Offset defined in MPSCNNKernel from which MPSCNNConvolutionTranspose inherits. This offset is applied to from
 * where
 * the kernel will be applied on the source.
 * 2) The kernelOffsetX and kernelOffsetY which is the offset applied to the kernel when it is finally applied on the
 * intermediate
 * image.
 * 
 * So totalOffset = Offset * stride + kernelOffset
 * 
 * The offset defined by user refers to the coordinate frame of the expanded image
 * (we are showing only 1 dimension X it can be extended to Y dimension as well) :
 * 
 * X indicates where the convolution transpose begins:
 * 
 * Intermediate Image: Offset = 0, kernelOffset = 0
 * ___________________________
 * | | | | | | | |
 * | 1 | 0 | 2 | 0 | 3 | 0 | 4 |
 * | X | | | | | | |
 * ---------------------------
 * 
 * 
 * X indicates where the convolution transpose begins:
 * 
 * Intermediate Image: Offset = 0, kernelOffset = 1
 * ___________________________
 * | | | | | | | |
 * | 1 | 0 | 2 | 0 | 3 | 0 | 4 |
 * | | X | | | | | |
 * ---------------------------
 * 
 * 
 * X indicates where the convolution transpose begins:
 * 
 * Intermediate Image: Offset = 0, kernelOffset = -1
 * ___________________________
 * | | | | | | | |
 * X | 1 | 0 | 2 | 0 | 3 | 0 | 4 |
 * | | | | | | | |
 * ---------------------------
 * 
 * 
 * 
 * 
 * So if the user wanted to apply an offset of 2 on the source image of convolution transpose:
 * 
 * Source image:
 * _______________
 * | | | | |
 * | 1 | 2 | 3 | 4 |
 * | | | X | |
 * ---------------
 * 
 * offset = 2, kernelOffset = 0
 * 
 * Intermediate Image:
 * ___________________________
 * | | | | | | | |
 * | 1 | 0 | 2 | 0 | 3 | 0 | 4 |
 * | | | | | X | | |
 * ---------------------------
 * 
 * [@endcode]
 * 
 * Note that if your application is not using MPSCNNConvolutionGradientState to configure the convolution transpose with
 * respect to convolution,
 * your application may do this using padding policy. In such case if convolution uses valid padding policy, than
 * convolution transpose should use
 * full padding policy and vice vera. Full padding remains full.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionTranspose extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionTranspose(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionTranspose alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolutionTranspose allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] groups
     * 
     * Number of groups input and output channels are divided into.
     */
    @Generated
    @Selector("groups")
    @NUInt
    public native long groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionTranspose init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNConvolutionTranspose initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * <NSSecureCoding> support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNConvolutionTranspose initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNConvolutionTranspose initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a convolution transpose kernel
     * 
     * @param device  The MTLDevice on which this MPSCNNConvolutionTranspose filter will be used
     * @param weights A pointer to a object that conforms to the MPSCNNConvolutionDataSource
     *                protocol. The MPSCNNConvolutionDataSource protocol declares the methods that an
     *                instance of MPSCNNConvolutionTranspose uses to obtain the weights and bias terms
     *                for the CNN convolutionTranspose filter. Currently we support only Float32 weights.
     * 
     * @return A valid MPSCNNConvolutionTranspose object.
     */
    @Generated
    @Selector("initWithDevice:weights:")
    public native MPSCNNConvolutionTranspose initWithDeviceWeights(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NotNull @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

    /**
     * [@property] inputFeatureChannels
     * 
     * The number of feature channels per pixel in the input image.
     */
    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

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

    /**
     * [@property] kernelOffsetX
     * 
     * Offset in X from which the kernel starts sliding
     */
    @Generated
    @Selector("kernelOffsetX")
    @NInt
    public native long kernelOffsetX();

    /**
     * [@property] kernelOffsetY
     * 
     * Offset in Y from which the kernel starts sliding
     */
    @Generated
    @Selector("kernelOffsetY")
    @NInt
    public native long kernelOffsetY();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNConvolutionTranspose new_objc();

    /**
     * [@property] outputFeatureChannels
     * 
     * The number of feature channels per pixel in the output image.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] kernelOffsetX
     * 
     * Offset in X from which the kernel starts sliding
     */
    @Generated
    @Selector("setKernelOffsetX:")
    public native void setKernelOffsetX(@NInt long value);

    /**
     * [@property] kernelOffsetY
     * 
     * Offset in Y from which the kernel starts sliding
     */
    @Generated
    @Selector("setKernelOffsetY:")
    public native void setKernelOffsetY(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Precision of accumulator used in convolution.
     * 
     * See MPSNeuralNetworkTypes.h for discussion. Default is MPSNNConvolutionAccumulatorPrecisionOptionFloat.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("accumulatorPrecisionOption")
    @NUInt
    public native long accumulatorPrecisionOption();

    /**
     * [@property] dataSource
     * 
     * dataSource with which convolution transpose object was created
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource dataSource();

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture to hold the result and return it.
     * 
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * 
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property. See discussion in MPSNeuralNetworkTypes.h.
     * 
     * Note: the regular encodeToCommandBuffer:sourceImage: method may be used when no state is needed,
     * such as when the convolution transpose operation is not balanced by a matching convolution object upstream.
     * These encode methods are for auto encoders where each convolution in inference pass is coupled with convolution
     * transpose. In order for convolution transpose to correctly undo the convolution downsampling,
     * MPSCNNConvolutionGradientState
     * produced by convolution is needed by convolution transpose to correctly size destination image.
     * These methods are only useful for inference only network. For training, use encode methods that take
     * MPSCNNConvolutionTransposeGradientState below.
     * 
     * @param commandBuffer            The command buffer
     * @param sourceImage              A MPSImage to use as the source images for the filter.
     * @param convolutionGradientState A valid MPSCNNConvolutionGradientState from the MPSCNNConvoluton counterpart to
     *                                 this MPSCNNConvolutionTranspose.
     *                                 If there is no forward convolution counterpart, pass NULL here. This state
     *                                 affects the sizing
     *                                 the result.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         The offset property will be adjusted to reflect the offset used during the encode.
     *         The returned image will be automatically released when the command buffer completes. If you want to
     *         keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     * 
     *         API-Since: 11.3
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:convolutionGradientState:")
    public native MPSImage encodeToCommandBufferSourceImageConvolutionGradientState(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable MPSCNNConvolutionGradientState convolutionGradientState);

    /**
     * API-Since: 11.3
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:convolutionGradientState:destinationImage:")
    public native void encodeToCommandBufferSourceImageConvolutionGradientStateDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable MPSCNNConvolutionGradientState convolutionGradientState, @NotNull MPSImage destinationImage);

    /**
     * These low level encode functions should be used during training. The first two encode functions, which return
     * destination image on left hand side, takes in MPSCNNConvolutionGradientState that was produced by corresponding
     * MPSCNNConvolution when there is one e.g. auto encoders. This state is used to correctly size destination being
     * returned.
     * These encode methods return MPSCNNConvoltionTransposeGradientState object on auto release pool to be consumed by
     * MPSCNNConvolutionTransposeGradient.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:convolutionGradientState:destinationState:destinationStateIsTemporary:")
    public native MPSImage encodeToCommandBufferSourceImageConvolutionGradientStateDestinationStateDestinationStateIsTemporary(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable MPSCNNConvolutionGradientState convolutionGradientState,
            @NotNull @ReferenceInfo(type = MPSCNNConvolutionTransposeGradientState.class) Ptr<MPSCNNConvolutionTransposeGradientState> outState,
            boolean isTemporary);

    /**
     * GPU side export. Enqueue a kernel to export current weights and biases stored in MPSCNNConvoltionTranspose's
     * internal buffers into weights and biases MTLBuffer
     * * returned in MPSCNNConvolutionWeightsAndBiasesState.
     * *
     * * @param commandBuffer Metal command buffer on which export kernel is enqueued.
     * * @param resultStateCanBeTemporary If FALSE, state returned will be non-temporary. If TRUE, returned state may or
     * may not be temporary.
     * * @return MPSCNNConvolutionWeightsAndBiasesState containing weights and biases buffer to which weights got
     * exported. This state and be
     * temporary or non-temporary depending on the flag resultStateCanBeTemporary
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("exportWeightsAndBiasesWithCommandBuffer:resultStateCanBeTemporary:")
    public native MPSCNNConvolutionWeightsAndBiasesState exportWeightsAndBiasesWithCommandBufferResultStateCanBeTemporary(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, boolean resultStateCanBeTemporary);

    /**
     * CPU side reload. Reload the updated weights and biases from data provider into internal weights and bias buffers.
     * Weights and biases
     * gradients needed for update are obtained from MPSCNNConvolutionTransposeGradientState object. Data provider
     * passed in init call is used for this purpose.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("reloadWeightsAndBiasesFromDataSource")
    public native void reloadWeightsAndBiasesFromDataSource();

    /**
     * GPU side reload. Reload the updated weights and biases from update buffer produced by application enqueued metal
     * kernel into internal weights
     * and biases buffer. Weights and biases gradients needed for update are obtained from
     * MPSCNNConvolutionTransposeGradientState object's gradientForWeights and gradientForBiases metal buffer.
     * 
     * @param commandBuffer Metal command buffer on which application update kernel was enqueued consuming
     *                      MPSCNNConvolutionGradientState's gradientForWeights and gradientForBiases buffers
     *                      and producing updateBuffer metal buffer.
     * @param state         MPSCNNConvolutionWeightsAndBiasesState containing weights and biases buffers which have
     *                      updated weights produced by application's update kernel.
     *                      The state readcount will be decremented.
     * 
     * 
     *                      API-Since: 13.0
     */
    @Generated
    @Selector("reloadWeightsAndBiasesWithCommandBuffer:state:")
    public native void reloadWeightsAndBiasesWithCommandBufferState(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull MPSCNNConvolutionWeightsAndBiasesState state);

    /**
     * Allocate a MPCNNConvolutionTransposeGradientState to hold the results from a -encodeBatchToCommandBuffer...
     * operation
     * 
     * @param sourceImage  The MPSImage consumed by the associated -encode call.
     * @param sourceStates The list of MPSCNNConvolutionGradientState consumed by the associated -encode call,
     *                     for a batch size of 1. In auto encoders, this state is produced by corresponding
     *                     MPSCNNConvolution.
     * 
     * @return The list of states produced by the -encode call for batch size of 1.
     *         -isResultStateReusedAcrossBatch returns YES for MPSCNNConvolutionTranspose so same
     *         state is used across entire batch. State object is not reusasable across batches.
     * 
     *         API-Since: 11.3
     */
    @Nullable
    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionTransposeGradientState resultStateForSourceImageSourceStatesDestinationImage(
            @NotNull MPSImage sourceImage, @Nullable NSArray<? extends MPSState> sourceStates,
            @NotNull MPSImage destinationImage);

    /**
     * Precision of accumulator used in convolution.
     * 
     * See MPSNeuralNetworkTypes.h for discussion. Default is MPSNNConvolutionAccumulatorPrecisionOptionFloat.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setAccumulatorPrecisionOption:")
    public native void setAccumulatorPrecisionOption(@NUInt long value);

    /**
     * API-Since: 11.3
     */
    @Nullable
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNConvolutionTransposeGradientState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull MPSImage sourceImage,
            @Nullable NSArray<? extends MPSState> sourceStates, @NotNull MPSImage destinationImage);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
