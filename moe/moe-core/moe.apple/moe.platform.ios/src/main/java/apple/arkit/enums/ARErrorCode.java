package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARErrorCode {
    @Generated
    private ARErrorCode() {
    }

    @Generated @NInt public static final long UnsupportedConfiguration = 0x0000000000000064L;
    @Generated @NInt public static final long SensorUnavailable = 0x0000000000000065L;
    @Generated @NInt public static final long SensorFailed = 0x0000000000000066L;
    @Generated @NInt public static final long CameraUnauthorized = 0x0000000000000067L;
    @Generated @NInt public static final long WorldTrackingFailed = 0x00000000000000C8L;
}