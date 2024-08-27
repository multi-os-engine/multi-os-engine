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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A batch of record zone changes that `CKSyncEngine` will send to the server in a single request.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKSyncEngineRecordZoneChangeBatch extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKSyncEngineRecordZoneChangeBatch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKSyncEngineRecordZoneChangeBatch alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CKSyncEngineRecordZoneChangeBatch allocWithZone(VoidPtr zone);

    /**
     * If set to true, the sync engine will modify these records atomically by zone.
     * 
     * If this is true, and if any record change fails, then any other changes from that zone in this batch will also
     * fail with ``CKErrorBatchRequestFailed``.
     * 
     * Records that exist in different zones will not be modified together atomically.
     */
    @Generated
    @Selector("atomicByZone")
    public native boolean atomicByZone();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CKSyncEngineRecordZoneChangeBatch init();

    /**
     * Creates a batch of record zone changes according to a list of pending changes.
     * 
     * This will iterate over the pending changes in order and add them to the batch until it reaches the max batch
     * size.
     * 
     * When it sees a pending save, it will ask the record provider for the actual `CKRecord` to send to the server.
     * If you return `nil` from the record provider, this will skip to the next pending change.
     * 
     * This will return `nil` if there are no pending changes to send.
     */
    @Generated
    @Selector("initWithPendingChanges:recordProvider:")
    public native CKSyncEngineRecordZoneChangeBatch initWithPendingChangesRecordProvider(
            @NotNull NSArray<? extends CKSyncEnginePendingRecordZoneChange> pendingChanges,
            @ObjCBlock(name = "call_initWithPendingChangesRecordProvider") @NotNull Block_initWithPendingChangesRecordProvider recordProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithPendingChangesRecordProvider {
        @Generated
        @Nullable
        CKRecord call_initWithPendingChangesRecordProvider(@NotNull CKRecordID recordID);
    }

    /**
     * Creates a batch of record zone changes to send to the server with a specific set of changes.
     * 
     * If you'd like to construct your own custom batches of changes to send to the server, you can do so with this
     * initializer.
     * 
     * ## Batch size limitations
     * 
     * When creating your own batches, you need to consider batch size limitations.
     * There is a maximum count and size of records that can be sent to the server in a single batch.
     * If you supply too many changes, or if the total size of the records is too large, then you might get a
     * ``CKErrorLimitExceeded``.
     * 
     * > Tip: These batch size limitations are handled automatically by the ``initWithPendingChanges:recordProvider:``
     * initializer.
     */
    @Generated
    @Selector("initWithRecordsToSave:recordIDsToDelete:atomicByZone:")
    public native CKSyncEngineRecordZoneChangeBatch initWithRecordsToSaveRecordIDsToDeleteAtomicByZone(
            @Nullable NSArray<? extends CKRecord> recordsToSave,
            @Nullable NSArray<? extends CKRecordID> recordIDsToDelete, boolean atomicByZone);

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
    public static native CKSyncEngineRecordZoneChangeBatch new_objc();

    /**
     * The IDs of the records to delete from the server.
     */
    @Generated
    @Selector("recordIDsToDelete")
    @NotNull
    public native NSArray<? extends CKRecordID> recordIDsToDelete();

    /**
     * The records to save to the server.
     */
    @Generated
    @Selector("recordsToSave")
    @NotNull
    public native NSArray<? extends CKRecord> recordsToSave();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * If set to true, the sync engine will modify these records atomically by zone.
     * 
     * If this is true, and if any record change fails, then any other changes from that zone in this batch will also
     * fail with ``CKErrorBatchRequestFailed``.
     * 
     * Records that exist in different zones will not be modified together atomically.
     */
    @Generated
    @Selector("setAtomicByZone:")
    public native void setAtomicByZone(boolean value);

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
}