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

package apple.callkit;

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
@Library("CallKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CXCallController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CXCallController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CXCallController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CXCallController allocWithZone(VoidPtr zone);

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
    public static native CXCallController new_objc();

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

    @NotNull
    @Generated
    @Selector("callObserver")
    public native CXCallObserver callObserver();

    /**
     * Initialize call controller with a private, serial queue.
     */
    @Generated
    @Selector("init")
    public native CXCallController init();

    /**
     * Initialize call controller with specified queue, which is used for calling completion blocks.
     */
    @Generated
    @Selector("initWithQueue:")
    public native CXCallController initWithQueue(@NotNull NSObject queue);

    /**
     * Request a transaction to be performed by the in-app provider.
     * 
     * If the completion block is called with a nil error, then the transaction will be passed to the CXProvider's
     * -provider:executeTransaction: delegate callback.
     * A non-nil error indicates that the requested transaction could not be executed.
     * 
     * Completion block is performed on the queue supplied to designated initializer.
     */
    @Generated
    @Selector("requestTransaction:completion:")
    public native void requestTransactionCompletion(@NotNull CXTransaction transaction,
            @NotNull @ObjCBlock(name = "call_requestTransactionCompletion") Block_requestTransactionCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTransactionCompletion {
        @Generated
        void call_requestTransactionCompletion(@Nullable NSError error);
    }

    /**
     * Request a transaction containing the specified action to be performed by the in-app provider.
     * 
     * If the completion block is called with a nil error, then the transaction will be passed to the CXProvider's
     * -provider:executeTransaction: delegate callback.
     * A non-nil error indicates that the requested transaction could not be executed.
     * 
     * Completion block is performed on the queue supplied to designated initializer.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("requestTransactionWithAction:completion:")
    public native void requestTransactionWithActionCompletion(@NotNull CXAction action,
            @NotNull @ObjCBlock(name = "call_requestTransactionWithActionCompletion") Block_requestTransactionWithActionCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTransactionWithActionCompletion {
        @Generated
        void call_requestTransactionWithActionCompletion(@Nullable NSError error);
    }

    /**
     * Request a transaction containing the specified actions to be performed by the in-app provider.
     * 
     * If the completion block is called with a nil error, then the transaction will be passed to the CXProvider's
     * -provider:executeTransaction: delegate callback.
     * A non-nil error indicates that the requested transaction could not be executed.
     * 
     * Completion block is performed on the queue supplied to designated initializer.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("requestTransactionWithActions:completion:")
    public native void requestTransactionWithActionsCompletion(@NotNull NSArray<? extends CXAction> actions,
            @NotNull @ObjCBlock(name = "call_requestTransactionWithActionsCompletion") Block_requestTransactionWithActionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTransactionWithActionsCompletion {
        @Generated
        void call_requestTransactionWithActionsCompletion(@Nullable NSError error);
    }
}
