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
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCAxisElement")
public interface GCAxisElement extends GCPhysicalInputElement {
    /**
     * The input reporting the value of the axis as the position between a lower and
     * upper bound, if available.
     */
    @Nullable
    @Generated
    @Selector("absoluteInput")
    @MappedReturn(ObjCObjectMapper.class)
    GCAxisInput absoluteInput();

    /**
     * The input reporting axis values as the change (delta) since the last event.
     * 
     * Certain kinds of axis elements are only able to report relative values. The
     * tracking of a computer mouse, for example, has no fixed origin - only the
     * change in position since the last event is reported. Some freely-rotating
     * dials may also only report a value indicating which direction the dial was
     * turned.
     */
    @NotNull
    @Generated
    @Selector("relativeInput")
    @MappedReturn(ObjCObjectMapper.class)
    GCRelativeInput relativeInput();
}