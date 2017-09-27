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
    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidEnd:")
    default void textDroppableViewDropSessionDidEnd(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidEnter:")
    default void textDroppableViewDropSessionDidEnter(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidExit:")
    default void textDroppableViewDropSessionDidExit(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:dropSessionDidUpdate:")
    default void textDroppableViewDropSessionDidUpdate(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:previewForDroppingAllItemsWithDefault:")
    default UITargetedDragPreview textDroppableViewPreviewForDroppingAllItemsWithDefault(UIView textDroppableView,
            UITargetedDragPreview defaultPreview) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:proposalForDrop:")
    default UITextDropProposal textDroppableViewProposalForDrop(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object drop) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:willBecomeEditableForDrop:")
    @NUInt
    default long textDroppableViewWillBecomeEditableForDrop(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object drop) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("textDroppableView:willPerformDrop:")
    default void textDroppableViewWillPerformDrop(UIView textDroppableView,
            @Mapped(ObjCObjectMapper.class) Object drop) {
        throw new java.lang.UnsupportedOperationException();
    }
}