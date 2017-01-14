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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("valueWithBool:inContext:")
    public static native JSValue valueWithBoolInContext(boolean value, JSContext context);

    @Generated
    @Selector("valueWithDouble:inContext:")
    public static native JSValue valueWithDoubleInContext(double value, JSContext context);

    @Generated
    @Selector("valueWithInt32:inContext:")
    public static native JSValue valueWithInt32InContext(int value, JSContext context);

    @Generated
    @Selector("valueWithJSValueRef:inContext:")
    public static native JSValue valueWithJSValueRefInContext(JSValueRef value, JSContext context);

    @Generated
    @Selector("valueWithNewArrayInContext:")
    public static native JSValue valueWithNewArrayInContext(JSContext context);

    @Generated
    @Selector("valueWithNewErrorFromMessage:inContext:")
    public static native JSValue valueWithNewErrorFromMessageInContext(String message, JSContext context);

    @Generated
    @Selector("valueWithNewObjectInContext:")
    public static native JSValue valueWithNewObjectInContext(JSContext context);

    @Generated
    @Selector("valueWithNewRegularExpressionFromPattern:flags:inContext:")
    public static native JSValue valueWithNewRegularExpressionFromPatternFlagsInContext(String pattern, String flags,
            JSContext context);

    @Generated
    @Selector("valueWithNullInContext:")
    public static native JSValue valueWithNullInContext(JSContext context);

    @Generated
    @Selector("valueWithObject:inContext:")
    public static native JSValue valueWithObjectInContext(@Mapped(ObjCObjectMapper.class) Object value,
            JSContext context);

    @Generated
    @Selector("valueWithPoint:inContext:")
    public static native JSValue valueWithPointInContext(@ByValue CGPoint point, JSContext context);

    @Generated
    @Selector("valueWithRange:inContext:")
    public static native JSValue valueWithRangeInContext(@ByValue NSRange range, JSContext context);

    @Generated
    @Selector("valueWithRect:inContext:")
    public static native JSValue valueWithRectInContext(@ByValue CGRect rect, JSContext context);

    @Generated
    @Selector("valueWithSize:inContext:")
    public static native JSValue valueWithSizeInContext(@ByValue CGSize size, JSContext context);

    @Generated
    @Selector("valueWithUInt32:inContext:")
    public static native JSValue valueWithUInt32InContext(int value, JSContext context);

    @Generated
    @Selector("valueWithUndefinedInContext:")
    public static native JSValue valueWithUndefinedInContext(JSContext context);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("JSValueRef")
    public native JSValueRef JSValueRef();

    @Generated
    @Selector("callWithArguments:")
    public native JSValue callWithArguments(NSArray<?> arguments);

    @Generated
    @Selector("constructWithArguments:")
    public native JSValue constructWithArguments(NSArray<?> arguments);

    @Generated
    @Selector("context")
    public native JSContext context();

    @Generated
    @Selector("defineProperty:descriptor:")
    public native void definePropertyDescriptor(String property, @Mapped(ObjCObjectMapper.class) Object descriptor);

    @Generated
    @Selector("deleteProperty:")
    public native boolean deleteProperty(String property);

    @Generated
    @Selector("hasProperty:")
    public native boolean hasProperty(String property);

    @Generated
    @Selector("init")
    public native JSValue init();

    @Generated
    @Selector("invokeMethod:withArguments:")
    public native JSValue invokeMethodWithArguments(String method, NSArray<?> arguments);

    @Generated
    @Selector("isArray")
    public native boolean isArray();

    @Generated
    @Selector("isBoolean")
    public native boolean isBoolean();

    @Generated
    @Selector("isDate")
    public native boolean isDate();

    @Generated
    @Selector("isEqualToObject:")
    public native boolean isEqualToObject(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("isEqualWithTypeCoercionToObject:")
    public native boolean isEqualWithTypeCoercionToObject(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("isInstanceOf:")
    public native boolean isInstanceOf(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("isNull")
    public native boolean isNull();

    @Generated
    @Selector("isNumber")
    public native boolean isNumber();

    @Generated
    @Selector("isObject")
    public native boolean isObject();

    @Generated
    @Selector("isString")
    public native boolean isString();

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
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) Object object, NSObject key);

    @Generated
    @Selector("setValue:atIndex:")
    public native void setValueAtIndex(@Mapped(ObjCObjectMapper.class) Object value, @NUInt long index);

    @Generated
    @Selector("setValue:forProperty:")
    public native void setValueForProperty(@Mapped(ObjCObjectMapper.class) Object value, String property);

    @Generated
    @Selector("toArray")
    public native NSArray<?> toArray();

    @Generated
    @Selector("toBool")
    public native boolean toBool();

    @Generated
    @Selector("toDate")
    public native NSDate toDate();

    @Generated
    @Selector("toDictionary")
    public native NSDictionary<?, ?> toDictionary();

    @Generated
    @Selector("toDouble")
    public native double toDouble();

    @Generated
    @Selector("toInt32")
    public native int toInt32();

    @Generated
    @Selector("toNumber")
    public native NSNumber toNumber();

    @Generated
    @Selector("toObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object toObject();

    @Generated
    @Selector("toObjectOfClass:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object toObjectOfClass(Class expectedClass);

    @Generated
    @Selector("toPoint")
    @ByValue
    public native CGPoint toPoint();

    @Generated
    @Selector("toRange")
    @ByValue
    public native NSRange toRange();

    @Generated
    @Selector("toRect")
    @ByValue
    public native CGRect toRect();

    @Generated
    @Selector("toSize")
    @ByValue
    public native CGSize toSize();

    @Generated
    @Selector("toString")
    public native String toString();

    @Generated
    @Selector("toUInt32")
    public native int toUInt32();

    @Generated
    @Selector("valueAtIndex:")
    public native JSValue valueAtIndex(@NUInt long index);

    @Generated
    @Selector("valueForProperty:")
    public native JSValue valueForProperty(String property);
}
