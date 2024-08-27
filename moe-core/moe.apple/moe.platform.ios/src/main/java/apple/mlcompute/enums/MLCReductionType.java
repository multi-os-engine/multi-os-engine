package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCReductionType
 * 
 * A reduction operation type.
 */
@Generated
public final class MLCReductionType {
    @Generated
    private MLCReductionType() {
    }

    /**
     * No reduction.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * The sum reduction.
     */
    @Generated public static final int Sum = 0x00000001;
    /**
     * The mean reduction.
     */
    @Generated public static final int Mean = 0x00000002;
    /**
     * The max reduction.
     */
    @Generated public static final int Max = 0x00000003;
    /**
     * The min reduction.
     */
    @Generated public static final int Min = 0x00000004;
    /**
     * The argmax reduction.
     */
    @Generated public static final int ArgMax = 0x00000005;
    /**
     * The argmin reduction.
     */
    @Generated public static final int ArgMin = 0x00000006;
    /**
     * The L1norm reduction.
     * 
     * API-Since: 14.5
     */
    @Generated public static final int L1Norm = 0x00000007;
    /**
     * Any(X) = X_0 || X_1 || ... X_n
     * 
     * API-Since: 14.5
     */
    @Generated public static final int Any = 0x00000008;
    /**
     * Alf(X) = X_0 && X_1 && ... X_n
     * 
     * API-Since: 14.5
     */
    @Generated public static final int All = 0x00000009;
    /**
     * Alf(X) = X_0 && X_1 && ... X_n
     */
    @Generated public static final int Count = 0x0000000A;
}
