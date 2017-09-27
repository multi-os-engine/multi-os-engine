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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextDragDelegate")
public interface UITextDragDelegate {
    @Generated
    @IsOptional
    @Selector("textDraggableView:dragPreviewForLiftingItem:session:")
    default UITargetedDragPreview textDraggableViewDragPreviewForLiftingItemSession(UIView textDraggableView,
            UIDragItem item, @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDraggableView:dragSessionDidEnd:withOperation:")
    default void textDraggableViewDragSessionDidEndWithOperation(UIView textDraggableView,
            @Mapped(ObjCObjectMapper.class) Object session, @NUInt long operation) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDraggableView:dragSessionWillBegin:")
    default void textDraggableViewDragSessionWillBegin(UIView textDraggableView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDraggableView:itemsForDrag:")
    default NSArray<? extends UIDragItem> textDraggableViewItemsForDrag(UIView textDraggableView,
            @Mapped(ObjCObjectMapper.class) Object dragRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDraggableView:willAnimateLiftWithAnimator:session:")
    default void textDraggableViewWillAnimateLiftWithAnimatorSession(UIView textDraggableView,
            @Mapped(ObjCObjectMapper.class) Object animator, @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }
}