package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioApplicationRecordPermission
 * 
 * These are the values returned by recordPermission.
 * [@var] AVAudioApplicationRecordPermissionUndetermined
 * The user has not yet been asked for permission.
 * [@var] AVAudioApplicationRecordPermissionDenied
 * The user has been asked and has denied permission.
 * [@var] AVAudioApplicationRecordPermissionGranted
 * The user has been asked and has granted permission.
 */
@Generated
public final class AVAudioApplicationRecordPermission {
    @Generated
    private AVAudioApplicationRecordPermission() {
    }

    @Generated @NInt public static final long Undetermined = 0x00000000756E6474L;
    @Generated @NInt public static final long Denied = 0x0000000064656E79L;
    @Generated @NInt public static final long Granted = 0x0000000067726E74L;
}