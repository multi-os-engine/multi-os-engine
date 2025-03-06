package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.matter.protocol.MTROTAProviderDelegate;
import apple.matter.protocol.MTROperationalCertificateIssuer;
import apple.opaque.dispatch_queue_t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Parameters that can be used to initialize an MTRDeviceController which
 * has a node identity.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceControllerParameters extends MTRDeviceControllerAbstractParameters {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceControllerParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceControllerParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceControllerParameters allocWithZone(VoidPtr zone);

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

    /**
     * The Certification Declaration certificates whose public keys correspond to
     * private keys that are trusted to sign certification declarations. Defaults
     * to nil.
     * 
     * These certificates are used in addition to, not replacing, the default set of
     * well-known certification declaration signing keys.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("certificationDeclarationCertificates")
    @Nullable
    public native NSArray<? extends NSData> certificationDeclarationCertificates();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * Sets the maximum simultaneous subscription establishments that can be happening
     * at one time for devices on Thread. This defaults to a large number.
     * 
     * If this value is 0, the maximum subscription establishments allowed at a time will be set to 1.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("concurrentSubscriptionEstablishmentsAllowedOnThread")
    @NUInt
    public native long concurrentSubscriptionEstablishmentsAllowedOnThread();

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
    @Selector("init")
    public native MTRDeviceControllerParameters init();

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
    public static native MTRDeviceControllerParameters new_objc();

    /**
     * The Product Attestation Authority certificates that are trusted to sign
     * device attestation information (and in particular to sign Product Attestation
     * Intermediate certificates, which then sign Device Attestation Certificates).
     * 
     * Defaults to nil.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("productAttestationAuthorityCertificates")
    @Nullable
    public native NSArray<? extends NSData> productAttestationAuthorityCertificates();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The Certification Declaration certificates whose public keys correspond to
     * private keys that are trusted to sign certification declarations. Defaults
     * to nil.
     * 
     * These certificates are used in addition to, not replacing, the default set of
     * well-known certification declaration signing keys.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setCertificationDeclarationCertificates:")
    public native void setCertificationDeclarationCertificates(@Nullable NSArray<? extends NSData> value);

    /**
     * Sets the maximum simultaneous subscription establishments that can be happening
     * at one time for devices on Thread. This defaults to a large number.
     * 
     * If this value is 0, the maximum subscription establishments allowed at a time will be set to 1.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setConcurrentSubscriptionEstablishmentsAllowedOnThread:")
    public native void setConcurrentSubscriptionEstablishmentsAllowedOnThread(@NUInt long value);

    /**
     * Set an MTROTAProviderDelegate to call (on the provided queue). Only needs to
     * be called if this controller should be able to handle OTA for devices.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setOTAProviderDelegate:queue:")
    public native void setOTAProviderDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTROTAProviderDelegate otaProviderDelegate,
            @NotNull dispatch_queue_t queue);

    /**
     * Set an MTROperationalCertificateIssuer to call (on the provided queue) when
     * operational certificates need to be provided during commissioning.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setOperationalCertificateIssuer:queue:")
    public native void setOperationalCertificateIssuerQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTROperationalCertificateIssuer operationalCertificateIssuer,
            @NotNull dispatch_queue_t queue);

    /**
     * The Product Attestation Authority certificates that are trusted to sign
     * device attestation information (and in particular to sign Product Attestation
     * Intermediate certificates, which then sign Device Attestation Certificates).
     * 
     * Defaults to nil.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setProductAttestationAuthorityCertificates:")
    public native void setProductAttestationAuthorityCertificates(@Nullable NSArray<? extends NSData> value);

    /**
     * Whether the controller should advertise its operational identity. Defaults
     * to NO.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setShouldAdvertiseOperational:")
    public native void setShouldAdvertiseOperational(boolean value);

    /**
     * Sets the storage behavior configuration - see MTRDeviceStorageBehaviorConfiguration.h for details
     * 
     * If this value is nil, a default storage behavior configuration will be used.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setStorageBehaviorConfiguration:")
    public native void setStorageBehaviorConfiguration(@Nullable MTRDeviceStorageBehaviorConfiguration value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Whether the controller should advertise its operational identity. Defaults
     * to NO.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("shouldAdvertiseOperational")
    public native boolean shouldAdvertiseOperational();

    /**
     * Sets the storage behavior configuration - see MTRDeviceStorageBehaviorConfiguration.h for details
     * 
     * If this value is nil, a default storage behavior configuration will be used.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("storageBehaviorConfiguration")
    @Nullable
    public native MTRDeviceStorageBehaviorConfiguration storageBehaviorConfiguration();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}