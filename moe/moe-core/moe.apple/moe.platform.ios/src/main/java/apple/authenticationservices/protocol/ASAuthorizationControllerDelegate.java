package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorization;
import apple.authenticationservices.ASAuthorizationController;
import apple.foundation.NSError;
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
@ObjCProtocolName("ASAuthorizationControllerDelegate")
public interface ASAuthorizationControllerDelegate {
    @Generated
    @IsOptional
    @Selector("authorizationController:didCompleteWithAuthorization:")
    default void authorizationControllerDidCompleteWithAuthorization(ASAuthorizationController controller,
            ASAuthorization authorization) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("authorizationController:didCompleteWithError:")
    default void authorizationControllerDidCompleteWithError(ASAuthorizationController controller, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}