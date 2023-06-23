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
 * MPSImagePyramid
 * 
 * The MPSImagePyramid is a base class for creating different kinds of pyramid images
 * 
 * Currently supported pyramid-types are:
 * [@ref] MPSImageGaussianPyramid
 * 
 * The Gaussian image pyramid kernel is enqueued as a in-place operation using
 * [@ref] MPSUnaryImageKernel::encodeToCommandBuffer:inPlaceTexture:fallbackCopyAllocator:
 * and all mipmap levels after level=1, present in the provided image are filled using
 * the provided filtering kernel. The fallbackCopyAllocator parameter is not used.
 * 
 * The Gaussian image pyramid filter ignores @ref clipRect and @ref offset and fills
 * the entire mipmap levels.
 * 
 * [@note] Make sure your texture type is compatible with mipmapping and supports texture views
 * (see @ref MTLTextureUsagePixelFormatView).
 * [@note] Recall the size of the nth mipmap level:
 * [@code]
 * w_n = max(1, floor(w_0 / 2^n))
 * h_n = max(1, floor(h_0 / 2^n)),
 * [@endcode]
 * where w_0, h_0 are the zeroth level width and height. ie the image dimensions themselves.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImagePyramid extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImagePyramid(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImagePyramid alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImagePyramid allocWithZone(VoidPtr zone);

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
    public static native MPSImagePyramid new_objc();

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
    public native MPSImagePyramid init();

    /**
     * Initialize a downwards 5-tap image pyramid with the default filter kernel and device
     * 
     * The filter kernel is the outer product of w = [ 1/16, 1/4, 3/8, 1/4, 1/16 ]^T, with itself
     * 
     * @param device The device the filter will run on
     * 
     * @return A valid object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSImagePyramid initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a downwards 5-tap image pyramid with a central weight parameter and device
     * 
     * @param device       The device the filter will run on
     * @param centerWeight Defines form of the filter-kernel through the outer product ww^T, where
     *                     w = [ (1/4 - a/2), 1/4, a, 1/4, (1/4 - a/2) ]^T and 'a' is centerWeight.
     * 
     * @return A valid object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:centerWeight:")
    public native MPSImagePyramid initWithDeviceCenterWeight(@NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device,
            float centerWeight);

    /**
     * Initialize a downwards n-tap pyramid with a custom filter kernel and device
     * 
     * @param device        The device the filter will run on
     * @param kernelWidth   The width of the filtering kernel. See @ref MPSImageConvolution.
     * @param kernelHeight  The height of the filtering kernel. See @ref MPSImageConvolution.
     * @param kernelWeights A pointer to an array of kernelWidth * kernelHeight values to be
     *                      used as the kernel.
     *                      These are in row major order. See @ref MPSImageConvolution.
     * 
     * @return A valid object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:weights:")
    public native MPSImagePyramid initWithDeviceKernelWidthKernelHeightWeights(
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

    @Generated
    @Selector("initWithCoder:")
    public native MPSImagePyramid initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSCNNPooling
     * @param device   The MTLDevice on which to make the MPSCNNPooling
     * @return A new MPSCNNPooling object, or nil if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImagePyramid initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
