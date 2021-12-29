package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MLCGraph
 * <p>
 * A graph of layers that can be used to build a training or inference graph
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCGraph extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCGraph alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCGraph allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Associates data with input tensors. If the device is GPU, also copies the data to the device memory.
     * Returns true if the data is successfully associated with input tensors.
     * <p>
     * This function should be used if you execute the forward, gradient and optimizer updates independently.
     * Before the forward pass is executed, the inputs should be written to device memory.  Similarly, before the
     * gradient pass is executed, the inputs (typically the initial gradient tensor) should be written to device
     * memory.  The caller must guarantee the lifetime of the underlying memory of each value of \p inputsData
     * for the entirety of each corresponding input tensor's lifetime.
     *
     * @param inputsData   The input data to use to write to device memory
     * @param inputTensors The list of tensors to perform writes on
     * @param device       The device
     * @param batchSize    The batch size.  This should be set to the actual batch size that may be used when we execute
     *                     the graph and can be a value less than or equal to the batch size specified in the tensor.
     *                     If set to 0, we use batch size specified in the tensor.
     * @param synchronous  Whether to execute the copy to the device synchronously.  For performance, asynchronous
     *                     execution is recommended.
     * @return A Boolean value indicating whether the data is successfully associated with the tensor.
     */
    @Generated
    @Selector("bindAndWriteData:forInputs:toDevice:batchSize:synchronous:")
    public native boolean bindAndWriteDataForInputsToDeviceBatchSizeSynchronous(
            NSDictionary<String, ? extends MLCTensorData> inputsData,
            NSDictionary<String, ? extends MLCTensor> inputTensors, MLCDevice device, @NUInt long batchSize,
            boolean synchronous);

    /**
     * Associates data with input tensors. If the device is GPU, also copies the data to the device memory.
     * Returns true if the data is successfully associated with input tensors.
     * <p>
     * This function should be used if you execute the forward, gradient and optimizer updates independently.
     * Before the forward pass is executed, the inputs should be written to device memory.  Similarly, before the
     * gradient pass is executed, the inputs (typically the initial gradient tensor) should be written to device
     * memory.  The caller must guarantee the lifetime of the underlying memory of each value of \p inputsData
     * for the entirety of each corresponding input tensor's lifetime.
     *
     * @param inputsData   The input data to use to write to device memory
     * @param inputTensors The list of tensors to perform writes on
     * @param device       The device
     * @param synchronous  Whether to execute the copy to the device synchronously.  For performance, asynchronous
     *                     execution is recommended.
     * @return A Boolean value indicating whether the data is successfully associated with the tensor.
     */
    @Generated
    @Selector("bindAndWriteData:forInputs:toDevice:synchronous:")
    public native boolean bindAndWriteDataForInputsToDeviceSynchronous(
            NSDictionary<String, ? extends MLCTensorData> inputsData,
            NSDictionary<String, ? extends MLCTensor> inputTensors, MLCDevice device, boolean synchronous);

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
     * Add a concat layer to the graph
     *
     * @param sources   The source tensors to concatenate
     * @param dimension The concatenation dimension
     * @return A result tensor
     */
    @Generated
    @Selector("concatenateWithSources:dimension:")
    public native MLCTensor concatenateWithSourcesDimension(NSArray<? extends MLCTensor> sources,
            @NUInt long dimension);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The device to be used when compiling and executing a graph
     */
    @Generated
    @Selector("device")
    public native MLCDevice device();

    /**
     * Add a gather layer to the graph
     *
     * @param dimension The dimension along which to index
     * @param source    The source tensor
     * @param indices   The index of elements to gather
     * @return A result tensor
     */
    @Generated
    @Selector("gatherWithDimension:source:indices:")
    public native MLCTensor gatherWithDimensionSourceIndices(@NUInt long dimension, MLCTensor source,
            MLCTensor indices);

    /**
     * Creates a new graph.
     *
     * @return A new graph.
     */
    @Generated
    @Selector("graph")
    public static native MLCGraph graph();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCGraph init();

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
     * Layers in the graph
     */
    @Generated
    @Selector("layers")
    public native NSArray<? extends MLCLayer> layers();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCGraph new_objc();

    /**
     * Add a layer to the graph
     *
     * @param layer  The layer
     * @param source The source tensor
     * @return A result tensor
     */
    @Generated
    @Selector("nodeWithLayer:source:")
    public native MLCTensor nodeWithLayerSource(MLCLayer layer, MLCTensor source);

    /**
     * Add a layer to the graph
     * <p>
     * For variable length sequences of LSTMs/RNNs layers, create an MLCTensor of sortedSequenceLengths and pass it as the last index (i.e. index 2 or 4) of sources. This tensor must of be type MLCDataTypeInt32.
     *
     * @param layer   The layer
     * @param sources A list of source tensors
     * @return A result tensor
     */
    @Generated
    @Selector("nodeWithLayer:sources:")
    public native MLCTensor nodeWithLayerSources(MLCLayer layer, NSArray<? extends MLCTensor> sources);

    /**
     * Add a layer to the graph
     * <p>
     * For variable length sequences of LSTMs/RNNs layers, create an MLCTensor of sortedSequenceLengths and pass it as the last index (i.e. index 2 or 4) of sources. This tensor must of be type MLCDataTypeInt32.
     *
     * @param layer         The layer
     * @param sources       A list of source tensors
     * @param disableUpdate A flag to indicate if optimizer update should be disabled for this layer
     * @return A result tensor
     */
    @Generated
    @Selector("nodeWithLayer:sources:disableUpdate:")
    public native MLCTensor nodeWithLayerSourcesDisableUpdate(MLCLayer layer, NSArray<? extends MLCTensor> sources,
            boolean disableUpdate);

    /**
     * Add a loss layer to the graph
     * <p>
     * For variable length sequences of LSTMs/RNNs layers, create an MLCTensor of sortedSequenceLengths and pass it as the last index (i.e. index 2 or 4) of sources. This tensor must of be type MLCDataTypeInt32.
     *
     * @param layer      The loss layer
     * @param lossLabels The loss labels tensor
     * @return A result tensor
     */
    @Generated
    @Selector("nodeWithLayer:sources:lossLabels:")
    public native MLCTensor nodeWithLayerSourcesLossLabels(MLCLayer layer, NSArray<? extends MLCTensor> sources,
            NSArray<? extends MLCTensor> lossLabels);

    /**
     * Add a reshape layer to the graph
     *
     * @param shape  An array representing the shape of result tensor
     * @param source The source tensor
     * @return A result tensor
     */
    @Generated
    @Selector("reshapeWithShape:source:")
    public native MLCTensor reshapeWithShapeSource(NSArray<? extends NSNumber> shape, MLCTensor source);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get the result tensors for a layer in the training graph
     *
     * @param layer A layer in the training graph
     * @return A list of tensors
     */
    @Generated
    @Selector("resultTensorsForLayer:")
    public native NSArray<? extends MLCTensor> resultTensorsForLayer(MLCLayer layer);

    /**
     * Add a scatter layer to the graph
     *
     * @param dimension     The dimension along which to index
     * @param source        The updates to use with scattering with index positions specified in indices to result tensor
     * @param indices       The index of elements to scatter
     * @param copyFrom      The source tensor whose data is  to be first copied to the result tensor
     * @param reductionType The reduction type applied for all values in source tensor that are scattered to a specific location in the result tensor.
     *                      Must be: MLCReductionTypeNone or MLCReductionTypeSum.
     * @return A result tensor
     */
    @Generated
    @Selector("scatterWithDimension:source:indices:copyFrom:reductionType:")
    public native MLCTensor scatterWithDimensionSourceIndicesCopyFromReductionType(@NUInt long dimension,
            MLCTensor source, MLCTensor indices, MLCTensor copyFrom, int reductionType);

    /**
     * Add a select layer to the graph
     *
     * @param sources   The source tensors
     * @param condition The condition mask
     * @return A result tensor
     */
    @Generated
    @Selector("selectWithSources:condition:")
    public native MLCTensor selectWithSourcesCondition(NSArray<? extends MLCTensor> sources, MLCTensor condition);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Get the source tensors for a layer in the training graph
     *
     * @param layer A layer in the training graph
     * @return A list of tensors
     */
    @Generated
    @Selector("sourceTensorsForLayer:")
    public native NSArray<? extends MLCTensor> sourceTensorsForLayer(MLCLayer layer);

    /**
     * Add a split layer to the graph
     *
     * @param source     The source tensor
     * @param splitCount The number of splits
     * @param dimension  The dimension to split the source tensor
     * @return A result tensor
     */
    @Generated
    @Selector("splitWithSource:splitCount:dimension:")
    public native NSArray<? extends MLCTensor> splitWithSourceSplitCountDimension(MLCTensor source,
            @NUInt long splitCount, @NUInt long dimension);

    /**
     * Add a split layer to the graph
     *
     * @param source              The source tensor
     * @param splitSectionLengths The lengths of each split section
     * @param dimension           The dimension to split the source tensor
     * @return A result tensor
     */
    @Generated
    @Selector("splitWithSource:splitSectionLengths:dimension:")
    public native NSArray<? extends MLCTensor> splitWithSourceSplitSectionLengthsDimension(MLCTensor source,
            NSArray<? extends NSNumber> splitSectionLengths, @NUInt long dimension);

    /**
     * A DOT representation of the graph.
     * <p>
     * For more info on the DOT language, refer to https://en.wikipedia.org/wiki/DOT_(graph_description_language).
     * Edges that have a dashed lines are those that have stop gradients, while those with solid lines don't.
     */
    @Generated
    @Selector("summarizedDOTDescription")
    public native String summarizedDOTDescription();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Add a transpose layer to the graph
     *
     * @param dimensions NSArray<NSNumber *> representing the desired ordering of dimensions
     *                   The dimensions array specifies the input axis source for each output axis, such that the
     *                   K'th element in the dimensions array specifies the input axis source for the K'th axis in the
     *                   output.  The batch dimension which is typically axis 0 cannot be transposed.
     * @return A result tensor
     */
    @Generated
    @Selector("transposeWithDimensions:source:")
    public native MLCTensor transposeWithDimensionsSource(NSArray<? extends NSNumber> dimensions, MLCTensor source);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
