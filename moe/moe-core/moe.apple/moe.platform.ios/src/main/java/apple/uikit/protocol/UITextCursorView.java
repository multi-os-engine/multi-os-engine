package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @ protocol UITextCursorView
 * 
 * A view that displays a flashing cursor (aka "caret") view.
 * 
 * When a selection is not ranged (or has a zero-length), a cursor view is displayed.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextCursorView")
public interface UITextCursorView extends UICoordinateSpace {
    /**
     * Enables the blink animation. Disabled by default.
     */
    @Generated
    @Selector("isBlinking")
    boolean isBlinking();

    /**
     * Call this when the cursor is moving (i.e., during typing) to make sure the cursor doesn't blink while text is
     * being inserted.
     */
    @Generated
    @Selector("resetBlinkAnimation")
    void resetBlinkAnimation();

    /**
     * Enables the blink animation. Disabled by default.
     */
    @Generated
    @Selector("setBlinking:")
    void setBlinking(boolean value);
}