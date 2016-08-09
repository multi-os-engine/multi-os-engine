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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSMutableCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLRequest extends NSObject implements NSSecureCoding,
		NSCopying, NSMutableCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLRequest(Pointer peer) {
		super(peer);
	}

	/**
	 * HTTPBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/HTTPBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPBody")
	public native NSData HTTPBody();

	/**
	 * HTTPBodyStream</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/HTTPBodyStream">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPBodyStream")
	public native NSInputStream HTTPBodyStream();

	/**
	 * HTTPMethod</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/HTTPMethod">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPMethod")
	public native String HTTPMethod();

	/**
	 * HTTPShouldHandleCookies</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/HTTPShouldHandleCookies">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPShouldHandleCookies")
	public native boolean HTTPShouldHandleCookies();

	/**
	 * HTTPShouldUsePipelining</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/HTTPShouldUsePipelining">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPShouldUsePipelining")
	public native boolean HTTPShouldUsePipelining();

	/**
	 * URL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/URL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URL")
	public native NSURL URL();

	/**
	 * allHTTPHeaderFields</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/allHTTPHeaderFields">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allHTTPHeaderFields")
	public native NSDictionary<String, String> allHTTPHeaderFields();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLRequest alloc();

	/**
	 * allowsCellularAccess</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/allowsCellularAccess">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsCellularAccess")
	public native boolean allowsCellularAccess();

	/**
	 * cachePolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/cachePolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cachePolicy")
	@NUInt
	public native long cachePolicy();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSURLRequest init();

	@Generated
	@Selector("initWithCoder:")
	public native NSURLRequest initWithCoder(NSCoder aDecoder);

	/**
	 * initWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instm/NSURLRequest/initWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithURL:")
	public native NSURLRequest initWithURL(NSURL URL);

	/**
	 * initWithURL:cachePolicy:timeoutInterval:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instm/NSURLRequest/initWithURL:cachePolicy:timeoutInterval:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithURL:cachePolicy:timeoutInterval:")
	public native NSURLRequest initWithURLCachePolicyTimeoutInterval(NSURL URL,
			@NUInt long cachePolicy, double timeoutInterval);

	/**
	 * mainDocumentURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/mainDocumentURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mainDocumentURL")
	public native NSURL mainDocumentURL();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopyWithZone(VoidPtr zone);

	/**
	 * networkServiceType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/networkServiceType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("networkServiceType")
	@NUInt
	public native long networkServiceType();

	/**
	 * requestWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/clm/NSURLRequest/requestWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestWithURL:")
	public static native NSURLRequest requestWithURL(NSURL URL);

	/**
	 * requestWithURL:cachePolicy:timeoutInterval:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/clm/NSURLRequest/requestWithURL:cachePolicy:timeoutInterval:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestWithURL:cachePolicy:timeoutInterval:")
	public static native NSURLRequest requestWithURLCachePolicyTimeoutInterval(
			NSURL URL, @NUInt long cachePolicy, double timeoutInterval);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * timeoutInterval</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instp/NSURLRequest/timeoutInterval">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeoutInterval")
	public native double timeoutInterval();

	/**
	 * valueForHTTPHeaderField:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLRequest_Class/index.html#//apple_ref/occ/instm/NSURLRequest/valueForHTTPHeaderField:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForHTTPHeaderField:")
	public native String valueForHTTPHeaderField(String field);

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
