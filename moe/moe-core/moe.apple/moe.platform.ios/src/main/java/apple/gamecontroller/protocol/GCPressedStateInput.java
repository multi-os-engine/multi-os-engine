package apple.gamecontroller.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object conforming to \c GCPressedStateInput represents the pressed state of
 * an element, typically a button.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCPressedStateInput")
public interface GCPressedStateInput {
    /**
     * Buttons are mostly used in a digital sense, thus we have a recommended method
     * for checking for pressed state instead of interpreting the value.
     * 
     * As a general guideline a button is pressed if the value exceeds 0. However
     * there may be hysteresis applied to counter noisy input values, thus incidental
     * values around the threshold value may not trigger a change in pressed state.
     * 
     * Other buttons may support two-stage actuation, where the button reports a
     * value between 0 and 1 but is only considered pressed when its value is greater
     * than some threshold other than 0.
     * 
     * @see pressedDidChangeHandler
     */
    @Generated
    @Selector("isPressed")
    boolean isPressed();

    /**
     * The interval (in seconds) between the timestamp of the last pressed state
     * change and the current time.
     * 
     * This should be treated as a lower bound of the event latency. It may not
     * include (wired or wireless) transmission latency, or latency accrued on
     * the device before the event was transmitted to the host.
     */
    @Generated
    @Selector("lastPressedStateLatency")
    double lastPressedStateLatency();

    /**
     * The timestamp of the last pressed state change.
     * 
     * This time interval is not relative to any specific point in time. You can
     * subtract a previous timestamp from the current timestamp to determine the time
     * (in seconds) between changes to the value.
     */
    @Generated
    @Selector("lastPressedStateTimestamp")
    double lastPressedStateTimestamp();

    /**
     * Set this block if you want to be notified when the pressed state changes.
     */
    @Nullable
    @Generated
    @Selector("pressedDidChangeHandler")
    @ObjCBlock(name = "call_pressedDidChangeHandler_ret")
    Block_pressedDidChangeHandler_ret pressedDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pressedDidChangeHandler_ret {
        @Generated
        void call_pressedDidChangeHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, boolean arg2);
    }

    /**
     * Set this block if you want to be notified when the pressed state changes.
     */
    @Generated
    @Selector("setPressedDidChangeHandler:")
    void setPressedDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setPressedDidChangeHandler") Block_setPressedDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPressedDidChangeHandler {
        @Generated
        void call_setPressedDidChangeHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, boolean arg2);
    }
}