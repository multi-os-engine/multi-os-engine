package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLOrigin;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class      MPSRNNMatrixTrainingLayer
 * @dependency This depends on Metal.framework
 * @discussion The MPSRNNMatrixTrainingLayer specifies a recurrent neural network layer for training on MPSMatrices.
 * 
 *             A MPSRNNMatrixTrainingLayer is initialized using a @ref MPSRNNLayerDescriptor, which further specifies the
 *             recurrent network layer.
 *             The input and output vectors in encode calls are stored as rows of the input and output matrices and
 *             MPSRNNMatrixTrainingLayer supports matrices with decreasing number of rows: The row-indices identify the different
 *             sequences that may be of different lengths - for example if we have three sequences:
 *                 ( x1, x2, x3 ), ( y1, y2, y3, y4 ) and ( z1, z2 )
 *             of vectors xi, yi and zi, then these can be inserted together as a batch to the sequence encoding kernel by
 *             using the matrices:
 *                 @code
 *                          ( y1 )        ( y2 )        ( y3 )        ( y4 )
 *                     m1 = ( x1 ),  m2 = ( x2 ),  m3 = ( x3 ),  m4 =
 *                          ( z1 )        ( z2 )
 *                 @endcode
 *             The gradient computation pass is then achieved by passing the corresponding gradient sequence from the
 *             previous layer ( dx1, dx2, dx3 ), ( dy1, dy2, dy3, dy4 ) and ( dz1, dz2 ) as matrices
 *                 @code
 *                           ( dy1 )         ( dy2 )         ( dy3 )         ( dy4 )
 *                     dm1 = ( dx1 ),  dm2 = ( dx2 ),  dm3 = ( dx3 ),  dm4 =
 *                           ( dz1 )         ( dz2 )
 *                 @endcode
 * 
 *             The mathematical operation described in the linear transformations of @ref MPSRNNSingleGateDescriptor
 *             @ref MPSLSTMDescriptor and @ref MPSGRUDescriptor are y^T = W x^T  <=> y = x W^T, where x is the matrix containing
 *             the input vectors as rows, y is the matrix containing the output vectors as rows and W is the weight matrix.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRNNMatrixTrainingLayer extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNMatrixTrainingLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * @property   accumulateWeightGradients
     * @abstract   If yes then the computed weight gradients are accumulated on top of existing values in
     *             calls to the gradient computation functions: encodeGradientSequenceToCommandBuffer.
     *             Defaults to NO.
     */
    @Generated
    @Selector("accumulateWeightGradients")
    public native boolean accumulateWeightGradients();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNMatrixTrainingLayer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
     * @abstract   Make a copy of this kernel for a new device - @see MPSKernel
     * @param      zone        The NSZone in which to allocate the object
     * @param      device      The device for the new MPSKernel. If nil, then use
     *                         self.device.
     * @result     a pointer to a copy of this MPSKernel. This will fail, returning
     *             nil if the device is not supported. Devices must be
     *             MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * @abstract   As @ref createWeightGradientMatrices, but the matrices will be temporary with readCount = 1, which means that they
     *             become invalid after the first encode call that reads them. Note also that as the matrices are temporary, their
     *             storage mode will be private which means that you can only access the data using a kernel on the GPU.
     * @param      matricesOut                 An array where the newly created matrices will be stored, will be initialized to zero.
     * @param      dataType                    Datatype for the entries - currently MPSDataTypeFloat32 and MPSDataTypeFloat16 are supported.
     * @param      commandBuffer               The command buffer that the temporary matrices will live on.
     */
    @Generated
    @Selector("createTemporaryWeightGradientMatrices:dataType:commandBuffer:")
    public native void createTemporaryWeightGradientMatricesDataTypeCommandBuffer(NSMutableArray<MPSMatrix> matricesOut,
            int dataType, @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    /**
     * @abstract   Initializes a set of matrices that can be used in training for weight and bias gradient outputs in
     *             @see encodeBackwardSequenceToCommandBuffer. Can be also used to easily create auxiliary matrices for example
     *             for ADAM and other advanced optimization schemes. The layout and number of matrices is the same as for the outputs of
     *             @see initWithDevice, but the data type may differ. NOTE: These matrices cannot be used as weight matrices in the
     *             forward and backward encode calls, but matrices from initWithDevice() or createWeightMatrices() should be used instead.
     * @param      matricesOut                 An array where the newly created matrices will be stored, will be initialized to zero.
     * @param      dataType                    Datatype for the entries - currently MPSDataTypeFloat32 and MPSDataTypeFloat16 are supported.
     */
    @Generated
    @Selector("createWeightGradientMatrices:dataType:")
    public native void createWeightGradientMatricesDataType(NSMutableArray<MPSMatrix> matricesOut, int dataType);

    /**
     * @abstract   Initializes a set of matrices that can be used in training for weight and bias matrices in
     *             the forward and backward passes. The layout, datatype and number of matrices is the same as for the outputs of
     *             @see initWithDevice.
     * @param      matricesOut                 An array where the newly created matrices will be stored, will be initialized to zero.
     */
    @Generated
    @Selector("createWeightMatrices:")
    public native void createWeightMatrices(NSMutableArray<MPSMatrix> matricesOut);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @abstract   Encode a copy kernel that copies one matrix from the trainable weight set to a matrix with standard layout,
     *             where the column index is the input feature channel index (in forward direction) and row index is the output
     *             feature channel index.
     * @param      commandBuffer                   A valid MTLCommandBuffer to receive the encoded filter
     * @param      weights                         An array weights from @see initWithDevice or @see createWeightMatrices.
     * @param      matrixId                        Which matrix to copy - has to be a valid Id based on inputs defined in
     *                                             the rnnDescriptor of @see initWithDevice.
     * @param      matrix                          The destination or source matrix that is used in the copy.
     * @param      copyFromWeightsToMatrix         If YES then the copy direction is from the set of trainable 'weights' to 'matrix',
     *                                             otherwise the copy is done from 'matrix' to 'weights'.
     * @param      matrixOffset                    A (valid) offset into matrix to be applied to the copy operation.
     */
    @Generated
    @Selector("encodeCopyWeightsToCommandBuffer:weights:matrixId:matrix:copyFromWeightsToMatrix:matrixOffset:")
    public native void encodeCopyWeightsToCommandBufferWeightsMatrixIdMatrixCopyFromWeightsToMatrixMatrixOffset(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> weights,
            @NUInt long matrixId, MPSMatrix matrix, boolean copyFromWeightsToMatrix, @ByValue MTLOrigin matrixOffset);

    /**
     * @abstract   Encode an MPSRNNMatrixTrainingLayer forward pass kernel for a sequence of inputs into a command buffer.
     * @param      commandBuffer                   A valid MTLCommandBuffer to receive the encoded filter
     * @param      sourceMatrices                  An array of valid MPSMatrix objects containing the sequence of source matrices.
     * @param      destinationMatrices             An array valid MPSMatrices to be overwritten by result matrix sequence.
     *                                                 destinationMatrices may not alias sourceMatrices.
     * @param      trainingStates                   An array containing the training states to be passed to the gradient computation
     *                                                 encode function.
     * @param      weights                         An array of valid MPSMatrix objects containing the weights, should be the array
     *                                                 that was produced either by @see initWithDevice or @see createWeightMatrices.
     */
    @Generated
    @Selector("encodeForwardSequenceToCommandBuffer:sourceMatrices:destinationMatrices:trainingStates:weights:")
    public native void encodeForwardSequenceToCommandBufferSourceMatricesDestinationMatricesTrainingStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NSArray<? extends MPSMatrix> destinationMatrices, NSMutableArray<MPSRNNMatrixTrainingState> trainingStates,
            NSArray<? extends MPSMatrix> weights);

    /**
     * @abstract   Encode an MPSRNNMatrixTrainingLayer forward pass kernel for a sequence of inputs into a command buffer.
     * @param      commandBuffer                   A valid MTLCommandBuffer to receive the encoded filter
     * @param      sourceMatrices                  An array of valid MPSMatrix objects containing the sequence of source matrices.
     * @param      sourceOffsets                   An array of byte-offsets into the sourceMatrices, if nil zeros are assumed and
     *                                                 if not nil must contain offset for every matrix in sourceMatrices.
     * @param      destinationMatrices             An array valid MPSMatrices to be overwritten by result matrix sequence.
     *                                                 destinationMatrices may not alias sourceMatrices.
     * @param      destinationOffsets              An array of byte-offsets into the destinationMatrices, if nil zeros are assumed and
     *                                                 if not nil must contain offset for every matrix in destinationMatrices.
     * @param      trainingStates                   An array containing the training states to be passed to the gradient computation
     *                                                 encode function.
     * @param      recurrentInputState             An optional state containing the output matrices and memory cells (for LSTMs)
     *                                                 of the layer obtained from the previous input matrices in a sequence of inputs.
     *                                                 Has to be the output of a previous call to this function or nil (assumed zero).
     * @param      recurrentOutputStates           An array that will be appended with the recurrent output states. May not be nil.
     *                                                 If recurrentOutputIsTemporary is YES and then all returned recurrent states
     *                                                 will be temporary. @see MPSState:isTemporary.
     * @param      weights                         An array of valid MPSMatrix objects containing the weights, should be the array
     *                                                 that was produced either by @see initWithDevice or @see createWeightMatrices.
     */
    @Generated
    @Selector("encodeForwardSequenceToCommandBuffer:sourceMatrices:sourceOffsets:destinationMatrices:destinationOffsets:trainingStates:recurrentInputState:recurrentOutputStates:weights:")
    public native void encodeForwardSequenceToCommandBufferSourceMatricesSourceOffsetsDestinationMatricesDestinationOffsetsTrainingStatesRecurrentInputStateRecurrentOutputStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NUIntPtr sourceOffsets, NSArray<? extends MPSMatrix> destinationMatrices, NUIntPtr destinationOffsets,
            NSMutableArray<MPSRNNMatrixTrainingState> trainingStates, MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates, NSArray<? extends MPSMatrix> weights);

    /**
     * @abstract   Encode an MPSRNNMatrixTrainingLayer gradient pass kernel for a sequence of input gradients into a command buffer.
     *             NOTE: The time sequence indexing follows the array indexing in the inputs: sourceGradients[0] has to contain the
     *             gradients corresponding to the first matrix in the forward pass corresponding to the current subsequence, which is
     *             typically sourceMatrices[0].
     * @param      commandBuffer                   A valid MTLCommandBuffer to receive the encoded filter
     * @param      forwardSources                  An array of MPSMatrix objects containing the sequence of source matrices of the forward pass.
     * @param      forwardSourceOffsets            An array of byte-offsets into the forwardSources, if nil zeros are assumed and
     *                                                 if not nil must contain offset for every matrix in forwardSources.
     * @param      sourceGradients                 An array of valid MPSMatrix objects containing the sequence of source gradient matrices.
     * @param      sourceGradientOffsets           An array of byte-offsets into the sourceGradients, if nil zeros are assumed and
     *                                                 if not nil must contain offset for every matrix in sourceGradients.
     * @param      destinationGradients            An array valid MPSMatrix objects that will receive the backpropagated gradients, may be
     *                                                 nil if not needed (for example first layer in graph).
     * @param      destinationOffsets              An array of byte-offsets into the destinationGradients, if nil zeros are assumed and
     *                                                 if not nil must contain offset for every matrix in destinationGradients.
     * @param      weightGradients                 An array of valid MPSMatrix objects that will receive the gradient wrt. weights and
     *                                                 biases of the layer - should be the array that was produced either
     *                                                 by @see initWithDevice or @see createWeightMatrices. May be nil in which case
     *                                                 the gradients for the weights are not computed.
     * @param      trainingStates                  An array containing the training states from the forward pass - the array must contain
     *                                                 the states corresponding to the input gradients is sourceGradients.
     * @param      recurrentInputState             An optional state containing the output matrices and memory cells (for LSTMs)
     *                                                 of the layer obtained from the previous input gradients in a sequence of inputs.
     *                                                 Has to be the output of a previous call to this function or nil (assumed zero).
     * @param      recurrentOutputStates           An array that will be appended with the recurrent output states. Can be nil.
     *                                                 If recurrentOutputIsTemporary is YES and then all returned recurrent states
     *                                                 will be temporary. @see MPSState:isTemporary.
     * @param      weights                         An array of valid MPSMatrix objects containing the weights, should be the array
     *                                                 that was produced either by @see initWithDevice or @see createWeightMatrices.
     */
    @Generated
    @Selector("encodeGradientSequenceToCommandBuffer:forwardSources:forwardSourceOffsets:sourceGradients:sourceGradientOffsets:destinationGradients:destinationOffsets:weightGradients:trainingStates:recurrentInputState:recurrentOutputStates:weights:")
    public native void encodeGradientSequenceToCommandBufferForwardSourcesForwardSourceOffsetsSourceGradientsSourceGradientOffsetsDestinationGradientsDestinationOffsetsWeightGradientsTrainingStatesRecurrentInputStateRecurrentOutputStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> forwardSources,
            NUIntPtr forwardSourceOffsets, NSArray<? extends MPSMatrix> sourceGradients, NUIntPtr sourceGradientOffsets,
            NSArray<? extends MPSMatrix> destinationGradients, NUIntPtr destinationOffsets,
            NSArray<? extends MPSMatrix> weightGradients, NSArray<? extends MPSRNNMatrixTrainingState> trainingStates,
            MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates, NSArray<? extends MPSMatrix> weights);

    /**
     * @abstract   Encode an MPSRNNMatrixTrainingLayer gradient pass kernel for a sequence of input gradients into a command buffer.
     *             NOTE: The time sequence indexing follows the array indexing in the inputs: sourceGradients[0] has to contain the
     *             gradients corresponding to the first matrix in the forward pass corresponding to the current subsequence, which is
     *             typically sourceMatrices[0].
     * @param      commandBuffer                   A valid MTLCommandBuffer to receive the encoded filter
     * @param      forwardSources                  An array of MPSMatrix objects containing the sequence of source matrices of the forward pass.
     * @param      sourceGradients                 An array of MPSMatrix objects containing the sequence of source gradient matrices.
     * @param      destinationGradients            An array valid MPSMatrix objects that will receive the backpropagated gradients, may be
     *                                                 nil if not needed (for example first layer in graph).
     * @param      weightGradients                 An array valid MPSMatrix objects that will receive the gradient wrt. weights and
     *                                                 biases of the layer - should be the array that was produced either
     *                                                 by @see initWithDevice or @see createWeightMatrices. May be nil in which case
     *                                                 the gradients for the weights are not computed.
     *                                                 NOTE: The weight gradients are accumulated on top of existing values so
     * 
     * @param      trainingStates                  An array containing the training states from the forward pass - the array must contain
     *                                                 the states corresponding to the input gradients is sourceGradients.
     * @param      weights                         An array of valid MPSMatrix objects containing the weights, should be the array
     *                                                 that was produced either by @see initWithDevice or @see createWeightMatrices.
     */
    @Generated
    @Selector("encodeGradientSequenceToCommandBuffer:forwardSources:sourceGradients:destinationGradients:weightGradients:trainingStates:weights:")
    public native void encodeGradientSequenceToCommandBufferForwardSourcesSourceGradientsDestinationGradientsWeightGradientsTrainingStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> forwardSources,
            NSArray<? extends MPSMatrix> sourceGradients, NSArray<? extends MPSMatrix> destinationGradients,
            NSArray<? extends MPSMatrix> weightGradients, NSArray<? extends MPSRNNMatrixTrainingState> trainingStates,
            NSArray<? extends MPSMatrix> weights);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRNNMatrixTrainingLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRNNMatrixTrainingLayer initWithCoder(NSCoder aDecoder);

    /**
     * @abstract NSSecureCoding compatability
     * @discussion See @ref MPSKernel#initWithCoder.
     * @param      aDecoder    The NSCoder subclass with your serialized MPSRNNMatrixTrainingLayer
     * @param      device      The MTLDevice on which to make the MPSRNNMatrixTrainingLayer
     * @return     A new MPSRNNMatrixTrainingLayer object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRNNMatrixTrainingLayer initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSRNNMatrixTrainingLayer initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @abstract   Initializes a linear (fully connected) RNN kernel for training
     * @param      device                      The MTLDevice on which this MPSRNNMatrixLayer filter will be used
     * @param      rnnDescriptor               The descriptor that defines the RNN layer
     * @param      trainableWeights            An array where to store the weights of the layer as MPSMatrices.
     *                                         NOTE: The exact layout and number of matrices may vary between
     *                                         platforms and therefore you should not save out these weights directly,
     *                                         but instead use the function encodeCopyWeightsToCommandBuffer to identify
     *                                         the weights and biases for serialization.
     *                                         Typically you should pass here an initialized but empty NSMutableArray and
     *                                         when this function returns the array will have been populated with the
     *                                         weight matrices needed in the encode-calls, by using initial values from
     *                                         the datasources in rnnDescriptor.
     * @return     A valid MPSRNNMatrixTrainingLayer object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:rnnDescriptor:trainableWeights:")
    public native MPSRNNMatrixTrainingLayer initWithDeviceRnnDescriptorTrainableWeights(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSRNNDescriptor rnnDescriptor,
            NSMutableArray<MPSMatrix> trainableWeights);

    /**
     * @property   inputFeatureChannels
     * @abstract   The number of feature channels input vector/matrix.
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @property   outputFeatureChannels
     * @abstract   The number of feature channels in the output vector/matrix.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    /**
     * @property   recurrentOutputIsTemporary
     * @abstract   How recurrent output states from @ref encodeForwardSequenceToCommandBuffer
     *             and encodeGradientSequenceToCommandBuffer are constructed.
     *             Defaults to NO. For reference @see MPSState.
     */
    @Generated
    @Selector("recurrentOutputIsTemporary")
    public native boolean recurrentOutputIsTemporary();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @property   accumulateWeightGradients
     * @abstract   If yes then the computed weight gradients are accumulated on top of existing values in
     *             calls to the gradient computation functions: encodeGradientSequenceToCommandBuffer.
     *             Defaults to NO.
     */
    @Generated
    @Selector("setAccumulateWeightGradients:")
    public native void setAccumulateWeightGradients(boolean value);

    /**
     * @property   recurrentOutputIsTemporary
     * @abstract   How recurrent output states from @ref encodeForwardSequenceToCommandBuffer
     *             and encodeGradientSequenceToCommandBuffer are constructed.
     *             Defaults to NO. For reference @see MPSState.
     */
    @Generated
    @Selector("setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean value);

    /**
     * @property   storeAllIntermediateStates
     * @abstract   If YES then calls to functions @ref encodeForwardSequenceToCommandBuffer and
     *             @ref encodeGradientSequenceToCommandBuffer return every recurrent state
     *             in the array: recurrentOutputStates.
     *             Defaults to NO.
     */
    @Generated
    @Selector("setStoreAllIntermediateStates:")
    public native void setStoreAllIntermediateStates(boolean value);

    /**
     * @property   trainingStateIsTemporary
     * @abstract   How training output states from @ref encodeForwardSequenceToCommandBuffer are constructed.
     *             Defaults to NO. For reference @see MPSState.
     */
    @Generated
    @Selector("setTrainingStateIsTemporary:")
    public native void setTrainingStateIsTemporary(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @property   storeAllIntermediateStates
     * @abstract   If YES then calls to functions @ref encodeForwardSequenceToCommandBuffer and
     *             @ref encodeGradientSequenceToCommandBuffer return every recurrent state
     *             in the array: recurrentOutputStates.
     *             Defaults to NO.
     */
    @Generated
    @Selector("storeAllIntermediateStates")
    public native boolean storeAllIntermediateStates();

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
     * @property   trainingStateIsTemporary
     * @abstract   How training output states from @ref encodeForwardSequenceToCommandBuffer are constructed.
     *             Defaults to NO. For reference @see MPSState.
     */
    @Generated
    @Selector("trainingStateIsTemporary")
    public native boolean trainingStateIsTemporary();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}