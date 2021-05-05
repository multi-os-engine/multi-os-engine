package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the classification of a plane anchor.
 */
@Generated
public final class ARPlaneClassification {
    @Generated
    private ARPlaneClassification() {
    }

    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Wall = 0x0000000000000001L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Floor = 0x0000000000000002L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Ceiling = 0x0000000000000003L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Table = 0x0000000000000004L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Seat = 0x0000000000000005L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Window = 0x0000000000000006L;
    /**
     * The classification is not any of the known classes.
     */
    @Generated @NInt public static final long Door = 0x0000000000000007L;
}