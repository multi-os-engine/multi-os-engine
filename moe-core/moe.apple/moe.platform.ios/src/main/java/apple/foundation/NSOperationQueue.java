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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSProgressReporting;
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
import apple.opaque.dispatch_queue_t;

/**
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOperationQueue extends NSObject implements NSProgressReporting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSOperationQueue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSOperationQueue alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSOperationQueue allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("currentQueue")
    public static native NSOperationQueue currentQueue();

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

    /**
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("mainQueue")
    public static native NSOperationQueue mainQueue();

    @Generated
    @Owned
    @Selector("new")
    public static native NSOperationQueue new_objc();

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
    @Selector("addOperation:")
    public native void addOperation(@NotNull NSOperation op);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("addOperationWithBlock:")
    public native void addOperationWithBlock(
            @NotNull @ObjCBlock(name = "call_addOperationWithBlock") Block_addOperationWithBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("addOperations:waitUntilFinished:")
    public native void addOperationsWaitUntilFinished(@NotNull NSArray<? extends NSOperation> ops, boolean wait_);

    @Generated
    @Selector("cancelAllOperations")
    public native void cancelAllOperations();

    @Generated
    @Selector("init")
    public native NSOperationQueue init();

    @Generated
    @Selector("isSuspended")
    public native boolean isSuspended();

    @Generated
    @Selector("setSuspended:")
    public native void setSuspended(boolean value);

    @Generated
    @Selector("maxConcurrentOperationCount")
    @NInt
    public native long maxConcurrentOperationCount();

    /**
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("operationCount")
    @NUInt
    public native long operationCount();

    /**
     * These two functions are inherently a race condition and should be avoided if possible
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: access to operations is inherently a race condition, it should not be used. For barrier style
     * behaviors please use addBarrierBlock: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("operations")
    public native NSArray<? extends NSOperation> operations();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    @Generated
    @Selector("setMaxConcurrentOperationCount:")
    public native void setMaxConcurrentOperationCount(@NInt long value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    /**
     * actually retain
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setUnderlyingQueue:")
    public native void setUnderlyingQueue(@Nullable dispatch_queue_t value);

    /**
     * actually retain
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("underlyingQueue")
    public native dispatch_queue_t underlyingQueue();

    @Generated
    @Selector("waitUntilAllOperationsAreFinished")
    public native void waitUntilAllOperationsAreFinished();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addOperationWithBlock {
        @Generated
        void call_addOperationWithBlock();
    }

    /**
     * addBarrierBlock:
     * 
     * The `addBarrierBlock:` method executes the block when the NSOperationQueue has finished all enqueued operations
     * and
     * prevents any subsequent operations to be executed until the barrier has been completed. This acts similarly to
     * the
     * `dispatch_barrier_async` function.
     * 
     * API-Since: 13.0
     * 
     * @param barrier A block to execute
     */
    @Generated
    @Selector("addBarrierBlock:")
    public native void addBarrierBlock(
            @NotNull @ObjCBlock(name = "call_addBarrierBlock") Block_addBarrierBlock barrier);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addBarrierBlock {
        @Generated
        void call_addBarrierBlock();
    }

    @NotNull
    @Generated
    @Selector("progress")
    public native NSProgress progress();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
