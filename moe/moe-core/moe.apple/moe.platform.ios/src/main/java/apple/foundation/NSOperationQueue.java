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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("mainQueue")
    public static native NSOperationQueue mainQueue();

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
    @Selector("addOperation:")
    public native void addOperation(NSOperation op);

    @Generated
    @Selector("addOperationWithBlock:")
    public native void addOperationWithBlock(
            @ObjCBlock(name = "call_addOperationWithBlock") Block_addOperationWithBlock block);

    @Generated
    @Selector("addOperations:waitUntilFinished:")
    public native void addOperationsWaitUntilFinished(NSArray<? extends NSOperation> ops, boolean wait_);

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

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("operationCount")
    @NUInt
    public native long operationCount();

    /**
     * These two functions are inherently a race condition and should be avoided if possible
     */
    @Generated
    @Selector("operations")
    public native NSArray<? extends NSOperation> operations();

    @Generated
    @Selector("qualityOfService")
    @NInt
    public native long qualityOfService();

    @Generated
    @Selector("setMaxConcurrentOperationCount:")
    public native void setMaxConcurrentOperationCount(@NInt long value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setQualityOfService:")
    public native void setQualityOfService(@NInt long value);

    /**
     * actually retain
     */
    @Generated
    @Selector("setUnderlyingQueue:")
    public native void setUnderlyingQueue_unsafe(NSObject value);

    /**
     * actually retain
     */
    @Generated
    public void setUnderlyingQueue(NSObject value) {
        Object __old = underlyingQueue();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setUnderlyingQueue_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * actually retain
     */
    @Generated
    @Selector("underlyingQueue")
    public native NSObject underlyingQueue();

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
     * The `addBarrierBlock:` method executes the block when the NSOperationQueue has finished all enqueued operations and
     * prevents any subsequent operations to be executed until the barrier has been completed. This acts similarly to the
     * `dispatch_barrier_async` function.
     * 
     * @param barrier      A block to execute
     */
    @Generated
    @Selector("addBarrierBlock:")
    public native void addBarrierBlock(@ObjCBlock(name = "call_addBarrierBlock") Block_addBarrierBlock barrier);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addBarrierBlock {
        @Generated
        void call_addBarrierBlock();
    }

    @Generated
    @Selector("progress")
    public native NSProgress progress();
}
