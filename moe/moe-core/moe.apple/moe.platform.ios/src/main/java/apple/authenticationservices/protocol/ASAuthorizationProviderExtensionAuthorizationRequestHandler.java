package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationProviderExtensionAuthorizationRequest;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationProviderExtensionAuthorizationRequestHandler")
public interface ASAuthorizationProviderExtensionAuthorizationRequestHandler {
    @Generated
    @Selector("beginAuthorizationWithRequest:")
    void beginAuthorizationWithRequest(ASAuthorizationProviderExtensionAuthorizationRequest request);

    @Generated
    @IsOptional
    @Selector("cancelAuthorizationWithRequest:")
    default void cancelAuthorizationWithRequest(ASAuthorizationProviderExtensionAuthorizationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}