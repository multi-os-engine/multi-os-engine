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
    /**
     * Performs an action when the large content viewer gesture ends at the location of the given item.
     * (The point in the interaction's view's coordinate system is also provided.)
     * For example, you may wish to perform the action that would have occurred if the user had tapped on that item.
     * If this is not implemented and the gesture ends at the location of a UIControl object, it will send a UIControlEventTouchUpInside event.
     * This method is called only if the gesture ends successfully (not if it fails or gets canceled).
     */
    @Generated
    @IsOptional
    @Selector("largeContentViewerInteraction:didEndOnItem:atPoint:")
    default void largeContentViewerInteractionDidEndOnItemAtPoint(UILargeContentViewerInteraction interaction,
            @Mapped(ObjCObjectMapper.class) UILargeContentViewerItem item, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the item at a given point in the interaction's view's coordinate system.
     * If this is not implemented, -[UIView pointInside:withEvent:] will be called recursively on the interaction's view to find an appropriate view.
     */
    @Generated
    @IsOptional
    @Selector("largeContentViewerInteraction:itemAtPoint:")
    @MappedReturn(ObjCObjectMapper.class)
    default UILargeContentViewerItem largeContentViewerInteractionItemAtPoint(
            UILargeContentViewerInteraction interaction, @ByValue CGPoint point) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Returns the view controller whose region of the screen should be used to display the large content viewer.
     * If this is not implemented, a view controller that contains the interaction's view will be chosen.
     */
    @Generated
    @IsOptional
    @Selector("viewControllerForLargeContentViewerInteraction:")
    default UIViewController viewControllerForLargeContentViewerInteraction(
            UILargeContentViewerInteraction interaction) {
        throw new java.lang.UnsupportedOperationException();
    }
}