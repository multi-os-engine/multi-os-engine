package apple.authenticationservices.protocol;

import apple.authenticationservices.ASWebAuthenticationSession;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Provides context to target where in an application's UI the authorization view should be shown.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASWebAuthenticationPresentationContextProviding")
public interface ASWebAuthenticationPresentationContextProviding {
    /**
     * Return the ASPresentationAnchor in the closest proximity to where a user interacted with your app to trigger
     * authentication. If starting an ASWebAuthenticationSession on first launch, use the application's main window.
     * 
     * @param session The session requesting a presentation anchor.
     * @return The ASPresentationAnchor most closely associated with the UI used to trigger authentication.
     */
    @Generated
    @Selector("presentationAnchorForWebAuthenticationSession:")
    UIWindow presentationAnchorForWebAuthenticationSession(ASWebAuthenticationSession session);
}
