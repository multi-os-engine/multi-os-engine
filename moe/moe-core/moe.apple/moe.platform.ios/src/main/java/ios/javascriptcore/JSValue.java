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

package ios.javascriptcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
import ios.foundation.NSNumber;
import ios.foundation.struct.NSRange;
import ios.javascriptcore.opaque.JSValueRef;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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

	/**
	 * JSValueRef</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/JSValueRef">iOS Dev Center</a>
	 */
	@Generated
	@Selector("JSValueRef")
	public native JSValueRef JSValueRef();

	@Generated
	@Owned
	@Selector("alloc")
	public static native JSValue alloc();

	/**
	 * callWithArguments:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/callWithArguments:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("callWithArguments:")
	public native JSValue callWithArguments(NSArray<?> arguments);

	/**
	 * constructWithArguments:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/constructWithArguments:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("constructWithArguments:")
	public native JSValue constructWithArguments(NSArray<?> arguments);

	/**
	 * context</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/context">iOS Dev Center</a>
	 */
	@Generated
	@Selector("context")
	public native JSContext context();

	/**
	 * defineProperty:descriptor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/defineProperty:descriptor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defineProperty:descriptor:")
	public native void definePropertyDescriptor(String property,
			@Mapped(ObjCObjectMapper.class) Object descriptor);

	/**
	 * deleteProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/deleteProperty:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteProperty:")
	public native boolean deleteProperty(String property);

	/**
	 * hasProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/hasProperty:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasProperty:")
	public native boolean hasProperty(String property);

	@Generated
	@Selector("init")
	public native JSValue init();

	/**
	 * invokeMethod:withArguments:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/invokeMethod:withArguments:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("invokeMethod:withArguments:")
	public native JSValue invokeMethodWithArguments(String method,
			NSArray<?> arguments);

	/**
	 * isBoolean</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isBoolean">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isBoolean")
	public native boolean isBoolean();

	/**
	 * isEqualToObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/isEqualToObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEqualToObject:")
	public native boolean isEqualToObject(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * isEqualWithTypeCoercionToObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/isEqualWithTypeCoercionToObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEqualWithTypeCoercionToObject:")
	public native boolean isEqualWithTypeCoercionToObject(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * isInstanceOf:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/isInstanceOf:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isInstanceOf:")
	public native boolean isInstanceOf(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * isNull</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isNull">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isNull")
	public native boolean isNull();

	/**
	 * isNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isNumber")
	public native boolean isNumber();

	/**
	 * isObject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isObject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isObject")
	public native boolean isObject();

	/**
	 * isString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isString">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isString")
	public native boolean isString();

	/**
	 * isUndefined</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isUndefined">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isUndefined")
	public native boolean isUndefined();

	/**
	 * objectAtIndexedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/objectAtIndexedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectAtIndexedSubscript:")
	public native JSValue objectAtIndexedSubscript(@NUInt long index);

	/**
	 * objectForKeyedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/objectForKeyedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectForKeyedSubscript:")
	public native JSValue objectForKeyedSubscript(
			@Mapped(ObjCObjectMapper.class) Object key);

	/**
	 * setObject:atIndexedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/setObject:atIndexedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObject:atIndexedSubscript:")
	public native void setObjectAtIndexedSubscript(
			@Mapped(ObjCObjectMapper.class) Object object, @NUInt long index);

	/**
	 * setObject:forKeyedSubscript:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/setObject:forKeyedSubscript:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObject:forKeyedSubscript:")
	public native void setObjectForKeyedSubscript(
			@Mapped(ObjCObjectMapper.class) Object object,
			NSObject key);

	/**
	 * setValue:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/setValue:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:atIndex:")
	public native void setValueAtIndex(
			@Mapped(ObjCObjectMapper.class) Object value, @NUInt long index);

	/**
	 * setValue:forProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/setValue:forProperty:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:forProperty:")
	public native void setValueForProperty(
			@Mapped(ObjCObjectMapper.class) Object value, String property);

	/**
	 * toArray</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toArray">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toArray")
	public native NSArray<?> toArray();

	/**
	 * toBool</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toBool">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toBool")
	public native boolean toBool();

	/**
	 * toDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toDate")
	public native NSDate toDate();

	/**
	 * toDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toDictionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toDictionary")
	public native NSDictionary<?, ?> toDictionary();

	/**
	 * toDouble</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toDouble">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toDouble")
	public native double toDouble();

	/**
	 * toInt32</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toInt32">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toInt32")
	public native int toInt32();

	/**
	 * toNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toNumber")
	public native NSNumber toNumber();

	/**
	 * toObject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toObject">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object toObject();

	/**
	 * toObjectOfClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toObjectOfClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toObjectOfClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object toObjectOfClass(Class expectedClass);

	/**
	 * toPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toPoint")
	@ByValue
	public native CGPoint toPoint();

	/**
	 * toRange</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toRange">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toRange")
	@ByValue
	public native NSRange toRange();

	/**
	 * toRect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toRect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toRect")
	@ByValue
	public native CGRect toRect();

	/**
	 * toSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toSize")
	@ByValue
	public native CGSize toSize();

	/**
	 * toString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toString">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toString")
	public native String toString();

	/**
	 * toUInt32</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/toUInt32">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toUInt32")
	public native int toUInt32();

	/**
	 * valueAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/valueAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueAtIndex:")
	public native JSValue valueAtIndex(@NUInt long index);

	/**
	 * valueForProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instm/JSValue/valueForProperty:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForProperty:")
	public native JSValue valueForProperty(String property);

	/**
	 * valueWithBool:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithBool:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithBool:inContext:")
	public static native JSValue valueWithBoolInContext(boolean value,
			JSContext context);

	/**
	 * valueWithDouble:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithDouble:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithDouble:inContext:")
	public static native JSValue valueWithDoubleInContext(double value,
			JSContext context);

	/**
	 * valueWithInt32:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithInt32:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithInt32:inContext:")
	public static native JSValue valueWithInt32InContext(int value,
			JSContext context);

	/**
	 * valueWithJSValueRef:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithJSValueRef:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithJSValueRef:inContext:")
	public static native JSValue valueWithJSValueRefInContext(JSValueRef value,
			JSContext context);

	/**
	 * valueWithNewArrayInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithNewArrayInContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithNewArrayInContext:")
	public static native JSValue valueWithNewArrayInContext(JSContext context);

	/**
	 * valueWithNewErrorFromMessage:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithNewErrorFromMessage:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithNewErrorFromMessage:inContext:")
	public static native JSValue valueWithNewErrorFromMessageInContext(
			String message, JSContext context);

	/**
	 * valueWithNewObjectInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithNewObjectInContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithNewObjectInContext:")
	public static native JSValue valueWithNewObjectInContext(JSContext context);

	/**
	 * valueWithNewRegularExpressionFromPattern:flags:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithNewRegularExpressionFromPattern:flags:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithNewRegularExpressionFromPattern:flags:inContext:")
	public static native JSValue valueWithNewRegularExpressionFromPatternFlagsInContext(
			String pattern, String flags, JSContext context);

	/**
	 * valueWithNullInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithNullInContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithNullInContext:")
	public static native JSValue valueWithNullInContext(JSContext context);

	/**
	 * valueWithObject:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithObject:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithObject:inContext:")
	public static native JSValue valueWithObjectInContext(
			@Mapped(ObjCObjectMapper.class) Object value, JSContext context);

	/**
	 * valueWithPoint:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithPoint:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithPoint:inContext:")
	public static native JSValue valueWithPointInContext(
			@ByValue CGPoint point, JSContext context);

	/**
	 * valueWithRange:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithRange:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithRange:inContext:")
	public static native JSValue valueWithRangeInContext(
			@ByValue NSRange range, JSContext context);

	/**
	 * valueWithRect:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithRect:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithRect:inContext:")
	public static native JSValue valueWithRectInContext(@ByValue CGRect rect,
			JSContext context);

	/**
	 * valueWithSize:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithSize:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithSize:inContext:")
	public static native JSValue valueWithSizeInContext(@ByValue CGSize size,
			JSContext context);

	/**
	 * valueWithUInt32:inContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithUInt32:inContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithUInt32:inContext:")
	public static native JSValue valueWithUInt32InContext(int value,
			JSContext context);

	/**
	 * valueWithUndefinedInContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/clm/JSValue/valueWithUndefinedInContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueWithUndefinedInContext:")
	public static native JSValue valueWithUndefinedInContext(JSContext context);

	/**
	 * isArray</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isArray">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isArray")
	public native boolean isArray();

	/**
	 * isDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/JavaScriptCore/Reference/JSValue_Ref/index.html#//apple_ref/occ/instp/JSValue/isDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDate")
	public native boolean isDate();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
