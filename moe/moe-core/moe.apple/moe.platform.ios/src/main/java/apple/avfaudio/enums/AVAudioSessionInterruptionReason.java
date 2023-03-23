package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioSessionInterruptionReason
 * 
 * Values for AVAudioSessionInterruptionReasonKey in AVAudioSessionInterruptionNotification's userInfo dictionary.
 * 
 * [@var] AVAudioSessionInterruptionReasonDefault
 * The audio session was interrupted because another session was activated.
 * 
 * [@var] AVAudioSessionInterruptionReasonAppWasSuspended
 * The audio session was interrupted due to the app being suspended by the operating sytem.
 * Deprecated. Interruption notifications with reason 'wasSuspended' not present from iOS 16 onwards.
 * 
 * [@var] AVAudioSessionInterruptionReasonBuiltInMicMuted
 * The audio session was interrupted due to the built-in mic being muted e.g. due to an iPad's Smart Folio being closed.
 */
@Generated
public final class AVAudioSessionInterruptionReason {
    @Generated
    private AVAudioSessionInterruptionReason() {
    }

    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 14.5
     * Deprecated-Since: 16.0
     * Deprecated-Message: wasSuspended reason no longer present
     */
    @Deprecated @Generated @NUInt public static final long AppWasSuspended = 0x0000000000000001L;
    @Generated @NUInt public static final long BuiltInMicMuted = 0x0000000000000002L;
}
