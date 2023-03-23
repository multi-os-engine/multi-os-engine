package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.uikit.UIDragInteraction;
import apple.uikit.UIDragItem;
import apple.uikit.UITargetedDragPreview;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDragInteractionDelegate")
public interface UIDragInteractionDelegate {
    /**
     * Called when the cancel animation is about to start, once for each item,
     * whether it is visible or not.
     * Use the animator to animate your own changes alongside the system animation.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:item:willAnimateCancelWithAnimator:")
    default void dragInteractionItemWillAnimateCancelWithAnimator(UIDragInteraction interaction, UIDragItem item,
            @Mapped(ObjCObjectMapper.class) UIDragAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * To allow touches on this view to add items to an existing drag,
     * implement `-dragInteraction:itemsForAddingToSession:withTouchAtPoint:`.
     * 
     * If the provided session is an appropriate one to use, then return an array of items,
     * just like in `-dragInteraction:itemsForBeginningSession:`. They will be added to the
     * drag session.
     * Afterwards, `-dragInteraction:session:willAddItems:forInteraction:` will be sent
     * to each interaction which has contributed items to the session, including this one.
     * 
     * Otherwise, return an empty array. No items will be added, and the touch
     * will be handled as if the other drag session did not exist.
     * 
     * If this method is not implemented, acts as though an an empty array was returned.
     * 
     * Use the point, in the view's coordinate space, to determine what part of your view
     * has been touched.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:itemsForAddingToSession:withTouchAtPoint:")
    default NSArray<? extends UIDragItem> dragInteractionItemsForAddingToSessionWithTouchAtPoint(
            UIDragInteraction interaction, @Mapped(ObjCObjectMapper.class) UIDragSession session,
            @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Provide items to begin a drag.
     * 
     * If these items represent things that are displayed in a linear order
     * (for example, rows in a table), provide them in the same order, first
     * to last.
     * 
     * If an empty array is returned, then no drag will begin.
     */
    @Generated
    @Selector("dragInteraction:itemsForBeginningSession:")
    NSArray<? extends UIDragItem> dragInteractionItemsForBeginningSession(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session);

    /**
     * Return whether this drag's items' previews should be shown in their full
     * original size while over the source view. For instance, if you are reordering
     * items, you may want them not to shrink like they otherwise would.
     * 
     * If not implemented, defaults to false.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:prefersFullSizePreviewsForSession:")
    default boolean dragInteractionPrefersFullSizePreviewsForSession(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drag is cancelled, once for each visible item.
     * Provide a preview to animate the item back to where it belongs.
     * We provide `defaultPreview` which would move the current preview back to where it came from.
     * You may return:
     * - defaultPreview, to use it as-is
     * - nil, to fade the drag item in place
     * - [defaultPreview retargetedPreviewWithTarget:] to move the preview to a different target
     * - a UITargetedDragPreview that you create however you like
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:previewForCancellingItem:withDefault:")
    default UITargetedDragPreview dragInteractionPreviewForCancellingItemWithDefault(UIDragInteraction interaction,
            UIDragItem item, UITargetedDragPreview defaultPreview) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Provide a preview to display while lifting the drag item.
     * Return nil to indicate that this item is not visible and should have no lift animation.
     * If not implemented, a UITargetedDragPreview initialized with interaction.view will be used.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:previewForLiftingItem:session:")
    default UITargetedDragPreview dragInteractionPreviewForLiftingItemSession(UIDragInteraction interaction,
            UIDragItem item, @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user is done dragging and all related animations are
     * completed. The app should now return to its normal appearance.
     * 
     * If the operation is UIDropOperationCopy or UIDropOperationMove,
     * then data transfer will begin, and -dragInteraction:sessionDidTransferItems: will be called later.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:session:didEndWithOperation:")
    default void dragInteractionSessionDidEndWithOperation(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, @NUInt long operation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Similar to -dragInteraction:sessionWillBegin:, but for
     * items added to an session after it has already begun.
     * 
     * Note that the interaction that is causing the items to be added
     * may be different than the interaction that started the drag.
     * This method is called on the delegates of all interactions that ever added items
     * to this session. `addingInteraction` is the interaction that is causing
     * these new items to be dragged.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:session:willAddItems:forInteraction:")
    default void dragInteractionSessionWillAddItemsForInteraction(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, NSArray<? extends UIDragItem> items,
            UIDragInteraction addingInteraction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user is done dragging, and the drag will finish.
     * 
     * If the operation is UIDropOperationCancel or UIDropOperationForbidden,
     * the delegate should prepare its views to show an appropriate appearance
     * before the cancel animation starts.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:session:willEndWithOperation:")
    default void dragInteractionSessionWillEndWithOperation(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session, @NUInt long operation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return whether this drag allows the "move" drop operation to happen.
     * This only applies to drops inside the same app. Drops in other apps are always copies.
     * 
     * If true, then a UIDropInteraction's delegate's -dropInteraction:sessionDidUpdate:
     * may choose to return UIDropOperationMove, and that operation will be provided to
     * -dragInteraction:session:willEndWithOperation: and -dragInteraction:session:didEndWithOperation:.
     * 
     * If not implemented, defaults to true.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionAllowsMoveOperation:")
    default boolean dragInteractionSessionAllowsMoveOperation(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the drag has moved (because the user's touch moved).
     * Use -[UIDragSession locationInView:] to get its new location.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionDidMove:")
    default void dragInteractionSessionDidMove(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called after a drop happened and the handler of the drop has received
     * all of the data that it requested. You may now clean up any extra information
     * relating to those items or their item providers.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionDidTransferItems:")
    default void dragInteractionSessionDidTransferItems(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If there are two or more existing drag sessions, it may not be clear to the user
     * which session items will be added to. Therefore, by default, we do not add to any session.
     * 
     * If you *do* want to add the item to a session, implement
     * `-dragInteraction:sessionForAddingItems:withTouchAtPoint:` and return the
     * appropriate session. This should be rare.
     * 
     * To continue without adding items, return nil.
     * 
     * If this method is not implemented, defaults to nil.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionForAddingItems:withTouchAtPoint:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIDragSession dragInteractionSessionForAddingItemsWithTouchAtPoint(UIDragInteraction interaction,
            NSArray<?> sessions, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Return whether this drag is restricted to only this application.
     * 
     * If true, then the drag will be restricted. Only this application will be
     * able to see the drag, and other applications will not.
     * If the user drops it on another application, the drag will be cancelled.
     * 
     * If false, then the drag is not restricted. Other applications may see the drag,
     * and the user may drop it onto them.
     * 
     * If not implemented, defaults to false.
     * 
     * Note that this method is called only on devices that support dragging across applications.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionIsRestrictedToDraggingApplication:")
    default boolean dragInteractionSessionIsRestrictedToDraggingApplication(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the the items are in their fully lifted appearance,
     * and the user has started to drag the items away.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionWillBegin:")
    default void dragInteractionSessionWillBegin(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the lift animation is about to start.
     * Use the animator to animate your own changes alongside the system animation,
     * or to be called when the lift animation completes.
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:willAnimateLiftWithAnimator:session:")
    default void dragInteractionWillAnimateLiftWithAnimatorSession(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UIDragAnimating animator,
            @Mapped(ObjCObjectMapper.class) UIDragSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
