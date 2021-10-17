package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       MLCPaddingType
 * <p>
 * A padding type that you specify for a padding layer.
 */
@Generated
public final class MLCPaddingType {
    @Generated
    private MLCPaddingType() {
    }

    /**
     * The zero padding type.
     */
    @Generated public static final int Zero = 0x00000000;
    /**
     * The reflect padding type.
     */
    @Generated public static final int Reflect = 0x00000001;
    /**
     * The symmetric padding type.
     */
    @Generated public static final int Symmetric = 0x00000002;
    /**
     * The constant padding type.
     */
    @Generated public static final int Constant = 0x00000003;
}
