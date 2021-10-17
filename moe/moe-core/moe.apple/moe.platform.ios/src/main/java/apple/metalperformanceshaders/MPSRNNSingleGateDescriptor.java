package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
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
 * MPSRNNSingleGateDescriptor
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSRNNSingleGateDescriptor specifies a simple recurrent block/layer descriptor.
 * The RNN layer initialized with a MPSRNNSingleGateDescriptor transforms the input data (image or matrix),
 * and previous output with a set of filters, each producing one feature map in the new output data.
 * The user may provide the RNN unit a single input or a sequence of inputs.
 * <p>
 * Description of operation:
 * <p>
 * Let x_j be the input data (at time index t of sequence,
 * j index containing quadruplet: batch index, x,y and feature index (x=y=0 for matrices)).
 * Let h0_j be the recurrent input (previous output) data from previous time step (at time index t-1 of sequence).
 * Let h1_i be the output data produced at this time step.
 * <p>
 * Let W_ij, U_ij be the weights for input and recurrent input data respectively
 * Let b_i be a bias term
 * <p>
 * Let gi(x) be a neuron activation function
 * <p>
 * Then the new output image h1_i data is computed as follows:
 * <p>
 * h1_i = gi( W_ij * x_j + U_ij * h0_j  + b_i )
 * <p>
 * The '*' stands for convolution (see @ref MPSRNNImageInferenceLayer) or matrix-vector/matrix multiplication
 * (see @ref MPSRNNMatrixInferenceLayer).
 * Summation is over index j (except for the batch index), but there is no summation over
 * repeated index i - the output index.
 * Note that for validity all intermediate images have to be of same size and the U matrix has to be square
 * (ie. outputFeatureChannels == inputFeatureChannels in those). Also the bias terms are scalars wrt. spatial dimensions.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSRNNSingleGateDescriptor extends MPSRNNDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNSingleGateDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNSingleGateDescriptor alloc();

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
     * Creates a MPSRNNSingleGateDescriptor
     *
     * @param inputFeatureChannels  The number of feature channels in the input image/matrix. Must be >= 1.
     * @param outputFeatureChannels The number of feature channels in the output image/matrix. Must be >= 1.
     * @return A valid MPSRNNSingleGateDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("createRNNSingleGateDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object createRNNSingleGateDescriptorWithInputFeatureChannelsOutputFeatureChannels(
            @NUInt long inputFeatureChannels, @NUInt long outputFeatureChannels);

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
    public native MPSRNNSingleGateDescriptor init();

    /**
     * [@property]   inputWeights
     * <p>
     * Contains weights 'W_ij', bias 'b_i' and neuron 'gi' from the simple RNN layer formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("inputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputWeights();

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
     * [@property]   recurrentWeights
     * <p>
     * Contains weights 'U_ij' from the simple RNN layer formula.
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("recurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource recurrentWeights();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   inputWeights
     * <p>
     * Contains weights 'W_ij', bias 'b_i' and neuron 'gi' from the simple RNN layer formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("setInputWeights:")
    public native void setInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   recurrentWeights
     * <p>
     * Contains weights 'U_ij' from the simple RNN layer formula.
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setRecurrentWeights:")
    public native void setRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
