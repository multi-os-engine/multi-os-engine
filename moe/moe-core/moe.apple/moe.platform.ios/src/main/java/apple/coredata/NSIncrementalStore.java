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

/**
 * Abstract class defining the API through which Core Data communicates with a store.
 * This API is designed to allow users to create persistent stores which load and save
 * data incrementally, allowing for the management of large and/or shared datasets.
 */
@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSIncrementalStore extends NSPersistentStore {
    static {
        NatJ.register();
    }

    @Generated
    protected NSIncrementalStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSIncrementalStore alloc();

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

    /**
     * API methods that may be overriden:
     */
    @Generated
    @Selector("identifierForNewStoreAtURL:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object identifierForNewStoreAtURL(NSURL storeURL);

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
    @Selector("metadataForPersistentStoreWithURL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreWithURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("migrationManagerClass")
    public static native Class migrationManagerClass();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setMetadata:forPersistentStoreWithURL:error:")
    public static native boolean setMetadataForPersistentStoreWithURLError(NSDictionary<String, ?> metadata, NSURL url,
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

    /**
     * Return a value as appropriate for the request, or nil if the request cannot be completed.
     * If the request is a fetch request whose result type is set to one of NSManagedObjectResultType,
     * NSManagedObjectIDResultType, NSDictionaryResultType, return an array containing all objects
     * in the store matching the request.
     * If the request is a fetch request whose result type is set to NSCountResultType, return an
     * array containing an NSNumber of all objects in the store matching the request.
     * If the request is a save request, the result should be an empty array. Note that
     * save requests may have nil inserted/updated/deleted/locked collections; this should be
     * treated as a request to save the store metadata.
     * Note that subclasses of NSIncrementalStore should implement this method conservatively,
     * and expect that unknown request types may at some point be passed to the
     * method. The correct behavior in these cases would be to return nil and an error.
     */
    @Generated
    @Selector("executeRequest:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object executeRequestWithContextError(NSPersistentStoreRequest request,
            NSManagedObjectContext context, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSIncrementalStore init();

    @Generated
    @Selector("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public native NSIncrementalStore initWithPersistentStoreCoordinatorConfigurationNameURLOptions(
            NSPersistentStoreCoordinator root, String name, NSURL url, NSDictionary<?, ?> options);

    /**
     * CoreData expects loadMetadata: to validate that the URL used to create the store is usable
     * (location exists, is writable (if applicable), schema is compatible, etc) and return an
     * error if there is an issue.
     * Any subclass of NSIncrementalStore which is file-based must be able to handle being initialized
     * with a URL pointing to a zero-length file. This serves as an indicator that a new store is to be
     * constructed at the specified location and allows applications using the store to securly create
     * reservation files in known locations.
     */
    @Generated
    @Selector("loadMetadata:")
    public native boolean loadMetadata(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Inform the store that the objects with ids in objectIDs are in use in a client NSManagedObjectContext
     */
    @Generated
    @Selector("managedObjectContextDidRegisterObjectsWithIDs:")
    public native void managedObjectContextDidRegisterObjectsWithIDs(NSArray<? extends NSManagedObjectID> objectIDs);

    /**
     * Inform the store that the objects with ids in objectIDs are no longer in use in a client NSManagedObjectContext
     */
    @Generated
    @Selector("managedObjectContextDidUnregisterObjectsWithIDs:")
    public native void managedObjectContextDidUnregisterObjectsWithIDs(NSArray<? extends NSManagedObjectID> objectIDs);

    /**
     * Returns a new objectID with retain count 1 that uses data as the key.
     */
    @Generated
    @Selector("newObjectIDForEntity:referenceObject:")
    public native NSManagedObjectID newObjectIDForEntityReferenceObject(NSEntityDescription entity,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * Returns the relationship for the given relationship on the object with ID objectID. If the relationship
     * is a to-one it should return an NSManagedObjectID corresponding to the destination or NSNull if the relationship value is nil.
     * If the relationship is a to-many, should return an NSSet or NSArray containing the NSManagedObjectIDs of the related objects.
     * Should return nil and set the error if the source object cannot be found.
     */
    @Generated
    @Selector("newValueForRelationship:forObjectWithID:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object newValueForRelationshipForObjectWithIDWithContextError(NSRelationshipDescription relationship,
            NSManagedObjectID objectID, NSManagedObjectContext context,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns an NSIncrementalStoreNode encapsulating the persistent external values for the object for an objectID.
     * It should include all attributes values and may include to-one relationship values as NSManagedObjectIDs.
     * Should return nil and set the error if the object cannot be found.
     */
    @Generated
    @Selector("newValuesForObjectWithID:withContext:error:")
    public native NSIncrementalStoreNode newValuesForObjectWithIDWithContextError(NSManagedObjectID objectID,
            NSManagedObjectContext context, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Called before executeRequest with a save request, to assign permanent IDs to newly inserted objects;
     * must return the objectIDs in the same order as the objects appear in array.
     */
    @Generated
    @Selector("obtainPermanentIDsForObjects:error:")
    public native NSArray<? extends NSManagedObjectID> obtainPermanentIDsForObjectsError(
            NSArray<? extends NSManagedObject> array, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns the reference data used to construct the objectID. Will raise an NSInvalidArgumentException if the objectID was not created
     * by this store.
     */
    @Generated
    @Selector("referenceObjectForObjectID:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object referenceObjectForObjectID(NSManagedObjectID objectID);
}
