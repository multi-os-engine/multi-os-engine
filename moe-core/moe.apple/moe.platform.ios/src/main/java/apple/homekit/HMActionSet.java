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

package apple.homekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
 * This class represents a collection of action objects that can be executed.
 * The order of execution of these actions is undefined.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMActionSet extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMActionSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMActionSet alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMActionSet allocWithZone(VoidPtr zone);

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
    public static native HMActionSet new_objc();

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
     * Specifies the action set type - user-defined, trigger-owned or one of the builtin types.
     * Builtin action sets cannot be removed from the home. trigger-owned action sets cannot
     * be executed, renamed or associated with another trigger.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("actionSetType")
    public native String actionSetType();

    /**
     * Set of HMAction objects that represent the individual items of the action set.
     */
    @NotNull
    @Generated
    @Selector("actions")
    public native NSSet<? extends HMAction> actions();

    /**
     * Adds an action to the action set.
     * 
     * @param action     Action object to add to the action set.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("addAction:completionHandler:")
    public native void addActionCompletionHandler(@NotNull HMAction action,
            @NotNull @ObjCBlock(name = "call_addActionCompletionHandler") Block_addActionCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMActionSet init();

    /**
     * Specifies whether the action set is currently executing or not.
     */
    @Generated
    @Selector("isExecuting")
    public native boolean isExecuting();

    /**
     * Specifies the last execution date for the action set.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("lastExecutionDate")
    public native NSDate lastExecutionDate();

    /**
     * The name of the action set.
     */
    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Removes an existing action from the action set.
     * 
     * @param action     Action object to remove from the action set.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("removeAction:completionHandler:")
    public native void removeActionCompletionHandler(@NotNull HMAction action,
            @NotNull @ObjCBlock(name = "call_removeActionCompletionHandler") Block_removeActionCompletionHandler completion);

    /**
     * A unique identifier for the action set.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * This method is used to change the name of the action set.
     * 
     * @param name       New name for the action set.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(@NotNull String name,
            @NotNull @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionCompletionHandler {
        @Generated
        void call_addActionCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeActionCompletionHandler {
        @Generated
        void call_removeActionCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
