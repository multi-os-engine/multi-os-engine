package apple.sharedwithyou.protocol;

import apple.sharedwithyou.SWHighlightCenter;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] SWHighlightCenterDelegate
 * 
 * The delegate is notified when there are changes to the list of surfaced highlights, or when the enablement settings
 * change.
 */
@Generated
@Library("SharedWithYou")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SWHighlightCenterDelegate")
public interface SWHighlightCenterDelegate {
    /**
     * Notifies the delegate that the list, or rank order of surfaced highlights has changed.
     * 
     * When this method is called, it is the app's responsibility to update any displayed highlights to match the
     * updated list. Only the highlights provided should have an indication of having been shared. If no highlights are
     * provided in the list, any links previously indicated as shared should be removed. The array is a priority-ordered
     * list, where the first element in the array is deemed to be most relevant to the user at the time this method is
     * called. The list of provided highlights will be empty if there are no highlights, or when the user has not given
     * permission for a particular app to display highlights.
     */
    @Generated
    @Selector("highlightCenterHighlightsDidChange:")
    void highlightCenterHighlightsDidChange(SWHighlightCenter highlightCenter);
}