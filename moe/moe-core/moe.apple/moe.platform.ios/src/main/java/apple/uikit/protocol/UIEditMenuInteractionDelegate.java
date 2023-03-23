package apple.uikit.protocol;

import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.uikit.UIEditMenuConfiguration;
import apple.uikit.UIEditMenuInteraction;
import apple.uikit.UIMenu;
import apple.uikit.UIMenuElement;
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

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIEditMenuInteractionDelegate")
public interface UIEditMenuInteractionDelegate {
    /**
     * Called when the interaction begins.
     * 
     * @param interaction      The UIEditMenuInteraction.
     * @param configuration    The UIEditMenuConfiguration object used to present the menu.
     * @param suggestedActions An array of suggested actions gathered from the UIResponder chain. You may
     *                         include these actions in the hierarchy to display them in the resulting menu.
     * 
     * @return Return a UIMenu describing the desired menu hierarchy. Return @c nil to present the default system menu.
     */
    @Generated
    @IsOptional
    @Selector("editMenuInteraction:menuForConfiguration:suggestedActions:")
    default UIMenu editMenuInteractionMenuForConfigurationSuggestedActions(UIEditMenuInteraction interaction,
            UIEditMenuConfiguration configuration, NSArray<? extends UIMenuElement> suggestedActions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction begins, or when @c updateVisibleMenuPosition(animated:) is called.
     * 
     * [@c] CGRectNull to use the default rect.
     * 
     * @param interaction   The UIEditMenuInteraction.
     * @param configuration The UIEditMenuConfiguration object used to present the menu.
     * 
     * @return Return a rectangle relative to the interaction's view. The menu will be displayed around
     *         target rect, space permitting, with the arrow pointing at the edge of the target rectangle
     *         for the specified arrow direction of the configuration. By default, an empty-sized rectangle
     *         centered at @c configuration.sourcePoint will be used if this method is not implemented. Return
     */
    @Generated
    @IsOptional
    @Selector("editMenuInteraction:targetRectForConfiguration:")
    @ByValue
    default CGRect editMenuInteractionTargetRectForConfiguration(UIEditMenuInteraction interaction,
            UIEditMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to dismiss the menu.
     * 
     * @param interaction   The UIEditMenuInteraction.
     * @param configuration The configuration object of the menu about to be dismissed by this interaction.
     * @param animator      Dismiss animator. Add animations to this object to run them alongside the dismiss
     *                      transition.
     */
    @Generated
    @IsOptional
    @Selector("editMenuInteraction:willDismissMenuForConfiguration:animator:")
    default void editMenuInteractionWillDismissMenuForConfigurationAnimator(UIEditMenuInteraction interaction,
            UIEditMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the interaction is about to present the menu.
     * 
     * @param interaction   The UIEditMenuInteraction.
     * @param configuration The configuration object of the menu about to be presented by this interaction.
     * @param animator      Appearance animator. Add animations to this object to run them alongside the appearance
     *                      transition.
     */
    @Generated
    @IsOptional
    @Selector("editMenuInteraction:willPresentMenuForConfiguration:animator:")
    default void editMenuInteractionWillPresentMenuForConfigurationAnimator(UIEditMenuInteraction interaction,
            UIEditMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIEditMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}