package apple.uikit.protocol;

import apple.uikit.UIDragItem;
import apple.uikit.UIDropInteraction;
import apple.uikit.UIDropProposal;
import apple.uikit.UITargetedDragPreview;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDropInteractionDelegate")
public interface UIDropInteractionDelegate {
    /**
     * Return whether the delegate is interested in the given session.
     * If this method is not implemented, or if it returns true, then the
     * other delegate methods will be called, starting with `-dropInteraction:sessionDidEnter:`.
     * If it returns false, this interaction will ignore this session. (We may ask again
     * if something significant about the session changes, like the items in it.)
     * 
     * Note that returning true does not mean that the delegate definitely *will* accept this drop,
     * just that it *might* want to accept the drop.
     * To accept it, you must also implement `-dropInteraction:sessionDidUpdate:` and return a
     * UIDropProposal with an appropriate operation.
     * 
     * This method is commonly used to check whether the session contains any
     * items that this delegate can consume. Use `UIDropSession`'s convenience methods
     * `-hasItemsConformingToTypeIdentifiers:`, `-canLoadObjectsOfClass:`, etc.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:canHandleSession:")
    default boolean dropInteractionCanHandleSession(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user has dropped onto this interaction's view,
     * after `-dropInteraction:performDrop:` has been called,
     * and all resulting drop animations have completed.
     * 
     * The delegate should cause the interaction's view to draw in its final post-drop state.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:concludeDrop:")
    default void dropInteractionConcludeDrop(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop animation is about to start, once for each item,
     * whether it is visible or not.
     * Use the animator to animate your own changes alongside the system animation.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:item:willAnimateDropWithAnimator:")
    default void dropInteractionItemWillAnimateDropWithAnimator(UIDropInteraction interaction, UIDragItem item,
            @Mapped(ObjCObjectMapper.class) UIDragAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user drops onto this interaction's view.
     * The delegate should now request data from the session's
     * items' item providers. Data may be requested *only* during
     * the scope of this method.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:performDrop:")
    default void dropInteractionPerformDrop(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drop happens, after `-dropInteraction:performDrop:`, once for each visible item.
     * Provide a preview to animate the item to where it belongs.
     * We provide `defaultPreview` which would leave the current preview where the item was dropped.
     * You may return:
     * - defaultPreview, to use it as-is
     * - nil, to fade and shrink the drag item in place
     * - [defaultPreview retargetedPreviewWithTarget:] to move the preview to a different target
     * - a UITargetedDragPreview that you create however you like
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:previewForDroppingItem:withDefault:")
    default UITargetedDragPreview dropInteractionPreviewForDroppingItemWithDefault(UIDropInteraction interaction,
            UIDragItem item, UITargetedDragPreview defaultPreview) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * When the drag session ends, for any reason, this method will be called
     * for *every* interaction that ever received `-dropInteraction:sessionDidEnter:`,
     * `-dropInteraction:sessionDidUpdate:`, or `-dropInteraction:sessionDidExit:`.
     * 
     * If you were keeping track of the session for any reason, you may now forget it.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidEnd:")
    default void dropInteractionSessionDidEnd(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a drag enters the view.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidEnter:")
    default void dropInteractionSessionDidEnter(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drag has exited the interaction's view.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidExit:")
    default void dropInteractionSessionDidExit(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drag enters the interaction's view, or when when the drag
     * moves while inside the view, or if items are added to the drag while inside the view.
     * 
     * You *must* implement this method to accept a drop.
     * Return a `UIDropProposal` that contains the operation that the delegate
     * would like to perform. (Note that you may use `UIDropOperationMove` only if
     * session.allowsMoveOperation is true.)
     * 
     * You may also set other properties on the `UIDropProposal` to change the appearance
     * of the drag over this view.
     * 
     * Use the session's `-locationInView:` to get a point to use for hit testing.
     */
    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidUpdate:")
    default UIDropProposal dropInteractionSessionDidUpdate(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDropSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}