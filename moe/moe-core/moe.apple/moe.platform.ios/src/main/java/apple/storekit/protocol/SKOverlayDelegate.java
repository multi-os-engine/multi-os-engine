package apple.storekit.protocol;

import apple.foundation.NSError;
import apple.storekit.SKOverlay;
import apple.storekit.SKOverlayTransitionContext;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 14.0
 */
@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKOverlayDelegate")
public interface SKOverlayDelegate {
    @Generated
    @IsOptional
    @Selector("storeOverlay:didFailToLoadWithError:")
    default void storeOverlayDidFailToLoadWithError(@NotNull SKOverlay overlay, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:didFinishDismissal:")
    default void storeOverlayDidFinishDismissal(@NotNull SKOverlay overlay,
            @NotNull SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:didFinishPresentation:")
    default void storeOverlayDidFinishPresentation(@NotNull SKOverlay overlay,
            @NotNull SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:willStartDismissal:")
    default void storeOverlayWillStartDismissal(@NotNull SKOverlay overlay,
            @NotNull SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:willStartPresentation:")
    default void storeOverlayWillStartPresentation(@NotNull SKOverlay overlay,
            @NotNull SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }
}