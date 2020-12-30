package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the classification status of a plane anchor.
 */
@Generated
public final class ARPlaneClassificationStatus {
    @Generated
    private ARPlaneClassificationStatus() {
    }

    /**
     * Plane classification is currently unavailable.
     */
    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    /**
     * ARKit has not yet determined the classification of this plane.
     */
    @Generated @NInt public static final long Undetermined = 0x0000000000000001L;
    /**
     * ARKit is confident the plane is not any of the known classes.
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000002L;
    /**
     * ARKit has a classification for the plane it is confident in.
     */
    @Generated @NInt public static final long Known = 0x0000000000000003L;
}