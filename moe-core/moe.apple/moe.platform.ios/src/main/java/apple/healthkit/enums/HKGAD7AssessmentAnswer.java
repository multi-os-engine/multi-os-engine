package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKGAD7AssessmentAnswer
 * 
 * Answer to question on GAD-7 assessment.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKGAD7AssessmentAnswer {
    @Generated
    private HKGAD7AssessmentAnswer() {
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
}