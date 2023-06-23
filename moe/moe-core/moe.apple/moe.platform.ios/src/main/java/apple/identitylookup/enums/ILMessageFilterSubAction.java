package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes a sub-action to take in response to a received message.
 * 
 * API-Since: 16.0
 */
@Generated
public final class ILMessageFilterSubAction {
    @Generated
    private ILMessageFilterSubAction() {
    }

    /**
     * Insufficient information to determine an action to take. In a query response, has the effect of allowing the
     * message to be shown normally.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Prevent the message from being shown normally, filtered as Other message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalOthers = 0x0000000000002710L;
    /**
     * Prevent the message from being shown normally, filtered as Finance message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalFinance = 0x0000000000002711L;
    /**
     * Prevent the message from being shown normally, filtered as Orders (eCommerce) message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalOrders = 0x0000000000002712L;
    /**
     * Prevent the message from being shown normally, filtered as Reminder message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalReminders = 0x0000000000002713L;
    /**
     * Prevent the message from being shown normally, filtered as Health message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalHealth = 0x0000000000002714L;
    /**
     * Prevent the message from being shown normally, filtered as Weather message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalWeather = 0x0000000000002715L;
    /**
     * Prevent the message from being shown normally, filtered as Carrier message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalCarrier = 0x0000000000002716L;
    /**
     * Prevent the message from being shown normally, filtered as Rewards message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalRewards = 0x0000000000002717L;
    /**
     * Prevent the message from being shown normally, filtered as Government message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TransactionalPublicServices = 0x0000000000002718L;
    /**
     * Prevent the message from being shown normally, filtered as Others message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PromotionalOthers = 0x0000000000004E20L;
    /**
     * Prevent the message from being shown normally, filtered as Offers message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PromotionalOffers = 0x0000000000004E21L;
    /**
     * Prevent the message from being shown normally, filtered as Coupons message.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PromotionalCoupons = 0x0000000000004E22L;
}