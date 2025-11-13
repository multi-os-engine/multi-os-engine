package apple.mapkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class MKAddressRepresentationsContextStyle {
    @Generated
    private MKAddressRepresentationsContextStyle() {
    }

    /**
     * Includes "United States" only if device region is not the United States
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Omits "United States"
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Short = 0x0000000000000001L;
    /**
     * Includes "United States" even if device region is the United States
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Full = 0x0000000000000002L;
}