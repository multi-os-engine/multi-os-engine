package apple.uikit.protocol;

import apple.uikit.UIColor;
import apple.uikit.UIColorPickerViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIColorPickerViewControllerDelegate")
public interface UIColorPickerViewControllerDelegate {
    /**
     * In presentations (except popovers) the color picker shows a close button. If the close button is tapped,
     * the view controller is dismissed and `colorPickerViewControllerDidFinish:` is called. Can be used to
     * animate alongside the dismissal.
     */
    @Generated
    @IsOptional
    @Selector("colorPickerViewControllerDidFinish:")
    default void colorPickerViewControllerDidFinish(UIColorPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the `selectedColor` changes.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 15.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("colorPickerViewControllerDidSelectColor:")
    default void colorPickerViewControllerDidSelectColor(UIColorPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the selected color changes.
     * 
     * @param viewController This color picker.
     * @param color          The new selected color
     * @param continuously   YES, if this update is part of a continuous user interaction (e.g. dragging through the
     *                       spectrum). It's recommended
     *                       to show these updates in your UI but to not include them in any undo operations.
     * 
     *                       API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("colorPickerViewController:didSelectColor:continuously:")
    default void colorPickerViewControllerDidSelectColorContinuously(UIColorPickerViewController viewController,
            UIColor color, boolean continuously) {
        throw new java.lang.UnsupportedOperationException();
    }
}
