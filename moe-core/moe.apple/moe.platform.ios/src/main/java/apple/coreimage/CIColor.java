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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Core Image class that defines a color object.
 * 
 * Use `CIColor` instances in conjunction with other Core Image classes, such as ``CIFilter-class`` and ``CIKernel``.
 * Many of the built-in Core Image filters have one or more `CIColor` inputs that you can set to affect the filter's
 * behavior.
 * 
 * ### Color Model
 * 
 * A color is defined as a N-dimensional model where each dimension's color component is represented
 * by intensity values. A color component may also be referred to as a color channel. An RGB color model, for example,
 * is three-dimensional and the red, green, and blue component intensities define each unique color.
 * 
 * ### Color Space
 * 
 * A color is also defined by a color space that locates the axes of N-dimensional model within the greater
 * volume of human perceivable colors. Core Image uses `CGColorSpace` instances to specify a variety of different
 * color spaces such as sRGB, P3, BT.2020, etc. The `CGColorSpace` also defines if the color space is coded
 * linearly or in a non-linear perceptual curve.
 * (For more information on `CGColorSpace` see <doc://com.apple.documentation/documentation/coregraphics/cgcolorspace>)
 * 
 * ### Color Range
 * 
 * Standard dynamic range (SDR) color color component values range from `0.0` to `1.0`, with `0.0`
 * representing an 0% of that component and `1.0` representing 100%. In contrast, high dynamic range (HDR) color values
 * can be less than `0.0` (for more saturation) or greater than `1.0` (for more brightness).
 * 
 * ### Color Opacity
 * 
 * `CIColor` instances also have an alpha component, which represents the opacity of the color, with 0.0 meaning
 * completely
 * transparent and 1.0 meaning completely opaque. If a color does not have an explicit alpha component, Core Image
 * assumes that the alpha component equals 1.0. With `CIColor` that color components values are not premultiplied.
 * So for example, a semi-transparent pure red `CIColor` is represented by RGB `1.0,0.0,0.0` and A `0.5`. In contrast
 * color components values in ``CIImage`` buffers or read in ``CIKernel`` samplers are premultiplied by default.
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIColor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `0,0,0` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("blackColor")
    public static native CIColor blackColor();

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `0,0,1` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("blueColor")
    public static native CIColor blueColor();

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

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `0,0,0` and alpha value
     * `0`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("clearColor")
    public static native CIColor clearColor();

    /**
     * Create a Core Image color object with a Core Graphics color object.
     * - Returns:
     * An autoreleased ``CIColor`` instance.
     */
    @Generated
    @Selector("colorWithCGColor:")
    public static native CIColor colorWithCGColor(@NotNull CGColorRef color);

    /**
     * Create a Core Image color object in the sRGB color space
     * with the specified red, green, and blue component values.
     * 
     * On macOS before 10.10, the CIColor's color space will be Generic RGB.
     * - Parameters:
     * - red: The color's unpremultiplied red component value between 0 and 1.
     * - green: The color's unpremultiplied green component value between 0 and 1.
     * - blue: The color's unpremultiplied blue component value between 0 and 1.
     * - Returns:
     * An autoreleased ``CIColor`` instance.
     */
    @Generated
    @Selector("colorWithRed:green:blue:")
    public static native CIColor colorWithRedGreenBlue(@NFloat double red, @NFloat double green, @NFloat double blue);

    /**
     * Create a Core Image color object in the sRGB color space
     * with the specified red, green, blue, and alpha component values.
     * 
     * On macOS before 10.10, the CIColor's color space will be Generic RGB.
     * - Parameters:
     * - red: The color's unpremultiplied red component value between 0 and 1.
     * - green: The color's unpremultiplied green component value between 0 and 1.
     * - blue: The color's unpremultiplied blue component value between 0 and 1.
     * - alpha: The color's alpha (opacity) value between 0 and 1.
     * - Returns:
     * An autoreleased ``CIColor`` instance.
     */
    @Generated
    @Selector("colorWithRed:green:blue:alpha:")
    public static native CIColor colorWithRedGreenBlueAlpha(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    /**
     * Create a Core Image color object
     * with the specified red, green, blue, and alpha component values
     * as measured in the specified color space.
     * 
     * This will return `null` if the `CGColorSpace` is not `kCGColorSpaceModelRGB`.
     * 
     * The RGB values can be outside the `0...1` range if the `CGColorSpace` is unclamped.
     * - Parameters:
     * - red: The color's unpremultiplied red component value.
     * - green: The color's unpremultiplied green component value.
     * - blue: The color's unpremultiplied blue component value.
     * - alpha: The color's alpha (opacity) value between 0 and 1.
     * - colorSpace: The color's `CGColorSpace` which must have `kCGColorSpaceModelRGB`.
     * - Returns:
     * An autoreleased ``CIColor`` instance.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("colorWithRed:green:blue:alpha:colorSpace:")
    public static native CIColor colorWithRedGreenBlueAlphaColorSpace(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha, @NotNull CGColorSpaceRef colorSpace);

    /**
     * Create a Core Image color object
     * with the specified red, green, and blue component values
     * as measured in the specified color space.
     * 
     * This will return `null` if the `CGColorSpace` is not `kCGColorSpaceModelRGB`.
     * 
     * The RGB values can be outside the `0...1` range if the `CGColorSpace` is unclamped.
     * - Parameters:
     * - red: The color's unpremultiplied red component value.
     * - green: The color's unpremultiplied green component value.
     * - blue: The color's unpremultiplied blue component value.
     * - colorSpace: The color's `CGColorSpace` which must have `kCGColorSpaceModelRGB`.
     * - Returns:
     * An autoreleased ``CIColor`` instance.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("colorWithRed:green:blue:colorSpace:")
    public static native CIColor colorWithRedGreenBlueColorSpace(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NotNull CGColorSpaceRef colorSpace);

    /**
     * Create a Core Image color object in the sRGB color space using a string containing the RGBA color component
     * values.
     * 
     * On macOS before 10.10, the CIColor's color space will be Generic RGB.
     * 
     * - Parameters:
     * - representation: A string that contains color and alpha float values.
     * For example, the string: `"0.5 0.7 0.3 1.0"` indicates an RGB color whose components
     * are 50% red, 70% green, 30% blue, and 100% opaque.
     * If the string contains only 3 float values, the alpha component will be `1.0`
     * If the string contains no float values, then ``/CIColor/clearColor`` will be returned.
     * - Returns:
     * An autoreleased ``CIColor`` instance.
     */
    @Generated
    @Selector("colorWithString:")
    public static native CIColor colorWithString(@NotNull String representation);

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `0,1,1` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("cyanColor")
    public static native CIColor cyanColor();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `0.5,0.5,0.5` and alpha
     * value `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("grayColor")
    public static native CIColor grayColor();

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `0,1,0` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `1,0,1` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("magentaColor")
    public static native CIColor magentaColor();

    @Generated
    @Owned
    @Selector("new")
    public static native CIColor new_objc();

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `1,0,0` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
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

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `1,1,1` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("whiteColor")
    public static native CIColor whiteColor();

    /**
     * Returns a singleton Core Image color instance in the sRGB color space with RGB values `1,1,0` and alpha value
     * `1`.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("yellowColor")
    public static native CIColor yellowColor();

    /**
     * Returns the alpha value of the color.
     */
    @Generated
    @Selector("alpha")
    @NFloat
    public native double alpha();

    /**
     * Returns the unpremultiplied blue component of the color.
     * 
     * If the ``CIColor`` was initialized with a `CGColor` in a non-RGB `CGColorSpace`
     * then it will be converted to sRGB to get the green component.
     */
    @Generated
    @Selector("blue")
    @NFloat
    public native double blue();

    /**
     * Returns the `CGColorSpace` associated with the color
     */
    @NotNull
    @Generated
    @Selector("colorSpace")
    public native CGColorSpaceRef colorSpace();

    /**
     * Return a pointer to an array of `CGFloat` values including alpha.
     * 
     * Typically this array will contain `4` `CGFloat` values for red, green, blue, and alpha.
     * If the ``CIColor`` was initialized with a `CGColor` then returned pointer
     * will be the same as calling `CGColorGetComponents()`
     */
    @NotNull
    @Generated
    @Selector("components")
    public native ConstNFloatPtr components();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Returns the unpremultiplied green component of the color.
     * 
     * If the ``CIColor`` was initialized with a `CGColor` in a non-RGB `CGColorSpace`
     * then it will be converted to sRGB to get the green component.
     */
    @Generated
    @Selector("green")
    @NFloat
    public native double green();

    @Generated
    @Selector("init")
    public native CIColor init();

    /**
     * Create a Core Image color object with a Core Graphics color object.
     * - Returns:
     * An initialized ``CIColor`` instance.
     */
    @Generated
    @Selector("initWithCGColor:")
    public native CIColor initWithCGColor(@NotNull CGColorRef color);

    @Generated
    @Selector("initWithCoder:")
    public native CIColor initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithColor:")
    public native CIColor initWithColor(@NotNull UIColor color);

    /**
     * Initialize a Core Image color object in the sRGB color space
     * with the specified red, green, and blue component values.
     * 
     * On macOS before 10.10, the CIColor's color space will be Generic RGB.
     * - Parameters:
     * - red: The color's unpremultiplied red component value between 0 and 1.
     * - green: The color's unpremultiplied green component value between 0 and 1.
     * - blue: The color's unpremultiplied blue component value between 0 and 1.
     * - Returns:
     * An initialized ``CIColor`` instance.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("initWithRed:green:blue:")
    public native CIColor initWithRedGreenBlue(@NFloat double red, @NFloat double green, @NFloat double blue);

    /**
     * Initialize a Core Image color object in the sRGB color space
     * with the specified red, green, blue, and alpha component values.
     * 
     * On macOS before 10.10, the CIColor's color space will be Generic RGB.
     * - Parameters:
     * - red: The color's unpremultiplied red component value between 0 and 1.
     * - green: The color's unpremultiplied green component value between 0 and 1.
     * - blue: The color's unpremultiplied blue component value between 0 and 1.
     * - alpha: The color's alpha (opacity) value between 0 and 1.
     * - Returns:
     * An initialized ``CIColor`` instance.
     */
    @Generated
    @Selector("initWithRed:green:blue:alpha:")
    public native CIColor initWithRedGreenBlueAlpha(@NFloat double red, @NFloat double green, @NFloat double blue,
            @NFloat double alpha);

    /**
     * Initialize a Core Image color object
     * with the specified red, green, and blue component values
     * as measured in the specified color space.
     * 
     * This will return null if the `CGColorSpace` is not `kCGColorSpaceModelRGB`.
     * The RGB values can be outside the `0...1` range if the `CGColorSpace` is unclamped.
     * - Parameters:
     * - red: The color's unpremultiplied red component value.
     * - green: The color's unpremultiplied green component value.
     * - blue: The color's unpremultiplied blue component value.
     * - alpha: The color's alpha (opacity) value between 0 and 1.
     * - colorSpace: The color's `CGColorSpace` which must have `kCGColorSpaceModelRGB`.
     * - Returns:
     * An initialized ``CIColor`` instance.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithRed:green:blue:alpha:colorSpace:")
    public native CIColor initWithRedGreenBlueAlphaColorSpace(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha, @NotNull CGColorSpaceRef colorSpace);

    /**
     * Initialize a Core Image color object
     * with the specified red, green, and blue component values
     * as measured in the specified color space.
     * 
     * This will return null if the `CGColorSpace` is not `kCGColorSpaceModelRGB`.
     * The RGB values can be outside the `0...1` range if the `CGColorSpace` is unclamped.
     * - Parameters:
     * - red: The color's unpremultiplied red component value.
     * - green: The color's unpremultiplied green component value.
     * - blue: The color's unpremultiplied blue component value.
     * - colorSpace: The color's `CGColorSpace` which must have `kCGColorSpaceModelRGB`.
     * - Returns:
     * An initialized ``CIColor`` instance.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithRed:green:blue:colorSpace:")
    public native CIColor initWithRedGreenBlueColorSpace(@NFloat double red, @NFloat double green, @NFloat double blue,
            @NotNull CGColorSpaceRef colorSpace);

    /**
     * Returns the color components of the color including alpha.
     * 
     * This number includes the alpha component if the color contains one.
     * 
     * Typically this number will be `4` for red, green, blue, and alpha.
     * If the ``CIColor`` was initialized with a `CGColor` then the number
     * will be the same as calling `CGColorGetNumberOfComponents()`
     */
    @Generated
    @Selector("numberOfComponents")
    @NUInt
    public native long numberOfComponents();

    /**
     * Returns the unpremultiplied red component of the color.
     * 
     * If the ``CIColor`` was initialized with a `CGColor` in a non-RGB `CGColorSpace`
     * then it will be converted to sRGB to get the red component.
     */
    @Generated
    @Selector("red")
    @NFloat
    public native double red();

    /**
     * Returns a formatted string with the unpremultiplied color and alpha components of the color.
     * 
     * The string representation always has four components: red, green, blue, and alpha.
     * 
     * Some example string representations of colors:
     * 
     * `CIColor` | `stringRepresentation`
     * ----------------------------------------------- | --------------
     * `[CIColor colorWithRed:0.2 green:0.4 blue:0.6]` | `"0.2 0.4 0.6 1.0"`
     * ``/CIColor/yellowColor`` | `"1.0 1.0 0.0 1.0"`
     * 
     * To create a ``CIColor`` instance from a string representation, use the ``colorWithString:`` method.
     * 
     * If the ``CIColor`` was initialized with a `CGColor` in a non-RGB `CGColorSpace`
     * then it will be converted to sRGB to get the red, green, and blue components.
     * 
     * This property is not KVO-safe because it returns a new `NSString` instance each time.
     * The value of the `NSString` will be the same each time it is called.
     */
    @NotNull
    @Generated
    @Selector("stringRepresentation")
    public native String stringRepresentation();

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
