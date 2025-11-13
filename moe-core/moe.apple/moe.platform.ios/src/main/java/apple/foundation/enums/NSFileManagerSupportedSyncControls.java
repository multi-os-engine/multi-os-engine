package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * An option set of the sync controls available for an item.
 * 
 * Get an instance of this type by calling ``URL/resourceValues(forKeys:)`` on a ``URL`` instance (Swift) or
 * ``NSURL/getResourceValue:forKey:error:`` on an ``NSURL`` (Swift or Objective-C) and passing in the key
 * ``NSURLUbiquitousItemSupportedSyncControlsKey``.
 * 
 * API-Since: 26.0
 */
@Generated
public final class NSFileManagerSupportedSyncControls {
    @Generated
    private NSFileManagerSupportedSyncControls() {
    }

    /**
     * The file provider supports pausing the sync on the item.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long PauseSync = 0x0000000000000001L;
    /**
     * The file provider supports failing an upload if the local and server versions conflict.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long FailUploadOnConflict = 0x0000000000000002L;
}