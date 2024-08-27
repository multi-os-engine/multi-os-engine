package apple.intentsui.protocol;

import apple.intentsui.INUIAddVoiceShortcutButton;
import apple.intentsui.INUIAddVoiceShortcutViewController;
import apple.intentsui.INUIEditVoiceShortcutViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 12.0
 */
@Generated
@Library("IntentsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUIAddVoiceShortcutButtonDelegate")
public interface INUIAddVoiceShortcutButtonDelegate {
    @Generated
    @Selector("presentAddVoiceShortcutViewController:forAddVoiceShortcutButton:")
    void presentAddVoiceShortcutViewControllerForAddVoiceShortcutButton(
            @NotNull INUIAddVoiceShortcutViewController addVoiceShortcutViewController,
            @NotNull INUIAddVoiceShortcutButton addVoiceShortcutButton);

    @Generated
    @Selector("presentEditVoiceShortcutViewController:forAddVoiceShortcutButton:")
    void presentEditVoiceShortcutViewControllerForAddVoiceShortcutButton(
            @NotNull INUIEditVoiceShortcutViewController editVoiceShortcutViewController,
            @NotNull INUIAddVoiceShortcutButton addVoiceShortcutButton);
}