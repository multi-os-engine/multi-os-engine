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
    @Generated
    @IsOptional
    @Selector("colorPickerViewControllerDidFinish:")
    default void colorPickerViewControllerDidFinish(UIColorPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("colorPickerViewControllerDidSelectColor:")
    default void colorPickerViewControllerDidSelectColor(UIColorPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}