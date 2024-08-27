package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * Represents information relating to product attestation.
 * 
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceAttestationInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceAttestationInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceAttestationInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceAttestationInfo allocWithZone(VoidPtr zone);

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
     * The certification declaration of the device. This is a DER-encoded string
     * representing a CMS-formatted certification declaration.
     */
    @Generated
    @Selector("certificationDeclaration")
    @NotNull
    public native NSData certificationDeclaration();

    /**
     * The attestation challenge from the secure session.
     */
    @Generated
    @Selector("challenge")
    @NotNull
    public native NSData challenge();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The device attestation certificate for the device. This can be used to
     * verify signatures created with the device attestation private key.
     */
    @Generated
    @Selector("deviceAttestationCertificate")
    @NotNull
    public native NSData deviceAttestationCertificate();

    /**
     * A signature, using the device attestation private key of the device that sent
     * the attestation information, over the concatenation of elementsTLV and the
     * attestation challenge from the secure session.
     */
    @Generated
    @Selector("elementsSignature")
    @NotNull
    public native NSData elementsSignature();

    /**
     * The TLV-encoded attestation_elements_message that was used to find the
     * certificationDeclaration and firmwareInfo.
     */
    @Generated
    @Selector("elementsTLV")
    @NotNull
    public native NSData elementsTLV();

    /**
     * Firmware information, if any, provided in the elementsTLV. The encoding of
     * this is not currently specified, but if present this must match the
     * Distributed Compliance Ledger entry for the device.
     */
    @Generated
    @Selector("firmwareInfo")
    @Nullable
    public native NSData firmwareInfo();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRDeviceAttestationInfo init();

    @Generated
    @Selector("initWithDeviceAttestationChallenge:nonce:elementsTLV:elementsSignature:deviceAttestationCertificate:productAttestationIntermediateCertificate:certificationDeclaration:firmwareInfo:")
    public native MTRDeviceAttestationInfo initWithDeviceAttestationChallengeNonceElementsTLVElementsSignatureDeviceAttestationCertificateProductAttestationIntermediateCertificateCertificationDeclarationFirmwareInfo(
            @NotNull NSData challenge, @NotNull NSData nonce, @NotNull NSData elementsTLV,
            @NotNull NSData elementsSignature, @NotNull NSData deviceAttestationCertificate,
            @NotNull NSData processAttestationIntermediateCertificate, @NotNull NSData certificationDeclaration,
            @NotNull NSData firmwareInfo);

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
    public static native MTRDeviceAttestationInfo new_objc();

    /**
     * The attestation nonce from the AttestationRequest command.
     */
    @Generated
    @Selector("nonce")
    @NotNull
    public native NSData nonce();

    /**
     * The product attestation intermediate certificate that can be used to verify
     * the authenticity of the device attestation certificate.
     */
    @Generated
    @Selector("productAttestationIntermediateCertificate")
    @NotNull
    public native NSData productAttestationIntermediateCertificate();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}