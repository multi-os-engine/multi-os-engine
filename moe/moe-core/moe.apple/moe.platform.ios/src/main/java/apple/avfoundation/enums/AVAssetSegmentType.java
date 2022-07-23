package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAssetSegmentType
 * <p>
 * Indicates the type of segment.
 * <p>
 * [@constant] AVAssetSegmentTypeInitialization
 * Indicates that the segment is a initialization segment.
 * [@constant] AVAssetSegmentTypeSeparable
 * Indicates that the segment is a separable segment.
 */
@Generated
public final class AVAssetSegmentType {
    @Generated
    private AVAssetSegmentType() {
    }

    @Generated @NInt public static final long Initialization = 0x0000000000000001L;
    @Generated @NInt public static final long Separable = 0x0000000000000002L;
}
