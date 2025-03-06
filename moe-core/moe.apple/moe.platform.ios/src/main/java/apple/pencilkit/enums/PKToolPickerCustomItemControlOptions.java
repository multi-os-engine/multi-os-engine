package apple.pencilkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options for which controls to present.
 */
@Generated
public final class PKToolPickerCustomItemControlOptions {
    @Generated
    private PKToolPickerCustomItemControlOptions() {
    }

    /**
     * Present neither a width nor opacity control.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Present a width control if width adjustment is supported.
     */
    @Generated @NUInt public static final long Width = 0x0000000000000001L;
    /**
     * Present an opacity control if color adjustment is supported.
     */
    @Generated @NUInt public static final long Opacity = 0x0000000000000002L;
}