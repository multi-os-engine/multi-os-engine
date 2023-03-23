package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationProviderExtensionAuthorizationRequest;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 13.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationProviderExtensionAuthorizationRequestHandler")
public interface ASAuthorizationProviderExtensionAuthorizationRequestHandler {
    /**
     * Called to begin the authorization. It’s called on the main thread.
     */
    @Generated
    @Selector("beginAuthorizationWithRequest:")
    void beginAuthorizationWithRequest(ASAuthorizationProviderExtensionAuthorizationRequest request);

    /**
     * Called when the authorization was canceled by authorization service. It’s called on the main thread.
     */
    @Generated
    @IsOptional
    @Selector("cancelAuthorizationWithRequest:")
    default void cancelAuthorizationWithRequest(ASAuthorizationProviderExtensionAuthorizationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}