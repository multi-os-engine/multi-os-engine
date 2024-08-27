package apple.intentsui.protocol;

import apple.foundation.NSError;
import apple.foundation.NSUUID;
import apple.intents.INVoiceShortcut;
import apple.intentsui.INUIEditVoiceShortcutViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 12.0
 */
@Generated
@Library("IntentsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUIEditVoiceShortcutViewControllerDelegate")
public interface INUIEditVoiceShortcutViewControllerDelegate {
    /**
     * Called if the user deletes the voice shortcut.
     * 
     * Your implementation of this method should dismiss the view controller.
     */
    @Generated
    @Selector("editVoiceShortcutViewController:didDeleteVoiceShortcutWithIdentifier:")
    void editVoiceShortcutViewControllerDidDeleteVoiceShortcutWithIdentifier(
            @NotNull INUIEditVoiceShortcutViewController controller, @NotNull NSUUID deletedVoiceShortcutIdentifier);

    /**
     * Called if the user updates the voice shortcut, with either the successfully-updated voice shortcut, or an error.
     * 
     * Your implementation of this method should dismiss the view controller.
     */
    @Generated
    @Selector("editVoiceShortcutViewController:didUpdateVoiceShortcut:error:")
    void editVoiceShortcutViewControllerDidUpdateVoiceShortcutError(
            @NotNull INUIEditVoiceShortcutViewController controller, @Nullable INVoiceShortcut voiceShortcut,
            @Nullable NSError error);

    /**
     * Called if the user cancelled; no changes were made to the voice shortcut.
     * 
     * Your implementation of this method should dismiss the view controller.
     */
    @Generated
    @Selector("editVoiceShortcutViewControllerDidCancel:")
    void editVoiceShortcutViewControllerDidCancel(@NotNull INUIEditVoiceShortcutViewController controller);
}
