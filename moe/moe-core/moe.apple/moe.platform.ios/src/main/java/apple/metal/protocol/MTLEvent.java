package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 12.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLEvent")
public interface MTLEvent {
    /**
     * [@property] device
     * 
     * The device this event can be used with. Will be nil when the event is shared across devices (i.e.
     * MTLSharedEvent).
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);
}
