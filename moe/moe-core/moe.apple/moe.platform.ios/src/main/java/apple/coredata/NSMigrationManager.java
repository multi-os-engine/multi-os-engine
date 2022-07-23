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
public class NSMigrationManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMigrationManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMigrationManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMigrationManager allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("new")
    public static native NSMigrationManager new_objc();

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
     * Associates the source instance with the specified destination instance for the given entity mapping. Since the
     * migration is performed as a three-step process (first create the data, then relate the data, then validate the
     * data) it is necessary to be able to associate data between the source and destination stores, in order to allow
     * for relationship creation/fixup after the creation pass. This method is called in the default
     * implementation of NSEntityMigrationPolicy's
     * createDestinationInstancesForSourceInstance:entityMapping:manager:error: method.
     */
    @Generated
    @Selector("associateSourceInstance:withDestinationInstance:forEntityMapping:")
    public native void associateSourceInstanceWithDestinationInstanceForEntityMapping(NSManagedObject sourceInstance,
            NSManagedObject destinationInstance, NSEntityMapping entityMapping);

    /**
     * Cancels the migration with the specified error. Calling this method causes
     * migrateStoreFromURL:type:options:withMappingModel:toDestinationURL:destinationType:destinationOptions:error: to
     * abort the migration and return the specified error.
     */
    @Generated
    @Selector("cancelMigrationWithError:")
    public native void cancelMigrationWithError(NSError error);

    /**
     * Observable property that can be used to determine progress of the migration process. Returns the current entity
     * mapping being processed. Each entity is processed a total of three times (instance creation, relationship
     * creation, validation)
     */
    @Generated
    @Selector("currentEntityMapping")
    public native NSEntityMapping currentEntityMapping();

    @Generated
    @Selector("destinationContext")
    public native NSManagedObjectContext destinationContext();

    @Generated
    @Selector("destinationEntityForEntityMapping:")
    public native NSEntityDescription destinationEntityForEntityMapping(NSEntityMapping mEntity);

    /**
     * Returns the managed object instances created in the destination store for the given entity mapping for the
     * specified source instances.
     */
    @Generated
    @Selector("destinationInstancesForEntityMappingNamed:sourceInstances:")
    public native NSArray<? extends NSManagedObject> destinationInstancesForEntityMappingNamedSourceInstances(
            String mappingName, NSArray<? extends NSManagedObject> sourceInstances);

    @Generated
    @Selector("destinationModel")
    public native NSManagedObjectModel destinationModel();

    @Generated
    @Selector("init")
    public native NSMigrationManager init();

    /**
     * Creates a migration manager instance with the corresponding source and destination models. (All validation of the
     * arguments is performed during migrateStoreFromURL:toURL:) As with the NSPersistentStoreCoordinator, once models
     * are added to the migration manager they are immutable and cannot be altered.
     */
    @Generated
    @Selector("initWithSourceModel:destinationModel:")
    public native NSMigrationManager initWithSourceModelDestinationModel(NSManagedObjectModel sourceModel,
            NSManagedObjectModel destinationModel);

    /**
     * Accessors for the mapping model, source model, and destination model
     */
    @Generated
    @Selector("mappingModel")
    public native NSMappingModel mappingModel();

    /**
     * Migrates of the store at the specified source URL to the store at the destination URL, performing all of the
     * mappings in the mapping model. A store must exist at the source URL; if a store does not exist at the destination
     * URL, one will be created (otherwise the migration will append to the existing store.) Invoking this method will
     * perform compatibility checks on the source and destination models (and the mapping model.) If an error occurs
     * during the validation or migration, this method will return NO.
     */
    @Generated
    @Selector("migrateStoreFromURL:type:options:withMappingModel:toDestinationURL:destinationType:destinationOptions:error:")
    public native boolean migrateStoreFromURLTypeOptionsWithMappingModelToDestinationURLDestinationTypeDestinationOptionsError(
            NSURL sourceURL, String sStoreType, NSDictionary<?, ?> sOptions, NSMappingModel mappings, NSURL dURL,
            String dStoreType, NSDictionary<?, ?> dOptions, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Observable property that can be used to determine progress of the migration process. Returns the percentage
     * complete of the migration process. The progress value is a number from 0 to 1 indicating percent complete.
     */
    @Generated
    @Selector("migrationProgress")
    public native float migrationProgress();

    /**
     * Resets the association tables for the migration. (Note this does NOT reset the source or destination contexts).
     */
    @Generated
    @Selector("reset")
    public native void reset();

    /**
     * Returns/sets the user info for the migration manager
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> value);

    /**
     * Tries to use a store specific migration manager to perform the store migration, note that a store specific
     * migration manager class is not guaranteed to perform any of the migration manager delegate callbacks or update
     * values for the observable properties.
     * Defaults to YES
     */
    @Generated
    @Selector("setUsesStoreSpecificMigrationManager:")
    public native void setUsesStoreSpecificMigrationManager(boolean value);

    /**
     * Accessors for the managed object contexts used for reading the source and destination stores. These contexts are
     * created lazily, as part of the initialization of two Core Data stacks (one for reading, the other for writing
     * data.)
     */
    @Generated
    @Selector("sourceContext")
    public native NSManagedObjectContext sourceContext();

    /**
     * Returns the NSEntityDescription for the source and destination entities, respectively, of the entity mapping.
     * (Entity mappings do not store the actual description objects, but rather the name and version information of the
     * entity.)
     */
    @Generated
    @Selector("sourceEntityForEntityMapping:")
    public native NSEntityDescription sourceEntityForEntityMapping(NSEntityMapping mEntity);

    /**
     * Returns the managed object instances in the source store used to create the specified destination instances for
     * the given entity mapping.
     */
    @Generated
    @Selector("sourceInstancesForEntityMappingNamed:destinationInstances:")
    public native NSArray<? extends NSManagedObject> sourceInstancesForEntityMappingNamedDestinationInstances(
            String mappingName, NSArray<? extends NSManagedObject> destinationInstances);

    @Generated
    @Selector("sourceModel")
    public native NSManagedObjectModel sourceModel();

    /**
     * Returns/sets the user info for the migration manager
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    /**
     * Tries to use a store specific migration manager to perform the store migration, note that a store specific
     * migration manager class is not guaranteed to perform any of the migration manager delegate callbacks or update
     * values for the observable properties.
     * Defaults to YES
     */
    @Generated
    @Selector("usesStoreSpecificMigrationManager")
    public native boolean usesStoreSpecificMigrationManager();
}
