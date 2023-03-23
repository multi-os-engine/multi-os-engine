package apple.authenticationservices.protocol;

import apple.foundation.NSData;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 15.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationPublicKeyCredentialRegistrationRequest")
public interface ASAuthorizationPublicKeyCredentialRegistrationRequest extends NSSecureCoding, NSCopying {
    /**
     * A preference for the type of attestation that the authenticator should attempt to perform.
     */
    @Generated
    @Selector("attestationPreference")
    String attestationPreference();

    /**
     * The challenge which can be used to verify the authenticator's attestation, if attestation is requested.
     */
    @Generated
    @Selector("challenge")
    NSData challenge();

    /**
     * A high level human readable name to associate with a credential, which should only be used for display.
     */
    @Generated
    @Selector("displayName")
    String displayName();

    /**
     * A human readable name to associate with a credential, which a user should be able to use to identify the
     * credential.
     */
    @Generated
    @Selector("name")
    String name();

    /**
     * The Relying Party identifier used to scope this request.
     */
    @Generated
    @Selector("relyingPartyIdentifier")
    String relyingPartyIdentifier();

    /**
     * A preference for the type of attestation that the authenticator should attempt to perform.
     */
    @Generated
    @Selector("setAttestationPreference:")
    void setAttestationPreference(String value);

    /**
     * The challenge which can be used to verify the authenticator's attestation, if attestation is requested.
     */
    @Generated
    @Selector("setChallenge:")
    void setChallenge(NSData value);

    /**
     * A high level human readable name to associate with a credential, which should only be used for display.
     */
    @Generated
    @Selector("setDisplayName:")
    void setDisplayName(String value);

    /**
     * A human readable name to associate with a credential, which a user should be able to use to identify the
     * credential.
     */
    @Generated
    @Selector("setName:")
    void setName(String value);

    /**
     * An arbitrary byte sequence which will be stored alongside the credential and will be returned with the credential
     * when authenticating with it in the future. May be used by a relying party to identify the user account this
     * credential is associated with.
     */
    @Generated
    @Selector("setUserID:")
    void setUserID(NSData value);

    /**
     * A preference for whether the authenticator should attempt to verify that it is being used by its owner, such as
     * through a PIN or biometrics.
     */
    @Generated
    @Selector("setUserVerificationPreference:")
    void setUserVerificationPreference(String value);

    /**
     * An arbitrary byte sequence which will be stored alongside the credential and will be returned with the credential
     * when authenticating with it in the future. May be used by a relying party to identify the user account this
     * credential is associated with.
     */
    @Generated
    @Selector("userID")
    NSData userID();

    /**
     * A preference for whether the authenticator should attempt to verify that it is being used by its owner, such as
     * through a PIN or biometrics.
     */
    @Generated
    @Selector("userVerificationPreference")
    String userVerificationPreference();
}
