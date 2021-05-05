package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Option set indicating the type of planes to detect.
 */
@Generated
public final class ARPlaneDetection {
    @Generated
    private ARPlaneDetection() {
    }

    /**
     * No plane detection is run.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Plane detection determines horizontal planes in the scene.
     */
    @Generated @NUInt public static final long Horizontal = 0x0000000000000001L;
    /**
     * Plane detection determines vertical planes in the scene.
     */
    @Generated @NUInt public static final long Vertical = 0x0000000000000002L;
}