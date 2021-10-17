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

package apple.javascriptcore;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.javascriptcore.opaque.JSValueRef;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface]
 * <p>
 * A JSValue is a reference to a JavaScript value. Every JSValue
 * originates from a JSContext and holds a strong reference to it.
 * When a JSValue instance method creates a new JSValue, the new value
 * originates from the same JSContext.
 * <p>
 * All JSValues values also originate from a JSVirtualMachine
 * (available indirectly via the context property). It is an error to pass a
 * JSValue to a method or property of a JSValue or JSContext originating from a
 * different JSVirtualMachine. Doing so will raise an Objective-C exception.
 */
@Generated
@Library("JavaScriptCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class JSValue extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected JSValue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native JSValue alloc();

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

    /**
     * Create a JavaScript value from a BOOL primitive.
     *
     * @param context The JSContext in which the resulting JSValue will be created.
     * @return The new JSValue representing the equivalent boolean value.
     */
    @Generated
    @Selector("valueWithBool:inContext:")
    public static native JSValue valueWithBoolInContext(boolean value, JSContext context);

    /**
     * Create a JavaScript value from a double primitive.
     *
     * @param context The JSContext in which the resulting JSValue will be created.
     * @return The new JSValue representing the equivalent boolean value.
     */
    @Generated
    @Selector("valueWithDouble:inContext:")
    public static native JSValue valueWithDoubleInContext(double value, JSContext context);

    /**
     * Create a JavaScript value from an <code>int32_t</code> primitive.
     *
     * @param context The JSContext in which the resulting JSValue will be created.
     * @return The new JSValue representing the equivalent boolean value.
     */
    @Generated
    @Selector("valueWithInt32:inContext:")
    public static native JSValue valueWithInt32InContext(int value, JSContext context);

    /**
     * Creates a JSValue, wrapping its C API counterpart.
     *
     * @return The Objective-C API equivalent of the specified JSValueRef.
     */
    @Generated
    @Selector("valueWithJSValueRef:inContext:")
    public static native JSValue valueWithJSValueRefInContext(JSValueRef value, JSContext context);

    /**
     * Create a new, empty JavaScript array.
     *
     * @param context The JSContext in which the resulting array will be created.
     * @return The new JavaScript array.
     */
    @Generated
    @Selector("valueWithNewArrayInContext:")
    public static native JSValue valueWithNewArrayInContext(JSContext context);

    /**
     * Create a new JavaScript error object.
     *
     * @param message The error message.
     * @param context The JSContext in which the resulting error object will be created.
     * @return The new JavaScript error object.
     */
    @Generated
    @Selector("valueWithNewErrorFromMessage:inContext:")
    public static native JSValue valueWithNewErrorFromMessageInContext(String message, JSContext context);

    /**
     * Create a new, empty JavaScript object.
     *
     * @param context The JSContext in which the resulting object will be created.
     * @return The new JavaScript object.
     */
    @Generated
    @Selector("valueWithNewObjectInContext:")
    public static native JSValue valueWithNewObjectInContext(JSContext context);

    /**
     * Create a new JavaScript regular expression object.
     *
     * @param pattern The regular expression pattern.
     * @param flags   The regular expression flags.
     * @param context The JSContext in which the resulting regular expression object will be created.
     * @return The new JavaScript regular expression object.
     */
    @Generated
    @Selector("valueWithNewRegularExpressionFromPattern:flags:inContext:")
    public static native JSValue valueWithNewRegularExpressionFromPatternFlagsInContext(String pattern, String flags,
            JSContext context);

    /**
     * Create the JavaScript value <code>null</code>.
     *
     * @param context The JSContext to which the resulting JSValue belongs.
     * @return The JSValue representing the JavaScript value <code>null</code>.
     */
    @Generated
    @Selector("valueWithNullInContext:")
    public static native JSValue valueWithNullInContext(JSContext context);

    /**
     * [@methodgroup] Creating JavaScript Values
     * <p>
     * Create a JSValue by converting an Objective-C object.
     * <p>
     * The resulting JSValue retains the provided Objective-C object.
     *
     * @param value The Objective-C object to be converted.
     * @return The new JSValue.
     */
    @Generated
    @Selector("valueWithObject:inContext:")
    public static native JSValue valueWithObjectInContext(@Mapped(ObjCObjectMapper.class) Object value,
            JSContext context);

    /**
     * Create a JSValue from a CGPoint.
     *
     * @return A newly allocated JavaScript object containing properties
     * named <code>x</code> and <code>y</code>, with values from the CGPoint.
     */
    @Generated
    @Selector("valueWithPoint:inContext:")
    public static native JSValue valueWithPointInContext(@ByValue CGPoint point, JSContext context);

    /**
     * Create a JSValue from a NSRange.
     *
     * @return A newly allocated JavaScript object containing properties
     * named <code>location</code> and <code>length</code>, with values from the NSRange.
     */
    @Generated
    @Selector("valueWithRange:inContext:")
    public static native JSValue valueWithRangeInContext(@ByValue NSRange range, JSContext context);

    /**
     * Create a JSValue from a CGRect.
     *
     * @return A newly allocated JavaScript object containing properties
     * named <code>x</code>, <code>y</code>, <code>width</code>, and <code>height</code>, with values from the CGRect.
     */
    @Generated
    @Selector("valueWithRect:inContext:")
    public static native JSValue valueWithRectInContext(@ByValue CGRect rect, JSContext context);

    /**
     * Create a JSValue from a CGSize.
     *
     * @return A newly allocated JavaScript object containing properties
     * named <code>width</code> and <code>height</code>, with values from the CGSize.
     */
    @Generated
    @Selector("valueWithSize:inContext:")
    public static native JSValue valueWithSizeInContext(@ByValue CGSize size, JSContext context);

    /**
     * Create a JavaScript value from a <code>uint32_t</code> primitive.
     *
     * @param context The JSContext in which the resulting JSValue will be created.
     * @return The new JSValue representing the equivalent boolean value.
     */
    @Generated
    @Selector("valueWithUInt32:inContext:")
    public static native JSValue valueWithUInt32InContext(int value, JSContext context);

    /**
     * Create the JavaScript value <code>undefined</code>.
     *
     * @param context The JSContext to which the resulting JSValue belongs.
     * @return The JSValue representing the JavaScript value <code>undefined</code>.
     */
    @Generated
    @Selector("valueWithUndefinedInContext:")
    public static native JSValue valueWithUndefinedInContext(JSContext context);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]
     * <p>
     * Returns the C API counterpart wrapped by a JSContext.
     *
     * @return The C API equivalent of this JSValue.
     */
    @Generated
    @Selector("JSValueRef")
    public native JSValueRef JSValueRef();

    /**
     * [@methodgroup] Calling Functions and Constructors
     * <p>
     * Invoke a JSValue as a function.
     * <p>
     * In JavaScript, if a function doesn't explicitly return a value then it
     * implicitly returns the JavaScript value <code>undefined</code>.
     *
     * @param arguments The arguments to pass to the function.
     * @return The return value of the function call.
     */
    @Generated
    @Selector("callWithArguments:")
    public native JSValue callWithArguments(NSArray<?> arguments);

    /**
     * Invoke a JSValue as a constructor.
     * <p>
     * This is equivalent to using the <code>new</code> syntax in JavaScript.
     *
     * @param arguments The arguments to pass to the constructor.
     * @return The return value of the constructor call.
     */
    @Generated
    @Selector("constructWithArguments:")
    public native JSValue constructWithArguments(NSArray<?> arguments);

    /**
     * [@property]
     * <p>
     * The JSContext that this value originates from.
     */
    @Generated
    @Selector("context")
    public native JSContext context();

    /**
     * Define properties with custom descriptors on JSValues.
     * <p>
     * This method may be used to create a data or accessor property on an object.
     * This method operates in accordance with the Object.defineProperty method in the JavaScript language. Starting with macOS 10.15 and iOS 13, 'property' can be any 'id' and will be converted to a JSValue using the conversion rules of <code>valueWithObject:inContext:</code>. Prior to macOS 10.15 and iOS 13, 'property' was expected to be an NSString *.
     */
    @Generated
    @Selector("defineProperty:descriptor:")
    public native void definePropertyDescriptor(String property, @Mapped(ObjCObjectMapper.class) Object descriptor);

    /**
     * Delete a property from a JSValue.
     * <p>
     * Corresponds to the JavaScript operation <code>delete object[property]</code>. Starting with macOS 10.15 and iOS 13, 'property' can be any 'id' and will be converted to a JSValue using the conversion rules of <code>valueWithObject:inContext:</code>. Prior to macOS 10.15 and iOS 13, 'property' was expected to be an NSString *.
     *
     * @return YES if deletion is successful, NO otherwise.
     */
    @Generated
    @Selector("deleteProperty:")
    public native boolean deleteProperty(String property);

    /**
     * Check if a JSValue has a property.
     * <p>
     * This method has the same function as the JavaScript operator <code>in</code>.
     * <p>
     * Corresponds to the JavaScript operation <code>property in object</code>. Starting with macOS 10.15 and iOS 13, 'property' can be any 'id' and will be converted to a JSValue using the conversion rules of <code>valueWithObject:inContext:</code>. Prior to macOS 10.15 and iOS 13, 'property' was expected to be an NSString *.
     *
     * @return Returns YES if property is present on the value.
     */
    @Generated
    @Selector("hasProperty:")
    public native boolean hasProperty(String property);

    @Generated
    @Selector("init")
    public native JSValue init();

    /**
     * Invoke a method on a JSValue.
     * <p>
     * Accesses the property named <code>method</code> from this value and
     * calls the resulting value as a function, passing this JSValue as the <code>this</code>
     * value along with the specified arguments.
     *
     * @param method    The name of the method to be invoked.
     * @param arguments The arguments to pass to the method.
     * @return The return value of the method call.
     */
    @Generated
    @Selector("invokeMethod:withArguments:")
    public native JSValue invokeMethodWithArguments(String method, NSArray<?> arguments);

    /**
     * [@property]
     * <p>
     * Check if a JSValue is an array.
     */
    @Generated
    @Selector("isArray")
    public native boolean isArray();

    /**
     * [@property]
     * <p>
     * Check if a JSValue is a boolean.
     */
    @Generated
    @Selector("isBoolean")
    public native boolean isBoolean();

    /**
     * [@property]
     * <p>
     * Check if a JSValue is a date.
     */
    @Generated
    @Selector("isDate")
    public native boolean isDate();

    /**
     * Compare two JSValues using JavaScript's <code>===</code> operator.
     */
    @Generated
    @Selector("isEqualToObject:")
    public native boolean isEqualToObject(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Compare two JSValues using JavaScript's <code>==</code> operator.
     */
    @Generated
    @Selector("isEqualWithTypeCoercionToObject:")
    public native boolean isEqualWithTypeCoercionToObject(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Check if a JSValue is an instance of another object.
     * <p>
     * This method has the same function as the JavaScript operator <code>instanceof</code>.
     * If an object other than a JSValue is passed, it will first be converted according to
     * the aforementioned rules.
     */
    @Generated
    @Selector("isInstanceOf:")
    public native boolean isInstanceOf(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property]
     * <p>
     * Check if a JSValue corresponds to the JavaScript value <code>null</code>.
     */
    @Generated
    @Selector("isNull")
    public native boolean isNull();

    /**
     * [@property]
     * <p>
     * Check if a JSValue is a number.
     * <p>
     * In JavaScript, there is no differentiation between types of numbers.
     * Semantically all numbers behave like doubles except in special cases like bit
     * operations.
     */
    @Generated
    @Selector("isNumber")
    public native boolean isNumber();

    /**
     * [@property]
     * <p>
     * Check if a JSValue is an object.
     */
    @Generated
    @Selector("isObject")
    public native boolean isObject();

    /**
     * [@property]
     * <p>
     * Check if a JSValue is a string.
     */
    @Generated
    @Selector("isString")
    public native boolean isString();

    /**
     * [@property]
     * <p>
     * Check if a JSValue corresponds to the JavaScript value <code>undefined</code>.
     */
    @Generated
    @Selector("isUndefined")
    public native boolean isUndefined();

    @Generated
    @Selector("objectAtIndexedSubscript:")
    public native JSValue objectAtIndexedSubscript(@NUInt long index);

    @Generated
    @Selector("objectForKeyedSubscript:")
    public native JSValue objectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object key);

    @Generated
    @Selector("setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(@Mapped(ObjCObjectMapper.class) Object object, @NUInt long index);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object object,
            @Mapped(ObjCObjectMapper.class) Object key);

    /**
     * Set an indexed (numerical) property on a JSValue.
     * <p>
     * For JSValues that are JavaScript arrays, indices greater than
     * UINT_MAX - 1 will not affect the length of the array.
     */
    @Generated
    @Selector("setValue:atIndex:")
    public native void setValueAtIndex(@Mapped(ObjCObjectMapper.class) Object value, @NUInt long index);

    /**
     * Set a property on a JSValue.
     * <p>
     * Corresponds to the JavaScript operation <code>object[property] = value</code>. Starting with macOS 10.15 and iOS 13, 'property' can be any 'id' and will be converted to a JSValue using the conversion rules of <code>valueWithObject:inContext:</code>. Prior to macOS 10.15 and iOS 13, 'property' was expected to be an NSString *.
     */
    @Generated
    @Selector("setValue:forProperty:")
    public native void setValueForProperty(@Mapped(ObjCObjectMapper.class) Object value, String property);

    /**
     * Convert a JSValue to a NSArray.
     * <p>
     * If the value is <code>null</code> or <code>undefined</code> then <code>nil</code> is returned.
     * If the value is not an object then a JavaScript TypeError will be thrown.
     * The property <code>length</code> is read from the object, converted to an unsigned
     * integer, and an NSArray of this size is allocated. Properties corresponding
     * to indicies within the array bounds will be copied to the array, with
     * JSValues converted to equivalent Objective-C objects as specified.
     *
     * @return The NSArray containing the recursively converted contents of the
     * converted JavaScript array.
     */
    @Generated
    @Selector("toArray")
    public native NSArray<?> toArray();

    /**
     * Convert a JSValue to a boolean.
     * <p>
     * The JSValue is converted to a boolean according to the rules specified
     * by the JavaScript language.
     *
     * @return The boolean result of the conversion.
     */
    @Generated
    @Selector("toBool")
    public native boolean toBool();

    /**
     * Convert a JSValue to a NSDate.
     * <p>
     * The value is converted to a number representing a time interval
     * since 1970 which is then used to create a new NSDate instance.
     *
     * @return The NSDate created using the converted time interval.
     */
    @Generated
    @Selector("toDate")
    public native NSDate toDate();

    /**
     * Convert a JSValue to a NSDictionary.
     * <p>
     * If the value is <code>null</code> or <code>undefined</code> then <code>nil</code> is returned.
     * If the value is not an object then a JavaScript TypeError will be thrown.
     * All enumerable properties of the object are copied to the dictionary, with
     * JSValues converted to equivalent Objective-C objects as specified.
     *
     * @return The NSDictionary containing the recursively converted contents of
     * the converted JavaScript object.
     */
    @Generated
    @Selector("toDictionary")
    public native NSDictionary<?, ?> toDictionary();

    /**
     * Convert a JSValue to a double.
     * <p>
     * The JSValue is converted to a number according to the rules specified
     * by the JavaScript language.
     *
     * @return The double result of the conversion.
     */
    @Generated
    @Selector("toDouble")
    public native double toDouble();

    /**
     * Convert a JSValue to an <code>int32_t</code>.
     * <p>
     * The JSValue is converted to an integer according to the rules specified
     * by the JavaScript language.
     *
     * @return The <code>int32_t</code> result of the conversion.
     */
    @Generated
    @Selector("toInt32")
    public native int toInt32();

    /**
     * Convert a JSValue to a NSNumber.
     * <p>
     * If the JSValue represents a boolean, a NSNumber value of YES or NO
     * will be returned. For all other types the value will be converted to a number according
     * to the rules specified by the JavaScript language.
     *
     * @return The NSNumber result of the conversion.
     */
    @Generated
    @Selector("toNumber")
    public native NSNumber toNumber();

    /**
     * [@methodgroup] Converting to Objective-C Types
     * <p>
     * When converting between JavaScript values and Objective-C objects a copy is
     * performed. Values of types listed below are copied to the corresponding
     * types on conversion in each direction. For NSDictionaries, entries in the
     * dictionary that are keyed by strings are copied onto a JavaScript object.
     * For dictionaries and arrays, conversion is recursive, with the same object
     * conversion being applied to all entries in the collection.
     *
     * <pre>
     * @textblock
     *    Objective-C type  |   JavaScript type
     *  --------------------+---------------------
     *          nil         |     undefined
     *         NSNull       |        null
     *        NSString      |       string
     *        NSNumber      |   number, boolean
     *      NSDictionary    |   Object object
     *        NSArray       |    Array object
     *         NSDate       |     Date object
     *        NSBlock (1)   |   Function object (1)
     *           id (2)     |   Wrapper object (2)
     *         Class (3)    | Constructor object (3)
     * @/textblock
     * </pre>
     * <p>
     * (1) Instances of NSBlock with supported arguments types will be presented to
     * JavaScript as a callable Function object. For more information on supported
     * argument types see JSExport.h. If a JavaScript Function originating from an
     * Objective-C block is converted back to an Objective-C object the block will
     * be returned. All other JavaScript functions will be converted in the same
     * manner as a JavaScript object of type Object.
     * <p>
     * (2) For Objective-C instances that do not derive from the set of types listed
     * above, a wrapper object to provide a retaining handle to the Objective-C
     * instance from JavaScript. For more information on these wrapper objects, see
     * JSExport.h. When a JavaScript wrapper object is converted back to Objective-C
     * the Objective-C instance being retained by the wrapper is returned.
     * <p>
     * (3) For Objective-C Class objects a constructor object containing exported
     * class methods will be returned. See JSExport.h for more information on
     * constructor objects.
     * <p>
     * For all methods taking arguments of type id, arguments will be converted
     * into a JavaScript value according to the above conversion.
     * <p>
     * Convert this JSValue to an Objective-C object.
     * <p>
     * The JSValue is converted to an Objective-C object according
     * to the conversion rules specified above.
     *
     * @return The Objective-C representation of this JSValue.
     */
    @Generated
    @Selector("toObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object toObject();

    /**
     * Convert a JSValue to an Objective-C object of a specific class.
     * <p>
     * The JSValue is converted to an Objective-C object of the specified Class.
     * If the result is not of the specified Class then <code>nil</code> will be returned.
     *
     * @return An Objective-C object of the specified Class or <code>nil</code>.
     */
    @Generated
    @Selector("toObjectOfClass:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object toObjectOfClass(Class expectedClass);

    /**
     * Convert a JSValue to a CGPoint.
     * <p>
     * Reads the properties named <code>x</code> and <code>y</code> from
     * this JSValue, and converts the results to double.
     *
     * @return The new CGPoint.
     */
    @Generated
    @Selector("toPoint")
    @ByValue
    public native CGPoint toPoint();

    /**
     * Convert a JSValue to an NSRange.
     * <p>
     * Reads the properties named <code>location</code> and
     * <code>length</code> from this JSValue and converts the results to double.
     *
     * @return The new NSRange.
     */
    @Generated
    @Selector("toRange")
    @ByValue
    public native NSRange toRange();

    /**
     * Convert a JSValue to a CGRect.
     * <p>
     * Reads the properties named <code>x</code>, <code>y</code>,
     * <code>width</code>, and <code>height</code> from this JSValue and converts the results to double.
     *
     * @return The new CGRect.
     */
    @Generated
    @Selector("toRect")
    @ByValue
    public native CGRect toRect();

    /**
     * Convert a JSValue to a CGSize.
     * <p>
     * Reads the properties named <code>width</code> and
     * <code>height</code> from this JSValue and converts the results to double.
     *
     * @return The new CGSize.
     */
    @Generated
    @Selector("toSize")
    @ByValue
    public native CGSize toSize();

    /**
     * Convert a JSValue to a NSString.
     * <p>
     * The JSValue is converted to a string according to the rules specified
     * by the JavaScript language.
     *
     * @return The NSString containing the result of the conversion.
     */
    @Generated
    @Selector("toString")
    public native String toString();

    /**
     * Convert a JSValue to a <code>uint32_t</code>.
     * <p>
     * The JSValue is converted to an integer according to the rules specified
     * by the JavaScript language.
     *
     * @return The <code>uint32_t</code> result of the conversion.
     */
    @Generated
    @Selector("toUInt32")
    public native int toUInt32();

    /**
     * Access an indexed (numerical) property on a JSValue.
     *
     * @return The JSValue for the property at the specified index.
     * Returns the JavaScript value <code>undefined</code> if no property exists at that index.
     */
    @Generated
    @Selector("valueAtIndex:")
    public native JSValue valueAtIndex(@NUInt long index);

    /**
     * Access a property of a JSValue.
     * <p>
     * Corresponds to the JavaScript operation <code>object[property]</code>. Starting with macOS 10.15 and iOS 13, 'property' can be any 'id' and will be converted to a JSValue using the conversion rules of <code>valueWithObject:inContext:</code>. Prior to macOS 10.15 and iOS 13, 'property' was expected to be an NSString *.
     *
     * @return The JSValue for the requested property or the JSValue <code>undefined</code>
     * if the property does not exist.
     */
    @Generated
    @Selector("valueForProperty:")
    public native JSValue valueForProperty(String property);

    /**
     * [@property]
     * <p>
     * Check if a JSValue is a symbol.
     */
    @Generated
    @Selector("isSymbol")
    public native boolean isSymbol();

    /**
     * Create a new promise object using the provided executor callback.
     * <p>
     * This method is equivalent to calling the Promise constructor in JavaScript. the resolve and reject callbacks each normally take a single value, which they forward to all relevent pending reactions. While inside the executor callback context will act as if it were in any other callback, except calleeFunction will be <code>nil</code>. This also means means the new promise object may be accessed via <code>[context thisValue]</code>.
     *
     * @param callback A callback block invoked while the promise object is being initialized. The resolve and reject parameters are functions that can be called to notify any pending reactions about the state of the new promise object.
     * @param context  The JSContext to which the resulting JSValue belongs.
     * @return The JSValue representing a new promise JavaScript object.
     */
    @Generated
    @Selector("valueWithNewPromiseInContext:fromExecutor:")
    public static native JSValue valueWithNewPromiseInContextFromExecutor(JSContext context,
            @ObjCBlock(name = "call_valueWithNewPromiseInContextFromExecutor") Block_valueWithNewPromiseInContextFromExecutor callback);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueWithNewPromiseInContextFromExecutor {
        @Generated
        void call_valueWithNewPromiseInContextFromExecutor(JSValue resolve, JSValue reject);
    }

    /**
     * Create a new rejected promise object with the provided value.
     * <p>
     * This method is equivalent to calling <code>[JSValue valueWithNewPromiseFromExecutor:^(JSValue *resolve, JSValue *reject) { [reject callWithArguments:@[reason]]; } inContext:context]</code>
     *
     * @param reason  The result value to be passed to any reactions.
     * @param context The JSContext to which the resulting JSValue belongs.
     * @return The JSValue representing a new promise JavaScript object.
     */
    @Generated
    @Selector("valueWithNewPromiseRejectedWithReason:inContext:")
    public static native JSValue valueWithNewPromiseRejectedWithReasonInContext(
            @Mapped(ObjCObjectMapper.class) Object reason, JSContext context);

    /**
     * Create a new resolved promise object with the provided value.
     * <p>
     * This method is equivalent to calling <code>[JSValue valueWithNewPromiseFromExecutor:^(JSValue *resolve, JSValue *reject) { [resolve callWithArguments:@[result]]; } inContext:context]</code>
     *
     * @param result  The result value to be passed to any reactions.
     * @param context The JSContext to which the resulting JSValue belongs.
     * @return The JSValue representing a new promise JavaScript object.
     */
    @Generated
    @Selector("valueWithNewPromiseResolvedWithResult:inContext:")
    public static native JSValue valueWithNewPromiseResolvedWithResultInContext(
            @Mapped(ObjCObjectMapper.class) Object result, JSContext context);

    /**
     * Create a new, unique, symbol object.
     *
     * @param description The description of the symbol object being created.
     * @param context     The JSContext to which the resulting JSValue belongs.
     * @return The JSValue representing a unique JavaScript value with type symbol.
     */
    @Generated
    @Selector("valueWithNewSymbolFromDescription:inContext:")
    public static native JSValue valueWithNewSymbolFromDescriptionInContext(String description, JSContext context);
}
