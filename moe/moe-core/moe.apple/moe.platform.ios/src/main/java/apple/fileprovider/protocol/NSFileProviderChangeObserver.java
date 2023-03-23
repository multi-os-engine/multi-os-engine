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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.ann.IsOptional;

/**
 * API-Since: 11.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderChangeObserver")
public interface NSFileProviderChangeObserver {
    /**
     * Delete existing items. No-op if the item was unknown.
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
     * This method is used to complete a batch of changes. Follow the advice
     * in -[NSFileProviderChangeObserver suggestedBatchSize] to determine when to
     * call this method.
     * 
     * It is expected that the sync anchor passed here be different than the sync
     * anchor that the enumeration started at, unless the client was already up to
     * date on all the changes on the server, and didn't have any pending updates or
     * deletions.
     * 
     * Additionally, if the client is up to date on all the changes on the server it
     * should set moreComing to NO.
     * 
     * Sync anchor data is limited to 500 bytes. Setting a larger anchor has the
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

    /**
     * Size of the batch suggested by the system for better performance.
     * 
     * The system will set that property to the value it considers is best suited for the current enumeration. The
     * system can enumerate changes on a container in various cases (container presenter in the UI, file opened in an
     * application, ...). Each case has its own performance profile.
     * 
     * In case the enumerator has already more than suggestedBatchSize pending changes ready to enumerate, it is
     * suggested
     * it split the list of changes into several batches. If the enumerator does not have suggestedBatchSize ready to
     * enumerator, the enumerator should finish immediately and not wait for more incoming changes to enumerate.
     * 
     * By taking into account the suggested size, the enumeration will guarantee the best user experience possible.
     * Large
     * batches can cause performance issues. And when the device reboots, enumerations will resume from the latest
     * known sync anchor. Telling the system about the latest sync anchor more frequently will reduce the number
     * of re-enumerations on system reboot.
     * 
     * The system enforces a maximum of 100 times the suggested size.
     * 
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("suggestedBatchSize")
    @NInt
    default long suggestedBatchSize() {
        throw new java.lang.UnsupportedOperationException();
    }
}
