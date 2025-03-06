package apple.browserenginekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Phases of a BEScrollViewScrollUpdate.
 * 
 * API-Since: 17.4
 */
@Generated
public final class BEScrollViewScrollUpdatePhase {
    @Generated
    private BEScrollViewScrollUpdatePhase() {
    }

    /**
     * Whenever a gesture scroll has physically started.
     * 
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Began = 0x0000000000000000L;
    /**
     * Whenever a gesture scroll has changed.
     * 
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Changed = 0x0000000000000001L;
    /**
     * Whenever a gesture scroll physically ends.
     * 
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Ended = 0x0000000000000002L;
    /**
     * Whenever a gesture scroll doesn't end but the system stops tracking.
     * 
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000003L;
}