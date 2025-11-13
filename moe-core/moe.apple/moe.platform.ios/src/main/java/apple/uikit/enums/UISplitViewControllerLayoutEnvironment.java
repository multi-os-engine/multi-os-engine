package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 26.0
 */
@Generated
public final class UISplitViewControllerLayoutEnvironment {
    @Generated
    private UISplitViewControllerLayoutEnvironment() {
    }

    /**
     * There is no containing split view controller.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Contained within an expanded split view controller.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Expanded = 0x0000000000000001L;
    /**
     * Contained within a collapsed split view controller.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Collapsed = 0x0000000000000002L;
}