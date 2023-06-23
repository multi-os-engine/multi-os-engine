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

package apple.coredata.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("CoreData")
@Runtime(CRuntime.class)
public final class CoreData {
    @Generated @NUInt public static final long NSFetchRequestExpressionType = 0x0000000000000032L;

    static {
        NatJ.register();
    }

    @Generated
    private CoreData() {
    }

    /**
     * Framework version
     */
    @Generated
    @CVariable()
    public static native double NSCoreDataVersionNumber();

    /**
     * if multiple validation errors occur in one operation, they are collected in an array and added with this key to
     * the "top-level error" of the operation
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDetailedErrorsKey();

    /**
     * object that failed to validate for a validation error
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSValidationObjectErrorKey();

    /**
     * key that failed to validate for a validation error
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSValidationKeyErrorKey();

    /**
     * for predicate-based validation, the predicate for the condition that failed to validate
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSValidationPredicateErrorKey();

    /**
     * if non-nil, the value for the key that failed to validate for a validation error
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSValidationValueErrorKey();

    /**
     * stores prompting an error
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAffectedStoresErrorKey();

    /**
     * objects prompting an error
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAffectedObjectsErrorKey();

    /**
     * key in NSError's userInfo specifying the NSArray of NSMergeConflict
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreSaveConflictsErrorKey();

    /**
     * Predefined domain for SQLite errors, value of "code" will correspond to preexisting values in SQLite.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSQLiteErrorDomain();

    /**
     * Notifications immediately before and immediately after the context saves. The user info dictionary contains
     * information about the objects that changed and what changed
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSManagedObjectContextWillSaveNotification();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSManagedObjectContextDidSaveNotification();

    /**
     * Notification when objects in a context changed: the user info dictionary contains information about the objects
     * that changed and what changed
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSManagedObjectContextObjectsDidChangeNotification();

    /**
     * User info keys for NSManagedObjectContextObjectsDidChangeNotification: the values for these keys are sets of
     * managed objects
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInsertedObjectsKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUpdatedObjectsKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDeletedObjectsKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRefreshedObjectsKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidatedObjectsKey();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSManagedObjectContextQueryGenerationKey();

    /**
     * All objects in the context have been invalidated
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidatedAllObjectsKey();

    /**
     * Default policy for all managed object contexts - save returns with an error that contains the object IDs of the
     * objects that had conflicts(NSInsertedObjectsKey, NSUpdatedObjectsKey).
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NSErrorMergePolicy();

    /**
     * This singleton policy merges conflicts between the persistent store's version of the object and the current in
     * memory version. The merge occurs by individual property. For properties which have been changed in both the
     * external source and in memory, the external changes trump the in memory ones.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NSMergeByPropertyStoreTrumpMergePolicy();

    /**
     * This singleton policy merges conflicts between the persistent store's version of the object and the current in
     * memory version. The merge occurs by individual property. For properties which have been changed in both the
     * external source and in memory, the in memory changes trump the external ones.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NSMergeByPropertyObjectTrumpMergePolicy();

    /**
     * This singleton policy overwrites all state for the changed objects in conflict The current object's state is
     * pushed upon the persistent store.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NSOverwriteMergePolicy();

    /**
     * This singleton policy discards all state for the changed objects in conflict. The persistent store's version of
     * the object is used.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object NSRollbackMergePolicy();

    /**
     * Persistent store types supported by Core Data:
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSQLiteStoreType();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBinaryStoreType();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInMemoryStoreType();

    /**
     * key in the metadata dictionary to identify the store type
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStoreTypeKey();

    /**
     * key in the metadata dictionary to identify the store UUID - the store UUID is useful to identify stores through
     * URI representations, but it is NOT guaranteed to be unique (while the UUID generated for new stores is unique,
     * users can freely copy files and thus the UUID stored inside, so developers that track/reference stores explicitly
     * do need to be aware of duplicate UUIDs and potentially override the UUID when a new store is added to the list of
     * known stores in their application)
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStoreUUIDKey();

    /**
     * A notification posted before the list of open persistent stores changes, similar to
     * NSPersistentStoreCoordinatorStoresDidChangeNotification. If the application is running, Core Data will post this
     * before responding to iCloud account changes or "Delete All" from Documents & Data.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreCoordinatorStoresWillChangeNotification();

    /**
     * user info dictionary contains information about the stores that were added or removed
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreCoordinatorStoresDidChangeNotification();

    /**
     * sent during the invocation of NSPersistentStore's willRemoveFromPersistentStoreCoordinator during store
     * deallocation or removal
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreCoordinatorWillRemoveStoreNotification();

    /**
     * The object values for NSAddedPersistentStoresKey and NSRemovedPersistentStoresKey will be arrays containing
     * added/removed stores
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAddedPersistentStoresKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRemovedPersistentStoresKey();

    /**
     * The object value for NSUUIDChangedPersistentStoresKey will be an array where the object at index 0 will be the
     * old store instance, and the object at index 1 the new
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUUIDChangedPersistentStoresKey();

    /**
     * flag indicating whether a store is treated as read-only or not - default is NO
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSReadOnlyPersistentStoreOption();

    /**
     * Options key specifying the connection timeout for Core Data stores. This value (an NSNumber) represents the
     * duration, in seconds, Core Data will wait while attempting to create a connection to a persistent store. If a
     * connection is unable to be made within that timeframe, the operation is aborted and an error is returned.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreTimeoutOption();

    /**
     * Options key for a dictionary of sqlite pragma settings with pragma values indexed by pragma names as keys. All
     * pragma values must be specified as strings. The fullfsync and synchronous pragmas control the tradeoff between
     * write performance (write to disk speed & cache utilization) and durability (data loss/corruption sensitivity to
     * power interruption). For more information on pragma settings visit <http://sqlite.org/pragma.html>
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSQLitePragmasOption();

    /**
     * Option key to run an analysis of the store data to optimize indices based on statistical information when the
     * store is added to the coordinator. This invokes SQLite's ANALYZE command. Ignored by other stores.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSQLiteAnalyzeOption();

    /**
     * Option key to rebuild the store file, forcing a database wide defragmentation when the store is added to the
     * coordinator. This invokes SQLite's VACUUM command. Ignored by other stores.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSQLiteManualVacuumOption();

    /**
     * Options key to ignore the built-in versioning provided by Core Data. If the value for this key (an NSNumber)
     * evaluates to YES (using boolValue), Core Data will not compare the version hashes between the managed object
     * model in the coordinator and the metadata for the loaded store. (It will, however, continue to update the version
     * hash information in the metadata.) This key is specified by default for all applications linked on or before Mac
     * OS X 10.4.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSIgnorePersistentStoreVersioningOption();

    /**
     * Options key to automatically attempt to migrate versioned stores. If the value for this key (an NSNumber)
     * evaluates to YES (using boolValue) Core Data will, if the version hash information for added store is determined
     * to be incompatible with the model for the coordinator, attempt to locate the source and mapping models in the
     * application bundles, and perform a migration.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigratePersistentStoresAutomaticallyOption();

    /**
     * When combined with NSMigratePersistentStoresAutomaticallyOption, coordinator will attempt to infer a mapping
     * model if none can be found
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInferMappingModelAutomaticallyOption();

    /**
     * Key to represent the version hash information (dictionary) for the model used to create a persistent store. This
     * key is used in the metadata for a persistent store.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStoreModelVersionHashesKey();

    /**
     * Key to represent the version identifier for the model used to create the store. This key is used in the metadata
     * for a persistent store.
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStoreModelVersionIdentifiersKey();

    /**
     * Key to represent the earliest version of MacOS X the persistent store should support. Backward compatibility may
     * preclude some features. The numeric values are defined in AvailabilityMacros.h
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreOSCompatibility();

    /**
     * User info key specifying the maximum connection pool size that should be used on a store that supports concurrent
     * request handling, the value should be an NSNumber. The connection pool size determines the number of requests a
     * store can handle concurrently, and should be a function of how many contexts are attempting to access store data
     * at any time. Generally, application developers should not set this, and should use the default value. The default
     * connection pool size is implementation dependent and may vary by store type and/or platform.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreConnectionPoolMaxSizeKey();

    /**
     * store option for the destroy... and replace... to indicate that the store file should be destroyed even if the
     * operation might be unsafe (overriding locks
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreForceDestroyOption();

    /**
     * Key to represent the protection class for the persistent store. Backward compatibility may preclude some
     * features. The acceptable values are those defined in Foundation for the NSFileProtectionKey. The default value of
     * NSPersistentStoreFileProtectionKey is NSFileProtectionCompleteUntilFirstUserAuthentication for all applications
     * built on or after iOS5. The default value for all older applications is NSFileProtectionNone.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreFileProtectionKey();

    /**
     * option indicating that a persistent store has a given name in ubiquity, this option is required for ubiquity to
     * function
     * 
     * API-Since: 5.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreUbiquitousContentNameKey();

    /**
     * option indicating the log path to use for ubiquity logs, this option is optional for ubiquity, a default path
     * will be generated for the store if none is provided
     * 
     * API-Since: 5.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreUbiquitousContentURLKey();

    /**
     * Notification sent after records are imported from the ubiquity store. The notification is sent with the object
     * set to the NSPersistentStoreCoordinator instance which registered the store.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreDidImportUbiquitousContentChangesNotification();

    /**
     * In the NSPersistentStoreCoordinatorStoresWillChangeNotification /
     * NSPersistentStoreCoordinatorStoresDidChangeNotification userInfo dictionaries, this identifies the type of event.
     * This could be one of the NSPersistentStoreUbiquitousTransitionType enum values as an NSNumber
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreUbiquitousTransitionTypeKey();

    /**
     * Optionally specified string which will be mixed in to Core Data’s identifier for each iCloud peer. The value must
     * be an alphanumeric string without any special characters, whitespace or punctuation. The primary use for this
     * option is to allow multiple applications on the same peer (device) to share a Core Data store integrated with
     * iCloud. Each application will require its own store file.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreUbiquitousPeerTokenOption();

    /**
     * NSNumber boolean indicating that the receiver should remove all associated ubiquity metadata from a persistent
     * store. This is mostly used during migration or copying to disassociate a persistent store file from an iCloud
     * account
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreRemoveUbiquitousMetadataOption();

    /**
     * NSString specifying the iCloud container identifier Core Data should pass to
     * -URLForUbiquitousContainerIdentifier:
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreUbiquitousContainerIdentifierKey();

    /**
     * NSNumber boolean indicating that the receiver should erase the local store file and rebuild it from the iCloud
     * data in Mobile Documents.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Please see the release notes and Core Data documentation.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreRebuildFromUbiquitousContentOption();

    /**
     * To access the entity migration policy keys in property mapping value expressions implemented in source code use
     * the constants as declared. To access them in custom value expression strings in the mapping model editor in Xcode
     * follow the syntax rules outlined in the predicate format string syntax guide and refer to them as:
     * NSMigrationManagerKey $manager
     * NSMigrationSourceObjectKey $source
     * NSMigrationDestinationObjectKey $destination
     * NSMigrationEntityMappingKey $entityMapping
     * NSMigrationPropertyMappingKey $propertyMapping
     * NSMigrationEntityPolicyKey $entityPolicy
     * 
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigrationManagerKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigrationSourceObjectKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigrationDestinationObjectKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigrationEntityMappingKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigrationPropertyMappingKey();

    /**
     * API-Since: 3.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMigrationEntityPolicyKey();

    /**
     * Spotlight indexing and external record support keys
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCoreDataCoreSpotlightExporter();

    /**
     * Dictionary key for enabling persistent history - default is NO
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentHistoryTrackingKey();

    /**
     * Allows developers to provide an additional set of classes (which must implement NSSecureCoding) that should be
     * used while
     * decoding a binary store.
     * Using this option is preferable to using NSBinaryStoreInsecureDecodingCompatibilityOption.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBinaryStoreSecureDecodingClasses();

    /**
     * Indicate that the binary store should be decoded insecurely. This may be necessary if a store has metadata or
     * transformable
     * properties containing non-standard classes. If possible, developers should use the
     * NSBinaryStoreSecureDecodingClasses option
     * to specify the contained classes, allowing the binary store to to be securely decoded.
     * Applications linked before the availability date will default to using this option.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBinaryStoreInsecureDecodingCompatibilityOption();

    /**
     * When NSPersistentStoreRemoteChangeNotificationPostOptionKey is set to YES, a
     * NSPersistentStoreRemoteChangeNotification is posted for every
     * write to the store, this includes writes that are done by other processes
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreRemoteChangeNotificationPostOptionKey();

    /**
     * NSPersistentStoreRemoteChangeNotification is posted for all cross process writes to the store
     * The payload is the store UUID (NSStoreUUIDKey), store URL (NSPersistentStoreURLKey), and NSPersistentHistoryToken
     * for the transaction (if NSPersistentHistoryTrackingKey was also set)
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreRemoteChangeNotification();

    /**
     * Keys found in the UserInfo for a NSPersistentStoreRemoteChangeNotification
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentStoreURLKey();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentHistoryTokenKey();

    /**
     * Notification when objects in a context changed: the user info dictionary contains information about the objectIDs
     * that changed
     * 
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSManagedObjectContextDidSaveObjectIDsNotification();

    /**
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSManagedObjectContextDidMergeChangesObjectIDsNotification();

    /**
     * User info keys for NSManagedObjectContextDidSaveObjectIDsNotification: the values for these keys are sets of
     * objectIDs
     * 
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInsertedObjectIDsKey();

    /**
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUpdatedObjectIDsKey();

    /**
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDeletedObjectIDsKey();

    /**
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRefreshedObjectIDsKey();

    /**
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidatedObjectIDsKey();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentCloudKitContainerEventChangedNotification();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersistentCloudKitContainerEventUserInfoKey();

    /**
     * * When a change occurs to an entity or entities that are indexed in Spotlight
     * * using NSCoreDataCoreSpotlightDelegate, that index is updated asynchronously.
     * * NSCoreDataCoreSpotlightDelegate will post NSCoreDataCoreSpotlightDelegateIndexDidUpdateNotification
     * * when the index is updated.
     * *
     * * This notification will have a .userInfo that contains two key-value pairs:
     * 
     * * NSStoreUUIDKey: A NSString UUID of the store that contains the
     * * NSCoreDataCoreSpotlightDelegate that updated its index.
     * * NSPersistentHistoryTokenKey: The NSPersistentHistoryToken of the store that
     * * contains the NSCoreDataCoreSpotlightDelegate that updated its index.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCoreDataCoreSpotlightDelegateIndexDidUpdateNotification();

    @Generated public static final double NSCoreDataVersionNumber10_4 = 46.0;
    @Generated public static final double NSCoreDataVersionNumber10_4_3 = 77.0;
    @Generated public static final double NSCoreDataVersionNumber10_5 = 185.0;
    @Generated public static final double NSCoreDataVersionNumber10_5_3 = 186.0;
    @Generated public static final double NSCoreDataVersionNumber10_6 = 246.0;
    @Generated public static final double NSCoreDataVersionNumber10_6_2 = 250.0;
    @Generated public static final double NSCoreDataVersionNumber10_6_3 = 251.0;
    @Generated public static final double NSCoreDataVersionNumber10_7 = 358.4;
    @Generated public static final double NSCoreDataVersionNumber10_7_2 = 358.12;
    @Generated public static final double NSCoreDataVersionNumber10_7_3 = 358.13;
    @Generated public static final double NSCoreDataVersionNumber10_7_4 = 358.14;
    @Generated public static final double NSCoreDataVersionNumber10_8 = 407.5;
    @Generated public static final double NSCoreDataVersionNumber10_8_2 = 407.7;
    @Generated public static final double NSCoreDataVersionNumber10_9 = 481.0;
    @Generated public static final double NSCoreDataVersionNumber10_9_2 = 481.1;
    @Generated public static final double NSCoreDataVersionNumber10_9_3 = 481.3;
    @Generated public static final double NSCoreDataVersionNumber10_10 = 526.0;
    @Generated public static final double NSCoreDataVersionNumber10_10_2 = 526.1;
    @Generated public static final double NSCoreDataVersionNumber10_10_3 = 526.2;
    @Generated public static final double NSCoreDataVersionNumber10_11 = 640.0;
    @Generated public static final double NSCoreDataVersionNumber10_11_3 = 641.3;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_3_0 = 241.0;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_3_1 = 248.0;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_3_2 = 310.2;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_4_0 = 320.5;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_4_1 = 320.11;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_4_2 = 320.15;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_4_3 = 320.17;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_5_0 = 386.1;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_5_1 = 386.5;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_6_0 = 419.0;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_6_1 = 419.1;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_7_0 = 479.1;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_7_1 = 479.3;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_8_0 = 519.0;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_8_3 = 519.15;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_9_0 = 640.0;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_9_2 = 641.4;
    @Generated public static final double NSCoreDataVersionNumber_iPhoneOS_9_3 = 641.6;
}
