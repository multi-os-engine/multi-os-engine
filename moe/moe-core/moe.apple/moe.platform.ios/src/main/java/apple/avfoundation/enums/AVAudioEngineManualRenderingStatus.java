package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum AVAudioEngineManualRenderingStatus
 *   @abstract 
 * Status codes returned from the render call to the engine operating in manual rendering mode.
 * 
 * AVAudioEngineManualRenderingStatusError
 * 	An error occurred when rendering and no data was returned. See the returned error code
 * 	for the description of the error.
 * 
 * AVAudioEngineManualRenderingStatusSuccess
 * 	All of the requested data was returned successfully.
 * 
 * AVAudioEngineManualRenderingStatusInsufficientDataFromInputNode
 * 	Applicable only to the input node, when it provides input data for rendering
 * 	(see `AVAudioInputNode(setManualRenderingInputPCMFormat:inputBlock:)`).
 * 	Indicates that not enough input data was returned by the input node to satisfy the
 * 	render request at the current time. The output buffer may contain data rendered by other
 * 	active sources in the engine's processing graph.
 * 
 * 	AVAudioEngineManualRenderingStatusCannotDoInCurrentContext
 * 	The operation could not be performed now, but the client could retry later if needed.
 * 	This is usually to guard a realtime render operation (e.g. rendering through
 * 	`manualRenderingBlock`) when a reconfiguration of the engine's internal state 
 * 	is in progress.
 */
@Generated
public final class AVAudioEngineManualRenderingStatus {
    @Generated
    private AVAudioEngineManualRenderingStatus() {
    }

    @Generated @NInt public static final long Error = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    @Generated @NInt public static final long InsufficientDataFromInputNode = 0x0000000000000001L;
    @Generated @NInt public static final long CannotDoInCurrentContext = 0x0000000000000002L;
}