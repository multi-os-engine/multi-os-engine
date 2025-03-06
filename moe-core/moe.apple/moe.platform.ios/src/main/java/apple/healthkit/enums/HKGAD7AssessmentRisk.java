package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKGAD7AssessmentRisk
 * 
 * Anxiety risk level determined by GAD-7 assessment.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKGAD7AssessmentRisk {
    @Generated
    private HKGAD7AssessmentRisk() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long NoneToMinimal = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Mild = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Moderate = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Severe = 0x0000000000000004L;
}