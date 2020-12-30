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
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.javascriptcore.opaque.JSGlobalContextRef;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @interface
 * @discussion A JSContext is a JavaScript execution environment. All
 *  JavaScript execution takes place within a context, and all JavaScript values
 *  are tied to a context.
 */
@Generated
@Library("JavaScriptCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class JSContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected JSContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native JSContext alloc();

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

    /**
     * @method
     * @abstract Create a JSContext, wrapping its C API counterpart.
     * @result The JSContext equivalent of the provided JSGlobalContextRef.
     */
    @Generated
    @Selector("contextWithJSGlobalContextRef:")
    public static native JSContext contextWithJSGlobalContextRef(JSGlobalContextRef jsGlobalContextRef);

    /**
     * @method
     * @abstract Get the arguments to the current callback.
     * @discussion This method may be called from within an Objective-C block or method invoked
     *  as a callback from JavaScript to retrieve the callback's arguments, objects
     *  in the returned array are instances of JSValue. Outside of a callback from
     *  JavaScript this method will return nil.
     * @result An NSArray of the arguments nil if there is no current callback.
     */
    @Generated
    @Selector("currentArguments")
    public static native NSArray<?> currentArguments();

    /**
     * @method
     * @abstract Get the JavaScript function that is currently executing.
     * @discussion This method may be called from within an Objective-C block or method invoked
     *  as a callback from JavaScript to retrieve the callback's context. Outside of
     *  a callback from JavaScript this method will return nil.
     * @result The currently executing JavaScript function or nil if there isn't one.
     */
    @Generated
    @Selector("currentCallee")
    public static native JSValue currentCallee();

    /**
     * @methodgroup Callback Accessors
     * @method
     * @abstract Get the JSContext that is currently executing.
     * @discussion This method may be called from within an Objective-C block or method invoked
     *  as a callback from JavaScript to retrieve the callback's context. Outside of
     *  a callback from JavaScript this method will return nil.
     * @result The currently executing JSContext or nil if there isn't one.
     */
    @Generated
    @Selector("currentContext")
    public static native JSContext currentContext();

    /**
     * @method
     * @abstract Get the <code>this</code> value of the currently executing method.
     * @discussion This method may be called from within an Objective-C block or method invoked
     *  as a callback from JavaScript to retrieve the callback's this value. Outside
     *  of a callback from JavaScript this method will return nil.
     * @result The current <code>this</code> value or nil if there isn't one.
     */
    @Generated
    @Selector("currentThis")
    public static native JSValue currentThis();

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

    /**
     * @property
     * @abstract Get the C API counterpart wrapped by a JSContext.
     * @result The C API equivalent of this JSContext.
     */
    @Generated
    @Selector("JSGlobalContextRef")
    public native JSGlobalContextRef JSGlobalContextRef();

    /**
     * @methodgroup Evaluating Scripts
     * @method
     * @abstract Evaluate a string of JavaScript code.
     * @param script A string containing the JavaScript code to evaluate.
     * @result The last value generated by the script.
     */
    @Generated
    @Selector("evaluateScript:")
    public native JSValue evaluateScript(String script);

    /**
     * @method
     * @abstract Evaluate a string of JavaScript code, with a URL for the script's source file.
     * @param script A string containing the JavaScript code to evaluate.
     * @param sourceURL A URL for the script's source file. Used by debuggers and when reporting exceptions. This parameter is informative only: it does not change the behavior of the script.
     * @result The last value generated by the script.
     */
    @Generated
    @Selector("evaluateScript:withSourceURL:")
    public native JSValue evaluateScriptWithSourceURL(String script, NSURL sourceURL);

    /**
     * @property
     * @discussion The <code>exception</code> property may be used to throw an exception to JavaScript.
     * 
     *  Before a callback is made from JavaScript to an Objective-C block or method,
     *  the prior value of the exception property will be preserved and the property
     *  will be set to nil. After the callback has completed the new value of the
     *  exception property will be read, and prior value restored. If the new value
     *  of exception is not nil, the callback will result in that value being thrown.
     * 
     *  This property may also be used to check for uncaught exceptions arising from
     *  API function calls (since the default behaviour of <code>exceptionHandler</code> is to
     *  assign an uncaught exception to this property).
     */
    @Generated
    @Selector("exception")
    public native JSValue exception();

    /**
     * @property
     * @discussion If a call to an API function results in an uncaught JavaScript exception, the
     *  <code>exceptionHandler</code> block will be invoked. The default implementation for the
     *  exception handler will store the exception to the exception property on
     *  context. As a consequence the default behaviour is for uncaught exceptions
     *  occurring within a callback from JavaScript to be rethrown upon return.
     *  Setting this value to nil will cause all exceptions occurring
     *  within a callback from JavaScript to be silently caught.
     */
    @Generated
    @Selector("exceptionHandler")
    @ObjCBlock(name = "call_exceptionHandler_ret")
    public native Block_exceptionHandler_ret exceptionHandler();

    /**
     * @property
     * @abstract Get the global object of the context.
     * @discussion This method retrieves the global object of the JavaScript execution context.
     *  Instances of JSContext originating from WebKit will return a reference to the
     *  WindowProxy object.
     * @result The global object.
     */
    @Generated
    @Selector("globalObject")
    public native JSValue globalObject();

    /**
     * @methodgroup Creating New JSContexts
     * @method
     * @abstract Create a JSContext.
     * @result The new context.
     */
    @Generated
    @Selector("init")
    public native JSContext init();

    /**
     * @method
     * @abstract Create a JSContext in the specified virtual machine.
     * @param virtualMachine The JSVirtualMachine in which the context will be created.
     * @result The new context.
     */
    @Generated
    @Selector("initWithVirtualMachine:")
    public native JSContext initWithVirtualMachine(JSVirtualMachine virtualMachine);

    /**
     * @property
     * @discussion Name of the JSContext. Exposed when remote debugging the context.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @method
     * @abstract Get a particular property on the global object.
     * @result The JSValue for the global object's property.
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native JSValue objectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object key);

    /**
     * @property
     * @discussion The <code>exception</code> property may be used to throw an exception to JavaScript.
     * 
     *  Before a callback is made from JavaScript to an Objective-C block or method,
     *  the prior value of the exception property will be preserved and the property
     *  will be set to nil. After the callback has completed the new value of the
     *  exception property will be read, and prior value restored. If the new value
     *  of exception is not nil, the callback will result in that value being thrown.
     * 
     *  This property may also be used to check for uncaught exceptions arising from
     *  API function calls (since the default behaviour of <code>exceptionHandler</code> is to
     *  assign an uncaught exception to this property).
     */
    @Generated
    @Selector("setException:")
    public native void setException(JSValue value);

    /**
     * @property
     * @discussion If a call to an API function results in an uncaught JavaScript exception, the
     *  <code>exceptionHandler</code> block will be invoked. The default implementation for the
     *  exception handler will store the exception to the exception property on
     *  context. As a consequence the default behaviour is for uncaught exceptions
     *  occurring within a callback from JavaScript to be rethrown upon return.
     *  Setting this value to nil will cause all exceptions occurring
     *  within a callback from JavaScript to be silently caught.
     */
    @Generated
    @Selector("setExceptionHandler:")
    public native void setExceptionHandler(
            @ObjCBlock(name = "call_setExceptionHandler") Block_setExceptionHandler value);

    /**
     * @property
     * @discussion Name of the JSContext. Exposed when remote debugging the context.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * @method
     * @abstract Set a particular property on the global object.
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object object, NSObject key);

    /**
     * @property
     * @discussion All instances of JSContext are associated with a JSVirtualMachine.
     */
    @Generated
    @Selector("virtualMachine")
    public native JSVirtualMachine virtualMachine();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exceptionHandler_ret {
        @Generated
        void call_exceptionHandler_ret(JSContext arg0, JSValue arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExceptionHandler {
        @Generated
        void call_setExceptionHandler(JSContext arg0, JSValue arg1);
    }
}
