package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKStateOfMindValenceClassification
 * 
 * A general region of pleasantness derived from valence logged on a state of mind sample.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKStateOfMindValenceClassification {
    @Generated
    private HKStateOfMindValenceClassification() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long VeryUnpleasant = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unpleasant = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SlightlyUnpleasant = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Neutral = 0x0000000000000004L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SlightlyPleasant = 0x0000000000000005L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Pleasant = 0x0000000000000006L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long VeryPleasant = 0x0000000000000007L;
}