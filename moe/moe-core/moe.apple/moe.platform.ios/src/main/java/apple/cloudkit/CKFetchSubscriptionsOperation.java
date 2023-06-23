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
public class CKFetchSubscriptionsOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchSubscriptionsOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchSubscriptionsOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchSubscriptionsOperation allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("fetchAllSubscriptionsOperation")
    public static native CKFetchSubscriptionsOperation fetchAllSubscriptionsOperation();

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
    public static native CKFetchSubscriptionsOperation new_objc();

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
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of subscriptionID
     * to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] subscriptionsBySubscriptionID and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent back
     * in previous @c perSubscriptionCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Nullable
    @Generated
    @Selector("fetchSubscriptionCompletionBlock")
    @ObjCBlock(name = "call_fetchSubscriptionCompletionBlock_ret")
    public native Block_fetchSubscriptionCompletionBlock_ret fetchSubscriptionCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchSubscriptionsOperation init();

    @Generated
    @Selector("initWithSubscriptionIDs:")
    public native CKFetchSubscriptionsOperation initWithSubscriptionIDs(@NotNull NSArray<String> subscriptionIDs);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of subscriptionID
     * to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] subscriptionsBySubscriptionID and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent back
     * in previous @c perSubscriptionCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setFetchSubscriptionCompletionBlock:")
    public native void setFetchSubscriptionCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setFetchSubscriptionCompletionBlock") Block_setFetchSubscriptionCompletionBlock value);

    @Generated
    @Selector("setSubscriptionIDs:")
    public native void setSubscriptionIDs(@Nullable NSArray<String> value);

    @Nullable
    @Generated
    @Selector("subscriptionIDs")
    public native NSArray<String> subscriptionIDs();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchSubscriptionCompletionBlock_ret {
        @Generated
        void call_fetchSubscriptionCompletionBlock_ret(@Nullable NSDictionary<String, ? extends CKSubscription> arg0,
                @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchSubscriptionCompletionBlock {
        @Generated
        void call_setFetchSubscriptionCompletionBlock(@Nullable NSDictionary<String, ? extends CKSubscription> arg0,
                @Nullable NSError arg1);
    }

    /**
     * Called on success or failure for each subscriptionID.
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("perSubscriptionCompletionBlock")
    @ObjCBlock(name = "call_perSubscriptionCompletionBlock_ret")
    public native Block_perSubscriptionCompletionBlock_ret perSubscriptionCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perSubscriptionCompletionBlock_ret {
        @Generated
        void call_perSubscriptionCompletionBlock_ret(@NotNull String arg0, @Nullable CKSubscription arg1,
                @Nullable NSError arg2);
    }

    /**
     * Called on success or failure for each subscriptionID.
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPerSubscriptionCompletionBlock:")
    public native void setPerSubscriptionCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setPerSubscriptionCompletionBlock") Block_setPerSubscriptionCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerSubscriptionCompletionBlock {
        @Generated
        void call_setPerSubscriptionCompletionBlock(@NotNull String arg0, @Nullable CKSubscription arg1,
                @Nullable NSError arg2);
    }
}
