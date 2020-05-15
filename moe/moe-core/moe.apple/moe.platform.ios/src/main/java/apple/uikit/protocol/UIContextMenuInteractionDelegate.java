package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.uikit.UIContextMenuConfiguration;
import apple.uikit.UIContextMenuInteraction;
import apple.uikit.UITargetedPreview;
import org.moe.natj.general.ann.ByValue;
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
@ObjCProtocolName("UIContextMenuInteractionDelegate")
public interface UIContextMenuInteractionDelegate {
    @Generated
    @Selector("contextMenuInteraction:configurationForMenuAtLocation:")
    UIContextMenuConfiguration contextMenuInteractionConfigurationForMenuAtLocation(
            UIContextMenuInteraction interaction, @ByValue CGPoint location);

    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:previewForDismissingMenuWithConfiguration:")
    default UITargetedPreview contextMenuInteractionPreviewForDismissingMenuWithConfiguration(
            UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:previewForHighlightingMenuWithConfiguration:")
    default UITargetedPreview contextMenuInteractionPreviewForHighlightingMenuWithConfiguration(
            UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willDisplayMenuForConfiguration:animator:")
    default void contextMenuInteractionWillDisplayMenuForConfigurationAnimator(UIContextMenuInteraction interaction,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willEndForConfiguration:animator:")
    default void contextMenuInteractionWillEndForConfigurationAnimator(UIContextMenuInteraction interaction,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willPerformPreviewActionForMenuWithConfiguration:animator:")
    default void contextMenuInteractionWillPerformPreviewActionForMenuWithConfigurationAnimator(
            UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator) {
        throw new java.lang.UnsupportedOperationException();
    }
}