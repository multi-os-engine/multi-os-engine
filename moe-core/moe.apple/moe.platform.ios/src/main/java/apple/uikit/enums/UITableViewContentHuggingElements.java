package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A setting for which items in the table view should tightly hug their content
 * 
 * API-Since: 18.0
 */
@Generated
public final class UITableViewContentHuggingElements {
    @Generated
    private UITableViewContentHuggingElements() {
    }

    /**
     * A content hugging mode where none of the items in the table view tightly hug their content
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * A content hugging mode where section headers in the table view tightly hug their content
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long SectionHeaders = 0x0000000000000001L;
}