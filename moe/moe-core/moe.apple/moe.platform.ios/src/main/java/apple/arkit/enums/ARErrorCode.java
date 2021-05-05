package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARErrorCode {
    @Generated
    private ARErrorCode() {
    }

    /**
     * Unsupported configuration.
     */
    @Generated @NInt public static final long UnsupportedConfiguration = 0x0000000000000064L;
    /**
     * A sensor required to run the session is not available.
     */
    @Generated @NInt public static final long SensorUnavailable = 0x0000000000000065L;
    /**
     * A sensor failed to provide the required input.
     */
    @Generated @NInt public static final long SensorFailed = 0x0000000000000066L;
    /**
     * App does not have permission to use the camera. The user may change this in settings.
     */
    @Generated @NInt public static final long CameraUnauthorized = 0x0000000000000067L;
    /**
     * World tracking has encountered a fatal error.
     */
    @Generated @NInt public static final long WorldTrackingFailed = 0x00000000000000C8L;
    /**
     * App does not have permission to use the microphone. The user may change this in settings.
     */
    @Generated @NInt public static final long MicrophoneUnauthorized = 0x0000000000000068L;
    /**
     * Invalid reference image
     */
    @Generated @NInt public static final long InvalidReferenceImage = 0x000000000000012CL;
    /**
     * Invalid reference object.
     */
    @Generated @NInt public static final long InvalidReferenceObject = 0x000000000000012DL;
    /**
     * Invalid world map.
     */
    @Generated @NInt public static final long InvalidWorldMap = 0x000000000000012EL;
    /**
     * Invalid configuration.
     */
    @Generated @NInt public static final long InvalidConfiguration = 0x000000000000012FL;
    /**
     * Collaboration data is not available.
     */
    @Generated @NInt public static final long CollaborationDataUnavailable = 0x0000000000000130L;
    /**
     * Invalid collaboration data.
     */
    @Generated @NInt public static final long InvalidCollaborationData = 0x0000000000000130L;
    /**
     * Insufficient features.
     */
    @Generated @NInt public static final long InsufficientFeatures = 0x0000000000000190L;
    /**
     * Object merge failed.
     */
    @Generated @NInt public static final long ObjectMergeFailed = 0x0000000000000191L;
    /**
     * Unable to read or write to file.
     */
    @Generated @NInt public static final long FileIOFailed = 0x00000000000001F4L;
    /**
     * App does not have permission to use the location data of the device. The user may change this in settings.
     */
    @Generated @NInt public static final long LocationUnauthorized = 0x0000000000000069L;
    /**
     * Geo tracking is not available at this location.
     */
    @Generated @NInt public static final long GeoTrackingNotAvailableAtLocation = 0x00000000000000C9L;
    /**
     * Geo tracking has encountered a runtime error.
     */
    @Generated @NInt public static final long GeoTrackingFailed = 0x00000000000000CAL;
    /**
     * Generic request failure.
     */
    @Generated @NInt public static final long RequestFailed = 0x00000000000001F5L;
}