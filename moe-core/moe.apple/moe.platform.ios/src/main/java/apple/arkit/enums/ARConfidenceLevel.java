package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants indicating the confidence level of per-pixel depth data.
 * 
 * API-Since: 14.0
 */
@Generated
public final class ARConfidenceLevel {
    @Generated
    private ARConfidenceLevel() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Low = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Medium = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long High = 0x0000000000000002L;
}