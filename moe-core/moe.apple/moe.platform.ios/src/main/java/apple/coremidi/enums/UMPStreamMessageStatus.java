package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * kUMPStreamMessageStatus status nibbles.
 */
@Generated
public final class UMPStreamMessageStatus {
    @Generated
    private UMPStreamMessageStatus() {
    }

    @Generated public static final int EndpointDiscovery = 0x00000000;
    @Generated public static final int EndpointInfoNotification = 0x00000001;
    @Generated public static final int DeviceIdentityNotification = 0x00000002;
    @Generated public static final int EndpointNameNotification = 0x00000003;
    @Generated public static final int ProductInstanceIDNotification = 0x00000004;
    @Generated public static final int StreamConfigurationRequest = 0x00000005;
    @Generated public static final int StreamConfigurationNotification = 0x00000006;
    @Generated public static final int FunctionBlockDiscovery = 0x00000010;
    @Generated public static final int FunctionBlockInfoNotification = 0x00000011;
    @Generated public static final int FunctionBlockNameNotification = 0x00000012;
    @Generated public static final int StartOfClip = 0x00000020;
    @Generated public static final int EndOfClip = 0x00000021;
}