package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A set of categories for an email.
 * 
 * API-Since: 18.4
 */
@Generated
public final class UIMailConversationEntryKind {
    @Generated
    private UIMailConversationEntryKind() {
    }

    /**
     * The email does not fit in a specific category.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The email is personal correspondence.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Personal = 0x0000000000000001L;
    /**
     * The email contains a promotional offer.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Promotion = 0x0000000000000002L;
    /**
     * The email is related to social media.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Social = 0x0000000000000003L;
    /**
     * The email is related to a purchase or transaction.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Transaction = 0x0000000000000004L;
    /**
     * The email is related to news or current events.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long News = 0x0000000000000005L;
}