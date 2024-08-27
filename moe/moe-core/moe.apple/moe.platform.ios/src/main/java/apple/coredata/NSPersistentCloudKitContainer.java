package apple.coredata;

import apple.NSObject;
import apple.cloudkit.CKContainer;
import apple.cloudkit.CKRecord;
import apple.cloudkit.CKRecordID;
import apple.cloudkit.CKRecordZoneID;
import apple.cloudkit.CKShare;
import apple.cloudkit.CKShareMetadata;
import apple.cloudkit.CKShareParticipant;
import apple.cloudkit.CKUserIdentityLookupInfo;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPersistentCloudKitContainer extends NSPersistentContainer {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentCloudKitContainer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentCloudKitContainer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentCloudKitContainer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @NotNull
    @Generated
    @Selector("defaultDirectoryURL")
    public static native NSURL defaultDirectoryURL();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSPersistentCloudKitContainer init();

    @Generated
    @Selector("initWithName:")
    public native NSPersistentCloudKitContainer initWithName(@NotNull String name);

    @Generated
    @Selector("initWithName:managedObjectModel:")
    public native NSPersistentCloudKitContainer initWithNameManagedObjectModel(@NotNull String name,
            @NotNull NSManagedObjectModel model);

    /**
     * This method creates a set of representative CKRecord instances for all stores in the container
     * that use Core Data with CloudKit and uploads them to CloudKit. These records are "fully saturated"
     * in that they have a representative value set for every field Core Data might serialize for the given
     * managed object model.
     * 
     * After records are successfully uploaded the schema will be visible in the CloudKit dashboard and
     * the representative records will be deleted.
     * 
     * This method returns YES if these operations succeed, or NO and the underlying error if they fail.
     * 
     * Note: This method also validates the managed object model in use for a store, so a validation error
     * may be returned if the model is not valid for use with CloudKit.
     */
    @Generated
    @Selector("initializeCloudKitSchemaWithOptions:error:")
    public native boolean initializeCloudKitSchemaWithOptionsError(@NUInt long options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSPersistentCloudKitContainer new_objc();

    @Generated
    @Selector("persistentContainerWithName:")
    public static native NSPersistentCloudKitContainer persistentContainerWithName(@NotNull String name);

    @Generated
    @Selector("persistentContainerWithName:managedObjectModel:")
    public static native NSPersistentCloudKitContainer persistentContainerWithNameManagedObjectModel(
            @NotNull String name, @NotNull NSManagedObjectModel model);

    @Nullable
    @Generated
    @Selector("recordForManagedObjectID:")
    public native CKRecord recordForManagedObjectID(@NotNull NSManagedObjectID managedObjectID);

    @Nullable
    @Generated
    @Selector("recordIDForManagedObjectID:")
    public native CKRecordID recordIDForManagedObjectID(@NotNull NSManagedObjectID managedObjectID);

    @NotNull
    @Generated
    @Selector("recordIDsForManagedObjectIDs:")
    public native NSDictionary<? extends NSManagedObjectID, ? extends CKRecordID> recordIDsForManagedObjectIDs(
            @NotNull NSArray<? extends NSManagedObjectID> managedObjectIDs);

    @NotNull
    @Generated
    @Selector("recordsForManagedObjectIDs:")
    public native NSDictionary<? extends NSManagedObjectID, ? extends CKRecord> recordsForManagedObjectIDs(
            @NotNull NSArray<? extends NSManagedObjectID> managedObjectIDs);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("canDeleteRecordForManagedObjectWithID:")
    public native boolean canDeleteRecordForManagedObjectWithID(@NotNull NSManagedObjectID objectID);

    /**
     * canModifyManagedObjectsInStore indicates whether or not a given store is mutable when used with CloudKit.
     * 
     * This method return YES if the current user has write permissions to the CKDatabase that backs the store.
     * 
     * For example:
     * - When using the Public database, devices without an iCloud account can read data but not write any.
     * - When using the Private database, this method always returns YES, even if no iCloud account is present on the
     * device.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("canModifyManagedObjectsInStore:")
    public native boolean canModifyManagedObjectsInStore(@NotNull NSPersistentStore store);

    /**
     * canUpdateRecordForManagedObjectWithID / canDeleteRecordForManagedObjectWithID indicate whether or not a given
     * object assigned the provided NSManagedObjectID is mutable with respect to the instance of CKRecord that backs it
     * with CloudKit.
     * 
     * In order for canUpdateRecordForManagedObjectWithID / canDeleteRecordForManagedObjectWithID to return YES,
     * -[NSPersistentCloudKitContainer canModifyManagedObjectsInStore] must also be YES.
     * 
     * Returns YES if any of the following conditions are true:
     * - The provided objectID is a temporary objectID
     * - The provided objectID is assigned to a store not backed by a CKDatabase
     * - The provided objectID is assigned to a store backed by the Private CKDatabase
     * - The provided objectID is assigned to a store backed by the Public CKDatabase AND one of the following
     * conditions is met:
     * - The object has yet to be uploaded to CloudKit (it will be assigned to the current user)
     * - The object has already been uploaded to CloudKit and is owned (indicated by CKRecord.creatorUserRecordID) by
     * the current user
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("canUpdateRecordForManagedObjectWithID:")
    public native boolean canUpdateRecordForManagedObjectWithID(@NotNull NSManagedObjectID objectID);

    /**
     * Accept a sharing invitation with the given share metadata.
     * 
     * The provided persistent store must be configured to use the Shared database scope. If provided the completion
     * block will be invoked
     * once all operations required to accept the share invitations have finished with the resulting CKShareMetadata
     * objects or with an
     * error if one occurs.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("acceptShareInvitationsFromMetadata:intoPersistentStore:completion:")
    public native void acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion(
            @NotNull NSArray<? extends CKShareMetadata> metadata, @NotNull NSPersistentStore persistentStore,
            @Nullable @ObjCBlock(name = "call_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion") Block_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion {
        @Generated
        void call_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion(
                @Nullable NSArray<? extends CKShareMetadata> acceptedShareMetadatas,
                @Nullable NSError acceptOperationError);
    }

    /**
     * Fetches a set of CKShareParticipant objects from the CKDatabase associated with the given persistent store.
     * 
     * The completion block will be invoked with the result of the CKFetchShareParticipantsOperation and the retrieved
     * participants (if any).
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("fetchParticipantsMatchingLookupInfos:intoPersistentStore:completion:")
    public native void fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion(
            @NotNull NSArray<? extends CKUserIdentityLookupInfo> lookupInfos,
            @NotNull NSPersistentStore persistentStore,
            @NotNull @ObjCBlock(name = "call_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion") Block_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion {
        @Generated
        void call_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion(
                @Nullable NSArray<? extends CKShareParticipant> fetchedParticipants, @Nullable NSError fetchError);
    }

    /**
     * Fetches all known CKShare records in the given persistent store (or all persistent stores in the persistent cloud
     * container if none is set).
     * 
     * This method does not to any network work to attempt to discover additional zones or shares in the CKDatabase that
     * is associated with the persistent store.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("fetchSharesInPersistentStore:error:")
    public native NSArray<? extends CKShare> fetchSharesInPersistentStoreError(
            @Nullable NSPersistentStore persistentStore,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the associated CKShare object for a given managed object. If the object's backing CKRecord resides in a
     * CKRecordZone that
     * is currently shared a CKShare will be returned.
     * 
     * If the object is not associated with a shared record zone, or the object has not yet been exported to CloudKit
     * (and it's zone is not known),
     * it will not have an entry in the resulting dictionary.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("fetchSharesMatchingObjectIDs:error:")
    public native NSDictionary<? extends NSManagedObjectID, ? extends CKShare> fetchSharesMatchingObjectIDsError(
            @NotNull NSArray<? extends NSManagedObjectID> objectIDs,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Saves the given CKShare object to the persistent cloud container's metadata in the provided persistent store.
     * 
     * If provided the completion block will be invoked once the share has been saved to the corresponding CKDatabase
     * with the
     * result of the operation.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("persistUpdatedShare:inPersistentStore:completion:")
    public native void persistUpdatedShareInPersistentStoreCompletion(@NotNull CKShare share,
            @NotNull NSPersistentStore persistentStore,
            @Nullable @ObjCBlock(name = "call_persistUpdatedShareInPersistentStoreCompletion") Block_persistUpdatedShareInPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_persistUpdatedShareInPersistentStoreCompletion {
        @Generated
        void call_persistUpdatedShareInPersistentStoreCompletion(@Nullable CKShare persistedShare,
                @Nullable NSError persistedShareError);
    }

    /**
     * Purges a zone from the CKDatabase associated with the given persistent store (or all active CKDatabases in the
     * persistent cloud container's stores).
     * 
     * If provided the completion block will be invoked once per store with the result of the purge operation.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("purgeObjectsAndRecordsInZoneWithID:inPersistentStore:completion:")
    public native void purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion(@NotNull CKRecordZoneID zoneID,
            @Nullable NSPersistentStore persistentStore,
            @Nullable @ObjCBlock(name = "call_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion") Block_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion {
        @Generated
        void call_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion(@Nullable CKRecordZoneID purgedZoneID,
                @Nullable NSError purgeError);
    }

    /**
     * Use this method to share a set of managed objects to either a new CKShare or an existing one if specified as the
     * 'share' parameter.
     * 
     * - managedObjects - the set of objects to be shared. A deep traversal will be performed among the objects and any
     * related objects will also be shared.
     * - share - The existing share in which to share the objects, or nil if a new one should be created for them
     * - completion - A completion block when the share is created and the objects are assigned to it (not necessarily
     * when the objects have been exported to the share)
     * 
     * This method will fail if:
     * 
     * 1. Any of the objects in 'managedObjects' or those discovered by traversal are already shared
     * 2. Any of the objects in 'managedObjects' are from persistent stores which do not support sharing (for example
     * those using CKDatabaseScopePublic)
     * 3. The current device conditions do not support sharing, for example if there is no CloudKit account on the
     * device, or if NSPersistentCloudKitContainer has failed to initialize.
     * 
     * The completion block is meant to be used directly with UICloudSharingController's preparation block completion
     * handler.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("shareManagedObjects:toShare:completion:")
    public native void shareManagedObjectsToShareCompletion(@NotNull NSArray<? extends NSManagedObject> managedObjects,
            @Nullable CKShare share,
            @NotNull @ObjCBlock(name = "call_shareManagedObjectsToShareCompletion") Block_shareManagedObjectsToShareCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shareManagedObjectsToShareCompletion {
        @Generated
        void call_shareManagedObjectsToShareCompletion(@Nullable NSSet<? extends NSManagedObjectID> sharedObjectIDs,
                @Nullable CKShare share, @Nullable CKContainer cloudKitContainer, @Nullable NSError sharingError);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
