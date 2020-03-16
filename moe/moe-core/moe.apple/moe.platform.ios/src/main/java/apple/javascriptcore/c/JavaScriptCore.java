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

    @Generated
    @CFunction
    public static native JSValueRef JSEvaluateScript(JSContextRef ctx, JSStringRef script, JSObjectRef thisObject,
            JSStringRef sourceURL, int startingLineNumber, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSCheckScriptSyntax(JSContextRef ctx, JSStringRef script, JSStringRef sourceURL,
            int startingLineNumber, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native void JSGarbageCollect(JSContextRef ctx);

    @Generated
    @CFunction
    public static native int JSValueGetType(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsUndefined(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsNull(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsBoolean(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsNumber(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsString(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsObject(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsObjectOfClass(JSContextRef ctx, JSValueRef value, JSClassRef jsClass);

    @Generated
    @CFunction
    public static native boolean JSValueIsArray(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSValueIsDate(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native int JSValueGetTypedArrayType(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSValueIsEqual(JSContextRef ctx, JSValueRef a, JSValueRef b,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSValueIsStrictEqual(JSContextRef ctx, JSValueRef a, JSValueRef b);

    @Generated
    @CFunction
    public static native boolean JSValueIsInstanceOfConstructor(JSContextRef ctx, JSValueRef value,
            JSObjectRef constructor, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeUndefined(JSContextRef ctx);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeNull(JSContextRef ctx);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeBoolean(JSContextRef ctx, boolean boolean_);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeNumber(JSContextRef ctx, double number);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeString(JSContextRef ctx, JSStringRef string);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeFromJSONString(JSContextRef ctx, JSStringRef string);

    @Generated
    @CFunction
    public static native JSStringRef JSValueCreateJSONString(JSContextRef ctx, JSValueRef value, int indent,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSValueToBoolean(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native double JSValueToNumber(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSStringRef JSValueToStringCopy(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSValueToObject(JSContextRef ctx, JSValueRef value, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native void JSValueProtect(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native void JSValueUnprotect(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native JSClassRef JSClassCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") JSClassDefinition definition);

    @Generated
    @CFunction
    public static native JSClassRef JSClassRetain(JSClassRef jsClass);

    @Generated
    @CFunction
    public static native void JSClassRelease(JSClassRef jsClass);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMake(JSContextRef ctx, JSClassRef jsClass, VoidPtr data);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeFunctionWithCallback(JSContextRef ctx, JSStringRef name,
            @FunctionPtr(name = "call_JSObjectMakeFunctionWithCallback") Function_JSObjectMakeFunctionWithCallback callAsFunction);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeConstructor(JSContextRef ctx, JSClassRef jsClass,
            @FunctionPtr(name = "call_JSObjectMakeConstructor") Function_JSObjectMakeConstructor callAsConstructor);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeArray(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeDate(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeError(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeRegExp(JSContextRef ctx, @NUInt long argumentCount,
            ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeFunction(JSContextRef ctx, JSStringRef name, int parameterCount,
            ConstPtr<JSStringRef> parameterNames, JSStringRef body, JSStringRef sourceURL, int startingLineNumber,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPrototype(JSContextRef ctx, JSObjectRef object);

    @Generated
    @CFunction
    public static native void JSObjectSetPrototype(JSContextRef ctx, JSObjectRef object, JSValueRef value);

    @Generated
    @CFunction
    public static native boolean JSObjectHasProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName);

    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native void JSObjectSetProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            JSValueRef value, int attributes, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSObjectDeleteProperty(JSContextRef ctx, JSObjectRef object, JSStringRef propertyName,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native void JSObjectSetPropertyAtIndex(JSContextRef ctx, JSObjectRef object, int propertyIndex,
            JSValueRef value, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetPrivate(JSObjectRef object);

    @Generated
    @CFunction
    public static native boolean JSObjectSetPrivate(JSObjectRef object, VoidPtr data);

    @Generated
    @CFunction
    public static native boolean JSObjectIsFunction(JSContextRef ctx, JSObjectRef object);

    @Generated
    @CFunction
    public static native JSValueRef JSObjectCallAsFunction(JSContextRef ctx, JSObjectRef object, JSObjectRef thisObject,
            @NUInt long argumentCount, ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSObjectIsConstructor(JSContextRef ctx, JSObjectRef object);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectCallAsConstructor(JSContextRef ctx, JSObjectRef object,
            @NUInt long argumentCount, ConstPtr<JSValueRef> arguments, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSPropertyNameArrayRef JSObjectCopyPropertyNames(JSContextRef ctx, JSObjectRef object);

    @Generated
    @CFunction
    public static native JSPropertyNameArrayRef JSPropertyNameArrayRetain(JSPropertyNameArrayRef array);

    @Generated
    @CFunction
    public static native void JSPropertyNameArrayRelease(JSPropertyNameArrayRef array);

    @Generated
    @CFunction
    @NUInt
    public static native long JSPropertyNameArrayGetCount(JSPropertyNameArrayRef array);

    @Generated
    @CFunction
    public static native JSStringRef JSPropertyNameArrayGetNameAtIndex(JSPropertyNameArrayRef array, @NUInt long index);

    @Generated
    @CFunction
    public static native void JSPropertyNameAccumulatorAddName(JSPropertyNameAccumulatorRef accumulator,
            JSStringRef propertyName);

    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGroupCreate();

    @Generated
    @CFunction
    public static native JSContextGroupRef JSContextGroupRetain(JSContextGroupRef group);

    @Generated
    @CFunction
    public static native void JSContextGroupRelease(JSContextGroupRef group);

    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextCreate(JSClassRef globalObjectClass);

    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextCreateInGroup(JSContextGroupRef group,
            JSClassRef globalObjectClass);

    @Generated
    @CFunction
    public static native JSGlobalContextRef JSGlobalContextRetain(JSGlobalContextRef ctx);

    @Generated
    @CFunction
    public static native void JSGlobalContextRelease(JSGlobalContextRef ctx);

    @Generated
    @CFunction
    public static native JSObjectRef JSContextGetGlobalObject(JSContextRef ctx);

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

    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithCharacters(ConstCharPtr chars, @NUInt long numChars);

    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithUTF8CString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string);

    @Generated
    @CFunction
    public static native JSStringRef JSStringRetain(JSStringRef string);

    @Generated
    @CFunction
    public static native void JSStringRelease(JSStringRef string);

    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetLength(JSStringRef string);

    @Generated
    @CFunction
    public static native ConstCharPtr JSStringGetCharactersPtr(JSStringRef string);

    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetMaximumUTF8CStringSize(JSStringRef string);

    @Generated
    @CFunction
    @NUInt
    public static native long JSStringGetUTF8CString(JSStringRef string, BytePtr buffer, @NUInt long bufferSize);

    @Generated
    @CFunction
    public static native boolean JSStringIsEqual(JSStringRef a, JSStringRef b);

    @Generated
    @CFunction
    public static native boolean JSStringIsEqualToUTF8CString(JSStringRef a,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String b);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArray(JSContextRef ctx, int arrayType, @NUInt long length,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArrayWithBytesNoCopy(JSContextRef ctx, int arrayType,
            VoidPtr bytes, @NUInt long byteLength,
            @FunctionPtr(name = "call_JSObjectMakeTypedArrayWithBytesNoCopy") Function_JSObjectMakeTypedArrayWithBytesNoCopy bytesDeallocator,
            VoidPtr deallocatorContext, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArrayWithArrayBuffer(JSContextRef ctx, int arrayType,
            JSObjectRef buffer, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeTypedArrayWithArrayBufferAndOffset(JSContextRef ctx, int arrayType,
            JSObjectRef buffer, @NUInt long byteOffset, @NUInt long length, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetTypedArrayBytesPtr(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetTypedArrayLength(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetTypedArrayByteLength(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetTypedArrayByteOffset(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectGetTypedArrayBuffer(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeArrayBufferWithBytesNoCopy(JSContextRef ctx, VoidPtr bytes,
            @NUInt long byteLength,
            @FunctionPtr(name = "call_JSObjectMakeArrayBufferWithBytesNoCopy") Function_JSObjectMakeArrayBufferWithBytesNoCopy bytesDeallocator,
            VoidPtr deallocatorContext, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native VoidPtr JSObjectGetArrayBufferBytesPtr(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    @NUInt
    public static native long JSObjectGetArrayBufferByteLength(JSContextRef ctx, JSObjectRef object,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSStringRef JSStringCreateWithCFString(CFStringRef string);

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

    @Generated
    @CFunction
    public static native boolean JSValueIsSymbol(JSContextRef ctx, JSValueRef value);

    @Generated
    @CFunction
    public static native JSValueRef JSValueMakeSymbol(JSContextRef ctx, JSStringRef description);

    @Generated
    @CFunction
    public static native JSObjectRef JSObjectMakeDeferredPromise(JSContextRef ctx, Ptr<JSObjectRef> resolve,
            Ptr<JSObjectRef> reject, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSObjectHasPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey,
            Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native JSValueRef JSObjectGetPropertyForKey(JSContextRef ctx, JSObjectRef object,
            JSValueRef propertyKey, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native void JSObjectSetPropertyForKey(JSContextRef ctx, JSObjectRef object, JSValueRef propertyKey,
            JSValueRef value, int attributes, Ptr<JSValueRef> exception);

    @Generated
    @CFunction
    public static native boolean JSObjectDeletePropertyForKey(JSContextRef ctx, JSObjectRef object,
            JSValueRef propertyKey, Ptr<JSValueRef> exception);
}
