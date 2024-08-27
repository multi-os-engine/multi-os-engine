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
import apple.foundation.NSSet;

/**
 * An object conforming to \c GCLinearInput represents an input that produces
 * normalized values in the unit interval - between [0, 1].
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCLinearInput")
public interface GCLinearInput {
    /**
     * Check if the input value "rolls over" when reaching either the extreme high
     * or low value. For example, some dials can be rotated past the position that
     * represents their maximum value, causing the next reported value to roll over.
     * 
     * Defaults to NO for most inputs.
     */
    @Generated
    @Selector("canWrap")
    boolean canWrap();

    /**
     * Check if the input can support more than just digital values.
     * 
     * If \c YES, the input can produce any value between [0, 1]. Otherwise, the
     * input only produces the values 0 or 1.
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
     * Set this block to be notified when the value of the input changes.
     * 
     * @param element the element that has been modified.
     * @param input   the input that has been modified.
     * @param value   the value the axis was set to at the time the valueDidChangeHandler fired.
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
     * A normalized value for the axis input, between 0 and 1 (inclusive). The values
     * are deadzoned and saturated before they are returned so there is no value
     * outside the range. Deadzoning does not remove values from the range, the full
     * 0 to 1 magnitude of values are possible from the input.
     * 
     * You can rely on a value of 0 meaning the value is inside the deadzone. Any
     * value greater than zero is not in the deadzone.
     */
    @Generated
    @Selector("value")
    float value();

    /**
     * Set this block to be notified when the value of the input changes.
     * 
     * @param element the element that has been modified.
     * @param input   the input that has been modified.
     * @param value   the value the axis was set to at the time the valueDidChangeHandler fired.
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

    /**
     * An object describing the physical action(s) the user performs to manipulate
     * this input.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("sources")
    @NotNull
    NSSet<?> sources();
}