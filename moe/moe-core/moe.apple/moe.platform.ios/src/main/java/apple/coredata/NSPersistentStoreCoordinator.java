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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSPersistentStoreCoordinator allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -metadataForPersistentStoreOfType:URL:options:error: and pass in an options dictionary
     * matching addPersistentStoreWithType
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("metadataForPersistentStoreOfType:URL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLError(@Nullable String storeType,
            @NotNull NSURL url, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Allows to access the metadata stored in a persistent store without warming up a CoreData stack; the guaranteed
     * keys in this dictionary are NSStoreTypeKey and NSStoreUUIDKey. If storeType is nil, Core Data will guess which
     * store class should be used to get/set the store file's metadata.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("metadataForPersistentStoreOfType:URL:options:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreOfTypeURLOptionsError(
            @NotNull String storeType, @NotNull NSURL url, @Nullable NSDictionary<?, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Owned
    @Selector("new")
    public static native NSPersistentStoreCoordinator new_objc();

    /**
     * Registers the specified NSPersistentStore subclass for the specified store type string. This method must be
     * invoked before a custom subclass of NSPersistentStore can be loaded into a persistent store coordinator. Passing
     * nil for the store class argument will unregister the specified store type.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("registerStoreClass:forStoreType:")
    public static native void registerStoreClassForStoreType(@Nullable Class storeClass, @NotNull String storeType);

    /**
     * Returns a dictionary of the registered store types: the keys are the store type strings and the values are the
     * NSPersistentStore subclasses wrapped in NSValues.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @Selector("registeredStoreTypes")
    public static native NSDictionary<String, ? extends NSValue> registeredStoreTypes();

    /**
     * Delete all ubiquitous content for all peers for the persistent store at the given URL and also delete the local
     * store file. storeOptions should contain the options normally passed to
     * addPersistentStoreWithType:URL:options:error. Errors may be returned as a result of file I/O, iCloud network or
     * iCloud account issues.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @Deprecated
    @Generated
    @Selector("removeUbiquitousContentAndPersistentStoreAtURL:options:error:")
    public static native boolean removeUbiquitousContentAndPersistentStoreAtURLOptionsError(@NotNull NSURL storeURL,
            @Nullable NSDictionary<?, ?> options, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -setMetadata:forPersistentStoreOfType:URL:options:error: and pass in an options
     * dictionary matching addPersistentStoreWithType
     */
    @Generated
    @Deprecated
    @Selector("setMetadata:forPersistentStoreOfType:URL:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLError(@Nullable NSDictionary<String, ?> metadata,
            @Nullable String storeType, @NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setMetadata:forPersistentStoreOfType:URL:options:error:")
    public static native boolean setMetadataForPersistentStoreOfTypeURLOptionsError(
            @Nullable NSDictionary<String, ?> metadata, @NotNull String storeType, @NotNull NSURL url,
            @Nullable NSDictionary<?, ?> options, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @NotNull
    @Generated
    @Selector("URLForPersistentStore:")
    public native NSURL URLForPersistentStore(@NotNull NSPersistentStore store);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("addPersistentStoreWithDescription:completionHandler:")
    public native void addPersistentStoreWithDescriptionCompletionHandler(
            @NotNull NSPersistentStoreDescription storeDescription,
            @NotNull @ObjCBlock(name = "call_addPersistentStoreWithDescriptionCompletionHandler") Block_addPersistentStoreWithDescriptionCompletionHandler block);

    /**
     * Adds the store at the specified URL (of the specified type) to the coordinator with the model configuration and
     * options. The configuration can be nil -- then it's the complete model; storeURL is usually the file location of
     * the database
     */
    @Nullable
    @Generated
    @Selector("addPersistentStoreWithType:configuration:URL:options:error:")
    public native NSPersistentStore addPersistentStoreWithTypeConfigurationURLOptionsError(@NotNull String storeType,
            @Nullable String configuration, @Nullable NSURL storeURL, @Nullable NSDictionary<?, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * delete or truncate the target persistent store in accordance with the store class's requirements. It is important
     * to pass similar options as addPersistentStoreWithType: ... SQLite stores will honor file locks, journal files,
     * journaling modes, and other intricacies. It is not possible to unlink a database file safely out from underneath
     * another thread or process, so this API performs a truncation. Other stores will default to using NSFileManager.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("destroyPersistentStoreAtURL:withType:options:error:")
    public native boolean destroyPersistentStoreAtURLWithTypeOptionsError(@NotNull NSURL url, @NotNull String storeType,
            @Nullable NSDictionary<?, ?> options, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sends a request to all of the stores associated with this coordinator.
     * Returns an array if successful, nil if not.
     * The contents of the array will vary depending on the request type: NSFetchRequest results will be an array of
     * managed objects, managed object IDs, or NSDictionaries;
     * NSSaveChangesRequests will an empty array. User defined requests will return arrays of arrays, where the nested
     * array is the result returned form a single store.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("executeRequest:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object executeRequestWithContextError(@NotNull NSPersistentStoreRequest request,
            @NotNull NSManagedObjectContext context, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSPersistentStoreCoordinator init();

    @Generated
    @Selector("initWithManagedObjectModel:")
    public native NSPersistentStoreCoordinator initWithManagedObjectModel(@NotNull NSManagedObjectModel model);

    @Generated
    @Deprecated
    @Selector("lock")
    public native void lock();

    /**
     * Given a URI representation of an object ID, returns an object ID if a matching store is available or nil if a
     * matching store cannot be found (the URI representation contains a UUID of the store the ID is coming from, and
     * the coordinator can match it against the stores added to it)
     */
    @Nullable
    @Generated
    @Selector("managedObjectIDForURIRepresentation:")
    public native NSManagedObjectID managedObjectIDForURIRepresentation(@NotNull NSURL url);

    @NotNull
    @Generated
    @Selector("managedObjectModel")
    public native NSManagedObjectModel managedObjectModel();

    /**
     * Returns the metadata currently stored or to-be-stored in the persistent store
     */
    @NotNull
    @Generated
    @Selector("metadataForPersistentStore:")
    public native NSDictionary<String, ?> metadataForPersistentStore(@NotNull NSPersistentStore store);

    /**
     * Used for save as - performance may vary depending on the type of old and new store; the old store is usually
     * removed from the coordinator by the migration operation, and therefore is no longer a useful reference after
     * invoking this method
     */
    @Nullable
    @Generated
    @Selector("migratePersistentStore:toURL:options:withType:error:")
    public native NSPersistentStore migratePersistentStoreToURLOptionsWithTypeError(@NotNull NSPersistentStore store,
            @NotNull NSURL URL, @Nullable NSDictionary<?, ?> options, @NotNull String storeType,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * custom name for a coordinator. Coordinators will set the label on their queue
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * asynchronously performs the block on the coordinator's queue. Encapsulates an autorelease pool.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("performBlock:")
    public native void performBlock(@NotNull @ObjCBlock(name = "call_performBlock") Block_performBlock block);

    /**
     * synchronously performs the block on the coordinator's queue. May safely be called reentrantly. Encapsulates an
     * autorelease pool.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("performBlockAndWait:")
    public native void performBlockAndWait(
            @NotNull @ObjCBlock(name = "call_performBlockAndWait") Block_performBlockAndWait block);

    @Nullable
    @Generated
    @Selector("persistentStoreForURL:")
    public native NSPersistentStore persistentStoreForURL(@NotNull NSURL URL);

    @NotNull
    @Generated
    @Selector("persistentStores")
    public native NSArray<? extends NSPersistentStore> persistentStores();

    @Generated
    @Selector("removePersistentStore:error:")
    public native boolean removePersistentStoreError(@NotNull NSPersistentStore store,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * copy or overwrite the target persistent store in accordance with the store class's requirements. It is important
     * to pass similar options as addPersistentStoreWithType: ... SQLite stores will honor file locks, journal files,
     * journaling modes, and other intricacies. Other stores will default to using NSFileManager.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("replacePersistentStoreAtURL:destinationOptions:withPersistentStoreFromURL:sourceOptions:storeType:error:")
    public native boolean replacePersistentStoreAtURLDestinationOptionsWithPersistentStoreFromURLSourceOptionsStoreTypeError(
            @NotNull NSURL destinationURL, @Nullable NSDictionary<?, ?> destinationOptions, @NotNull NSURL sourceURL,
            @Nullable NSDictionary<?, ?> sourceOptions, @NotNull String storeType,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Sets the metadata stored in the persistent store during the next save operation executed on it; the store type
     * and UUID (NSStoreTypeKey and NSStoreUUIDKey) are always added automatically (but NSStoreUUIDKey is only added if
     * it is not set manually as part of the dictionary argument)
     */
    @Generated
    @Selector("setMetadata:forPersistentStore:")
    public native void setMetadataForPersistentStore(@Nullable NSDictionary<String, ?> metadata,
            @NotNull NSPersistentStore store);

    /**
     * custom name for a coordinator. Coordinators will set the label on their queue
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * Sets the URL for the specified store in the coordinator. For atomic stores, this will alter the location to which
     * the next save operation will persist the file; for non-atomic stores, invoking this method will release the
     * existing connection and create a new one at the specified URL. (For non-atomic stores, a store must pre-exist at
     * the destination URL; a new store will not be created.)
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setURL:forPersistentStore:")
    public native boolean setURLForPersistentStore(@NotNull NSURL url, @NotNull NSPersistentStore store);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use -performBlock: instead
     */
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
        void call_addPersistentStoreWithDescriptionCompletionHandler(@NotNull NSPersistentStoreDescription arg0,
                @Nullable NSError arg1);
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
     * Constructs a combined NSPersistentHistoryToken given an array of persistent stores. If stores is nil or an empty
     * array, the NSPersistentHistoryToken will be constructed with all of the persistent stores in the coordinator.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("currentPersistentHistoryTokenFromStores:")
    public native NSPersistentHistoryToken currentPersistentHistoryTokenFromStores(@Nullable NSArray<?> stores);

    /**
     * Finish deferred work from lightweight migration
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("finishDeferredLightweightMigration:")
    public native boolean finishDeferredLightweightMigration(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Finish deferred work from lightweight migration for a single table
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("finishDeferredLightweightMigrationTask:")
    public native boolean finishDeferredLightweightMigrationTask(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
