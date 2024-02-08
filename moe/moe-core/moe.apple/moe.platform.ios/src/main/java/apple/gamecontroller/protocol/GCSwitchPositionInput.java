package apple.gamecontroller.protocol;

import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
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
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCSwitchPositionInput")
public interface GCSwitchPositionInput {
    /**
     * Check if the position input value can "roll over" when reaching either of its
     * bounds.
     * 
     * This will always be \c YES for non-sequential switch inputs.
     */
    @Generated
    @Selector("canWrap")
    boolean canWrap();

    /**
     * \c YES if the switch input can only transition to positions that are adjacent
     * to the current position.
     */
    @Generated
    @Selector("isSequential")
    boolean isSequential();

    /**
     * The interval (in seconds) between the timestamp of the last event and the
     * current time.
     * 
     * This should be treated as a lower bound of the event latency. It may not
     * include (wired or wireless) transmission latency, or latency accrued on
     * the device before the event was transmitted to the host.
     */
    @Generated
    @Selector("lastPositionLatency")
    double lastPositionLatency();

    /**
     * The timestamp of the last value.
     * 
     * This time interval is not relative to any specific point in time. You can
     * subtract a previous timestamp from the returned timestamp to determine the time
     * (in seconds) between changes to the value.
     */
    @Generated
    @Selector("lastPositionTimestamp")
    double lastPositionTimestamp();

    /**
     * The switch's position.
     * 
     * @see valueDidChangeHandler
     */
    @Generated
    @Selector("position")
    @NInt
    long position();

    /**
     * Set this block if you want to be notified when the value on the switch changes.
     * 
     * @param input the element that has been modified.
     * @see value
     */
    @Nullable
    @Generated
    @Selector("positionDidChangeHandler")
    @ObjCBlock(name = "call_positionDidChangeHandler_ret")
    Block_positionDidChangeHandler_ret positionDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_positionDidChangeHandler_ret {
        @Generated
        void call_positionDidChangeHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, @NInt long arg2);
    }

    /**
     * The (inclusive) bounds of possible position values for the switch.
     */
    @Generated
    @Selector("positionRange")
    @ByValue
    NSRange positionRange();

    /**
     * Set this block if you want to be notified when the value on the switch changes.
     * 
     * @param input the element that has been modified.
     * @see value
     */
    @Generated
    @Selector("setPositionDidChangeHandler:")
    void setPositionDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setPositionDidChangeHandler") Block_setPositionDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPositionDidChangeHandler {
        @Generated
        void call_setPositionDidChangeHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, @NInt long arg2);
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