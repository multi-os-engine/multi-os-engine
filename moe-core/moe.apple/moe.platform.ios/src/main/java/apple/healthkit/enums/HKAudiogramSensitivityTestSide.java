package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKAudiogramSensitivityTestSide
 * 
 * Represents the test side used for an HKAudiogramSensitivityTest
 * 
 * [@constant] HKAudiogramSensitivityTestSideLeft
 * [@constant] HKAudiogramSensitivityTestSideRight
 * 
 * API-Since: 18.1
 */
@Generated
public final class HKAudiogramSensitivityTestSide {
    @Generated
    private HKAudiogramSensitivityTestSide() {
    }

    /**
     * API-Since: 18.1
     */
    @Generated @NInt public static final long Left = 0x0000000000000000L;
    /**
     * API-Since: 18.1
     */
    @Generated @NInt public static final long Right = 0x0000000000000001L;
}