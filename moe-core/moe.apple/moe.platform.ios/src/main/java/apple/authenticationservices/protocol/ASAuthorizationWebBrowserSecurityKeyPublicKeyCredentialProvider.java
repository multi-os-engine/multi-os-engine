package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationSecurityKeyPublicKeyCredentialAssertionRequest;
import apple.authenticationservices.ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest;
import apple.authenticationservices.ASPublicKeyCredentialClientData;
import apple.foundation.NSData;
import org.jetbrains.annotations.NotNull;
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
@ObjCProtocolName("ASAuthorizationWebBrowserSecurityKeyPublicKeyCredentialProvider")
public interface ASAuthorizationWebBrowserSecurityKeyPublicKeyCredentialProvider {
    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("createCredentialAssertionRequestWithClientData:")
    @NotNull
    ASAuthorizationSecurityKeyPublicKeyCredentialAssertionRequest createCredentialAssertionRequestWithClientData(
            @NotNull ASPublicKeyCredentialClientData clientData);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("createCredentialRegistrationRequestWithClientData:displayName:name:userID:")
    @NotNull
    ASAuthorizationSecurityKeyPublicKeyCredentialRegistrationRequest createCredentialRegistrationRequestWithClientDataDisplayNameNameUserID(
            @NotNull ASPublicKeyCredentialClientData clientData, @NotNull String displayName, @NotNull String name,
            @NotNull NSData userID);
}