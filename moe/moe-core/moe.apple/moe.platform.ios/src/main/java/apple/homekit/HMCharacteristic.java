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
import apple.foundation.NSData;
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
 * Represent a characteristic on a service of an accessory.
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMCharacteristic extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMCharacteristic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMCharacteristic alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HMCharacteristic allocWithZone(VoidPtr zone);

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
    public static native HMCharacteristic new_objc();

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
     * The type of the characteristic, e.g. HMCharacteristicTypePowerState.
     */
    @Generated
    @Selector("characteristicType")
    public native String characteristicType();

    /**
     * Enables/disables notifications or indications for the value of a specified characteristic.
     *
     * @param enable     A Boolean value indicating whether you wish to receive notifications or
     *                   indications whenever the characteristic’s value changes.
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("enableNotification:completionHandler:")
    public native void enableNotificationCompletionHandler(boolean enable,
            @ObjCBlock(name = "call_enableNotificationCompletionHandler") Block_enableNotificationCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMCharacteristic init();

    /**
     * Specifies whether the characteristic has been enabled to send notifications.
     * <p>
     * This property is reset to NO if the reachability of the accessory is NO.
     */
    @Generated
    @Selector("isNotificationEnabled")
    public native boolean isNotificationEnabled();

    /**
     * The localized description of the characteristic.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * Meta data associated with the characteristic.
     */
    @Generated
    @Selector("metadata")
    public native HMCharacteristicMetadata metadata();

    /**
     * Array that describes the properties of the characteristic.
     * <p>
     * This value corresponds to the properties associated with this characteristic.
     * The contents of the array are one or more HMCharacteristicProperty constants.
     */
    @Generated
    @Selector("properties")
    public native NSArray<String> properties();

    /**
     * Reads the value of the characteristic. The updated value can be read from the 'value' property of the characteristic.
     *
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("readValueWithCompletionHandler:")
    public native void readValueWithCompletionHandler(
            @ObjCBlock(name = "call_readValueWithCompletionHandler") Block_readValueWithCompletionHandler completion);

    /**
     * Service that contains this characteristic.
     */
    @Generated
    @Selector("service")
    public native HMService service();

    /**
     * A unique identifier for the characteristic.
     */
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * Sets/clears authorization data used when writing to the characteristic.
     *
     * @param data       New authorization data to use. Specify nil to remove authorization data.
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateAuthorizationData:completionHandler:")
    public native void updateAuthorizationDataCompletionHandler(NSData data,
            @ObjCBlock(name = "call_updateAuthorizationDataCompletionHandler") Block_updateAuthorizationDataCompletionHandler completion);

    /**
     * The value of the characteristic.
     * <p>
     * The value is a cached value that may have been updated as a result of prior
     * interaction with the accessory.
     */
    @Generated
    @Selector("value")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object value();

    /**
     * Modifies the value of the characteristic.
     * <p>
     * The value being written is validated against the metadata, format and permissions.
     * The value written may be bounded by metadata for characteristics with int and
     * float format. If validation fails, the error provided to the completion handler
     * indicates the type of failure.
     *
     * @param value      The value to be written.
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("writeValue:completionHandler:")
    public native void writeValueCompletionHandler(@Mapped(ObjCObjectMapper.class) Object value,
            @ObjCBlock(name = "call_writeValueCompletionHandler") Block_writeValueCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableNotificationCompletionHandler {
        @Generated
        void call_enableNotificationCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readValueWithCompletionHandler {
        @Generated
        void call_readValueWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateAuthorizationDataCompletionHandler {
        @Generated
        void call_updateAuthorizationDataCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeValueCompletionHandler {
        @Generated
        void call_writeValueCompletionHandler(NSError error);
    }
}
