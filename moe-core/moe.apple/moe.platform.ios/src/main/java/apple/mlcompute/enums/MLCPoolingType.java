package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCPoolingType
 * 
 * A pooling function type for a pooling layer.
 */
@Generated
public final class MLCPoolingType {
    @Generated
    private MLCPoolingType() {
    }

    /**
     * The max pooling type.
     */
    @Generated public static final int Max = 0x00000001;
    /**
     * The average pooling type.
     */
    @Generated public static final int Average = 0x00000002;
    /**
     * The L2-norm pooling type.
     */
    @Generated public static final int L2Norm = 0x00000003;
    /**
     * Must be last
     */
    @Generated public static final int Count = 0x00000004;
}
