package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UITextDropProgressMode {
    @Generated
    private UITextDropProgressMode() {
    }

    /**
     * Uses the default system UI for progress.
     * This blocks input to the application while the drop is happening.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long System = 0x0000000000000000L;
    /**
     * No progress UI is shown. You're on your own.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Custom = 0x0000000000000001L;
}