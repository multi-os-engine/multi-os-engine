package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * UISearchBar officially conformed to UITextInputTraits in iOS 8.0 and privately conformed in iOS 7.0. Prior to 7.0,
 * UISearchBar only implemented these four traits: autocapitalizationType, autocorrectionType, spellCheckingType and
 * keyboardType. If your deployment target is <7.0 and you are using any trait other than one of the four mentioned, you
 * must check its availability with respondsToSelector:
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILookToDictateCapable")
public interface UILookToDictateCapable {
    /**
     * Enable or disable 'Look To Dictate' on the receiver.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("isLookToDictateEnabled")
    boolean isLookToDictateEnabled();

    /**
     * Enable or disable 'Look To Dictate' on the receiver.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setLookToDictateEnabled:")
    void setLookToDictateEnabled(boolean value);
}