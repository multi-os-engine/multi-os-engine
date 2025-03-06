package apple.pencilkit.protocol;

import apple.pencilkit.PKToolPicker;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 13.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKToolPickerObserver")
public interface PKToolPickerObserver {
    /**
     * Tells the delegate that the frames the tool picker obscures changed.
     * Note, the obscured frames for a view can also change when that view
     * changes, not just when this delegate method is called.
     * 
     * @param toolPicker The tool picker that changed.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("toolPickerFramesObscuredDidChange:")
    default void toolPickerFramesObscuredDidChange(@NotNull PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the ruler active state was changed by the user.
     * 
     * @param toolPicker The tool picker that changed.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("toolPickerIsRulerActiveDidChange:")
    default void toolPickerIsRulerActiveDidChange(@NotNull PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the selected tool was changed by the user.
     * 
     * @param toolPicker The tool picker that changed.
     * 
     *                   API-Since: 13.0
     *                   Deprecated-Since: 18.0
     *                   Deprecated-Message: Use toolPickerSelectedToolItemDidChange instead.
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("toolPickerSelectedToolDidChange:")
    default void toolPickerSelectedToolDidChange(@NotNull PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the tool picker UI changed visibility.
     * 
     * @param toolPicker The tool picker that changed.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("toolPickerVisibilityDidChange:")
    default void toolPickerVisibilityDidChange(@NotNull PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the selected tool item was changed by the user.
     * 
     * @param toolPicker The tool picker that changed.
     * 
     *                   API-Since: 18.0
     */
    @Generated
    @IsOptional
    @Selector("toolPickerSelectedToolItemDidChange:")
    default void toolPickerSelectedToolItemDidChange(@NotNull PKToolPicker toolPicker) {
        throw new java.lang.UnsupportedOperationException();
    }
}
