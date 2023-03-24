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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class represents an event that is evaluated based on the value of a characteristic
 * set to a particular value.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMCharacteristicEvent<_TriggerValueType> extends HMEvent implements NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HMCharacteristicEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMCharacteristicEvent<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMCharacteristicEvent<?> allocWithZone(VoidPtr zone);

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
    public static native HMCharacteristicEvent<?> new_objc();

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
     * The characteristic associated with the event.
     */
    @NotNull
    @Generated
    @Selector("characteristic")
    public native HMCharacteristic characteristic();

    @Generated
    @Selector("init")
    public native HMCharacteristicEvent<?> init();

    /**
     * Initializes a new characteristic event object
     * 
     * @param characteristic The characteristic bound to the event. The characteristic must
     *                       support notification. An exception will be thrown otherwise.
     * 
     * @param triggerValue   The value of the characteristic that triggers the event.
     *                       Specifying nil as the trigger value corresponds to any change in the value of the
     *                       characteristic.
     * 
     * @return Instance object representing the characteristic event.
     */
    @Generated
    @Selector("initWithCharacteristic:triggerValue:")
    public native HMCharacteristicEvent<?> initWithCharacteristicTriggerValue(@NotNull HMCharacteristic characteristic,
            @Nullable @Mapped(ObjCObjectMapper.class) Object triggerValue);

    /**
     * The value of the characteristic that triggers the event.
     * A value of nil corresponds to any change in the value of the characteristic.
     */
    @Nullable
    @Generated
    @Selector("triggerValue")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object triggerValue();

    /**
     * This method is used to change trigger value for the characteristic.
     * 
     * @param triggerValue New trigger value for the characteristic.
     *                     Specifying nil as the trigger value corresponds to any change in the value of the
     *                     characteristic.
     * 
     * @param completion   Block that is invoked once the request is processed.
     *                     The NSError provides more information on the status of the request, error
     *                     will be nil on success.
     * 
     *                     API-Since: 9.0
     *                     Deprecated-Since: 11.0
     *                     Deprecated-Message: No longer supported.
     */
    @Deprecated
    @Generated
    @Selector("updateTriggerValue:completionHandler:")
    public native void updateTriggerValueCompletionHandler(
            @Nullable @Mapped(ObjCObjectMapper.class) Object triggerValue,
            @NotNull @ObjCBlock(name = "call_updateTriggerValueCompletionHandler") Block_updateTriggerValueCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateTriggerValueCompletionHandler {
        @Generated
        void call_updateTriggerValueCompletionHandler(@Nullable NSError error);
    }

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("isSupportedForHome:")
    public static native boolean isSupportedForHome(@NotNull HMHome home);

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);
}
