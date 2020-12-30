package apple.uikit.protocol;

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Objects conforming to UIFocusItemScrollableContainer are updated accordingly to ensure the
 * focused item remains visible on the screen.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusItemScrollableContainer")
public interface UIFocusItemScrollableContainer extends UIFocusItemContainer {
    /**
     * The current content offset of this scrollable container. If the scrollable container has a `bounds` property, `bounds.origin` must be equal to `contentOffset`.
     */
    @Generated
    @Selector("contentOffset")
    @ByValue
    CGPoint contentOffset();

    /**
     * The total size of the content contained by this container. If this size exceeds the size of
     * this container's visible size, then scrolling is possible.
     */
    @Generated
    @Selector("contentSize")
    @ByValue
    CGSize contentSize();

    /**
     * The current content offset of this scrollable container. If the scrollable container has a `bounds` property, `bounds.origin` must be equal to `contentOffset`.
     */
    @Generated
    @Selector("setContentOffset:")
    void setContentOffset(@ByValue CGPoint value);

    /**
     * The visible size of this scrollable container.
     */
    @Generated
    @Selector("visibleSize")
    @ByValue
    CGSize visibleSize();
}