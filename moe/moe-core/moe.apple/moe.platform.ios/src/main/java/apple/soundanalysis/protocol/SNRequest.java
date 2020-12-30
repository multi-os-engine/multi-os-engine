package apple.soundanalysis.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * @brief The base protocol to which analysis requests conform
 * @discussion An analysis request is a configuration that defines the analysis the client wishes to perform on the audio stream. Each request has a corresponding result type, which contains information describing the analysis results. This protocol is designed for all requests provided by the framework to conform to, and shouldn't be conformed to by client objects.
 */
@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SNRequest")
public interface SNRequest {
}