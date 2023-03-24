package apple.uikit.protocol;

import apple.uikit.UIPointerInteraction;
import apple.uikit.UIPointerRegion;
import apple.uikit.UIPointerRegionRequest;
import apple.uikit.UIPointerStyle;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.4
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPointerInteractionDelegate")
public interface UIPointerInteractionDelegate {
    /**
     * Called as the pointer moves within the interaction's view.
     * 
     * @param interaction   This UIPointerInteraction.
     * @param request       Request object describing the pointer's location in the interaction's view.
     * @param defaultRegion Region representing the entire surface of the interaction's view.
     * 
     * @return A UIPointerRegion in which to apply a pointer style. Return nil to indicate that this interaction should
     *         not customize the pointer for the current location.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("pointerInteraction:regionForRequest:defaultRegion:")
    default UIPointerRegion pointerInteractionRegionForRequestDefaultRegion(@NotNull UIPointerInteraction interaction,
            @NotNull UIPointerRegionRequest request, @NotNull UIPointerRegion defaultRegion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after the interaction receives a new UIPointerRegion from
     * pointerInteraction:regionForRequest:defaultRegion:.
     * 
     * @param interaction This UIPointerInteraction.
     * @param region      The UIPointerRegion for which a style is being requested.
     * 
     * @return A UIPointerStyle describing the desired hover effect or pointer appearance for the given UIPointerRegion.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("pointerInteraction:styleForRegion:")
    default UIPointerStyle pointerInteractionStyleForRegion(@NotNull UIPointerInteraction interaction,
            @NotNull UIPointerRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the pointer enters a given region.
     * 
     * @param interaction This UIPointerInteraction.
     * @param region      The UIPointerRegion the pointer is about to enter.
     * @param animator    Region entrance animator. Add animations to run them alongside the pointer's entrance
     *                    animation.
     */
    @Generated
    @IsOptional
    @Selector("pointerInteraction:willEnterRegion:animator:")
    default void pointerInteractionWillEnterRegionAnimator(@NotNull UIPointerInteraction interaction,
            @NotNull UIPointerRegion region,
            @NotNull @Mapped(ObjCObjectMapper.class) UIPointerInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the pointer exists a given region.
     * 
     * @param interaction This UIPointerInteraction.
     * @param region      The UIPointerRegion the pointer is about to exit.
     * @param animator    Region exit animator. Add animations to run them alongside the pointer's exit animation.
     */
    @Generated
    @IsOptional
    @Selector("pointerInteraction:willExitRegion:animator:")
    default void pointerInteractionWillExitRegionAnimator(@NotNull UIPointerInteraction interaction,
            @NotNull UIPointerRegion region,
            @NotNull @Mapped(ObjCObjectMapper.class) UIPointerInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}
