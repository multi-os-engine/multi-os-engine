package apple.uikit.protocol;

import apple.uikit.UIPencilInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPencilInteractionDelegate")
public interface UIPencilInteractionDelegate {
    /**
     * Called when the user taps on the side of the pencil, if the interaction's view is in a visible view hierarchy.
     * 
     * The delegate may do anything in this method.  To perform the user's preferred action (as set in Settings),
     * consult the preferredTapAction class property of UIPencilInteraction.
     */
    @Generated
    @IsOptional
    @Selector("pencilInteractionDidTap:")
    default void pencilInteractionDidTap(UIPencilInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}