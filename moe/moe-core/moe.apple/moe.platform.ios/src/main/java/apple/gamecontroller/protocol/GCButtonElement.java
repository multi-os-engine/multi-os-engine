package apple.gamecontroller.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An object conforming to \c GCButtonElement represents a momentary switch,
 * such as a push button. A button's input only asserts while the user is
 * interacting with it, and then returns to a preferred state (not pressed, not
 * touched).
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCButtonElement")
public interface GCButtonElement extends GCPhysicalInputElement {
    /**
     * Get the input containing the pressed state of the button.
     */
    @NotNull
    @Generated
    @Selector("pressedInput")
    @MappedReturn(ObjCObjectMapper.class)
    Object pressedInput();

    /**
     * Get the input containing the touched state of the button.
     * 
     * Some buttons feature capacitive touch capabilities where the user can touch the
     * button without pressing it.
     */
    @Nullable
    @Generated
    @Selector("touchedInput")
    @MappedReturn(ObjCObjectMapper.class)
    GCTouchedStateInput touchedInput();
}