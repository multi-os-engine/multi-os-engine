package apple.avrouting.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * A protocol for objects that participate in playback routing arbitration.
 * 
 * Classes conform to this protocol if they participate in media playback routing arbitration for managing preferences
 * such as priority on restricted playback routes.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVRoutingPlaybackParticipant")
public interface AVRoutingPlaybackParticipant {
}