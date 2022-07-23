package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * MPSCNNNeuronGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * This filter is a backward filter for the neuron activation function filter.
 * <p>
 * The following filter types are supported:
 * MPSCNNNeuronTypeNone ///< df/dx = 1
 * MPSCNNNeuronTypeLinear ///< df/dx = a
 * MPSCNNNeuronTypeReLU ///< df/dx = [ 1, if x >= 0
 * [ a, if x < 0
 * MPSCNNNeuronTypeSigmoid ///< df/dx = e^x / (e^x + 1)^2
 * MPSCNNNeuronTypeHardSigmoid ///< df/dx = [ a, if ((x * a) + b >= 0) and ((x * a) + b <= 1)
 * [ 0, otherwise
 * MPSCNNNeuronTypeTanH ///< df/dx = a * b * (1 - tanh^2(b * x))
 * MPSCNNNeuronTypeAbsolute ///< df/dx = sign(x)
 * MPSCNNNeuronTypeSoftPlus ///< df/dx = (a * b * exp(b * x)) / (exp(b * x) + 1)
 * MPSCNNNeuronTypeSoftSign ///< df/dx = 1 / (|x| + 1)^2
 * MPSCNNNeuronTypeELU ///< df/dx = [ a * exp(x), x < 0
 * [ 1, x >= 0
 * MPSCNNNeuronTypePReLU ///< df/dx = [ 1, if x >= 0
 * [ aV, if x < 0
 * MPSCNNNeuronTypeReLUN ///< df/dx = [ 1, if x >= 0
 * [ a, if x < 0
 * [ b, if x >= b
 * MPSCNNNeuronTypePower ///< df/dx = a * c * (a * x + b)^(c - 1)
 * MPSCNNNeuronTypeExponential ///< df/dx = [ a * exp(a * x + b), if c == -1
 * [ a * log(c) * c^(a * x + b), if c != -1
 * MPSCNNNeuronTypeLogarithm ///< df/dx = [ a / (a * in + b), if c == -1
 * [ a / (log(c) * (a * in + b)), if c != -1
 * MPSCNNNeuronTypeGeLU ///< df/dx = 0.5 * (1.0 + erf(x * sqrt(0.5))) + (sqrt(0.5) * M_2_SQRTPI * exp(-x*x * 0.5) * x) )
 * <p>
 * The result of the above operation is multiplied with the gradient, computed
 * by the preceeding filter (going backwards).
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNeuronGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNeuronGradient(Pointer peer) {
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
    public static native MPSCNNNeuronGradient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNNeuronGradient allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("b")
    public native float b();

    @Generated
    @Selector("c")
    public native float c();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNNeuronGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNNeuronGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNNeuronGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNNeuronGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the neuron gradient filter with a neuron descriptor.
     *
     * @param device           The device the filter will run on.
     * @param neuronDescriptor The neuron descriptor.
     *                         For the neuron of type MPSCNNNeuronTypePReLU, the neuron
     *                         descriptor references an NSData object containing a float array
     *                         with the per feature channel value of PReLu parameter and, in this
     *                         case, the MPSCNNNeuronGradient retains the NSData object.
     * @return A valid MPSCNNNeuronGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:neuronDescriptor:")
    public native MPSCNNNeuronGradient initWithDeviceNeuronDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNNNeuronDescriptor neuronDescriptor);

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
    @Selector("neuronType")
    public native int neuronType();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNNeuronGradient new_objc();

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
