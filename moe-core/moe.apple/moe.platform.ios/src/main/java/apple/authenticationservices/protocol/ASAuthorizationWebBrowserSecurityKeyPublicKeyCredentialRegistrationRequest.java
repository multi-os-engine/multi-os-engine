package apple.authenticationservices.protocol;

import apple.authenticationservices.ASPublicKeyCredentialClientData;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.4
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationWebBrowserSecurityKeyPublicKeyCredentialRegistrationRequest")
public interface ASAuthorizationWebBrowserSecurityKeyPublicKeyCredentialRegistrationRequest {
    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("clientData")
    @Nullable
    ASPublicKeyCredentialClientData clientData();
}