package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 12.0
 */
@Generated
public final class CGImagePixelFormatInfo {
    @Generated
    private CGImagePixelFormatInfo() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated public static final int Mask = 0x000F0000;
    /**
     * API-Since: 12.0
     */
    @Generated public static final int Packed = 0x00000000;
    /**
     * Only for RGB 16 bits per pixel, alpha != alpha none
     * 
     * API-Since: 12.0
     */
    @Generated public static final int RGB555 = 0x00010000;
    /**
     * Only for RGB 16 bits per pixel, alpha none
     * 
     * API-Since: 12.0
     */
    @Generated public static final int RGB565 = 0x00020000;
    /**
     * Only for RGB 32 bits per pixel, alpha != none
     * 
     * API-Since: 12.0
     */
    @Generated public static final int RGB101010 = 0x00030000;
    /**
     * Only for RGB 32 bits per pixel,
     * 10 bits per component, kCGImageByteOrder32Little
     * The 2 MSB of the pixel need to be set to 1
     * 
     * API-Since: 12.0
     */
    @Generated public static final int RGBCIF10 = 0x00040000;
}