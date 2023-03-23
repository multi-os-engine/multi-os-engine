package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] PHASESpatialPipelineFlags
 * 
 * Spatial pipeline flags.
 * [@constant] PHASESpatialPipelineFlagDirectPathTransmission
 * Direct Path Transmission.
 * [@constant] PHASESpatialPipelineFlagEarlyReflections
 * Early Reflections.
 * [@constant] PHASESpatialPipelineFlagLateReverb
 * Late Reverb.
 */
@Generated
public final class PHASESpatialPipelineFlags {
    @Generated
    private PHASESpatialPipelineFlags() {
    }

    @Generated @NUInt public static final long DirectPathTransmission = 0x0000000000000001L;
    @Generated @NUInt public static final long EarlyReflections = 0x0000000000000002L;
    @Generated @NUInt public static final long LateReverb = 0x0000000000000004L;
}
