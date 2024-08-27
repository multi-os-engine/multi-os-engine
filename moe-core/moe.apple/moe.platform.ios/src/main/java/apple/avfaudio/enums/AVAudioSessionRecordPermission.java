package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] AVAudioSessionRecordPermission
 * 
 * These are the values returned by recordPermission.
 * [@var] AVAudioSessionRecordPermissionUndetermined
 * The user has not yet been asked for permission.
 * [@var] AVAudioSessionRecordPermissionDenied
 * The user has been asked and has denied permission.
 * [@var] AVAudioSessionRecordPermissionGranted
 * The user has been asked and has granted permission.
 * 
 * Introduced: ios(8.0), watchos(4.0)
 */
@Generated
public final class AVAudioSessionRecordPermission {
    @Generated
    private AVAudioSessionRecordPermission() {
    }

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long Undetermined = 0x00000000756E6474L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long Denied = 0x0000000064656E79L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     */
    @Deprecated @Generated @NUInt public static final long Granted = 0x0000000067726E74L;
}
