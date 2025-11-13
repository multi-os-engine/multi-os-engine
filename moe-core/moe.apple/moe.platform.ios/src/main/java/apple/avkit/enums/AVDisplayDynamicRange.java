package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes how High Dynamic Range (HDR) video content renders.
 * 
 * API-Since: 26.0
 */
@Generated
public final class AVDisplayDynamicRange {
    @Generated
    private AVDisplayDynamicRange() {
    }

    /**
     * Defines an automatic dynamic range. Indicates that the dynamic range will be set automatically.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Defines a standard dynamic range. Restricts the video content dynamic range to the standard range regardless of
     * the actual range of the video content.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000001L;
    /**
     * Defines a constrained high dynamic range. Allows for constrained High Dynamic Range (HDR) video content which is
     * useful for mixing HDR and Standard Dynamic Range (SDR) content.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long ConstrainedHigh = 0x0000000000000002L;
    /**
     * Defines a high dynamic range. Allows video content to use extended dynamic range if it has dynamic range content.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long High = 0x0000000000000003L;
}