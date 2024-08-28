package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTROnOffDelayedAllOffEffectVariant {
    @Generated
    private MTROnOffDelayedAllOffEffectVariant() {
    }

    /**
     * API-Since: 17.2
     */
    @Generated public static final byte VariantDelayedOffFastFade = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.2
     * Deprecated-Message: Please use MTROnOffDelayedAllOffEffectVariantDelayedOffFastFade
     */
    @Generated @Deprecated public static final byte VariantFadeToOffIn0p8Seconds = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte VariantNoFade = 1;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte VariantDelayedOffSlowFade = 2;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.2
     * Deprecated-Message: Please use MTROnOffDelayedAllOffEffectVariantDelayedOffSlowFade
     */
    @Generated @Deprecated public static final byte Variant50PercentDimDownIn0p8SecondsThenFadeToOffIn12Seconds = 2;
}