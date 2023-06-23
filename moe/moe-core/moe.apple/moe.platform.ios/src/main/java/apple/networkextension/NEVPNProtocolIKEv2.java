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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * [@interface] NEVPNProtocolIKEv2
 * 
 * The NEVPNProtocolIKEv2 class declares the programmatic interface of an object that manages the IKEv2-specific portion
 * of a VPN configuration.
 * 
 * Instances of this class use IKE version 2 for key negotiation.
 * Instances of this class are thread safe.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNProtocolIKEv2 extends NEVPNProtocolIPSec {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNProtocolIKEv2(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNProtocolIKEv2 alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEVPNProtocolIKEv2 allocWithZone(VoidPtr zone);

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
    public static native NEVPNProtocolIKEv2 new_objc();

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
     * [@property] IKESecurityAssociationParameters
     * 
     * Parameters for the IKE SA
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("IKESecurityAssociationParameters")
    public native NEVPNIKEv2SecurityAssociationParameters IKESecurityAssociationParameters();

    /**
     * [@property] certificateType
     * 
     * contains the type of certificate if an certificate is configured. Default is RSA.
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("certificateType")
    @NInt
    public native long certificateType();

    /**
     * [@property] childSecurityAssociationParameters
     * 
     * Parameters for the child SA
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("childSecurityAssociationParameters")
    public native NEVPNIKEv2SecurityAssociationParameters childSecurityAssociationParameters();

    /**
     * [@property] deadPeerDetectionRate
     * 
     * How frequently the IKEv2 client will run the dead peer detection algorithm. Default is
     * NEVPNIKEv2DeadPeerDetectionRateMedium.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("deadPeerDetectionRate")
    @NInt
    public native long deadPeerDetectionRate();

    /**
     * [@property] disableMOBIKE
     * 
     * Disable MOBIKE negotiation. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("disableMOBIKE")
    public native boolean disableMOBIKE();

    /**
     * [@property] disableRedirect
     * 
     * Disable Server Redirect. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("disableRedirect")
    public native boolean disableRedirect();

    /**
     * [@property] enablePFS
     * 
     * Enable Perfect Forward Secrecy. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("enablePFS")
    public native boolean enablePFS();

    /**
     * [@property] enableRevocationCheck
     * 
     * Enable certificate revocation check. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("enableRevocationCheck")
    public native boolean enableRevocationCheck();

    @Generated
    @Selector("init")
    public native NEVPNProtocolIKEv2 init();

    @Generated
    @Selector("initWithCoder:")
    public native NEVPNProtocolIKEv2 initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] serverCertificateCommonName
     * 
     * A string containing the value to verify in the IKEv2 server certificate's Subject Common Name field.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("serverCertificateCommonName")
    public native String serverCertificateCommonName();

    /**
     * [@property] serverCertificateIssuerCommonName
     * 
     * A string containing the Subject Common Name field of the Certificate Authority certificate that issued the IKEv2
     * server's certificate.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("serverCertificateIssuerCommonName")
    public native String serverCertificateIssuerCommonName();

    /**
     * [@property] certificateType
     * 
     * contains the type of certificate if an certificate is configured. Default is RSA.
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("setCertificateType:")
    public native void setCertificateType(@NInt long value);

    /**
     * [@property] deadPeerDetectionRate
     * 
     * How frequently the IKEv2 client will run the dead peer detection algorithm. Default is
     * NEVPNIKEv2DeadPeerDetectionRateMedium.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setDeadPeerDetectionRate:")
    public native void setDeadPeerDetectionRate(@NInt long value);

    /**
     * [@property] disableMOBIKE
     * 
     * Disable MOBIKE negotiation. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setDisableMOBIKE:")
    public native void setDisableMOBIKE(boolean value);

    /**
     * [@property] disableRedirect
     * 
     * Disable Server Redirect. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setDisableRedirect:")
    public native void setDisableRedirect(boolean value);

    /**
     * [@property] enablePFS
     * 
     * Enable Perfect Forward Secrecy. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setEnablePFS:")
    public native void setEnablePFS(boolean value);

    /**
     * [@property] enableRevocationCheck
     * 
     * Enable certificate revocation check. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setEnableRevocationCheck:")
    public native void setEnableRevocationCheck(boolean value);

    /**
     * [@property] serverCertificateCommonName
     * 
     * A string containing the value to verify in the IKEv2 server certificate's Subject Common Name field.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setServerCertificateCommonName:")
    public native void setServerCertificateCommonName(@Nullable String value);

    /**
     * [@property] serverCertificateIssuerCommonName
     * 
     * A string containing the Subject Common Name field of the Certificate Authority certificate that issued the IKEv2
     * server's certificate.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setServerCertificateIssuerCommonName:")
    public native void setServerCertificateIssuerCommonName(@Nullable String value);

    /**
     * [@property] strictRevocationCheck
     * 
     * Require positive certificate revocation check response for peer certificate validation to pass. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setStrictRevocationCheck:")
    public native void setStrictRevocationCheck(boolean value);

    /**
     * [@property] useConfigurationAttributeInternalIPSubnet
     * 
     * Boolean indicating if client should use INTERNAL_IP4_SUBNET / INTERNAL_IP6_SUBNET attributes. Default is False.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setUseConfigurationAttributeInternalIPSubnet:")
    public native void setUseConfigurationAttributeInternalIPSubnet(boolean value);

    /**
     * [@property] strictRevocationCheck
     * 
     * Require positive certificate revocation check response for peer certificate validation to pass. Default is NO.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("strictRevocationCheck")
    public native boolean strictRevocationCheck();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] useConfigurationAttributeInternalIPSubnet
     * 
     * Boolean indicating if client should use INTERNAL_IP4_SUBNET / INTERNAL_IP6_SUBNET attributes. Default is False.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("useConfigurationAttributeInternalIPSubnet")
    public native boolean useConfigurationAttributeInternalIPSubnet();

    /**
     * [@property] maximumTLSVersion
     * 
     * Sets a maximum TLS version to allow for EAP-TLS authentication. Default is NEVPNIKEv2TLSVersionDefault.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("maximumTLSVersion")
    @NInt
    public native long maximumTLSVersion();

    /**
     * [@property] minimumTLSVersion
     * 
     * Sets a minimum TLS version to allow for EAP-TLS authentication. Default is NEVPNIKEv2TLSVersionDefault.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("minimumTLSVersion")
    @NInt
    public native long minimumTLSVersion();

    /**
     * [@property] maximumTLSVersion
     * 
     * Sets a maximum TLS version to allow for EAP-TLS authentication. Default is NEVPNIKEv2TLSVersionDefault.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMaximumTLSVersion:")
    public native void setMaximumTLSVersion(@NInt long value);

    /**
     * [@property] minimumTLSVersion
     * 
     * Sets a minimum TLS version to allow for EAP-TLS authentication. Default is NEVPNIKEv2TLSVersionDefault.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMinimumTLSVersion:")
    public native void setMinimumTLSVersion(@NInt long value);

    /**
     * [@property] enableFallback
     * 
     * Enable Fallback is used to support Wi-Fi Assist. Wi-Fi Assist allows connections for foreground apps to switch
     * over
     * to Cellular Data when WiFi connectivity is poor. By setting the EnableFallback key, the device will bring up a
     * tunnel over
     * Cellular Data to carry traffic that is eligible for Wi-Fi Assist and also requires VPN. Enabling fallback
     * requires that the
     * server support multiple tunnels for a single user. Default is NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("enableFallback")
    public native boolean enableFallback();

    /**
     * [@property] enableFallback
     * 
     * Enable Fallback is used to support Wi-Fi Assist. Wi-Fi Assist allows connections for foreground apps to switch
     * over
     * to Cellular Data when WiFi connectivity is poor. By setting the EnableFallback key, the device will bring up a
     * tunnel over
     * Cellular Data to carry traffic that is eligible for Wi-Fi Assist and also requires VPN. Enabling fallback
     * requires that the
     * server support multiple tunnels for a single user. Default is NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setEnableFallback:")
    public native void setEnableFallback(boolean value);

    /**
     * [@property] mtu
     * 
     * Maximum Transmission Unit (MTU) size in bytes to assign to the tunnel interface.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("mtu")
    @NUInt
    public native long mtu();

    /**
     * [@property] mtu
     * 
     * Maximum Transmission Unit (MTU) size in bytes to assign to the tunnel interface.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMtu:")
    public native void setMtu(@NUInt long value);
}
