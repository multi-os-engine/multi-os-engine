package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIContextMenuInteractionCommitAnimating")
public interface UIContextMenuInteractionCommitAnimating extends UIContextMenuInteractionAnimating {
    /**
     * Preferred animation style for the menu's commit action. Triggered when the user taps the preview.
     */
    @Generated
    @Selector("preferredCommitStyle")
    @NInt
    long preferredCommitStyle();

    /**
     * Preferred animation style for the menu's commit action. Triggered when the user taps the preview.
     */
    @Generated
    @Selector("setPreferredCommitStyle:")
    void setPreferredCommitStyle(@NInt long value);
}