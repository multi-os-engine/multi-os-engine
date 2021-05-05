package apple.uikit.protocol;

import apple.uikit.UIColorPickerViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

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
     */
    @Generated
    @IsOptional
    @Selector("colorPickerViewControllerDidSelectColor:")
    default void colorPickerViewControllerDidSelectColor(UIColorPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}