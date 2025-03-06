package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioApplicationMicrophoneInjectionPermission
 * 
 * These are the values returned by microphoneInjectionPermission.
 * [@var] AVAudioApplicationMicrophoneInjectionPermissionServiceDisabled
 * The user has disabled this service for all apps.
 * [@var] AVAudioApplicationMicrophoneInjectionUndetermined
 * The user has not yet been asked for permission.
 * [@var] AVAudioApplicationMicrophoneInjectionPermissionDenied
 * The user has been asked and has denied permission.
 * [@var] AVAudioApplicationMicrophoneInjectionPermissionGranted
 * The user has been asked and has granted permission.
 * 
 * Introduced: ios(18.2) visionos(2.2)
 */
@Generated
public final class AVAudioApplicationMicrophoneInjectionPermission {
    @Generated
    private AVAudioApplicationMicrophoneInjectionPermission() {
    }

    @Generated @NInt public static final long ServiceDisabled = 0x0000000073726473L;
    @Generated @NInt public static final long Undetermined = 0x00000000756E6474L;
    @Generated @NInt public static final long Denied = 0x0000000064656E79L;
    @Generated @NInt public static final long Granted = 0x0000000067726E74L;
}