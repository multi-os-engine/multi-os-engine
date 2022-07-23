package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSCNNBatchNormalizationDataSource;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNBatchNormalization
 * [@dependency] This depends on Metal.framework
 * <p>
 * MPSCNNBatchNormalization normalizes input images using per-channel
 * means and variances.
 * <p>
 * for (c = 0; c < numberOfFeatureChannels; ++c)
 * {
 * input_image = in(:,:,c,:);
 * output_image = (input_image - mean[c]) * gamma[c] / sqrt(variance[c] + epsilon) + beta[c];
 * out(:,:,c,:) = output_image;
 * }
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBatchNormalization extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBatchNormalization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBatchNormalization alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNBatchNormalization allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * The data source the batch normalization was initialized with
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNBatchNormalizationDataSource dataSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode this kernel to a command buffer for a single image using
     * a batch normalization state.
     *
     * @param commandBuffer           A valid command buffer to receive the kernel.
     * @param sourceImage             The source MPSImage.
     * @param batchNormalizationState A MPSCNNBatchNormalizationState containing weights and/or
     *                                statistics to use for the batch normalization. If the state
     *                                is temporary its read count will be decremented.
     * @param destinationImage        An MPSImage to contain the resulting normalized and scaled
     *                                image.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:batchNormalizationState:destinationImage:")
    public native void encodeToCommandBufferSourceImageBatchNormalizationStateDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSCNNBatchNormalizationState batchNormalizationState, MPSImage destinationImage);

    /**
     * [@property] epsilon
     * <p>
     * The epsilon value used in the batch normalization formula to
     * bias the variance when normalizing.
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBatchNormalization init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBatchNormalization initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use a subclass of NSCoder that
     * implements the <MPSDeviceProvider> protocol to
     * tell MPS the MTLDevice to use.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSCNNBatchNormalization object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNBatchNormalization initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBatchNormalization initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a batch normalization kernel using a data source.
     *
     * @param device     The MTLDevice on which this filter will be used
     * @param dataSource A pointer to a object that conforms to the MPSCNNBatchNormalizationDataSource
     *                   protocol. The data source provides filter weights and bias terms and, optionally,
     *                   image statistics which may be used to perform the normalization.
     * @return A valid MPSCNNBatchNormalization object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:dataSource:")
    public native MPSCNNBatchNormalization initWithDeviceDataSource(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource);

    /**
     * Initializes a batch normalization kernel using a data source and a neuron descriptor.
     *
     * @param device                The MTLDevice on which this filter will be used
     * @param dataSource            A pointer to a object that conforms to the MPSCNNBatchNormalizationDataSource
     *                              protocol. The data source provides filter weights and bias terms and, optionally,
     *                              image statistics which may be used to perform the normalization.
     * @param fusedNeuronDescriptor A MPSNNNeuronDescriptor object which specifies a neuron activation function to
     *                              be applied to the result of the batch normalization.
     * @return A valid MPSCNNBatchNormalization object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:dataSource:fusedNeuronDescriptor:")
    public native MPSCNNBatchNormalization initWithDeviceDataSourceFusedNeuronDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource,
            MPSNNNeuronDescriptor fusedNeuronDescriptor);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNBatchNormalization new_objc();

    /**
     * [@property] numberOfFeatureChannels
     * <p>
     * The number of feature channels in an image to be normalized.
     */
    @Generated
    @Selector("numberOfFeatureChannels")
    @NUInt
    public native long numberOfFeatureChannels();

    /**
     * Reinitialize the filter using a data source.
     *
     * @param dataSource The data source which will provide the weights and, optionally, the
     *                   image batch statistics with which to normalize.
     */
    @Generated
    @Selector("reloadDataSource:")
    public native void reloadDataSource(@Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource);

    /**
     * Reinitialize the filter's gamma and beta values using the data source provided at kernel initialization.
     */
    @Generated
    @Selector("reloadGammaAndBetaFromDataSource")
    public native void reloadGammaAndBetaFromDataSource();

    /**
     * Reload data using new gamma and beta terms contained within an
     * MPSCNNNormalizationGammaAndBetaState object.
     *
     * @param commandBuffer     The command buffer on which to encode the reload.
     * @param gammaAndBetaState The state containing the updated weights which are to
     *                          be reloaded.
     */
    @Generated
    @Selector("reloadGammaAndBetaWithCommandBuffer:gammaAndBetaState:")
    public native void reloadGammaAndBetaWithCommandBufferGammaAndBetaState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNNormalizationGammaAndBetaState gammaAndBetaState);

    /**
     * Reinitialize the filter's mean and variance values using the data source provided at kernel initialization.
     */
    @Generated
    @Selector("reloadMeanAndVarianceFromDataSource")
    public native void reloadMeanAndVarianceFromDataSource();

    /**
     * Reload data using new mean and variance terms contained within an
     * MPSCNNNormalizationMeanAndVarianceState object.
     *
     * @param commandBuffer        The command buffer on which to encode the reload.
     * @param meanAndVarianceState The state containing the updated statistics which are to
     *                             be reloaded.
     */
    @Generated
    @Selector("reloadMeanAndVarianceWithCommandBuffer:meanAndVarianceState:")
    public native void reloadMeanAndVarianceWithCommandBufferMeanAndVarianceState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNNormalizationMeanAndVarianceState meanAndVarianceState);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Return an MPSCNNBatchNormalizationState object which may be used with a MPSCNNBatchNormalization filter.
     */
    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNBatchNormalizationState resultStateForSourceImageSourceStatesDestinationImage(
            MPSImage sourceImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    /**
     * [@property] epsilon
     * <p>
     * The epsilon value used in the batch normalization formula to
     * bias the variance when normalizing.
     */
    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

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

    /**
     * Return a temporary MPSCNNBatchNormalizationState object which may be used with
     * a MPSCNNBatchNormalization filter.
     */
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNBatchNormalizationState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
