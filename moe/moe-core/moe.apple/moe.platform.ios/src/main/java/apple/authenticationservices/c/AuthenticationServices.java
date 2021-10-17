package apple.authenticationservices.c;

import apple.foundation.NSArray;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AuthenticationServices")
@Runtime(CRuntime.class)
public final class AuthenticationServices {
    static {
        NatJ.register();
    }

    @Generated
    private AuthenticationServices() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASWebAuthenticationSessionErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASCredentialIdentityStoreErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASExtensionErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationScopeFullName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationScopeEmail();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationImplicit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationLogin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationRefresh();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationLogout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationAppleIDProviderCredentialRevokedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationErrorDomain();

    /**
     * A key that specifies an error string to be shown to the user when an extension request fails.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASExtensionLocalizedFailureReasonErrorKey();

    /**
     * Operation which is invoked when the extension configuration is removed from the system.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationProviderAuthorizationOperationConfigurationRemoved();

    /**
     * Returns a list of all transports the device currently supports for communicating with an authenticator.
     */
    @Generated
    @CFunction
    public static native NSArray<String> ASAuthorizationAllSupportedPublicKeyCredentialDescriptorTransports();

    /**
     * The COSE algorithm identifier representing ECDSA with SHA-256.
     */
    @Generated @NInt public static final long ASCOSEAlgorithmIdentifierES256 = 0xFFFFFFFFFFFFFFF9L;
    /**
     * The COSE curve identifier representing the P-256 elliptic curve.
     */
    @Generated @NInt public static final long ASCOSEEllipticCurveIdentifierP256 = 0x0000000000000001L;

    /**
     * Indicates that the authenticator should try to verify the user if possible, but authentication should proceed even if user verification is not currently available.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialUserVerificationPreferencePreferred();

    /**
     * Indicates that the authenticator must attempt to verify the user. If the authenticator is not currently capable of verifying the user, authentication will fail.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialUserVerificationPreferenceRequired();

    /**
     * Indicates that the authenticator should prefer _not_ verifying the user, if possible. This may be used to streamline an authentication process where the user has already been verified.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialUserVerificationPreferenceDiscouraged();

    /**
     * Indicates that the authenticator should not perform attestation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialAttestationKindNone();

    /**
     * Indicates that the authenticator should perform attestation itself.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialAttestationKindDirect();

    /**
     * Indicates that the authenticator may use an external service to perform attestation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialAttestationKindIndirect();

    /**
     * Indicates that the authenticator should perform an attestation which may include information that uniquely identifies that authenticator. Authenticators should only allow enterprise attestation if they have been previously enrolled in enterprise management, and should restrict it to managed Relying Parties.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialAttestationKindEnterprise();

    /**
     * Indicates that the authenticator should not store the private key, if possible.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialResidentKeyPreferenceDiscouraged();

    /**
     * Indicates that the authenticator should store the private key, if possible.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialResidentKeyPreferencePreferred();

    /**
     * Indicates that the authenticator must store the private key, and that key creation should fail if the authenticator is not currently capable of storing the key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationPublicKeyCredentialResidentKeyPreferenceRequired();

    /**
     * Indicates using USB or Lightning to communicate with an authenticator.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationSecurityKeyPublicKeyCredentialDescriptorTransportUSB();

    /**
     * Indiciates using NFC to communicate with an authenticator.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationSecurityKeyPublicKeyCredentialDescriptorTransportNFC();

    /**
     * Indicates using Bluetooth, including BLE, to communicate with an authenticator.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationSecurityKeyPublicKeyCredentialDescriptorTransportBluetooth();
}
