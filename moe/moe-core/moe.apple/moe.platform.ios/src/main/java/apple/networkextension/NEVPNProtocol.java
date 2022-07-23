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

/**
 * [@interface] NEVPNProtocol
 * <p>
 * The NEVPNProtocol class declares the programmatic interface of an object that manages the protocol-specific portion
 * of a VPN configuration.
 * <p>
 * NEVPNProtocol is an abstract base class from which other protocol-specific classes are derived.
 * <p>
 * Instances of this class are thread safe.
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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] disconnectOnSleep
     * <p>
     * If YES, the VPN connection will be disconnected when the device goes to sleep. The default is NO.
     */
    @Generated
    @Selector("disconnectOnSleep")
    public native boolean disconnectOnSleep();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] identityData
     * <p>
     * The PKCS12 data for the VPN authentication identity. The value is a NSData in PKCS12 format.
     */
    @Generated
    @Selector("identityData")
    public native NSData identityData();

    /**
     * [@property] identityDataPassword
     * <p>
     * The password to be used to decrypt the PKCS12 identity data.
     */
    @Generated
    @Selector("identityDataPassword")
    public native String identityDataPassword();

    /**
     * [@property] identityReference
     * <p>
     * The certificate and private key component of the VPN authentication credential. The value is a persistent
     * reference to a keychain item with the kSecClassIdentity class.
     */
    @Generated
    @Selector("identityReference")
    public native NSData identityReference();

    @Generated
    @Selector("init")
    public native NEVPNProtocol init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNProtocol initWithCoder(NSCoder coder);

    /**
     * [@property] passwordReference
     * <p>
     * The password component of the VPN authentication credential. The value is a persistent reference to a keychain
     * item with the kSecClassGenericPassword class.
     */
    @Generated
    @Selector("passwordReference")
    public native NSData passwordReference();

    /**
     * [@property] proxySettings
     * <p>
     * An NEProxySettings object containing the proxy settings to use for connections routed through the tunnel.
     */
    @Generated
    @Selector("proxySettings")
    public native NEProxySettings proxySettings();

    /**
     * [@property] serverAddress
     * <p>
     * The VPN server. Depending on the protocol, may be an IP address, host name, or URL.
     */
    @Generated
    @Selector("serverAddress")
    public native String serverAddress();

    /**
     * [@property] disconnectOnSleep
     * <p>
     * If YES, the VPN connection will be disconnected when the device goes to sleep. The default is NO.
     */
    @Generated
    @Selector("setDisconnectOnSleep:")
    public native void setDisconnectOnSleep(boolean value);

    /**
     * [@property] identityData
     * <p>
     * The PKCS12 data for the VPN authentication identity. The value is a NSData in PKCS12 format.
     */
    @Generated
    @Selector("setIdentityData:")
    public native void setIdentityData(NSData value);

    /**
     * [@property] identityDataPassword
     * <p>
     * The password to be used to decrypt the PKCS12 identity data.
     */
    @Generated
    @Selector("setIdentityDataPassword:")
    public native void setIdentityDataPassword(String value);

    /**
     * [@property] identityReference
     * <p>
     * The certificate and private key component of the VPN authentication credential. The value is a persistent
     * reference to a keychain item with the kSecClassIdentity class.
     */
    @Generated
    @Selector("setIdentityReference:")
    public native void setIdentityReference(NSData value);

    /**
     * [@property] passwordReference
     * <p>
     * The password component of the VPN authentication credential. The value is a persistent reference to a keychain
     * item with the kSecClassGenericPassword class.
     */
    @Generated
    @Selector("setPasswordReference:")
    public native void setPasswordReference(NSData value);

    /**
     * [@property] proxySettings
     * <p>
     * An NEProxySettings object containing the proxy settings to use for connections routed through the tunnel.
     */
    @Generated
    @Selector("setProxySettings:")
    public native void setProxySettings(NEProxySettings value);

    /**
     * [@property] serverAddress
     * <p>
     * The VPN server. Depending on the protocol, may be an IP address, host name, or URL.
     */
    @Generated
    @Selector("setServerAddress:")
    public native void setServerAddress(String value);

    /**
     * [@property] username
     * <p>
     * The username component of the VPN authentication credential.
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] username
     * <p>
     * The username component of the VPN authentication credential.
     */
    @Generated
    @Selector("username")
    public native String username();

    /**
     * [@property] includeAllNetworks
     * <p>
     * If YES, all traffic will be sent over the tunnel, and all traffic will be dropped if the tunnel is down. The
     * default is NO.
     */
    @Generated
    @Selector("includeAllNetworks")
    public native boolean includeAllNetworks();

    /**
     * [@property] includeAllNetworks
     * <p>
     * If YES, all traffic will be sent over the tunnel, and all traffic will be dropped if the tunnel is down. The
     * default is NO.
     */
    @Generated
    @Selector("setIncludeAllNetworks:")
    public native void setIncludeAllNetworks(boolean value);

    /**
     * [@property] enforceRoutes
     * <p>
     * If YES, route rules for this tunnel will take precendence over any locally-defined routes. The default is NO.
     */
    @Generated
    @Selector("enforceRoutes")
    public native boolean enforceRoutes();

    /**
     * [@property] excludeLocalNetworks
     * <p>
     * If YES, all traffic destined for local networks will be excluded from the tunnel. The default is NO on macOS and
     * YES on iOS.
     */
    @Generated
    @Selector("excludeLocalNetworks")
    public native boolean excludeLocalNetworks();

    /**
     * [@property] enforceRoutes
     * <p>
     * If YES, route rules for this tunnel will take precendence over any locally-defined routes. The default is NO.
     */
    @Generated
    @Selector("setEnforceRoutes:")
    public native void setEnforceRoutes(boolean value);

    /**
     * [@property] excludeLocalNetworks
     * <p>
     * If YES, all traffic destined for local networks will be excluded from the tunnel. The default is NO on macOS and
     * YES on iOS.
     */
    @Generated
    @Selector("setExcludeLocalNetworks:")
    public native void setExcludeLocalNetworks(boolean value);
}
