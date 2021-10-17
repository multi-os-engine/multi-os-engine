package apple.authenticationservices.protocol;

import apple.foundation.NSData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationPublicKeyCredentialAssertion")
public interface ASAuthorizationPublicKeyCredentialAssertion extends ASPublicKeyCredential {
    /**
     * A byte sequence containing the encoded authenticatorData blob returned by the authenticator.
     */
    @Generated
    @Selector("rawAuthenticatorData")
    NSData rawAuthenticatorData();

    /**
     * The signature provided by the authenticator using the credential's private key.
     */
    @Generated
    @Selector("signature")
    NSData signature();

    /**
     * The userID provided when creating this credential.
     */
    @Generated
    @Selector("userID")
    NSData userID();
}
