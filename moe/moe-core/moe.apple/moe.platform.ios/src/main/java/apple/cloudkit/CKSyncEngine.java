package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * `CKSyncEngine` encapsulates the logic of syncing data with a CloudKit database.
 * 
 * Syncing with CloudKit involves many moving pieces.
 * Apps need to schedule syncs, create and batch operations, subscribe to database changes,
 * listen for push notifications, store sync state, handle a multitude of errors, and more.
 * `CKSyncEngine` is designed to encapsulate this logic in a higher-level API.
 * 
 * # Start Your Sync Engine
 * 
 * Generally, you should initialize your `CKSyncEngine` soon after your process launches.
 * The sync engine will perform work in the background on your behalf, and it needs to be initialized
 * so that it can properly listen for push notifications and handle scheduled sync tasks.
 * 
 * When initializing your sync engine, you need to provide an object conforming to the ``CKSyncEngineDelegate``
 * protocol.
 * This protocol is the main method of communication between the sync engine and your app.
 * You also need to provide your last known version of the ``CKSyncEngine/State/Serialization``.
 * See ``CKSyncEngine/State`` and ``Event/StateUpdate`` for more details on the sync engine state.
 * 
 * Note that before using `CKSyncEngine` in your app, you need to add the CloudKit and remote notification capabilities.
 * 
 * # Sending Changes to the Server
 * 
 * In order to send changes to the server, you first need to tell the sync engine you have pending changes to send.
 * You can do this by adding pending changes to the sync engine's ``CKSyncEngine/state`` property.
 * 
 * When you add pending changes to the state, the sync engine will schedule a task to sync.
 * When the sync task runs, the sync engine will start sending changes to the server.
 * The sync engine will automatically send database changes from ``State/pendingDatabaseChanges``, but you need to
 * provide the record zone changes yourself.
 * In order to send record zone changes, you need to return them from
 * ``CKSyncEngineDelegate/nextRecordZoneChangeBatch(_:syncEngine:)``.
 * 
 * When the sync engine finishes sending a batch of changes to the server,
 * your `CKSyncEngineDelegate` will receive ``Event/sentDatabaseChanges(_:)`` and ``Event/sentRecordZoneChanges(_:)``
 * events.
 * These events will notify you of the success or failure of the changes you tried to send.
 * 
 * At a high level, sending changes to the server happens with the following order of operations:
 * 
 * 1. You add pending changes to ``CKSyncEngine/state``.
 * 2. You receive ``Event/willSendChanges(_:)`` in ``CKSyncEngineDelegate/handleEvent(_:syncEngine:)``
 * 3. If there are pending database changes, the sync engine sends the next batch.
 * 4. If any database changes were sent, your delegate receives``Event/sentDatabaseChanges(_:)``.
 * 5. Repeat from step 3 until all pending database changes are sent, then move on to record zone changes in step 6.
 * 6. The sync engine asks for the next batch of record zone changes by calling
 * ``CKSyncEngineDelegate/nextRecordZoneChangeBatchToSend(_:syncEngine:)``.
 * 7. The sync engine sends the next record zone change batch to the server.
 * 8. If any record zone changes were sent, your delegate receives ``Event/sentRecordZoneChanges(_:)``.
 * 9. If you added any pending database changes during steps 6-8, the sync engine repeats from step 3. Otherwise, it
 * repeats from step 6.
 * 10. When all pending changes are sent, your delegate receives ``Event/didSendChanges(_:)``.
 * 
 * # Fetching Changes from the Server
 * 
 * The sync engine will automatically listen for remote notifications, and it will fetch changes from the server when
 * necessary.
 * Generally, you'll receive events in this order:
 * 
 * 1. Your delegate receives ``Event/willFetchChanges(_:)``.
 * 2. If there are new database changes to fetch, you receive batches of them in ``Event/fetchedDatabaseChanges(_:)``
 * events.
 * 3. If there are new record zone changes to fetch, you will receive ``Event/willFetchRecordZoneChanges(_:)`` for each
 * zone that has new changes.
 * 4. The sync engine fetches record zone changes and gives you batches of them in
 * ``Event/fetchedRecordZoneChanges(_:)`` events.
 * 5. Your delegate receives ``Event/didFetchRecordZoneChanges(_:)`` for each zone that had changes to fetch.
 * 6. Your delegate receives ``Event/didFetchChanges(_:)``, indicating that sync engine has finished fetching changes.
 * 
 * # Sync Scheduling
 * 
 * ## Automatic sync
 * 
 * By default, the sync engine will automatically schedule sync tasks on your behalf.
 * If the user is signed in, the device has a network connection, and the system is generally in a good state, these
 * scheduled syncs will happen relatively quickly.
 * However, if the device has no network, is low on power, or is otherwise under a heavy load, these automatic syncs
 * might be delayed.
 * Similarly, if the user isn't signed in to an account, the sync engine won't perform any sync tasks at all.
 * 
 * ## Manual sync
 * 
 * Generally, you should rely on this automatic sync behavior, but there may be some cases where you want to manually
 * trigger a sync.
 * For example, if you have a pull-to-refresh UI, you can call ``CKSyncEngine/fetchChanges(_:)`` to tell the sync engine
 * to fetch immediately.
 * Or if you want to provide some sort of "backup now" button, you can call ``CKSyncEngine/sendChanges(_:)`` to send to
 * the server immediately.
 * 
 * ### Testing
 * 
 * These manual sync functions might also be useful during automated testing.
 * When writing automated tests, you can turn off automatic sync via ``CKSyncEngine/Configuration/automaticallySync``.
 * Then, you'll have complete control over the ordering of sync events.
 * This allows you to interject behavior in the sync flow and simulate specific sequences of events.
 * 
 * # Error Handling
 * 
 * There are some transient errors that the sync engine will handle automatically behind the scenes.
 * The sync engine will retry the operations for these transient errors automatically when it makes sense to do so.
 * Specifically, the sync engine will handle the following errors on your behalf:
 * 
 * * ``CKErrorCode/notAuthenticated``
 * * ``CKErrorCode/accountTemporarilyUnavailable``
 * * ``CKErrorCode/networkFailure``
 * * ``CKErrorCode/networkUnavailable``
 * * ``CKErrorCode/requestRateLimited``
 * * ``CKErrorCode/serviceUnavailable``
 * * ``CKErrorCode/zoneBusy``
 * 
 * When the sync engine encounters one of these errors, it will wait for the system to be in a good state and try again.
 * For example, if the server sends back a `.requestRateLimited` error, the sync engine will respect this throttle and
 * try again after the retry-after time.
 * 
 * `CKSyncEngine` will _not_ handle errors that require application-specific logic.
 * For example, if you try to save a record and get a ``CKErrorCode/serverRecordChanged``, you need to handle that error
 * yourself.
 * There are plenty of errors that the sync engine cannot handle on your behalf, see ``CKErrorCode`` for a list of all
 * the possible errors.
 * 
 * # Accounts
 * 
 * `CKSyncEngine` monitors for account status, and it will only sync if there's an account signed in.
 * Because of this, you can initialize your `CKSyncEngine` at any time, regardless of account status.
 * If there is no account, or if the user disabled sync in settings, the sync engine will stay dormant in the
 * background.
 * Once an account is available, the sync engine will start syncing automatically.
 * 
 * It will also listen for when the user signs in or out of their account.
 * When it notices an account change, it will send an ``Event/accountChange(_:)`` to your delegate.
 * It's your responsibility to react appropriately to this change and update your local persistence.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngine alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngine allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancels any currently executing or pending sync operations.
     * 
     * Note that cancellation does not happen synchronously, and it's possible some in-flight operations will succeed.
     */
    @Generated
    @Selector("cancelOperationsWithCompletionHandler:")
    public native void cancelOperationsWithCompletionHandler(
            @ObjCBlock(name = "call_cancelOperationsWithCompletionHandler") @Nullable Block_cancelOperationsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelOperationsWithCompletionHandler {
        @Generated
        void call_cancelOperationsWithCompletionHandler();
    }

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * The database this sync engine will sync with.
     */
    @Generated
    @Selector("database")
    @NotNull
    public native CKDatabase database();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fetches changes from the server immediately, bypassing the system scheduler.
     * 
     * By default, the sync engine will automatically fetch changes from the server for you, and you should not have to
     * call this function.
     * However, you can call this if for some reason you need to ensure all changes have been fetched from the server
     * before proceeding.
     * For example, you might use this in your tests to simulate specific sync scenarios.
     * 
     * Fetching changes from the server might result in some events being posted to your delegate via `handleEvent`.
     * For example, you might receive a `CKSyncEngineWillFetchChangesEvent` or `CKSyncEngineWillFetchChangesEvent`.
     * This will not complete until all the relevant events have been handled by your delegate.
     */
    @Generated
    @Selector("fetchChangesWithCompletionHandler:")
    public native void fetchChangesWithCompletionHandler(
            @ObjCBlock(name = "call_fetchChangesWithCompletionHandler") @Nullable Block_fetchChangesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchChangesWithCompletionHandler {
        @Generated
        void call_fetchChangesWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Fetches changes from the server with the specified options.
     * See ``fetchChangesWithCompletionHandler:`` for more information.
     */
    @Generated
    @Selector("fetchChangesWithOptions:completionHandler:")
    public native void fetchChangesWithOptionsCompletionHandler(@NotNull CKSyncEngineFetchChangesOptions options,
            @ObjCBlock(name = "call_fetchChangesWithOptionsCompletionHandler") @Nullable Block_fetchChangesWithOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchChangesWithOptionsCompletionHandler {
        @Generated
        void call_fetchChangesWithOptionsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKSyncEngine init();

    /**
     * Initializes a `CKSyncEngine` with the given configuration.
     * See properties on ``CKSyncEngineConfiguration`` for more details on all the options.
     */
    @Generated
    @Selector("initWithConfiguration:")
    public native CKSyncEngine initWithConfiguration(@NotNull CKSyncEngineConfiguration configuration);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CKSyncEngine new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sends any pending changes to the server immediately, bypassing the system scheduler.
     * 
     * By default, the sync engine will automatically send changes to the server for you, and you should not have to
     * call this function.
     * However, you can call this if for some reason you need to ensure all changes have been sent to the server before
     * proceeding.
     * For example, you might consider using this in your tests to simulate specific sync scenarios.
     * 
     * Sending changes to the server might result in some events being posted to your delegate via `handleEvent`.
     * For example, you might receive a `CKSyncEngineWillSendChangesEvent` or `CKSyncEngineDidSendChangesEvent`.
     * This function will not return until all the relevant events have been handled by your delegate.
     */
    @Generated
    @Selector("sendChangesWithCompletionHandler:")
    public native void sendChangesWithCompletionHandler(
            @ObjCBlock(name = "call_sendChangesWithCompletionHandler") @Nullable Block_sendChangesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendChangesWithCompletionHandler {
        @Generated
        void call_sendChangesWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Sends pending changes to the server with the specified options.
     * See discussion in ``sendChangesWithCompletionHandler:`` for more information.
     */
    @Generated
    @Selector("sendChangesWithOptions:completionHandler:")
    public native void sendChangesWithOptionsCompletionHandler(@NotNull CKSyncEngineSendChangesOptions options,
            @ObjCBlock(name = "call_sendChangesWithOptionsCompletionHandler") @Nullable Block_sendChangesWithOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendChangesWithOptionsCompletionHandler {
        @Generated
        void call_sendChangesWithOptionsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A collection of state properties used to efficiently manage sync engine operation.
     * See ``CKSyncEngineState`` for more details.
     */
    @Generated
    @Selector("state")
    @NotNull
    public native CKSyncEngineState state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}