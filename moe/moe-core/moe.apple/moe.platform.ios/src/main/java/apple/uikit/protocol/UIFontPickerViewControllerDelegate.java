package apple.uikit.protocol;

import apple.uikit.UIFontPickerViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFontPickerViewControllerDelegate")
public interface UIFontPickerViewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("fontPickerViewControllerDidCancel:")
    default void fontPickerViewControllerDidCancel(UIFontPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("fontPickerViewControllerDidPickFont:")
    default void fontPickerViewControllerDidPickFont(UIFontPickerViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }
}