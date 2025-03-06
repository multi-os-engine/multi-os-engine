package apple.accessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class AXSettingsFeature {
    @Generated
    private AXSettingsFeature() {
    }

    /**
     * Jump to the setting for "Allow Apps to Request to Use" in Personal Voice. This is relevant for the
     * AVSpeechSynthesis.personalVoiceAuthorizationStatus API.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long PersonalVoiceAllowAppsToRequestToUse = 0x0000000000000001L;
    /**
     * Jump to the setting for "Allow Apps to Add Audio to Calls." This is relevant for the
     * AVAudioSession.preferredMicrophoneInjectionMode API.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long AllowAppsToAddAudioToCalls = 0x0000000000000002L;
}