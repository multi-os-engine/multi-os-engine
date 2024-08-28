package apple.uikit.protocol;

import apple.uikit.UIFindInteraction;
import apple.uikit.UIFindSession;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFindInteractionDelegate")
public interface UIFindInteractionDelegate {
    /**
     * Called when the search operation begins (and the system search UI appears).
     * This would be a good time to decorate your view to indicate that a search operation is about to occur.
     * System text elements will apply a dimming view around all non-highlighted search results, for instance.
     */
    @Generated
    @IsOptional
    @Selector("findInteraction:didBeginFindSession:")
    default void findInteractionDidBeginFindSession(@NotNull UIFindInteraction interaction,
            @NotNull UIFindSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the current search session has changed or ended. This would be a good time to remove all
     * decorations applied to found search results, and any decorations added when the search operation began
     * (such as a dimming view).
     */
    @Generated
    @IsOptional
    @Selector("findInteraction:didEndFindSession:")
    default void findInteractionDidEndFindSession(@NotNull UIFindInteraction interaction,
            @NotNull UIFindSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a find session is requested to begin by the user. Return an instance of a UIFindSession
     * implementation to allow the
     * find session to begin, otherwise return nil to prevent the system find panel from appearing.
     */
    @Nullable
    @Generated
    @Selector("findInteraction:sessionForView:")
    UIFindSession findInteractionSessionForView(@NotNull UIFindInteraction interaction, @NotNull UIView view);
}