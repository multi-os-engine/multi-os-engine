package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
 * MPSRNNMatrixInferenceLayer
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSRNNMatrixInferenceLayer specifies a recurrent neural network layer for inference on MPSMatrices.
 * Currently two types of recurrent layers are supported: ones that operate with convolutions on
 * images: @ref MPSRNNImageInferenceLayer and one that operates on matrices: @ref MPSRNNMatrixInferenceLayer.
 * The former can be often used to implement the latter by using 1x1-matrices, but due to
 * image size restrictions and performance, it is advisable to use @ref MPSRNNMatrixInferenceLayer for
 * linear recurrent layers.
 * A MPSRNNMatrixInferenceLayer is initialized using a @ref MPSRNNLayerDescriptor, which further specifies the
 * recurrent network layer, or an array of @ref MPSRNNLayerDescriptors, which specifies a stack
 * of recurrent layers, that can operate in parallel a subset of the inputs in a sequence of inputs and
 * recurrent outputs. Note that currently stacks with bidirectionally traversing encode functions do not support
 * starting
 * from a previous set of recurrent states, but this can be achieved quite easily by defining two separate
 * unidirectional stacks of layers, and running the same input sequence on them separately (one forwards and one
 * backwards)
 * and ultimately combining the two result sequences as desired with auxiliary functions.
 * The input and output vectors in encode calls are stored as rows of the input and output matrices and
 * MPSRNNMatrixInferenceLayer supports matrices with decreasing number of rows: The row-indices identify the different
 * sequences that may be of different lengths - for example if we have three sequences:
 * ( x1, x2, x3 ), ( y1, y2, y3, y4 ) and ( z1, z2 )
 * of vectors xi, yi and zi, then these can be inserted together as a batch to the sequence encoding kernel by
 * using the matrices:
 * [@code]
 * ( y1 ) ( y2 ) ( y3 ) ( y4 )
 * m1 = ( x1 ), m2 = ( x2 ), m3 = ( x3 ), m4 =
 * ( z1 ) ( z2 )
 * [@endcode]
 * If a recurrent output state is requested then it will contain the state corresponding to last inputs to each
 * sequence and if all the intermediate states are requested (see storeAllIntermediateStates),
 * then the shorter sequences will be propagated by copying the state of the previous output if the
 * input vector is not present in the sequence - in the example above the output states would be:
 * [@code]
 * ( s_y1 ) ( s_y2 ) ( s_y3 ) ( s_y4 )
 * s1 = ( s_x1 ), s2 = ( s_x2 ), s3 = ( s_x3 ), s4 = ( s_x3 )
 * ( s_z1 ) ( s_z2 ) ( s_z2 ) ( s_z2 )
 * [@endcode]
 * The mathematical operation described in the linear transformations of @ref MPSRNNSingleGateDescriptor
 * [@ref] MPSLSTMDescriptor and @ref MPSGRUDescriptor are y^T = W x^T <=> y = x W^T, where x is the matrix containing
 * the input vectors as rows, y is the matrix containing the output vectors as rows and W is the weight matrix.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRNNMatrixInferenceLayer extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNMatrixInferenceLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNMatrixInferenceLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSRNNMatrixInferenceLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] bidirectionalCombineMode
     * <p>
     * Defines how to combine the output-results, when encoding bidirectional layers using
     * [@ref] encodeBidirectionalSequenceToCommandBuffer.
     * Defaults to @ref MPSRNNBidirectionalCombineModeNone.
     */
    @Generated
    @Selector("bidirectionalCombineMode")
    @NUInt
    public native long bidirectionalCombineMode();

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
     * Make a copy of this kernel for a new device - @see MPSKernel
     *
     * @param zone   The NSZone in which to allocate the object
     * @param device The device for the new MPSKernel. If nil, then use
     *               self.device.
     * @return a pointer to a copy of this MPSKernel. This will fail, returning
     *         nil if the device is not supported. Devices must be
     *         MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSRNNMatrixInferenceLayer copyWithZoneDevice(VoidPtr zone,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode an MPSRNNMatrixInferenceLayer kernel stack for an input matrix sequences into a command buffer
     * bidirectionally.
     * The operation proceeds as follows: The first source matrix x0 is passed through all forward traversing layers in
     * the stack,
     * ie. those that were initialized with MPSRNNSequenceDirectionForward, recurrent input is assumed zero.
     * This produces forward output yf0 and recurrent states hf00, hf01, hf02, ... hf0n, one for each forward layer in
     * the stack.
     * Then x1 is passed to forward layers together with recurrent state hf00, hf01, ..., hf0n, which produces yf1, and
     * hf10,...
     * This procedure is iterated until the last matrix in the input sequence x_(N-1), which produces forward output
     * yf(N-1).
     * The backwards layers iterate the same sequence backwards, starting from input x_(N-1) (recurrent state zero),
     * that produces yb(N-1) and recurrent output hb(N-1)0, hf(N-1)1, ... hb(N-1)m, one for each backwards traversing
     * layer.
     * Then the backwards layers handle input x_(N-2) using recurrent state hb(N-1)0, ..., et cetera, until the
     * first matrix of the sequence is computed, producing output yb0. The result of the operation is either pair of
     * sequences
     * ({yf0, yf1, ... , yf(N-1)}, {yb0, yb1, ... , yb(N-1)}) or a combined sequence, {(yf0 + yb0), ... , (yf(N-1) +
     * yb(N-1)) },
     * where '+' stands either for sum, or concatenation along feature channels, as specified by @ref
     * bidirectionalCombineMode.
     *
     * @param commandBuffer               A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceSequence              An array of valid MPSMatrix objects containing the source matrix sequence (x0,
     *                                    x1, ... x_n-1).
     * @param destinationForwardMatrices  An array of valid MPSMatrices to be overwritten by result from forward input
     *                                    matrices. If bidirectionalCombineMode
     *                                    is either MPSRNNBidirectionalCombineModeAdd or
     *                                    MPSRNNBidirectionalCombineModeConcatenate, then will
     *                                    contain the combined results. destinationForwardMatrix may not alias with any
     *                                    of the source matrices.
     * @param destinationBackwardMatrices If bidirectionalCombineMode is MPSRNNBidirectionalCombineModeNone, then must
     *                                    be an array of valid MPSMatrices
     *                                    that will be overwritten by result from backward input matrices. Otherwise
     *                                    this parameter is ignored
     *                                    and can be nil. destinationBackwardMatrices may not alias to any of the source
     *                                    matrices.
     */
    @Generated
    @Selector("encodeBidirectionalSequenceToCommandBuffer:sourceSequence:destinationForwardMatrices:destinationBackwardMatrices:")
    public native void encodeBidirectionalSequenceToCommandBufferSourceSequenceDestinationForwardMatricesDestinationBackwardMatrices(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceSequence,
            NSArray<? extends MPSMatrix> destinationForwardMatrices,
            NSArray<? extends MPSMatrix> destinationBackwardMatrices);

    @Generated
    @Selector("encodeSequenceToCommandBuffer:sourceMatrices:destinationMatrices:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequenceToCommandBufferSourceMatricesDestinationMatricesRecurrentInputStateRecurrentOutputStates(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NSArray<? extends MPSMatrix> destinationMatrices, MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRNNMatrixInferenceLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRNNMatrixInferenceLayer initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * See @ref MPSKernel#initWithCoder.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSRNNMatrixInferenceLayer
     * @param device   The MTLDevice on which to make the MPSRNNMatrixInferenceLayer
     * @return A new MPSRNNMatrixInferenceLayer object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRNNMatrixInferenceLayer initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSRNNMatrixInferenceLayer initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a linear (fully connected) RNN kernel
     *
     * @param device        The MTLDevice on which this MPSRNNMatrixLayer filter will be used
     * @param rnnDescriptor The descriptor that defines the RNN layer
     * @return A valid MPSRNNMatrixInferenceLayer object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:rnnDescriptor:")
    public native MPSRNNMatrixInferenceLayer initWithDeviceRnnDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSRNNDescriptor rnnDescriptor);

    /**
     * Initializes a kernel that implements a stack of linear (fully connected) RNN layers
     *
     * @param device         The MTLDevice on which this MPSRNNMatrixLayer filter will be used
     * @param rnnDescriptors An array of RNN descriptors that defines a stack of RNN layers, starting at index zero.
     *                       The number of layers in stack is the number of entries in the array.
     *                       All entries in the array must be valid MPSRNNDescriptors.
     * @return A valid MPSRNNMatrixInferenceLayer object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:rnnDescriptors:")
    public native MPSRNNMatrixInferenceLayer initWithDeviceRnnDescriptors(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, NSArray<? extends MPSRNNDescriptor> rnnDescriptors);

    /**
     * [@property] inputFeatureChannels
     * <p>
     * The number of feature channels input vector/matrix.
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
    public static native MPSRNNMatrixInferenceLayer new_objc();

    /**
     * [@property] numberOfLayers
     * <p>
     * Number of layers in the filter-stack. This will be one when using initWithDevice:rnnDescriptor to initialize
     * this filter and the number of entries in the array 'rnnDescriptors' when initializing this filter with
     * initWithDevice:rnnDescriptors.
     */
    @Generated
    @Selector("numberOfLayers")
    @NUInt
    public native long numberOfLayers();

    /**
     * [@property] outputFeatureChannels
     * <p>
     * The number of feature channels in the output vector/matrix.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    /**
     * [@property] recurrentOutputIsTemporary
     * <p>
     * How output states from @ref encodeSequenceToCommandBuffer are constructed.
     * Defaults to NO. For reference @see MPSState.
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
     * [@property] bidirectionalCombineMode
     * <p>
     * Defines how to combine the output-results, when encoding bidirectional layers using
     * [@ref] encodeBidirectionalSequenceToCommandBuffer.
     * Defaults to @ref MPSRNNBidirectionalCombineModeNone.
     */
    @Generated
    @Selector("setBidirectionalCombineMode:")
    public native void setBidirectionalCombineMode(@NUInt long value);

    /**
     * [@property] recurrentOutputIsTemporary
     * <p>
     * How output states from @ref encodeSequenceToCommandBuffer are constructed.
     * Defaults to NO. For reference @see MPSState.
     */
    @Generated
    @Selector("setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean value);

    /**
     * [@property] storeAllIntermediateStates
     * <p>
     * If YES then calls to @ref encodeSequenceToCommandBuffer return every recurrent state
     * in the array: recurrentOutputStates.
     * Defaults to NO.
     */
    @Generated
    @Selector("setStoreAllIntermediateStates:")
    public native void setStoreAllIntermediateStates(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] storeAllIntermediateStates
     * <p>
     * If YES then calls to @ref encodeSequenceToCommandBuffer return every recurrent state
     * in the array: recurrentOutputStates.
     * Defaults to NO.
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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Encode an MPSRNNMatrixInferenceLayer kernel (stack) for a sequence of inputs into a command buffer.
     * Note that when encoding using this function the @see layerSequenceDirection is ignored and the layer stack
     * operates as
     * if all layers were forward feeding layers. In order to run bidirectional sequences
     * use @ref encodeBidirectionalSequenceToCommandBuffer:sourceSequence: or alternatively run two layer stacks and
     * combine
     * results at the end using utility functions.
     * [@code]
     * MPSRNNRecurrentMatrixState* recurrent0 = nil;
     * [filter encodeToCommandBuffer: cmdBuf
     * sourceMatrix: source0
     * destinationMatrix: destination0
     * recurrentInputState: nil
     * recurrentOutputState: &recurrent0];
     * [@endcode]
     * Then use it for the next input in sequence:
     * [@code]
     * [filter encodeToCommandBuffer: cmdBuf
     * sourceMatrix: source1
     * destinationMatrix: destination1
     * recurrentInputState: recurrent0
     * recurrentOutputState: &recurrent0];
     * [@endcode]
     * And discard recurrent output of the third input:
     * [@code]
     * [filter encodeToCommandBuffer: cmdBuf
     * sourceMatrix: source2
     * destinationMatrix: destination2
     * recurrentInputState: recurrent0
     * recurrentOutputState: nil];
     * [@endcode]
     *
     * @param commandBuffer         A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceMatrices        An array of valid MPSMatrix objects containing the sequence of source matrices.
     * @param sourceOffsets         An array of byte-offsets into the sourceMatrices, if nil zeros are assumed and
     *                              if not nil must contain offset for every matrix in sourceMatrices.
     * @param destinationMatrices   An array valid MPSMatrices to be overwritten by result matrix sequence.
     *                              destinationMatrices may not alias sourceMatrices.
     * @param destinationOffsets    An array of byte-offsets into the destinationMatrices, if nil zeros are assumed and
     *                              if not nil must contain offset for every matrix in destinationMatrices.
     * @param recurrentInputState   An optional state containing the output matrices and memory cells (for LSTMs)
     *                              of the layer obtained from the previous input matrices in a sequence of inputs.
     *                              Has to be the output of a previous call to this function or nil (assumed zero).
     *                              Note: can be one of the states returned in @ref intermediateRecurrentStates.
     * @param recurrentOutputStates An optional array that will contain the recurrent output states. If nil then
     *                              the recurrent output state is discarded.
     *                              If @ref storeAllIntermediateStates is YES, then all intermediate states of the
     *                              sequence
     *                              are returned in the array, the first one corresponding to the first input in the
     *                              sequence,
     *                              otherwise only the last recurrent output state is returned.
     *                              If recurrentOutputIsTemporary is YES and then all returned recurrent states
     *                              will be temporary. @see MPSState:isTemporary.
     *                              Example: In order to get a new state one can do the following:
     */
    @Generated
    @Selector("encodeSequenceToCommandBuffer:sourceMatrices:sourceOffsets:destinationMatrices:destinationOffsets:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequenceToCommandBufferSourceMatricesSourceOffsetsDestinationMatricesDestinationOffsetsRecurrentInputStateRecurrentOutputStates(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NUIntPtr sourceOffsets, NSArray<? extends MPSMatrix> destinationMatrices, NUIntPtr destinationOffsets,
            MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates);
}
