package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UITextSearchFoundTextStyle {
    @Generated
    private UITextSearchFoundTextStyle() {
    }

    /**
     * No style.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Normal = 0x0000000000000000L;
    /**
     * "Found" style. Used to indicate matches that have been found, but not currently highlighted.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Found = 0x0000000000000001L;
    /**
     * Highlighted style, used to indicate a match that is found and currently highlighted.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Highlighted = 0x0000000000000002L;
}