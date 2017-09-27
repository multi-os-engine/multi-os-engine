/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

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
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionDescriptor extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionDescriptor alloc();

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

    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:neuronFilter:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannelsNeuronFilter(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels, MPSCNNNeuron neuronFilter);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("groups")
    @NUInt
    public native long groups();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionDescriptor init();

    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @Generated
    @Selector("neuron")
    public native MPSCNNNeuron neuron();

    @Generated
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    @Generated
    @Selector("setGroups:")
    public native void setGroups(@NUInt long value);

    @Generated
    @Selector("setInputFeatureChannels:")
    public native void setInputFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setKernelHeight:")
    public native void setKernelHeight(@NUInt long value);

    @Generated
    @Selector("setKernelWidth:")
    public native void setKernelWidth(@NUInt long value);

    @Generated
    @Selector("setNeuron:")
    public native void setNeuron(MPSCNNNeuron value);

    @Generated
    @Selector("setOutputFeatureChannels:")
    public native void setOutputFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setStrideInPixelsX:")
    public native void setStrideInPixelsX(@NUInt long value);

    @Generated
    @Selector("setStrideInPixelsY:")
    public native void setStrideInPixelsY(@NUInt long value);

    @Generated
    @Selector("strideInPixelsX")
    @NUInt
    public native long strideInPixelsX();

    @Generated
    @Selector("strideInPixelsY")
    @NUInt
    public native long strideInPixelsY();

    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannels(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels);

    @Generated
    @Selector("dilationRateX")
    @NUInt
    public native long dilationRateX();

    @Generated
    @Selector("dilationRateY")
    @NUInt
    public native long dilationRateY();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNConvolutionDescriptor initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("neuronParameterA")
    public native float neuronParameterA();

    @Generated
    @Selector("neuronParameterB")
    public native float neuronParameterB();

    @Generated
    @Selector("neuronType")
    public native int neuronType();

    @Generated
    @Selector("setBatchNormalizationParametersForInferenceWithMean:variance:gamma:beta:epsilon:")
    public native void setBatchNormalizationParametersForInferenceWithMeanVarianceGammaBetaEpsilon(ConstFloatPtr mean,
            ConstFloatPtr variance, ConstFloatPtr gamma, ConstFloatPtr beta, float epsilon);

    @Generated
    @Selector("setDilationRateX:")
    public native void setDilationRateX(@NUInt long value);

    @Generated
    @Selector("setDilationRateY:")
    public native void setDilationRateY(@NUInt long value);

    @Generated
    @Selector("setNeuronToPReLUWithParametersA:")
    public native void setNeuronToPReLUWithParametersA(NSData A);

    @Generated
    @Selector("setNeuronType:parameterA:parameterB:")
    public native void setNeuronTypeParameterAParameterB(int neuronType, float parameterA, float parameterB);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
