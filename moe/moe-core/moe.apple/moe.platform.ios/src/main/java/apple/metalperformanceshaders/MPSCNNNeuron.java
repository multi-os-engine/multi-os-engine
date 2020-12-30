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
import apple.metal.protocol.MTLDevice;
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

/**
 * @class      MPSCNNNeuron
 * @dependency This depends on Metal.framework
 * @discussion This filter applies a neuron activation function.
 *             You must use one of the sub-classes of MPSCNNNeuron.
 * 
 * The following filter types are supported:
 * MPSCNNNeuronTypeNone            ///< f(x) = x
 * MPSCNNNeuronTypeLinear          ///< f(x) = a * x + b
 * MPSCNNNeuronTypeReLU            ///< f(x) = x >= 0 ? x : a * x
 * MPSCNNNeuronTypeSigmoid         ///< f(x) = 1 / (1 + e^-x)
 * MPSCNNNeuronTypeHardSigmoid     ///< f(x) = clamp((x * a) + b, 0, 1)
 * MPSCNNNeuronTypeTanH            ///< f(x) = a * tanh(b * x)
 * MPSCNNNeuronTypeAbsolute        ///< f(x) = fabs(x)
 * MPSCNNNeuronTypeSoftPlus        ///< f(x) = a * log(1 + e^(b * x))
 * MPSCNNNeuronTypeSoftSign        ///< f(x) = x / (1 + abs(x))
 * MPSCNNNeuronTypeELU             ///< f(x) = x >= 0 ? x : a * (exp(x) - 1)
 * MPSCNNNeuronTypePReLU           ///< Same as ReLU except parameter a is per channel
 * MPSCNNNeuronTypeReLUN           ///< f(x) = min((x >= 0 ? x : a * x), b)
 * MPSCNNNeuronTypePower           ///< f(x) = (a * x + b) ^ c
 * MPSCNNNeuronTypeExponential     ///< f(x) = c ^ (a * x + b)
 * MPSCNNNeuronTypeLogarithm       ///< f(x) = log_c(a * x + b)
 * MPSCNNNeuronTypeGeLU            ///< f(x) = (1.0 + erf(x * sqrt(0.5))) * 0.5 * x
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNNeuron extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNNeuron(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNNeuron alloc();

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
    @Selector("init")
    public native MPSCNNNeuron init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNNeuron initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNNeuron initWithCoder(NSCoder aDecoder);

    /**
     * @abstract NSSecureCoding compatability
     * @discussion While the standard NSSecureCoding/NSCoding method
     *             -initWithCoder: should work, since the file can't
     *             know which device your data is allocated on, we
     *             have to guess and may guess incorrectly.  To avoid
     *             that problem, use initWithCoder:device instead.
     * @param      aDecoder    The NSCoder subclass with your serialized MPSKernel
     * @param      device      The MTLDevice on which to make the MPSKernel
     * @return     A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNNeuron initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("a")
    public native float a();

    @Generated
    @Selector("b")
    public native float b();

    @Generated
    @Selector("c")
    public native float c();

    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * @abstract  Initialize the neuron filter with a neuron descriptor.
     * @param     device                   The device the filter will run on.
     * @param     neuronDescriptor         The neuron descriptor.
     *                                     For the neuron of type MPSCNNNeuronTypePReLU, the neuron
     *                                     descriptor references an NSData object containing a float array
     *                                     with the per feature channel value of PReLu parameter and, in this
     *                                     case, the MPSCNNNeuron retains the NSData object.
     * @return    A valid MPSCNNNeuron object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:neuronDescriptor:")
    public native MPSCNNNeuron initWithDeviceNeuronDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNNNeuronDescriptor neuronDescriptor);

    @Generated
    @Selector("neuronType")
    public native int neuronType();
}
