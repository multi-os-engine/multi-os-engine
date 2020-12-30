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
 * @brief Represents a trigger event.
 * 
 * @discussion This class describes a trigger which is an event that can
 *             be used to execute one or more action sets when the event fires.
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMTrigger extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMTrigger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMTrigger alloc();

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

    /**
     * @abstract Array of HMActionSet objects that represent all the action sets associated
     *           with this trigger.
     */
    @Generated
    @Selector("actionSets")
    public native NSArray<? extends HMActionSet> actionSets();

    /**
     * @brief Registers an action set to be executed when the trigger is fired.
     * 
     * @param actionSet HMActionSet to execute when the trigger fires. The order of execution of the
     *                  action set is not guaranteed.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request.
     */
    @Generated
    @Selector("addActionSet:completionHandler:")
    public native void addActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_addActionSetCompletionHandler") Block_addActionSetCompletionHandler completion);

    /**
     * @brief Enables or disables the trigger.
     * @discussion In order for the trigger to be enabled the following criteria must be met:
     *             1. The trigger must be added to a home.
     *             2. The trigger must have at least one action set associated with it.
     *             3. Each action set added to the trigger must have at least one action.
     *             4. For HMTimerTrigger: The next fire date of the timer trigger must be less
     *                than 5 weeks in the future. The fire date of a one-shot timer trigger
     *                must be in the future.
     * 
     * @param enable Setting this to TRUE will enable the trigger, FALSE will disable it.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request.
     */
    @Generated
    @Selector("enable:completionHandler:")
    public native void enableCompletionHandler(boolean enable,
            @ObjCBlock(name = "call_enableCompletionHandler") Block_enableCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMTrigger init();

    /**
     * @brief State of the trigger.
     * 
     * @discussion TRUE if the trigger is enable, FALSE otherwise.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * @brief The date that this trigger was most recently fired.
     */
    @Generated
    @Selector("lastFireDate")
    public native NSDate lastFireDate();

    /**
     * @brief Name of the trigger.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @brief De-registers an action set from the trigger.
     * 
     * @param actionSet The HMActionSet to disassociate from the trigger.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request.
     */
    @Generated
    @Selector("removeActionSet:completionHandler:")
    public native void removeActionSetCompletionHandler(HMActionSet actionSet,
            @ObjCBlock(name = "call_removeActionSetCompletionHandler") Block_removeActionSetCompletionHandler completion);

    /**
     * @brief A unique identifier for the trigger.
     */
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * @brief This method is used to change the name of the trigger.
     * 
     * @param name New name for the trigger.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request.
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(String name,
            @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addActionSetCompletionHandler {
        @Generated
        void call_addActionSetCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableCompletionHandler {
        @Generated
        void call_enableCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeActionSetCompletionHandler {
        @Generated
        void call_removeActionSetCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(NSError error);
    }
}
