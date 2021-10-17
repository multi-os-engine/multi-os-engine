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
 * MPSImageThresholdToZeroInverse
 * <p>
 * The MPSImageThresholdToZeroInverse filter applies a fixed-level threshold to each pixel in the image.
 * The threshold functions convert a single channel image to a binary image.
 * If the input image is not a single channel image, convert the inputimage to a single channel
 * luminance image using the linearGrayColorTransform and then apply the threshold.
 * The ThresholdToZeroINverse function is:
 * destinationPixelValue = sourcePixelValue > thresholdValue ? 0 : sourcePixelValue
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageThresholdToZeroInverse extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageThresholdToZeroInverse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageThresholdToZeroInverse alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageThresholdToZeroInverse allocWithZone(VoidPtr zone);

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
    public static native MPSImageThresholdToZeroInverse new_objc();

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
    public native MPSImageThresholdToZeroInverse init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageThresholdToZeroInverse initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * initialize a MPSImageThresholdToZeroInverse filter
     *
     * @param device         The device the filter will run on
     * @param thresholdValue The threshold value to use
     * @param transform      This matrix is an array of 3 floats.
     *                       The default if no transform is specifed is BT.601/JPEG: {0.299f, 0.587f, 0.114f};
     */
    @Generated
    @Selector("initWithDevice:thresholdValue:linearGrayColorTransform:")
    public native MPSImageThresholdToZeroInverse initWithDeviceThresholdValueLinearGrayColorTransform(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, float thresholdValue, ConstFloatPtr transform);

    /**
     * [@property] thresholdValue
     * <p>
     * The threshold value used to init the threshold filter
     */
    @Generated
    @Selector("thresholdValue")
    public native float thresholdValue();

    /**
     * [@property] transform
     * <p>
     * The color transform used to init the threshold filter
     */
    @Generated
    @Selector("transform")
    public native ConstFloatPtr transform();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageThresholdToZeroInverse initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly.  To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageThresholdToZeroInverse initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
