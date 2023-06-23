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

/**
 * An object conforming to \c GCSwitchElement represents a latching switch.
 * A switch may be in one of several positions, and remains in its last position
 * after the user stops interacting with it.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCSwitchElement")
public interface GCSwitchElement extends GCPhysicalInputElement {
    /**
     * Get the input containing the absolute position of the switch.
     */
    @NotNull
    @Generated
    @Selector("positionInput")
    @MappedReturn(ObjCObjectMapper.class)
    GCSwitchPositionInput positionInput();
}