package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.protocol.NSItemProviderReading;
import apple.uikit.UIDragItem;
import apple.uikit.UIView;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDragDropSession")
public interface UIDragDropSession {
    /**
     * Whether this session allows moving, or not.
     * 
     * This is determined based on the UIDragInteraction's delegate's
     * `-dragInteraction:sessionAllowsMoveOperation:`.
     * 
     * If true, then the delegate of UIDropInteraction is allowed to return `UIDropOperationMove`
     * from `-dropInteraction:sessionDidUpdate:`.
     */
    @Generated
    @Selector("allowsMoveOperation")
    boolean allowsMoveOperation();

    /**
     * Returns true if any of the session's items could create any objects of the specified class.
     */
    @Generated
    @Selector("canLoadObjectsOfClass:")
    boolean canLoadObjectsOfClass(@NotNull @Mapped(ObjCObjectMapper.class) NSItemProviderReading aClass);

    /**
     * Convenience methods to iterate through this session's `items`.
     * 
     * Returns true if any of the session's items conforms to any of the specified UTIs.
     */
    @Generated
    @Selector("hasItemsConformingToTypeIdentifiers:")
    boolean hasItemsConformingToTypeIdentifiers(@NotNull NSArray<String> typeIdentifiers);

    /**
     * Whether this session is restricted to the application that began the drag.
     * 
     * This is determined based on the UIDragInteraction's delegate's
     * `-dragInteraction:sessionIsRestrictedToDraggingApplication:`.
     */
    @Generated
    @Selector("isRestrictedToDraggingApplication")
    boolean isRestrictedToDraggingApplication();

    /**
     * The items in the session.
     * 
     * Before the drop happens, the items' NSItemProviders do not allow
     * the data in the NSItemProvider to be loaded.
     * However, `registeredTypeIdentifiers` and metadata are available at any time.
     * You may request the data only inside the UIDropInteractionDelegate's implementation
     * of `-dropInteraction:performDrop:`.
     * 
     * When handling the drop, if you display dropped items in a linear order,
     * place them in this order, first to last.
     */
    @NotNull
    @Generated
    @Selector("items")
    NSArray<? extends UIDragItem> items();

    /**
     * The location of the drag in the specified view.
     */
    @Generated
    @Selector("locationInView:")
    @ByValue
    CGPoint locationInView(@NotNull UIView view);
}
