/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.coredata;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableDictionary;
import apple.foundation.NSNotification;
import apple.foundation.NSSet;
import apple.foundation.NSUndoManager;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSLocking;
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
public class NSManagedObjectContext extends NSObject implements NSCoding, NSLocking {
    static {
        NatJ.register();
    }

    @Generated
    protected NSManagedObjectContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSManagedObjectContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSManagedObjectContext allocWithZone(VoidPtr zone);

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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

    /**
     * Similar to mergeChangesFromContextDidSaveNotification, this method handles changes from potentially other processes or serialized state.  It more efficiently
     * merges changes into multiple contexts, as well as nested context. The keys in the dictionary should be one those from an
     * NSManagedObjectContextObjectsDidChangeNotification: NSInsertedObjectsKey, NSUpdatedObjectsKey, etc.
     * the values should be an NSArray of either NSManagedObjectID or NSURL objects conforming to valid results from -URIRepresentation
     */
    @Generated
    @Selector("mergeChangesFromRemoteContextSave:intoContexts:")
    public static native void mergeChangesFromRemoteContextSaveIntoContexts(NSDictionary<?, ?> changeNotificationData,
            NSArray<? extends NSManagedObjectContext> contexts);

    @Generated
    @Owned
    @Deprecated
    @Selector("new")
    public static native NSManagedObjectContext new_objc();

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
     * specifies the store a newly inserted object will be saved in.  Unnecessary unless there are multiple writable persistent stores added to the NSPersistentStoreCoordinator which support this object's entity.
     */
    @Generated
    @Selector("assignObject:toPersistentStore:")
    public native void assignObjectToPersistentStore(@Mapped(ObjCObjectMapper.class) Object object,
            NSPersistentStore store);

    /**
     * Whether the context automatically merges changes saved to its coordinator or parent context. Setting this property to YES when the context is pinned to a non-current query generation is not supported.
     */
    @Generated
    @Selector("automaticallyMergesChangesFromParent")
    public native boolean automaticallyMergesChangesFromParent();

    @Generated
    @Selector("concurrencyType")
    @NUInt
    public native long concurrencyType();

