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

package ios.cloudkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchRecordZonesOperation extends CKDatabaseOperation {
	static {
		NatJ.register();
	}

	@Generated
	protected CKFetchRecordZonesOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CKFetchRecordZonesOperation alloc();

	/**
	 * fetchAllRecordZonesOperation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordZonesOperation_class/index.html#//apple_ref/occ/clm/CKFetchRecordZonesOperation/fetchAllRecordZonesOperation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAllRecordZonesOperation")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object fetchAllRecordZonesOperation();

	@Generated
	@Selector("init")
	public native CKFetchRecordZonesOperation init();

	/**
	 * initWithRecordZoneIDs:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordZonesOperation_class/index.html#//apple_ref/occ/instm/CKFetchRecordZonesOperation/initWithRecordZoneIDs:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithRecordZoneIDs:")
	public native CKFetchRecordZonesOperation initWithRecordZoneIDs(
			NSArray<? extends CKRecordZoneID> zoneIDs);

	/**
	 * recordZoneIDs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordZonesOperation/recordZoneIDs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("recordZoneIDs")
	public native NSArray<? extends CKRecordZoneID> recordZoneIDs();

	/**
	 * fetchRecordZonesCompletionBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordZonesOperation/fetchRecordZonesCompletionBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFetchRecordZonesCompletionBlock:")
	public native void setFetchRecordZonesCompletionBlock(
			@ObjCBlock(name = "call_setFetchRecordZonesCompletionBlock") Block_setFetchRecordZonesCompletionBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setFetchRecordZonesCompletionBlock {
		@Generated
		void call_setFetchRecordZonesCompletionBlock(NSDictionary<? extends CKRecordZoneID, ? extends CKRecordZone> arg0,
				NSError arg1);
	}

	/**
	 * recordZoneIDs</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordZonesOperation/recordZoneIDs">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRecordZoneIDs:")
	public native void setRecordZoneIDs(NSArray<? extends CKRecordZoneID> value);

	/**
	 * fetchRecordZonesCompletionBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordZonesOperation/fetchRecordZonesCompletionBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchRecordZonesCompletionBlock")
	@ObjCBlock(name = "call_fetchRecordZonesCompletionBlock_ret")
	public native Block_fetchRecordZonesCompletionBlock_ret fetchRecordZonesCompletionBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchRecordZonesCompletionBlock_ret {
		@Generated
		void call_fetchRecordZonesCompletionBlock_ret(NSDictionary<? extends CKRecordZoneID, ? extends CKRecordZone> arg0, NSError arg1);
	}

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
