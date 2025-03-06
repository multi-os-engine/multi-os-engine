package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationPlatformPublicKeyCredentialDescriptor;
import apple.authenticationservices.ASPublicKeyCredentialClientData;
import apple.foundation.NSArray;
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
@ObjCProtocolName("ASAuthorizationWebBrowserPlatformPublicKeyCredentialRegistrationRequest")
public interface ASAuthorizationWebBrowserPlatformPublicKeyCredentialRegistrationRequest {
    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("clientData")
    @Nullable
    ASPublicKeyCredentialClientData clientData();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("excludedCredentials")
    @Nullable
    NSArray<? extends ASAuthorizationPlatformPublicKeyCredentialDescriptor> excludedCredentials();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("setExcludedCredentials:")
    void setExcludedCredentials(
            @Nullable NSArray<? extends ASAuthorizationPlatformPublicKeyCredentialDescriptor> value);
}