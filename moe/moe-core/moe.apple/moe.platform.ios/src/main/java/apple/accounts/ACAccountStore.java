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

package apple.accounts;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The ACAccountStore class provides an interface for accessing and manipulating
 * accounts. You must create an ACAccountStore object to retrieve, add and delete
 * accounts from the Accounts database.
 * <p>
 * IMPORTANT NOTE: You MUST keep the account store around for as long as you have
 * any objects fetched from that store if you expect other 'sub-fetches' to work,
 * most notably being fetching credentials. If you really just want to open the
 * store to grab credentials, just be sure to grab the credential object and then
 * you can release the owning account and store, e.g.
 * <p>
 * WARNING: All synchronous methods on ACAccountStore invoke xpc methods
 * on accountsd. They are not appropriate to call on a UI Application's main thread.
 */
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ACAccountStore alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    /**
     * Returns the account type object matching the account type identifier. See
     * ACAccountType.h for well known account type identifiers
     * WARNING: Synchronous, not appropriate to call on a UI Application's main thread
     */
    @Generated
    @Selector("accountTypeWithAccountTypeIdentifier:")
    public native ACAccountType accountTypeWithAccountTypeIdentifier(String typeIdentifier);

    /**
     * Returns the account matching the given account identifier
     * WARNING: Synchronous, not appropriate to call on a UI Application's main thread
     */
    @Generated
    @Selector("accountWithIdentifier:")
    public native ACAccount accountWithIdentifier(String identifier);

    /**
     * An array of all the accounts in an account database
     * WARNING: Synchronous, not appropriate to call on a UI Application's main thread
     */
    @Generated
    @Selector("accounts")
    public native NSArray<?> accounts();

    /**
     * Returns the accounts matching a given account type.
     * WARNING: Synchronous, not appropriate to call on a UI Application's main thread
     */
    @Generated
    @Selector("accountsWithAccountType:")
    public native NSArray<?> accountsWithAccountType(ACAccountType accountType);

    @Generated
    @Selector("init")
    public native ACAccountStore init();

    /**
     * Removes an account from the account store. The completion handler for this method is called on an arbitrary queue.
     * This call will fail if you don't have sufficient rights to remove the account in question.
     */
    @Generated
    @Selector("removeAccount:withCompletionHandler:")
    public native void removeAccountWithCompletionHandler(ACAccount account,
            @ObjCBlock(name = "call_removeAccountWithCompletionHandler") Block_removeAccountWithCompletionHandler completionHandler);

    /**
     * Call this if you discover that an ACAccount's credential is no longer valid.
     * For Twitter and Sina Weibo accounts, this method will prompt the user to go to Settings to re-enter their password.
     * For Facebook accounts, if your access token became invalid due to regular expiration, this method will obtain a new one.
     * However, if the user has deauthorized your app, this renewal request will return ACAccountCredentialRenewResultRejected.
     */
    @Generated
    @Selector("renewCredentialsForAccount:completion:")
    public native void renewCredentialsForAccountCompletion(ACAccount account,
            @ObjCBlock(name = "call_renewCredentialsForAccountCompletion") Block_renewCredentialsForAccountCompletion completionHandler);

    /**
     * Obtains permission, if necessary, from the user to access protected properties, and utilize accounts
     * of a particular type in protected operations, for example OAuth signing. The completion handler for
     * this method is called on an arbitrary queue.
     * Certain account types (such as Facebook) require an options dictionary. A list of the required keys
     * appears in ACAccountType.h. This method will throw an NSInvalidArgumentException if the options
     * dictionary is not provided for such account types. Conversely, if the account type does not require
     * an options dictionary, the options parameter must be nil.
     */
    @Generated
    @Selector("requestAccessToAccountsWithType:options:completion:")
    public native void requestAccessToAccountsWithTypeOptionsCompletion(ACAccountType accountType,
            NSDictionary<?, ?> options,
            @ObjCBlock(name = "call_requestAccessToAccountsWithTypeOptionsCompletion") Block_requestAccessToAccountsWithTypeOptionsCompletion completion);

    /**
     * DEPRECATED: Please use requestAccessToAccountsWithType:options:completion: instead.
     */
    @Generated
    @Deprecated
    @Selector("requestAccessToAccountsWithType:withCompletionHandler:")
    public native void requestAccessToAccountsWithTypeWithCompletionHandler(ACAccountType accountType,
            @ObjCBlock(name = "call_requestAccessToAccountsWithTypeWithCompletionHandler") Block_requestAccessToAccountsWithTypeWithCompletionHandler handler);

    /**
     * Saves the account to the account database. If the account is unauthenticated and the associated account
     * type supports authentication, the system will attempt to authenticate with the credentials provided.
     * Assuming a successful authentication, the account will be saved to the account store. The completion handler
     * for this method is called on an arbitrary queue.
     */
    @Generated
    @Selector("saveAccount:withCompletionHandler:")
    public native void saveAccountWithCompletionHandler(ACAccount account,
            @ObjCBlock(name = "call_saveAccountWithCompletionHandler") Block_saveAccountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAccountWithCompletionHandler {
        @Generated
        void call_removeAccountWithCompletionHandler(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renewCredentialsForAccountCompletion {
        @Generated
        void call_renewCredentialsForAccountCompletion(@NInt long renewResult, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessToAccountsWithTypeOptionsCompletion {
        @Generated
        void call_requestAccessToAccountsWithTypeOptionsCompletion(boolean granted, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAccessToAccountsWithTypeWithCompletionHandler {
        @Generated
        void call_requestAccessToAccountsWithTypeWithCompletionHandler(boolean granted, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveAccountWithCompletionHandler {
        @Generated
        void call_saveAccountWithCompletionHandler(boolean success, NSError error);
    }
}
