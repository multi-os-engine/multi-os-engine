package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationPlatformPublicKeyCredentialAssertionRequest;
import apple.authenticationservices.ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest;
import apple.authenticationservices.ASPublicKeyCredentialClientData;
import apple.foundation.NSData;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
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
@ObjCProtocolName("ASAuthorizationWebBrowserPlatformPublicKeyCredentialProvider")
public interface ASAuthorizationWebBrowserPlatformPublicKeyCredentialProvider {
    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("createCredentialAssertionRequestWithClientData:")
    @NotNull
    ASAuthorizationPlatformPublicKeyCredentialAssertionRequest createCredentialAssertionRequestWithClientData(
            @NotNull ASPublicKeyCredentialClientData clientData);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("createCredentialRegistrationRequestWithClientData:name:userID:")
    @NotNull
    ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest createCredentialRegistrationRequestWithClientDataNameUserID(
            @NotNull ASPublicKeyCredentialClientData clientData, @NotNull String name, @NotNull NSData userID);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("createCredentialRegistrationRequestWithClientData:name:userID:requestStyle:")
    @NotNull
    ASAuthorizationPlatformPublicKeyCredentialRegistrationRequest createCredentialRegistrationRequestWithClientDataNameUserIDRequestStyle(
            @NotNull ASPublicKeyCredentialClientData clientData, @NotNull String name, @NotNull NSData userID,
            @NInt long requestStyle);
}