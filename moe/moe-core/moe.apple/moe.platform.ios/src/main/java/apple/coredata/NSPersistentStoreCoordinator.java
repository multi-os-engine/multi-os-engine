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
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSValue;
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
public class NSPersistentStoreCoordinator extends NSObject implements NSLocking {
    static {
        NatJ.register();
    }

    @Generated
    protected NSPersistentStoreCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSPersistentStoreCoordinator alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentStoreCoordinator allocWithZone(VoidPtr zone);

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

    @Generated
    @Deprecated
    @Selector("metadataForPersistentStoreOfType:URL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLError(String storeType, NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Allows to access the metadata stored in a persistent store without warming up a CoreData stack; the guaranteed keys in this dictionary are NSStoreTypeKey and NSStoreUUIDKey. If storeType is nil, Core Data will guess which store class should be used to get/set the store file's metadata.
     */
    @Generated
    @Selector("metadataForPersistentStoreOfType:URL:options:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLOptionsError(String storeType,
            NSURL url, NSDictionary<?, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native NSPersistentStoreCoordinator new_objc();

    /**
     * Registers the specified NSPersistentStore subclass for the specified store type string.  This method must be invoked before a custom subclass of NSPersistentStore can be loaded into a persistent store coordinator.  Passing nil for the store class argument will unregister the specified store type.
     */
    @Generated
    @Selector("registerStoreClass:forStoreType:")
    public static native void registerStoreClassForStoreType(Class storeClass, String storeType);

    /**
     * Returns a dictionary of the registered store types:  the keys are the store type strings and the values are the NSPersistentStore subclasses wrapped in NSValues.
     */
    @Generated
    @Selector("registeredStoreTypes")
    public static native NSDictionary<String, ? extends NSValue> registeredStoreTypes();

    /**
     * Delete all ubiquitous content for all peers for the persistent store at the given URL and also delete the local store file. storeOptions should contain the options normally passed to addPersistentStoreWithType:URL:options:error. Errors may be returned as a result of file I/O, iCloud network or iCloud account issues.
     */
    @Generated
    @Selector("removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    public static native boolean removeUbiquitousContentAndPersistentStoreAtURLOptionsError(NSURL storeURL,
            NSDictionary<?, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Deprecated
    @Selector("setMetadata:forPersistentStoreOfType:URL:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLError(NSDictionary<String, ?> metadata,
            String storeType, NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setMetadata:forPersistentStoreOfType:URL:options:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLOptionsError(NSDictionary<String, ?> metadata,
            String storeType, NSURL url, NSDictionary<?, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    @Selector("URLForPersistentStore:")
    public native NSURL URLForPersistentStore(NSPersistentStore store);

    @Generated
    @Selector("addPersistentStoreWithDescription:completionHandler:")
    public native void addPersistentStoreWithDescriptionCompletionHandler(NSPersistentStoreDescription storeDescription,
            @ObjCBlock(name = "call_addPersistentStoreWithDescriptionCompletionHandler") Block_addPersistentStoreWithDescriptionCompletionHandler block);

    /**
     * Adds the store at the specified URL (of the specified type) to the coordinator with the model configuration and options.  The configuration can be nil -- then it's the complete model; storeURL is usually the file location of the database
     */
    @Generated
    @Selector("addPersistentStoreWithType:configuration:URL:options:error:")
    public native NSPersistentStore addPersistentStoreWithTypeConfigurationURLOptionsError(String storeType,
            String configuration, NSURL storeURL, NSDictionary<?, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * delete or truncate the target persistent store in accordance with the store class's requirements.  It is important to pass similar options as addPersistentStoreWithType: ... SQLite stores will honor file locks, journal files, journaling modes, and other intricacies.  It is not possible to unlink a database file safely out from underneath another thread or process, so this API performs a truncation.  Other stores will default to using NSFileManager.
     */
    @Generated
    @Selector("destroyPersistentStoreAtURL:withType:options:error:")
    public native boolean destroyPersistentStoreAtURLWithTypeOptionsError(NSURL url, String storeType,
            NSDictionary<?, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sends a request to all of the stores associated with this coordinator.
     * Returns an array if successful,  nil if not.
     * The contents of the array will vary depending on the request type: NSFetchRequest results will be an array of managed objects, managed object IDs, or NSDictionaries;
     * NSSaveChangesRequests will an empty array. User defined requests will return arrays of arrays, where the nested array is the result returned form a single store.
     */
    @Generated
    @Selector("executeRequest:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object executeRequestWithContextError(NSPersistentStoreRequest request,
            NSManagedObjectContext context, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSPersistentStoreCoordinator init();

    @Generated
    @Selector("initWithManagedObjectModel:")
    public native NSPersistentStoreCoordinator initWithManagedObjectModel(NSManagedObjectModel model);

    @Generated
    @Deprecated
    @Selector("lock")
    public native void lock();

    /**
     * Given a URI representation of an object ID, returns an object ID if a matching store is available or nil if a matching store cannot be found (the URI representation contains a UUID of the store the ID is coming from, and the coordinator can match it against the stores added to it)
     */
    @Generated
    @Selector("managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID managedObjectIDForURIRepresentation(NSURL url);

    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    /**
     * Returns the metadata currently stored or to-be-stored in the persistent store
     */
    @Generated
    @Selector("metadataForPersistentStore:")
    public native NSDictionary<String, ?> metadataForPersistentStore(NSPersistentStore store);

    /**
     * Used for save as - performance may vary depending on the type of old and new store; the old store is usually removed from the coordinator by the migration operation, and therefore is no longer a useful reference after invoking this method
     */
    @Generated
    @Selector("migratePersistentStore:toURL:options:withType:error:")
    public native NSPersistentStore migratePersistentStoreToURLOptionsWithTypeError(NSPersistentStore store, NSURL URL,
            NSDictionary<?, ?> options, String storeType, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * custom name for a coordinator.  Coordinators will set the label on their queue
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * asynchronously performs the block on the coordinator's queue.  Encapsulates an autorelease pool.
     */
    @Generated
    @Selector("performBlock:")
    public native void performBlock(@ObjCBlock(name = "call_performBlock") Block_performBlock block);

    /**
     * synchronously performs the block on the coordinator's queue.  May safely be called reentrantly. Encapsulates an autorelease pool.
     */
    @Generated
    @Selector("performBlockAndWait:")
    public native void performBlockAndWait(
            @ObjCBlock(name = "call_performBlockAndWait") Block_performBlockAndWait block);

    @Generated
    @Selector("persistentStoreForURL:")
    public native NSPersistentStore persistentStoreForURL(NSURL URL);

    @Generated
    @Selector("persistentStores")
    public native NSArray<? extends NSPersistentStore> persistentStores();

    @Generated
    @Selector("removePersistentStore:error:")
    public native boolean removePersistentStoreError(NSPersistentStore store,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * copy or overwrite the target persistent store in accordance with the store class's requirements.  It is important to pass similar options as addPersistentStoreWithType: ... SQLite stores will honor file locks, journal files, journaling modes, and other intricacies.  Other stores will default to using NSFileManager.
     */
    @Generated
    @Selector("replacePersistentStoreAtURL:destinationOptions:withPersistentStoreFromURL:sourceOptions:storeType:error:")
    public native boolean replacePersistentStoreAtURLDestinationOptionsWithPersistentStoreFromURLSourceOptionsStoreTypeError(
            NSURL destinationURL, NSDictionary<?, ?> destinationOptions, NSURL sourceURL,
            NSDictionary<?, ?> sourceOptions, String storeType,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sets the metadata stored in the persistent store during the next save operation executed on it; the store type and UUID (NSStoreTypeKey and NSStoreUUIDKey) are always added automatically (but NSStoreUUIDKey is only added if it is not set manually as part of the dictionary argument)
     */
    @Generated
    @Selector("setMetadata:forPersistentStore:")
    public native void setMetadataForPersistentStore(NSDictionary<String, ?> metadata, NSPersistentStore store);

    /**
     * custom name for a coordinator.  Coordinators will set the label on their queue
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * Sets the URL for the specified store in the coordinator.  For atomic stores, this will alter the location to which the next save operation will persist the file;  for non-atomic stores, invoking this method will release the existing connection and create a new one at the specified URL.  (For non-atomic stores, a store must pre-exist at the destination URL; a new store will not be created.)
     */
    @Generated
    @Selector("setURL:forPersistentStore:")
    public native boolean setURLForPersistentStore(NSURL url, NSPersistentStore store);

    @Generated
    @Deprecated
    @Selector("tryLock")
    public native boolean tryLock();

    @Generated
    @Deprecated
    @Selector("unlock")
    public native void unlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPersistentStoreWithDescriptionCompletionHandler {
        @Generated
        void call_addPersistentStoreWithDescriptionCompletionHandler(NSPersistentStoreDescription arg0, NSError arg1);
    }

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
     * Constructs a combined NSPersistentHistoryToken given an array of persistent stores. If stores is nil or an empty array, the NSPersistentHistoryToken will be constructed with all of the persistent stores in the coordinator.
     */
    @Generated
    @Selector("currentPersistentHistoryTokenFromStores:")
    public native NSPersistentHistoryToken currentPersistentHistoryTokenFromStores(NSArray<?> stores);
}
