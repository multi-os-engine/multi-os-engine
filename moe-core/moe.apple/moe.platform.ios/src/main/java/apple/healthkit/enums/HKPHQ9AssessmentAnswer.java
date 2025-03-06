package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKPHQ9AssessmentAnswer
 * 
 * Answer to question on PHQ-9 assessment.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKPHQ9AssessmentAnswer {
    @Generated
    private HKPHQ9AssessmentAnswer() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long NotAtAll = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SeveralDays = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long MoreThanHalfTheDays = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long NearlyEveryDay = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long PreferNotToAnswer = 0x0000000000000004L;
}