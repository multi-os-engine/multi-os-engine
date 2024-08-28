package apple.intentsui.protocol;

import apple.foundation.NSError;
import apple.intents.INVoiceShortcut;
import apple.intentsui.INUIAddVoiceShortcutViewController;
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
@ObjCProtocolName("INUIAddVoiceShortcutViewControllerDelegate")
public interface INUIAddVoiceShortcutViewControllerDelegate {
    /**
     * Called after the user finishes the setup flow for the voice shortcut, with either the successfully-added voice
     * shortcut, or an error.
     * 
     * Your implementation of this method should dismiss the view controller.
     */
    @Generated
    @Selector("addVoiceShortcutViewController:didFinishWithVoiceShortcut:error:")
    void addVoiceShortcutViewControllerDidFinishWithVoiceShortcutError(
            @NotNull INUIAddVoiceShortcutViewController controller, @Nullable INVoiceShortcut voiceShortcut,
            @Nullable NSError error);

    /**
     * Called if the user cancels the setup flow; the voice shortcut was not added.
     * 
     * Your implementation of this method should dismiss the view controller.
     */
    @Generated
    @Selector("addVoiceShortcutViewControllerDidCancel:")
    void addVoiceShortcutViewControllerDidCancel(@NotNull INUIAddVoiceShortcutViewController controller);
}
