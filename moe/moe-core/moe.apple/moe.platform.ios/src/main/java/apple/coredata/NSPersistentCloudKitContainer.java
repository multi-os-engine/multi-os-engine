package apple.coredata;

import apple.NSObject;
import apple.cloudkit.CKRecord;
import apple.cloudkit.CKRecordID;
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
     * 
     * This method return YES if the current user has write permissions to the CKDatabase that backs the store.
     * 
     * For example:
     * - When using the Public database, devices without an iCloud account can read data but not write any.
     * - When using the Private database, this method always returns YES, even if no iCloud account is present on the device.
     */
    @Generated
    @Selector("canModifyManagedObjectsInStore:")
    public native boolean canModifyManagedObjectsInStore(NSPersistentStore store);

    /**
     * canUpdateRecordForManagedObjectWithID / canDeleteRecordForManagedObjectWithID indicate whether or not a given object assigned the provided NSManagedObjectID is mutable with respect to the instance of CKRecord that backs it with CloudKit.
     * 
     * In order for canUpdateRecordForManagedObjectWithID / canDeleteRecordForManagedObjectWithID to return YES, -[NSPersistentCloudKitContainer canModifyManagedObjectsInStore] must also be YES.
     * 
     * Returns YES if any of the following conditions are true:
     * - The provided objectID is a temporary objectID
     * - The provided objectID is assigned to a store not backed by a CKDatabase
     * - The provided objectID is assigned to a store backed by the Private CKDatabase
     * - The provided objectID is assigned to a store backed by the Public CKDatabase AND one of the following conditions is met:
     *     - The object has yet to be uploaded to CloudKit (it will be assigned to the current user)
     *     - The object has already been uploaded to CloudKit and is owned (indicated by CKRecord.creatorUserRecordID) by the current user
     */
    @Generated
    @Selector("canUpdateRecordForManagedObjectWithID:")
    public native boolean canUpdateRecordForManagedObjectWithID(NSManagedObjectID objectID);
}