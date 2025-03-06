package apple.avfoundation.protocol;

import apple.avfoundation.AVMetricEvent;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] AVMetricEventStreamSubscriber
 * 
 * This protocol needs to be implemented by the subscriber delegate to receive subscribed metric events.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVMetricEventStreamSubscriber")
public interface AVMetricEventStreamSubscriber {
    /**
     * publisher:didReceiveEvent:
     * 
     * Delegate callback to receive metric events.
     * 
     * @param event     The metric event.
     * @param publisher The publisher which generated the current event.
     * 
     *                  API-Since: 18.0
     */
    @Generated
    @Selector("publisher:didReceiveEvent:")
    void publisherDidReceiveEvent(@Mapped(ObjCObjectMapper.class) @NotNull AVMetricEventStreamPublisher publisher,
            @NotNull AVMetricEvent event);
}