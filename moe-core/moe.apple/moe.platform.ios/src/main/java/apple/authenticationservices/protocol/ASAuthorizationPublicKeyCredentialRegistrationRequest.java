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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    @NotNull
    @Generated
    @Selector("attestationPreference")
    String attestationPreference();

    /**
     * The challenge which can be used to verify the authenticator's attestation, if attestation is requested.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("challenge")
    NSData challenge();

    /**
     * A high level human readable name to associate with a credential, which should only be used for display.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("displayName")
    String displayName();

    /**
     * A human readable name to associate with a credential, which a user should be able to use to identify the
     * credential.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("name")
    String name();

    /**
     * The Relying Party identifier used to scope this request.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("relyingPartyIdentifier")
    String relyingPartyIdentifier();

    /**
     * A preference for the type of attestation that the authenticator should attempt to perform.
     */
    @Generated
    @Selector("setAttestationPreference:")
    void setAttestationPreference(@NotNull String value);

    /**
     * The challenge which can be used to verify the authenticator's attestation, if attestation is requested.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setChallenge:")
    void setChallenge(@NotNull NSData value);

    /**
     * A high level human readable name to associate with a credential, which should only be used for display.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setDisplayName:")
    void setDisplayName(@Nullable String value);

    /**
     * A human readable name to associate with a credential, which a user should be able to use to identify the
     * credential.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setName:")
    void setName(@NotNull String value);

    /**
     * An arbitrary byte sequence which will be stored alongside the credential and will be returned with the credential
     * when authenticating with it in the future. May be used by a relying party to identify the user account this
     * credential is associated with.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setUserID:")
    void setUserID(@NotNull NSData value);

    /**
     * A preference for whether the authenticator should attempt to verify that it is being used by its owner, such as
     * through a PIN or biometrics.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setUserVerificationPreference:")
    void setUserVerificationPreference(@NotNull String value);

    /**
     * An arbitrary byte sequence which will be stored alongside the credential and will be returned with the credential
     * when authenticating with it in the future. May be used by a relying party to identify the user account this
     * credential is associated with.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("userID")
    NSData userID();

    /**
     * A preference for whether the authenticator should attempt to verify that it is being used by its owner, such as
     * through a PIN or biometrics.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("userVerificationPreference")
    String userVerificationPreference();
}
