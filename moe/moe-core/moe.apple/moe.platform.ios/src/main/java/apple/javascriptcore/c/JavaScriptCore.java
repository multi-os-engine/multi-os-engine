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

package apple.javascriptcore.c;

import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.javascriptcore.opaque.JSClassRef;
import apple.javascriptcore.opaque.JSContextGroupRef;
import apple.javascriptcore.opaque.JSContextRef;
import apple.javascriptcore.opaque.JSGlobalContextRef;
import apple.javascriptcore.opaque.JSObjectRef;
import apple.javascriptcore.opaque.JSPropertyNameAccumulatorRef;
import apple.javascriptcore.opaque.JSPropertyNameArrayRef;
import apple.javascriptcore.opaque.JSStringRef;
import apple.javascriptcore.opaque.JSValueRef;
import apple.javascriptcore.struct.JSClassDefinition;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("JavaScriptCore")
@Runtime(CRuntime.class)
public final class JavaScriptCore {
    static {
        NatJ.register();
    }

    @Generated
    private JavaScriptCore() {
    }

    /**
     * [@function] JSEvaluateScript
     * 
     * Evaluates a string of JavaScript.
     * 
     * @param ctx The execution context to use.
     * @param script A JSString containing the script to evaluate.
     * @param thisObject The object to use as "this," or NULL to use the global object as "this."
     * @param sourceURL A JSString containing a URL for the script's source file. This is used by debuggers and when reporting exceptions. Pass NULL if you do not care to include source file information.
     * @param startingLineNumber An integer value specifying the script's starting line number in the file located at sourceURL. This is only used when reporting exceptions. The value is one-based, so the first line is line 1 and invalid values are clamped to 1.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return The JSValue that results from evaluating script, or NULL if an exception is thrown.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSEvaluateScript(JSContextRef ctx, JSStringRef script, JSObjectRef thisObject,
            JSStringRef sourceURL, int startingLineNumber, Ptr<JSValueRef> exception);

    /**
     * [@function] JSCheckScriptSyntax
     * 
     * Checks for syntax errors in a string of JavaScript.
     * 
     * @param ctx The execution context to use.
     * @param script A JSString containing the script to check for syntax errors.
     * @param sourceURL A JSString containing a URL for the script's source file. This is only used when reporting exceptions. Pass NULL if you do not care to include source file information in exceptions.
     * @param startingLineNumber An integer value specifying the script's starting line number in the file located at sourceURL. This is only used when reporting exceptions. The value is one-based, so the first line is line 1 and invalid values are clamped to 1.
     * @param exception A pointer to a JSValueRef in which to store a syntax error exception, if any. Pass NULL if you do not care to store a syntax error exception.
     * @return true if the script is syntactically correct, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSCheckScriptSyntax(JSContextRef ctx, JSStringRef script, JSStringRef sourceURL,
            int startingLineNumber, Ptr<JSValueRef> exception);

    /**
     * [@function] JSGarbageCollect
     * 
     * Performs a JavaScript garbage collection.
     * 
     * JavaScript values that are on the machine stack, in a register,
     *  protected by JSValueProtect, set as the global object of an execution context,
     *  or reachable from any such value will not be collected.
     * 
     *  During JavaScript execution, you are not required to call this function; the
     *  JavaScript engine will garbage collect as needed. JavaScript values created
     *  within a context group are automatically destroyed when the last reference
     *  to the context group is released.
     * 
     * @param ctx The execution context to use.
     */
    @Generated
    @CFunction
    public static native void JSGarbageCollect(JSContextRef ctx);

