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
 * MPSCNNCrossChannelNormalization
 * [@dependency] This depends on Metal.framework
 * 
 * Specifies the normalization filter across feature channels.
 * This normalization filter applies the filter to a local region across nearby feature channels,
 * but with no spatial extent (i.e., they have shape kernelSize x 1 x 1).
 * The normalized output is given by:
 * Y(i,j,k) = X(i,j,k) / L(i,j,k)^beta,
 * where the normalizing factor is:
 * L(i,j,k) = delta + alpha/N * (sum_{q in Q(k)} X(i,j,q)^2, where
 * N is the kernel size. The window Q(k) itself is defined as:
 * Q(k) = [max(0, k-floor(N/2)), min(D-1, k+floor((N-1)/2)], where
 * 
 * k is the feature channel index (running from 0 to D-1) and
 * D is the number of feature channels, and alpha, beta and delta are paremeters.
 * It is the end-users responsibility to ensure that the combination of the
 * parameters delta and alpha does not result in a situation where the denominator
 * becomes zero - in such situations the resulting pixel-value is undefined.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNCrossChannelNormalization extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNCrossChannelNormalization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNCrossChannelNormalization alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNCrossChannelNormalization allocWithZone(VoidPtr zone);

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
    public static native MPSCNNCrossChannelNormalization new_objc();

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
     * The value of alpha. Default is 1.0. Must be non-negative.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 5.0
     */
    @Generated
    @Selector("beta")
    public native float beta();

    /**
     * [@property] delta
     * 
     * The value of delta. Default is 1.0
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("init")
    public native MPSCNNCrossChannelNormalization init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNCrossChannelNormalization initWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a local response normalization filter in a channel
     * 
     * @param device     The device the filter will run on
     * @param kernelSize The kernel filter size in each dimension.
     * @return A valid MPSCNNCrossChannelNormalization object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelSize:")
    public native MPSCNNCrossChannelNormalization initWithDeviceKernelSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelSize);

    /**
     * [@property] kernelSize
     * 
     * The size of the square filter window. Default is 5
     */
    @Generated
    @Selector("kernelSize")
    @NUInt
    public native long kernelSize();

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 1.0. Must be non-negative.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(float value);

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 5.0
     */
    @Generated
    @Selector("setBeta:")
    public native void setBeta(float value);

    /**
     * [@property] delta
     * 
     * The value of delta. Default is 1.0
     */
    @Generated
    @Selector("setDelta:")
    public native void setDelta(float value);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNCrossChannelNormalization initWithCoder(@NotNull NSCoder aDecoder);

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
    public native MPSCNNCrossChannelNormalization initWithCoderDevice(@NotNull NSCoder aDecoder,
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
