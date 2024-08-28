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
 * API-Since: 10.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchShareParticipantsOperation extends CKOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchShareParticipantsOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchShareParticipantsOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchShareParticipantsOperation allocWithZone(VoidPtr zone);

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
    public static native CKFetchShareParticipantsOperation new_objc();

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
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of lookup infos
     * to errors keyed off of @c CKPartialErrorsByItemIDKey. These errors are repeats of those sent back in previous @c
     * perShareParticipantCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("fetchShareParticipantsCompletionBlock")
    @ObjCBlock(name = "call_fetchShareParticipantsCompletionBlock_ret")
    public native Block_fetchShareParticipantsCompletionBlock_ret fetchShareParticipantsCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchShareParticipantsOperation init();

    @Generated
    @Selector("initWithUserIdentityLookupInfos:")
    public native CKFetchShareParticipantsOperation initWithUserIdentityLookupInfos(
            @NotNull NSArray<? extends CKUserIdentityLookupInfo> userIdentityLookupInfos);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of lookup infos
     * to errors keyed off of @c CKPartialErrorsByItemIDKey. These errors are repeats of those sent back in previous @c
     * perShareParticipantCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setFetchShareParticipantsCompletionBlock:")
    public native void setFetchShareParticipantsCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setFetchShareParticipantsCompletionBlock") Block_setFetchShareParticipantsCompletionBlock value);

    /**
     * Called once for each share participant created from a submitted user identity lookup info.
     * 
     * If the replacement callback @c perShareParticipantCompletionBlock is set, this callback block is ignored.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use perShareParticipantCompletionBlock instead, which surfaces per-share-participant errors
     */
    @Deprecated
    @Generated
    @Selector("setShareParticipantFetchedBlock:")
    public native void setShareParticipantFetchedBlock(
            @Nullable @ObjCBlock(name = "call_setShareParticipantFetchedBlock") Block_setShareParticipantFetchedBlock value);

    @Generated
    @Selector("setUserIdentityLookupInfos:")
    public native void setUserIdentityLookupInfos(@Nullable NSArray<? extends CKUserIdentityLookupInfo> value);

    /**
     * Called once for each share participant created from a submitted user identity lookup info.
     * 
     * If the replacement callback @c perShareParticipantCompletionBlock is set, this callback block is ignored.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use perShareParticipantCompletionBlock instead, which surfaces per-share-participant errors
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("shareParticipantFetchedBlock")
    @ObjCBlock(name = "call_shareParticipantFetchedBlock_ret")
    public native Block_shareParticipantFetchedBlock_ret shareParticipantFetchedBlock();

    @Nullable
    @Generated
    @Selector("userIdentityLookupInfos")
    public native NSArray<? extends CKUserIdentityLookupInfo> userIdentityLookupInfos();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantsCompletionBlock_ret {
        @Generated
        void call_fetchShareParticipantsCompletionBlock_ret(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchShareParticipantsCompletionBlock {
        @Generated
        void call_setFetchShareParticipantsCompletionBlock(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setShareParticipantFetchedBlock {
        @Generated
        void call_setShareParticipantFetchedBlock(@NotNull CKShareParticipant arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_shareParticipantFetchedBlock_ret {
        @Generated
        void call_shareParticipantFetchedBlock_ret(@NotNull CKShareParticipant arg0);
    }

    /**
     * Called once for each lookup info.
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("perShareParticipantCompletionBlock")
    @ObjCBlock(name = "call_perShareParticipantCompletionBlock_ret")
    public native Block_perShareParticipantCompletionBlock_ret perShareParticipantCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perShareParticipantCompletionBlock_ret {
        @Generated
        void call_perShareParticipantCompletionBlock_ret(@NotNull CKUserIdentityLookupInfo arg0,
                @Nullable CKShareParticipant arg1, @Nullable NSError arg2);
    }

    /**
     * Called once for each lookup info.
     * 
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setPerShareParticipantCompletionBlock:")
    public native void setPerShareParticipantCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setPerShareParticipantCompletionBlock") Block_setPerShareParticipantCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerShareParticipantCompletionBlock {
        @Generated
        void call_setPerShareParticipantCompletionBlock(@NotNull CKUserIdentityLookupInfo arg0,
                @Nullable CKShareParticipant arg1, @Nullable NSError arg2);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
