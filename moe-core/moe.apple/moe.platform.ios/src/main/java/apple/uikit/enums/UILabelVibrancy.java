package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class UILabelVibrancy {
    @Generated
    private UILabelVibrancy() {
    }

    /**
     * No vibrancy will be applied automatically in this mode.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Vibrancy gets applied automatically to labels if the context allows it.
     * The kind of vibrancy effects depends on the labels text color.
     * labelColor becomes UIVibrancyEffectStyleLabel,
     * secondaryLabelColor becomes UIVibrancyEffectStyleSecondaryLabel etc.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000001L;
}