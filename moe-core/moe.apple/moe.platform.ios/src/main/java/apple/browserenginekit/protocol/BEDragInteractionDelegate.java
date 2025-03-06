package apple.browserenginekit.protocol;

import apple.browserenginekit.BEDragInteraction;
import apple.corefoundation.struct.CGPoint;
import apple.foundation.NSArray;
import apple.uikit.UIDragItem;
import apple.uikit.protocol.UIDragInteractionDelegate;
import apple.uikit.protocol.UIDragSession;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEDragInteractionDelegate")
public interface BEDragInteractionDelegate extends UIDragInteractionDelegate {
    /**
     * The asynchronous counterpart to `-dragInteraction:itemsForAddingToSession:withTouchAtPoint:` to allow
     * touches on this view to add items to an existing drag session. Please refer to the aforementioned delegate method
     * for its full
     * documentation.
     * 
     * If this method is implemented, then the `UIDragInteractionDelegate` counterpart method will no longer be called.
     * 
     * You should call the `completion` block as soon as the items are ready. There is a system-defined
     * timeout before the system will treat the delegate call as returning an empty array. The `completion` block
     * returns `YES` if the drag session did add items to the session successfully, and `NO` otherwise, to allow
     * clients to perform any clean-up if necessary.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:itemsForAddingToSession:forTouchAtPoint:completion:")
    default void dragInteractionItemsForAddingToSessionForTouchAtPointCompletion(
            @NotNull BEDragInteraction dragInteraction, @Mapped(ObjCObjectMapper.class) @NotNull UIDragSession session,
            @ByValue CGPoint point,
            @ObjCBlock(name = "call_dragInteractionItemsForAddingToSessionForTouchAtPointCompletion") @NotNull Block_dragInteractionItemsForAddingToSessionForTouchAtPointCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dragInteractionItemsForAddingToSessionForTouchAtPointCompletion {
        @Generated
        boolean call_dragInteractionItemsForAddingToSessionForTouchAtPointCompletion(
                @NotNull NSArray<? extends UIDragItem> arg0);
    }

    /**
     * Called when the drag interaction has begun, to allow the delegate to prepare for the drag session before
     * the system requests drag items through `-dragInteraction:itemsForBeginningSession:`.
     * 
     * You should call the `completion` block as soon as the drag session is prepared, as to minimize the delay
     * from the user interaction from the drag gesture. There is a system-defined timeout before the drag session is
     * failed if the `completion` is not called in time. The `completion` block returns `YES` if the drag session did
     * prepare successfully prepare, and `NO` otherwise, to allow clients to perform any clean-up if necessary.
     * 
     * API-Since: 17.4
     */
    @Generated
    @IsOptional
    @Selector("dragInteraction:prepareDragSession:completion:")
    default void dragInteractionPrepareDragSessionCompletion(@NotNull BEDragInteraction dragInteraction,
            @Mapped(ObjCObjectMapper.class) @NotNull UIDragSession session,
            @ObjCBlock(name = "call_dragInteractionPrepareDragSessionCompletion") @NotNull Block_dragInteractionPrepareDragSessionCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dragInteractionPrepareDragSessionCompletion {
        @Generated
        boolean call_dragInteractionPrepareDragSessionCompletion();
    }
}