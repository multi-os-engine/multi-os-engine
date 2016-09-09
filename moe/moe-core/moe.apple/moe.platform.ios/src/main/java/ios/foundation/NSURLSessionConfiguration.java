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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.objc.Class;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionConfiguration extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLSessionConfiguration(Pointer peer) {
		super(peer);
	}

	/**
	 * HTTPAdditionalHeaders</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPAdditionalHeaders">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPAdditionalHeaders")
	public native NSDictionary<?, ?> HTTPAdditionalHeaders();

	/**
	 * HTTPCookieAcceptPolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPCookieAcceptPolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPCookieAcceptPolicy")
	@NUInt
	public native long HTTPCookieAcceptPolicy();

	/**
	 * HTTPCookieStorage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPCookieStorage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPCookieStorage")
	public native NSHTTPCookieStorage HTTPCookieStorage();

	/**
	 * HTTPMaximumConnectionsPerHost</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPMaximumConnectionsPerHost">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPMaximumConnectionsPerHost")
	@NInt
	public native long HTTPMaximumConnectionsPerHost();

	/**
	 * HTTPShouldSetCookies</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPShouldSetCookies">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPShouldSetCookies")
	public native boolean HTTPShouldSetCookies();

	/**
	 * HTTPShouldUsePipelining</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPShouldUsePipelining">iOS Dev Center</a>
	 */
	@Generated
	@Selector("HTTPShouldUsePipelining")
	public native boolean HTTPShouldUsePipelining();

	/**
	 * TLSMaximumSupportedProtocol</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/TLSMaximumSupportedProtocol">iOS Dev Center</a>
	 */
	@Generated
	@Selector("TLSMaximumSupportedProtocol")
	public native int TLSMaximumSupportedProtocol();

	/**
	 * TLSMinimumSupportedProtocol</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/TLSMinimumSupportedProtocol">iOS Dev Center</a>
	 */
	@Generated
	@Selector("TLSMinimumSupportedProtocol")
	public native int TLSMinimumSupportedProtocol();

	/**
	 * URLCache</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/URLCache">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLCache")
	public native NSURLCache URLCache();

	/**
	 * URLCredentialStorage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/URLCredentialStorage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLCredentialStorage")
	public native NSURLCredentialStorage URLCredentialStorage();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLSessionConfiguration alloc();

	/**
	 * allowsCellularAccess</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/allowsCellularAccess">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsCellularAccess")
	public native boolean allowsCellularAccess();

	/**
	 * backgroundSessionConfiguration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/clm/NSURLSessionConfiguration/backgroundSessionConfiguration:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("backgroundSessionConfiguration:")
	public static native NSURLSessionConfiguration backgroundSessionConfiguration(
			String identifier);

	/**
	 * backgroundSessionConfigurationWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/clm/NSURLSessionConfiguration/backgroundSessionConfigurationWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundSessionConfigurationWithIdentifier:")
	public static native NSURLSessionConfiguration backgroundSessionConfigurationWithIdentifier(
			String identifier);

	/**
	 * connectionProxyDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/connectionProxyDictionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectionProxyDictionary")
	public native NSDictionary<?, ?> connectionProxyDictionary();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * defaultSessionConfiguration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/clm/NSURLSessionConfiguration/defaultSessionConfiguration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultSessionConfiguration")
	public static native NSURLSessionConfiguration defaultSessionConfiguration();

	/**
	 * ephemeralSessionConfiguration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/clm/NSURLSessionConfiguration/ephemeralSessionConfiguration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ephemeralSessionConfiguration")
	public static native NSURLSessionConfiguration ephemeralSessionConfiguration();

	/**
	 * identifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/identifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native NSURLSessionConfiguration init();

	/**
	 * discretionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/discretionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDiscretionary")
	public native boolean isDiscretionary();

	/**
	 * networkServiceType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/networkServiceType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("networkServiceType")
	@NUInt
	public native long networkServiceType();

	/**
	 * protocolClasses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/protocolClasses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("protocolClasses")
	public native NSArray<? extends Class> protocolClasses();

	/**
	 * requestCachePolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/requestCachePolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestCachePolicy")
	@NUInt
	public native long requestCachePolicy();

	/**
	 * sessionSendsLaunchEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/sessionSendsLaunchEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sessionSendsLaunchEvents")
	public native boolean sessionSendsLaunchEvents();

	/**
	 * allowsCellularAccess</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/allowsCellularAccess">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsCellularAccess:")
	public native void setAllowsCellularAccess(boolean value);

	/**
	 * connectionProxyDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/connectionProxyDictionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setConnectionProxyDictionary:")
	public native void setConnectionProxyDictionary(NSDictionary<?, ?> value);

	/**
	 * discretionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/discretionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDiscretionary:")
	public native void setDiscretionary(boolean value);

	/**
	 * HTTPAdditionalHeaders</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPAdditionalHeaders">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTTPAdditionalHeaders:")
	public native void setHTTPAdditionalHeaders(NSDictionary<?, ?> value);

	/**
	 * HTTPCookieAcceptPolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPCookieAcceptPolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTTPCookieAcceptPolicy:")
	public native void setHTTPCookieAcceptPolicy(@NUInt long value);

	/**
	 * HTTPCookieStorage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPCookieStorage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTTPCookieStorage:")
	public native void setHTTPCookieStorage(NSHTTPCookieStorage value);

	/**
	 * HTTPMaximumConnectionsPerHost</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPMaximumConnectionsPerHost">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTTPMaximumConnectionsPerHost:")
	public native void setHTTPMaximumConnectionsPerHost(@NInt long value);

	/**
	 * HTTPShouldSetCookies</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPShouldSetCookies">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTTPShouldSetCookies:")
	public native void setHTTPShouldSetCookies(boolean value);

	/**
	 * HTTPShouldUsePipelining</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/HTTPShouldUsePipelining">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHTTPShouldUsePipelining:")
	public native void setHTTPShouldUsePipelining(boolean value);

	/**
	 * networkServiceType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/networkServiceType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNetworkServiceType:")
	public native void setNetworkServiceType(@NUInt long value);

	/**
	 * protocolClasses</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/protocolClasses">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProtocolClasses:")
	public native void setProtocolClasses(NSArray<? extends Class> value);

	/**
	 * requestCachePolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/requestCachePolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRequestCachePolicy:")
	public native void setRequestCachePolicy(@NUInt long value);

	/**
	 * sessionSendsLaunchEvents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/sessionSendsLaunchEvents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSessionSendsLaunchEvents:")
	public native void setSessionSendsLaunchEvents(boolean value);

	/**
	 * sharedContainerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/sharedContainerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSharedContainerIdentifier:")
	public native void setSharedContainerIdentifier(String value);

	/**
	 * TLSMaximumSupportedProtocol</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/TLSMaximumSupportedProtocol">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTLSMaximumSupportedProtocol:")
	public native void setTLSMaximumSupportedProtocol(int value);

	/**
	 * TLSMinimumSupportedProtocol</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/TLSMinimumSupportedProtocol">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTLSMinimumSupportedProtocol:")
	public native void setTLSMinimumSupportedProtocol(int value);

	/**
	 * timeoutIntervalForRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/timeoutIntervalForRequest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeoutIntervalForRequest:")
	public native void setTimeoutIntervalForRequest(double value);

	/**
	 * timeoutIntervalForResource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/timeoutIntervalForResource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTimeoutIntervalForResource:")
	public native void setTimeoutIntervalForResource(double value);

	/**
	 * URLCache</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/URLCache">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURLCache:")
	public native void setURLCache(NSURLCache value);

	/**
	 * URLCredentialStorage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/URLCredentialStorage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setURLCredentialStorage:")
	public native void setURLCredentialStorage(NSURLCredentialStorage value);

	/**
	 * sharedContainerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/sharedContainerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedContainerIdentifier")
	public native String sharedContainerIdentifier();

	/**
	 * timeoutIntervalForRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/timeoutIntervalForRequest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeoutIntervalForRequest")
	public native double timeoutIntervalForRequest();

	/**
	 * timeoutIntervalForResource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionConfiguration_class/index.html#//apple_ref/occ/instp/NSURLSessionConfiguration/timeoutIntervalForResource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeoutIntervalForResource")
	public native double timeoutIntervalForResource();

	@Generated
	@Selector("setShouldUseExtendedBackgroundIdleMode:")
	public native void setShouldUseExtendedBackgroundIdleMode(boolean value);

	@Generated
	@Selector("shouldUseExtendedBackgroundIdleMode")
	public native boolean shouldUseExtendedBackgroundIdleMode();

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
