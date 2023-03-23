package apple.gamecontroller.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object conforming to \c GCDirectionPadElement represents a four-way
 * directional control with one button on each point.
 * 
 * A direction pad element contains a common grouping of 2 axis inputs where the
 * input can also be interpreted as 2 sets of mutually exclusive button pairs.
 * Only one button in each pair, {up, down} and {left, right}, can be pressed at
 * any one time.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCDirectionPadElement")
public interface GCDirectionPadElement extends GCPhysicalInputElement {
    /**
     * The negative y-component of the dpad input.
     */
    @Generated
    @Selector("down")
    @MappedReturn(ObjCObjectMapper.class)
    Object down();

    /**
     * The negative x-component of the dpad input.
     */
    @Generated
    @Selector("left")
    @MappedReturn(ObjCObjectMapper.class)
    Object left();

    /**
     * The positive x-component of the dpad input.
     */
    @Generated
    @Selector("right")
    @MappedReturn(ObjCObjectMapper.class)
    Object right();

    /**
     * The positive y-component of the dpad input.
     */
    @Generated
    @Selector("up")
    @MappedReturn(ObjCObjectMapper.class)
    Object up();

    /**
     * The horizontal/x-component of the dpad input.
     */
    @Generated
    @Selector("xAxis")
    @MappedReturn(ObjCObjectMapper.class)
    GCAxisInput xAxis();

    /**
     * The vertical/y-component of the dpad input.
     */
    @Generated
    @Selector("yAxis")
    @MappedReturn(ObjCObjectMapper.class)
    GCAxisInput yAxis();
}