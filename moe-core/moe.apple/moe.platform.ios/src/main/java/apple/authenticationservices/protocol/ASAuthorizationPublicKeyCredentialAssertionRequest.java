package apple.authenticationservices.protocol;

import apple.foundation.NSArray;
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

/**
 * API-Since: 15.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationPublicKeyCredentialAssertionRequest")
public interface ASAuthorizationPublicKeyCredentialAssertionRequest extends NSSecureCoding, NSCopying {
    /**
     * A list of credentials to allow for this request. If this list is nonempty, only credentials matching the provided
     * descriptors can be used to sign in.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("allowedCredentials")
    NSArray<?> allowedCredentials();

    /**
     * The challenge to use when signing the request.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("challenge")
    NSData challenge();

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
     * A list of credentials to allow for this request. If this list is nonempty, only credentials matching the provided
     * descriptors can be used to sign in.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowedCredentials:")
    void setAllowedCredentials(@NotNull NSArray<?> value);

    /**
     * The challenge to use when signing the request.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setChallenge:")
    void setChallenge(@NotNull NSData value);

    /**
     * The Relying Party identifier used to scope this request.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setRelyingPartyIdentifier:")
    void setRelyingPartyIdentifier(@NotNull String value);

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
