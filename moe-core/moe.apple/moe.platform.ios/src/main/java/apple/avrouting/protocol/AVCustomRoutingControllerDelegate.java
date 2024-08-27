package apple.avrouting.protocol;

import apple.avrouting.AVCustomRoutingActionItem;
import apple.avrouting.AVCustomRoutingController;
import apple.avrouting.AVCustomRoutingEvent;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * A protocol for delegates of a custom routing controller.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCustomRoutingControllerDelegate")
public interface AVCustomRoutingControllerDelegate {
    /**
     * Tells the delegate when a user selects a custom item in the route picker.
     * 
     * - Parameters:
     * - controller: A custom routing controller.
     * 
     * - customActionItem: The selected action item.
     */
    @Generated
    @IsOptional
    @Selector("customRoutingController:didSelectItem:")
    default void customRoutingControllerDidSelectItem(@NotNull AVCustomRoutingController controller,
            @NotNull AVCustomRoutingActionItem customActionItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate when a routing event times out.
     * 
     * Adopt this method to clean up any in-progress connection attempts.
     * 
     * - Parameters:
     * - controller: A custom routing controller.
     * 
     * - event: An event that times out.
     */
    @Generated
    @IsOptional
    @Selector("customRoutingController:eventDidTimeOut:")
    default void customRoutingControllerEventDidTimeOut(@NotNull AVCustomRoutingController controller,
            @NotNull AVCustomRoutingEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Connects to, or disconnects from, a device when a user requests it in the
     * picker.
     * 
     * - Parameters:
     * - controller: A custom routing controller.
     * 
     * - event: The routing event to handle.
     * 
     * - completionHandler: A completion handler to call after processing the
     * event. Pass <doc://com.apple.documentation/documentation/objectivec/yes> to
     * the completion handler if the activation, reactivation, or deactivation of
     * the route succeeds, and
     * <doc://com.apple.documentation/documentation/objectivec/no>, otherwise.
     */
    @Generated
    @Selector("customRoutingController:handleEvent:completionHandler:")
    void customRoutingControllerHandleEventCompletionHandler(@NotNull AVCustomRoutingController controller,
            @NotNull AVCustomRoutingEvent event,
            @NotNull @ObjCBlock(name = "call_customRoutingControllerHandleEventCompletionHandler") Block_customRoutingControllerHandleEventCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customRoutingControllerHandleEventCompletionHandler {
        @Generated
        void call_customRoutingControllerHandleEventCompletionHandler(boolean success);
    }
}