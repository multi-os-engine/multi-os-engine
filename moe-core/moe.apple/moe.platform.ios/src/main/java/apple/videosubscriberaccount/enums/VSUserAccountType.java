package apple.videosubscriberaccount.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.4
 */
@Generated
public final class VSUserAccountType {
    @Generated
    private VSUserAccountType() {
    }

    /**
     * Default. The user has access to free content only.
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Free = 0x0000000000000000L;
    /**
     * The user has access to content offered to paid subscriptions.
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long Paid = 0x0000000000000001L;
}