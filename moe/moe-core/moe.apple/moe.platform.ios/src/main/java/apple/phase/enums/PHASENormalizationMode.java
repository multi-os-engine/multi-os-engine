package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASENormalizationMode
 * <p>
 * Normalization mode
 * <p>
 * Determines how sound assets are normalized for calibrated loudness on the output device.
 * [@note] In general, clients are advised to normalize sound assets (and streams).
 * This will make it easier to mix the content once assigned to a generator with a specified calbration mode and level.
 * [@constant] PHASENormalizationModeNone
 * No normalization is applied. In this case, it's advised that the client perform custom normalization.
 * [@constant] PHASENormalizationModeDynamic
 * Dynamic Normalization is applied.
 */
@Generated
public final class PHASENormalizationMode {
    @Generated
    private PHASENormalizationMode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Dynamic = 0x0000000000000001L;
}
