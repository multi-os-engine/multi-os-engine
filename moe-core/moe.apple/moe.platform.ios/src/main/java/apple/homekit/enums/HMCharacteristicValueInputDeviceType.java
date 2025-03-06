package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueInputDeviceType
 * 
 * [@constant] HMCharacteristicValueInputDeviceTypeOther Other.
 * [@constant] HMCharacteristicValueInputDeviceTypeTV TV.
 * [@constant] HMCharacteristicValueInputDeviceTypeRecording Recording.
 * [@constant] HMCharacteristicValueInputDeviceTypeTuner Tuner.
 * [@constant] HMCharacteristicValueInputDeviceTypePlayback Playback.
 * [@constant] HMCharacteristicValueInputDeviceTypeAudioSystem Audio System.
 * [@constant] HMCharacteristicValueInputDeviceTypeNone None.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueInputDeviceType {
    @Generated
    private HMCharacteristicValueInputDeviceType() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Other = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long TV = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Recording = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Tuner = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Playback = 0x0000000000000004L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long AudioSystem = 0x0000000000000005L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000006L;
}