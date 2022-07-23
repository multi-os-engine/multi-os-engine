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
import apple.coregraphics.opaque.CGColorConversionInfoRef;
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
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSImageConversion
 * <p>
 * The MPSImageConversion filter performs a conversion from source to destination
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageConversion extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageConversion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageConversion alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageConversion allocWithZone(VoidPtr zone);

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
    public static native MPSImageConversion new_objc();

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
     * [@property] destinationAlpha
     * <p>
     * Premultiplication description for the destinationAlpha texture
     * <p>
     * Colorspace conversion operations produce non-premultiplied data.
     * Use this property to tag cases where premultiplied results are required.
     * If MPSPixelAlpha_AlphaIsOne is used, the alpha channel will be set to 1.
     * Default: MPSPixelAlpha_AlphaIsOne
     */
    @Generated
    @Selector("destinationAlpha")
    @NUInt
    public native long destinationAlpha();

    @Generated
    @Selector("init")
    public native MPSImageConversion init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageConversion initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Create a converter that can convert texture colorspace, alpha and texture format
     * <p>
     * Create a converter that can convert texture colorspace, alpha and MTLPixelFormat.
     * Optimized cases exist for NULL color space converter and no alpha conversion.
     *
     * @param device          The device the filter will run on
     * @param srcAlpha        The alpha encoding for the source texture
     * @param destAlpha       The alpha encoding for the destination texture
     * @param backgroundColor An array of CGFloats giving the background color to use when flattening an image.
     *                        The color is in the source colorspace. The length of the array is the number
     *                        of color channels in the src colorspace. If NULL, use {0}.
     * @param conversionInfo  The colorspace conversion to use. May be NULL, indicating no
     *                        color space conversions need to be done.
     * @return An initialized MPSImageConversion object.
     */
    @Generated
    @Selector("initWithDevice:srcAlpha:destAlpha:backgroundColor:conversionInfo:")
    public native MPSImageConversion initWithDeviceSrcAlphaDestAlphaBackgroundColorConversionInfo(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long srcAlpha, @NUInt long destAlpha,
            NFloatPtr backgroundColor, CGColorConversionInfoRef conversionInfo);

    /**
     * [@property] sourceAlpha
     * <p>
     * Premultiplication description for the source texture
     * <p>
     * Most colorspace conversion operations can not work directly on premultiplied data.
     * Use this property to tag premultiplied data so that the source texture can
     * be unpremultiplied prior to application of these transforms.
     * Default: MPSPixelAlpha_AlphaIsOne
     */
    @Generated
    @Selector("sourceAlpha")
    @NUInt
    public native long sourceAlpha();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageConversion initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageConversion initWithCoderDevice(NSCoder aDecoder,
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
