package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Represents a preference for the structure of Find elements in the main menu.
 * 
 * API-Since: 26.0
 */
@Generated
public final class UIMenuSystemFindElementGroupConfigurationStyle {
    @Generated
    private UIMenuSystemFindElementGroupConfigurationStyle() {
    }

    /**
     * The default preference. Find elements are automatically included based on the platform and other system
     * behaviors.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * Prefer a minimal set of find elements, only consisting of elements to search content in the app.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Search = 0x0000000000000001L;
    /**
     * Prefer a set of elements for finding within a non-editable text area
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long NonEditableText = 0x0000000000000002L;
    /**
     * Prefer a full set of elements for finding and replacing text, such as Find, Find and Replace, Find Navigation,
     * and so on.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long EditableText = 0x0000000000000003L;
}