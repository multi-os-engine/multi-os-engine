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

    @Generated
    @Selector("cellGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource cellGateInputWeights();

    @Generated
    @Selector("cellGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource cellGateMemoryWeights();

    @Generated
    @Selector("cellGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource cellGateRecurrentWeights();

    @Generated
    @Selector("cellToOutputNeuronParamA")
    public native float cellToOutputNeuronParamA();

    @Generated
    @Selector("cellToOutputNeuronParamB")
    public native float cellToOutputNeuronParamB();

    @Generated
    @Selector("cellToOutputNeuronType")
    public native int cellToOutputNeuronType();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

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

    @Generated
    @Selector("forgetGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource forgetGateInputWeights();

    @Generated
    @Selector("forgetGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource forgetGateMemoryWeights();

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

    @Generated
    @Selector("inputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateInputWeights();

    @Generated
    @Selector("inputGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateMemoryWeights();

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

    @Generated
    @Selector("memoryWeightsAreDiagonal")
    public native boolean memoryWeightsAreDiagonal();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("outputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateInputWeights();

    @Generated
    @Selector("outputGateMemoryWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateMemoryWeights();

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

    @Generated
    @Selector("setCellGateInputWeights:")
    public native void setCellGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setCellGateMemoryWeights:")
    public native void setCellGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setCellGateRecurrentWeights:")
    public native void setCellGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setCellToOutputNeuronParamA:")
    public native void setCellToOutputNeuronParamA(float value);

    @Generated
    @Selector("setCellToOutputNeuronParamB:")
    public native void setCellToOutputNeuronParamB(float value);

    @Generated
    @Selector("setCellToOutputNeuronType:")
    public native void setCellToOutputNeuronType(int value);

    @Generated
    @Selector("setForgetGateInputWeights:")
    public native void setForgetGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setForgetGateMemoryWeights:")
    public native void setForgetGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setForgetGateRecurrentWeights:")
    public native void setForgetGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setInputGateInputWeights:")
    public native void setInputGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setInputGateMemoryWeights:")
    public native void setInputGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setInputGateRecurrentWeights:")
    public native void setInputGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setMemoryWeightsAreDiagonal:")
    public native void setMemoryWeightsAreDiagonal(boolean value);

    @Generated
    @Selector("setOutputGateInputWeights:")
    public native void setOutputGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setOutputGateMemoryWeights:")
    public native void setOutputGateMemoryWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

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

    @Generated
    @Selector("cellToOutputNeuronParamC")
    public native float cellToOutputNeuronParamC();

    @Generated
    @Selector("setCellToOutputNeuronParamC:")
    public native void setCellToOutputNeuronParamC(float value);
}