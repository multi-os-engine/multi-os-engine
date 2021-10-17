package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.uikit.UIContextMenuConfiguration;
import apple.uikit.UIContextMenuInteraction;
import apple.uikit.UITargetedPreview;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIContextMenuInteractionDelegate")
public interface UIContextMenuInteractionDelegate {
    /**
     * Called when the interaction begins.
     *
     * @param interaction The UIContextMenuInteraction.
     * @param location    The location of the interaction in its view.
     * @return A UIContextMenuConfiguration describing the menu to be presented. Return nil to prevent the interaction from beginning.
     * Returning an empty configuration causes the interaction to begin then fail with a cancellation effect. You might use this
     * to indicate to users that it's possible for a menu to be presented from this view, but that there are no actions to
     * present at this particular time.
     */
    @Generated
    @Selector("contextMenuInteraction:configurationForMenuAtLocation:")
    UIContextMenuConfiguration contextMenuInteractionConfigurationForMenuAtLocation(
            UIContextMenuInteraction interaction, @ByValue CGPoint location);

    /**
     * Called when the interaction is about to dismiss. Return a UITargetedPreview describing the desired dismissal target.
     * The interaction will animate the presented menu to the target. Use this to customize the dismissal animation.
     *
     * @param interaction   The UIContextMenuInteraction requesting a dismissal preview.
     * @param configuration The configuration of the menu displayed by this interaction.
     * @return Return a UITargetedPreview describing the desired dismissal target. Return nil to cause the menu to
     * animate away without morphing into a specific view.
     */
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:previewForDismissingMenuWithConfiguration:")
    default UITargetedPreview contextMenuInteractionPreviewForDismissingMenuWithConfiguration(
            UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins. Return a UITargetedPreview describing the desired highlight preview.
     *
     * @param interaction   The UIContextMenuInteraction requesting a highlighting preview.
     * @param configuration The configuration of the menu about to be displayed by this interaction.
     */
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:previewForHighlightingMenuWithConfiguration:")
    default UITargetedPreview contextMenuInteractionPreviewForHighlightingMenuWithConfiguration(
            UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to display a menu.
     *
     * @param interaction   The UIContextMenuInteraction.
     * @param configuration The configuration of the menu about to be displayed by this interaction.
     * @param animator      Appearance animator. Add animations to run them alongside the appearance transition.
     */
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willDisplayMenuForConfiguration:animator:")
    default void contextMenuInteractionWillDisplayMenuForConfigurationAnimator(UIContextMenuInteraction interaction,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to end.
     *
     * @param interaction   The UIContextMenuInteraction.
     * @param configuration Ending configuration.
     * @param animator      Disappearance animator. Add animations to run them alongside the disappearance transition.
     */
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willEndForConfiguration:animator:")
    default void contextMenuInteractionWillEndForConfigurationAnimator(UIContextMenuInteraction interaction,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to "commit" in response to the user tapping the preview.
     *
     * @param interaction   The UIContextMenuInteraction.
     * @param configuration Configuration of the currently displayed menu.
     * @param animator      Commit animator. Add animations to this object to run them alongside the commit transition.
     */
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willPerformPreviewActionForMenuWithConfiguration:animator:")
    default void contextMenuInteractionWillPerformPreviewActionForMenuWithConfigurationAnimator(
            UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}
