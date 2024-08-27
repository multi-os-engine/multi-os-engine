package apple.authenticationservices.protocol;

import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] ASCredentialRequest
 * ASCredentialRequest is used by Credential Provider Extensions to identify a credential to use
 * for an authorization request. For passkey requests it also carries the assertion challenge to
 * be used by the extension to create the assertion response.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASCredentialRequest")
public interface ASCredentialRequest extends NSSecureCoding, NSCopying {
    /**
     * The credential identity selected by the user to authenticate.
     */
    @Generated
    @Selector("credentialIdentity")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    ASCredentialIdentity credentialIdentity();

    /**
     * The type of credential used for this request.
     */
    @Generated
    @Selector("type")
    @NInt
    long type();
}