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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKModifySubscriptionsOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKModifySubscriptionsOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKModifySubscriptionsOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKModifySubscriptionsOperation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CKModifySubscriptionsOperation new_objc();

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
    @Selector("init")
    public native CKModifySubscriptionsOperation init();

    @Generated
    @Selector("initWithSubscriptionsToSave:subscriptionIDsToDelete:")
    public native CKModifySubscriptionsOperation initWithSubscriptionsToSaveSubscriptionIDsToDelete(
            @Nullable NSArray<? extends CKSubscription> subscriptionsToSave,
            @Nullable NSArray<String> subscriptionIDsToDelete);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of
     * subscriptionIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] savedSubscriptions, @c deletedSubscriptionIDs and any @c CKPartialErrorsByItemIDKey errors are repeats of
     * the data sent back in previous @c perSubscriptionSaveBlock and @c perSubscriptionDeleteBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Nullable
    @Generated
    @Selector("modifySubscriptionsCompletionBlock")
    @ObjCBlock(name = "call_modifySubscriptionsCompletionBlock_ret")
    public native Block_modifySubscriptionsCompletionBlock_ret modifySubscriptionsCompletionBlock();

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of
     * subscriptionIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] savedSubscriptions, @c deletedSubscriptionIDs and any @c CKPartialErrorsByItemIDKey errors are repeats of
     * the data sent back in previous @c perSubscriptionSaveBlock and @c perSubscriptionDeleteBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setModifySubscriptionsCompletionBlock:")
    public native void setModifySubscriptionsCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setModifySubscriptionsCompletionBlock") Block_setModifySubscriptionsCompletionBlock value);

    @Generated
    @Selector("setSubscriptionIDsToDelete:")
    public native void setSubscriptionIDsToDelete(@Nullable NSArray<String> value);

    @Generated
    @Selector("setSubscriptionsToSave:")
    public native void setSubscriptionsToSave(@Nullable NSArray<? extends CKSubscription> value);

    @Nullable
    @Generated
    @Selector("subscriptionIDsToDelete")
    public native NSArray<String> subscriptionIDsToDelete();

    @Nullable
    @Generated
    @Selector("subscriptionsToSave")
    public native NSArray<? extends CKSubscription> subscriptionsToSave();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifySubscriptionsCompletionBlock_ret {
        @Generated
        void call_modifySubscriptionsCompletionBlock_ret(@Nullable NSArray<? extends CKSubscription> arg0,
                @Nullable NSArray<String> arg1, @Nullable NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setModifySubscriptionsCompletionBlock {
        @Generated
        void call_setModifySubscriptionsCompletionBlock(@Nullable NSArray<? extends CKSubscription> arg0,
                @Nullable NSArray<String> arg1, @Nullable NSError arg2);
    }

    /**
     * Called on success or failure of a subscription deletion
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("perSubscriptionDeleteBlock")
    @ObjCBlock(name = "call_perSubscriptionDeleteBlock_ret")
    public native Block_perSubscriptionDeleteBlock_ret perSubscriptionDeleteBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perSubscriptionDeleteBlock_ret {
        @Generated
        void call_perSubscriptionDeleteBlock_ret(@NotNull String arg0, @Nullable NSError arg1);
    }

    /**
     * Called on success or failure of a subscription save
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("perSubscriptionSaveBlock")
    @ObjCBlock(name = "call_perSubscriptionSaveBlock_ret")
    public native Block_perSubscriptionSaveBlock_ret perSubscriptionSaveBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perSubscriptionSaveBlock_ret {
        @Generated
        void call_perSubscriptionSaveBlock_ret(@NotNull String arg0, @Nullable CKSubscription arg1,
                @Nullable NSError arg2);
    }

    /**
     * Called on success or failure of a subscription deletion
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPerSubscriptionDeleteBlock:")
    public native void setPerSubscriptionDeleteBlock(
            @Nullable @ObjCBlock(name = "call_setPerSubscriptionDeleteBlock") Block_setPerSubscriptionDeleteBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerSubscriptionDeleteBlock {
        @Generated
        void call_setPerSubscriptionDeleteBlock(@NotNull String arg0, @Nullable NSError arg1);
    }

    /**
     * Called on success or failure of a subscription save
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPerSubscriptionSaveBlock:")
    public native void setPerSubscriptionSaveBlock(
            @Nullable @ObjCBlock(name = "call_setPerSubscriptionSaveBlock") Block_setPerSubscriptionSaveBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerSubscriptionSaveBlock {
        @Generated
        void call_setPerSubscriptionSaveBlock(@NotNull String arg0, @Nullable CKSubscription arg1,
                @Nullable NSError arg2);
    }
}
