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

package ios.contacts;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.foundation.NSPredicate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContactStore extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected CNContactStore(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CNContactStore alloc();

	/**
	 * authorizationStatusForEntityType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/clm/CNContactStore/authorizationStatusForEntityType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorizationStatusForEntityType:")
	@NInt
	public static native long authorizationStatusForEntityType(@NInt long entityType);

	/**
	 * containersMatchingPredicate:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/containersMatchingPredicate:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containersMatchingPredicate:error:")
	public native NSArray<? extends CNContainer> containersMatchingPredicateError(NSPredicate predicate, Ptr<NSError> error);

	/**
	 * defaultContainerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/defaultContainerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultContainerIdentifier")
	public native String defaultContainerIdentifier();

	/**
	 * enumerateContactsWithFetchRequest:error:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/enumerateContactsWithFetchRequest:error:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateContactsWithFetchRequest:error:usingBlock:")
	public native boolean enumerateContactsWithFetchRequestErrorUsingBlock(CNContactFetchRequest fetchRequest,
			Ptr<NSError> error,
			@ObjCBlock(name = "call_enumerateContactsWithFetchRequestErrorUsingBlock") Block_enumerateContactsWithFetchRequestErrorUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateContactsWithFetchRequestErrorUsingBlock {
		@Generated
		void call_enumerateContactsWithFetchRequestErrorUsingBlock(CNContact arg0, BoolPtr arg1);
	}

	/**
	 * executeSaveRequest:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/executeSaveRequest:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("executeSaveRequest:error:")
	public native boolean executeSaveRequestError(CNSaveRequest saveRequest, Ptr<NSError> error);

	/**
	 * groupsMatchingPredicate:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/groupsMatchingPredicate:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("groupsMatchingPredicate:error:")
	public native NSArray<? extends CNGroup> groupsMatchingPredicateError(NSPredicate predicate, Ptr<NSError> error);

	@Generated
	@Selector("init")
	public native CNContactStore init();

	/**
	 * requestAccessForEntityType:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/requestAccessForEntityType:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestAccessForEntityType:completionHandler:")
	public native void requestAccessForEntityTypeCompletionHandler(@NInt long entityType,
			@ObjCBlock(name = "call_requestAccessForEntityTypeCompletionHandler") Block_requestAccessForEntityTypeCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAccessForEntityTypeCompletionHandler {
		@Generated
		void call_requestAccessForEntityTypeCompletionHandler(boolean arg0, NSError arg1);
	}

	/**
	 * unifiedContactWithIdentifier:keysToFetch:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/unifiedContactWithIdentifier:keysToFetch:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unifiedContactWithIdentifier:keysToFetch:error:")
	public native CNContact unifiedContactWithIdentifierKeysToFetchError(String identifier, NSArray<?> keys,
			Ptr<NSError> error);

	/**
	 * unifiedContactsMatchingPredicate:keysToFetch:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Contacts/Reference/CNContactStore_Class/index.html#//apple_ref/occ/instm/CNContactStore/unifiedContactsMatchingPredicate:keysToFetch:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unifiedContactsMatchingPredicate:keysToFetch:error:")
	public native NSArray<? extends CNContact> unifiedContactsMatchingPredicateKeysToFetchError(NSPredicate predicate, NSArray<?> keys,
			Ptr<NSError> error);

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
