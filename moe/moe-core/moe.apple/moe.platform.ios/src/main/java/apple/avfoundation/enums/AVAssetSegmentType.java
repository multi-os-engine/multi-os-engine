package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAssetSegmentType
 * 
 * Indicates the type of segment.
 * 
 * [@constant] AVAssetSegmentTypeInitialization
 * Indicates that the segment is a initialization segment.
 * [@constant] AVAssetSegmentTypeSeparable
 * Indicates that the segment is a separable segment.
 * 
 * API-Since: 14.0
 */
@Generated
public final class AVAssetSegmentType {
    @Generated
    private AVAssetSegmentType() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Initialization = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Separable = 0x0000000000000002L;
}
