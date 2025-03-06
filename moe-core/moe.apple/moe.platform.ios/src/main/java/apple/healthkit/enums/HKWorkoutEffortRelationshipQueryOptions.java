package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKWorkoutEffortRelationshipQueryOptions
 * 
 * Option for specifying which workout effort relationship sample(s) to retrieve
 * 
 * [@constant] HKWorkoutEffortRelationshipQueryOptionsDefault
 * [@constant] HKWorkoutEffortRelationshipQueryOptionsMostRelevant The most relevant sample will be returned
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKWorkoutEffortRelationshipQueryOptions {
    @Generated
    private HKWorkoutEffortRelationshipQueryOptions() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long MostRelevant = 0x0000000000000001L;
}