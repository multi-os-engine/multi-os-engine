package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class UITextItemContentType {
    @Generated
    private UITextItemContentType() {
    }

    /**
     * The text item represents a link.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Link = 0x0000000000000000L;
    /**
     * The text item represents a text attachment.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long TextAttachment = 0x0000000000000001L;
    /**
     * The text item represents a custom tag.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Tag = 0x0000000000000002L;
}