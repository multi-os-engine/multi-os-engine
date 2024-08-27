package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options passed on item creation.
 * 
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderCreateItemOptions {
    @Generated
    private NSFileProviderCreateItemOptions() {
    }

    /**
     * The imported item may already exist.
     * 
     * This can happen because:
     * 
     * 1. The imported item was found on disk after the synchronisation state was
     * lost, for example following the restoration of a backup, or the migration
     * to a new device.
     * 
     * 2. Two directories are merged together, due to the extension returning
     * the same itemIdentifier for both directories on the createItem completion handler.
     * Each child resulting of the merge may be recreated with the
     * mayAlreadyExist option. This allows the extension to recursively merge
     * directories.
     * 
     * The Extension should assess whether the item could actually be a disk
     * representation of an already existing item.
     * 
     * The best user experience is to match the requested item to one on the server,
     * if the extension is able to confirm that the disk item is representing an item already on
     * the server.
     * 
     * Given that this flag may be set when the system is reimporting all items from disk,
     * it is advised that the Extension attempts assessment methods for each item
     * in order from cheapest to most expensive (in terms of CPU and network), in order
     * to avoid unnecessary work.
     * 
     * When all the items pending reimport have been processed, the system
     * will call -[NSFileProviderExtension importDidFinishWithCompletionHandler:].
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long MayAlreadyExist = 0x0000000000000001L;
    /**
     * This item is recreated after the system failed to apply a deletion requested
     * by the extension because the item was found to be edited locally.
     * This happens only if the edit wasn't yet known by the system at the time the
     * deletion was requested.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long DeletionConflicted = 0x0000000000000002L;
}