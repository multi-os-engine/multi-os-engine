package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKStateOfMindKind
 * 
 * The kind of feeling type captured by a state of mind log, considering the period of time the reflection concerns.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HKStateOfMindKind {
    @Generated
    private HKStateOfMindKind() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long MomentaryEmotion = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long DailyMood = 0x0000000000000002L;
}