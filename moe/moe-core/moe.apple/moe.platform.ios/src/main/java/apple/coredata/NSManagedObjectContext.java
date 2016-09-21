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
    @Owned
    @Selector("alloc")
    public static native NSManagedObjectContext alloc();

    @Generated
    @Selector("mergeChangesFromRemoteContextSave:intoContexts:")
    public static native void mergeChangesFromRemoteContextSaveIntoContexts(NSDictionary<?, ?> changeNotificationData,
            NSArray<? extends NSManagedObjectContext> contexts);

    @Generated
    @Owned
    @Deprecated
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("assignObject:toPersistentStore:")
    public native void assignObjectToPersistentStore(@Mapped(ObjCObjectMapper.class) Object object,
            NSPersistentStore store);

    @Generated
    @Selector("concurrencyType")
    @NUInt
    public native long concurrencyType();

    @Generated
    @Selector("countForFetchRequest:error:")
    @NUInt
    public native long countForFetchRequestError(NSFetchRequest request, Ptr<NSError> error);

    @Generated
    @Selector("deleteObject:")
    public native void deleteObject(NSManagedObject object);

    @Generated
    @Selector("deletedObjects")
    public native NSSet<? extends NSManagedObject> deletedObjects();

    @Generated
    @Selector("detectConflictsForObject:")
    public native void detectConflictsForObject(NSManagedObject object);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("executeFetchRequest:error:")
    public native NSArray<?> executeFetchRequestError(NSFetchRequest request, Ptr<NSError> error);

    @Generated
    @Selector("executeRequest:error:")
    public native NSPersistentStoreResult executeRequestError(NSPersistentStoreRequest request, Ptr<NSError> error);

    @Generated
    @Selector("existingObjectWithID:error:")
    public native NSManagedObject existingObjectWithIDError(NSManagedObjectID objectID, Ptr<NSError> error);

    @Generated
    @Selector("hasChanges")
    public native boolean hasChanges();

    @Deprecated
    @Generated
    @Selector("init")
    public native NSManagedObjectContext init();

    @Generated
    @Selector("initWithCoder:")
    public native NSManagedObjectContext initWithCoder(NSCoder aDecoder);

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

    @Generated
    @Selector("mergeChangesFromContextDidSaveNotification:")
    public native void mergeChangesFromContextDidSaveNotification(NSNotification notification);

    @Generated
    @Selector("mergePolicy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mergePolicy();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("objectRegisteredForID:")
    public native NSManagedObject objectRegisteredForID(NSManagedObjectID objectID);

    @Generated
    @Selector("objectWithID:")
    public native NSManagedObject objectWithID(NSManagedObjectID objectID);

    @Generated
    @Selector("observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPathOfObjectChangeContext(String keyPath,
            @Mapped(ObjCObjectMapper.class) Object object, NSDictionary<String, ?> change, VoidPtr context);

    @Generated
    @Selector("obtainPermanentIDsForObjects:error:")
    public native boolean obtainPermanentIDsForObjectsError(NSArray<? extends NSManagedObject> objects,
            Ptr<NSError> error);

    @Generated
    @Selector("parentContext")
    public native NSManagedObjectContext parentContext();

    @Generated
    @Selector("performBlock:")
    public native void performBlock(@ObjCBlock(name = "call_performBlock") Block_performBlock block);

    @Generated
    @Selector("performBlockAndWait:")
    public native void performBlockAndWait(
            @ObjCBlock(name = "call_performBlockAndWait") Block_performBlockAndWait block);

    @Generated
    @Selector("persistentStoreCoordinator")
    public native NSPersistentStoreCoordinator persistentStoreCoordinator();

    @Generated
    @Selector("processPendingChanges")
    public native void processPendingChanges();

    @Generated
    @Selector("propagatesDeletesAtEndOfEvent")
    public native boolean propagatesDeletesAtEndOfEvent();

    @Generated
    @Selector("redo")
    public native void redo();

    @Generated
    @Selector("refreshObject:mergeChanges:")
    public native void refreshObjectMergeChanges(NSManagedObject object, boolean flag);

    @Generated
    @Selector("registeredObjects")
    public native NSSet<? extends NSManagedObject> registeredObjects();

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("retainsRegisteredObjects")
    public native boolean retainsRegisteredObjects();

    @Generated
    @Selector("rollback")
    public native void rollback();

    @Generated
    @Selector("save:")
    public native boolean save(Ptr<NSError> error);

    @Generated
    @Selector("setMergePolicy:")
    public native void setMergePolicy(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setParentContext:")
    public native void setParentContext(NSManagedObjectContext value);

    @Generated
    @Selector("setPersistentStoreCoordinator:")
    public native void setPersistentStoreCoordinator(NSPersistentStoreCoordinator value);

    @Generated
    @Selector("setPropagatesDeletesAtEndOfEvent:")
    public native void setPropagatesDeletesAtEndOfEvent(boolean value);

    @Generated
    @Selector("setRetainsRegisteredObjects:")
    public native void setRetainsRegisteredObjects(boolean value);

    @Generated
    @Selector("setStalenessInterval:")
    public native void setStalenessInterval(double value);

    @Generated
    @Selector("setUndoManager:")
    public native void setUndoManager(NSUndoManager value);

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

    @Generated
    @Selector("refreshAllObjects")
    public native void refreshAllObjects();

    @Generated
    @Selector("setShouldDeleteInaccessibleFaults:")
    public native void setShouldDeleteInaccessibleFaults(boolean value);

    @Generated
    @Selector("shouldDeleteInaccessibleFaults")
    public native boolean shouldDeleteInaccessibleFaults();

    @Generated
    @Selector("shouldHandleInaccessibleFault:forObjectID:triggeredByProperty:")
    public native boolean shouldHandleInaccessibleFaultForObjectIDTriggeredByProperty(NSManagedObject fault,
            NSManagedObjectID oid, NSPropertyDescription property);

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
}
