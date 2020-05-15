package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.uikit.UILargeContentViewerInteraction;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UILargeContentViewerInteractionDelegate")
public interface UILargeContentViewerInteractionDelegate {
    @Generated
    @IsOptional
    @Selector("largeContentViewerInteraction:didEndOnItem:atPoint:")
    default void largeContentViewerInteractionDidEndOnItemAtPoint(UILargeContentViewerInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UILargeContentViewerItem item, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("largeContentViewerInteraction:itemAtPoint:")
    @MappedReturn(ObjCObjectMapper.class)
    default UILargeContentViewerItem largeContentViewerInteractionItemAtPoint(
            UILargeContentViewerInteraction interaction, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("viewControllerForLargeContentViewerInteraction:")
    default UIViewController viewControllerForLargeContentViewerInteraction(
            UILargeContentViewerInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}