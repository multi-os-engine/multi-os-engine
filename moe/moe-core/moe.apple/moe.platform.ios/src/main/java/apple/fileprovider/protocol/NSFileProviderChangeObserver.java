package apple.fileprovider.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderChangeObserver")
public interface NSFileProviderChangeObserver {
    /**
     * Delete existing items.  No-op if the item was unknown.
     */
    @Generated
    @Selector("didDeleteItemsWithIdentifiers:")
    void didDeleteItemsWithIdentifiers(NSArray<String> deletedItemIdentifiers);

    /**
     * Send updates to existing items, or insert new items.
     */
    @Generated
    @Selector("didUpdateItems:")
    void didUpdateItems(NSArray<?> updatedItems);

    /**
     * Call the following method every so often while sending changes, particularly
     * while enumerating changes to NSFileProviderWorkingSetContainerItemIdentifier.
     * If the device reboots during an enumeration, it would later resume starting
     * at the latest known sync anchor.
     * 
     * It is expected that the sync anchor passed here be different than the sync
     * anchor that the enumeration started at, unless the client was already up to
     * date on all the changes on the server, and didn't have any pending updates or
     * deletions.
     * 
     * Additionally, if the client is up to date on all the changes on the server it
     * should set moreComing to NO.
     * 
     * Sync anchor data is limited to 500 bytes.  Setting a larger anchor has the
     * same effect as calling finishEnumeratingWithError with an expired sync anchor
     * error.
     */
    @Generated
    @Selector("finishEnumeratingChangesUpToSyncAnchor:moreComing:")
    void finishEnumeratingChangesUpToSyncAnchorMoreComing(NSData anchor, boolean moreComing);

    /**
     * If the enumeration fails with NSFileProviderErrorSyncAnchorExpired, we will
     * drop all cached data and start the enumeration over starting with sync anchor
     * nil.
     */
    @Generated
    @Selector("finishEnumeratingWithError:")
    void finishEnumeratingWithError(NSError error);
}