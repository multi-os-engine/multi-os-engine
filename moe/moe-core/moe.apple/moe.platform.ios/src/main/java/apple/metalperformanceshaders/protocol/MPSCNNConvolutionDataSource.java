package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.MPSCNNConvolutionDescriptor;
import apple.metalperformanceshaders.MPSCNNConvolutionGradientState;
import apple.metalperformanceshaders.MPSCNNConvolutionWeightsAndBiasesState;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MPSCNNConvolutionDataSource
 * <p>
 * Provides convolution filter weights and bias terms
 * <p>
 * The MPSCNNConvolutionDataSource protocol declares the methods that an
 * instance of MPSCNNConvolution uses to obtain the weights and bias terms
 * for the CNN convolution filter.
 * <p>
 * Why? CNN weights can be large. If multiple copies of all the weights
 * for all the convolutions are available unpacked in memory at the same
 * time, some devices can run out of memory. The MPSCNNConvolutionDataSource
 * is used to encapsulate a reference to the weights such as a file path,
 * so that unpacking can be deferred until needed, then purged soon thereafter
 * so that not all of the data must be in memory at the same time.
 * MPS does not provide a class that conforms to this protocol. It is up to
 * the developer to craft his own to encapsulate his data.
 * <p>
 * Batch normalization and the neuron activation function are handled using the
 * -descriptor method.
 * <p>
 * Thread safety: The MPSCNNConvolutionDataSource object can be called by
 * threads that are not the main thread. If you will be creating multiple
 * MPSNNGraph objects concurrently in multiple threads and these share
 * MPSCNNConvolutionDataSources, then the data source objects may be called
 * reentrantly.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSCNNConvolutionDataSource")
public interface MPSCNNConvolutionDataSource extends NSCopying {
    /**
     * Returns a pointer to the bias terms for the convolution.
     * <p>
     * Each entry in the array is a single precision IEEE-754 float
     * and represents one bias. The number of entries is equal
     * to outputFeatureChannels.
     * <p>
     * Frequently, this function is a single line of code to return
     * a pointer to memory allocated in -load. It may also just
     * return nil.
     * <p>
     * Note: bias terms are always float, even when the weights are not.
     */
    @Generated
    @Selector("biasTerms")
    FloatPtr biasTerms();

    /**
     * Alerts MPS what sort of weights are provided by the object
     * <p>
     * For MPSCNNConvolution, MPSDataTypeUInt8, MPSDataTypeFloat16
     * and MPSDataTypeFloat32 are supported for normal convolutions
     * using MPSCNNConvolution. MPSCNNBinaryConvolution assumes weights to be
     * of type MPSDataTypeUInt32 always.
     */
    @Generated
    @Selector("dataType")
    int dataType();

    /**
     * Return a MPSCNNConvolutionDescriptor as needed
     * <p>
     * MPS will not modify this object other than perhaps to retain it.
     * User should set the appropriate neuron in the creation of convolution descriptor
     * and for batch normalization use:
     * [@code]
     * -setBatchNormalizationParametersForInferenceWithMean:variance:gamma:beta:epsilon:
     * [@endcode]
     *
     * @return A MPSCNNConvolutionDescriptor that describes the kernel housed by this object.
     */
    @Generated
    @Selector("descriptor")
    MPSCNNConvolutionDescriptor descriptor();

    /**
     * A label that is transferred to the convolution at init time
     * <p>
     * Overridden by a MPSCNNConvolutionNode.label if it is non-nil.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * Alerts the data source that the data will be needed soon
     * <p>
     * Each load alert will be balanced by a purge later, when MPS
     * no longer needs the data from this object.
     * Load will always be called atleast once after initial construction
     * or each purge of the object before anything else is called.
     * Note: load may be called to merely inspect the descriptor.
     * In some circumstances, it may be worthwhile to postpone
     * weight and bias construction until they are actually needed
     * to save touching memory and keep the working set small.
     * The load function is intended to be an opportunity to open
     * files or mark memory no longer purgeable.
     *
     * @return Returns YES on success. If NO is returned, expect MPS
     *         object construction to fail.
     */
    @Generated
    @Selector("load")
    boolean load_objc();

    /**
     * A pointer to a 256 entry lookup table containing the values to use for the weight range [0,255]
     */
    @Generated
    @IsOptional
    @Selector("lookupTableForUInt8Kernel")
    default FloatPtr lookupTableForUInt8Kernel() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Alerts the data source that the data is no longer needed
     * <p>
     * Each load alert will be balanced by a purge later, when MPS
     * no longer needs the data from this object.
     */
    @Generated
    @Selector("purge")
    void purge();

    /**
     * Returns a pointer to the weights for the convolution.
     * <p>
     * The type of each entry in array is given by -dataType. The number
     * of entries is equal to:
     * [@code]
     * inputFeatureChannels * outputFeatureChannels * kernelHeight * kernelWidth
     * [@endcode]
     * The layout of filter weight is as a 4D tensor (array)
     * weight[ outputChannels ][ kernelHeight ][ kernelWidth ][ inputChannels / groups ]
     * <p>
     * Frequently, this function is a single line of code to return
     * a pointer to memory allocated in -load.
     * <p>
     * Batch normalization parameters are set using -descriptor.
     * <p>
     * Note: For binary-convolutions the layout of the weights are:
     * weight[ outputChannels ][ kernelHeight ][ kernelWidth ][ floor((inputChannels/groups)+31) / 32 ]
     * with each 32 sub input feature channel index specified in machine byte order, so that for example
     * the 13th feature channel bit can be extracted using bitmask = (1U << 13).
     */
    @Generated
    @Selector("weights")
    VoidPtr weights();

