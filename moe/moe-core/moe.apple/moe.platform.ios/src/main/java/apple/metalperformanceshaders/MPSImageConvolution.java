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
import org.moe.natj.general.ptr.ConstFloatPtr;
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
 * MPSImageConvolution
 * 
 * The MPSImageConvolution convolves an image with given filter of odd width and height.
 * The center of the kernel aligns with the MPSImageConvolution.offset. That is, the position
 * of the top left corner of the area covered by the kernel is given by
 * MPSImageConvolution.offset - {kernel_width>>1, kernel_height>>1, 0}
 * 
 * Optimized cases include 3x3,5x5,7x7,9x9,11x11, 1xN and Nx1. If a convolution kernel
 * does not fall into one of these cases but is a rank-1 matrix (a.k.a. separable)
 * then it will fall on an optimzied separable path. Other convolutions will execute with
 * full MxN complexity.
 * 
 * If there are multiple channels in the source image, each channel is processed independently.
 * 
 * [@performance] Separable convolution filters may perform better when done in two passes. A convolution filter
 * is separable if the ratio of filter values between all rows is constant over the whole row. For
 * example, this edge detection filter:
 * [@code]
 * -1 0 1
 * -2 0 2
 * -1 0 1
 * [@endcode]
 * can be separated into the product of two vectors:
 * [@code]
 * 1
 * 2 x [-1 0 1]
 * 1
 * [@endcode]
 * and consequently can be done as two, one-dimensional convolution passes back to back on the same image.
 * In this way, the number of multiplies (ignoring the fact that we could skip zeros here) is reduced from
 * 3*3=9 to 3+3 = 6. There are similar savings for addition. For large filters, the savings can be profound.
 * 
 * 
 * API-Since: 9.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageConvolution extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageConvolution(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageConvolution alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageConvolution allocWithZone(VoidPtr zone);

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
    public static native MPSImageConvolution new_objc();

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
     * [@property] bias
     * 
     * The bias is a value to be added to convolved pixel before it is converted back to the storage format.
     * It can be used to convert negative values into a representable range for a unsigned MTLPixelFormat.
     * For example, many edge detection filters produce results in the range [-k,k]. By scaling the filter
     * weights by 0.5/k and adding 0.5, the results will be in range [0,1] suitable for use with unorm formats.
     * It can be used in combination with renormalization of the filter weights to do video ranging as part
     * of the convolution effect. It can also just be used to increase the brightness of the image.
     * 
     * Default value is 0.0f.
     */
    @Generated
    @Selector("bias")
    public native float bias();

    @Generated
    @Selector("init")
    public native MPSImageConvolution init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageConvolution initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a convolution filter
     * 
     * @param device        The device the filter will run on
     * @param kernelWidth   the width of the kernel
     * @param kernelHeight  the height of the kernel
     * @param kernelWeights A pointer to an array of kernelWidth * kernelHeight values to be used as the kernel.
     *                      These are in row major order.
     * @return A valid MPSImageConvolution object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:weights:")
    public native MPSImageConvolution initWithDeviceKernelWidthKernelHeightWeights(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth,
            @NUInt long kernelHeight, @NotNull ConstFloatPtr kernelWeights);

    /**
     * [@property] kernelHeight
     * 
     * The height of the filter window. Must be an odd number.
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] kernelWidth
     * 
     * The width of the filter window. Must be an odd number.
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    /**
     * [@property] bias
     * 
     * The bias is a value to be added to convolved pixel before it is converted back to the storage format.
     * It can be used to convert negative values into a representable range for a unsigned MTLPixelFormat.
     * For example, many edge detection filters produce results in the range [-k,k]. By scaling the filter
     * weights by 0.5/k and adding 0.5, the results will be in range [0,1] suitable for use with unorm formats.
     * It can be used in combination with renormalization of the filter weights to do video ranging as part
     * of the convolution effect. It can also just be used to increase the brightness of the image.
     * 
     * Default value is 0.0f.
     */
    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageConvolution initWithCoder(@NotNull NSCoder aDecoder);

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
    public native MPSImageConvolution initWithCoderDevice(@NotNull NSCoder aDecoder,
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
