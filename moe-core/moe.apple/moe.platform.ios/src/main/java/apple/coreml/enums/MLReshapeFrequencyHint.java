package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The anticipated frequency of changing input shapes
 * 
 * API-Since: 17.4
 */
@Generated
public final class MLReshapeFrequencyHint {
    @Generated
    private MLReshapeFrequencyHint() {
    }

    /**
     * The input shape is expected to change frequently on each prediction sent to this loaded model instance. Core ML
     * will try to minimize the latency associated with shape changes and avoid expensive shape-specific optimizations
     * prior to prediction computation. While prediction computation may be slower for each specific shape, switching
     * between shapes should be faster.
     * This is the default.
     * 
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Frequent = 0x0000000000000000L;
    /**
     * The input shape is expected to be stable and many/all predictions sent to this loaded model instance would use
     * the same input shapes repeatedly. On the shape change, Core ML re-optimizes the internal engine for the new shape
     * if possible. The re-optimization takes some time, but the subsequent predictions for the shape should run faster.
     * 
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Infrequent = 0x0000000000000001L;
}