    /**
     * returns the number of objects a fetch request would have returned if it had been passed to -executeFetchRequest:error:.   If an error occurred during the processing of the request, this method will return NSNotFound.
     */
    @Generated
    @Selector("countForFetchRequest:error:")
    @NUInt
    public native long countForFetchRequestError(NSFetchRequest<?> request,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("deleteObject:")
    public native void deleteObject(NSManagedObject object);

    @Generated
    @Selector("deletedObjects")
    public native NSSet<? extends NSManagedObject> deletedObjects();

    /**
     * marks an object for conflict detection, which means that the save fails if the object has been altered in the persistent store by another application.  This allows optimistic locking for unchanged objects.  Conflict detection is always performed on changed or deleted objects.
     */
    @Generated
    @Selector("detectConflictsForObject:")
    public native void detectConflictsForObject(NSManagedObject object);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * method to fetch objects from the persistent stores into the context (fetch request defines the entity and predicate as well as a sort order for the objects); context will match the results from persistent stores with current changes in the context (so inserted objects are returned even if they are not persisted yet); to fetch a single object with an ID if it is not guaranteed to exist and thus -objectWithObjectID: cannot be used, one would create a predicate like [NSComparisonPredicate predicateWithLeftExpression:[NSExpression expressionForKeyPath:@"objectID"] rightExpression:[NSExpression expressionForConstantValue:<object id>] modifier:NSDirectPredicateModifier type:NSEqualToPredicateOperatorType options:0]
     */
    @Generated
    @Selector("executeFetchRequest:error:")
    public native NSArray<?> executeFetchRequestError(NSFetchRequest<?> request,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Method to pass a request to the store without affecting the contents of the managed object context.
     * Will return an NSPersistentStoreResult which may contain additional information about the result of the action
     * (ie a batch update result may contain the object IDs of the objects that were modified during the update).
     * A request may succeed in some stores and fail in others. In this case, the error will contain information
     * about each individual store failure.
     * Will always reject NSSaveChangesRequests.
     */
    @Generated
    @Selector("executeRequest:error:")
    public native NSPersistentStoreResult executeRequestError(NSPersistentStoreRequest request,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * returns the object for the specified ID if it is already registered in the context, or faults the object into the context.  It might perform I/O if the data is uncached.  If the object cannot be fetched, or does not exist, or cannot be faulted, it returns nil.  Unlike -objectWithID: it never returns a fault.
     */
    @Generated
    @Selector("existingObjectWithID:error:")
    public native NSManagedObject existingObjectWithIDError(NSManagedObjectID objectID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("hasChanges")
    public native boolean hasChanges();

    @Generated
    @Deprecated
    @Selector("init")
    public native NSManagedObjectContext init();

    @Generated
    @Selector("initWithCoder:")
    public native NSManagedObjectContext initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithConcurrencyType:")
    public native NSManagedObjectContext initWithConcurrencyType(@NUInt long ct);

    @Generated
    @Selector("insertObject:")
    public native void insertObject(NSManagedObject object);

    @Generated
    @Selector("insertedObjects")
    public native NSSet<? extends NSManagedObject> insertedObjects();

    @Generated
    @Deprecated
    @Selector("lock")
    public native void lock();

    /**
     * Merges the changes specified in notification object received from another context's NSManagedObjectContextDidSaveNotification into the receiver.  This method will refresh any objects which have been updated in the other context, fault in any newly inserted objects, and invoke deleteObject: on those which have been deleted.  The developer is only responsible for the thread safety of the receiver.
     */
    @Generated
    @Selector("mergeChangesFromContextDidSaveNotification:")
    public native void mergeChangesFromContextDidSaveNotification(NSNotification notification);

    /**
     * default: NSErrorMergePolicy
     */
    @Generated
    @Selector("mergePolicy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mergePolicy();

    /**
     * custom label for a context.  NSPrivateQueueConcurrencyType contexts will set the label on their queue
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * returns the object for the specified ID if it is registered in the context already or nil. It never performs I/O.
     */
    @Generated
    @Selector("objectRegisteredForID:")
    public native NSManagedObject objectRegisteredForID(NSManagedObjectID objectID);

    /**
     * returns the object for the specified ID if it is already registered, otherwise it creates a fault corresponding to that objectID.  It never returns nil, and never performs I/O.  The object specified by objectID is assumed to exist, and if that assumption is wrong the fault may throw an exception when used.
     */
    @Generated
    @Selector("objectWithID:")
    public native NSManagedObject objectWithID(NSManagedObjectID objectID);

    /**
     * key-value observation
     */
    @Generated
    @Selector("observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPathOfObjectChangeContext(String keyPath,
            @Mapped(ObjCObjectMapper.class) Object object, NSDictionary<String, ?> change, VoidPtr context);

    /**
     * Converts the object IDs of the specified objects to permanent IDs.  This implementation will convert the object ID of each managed object in the specified array to a permanent ID.  Any object in the target array with a permanent ID will be ignored;  additionally, any managed object in the array not already assigned to a store will be assigned, based on the same rules Core Data uses for assignment during a save operation (first writable store supporting the entity, and appropriate for the instance and its related items.)  Although the object will have a permanent ID, it will still respond positively to -isInserted until it is saved.  If an error is encountered obtaining an identifier, the return value will be NO.
     */
    @Generated
    @Selector("obtainPermanentIDsForObjects:error:")
    public native boolean obtainPermanentIDsForObjectsError(NSArray<? extends NSManagedObject> objects,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("parentContext")
    public native NSManagedObjectContext parentContext();

    /**
     * asynchronously performs the block on the context's queue.  Encapsulates an autorelease pool and a call to processPendingChanges
     */
    @Generated
    @Selector("performBlock:")
    public native void performBlock(@ObjCBlock(name = "call_performBlock") Block_performBlock block);

    /**
     * synchronously performs the block on the context's queue.  May safely be called reentrantly.
     */
    @Generated
    @Selector("performBlockAndWait:")
    public native void performBlockAndWait(
            @ObjCBlock(name = "call_performBlockAndWait") Block_performBlockAndWait block);

    /**
     * coordinator which provides model and handles persistency (multiple contexts can share a coordinator)
     */
    @Generated
    @Selector("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator persistentStoreCoordinator();

    /**
     * usually contexts process changes to the object graph coalesced at the end of the event - this method triggers it explicitly
     */
    @Generated
    @Selector("processPendingChanges")
    public native void processPendingChanges();

    /**
     * The default is YES.
     */
    @Generated
    @Selector("propagatesDeletesAtEndOfEvent")
    public native boolean propagatesDeletesAtEndOfEvent();

    /**
     * Return the query generation currently in use by this context. Will be one of the following:
     * - nil, default value => this context is not using generational querying
     * - an opaque token => specifies the generation of data this context is vending
     * <p>
     * All child contexts will return nil.
     */
    @Generated
    @Selector("queryGenerationToken")
    public native NSQueryGenerationToken queryGenerationToken();

    @Generated
    @Selector("redo")
    public native void redo();

    /**
     * calls -refreshObject:mergeChanges: on all currently registered objects with this context.  It handles dirtied objects and clearing the context reference queue
     */
    @Generated
    @Selector("refreshAllObjects")
    public native void refreshAllObjects();

    /**
     * if flag is YES, merges an object with the state of the object available in the persistent store coordinator; if flag is NO, simply refaults an object without merging (which also causes other related managed objects to be released, so you can use this method to trim the portion of your object graph you want to hold in memory)
     */
    @Generated
    @Selector("refreshObject:mergeChanges:")
    public native void refreshObjectMergeChanges(NSManagedObject object, boolean flag);

    @Generated
    @Selector("registeredObjects")
    public native NSSet<? extends NSManagedObject> registeredObjects();

    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * The default is NO.
     */
    @Generated
    @Selector("retainsRegisteredObjects")
    public native boolean retainsRegisteredObjects();

    @Generated
    @Selector("rollback")
    public native void rollback();

    @Generated
    @Selector("save:")
    public native boolean save(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Whether the context automatically merges changes saved to its coordinator or parent context. Setting this property to YES when the context is pinned to a non-current query generation is not supported.
     */
    @Generated
    @Selector("setAutomaticallyMergesChangesFromParent:")
    public native void setAutomaticallyMergesChangesFromParent(boolean value);

    /**
     * default: NSErrorMergePolicy
     */
    @Generated
    @Selector("setMergePolicy:")
    public native void setMergePolicy(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * custom label for a context.  NSPrivateQueueConcurrencyType contexts will set the label on their queue
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setParentContext:")
    public native void setParentContext(NSManagedObjectContext value);

    /**
     * coordinator which provides model and handles persistency (multiple contexts can share a coordinator)
     */
    @Generated
    @Selector("setPersistentStoreCoordinator:")
    public native void setPersistentStoreCoordinator(NSPersistentStoreCoordinator value);

    /**
     * The default is YES.
     */
    @Generated
    @Selector("setPropagatesDeletesAtEndOfEvent:")
    public native void setPropagatesDeletesAtEndOfEvent(boolean value);

    /**
     * Set the query generation this context should use. Must be one of the following values:
     * - nil => this context will not use generational querying
     * - the value returned by +[NSQueryGenerationToken currentQueryGenerationToken] => this context will pin itself to the generation of the database when it first loads data
     * - the result of calling -[NSManagedObjectContext queryGenerationToken] on another managed object context => this context will be set to whatever query generation the original context is currently using;
     * <p>
     * Query generations are for fetched data only; they are not used during saving. If a pinned context saves,
     * its query generation will be updated after the save. Executing a NSBatchUpdateRequest or NSBatchDeleteRequest
     * will not cause the query generation to advance, since these do not otherwise consider or affect the
     * managed object context's content.
     * <p>
     * All nested contexts will defer to their parent context’s data. It is a programmer error to try to set
     * the queryGenerationToken on a child context.
     * <p>
     * Query generations are tracked across the union of stores. Additions to the persistent store coordinator's
     * persistent stores will be ignored until the context's query generation is updated to include them.
     * <p>
     * May partially fail if one or more stores being tracked by the token are removed from the persistent
     * store coordinator.
     */
    @Generated
    @Selector("setQueryGenerationFromToken:error:")
    public native boolean setQueryGenerationFromTokenError(NSQueryGenerationToken generation,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The default is NO.
     */
    @Generated
    @Selector("setRetainsRegisteredObjects:")
    public native void setRetainsRegisteredObjects(boolean value);

    /**
     * set the rule to handle inaccessible faults.  If YES, then the managed object is marked deleted and all its properties, including scalars, nonnullable, and mandatory properties, will be nil or zero’d out.  If NO, the context will throw an exception. Managed objects that are inaccessible because their context is nil due to memory management issues will throw an exception regardless.
     */
    @Generated
    @Selector("setShouldDeleteInaccessibleFaults:")
    public native void setShouldDeleteInaccessibleFaults(boolean value);

    /**
     * a negative value is considered infinite.  The default is infinite staleness.
     */
    @Generated
    @Selector("setStalenessInterval:")
    public native void setStalenessInterval(double value);

    @Generated
    @Selector("setUndoManager:")
    public native void setUndoManager(NSUndoManager value);

    /**
     * set the rule to handle inaccessible faults.  If YES, then the managed object is marked deleted and all its properties, including scalars, nonnullable, and mandatory properties, will be nil or zero’d out.  If NO, the context will throw an exception. Managed objects that are inaccessible because their context is nil due to memory management issues will throw an exception regardless.
     */
    @Generated
    @Selector("shouldDeleteInaccessibleFaults")
    public native boolean shouldDeleteInaccessibleFaults();

    /**
     * this method will not be called from APIs which return an NSError like -existingObjectWithID:error: nor for managed objects with a nil context (e.g. the fault is inaccessible because the object or its context have been released) this method will not be called if Core Data determines there is an unambiguously correct action to recover.  This might happen if a fault was tripped during delete propagation.  In that case, the fault will simply be deleted.  triggeringProperty may be nil when either all properties are involved, or Core Data is unable to determine the reason for firing the fault. the default implementation logs and then returns the value of -shouldDeleteInaccessibleFaults.
     */
    @Generated
    @Selector("shouldHandleInaccessibleFault:forObjectID:triggeredByProperty:")
    public native boolean shouldHandleInaccessibleFaultForObjectIDTriggeredByProperty(NSManagedObject fault,
            NSManagedObjectID oid, NSPropertyDescription property);

    /**
     * a negative value is considered infinite.  The default is infinite staleness.
     */
    @Generated
    @Selector("stalenessInterval")
    public native double stalenessInterval();

    @Generated
    @Deprecated
    @Selector("tryLock")
    public native boolean tryLock();

    @Generated
    @Selector("undo")
    public native void undo();

    @Generated
    @Selector("undoManager")
    public native NSUndoManager undoManager();

    @Generated
    @Deprecated
    @Selector("unlock")
    public native void unlock();

    @Generated
    @Selector("updatedObjects")
    public native NSSet<? extends NSManagedObject> updatedObjects();

    @Generated
    @Selector("userInfo")
    public native NSMutableDictionary<?, ?> userInfo();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlock {
        @Generated
        void call_performBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performBlockAndWait {
        @Generated
        void call_performBlockAndWait();
    }

    /**
     * Set the author for the context, this will be used as an identifier in the Persistent History Transactions (NSPersistentHistoryTransaction)
     */
    @Generated
    @Selector("setTransactionAuthor:")
    public native void setTransactionAuthor(String value);

    /**
     * Set the author for the context, this will be used as an identifier in the Persistent History Transactions (NSPersistentHistoryTransaction)
     */
    @Generated
    @Selector("transactionAuthor")
    public native String transactionAuthor();
}
