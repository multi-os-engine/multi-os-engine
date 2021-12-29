package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MLCTensorDescriptor
 * <p>
 * The MLCTensorDescriptor specifies a tensor descriptor.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCTensorDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCTensorDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCTensorDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCTensorDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   batchSizePerSequenceStep
     * <p>
     * The batch size for each sequence
     * <p>
     * We populate this only when sequenceLengths is valid. The length of this array should be
     * the maximum sequence length in sequenceLengths (i.e sequenceLengths[0]).
     */
    @Generated
    @Selector("batchSizePerSequenceStep")
    public native NSArray<? extends NSNumber> batchSizePerSequenceStep();

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
     * Create a MLCTensorDescriptor object
     * <p>
     * This method is provided as an easy to use API to create a bias tensor.
     *
     * @param featureChannelCount The number of input feature channels
     * @param dataType            The tensor data type
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("convolutionBiasesDescriptorWithFeatureChannelCount:dataType:")
    public static native MLCTensorDescriptor convolutionBiasesDescriptorWithFeatureChannelCountDataType(
            @NUInt long featureChannelCount, int dataType);

    /**
     * Create a MLCTensorDescriptor object
     * <p>
     * This method is provided as an easy to use API to create a weight tensor for a kernel of size 1.
     *
     * @param inputFeatureChannelCount  The number of input feature channels
     * @param outputFeatureChannelCount The number of output feature channels
     * @param dataType                  The tensor data type
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("convolutionWeightsDescriptorWithInputFeatureChannelCount:outputFeatureChannelCount:dataType:")
    public static native MLCTensorDescriptor convolutionWeightsDescriptorWithInputFeatureChannelCountOutputFeatureChannelCountDataType(
            @NUInt long inputFeatureChannelCount, @NUInt long outputFeatureChannelCount, int dataType);

    /**
     * Create a MLCTensorDescriptor object
     * <p>
     * This method is provided as an easy to use API to create a weight tensor.
     *
     * @param width                     The tensor width
     * @param height                    The tensor height
     * @param inputFeatureChannelCount  The number of input feature channels
     * @param outputFeatureChannelCount The number of output feature channels
     * @param dataType                  The tensor data type
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("convolutionWeightsDescriptorWithWidth:height:inputFeatureChannelCount:outputFeatureChannelCount:dataType:")
    public static native MLCTensorDescriptor convolutionWeightsDescriptorWithWidthHeightInputFeatureChannelCountOutputFeatureChannelCountDataType(
            @NUInt long width, @NUInt long height, @NUInt long inputFeatureChannelCount,
            @NUInt long outputFeatureChannelCount, int dataType);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property]   dataType
     * <p>
     * The tensor data type.  The default is MLCDataTypeFloat32.
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a MLCTensorDescriptor object
     *
     * @param shape    The tensor shape
     * @param dataType The tensor data type
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("descriptorWithShape:dataType:")
    public static native MLCTensorDescriptor descriptorWithShapeDataType(NSArray<? extends NSNumber> shape,
            int dataType);

    /**
     * Create a MLCTensorDescriptor object
     * <p>
     * This method is provided as an easy to use API to create sequence tensors used by recurrent layers.
     *
     * @param shape           The tensor shape
     * @param sequenceLengths The sequence lengths in tensor
     * @param sortedSequences A boolean to indicate whether sequences are sorted
     * @param dataType        The tensor data type
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("descriptorWithShape:sequenceLengths:sortedSequences:dataType:")
    public static native MLCTensorDescriptor descriptorWithShapeSequenceLengthsSortedSequencesDataType(
            NSArray<? extends NSNumber> shape, NSArray<? extends NSNumber> sequenceLengths, boolean sortedSequences,
            int dataType);

    /**
     * Create a MLCTensorDescriptor object
     * <p>
     * This method is provided as an easy to use API to create [NCHW] tensors used by convolutional layers.
     *
     * @param width           The tensor width
     * @param height          The tensor height
     * @param featureChannels The number of feature channels
     * @param batchSize       The batch size
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("descriptorWithWidth:height:featureChannelCount:batchSize:")
    public static native MLCTensorDescriptor descriptorWithWidthHeightFeatureChannelCountBatchSize(@NUInt long width,
            @NUInt long height, @NUInt long featureChannels, @NUInt long batchSize);

    /**
     * Create a MLCTensorDescriptor object
     * <p>
     * This method is provided as an easy to use API to create [NCHW] tensors used by convolutional layers.
     *
     * @param width               The tensor width
     * @param height              The tensor height
     * @param featureChannelCount The number of feature channels
     * @param batchSize           The batch size
     * @param dataType            The tensor data type
     * @return A new MLCTensorDescriptor object or nil if failure.
     */
    @Generated
    @Selector("descriptorWithWidth:height:featureChannelCount:batchSize:dataType:")
    public static native MLCTensorDescriptor descriptorWithWidthHeightFeatureChannelCountBatchSizeDataType(
            @NUInt long width, @NUInt long height, @NUInt long featureChannelCount, @NUInt long batchSize,
            int dataType);

    /**
     * [@property]   dimensionCount
     * <p>
     * The number of dimensions in the tensor
     */
    @Generated
    @Selector("dimensionCount")
    @NUInt
    public native long dimensionCount();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCTensorDescriptor init();

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

    /**
     * [@property]   maxTensorDimensions
     * <p>
     * The maximum number of tensor dimensions supported
     */
    @Generated
    @Selector("maxTensorDimensions")
    @NUInt
    public static native long maxTensorDimensions();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCTensorDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   sequenceLengths
     * <p>
     * TODO
     */
    @Generated
    @Selector("sequenceLengths")
    public native NSArray<? extends NSNumber> sequenceLengths();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   shape
     * <p>
     * The size in each dimension
     */
    @Generated
    @Selector("shape")
    public native NSArray<? extends NSNumber> shape();

    /**
     * [@property]   sortedSequences
     * <p>
     * Specifies whether the sequences are sorted or not.
     */
    @Generated
    @Selector("sortedSequences")
    public native boolean sortedSequences();

    /**
     * [@property]   stride
     * <p>
     * The stride in bytes in each dimension
     */
    @Generated
    @Selector("stride")
    public native NSArray<? extends NSNumber> stride();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property]   tensorAllocationSizeInBytes
     * <p>
     * The allocation size in bytes for a tensor.
     */
    @Generated
    @Selector("tensorAllocationSizeInBytes")
    @NUInt
    public native long tensorAllocationSizeInBytes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
