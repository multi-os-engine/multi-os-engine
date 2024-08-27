package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UIDragItem;
import apple.uikit.UITargetedDragPreview;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDragDelegate")
public interface UITextDragDelegate {
    /**
     * Provide a preview for lifting the item out of the text control.
     * If you return nil, the drag interaction will provide a default preview.
     * 
     * Note: This will not be called for items obtained from a UITextDragRequest’s suggestedItems
     * (via textDraggableView:itemsForDrag:).
     * The text control will use its own previews for those items.
     */
    @Nullable
    @Generated
    @IsOptional
    @Selector("textDraggableView:dragPreviewForLiftingItem:session:")
    default UITargetedDragPreview textDraggableViewDragPreviewForLiftingItemSession(@NotNull UIView textDraggableView,
            @NotNull UIDragItem item, @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a drag out of this text control has ended.
     * The operation tells you what happened on the drop side.
     */
    @Generated
    @IsOptional
    @Selector("textDraggableView:dragSessionDidEnd:withOperation:")
    default void textDraggableViewDragSessionDidEndWithOperation(@NotNull UIView textDraggableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session, @NUInt long operation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user actually begins dragging.
     * At that point, the text has lifted out of the text control.
     * `textDraggableView:dragSessionDidEnd:withOperation:` will be called when the drag ends.
     */
    @Generated
    @IsOptional
    @Selector("textDraggableView:dragSessionWillBegin:")
    default void textDraggableViewDragSessionWillBegin(@NotNull UIView textDraggableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Implement this to provide custom drag items when dragging out of a text control.
     * If you return an empty array here, no drag will occur.
     * The drag request provides the text range from which the user is dragging, and
     * a set of default drag items which would be used if this delegate method were
     * not implemented. You can modify and/or augment these at will.
     * 
     * Note: this method might be called more than once. For instance, if the control
     * is asked to provide more items to add to an existing session.
     * You can detect this by checking the `existingItems` in the drag request.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("textDraggableView:itemsForDrag:")
    default NSArray<? extends UIDragItem> textDraggableViewItemsForDrag(@NotNull UIView textDraggableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UITextDragRequest dragRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the lift animation is about to start.
     * Use the animator to animate your own changes alongside the system animation,
     * or to be called when the lift animation completes.
     */
    @Generated
    @IsOptional
    @Selector("textDraggableView:willAnimateLiftWithAnimator:session:")
    default void textDraggableViewWillAnimateLiftWithAnimatorSession(@NotNull UIView textDraggableView,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragAnimating animator,
            @NotNull @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
