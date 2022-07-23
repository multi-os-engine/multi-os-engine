package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioSessionInterruptionReason
 * <p>
 * Values for AVAudioSessionInterruptionReasonKey in AVAudioSessionInterruptionNotification's userInfo dictionary.
 * <p>
 * [@var] AVAudioSessionInterruptionReasonDefault
 * The audio session was interrupted because another session was activated.
 * <p>
 * [@var] AVAudioSessionInterruptionReasonAppWasSuspended
 * The audio session was interrupted due to the app being suspended by the operating sytem.
 * <p>
 * Starting in iOS 10, the system will deactivate the audio session of most apps in response to the
 * app process being suspended. When the app starts running again, it will receive the notification
 * that its session has been deactivated by the system. Note that the notification is necessarily
 * delayed in time, due to the fact that the application was suspended at the time the session was
 * deactivated by the system and the notification can only be delivered once the app is running
 * again.
 * <p>
 * [@var] AVAudioSessionInterruptionReasonBuiltInMicMuted
 * The audio session was interrupted due to the built-in mic being muted e.g. due to an iPad's Smart Folio being closed.
 */
@Generated
public final class AVAudioSessionInterruptionReason {
    @Generated
    private AVAudioSessionInterruptionReason() {
    }

    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    @Generated @NUInt public static final long AppWasSuspended = 0x0000000000000001L;
    @Generated @NUInt public static final long BuiltInMicMuted = 0x0000000000000002L;
}
