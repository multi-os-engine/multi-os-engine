package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Set of options for running the session.
 * 
 * These options alter the behavior of calling run on a session.
 * Providing no options will result in the default behavior of resuming tracking
 * from the last known position and keeping all existing anchors.
 */
@Generated
public final class ARSessionRunOptions {
    @Generated
    private ARSessionRunOptions() {
    }

    /**
     * The session will reset tracking.
     */
    @Generated @NUInt public static final long ResetTracking = 0x0000000000000001L;
    /**
     * The session will remove existing anchors.
     */
    @Generated @NUInt public static final long RemoveExistingAnchors = 0x0000000000000002L;
    /**
     * The session will stop currently active tracked raycasts.
     */
    @Generated @NUInt public static final long StopTrackedRaycasts = 0x0000000000000004L;
    /**
     * The session will reset scene reconstruction.
     */
    @Generated @NUInt public static final long ResetSceneReconstruction = 0x0000000000000008L;
}