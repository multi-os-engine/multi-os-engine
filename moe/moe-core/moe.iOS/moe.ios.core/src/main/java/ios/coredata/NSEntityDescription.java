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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSEntityDescription extends NSObject implements NSCoding,
		NSCopying, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSEntityDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSEntityDescription alloc();

	/**
	 * attributesByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/attributesByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attributesByName")
	public native NSDictionary<String, ? extends NSAttributeDescription> attributesByName();

	/**
	 * compoundIndexes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/compoundIndexes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("compoundIndexes")
	public native NSArray<? extends NSArray<?>> compoundIndexes();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("countByEnumeratingWithState:objects:count:")
	@NUInt
	public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
			Ptr<ObjCObject> buffer, @NUInt long len);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * entityForName:inManagedObjectContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/clm/NSEntityDescription/entityForName:inManagedObjectContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entityForName:inManagedObjectContext:")
	public static native NSEntityDescription entityForNameInManagedObjectContext(
			String entityName, NSManagedObjectContext context);

	@Generated
	@Selector("init")
	public native NSEntityDescription init();

	@Generated
	@Selector("initWithCoder:")
	public native NSEntityDescription initWithCoder(NSCoder aDecoder);

	/**
	 * insertNewObjectForEntityForName:inManagedObjectContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/clm/NSEntityDescription/insertNewObjectForEntityForName:inManagedObjectContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertNewObjectForEntityForName:inManagedObjectContext:")
	public static native NSManagedObject insertNewObjectForEntityForNameInManagedObjectContext(
			String entityName, NSManagedObjectContext context);

	/**
	 * abstract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/abstract">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAbstract")
	public native boolean isAbstract();

	/**
	 * isKindOfEntity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instm/NSEntityDescription/isKindOfEntity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isKindOfEntity:")
	public native boolean isKindOfEntity(NSEntityDescription entity);

	/**
	 * managedObjectClassName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/managedObjectClassName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("managedObjectClassName")
	public native String managedObjectClassName();

	/**
	 * managedObjectModel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/managedObjectModel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("managedObjectModel")
	public native NSManagedObjectModel managedObjectModel();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * properties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/properties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("properties")
	public native NSArray<? extends NSPropertyDescription> properties();

	/**
	 * propertiesByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/propertiesByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("propertiesByName")
	public native NSDictionary<String, ? extends NSPropertyDescription> propertiesByName();

	/**
	 * relationshipsByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/relationshipsByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("relationshipsByName")
	public native NSDictionary<String, ? extends NSRelationshipDescription> relationshipsByName();

	/**
	 * relationshipsWithDestinationEntity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instm/NSEntityDescription/relationshipsWithDestinationEntity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("relationshipsWithDestinationEntity:")
	public native NSArray<? extends NSRelationshipDescription> relationshipsWithDestinationEntity(
			NSEntityDescription entity);

	/**
	 * renamingIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/renamingIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renamingIdentifier")
	public native String renamingIdentifier();

	/**
	 * abstract</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/abstract">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAbstract:")
	public native void setAbstract(boolean value);

	/**
	 * compoundIndexes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/compoundIndexes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCompoundIndexes:")
	public native void setCompoundIndexes(NSArray<? extends NSArray<?>> value);

	/**
	 * managedObjectClassName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/managedObjectClassName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setManagedObjectClassName:")
	public native void setManagedObjectClassName(String value);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * properties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/properties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProperties:")
	public native void setProperties(NSArray<? extends NSPropertyDescription> value);

	/**
	 * renamingIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/renamingIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRenamingIdentifier:")
	public native void setRenamingIdentifier(String value);

	/**
	 * subentities</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/subentities">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSubentities:")
	public native void setSubentities(NSArray<? extends NSEntityDescription> value);

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUserInfo:")
	public native void setUserInfo(NSDictionary<?, ?> value);

	/**
	 * versionHashModifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/versionHashModifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVersionHashModifier:")
	public native void setVersionHashModifier(String value);

	/**
	 * subentities</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/subentities">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subentities")
	public native NSArray<? extends NSEntityDescription> subentities();

	/**
	 * subentitiesByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/subentitiesByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subentitiesByName")
	public native NSDictionary<String, ? extends NSEntityDescription> subentitiesByName();

	/**
	 * superentity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/superentity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("superentity")
	public native NSEntityDescription superentity();

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userInfo")
	public native NSDictionary<?, ?> userInfo();

	/**
	 * versionHash</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/versionHash">iOS Dev Center</a>
	 */
	@Generated
	@Selector("versionHash")
	public native NSData versionHash();

	/**
	 * versionHashModifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSEntityDescription_Class/index.html#//apple_ref/occ/instp/NSEntityDescription/versionHashModifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("versionHashModifier")
	public native String versionHashModifier();

	@Generated
	@Selector("setUniquenessConstraints:")
	public native void setUniquenessConstraints(NSArray<? extends NSArray<?>> value);

	@Generated
	@Selector("uniquenessConstraints")
	public native NSArray<? extends NSArray<?>> uniquenessConstraints();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
