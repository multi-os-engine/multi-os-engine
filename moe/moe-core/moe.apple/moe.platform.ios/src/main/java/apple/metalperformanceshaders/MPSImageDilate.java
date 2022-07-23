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

/**
 * MPSImageDilate
 * <p>
 * The MPSImageDilate finds the maximum pixel value in a rectangular region centered around each pixel in the
 * source image. It is like the MPSImageAreaMax, except that the intensity at each position is calculated relative
 * to a different value before determining which is the maximum pixel value, allowing for shaped, non-rectangular
 * morphological probes.
 * [@code]
 * for each pixel in the filter window:
 * value = pixel[filterY][filterX] - filter[filterY*filter_width+filterX]
 * if( value > bestValue ){
 * result = value
 * bestValue = value;
 * }
 * [@endcode]
 * A filter that contains all zeros and is identical to a MPSImageAreaMax filter. The center filter element
 * is assumed to be 0 to avoid causing a general darkening of the image.
 * <p>
 * The edgeMode property is assumed to always be MPSImageEdgeModeClamp for this filter.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageDilate extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageDilate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageDilate alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageDilate allocWithZone(VoidPtr zone);

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
    public static native MPSImageDilate new_objc();

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
    public native MPSImageDilate init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageDilate initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Init a object with kernel height, width and weight values.
     * <p>
     * Each dilate shape probe defines a 3D surface of values.
     * These are arranged in order left to right, then top to bottom
     * in a 1D array. (values[kernelWidth*y+x] = probe[y][x])
     * Values should be generally be in the range [0,1] with the center
     * pixel tending towards 0 and edges towards 1. However, any numerical
     * value is allowed. Calculations are subject to the usual floating-point
     * rounding error.
     *
     * @param device       The device the filter will run on
     * @param kernelWidth  The width of the kernel. Must be an odd number.
     * @param kernelHeight The height of the kernel. Must be an odd number.
     * @param values       The set of values to use as the dilate probe.
     *                     The values are copied into the filter. To avoid
     *                     image ligthening or darkening, the center value should
     *                     be 0.0f.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:values:")
    public native MPSImageDilate initWithDeviceKernelWidthKernelHeightValues(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight,
            ConstFloatPtr values);

    /**
     * [@property] kernelHeight
     * <p>
     * The height of the filter window. Must be an odd number.
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] kernelWidth
     * <p>
     * The width of the filter window. Must be an odd number.
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageDilate initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageDilate initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
