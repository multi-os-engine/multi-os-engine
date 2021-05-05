package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INMediaUserContextSubscriptionStatus {
    @Generated
    private INMediaUserContextSubscriptionStatus() {
    }

    /**
     * The app does not offer subscriptions, or the subscription status is unavailable
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The user is not a subscriber, but subscriptions are offered
     */
    @Generated @NInt public static final long NotSubscribed = 0x0000000000000001L;
    /**
     * The user is registered with a subscription (free, trial, or paid)
     */
    @Generated @NInt public static final long Subscribed = 0x0000000000000002L;
}