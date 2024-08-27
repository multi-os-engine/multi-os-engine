package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UITextSelectionRect;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] UITextSelectionHighlightView
 * 
 * A view that displays a tinted highlight behind rendered text to indicate selection.
 * 
 * When a selection is ranged (i.e., length is > 0), a highlight view is shown to indicate the selected text range.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextSelectionHighlightView")
public interface UITextSelectionHighlightView extends UICoordinateSpace {
    /**
     * A collection of @c UITextSelectionRects representing the geometry of the current selection. Rects are expected to
     * be in the
     * receiver's coordinate space.
     */
    @Generated
    @Selector("selectionRects")
    @NotNull
    NSArray<? extends UITextSelectionRect> selectionRects();

    /**
     * A collection of @c UITextSelectionRects representing the geometry of the current selection. Rects are expected to
     * be in the
     * receiver's coordinate space.
     */
    @Generated
    @Selector("setSelectionRects:")
    void setSelectionRects(@NotNull NSArray<? extends UITextSelectionRect> value);
}