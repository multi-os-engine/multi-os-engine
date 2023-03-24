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
 * An object conforming to \c GCAxisInput represents an input that produces
 * normalized values - between [-1, 1] - along an axis with a fixed origin.
 * The origin - a value of 0 - corresponds the neutral state of the input.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCAxisInput")
public interface GCAxisInput {
    /**
     * Check if the axis input value "rolls over" when reaching either the extreme
     * high or low value. For example, some dials can be rotated past the position
     * that represents their maximum value causing the reported value to roll over.
     * 
     * Defaults to \c NO for most axis elements.
     */
    @Generated
    @Selector("canWrap")
    boolean canWrap();

    /**
     * Check if the axis can support more than just digital values.
     * 
     * Defaults to \c YES for most axis inputs.
     */
    @Generated
    @Selector("isAnalog")
    boolean isAnalog();

    /**
     * The interval (in seconds) between the timestamp of the last event and the
     * current time.
     * 
     * This should be treated as a lower bound of the event latency. It may not
     * include (wired or wireless) transmission latency, or latency accrued on
     * the device before the event was transmitted to the host.
     */
    @Generated
    @Selector("lastValueLatency")
    double lastValueLatency();

    /**
     * The timestamp of the last value.
     * 
     * This time interval is not relative to any specific point in time. You can
     * subtract a previous timestamp from the current timestamp to determine the time
     * (in seconds) between changes to the value.
     */
    @Generated
    @Selector("lastValueTimestamp")
    double lastValueTimestamp();

    /**
     * Set this block to be notified when the value of the axis input changes.
     * 
     * @param element the element that has been modified.
     * @param input   the input that has been modified.
     * @param value   the value the axis was set to at the time the valueChangedHandler fired.
     */
    @Generated
    @Selector("setValueDidChangeHandler:")
    void setValueDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setValueDidChangeHandler") Block_setValueDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueDidChangeHandler {
        @Generated
        void call_setValueDidChangeHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, float arg2);
    }

    /**
     * A normalized value for the axis input, between -1 and 1 (inclusive). The values
     * are deadzoned and saturated before they are returned so there is no value
     * outside the range. Deadzoning does not remove values from the range, the full
     * 0 to 1 magnitude of values are possible from the input.
     * 
     * As an axis is often used in a digital sense, you can rely on a value of 0
     * meaning the axis is inside the deadzone. Any value greater than or less than
     * zero is not in the deadzone.
     */
    @Generated
    @Selector("value")
    float value();

    /**
     * Set this block to be notified when the value of the axis input changes.
     * 
     * @param element the element that has been modified.
     * @param input   the input that has been modified.
     * @param value   the value the axis was set to at the time the valueChangedHandler fired.
     */
    @Nullable
    @Generated
    @Selector("valueDidChangeHandler")
    @ObjCBlock(name = "call_valueDidChangeHandler_ret")
    Block_valueDidChangeHandler_ret valueDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueDidChangeHandler_ret {
        @Generated
        void call_valueDidChangeHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, float arg2);
    }
}