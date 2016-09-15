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
     * JSEvaluateScript</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSBase_header_reference/index.html#//apple_ref/c/func/JSEvaluateScript">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSEvaluateScript(JSContextRef ctx, JSStringRef script, JSObjectRef thisObject,
            JSStringRef sourceURL, int startingLineNumber, Ptr<JSValueRef> exception);

    /**
     * JSCheckScriptSyntax</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSBase_header_reference/index.html#//apple_ref/c/func/JSCheckScriptSyntax">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSCheckScriptSyntax(JSContextRef ctx, JSStringRef script, JSStringRef sourceURL,
            int startingLineNumber, Ptr<JSValueRef> exception);

    /**
     * JSGarbageCollect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSBase_header_reference/index.html#//apple_ref/c/func/JSGarbageCollect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSGarbageCollect(JSContextRef ctx);

    /**
     * JSValueGetType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueGetType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int JSValueGetType(JSContextRef ctx, JSValueRef arg2);

    /**
     * JSValueIsUndefined</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsUndefined">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsUndefined(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueIsNull</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsNull">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsNull(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueIsBoolean</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsBoolean">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsBoolean(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueIsNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsNumber(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueIsString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsString(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueIsObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsObject">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsObject(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueIsObjectOfClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsObjectOfClass">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsObjectOfClass(JSContextRef ctx, JSValueRef value, JSClassRef jsClass);

    /**
     * JSValueIsEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsEqual(JSContextRef ctx, JSValueRef a, JSValueRef b,
            Ptr<JSValueRef> exception);

    /**
     * JSValueIsStrictEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsStrictEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsStrictEqual(JSContextRef ctx, JSValueRef a, JSValueRef b);

    /**
     * JSValueIsInstanceOfConstructor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueIsInstanceOfConstructor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueIsInstanceOfConstructor(JSContextRef ctx, JSValueRef value,
            JSObjectRef constructor, Ptr<JSValueRef> exception);

    /**
     * JSValueMakeUndefined</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueMakeUndefined">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeUndefined(JSContextRef ctx);

    /**
     * JSValueMakeNull</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueMakeNull">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeNull(JSContextRef ctx);

    /**
     * JSValueMakeBoolean</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueMakeBoolean">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeBoolean(JSContextRef ctx, boolean boolean_);

    /**
     * JSValueMakeNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueMakeNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeNumber(JSContextRef ctx, double number);

    /**
     * JSValueMakeString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueMakeString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeString(JSContextRef ctx, JSStringRef string);

    /**
     * JSValueMakeFromJSONString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueMakeFromJSONString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeFromJSONString(JSContextRef ctx, JSStringRef string);

    /**
     * JSValueCreateJSONString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueCreateJSONString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSValueCreateJSONString(JSContextRef ctx, JSValueRef value, int indent,
            Ptr<JSValueRef> exception);

    /**
     * JSValueToBoolean</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueToBoolean">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSValueToBoolean(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueToNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueToNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double JSValueToNumber(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * JSValueToStringCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueToStringCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSValueToStringCopy(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * JSValueToObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueToObject">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSValueToObject(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * JSValueProtect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueProtect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSValueProtect(JSContextRef ctx, JSValueRef value);

    /**
     * JSValueUnprotect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValueRef_header_reference/index.html#//apple_ref/c/func/JSValueUnprotect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSValueUnprotect(JSContextRef ctx, JSValueRef value);

    /**
     * JSClassCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSClassCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSClassRef JSClassCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") JSClassDefinition definition);

    /**
     * JSClassRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSClassRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSClassRef JSClassRetain(JSClassRef jsClass);

    /**
     * JSClassRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSClassRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSClassRelease(JSClassRef jsClass);

    /**
     * JSObjectMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMake">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMake(JSContextRef ctx, JSClassRef jsClass, VoidPtr data);

    /**
     * JSObjectMakeFunctionWithCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeFunctionWithCallback">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeFunctionWithCallback(JSContextRef ctx, JSStringRef name,
            @FunctionPtr(name = "call_JSObjectMakeFunctionWithCallback") Function_JSObjectMakeFunctionWithCallback callAsFunction);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_JSObjectMakeFunctionWithCallback {
        @Generated
        VoidPtr call_JSObjectMakeFunctionWithCallback(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2, @NUInt long arg3,
                @ReferenceInfo(type = Void.class, depth = 2) ConstPtr<VoidPtr> arg4,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg5);
    }

    /**
     * JSObjectMakeConstructor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeConstructor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeConstructor(JSContextRef ctx, JSClassRef jsClass,
            @FunctionPtr(name = "call_JSObjectMakeConstructor") Function_JSObjectMakeConstructor callAsConstructor);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_JSObjectMakeConstructor {
        @Generated
        VoidPtr call_JSObjectMakeConstructor(VoidPtr arg0, VoidPtr arg1, @NUInt long arg2,
                @ReferenceInfo(type = Void.class, depth = 2) ConstPtr<VoidPtr> arg3,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg4);
    }

    /**
     * JSObjectMakeArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeArray(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * JSObjectMakeDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeDate(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * JSObjectMakeError</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeError">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeError(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * JSObjectMakeRegExp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeRegExp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeRegExp(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * JSObjectMakeFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectMakeFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeFunction(JSContextRef ctx, JSStringRef name, int parameterCount,
            ConstPtr<JSStringRef> parameterNames, JSStringRef body, JSStringRef sourceURL, int startingLineNumber,
            Ptr<JSValueRef> exception);

    /**
     * JSObjectGetPrototype</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectGetPrototype">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPrototype(JSContextRef ctx, JSObjectRef object);

    /**
     * JSObjectSetPrototype</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectSetPrototype">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSObjectSetPrototype(JSContextRef ctx, JSObjectRef object, JSValueRef value);

    /**
     * JSObjectHasProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectHasProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSObjectHasProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName);

    /**
     * JSObjectGetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectGetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            Ptr<JSValueRef> exception);

    /**
     * JSObjectSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSObjectSetProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            JSValueRef value, int attributes, Ptr<JSValueRef> exception);

    /**
     * JSObjectDeleteProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectDeleteProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSObjectDeleteProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            Ptr<JSValueRef> exception);

    /**
     * JSObjectGetPropertyAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectGetPropertyAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex,
            Ptr<JSValueRef> exception);

    /**
     * JSObjectSetPropertyAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectSetPropertyAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSObjectSetPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex,
            JSValueRef value, Ptr<JSValueRef> exception);

    /**
     * JSObjectGetPrivate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectGetPrivate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetPrivate(JSObjectRef object);

    /**
     * JSObjectSetPrivate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectSetPrivate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSObjectSetPrivate(JSObjectRef object, VoidPtr data);

    /**
     * JSObjectIsFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectIsFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSObjectIsFunction(JSContextRef ctx, JSObjectRef object);

    /**
     * JSObjectCallAsFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectCallAsFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSValueRef JSObjectCallAsFunction(JSContextRef ctx, JSObjectRef object, JSObjectRef thisObject,
            @NUInt long argumentCount, ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * JSObjectIsConstructor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectIsConstructor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSObjectIsConstructor(JSContextRef ctx, JSObjectRef object);

    /**
     * JSObjectCallAsConstructor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectCallAsConstructor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSObjectCallAsConstructor(JSContextRef ctx, JSObjectRef object,
            @NUInt long argumentCount, ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    /**
     * JSObjectCopyPropertyNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSObjectCopyPropertyNames">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSPropertyNameArrayRef JSObjectCopyPropertyNames(JSContextRef ctx, JSObjectRef object);

    /**
     * JSPropertyNameArrayRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSPropertyNameArrayRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSPropertyNameArrayRef JSPropertyNameArrayRetain(JSPropertyNameArrayRef array);

    /**
     * JSPropertyNameArrayRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSPropertyNameArrayRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSPropertyNameArrayRelease(JSPropertyNameArrayRef array);

    /**
     * JSPropertyNameArrayGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSPropertyNameArrayGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSPropertyNameArrayGetCount(JSPropertyNameArrayRef array);

    /**
     * JSPropertyNameArrayGetNameAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSPropertyNameArrayGetNameAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSPropertyNameArrayGetNameAtIndex(JSPropertyNameArrayRef array, @NUInt long index);

    /**
     * JSPropertyNameAccumulatorAddName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSObjectRef_header_reference/index.html#//apple_ref/c/func/JSPropertyNameAccumulatorAddName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSPropertyNameAccumulatorAddName(JSPropertyNameAccumulatorRef accumulator,
            JSStringRef propertyName);

    /**
     * JSContextGroupCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSContextGroupCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGroupCreate();

    /**
     * JSContextGroupRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSContextGroupRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGroupRetain(JSContextGroupRef group);

    /**
     * JSContextGroupRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSContextGroupRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSContextGroupRelease(JSContextGroupRef group);

    /**
     * JSGlobalContextCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSGlobalContextCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextCreate(JSClassRef globalObjectClass);

    /**
     * JSGlobalContextCreateInGroup</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSGlobalContextCreateInGroup">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextCreateInGroup(JSContextGroupRef group,
            JSClassRef globalObjectClass);

    /**
     * JSGlobalContextRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSGlobalContextRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextRetain(JSGlobalContextRef ctx);

    /**
     * JSGlobalContextRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSGlobalContextRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSGlobalContextRelease(JSGlobalContextRef ctx);

    /**
     * JSContextGetGlobalObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSContextGetGlobalObject">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSObjectRef JSContextGetGlobalObject(JSContextRef ctx);

    /**
     * JSContextGetGroup</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSContextRef_header_reference/index.html#//apple_ref/c/func/JSContextGetGroup">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGetGroup(JSContextRef ctx);

    @Generated
    @CFunction
    public static native JSGlobalContextRef JSContextGetGlobalContext(JSContextRef ctx);

    @Generated
    @CFunction
    public static native JSStringRef JSGlobalContextCopyName(JSGlobalContextRef ctx);

    @Generated
    @CFunction
    public static native void JSGlobalContextSetName(JSGlobalContextRef ctx, JSStringRef name);

    /**
     * JSStringCreateWithCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringCreateWithCharacters">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithCharacters(ConstCharPtr chars, @NUInt long numChars);

    /**
     * JSStringCreateWithUTF8CString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringCreateWithUTF8CString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithUTF8CString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string);

    /**
     * JSStringRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringRetain(JSStringRef string);

    /**
     * JSStringRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void JSStringRelease(JSStringRef string);

    /**
     * JSStringGetLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringGetLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetLength(JSStringRef string);

    /**
     * JSStringGetCharactersPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringGetCharactersPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstCharPtr JSStringGetCharactersPtr(JSStringRef string);

    /**
     * JSStringGetMaximumUTF8CStringSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringGetMaximumUTF8CStringSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetMaximumUTF8CStringSize(JSStringRef string);

    /**
     * JSStringGetUTF8CString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringGetUTF8CString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetUTF8CString(JSStringRef string, BytePtr buffer, @NUInt long bufferSize);

    /**
     * JSStringIsEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringIsEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSStringIsEqual(JSStringRef a, JSStringRef b);

    /**
     * JSStringIsEqualToUTF8CString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRef_header_reference/index.html#//apple_ref/c/func/JSStringIsEqualToUTF8CString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean JSStringIsEqualToUTF8CString(JSStringRef a,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String b);

    /**
     * JSStringCreateWithCFString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRefCF_header_reference/index.html#//apple_ref/c/func/JSStringCreateWithCFString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithCFString(CFStringRef string);

    /**
     * JSStringCopyCFString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSStringRefCF_header_reference/index.html#//apple_ref/c/func/JSStringCopyCFString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef JSStringCopyCFString(CFAllocatorRef alloc, JSStringRef string);

    @Generated
    @CVariable()
    @ByValue
    public static native JSClassDefinition kJSClassDefinitionEmpty();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorWritableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorEnumerableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorConfigurableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorValueKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorGetKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String JSPropertyDescriptorSetKey();

    @Generated
    @CFunction
    public static native boolean JSValueIsArray(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsDate(JSContextRef ctx, JSValueRef value);
}
