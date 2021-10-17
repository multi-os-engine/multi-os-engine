package apple.uikit.protocol;

import apple.uikit.UITargetedDragPreview;
import apple.uikit.UITextDropProposal;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDropDelegate")
public interface UITextDropDelegate {
    /**
     * Called when the drag has ended.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidEnd:")
    default void textDroppableViewDropSessionDidEnd(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a drag has entered the text view.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidEnter:")
    default void textDroppableViewDropSessionDidEnter(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drag has left the view.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidExit:")
    default void textDroppableViewDropSessionDidExit(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drag has updated. This is often, but not always, preceded by a call
     * to -textDroppableView:proposalForDrop:.
     * <p>
     * Note: this is called *very* frequently, so try to do minimal work.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidUpdate:")
    default void textDroppableViewDropSessionDidUpdate(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Provide a custom preview for dropping text into the text control.
     * <p>
     * Only one preview is used, regardless of the number of items being dropped.
     * Because we're animating into one range of text, there is no need for individual
     * previews.
     * <p>
     * The defaultPreview is the preview that the control would normally use
     * to animate the drop. It is based on the (ordered) combination of text
     * representations for each item. (See UITextPasteDelegate to customize it.)
     * It resembles the text that will be inserted into the view.
     * <p>
     * If any of the items have not finished loading, this will be an animation into the
     * location of the caret when the drop was being performed.
     * <p>
     * Return nil to use the default preview of the underlying drop interaction.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:previewForDroppingAllItemsWithDefault:")
    default UITargetedDragPreview textDroppableViewPreviewForDroppingAllItemsWithDefault(UIView textDroppableView,
            UITargetedDragPreview defaultPreview) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Defines whether a text control can accept a drag.
     * Return a UITextDropProposal here to change the drag behavior.
     * This will get called:
     * - when the drag enters the text control,
     * - when the *text position* changes while the drag moves over the text control
     * - when the drag session changes (e.g. items were added)
     * <p>
     * Note: this is called frequently, so try to do minimal work.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:proposalForDrop:")
    default UITextDropProposal textDroppableViewProposalForDrop(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UITextDropRequest drop) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * By default, when the text control is not editable, drops will not occur.
     * However, there might be scenarios where dropping into a non-editable text control
     * is desirable.
     * If not implemented, uses UITextDropEditabilityNo.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:willBecomeEditableForDrop:")
    @NUInt
    default long textDroppableViewWillBecomeEditableForDrop(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UITextDropRequest drop) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates that the drop is about to be performed.
     * To modify the result of the items to be dropped, provide a pasteHandler on
     * the text control, which will handle the conversion and pasting of the text.
     */
    @Generated
    @IsOptional
    @Selector("textDroppableView:willPerformDrop:")
    default void textDroppableViewWillPerformDrop(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) UITextDropRequest drop) {
        throw new java.lang.UnsupportedOperationException();
    }
}
