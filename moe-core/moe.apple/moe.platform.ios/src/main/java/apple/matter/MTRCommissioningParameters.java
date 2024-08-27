package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.matter.protocol.MTRDeviceAttestationDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Information that can be provided to commissionWithNodeID to commision devices.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRCommissioningParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRCommissioningParameters(Pointer peer) {
        super(peer);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated
    @Deprecated
    @Selector("CSRNonce")
    @Nullable
    public native NSData CSRNonce();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRCommissioningParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRCommissioningParameters allocWithZone(VoidPtr zone);

    /**
     * The nonce to use when requesting attestation information from the device.
     * 
     * If nil, a random nonce will be generated automatically.
     * 
     * If not nil, must be 32 bytes of data.
     */
    @Generated
    @Selector("attestationNonce")
    @Nullable
    public native NSData attestationNonce();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * The country code to provide to the device during commissioning.
     * 
     * If not nil, this must be a 2-character ISO 3166-1 country code, which the
     * device can use to decide on things like radio communications bands.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("countryCode")
    @Nullable
    public native String countryCode();

    /**
     * The nonce to use when requesting a CSR for the node's operational
     * certificate.
     * 
     * If nil, a random nonce will be generated automatically.
     * 
     * If not nil, must be 32 bytes of data.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("csrNonce")
    @Nullable
    public native NSData csrNonce();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * An optional delegate that can be notified upon completion of device
     * attestation. See documentation for MTRDeviceAttestationDelegate for
     * details.
     * 
     * The delegate methods will be invoked on an arbitrary thread.
     */
    @Generated
    @Selector("deviceAttestationDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTRDeviceAttestationDelegate deviceAttestationDelegate();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated
    @Deprecated
    @Selector("failSafeExpiryTimeoutSecs")
    @Nullable
    public native NSNumber failSafeExpiryTimeoutSecs();

    /**
     * The timeout, in seconds, to set for the fail-safe when calling into the
     * deviceAttestationDelegate and waiting for it to respond.
     * 
     * If nil, the fail-safe will not be extended before calling into the
     * deviceAttestationDelegate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("failSafeTimeout")
    @Nullable
    public native NSNumber failSafeTimeout();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRCommissioningParameters init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTRCommissioningParameters new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The nonce to use when requesting attestation information from the device.
     * 
     * If nil, a random nonce will be generated automatically.
     * 
     * If not nil, must be 32 bytes of data.
     */
    @Generated
    @Selector("setAttestationNonce:")
    public native void setAttestationNonce(@Nullable NSData value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated
    @Deprecated
    @Selector("setCSRNonce:")
    public native void setCSRNonce(@Nullable NSData value);

    /**
     * The country code to provide to the device during commissioning.
     * 
     * If not nil, this must be a 2-character ISO 3166-1 country code, which the
     * device can use to decide on things like radio communications bands.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setCountryCode:")
    public native void setCountryCode(@Nullable String value);

    /**
     * The nonce to use when requesting a CSR for the node's operational
     * certificate.
     * 
     * If nil, a random nonce will be generated automatically.
     * 
     * If not nil, must be 32 bytes of data.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setCsrNonce:")
    public native void setCsrNonce(@Nullable NSData value);

    /**
     * An optional delegate that can be notified upon completion of device
     * attestation. See documentation for MTRDeviceAttestationDelegate for
     * details.
     * 
     * The delegate methods will be invoked on an arbitrary thread.
     */
    @Generated
    @Selector("setDeviceAttestationDelegate:")
    public native void setDeviceAttestationDelegate(
            @Mapped(ObjCObjectMapper.class) @Nullable MTRDeviceAttestationDelegate value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated
    @Deprecated
    @Selector("setFailSafeExpiryTimeoutSecs:")
    public native void setFailSafeExpiryTimeoutSecs(@Nullable NSNumber value);

    /**
     * The timeout, in seconds, to set for the fail-safe when calling into the
     * deviceAttestationDelegate and waiting for it to respond.
     * 
     * If nil, the fail-safe will not be extended before calling into the
     * deviceAttestationDelegate.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setFailSafeTimeout:")
    public native void setFailSafeTimeout(@Nullable NSNumber value);

    /**
     * Only perform the PASE steps of commissioning.
     * If set to YES, commissioning will be completed by another admin on the network.
     * 
     * Defaults to NO.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setSkipCommissioningComplete:")
    public native void setSkipCommissioningComplete(boolean value);

    /**
     * The Thread operational dataset, if available.
     */
    @Generated
    @Selector("setThreadOperationalDataset:")
    public native void setThreadOperationalDataset(@Nullable NSData value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The Wi-Fi Credentials. Allowed to be nil or 0-length data for an open
     * network, as long as wifiSSID is not nil.
     */
    @Generated
    @Selector("setWifiCredentials:")
    public native void setWifiCredentials(@Nullable NSData value);

    /**
     * The Wi-Fi SSID, if available.
     */
    @Generated
    @Selector("setWifiSSID:")
    public native void setWifiSSID(@Nullable NSData value);

    /**
     * Only perform the PASE steps of commissioning.
     * If set to YES, commissioning will be completed by another admin on the network.
     * 
     * Defaults to NO.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("skipCommissioningComplete")
    public native boolean skipCommissioningComplete();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The Thread operational dataset, if available.
     */
    @Generated
    @Selector("threadOperationalDataset")
    @Nullable
    public native NSData threadOperationalDataset();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The Wi-Fi Credentials. Allowed to be nil or 0-length data for an open
     * network, as long as wifiSSID is not nil.
     */
    @Generated
    @Selector("wifiCredentials")
    @Nullable
    public native NSData wifiCredentials();

    /**
     * The Wi-Fi SSID, if available.
     */
    @Generated
    @Selector("wifiSSID")
    @Nullable
    public native NSData wifiSSID();
}