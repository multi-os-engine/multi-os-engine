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

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationPublicKeyCredentialAssertionRequest")
public interface ASAuthorizationPublicKeyCredentialAssertionRequest extends NSSecureCoding, NSCopying {
    /**
     * A list of credentials to allow for this request. If this list is nonempty, only credentials matching the provided
     * descriptors can be used to sign in.
     */
    @Generated
    @Selector("allowedCredentials")
    NSArray<?> allowedCredentials();

    /**
     * The challenge to use when signing the request.
     */
    @Generated
    @Selector("challenge")
    NSData challenge();

    /**
     * The Relying Party identifier used to scope this request.
     */
    @Generated
    @Selector("relyingPartyIdentifier")
    String relyingPartyIdentifier();

    /**
     * A list of credentials to allow for this request. If this list is nonempty, only credentials matching the provided
     * descriptors can be used to sign in.
     */
    @Generated
    @Selector("setAllowedCredentials:")
    void setAllowedCredentials(NSArray<?> value);

    /**
     * The challenge to use when signing the request.
     */
    @Generated
    @Selector("setChallenge:")
    void setChallenge(NSData value);

    /**
     * The Relying Party identifier used to scope this request.
     */
    @Generated
    @Selector("setRelyingPartyIdentifier:")
    void setRelyingPartyIdentifier(String value);

    /**
     * A preference for whether the authenticator should attempt to verify that it is being used by its owner, such as
     * through a PIN or biometrics.
     */
    @Generated
    @Selector("setUserVerificationPreference:")
    void setUserVerificationPreference(String value);

    /**
     * A preference for whether the authenticator should attempt to verify that it is being used by its owner, such as
     * through a PIN or biometrics.
     */
    @Generated
    @Selector("userVerificationPreference")
    String userVerificationPreference();
}
