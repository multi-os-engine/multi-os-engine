package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class INStartCallCallCapabilityUnsupportedReason {
    @Generated
    private INStartCallCallCapabilityUnsupportedReason() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long VideoCallUnsupported = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MicrophoneNotAccessible = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long CameraNotAccessible = 0x0000000000000003L;
}