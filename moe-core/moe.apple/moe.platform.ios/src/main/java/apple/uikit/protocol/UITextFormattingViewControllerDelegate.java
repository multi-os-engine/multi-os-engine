package apple.uikit.protocol;

import apple.uikit.UIColorPickerViewController;
import apple.uikit.UIFontPickerViewController;
import apple.uikit.UITextFormattingViewController;
import apple.uikit.UITextFormattingViewControllerChangeValue;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextFormattingViewControllerDelegate")
public interface UITextFormattingViewControllerDelegate {
    /**
     * Informs the delegate that user has dismissed text formatting view controller.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textFormattingDidFinish:")
    default void textFormattingDidFinish(@NotNull UITextFormattingViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Delegate method that will be invoked on any text formatting changes.
     * 
     * - Parameters:
     * - viewController: Text formatting controller in which action was performed.
     * - changeValue: Object describing the change made via view controller.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("textFormattingViewController:didChangeValue:")
    void textFormattingViewControllerDidChangeValue(@NotNull UITextFormattingViewController viewController,
            @NotNull UITextFormattingViewControllerChangeValue changeValue);

    /**
     * If implemented, text formatting will call this method before presenting color picker controller.
     * Use this method to make any presentation modifications or to prevent presentation altogether.
     * 
     * You may decide to prevent presentation of color picker via text formatting controller.
     * In that case, you may present provided color picker controller yourself, but you will have to handle any actions
     * in that controller separately.
     * 
     * - Parameters:
     * - viewController: Text formatting controller that is attempting to present font picker controller
     * - colorPicker: Color picker controller that will be presented.
     * - Returns: Flag indicating if text formatting controller should present font picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textFormattingViewController:shouldPresentColorPicker:")
    default boolean textFormattingViewControllerShouldPresentColorPicker(
            @NotNull UITextFormattingViewController viewController, @NotNull UIColorPickerViewController colorPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If implemented, text formatting will call this method before presenting font picker controller.
     * Use this method to make any presentation modifications or to prevent presentation altogether.
     * 
     * If you decide to prevent presentation of font picker via text formatting controller, you may present provided
     * font picker yourself.
     * In this case, you will have to handle any font picker actions independently.
     * 
     * - Parameters:
     * - viewController: Text formatting controller that is attempting to present font picker controller
     * - fontPicker: Font picker controller that will be presented.
     * - Returns: Flag indicating if text formatting controller should present font picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("textFormattingViewController:shouldPresentFontPicker:")
    default boolean textFormattingViewControllerShouldPresentFontPicker(
            @NotNull UITextFormattingViewController viewController, @NotNull UIFontPickerViewController fontPicker) {
        throw new java.lang.UnsupportedOperationException();
    }
}