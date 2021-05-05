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

package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIColor extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CIColor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIColor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Convenience constant CIColors in the sRGB colorspace.
     */
    @Generated
    @Selector("blackColor")
    public static native CIColor blackColor();

    @Generated
    @Selector("blueColor")
    public static native CIColor blueColor();

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
    @Selector("clearColor")
    public static native CIColor clearColor();

    /**
     * Create a new color object.
     */
    @Generated
    @Selector("colorWithCGColor:")
    public static native CIColor colorWithCGColor(CGColorRef c);

    @Generated
    @Selector("colorWithRed:green:blue:")
    public static native CIColor colorWithRedGreenBlue(@NFloat double r, @NFloat double g, @NFloat double b);

    /**
     * Create a new color object in CI's default RGB colorspace
     * which is kCGColorSpaceSRGB or, if running on OSX before 10.10,
     * kCGColorSpaceGenericRGB. 
     */
    @Generated
    @Selector("colorWithRed:green:blue:alpha:")
    public static native CIColor colorWithRedGreenBlueAlpha(@NFloat double r, @NFloat double g, @NFloat double b,
            @NFloat double a);

    /**
     * Create a new color object in a given colorspace.
     * Will return null if the colorspace is not kCGColorSpaceModelRGB.
     */
    @Generated
    @Selector("colorWithRed:green:blue:alpha:colorSpace:")
    public static native CIColor colorWithRedGreenBlueAlphaColorSpace(@NFloat double r, @NFloat double g,
            @NFloat double b, @NFloat double a, CGColorSpaceRef colorSpace);

    @Generated
    @Selector("colorWithRed:green:blue:colorSpace:")
    public static native CIColor colorWithRedGreenBlueColorSpace(@NFloat double r, @NFloat double g, @NFloat double b,
            CGColorSpaceRef colorSpace);

    /**
     * Create a new color object, 'representation' should be a string in one of
     * the formats returned by the stringRepresentation method.
     */
    @Generated
    @Selector("colorWithString:")
    public static native CIColor colorWithString(String representation);

    @Generated
    @Selector("cyanColor")
    public static native CIColor cyanColor();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("grayColor")
    public static native CIColor grayColor();

    @Generated
    @Selector("greenColor")
    public static native CIColor greenColor();

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
    @Selector("magentaColor")
    public static native CIColor magentaColor();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("redColor")
    public static native CIColor redColor();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("whiteColor")
    public static native CIColor whiteColor();

    @Generated
    @Selector("yellowColor")
    public static native CIColor yellowColor();

    /**
     * Return the alpha value of the color.
     */
    @Generated
    @Selector("alpha")
    @NFloat
    public native double alpha();

    @Generated
    @Selector("blue")
    @NFloat
    public native double blue();

    /**
     * Return the color space object associated with the color.
     */
    @Generated
    @Selector("colorSpace")
    public native CGColorSpaceRef colorSpace();

    /**
     * Return the color components (including alpha).
     */
    @Generated
    @Selector("components")
    public native ConstNFloatPtr components();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("green")
    @NFloat
    public native double green();

    @Generated
    @Selector("init")
    public native CIColor init();

    /**
     * Initialize a new color object.
     */
    @Generated
    @Selector("initWithCGColor:")
    public native CIColor initWithCGColor(CGColorRef c);

    @Generated
    @Selector("initWithCoder:")
    public native CIColor initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithColor:")
    public native CIColor initWithColor(UIColor color);

    @Generated
    @Selector("initWithRed:green:blue:")
    public native CIColor initWithRedGreenBlue(@NFloat double r, @NFloat double g, @NFloat double b);

    /**
     * Initialize a new color object in CI's default RGB colorspace
     * which is kCGColorSpaceSRGB or, if running on OSX before 10.10,
     * kCGColorSpaceGenericRGB. 
     */
    @Generated
    @Selector("initWithRed:green:blue:alpha:")
    public native CIColor initWithRedGreenBlueAlpha(@NFloat double r, @NFloat double g, @NFloat double b,
            @NFloat double a);

    /**
     * Initialize a new color object in a given colorspace.
     * Will return null if the colorspace is not kCGColorSpaceModelRGB.
     */
    @Generated
    @Selector("initWithRed:green:blue:alpha:colorSpace:")
    public native CIColor initWithRedGreenBlueAlphaColorSpace(@NFloat double r, @NFloat double g, @NFloat double b,
            @NFloat double a, CGColorSpaceRef colorSpace);

    @Generated
    @Selector("initWithRed:green:blue:colorSpace:")
    public native CIColor initWithRedGreenBlueColorSpace(@NFloat double r, @NFloat double g, @NFloat double b,
            CGColorSpaceRef colorSpace);

    /**
     * Return the number of color components (including alpha).
     */
    @Generated
    @Selector("numberOfComponents")
    @NUInt
    public native long numberOfComponents();

    /**
     * Return the (unpremultiplied) red, green or blue components of the color.
     */
    @Generated
    @Selector("red")
    @NFloat
    public native double red();

    /**
     * Returns a formatted string with the components of the color.
     * The string is suitable for passing to [CIColor colorWithString:].
     * This property is not KVO-safe because it returns a new NSString each time.
     * The value of the NSString will be the same each time it is called.
     */
    @Generated
    @Selector("stringRepresentation")
    public native String stringRepresentation();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
