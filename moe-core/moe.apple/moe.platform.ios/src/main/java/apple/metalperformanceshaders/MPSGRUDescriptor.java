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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSGRUDescriptor
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSGRUDescriptor specifies a GRU (Gated Recurrent Unit) block/layer descriptor.
 * The RNN layer initialized with a MPSGRUDescriptor transforms the input data (image or matrix),
 * and previous output with a set of filters, each producing one feature map in
 * the output data according to the Gated unit formulae detailed below.
 * The user may provide the GRU unit a single input or a sequence of inputs. The layer also supports
 * p-norm gating (Detailed in: https://arxiv.org/abs/1608.03639 ).
 * 
 * Description of operation:
 * 
 * Let x_j be the input data (at time index t of sequence,
 * j index containing quadruplet: batch index, x,y and feature index (x=y=0 for matrices)).
 * Let h0_j be the recurrent input (previous output) data from previous time step (at time index t-1 of sequence).
 * Let h_i be the proposed new output.
 * Let h1_i be the output data produced at this time step.
 * 
 * Let Wz_ij, Uz_ij, be the input gate weights for input and recurrent input data respectively
 * Let bi_i be the bias for the input gate
 * 
 * Let Wr_ij, Ur_ij be the recurrent gate weights for input and recurrent input data respectively
 * Let br_i be the bias for the recurrent gate
 * 
 * Let Wh_ij, Uh_ij, Vh_ij, be the output gate weights for input, recurrent gate and input gate respectively
 * Let bh_i be the bias for the output gate
 * 
 * Let gz(x), gr(x), gh(x) be the neuron activation function for the input, recurrent and output gates
 * Let p > 0 be a scalar variable (typicall p >= 1.0) that defines the p-norm gating norm value.
 * 
 * Then the output of the Gated Recurrent Unit layer is computed as follows:
 * 
 * z_i = gz( Wz_ij * x_j + Uz_ij * h0_j + bz_i )
 * r_i = gr( Wr_ij * x_j + Ur_ij * h0_j + br_i )
 * c_i = Uh_ij * (r_j h0_j) + Vh_ij * (z_j h0_j)
 * h_i = gh( Wh_ij * x_j + c_i + bh_i )
 * 
 * h1_i = ( 1 - z_i ^ p)^(1/p) h_i + z_i h0_i
 * 
 * 
 * The '*' stands for convolution (see @ref MPSRNNImageInferenceLayer) or matrix-vector/matrix multiplication
 * (see @ref MPSRNNMatrixInferenceLayer).
 * Summation is over index j (except for the batch index), but there is no summation over
 * repeated index i - the output index.
 * Note that for validity all intermediate images have to be of same size and all U and V matrices have to be square
 * (ie. outputFeatureChannels == inputFeatureChannels in those). Also the bias terms are scalars wrt. spatial
 * dimensions.
 * The conventional GRU block is achieved by setting Vh = 0 (nil) and the so-called Minimal Gated Unit is achieved with
 * Uh = 0.
 * (The Minimal Gated Unit is detailed in: https://arxiv.org/abs/1603.09420 and there they call z_i the value of the
 * forget gate).
 * 
 * 
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGRUDescriptor extends MPSRNNDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGRUDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGRUDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSGRUDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
     * Creates a GRU descriptor.
     * 
     * @param inputFeatureChannels  The number of feature channels in the input image/matrix. Must be >= 1.
     * @param outputFeatureChannels The number of feature channels in the output image/matrix. Must be >= 1.
     * @return A valid MPSGRUDescriptor object or nil, if failure.
     * 
     *         API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("createGRUDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    public static native MPSGRUDescriptor createGRUDescriptorWithInputFeatureChannelsOutputFeatureChannels(
            @NUInt long inputFeatureChannels, @NUInt long outputFeatureChannels);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] flipOutputGates
     * 
     * If YES then the GRU-block output formula is changed to:
     * h1_i = ( 1 - z_i ^ p)^(1/p) h0_i + z_i h_i.
     * Defaults to NO.
     */
    @Generated
    @Selector("flipOutputGates")
    public native boolean flipOutputGates();

    /**
     * [@property] gatePnormValue
     * 
     * The p-norm gating norm value as specified by the GRU formulae. Defaults to 1.0f.
     */
    @Generated
    @Selector("gatePnormValue")
    public native float gatePnormValue();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGRUDescriptor init();

    /**
     * [@property] inputGateInputWeights
     * 
     * Contains weights 'Wz_ij', bias 'bz_i' and neuron 'gz' from the GRU formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("inputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateInputWeights();

    /**
     * [@property] inputGateRecurrentWeights
     * 
     * Contains weights 'Uz_ij' from the GRU formula.
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("inputGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateRecurrentWeights();

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
    @Owned
    @Selector("new")
    public static native MPSGRUDescriptor new_objc();

    /**
     * [@property] outputGateInputGateWeights
     * 
     * Contains weights 'Vh_ij' - can be used to implement the "Minimally Gated Unit".
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("outputGateInputGateWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateInputGateWeights();

    /**
     * [@property] outputGateInputWeights
     * 
     * Contains weights 'Wh_ij', bias 'bh_i' and neuron 'gh' from the GRU formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping).Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("outputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateInputWeights();

    /**
     * [@property] outputGateRecurrentWeights
     * 
     * Contains weights 'Uh_ij' from the GRU formula.
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("outputGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateRecurrentWeights();

    /**
     * [@property] recurrentGateInputWeights
     * 
     * Contains weights 'Wr_ij', bias 'br_i' and neuron 'gr' from the GRU formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping).Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("recurrentGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource recurrentGateInputWeights();

    /**
     * [@property] recurrentGateRecurrentWeights
     * 
     * Contains weights 'Ur_ij' from the GRU formula.
     * If nil then assumed zero weights.Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("recurrentGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource recurrentGateRecurrentWeights();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] flipOutputGates
     * 
     * If YES then the GRU-block output formula is changed to:
     * h1_i = ( 1 - z_i ^ p)^(1/p) h0_i + z_i h_i.
     * Defaults to NO.
     */
    @Generated
    @Selector("setFlipOutputGates:")
    public native void setFlipOutputGates(boolean value);

    /**
     * [@property] gatePnormValue
     * 
     * The p-norm gating norm value as specified by the GRU formulae. Defaults to 1.0f.
     */
    @Generated
    @Selector("setGatePnormValue:")
    public native void setGatePnormValue(float value);

    /**
     * [@property] inputGateInputWeights
     * 
     * Contains weights 'Wz_ij', bias 'bz_i' and neuron 'gz' from the GRU formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("setInputGateInputWeights:")
    public native void setInputGateInputWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property] inputGateRecurrentWeights
     * 
     * Contains weights 'Uz_ij' from the GRU formula.
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setInputGateRecurrentWeights:")
    public native void setInputGateRecurrentWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property] outputGateInputGateWeights
     * 
     * Contains weights 'Vh_ij' - can be used to implement the "Minimally Gated Unit".
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setOutputGateInputGateWeights:")
    public native void setOutputGateInputGateWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property] outputGateInputWeights
     * 
     * Contains weights 'Wh_ij', bias 'bh_i' and neuron 'gh' from the GRU formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping).Defaults to nil.
     */
    @Generated
    @Selector("setOutputGateInputWeights:")
    public native void setOutputGateInputWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property] outputGateRecurrentWeights
     * 
     * Contains weights 'Uh_ij' from the GRU formula.
     * If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setOutputGateRecurrentWeights:")
    public native void setOutputGateRecurrentWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property] recurrentGateInputWeights
     * 
     * Contains weights 'Wr_ij', bias 'br_i' and neuron 'gr' from the GRU formula.
     * If nil then assumed zero weights, bias and no neuron (identity mapping).Defaults to nil.
     */
    @Generated
    @Selector("setRecurrentGateInputWeights:")
    public native void setRecurrentGateInputWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property] recurrentGateRecurrentWeights
     * 
     * Contains weights 'Ur_ij' from the GRU formula.
     * If nil then assumed zero weights.Defaults to nil.
     */
    @Generated
    @Selector("setRecurrentGateRecurrentWeights:")
    public native void setRecurrentGateRecurrentWeights(
            @Nullable @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