    /**
     * When copyWithZone:device on convolution is called, data source copyWithZone:device
     * will be called if data source object responds to this selector. If not, copyWithZone:
     * will be called if data source responds to it. Otherwise, it is simply retained.
     * This is to allow application to make a separate copy of data source in convolution
     * when convolution itself is coplied, for example when copying training graph for running
     * on second GPU so that weights update on two different GPUs dont end up stomping same
     * data source.
     */
    @Generated
    @Owned
    @IsOptional
    @Selector("copyWithZone:device:")
    default MPSCNNConvolutionDataSource copyWithZoneDevice(VoidPtr zone,
            @Mapped(ObjCObjectMapper.class) MTLDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Callback for the MPSNNGraph to update the convolution weights on GPU.
     * <p>
     * It is the resposibility of this method to decrement the read count of both the gradientState
     * and the sourceState before returning. BUG: prior to macOS 10.14, ios/tvos 12.0, the MPSNNGraph
     * incorrectly decrements the readcount of the gradientState after this method is called.
     *
     * @param commandBuffer The command buffer on which to do the update.
     *                      MPSCNNConvolutionGradientNode.MPSNNTrainingStyle controls where you want your update
     *                      to happen. Provide implementation of this function for GPU side update.
     * @param gradientState A state object produced by the MPSCNNConvolution and updated by MPSCNNConvolutionGradient
     *                      containing weight gradients.
     * @param sourceState   A state object containing the convolution weights
     * @return If NULL, no update occurs. If nonnull, the result will be used to update the
     *         weights in the MPSNNGraph
     */
    @Generated
    @IsOptional
    @Selector("updateWithCommandBuffer:gradientState:sourceState:")
    default MPSCNNConvolutionWeightsAndBiasesState updateWithCommandBufferGradientStateSourceState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState gradientState, MPSCNNConvolutionWeightsAndBiasesState sourceState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Callback for the MPSNNGraph to update the convolution weights on CPU.
     * MPSCNNConvolutionGradientNode.MPSNNTrainingStyle controls where you want your update
     * to happen. Provide implementation of this function for CPU side update.
     *
     * @param gradientState A state object produced by the MPSCNNConvolution and updated by MPSCNNConvolutionGradient
     *                      containing weight gradients. MPSNNGraph is responsible for calling [gradientState
     *                      synchronizeOnCommandBuffer:]
     *                      so that application get correct gradients for CPU side update.
     * @param sourceState   A state object containing the convolution weights used. MPSCNNConvolution and
     *                      MPSCNNConvolutionGradient reloadWeightsWithDataSource
     *                      will be called right after this method is called. Note that the weights returned here may
     *                      not match the weights
     *                      in your data source due to conversion loss. These are the weights actually used, and should
     *                      be what you use to calculate the new weights. Your copy may be incorrect. Write the new
     *                      weights
     *                      to your copy and return them out the left hand side.
     * @return TRUE if success/no error, FALSE in case of failure.
     */
    @Generated
    @IsOptional
    @Selector("updateWithGradientState:sourceState:")
    default boolean updateWithGradientStateSourceState(MPSCNNConvolutionGradientState gradientState,
            MPSCNNConvolutionWeightsAndBiasesState sourceState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Layout of weights returned by data source. Currently only OHWI layout is supported which is default.
     * See MPSCNNConvolutionWeightsLayout above.
     */
    @Generated
    @IsOptional
    @Selector("weightsLayout")
    default int weightsLayout() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Quantizaiton type of weights. If it returns MPSCNNWeightsQuantizationTypeLookupTable,
     * lookupTableForUInt8Kernel method must be implmented. if it returns MPSCNNWeightsQuantizationTypeLookupLinear,
     * rangesForUInt8Kernel method must be implemented.
     */
    @Generated
    @IsOptional
    @Selector("weightsQuantizationType")
    default int weightsQuantizationType() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Alerts MPS what weight precision to use in the CNNConvolution kernel
     * <p>
     * If precision of weights returned by dataType does not match precision returned by
     * kernelWeightsDataType, weights are converted to precision specified by kernelWeightsDataType
     * before being passed to kernel.
     * For MPSCNNConvolution, dataType precisions of MPSDataTypeUInt8 or MPSDataTypeFloat16
     * must return a kernelWeightsDataType of MPSDataTypeFloat16. dataType precisions of
     * MPSDataTypeFloat32 may return kernelWeightsDataType of MPSDataTypeFloat16 or
     * MPSDataTypeFloat32. When kernelWeightsDataType returns MPSDataTypeFloat32 the
     * accumulatorPrecisionOption on the CNNConvolution object must be set to
     * MPSNNConvolutionAccumulatorPrecisionOptionFloat.
     * When kernelWeightsDataType is unimplemented the kernel will use float16 precision.
     * MPSCNNBinaryConvolution assumes weights to be of type MPSDataTypeUInt32 always,
     * and the kernelWeightsDataType is unused.
     */
    @Generated
    @IsOptional
    @Selector("kernelWeightsDataType")
    default int kernelWeightsDataType() {
        throw new java.lang.UnsupportedOperationException();
    }
}
