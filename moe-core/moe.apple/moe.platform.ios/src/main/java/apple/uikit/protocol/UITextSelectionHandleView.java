package apple.uikit.protocol;

import apple.corefoundation.struct.CGRect;
import apple.uikit.UIBezierPath;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] UITextSelectionHandleView
 * 
 * A view that represents a selection handle drawn at the edges of contiguous selection ranges.
 * 
 * When a selection is ranged (i.e., length is > 0), and the device supports range adjustment via a gesture,
 * selection handles ("lollipops") are displayed at the edges of the contiguous selection (usually a
 * UITextSelectionHighlightView).
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextSelectionHandleView")
public interface UITextSelectionHandleView extends UICoordinateSpace {
    /**
     * If applicable, a custom shape for the lollipop stem. Default is @c nil, which results in a rounded rect style
     * based on bounds.
     */
    @Generated
    @Selector("customShape")
    @Nullable
    UIBezierPath customShape();

    /**
     * Controls which direction the handle is oriented. For example, NSDirectionalRectEdgeLeading indicates the handle
     * is on the leading
     * edge, so the dot will be rendered on top.
     */
    @Generated
    @Selector("direction")
    @NUInt
    long direction();

    /**
     * Convenience accessor for @c direction calculations.
     */
    @Generated
    @Selector("isVertical")
    boolean isVertical();

    /**
     * Provides a preferred frame given @c rect based on the current appearance configuration.
     */
    @Generated
    @Selector("preferredFrameForRect:")
    @ByValue
    CGRect preferredFrameForRect(@ByValue CGRect rect);

    /**
     * If applicable, a custom shape for the lollipop stem. Default is @c nil, which results in a rounded rect style
     * based on bounds.
     */
    @Generated
    @Selector("setCustomShape:")
    void setCustomShape(@Nullable UIBezierPath value);

    /**
     * Controls which direction the handle is oriented. For example, NSDirectionalRectEdgeLeading indicates the handle
     * is on the leading
     * edge, so the dot will be rendered on top.
     */
    @Generated
    @Selector("setDirection:")
    void setDirection(@NUInt long value);
}