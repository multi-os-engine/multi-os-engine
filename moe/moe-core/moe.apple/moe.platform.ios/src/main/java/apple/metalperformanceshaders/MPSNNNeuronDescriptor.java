package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSNNNeuronDescriptor
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSNNNeuronDescriptor specifies a neuron descriptor.
 * Supported neuron types:
 * 
 * Neuron type "none": f(x) = x
 * Parameters: none
 * 
 * ReLU neuron filter: f(x) = x >= 0 ? x : a * x
 * This is called Leaky ReLU in literature. Some literature defines
 * classical ReLU as max(0, x). If you want this behavior, simply pass a = 0.
 * Parameters: a
 * For default behavior, set the value of a to 0.0f.
 * 
 * Linear neuron filter: f(x) = a * x + b
 * Parameters: a, b
 * For default behavior, set the value of a to 1.0f and the value of b to 0.0f.
 * 
 * Sigmoid neuron filter: f(x) = 1 / (1 + e^-x)
 * Parameters: none
 * 
 * Hard Sigmoid filter: f(x) = clamp((x * a) + b, 0, 1)
 * Parameters: a, b
 * For default behavior, set the value of a to 0.2f and the value of b to 0.5f.
 * 
 * Hyperbolic tangent (TanH) neuron filter: f(x) = a * tanh(b * x)
 * Parameters: a, b
 * For default behavior, set the value of a to 1.0f and the value of b to 1.0f.
 * 
 * Absolute neuron filter: f(x) = fabs(x)
 * Parameters: none
 * 
 * Parametric Soft Plus neuron filter: f(x) = a * log(1 + e^(b * x))
 * Parameters: a, b
 * For default behavior, set the value of a to 1.0f and the value of b to 1.0f.
 * 
 * Parametric Soft Sign neuron filter: f(x) = x / (1 + abs(x))
 * Parameters: none
 * 
 * Parametric ELU neuron filter: f(x) = x >= 0 ? x : a * (exp(x) - 1)
 * Parameters: a
 * For default behavior, set the value of a to 1.0f.
 * 
 * Parametric ReLU (PReLU) neuron filter: Same as ReLU, except parameter
 * aArray is per channel.
 * For each pixel, applies the following function: f(x_i) = x_i, if x_i >= 0
 * = a_i * x_i if x_i < 0
 * i in [0...channels-1]
 * i.e. parameters a_i are learned and applied to each channel separately. Compare
 * this to ReLu where parameter a is shared across all channels.
 * See https://arxiv.org/pdf/1502.01852.pdf for details.
 * Parameters: aArray - Array of floats containing per channel value of PReLu parameter
 * count - Number of float values in array aArray.
 * 
 * ReLUN neuron filter: f(x) = min((x >= 0 ? x : a * x), b)
 * Parameters: a, b
 * As an example, the TensorFlow Relu6 activation layer can be implemented
 * by setting the parameter b to 6.0f:
 * https://www.tensorflow.org/api_docs/cc/class/tensorflow/ops/relu6.
 * For default behavior, set the value of a to 1.0f and the value of b to 6.0f.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNNeuronDescriptor extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNNeuronDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("a")
    public native float a();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNNeuronDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNNeuronDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("b")
    public native float b();

    @Generated
    @Selector("c")
    public native float c();

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
     * Make a descriptor for a MPSCNNNeuron object.
     * 
     * @param neuronType The type of a neuron filter.
     * @return A valid MPSNNNeuronDescriptor object or nil, if failure.
     */
    @NotNull
    @Generated
    @Selector("cnnNeuronDescriptorWithType:")
    public static native MPSNNNeuronDescriptor cnnNeuronDescriptorWithType(int neuronType);

    /**
     * Make a descriptor for a MPSCNNNeuron object.
     * 
     * @param neuronType The type of a neuron filter.
     * @param a          Parameter "a".
     * @return A valid MPSNNNeuronDescriptor object or nil, if failure.
     */
    @NotNull
    @Generated
    @Selector("cnnNeuronDescriptorWithType:a:")
    public static native MPSNNNeuronDescriptor cnnNeuronDescriptorWithTypeA(int neuronType, float a);

    /**
     * Initialize the neuron descriptor.
     * 
     * @param neuronType The type of a neuron filter.
     * @param a          Parameter "a".
     * @param b          Parameter "b".
     * @return A valid MPSNNNeuronDescriptor object or nil, if failure.
     */
    @NotNull
    @Generated
    @Selector("cnnNeuronDescriptorWithType:a:b:")
    public static native MPSNNNeuronDescriptor cnnNeuronDescriptorWithTypeAB(int neuronType, float a, float b);

    /**
     * Make a descriptor for a MPSCNNNeuron object.
     * 
     * @param neuronType The type of a neuron filter.
     * @param a          Parameter "a".
     * @param b          Parameter "b".
     * @param c          Parameter "c".
     * @return A valid MPSNNNeuronDescriptor object or nil, if failure.
     */
    @NotNull
    @Generated
    @Selector("cnnNeuronDescriptorWithType:a:b:c:")
    public static native MPSNNNeuronDescriptor cnnNeuronDescriptorWithTypeABC(int neuronType, float a, float b,
            float c);

    /**
     * Make a descriptor for a neuron of type MPSCNNNeuronTypePReLU.
     * 
     * The PReLU neuron is the same as a ReLU neuron, except parameter "a" is per feature channel.
     * 
     * @param data   A NSData containing a float array with the per feature channel value
     *               of PReLu parameter. The number of float values in this array usually
     *               corresponds to number of output channels in a convolution layer.
     *               The descriptor retains the NSData object.
     * @param noCopy An optimization flag that tells us whether the NSData allocation is
     *               suitable for use directly with no copying of the data into internal
     *               storage. This allocation has to match the same restrictions as listed
     *               for the newBufferWithBytesNoCopy:length:options:deallocator: method of
     *               MTLBuffer.
     * @return A valid MPSNNNeuronDescriptor object for a neuron of type MPSCNNNeuronTypePReLU or nil, if failure
     */
    @NotNull
    @Generated
    @Selector("cnnNeuronPReLUDescriptorWithData:noCopy:")
    public static native MPSNNNeuronDescriptor cnnNeuronPReLUDescriptorWithDataNoCopy(@NotNull NSData data,
            boolean noCopy);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Note: data is retained, not copied
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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNNeuronDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNNeuronDescriptor initWithCoder(@NotNull NSCoder coder);

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

    @Generated
    @Selector("neuronType")
    public native int neuronType();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNNeuronDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setA:")
    public native void setA(float value);

    @Generated
    @Selector("setB:")
    public native void setB(float value);

    @Generated
    @Selector("setC:")
    public native void setC(float value);

    /**
     * Note: data is retained, not copied
     */
    @Generated
    @Selector("setData:")
    public native void setData(@Nullable NSData value);

    @Generated
    @Selector("setNeuronType:")
    public native void setNeuronType(int value);

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
