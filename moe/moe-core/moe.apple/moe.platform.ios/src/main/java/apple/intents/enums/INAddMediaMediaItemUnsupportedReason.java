package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class INAddMediaMediaItemUnsupportedReason {
    @Generated
    private INAddMediaMediaItemUnsupportedReason() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LoginRequired = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long SubscriptionRequired = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long UnsupportedMediaType = 0x0000000000000003L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ExplicitContentSettings = 0x0000000000000004L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long CellularDataSettings = 0x0000000000000005L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RestrictedContent = 0x0000000000000006L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ServiceUnavailable = 0x0000000000000007L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long RegionRestriction = 0x0000000000000008L;
}