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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CAMediaTimingFunction;
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

/**
 * Transactions are SceneKit's mechanism for batching multiple scene graph
 * operations into atomic updates. Every
 * modification to the scene graph requires a transaction to be part of.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNTransaction extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNTransaction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNTransaction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNTransaction allocWithZone(VoidPtr zone);

    /**
     * Accessors for the "animationDuration" per-thread transaction
     * property. Defines the default duration of animations. Defaults to 1/4s for explicit transactions, 0s for implicit transactions.
     */
    @Generated
    @Selector("animationDuration")
    public static native double animationDuration();

    /**
     * Accessors for the "animationTimingFunction" per-thread transaction
     * property. The default value is nil, when set to a non-nil value any
     * animations added to scene graph will have this value set as their
     * "timingFunction" property.
     */
    @Generated
    @Selector("animationTimingFunction")
    public static native CAMediaTimingFunction animationTimingFunction();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Begin a new transaction for the current thread; nests.
     */
    @Generated
    @Selector("begin")
    public static native void begin();

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

    /**
     * Commit all changes made during the current transaction.
     */
    @Generated
    @Selector("commit")
    public static native void commit();

    /**
     * Accessors for the "completionBlock" per-thread transaction property.
     * Once set to a non-nil value the block is guaranteed to be called (on
     * the main thread) as soon as all animations subsequently added by
     * this transaction group have completed (or been removed).
     */
    @Generated
    @Selector("completionBlock")
    @ObjCBlock(name = "call_completionBlock_ret")
    public static native Block_completionBlock_ret completionBlock();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Accessors for the "disableActions" per-thread transaction property.
     * Defines whether or not the implicit animations are performed.
     * Defaults to NO, i.e. implicit animations enabled.
     */
    @Generated
    @Selector("disableActions")
    public static native boolean disableActions();

    /**
     * Commits any extant implicit transaction. Will delay the actual commit
     * until any nested explicit transactions have completed.
     */
    @Generated
    @Selector("flush")
    public static native void flush();

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

    /**
     * Methods to lock and unlock the global lock.
     */
    @Generated
    @Selector("lock")
    public static native void lock();

    @Generated
    @Owned
    @Selector("new")
    public static native SCNTransaction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Accessors for the "animationDuration" per-thread transaction
     * property. Defines the default duration of animations. Defaults to 1/4s for explicit transactions, 0s for implicit transactions.
     */
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration(double value);

    /**
     * Accessors for the "animationTimingFunction" per-thread transaction
     * property. The default value is nil, when set to a non-nil value any
     * animations added to scene graph will have this value set as their
     * "timingFunction" property.
     */
    @Generated
    @Selector("setAnimationTimingFunction:")
    public static native void setAnimationTimingFunction(CAMediaTimingFunction value);

    /**
     * Accessors for the "completionBlock" per-thread transaction property.
     * Once set to a non-nil value the block is guaranteed to be called (on
     * the main thread) as soon as all animations subsequently added by
     * this transaction group have completed (or been removed).
     */
    @Generated
    @Selector("setCompletionBlock:")
    public static native void setCompletionBlock(
            @ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock value);

    /**
     * Accessors for the "disableActions" per-thread transaction property.
     * Defines whether or not the implicit animations are performed.
     * Defaults to NO, i.e. implicit animations enabled.
     */
    @Generated
    @Selector("setDisableActions:")
    public static native void setDisableActions(boolean value);

    @Generated
    @Selector("setValue:forKey:")
    public static native void setValueForKey_static(@Mapped(ObjCObjectMapper.class) Object value, String key);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unlock")
    public static native void unlock();

    /**
     * Associate arbitrary keyed-data with the current transaction (i.e.
     * with the current thread).
     */
    @Generated
    @Selector("valueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object valueForKey_static(String key);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SCNTransaction init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionBlock_ret {
        @Generated
        void call_completionBlock_ret();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionBlock {
        @Generated
        void call_setCompletionBlock();
    }
}
