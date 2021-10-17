package apple.metal.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Describes what happens to the object before the first motion key and after the last
 * motion key.
 */
@Generated
public final class MTLMotionBorderMode {
    @Generated
    private MTLMotionBorderMode() {
    }

    /**
     * Motion is stopped. (default)
     */
    @Generated public static final int Clamp = 0x00000000;
    /**
     * Object disappears
     */
    @Generated public static final int Vanish = 0x00000001;
}
