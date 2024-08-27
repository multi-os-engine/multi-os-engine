package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enum constants for indicating the world alignment.
 */
@Generated
public final class ARWorldAlignment {
    @Generated
    private ARWorldAlignment() {
    }

    /**
     * Aligns the world with gravity that is defined by vector (0, -1, 0).
     */
    @Generated @NInt public static final long Gravity = 0x0000000000000000L;
    /**
     * Aligns the world with gravity that is defined by the vector (0, -1, 0)
     * and heading (w.r.t. True North) that is given by the vector (0, 0, -1).
     */
    @Generated @NInt public static final long GravityAndHeading = 0x0000000000000001L;
    /**
     * Aligns the world with the camera’s orientation.
     */
    @Generated @NInt public static final long Camera = 0x0000000000000002L;
}
