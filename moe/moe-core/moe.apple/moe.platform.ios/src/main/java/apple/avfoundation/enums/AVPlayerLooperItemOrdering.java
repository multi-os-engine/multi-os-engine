package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVPlayerLooperItemOrdering
 * 
 * These constants are the allowable values of Looper's existingItemsOrder initization parameter.
 * [@constant] AVPlayerLooperItemOrderingLoopingItemsPrecedeExistingItems
 * Indicates that the looper will insert the replica items before any existing items in the specified AVQueuePlayer's
 * play queue. This is default behavior.
 * [@constant] AVPlayerLooperItemOrderingLoopingItemsFollowExistingItems
 * Indicates that the looper will insert the replica items after any existing items in the specified AVQueuePlayer's
 * play queue.
 * 
 * API-Since: 17.0
 */
@Generated
public final class AVPlayerLooperItemOrdering {
    @Generated
    private AVPlayerLooperItemOrdering() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long PrecedeExistingItems = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FollowExistingItems = 0x0000000000000001L;
}