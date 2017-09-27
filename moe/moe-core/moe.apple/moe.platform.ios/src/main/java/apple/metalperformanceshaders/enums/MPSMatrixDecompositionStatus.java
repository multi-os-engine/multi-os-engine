package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSMatrixDecompositionStatus {
    @Generated
    private MPSMatrixDecompositionStatus() {
    }

    @Generated public static final int Success = 0x00000000;
    @Generated public static final int Failure = 0xFFFFFFFF;
    @Generated public static final int Singular = 0xFFFFFFFE;
    @Generated public static final int NonPositiveDefinite = 0xFFFFFFFD;
}