package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * SCNInteractionMode specify the behavior of the camera relative to
 * screen space interactions.
 */
@Generated
public final class SCNInteractionMode {
    @Generated
    private SCNInteractionMode() {
    }

    /**
     * Relative to up vector.
     */
    @Generated @NInt public static final long Fly = 0x0000000000000000L;
    /**
     * rotate around target with absolute orientation from angles accumulation.
     */
    @Generated @NInt public static final long OrbitTurntable = 0x0000000000000001L;
    /**
     * rotate around target by mapping 2D screen coordinates to spherical coordinates.
     */
    @Generated @NInt public static final long OrbitAngleMapping = 0x0000000000000002L;
    @Generated @NInt public static final long OrbitCenteredArcball = 0x0000000000000003L;
    /**
     * rotate around target by mapping 2D screen coordinates to an half sphere.
     */
    @Generated @NInt public static final long OrbitArcball = 0x0000000000000004L;
    /**
     * camera space translation on X/Y
     */
    @Generated @NInt public static final long Pan = 0x0000000000000005L;
    /**
     * camera space translation on X/Z
     */
    @Generated @NInt public static final long Truck = 0x0000000000000006L;
}