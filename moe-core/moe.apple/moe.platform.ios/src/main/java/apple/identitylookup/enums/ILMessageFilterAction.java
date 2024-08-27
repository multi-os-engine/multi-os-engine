package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes an action to take in response to a received message.
 * 
 * API-Since: 11.0
 */
@Generated
public final class ILMessageFilterAction {
    @Generated
    private ILMessageFilterAction() {
    }

    /**
     * Insufficient information to determine an action to take. In a query response, has the effect of allowing the
     * message to be shown normally.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Allow the message to be shown normally.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Allow = 0x0000000000000001L;
    /**
     * Prevent the message from being shown normally, filtered as Junk message.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long Filter = 0x0000000000000002L;
    /**
     * Prevent the message from being shown normally, filtered as Junk message.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Junk = 0x0000000000000002L;
    /**
     * Prevent the message from being shown normally, filtered as Promotional message.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Promotion = 0x0000000000000003L;
    /**
     * Prevent the message from being shown normally, filtered as Transactional message.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Transaction = 0x0000000000000004L;
}