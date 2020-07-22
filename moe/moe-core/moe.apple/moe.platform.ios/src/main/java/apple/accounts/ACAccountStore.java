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

    @Generated
    @Selector("accountTypeWithAccountTypeIdentifier:")
    public native ACAccountType accountTypeWithAccountTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("accountWithIdentifier:")
    public native ACAccount accountWithIdentifier(String identifier);

    @Generated
    @Selector("accounts")
    public native NSArray<?> accounts();

    @Generated
    @Selector("accountsWithAccountType:")
    public native NSArray<?> accountsWithAccountType(ACAccountType accountType);

    @Generated
    @Selector("init")
    public native ACAccountStore init();

    @Generated
    @Selector("removeAccount:withCompletionHandler:")
    public native void removeAccountWithCompletionHandler(ACAccount account,
            @ObjCBlock(name = "call_removeAccountWithCompletionHandler") Block_removeAccountWithCompletionHandler completionHandler);

    @Generated
    @Selector("renewCredentialsForAccount:completion:")
    public native void renewCredentialsForAccountCompletion(ACAccount account,
            @ObjCBlock(name = "call_renewCredentialsForAccountCompletion") Block_renewCredentialsForAccountCompletion completionHandler);

    @Generated
    @Selector("requestAccessToAccountsWithType:options:completion:")
    public native void requestAccessToAccountsWithTypeOptionsCompletion(ACAccountType accountType,
            NSDictionary<?, ?> options,
            @ObjCBlock(name = "call_requestAccessToAccountsWithTypeOptionsCompletion") Block_requestAccessToAccountsWithTypeOptionsCompletion completion);

    @Generated
    @Deprecated
    @Selector("requestAccessToAccountsWithType:withCompletionHandler:")
    public native void requestAccessToAccountsWithTypeWithCompletionHandler(ACAccountType accountType,
            @ObjCBlock(name = "call_requestAccessToAccountsWithTypeWithCompletionHandler") Block_requestAccessToAccountsWithTypeWithCompletionHandler handler);

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
