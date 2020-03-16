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

@Generated
@Library("IntentsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUIAddVoiceShortcutViewControllerDelegate")
public interface INUIAddVoiceShortcutViewControllerDelegate {
    @Generated
    @Selector("addVoiceShortcutViewController:didFinishWithVoiceShortcut:error:")
    void addVoiceShortcutViewControllerDidFinishWithVoiceShortcutError(INUIAddVoiceShortcutViewController controller,
            INVoiceShortcut voiceShortcut, NSError error);

    @Generated
    @Selector("addVoiceShortcutViewControllerDidCancel:")
    void addVoiceShortcutViewControllerDidCancel(INUIAddVoiceShortcutViewController controller);
}