package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the alignment of a plane anchor.
 */
@Generated
public final class ARPlaneAnchorAlignment {
    @Generated
    private ARPlaneAnchorAlignment() {
    }

    /**
     * A plane that is horizontal with respect to gravity.
     */
    @Generated @NInt public static final long Horizontal = 0x0000000000000000L;
    /**
     * A plane that is vertical with respect to gravity.
     */
    @Generated @NInt public static final long Vertical = 0x0000000000000001L;
}