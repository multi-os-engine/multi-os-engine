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
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSSet;
import ios.foundation.NSURL;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSFastEnumeration;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSManagedObjectModel extends NSObject implements NSCoding,
		NSCopying, NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSManagedObjectModel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSManagedObjectModel alloc();

	/**
	 * configurations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/configurations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("configurations")
	public native NSArray<String> configurations();

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
	 * entities</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/entities">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entities")
	public native NSArray<? extends NSEntityDescription> entities();

	/**
	 * entitiesByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/entitiesByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entitiesByName")
	public native NSDictionary<String, ? extends NSEntityDescription> entitiesByName();

	/**
	 * entitiesForConfiguration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/entitiesForConfiguration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entitiesForConfiguration:")
	public native NSArray<? extends NSEntityDescription> entitiesForConfiguration(String configuration);

	/**
	 * entityVersionHashesByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/entityVersionHashesByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entityVersionHashesByName")
	public native NSDictionary<String, ? extends NSData> entityVersionHashesByName();

	/**
	 * fetchRequestFromTemplateWithName:substitutionVariables:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/fetchRequestFromTemplateWithName:substitutionVariables:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchRequestFromTemplateWithName:substitutionVariables:")
	public native NSFetchRequest fetchRequestFromTemplateWithNameSubstitutionVariables(
			String name, NSDictionary<String, ?> variables);

	/**
	 * fetchRequestTemplateForName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/fetchRequestTemplateForName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchRequestTemplateForName:")
	public native NSFetchRequest fetchRequestTemplateForName(String name);

	/**
	 * fetchRequestTemplatesByName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/fetchRequestTemplatesByName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchRequestTemplatesByName")
	public native NSDictionary<String, ? extends NSFetchRequest> fetchRequestTemplatesByName();

	@Generated
	@Selector("init")
	public native NSManagedObjectModel init();

	@Generated
	@Selector("initWithCoder:")
	public native NSManagedObjectModel initWithCoder(NSCoder aDecoder);

	/**
	 * initWithContentsOfURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/initWithContentsOfURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSManagedObjectModel initWithContentsOfURL(NSURL url);

	/**
	 * isConfiguration:compatibleWithStoreMetadata:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/isConfiguration:compatibleWithStoreMetadata:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isConfiguration:compatibleWithStoreMetadata:")
	public native boolean isConfigurationCompatibleWithStoreMetadata(
			String configuration, NSDictionary<String, ?> metadata);

	/**
	 * localizationDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/localizationDictionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizationDictionary")
	public native NSDictionary<String, String> localizationDictionary();

	/**
	 * mergedModelFromBundles:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/clm/NSManagedObjectModel/mergedModelFromBundles:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mergedModelFromBundles:")
	public static native NSManagedObjectModel mergedModelFromBundles(
			NSArray<? extends NSBundle> bundles);

	/**
	 * mergedModelFromBundles:forStoreMetadata:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/clm/NSManagedObjectModel/mergedModelFromBundles:forStoreMetadata:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mergedModelFromBundles:forStoreMetadata:")
	public static native NSManagedObjectModel mergedModelFromBundlesForStoreMetadata(
			NSArray<? extends NSBundle> bundles, NSDictionary<String, ?> metadata);

	/**
	 * modelByMergingModels:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/clm/NSManagedObjectModel/modelByMergingModels:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modelByMergingModels:")
	public static native NSManagedObjectModel modelByMergingModels(
			NSArray<? extends NSManagedObjectModel> models);

	/**
	 * modelByMergingModels:forStoreMetadata:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/clm/NSManagedObjectModel/modelByMergingModels:forStoreMetadata:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modelByMergingModels:forStoreMetadata:")
	public static native NSManagedObjectModel modelByMergingModelsForStoreMetadata(
			NSArray<? extends NSManagedObjectModel> models, NSDictionary<String, ?> metadata);

	/**
	 * entities</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/entities">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEntities:")
	public native void setEntities(NSArray<? extends NSEntityDescription> value);

	/**
	 * setEntities:forConfiguration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/setEntities:forConfiguration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEntities:forConfiguration:")
	public native void setEntitiesForConfiguration(NSArray<? extends NSEntityDescription> entities,
			String configuration);

	/**
	 * setFetchRequestTemplate:forName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instm/NSManagedObjectModel/setFetchRequestTemplate:forName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFetchRequestTemplate:forName:")
	public native void setFetchRequestTemplateForName(
			NSFetchRequest fetchRequestTemplate, String name);

	/**
	 * localizationDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/localizationDictionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLocalizationDictionary:")
	public native void setLocalizationDictionary(NSDictionary<String, String> value);

	/**
	 * versionIdentifiers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/versionIdentifiers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVersionIdentifiers:")
	public native void setVersionIdentifiers(NSSet<?> value);

	/**
	 * versionIdentifiers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSManagedObjectModel_Class/index.html#//apple_ref/occ/instp/NSManagedObjectModel/versionIdentifiers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("versionIdentifiers")
	public native NSSet<?> versionIdentifiers();

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
	public static native long version();
}
