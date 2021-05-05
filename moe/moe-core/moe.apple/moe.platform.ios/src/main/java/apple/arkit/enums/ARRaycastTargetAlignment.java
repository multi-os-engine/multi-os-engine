package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the alignment of a target.
 */
@Generated
public final class ARRaycastTargetAlignment {
    @Generated
    private ARRaycastTargetAlignment() {
    }

    /**
     * A target that is horizontal with respect to gravity.
     */
    @Generated @NInt public static final long Horizontal = 0x0000000000000000L;
    /**
     * A target that is vertical with respect to gravity.
     */
    @Generated @NInt public static final long Vertical = 0x0000000000000001L;
    /**
     * A target that is in any alignment, inclusive of horizontal and vertical.
     */
    @Generated @NInt public static final long Any = 0x0000000000000002L;
}