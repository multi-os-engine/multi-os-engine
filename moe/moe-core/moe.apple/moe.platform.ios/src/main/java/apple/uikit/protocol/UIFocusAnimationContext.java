package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * UIFocusAnimationContext is used to provide UIKit-determined context about animations that are related to a focus update.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusAnimationContext")
public interface UIFocusAnimationContext {
    /**
     * The duration of the main animations in seconds.
     */
    @Generated
    @Selector("duration")
    double duration();
}