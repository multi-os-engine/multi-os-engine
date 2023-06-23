package apple.uikit.protocol;

import apple.uikit.NSTextLayoutFragment;
import apple.uikit.NSTextViewportLayoutController;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextViewportLayoutControllerDelegate")
public interface NSTextViewportLayoutControllerDelegate {
    /**
     * Called when textViewportLayoutController lays out a given textLayoutFragment.
     * The delegate should arrange to present the text layout fragment in the UI, e.g. a sublayer/subview.
     * Layout information such as viewportBounds on textViewportLayoutController is not up-to-date at the point of this
     * call.
     */
    @Generated
    @Selector("textViewportLayoutController:configureRenderingSurfaceForTextLayoutFragment:")
    void textViewportLayoutControllerConfigureRenderingSurfaceForTextLayoutFragment(
            @NotNull NSTextViewportLayoutController textViewportLayoutController,
            @NotNull NSTextLayoutFragment textLayoutFragment);

    /**
     * Called when textViewportLayoutController is about to layout.
     * Layout information on textViewportLayoutController is up-to-date at the point of this call.
     */
    @Generated
    @IsOptional
    @Selector("textViewportLayoutControllerDidLayout:")
    default void textViewportLayoutControllerDidLayout(
            @NotNull NSTextViewportLayoutController textViewportLayoutController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when textViewportLayoutController is about to layout.
     * Layout information on textViewportLayoutController is up-to-date at the point of this call.
     */
    @Generated
    @IsOptional
    @Selector("textViewportLayoutControllerWillLayout:")
    default void textViewportLayoutControllerWillLayout(
            @NotNull NSTextViewportLayoutController textViewportLayoutController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The current viewport, typically the view visible bounds with overdraw.
     */
    @Generated
    @Selector("viewportBoundsForTextViewportLayoutController:")
    @ByValue
    CGRect viewportBoundsForTextViewportLayoutController(
            @NotNull NSTextViewportLayoutController textViewportLayoutController);
}
