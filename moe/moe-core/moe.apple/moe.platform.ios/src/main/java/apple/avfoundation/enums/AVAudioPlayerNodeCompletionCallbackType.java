package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum AVAudioPlayerNodeCompletionCallbackType
 * @abstract	Specifies when the completion handler must be invoked.
 * 
 * @constant	AVAudioPlayerNodeCompletionDataConsumed
 * 				The buffer or file data has been consumed by the player.
 *  	@constant	AVAudioPlayerNodeCompletionDataRendered
 * 				The buffer or file data has been rendered (i.e. output) by the player. This
 * 				does not account for any signal processing latencies downstream of the player 
 * 				in the engine (see `AVAudioNode(outputPresentationLatency)`).
 * @constant	AVAudioPlayerNodeCompletionDataPlayedBack
 * 				Applicable only when the engine is rendering to/from an audio device.
 * 				The buffer or file has finished playing. This accounts for both (small) signal 
 * 				processing latencies downstream of the player in the engine, as well as
 * 				(possibly significant) latency in the audio playback device.
 * 
 * 	API_AVAILABLE(macos(10.13), ios(11.0), watchos(4.0), tvos(11.0));
 */
@Generated
public final class AVAudioPlayerNodeCompletionCallbackType {
    @Generated
    private AVAudioPlayerNodeCompletionCallbackType() {
    }

    @Generated @NInt public static final long Consumed = 0x0000000000000000L;
    @Generated @NInt public static final long Rendered = 0x0000000000000001L;
    @Generated @NInt public static final long PlayedBack = 0x0000000000000002L;
}