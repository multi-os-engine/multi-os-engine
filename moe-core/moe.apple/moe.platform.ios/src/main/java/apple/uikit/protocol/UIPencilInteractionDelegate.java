package apple.uikit.protocol;

import apple.uikit.UIPencilInteraction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import apple.uikit.UIPencilInteractionSqueeze;
import apple.uikit.UIPencilInteractionTap;

/**
 * API-Since: 12.1
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPencilInteractionDelegate")
public interface UIPencilInteractionDelegate {
    /**
     * Called when the user taps on the side of the pencil if the interaction's view is in a visible view hierarchy.
     * 
     * The delegate may do anything in this method. To perform the user's preferred tap action (as set in Settings),
     * consult the ``preferredTapAction`` class property
     * of ``UIPencilInteraction``.
     * 
     * - Note: If ``pencilInteraction(_:didReceiveTap:)`` is implemented, this method will not be called.
     * 
     * API-Since: 12.1
     * Deprecated-Since: 17.5
     * Deprecated-Message: Use pencilInteraction(_:didReceiveTap:) instead
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("pencilInteractionDidTap:")
    default void pencilInteractionDidTap(@NotNull UIPencilInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user squeezes side of the pencil if the interaction's view is in a visible view hierarchy.
     * 
     * The delegate may do anything in this method. To perform the user's preferred squeeze action (as set in Settings),
     * consult the ``preferredSqueezeAction`` class
     * property of ``UIPencilInteraction``.
     * 
     * API-Since: 17.5
     */
    @Generated
    @IsOptional
    @Selector("pencilInteraction:didReceiveSqueeze:")
    default void pencilInteractionDidReceiveSqueeze(@NotNull UIPencilInteraction interaction,
            @NotNull UIPencilInteractionSqueeze squeeze) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user taps on the side of the pencil if the interaction's view is in a visible view hierarchy.
     * 
     * The delegate may do anything in this method. To perform the user's preferred tap action (as set in Settings),
     * consult the ``preferredTapAction`` class property
     * of ``UIPencilInteraction``.
     * 
     * - Note: If both this method and the deprecated ``pencilInteractionDidTap(_:)`` are implemented, then only this
     * method will be called.
     * 
     * API-Since: 17.5
     */
    @Generated
    @IsOptional
    @Selector("pencilInteraction:didReceiveTap:")
    default void pencilInteractionDidReceiveTap(@NotNull UIPencilInteraction interaction,
            @NotNull UIPencilInteractionTap tap) {
        throw new java.lang.UnsupportedOperationException();
    }
}
