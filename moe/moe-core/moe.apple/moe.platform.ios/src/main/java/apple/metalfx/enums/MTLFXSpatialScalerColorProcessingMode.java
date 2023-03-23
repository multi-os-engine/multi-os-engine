package apple.metalfx.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class MTLFXSpatialScalerColorProcessingMode {
    @Generated
    private MTLFXSpatialScalerColorProcessingMode() {
    }

    /**
     * This should be used when the input and output textures are already in an sRGB or otherwise perceptual 0-1
     * encoding.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Perceptual = 0x0000000000000000L;
    /**
     * This should be used when the input and output textures will contain light linear data in the 0-1 range.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Linear = 0x0000000000000001L;
    /**
     * This should be used when the input and output texture will contain light linear data outside the 0-1 range.
     * In this case a reversible tonemapping operation will be done internally to convert to a 0-1 range.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long HDR = 0x0000000000000002L;
}