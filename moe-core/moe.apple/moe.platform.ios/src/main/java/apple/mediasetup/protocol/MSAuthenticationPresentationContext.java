package apple.mediasetup.protocol;

import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * A protocol that provides media setup display information to the system.
 */
@Generated
@Library("MediaSetup")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MSAuthenticationPresentationContext")
public interface MSAuthenticationPresentationContext {
    /**
     * A window that presents the system’s HomePod configuration view to the user.
     * 
     * - Returns: The interface element in your app that the system uses to display
     * HomePod configuration information.
     */
    @Nullable
    @Generated
    @Selector("presentationAnchor")
    UIWindow presentationAnchor();
}
