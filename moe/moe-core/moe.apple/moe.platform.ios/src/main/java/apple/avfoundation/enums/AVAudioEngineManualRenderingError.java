package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AVAudioEngineManualRenderingError
 * 
 * Error codes that could be returned from AVAudioEngine manual rendering mode methods,
 * e.g. `enableManualRenderingMode:format:maximumFrameCount:error:` and
 * `renderOffline:toBuffer:error:`.
 * Note that this is not a comprehensive list, and the underlying audio units could
 * return other error codes (e.g. see kAudioUnitErr_* in AudioToolbox/AUComponent.h) from these
 * methods as applicable.
 * 
 * AVAudioEngineManualRenderingErrorInvalidMode
 * 	The operation cannot be performed because the engine is either not in manual 
 * 	rendering mode or the right variant of it.
 * 
 * AVAudioEngineManualRenderingErrorInitialized
 * 	The operation cannot be performed because the engine is initialized (i.e. not stopped).
 * 
 * 	AVAudioEngineManualRenderingErrorNotRunning
 * 	The operation cannot be performed because the engine is not running (i.e. not started).
 */
@Generated
public final class AVAudioEngineManualRenderingError {
    @Generated
    private AVAudioEngineManualRenderingError() {
    }

    @Generated public static final int InvalidMode = 0xFFFEC460;
    @Generated public static final int Initialized = 0xFFFEC45F;
    @Generated public static final int NotRunning = 0xFFFEC45E;
}