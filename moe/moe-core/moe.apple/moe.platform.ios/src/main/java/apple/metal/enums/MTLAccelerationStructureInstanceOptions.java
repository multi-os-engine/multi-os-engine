package apple.metal.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MTLAccelerationStructureInstanceOptions {
    @Generated
    private MTLAccelerationStructureInstanceOptions() {
    }

    /**
     * @brief No options
     */
    @Generated public static final int None = 0x00000000;
    /**
     * @brief Disable triangle back or front face culling
     */
    @Generated public static final int DisableTriangleCulling = 0x00000001;
    /**
     * @brief Disable triangle back or front face culling
     */
    @Generated public static final int TriangleFrontFacingWindingCounterClockwise = 0x00000002;
    /**
     * @brief Geometry is opaque
     */
    @Generated public static final int Opaque = 0x00000004;
    /**
     * @brief Geometry is non-opaque
     */
    @Generated public static final int NonOpaque = 0x00000008;
}