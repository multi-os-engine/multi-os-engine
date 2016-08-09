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

package ios.accounts;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
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
@Library("Accounts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ACAccountStore extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ACAccountStore(Pointer peer) {
		super(peer);
	}

	/**
	 * accountTypeWithAccountTypeIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/accountTypeWithAccountTypeIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accountTypeWithAccountTypeIdentifier:")
	public native ACAccountType accountTypeWithAccountTypeIdentifier(
			String typeIdentifier);

	/**
	 * accountWithIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/accountWithIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accountWithIdentifier:")
	public native ACAccount accountWithIdentifier(String identifier);

	/**
	 * accounts</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instp/ACAccountStore/accounts">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accounts")
	public native NSArray<?> accounts();

	/**
	 * accountsWithAccountType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/accountsWithAccountType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("accountsWithAccountType:")
	public native NSArray<?> accountsWithAccountType(ACAccountType accountType);

	@Generated
	@Owned
	@Selector("alloc")
	public static native ACAccountStore alloc();

	@Generated
	@Selector("init")
	public native ACAccountStore init();

	/**
	 * removeAccount:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/removeAccount:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAccount:withCompletionHandler:")
	public native void removeAccountWithCompletionHandler(
			ACAccount account,
			@ObjCBlock(name = "call_removeAccountWithCompletionHandler") Block_removeAccountWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_removeAccountWithCompletionHandler {
		@Generated
		void call_removeAccountWithCompletionHandler(boolean arg0,
				NSError arg1);
	}

	/**
	 * renewCredentialsForAccount:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/renewCredentialsForAccount:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renewCredentialsForAccount:completion:")
	public native void renewCredentialsForAccountCompletion(
			ACAccount account,
			@ObjCBlock(name = "call_renewCredentialsForAccountCompletion") Block_renewCredentialsForAccountCompletion completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_renewCredentialsForAccountCompletion {
		@Generated
		void call_renewCredentialsForAccountCompletion(@NInt long arg0,
				NSError arg1);
	}

	/**
	 * requestAccessToAccountsWithType:options:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/requestAccessToAccountsWithType:options:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestAccessToAccountsWithType:options:completion:")
	public native void requestAccessToAccountsWithTypeOptionsCompletion(
			ACAccountType accountType,
			NSDictionary<?, ?> options,
			@ObjCBlock(name = "call_requestAccessToAccountsWithTypeOptionsCompletion") Block_requestAccessToAccountsWithTypeOptionsCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAccessToAccountsWithTypeOptionsCompletion {
		@Generated
		void call_requestAccessToAccountsWithTypeOptionsCompletion(
				boolean arg0, NSError arg1);
	}

	/**
	 * requestAccessToAccountsWithType:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/requestAccessToAccountsWithType:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("requestAccessToAccountsWithType:withCompletionHandler:")
	public native void requestAccessToAccountsWithTypeWithCompletionHandler(
			ACAccountType accountType,
			@ObjCBlock(name = "call_requestAccessToAccountsWithTypeWithCompletionHandler") Block_requestAccessToAccountsWithTypeWithCompletionHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestAccessToAccountsWithTypeWithCompletionHandler {
		@Generated
		void call_requestAccessToAccountsWithTypeWithCompletionHandler(
				boolean arg0, NSError arg1);
	}

	/**
	 * saveAccount:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Accounts/Reference/ACAccountStoreClassRef/index.html#//apple_ref/occ/instm/ACAccountStore/saveAccount:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("saveAccount:withCompletionHandler:")
	public native void saveAccountWithCompletionHandler(
			ACAccount account,
			@ObjCBlock(name = "call_saveAccountWithCompletionHandler") Block_saveAccountWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_saveAccountWithCompletionHandler {
		@Generated
		void call_saveAccountWithCompletionHandler(boolean arg0,
				NSError arg1);
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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
