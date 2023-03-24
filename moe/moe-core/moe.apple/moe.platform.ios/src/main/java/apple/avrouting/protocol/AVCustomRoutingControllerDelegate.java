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
 * [@protocol] AVCustomRoutingControllerDelegate
 * 
 * A protocol for delegates of AVCustomRoutingController.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVCustomRoutingControllerDelegate")
public interface AVCustomRoutingControllerDelegate {
    /**
     * customRoutingController:didSelectItem:
     * 
     * Informs the delegate that the user selected a custom item in the route picker.
     */
    @Generated
    @IsOptional
    @Selector("customRoutingController:didSelectItem:")
    default void customRoutingControllerDidSelectItem(@NotNull AVCustomRoutingController controller,
            @NotNull AVCustomRoutingActionItem customActionItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * customRoutingController:eventDidTimeOut:
     * 
     * The delegate can implement this method in order know when a route event timed out. This gives them a chance to
     * clean up any connection attempts that are currently in flight.
     * 
     * @param controller
     *                   The custom routing controller.
     * @param event
     *                   The route event that timed out.
     */
    @Generated
    @IsOptional
    @Selector("customRoutingController:eventDidTimeOut:")
    default void customRoutingControllerEventDidTimeOut(@NotNull AVCustomRoutingController controller,
            @NotNull AVCustomRoutingEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * customRoutingController:handleEvent:completionHandler:
     * 
     * The delegate needs to implement this method in order to both establish and tear down connection to a device when
     * a user requests it through the picker.
     * 
     * @param controller
     *                          The custom routing controller.
     * @param event
     *                          The route event for the delegate to process.
     * @param completionHandler
     *                          The completion handler the delegate needs to call after the event has been processed.
     *                          Pass YES to the completion handler if the activation, reactivation or deactivation of
     *                          the route was successful, and NO otherwise.
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