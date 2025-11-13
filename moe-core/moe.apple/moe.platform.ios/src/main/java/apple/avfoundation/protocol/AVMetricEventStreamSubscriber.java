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
     * Delegate callback to receive metric events.
     * 
     * - Parameter event: The metric event.
     * - Parameter publisher: The publisher which generated the current event.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("publisher:didReceiveEvent:")
    void publisherDidReceiveEvent(@Mapped(ObjCObjectMapper.class) @NotNull AVMetricEventStreamPublisher publisher,
            @NotNull AVMetricEvent event);
}