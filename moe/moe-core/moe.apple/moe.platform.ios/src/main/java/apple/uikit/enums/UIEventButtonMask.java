package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Set of buttons pressed for the current event
 * Raw format of: 1 << (buttonNumber - 1)
 * UIEventButtonMaskPrimary = 1 << 0
 */
@Generated
public final class UIEventButtonMask {
    @Generated
    private UIEventButtonMask() {
    }

    @Generated @NInt public static final long Primary = 0x0000000000000001L;
    @Generated @NInt public static final long Secondary = 0x0000000000000002L;
}