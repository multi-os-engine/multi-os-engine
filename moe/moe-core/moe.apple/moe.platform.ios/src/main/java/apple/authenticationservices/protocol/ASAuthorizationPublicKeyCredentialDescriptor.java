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
@ObjCProtocolName("ASAuthorizationPublicKeyCredentialDescriptor")
public interface ASAuthorizationPublicKeyCredentialDescriptor extends NSSecureCoding, NSCopying {
    /**
     * An identifier that uniquely identifies a specific credential.
     */
    @Generated
    @Selector("credentialID")
    NSData credentialID();

    /**
     * An identifier that uniquely identifies a specific credential.
     */
    @Generated
    @Selector("setCredentialID:")
    void setCredentialID(NSData value);
}
