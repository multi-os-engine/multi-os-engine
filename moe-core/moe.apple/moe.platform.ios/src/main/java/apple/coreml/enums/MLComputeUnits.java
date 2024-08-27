package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class MLComputeUnits {
    @Generated
    private MLComputeUnits() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long CPUOnly = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long CPUAndGPU = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long All = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long CPUAndNeuralEngine = 0x0000000000000003L;
}