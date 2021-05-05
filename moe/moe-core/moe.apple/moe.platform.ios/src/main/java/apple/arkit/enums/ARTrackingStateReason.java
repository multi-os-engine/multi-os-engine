package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A reason describing why the camera’s tracking state is limited.
 */
@Generated
public final class ARTrackingStateReason {
    @Generated
    private ARTrackingStateReason() {
    }

    /**
     * Tracking is not limited.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Tracking is limited due to initialization in progress.
     */
    @Generated @NInt public static final long Initializing = 0x0000000000000001L;
    /**
     * Tracking is limited due to a excessive motion of the camera.
     */
    @Generated @NInt public static final long ExcessiveMotion = 0x0000000000000002L;
    /**
     * Tracking is limited due to a lack of features visible to the camera.
     */
    @Generated @NInt public static final long InsufficientFeatures = 0x0000000000000003L;
    /**
     * Tracking is limited due to a relocalization in progress.
     */
    @Generated @NInt public static final long Relocalizing = 0x0000000000000004L;
}