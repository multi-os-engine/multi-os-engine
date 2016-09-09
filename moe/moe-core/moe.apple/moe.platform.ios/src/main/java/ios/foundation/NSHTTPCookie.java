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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHTTPCookie extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHTTPCookie(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHTTPCookie alloc();

	/**
	 * comment</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/comment">iOS Dev Center</a>
	 */
	@Generated
	@Selector("comment")
	public native String comment();

	/**
	 * commentURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/commentURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("commentURL")
	public native NSURL commentURL();

	/**
	 * cookieWithProperties:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/clm/NSHTTPCookie/cookieWithProperties:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cookieWithProperties:")
	public static native NSHTTPCookie cookieWithProperties(
			NSDictionary<String, ?> properties);

	/**
	 * cookiesWithResponseHeaderFields:forURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/clm/NSHTTPCookie/cookiesWithResponseHeaderFields:forURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cookiesWithResponseHeaderFields:forURL:")
	public static native NSArray<? extends NSHTTPCookie> cookiesWithResponseHeaderFieldsForURL(
			NSDictionary<String, String> headerFields, NSURL URL);

	/**
	 * domain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/domain">iOS Dev Center</a>
	 */
	@Generated
	@Selector("domain")
	public native String domain();

	/**
	 * expiresDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/expiresDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("expiresDate")
	public native NSDate expiresDate();

	@Generated
	@Selector("init")
	public native NSHTTPCookie init();

	/**
	 * initWithProperties:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instm/NSHTTPCookie/initWithProperties:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithProperties:")
	public native NSHTTPCookie initWithProperties(NSDictionary<String, ?> properties);

	/**
	 * HTTPOnly</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/HTTPOnly">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHTTPOnly")
	public native boolean isHTTPOnly();

	/**
	 * secure</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/secure">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSecure")
	public native boolean isSecure();

	/**
	 * sessionOnly</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/sessionOnly">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSessionOnly")
	public native boolean isSessionOnly();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * path</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/path">iOS Dev Center</a>
	 */
	@Generated
	@Selector("path")
	public native String path();

	/**
	 * portList</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/portList">iOS Dev Center</a>
	 */
	@Generated
	@Selector("portList")
	public native NSArray<? extends NSNumber> portList();

	/**
	 * properties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/properties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("properties")
	public native NSDictionary<String, ?> properties();

	/**
	 * requestHeaderFieldsWithCookies:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/clm/NSHTTPCookie/requestHeaderFieldsWithCookies:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestHeaderFieldsWithCookies:")
	public static native NSDictionary<String, String> requestHeaderFieldsWithCookies(
			NSArray<? extends NSHTTPCookie> cookies);

	/**
	 * value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("value")
	public native String value();

	/**
	 * version</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookie_Class/index.html#//apple_ref/occ/instp/NSHTTPCookie/version">iOS Dev Center</a>
	 */
	@Generated
	@Selector("version")
	@NUInt
	public native long version();

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();
}
