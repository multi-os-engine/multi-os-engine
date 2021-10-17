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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The ACAccount class represents an account stored on the system.
 * Accounts are created not bound to any store. Once an account is saved it belongs
 * to the store it was saved into.
 */
@Generated
@Library("Accounts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ACAccount extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ACAccount(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ACAccount alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native ACAccount allocWithZone(VoidPtr zone);

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
    public static native ACAccount new_objc();

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
     * A human readable description of the account.
     * This property is only available to applications that have been granted access to the account by the user.
     */
    @Generated
    @Selector("accountDescription")
    public native String accountDescription();

    /**
     * Accounts are stored with a particular account type. All available accounts of a particular type
     * can be looked up using [ACAccountStore accountsWithAccountType:]. When creating new accounts
     * this property is required.
     */
    @Generated
    @Selector("accountType")
    public native ACAccountType accountType();

    /**
     * The credential for the account. This property can be set and saved during account creation. It is
     * inaccessible once the account has been saved.
     * WARNING: Backed by a synchronous xpc call to accountsd, not appropriate to call on a UI Application's main thread
     */
    @Generated
    @Selector("credential")
    public native ACAccountCredential credential();

    /**
     * This identifier can be used to look up the account using [ACAccountStore accountWithIdentifier:].
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native ACAccount init();

    /**
     * Creates a new account object with a specified account type.
     */
    @Generated
    @Selector("initWithAccountType:")
    public native ACAccount initWithAccountType(ACAccountType type);

    /**
     * A human readable description of the account.
     * This property is only available to applications that have been granted access to the account by the user.
     */
    @Generated
    @Selector("setAccountDescription:")
    public native void setAccountDescription(String value);

    /**
     * Accounts are stored with a particular account type. All available accounts of a particular type
     * can be looked up using [ACAccountStore accountsWithAccountType:]. When creating new accounts
     * this property is required.
     */
    @Generated
    @Selector("setAccountType:")
    public native void setAccountType(ACAccountType value);

    /**
     * The credential for the account. This property can be set and saved during account creation. It is
     * inaccessible once the account has been saved.
     * WARNING: Backed by a synchronous xpc call to accountsd, not appropriate to call on a UI Application's main thread
     */
    @Generated
    @Selector("setCredential:")
    public native void setCredential(ACAccountCredential value);

    /**
     * The username for the account. This property can be set and saved during account creation. The username is
     * only available to applications that have been granted access to the account by the user.
     */
    @Generated
    @Selector("setUsername:")
    public native void setUsername(String value);

    /**
     * For accounts that support it (currently only Facebook accounts), you can get the user's full name for display
     * purposes without having to talk to the network.
     */
    @Generated
    @Selector("userFullName")
    public native String userFullName();

    /**
     * The username for the account. This property can be set and saved during account creation. The username is
     * only available to applications that have been granted access to the account by the user.
     */
    @Generated
    @Selector("username")
    public native String username();
}
