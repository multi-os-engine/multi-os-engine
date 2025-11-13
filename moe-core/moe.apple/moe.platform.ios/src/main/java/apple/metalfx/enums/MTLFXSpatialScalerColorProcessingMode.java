package apple.metalfx.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The color space modes for the input and output textures you use with a spatial scaling effect instance.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLFXSpatialScalerColorProcessingMode {
    @Generated
    private MTLFXSpatialScalerColorProcessingMode() {
    }

    /**
     * Indicates your input and output textures use a perceptual color space (sRGB).
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Perceptual = 0x0000000000000000L;
    /**
     * Indicates your input and output textures use a linear color space in the `[0,1]` range.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Linear = 0x0000000000000001L;
    /**
     * Indicates your input and output textures use a high dynamic range color space, beyond the `[0,1]` range.
     * 
     * When you configure this mode, MetalFX performs a reversible tone mapping operation to convert your data to the
     * `[0,1]` range.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long HDR = 0x0000000000000002L;
}