package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * FanControl used to have WindSettingMask and WindSupportMask that had
 * identical values. Those got replaced with a single WindBitmap. We codegen
 * WindSupportMask as an alias of WindBitmap, but we need a manual shim for
 * WindSettingMask.
 * 
 * API-Since: 16.1
 * Deprecated-Since: 17.0
 * Deprecated-Message: Please use MTRFanControlWindBitmap
 */
@Generated
@Deprecated
public final class MTRFanControlWindSettingMask {
    @Generated
    private MTRFanControlWindSettingMask() {
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRFanControlWindBitmapSleepWind
     */
    @Generated @Deprecated public static final byte SleepWind = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRFanControlWindBitmapNaturalWind
     */
    @Generated @Deprecated public static final byte NaturalWind = 2;
}