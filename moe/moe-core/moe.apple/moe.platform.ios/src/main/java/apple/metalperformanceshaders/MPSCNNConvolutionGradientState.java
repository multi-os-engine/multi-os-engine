package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLTextureDescriptor;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLResource;
import apple.metalperformanceshaders.protocol.MPSImageSizeEncodingState;
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
 * MPSCNNConvolutionGradientState
 * <p>
 * The MPSCNNConvolutionGradientState is returned by resultStateForSourceImage:sourceStates method on MPSCNNConvolution
 * object.
 * Note that resultStateForSourceImage:sourceStates:destinationImage creates the object on autoreleasepool.
 * It will be consumed by MPSCNNConvolutionGradient. This is also used by MPSCNNConvolutionTranspose encode call
 * that returns MPSImage on left hand side to correctly size the destination.
 * Note that state objects are not usable across batches i.e. when batch is done you should nuke the state object and
 * create
 * new one for next batch.
 * <p>
 * This state exposes the gradient with respect to weights and biases, as computed by the MPSCNNConvolutionGradient
 * kernel, as a metal buffer to be used
 * during weights and biases update. The standard weights and biases update formula is:
 * <p>
 * weights(t+1) = f(weights(t), gradientForWeights(t)) and
 * biases(t+1) = f(biases(t), gradientForBiases(t)),
 * <p>
 * where the weights(t)/biases(t) are the wegihts and the biases at step t that are provided by data source provider
 * used to create MPSCNNConvolution and
 * MPSCNNConvoltuionGradient objects. There are multiple ways user can update weights and biases as described below:
 * <p>
 * 1) For check pointing, i.e. updating weights/biases and storing:
 * once the command buffer on which MPSCNNConvolutionGradient is enqueued is done (e.g. in command
 * buffer completion callback), the application can simply use
 * float* delta_w = (float*)((char*)[gradientForWeights contents]);
 * float* delta_b = (float*)((char*)[gradientForBiases contents]);
 * to update the weights and biases in the data provider directly.
 * The application can instead provide a metal kernel that reads from gradientForWeights and gradientForBiases buffer
 * and the buffer created using data provided by the data source
 * to do any kind of update it will like to do, then read back the updated weights/biases and store to the data source.
 * Note that lifetime of the
 * gradientForWeights and gradientForBiases buffer is the same as the MPSCNNConvolutionGradientState. So it's the
 * applications's responsibility to make sure the buffer is alive
 * (retained) when the update kernel is running if the command buffer doesn't retain the buffer. Also, in order to
 * gaurantee that the buffer is correctly
 * synchronized for CPU side access, it is the application's responsibility to call
 * [gradientState synchronizeOnCommandBuffer:]
 * before accessing data from the buffer.
 * <p>
 * 2) For a CPU side update, once the weights and biases in the data source provider are updated as above, the original
 * MPSCNNConvolution and
 * MPSCNNConvolutionGradient objects need to be updated with the new weigths and biases by calling the
 * -(void) reloadWeightsAndBiasesFromDataSource
 * method. Again application needs to call [gradientState synchronizeOnCommandBuffer:] before touching data on CPU side.
 * <p>
 * 3) The above CPU side update requires command buffer to be done. If the application doesn't want to update its data
 * source provider object and would prefer to directly
 * enqueue an update of the internal MPSCNNConvolution and MPSCNNConvolutionGradient weights/biases buffers on the GPU
 * without CPU side involvement, it needs to do
 * following:
 * i) get gradientForWeights and gradientForBiases buffers from this gradient state object and set it as source of
 * update kernel
 * ii) create a temporary buffer, dest, of same size and set it as destination of update kernel
 * iii) enqueue update kernel on command buffer
 * iv) call reloadWeightsAndBiasesWithCommandBuffer:dest:weightsOffset:biasesOffset on MPSCNNConvolution and
 * MPSCNNConvolutionGradient objects. This
 * will reload the weights from application's update kernel in dest on GPU without CPU side involvement.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionGradientState extends MPSNNGradientState implements MPSImageSizeEncodingState {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionGradientState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionGradientState alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNConvolutionGradientState allocWithZone(VoidPtr zone);

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
     * [@property] convolution
     * <p>
     * The convolution filter that produced the state.
     * For child MPSCNNConvolutionTrasposeGradientState object, convolution
     * below refers to MPSCNNConvolution object that produced MPSCNNConvolutionGradientState object
     * which was used to create MPSCNNConvolutionTransposeGradientState object. See
     * resultStateForSourceImage:sourceStates
     * method of MPSCNNConvolutionTranspose below.
     */
    @Generated
    @Selector("convolution")
    public native MPSCNNConvolution convolution();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] gradientForBiases
     * <p>
     * A buffer that contains the loss function gradients with respect to biases.
     */
    @Generated
    @Selector("gradientForBiases")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer gradientForBiases();

    /**
     * [@property] gradientForWeights
     * <p>
     * A buffer that contains the loss function gradients with respect to weights.
     * Each value in the buffer is a float. The layout of the gradients with respect to the weights is the same as
     * the weights layout provided by data source i.e. it can be interpreted as 4D array
     * <p>
     * gradientForWeights[outputFeatureChannels][kernelHeight][kernelWidth][inputFeatureChannels/groups]
     * For depthwise convolution it will be (since we only support channel multiplier of 1 currently)
     * gradientForWeights[outputFeatureChannels][kernelHeight][kernelWidth]
     */
    @Generated
    @Selector("gradientForWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer gradientForWeights();

    /**
     * [@property] gradientForWeightsLayout
     * <p>
     * Layout of gradient with respect to weights in gradientForWeights buffer.
     * Currently only MPSCNNConvolutionWeightsLayoutOHWI is supported.
     */
    @Generated
    @Selector("gradientForWeightsLayout")
    public native int gradientForWeightsLayout();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionGradientState init();

    @Generated
    @Selector("initWithDevice:bufferSize:")
    public native MPSCNNConvolutionGradientState initWithDeviceBufferSize(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long bufferSize);

    @Generated
    @Selector("initWithDevice:resourceList:")
    public native MPSCNNConvolutionGradientState initWithDeviceResourceList(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSStateResourceList resourceList);

    @Generated
    @Selector("initWithDevice:textureDescriptor:")
    public native MPSCNNConvolutionGradientState initWithDeviceTextureDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MTLTextureDescriptor descriptor);

    @Generated
    @Selector("initWithResource:")
    public native MPSCNNConvolutionGradientState initWithResource(@Mapped(ObjCObjectMapper.class) MTLResource resource);

    @Generated
    @Selector("initWithResources:")
    public native MPSCNNConvolutionGradientState initWithResources(NSArray<?> resources);

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
    public static native MPSCNNConvolutionGradientState new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sourceHeight")
    @NUInt
    public native long sourceHeight();

    @Generated
    @Selector("sourceWidth")
    @NUInt
    public native long sourceWidth();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("temporaryStateWithCommandBuffer:")
    public static native MPSCNNConvolutionGradientState temporaryStateWithCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:bufferSize:")
    public static native MPSCNNConvolutionGradientState temporaryStateWithCommandBufferBufferSize(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NUInt long bufferSize);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:resourceList:")
    public static native MPSCNNConvolutionGradientState temporaryStateWithCommandBufferResourceList(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSStateResourceList resourceList);

    @Generated
    @Selector("temporaryStateWithCommandBuffer:textureDescriptor:")
    public static native MPSCNNConvolutionGradientState temporaryStateWithCommandBufferTextureDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MTLTextureDescriptor descriptor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
