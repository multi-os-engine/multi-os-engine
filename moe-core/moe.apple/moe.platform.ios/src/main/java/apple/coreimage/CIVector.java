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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Core Image class that defines a vector object.
 * 
 * A `CIVector` can store one or more `CGFloat` in one object. They can store a group of float values
 * for a variety of different uses such as coordinate points, direction vectors, geometric rectangles,
 * transform matrices, convolution weights, or just a list a parameter values.
 * 
 * You use `CIVector` objects in conjunction with other Core Image classes, such as ``CIFilter-class``
 * and ``CIKernel``. Many of the built-in Core Image filters have one or more `CIVector` inputs that
 * you can set to affect the filter's behavior.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIVector extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CIVector(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIVector alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIVector allocWithZone(VoidPtr zone);

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
    public static native CIVector new_objc();

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

    /**
     * Create a Core Image vector object that is initialized with six values provided by a `CGAffineTransform`
     * structure.
     * 
     * The `CGAffineTransform` structure’s `a`, `b`, `c`, `d`, `tx` and `ty` values
     * are stored in the vector’s six values.
     * - Parameters:
     * - t: The `CGAffineTransform` structure.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 6.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("vectorWithCGAffineTransform:")
    public static native CIVector vectorWithCGAffineTransform(@ByValue CGAffineTransform t);

    /**
     * Create a Core Image vector object that is initialized with two values provided by a `CGPoint` structure.
     * 
     * The `CGRect` structure’s `y` and `y` values
     * are stored in the vector’s two values.
     * - Parameters:
     * - p: The `CGPoint` structure.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 2.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("vectorWithCGPoint:")
    public static native CIVector vectorWithCGPoint(@ByValue CGPoint p);

    /**
     * Create a Core Image vector object that is initialized with four values provided by a `CGRect` structure.
     * 
     * The `CGRect` structure’s `x`, `y`, `height` and `width` values
     * are stored in the vector’s four values.
     * - Parameters:
     * - r: The `CGRect` structure.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 4.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("vectorWithCGRect:")
    public static native CIVector vectorWithCGRect(@ByValue CGRect r);

    /**
     * Create a Core Image vector object with values provided in a string representation.
     * - Parameters:
     * - representation: A string that is in one of the formats returned by the `stringRepresentation` method.
     * - Returns:
     * An autoreleased ``CIVector`` object.
     */
    @Generated
    @Selector("vectorWithString:")
    public static native CIVector vectorWithString(@NotNull String representation);

    /**
     * Create a Core Image vector object that is initialized with the specified values.
     * - Parameters:
     * - values: The pointer `CGFloat` values to initialize the vector with.
     * - count: The number of `CGFloats` specified by the `values` parameter.
     * - Returns:
     * An autoreleased ``CIVector`` object of length `count`.
     */
    @Generated
    @Selector("vectorWithValues:count:")
    public static native CIVector vectorWithValuesCount(@NotNull ConstNFloatPtr values, @NUInt long count);

    /**
     * Create a Core Image vector object that is initialized with one value.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 1.
     */
    @Generated
    @Selector("vectorWithX:")
    public static native CIVector vectorWithX(@NFloat double x);

    /**
     * Create a Core Image vector object that is initialized with two values.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - y: The value for the second position in the vector.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 2.
     */
    @Generated
    @Selector("vectorWithX:Y:")
    public static native CIVector vectorWithXY(@NFloat double x, @NFloat double y);

    /**
     * Create a Core Image vector object that is initialized with three values.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - y: The value for the second position in the vector.
     * - z: The value for the third position in the vector.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 3.
     */
    @Generated
    @Selector("vectorWithX:Y:Z:")
    public static native CIVector vectorWithXYZ(@NFloat double x, @NFloat double y, @NFloat double z);

    /**
     * Create a Core Image vector object that is initialized with four values.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - y: The value for the second position in the vector.
     * - z: The value for the third position in the vector.
     * - w: The value for the forth position in the vector.
     * - Returns:
     * An autoreleased ``CIVector`` object of length 4.
     */
    @Generated
    @Selector("vectorWithX:Y:Z:W:")
    public static native CIVector vectorWithXYZW(@NFloat double x, @NFloat double y, @NFloat double z,
            @NFloat double w);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the values in the vector as a `CGAffineTransformValue` structure.
     * - Returns:
     * Reading this property creates a `CGAffineTransformValue` structure
     * from the first six values in the vector.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("CGAffineTransformValue")
    @ByValue
    public native CGAffineTransform CGAffineTransformValue();

    /**
     * Returns the values in the vector as a `CGPoint` structure.
     * - Returns:
     * Reading this property returns a `CGPoint` structure
     * from the `X` and `Y` values from the vector.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("CGPointValue")
    @ByValue
    public native CGPoint CGPointValue();

    /**
     * Returns the values in the vector as a `CGRect` structure.
     * - Returns:
     * Reading this property creates a `CGRect` structure
     * whose origin is the `X`, `Y`, `Z` and `W` values from the vector.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("CGRectValue")
    @ByValue
    public native CGRect CGRectValue();

    /**
     * The value located in the forth position in the vector.
     */
    @Generated
    @Selector("W")
    @NFloat
    public native double W();

    /**
     * The value located in the first position in the vector.
     */
    @Generated
    @Selector("X")
    @NFloat
    public native double X();

    /**
     * The value located in the second position in the vector.
     */
    @Generated
    @Selector("Y")
    @NFloat
    public native double Y();

    /**
     * The value located in the third position in the vector.
     */
    @Generated
    @Selector("Z")
    @NFloat
    public native double Z();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The number of items in the vector.
     */
    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native CIVector init();

    /**
     * Initialize a Core Image vector object with six values provided by a `CGAffineTransform` structure.
     * 
     * The `CGAffineTransform` structure’s `a`, `b`, `c`, `c`, `tx` and `ty` values
     * are stored in the vector’s six values.
     * - Parameters:
     * - t: The `CGAffineTransform` structure.
     * - Returns:
     * An initialized ``CIVector`` object of length 6.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithCGAffineTransform:")
    public native CIVector initWithCGAffineTransform(@ByValue CGAffineTransform t);

    /**
     * Initialize a Core Image vector object with two values provided by a `CGPoint` structure.
     * 
     * The `CGRect` structure’s `y` and `y` values
     * are stored in the vector’s two values.
     * - Parameters:
     * - p: The `CGPoint` structure.
     * - Returns:
     * An initialized ``CIVector`` object of length 2.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithCGPoint:")
    public native CIVector initWithCGPoint(@ByValue CGPoint p);

    /**
     * Initialize a Core Image vector object with four values provided by a `CGRect` structure.
     * 
     * The `CGRect` structure’s `x`, `y`, `height` and `width` values
     * are stored in the vector’s four values.
     * - Parameters:
     * - r: The `CGRect` structure.
     * - Returns:
     * An initialized ``CIVector`` object of length 4.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithCGRect:")
    public native CIVector initWithCGRect(@ByValue CGRect r);

    @Generated
    @Selector("initWithCoder:")
    public native CIVector initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize a Core Image vector object with values provided in a string representation.
     * - Parameters:
     * - representation: A string that is in one of the formats returned by the `stringRepresentation` method.
     * - Returns:
     * An initialized ``CIVector`` object.
     */
    @Generated
    @Selector("initWithString:")
    public native CIVector initWithString(@NotNull String representation);

    /**
     * Initialize a Core Image vector object with the specified the values.
     * - Parameters:
     * - values: A pointer `CGFloat` values for vector.
     * - count: The number of `CGFloats` specified by the `values` parameter.
     * - Returns:
     * An initialized ``CIVector`` object of length `count`.
     */
    @Generated
    @Selector("initWithValues:count:")
    public native CIVector initWithValuesCount(@NotNull ConstNFloatPtr values, @NUInt long count);

    /**
     * Initialize a Core Image vector object with one value.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - Returns:
     * An initialized ``CIVector`` object of length 1.
     */
    @Generated
    @Selector("initWithX:")
    public native CIVector initWithX(@NFloat double x);

    /**
     * Initialize a Core Image vector object with two values.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - y: The value for the second position in the vector.
     * - Returns:
     * An initialized ``CIVector`` object of length 2.
     */
    @Generated
    @Selector("initWithX:Y:")
    public native CIVector initWithXY(@NFloat double x, @NFloat double y);

    /**
     * Initialize a Core Image vector object with three values.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - y: The value for the second position in the vector.
     * - z: The value for the third position in the vector.
     * - Returns:
     * An initialized ``CIVector`` object of length 3.
     */
    @Generated
    @Selector("initWithX:Y:Z:")
    public native CIVector initWithXYZ(@NFloat double x, @NFloat double y, @NFloat double z);

    /**
     * Initialize a Core Image vector object with four values.
     * - Parameters:
     * - x: The value for the first position in the vector.
     * - y: The value for the second position in the vector.
     * - z: The value for the third position in the vector.
     * - w: The value for the forth position in the vector.
     * - Returns:
     * An initialized ``CIVector`` object of length 4.
     */
    @Generated
    @Selector("initWithX:Y:Z:W:")
    public native CIVector initWithXYZW(@NFloat double x, @NFloat double y, @NFloat double z, @NFloat double w);

    /**
     * Returns a formatted string with all the values of a `CIVector`.
     * 
     * Some example string representations of vectors:
     * 
     * `CIVector` | `stringRepresentation`
     * ---------------------------------------- | --------------
     * `[CIVector vectorWithX:1.0 Y:0.5 Z:0.3]` | `"[1.0 0.5 0.3]"`
     * `[CIVector vectorWithX:10.0 Y:23.0]` | `"[10.0 23.0]"`
     * 
     * To create a ``CIVector`` object from a string representation, use the ``vectorWithString:`` method.
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

    /**
     * Returns a value from a specific position in the vector.
     * 
     * The numbering of elements in a vector begins with zero.
     * - Parameters:
     * - index: The position in the vector of the value that you want to retrieve.
     * - Returns:
     * The value retrieved from the vector or `0` if the position is undefined.
     */
    @Generated
    @Selector("valueAtIndex:")
    @NFloat
    public native double valueAtIndex(@NUInt long index);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
