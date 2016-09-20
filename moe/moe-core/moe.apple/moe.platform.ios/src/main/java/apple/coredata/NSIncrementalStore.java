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
public class NSIncrementalStore extends NSPersistentStore {
    static {
        NatJ.register();
    }

    @Generated
    protected NSIncrementalStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSIncrementalStore alloc();

    /**
     * identifierForNewStoreAtURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/clm/NSIncrementalStore/identifierForNewStoreAtURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("identifierForNewStoreAtURL:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object identifierForNewStoreAtURL(NSURL storeURL);

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
    @Selector("metadataForPersistentStoreWithURL:error:")
    public static native NSDictionary<String, ?> metadataForPersistentStoreWithURLError(NSURL url, Ptr<NSError> error);

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
            Ptr<NSError> error);

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
     * executeRequest:withContext:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/executeRequest:withContext:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("executeRequest:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object executeRequestWithContextError(NSPersistentStoreRequest request,
            NSManagedObjectContext context, Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSIncrementalStore init();

    @Generated
    @Selector("initWithPersistentStoreCoordinator:configurationName:URL:options:")
    public native NSIncrementalStore initWithPersistentStoreCoordinatorConfigurationNameURLOptions(
            NSPersistentStoreCoordinator root, String name, NSURL url, NSDictionary<?, ?> options);

    /**
     * loadMetadata:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/loadMetadata:">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadMetadata:")
    public native boolean loadMetadata(Ptr<NSError> error);

    /**
     * managedObjectContextDidRegisterObjectsWithIDs:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/managedObjectContextDidRegisterObjectsWithIDs:">iOS Dev Center</a>
     */
    @Generated
    @Selector("managedObjectContextDidRegisterObjectsWithIDs:")
    public native void managedObjectContextDidRegisterObjectsWithIDs(NSArray<? extends NSManagedObjectID> objectIDs);

    /**
     * managedObjectContextDidUnregisterObjectsWithIDs:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/managedObjectContextDidUnregisterObjectsWithIDs:">iOS Dev Center</a>
     */
    @Generated
    @Selector("managedObjectContextDidUnregisterObjectsWithIDs:")
    public native void managedObjectContextDidUnregisterObjectsWithIDs(NSArray<? extends NSManagedObjectID> objectIDs);

    /**
     * newObjectIDForEntity:referenceObject:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/newObjectIDForEntity:referenceObject:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newObjectIDForEntity:referenceObject:")
    public native NSManagedObjectID newObjectIDForEntityReferenceObject(NSEntityDescription entity,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * newValueForRelationship:forObjectWithID:withContext:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/newValueForRelationship:forObjectWithID:withContext:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newValueForRelationship:forObjectWithID:withContext:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object newValueForRelationshipForObjectWithIDWithContextError(NSRelationshipDescription relationship,
            NSManagedObjectID objectID, NSManagedObjectContext context, Ptr<NSError> error);

    /**
     * newValuesForObjectWithID:withContext:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/newValuesForObjectWithID:withContext:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newValuesForObjectWithID:withContext:error:")
    public native NSIncrementalStoreNode newValuesForObjectWithIDWithContextError(NSManagedObjectID objectID,
            NSManagedObjectContext context, Ptr<NSError> error);

    /**
     * obtainPermanentIDsForObjects:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/obtainPermanentIDsForObjects:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("obtainPermanentIDsForObjects:error:")
    public native NSArray<? extends NSManagedObjectID> obtainPermanentIDsForObjectsError(
            NSArray<? extends NSManagedObject> array, Ptr<NSError> error);

    /**
     * referenceObjectForObjectID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreData/Reference/NSIncrementalStore_Class/index.html#//apple_ref/occ/instm/NSIncrementalStore/referenceObjectForObjectID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("referenceObjectForObjectID:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object referenceObjectForObjectID(NSManagedObjectID objectID);
}
