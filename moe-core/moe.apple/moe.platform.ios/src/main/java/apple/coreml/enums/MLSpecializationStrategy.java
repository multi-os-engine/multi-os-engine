package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The optimization strategy for the model specialization.
 * 
 * API-Since: 18.0
 */
@Generated
public final class MLSpecializationStrategy {
    @Generated
    private MLSpecializationStrategy() {
    }

    /**
     * The strategy that works well for most applications.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Prefer the prediction latency at the potential cost of specialization time, memory footprint, and the disk space
     * usage of specialized artifacts.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long FastPrediction = 0x0000000000000001L;
}