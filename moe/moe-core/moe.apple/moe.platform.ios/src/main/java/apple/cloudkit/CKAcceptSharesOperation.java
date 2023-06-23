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
public class CKAcceptSharesOperation extends CKOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKAcceptSharesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKAcceptSharesOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKAcceptSharesOperation allocWithZone(VoidPtr zone);

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
    public static native CKAcceptSharesOperation new_objc();

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
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of shareURLs to
     * errors keyed off of @c CKPartialErrorsByItemIDKey. These errors are repeats of those sent back in previous @c
     * perShareCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Nullable
    @Generated
    @Selector("acceptSharesCompletionBlock")
    @ObjCBlock(name = "call_acceptSharesCompletionBlock_ret")
    public native Block_acceptSharesCompletionBlock_ret acceptSharesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKAcceptSharesOperation init();

    @Generated
    @Selector("initWithShareMetadatas:")
    public native CKAcceptSharesOperation initWithShareMetadatas(
            @NotNull NSArray<? extends CKShareMetadata> shareMetadatas);

    /**
     * Called once for each share metadata that the server processed
     * 
     * If error is nil then the share was successfully accepted.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Nullable
    @Generated
    @Selector("perShareCompletionBlock")
    @ObjCBlock(name = "call_perShareCompletionBlock_ret")
    public native Block_perShareCompletionBlock_ret perShareCompletionBlock();

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of shareURLs to
     * errors keyed off of @c CKPartialErrorsByItemIDKey. These errors are repeats of those sent back in previous @c
     * perShareCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setAcceptSharesCompletionBlock:")
    public native void setAcceptSharesCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setAcceptSharesCompletionBlock") Block_setAcceptSharesCompletionBlock value);

    /**
     * Called once for each share metadata that the server processed
     * 
     * If error is nil then the share was successfully accepted.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setPerShareCompletionBlock:")
    public native void setPerShareCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setPerShareCompletionBlock") Block_setPerShareCompletionBlock value);

    @Generated
    @Selector("setShareMetadatas:")
    public native void setShareMetadatas(@Nullable NSArray<? extends CKShareMetadata> value);

    @Nullable
    @Generated
    @Selector("shareMetadatas")
    public native NSArray<? extends CKShareMetadata> shareMetadatas();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_acceptSharesCompletionBlock_ret {
        @Generated
        void call_acceptSharesCompletionBlock_ret(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perShareCompletionBlock_ret {
        @Generated
        void call_perShareCompletionBlock_ret(@NotNull CKShareMetadata arg0, @Nullable CKShare arg1,
                @Nullable NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAcceptSharesCompletionBlock {
        @Generated
        void call_setAcceptSharesCompletionBlock(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerShareCompletionBlock {
        @Generated
        void call_setPerShareCompletionBlock(@NotNull CKShareMetadata arg0, @Nullable CKShare arg1,
                @Nullable NSError arg2);
    }
}
