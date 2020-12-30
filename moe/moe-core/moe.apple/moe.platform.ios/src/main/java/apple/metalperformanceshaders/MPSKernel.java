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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * @class      MPSKernel
 * @dependency This depends on Metal.framework
 * @discussion The MPSKernel class is the base class for all MPS objects.  It defines a standard interface for
 *             MPS kernels.   You should not use the MPSKernel class directly. Instead, a  number of MPSKernel
 *             subclasses are available in MetalPerformanceShaders.framework that define specific high-performance
 *             image processing operations.
 * 
 *             The basic sequence for applying a MPSKernel to an image is as follows:
 * 
 *             1.  Create a MPSKernel corresponding to the operation you wish to perform:
 *                 @code
 *                 MPSImageSobel *sobel = [[MPSImageSobel alloc] initWithDevice: mtlDevice];
 *                 @endcode
 * 
 *             2.  Encode the filter into a command buffer:
 *                 @code
 *                 sobel.offset = ...;
 *                 sobel.clipRect = ...;
 *                 sobel.options = ...;
 *                 [sobel encodeToCommandBuffer: commandBuffer
 *                                sourceTexture: inputImage
 *                           destinationTexture: resultImage ];
 *                 @endcode
 *                 Encoding the kernel merely encodes the operation into a MTLCommandBuffer. It does not modify any pixels, yet.
 *                 All MPSKernel state has been copied to the command buffer. MPSKernels may be reused.  If the texture was previously
 *                 operated on by another command encoder (e.g. MTLRenderCommandEncoder), you should call -endEncoding on the other
 *                 encoder before encoding the filter.
 * 
 *                 Some MPS filters work in place (inputImage = resultImage) even in situations where Metal might not
 *                 normally allow in place operation on textures. If in-place operation is desired, you may attempt to call
 *                 [MPSKernel encodeKernelInPlace...]. If the operation can not be completed in place, then
 *                 NO will be returned and you will have to create a new result texture and try again. To make an in-place
 *                 image filter reliable, pass a fallback MPSCopyAllocator to the method to create a new texture to write
 *                 to in the event that a filter can not operate in place.
 * 
 *                 (Repeat steps 2 for more filters, as desired.)
 * 
 *                     It should be self evident that step 2 may not be thread safe. That is, you can not have
 *                     multiple threads manipulating the same properties on the same MPSKernel object at the
 *                     same time and achieve coherent output. In common usage, the MPSKernel properties don't
 *                     often need to be changed from their default values, but if you need to apply the same
 *                     filter to multiple images on multiple threads with cropping / tiling, make additional
 *                     MPSKernel objects per thread. They are cheap. You can use multiple MPSKernel objects on
 *                     multiple threads, as long as only one thread is operating on any particular MPSKernel
 *                     object at a time.
 * 
 *             3.  After encoding any additional work to the command buffer using other encoders, submit the MTLCommandBuffer
 *                 to your MTLCommandQueue, using:
 *                 @code
 *                 [mtlCommandBuffer commit];
 *                 @endcode
 * 
 *             A MPSKernel can be saved to disk / network using NSCoders such as NSKeyedArchiver.
 *             When decoding, the system default MTLDevice will be chosen unless the NSCoder adopts
 *             the <MPSDeviceProvider> protocol.  To accomplish this, subclass or extend your unarchiver
 *             to add this method.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSKernel extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSKernel alloc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * @abstract   Make a copy of this MPSKernel for a new device
     * @discussion -copyWithZone: will call this API to make a copy of the
     *             MPSKernel on the same device.  This interface may also be
     *             called directly to make a copy of the MPSKernel on a new
     *             device. Typically, the same MPSKernels should not be used
     *             to encode kernels on multiple command buffers from multiple
     *             threads. Many MPSKernels have mutable properties that might
     *             be changed by the other thread while this one is trying to
     *             encode. If you need to use a MPSKernel from multiple threads
     *             make a copy of it for each additional thread using -copyWithZone:
     *             or -copyWithZone:device:
     * @param      zone        The NSZone in which to allocate the object
     * @param      device      The device for the new MPSKernel. If nil, then use
     *                         self.device.
     * @result     a pointer to a copy of this MPSKernel. This will fail, returning
     *             nil if the device is not supported. Devices must be
     *             MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    /**
     * @property device
     * @abstract  The device on which the kernel will be used
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("init")
    public native MPSKernel init();

    /**
     * @abstract   Standard init with default properties per filter type
     * @param      device      The device that the filter will be used on. May not be NULL.
     * @result     a pointer to the newly initialized object. This will fail, returning
     *             nil if the device is not supported. Devices must be
     *             MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * @property   options
     * @abstract   The set of options used to run the kernel.
     * @ref        subsubsection_options
     */
    @Generated
    @Selector("options")
    @NUInt
    public native long options();

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * @property   options
     * @abstract   The set of options used to run the kernel.
     * @ref        subsubsection_options
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(@NUInt long value);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MPSKernel initWithCoder(NSCoder aDecoder);

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
    public native MPSKernel initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
