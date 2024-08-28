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
 * An object conforming to \c GCRelativeInput represents an input that reports
 * its change in position along an axis (delta) since the previous event.
 * Relative inputs have no fixed origin from which a coordinate syatem can be
 * defined.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCRelativeInput")
public interface GCRelativeInput {
    /**
     * The last reported delta for the input.
     */
    @Generated
    @Selector("delta")
    float delta();

    /**
     * Set this block to be notified when the delta of the input changes.
     * 
     * @param delta
     *              The amount that the input has changed since the last time
     *              \c deltaDidChangeHandler fired.
     */
    @Nullable
    @Generated
    @Selector("deltaDidChangeHandler")
    @ObjCBlock(name = "call_deltaDidChangeHandler_ret")
    Block_deltaDidChangeHandler_ret deltaDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deltaDidChangeHandler_ret {
        @Generated
        void call_deltaDidChangeHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, float arg2);
    }

    /**
     * Check if the input can support more than just digital values.
     * 
     * Defaults to \c YES for most relative inputs.
     */
    @Generated
    @Selector("isAnalog")
    boolean isAnalog();

    /**
     * The interval (in seconds) between the timestamp of the last change and the
     * current time.
     * 
     * This should be treated as a lower bound of the event latency. It may not
     * include (wired or wireless) transmission latency, or latency accrued on
     * the device before the event was transmitted to the host.
     */
    @Generated
    @Selector("lastDeltaLatency")
    double lastDeltaLatency();

    /**
     * The timestamp of the last change.
     * 
     * This time interval is not relative to any specific point in time. You can
     * subtract a previous timestamp from the current timestamp to determine the time
     * (in seconds) between changes to the value.
     */
    @Generated
    @Selector("lastDeltaTimestamp")
    double lastDeltaTimestamp();

    /**
     * Set this block to be notified when the delta of the input changes.
     * 
     * @param delta
     *              The amount that the input has changed since the last time
     *              \c deltaDidChangeHandler fired.
     */
    @Generated
    @Selector("setDeltaDidChangeHandler:")
    void setDeltaDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setDeltaDidChangeHandler") Block_setDeltaDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDeltaDidChangeHandler {
        @Generated
        void call_setDeltaDidChangeHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
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