package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCapturePhotoOutputCaptureReadiness
 * 
 * Constants indicating whether the output is ready to receive capture requests.
 * 
 * [@constant] AVCapturePhotoOutputCaptureReadinessSessionNotRunning
 * Indicates that the session is not running and the output is not ready to receive requests.
 * [@constant] AVCapturePhotoOutputCaptureReadinessReady
 * Indicates that the output is ready to receive new requests.
 * [@constant] AVCapturePhotoOutputCaptureReadinessNotReadyMomentarily
 * Indicates that the output is not ready to receive requests and may be ready shortly.
 * [@constant] AVCapturePhotoOutputCaptureReadinessNotReadyWaitingForCapture
 * Indicates that the output is not ready to receive requests for a longer duration because it is busy capturing.
 * [@constant] AVCapturePhotoOutputCaptureReadinessNotReadyWaitingForProcessing
 * Indicates that the output is not ready to receive requests for a longer duration because it is busy processing.
 * 
 * API-Since: 17.0
 */
@Generated
public final class AVCapturePhotoOutputCaptureReadiness {
    @Generated
    private AVCapturePhotoOutputCaptureReadiness() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SessionNotRunning = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long NotReadyMomentarily = 0x0000000000000002L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long NotReadyWaitingForCapture = 0x0000000000000003L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long NotReadyWaitingForProcessing = 0x0000000000000004L;
}