package apple.gamecontroller.protocol;

import apple.gamecontroller.GCPhysicalInputProfile;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * API-Since: 14.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCDevice")
public interface GCDevice {
    /**
     * The dispatch queue that element value change handlers are submitted on. The default queue is main, and setting
     * this to any
     * other queue will make value change handlers dispatch async on the given queue. This is useful if the main game
     * loop
     * of the application is not on main, or if input logic is handled on another thread from the main game loop.
     * 
     * @see GCControllerAxisInput.valueChangedHandler
     * @see GCControllerButtonInput.valueChangedHandler
     * @see GCControllerButtonInput.pressedChangedHandler
     * @see GCControllerDirectionPad.valueChangedHandler
     * @see GCMotion.valueChangedHandler
     * 
     *      API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("handlerQueue")
    dispatch_queue_t handlerQueue();

    /**
     * Gets the physical input profile for the device.
     * 
     * [@note] This is equivalent to the controller's gamepad, microGamepad, or extendedGamepad instance.
     * 
     * @see GCController.microGamepad
     * @see GCController.extendedGamepad
     * 
     *      API-Since: 14.0
     *      Deprecated-Since: 16.0
     *      Deprecated-Message: Use the physicalInputProfile property on GCController instead. For GCKeyboard, use the
     *      keyboardInput property. For GCMouse, use the mouseInput property.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("physicalInputProfile")
    GCPhysicalInputProfile physicalInputProfile();

    /**
     * The product category the device belongs to. This is useful for setting appropriate UI elements based on what type
     * of device is connected.
     * 
     * @see GCProductCategories.h
     * 
     *      API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("productCategory")
    String productCategory();

    /**
     * The dispatch queue that element value change handlers are submitted on. The default queue is main, and setting
     * this to any
     * other queue will make value change handlers dispatch async on the given queue. This is useful if the main game
     * loop
     * of the application is not on main, or if input logic is handled on another thread from the main game loop.
     * 
     * @see GCControllerAxisInput.valueChangedHandler
     * @see GCControllerButtonInput.valueChangedHandler
     * @see GCControllerButtonInput.pressedChangedHandler
     * @see GCControllerDirectionPad.valueChangedHandler
     * @see GCMotion.valueChangedHandler
     * 
     *      API-Since: 7.0
     */
    @Generated
    @Selector("setHandlerQueue:")
    void setHandlerQueue(@NotNull dispatch_queue_t value);

    /**
     * A vendor supplied name. May be nil, and is not guaranteed to be unique. This should not be used as a key in a
     * dictionary,
     * but simply as a way to present some basic information about the device in testing or to the user.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("vendorName")
    String vendorName();
}
