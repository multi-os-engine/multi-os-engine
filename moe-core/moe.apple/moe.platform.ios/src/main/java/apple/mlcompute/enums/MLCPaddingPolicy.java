package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCPaddingPolicy
 * 
 * A padding policy that you specify for a convolution or pooling layer.
 */
@Generated
public final class MLCPaddingPolicy {
    @Generated
    private MLCPaddingPolicy() {
    }

    /**
     * The "same" padding policy.
     */
    @Generated public static final int Same = 0x00000000;
    /**
     * The "valid" padding policy.
     */
    @Generated public static final int Valid = 0x00000001;
    /**
     * The choice to use explicitly specified padding sizes.
     */
    @Generated public static final int UsePaddingSize = 0x00000002;
}
