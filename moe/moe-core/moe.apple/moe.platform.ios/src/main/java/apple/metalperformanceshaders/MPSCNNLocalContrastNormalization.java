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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNLocalContrastNormalization
 * [@dependency] This depends on Metal.framework
 * 
 * Specifies the local contrast normalization filter.
 * The local contrast normalization is quite similar to spatial normalization
 * (see @ref MPSCNNSpatialNormalization) in that it applies the filter over local regions which extend
 * spatially, but are in separate feature channels (i.e., they have shape 1 x kernelWidth x kernelHeight),
 * but instead of dividing by the local "energy" of the feature, the denominator uses the local variance
 * of the feature - effectively the mean value of the feature is subtracted from the signal.
 * For each feature channel, the function computes the variance VAR(i,j) and
 * mean M(i,j) of X(i,j) inside each rectangle around the spatial point (i,j).
 * 
 * Then the result is computed for each element of X as follows:
 * 
 * Y(i,j) = pm + ps * ( X(i,j) - p0 * M(i,j)) / (delta + alpha * VAR(i,j))^beta,
 * 
 * where kw and kh are the kernelWidth and the kernelHeight and pm, ps and p0 are parameters that
 * can be used to offset and scale the result in various ways. For example setting
 * pm=0, ps=1, p0=1, delta=0, alpha=1.0 and beta=0.5 scales input data so that the result has
 * unit variance and zero mean, provided that input variance is positive.
 * It is the end-users responsibility to ensure that the combination of the
 * parameters delta and alpha does not result in a situation where the denominator
 * becomes zero - in such situations the resulting pixel-value is undefined. A good way to guard
 * against tiny variances is to regulate the expression with a small value for delta, for example
 * delta = 1/1024 = 0.0009765625.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNLocalContrastNormalization extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLocalContrastNormalization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLocalContrastNormalization alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLocalContrastNormalization allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNLocalContrastNormalization new_objc();

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

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 0.0
     * 
     * The default value 0.0 is not recommended and is
     * preserved for backwards compatibility. With alpha 0,
     * it performs a local mean subtraction. The
     * MPSCNNLocalContrastNormalizationNode used with
     * the MPSNNGraph uses 1.0 as a default.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 0.5
     */
    @Generated
    @Selector("beta")
    public native float beta();

    /**
     * [@property] delta
     * 
     * The value of delta. Default is 1/1024
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("init")
    public native MPSCNNLocalContrastNormalization init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNLocalContrastNormalization initWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a local contrast normalization filter
     * 
     * @param device       The device the filter will run on
     * @param kernelWidth  The width of the kernel
     * @param kernelHeight The height of the kernel
     * @return A valid MPSCNNLocalContrastNormalization object or nil, if failure.
     * 
     *         NOTE: For now, kernelWidth must be equal to kernelHeight
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNLocalContrastNormalization initWithDeviceKernelWidthKernelHeight(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth,
            @NUInt long kernelHeight);

    /**
     * [@property] p0
     * 
     * The value of p0. Default is 1.0
     */
    @Generated
    @Selector("p0")
    public native float p0();

    /**
     * [@property] pm
     * 
     * The value of pm. Default is 0.0
     */
    @Generated
    @Selector("pm")
    public native float pm();

    /**
     * [@property] ps
     * 
     * The value of ps. Default is 1.0
     */
    @Generated
    @Selector("ps")
    public native float ps();

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 0.0
     * 
     * The default value 0.0 is not recommended and is
     * preserved for backwards compatibility. With alpha 0,
     * it performs a local mean subtraction. The
     * MPSCNNLocalContrastNormalizationNode used with
     * the MPSNNGraph uses 1.0 as a default.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(float value);

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 0.5
     */
    @Generated
    @Selector("setBeta:")
    public native void setBeta(float value);

    /**
     * [@property] delta
     * 
     * The value of delta. Default is 1/1024
     */
    @Generated
    @Selector("setDelta:")
    public native void setDelta(float value);

    /**
     * [@property] p0
     * 
     * The value of p0. Default is 1.0
     */
    @Generated
    @Selector("setP0:")
    public native void setP0(float value);

    /**
     * [@property] pm
     * 
     * The value of pm. Default is 0.0
     */
    @Generated
    @Selector("setPm:")
    public native void setPm(float value);

    /**
     * [@property] ps
     * 
     * The value of ps. Default is 1.0
     */
    @Generated
    @Selector("setPs:")
    public native void setPs(float value);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNLocalContrastNormalization initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNLocalContrastNormalization initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
