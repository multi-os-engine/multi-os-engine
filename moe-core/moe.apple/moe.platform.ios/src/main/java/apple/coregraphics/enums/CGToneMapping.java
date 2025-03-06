package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 18.0
 */
@Generated
public final class CGToneMapping {
    @Generated
    private CGToneMapping() {
    }

    /**
     * A system default method will be used
     * 
     * API-Since: 18.0
     */
    @Generated public static final int Default = 0x00000000;
    /**
     * Implements tone mapping of HDR content associated with the CGImage gain map
     * 
     * API-Since: 18.0
     */
    @Generated public static final int ImageSpecificLumaScaling = 0x00000001;
    /**
     * Implements a tone curve that preserves SDR contrast and rolls off HDR highlights
     * 
     * API-Since: 18.0
     */
    @Generated public static final int ReferenceWhiteBased = 0x00000002;
    /**
     * Implements tone mapping based on ITU-R specifications for HDR-to-SDR and SDR-to-HDR conversions assuming
     * mastering peak of 1000 nits
     * 
     * API-Since: 18.0
     */
    @Generated public static final int ITURecommended = 0x00000003;
    /**
     * Implements Open EXR tone mapping gamma suitable for tone mapping images in extended linear sRGB color space to
     * SDR
     * 
     * API-Since: 18.0
     */
    @Generated public static final int EXRGamma = 0x00000004;
    /**
     * Does not apply any tone mapping. Color converted values in extended color spaces will be clipped to SDR
     * ([0.0-1.0]) range
     * 
     * API-Since: 18.0
     */
    @Generated public static final int None = 0x00000005;
}