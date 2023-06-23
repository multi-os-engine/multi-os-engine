package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCTensor
 * 
 * A tensor object
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCTensor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCTensor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCTensor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCTensor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Associates the given data to the tensor. If the device is GPU, also copies the data to the device memory.
     * Returns true if the data is successfully associated with the tensor and copied to the device.
     * 
     * The caller must guarantee the lifetime of the underlying memory of \p data for the entirety of the tensor's
     * lifetime. For input tensors, we recommend that the bindAndwriteData method provided by MLCTrainingGraph
     * and MLCInferenceGraph be used. This method should only be used to allocate and copy data to device memory
     * for tensors that are typically layer parameters such as weights, bias for convolution layers, beta, gamma for
     * normalization layers.
     * 
     * @param data   The data to associated with the tensor
     * @param device The compute device
     * @return A Boolean value indicating whether the data is successfully associated with the tensor and copied to the
     *         device.
     */
    @Generated
    @Selector("bindAndWriteData:toDevice:")
    public native boolean bindAndWriteDataToDevice(@NotNull MLCTensorData data, @NotNull MLCDevice device);

    /**
     * Associates the given optimizer data and device data buffers to the tensor.
     * Returns true if the data is successfully associated with the tensor and copied to the device.
     * 
     * The caller must guarantee the lifetime of the underlying memory of \p data for the entirety of the tensor's
     * lifetime. The \p deviceData buffers are allocated by MLCompute. This method must be called
     * before executeOptimizerUpdateWithOptions or executeWithInputsData is called for the training graph.
     * 
     * @param data       The optimizer data to be associated with the tensor
     * @param deviceData The optimizer device data to be associated with the tensor
     * @return A Boolean value indicating whether the data is successfully associated with the tensor .
     */
    @Generated
    @Selector("bindOptimizerData:deviceData:")
    public native boolean bindOptimizerDataDeviceData(@NotNull NSArray<? extends MLCTensorData> data,
            @Nullable NSArray<? extends MLCTensorOptimizerDeviceData> deviceData);

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

    /**
     * Copy tensor data from device memory to user specified memory
     * 
     * Before copying tensor data from device memory, one may need to synchronize the device memory for example
     * when device is the GPU. The synchronizeWithDevice argumet can be set appropraitely to indicate this.
     * For CPU this is ignored. If the tensor has been specified in outputs of a graph using addOutputs,
     * synchronizeWithDevice should be set to NO.
     * NOTE: This method should only be called once the graph that this tensor is used with has finished execution;
     * Otherwise the results in device memory may not be up to date. synchronizeWithDevice must be set to NO
     * when this method is called from a completion callback for GPU.
     * 
     * @param bytes                 The user specified data in which to copy
     * @param length                The size in bytes to copy
     * @param synchronizeWithDevice Whether to synchronize device memory if device is GPU
     * @return Returns YES if success, NO if there is a failure to synchronize
     */
    @Generated
    @Selector("copyDataFromDeviceMemoryToBytes:length:synchronizeWithDevice:")
    public native boolean copyDataFromDeviceMemoryToBytesLengthSynchronizeWithDevice(@NotNull VoidPtr bytes,
            @NUInt long length, boolean synchronizeWithDevice);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] data
     * 
     * The tensor data
     */
    @Nullable
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] descriptor
     * 
     * The tensor descriptor
     */
    @NotNull
    @Generated
    @Selector("descriptor")
    public native MLCTensorDescriptor descriptor();

    /**
     * [@property] device
     * 
     * The device associated with this tensor.
     */
    @Nullable
    @Generated
    @Selector("device")
    public native MLCDevice device();

    /**
     * Returns a Boolean value indicating whether the underlying data has valid floating-point numerics, i.e. it
     * does not contain NaN or INF floating-point values.
     */
    @Generated
    @Selector("hasValidNumerics")
    public native boolean hasValidNumerics();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCTensor init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @NotNull
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCTensor new_objc();

    /**
     * [@property] optimizer buffers to use if tensor is used as a parameter
     * 
     * These are the host side optimizer (momentum and velocity) buffers which developers can query and initialize
     * 
     * When customizing optimizer data, the contents of these buffers must be initialized before executing optimizer
     * update for a graph.
     */
    @NotNull
    @Generated
    @Selector("optimizerData")
    public native NSArray<? extends MLCTensorData> optimizerData();

    /**
     * [@property] optimizer device buffers to use if tensor is used as a parameter
     * 
     * These are the device side optimizer (momentum and velocity) buffers which developers can query
     */
    @NotNull
    @Generated
    @Selector("optimizerDeviceData")
    public native NSArray<? extends MLCTensorOptimizerDeviceData> optimizerDeviceData();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Synchronize the data in host memory.
     * 
     * Synchronize the data in host memory i.e. tensor.data with latest contents in device memory
     * This should only be called once the graph that this tensor is used with has finished execution;
     * Otherwise the results in device memory may not be up to date.
     * NOTE: This method should not be called from a completion callback when device is the GPU.
     * 
     * @return Returns YES if success, NO if there is a failure to synchronize
     */
    @Generated
    @Selector("synchronizeData")
    public native boolean synchronizeData();

    /**
     * Synchronize the optimizer data in host memory.
     * 
     * Synchronize the optimizer data in host memory with latest contents in device memory
     * This should only be called once the graph that this tensor is used with has finished execution;
     * Otherwise the results in device memory may not be up to date.
     * NOTE: This method should not be called from a completion callback when device is the GPU.
     * 
     * @return Returns YES if success, NO if there is a failure to synchronize
     */
    @Generated
    @Selector("synchronizeOptimizerData")
    public native boolean synchronizeOptimizerData();

    /**
     * Converts a quantized tensor to a 32-bit floating-point tensor
     * Returns a de-quantized tensor
     * 
     * @param type  The de-quantized data type. Must be MLCFloat32
     * @param scale The scale thst was used for the quantized data
     * @param bias  The offset value that maps to float zero used for the quantized data
     * @return A quantized tensor
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("tensorByDequantizingToType:scale:bias:")
    public native MLCTensor tensorByDequantizingToTypeScaleBias(int type, @NotNull MLCTensor scale,
            @NotNull MLCTensor bias);

    /**
     * Converts a quantized tensor to a 32-bit floating-point tensor
     * Returns a de-quantized tensor
     * 
     * @param type  The de-quantized data type. Must be MLCFloat32
     * @param scale The scale thst was used for the quantized data
     * @param bias  The offset value that maps to float zero used for the quantized data
     * @param axis  The dimension on which to apply per-channel quantization
     * @return A quantized tensor
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("tensorByDequantizingToType:scale:bias:axis:")
    public native MLCTensor tensorByDequantizingToTypeScaleBiasAxis(int type, @NotNull MLCTensor scale,
            @NotNull MLCTensor bias, @NInt long axis);

    /**
     * Converts a 32-bit floating-point tensor with given scale and a zero point
     * Returns a quantized tensor
     * 
     * @param type  The quantized data type. Must be MLCDataTypeInt8, MLCDataTypeUInt8 or MLCDataTypeInt32
     * @param scale The scale to apply in quantization
     * @param bias  The offset value that maps to float zero
     * @return A quantized tensor
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("tensorByQuantizingToType:scale:bias:")
    public native MLCTensor tensorByQuantizingToTypeScaleBias(int type, float scale, @NInt long bias);

    /**
     * Converts a 32-bit floating-point tensor with given scale and a zero point
     * Returns a quantized tensor
     * 
     * @param type  The quantized data type. Must be MLCDataTypeInt8, MLCDataTypeUInt8 or MLCDataTypeInt32
     * @param scale The scale to apply in quantization
     * @param bias  The offset value that maps to float zero
     * @param axis  The dimension on which to apply per-channel quantization
     * @return A quantized tensor
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("tensorByQuantizingToType:scale:bias:axis:")
    public native MLCTensor tensorByQuantizingToTypeScaleBiasAxis(int type, @NotNull MLCTensor scale,
            @NotNull MLCTensor bias, @NInt long axis);

    /**
     * [@property] tensorID
     * 
     * The tensor ID
     * 
     * A unique number to identify each tensor. Assigned when the tensor is created.
     */
    @Generated
    @Selector("tensorID")
    @NUInt
    public native long tensorID();

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object without any data
     * 
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithDescriptor:")
    public static native MLCTensor tensorWithDescriptor(@NotNull MLCTensorDescriptor tensorDescriptor);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object with a MLCTensorData object that specifies the tensor data buffer
     * 
     * @param tensorDescriptor The tensor descriptor
     * @param data             The random initializer type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithDescriptor:data:")
    public static native MLCTensor tensorWithDescriptorData(@NotNull MLCTensorDescriptor tensorDescriptor,
            @NotNull MLCTensorData data);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object with a MLCTensorData object that specifies the tensor data buffer
     * 
     * @param tensorDescriptor The tensor descriptor
     * @param fillData         The scalar data to fill to tensor with
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithDescriptor:fillWithData:")
    public static native MLCTensor tensorWithDescriptorFillWithData(@NotNull MLCTensorDescriptor tensorDescriptor,
            @NotNull NSNumber fillData);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object initialized with a random initializer such as Glorot Uniform.
     * 
     * @param tensorDescriptor      The tensor descriptor
     * @param randomInitializerType The random initializer type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithDescriptor:randomInitializerType:")
    public static native MLCTensor tensorWithDescriptorRandomInitializerType(
            @NotNull MLCTensorDescriptor tensorDescriptor, int randomInitializerType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor typically used by a recurrent layer
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param sequenceLength      The length of sequences stored in the tensor
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithSequenceLength:featureChannelCount:batchSize:")
    public static native MLCTensor tensorWithSequenceLengthFeatureChannelCountBatchSize(@NUInt long sequenceLength,
            @NUInt long featureChannelCount, @NUInt long batchSize);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor typically used by a recurrent layer
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param sequenceLength      The length of sequences stored in the tensor
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @param data                The tensor data
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithSequenceLength:featureChannelCount:batchSize:data:")
    public static native MLCTensor tensorWithSequenceLengthFeatureChannelCountBatchSizeData(@NUInt long sequenceLength,
            @NUInt long featureChannelCount, @NUInt long batchSize, @Nullable MLCTensorData data);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor typically used by a recurrent layer
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param sequenceLength        The length of sequences stored in the tensor
     * @param featureChannelCount   Number of feature channels
     * @param batchSize             The tensor batch size
     * @param randomInitializerType The random initializer type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithSequenceLength:featureChannelCount:batchSize:randomInitializerType:")
    public static native MLCTensor tensorWithSequenceLengthFeatureChannelCountBatchSizeRandomInitializerType(
            @NUInt long sequenceLength, @NUInt long featureChannelCount, @NUInt long batchSize,
            int randomInitializerType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor of variable length sequences typically used by a recurrent layer
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param sequenceLengths     An array of sequence lengths
     * @param sortedSequences     A flag to indicate if the sequence lengths are sorted. If yes, they must be sorted in
     *                            descending order
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @param data                The tensor data
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithSequenceLengths:sortedSequences:featureChannelCount:batchSize:data:")
    public static native MLCTensor tensorWithSequenceLengthsSortedSequencesFeatureChannelCountBatchSizeData(
            @NotNull NSArray<? extends NSNumber> sequenceLengths, boolean sortedSequences,
            @NUInt long featureChannelCount, @NUInt long batchSize, @Nullable MLCTensorData data);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor of variable length sequences typically used by a recurrent layer
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param sequenceLengths       An array of sequence lengths
     * @param sortedSequences       A flag to indicate if the sequence lengths are sorted. If yes, they must be sorted
     *                              in descending order
     * @param featureChannelCount   Number of feature channels
     * @param batchSize             The tensor batch size
     * @param randomInitializerType The random initializer type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithSequenceLengths:sortedSequences:featureChannelCount:batchSize:randomInitializerType:")
    public static native MLCTensor tensorWithSequenceLengthsSortedSequencesFeatureChannelCountBatchSizeRandomInitializerType(
            @NotNull NSArray<? extends NSNumber> sequenceLengths, boolean sortedSequences,
            @NUInt long featureChannelCount, @NUInt long batchSize, int randomInitializerType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object without any data. The tensor data type is MLCDataTypeFloat32.
     * 
     * @param shape The tensor shape
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithShape:")
    public static native MLCTensor tensorWithShape(@NotNull NSArray<? extends NSNumber> shape);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object with data
     * 
     * @param shape    The tensor shape
     * @param data     The tensor data
     * @param dataType The tensor data type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithShape:data:dataType:")
    public static native MLCTensor tensorWithShapeDataDataType(@NotNull NSArray<? extends NSNumber> shape,
            @NotNull MLCTensorData data, int dataType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object without any data
     * 
     * @param shape    The tensor shape
     * @param dataType The tensor data type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithShape:dataType:")
    public static native MLCTensor tensorWithShapeDataType(@NotNull NSArray<? extends NSNumber> shape, int dataType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object with data
     * 
     * @param shape    The tensor shape
     * @param fillData The scalar value to initialize the tensor data with
     * @param dataType The tensor data type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithShape:fillWithData:dataType:")
    public static native MLCTensor tensorWithShapeFillWithDataDataType(@NotNull NSArray<? extends NSNumber> shape,
            @NotNull NSNumber fillData, int dataType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object initialized with a random initializer such as Glorot Uniform.
     * The tensor data type is MLCDataTypeFloat32
     * 
     * @param shape                 The tensor shape
     * @param randomInitializerType The random initializer type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithShape:randomInitializerType:")
    public static native MLCTensor tensorWithShapeRandomInitializerType(@NotNull NSArray<? extends NSNumber> shape,
            int randomInitializerType);

    /**
     * Create a MLCTensor object
     * 
     * Create a tensor object initialized with a random initializer such as Glorot Uniform.
     * The tensor data type is MLCDataTypeFloat32
     * 
     * @param shape                 The tensor shape
     * @param randomInitializerType The random initializer type
     * @param dataType              The tensor data type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithShape:randomInitializerType:dataType:")
    public static native MLCTensor tensorWithShapeRandomInitializerTypeDataType(
            @NotNull NSArray<? extends NSNumber> shape, int randomInitializerType, int dataType);

    /**
     * Create a MLCTensor object
     * 
     * Create a NCHW tensor object with tensor data type = MLCDataTypeFloat32
     * 
     * @param width               The tensor width
     * @param height              The tensor height
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithWidth:height:featureChannelCount:batchSize:")
    public static native MLCTensor tensorWithWidthHeightFeatureChannelCountBatchSize(@NUInt long width,
            @NUInt long height, @NUInt long featureChannelCount, @NUInt long batchSize);

    /**
     * Create a MLCTensor object
     * 
     * Create a NCHW tensor object with a tensor data object
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param width               The tensor width
     * @param height              The tensor height
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @param data                The tensor data
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithWidth:height:featureChannelCount:batchSize:data:")
    public static native MLCTensor tensorWithWidthHeightFeatureChannelCountBatchSizeData(@NUInt long width,
            @NUInt long height, @NUInt long featureChannelCount, @NUInt long batchSize, @NotNull MLCTensorData data);

    /**
     * Create a MLCTensor object
     * 
     * Create a NCHW tensor object with a tensor data object
     * The tensor data type is MLCDataTypeFloat32.
     * 
     * @param width               The tensor width
     * @param height              The tensor height
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @param data                The tensor data
     * @param dataType            The tensor data type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithWidth:height:featureChannelCount:batchSize:data:dataType:")
    public static native MLCTensor tensorWithWidthHeightFeatureChannelCountBatchSizeDataDataType(@NUInt long width,
            @NUInt long height, @NUInt long featureChannelCount, @NUInt long batchSize, @NotNull MLCTensorData data,
            int dataType);

    /**
     * Create a MLCTensor object
     * 
     * Create a NCHW tensor object initialized with a scalar value
     * 
     * @param width               The tensor width
     * @param height              The tensor height
     * @param featureChannelCount Number of feature channels
     * @param batchSize           The tensor batch size
     * @param fillData            The scalar value to initialize the tensor data with
     * @param dataType            The tensor data type
     * @return A new MLCTensorData object
     */
    @Generated
    @Selector("tensorWithWidth:height:featureChannelCount:batchSize:fillWithData:dataType:")
    public static native MLCTensor tensorWithWidthHeightFeatureChannelCountBatchSizeFillWithDataDataType(
            @NUInt long width, @NUInt long height, @NUInt long featureChannelCount, @NUInt long batchSize,
            float fillData, int dataType);

    /**
     * Create a MLCTensor object
     * 
     * Create a NCHW tensor object initialized with a random initializer type.
     * The tensor data type is MLCDataTypeFloat32
     * 
     * @param width                 The tensor width
     * @param height                The tensor height
     * @param featureChannelCount   Number of feature channels
     * @param batchSize             The tensor batch size
     * @param randomInitializerType The random initializer type
     * @return A new MLCTensor object
     */
    @Generated
    @Selector("tensorWithWidth:height:featureChannelCount:batchSize:randomInitializerType:")
    public static native MLCTensor tensorWithWidthHeightFeatureChannelCountBatchSizeRandomInitializerType(
            @NUInt long width, @NUInt long height, @NUInt long featureChannelCount, @NUInt long batchSize,
            int randomInitializerType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
