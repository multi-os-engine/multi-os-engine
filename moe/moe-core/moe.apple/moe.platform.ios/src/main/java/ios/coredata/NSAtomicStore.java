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
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSSet;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAtomicStore extends NSPersistentStore {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAtomicStore(Pointer peer) {
		super(peer);
	}

	/**
	 * addCacheNodes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/addCacheNodes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addCacheNodes:")
	public native void addCacheNodes(NSSet<? extends NSAtomicStoreCacheNode> cacheNodes);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAtomicStore alloc();

	/**
	 * cacheNodeForObjectID:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/cacheNodeForObjectID:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cacheNodeForObjectID:")
	public native NSAtomicStoreCacheNode cacheNodeForObjectID(
			NSManagedObjectID objectID);

	/**
	 * cacheNodes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/cacheNodes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cacheNodes")
	public native NSSet<? extends NSAtomicStoreCacheNode> cacheNodes();

	@Generated
	@Selector("init")
	public native NSAtomicStore init();

	/**
	 * initWithPersistentStoreCoordinator:configurationName:URL:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/initWithPersistentStoreCoordinator:configurationName:URL:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPersistentStoreCoordinator:configurationName:URL:options:")
	public native NSAtomicStore initWithPersistentStoreCoordinatorConfigurationNameURLOptions(
			NSPersistentStoreCoordinator coordinator, String configurationName,
			NSURL url, NSDictionary<?, ?> options);

	/**
	 * load:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/load:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("load:")
	public native boolean load_objc(Ptr<NSError> error);

	/**
	 * newCacheNodeForManagedObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/newCacheNodeForManagedObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newCacheNodeForManagedObject:")
	public native NSAtomicStoreCacheNode newCacheNodeForManagedObject(
			NSManagedObject managedObject);

	/**
	 * newReferenceObjectForManagedObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/newReferenceObjectForManagedObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newReferenceObjectForManagedObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object newReferenceObjectForManagedObject(
			NSManagedObject managedObject);

	/**
	 * objectIDForEntity:referenceObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/objectIDForEntity:referenceObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectIDForEntity:referenceObject:")
	public native NSManagedObjectID objectIDForEntityReferenceObject(
			NSEntityDescription entity,
			@Mapped(ObjCObjectMapper.class) Object data);

	/**
	 * referenceObjectForObjectID:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/referenceObjectForObjectID:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("referenceObjectForObjectID:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object referenceObjectForObjectID(NSManagedObjectID objectID);

	/**
	 * save:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/save:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("save:")
	public native boolean save(Ptr<NSError> error);

	/**
	 * updateCacheNode:fromManagedObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/updateCacheNode:fromManagedObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateCacheNode:fromManagedObject:")
	public native void updateCacheNodeFromManagedObject(
			NSAtomicStoreCacheNode node, NSManagedObject managedObject);

	/**
	 * willRemoveCacheNodes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSAtomicStore_class/index.html#//apple_ref/occ/instm/NSAtomicStore/willRemoveCacheNodes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willRemoveCacheNodes:")
	public native void willRemoveCacheNodes(NSSet<? extends NSAtomicStoreCacheNode> cacheNodes);

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
	@Selector("metadataForPersistentStoreWithURL:error:")
	public static native NSDictionary<String, ?> metadataForPersistentStoreWithURLError(
			NSURL url, Ptr<NSError> error);

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
	public static native boolean setMetadataForPersistentStoreWithURLError(
			NSDictionary<String, ?> metadata, NSURL url, Ptr<NSError> error);

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
