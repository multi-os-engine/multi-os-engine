package apple.browserenginekit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("BrowserEngineKit")
@Runtime(CRuntime.class)
public final class BrowserEngineKit {
    static {
        NatJ.register();
    }

    @Generated
    private BrowserEngineKit() {
    }

    /**
     * Used when the element is an item in a menu.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native long BEAccessibilityTraitMenuItem();

    /**
     * Used when the element should be treated as a button that opens a pop-up.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native long BEAccessibilityTraitPopUpButton();

    /**
     * Used when the element should be treated as a radio button.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native long BEAccessibilityTraitRadioButton();

    /**
     * Used when the element should be treated as read-only.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native long BEAccessibilityTraitReadOnly();

    /**
     * Used when the element should be treated as visited (e.g. for a link in a webpage).
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native long BEAccessibilityTraitVisited();

    /**
     * Posted when the selection inside an element changes.
     * 
     * When text inside an editable element changes, or the editing cursor position changes, this notification
     * must be posted alongside, and after, BEAccessibilityValueChangedNotification.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native int BEAccessibilitySelectionChangedNotification();

    /**
     * Posted when the value of an element changes. Some examples of when this notification is appropriate:
     * - The value of an input element changes
     * - Text is added or removed from any text control
     * - aria-valuenow or aria-valuetext changes
     * 
     * Furthermore, when text inside an editable element changes, or the editing cursor position changes, this
     * notification
     * must be posted alongside, and before, BEAccessibilitySelectionChangedNotification.
     * 
     * API-Since: 18.0
     */
    @Generated
    @CVariable()
    public static native int BEAccessibilityValueChangedNotification();
}