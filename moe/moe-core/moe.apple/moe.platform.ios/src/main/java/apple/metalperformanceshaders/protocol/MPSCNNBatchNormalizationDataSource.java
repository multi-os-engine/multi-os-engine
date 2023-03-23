package apple.metalperformanceshaders.protocol;

import apple.foundation.NSCoder;
import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.MPSCNNBatchNormalizationState;
import apple.metalperformanceshaders.MPSCNNNormalizationGammaAndBetaState;
import apple.metalperformanceshaders.MPSCNNNormalizationMeanAndVarianceState;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MPSCNNBatchNormalizationDataSource
 * 
 * The MPSCNNBatchNormalizationDataSource protocol declares the methods that an
 * instance of MPSCNNBatchNormalizationState uses to initialize the
 * scale factors, bias terms, and batch statistics.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSCNNBatchNormalizationDataSource")
public interface MPSCNNBatchNormalizationDataSource extends NSCopying {
    /**
     * Returns a pointer to the bias terms for the batch normalization.
     * If NULL then no bias is to be applied.
     */
    @Generated
    @Selector("beta")
    FloatPtr beta();

    /**
     * Optional copy method to create a copy of the data source for use with a new device.
     * 
     * @param zone   The NSZone on which to allocate.
     * @param device The device where the kernel which uses this data source will be used.
     * 
     * @return A pointer to a copy of this data source.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @Owned
    @IsOptional
    @Selector("copyWithZone:device:")
    default MPSCNNBatchNormalizationDataSource copyWithZoneDevice(VoidPtr zone,
            @Mapped(ObjCObjectMapper.class) MTLDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * NSSecureCoding compatibility.
     */
    @Generated
    @IsOptional
    @Selector("encodeWithCoder:")
    default void encodeWithCoder(NSCoder aCoder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * An optional tiny number to use to maintain numerical stability.
     * 
     * output_image = (input_image - mean[c]) * gamma[c] / sqrt(variance[c] + epsilon) + beta[c];
     * Defalt value if method unavailable: FLT_MIN
     */
    @Generated
    @IsOptional
    @Selector("epsilon")
    default float epsilon() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns a pointer to the scale factors for the batch normalization.
     */
    @Generated
    @Selector("gamma")
    FloatPtr gamma();

    /**
     * NSSecureCoding compatibility.
     */
    @Generated
    @IsOptional
    @Selector("initWithCoder:")
    default MPSCNNBatchNormalizationDataSource initWithCoder(NSCoder aDecoder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A label that is transferred to the batch normalization filter at init time
     * 
     * Overridden by a MPSCNNBatchNormalizationNode.label if it is non-nil.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * Alerts the data source that the data will be needed soon
     * 
     * Each load alert will be balanced by a purge later, when MPS
     * no longer needs the data from this object.
     * Load will always be called atleast once after initial construction
     * or each purge of the object before anything else is called.
     * 
     * @return Returns YES on success. If NO is returned, expect MPS
     *         object construction to fail.
     */
    @Generated
    @Selector("load")
    boolean load_objc();

    /**
     * Returns a pointer to batch mean values with which to initialize
     * the state for a subsequent batch normalization.
     */
    @Generated
    @Selector("mean")
    FloatPtr mean();

    /**
     * Returns the number of feature channels within images to be normalized
     * using the supplied parameters.
     */
    @Generated
    @Selector("numberOfFeatureChannels")
    @NUInt
    long numberOfFeatureChannels();

    /**
     * Alerts the data source that the data is no longer needed
     * 
     * Each load alert will be balanced by a purge later, when MPS
     * no longer needs the data from this object.
     */
    @Generated
    @Selector("purge")
    void purge();

    /**
     * NSSecureCoding compatibility.
     */
    @Generated
    @IsOptional
    @Selector("supportsSecureCoding")
    @ProtocolClassMethod("supportsSecureCoding")
    default boolean _supportsSecureCoding() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Compute new gamma and beta values using current values and gradients contained within a
     * MPSCNNBatchNormalizationState. Perform the update using the CPU.
     * 
     * @param batchNormalizationState The MPSCNNBatchNormalizationState object containing the current gamma and
     *                                beta values and the gradient values.
     * 
     * @return A boolean value indicating if the update was performed.
     */
    @Generated
    @IsOptional
    @Selector("updateGammaAndBetaWithBatchNormalizationState:")
    default boolean updateGammaAndBetaWithBatchNormalizationState(
            MPSCNNBatchNormalizationState batchNormalizationState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Compute new gamma and beta values using current values and gradients contained within a
     * MPSCNNBatchNormalizationState. Perform the update using a GPU.
     * 
     * This operation is expected to also decrement the read count of batchNormalizationState by 1.
     * 
     * @param commandBuffer           The command buffer on which to encode the update.
     * 
     * @param batchNormalizationState The MPSCNNBatchNormalizationState object containing the current gamma and
     *                                beta values and the gradient values.
     * 
     * @return A MPSCNNNormalizationMeanAndVarianceState object containing updated mean and variance values. If NULL,
     *         the MPSNNGraph
     *         batch normalization filter gamma and beta values will remain unmodified.
     */
    @Generated
    @IsOptional
    @Selector("updateGammaAndBetaWithCommandBuffer:batchNormalizationState:")
    default MPSCNNNormalizationGammaAndBetaState updateGammaAndBetaWithCommandBufferBatchNormalizationState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Compute new mean and variance values using current batch statistics contained within a
     * MPSCNNBatchNormalizationState. Perform the update using the CPU.
     * 
     * @param batchNormalizationState The MPSCNNBatchNormalizationState object containing the current batch statistics.
     * 
     * @return A boolean value indicating if the update was performed.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("updateMeanAndVarianceWithBatchNormalizationState:")
    default boolean updateMeanAndVarianceWithBatchNormalizationState(
            MPSCNNBatchNormalizationState batchNormalizationState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Compute new mean and variance values using current batch statistics contained within a
     * MPSCNNBatchNormalizationState. Perform the update using a GPU.
     * 
     * This operation is expected to also decrement the read count of batchNormalizationState by 1.
     * 
     * @param commandBuffer           The command buffer on which to encode the update.
     * 
     * @param batchNormalizationState The MPSCNNBatchNormalizationState object containing the current batch statistics.
     * 
     * @return A MPSCNNNormalizationMeanAndVarianceState object containing updated mean and variance values. If NULL,
     *         the MPSNNGraph
     *         batch normalization filter mean and variance values will remain unmodified.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("updateMeanAndVarianceWithCommandBuffer:batchNormalizationState:")
    default MPSCNNNormalizationMeanAndVarianceState updateMeanAndVarianceWithCommandBufferBatchNormalizationState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns a pointer to batch variance values with which to initialize
     * the state for a subsequent batch normalization.
     */
    @Generated
    @Selector("variance")
    FloatPtr variance();
}
