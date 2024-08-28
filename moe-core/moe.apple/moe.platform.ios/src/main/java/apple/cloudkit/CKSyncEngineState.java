package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object that tracks some state required for proper and efficient operation of `CKSyncEngine`.
 * 
 * `CKSyncEngine` needs to track several things in order to properly sync.
 * For example, it needs to remember the last server change tokens for your database and zones.
 * It also needs to keep track of things like the last known user record ID and other various pieces of state.
 * 
 * A lot of this state is hidden internally, but some of it you can control.
 * 
 * ## Pending changes
 * 
 * One of the main things you can control is the list of pending changes to send to the server.
 * You can control these by calling functions like ``addPendingDatabaseChanges:`` and ``addPendingRecordZoneChanges:``.
 * When you add new pending changes, the sync engine will automatically schedule a task to sync with the server.
 * 
 * ## State serialization
 * 
 * `CKSyncEngine` will occasionally update its state in the background.
 * When it updates its state, your delegate will receive a ``CKSyncEngineStateUpdateEvent``.
 * 
 * This event will contain a ``CKSyncEngineStateSerialization``, which you should persist locally.
 * The next time your process launches, you initialize your sync engine with the last state serialization you received.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineState extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds to the list of pending database changes.
     * 
     * When you add a new pending change, the sync engine will automatically schedule a sync task.
     * 
     * The sync engine will ensure consistency and deduplicate these changes under the hood.
     */
    @Generated
    @Selector("addPendingDatabaseChanges:")
    public native void addPendingDatabaseChanges(@NotNull NSArray<? extends CKSyncEnginePendingDatabaseChange> changes);

    /**
     * Adds to the list of pending record zone changes.
     * 
     * When you add a new pending change, the sync engine will automatically schedule a sync task.
     * 
     * The sync engine will ensure consistency and deduplicate these changes under the hood.
     */
    @Generated
    @Selector("addPendingRecordZoneChanges:")
    public native void addPendingRecordZoneChanges(
            @NotNull NSArray<? extends CKSyncEnginePendingRecordZoneChange> changes);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineState allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * This represents whether or not you have pending changes to send to the server that aren't tracked in
     * `pendingRecordZoneChanges`.
     * This is useful if you want to track pending changes in your own local database instead of the sync engine state.
     * 
     * When this property is set, the sync engine will automatically schedule a sync.
     * When the sync task runs, it will ask your delegate for pending changes in `nextRecordZoneChangeBatch`.
     */
    @Generated
    @Selector("hasPendingUntrackedChanges")
    public native boolean hasPendingUntrackedChanges();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKSyncEngineState init();

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
    public static native CKSyncEngineState new_objc();

    /**
     * A list of database changes that need to be sent to the server, similar to `pendingRecordZoneChanges`.
     */
    @Generated
    @Selector("pendingDatabaseChanges")
    @NotNull
    public native NSArray<? extends CKSyncEnginePendingDatabaseChange> pendingDatabaseChanges();

    /**
     * A list of record changes that need to be sent to the server.
     * 
     * `CKSyncEngine` provides the convenience of tracking your pending record zone changes.
     * When the user makes some changes that need to be sent to the server, you can track them in this list.
     * Then, you can use this list when creating your next `CKSyncEngineRecordZoneChangeBatch` in your
     * `CKSyncEngineDelegate`.
     * 
     * The sync engine will ensure consistency and deduplicate these pending changes under the hood.
     * For example, if you add a pending save for record A, then record B, then record A again, this will result in a
     * list of `[saveRecordA, saveRecordB]`.
     * Similarly, if you add a pending save for record A, then add a pending delete for the same record A, this will
     * result in a single pending change of `[deleteRecordA]`.
     * 
     * The sync engine will manage this list while it sends changes to the server.
     * For example, when it successfully saves a record, it will remove that change from this list.
     * If it fails to send a change due to some retryable error (e.g. a network failure), it will keep that change in
     * this list.
     * 
     * If you'd prefer to track pending changes yourself, you can use `hasPendingUntrackedChanges` instead.
     */
    @Generated
    @Selector("pendingRecordZoneChanges")
    @NotNull
    public native NSArray<? extends CKSyncEnginePendingRecordZoneChange> pendingRecordZoneChanges();

    /**
     * Removes from the list of pending database changes.
     */
    @Generated
    @Selector("removePendingDatabaseChanges:")
    public native void removePendingDatabaseChanges(
            @NotNull NSArray<? extends CKSyncEnginePendingDatabaseChange> changes);

    /**
     * Removes from the list of pending record zone changes.
     */
    @Generated
    @Selector("removePendingRecordZoneChanges:")
    public native void removePendingRecordZoneChanges(
            @NotNull NSArray<? extends CKSyncEnginePendingRecordZoneChange> changes);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This represents whether or not you have pending changes to send to the server that aren't tracked in
     * `pendingRecordZoneChanges`.
     * This is useful if you want to track pending changes in your own local database instead of the sync engine state.
     * 
     * When this property is set, the sync engine will automatically schedule a sync.
     * When the sync task runs, it will ask your delegate for pending changes in `nextRecordZoneChangeBatch`.
     */
    @Generated
    @Selector("setHasPendingUntrackedChanges:")
    public native void setHasPendingUntrackedChanges(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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

    /**
     * The list of zone IDs that have new changes to fetch from the server.
     * `CKSyncEngine` keeps track of these zones and will update this list as it receives new information.
     */
    @Generated
    @Selector("zoneIDsWithUnfetchedServerChanges")
    @NotNull
    public native NSArray<? extends CKRecordZoneID> zoneIDsWithUnfetchedServerChanges();
}