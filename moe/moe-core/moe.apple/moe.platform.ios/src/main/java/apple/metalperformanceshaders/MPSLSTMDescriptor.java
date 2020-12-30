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
 * MPSLSTMDescriptor
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSLSTMDescriptor specifies a LSTM block/layer descriptor.
 *             The RNN layer initialized with a MPSLSTMDescriptor transforms the input data (image or matrix),
 *             the memory cell data and previous output with a set of filters, each producing one feature map in
 *             the output data and memory cell, according to the LSTM formulae detailed below.
 *             The user may provide the LSTM unit a single input or a sequence of inputs.
 * 
 *                 Description of operation:
 * 
 *             Let x_j be the input data (at time index t of sequence,
 *                         j index containing quadruplet: batch index, x,y and feature index (x=y=0 for matrices)).
 *             Let h0_j be the recurrent input (previous output) data from previous time step (at time index t-1 of sequence).
 *             Let h1_i be the output data produced at this time step.
 *             Let c0_j be the previous memory cell data (at time index t-1 of sequence).
 *             Let c1_i be the new memory cell data (at time index t-1 of sequence).
 * 
 *             Let Wi_ij, Ui_ij, Vi_ij, be the input gate weights for input, recurrent input and memory cell (peephole) data respectively
 *             Let bi_i be the bias for the input gate
 * 
 *             Let Wf_ij, Uf_ij, Vf_ij, be the forget gate weights for input, recurrent input and memory cell data respectively
 *             Let bf_i be the bias for the forget gate
 * 
 *             Let Wo_ij, Uo_ij, Vo_ij, be the output gate weights for input, recurrent input and memory cell data respectively
 *             Let bo_i be the bias for the output gate
 * 
 *             Let Wc_ij, Uc_ij, Vc_ij, be the memory cell gate weights for input, recurrent input and memory cell data respectively
 *             Let bc_i be the bias for the memory cell gate
 * 
 *             Let gi(x), gf(x), go(x), gc(x) be neuron activation function for the input, forget, output gate and memory cell gate
 *             Let gh(x) be the activation function applied to result memory cell data
 * 
 *             Then the new memory cell data c1_j and output image h1_i are computed as follows:
 * 
 *                     I_i = gi(  Wi_ij * x_j  +  Ui_ij * h0_j  +  Vi_ij * c0_j  + bi_i  )
 *                     F_i = gf(  Wf_ij * x_j  +  Uf_ij * h0_j  +  Vf_ij * c0_j  + bf_i  )
 *                     C_i = gc(  Wc_ij * x_j  +  Uc_ij * h0_j  +  Vc_ij * c0_j  + bc_i  )
 * 
 *                 c1_i = F_i c0_i  +  I_i C_i
 * 
 *                     O_i = go(  Wo_ij * x_j  +  Uo_ij * h0_j  +  Vo_ij * c1_j  + bo_i  )
 * 
 *                 h1_i = O_i gh( c1_i )
 * 
 *             The '*' stands for convolution (see @ref MPSRNNImageInferenceLayer) or matrix-vector/matrix multiplication
 *             (see @ref MPSRNNMatrixInferenceLayer).
 *             Summation is over index j (except for the batch index), but there is no summation over
 *             repeated index i - the output index.
 *             Note that for validity all intermediate images have to be of same size and all U and V matrices have to be square
 *             (ie. outputFeatureChannels == inputFeatureChannels in those). Also the bias terms are scalars wrt. spatial dimensions.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSLSTMDescriptor extends MPSRNNDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSLSTMDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSLSTMDescriptor alloc();

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

    /**
     * [@property]   cellGateInputWeights
     * 
     * Contains weights 'Wc_ij', bias 'bc_i' and neuron 'gc' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("cellGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource cellGateInputWeights();

    /**
     * [@property]   cellGateMemoryWeights
     * 
     * Contains weights 'Vc_ij' - the 'peephole' weights - from the LSTM formula.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("cellGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource cellGateMemoryWeights();

    /**
     * [@property]   cellGateRecurrentWeights
     * 
     * Contains weights 'Uc_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("cellGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource cellGateRecurrentWeights();

    /**
     * [@property]   cellToOutputNeuronParamA
     * 
     * Neuron parameter A for 'gh'. Defaults to 1.0f.
     */
    @Generated
    @Selector("cellToOutputNeuronParamA")
    public native float cellToOutputNeuronParamA();

    /**
     * [@property]   cellToOutputNeuronParamB
     * 
     * Neuron parameter B for 'gh'. Defaults to 1.0f.
     */
    @Generated
    @Selector("cellToOutputNeuronParamB")
    public native float cellToOutputNeuronParamB();

    /**
     * [@property]   cellToOutputNeuronType
     * 
     * Neuron type definition for 'gh', see @ref MPSCNNNeuronType. Defaults to MPSCNNNeuronTypeTanH.
     */
    @Generated
    @Selector("cellToOutputNeuronType")
    public native int cellToOutputNeuronType();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Creates a LSTM descriptor.
     * 
     * @param      inputFeatureChannels    The number of feature channels in the input image/matrix. Must be >= 1.
     * @param      outputFeatureChannels   The number of feature channels in the output image/matrix. Must be >= 1.
     * @return     A valid MPSNNLSTMDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("createLSTMDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object createLSTMDescriptorWithInputFeatureChannelsOutputFeatureChannels(
            @NUInt long inputFeatureChannels, @NUInt long outputFeatureChannels);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]   forgetGateInputWeights
     * 
     * Contains weights 'Wf_ij', bias 'bf_i' and neuron 'gf' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping).Defaults to nil.
     */
    @Generated
    @Selector("forgetGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource forgetGateInputWeights();

    /**
     * [@property]   forgetGateMemoryWeights
     * 
     * Contains weights 'Vf_ij' - the 'peephole' weights - from the LSTM formula.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("forgetGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource forgetGateMemoryWeights();

    /**
     * [@property]   forgetGateRecurrentWeights
     * 
     * Contains weights 'Uf_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("forgetGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource forgetGateRecurrentWeights();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSLSTMDescriptor init();

    /**
     * [@property]   inputGateInputWeights
     * 
     * Contains weights 'Wi_ij', bias 'bi_i' and neuron 'gi' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("inputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateInputWeights();

    /**
     * [@property]   inputGateMemoryWeights
     * 
     * Contains weights 'Vi_ij' - the 'peephole' weights - from the LSTM formula.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("inputGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateMemoryWeights();

    /**
     * [@property]   inputGateRecurrentWeights
     * 
     * Contains weights 'Ui_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property]   memoryWeightsAreDiagonal
     * 
     * If YES, then the 'peephole' weight matrices will be diagonal matrices represented as
     *             vectors of length the number of features in memory cells, that will be multiplied pointwise
     *             with the peephole matrix or image in order to achieve the diagonal (nonmixing) update.
     *             Defaults to NO.
     */
    @Generated
    @Selector("memoryWeightsAreDiagonal")
    public native boolean memoryWeightsAreDiagonal();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property]   outputGateInputWeights
     * 
     * Contains weights 'Wo_ij', bias 'bo_i' and neuron 'go' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("outputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateInputWeights();

    /**
     * [@property]   outputGateMemoryWeights
     * 
     * Contains weights 'Vo_ij' - the 'peephole' weights - from the LSTM.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("outputGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateMemoryWeights();

    /**
     * [@property]   outputGateRecurrentWeights
     * 
     * Contains weights 'Uo_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("outputGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateRecurrentWeights();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   cellGateInputWeights
     * 
     * Contains weights 'Wc_ij', bias 'bc_i' and neuron 'gc' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("setCellGateInputWeights:")
    public native void setCellGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   cellGateMemoryWeights
     * 
     * Contains weights 'Vc_ij' - the 'peephole' weights - from the LSTM formula.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setCellGateMemoryWeights:")
    public native void setCellGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   cellGateRecurrentWeights
     * 
     * Contains weights 'Uc_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setCellGateRecurrentWeights:")
    public native void setCellGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   cellToOutputNeuronParamA
     * 
     * Neuron parameter A for 'gh'. Defaults to 1.0f.
     */
    @Generated
    @Selector("setCellToOutputNeuronParamA:")
    public native void setCellToOutputNeuronParamA(float value);

    /**
     * [@property]   cellToOutputNeuronParamB
     * 
     * Neuron parameter B for 'gh'. Defaults to 1.0f.
     */
    @Generated
    @Selector("setCellToOutputNeuronParamB:")
    public native void setCellToOutputNeuronParamB(float value);

    /**
     * [@property]   cellToOutputNeuronType
     * 
     * Neuron type definition for 'gh', see @ref MPSCNNNeuronType. Defaults to MPSCNNNeuronTypeTanH.
     */
    @Generated
    @Selector("setCellToOutputNeuronType:")
    public native void setCellToOutputNeuronType(int value);

    /**
     * [@property]   forgetGateInputWeights
     * 
     * Contains weights 'Wf_ij', bias 'bf_i' and neuron 'gf' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping).Defaults to nil.
     */
    @Generated
    @Selector("setForgetGateInputWeights:")
    public native void setForgetGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   forgetGateMemoryWeights
     * 
     * Contains weights 'Vf_ij' - the 'peephole' weights - from the LSTM formula.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setForgetGateMemoryWeights:")
    public native void setForgetGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   forgetGateRecurrentWeights
     * 
     * Contains weights 'Uf_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setForgetGateRecurrentWeights:")
    public native void setForgetGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   inputGateInputWeights
     * 
     * Contains weights 'Wi_ij', bias 'bi_i' and neuron 'gi' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("setInputGateInputWeights:")
    public native void setInputGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   inputGateMemoryWeights
     * 
     * Contains weights 'Vi_ij' - the 'peephole' weights - from the LSTM formula.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setInputGateMemoryWeights:")
    public native void setInputGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   inputGateRecurrentWeights
     * 
     * Contains weights 'Ui_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setInputGateRecurrentWeights:")
    public native void setInputGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   memoryWeightsAreDiagonal
     * 
     * If YES, then the 'peephole' weight matrices will be diagonal matrices represented as
     *             vectors of length the number of features in memory cells, that will be multiplied pointwise
     *             with the peephole matrix or image in order to achieve the diagonal (nonmixing) update.
     *             Defaults to NO.
     */
    @Generated
    @Selector("setMemoryWeightsAreDiagonal:")
    public native void setMemoryWeightsAreDiagonal(boolean value);

    /**
     * [@property]   outputGateInputWeights
     * 
     * Contains weights 'Wo_ij', bias 'bo_i' and neuron 'go' from the LSTM formula.
     *             If nil then assumed zero weights, bias and no neuron (identity mapping). Defaults to nil.
     */
    @Generated
    @Selector("setOutputGateInputWeights:")
    public native void setOutputGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   outputGateMemoryWeights
     * 
     * Contains weights 'Vo_ij' - the 'peephole' weights - from the LSTM.
     *             if YES == memoryWeightsAreDiagonal, then the number of weights used is the number of features
     *                 in the memory cell image/matrix.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setOutputGateMemoryWeights:")
    public native void setOutputGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    /**
     * [@property]   outputGateRecurrentWeights
     * 
     * Contains weights 'Uo_ij' from the LSTM formula.
     *             If nil then assumed zero weights. Defaults to nil.
     */
    @Generated
    @Selector("setOutputGateRecurrentWeights:")
    public native void setOutputGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

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

    /**
     * [@property]   cellToOutputNeuronParamC
     * 
     * Neuron parameter C for 'gh'. Defaults to 1.0f.
     */
    @Generated
    @Selector("cellToOutputNeuronParamC")
    public native float cellToOutputNeuronParamC();

    /**
     * [@property]   cellToOutputNeuronParamC
     * 
     * Neuron parameter C for 'gh'. Defaults to 1.0f.
     */
    @Generated
    @Selector("setCellToOutputNeuronParamC:")
    public native void setCellToOutputNeuronParamC(float value);
}