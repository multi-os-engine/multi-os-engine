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
 * An object conforming to \c GCTouchedStateInput represents the touched state of
 * an element.
 * 
 * Some buttons feature capacitive touch capabilities, where the user can touch
 * the button without pressing it. In such cases, a button can be touched without
 * being pressed.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCTouchedStateInput")
public interface GCTouchedStateInput {
    /**
     * Some buttons feature capacitive touch capabilities, where the user can touch
     * the button without pressing it. In such cases, a button will be touched before
     * it is pressed.
     * 
     * @see touchedDidChangeHandler
     * @see GCPressedStateInput
     */
    @Generated
    @Selector("isTouched")
    boolean isTouched();

    /**
     * The interval (in seconds) between the timestamp of the last touched state
     * change and the current time.
     * 
     * This should be treated as a lower bound of the event latency. It may not
     * include (wired or wireless) transmission latency, or latency accrued on
     * the device before the event was transmitted to the host.
     */
    @Generated
    @Selector("lastTouchedStateLatency")
    double lastTouchedStateLatency();

    /**
     * The timestamp of the last touched state change.
     * 
     * This time interval is not relative to any specific point in time. You can
     * subtract a previous timestamp from the returned timestamp to determine the time
     * (in seconds) between changes to the value.
     */
    @Generated
    @Selector("lastTouchedStateTimestamp")
    double lastTouchedStateTimestamp();

    /**
     * Set this block if you want to be notified when the touched state changes.
     */
    @Generated
    @Selector("setTouchedDidChangeHandler:")
    void setTouchedDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setTouchedDidChangeHandler") Block_setTouchedDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTouchedDidChangeHandler {
        @Generated
        void call_setTouchedDidChangeHandler(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, boolean arg2);
    }

    /**
     * Set this block if you want to be notified when the touched state changes.
     */
    @Nullable
    @Generated
    @Selector("touchedDidChangeHandler")
    @ObjCBlock(name = "call_touchedDidChangeHandler_ret")
    Block_touchedDidChangeHandler_ret touchedDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_touchedDidChangeHandler_ret {
        @Generated
        void call_touchedDidChangeHandler_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0,
                @NotNull @Mapped(ObjCObjectMapper.class) Object arg1, boolean arg2);
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