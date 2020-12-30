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
import apple.foundation.protocol.NSSecureCoding;
import apple.security.opaque.SecTrustRef;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class NSURLProtectionSpace
 * @discussion This class represents a protection space requiring authentication.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLProtectionSpace extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLProtectionSpace(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLProtectionSpace alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @abstract Get the authentication method to be used for this protection space
     * @result The authentication method
     */
    @Generated
    @Selector("authenticationMethod")
    public native String authenticationMethod();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * @abstract Returns an array of acceptable certificate issuing authorities for client certification authentication. Issuers are identified by their distinguished name and returned as a DER encoded data.
     * @result An array of NSData objects.  (Nil if the authenticationMethod is not NSURLAuthenticationMethodClientCertificate)
     */
    @Generated
    @Selector("distinguishedNames")
    public native NSArray<? extends NSData> distinguishedNames();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * @abstract Get the proxy host if this is a proxy authentication, or the host from the URL.
     * @result The host for this protection space.
     */
    @Generated
    @Selector("host")
    public native String host();

    @Generated
    @Selector("init")
    public native NSURLProtectionSpace init();

    @Generated
    @Selector("initWithCoder:")
    public native NSURLProtectionSpace initWithCoder(NSCoder coder);

    /**
     * @method initWithHost:port:protocol:realm:authenticationMethod:
     * @abstract Initialize a protection space representing an origin server, or a realm on one
     * @param host The hostname of the server
     * @param port The port for the server
     * @param protocol The sprotocol for this server - e.g. "http", "ftp", "https"
     * @param realm A string indicating a protocol-specific subdivision
     * of a single host. For http and https, this maps to the realm
     * string in http authentication challenges. For many other protocols
     * it is unused.
     * @param authenticationMethod The authentication method to use to access this protection space -
     * valid values include nil (default method), @"digest" and @"form".
     * @result The initialized object.
     */
    @Generated
    @Selector("initWithHost:port:protocol:realm:authenticationMethod:")
    public native NSURLProtectionSpace initWithHostPortProtocolRealmAuthenticationMethod(String host, @NInt long port,
            String protocol, String realm, String authenticationMethod);

    /**
     * @method initWithProxyHost:port:type:realm:authenticationMethod:
     * @abstract Initialize a protection space representing a proxy server, or a realm on one
     * @param host The hostname of the proxy server
     * @param port The port for the proxy server
     * @param type The type of proxy - e.g. "http", "ftp", "SOCKS"
     * @param realm A string indicating a protocol-specific subdivision
     * of a single host. For http and https, this maps to the realm
     * string in http authentication challenges. For many other protocols
     * it is unused.
     * @param authenticationMethod The authentication method to use to access this protection space -
     * valid values include nil (default method) and @"digest"
     * @result The initialized object.
     */
    @Generated
    @Selector("initWithProxyHost:port:type:realm:authenticationMethod:")
    public native NSURLProtectionSpace initWithProxyHostPortTypeRealmAuthenticationMethod(String host, @NInt long port,
            String type, String realm, String authenticationMethod);

    /**
     * @abstract Determine if this authenticating protection space is a proxy server
     * @result YES if a proxy, NO otherwise
     */
    @Generated
    @Selector("isProxy")
    public native boolean isProxy();

    /**
     * @abstract Get the proxy port if this is a proxy authentication, or the port from the URL.
     * @result The port for this protection space, or 0 if not set.
     */
    @Generated
    @Selector("port")
    @NInt
    public native long port();

    /**
     * @abstract Get the protocol of this protection space, if not a proxy
     * @result The type string, or nil if a proxy.
     */
    @Generated
    @Selector("protocol")
    public native String protocol();

    /**
     * @abstract Get the type of this protection space, if a proxy
     * @result The type string, or nil if not a proxy.
     */
    @Generated
    @Selector("proxyType")
    public native String proxyType();

    /**
     * @abstract Get the authentication realm for which the protection space that
     * needs authentication
     * @discussion This is generally only available for http
     * authentication, and may be nil otherwise.
     * @result The realm string
     */
    @Generated
    @Selector("realm")
    public native String realm();

    /**
     * @abstract Determine if the password for this protection space can be sent securely
     * @result YES if a secure authentication method or protocol will be used, NO otherwise
     */
    @Generated
    @Selector("receivesCredentialSecurely")
    public native boolean receivesCredentialSecurely();

    /**
     * @abstract Returns a SecTrustRef which represents the state of the servers SSL transaction state
     * @result A SecTrustRef from Security.framework.  (Nil if the authenticationMethod is not NSURLAuthenticationMethodServerTrust)
     */
    @Generated
    @Selector("serverTrust")
    public native SecTrustRef serverTrust();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
