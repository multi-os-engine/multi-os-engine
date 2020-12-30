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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperation;
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
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKOperation extends NSOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKOperation alloc();

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
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

    @Generated
    @Selector("container")
    public native CKContainer container();

    @Generated
    @Selector("init")
    public native CKOperation init();

    @Generated
    @Selector("isLongLived")
    public native boolean isLongLived();

    @Generated
    @Selector("setLongLived:")
    public native void setLongLived(boolean value);

    /**
     * @abstract This callback is called after a long lived operation has begun running and is persisted.
     * 
     * @discussion Once this callback is called the operation will continue running even if the current process exits.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("longLivedOperationWasPersistedBlock")
    @ObjCBlock(name = "call_longLivedOperationWasPersistedBlock_ret")
    public native Block_longLivedOperationWasPersistedBlock_ret longLivedOperationWasPersistedBlock();

    /**
     * @abstract This is an identifier unique to this CKOperation.
     * 
     * @discussion This value is chosen by the system, and will be unique to this instance of a CKOperation.  This identifier will be sent to Apple's servers, and can be used to identify any server-side logging associated with this operation.
     */
    @Generated
    @Selector("operationID")
    public native String operationID();

    @Generated
    @Selector("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean value);

    @Generated
    @Selector("setContainer:")
    public native void setContainer(CKContainer value);

    /**
     * @abstract This callback is called after a long lived operation has begun running and is persisted.
     * 
     * @discussion Once this callback is called the operation will continue running even if the current process exits.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setLongLivedOperationWasPersistedBlock:")
    public native void setLongLivedOperationWasPersistedBlock(
            @ObjCBlock(name = "call_setLongLivedOperationWasPersistedBlock") Block_setLongLivedOperationWasPersistedBlock value);

    @Generated
    @Selector("setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double value);

    @Generated
    @Selector("setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double value);

    @Generated
    @Selector("timeoutIntervalForRequest")
    public native double timeoutIntervalForRequest();

    @Generated
    @Selector("timeoutIntervalForResource")
    public native double timeoutIntervalForResource();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_longLivedOperationWasPersistedBlock_ret {
        @Generated
        void call_longLivedOperationWasPersistedBlock_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setLongLivedOperationWasPersistedBlock {
        @Generated
        void call_setLongLivedOperationWasPersistedBlock();
    }

    /**
     * @abstract This defines per-operation configuration settings.
     * 
     * @discussion See the CKOperationConfiguration class description for info on how this configuration composes with CKOperationGroup.defaultConfiguration
     */
    @Generated
    @Selector("configuration")
    public native CKOperationConfiguration configuration();

    /**
     * @abstract The group this operation is associated with
     */
    @Generated
    @Selector("group")
    public native CKOperationGroup group();

    /**
     * @abstract This defines per-operation configuration settings.
     * 
     * @discussion See the CKOperationConfiguration class description for info on how this configuration composes with CKOperationGroup.defaultConfiguration
     */
    @Generated
    @Selector("setConfiguration:")
    public native void setConfiguration(CKOperationConfiguration value);

    /**
     * @abstract The group this operation is associated with
     */
    @Generated
    @Selector("setGroup:")
    public native void setGroup(CKOperationGroup value);
}
