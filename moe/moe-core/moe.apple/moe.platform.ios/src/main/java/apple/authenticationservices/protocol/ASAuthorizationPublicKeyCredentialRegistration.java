package apple.authenticationservices.protocol;

import apple.foundation.NSData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 15.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationPublicKeyCredentialRegistration")
public interface ASAuthorizationPublicKeyCredentialRegistration extends ASPublicKeyCredential {
    /**
     * The raw data containing the authenticator's attestation statement, if one was provided.
     */
    @Nullable
    @Generated
    @Selector("rawAttestationObject")
    NSData rawAttestationObject();
}
