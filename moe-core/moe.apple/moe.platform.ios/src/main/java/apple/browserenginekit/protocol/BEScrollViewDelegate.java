package apple.browserenginekit.protocol;

import apple.browserenginekit.BEScrollView;
import apple.browserenginekit.BEScrollViewScrollUpdate;
import apple.uikit.protocol.UIScrollViewDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEScrollViewDelegate")
public interface BEScrollViewDelegate extends UIScrollViewDelegate {
    /**
     * In order to implement CSS rendering, it may be necessary to make two scroll views siblings in the view tree that
     * are nested in the DOM.
     * This method may be used to specify that a sibling scroll view should be considered the parent of another, for the
     * purpose of gesture interaction and scroll transfer.
     * The parent is expected to be earlier in an in-order traversal of the view tree, since a parent would normally be
     * visually underneath its child.
     * Return nil for the default behavior of traversing up the view tree to find a parent scroll view.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("parentScrollViewForScrollView:")
    @Nullable
    default BEScrollView parentScrollViewForScrollView(@NotNull BEScrollView scrollView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If implemented, scroll updates will be passed to this delegate method before being handled by
     * the scroll view. The delegate may do some work, then must asynchronously call the completion block on the main
     * queue.
     * This method will be called multiple times, and the delegate must call the completions in order.
     * 
     * Extract information from `scrollUpdate` immediately, since its properties may change later,
     * and it's only safe to access on the main queue.
     * 
     * Call the completion with `handled` = YES to indicate that you handled the scroll event and
     * don't want BEScrollView to react to the scroll event.
     * Pass `handled` = NO to have the event be handled in the normal way (just delayed).
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("scrollView:handleScrollUpdate:completion:")
    default void scrollViewHandleScrollUpdateCompletion(@NotNull BEScrollView scrollView,
            @NotNull BEScrollViewScrollUpdate scrollUpdate,
            @ObjCBlock(name = "call_scrollViewHandleScrollUpdateCompletion") @NotNull Block_scrollViewHandleScrollUpdateCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scrollViewHandleScrollUpdateCompletion {
        @Generated
        void call_scrollViewHandleScrollUpdateCompletion(boolean handled);
    }
}