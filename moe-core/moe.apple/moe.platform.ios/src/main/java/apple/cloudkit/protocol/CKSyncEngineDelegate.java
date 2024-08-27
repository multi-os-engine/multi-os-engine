package apple.cloudkit.protocol;

import apple.cloudkit.CKSyncEngine;
import apple.cloudkit.CKSyncEngineEvent;
import apple.cloudkit.CKSyncEngineFetchChangesContext;
import apple.cloudkit.CKSyncEngineFetchChangesOptions;
import apple.cloudkit.CKSyncEngineRecordZoneChangeBatch;
import apple.cloudkit.CKSyncEngineSendChangesContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * An interface by which `CKSyncEngine` communicates with your application.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CKSyncEngineDelegate")
public interface CKSyncEngineDelegate {
    /**
     * Called when an event occurs during the sync engine's operation.
     * 
     * This is how you receive updates about local state changes, fetched changes, sent changes, and more.
     * See ``CKSyncEngineEventType`` and ``CKSyncEngineEvent`` for all the possible events that might be posted.
     * 
     * ## Event ordering
     * 
     * Events will be given to your delegate serially.
     * You will not receive the next event until you have returned from this function for the previous event.
     */
    @Generated
    @Selector("syncEngine:handleEvent:")
    void syncEngineHandleEvent(@NotNull CKSyncEngine syncEngine, @NotNull CKSyncEngineEvent event);

    /**
     * Returns a custom set of options for `CKSyncEngine` to use while fetching changes.
     * 
     * While `CKSyncEngine` fetches changes from the server, it calls this function to determine priority and other
     * options for fetching changes.
     * This allows you to configure your fetches dynamically while the state changes in your app.
     * 
     * For example, you can use this to prioritize fetching the object currently showing in the UI.
     * You can also use this to prioritize specific zones during initial sync.
     * 
     * By default, `CKSyncEngine` will use whatever options are in the context.
     * You can return `context.options` if you don't want to perform any customization.
     * 
     * This callback will be called in between each server request while fetching changes.
     * This allows the fetching mechanism to react dynamically while your app state changes.
     * 
     * An example implementation might look something like this:
     * ```objc
     * - (CKSyncEngineFetchChangesOptions *)syncEngine:(CKSyncEngine *)syncEngine
     * nextFetchChangesOptionsForContext:(CKSyncEngineFetchChangesContext *)context {
     * 
     * // Start with the options from the context.
     * CKSyncEngineFetchChangesOptions *options = context.options;
     * 
     * // By default, the sync engine will automatically fetch changes for all zones.
     * // If you know that you only want to sync a specific set of zones, you can override that here.
     * options.scope = [[CKSyncEngineFetchChangesScope alloc] initWithZoneIDs:@[...]];
     * 
     * // You can prioritize specific zones to be fetched first by putting them in order.
     * NSMutableArray<CKRecordZoneID *> *prioritizedZoneIDs = [[NSMutableArray alloc] init];
     * 
     * // If you're showing some data in the UI, you might want to prioritize that zone first.
     * CKRecordZoneID *onScreenZoneID = uiController.currentlyViewedItem.zoneID;
     * if (onScreenZoneID != nil) {
     * [prioritizedZoneIDs addObject:onScreenZoneID];
     * }
     * 
     * // You could also prioritize special, well-known zones if that makes sense for your app.
     * // For example, if you have a top-level metadata zone that you'd like to sync first, you can prioritize that
     * here.
     * CKRecordZoneID *topLevelZoneID = [[CKRecordZoneID alloc] initWithZoneName:@"MyImportantMetadata"];
     * [prioritizedZoneIDs addObject:topLevelZoneID];
     * 
     * options.prioritizedZoneIDs = prioritizedZoneIDs;
     * return options
     * }
     * ```
     */
    @Generated
    @IsOptional
    @Selector("syncEngine:nextFetchChangesOptionsForContext:")
    @NotNull
    default CKSyncEngineFetchChangesOptions syncEngineNextFetchChangesOptionsForContext(
            @NotNull CKSyncEngine syncEngine, @NotNull CKSyncEngineFetchChangesContext context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called to get the next batch of record zone changes to send to the server.
     * 
     * The sync engine will call this function when it's about to to send changes to the server.
     * This might happen during an automatically scheduled sync or as a result of you calling `sendChanges`.
     * Provide the next batch of record zone changes to send by returning them from this function.
     * 
     * Once the sync engine starts sending changes, it will continue until there are no more pending changes to send.
     * You can return `nil` to indicate that you have no more pending changes for now.
     * The next time the sync engine tries to sync, it will call this again to get any new pending changes.
     * 
     * ## Sending changes for specific zones
     * 
     * When you call `sendChanges` for a specific set of zone IDs, you should make sure to only send changes for those
     * zones.
     * You can do this by checking the `zoneIDs` property on ``CKSyncEngineSendChangesContext/options``.
     * 
     * For example, you might have some code like this:
     * 
     * ```objc
     * - (CKSyncEngineRecordZoneChangeBatch *)syncEngine:(CKSyncEngine *)syncEngine
     * nextRecordZoneChangeBatchForContext:(CKSyncEngineSendChangesContext *)context {
     * CKSyncEngineSendChangesScope *scope = context.options.scope;
     * 
     * NSMutableArray<CKSyncEnginePendingRecordZoneChange *> *pendingChanges = [NSMutableArray new];
     * for (CKSyncEnginePendingRecordZoneChange *pendingChange in syncEngine.state.pendingRecordZoneChanges) {
     * if ([scope containsPendingRecordZoneChange:pendingChange]) {
     * [filteredChanges addObject:pendingChange];
     * }
     * }
     * 
     * CKSyncEngineRecordZoneChangeBatch *batch = [[CKSyncEngineRecordZoneChangeBatch alloc]
     * initWithPendingChanges:pendingChangesToSave recordProvider:^CKRecord * _Nullable(CKRecordID *recordID) {
     * return [self recordToSaveForRecordID:recordID];
     * }];
     * 
     * return batch;
     * }
     * ```
     */
    @Generated
    @Selector("syncEngine:nextRecordZoneChangeBatchForContext:")
    @Nullable
    CKSyncEngineRecordZoneChangeBatch syncEngineNextRecordZoneChangeBatchForContext(@NotNull CKSyncEngine syncEngine,
            @NotNull CKSyncEngineSendChangesContext context);
}