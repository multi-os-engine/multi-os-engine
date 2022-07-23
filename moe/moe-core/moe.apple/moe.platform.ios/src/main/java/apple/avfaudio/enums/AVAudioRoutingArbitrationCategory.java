package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] AVAudioRoutingArbitrationCategory
 * <p>
 * The category describes the general type of audio that the app plans to use.
 * <p>
 * Provides context to the operating system about the type of audio an application intends to use. The system uses this
 * information
 * when arbitrating between Apple products that want to take ownership of Bluetooth audio routes.
 * [@constant] AVAudioRoutingArbitrationCategoryPlayback
 * Used for Audio playback.
 * [@constant] AVAudioRoutingArbitrationCategoryPlayAndRecord
 * Used for recording and playing back audio.
 * [@constant] AVAudioRoutingArbitrationCategoryPlayAndRecordVoice
 * Appropriate for Voice over IP(VoIP) applications.
 */
@Generated
public final class AVAudioRoutingArbitrationCategory {
    @Generated
    private AVAudioRoutingArbitrationCategory() {
    }

    @Generated @NInt public static final long Playback = 0x0000000000000000L;
    @Generated @NInt public static final long PlayAndRecord = 0x0000000000000001L;
    @Generated @NInt public static final long PlayAndRecordVoice = 0x0000000000000002L;
}
