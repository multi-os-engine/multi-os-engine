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
    @Generated
    @IsOptional
    @Selector("dropInteraction:canHandleSession:")
    default boolean dropInteractionCanHandleSession(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:concludeDrop:")
    default void dropInteractionConcludeDrop(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:item:willAnimateDropWithAnimator:")
    default void dropInteractionItemWillAnimateDropWithAnimator(UIDropInteraction interaction, UIDragItem item,
            @Mapped(ObjCObjectMapper.class) Object animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:performDrop:")
    default void dropInteractionPerformDrop(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:previewForDroppingItem:withDefault:")
    default UITargetedDragPreview dropInteractionPreviewForDroppingItemWithDefault(UIDropInteraction interaction,
            UIDragItem item, UITargetedDragPreview defaultPreview) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidEnd:")
    default void dropInteractionSessionDidEnd(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidEnter:")
    default void dropInteractionSessionDidEnter(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidExit:")
    default void dropInteractionSessionDidExit(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("dropInteraction:sessionDidUpdate:")
    default UIDropProposal dropInteractionSessionDidUpdate(UIDropInteraction interaction,
            @Mapped(ObjCObjectMapper.class) Object session) {
        throw new java.lang.UnsupportedOperationException();
    }
}