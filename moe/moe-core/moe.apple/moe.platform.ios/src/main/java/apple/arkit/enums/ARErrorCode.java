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
    @Generated @NInt public static final long MicrophoneUnauthorized = 0x0000000000000068L;
    @Generated @NInt public static final long InvalidReferenceImage = 0x000000000000012CL;
    @Generated @NInt public static final long InvalidReferenceObject = 0x000000000000012DL;
    @Generated @NInt public static final long InvalidWorldMap = 0x000000000000012EL;
    @Generated @NInt public static final long InvalidConfiguration = 0x000000000000012FL;
    @Generated @NInt public static final long CollaborationDataUnavailable = 0x0000000000000130L;
    @Generated @NInt public static final long InvalidCollaborationData = 0x0000000000000130L;
    @Generated @NInt public static final long InsufficientFeatures = 0x0000000000000190L;
    @Generated @NInt public static final long ObjectMergeFailed = 0x0000000000000191L;
    @Generated @NInt public static final long FileIOFailed = 0x00000000000001F4L;
}