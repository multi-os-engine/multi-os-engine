package apple.metal.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 14.0
 */
@Generated
public final class MTLAccelerationStructureInstanceOptions {
    @Generated
    private MTLAccelerationStructureInstanceOptions() {
    }

    /**
     * No options
     * 
     * API-Since: 14.0
     */
    @Generated public static final int None = 0x00000000;
    /**
     * Disable triangle back or front face culling
     * 
     * API-Since: 14.0
     */
    @Generated public static final int DisableTriangleCulling = 0x00000001;
    /**
     * Disable triangle back or front face culling
     * 
     * API-Since: 14.0
     */
    @Generated public static final int TriangleFrontFacingWindingCounterClockwise = 0x00000002;
    /**
     * Geometry is opaque
     * 
     * API-Since: 14.0
     */
    @Generated public static final int Opaque = 0x00000004;
    /**
     * Geometry is non-opaque
     * 
     * API-Since: 14.0
     */
    @Generated public static final int NonOpaque = 0x00000008;
}