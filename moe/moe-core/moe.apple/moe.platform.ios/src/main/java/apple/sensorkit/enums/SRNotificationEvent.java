package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SRNotificationEvent {
    @Generated
    private SRNotificationEvent() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Received = 0x0000000000000001L;
    @Generated @NInt public static final long DefaultAction = 0x0000000000000002L;
    @Generated @NInt public static final long SupplementaryAction = 0x0000000000000003L;
    @Generated @NInt public static final long Clear = 0x0000000000000004L;
    @Generated @NInt public static final long NotificationCenterClearAll = 0x0000000000000005L;
    @Generated @NInt public static final long Removed = 0x0000000000000006L;
    @Generated @NInt public static final long Hide = 0x0000000000000007L;
    @Generated @NInt public static final long LongLook = 0x0000000000000008L;
    @Generated @NInt public static final long Silence = 0x0000000000000009L;
    @Generated @NInt public static final long AppLaunch = 0x000000000000000AL;
    @Generated @NInt public static final long Expired = 0x000000000000000BL;
    @Generated @NInt public static final long BannerPulldown = 0x000000000000000CL;
    @Generated @NInt public static final long TapCoalesce = 0x000000000000000DL;
    @Generated @NInt public static final long Deduped = 0x000000000000000EL;
    @Generated @NInt public static final long DeviceActivated = 0x000000000000000FL;
    @Generated @NInt public static final long DeviceUnlocked = 0x0000000000000010L;
}
