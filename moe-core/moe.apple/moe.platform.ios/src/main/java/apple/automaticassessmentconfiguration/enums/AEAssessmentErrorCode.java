package apple.automaticassessmentconfiguration.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AEAssessmentErrorCode {
    @Generated
    private AEAssessmentErrorCode() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long UnsupportedPlatform = 0x0000000000000002L;
    /**
     * API-Since: 17.5
     */
    @Generated @NInt public static final long MultipleParticipantsNotSupported = 0x0000000000000003L;
    /**
     * API-Since: 17.5
     */
    @Generated @NInt public static final long ConfigurationUpdatesNotSupported = 0x0000000000000004L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long RequiredParticipantsNotAvailable = 0x0000000000000005L;
}
