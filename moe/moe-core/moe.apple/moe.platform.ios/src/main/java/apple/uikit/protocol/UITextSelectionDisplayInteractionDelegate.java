package apple.uikit.protocol;

import apple.uikit.UITextSelectionDisplayInteraction;
import apple.uikit.UIView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextSelectionDisplayInteractionDelegate")
public interface UITextSelectionDisplayInteractionDelegate {
    /**
     * If different than the view that the interaction is installed onto, one can return a container view here for
     * selection views that draw _below_ text. Includes selection highlight view, etc. The default is assumed
     * that all views are to be installed onto the interaction's view.
     */
    @Generated
    @IsOptional
    @Selector("selectionContainerViewBelowTextForSelectionDisplayInteraction:")
    @Nullable
    default UIView selectionContainerViewBelowTextForSelectionDisplayInteraction(
            @NotNull UITextSelectionDisplayInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}