package apple.videosubscriberaccount.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes the level of access to content.
 */
@Generated
public final class VSSubscriptionAccessLevel {
    @Generated
    private VSSubscriptionAccessLevel() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The default access level. Setting a subscription with this level will raise an exception.
     */
    @Generated @NInt public static final long FreeWithAccount = 0x0000000000000001L;
    /**
     * The customer has access to content that is offered for free to users with a valid account. This value corresponds
     * content in your availability feed with the "account" offering type.
     */
    @Generated @NInt public static final long Paid = 0x0000000000000002L;
}