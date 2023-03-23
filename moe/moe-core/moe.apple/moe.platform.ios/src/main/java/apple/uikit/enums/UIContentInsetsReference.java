package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class UIContentInsetsReference {
    @Generated
    private UIContentInsetsReference() {
    }

    /**
     * use system defined default
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * no additional insets
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long None = 0x0000000000000001L;
    /**
     * honor safe area
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long SafeArea = 0x0000000000000002L;
    /**
     * honor layout margins
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long LayoutMargins = 0x0000000000000003L;
    /**
     * honor readable content
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ReadableContent = 0x0000000000000004L;
}