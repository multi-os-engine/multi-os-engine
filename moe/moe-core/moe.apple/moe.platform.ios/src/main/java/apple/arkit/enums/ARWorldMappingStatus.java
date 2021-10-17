package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the world mapping status for the area visible in a given frame.
 */
@Generated
public final class ARWorldMappingStatus {
    @Generated
    private ARWorldMappingStatus() {
    }

    /**
     * World mapping is not available.
     */
    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    /**
     * World mapping is available but has limited features.
     * For the device's current position, the session’s world map is not recommended for relocalization.
     */
    @Generated @NInt public static final long Limited = 0x0000000000000001L;
    /**
     * World mapping is actively extending the map with the user's motion.
     * The world map will be relocalizable for previously visited areas but is still being updated for the current space.
     */
    @Generated @NInt public static final long Extending = 0x0000000000000002L;
    /**
     * World mapping has adequately mapped the visible area.
     * The map can be used to relocalize for the device's current position.
     */
    @Generated @NInt public static final long Mapped = 0x0000000000000003L;
}
