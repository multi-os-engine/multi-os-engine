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

package ios.coredata;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSManagedObject extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSManagedObject(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSManagedObject alloc();

	/**
	 * awakeFromFetch</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/awakeFromFetch">iOS Dev Center</a>
	 */
	@Generated
	@Selector("awakeFromFetch")
	public native void awakeFromFetch();

	/**
	 * awakeFromInsert</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/awakeFromInsert">iOS Dev Center</a>
	 */
	@Generated
	@Selector("awakeFromInsert")
	public native void awakeFromInsert();

	/**
	 * awakeFromSnapshotEvents:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/awakeFromSnapshotEvents:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("awakeFromSnapshotEvents:")
	public native void awakeFromSnapshotEvents(@NUInt long flags);

	/**
	 * changedValues</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/changedValues">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changedValues")
	public native NSDictionary<String, ?> changedValues();

	/**
	 * changedValuesForCurrentEvent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/changedValuesForCurrentEvent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changedValuesForCurrentEvent")
	public native NSDictionary<String, ?> changedValuesForCurrentEvent();

	/**
	 * committedValuesForKeys:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/committedValuesForKeys:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("committedValuesForKeys:")
	public native NSDictionary<String, ?> committedValuesForKeys(NSArray<String> keys);

	/**
	 * contextShouldIgnoreUnmodeledPropertyChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/clm/NSManagedObject/contextShouldIgnoreUnmodeledPropertyChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contextShouldIgnoreUnmodeledPropertyChanges")
	public static native boolean contextShouldIgnoreUnmodeledPropertyChanges();

	/**
	 * didAccessValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/didAccessValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didAccessValueForKey:")
	public native void didAccessValueForKey(String key);

	/**
	 * didChangeValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/didChangeValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didChangeValueForKey:")
	public native void didChangeValueForKey(String key);

	/**
	 * didChangeValueForKey:withSetMutation:usingObjects:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/didChangeValueForKey:withSetMutation:usingObjects:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didChangeValueForKey:withSetMutation:usingObjects:")
	public native void didChangeValueForKeyWithSetMutationUsingObjects(
			String inKey, @NUInt long inMutationKind, NSSet<?> inObjects);

	/**
	 * didSave</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/didSave">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didSave")
	public native void didSave();

	/**
	 * didTurnIntoFault</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/didTurnIntoFault">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didTurnIntoFault")
	public native void didTurnIntoFault();

	/**
	 * entity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/entity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entity")
	public native NSEntityDescription entity();

	/**
	 * faultingState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/faultingState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("faultingState")
	@NUInt
	public native long faultingState();

	/**
	 * hasChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/hasChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasChanges")
	public native boolean hasChanges();

	/**
	 * hasFaultForRelationshipNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/hasFaultForRelationshipNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasFaultForRelationshipNamed:")
	public native boolean hasFaultForRelationshipNamed(String key);

	@Generated
	@Selector("init")
	public native NSManagedObject init();

	/**
	 * initWithEntity:insertIntoManagedObjectContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/initWithEntity:insertIntoManagedObjectContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithEntity:insertIntoManagedObjectContext:")
	public native NSManagedObject initWithEntityInsertIntoManagedObjectContext(
			NSEntityDescription entity, NSManagedObjectContext context);

	/**
	 * deleted</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/deleted">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDeleted")
	public native boolean isDeleted();

	/**
	 * fault</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/fault">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isFault")
	public native boolean isFault();

	/**
	 * inserted</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/inserted">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isInserted")
	public native boolean isInserted();

	/**
	 * updated</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/updated">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isUpdated")
	public native boolean isUpdated();

	/**
	 * managedObjectContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/managedObjectContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("managedObjectContext")
	public native NSManagedObjectContext managedObjectContext();

	/**
	 * objectID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instp/NSManagedObject/objectID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectID")
	public native NSManagedObjectID objectID();

	/**
	 * prepareForDeletion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/prepareForDeletion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareForDeletion")
	public native void prepareForDeletion();

	/**
	 * primitiveValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/primitiveValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("primitiveValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object primitiveValueForKey(String key);

	/**
	 * setPrimitiveValue:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/setPrimitiveValue:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPrimitiveValue:forKey:")
	public native void setPrimitiveValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	/**
	 * setValue:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/setValue:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:forKey:")
	public native void setValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	/**
	 * validateForDelete:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/validateForDelete:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("validateForDelete:")
	public native boolean validateForDelete(Ptr<NSError> error);

	/**
	 * validateForInsert:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/validateForInsert:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("validateForInsert:")
	public native boolean validateForInsert(Ptr<NSError> error);

	/**
	 * validateForUpdate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/validateForUpdate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("validateForUpdate:")
	public native boolean validateForUpdate(Ptr<NSError> error);

	/**
	 * validateValue:forKey:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/validateValue:forKey:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("validateValue:forKey:error:")
	public native boolean validateValueForKeyError(Ptr<ObjCObject> value,
			String key, Ptr<NSError> error);

	/**
	 * valueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/valueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForKey(String key);

	/**
	 * willAccessValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/willAccessValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willAccessValueForKey:")
	public native void willAccessValueForKey(String key);

	/**
	 * willChangeValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/willChangeValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willChangeValueForKey:")
	public native void willChangeValueForKey(String key);

	/**
	 * willChangeValueForKey:withSetMutation:usingObjects:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/willChangeValueForKey:withSetMutation:usingObjects:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willChangeValueForKey:withSetMutation:usingObjects:")
	public native void willChangeValueForKeyWithSetMutationUsingObjects(
			String inKey, @NUInt long inMutationKind, NSSet<?> inObjects);

	/**
	 * willSave</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/willSave">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willSave")
	public native void willSave();

	/**
	 * willTurnIntoFault</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/instm/NSManagedObject/willTurnIntoFault">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willTurnIntoFault")
	public native void willTurnIntoFault();

	@Generated
	@Selector("hasPersistentChangedValues")
	public native boolean hasPersistentChangedValues();

	@Generated
	@Selector("objectIDsForRelationshipNamed:")
	public native NSArray<? extends NSManagedObjectID> objectIDsForRelationshipNamed(String key);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	/**
	 * automaticallyNotifiesObserversForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObject_Class/index.html#//apple_ref/occ/clm/NSManagedObject/automaticallyNotifiesObserversForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
	@Selector("setVersion:")
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
