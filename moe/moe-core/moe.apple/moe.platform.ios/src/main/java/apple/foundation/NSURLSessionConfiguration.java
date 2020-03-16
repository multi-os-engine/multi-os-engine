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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSessionConfiguration alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Deprecated
    @Selector("backgroundSessionConfiguration:")
    public static native NSURLSessionConfiguration backgroundSessionConfiguration(String identifier);

    @Generated
    @Selector("backgroundSessionConfigurationWithIdentifier:")
    public static native NSURLSessionConfiguration backgroundSessionConfigurationWithIdentifier(String identifier);

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
    @Selector("defaultSessionConfiguration")
    public static native NSURLSessionConfiguration defaultSessionConfiguration();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("ephemeralSessionConfiguration")
    public static native NSURLSessionConfiguration ephemeralSessionConfiguration();

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

    @Generated
    @Selector("HTTPAdditionalHeaders")
    public native NSDictionary<?, ?> HTTPAdditionalHeaders();

    @Generated
    @Selector("HTTPCookieAcceptPolicy")
    @NUInt
    public native long HTTPCookieAcceptPolicy();

    @Generated
    @Selector("HTTPCookieStorage")
    public native NSHTTPCookieStorage HTTPCookieStorage();

    @Generated
    @Selector("HTTPMaximumConnectionsPerHost")
    @NInt
    public native long HTTPMaximumConnectionsPerHost();

    @Generated
    @Selector("HTTPShouldSetCookies")
    public native boolean HTTPShouldSetCookies();

    @Generated
    @Selector("HTTPShouldUsePipelining")
    public native boolean HTTPShouldUsePipelining();

    @Generated
    @Selector("TLSMaximumSupportedProtocol")
    public native int TLSMaximumSupportedProtocol();

    @Generated
    @Selector("TLSMinimumSupportedProtocol")
    public native int TLSMinimumSupportedProtocol();

    @Generated
    @Selector("URLCache")
    public native NSURLCache URLCache();

    @Generated
    @Selector("URLCredentialStorage")
    public native NSURLCredentialStorage URLCredentialStorage();

    @Generated
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

    @Generated
    @Selector("connectionProxyDictionary")
    public native NSDictionary<?, ?> connectionProxyDictionary();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NSURLSessionConfiguration init();

    @Generated
    @Selector("isDiscretionary")
    public native boolean isDiscretionary();

    @Generated
    @Selector("setDiscretionary:")
    public native void setDiscretionary(boolean value);

    @Generated
    @Selector("networkServiceType")
    @NUInt
    public native long networkServiceType();

    @Generated
    @Selector("protocolClasses")
    public native NSArray<? extends Class> protocolClasses();

    @Generated
    @Selector("requestCachePolicy")
    @NUInt
    public native long requestCachePolicy();

    @Generated
    @Selector("sessionSendsLaunchEvents")
    public native boolean sessionSendsLaunchEvents();

    @Generated
    @Selector("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean value);

    @Generated
    @Selector("setConnectionProxyDictionary:")
    public native void setConnectionProxyDictionary(NSDictionary<?, ?> value);

    @Generated
    @Selector("setHTTPAdditionalHeaders:")
    public native void setHTTPAdditionalHeaders(NSDictionary<?, ?> value);

    @Generated
    @Selector("setHTTPCookieAcceptPolicy:")
    public native void setHTTPCookieAcceptPolicy(@NUInt long value);

    @Generated
    @Selector("setHTTPCookieStorage:")
    public native void setHTTPCookieStorage(NSHTTPCookieStorage value);

    @Generated
    @Selector("setHTTPMaximumConnectionsPerHost:")
    public native void setHTTPMaximumConnectionsPerHost(@NInt long value);

    @Generated
    @Selector("setHTTPShouldSetCookies:")
    public native void setHTTPShouldSetCookies(boolean value);

    @Generated
    @Selector("setHTTPShouldUsePipelining:")
    public native void setHTTPShouldUsePipelining(boolean value);

    @Generated
    @Selector("setNetworkServiceType:")
    public native void setNetworkServiceType(@NUInt long value);

    @Generated
    @Selector("setProtocolClasses:")
    public native void setProtocolClasses(NSArray<? extends Class> value);

    @Generated
    @Selector("setRequestCachePolicy:")
    public native void setRequestCachePolicy(@NUInt long value);

    @Generated
    @Selector("setSessionSendsLaunchEvents:")
    public native void setSessionSendsLaunchEvents(boolean value);

    @Generated
    @Selector("setSharedContainerIdentifier:")
    public native void setSharedContainerIdentifier(String value);

    @Generated
    @Selector("setShouldUseExtendedBackgroundIdleMode:")
    public native void setShouldUseExtendedBackgroundIdleMode(boolean value);

    @Generated
    @Selector("setTLSMaximumSupportedProtocol:")
    public native void setTLSMaximumSupportedProtocol(int value);

    @Generated
    @Selector("setTLSMinimumSupportedProtocol:")
    public native void setTLSMinimumSupportedProtocol(int value);

    @Generated
    @Selector("setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double value);

    @Generated
    @Selector("setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double value);

    @Generated
    @Selector("setURLCache:")
    public native void setURLCache(NSURLCache value);

    @Generated
    @Selector("setURLCredentialStorage:")
    public native void setURLCredentialStorage(NSURLCredentialStorage value);

    @Generated
    @Selector("sharedContainerIdentifier")
    public native String sharedContainerIdentifier();

    @Generated
    @Selector("shouldUseExtendedBackgroundIdleMode")
    public native boolean shouldUseExtendedBackgroundIdleMode();

    @Generated
    @Selector("timeoutIntervalForRequest")
    public native double timeoutIntervalForRequest();

    @Generated
    @Selector("timeoutIntervalForResource")
    public native double timeoutIntervalForResource();

    @Generated
    @Selector("multipathServiceType")
    @NInt
    public native long multipathServiceType();

    @Generated
    @Selector("setMultipathServiceType:")
    public native void setMultipathServiceType(@NInt long value);

    @Generated
    @Selector("setWaitsForConnectivity:")
    public native void setWaitsForConnectivity(boolean value);

    @Generated
    @Selector("waitsForConnectivity")
    public native boolean waitsForConnectivity();

    @Generated
    @Selector("TLSMaximumSupportedProtocolVersion")
    public native short TLSMaximumSupportedProtocolVersion();

    @Generated
    @Selector("TLSMinimumSupportedProtocolVersion")
    public native short TLSMinimumSupportedProtocolVersion();

    @Generated
    @Selector("allowsConstrainedNetworkAccess")
    public native boolean allowsConstrainedNetworkAccess();

    @Generated
    @Selector("allowsExpensiveNetworkAccess")
    public native boolean allowsExpensiveNetworkAccess();

    @Generated
    @Selector("setAllowsConstrainedNetworkAccess:")
    public native void setAllowsConstrainedNetworkAccess(boolean value);

    @Generated
    @Selector("setAllowsExpensiveNetworkAccess:")
    public native void setAllowsExpensiveNetworkAccess(boolean value);

    @Generated
    @Selector("setTLSMaximumSupportedProtocolVersion:")
    public native void setTLSMaximumSupportedProtocolVersion(short value);

    @Generated
    @Selector("setTLSMinimumSupportedProtocolVersion:")
    public native void setTLSMinimumSupportedProtocolVersion(short value);
}
