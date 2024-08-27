package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class SRNotificationEvent {
    @Generated
    private SRNotificationEvent() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Received = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long DefaultAction = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long SupplementaryAction = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Clear = 0x0000000000000004L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotificationCenterClearAll = 0x0000000000000005L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Removed = 0x0000000000000006L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Hide = 0x0000000000000007L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long LongLook = 0x0000000000000008L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Silence = 0x0000000000000009L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long AppLaunch = 0x000000000000000AL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Expired = 0x000000000000000BL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long BannerPulldown = 0x000000000000000CL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TapCoalesce = 0x000000000000000DL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Deduped = 0x000000000000000EL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long DeviceActivated = 0x000000000000000FL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long DeviceUnlocked = 0x0000000000000010L;
}
