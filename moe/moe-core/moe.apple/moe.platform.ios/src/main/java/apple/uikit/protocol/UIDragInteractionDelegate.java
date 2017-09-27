package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDragInteractionDelegate")
public interface UIDragInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("dragInteraction:item:willAnimateCancelWithAnimator:")
    default void dragInteractionItemWillAnimateCancelWithAnimator(UIDragInteraction interaction, UIDragItem item,
            @Mapped(ObjCObjectMapper.class) Object animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:itemsForAddingToSession:withTouchAtPoint:")
    default NSArray<? extends UIDragItem> dragInteractionItemsForAddingToSessionWithTouchAtPoint(
            UIDragInteraction interaction, @Mapped(ObjCObjectMapper.class) Object session, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("dragInteraction:itemsForBeginningSession:")
    NSArray<? extends UIDragItem> dragInteractionItemsForBeginningSession(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session);

    @Generated
    @IsOptional
    @Selector("dragInteraction:prefersFullSizePreviewsForSession:")
    default boolean dragInteractionPrefersFullSizePreviewsForSession(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:previewForCancellingItem:withDefault:")
    default UITargetedDragPreview dragInteractionPreviewForCancellingItemWithDefault(UIDragInteraction interaction,
            UIDragItem item, UITargetedDragPreview defaultPreview) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:previewForLiftingItem:session:")
    default UITargetedDragPreview dragInteractionPreviewForLiftingItemSession(UIDragInteraction interaction,
            UIDragItem item, @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:session:didEndWithOperation:")
    default void dragInteractionSessionDidEndWithOperation(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session, @NUInt long operation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:session:willAddItems:forInteraction:")
    default void dragInteractionSessionWillAddItemsForInteraction(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session, NSArray<? extends UIDragItem> items,
            UIDragInteraction addingInteraction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:session:willEndWithOperation:")
    default void dragInteractionSessionWillEndWithOperation(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session, @NUInt long operation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionAllowsMoveOperation:")
    default boolean dragInteractionSessionAllowsMoveOperation(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionDidMove:")
    default void dragInteractionSessionDidMove(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionDidTransferItems:")
    default void dragInteractionSessionDidTransferItems(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionForAddingItems:withTouchAtPoint:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object dragInteractionSessionForAddingItemsWithTouchAtPoint(UIDragInteraction interaction,
            NSArray<?> sessions, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionIsRestrictedToDraggingApplication:")
    default boolean dragInteractionSessionIsRestrictedToDraggingApplication(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:sessionWillBegin:")
    default void dragInteractionSessionWillBegin(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dragInteraction:willAnimateLiftWithAnimator:session:")
    default void dragInteractionWillAnimateLiftWithAnimatorSession(UIDragInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object animator, @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }
}