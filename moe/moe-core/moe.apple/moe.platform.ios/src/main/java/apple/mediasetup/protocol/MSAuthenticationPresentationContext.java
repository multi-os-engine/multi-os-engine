package apple.mediasetup.protocol;

import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MediaSetup")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MSAuthenticationPresentationContext")
public interface MSAuthenticationPresentationContext {
    /**
     * The anchor to present the interface in
     */
    @Generated
    @Selector("presentationAnchor")
    UIWindow presentationAnchor();
}
