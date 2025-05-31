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
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.MappedReturn;

/**
 * A Matter Onboarding Payload.
 * 
 * It can be represented as a numeric Manual Pairing Code or as QR Code.
 * The QR Code format contains more information though, so creating a
 * QR Code from a payload that was initialized from a Manual Pairing Code
 * will not work, because some required information will be missing.
 * 
 * This class can also be used to create an onboarding payload directly
 * from the underlying values (passcode, discriminator, etc).
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRSetupPayload extends NSObject implements NSSecureCoding, NSCopying {
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

    /**
     * API-Since: 16.1
     */
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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("discriminator")
    @NotNull
    public native NSNumber discriminator();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Generate a random Matter-valid setup PIN.
     * 
     * API-Since: 16.1
     * Deprecated-Since: 18.4
     * Deprecated-Message: Please use generateRandomSetupPasscode
     */
    @Deprecated
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

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.6
     * Deprecated-Message: Please use -vendorElements
     */
    @Deprecated
    @Generated
    @Selector("getAllOptionalVendorData:")
    @Nullable
    public native NSArray<? extends MTROptionalQRCodeInfo> getAllOptionalVendorData(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * If hasShortDiscriminator is true, the discriminator value contains just the
     * high 4 bits of the full discriminator. For example, if
     * hasShortDiscriminator is true and discriminator is 0xA, then the full
     * discriminator can be anything in the range 0xA00 to 0xAFF.
     * 
     * API-Since: 16.1
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
     * Deprecated-Message: Please use -initWithSetupPasscode:discriminator: or -initWithPayload:
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
     * Creates a Manual Pairing Code from this setup payload.
     * Returns nil if this payload cannot be represented as a valid Manual Pairing Code.
     * 
     * The following properties must be populated for a valid Manual Pairing Code:
     * - setupPasscode
     * - discriminator (short or long)
     * 
     * In most cases the pairing code will be 11 digits long. If the payload indicates
     * a `commissioningFlow` other than `MTRCommissioningFlowStandard`, a 21 digit code
     * will be produced that includes the vendorID and productID values.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("manualEntryCode")
    @Nullable
    public native String manualEntryCode();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use -initWithSetupPasscode:discriminator: or -initWithPayload:
     */
    @Generated
    @Owned
    @Deprecated
    @Selector("new")
    public static native MTRSetupPayload new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("productID")
    @NotNull
    public native NSNumber productID();

    /**
     * API-Since: 16.2
     * Deprecated-Since: 17.6
     * Deprecated-Message: Please use -qrCodeString
     */
    @Deprecated
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

    /**
     * The value of the Serial Number extension element, if any.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("serialNumber")
    @Nullable
    public native String serialNumber();

    /**
     * API-Since: 16.1
     */
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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setDiscriminator:")
    public native void setDiscriminator(@NotNull NSNumber value);

    /**
     * If hasShortDiscriminator is true, the discriminator value contains just the
     * high 4 bits of the full discriminator. For example, if
     * hasShortDiscriminator is true and discriminator is 0xA, then the full
     * discriminator can be anything in the range 0xA00 to 0xAFF.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("setHasShortDiscriminator:")
    public native void setHasShortDiscriminator(boolean value);

    /**
     * API-Since: 16.1
     */
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

    /**
     * The value of the Serial Number extension element, if any.
     * 
     * API-Since: 16.1
     */
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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
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
     * API-Since: 16.2
     * Deprecated-Since: 17.6
     * Deprecated-Message: Please use -initWithPayload:
     */
    @Deprecated
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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("vendorID")
    @NotNull
    public native NSNumber vendorID();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("version")
    @NotNull
    public native NSNumber version();

    /**
     * Adds or replaces a Manufacturer-specific extension element.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("addOrReplaceVendorElement:")
    public native void addOrReplaceVendorElement(@NotNull MTROptionalQRCodeInfo element);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Initializes the payload object from the provide QR Code or Manual Pairing Code string.
     * Returns nil if the payload is not valid.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithPayload:")
    public native MTRSetupPayload initWithPayload(@NotNull String payload);

    /**
     * Creates a QR Code payload from this setup payload.
     * Returns nil if this payload cannot be represented as a valid QR Code.
     * 
     * The following properties must be populated for a valid QR Code:
     * - setupPasscode
     * - discriminator (must be long)
     * - discoveryCapabilities (not MTRDiscoveryCapabilitiesUnknown)
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("qrCodeString")
    @Nullable
    public native String qrCodeString();

    /**
     * Removes the extension element with the specified tag, if any.
     * The tag must be in the range 0x80 - 0xFF.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("removeVendorElementWithTag:")
    public native void removeVendorElementWithTag(@NotNull NSNumber tag);

    /**
     * Returns the Manufacturer-specific extension element with the specified tag, if any.
     * The tag must be in the range 0x80 - 0xFF.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("vendorElementWithTag:")
    @Nullable
    public native MTROptionalQRCodeInfo vendorElementWithTag(@NotNull NSNumber tag);

    /**
     * The list of Manufacturer-specific extension elements contained in the setup code. May be empty.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("vendorElements")
    @NotNull
    public native NSArray<? extends MTROptionalQRCodeInfo> vendorElements();

    /**
     * Check whether the provided setup passcode (represented as an unsigned
     * integer) is a valid setup passcode.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isValidSetupPasscode:")
    public static native boolean isValidSetupPasscode(@NotNull NSNumber setupPasscode);
}