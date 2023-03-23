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

/**
 * MPSCNNPoolingAverage
 * [@dependency] This depends on Metal.framework
 * 
 * Specifies the average pooling filter. For each pixel, returns the mean value of pixels
 * in the kernelWidth x kernelHeight filter region.
 * When @ref edgeMode is @ref MPSImageEdgeModeClamp the filtering window is shrunk to remain
 * within the source image borders. What this means is that close to image borders the filtering window
 * will be smaller in order to fit inside the source image and less values will be used to compute the
 * average. In case the filtering window is entirely outside the source image border the
 * outputted value will be zero.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNPoolingAverage extends MPSCNNPooling {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNPoolingAverage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNPoolingAverage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNPoolingAverage allocWithZone(VoidPtr zone);

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
    public static native MPSCNNPoolingAverage new_objc();

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
    public native MPSCNNPoolingAverage init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNPoolingAverage initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNPoolingAverage initWithDeviceKernelWidthKernelHeight(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight);

    /**
     * Initialize a MPSCNNPoolingAverage pooling filter
     * 
     * @param device          The device the filter will run on
     * @param kernelWidth     The width of the kernel. Can be an odd or even value.
     * @param kernelHeight    The height of the kernel. Can be an odd or even value.
     * @param strideInPixelsX The output stride (downsampling factor) in the x dimension.
     * @param strideInPixelsY The output stride (downsampling factor) in the y dimension.
     * @return A valid MPSCNNPooling object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNPoolingAverage initWithDeviceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight,
            @NUInt long strideInPixelsX, @NUInt long strideInPixelsY);

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNPoolingAverage initWithCoder(NSCoder aDecoder);

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
    public native MPSCNNPoolingAverage initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * [@property] zeroPadSizeX
     * 
     * How much zero padding to apply to both left and right borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("setZeroPadSizeX:")
    public native void setZeroPadSizeX(@NUInt long value);

    /**
     * [@property] zeroPadSizeY
     * 
     * How much zero padding to apply to both top and bottom borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("setZeroPadSizeY:")
    public native void setZeroPadSizeY(@NUInt long value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] zeroPadSizeX
     * 
     * How much zero padding to apply to both left and right borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("zeroPadSizeX")
    @NUInt
    public native long zeroPadSizeX();

    /**
     * [@property] zeroPadSizeY
     * 
     * How much zero padding to apply to both top and bottom borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("zeroPadSizeY")
    @NUInt
    public native long zeroPadSizeY();
}