    /**
     * [@function]
     * 
     * Returns a JavaScript value's type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue whose type you want to obtain.
     * @return         A value of type JSType that identifies value's type.
     */
    @Generated
    @CFunction
    public static native int JSValueGetType(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the undefined type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the undefined type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsUndefined(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the null type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the null type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsNull(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the boolean type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the boolean type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsBoolean(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the number type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the number type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsNumber(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the string type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the string type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsString(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the object type.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the object type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsObject(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value is an object with a given class in its class chain.
     * 
     * @param ctx The execution context to use.
     * @param value The JSValue to test.
     * @param jsClass The JSClass to test against.
     * @return true if value is an object and has jsClass in its class chain, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsObjectOfClass(JSContextRef ctx, JSValueRef value, JSClassRef jsClass);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value is an array.
     * 
     * @param ctx      The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value is an array, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsArray(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value is a date.
     * 
     * @param ctx      The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value is a date, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsDate(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Returns a JavaScript value's Typed Array type.
     * 
     * @param ctx          The execution context to use.
     * @param value        The JSValue whose Typed Array type to return.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             A value of type JSTypedArrayType that identifies value's Typed Array type, or kJSTypedArrayTypeNone if the value is not a Typed Array object.
     */
    @Generated
    @CFunction
    public static native int JSValueGetTypedArrayType(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Tests whether two JavaScript values are equal, as compared by the JS == operator.
     * 
     * @param ctx The execution context to use.
     * @param a The first value to test.
     * @param b The second value to test.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return true if the two values are equal, false if they are not equal or an exception is thrown.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsEqual(JSContextRef ctx, JSValueRef a, JSValueRef b,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Tests whether two JavaScript values are strict equal, as compared by the JS === operator.
     * 
     * @param ctx  The execution context to use.
     * @param a        The first value to test.
     * @param b        The second value to test.
     * @return         true if the two values are strict equal, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsStrictEqual(JSContextRef ctx, JSValueRef a, JSValueRef b);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value is an object constructed by a given constructor, as compared by the JS instanceof operator.
     * 
     * @param ctx The execution context to use.
     * @param value The JSValue to test.
     * @param constructor The constructor to test against.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return true if value is an object constructed by constructor, as compared by the JS instanceof operator, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsInstanceOfConstructor(JSContextRef ctx, JSValueRef value,
            JSObjectRef constructor, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript value of the undefined type.
     * 
     * @param ctx  The execution context to use.
     * @return         The unique undefined value.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeUndefined(JSContextRef ctx);

    /**
     * [@function]
     * 
     * Creates a JavaScript value of the null type.
     * 
     * @param ctx  The execution context to use.
     * @return         The unique null value.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeNull(JSContextRef ctx);

    /**
     * [@function]
     * 
     * Creates a JavaScript value of the boolean type.
     * 
     * @param ctx  The execution context to use.
     * @param boolean  The bool to assign to the newly created JSValue.
     * @return         A JSValue of the boolean type, representing the value of boolean.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeBoolean(JSContextRef ctx, boolean boolean_);

    /**
     * [@function]
     * 
     * Creates a JavaScript value of the number type.
     * 
     * @param ctx  The execution context to use.
     * @param number   The double to assign to the newly created JSValue.
     * @return         A JSValue of the number type, representing the value of number.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeNumber(JSContextRef ctx, double number);

    /**
     * [@function]
     * 
     * Creates a JavaScript value of the string type.
     * 
     * @param ctx  The execution context to use.
     * @param string   The JSString to assign to the newly created JSValue. The
     *  newly created JSValue retains string, and releases it upon garbage collection.
     * @return         A JSValue of the string type, representing the value of string.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeString(JSContextRef ctx, JSStringRef string);

    /**
     * [@function]
     * 
     * Creates a JavaScript value from a JSON formatted string.
     * 
     * @param ctx      The execution context to use.
     * @param string   The JSString containing the JSON string to be parsed.
     * @return         A JSValue containing the parsed value, or NULL if the input is invalid.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeFromJSONString(JSContextRef ctx, JSStringRef string);

    /**
     * [@function]
     * 
     * Creates a JavaScript string containing the JSON serialized representation of a JS value.
     * 
     * @param ctx      The execution context to use.
     * @param value    The value to serialize.
     * @param indent   The number of spaces to indent when nesting.  If 0, the resulting JSON will not contains newlines.  The size of the indent is clamped to 10 spaces.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return         A JSString with the result of serialization, or NULL if an exception is thrown.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSValueCreateJSONString(JSContextRef ctx, JSValueRef value, int indent,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Converts a JavaScript value to boolean and returns the resulting boolean.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to convert.
     * @return         The boolean result of conversion.
     */
    @Generated
    @CFunction
    public static native boolean JSValueToBoolean(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Converts a JavaScript value to number and returns the resulting number.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to convert.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return         The numeric result of conversion, or NaN if an exception is thrown.
     */
    @Generated
    @CFunction
    public static native double JSValueToNumber(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Converts a JavaScript value to string and copies the result into a JavaScript string.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to convert.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return         A JSString with the result of conversion, or NULL if an exception is thrown. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSValueToStringCopy(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Converts a JavaScript value to object and returns the resulting object.
     * 
     * @param ctx  The execution context to use.
     * @param value    The JSValue to convert.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return         The JSObject result of conversion, or NULL if an exception is thrown.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSValueToObject(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * Garbage collection
     * [@function]
     * 
     * Protects a JavaScript value from garbage collection.
     * 
     * Use this method when you want to store a JSValue in a global or on the heap, where the garbage collector will not be able to discover your reference to it.
     * 
     * A value may be protected multiple times and must be unprotected an equal number of times before becoming eligible for garbage collection.
     * 
     * @param ctx The execution context to use.
     * @param value The JSValue to protect.
     */
    @Generated
    @CFunction
    public static native void JSValueProtect(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Unprotects a JavaScript value from garbage collection.
     * 
     * A value may be protected multiple times and must be unprotected an
     *  equal number of times before becoming eligible for garbage collection.
     * 
     * @param ctx      The execution context to use.
     * @param value    The JSValue to unprotect.
     */
    @Generated
    @CFunction
    public static native void JSValueUnprotect(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Creates a JavaScript class suitable for use with JSObjectMake.
     * 
     * @param definition A JSClassDefinition that defines the class.
     * @return A JSClass with the given definition. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native JSClassRef JSClassCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") JSClassDefinition definition);

    /**
     * [@function]
     * 
     * Retains a JavaScript class.
     * 
     * @param jsClass The JSClass to retain.
     * @return A JSClass that is the same as jsClass.
     */
    @Generated
    @CFunction
    public static native JSClassRef JSClassRetain(JSClassRef jsClass);

    /**
     * [@function]
     * 
     * Releases a JavaScript class.
     * 
     * @param jsClass The JSClass to release.
     */
    @Generated
    @CFunction
    public static native void JSClassRelease(JSClassRef jsClass);

    /**
     * [@function]
     * 
     * Creates a JavaScript object.
     * 
     * The default object class does not allocate storage for private data, so you must provide a non-NULL jsClass to JSObjectMake if you want your object to be able to store private data.
     * 
     * data is set on the created object before the intialize methods in its class chain are called. This enables the initialize methods to retrieve and manipulate data through JSObjectGetPrivate.
     * 
     * @param ctx The execution context to use.
     * @param jsClass The JSClass to assign to the object. Pass NULL to use the default object class.
     * @param data A void* to set as the object's private data. Pass NULL to specify no private data.
     * @return A JSObject with the given class and private data.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMake(JSContextRef ctx, JSClassRef jsClass, VoidPtr data);

    /**
     * [@function]
     * 
     * Convenience method for creating a JavaScript function with a given callback as its implementation.
     * 
     * @param ctx The execution context to use.
     * @param name A JSString containing the function's name. This will be used when converting the function to string. Pass NULL to create an anonymous function.
     * @param callAsFunction The JSObjectCallAsFunctionCallback to invoke when the function is called.
     * @return A JSObject that is a function. The object's prototype will be the default function prototype.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeFunctionWithCallback(JSContextRef ctx, JSStringRef name,
            @FunctionPtr(name = "call_JSObjectMakeFunctionWithCallback") Function_JSObjectMakeFunctionWithCallback callAsFunction);

    /**
     * [@function]
     * 
     * Convenience method for creating a JavaScript constructor.
     * 
     * The default object constructor takes no arguments and constructs an object of class jsClass with no private data.
     * 
     * @param ctx The execution context to use.
     * @param jsClass A JSClass that is the class your constructor will assign to the objects its constructs. jsClass will be used to set the constructor's .prototype property, and to evaluate 'instanceof' expressions. Pass NULL to use the default object class.
     * @param callAsConstructor A JSObjectCallAsConstructorCallback to invoke when your constructor is used in a 'new' expression. Pass NULL to use the default object constructor.
     * @return A JSObject that is a constructor. The object's prototype will be the default object prototype.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeConstructor(JSContextRef ctx, JSClassRef jsClass,
            @FunctionPtr(name = "call_JSObjectMakeConstructor") Function_JSObjectMakeConstructor callAsConstructor);

    /**
     * [@function]
     * 
     * Creates a JavaScript Array object.
     * 
     * The behavior of this function does not exactly match the behavior of the built-in Array constructor. Specifically, if one argument
     * is supplied, this function returns an array with one element.
     * 
     * @param ctx The execution context to use.
     * @param argumentCount An integer count of the number of arguments in arguments.
     * @param arguments A JSValue array of data to populate the Array with. Pass NULL if argumentCount is 0.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return A JSObject that is an Array.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeArray(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript Date object, as if by invoking the built-in Date constructor.
     * 
     * @param ctx The execution context to use.
     * @param argumentCount An integer count of the number of arguments in arguments.
     * @param arguments A JSValue array of arguments to pass to the Date Constructor. Pass NULL if argumentCount is 0.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return A JSObject that is a Date.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeDate(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript Error object, as if by invoking the built-in Error constructor.
     * 
     * @param ctx The execution context to use.
     * @param argumentCount An integer count of the number of arguments in arguments.
     * @param arguments A JSValue array of arguments to pass to the Error Constructor. Pass NULL if argumentCount is 0.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return A JSObject that is an Error.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeError(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript RegExp object, as if by invoking the built-in RegExp constructor.
     * 
     * @param ctx The execution context to use.
     * @param argumentCount An integer count of the number of arguments in arguments.
     * @param arguments A JSValue array of arguments to pass to the RegExp Constructor. Pass NULL if argumentCount is 0.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return A JSObject that is a RegExp.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeRegExp(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a function with a given script as its body.
     * 
     * Use this method when you want to execute a script repeatedly, to avoid the cost of re-parsing the script before each execution.
     * 
     * @param ctx The execution context to use.
     * @param name A JSString containing the function's name. This will be used when converting the function to string. Pass NULL to create an anonymous function.
     * @param parameterCount An integer count of the number of parameter names in parameterNames.
     * @param parameterNames A JSString array containing the names of the function's parameters. Pass NULL if parameterCount is 0.
     * @param body A JSString containing the script to use as the function's body.
     * @param sourceURL A JSString containing a URL for the script's source file. This is only used when reporting exceptions. Pass NULL if you do not care to include source file information in exceptions.
     * @param startingLineNumber An integer value specifying the script's starting line number in the file located at sourceURL. This is only used when reporting exceptions. The value is one-based, so the first line is line 1 and invalid values are clamped to 1.
     * @param exception A pointer to a JSValueRef in which to store a syntax error exception, if any. Pass NULL if you do not care to store a syntax error exception.
     * @return A JSObject that is a function, or NULL if either body or parameterNames contains a syntax error. The object's prototype will be the default function prototype.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeFunction(JSContextRef ctx, JSStringRef name, int parameterCount,
            ConstPtr<JSStringRef> parameterNames, JSStringRef body, JSStringRef sourceURL, int startingLineNumber,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Gets an object's prototype.
     * 
     * @param ctx  The execution context to use.
     * @param object A JSObject whose prototype you want to get.
     * @return A JSValue that is the object's prototype.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPrototype(JSContextRef ctx, JSObjectRef object);

    /**
     * [@function]
     * 
     * Sets an object's prototype.
     * 
     * @param ctx  The execution context to use.
     * @param object The JSObject whose prototype you want to set.
     * @param value A JSValue to set as the object's prototype.
     */
    @Generated
    @CFunction
    public static native void JSObjectSetPrototype(JSContextRef ctx, JSObjectRef object, JSValueRef value);

    /**
     * [@function]
     * 
     * Tests whether an object has a given property.
     * 
     * @param object The JSObject to test.
     * @param propertyName A JSString containing the property's name.
     * @return true if the object has a property whose name matches propertyName, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSObjectHasProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName);

    /**
     * [@function]
     * 
     * Gets a property from an object.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to get.
     * @param propertyName A JSString containing the property's name.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return The property's value if object has the property, otherwise the undefined value.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Sets a property on an object.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to set.
     * @param propertyName A JSString containing the property's name.
     * @param value A JSValueRef to use as the property's value.
     * @param attributes A logically ORed set of JSPropertyAttributes to give to the property.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     */
    @Generated
    @CFunction
    public static native void JSObjectSetProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            JSValueRef value, int attributes, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Deletes a property from an object.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to delete.
     * @param propertyName A JSString containing the property's name.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return true if the delete operation succeeds, otherwise false (for example, if the property has the kJSPropertyAttributeDontDelete attribute set).
     */
    @Generated
    @CFunction
    public static native boolean JSObjectDeleteProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Gets a property from an object by numeric index.
     * 
     * Calling JSObjectGetPropertyAtIndex is equivalent to calling JSObjectGetProperty with a string containing propertyIndex, but JSObjectGetPropertyAtIndex provides optimized access to numeric properties.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to get.
     * @param propertyIndex An integer value that is the property's name.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return The property's value if object has the property, otherwise the undefined value.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Sets a property on an object by numeric index.
     * 
     * Calling JSObjectSetPropertyAtIndex is equivalent to calling JSObjectSetProperty with a string containing propertyIndex, but JSObjectSetPropertyAtIndex provides optimized access to numeric properties.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to set.
     * @param propertyIndex The property's name as a number.
     * @param value A JSValue to use as the property's value.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     */
    @Generated
    @CFunction
    public static native void JSObjectSetPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex,
            JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Gets an object's private data.
     * 
     * @param object A JSObject whose private data you want to get.
     * @return A void* that is the object's private data, if the object has private data, otherwise NULL.
     */
    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetPrivate(JSObjectRef object);

    /**
     * [@function]
     * 
     * Sets a pointer to private data on an object.
     * 
     * The default object class does not allocate storage for private data. Only objects created with a non-NULL JSClass can store private data.
     * 
     * @param object The JSObject whose private data you want to set.
     * @param data A void* to set as the object's private data.
     * @return true if object can store private data, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSObjectSetPrivate(JSObjectRef object, VoidPtr data);

    /**
     * [@function]
     * 
     * Tests whether an object can be called as a function.
     * 
     * @param ctx  The execution context to use.
     * @param object The JSObject to test.
     * @return true if the object can be called as a function, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSObjectIsFunction(JSContextRef ctx, JSObjectRef object);

    /**
     * [@function]
     * 
     * Calls an object as a function.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject to call as a function.
     * @param thisObject The object to use as "this," or NULL to use the global object as "this."
     * @param argumentCount An integer count of the number of arguments in arguments.
     * @param arguments A JSValue array of arguments to pass to the function. Pass NULL if argumentCount is 0.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return The JSValue that results from calling object as a function, or NULL if an exception is thrown or object is not a function.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectCallAsFunction(JSContextRef ctx, JSObjectRef object, JSObjectRef thisObject,
            @NUInt long argumentCount, ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Tests whether an object can be called as a constructor.
     * 
     * @param ctx  The execution context to use.
     * @param object The JSObject to test.
     * @return true if the object can be called as a constructor, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSObjectIsConstructor(JSContextRef ctx, JSObjectRef object);

    /**
     * [@function]
     * 
     * Calls an object as a constructor.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject to call as a constructor.
     * @param argumentCount An integer count of the number of arguments in arguments.
     * @param arguments A JSValue array of arguments to pass to the constructor. Pass NULL if argumentCount is 0.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return The JSObject that results from calling object as a constructor, or NULL if an exception is thrown or object is not a constructor.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectCallAsConstructor(JSContextRef ctx, JSObjectRef object,
            @NUInt long argumentCount, ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Gets the names of an object's enumerable properties.
     * 
     * @param ctx The execution context to use.
     * @param object The object whose property names you want to get.
     * @return A JSPropertyNameArray containing the names object's enumerable properties. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native JSPropertyNameArrayRef JSObjectCopyPropertyNames(JSContextRef ctx, JSObjectRef object);

    /**
     * [@function]
     * 
     * Retains a JavaScript property name array.
     * 
     * @param array The JSPropertyNameArray to retain.
     * @return A JSPropertyNameArray that is the same as array.
     */
    @Generated
    @CFunction
    public static native JSPropertyNameArrayRef JSPropertyNameArrayRetain(JSPropertyNameArrayRef array);

    /**
     * [@function]
     * 
     * Releases a JavaScript property name array.
     * 
     * @param array The JSPropetyNameArray to release.
     */
    @Generated
    @CFunction
    public static native void JSPropertyNameArrayRelease(JSPropertyNameArrayRef array);

    /**
     * [@function]
     * 
     * Gets a count of the number of items in a JavaScript property name array.
     * 
     * @param array The array from which to retrieve the count.
     * @return An integer count of the number of names in array.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSPropertyNameArrayGetCount(JSPropertyNameArrayRef array);

    /**
     * [@function]
     * 
     * Gets a property name at a given index in a JavaScript property name array.
     * 
     * @param array The array from which to retrieve the property name.
     * @param index The index of the property name to retrieve.
     * @return A JSStringRef containing the property name.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSPropertyNameArrayGetNameAtIndex(JSPropertyNameArrayRef array, @NUInt long index);

    /**
     * [@function]
     * 
     * Adds a property name to a JavaScript property name accumulator.
     * 
     * @param accumulator The accumulator object to which to add the property name.
     * @param propertyName The property name to add.
     */
    @Generated
    @CFunction
    public static native void JSPropertyNameAccumulatorAddName(JSPropertyNameAccumulatorRef accumulator,
            JSStringRef propertyName);

    /**
     * [@function]
     * 
     * Creates a JavaScript context group.
     * 
     * A JSContextGroup associates JavaScript contexts with one another.
     *  Contexts in the same group may share and exchange JavaScript objects. Sharing and/or exchanging
     *  JavaScript objects between contexts in different groups will produce undefined behavior.
     *  When objects from the same context group are used in multiple threads, explicit
     *  synchronization is required.
     * 
     *  A JSContextGroup may need to run deferred tasks on a run loop, such as garbage collection
     *  or resolving WebAssembly compilations. By default, calling JSContextGroupCreate will use
     *  the run loop of the thread it was called on. Currently, there is no API to change a
     *  JSContextGroup's run loop once it has been created.
     * 
     * @return The created JSContextGroup.
     */
    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGroupCreate();

    /**
     * [@function]
     * 
     * Retains a JavaScript context group.
     * 
     * @param group The JSContextGroup to retain.
     * @return A JSContextGroup that is the same as group.
     */
    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGroupRetain(JSContextGroupRef group);

    /**
     * [@function]
     * 
     * Releases a JavaScript context group.
     * 
     * @param group The JSContextGroup to release.
     */
    @Generated
    @CFunction
    public static native void JSContextGroupRelease(JSContextGroupRef group);

    /**
     * [@function]
     * 
     * Creates a global JavaScript execution context.
     * 
     * JSGlobalContextCreate allocates a global object and populates it with all the
     *  built-in JavaScript objects, such as Object, Function, String, and Array.
     * 
     *  In WebKit version 4.0 and later, the context is created in a unique context group.
     *  Therefore, scripts may execute in it concurrently with scripts executing in other contexts.
     *  However, you may not use values created in the context in other contexts.
     * 
     * @param globalObjectClass The class to use when creating the global object. Pass 
     *  NULL to use the default object class.
     * @return A JSGlobalContext with a global object of class globalObjectClass.
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextCreate(JSClassRef globalObjectClass);

    /**
     * [@function]
     * 
     * Creates a global JavaScript execution context in the context group provided.
     * 
     * JSGlobalContextCreateInGroup allocates a global object and populates it with
     *  all the built-in JavaScript objects, such as Object, Function, String, and Array.
     * 
     * @param globalObjectClass The class to use when creating the global object. Pass
     *  NULL to use the default object class.
     * @param group The context group to use. The created global context retains the group.
     *  Pass NULL to create a unique group for the context.
     * @return A JSGlobalContext with a global object of class globalObjectClass and a context
     *  group equal to group.
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextCreateInGroup(JSContextGroupRef group,
            JSClassRef globalObjectClass);

    /**
     * [@function]
     * 
     * Retains a global JavaScript execution context.
     * 
     * @param ctx The JSGlobalContext to retain.
     * @return A JSGlobalContext that is the same as ctx.
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextRetain(JSGlobalContextRef ctx);

    /**
     * [@function]
     * 
     * Releases a global JavaScript execution context.
     * 
     * @param ctx The JSGlobalContext to release.
     */
    @Generated
    @CFunction
    public static native void JSGlobalContextRelease(JSGlobalContextRef ctx);

    /**
     * [@function]
     * 
     * Gets the global object of a JavaScript execution context.
     * 
     * @param ctx The JSContext whose global object you want to get.
     * @return ctx's global object.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSContextGetGlobalObject(JSContextRef ctx);

    /**
     * [@function]
     * 
     * Gets the context group to which a JavaScript execution context belongs.
     * 
     * @param ctx The JSContext whose group you want to get.
     * @return ctx's group.
     */
    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGetGroup(JSContextRef ctx);

    /**
     * [@function]
     * 
     * Gets the global context of a JavaScript execution context.
     * 
     * @param ctx The JSContext whose global context you want to get.
     * @return ctx's global context.
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSContextGetGlobalContext(JSContextRef ctx);

    /**
     * [@function]
     * 
     * Gets a copy of the name of a context.
     * 
     * A JSGlobalContext's name is exposed for remote debugging to make it
     * easier to identify the context you would like to attach to.
     * 
     * @param ctx The JSGlobalContext whose name you want to get.
     * @return The name for ctx.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSGlobalContextCopyName(JSGlobalContextRef ctx);

    /**
     * [@function]
     * 
     * Sets the remote debugging name for a context.
     * 
     * @param ctx The JSGlobalContext that you want to name.
     * @param name The remote debugging name to set on ctx.
     */
    @Generated
    @CFunction
    public static native void JSGlobalContextSetName(JSGlobalContextRef ctx, JSStringRef name);

    /**
     * [@function]
     * 
     * Creates a JavaScript string from a buffer of Unicode characters.
     * 
     * @param chars      The buffer of Unicode characters to copy into the new JSString.
     * @param numChars   The number of characters to copy from the buffer pointed to by chars.
     * @return           A JSString containing chars. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithCharacters(ConstCharPtr chars, @NUInt long numChars);

    /**
     * [@function]
     * 
     * Creates a JavaScript string from a null-terminated UTF8 string.
     * 
     * @param string     The null-terminated UTF8 string to copy into the new JSString.
     * @return           A JSString containing string. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithUTF8CString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string);

    /**
     * [@function]
     * 
     * Retains a JavaScript string.
     * 
     * @param string     The JSString to retain.
     * @return           A JSString that is the same as string.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringRetain(JSStringRef string);

    /**
     * [@function]
     * 
     * Releases a JavaScript string.
     * 
     * @param string     The JSString to release.
     */
    @Generated
    @CFunction
    public static native void JSStringRelease(JSStringRef string);

    /**
     * [@function]
     * 
     * Returns the number of Unicode characters in a JavaScript string.
     * 
     * @param string     The JSString whose length (in Unicode characters) you want to know.
     * @return           The number of Unicode characters stored in string.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetLength(JSStringRef string);

    /**
     * [@function]
     * 
     * Returns a pointer to the Unicode character buffer that
     *  serves as the backing store for a JavaScript string.
     * 
     * @param string     The JSString whose backing store you want to access.
     * @return           A pointer to the Unicode character buffer that serves as string's 
     *  backing store, which will be deallocated when string is deallocated.
     */
    @Generated
    @CFunction
    public static native ConstCharPtr JSStringGetCharactersPtr(JSStringRef string);

    /**
     * [@function]
     * 
     * Returns the maximum number of bytes a JavaScript string will
     *  take up if converted into a null-terminated UTF8 string.
     * 
     * @param string The JSString whose maximum converted size (in bytes) you 
     *  want to know.
     * @return The maximum number of bytes that could be required to convert string into a 
     *  null-terminated UTF8 string. The number of bytes that the conversion actually ends 
     *  up requiring could be less than this, but never more.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetMaximumUTF8CStringSize(JSStringRef string);

    /**
     * [@function]
     * 
     * Converts a JavaScript string into a null-terminated UTF8 string,
     *  and copies the result into an external byte buffer.
     * 
     * @param string The source JSString.
     * @param buffer The destination byte buffer into which to copy a null-terminated 
     *  UTF8 representation of string. On return, buffer contains a UTF8 string 
     *  representation of string. If bufferSize is too small, buffer will contain only 
     *  partial results. If buffer is not at least bufferSize bytes in size, 
     *  behavior is undefined. 
     * @param bufferSize The size of the external buffer in bytes.
     * @return The number of bytes written into buffer (including the null-terminator byte).
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetUTF8CString(JSStringRef string, BytePtr buffer, @NUInt long bufferSize);

    /**
     * [@function]
     * 
     * Tests whether two JavaScript strings match.
     * 
     * @param a      The first JSString to test.
     * @param b      The second JSString to test.
     * @return       true if the two strings match, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSStringIsEqual(JSStringRef a, JSStringRef b);

    /**
     * [@function]
     * 
     * Tests whether a JavaScript string matches a null-terminated UTF8 string.
     * 
     * @param a      The JSString to test.
     * @param b      The null-terminated UTF8 string to test.
     * @return       true if the two strings match, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSStringIsEqualToUTF8CString(JSStringRef a,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String b);

    /**
     * [@function]
     * 
     * Creates a JavaScript Typed Array object with the given number of elements.
     * 
     * @param ctx          The execution context to use.
     * @param arrayType    A value identifying the type of array to create. If arrayType is kJSTypedArrayTypeNone or kJSTypedArrayTypeArrayBuffer then NULL will be returned.
     * @param length       The number of elements to be in the new Typed Array.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             A JSObjectRef that is a Typed Array with all elements set to zero or NULL if there was an error.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArray(JSContextRef ctx, int arrayType, @NUInt long length,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript Typed Array object from an existing pointer.
     * 
     * If an exception is thrown during this function the bytesDeallocator will always be called.
     * 
     * @param ctx                The execution context to use.
     * @param arrayType          A value identifying the type of array to create. If arrayType is kJSTypedArrayTypeNone or kJSTypedArrayTypeArrayBuffer then NULL will be returned.
     * @param bytes              A pointer to the byte buffer to be used as the backing store of the Typed Array object.
     * @param byteLength         The number of bytes pointed to by the parameter bytes.
     * @param bytesDeallocator   The allocator to use to deallocate the external buffer when the JSTypedArrayData object is deallocated.
     * @param deallocatorContext A pointer to pass back to the deallocator.
     * @param exception          A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return                   A JSObjectRef Typed Array whose backing store is the same as the one pointed to by bytes or NULL if there was an error.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArrayWithBytesNoCopy(JSContextRef ctx, int arrayType,
            VoidPtr bytes, @NUInt long byteLength,
            @FunctionPtr(name = "call_JSObjectMakeTypedArrayWithBytesNoCopy") Function_JSObjectMakeTypedArrayWithBytesNoCopy bytesDeallocator,
            VoidPtr deallocatorContext, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript Typed Array object from an existing JavaScript Array Buffer object.
     * 
     * @param ctx          The execution context to use.
     * @param arrayType    A value identifying the type of array to create. If arrayType is kJSTypedArrayTypeNone or kJSTypedArrayTypeArrayBuffer then NULL will be returned.
     * @param buffer       An Array Buffer object that should be used as the backing store for the created JavaScript Typed Array object.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             A JSObjectRef that is a Typed Array or NULL if there was an error. The backing store of the Typed Array will be buffer.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArrayWithArrayBuffer(JSContextRef ctx, int arrayType,
            JSObjectRef buffer, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript Typed Array object from an existing JavaScript Array Buffer object with the given offset and length.
     * 
     * @param ctx          The execution context to use.
     * @param arrayType    A value identifying the type of array to create. If arrayType is kJSTypedArrayTypeNone or kJSTypedArrayTypeArrayBuffer then NULL will be returned.
     * @param buffer       An Array Buffer object that should be used as the backing store for the created JavaScript Typed Array object.
     * @param byteOffset   The byte offset for the created Typed Array. byteOffset should aligned with the element size of arrayType.
     * @param length       The number of elements to include in the Typed Array.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             A JSObjectRef that is a Typed Array or NULL if there was an error. The backing store of the Typed Array will be buffer.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArrayWithArrayBufferAndOffset(JSContextRef ctx, int arrayType,
            JSObjectRef buffer, @NUInt long byteOffset, @NUInt long length, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns a temporary pointer to the backing store of a JavaScript Typed Array object.
     * 
     * The pointer returned by this function is temporary and is not guaranteed to remain valid across JavaScriptCore API calls.
     * 
     * @param ctx          The execution context to use.
     * @param object       The Typed Array object whose backing store pointer to return.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             A pointer to the raw data buffer that serves as object's backing store or NULL if object is not a Typed Array object.
     */
    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetTypedArrayBytesPtr(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns the length of a JavaScript Typed Array object.
     * 
     * @param ctx          The execution context to use.
     * @param object       The Typed Array object whose length to return.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             The length of the Typed Array object or 0 if the object is not a Typed Array object.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetTypedArrayLength(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns the byte length of a JavaScript Typed Array object.
     * 
     * @param ctx          The execution context to use.
     * @param object       The Typed Array object whose byte length to return.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             The byte length of the Typed Array object or 0 if the object is not a Typed Array object.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetTypedArrayByteLength(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns the byte offset of a JavaScript Typed Array object.
     * 
     * @param ctx          The execution context to use.
     * @param object       The Typed Array object whose byte offset to return.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             The byte offset of the Typed Array object or 0 if the object is not a Typed Array object.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetTypedArrayByteOffset(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns the JavaScript Array Buffer object that is used as the backing of a JavaScript Typed Array object.
     * 
     * @param ctx          The execution context to use.
     * @param object       The JSObjectRef whose Typed Array type data pointer to obtain.
     * @param exception    A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return             A JSObjectRef with a JSTypedArrayType of kJSTypedArrayTypeArrayBuffer or NULL if object is not a Typed Array.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectGetTypedArrayBuffer(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript Array Buffer object from an existing pointer.
     * 
     * If an exception is thrown during this function the bytesDeallocator will always be called.
     * 
     * @param ctx                The execution context to use.
     * @param bytes              A pointer to the byte buffer to be used as the backing store of the Typed Array object.
     * @param byteLength         The number of bytes pointed to by the parameter bytes.
     * @param bytesDeallocator   The allocator to use to deallocate the external buffer when the Typed Array data object is deallocated.
     * @param deallocatorContext A pointer to pass back to the deallocator.
     * @param exception          A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return                   A JSObjectRef Array Buffer whose backing store is the same as the one pointed to by bytes or NULL if there was an error.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeArrayBufferWithBytesNoCopy(JSContextRef ctx, VoidPtr bytes,
            @NUInt long byteLength,
            @FunctionPtr(name = "call_JSObjectMakeArrayBufferWithBytesNoCopy") Function_JSObjectMakeArrayBufferWithBytesNoCopy bytesDeallocator,
            VoidPtr deallocatorContext, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns a pointer to the data buffer that serves as the backing store for a JavaScript Typed Array object.
     * 
     * The pointer returned by this function is temporary and is not guaranteed to remain valid across JavaScriptCore API calls.
     * 
     * @param object     The Array Buffer object whose internal backing store pointer to return.
     * @param exception  A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return           A pointer to the raw data buffer that serves as object's backing store or NULL if object is not an Array Buffer object.
     */
    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetArrayBufferBytesPtr(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Returns the number of bytes in a JavaScript data object.
     * 
     * @param ctx        The execution context to use.
     * @param object     The JS Arary Buffer object whose length in bytes to return.
     * @param exception  A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return           The number of bytes stored in the data object.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetArrayBufferByteLength(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Creates a JavaScript string from a CFString.
     * 
     * This function is optimized to take advantage of cases when
     *  CFStringGetCharactersPtr returns a valid pointer.
     * 
     * @param string     The CFString to copy into the new JSString.
     * @return           A JSString containing string. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithCFString(CFStringRef string);

    /**
     * [@function]
     * 
     * Creates a CFString from a JavaScript string.
     * 
     * @param alloc      The alloc parameter to pass to CFStringCreate.
     * @param string     The JSString to copy into the new CFString.
     * @return           A CFString containing string. Ownership follows the Create Rule.
     */
    @Generated
    @CFunction
    public static native CFStringRef JSStringCopyCFString(CFAllocatorRef alloc, JSStringRef string);

    /**
     * [@const] kJSClassDefinitionEmpty 
     * 
     * A JSClassDefinition structure of the current version, filled with NULL pointers and having no attributes.
     * 
     * Use this constant as a convenience when creating class definitions. For example, to create a class definition with only a finalize method:
     * 
     * JSClassDefinition definition = kJSClassDefinitionEmpty;
     * definition.finalize = Finalize;
     */
    @Generated
    @CVariable()
    @ByValue
    public static native JSClassDefinition kJSClassDefinitionEmpty();

    /**
     * [@group] Property Descriptor Constants
     * 
     * These keys may assist in creating a property descriptor for use with the
     *  defineProperty method on JSValue.
     *  Property descriptors must fit one of three descriptions:
     * 
     *  Data Descriptor:
     *   - A descriptor containing one or both of the keys <code>value</code> and <code>writable</code>,
     *     and optionally containing one or both of the keys <code>enumerable</code> and
     *     <code>configurable</code>. A data descriptor may not contain either the <code>get</code> or
     *     <code>set</code> key.
     *     A data descriptor may be used to create or modify the attributes of a
     *     data property on an object (replacing any existing accessor property).
     * 
     *  Accessor Descriptor:
     *   - A descriptor containing one or both of the keys <code>get</code> and <code>set</code>, and
     *     optionally containing one or both of the keys <code>enumerable</code> and
     *     <code>configurable</code>. An accessor descriptor may not contain either the <code>value</code>
     *     or <code>writable</code> key.
     *     An accessor descriptor may be used to create or modify the attributes of
     *     an accessor property on an object (replacing any existing data property).
     * 
     *  Generic Descriptor:
     *   - A descriptor containing one or both of the keys <code>enumerable</code> and
     *     <code>configurable</code>. A generic descriptor may not contain any of the keys
     *     <code>value</code>, <code>writable</code>, <code>get</code>, or <code>set</code>.
     *     A generic descriptor may be used to modify the attributes of an existing
     *     data or accessor property, or to create a new data property.
     * [@const] 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorWritableKey();

    /**
     * [@const] 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorEnumerableKey();

    /**
     * [@const] 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorConfigurableKey();

    /**
     * [@const] 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorValueKey();

    /**
     * [@const] 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorGetKey();

    /**
     * [@const] 
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorSetKey();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_JSObjectMakeFunctionWithCallback {
        @Generated
        JSValueRef call_JSObjectMakeFunctionWithCallback(JSContextRef arg0, JSObjectRef arg1, JSObjectRef arg2,
                @NUInt long arg3, @ReferenceInfo(type = JSValueRef.class) ConstPtr<JSValueRef> arg4,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_JSObjectMakeConstructor {
        @Generated
        JSObjectRef call_JSObjectMakeConstructor(JSContextRef arg0, JSObjectRef arg1, @NUInt long arg2,
                @ReferenceInfo(type = JSValueRef.class) ConstPtr<JSValueRef> arg3,
                @ReferenceInfo(type = JSValueRef.class) Ptr<JSValueRef> arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_JSObjectMakeTypedArrayWithBytesNoCopy {
        @Generated
        void call_JSObjectMakeTypedArrayWithBytesNoCopy(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_JSObjectMakeArrayBufferWithBytesNoCopy {
        @Generated
        void call_JSObjectMakeArrayBufferWithBytesNoCopy(VoidPtr arg0, VoidPtr arg1);
    }

    /**
     * [@function]
     * 
     * Tests whether a JavaScript value's type is the symbol type.
     * 
     * @param ctx      The execution context to use.
     * @param value    The JSValue to test.
     * @return         true if value's type is the symbol type, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsSymbol(JSContextRef ctx, JSValueRef value);

    /**
     * [@function]
     * 
     * Creates a JavaScript value of the symbol type.
     * 
     * @param ctx           The execution context to use.
     * @param description   A description of the newly created symbol value.
     * @return              A unique JSValue of the symbol type, whose description matches the one provided.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeSymbol(JSContextRef ctx, JSStringRef description);

    /**
     * [@function]
     * 
     * Creates a JavaScript promise object by invoking the provided executor.
     * 
     * @param ctx The execution context to use.
     * @param resolve A pointer to a JSObjectRef in which to store the resolve function for the new promise. Pass NULL if you do not care to store the resolve callback.
     * @param reject A pointer to a JSObjectRef in which to store the reject function for the new promise. Pass NULL if you do not care to store the reject callback.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return A JSObject that is a promise or NULL if an exception occurred.
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeDeferredPromise(JSContextRef ctx, Ptr<JSObjectRef> resolve,
            Ptr<JSObjectRef> reject, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Tests whether an object has a given property using a JSValueRef as the property key.
     * 
     * This function is the same as performing "propertyKey in object" from JavaScript.
     * 
     * @param object The JSObject to test.
     * @param propertyKey A JSValueRef containing the property key to use when looking up the property.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return true if the object has a property whose name matches propertyKey, otherwise false.
     */
    @Generated
    @CFunction
    public static native boolean JSObjectHasPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey,
            Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Gets a property from an object using a JSValueRef as the property key.
     * 
     * This function is the same as performing "object[propertyKey]" from JavaScript.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to get.
     * @param propertyKey A JSValueRef containing the property key to use when looking up the property.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return The property's value if object has the property key, otherwise the undefined value.
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPropertyForKey(JSContextRef ctx, JSObjectRef object,
            JSValueRef propertyKey, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Sets a property on an object using a JSValueRef as the property key.
     * 
     * This function is the same as performing "object[propertyKey] = value" from JavaScript.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to set.
     * @param propertyKey A JSValueRef containing the property key to use when looking up the property.
     * @param value A JSValueRef to use as the property's value.
     * @param attributes A logically ORed set of JSPropertyAttributes to give to the property.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     */
    @Generated
    @CFunction
    public static native void JSObjectSetPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey,
            JSValueRef value, int attributes, Ptr<JSValueRef> exception);

    /**
     * [@function]
     * 
     * Deletes a property from an object using a JSValueRef as the property key.
     * 
     * This function is the same as performing "delete object[propertyKey]" from JavaScript.
     * 
     * @param ctx The execution context to use.
     * @param object The JSObject whose property you want to delete.
     * @param propertyKey A JSValueRef containing the property key to use when looking up the property.
     * @param exception A pointer to a JSValueRef in which to store an exception, if any. Pass NULL if you do not care to store an exception.
     * @return true if the delete operation succeeds, otherwise false (for example, if the property has the kJSPropertyAttributeDontDelete attribute set).
     */
    @Generated
    @CFunction
    public static native boolean JSObjectDeletePropertyForKey(JSContextRef ctx, JSObjectRef object,
            JSValueRef propertyKey, Ptr<JSValueRef> exception);
}
