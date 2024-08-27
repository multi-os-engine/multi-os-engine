package apple.gamecontroller.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * An objecting conforming to \c GCDevicePhysicalInput provides properties and
 * methods for accessing common physical elements - buttons, thumbsticks, dpads,
 * etc - of a device.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCDevicePhysicalInput")
public interface GCDevicePhysicalInput extends GCDevicePhysicalInputState {
    /**
     * Polls the current state vector of the physical input and saves it to a new
     * instance.
     * 
     * If your application is heavily multithreaded this may also be useful to
     * guarantee atomicity of input handling as a snapshot will not change based on
     * further device input once it is taken.
     * 
     * @return An input state with the duplicated state vector of the current input.
     */
    @NotNull
    @Generated
    @Selector("capture")
    @MappedReturn(ObjCObjectMapper.class)
    GCDevicePhysicalInputState capture();

    /**
     * The device that this profile is mapping input from.
     */
    @Nullable
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    GCDevice device();

    /**
     * Set this block to be notified when a value on a element changed. If multiple
     * elements change this block will be called for each element that changed.
     * 
     * The block is called on the \c queue configured for the physical input.
     * 
     * @param element
     *                The element that has been modified.
     */
    @Nullable
    @Generated
    @Selector("elementValueDidChangeHandler")
    @ObjCBlock(name = "call_elementValueDidChangeHandler_ret")
    Block_elementValueDidChangeHandler_ret elementValueDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_elementValueDidChangeHandler_ret {
        @Generated
        void call_elementValueDidChangeHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    /**
     * Set this block to be notified when a new input state is available. Your
     * handler should repeatedly call \c -nextInputState until it returns \c nil to
     * drain the pending input states from the queue.
     * 
     * physicalInput.inputStateQueueDepth = 20;
     * physicalInput.inputStateAvailableHandler = ^(__kindof id<GCDevicePhysicalInput> physicalInput) {
     * id<GCDevicePhysicalInputState, GCDevicePhysicalInputStateDiff> nextInputState;
     * while ((nextInputState = [physicalInput nextInputState])) {
     * 
     * // You can grab the individual states of all elements that your app
     * // is interested in.
     * id<GCButtonElement> buttonA = nextInputState.buttons[GCInputButtonA];
     * BOOL buttonAPressed = buttonA.pressedInput.pressed;
     * if (buttonAPressed) {
     * // Handle button A pressed
     * }
     * 
     * // Your code can first query whether an element's input value changed
     * // from the prior input state.
     * GCDevicePhysicalInputElementChange buttonAChange = [nextInputState changeForElement:buttonA];
     * if (buttonAChange == GCDevicePhysicalInputElementChanged) {
     * // Handle button A input changed
     * }
     * 
     * // Or, your code can request an enumerator of elements with input
     * // values that changed from the prior input state
     * for (id<GCPhysicalInputElement> changedElement in nextInputState.changedElements) {
     * 
     * }
     * }
     * };
     */
    @Nullable
    @Generated
    @Selector("inputStateAvailableHandler")
    @ObjCBlock(name = "call_inputStateAvailableHandler_ret")
    Block_inputStateAvailableHandler_ret inputStateAvailableHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inputStateAvailableHandler_ret {
        @Generated
        void call_inputStateAvailableHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * The maximum number of input states to buffer. If your application does not
     * drain the pending input states in the queue before this limit is reached, older
     * input states will be discarded - resulting in your application "missing" input
     * state changes.
     * 
     * The default value is \c one (no buffering). Smaller values are ignored. A
     * value of \c 20 should be more than enough to ensure no input state changes
     * are missed.
     */
    @Generated
    @Selector("inputStateQueueDepth")
    @NInt
    long inputStateQueueDepth();

    /**
     * Pop the oldest pending input state from the queue. This method returns \c nil
     * when there are no more input states pending.
     */
    @Nullable
    @Generated
    @Selector("nextInputState")
    @MappedReturn(ObjCObjectMapper.class)
    Object nextInputState();

    /**
     * Set this block to be notified when a value on a element changed. If multiple
     * elements change this block will be called for each element that changed.
     * 
     * The block is called on the \c queue configured for the physical input.
     * 
     * @param element
     *                The element that has been modified.
     */
    @Generated
    @Selector("setElementValueDidChangeHandler:")
    void setElementValueDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setElementValueDidChangeHandler") Block_setElementValueDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setElementValueDidChangeHandler {
        @Generated
        void call_setElementValueDidChangeHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    /**
     * Set this block to be notified when a new input state is available. Your
     * handler should repeatedly call \c -nextInputState until it returns \c nil to
     * drain the pending input states from the queue.
     * 
     * physicalInput.inputStateQueueDepth = 20;
     * physicalInput.inputStateAvailableHandler = ^(__kindof id<GCDevicePhysicalInput> physicalInput) {
     * id<GCDevicePhysicalInputState, GCDevicePhysicalInputStateDiff> nextInputState;
     * while ((nextInputState = [physicalInput nextInputState])) {
     * 
     * // You can grab the individual states of all elements that your app
     * // is interested in.
     * id<GCButtonElement> buttonA = nextInputState.buttons[GCInputButtonA];
     * BOOL buttonAPressed = buttonA.pressedInput.pressed;
     * if (buttonAPressed) {
     * // Handle button A pressed
     * }
     * 
     * // Your code can first query whether an element's input value changed
     * // from the prior input state.
     * GCDevicePhysicalInputElementChange buttonAChange = [nextInputState changeForElement:buttonA];
     * if (buttonAChange == GCDevicePhysicalInputElementChanged) {
     * // Handle button A input changed
     * }
     * 
     * // Or, your code can request an enumerator of elements with input
     * // values that changed from the prior input state
     * for (id<GCPhysicalInputElement> changedElement in nextInputState.changedElements) {
     * 
     * }
     * }
     * };
     */
    @Generated
    @Selector("setInputStateAvailableHandler:")
    void setInputStateAvailableHandler(
            @Nullable @ObjCBlock(name = "call_setInputStateAvailableHandler") Block_setInputStateAvailableHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInputStateAvailableHandler {
        @Generated
        void call_setInputStateAvailableHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0);
    }

    /**
     * The maximum number of input states to buffer. If your application does not
     * drain the pending input states in the queue before this limit is reached, older
     * input states will be discarded - resulting in your application "missing" input
     * state changes.
     * 
     * The default value is \c one (no buffering). Smaller values are ignored. A
     * value of \c 20 should be more than enough to ensure no input state changes
     * are missed.
     */
    @Generated
    @Selector("setInputStateQueueDepth:")
    void setInputStateQueueDepth(@NInt long value);

    /**
     * The dispatch queue that element value change handlers and other callbacks are
     * submitted on.
     * 
     * The default queue is the \c handlerQueue of the associated \c device. Set
     * this property if your application wants to receive input callbacks on a
     * different queue. You should set this property before configuring other
     * callbacks.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("queue")
    @Nullable
    dispatch_queue_t queue();

    /**
     * The dispatch queue that element value change handlers and other callbacks are
     * submitted on.
     * 
     * The default queue is the \c handlerQueue of the associated \c device. Set
     * this property if your application wants to receive input callbacks on a
     * different queue. You should set this property before configuring other
     * callbacks.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setQueue:")
    void setQueue(@Nullable dispatch_queue_t value);
}