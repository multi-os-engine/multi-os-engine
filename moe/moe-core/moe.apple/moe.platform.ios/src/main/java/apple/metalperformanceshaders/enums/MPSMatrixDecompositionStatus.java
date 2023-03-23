package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSMatrixDecompositionStatus {
    @Generated
    private MPSMatrixDecompositionStatus() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated public static final int Success = 0x00000000;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int Failure = 0xFFFFFFFF;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int Singular = 0xFFFFFFFE;
    /**
     * API-Since: 11.0
     */
    @Generated public static final int NonPositiveDefinite = 0xFFFFFFFD;
}