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
import org.moe.natj.general.ann.MappedReturn;
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

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
    public native NSPersistentCloudKitContainer initWithName(String name);

    @Generated
    @Selector("initWithName:managedObjectModel:")
    public native NSPersistentCloudKitContainer initWithNameManagedObjectModel(String name, NSManagedObjectModel model);

    /**
     * This method creates a set of representative CKRecord instances for all stores in the container
     * that use Core Data with CloudKit and uploads them to CloudKit. These records are "fully saturated"
     * in that they have a representative value set for every field Core Data might serialize for the given
     * managed object model.
     * <p>
     * After records are successfully uploaded the schema will be visible in the CloudKit dashboard and
     * the representative records will be deleted.
     * <p>
     * This method returns YES if these operations succeed, or NO and the underlying error if they fail.
     * <p>
     * Note: This method also validates the managed object model in use for a store, so a validation error
     * may be returned if the model is not valid for use with CloudKit.
     */
    @Generated
    @Selector("initializeCloudKitSchemaWithOptions:error:")
    public native boolean initializeCloudKitSchemaWithOptionsError(@NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("persistentContainerWithName:")
    public static native NSPersistentCloudKitContainer persistentContainerWithName(String name);

    @Generated
    @Selector("persistentContainerWithName:managedObjectModel:")
    public static native NSPersistentCloudKitContainer persistentContainerWithNameManagedObjectModel(String name,
            NSManagedObjectModel model);

    /**
     * These methods provide access to the underlying CKRecord, or CKRecordID, backing a given NSManagedObjectID.
     */
    @Generated
    @Selector("recordForManagedObjectID:")
    public native CKRecord recordForManagedObjectID(NSManagedObjectID managedObjectID);

    @Generated
    @Selector("recordIDForManagedObjectID:")
    public native CKRecordID recordIDForManagedObjectID(NSManagedObjectID managedObjectID);

    @Generated
    @Selector("recordIDsForManagedObjectIDs:")
    public native NSDictionary<? extends NSManagedObjectID, ? extends CKRecordID> recordIDsForManagedObjectIDs(
            NSArray<? extends NSManagedObjectID> managedObjectIDs);

    @Generated
    @Selector("recordsForManagedObjectIDs:")
    public native NSDictionary<? extends NSManagedObjectID, ? extends CKRecord> recordsForManagedObjectIDs(
            NSArray<? extends NSManagedObjectID> managedObjectIDs);

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

    @Generated
    @Selector("canDeleteRecordForManagedObjectWithID:")
    public native boolean canDeleteRecordForManagedObjectWithID(NSManagedObjectID objectID);

    /**
     * canModifyManagedObjectsInStore indicates whether or not a given store is mutable when used with CloudKit.
     * <p>
     * This method return YES if the current user has write permissions to the CKDatabase that backs the store.
     * <p>
     * For example:
     * - When using the Public database, devices without an iCloud account can read data but not write any.
     * - When using the Private database, this method always returns YES, even if no iCloud account is present on the device.
     */
    @Generated
    @Selector("canModifyManagedObjectsInStore:")
    public native boolean canModifyManagedObjectsInStore(NSPersistentStore store);

    /**
     * canUpdateRecordForManagedObjectWithID / canDeleteRecordForManagedObjectWithID indicate whether or not a given object assigned the provided NSManagedObjectID is mutable with respect to the instance of CKRecord that backs it with CloudKit.
     * <p>
     * In order for canUpdateRecordForManagedObjectWithID / canDeleteRecordForManagedObjectWithID to return YES, -[NSPersistentCloudKitContainer canModifyManagedObjectsInStore] must also be YES.
     * <p>
     * Returns YES if any of the following conditions are true:
     * - The provided objectID is a temporary objectID
     * - The provided objectID is assigned to a store not backed by a CKDatabase
     * - The provided objectID is assigned to a store backed by the Private CKDatabase
     * - The provided objectID is assigned to a store backed by the Public CKDatabase AND one of the following conditions is met:
     * - The object has yet to be uploaded to CloudKit (it will be assigned to the current user)
     * - The object has already been uploaded to CloudKit and is owned (indicated by CKRecord.creatorUserRecordID) by the current user
     */
    @Generated
    @Selector("canUpdateRecordForManagedObjectWithID:")
    public native boolean canUpdateRecordForManagedObjectWithID(NSManagedObjectID objectID);

    /**
     * Accept a sharing invitation with the given share metadata.
     * <p>
     * The provided persistent store must be configured to use the Shared database scope. If provided the completion block will be invoked
     * once all operations required to accept the share invitations have finished with the resulting CKShareMetadata objects or with an
     * error if one occurs.
     */
    @Generated
    @Selector("acceptShareInvitationsFromMetadata:intoPersistentStore:completion:")
    public native void acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion(
            NSArray<? extends CKShareMetadata> metadata, NSPersistentStore persistentStore,
            @ObjCBlock(name = "call_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion") Block_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion {
        @Generated
        void call_acceptShareInvitationsFromMetadataIntoPersistentStoreCompletion(
                NSArray<? extends CKShareMetadata> acceptedShareMetadatas, NSError acceptOperationError);
    }

    /**
     * Fetches a set of CKShareParticipant objects from the CKDatabase associated with the given persistent store.
     * <p>
     * The completion block will be invoked with the result of the CKFetchShareParticipantsOperation and the retrieved participants (if any).
     */
    @Generated
    @Selector("fetchParticipantsMatchingLookupInfos:intoPersistentStore:completion:")
    public native void fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion(
            NSArray<? extends CKUserIdentityLookupInfo> lookupInfos, NSPersistentStore persistentStore,
            @ObjCBlock(name = "call_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion") Block_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion {
        @Generated
        void call_fetchParticipantsMatchingLookupInfosIntoPersistentStoreCompletion(
                NSArray<? extends CKShareParticipant> fetchedParticipants, NSError fetchError);
    }

    /**
     * Fetches all known CKShare records in the given persistent store (or all persistent stores in the persistent cloud container if none is set).
     * <p>
     * This method does not to any network work to attempt to discover additional zones or shares in the CKDatabase that is associated with the persistent store.
     */
    @Generated
    @Selector("fetchSharesInPersistentStore:error:")
    public native NSArray<? extends CKShare> fetchSharesInPersistentStoreError(NSPersistentStore persistentStore,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the associated CKShare object for a given managed object. If the object's backing CKRecord resides in a CKRecordZone that
     * is currently shared a CKShare will be returned.
     * <p>
     * If the object is not associated with a shared record zone, or the object has not yet been exported to CloudKit (and it's zone is not known),
     * it will not have an entry in the resulting dictionary.
     */
    @Generated
    @Selector("fetchSharesMatchingObjectIDs:error:")
    public native NSDictionary<? extends NSManagedObjectID, ? extends CKShare> fetchSharesMatchingObjectIDsError(
            NSArray<? extends NSManagedObjectID> objectIDs, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Saves the given CKShare object to the persistent cloud container's metadata in the provided persistent store.
     * <p>
     * If provided the completion block will be invoked once the share has been saved to the corresponding CKDatabase with the
     * result of the operation.
     */
    @Generated
    @Selector("persistUpdatedShare:inPersistentStore:completion:")
    public native void persistUpdatedShareInPersistentStoreCompletion(CKShare share, NSPersistentStore persistentStore,
            @ObjCBlock(name = "call_persistUpdatedShareInPersistentStoreCompletion") Block_persistUpdatedShareInPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_persistUpdatedShareInPersistentStoreCompletion {
        @Generated
        void call_persistUpdatedShareInPersistentStoreCompletion(CKShare persistedShare, NSError persistedShareError);
    }

    /**
     * Purges a zone from the CKDatabase associated with the given persistent store (or all active CKDatabases in the persistent cloud container's stores).
     * <p>
     * If provided the completion block will be invoked once per store with the result of the purge operation.
     */
    @Generated
    @Selector("purgeObjectsAndRecordsInZoneWithID:inPersistentStore:completion:")
    public native void purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion(CKRecordZoneID zoneID,
            NSPersistentStore persistentStore,
            @ObjCBlock(name = "call_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion") Block_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion {
        @Generated
        void call_purgeObjectsAndRecordsInZoneWithIDInPersistentStoreCompletion(CKRecordZoneID purgedZoneID,
                NSError purgeError);
    }

    /**
     * Use this method to share a set of managed objects to either a new CKShare or an existing one if specified as the 'share' parameter.
     * <p>
     * - managedObjects - the set of objects to be shared. A deep traversal will be performed among the objects and any related objects will also be shared.
     * - share - The existing share in which to share the objects, or nil if a new one should be created for them
     * - completion - A completion block when the share is created and the objects are assigned to it (not necessarily when the objects have been exported to the share)
     * <p>
     * This method will fail if:
     * <p>
     * 1. Any of the objects in 'managedObjects' or those discovered by traversal are already shared
     * 2. Any of the objects in 'managedObjects' are from persistent stores which do not support sharing (for example those using CKDatabaseScopePublic)
     * 3. The current device conditions do not support sharing, for example if there is no CloudKit account on the device, or if NSPersistentCloudKitContainer has failed to initialize.
     * <p>
     * The completion block is meant to be used directly with UICloudSharingController's preparation block completion handler.
     */
    @Generated
    @Selector("shareManagedObjects:toShare:completion:")
    public native void shareManagedObjectsToShareCompletion(NSArray<? extends NSManagedObject> managedObjects,
            CKShare share,
            @ObjCBlock(name = "call_shareManagedObjectsToShareCompletion") Block_shareManagedObjectsToShareCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shareManagedObjectsToShareCompletion {
        @Generated
        void call_shareManagedObjectsToShareCompletion(NSSet<? extends NSManagedObjectID> sharedObjectIDs,
                CKShare share, CKContainer cloudKitContainer, NSError sharingError);
    }
}
