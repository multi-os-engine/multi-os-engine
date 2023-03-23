package apple.gamecontroller.protocol;

import apple.gamecontroller.GCPhysicalInputElementCollection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object conforming to \c GCDevicePhysicalInputState contains the state of
 * a device's physical inputs. This may be either the "live" physical input
 * state if the same object also conforms to \c GCDevicePhysicalInput, or a
 * snapshot of the physical input state.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GCDevicePhysicalInputState")
public interface GCDevicePhysicalInputState {
    @Generated
    @Selector("axes")
    GCPhysicalInputElementCollection<String, Object> axes();

    @Generated
    @Selector("buttons")
    GCPhysicalInputElementCollection<String, Object> buttons();

    /**
     * The device that this profile is mapping input from.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    GCDevice device();

    @Generated
    @Selector("dpads")
    GCPhysicalInputElementCollection<String, Object> dpads();

    /**
     * The following properties allow for runtime lookup of any input element on a
     * profile, when provided with a valid alias.
     * 
     * [@example] input.elements[GCInputButtonA]
     * [@example] input.dpads[GCInputLeftThumbstick]
     * [@example] input.dpads[GCInputButtonB] // fails, "Button B" is not a DirectionPad
     */
    @Generated
    @Selector("elements")
    GCPhysicalInputElementCollection<String, Object> elements();

    /**
     * The interval (in seconds) between the timestamp of the last event and the
     * current time.
     * 
     * This value should be treated as a lower bound of the event latency. It may
     * not include (wired or wireless) transmission latency, or latency accrued on
     * the device before the event was transmitted to the host.
     * 
     * [@note]
     * If the system has gone to sleep between when the event occurred and when this
     * property is read, the returned value may not reflect the true latency.
     */
    @Generated
    @Selector("lastEventLatency")
    double lastEventLatency();

    /**
     * The internal time stamp of the last event.
     * 
     * This time interval is not relative to any specific point in time. Your
     * application can subtract a previous timestamp from the returned timestamp to
     * determine the time (in seconds) between events. The \c lastEventTimestamp of
     * the inputs from two different devices can be compared to determine which event
     * occurred first.
     */
    @Generated
    @Selector("lastEventTimestamp")
    double lastEventTimestamp();

    /**
     * Profile elements can be accessed using keyed subscript notation, with a valid alias of its inputs.
     * 
     * [@example] physicalInput[GCInputButtonA]
     * [@example] physicalInput[GCInputButtonX]
     * [@note] Equivalent to -elements
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    GCPhysicalInputElement objectForKeyedSubscript(String key);

    @Generated
    @Selector("switches")
    GCPhysicalInputElementCollection<String, Object> switches();
}