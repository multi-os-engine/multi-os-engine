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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEVPNProtocol
 * 
 * The NEVPNProtocol class declares the programmatic interface of an object that manages the protocol-specific portion
 * of a VPN configuration.
 * 
 * NEVPNProtocol is an abstract base class from which other protocol-specific classes are derived.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNProtocol extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNProtocol(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNProtocol alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEVPNProtocol allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NEVPNProtocol new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] disconnectOnSleep
     * 
     * If YES, the VPN connection will be disconnected when the device goes to sleep. The default is NO.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("disconnectOnSleep")
    public native boolean disconnectOnSleep();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] identityData
     * 
     * The PKCS12 data for the VPN authentication identity. The value is a NSData in PKCS12 format.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("identityData")
    public native NSData identityData();

    /**
     * [@property] identityDataPassword
     * 
     * The password to be used to decrypt the PKCS12 identity data.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("identityDataPassword")
    public native String identityDataPassword();

    /**
     * [@property] identityReference
     * 
     * The certificate and private key component of the VPN authentication credential. The value is a persistent
     * reference to a keychain item with the kSecClassIdentity class.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("identityReference")
    public native NSData identityReference();

    @Generated
    @Selector("init")
    public native NEVPNProtocol init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNProtocol initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] passwordReference
     * 
     * The password component of the VPN authentication credential. The value is a persistent reference to a keychain
     * item with the kSecClassGenericPassword class.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("passwordReference")
    public native NSData passwordReference();

    /**
     * [@property] proxySettings
     * 
     * An NEProxySettings object containing the proxy settings to use for connections routed through the tunnel.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("proxySettings")
    public native NEProxySettings proxySettings();

    /**
     * [@property] serverAddress
     * 
     * The VPN server. Depending on the protocol, may be an IP address, host name, or URL.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * [@property] disconnectOnSleep
     * 
     * If YES, the VPN connection will be disconnected when the device goes to sleep. The default is NO.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDisconnectOnSleep:")
    public native void setDisconnectOnSleep(boolean value);

    /**
     * [@property] identityData
     * 
     * The PKCS12 data for the VPN authentication identity. The value is a NSData in PKCS12 format.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setIdentityData:")
    public native void setIdentityData(@Nullable NSData value);

    /**
     * [@property] identityDataPassword
     * 
     * The password to be used to decrypt the PKCS12 identity data.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setIdentityDataPassword:")
    public native void setIdentityDataPassword(@Nullable String value);

    /**
     * [@property] identityReference
     * 
     * The certificate and private key component of the VPN authentication credential. The value is a persistent
     * reference to a keychain item with the kSecClassIdentity class.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setIdentityReference:")
    public native void setIdentityReference(@Nullable NSData value);

    /**
     * [@property] passwordReference
     * 
     * The password component of the VPN authentication credential. The value is a persistent reference to a keychain
     * item with the kSecClassGenericPassword class.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPasswordReference:")
    public native void setPasswordReference(@Nullable NSData value);

    /**
     * [@property] proxySettings
     * 
     * An NEProxySettings object containing the proxy settings to use for connections routed through the tunnel.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setProxySettings:")
    public native void setProxySettings(@Nullable NEProxySettings value);

    /**
     * [@property] serverAddress
     * 
     * The VPN server. Depending on the protocol, may be an IP address, host name, or URL.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setServerAddress:")
    public native void setServerAddress(@Nullable String value);

    /**
     * [@property] username
     * 
     * The username component of the VPN authentication credential.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(@Nullable String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] username
     * 
     * The username component of the VPN authentication credential.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("username")
    public native String username();

    /**
     * [@property] includeAllNetworks
     * 
     * If YES, all traffic will be sent over the tunnel, and all traffic will be dropped if the tunnel is down. The
     * default is NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("includeAllNetworks")
    public native boolean includeAllNetworks();

    /**
     * [@property] includeAllNetworks
     * 
     * If YES, all traffic will be sent over the tunnel, and all traffic will be dropped if the tunnel is down. The
     * default is NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setIncludeAllNetworks:")
    public native void setIncludeAllNetworks(boolean value);

    /**
     * [@property] enforceRoutes
     * 
     * If YES, route rules for this tunnel will take precendence over any locally-defined routes. The default is NO.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("enforceRoutes")
    public native boolean enforceRoutes();

    /**
     * [@property] excludeLocalNetworks
     * 
     * If YES, all traffic destined for local networks will be excluded from the tunnel. The default is NO on macOS and
     * YES on iOS.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("excludeLocalNetworks")
    public native boolean excludeLocalNetworks();

    /**
     * [@property] enforceRoutes
     * 
     * If YES, route rules for this tunnel will take precendence over any locally-defined routes. The default is NO.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("setEnforceRoutes:")
    public native void setEnforceRoutes(boolean value);

    /**
     * [@property] excludeLocalNetworks
     * 
     * If YES, all traffic destined for local networks will be excluded from the tunnel. The default is NO on macOS and
     * YES on iOS.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("setExcludeLocalNetworks:")
    public native void setExcludeLocalNetworks(boolean value);
}
