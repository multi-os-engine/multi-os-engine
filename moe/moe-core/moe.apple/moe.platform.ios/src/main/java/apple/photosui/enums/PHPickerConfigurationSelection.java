package apple.photosui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * An enum that determines how the picker handles user selection.
 */
@Generated
public final class PHPickerConfigurationSelection {
    @Generated
    private PHPickerConfigurationSelection() {
    }

    /**
     * Uses the default selection behavior.
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Uses the selection order made by the user. Selected assets are numbered.
     */
    @Generated @NInt public static final long Ordered = 0x0000000000000001L;
}
