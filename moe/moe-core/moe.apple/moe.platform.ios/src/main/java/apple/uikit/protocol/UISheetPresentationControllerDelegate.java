package apple.uikit.protocol;

import apple.uikit.UISheetPresentationController;
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
@ObjCProtocolName("UISheetPresentationControllerDelegate")
public interface UISheetPresentationControllerDelegate extends UIAdaptivePresentationControllerDelegate {
    /**
     * Called when the selected detent of the sheet changes in response to user interaction.
     * Not called if selectedDetentIdentifier is programmatically set.
     */
    @Generated
    @IsOptional
    @Selector("sheetPresentationControllerDidChangeSelectedDetentIdentifier:")
    default void sheetPresentationControllerDidChangeSelectedDetentIdentifier(
            UISheetPresentationController sheetPresentationController) {
        throw new java.lang.UnsupportedOperationException();
    }
}
