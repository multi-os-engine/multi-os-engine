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

package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class Enums {
    /**
     * generic validation error
     */
    @Generated @NInt public static final long NSManagedObjectValidationError = 0x000000000000060EL;
    /**
     * one or more uniqueness constraints were violated
     */
    @Generated @NInt public static final long NSManagedObjectConstraintValidationError = 0x000000000000060FL;
    /**
     * generic message for error containing multiple validation errors
     */
    @Generated @NInt public static final long NSValidationMultipleErrorsError = 0x0000000000000618L;
    /**
     * non-optional property with a nil value
     */
    @Generated @NInt public static final long NSValidationMissingMandatoryPropertyError = 0x0000000000000622L;
    /**
     * to-many relationship with too few destination objects
     */
    @Generated @NInt public static final long NSValidationRelationshipLacksMinimumCountError = 0x000000000000062CL;
    /**
     * bounded, to-many relationship with too many destination objects
     */
    @Generated @NInt public static final long NSValidationRelationshipExceedsMaximumCountError = 0x0000000000000636L;
    /**
     * some relationship with NSDeleteRuleDeny is non-empty
     */
    @Generated @NInt public static final long NSValidationRelationshipDeniedDeleteError = 0x0000000000000640L;
    /**
     * some numerical value is too large
     */
    @Generated @NInt public static final long NSValidationNumberTooLargeError = 0x000000000000064AL;
    /**
     * some numerical value is too small
     */
    @Generated @NInt public static final long NSValidationNumberTooSmallError = 0x0000000000000654L;
    /**
     * some date value is too late
     */
    @Generated @NInt public static final long NSValidationDateTooLateError = 0x000000000000065EL;
    /**
     * some date value is too soon
     */
    @Generated @NInt public static final long NSValidationDateTooSoonError = 0x0000000000000668L;
    /**
     * some date value fails to match date pattern
     */
    @Generated @NInt public static final long NSValidationInvalidDateError = 0x0000000000000672L;
    /**
     * some string value is too long
     */
    @Generated @NInt public static final long NSValidationStringTooLongError = 0x000000000000067CL;
    /**
     * some string value is too short
     */
    @Generated @NInt public static final long NSValidationStringTooShortError = 0x0000000000000686L;
    /**
     * some string value fails to match some pattern
     */
    @Generated @NInt public static final long NSValidationStringPatternMatchingError = 0x0000000000000690L;
    /**
     * can't acquire a lock in a managed object context
     */
    @Generated @NInt public static final long NSManagedObjectContextLockingError = 0x00000000000203A0L;
    /**
     * can't acquire a lock in a persistent store coordinator
     */
    @Generated @NInt public static final long NSPersistentStoreCoordinatorLockingError = 0x00000000000203AAL;
    /**
     * attempt to fire a fault pointing to an object that does not exist (we can see the store, we can't see the object)
     */
    @Generated @NInt public static final long NSManagedObjectReferentialIntegrityError = 0x0000000000020788L;
    /**
     * an object being saved has a relationship containing an object from another store
     */
    @Generated @NInt public static final long NSManagedObjectExternalRelationshipError = 0x0000000000020792L;
    /**
     * merge policy failed - unable to complete merging
     */
    @Generated @NInt public static final long NSManagedObjectMergeError = 0x000000000002079CL;
    /**
     * merge policy failed - unable to complete merging due to multiple conflicting constraint violations
     */
    @Generated @NInt public static final long NSManagedObjectConstraintMergeError = 0x000000000002079DL;
    /**
     * unknown persistent store type/format/version
     */
    @Generated @NInt public static final long NSPersistentStoreInvalidTypeError = 0x0000000000020B70L;
    /**
     * returned by persistent store coordinator if a store is accessed that does not match the specified type
     */
    @Generated @NInt public static final long NSPersistentStoreTypeMismatchError = 0x0000000000020B7AL;
    /**
     * store returned an error for save operation (database level errors ie missing table, no permissions)
     */
    @Generated @NInt public static final long NSPersistentStoreIncompatibleSchemaError = 0x0000000000020B84L;
    /**
     * unclassified save error - something we depend on returned an error
     */
    @Generated @NInt public static final long NSPersistentStoreSaveError = 0x0000000000020B8EL;
    /**
     * one or more of the stores returned an error during save (stores/objects that failed will be in userInfo)
     */
    @Generated @NInt public static final long NSPersistentStoreIncompleteSaveError = 0x0000000000020B98L;
    /**
     * an unresolved merge conflict was encountered during a save. userInfo has NSPersistentStoreSaveConflictsErrorKey
     */
    @Generated @NInt public static final long NSPersistentStoreSaveConflictsError = 0x0000000000020BA2L;
    /**
     * general Core Data error
     */
    @Generated @NInt public static final long NSCoreDataError = 0x0000000000020BACL;
    /**
     * the persistent store operation failed
     */
    @Generated @NInt public static final long NSPersistentStoreOperationError = 0x0000000000020BB6L;
    /**
     * an error occurred while attempting to open the persistent store
     */
    @Generated @NInt public static final long NSPersistentStoreOpenError = 0x0000000000020BC0L;
    /**
     * failed to connect to the persistent store within the specified timeout (see NSPersistentStoreTimeoutOption)
     */
    @Generated @NInt public static final long NSPersistentStoreTimeoutError = 0x0000000000020BCAL;
    /**
     * an NSPersistentStore subclass was passed an NSPersistentStoreRequest that it did not understand
     */
    @Generated @NInt public static final long NSPersistentStoreUnsupportedRequestTypeError = 0x0000000000020BCBL;
    /**
     * entity version hashes incompatible with data model
     */
    @Generated @NInt public static final long NSPersistentStoreIncompatibleVersionHashError = 0x0000000000020BD4L;
    /**
     * general migration error
     */
    @Generated @NInt public static final long NSMigrationError = 0x0000000000020BDEL;
    /**
     * migration failed due to a violated uniqueness constraint
     */
    @Generated @NInt public static final long NSMigrationConstraintViolationError = 0x0000000000020BDFL;
    /**
     * migration failed due to manual cancellation
     */
    @Generated @NInt public static final long NSMigrationCancelledError = 0x0000000000020BE8L;
    /**
     * migration failed due to missing source data model
     */
    @Generated @NInt public static final long NSMigrationMissingSourceModelError = 0x0000000000020BF2L;
    /**
     * migration failed due to missing mapping model
     */
    @Generated @NInt public static final long NSMigrationMissingMappingModelError = 0x0000000000020BFCL;
    /**
     * migration failed due to a problem with the source data store
     */
    @Generated @NInt public static final long NSMigrationManagerSourceStoreError = 0x0000000000020C06L;
    /**
     * migration failed due to a problem with the destination data store
     */
    @Generated @NInt public static final long NSMigrationManagerDestinationStoreError = 0x0000000000020C10L;
    /**
     * migration failed during processing of the entity migration policy
     */
    @Generated @NInt public static final long NSEntityMigrationPolicyError = 0x0000000000020C1AL;
    /**
     * general SQLite error
     */
    @Generated @NInt public static final long NSSQLiteError = 0x0000000000020C24L;
    /**
     * inferred mapping model creation error
     */
    @Generated @NInt public static final long NSInferredMappingModelError = 0x0000000000020C2EL;
    /**
     * general error encountered while importing external records
     */
    @Generated @NInt public static final long NSExternalRecordImportError = 0x0000000000020C38L;

    @Generated
    private Enums() {
    }

    /**
     * some URI value cannot be represented as a string
     */
    @Generated @NInt public static final long NSValidationInvalidURIError = 0x000000000000069AL;
    /**
     * The history token passed to NSPersistentChangeRequest was invalid
     */
    @Generated @NInt public static final long NSPersistentHistoryTokenExpiredError = 0x0000000000020C9DL;
}
