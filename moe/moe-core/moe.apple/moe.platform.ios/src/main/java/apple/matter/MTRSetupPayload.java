package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A setup payload that can be created from a numeric code or QR code and
 * serialized to a numeric code or QR code, though serializing to QR code after
 * creating from numeric code will not work, because some required information
 * will be missing.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRSetupPayload extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRSetupPayload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRSetupPayload alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRSetupPayload allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("commissioningFlow")
    @NUInt
    public native long commissioningFlow();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The value of discoveryCapabilities is made up of the various
     * MTRDiscoveryCapabilities flags. If the discovery capabilities are not known,
     * this will be set to MTRDiscoveryCapabilitiesUnknown.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("discoveryCapabilities")
    @NUInt
    public native long discoveryCapabilities();

    @Generated
    @Selector("discriminator")
    @NotNull
    public native NSNumber discriminator();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Generate a random Matter-valid setup PIN.
     */
    @Generated
    @Selector("generateRandomPIN")
    @NUInt
    public static native long generateRandomPIN();

    /**
     * Generate a random Matter-valid setup passcode.
     * 
     * API-Since: 16.2
     */
    @Generated
    @Selector("generateRandomSetupPasscode")
    @NotNull
    public static native NSNumber generateRandomSetupPasscode();

    @Generated
    @Selector("getAllOptionalVendorData:")
    @Nullable
    public native NSArray<? extends MTROptionalQRCodeInfo> getAllOptionalVendorData(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * If hasShortDiscriminator is true, the discriminator value contains just the
     * high 4 bits of the full discriminator. For example, if
     * hasShortDiscriminator is true and discriminator is 0xA, then the full
     * discriminator can be anything in the range 0xA00 t0 0xAFF.
     */
    @Generated
    @Selector("hasShortDiscriminator")
    public native boolean hasShortDiscriminator();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithSetupPasscode or setupPayloadWithOnboardingPayload
     */
    @Generated
    @Deprecated
    @Selector("init")
    public native MTRSetupPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native MTRSetupPayload initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize an MTRSetupPayload with the given passcode and discriminator.
     * This will pre-set version, product id, and vendor id to 0.
     * 
     * API-Since: 16.2
     */
    @Generated
    @Selector("initWithSetupPasscode:discriminator:")
    public native MTRSetupPayload initWithSetupPasscodeDiscriminator(@NotNull NSNumber setupPasscode,
            @NotNull NSNumber discriminator);

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

    /**
     * Get 11 digit manual entry code from the setup payload.
     */
    @Generated
    @Selector("manualEntryCode")
    @Nullable
    public native String manualEntryCode();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithSetupPasscode or setupPayloadWithOnboardingPayload
     */
    @Generated
    @Owned
    @Deprecated
    @Selector("new")
    public static native MTRSetupPayload new_objc();

    @Generated
    @Selector("productID")
    @NotNull
    public native NSNumber productID();

    /**
     * Get a QR code from the setup payload.
     * 
     * Returns nil on failure (e.g. if the setup payload does not have all the
     * information a QR code needs).
     * 
     * API-Since: 16.2
     */
    @Generated
    @Selector("qrCodeString:")
    @Nullable
    public native String qrCodeString(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use discoveryCapabilities
     */
    @Generated
    @Deprecated
    @Selector("rendezvousInformation")
    @Nullable
    public native NSNumber rendezvousInformation();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("serialNumber")
    @Nullable
    public native String serialNumber();

    @Generated
    @Selector("setCommissioningFlow:")
    public native void setCommissioningFlow(@NUInt long value);

    /**
     * The value of discoveryCapabilities is made up of the various
     * MTRDiscoveryCapabilities flags. If the discovery capabilities are not known,
     * this will be set to MTRDiscoveryCapabilitiesUnknown.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setDiscoveryCapabilities:")
    public native void setDiscoveryCapabilities(@NUInt long value);

    @Generated
    @Selector("setDiscriminator:")
    public native void setDiscriminator(@NotNull NSNumber value);

    /**
     * If hasShortDiscriminator is true, the discriminator value contains just the
     * high 4 bits of the full discriminator. For example, if
     * hasShortDiscriminator is true and discriminator is 0xA, then the full
     * discriminator can be anything in the range 0xA00 t0 0xAFF.
     */
    @Generated
    @Selector("setHasShortDiscriminator:")
    public native void setHasShortDiscriminator(boolean value);

    @Generated
    @Selector("setProductID:")
    public native void setProductID(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use discoveryCapabilities
     */
    @Generated
    @Deprecated
    @Selector("setRendezvousInformation:")
    public native void setRendezvousInformation(@Nullable NSNumber value);

    @Generated
    @Selector("setSerialNumber:")
    public native void setSerialNumber(@Nullable String value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setupPasscode
     */
    @Generated
    @Deprecated
    @Selector("setSetUpPINCode:")
    public native void setSetUpPINCode(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setSetupPasscode:")
    public native void setSetupPasscode(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setupPasscode
     */
    @Generated
    @Deprecated
    @Selector("setUpPINCode")
    @NotNull
    public native NSNumber setUpPINCode();

    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(@NotNull NSNumber value);

    @Generated
    @Selector("setVersion:")
    public native void setVersion(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setupPasscode")
    @NotNull
    public native NSNumber setupPasscode();

    /**
     * Create an MTRSetupPayload with the given onboarding payload.
     * 
     * Will return nil on errors (e.g. if the onboarding payload cannot be parsed).
     * 
     * API-Since: 16.2
     */
    @Generated
    @Selector("setupPayloadWithOnboardingPayload:error:")
    @Nullable
    public static native MTRSetupPayload setupPayloadWithOnboardingPayloadError(@NotNull String onboardingPayload,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("vendorID")
    @NotNull
    public native NSNumber vendorID();

    @Generated
    @Selector("version")
    @NotNull
    public native NSNumber version();
}