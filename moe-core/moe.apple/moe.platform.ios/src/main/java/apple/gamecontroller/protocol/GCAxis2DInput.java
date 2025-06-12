package apple.gamecontroller.protocol;

import apple.foundation.NSSet;
import apple.gamecontroller.struct.GCPoint2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object conforming to \c GCAxis2DInput represents an input that produces a
 * pair of normalized values - between [-1, 1] - along two axes with fixed origin.
 * The origin - a value of 0 - corresponds the neutral state of the input.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCAxis2DInput")
public interface GCAxis2DInput {
    /**
     * Check if the axis input value "rolls over" when reaching either the extreme
     * high or low value. For example, some dials can be rotated past the position
     * that represents their maximum value causing the reported value to roll over.
     * 
     * Defaults to \c NO for most axis elements.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("canWrap")
    boolean canWrap();

    /**
     * Check if the axis can support more than just digital values.
     * 
     * Defaults to \c YES for most axis inputs.
     * 
     * API-Since: 17.4
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
     * 
     * API-Since: 17.4
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
     * 
     * API-Since: 17.4
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
     * 
     *                API-Since: 17.4
     */
    @Generated
    @Selector("setValueDidChangeHandler:")
    void setValueDidChangeHandler(
            @ObjCBlock(name = "call_setValueDidChangeHandler") @Nullable Block_setValueDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueDidChangeHandler {
        @Generated
        void call_setValueDidChangeHandler(@Mapped(ObjCObjectMapper.class) @NotNull GCPhysicalInputElement arg0,
                @Mapped(ObjCObjectMapper.class) @NotNull GCAxis2DInput arg1, @ByValue GCPoint2 arg2);
    }

    /**
     * An object describing the physical action(s) the user performs to manipulate
     * this input.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("sources")
    @NotNull
    NSSet<?> sources();

    /**
     * A pair of x,y normalized values for the axis input, each between -1 and 1
     * (inclusive). The values are deadzoned and saturated before they are returned
     * so there is no value outside the range. Deadzoning does not remove values
     * from the range; the full 0 to 1 magnitude of values are possible from the input.
     * 
     * As an axis is often used in a digital sense, you can rely on a value of 0
     * meaning the axis is inside the deadzone. Any value greater than or less than
     * zero is not in the deadzone.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("value")
    @ByValue
    GCPoint2 value();

    /**
     * Set this block to be notified when the value of the axis input changes.
     * 
     * @param element the element that has been modified.
     * @param input   the input that has been modified.
     * @param value   the value the axis was set to at the time the valueChangedHandler fired.
     * 
     *                API-Since: 17.4
     */
    @Generated
    @Selector("valueDidChangeHandler")
    @ObjCBlock(name = "call_valueDidChangeHandler_ret")
    @Nullable
    Block_valueDidChangeHandler_ret valueDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueDidChangeHandler_ret {
        @Generated
        void call_valueDidChangeHandler_ret(@Mapped(ObjCObjectMapper.class) @NotNull GCPhysicalInputElement arg0,
                @Mapped(ObjCObjectMapper.class) @NotNull GCAxis2DInput arg1, @ByValue GCPoint2 arg2);
    }
}