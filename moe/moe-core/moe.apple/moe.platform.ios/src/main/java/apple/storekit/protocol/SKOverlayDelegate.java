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

@Generated
@Library("StoreKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKOverlayDelegate")
public interface SKOverlayDelegate {
    @Generated
    @IsOptional
    @Selector("storeOverlay:didFailToLoadWithError:")
    default void storeOverlayDidFailToLoadWithError(SKOverlay overlay, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:didFinishDismissal:")
    default void storeOverlayDidFinishDismissal(SKOverlay overlay, SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:didFinishPresentation:")
    default void storeOverlayDidFinishPresentation(SKOverlay overlay, SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:willStartDismissal:")
    default void storeOverlayWillStartDismissal(SKOverlay overlay, SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("storeOverlay:willStartPresentation:")
    default void storeOverlayWillStartPresentation(SKOverlay overlay, SKOverlayTransitionContext transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }
}