package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A list of options that represent the kinds of data a message can contain.
 * 
 * API-Since: 18.4
 */
@Generated
public final class UIMessageConversationEntryDataKind {
    @Generated
    private UIMessageConversationEntryDataKind() {
    }

    /**
     * The message contains text.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Text = 0x0000000000000000L;
    /**
     * The message contains an attachment, such as an image or file.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Attachment = 0x0000000000000001L;
    /**
     * The message contains other data, such as data that represents a sticker or a payment.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Other = 0x0000000000000002L;
}