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

package ios.coredata.c;


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

@Generated
@Library("CoreData")
@Runtime(CRuntime.class)
public final class CoreData {
	static {
		NatJ.register();
	}

	@Generated
	private CoreData() {
	}

	@Generated
	@CVariable()
	public static native double NSCoreDataVersionNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDetailedErrorsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValidationObjectErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValidationKeyErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValidationPredicateErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSValidationValueErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAffectedStoresErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAffectedObjectsErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreSaveConflictsErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSQLiteErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSManagedObjectContextWillSaveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSManagedObjectContextDidSaveNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSManagedObjectContextObjectsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInsertedObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUpdatedObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDeletedObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRefreshedObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidatedObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidatedAllObjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSErrorMergePolicy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSMergeByPropertyStoreTrumpMergePolicy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSMergeByPropertyObjectTrumpMergePolicy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSOverwriteMergePolicy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSRollbackMergePolicy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSQLiteStoreType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBinaryStoreType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInMemoryStoreType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStoreTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStoreUUIDKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreCoordinatorStoresWillChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreCoordinatorStoresDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreCoordinatorWillRemoveStoreNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAddedPersistentStoresKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRemovedPersistentStoresKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUUIDChangedPersistentStoresKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSReadOnlyPersistentStoreOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreTimeoutOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSQLitePragmasOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSQLiteAnalyzeOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSQLiteManualVacuumOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIgnorePersistentStoreVersioningOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigratePersistentStoresAutomaticallyOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInferMappingModelAutomaticallyOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStoreModelVersionHashesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStoreModelVersionIdentifiersKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreOSCompatibility();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreUbiquitousContentNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreUbiquitousContentURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreDidImportUbiquitousContentChangesNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreUbiquitousTransitionTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreUbiquitousPeerTokenOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreRemoveUbiquitousMetadataOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreUbiquitousContainerIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreRebuildFromUbiquitousContentOption();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreFileProtectionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigrationManagerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigrationSourceObjectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigrationDestinationObjectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigrationEntityMappingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigrationPropertyMappingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMigrationEntityPolicyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersistentStoreForceDestroyOption();

	@Generated
	@NUInt
	public static final long NSFetchRequestExpressionType = 0x0000000000000032L;
}
