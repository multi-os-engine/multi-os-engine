package apple.authenticationservices.protocol;

import apple.foundation.NSData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The base protocol for all PublicKeyCredential credential types.
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASPublicKeyCredential")
public interface ASPublicKeyCredential extends ASAuthorizationCredential {
    /**
     * An identifier that uniquely identifies this credential.
     */
    @Generated
    @Selector("credentialID")
    NSData credentialID();

    /**
     * A byte sequence containing the serialized clientDataJSON blob returned by the authenticator.
     */
    @Generated
    @Selector("rawClientDataJSON")
    NSData rawClientDataJSON();
}
