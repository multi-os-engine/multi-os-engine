package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAccountAuthenticationModificationController;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 14.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAccountAuthenticationModificationControllerPresentationContextProviding")
public interface ASAccountAuthenticationModificationControllerPresentationContextProviding {
    /**
     * Return a view anchor that is most appropriate for authorization UI to be presented over.
     */
    @Generated
    @Selector("presentationAnchorForAccountAuthenticationModificationController:")
    UIWindow presentationAnchorForAccountAuthenticationModificationController(
            ASAccountAuthenticationModificationController controller);
}