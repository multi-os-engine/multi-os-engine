package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class AVSpeechSynthesisPersonalVoiceAuthorizationStatus {
    @Generated
    private AVSpeechSynthesisPersonalVoiceAuthorizationStatus() {
    }

    /**
     * The app's authorization status has not yet been determined.
     * 
     * When your app's status is not determined, calling the requestAuthorization: method prompts the user to grant or
     * deny authorization.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * The user denied your app's request to use personal voices.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Denied = 0x0000000000000001L;
    /**
     * Personal voices are unsupported on this device.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Unsupported = 0x0000000000000002L;
    /**
     * The user granted your app's request to use personal voices.
     * 
     * API-Since: 17.0
     */
    @Generated @NUInt public static final long Authorized = 0x0000000000000003L;
}