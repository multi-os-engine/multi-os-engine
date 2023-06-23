package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAuthorizationController;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAuthorizationControllerPresentationContextProviding")
public interface ASAuthorizationControllerPresentationContextProviding {
    /**
     * Return a view anchor that is most appropriate for athorization UI to be presented over. This view will be used as
     * a hint if a credential provider requires user interaction.
     */
    @NotNull
    @Generated
    @Selector("presentationAnchorForAuthorizationController:")
    UIWindow presentationAnchorForAuthorizationController(@NotNull ASAuthorizationController controller);
}