package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationController;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationControllerPresentationContextProviding")
public interface ASAuthorizationControllerPresentationContextProviding {
    @Generated
    @Selector("presentationAnchorForAuthorizationController:")
    UIWindow presentationAnchorForAuthorizationController(ASAuthorizationController controller);
}