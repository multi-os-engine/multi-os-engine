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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSRNNImageInferenceLayer
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSRNNImageInferenceLayer specifies a recurrent neural network layer for inference on MPSImages.
 * Currently two types of recurrent layers are supported: ones that operate with convolutions on
 * images: @ref MPSRNNImageInferenceLayer and one that operates on matrices: @ref MPSRNNMatrixInferenceLayer.
 * The former can be often used to implement the latter by using 1x1-images, but due to
 * image size restrictions and performance, it is advisable to use @ref MPSRNNMatrixInferenceLayer for
 * linear recurrent layers.
 * A MPSRNNImageInferenceLayer is initialized using a @ref MPSRNNLayerDescriptor, which further specifies the
 * recurrent network layer, or an array of @ref MPSRNNLayerDescriptors, which specifies a stack
 * of recurrent layers, that can operate in parallel a subset of the inputs in a sequence of inputs and
 * recurrent outputs. Note that currently stacks with bidirectionally traversing encode functions do not support
 * starting
 * from a previous set of recurrent states, but this can be achieved quite easily by defining two separate
 * unidirectional stacks of layers, and running the same input sequence on them separately (one forwards and one
 * backwards)
 * and ultimately combining the two result sequences as desired with auxiliary functions.
 * 
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRNNImageInferenceLayer extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNImageInferenceLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNImageInferenceLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSRNNImageInferenceLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] bidirectionalCombineMode
     * 
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
    public native MPSRNNImageInferenceLayer copyWithZoneDevice(VoidPtr zone,
            @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode an MPSRNNImageInferenceLayer kernel stack for an input image sequences into a command buffer
     * bidirectionally.
     * The operation proceeds as follows: The first source image x0 is passed through all forward traversing layers in
     * the stack,
     * ie. those that were initialized with MPSRNNSequenceDirectionForward, recurrent input is assumed zero.
     * This produces forward output yf0 and recurrent states hf00, hf01, hf02, ... hf0n, one for each forward layer.
     * Then x1 is passed to forward layers together with recurrent state hf00, hf01, ..., hf0n, which produces yf1, and
     * hf10,...
     * This procedure is iterated until the last image in the input sequence x_(N-1), which produces forward output
     * yf(N-1).
     * The backwards layers iterate the same sequence backwards, starting from input x_(N-1) (recurrent state zero),
     * that produces yb(N-1) and recurrent output hb(N-1)0, hf(N-1)1, ... hb(N-1)m, one for each backwards traversing
     * layer.
     * Then the backwards layers handle input x_(N-2) using recurrent state hb(N-1)0, ..., et cetera, until the
     * first image of the sequence is computed, producing output yb0. The result of the operation is either pair of
     * sequences
     * ({yf0, yf1, ... , yf(N-1)}, {yb0, yb1, ... , yb(N-1)}) or a combined sequence, {(yf0 + yb0), ... , (yf(N-1) +
     * yb(N-1)) },
     * where '+' stands either for sum, or concatenation along feature channels, as specified by @ref
     * bidirectionalCombineMode.
     * 
     * @param commandBuffer             A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceSequence            An array of valid MPSImage objects containing the source image sequence (x0, x1,
     *                                  ... x_n-1).
     * @param destinationForwardImages  An array of valid MPSImages to be overwritten by result from forward input
     *                                  images. If bidirectionalCombineMode
     *                                  is either MPSRNNBidirectionalCombineModeAdd or
     *                                  MPSRNNBidirectionalCombineModeConcatenate, then will
     *                                  contain the combined results. destinationForwardImage may not alias with any of
     *                                  the source images.
     * @param destinationBackwardImages If bidirectionalCombineMode is MPSRNNBidirectionalCombineModeNone, then must be
     *                                  a valid MPSImage
     *                                  that will be overwritten by result from backward input image. Otherwise this
     *                                  parameter is ignored
     *                                  and can be nil. destinationBackwardImages may not alias to any of the source
     *                                  images.
     */
    @Generated
    @Selector("encodeBidirectionalSequenceToCommandBuffer:sourceSequence:destinationForwardImages:destinationBackwardImages:")
    public native void encodeBidirectionalSequenceToCommandBufferSourceSequenceDestinationForwardImagesDestinationBackwardImages(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceSequence,
            NSArray<? extends MPSImage> destinationForwardImages,
            NSArray<? extends MPSImage> destinationBackwardImages);

    /**
     * Encode an MPSRNNImageInferenceLayer kernel (stack) for a sequence of inputs into a command buffer.
     * Note that when encoding using this function the @see layerSequenceDirection is ignored and the layer stack
     * operates as
     * if all layers were forward feeding layers. In order to run bidirectional sequences
     * use @ref encodeBidirectionalSequenceToCommandBuffer:sourceSequence: or alternatively run two layer stacks and
     * combine
     * results at the end using utility functions.
     * [@code]
     * MPSRNNRecurrentImageState* recurrent0 = nil;
     * [filter encodeToCommandBuffer: cmdBuf
     * sourceImage: source0
     * destinationImage: destination0
     * recurrentInputState: nil
     * recurrentOutputState: &recurrent0];
     * [@endcode]
     * Then use it for the next input in sequence:
     * [@code]
     * [filter encodeToCommandBuffer: cmdBuf
     * sourceImage: source1
     * destinationImage: destination1
     * recurrentInputState: recurrent0
     * recurrentOutputState: &recurrent0];
     * [@endcode]
     * And discard recurrent output of the third input:
     * [@code]
     * [filter encodeToCommandBuffer: cmdBuf
     * sourceImage: source2
     * destinationImage: destination2
     * recurrentInputState: recurrent0
     * recurrentOutputState: nil];
     * [@endcode]
     * 
     * @param commandBuffer         A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceImages          An array of valid MPSImage objects containing the sequence of source images.
     * @param destinationImages     An array valid MPSImages to be overwritten by result image sequence.
     *                              destinationImages may not alias sourceImages.
     * @param recurrentInputState   An optional state containing the output images and memory cells (for LSTMs)
     *                              of the layer obtained from the previous input images in a sequence of inputs.
     *                              Has to be the output of a previous call to this function or nil (assumed zero).
     *                              Note: can be one of the states returned in @ref recurrentOutputStates.
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
    @Selector("encodeSequenceToCommandBuffer:sourceImages:destinationImages:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequenceToCommandBufferSourceImagesDestinationImagesRecurrentInputStateRecurrentOutputStates(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages,
            NSArray<? extends MPSImage> destinationImages, MPSRNNRecurrentImageState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentImageState> recurrentOutputStates);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRNNImageInferenceLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRNNImageInferenceLayer initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSRNNImageInferenceLayer
     * @param device   The MTLDevice on which to make the MPSRNNImageInferenceLayer
     * @return A new MPSRNNImageInferenceLayer object, or nil if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRNNImageInferenceLayer initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSRNNImageInferenceLayer initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a convolutional RNN kernel
     * 
     * @param device        The MTLDevice on which this MPSRNNImageLayer filter will be used
     * @param rnnDescriptor The descriptor that defines the RNN layer
     * @return A valid MPSRNNImageInferenceLayer object or nil, if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithDevice:rnnDescriptor:")
    public native MPSRNNImageInferenceLayer initWithDeviceRnnDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSRNNDescriptor rnnDescriptor);

    /**
     * Initializes a kernel that implements a stack of convolutional RNN layers
     * 
     * @param device         The MTLDevice on which this MPSRNNImageLayer filter will be used
     * @param rnnDescriptors An array of RNN descriptors that defines a stack of RNN layers, starting at index zero.
     *                       The number of layers in stack is the number of entries in the array.
     *                       All entries in the array must be valid MPSRNNDescriptors.
     * @return A valid MPSRNNImageInferenceLayer object or nil, if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithDevice:rnnDescriptors:")
    public native MPSRNNImageInferenceLayer initWithDeviceRnnDescriptors(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, NSArray<? extends MPSRNNDescriptor> rnnDescriptors);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSRNNImageInferenceLayer new_objc();

    /**
     * [@property] numberOfLayers
     * 
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
     * 
     * The number of feature channels per pixel in the output image.
     */
    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    /**
     * [@property] recurrentOutputIsTemporary
     * 
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
     * 
     * Defines how to combine the output-results, when encoding bidirectional layers using
     * [@ref] encodeBidirectionalSequenceToCommandBuffer.
     * Defaults to @ref MPSRNNBidirectionalCombineModeNone.
     */
    @Generated
    @Selector("setBidirectionalCombineMode:")
    public native void setBidirectionalCombineMode(@NUInt long value);

    /**
     * [@property] recurrentOutputIsTemporary
     * 
     * How output states from @ref encodeSequenceToCommandBuffer are constructed.
     * Defaults to NO. For reference @see MPSState.
     */
    @Generated
    @Selector("setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean value);

    /**
     * [@property] storeAllIntermediateStates
     * 
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
     * 
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
}
