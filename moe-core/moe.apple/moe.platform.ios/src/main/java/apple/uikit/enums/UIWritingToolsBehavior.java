package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * UIWritingToolsBehavior
 * 
 * Controls the configuration of the available Writing Tools UI
 * 
 * 
 * API-Since: 18.0
 */
@Generated
public final class UIWritingToolsBehavior {
    @Generated
    private UIWritingToolsBehavior() {
    }

    /**
     * Writing Tools will ignore this view
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0xFFFFFFFFFFFFFFFFL;
    /**
     * System-defined behavior, may resolve to `None`, `Complete`, or `Limited`
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * The complete inline-editing experience will be provided if possible.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Complete = 0x0000000000000001L;
    /**
     * The limited, overlay-panel experience will be provided if possible.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Limited = 0x0000000000000002L;
}