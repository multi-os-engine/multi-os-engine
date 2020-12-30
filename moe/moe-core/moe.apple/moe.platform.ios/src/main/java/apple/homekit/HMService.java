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
 * Represents a service provided by an accessory.
 * 
 * This class represents a service provided by an accessory in the home.
 *             A service is composed of one or more characteristics that can be
 *             modified.
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMService extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMService(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMService alloc();

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
     * Accessory that provides this service.
     */
    @Generated
    @Selector("accessory")
    public native HMAccessory accessory();

    /**
     * For HMServiceTypeOutlet and HMServiceTypeSwitch, this is the type of the associated service.
     * 
     * This could be any of the HomeKit Accessory Profile defined services (except HMServiceTypeOutlet
     *             or HMServiceTypeSwitch) that supports HMCharacteristicTypePowerState characteristic.
     */
    @Generated
    @Selector("associatedServiceType")
    public native String associatedServiceType();

    /**
     * Array of HMCharacteristic objects that represents all the characteristics
     *        provided by the service.
     */
    @Generated
    @Selector("characteristics")
    public native NSArray<? extends HMCharacteristic> characteristics();

    @Generated
    @Selector("init")
    public native HMService init();

    /**
     * Indicates if this services is the primary service.
     * 
     * Applications should use this property to show the primary service on the accessory.
     */
    @Generated
    @Selector("isPrimaryService")
    public native boolean isPrimaryService();

    /**
     * Indicates if this service supports user interaction or not.
     * 
     * Applications should use this property to filter out services that the users
     *             should not directly interact with, e.g. HMServiceTypeAccessoryInformation.
     */
    @Generated
    @Selector("isUserInteractive")
    public native boolean isUserInteractive();

    /**
     * Array of HMService objects that represents all the services that the service links to.
     * 
     * Applications should use this property to show logical grouping of services on the accessory.
     *             linkedServices will be nil when the service does not link to any other services.
     */
    @Generated
    @Selector("linkedServices")
    public native NSArray<? extends HMService> linkedServices();

    /**
     * The localized description of the service.
     */
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * Name for the service.
     * 
     * Returns the service's name that is associated with HomeKit. The initial value is the value of
     *             the name characteristic of the service, if it has one.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * The type of the service, e.g. HMServiceTypeLightbulb.
     */
    @Generated
    @Selector("serviceType")
    public native String serviceType();

    /**
     * A unique identifier for the service.
     */
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * This method is used to set up the service type of the device connected to a contact sensor, switch or an outlet.
     * 
     * This method is only valid for the services of the following types:
     *                 HMServiceTypeOutlet, HMServiceTypeContactSensor and HMServiceTypeSwitch
     * 
     *             For services of type HMServiceTypeOutlet and HMServiceTypeSwitch, serviceType can be one of the
     *             HomeKit Accessory Profile defined services (except HMServiceTypeOutlet or HMServiceTypeSwitch)
     *             that supports HMCharacteristicTypePowerState characteristic.
     * 
     *             For services of type HMServiceTypeContactSensor, serviceType can be one of the following services:
     *                 HMServiceTypeDoor, HMServiceTypeGarageDoorOpener, HMServiceTypeWindow and HMServiceTypeWindowCovering
     * 
     * @param serviceType Service type of the device connected to a contact sensor/switch/outlet service.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateAssociatedServiceType:completionHandler:")
    public native void updateAssociatedServiceTypeCompletionHandler(String serviceType,
            @ObjCBlock(name = "call_updateAssociatedServiceTypeCompletionHandler") Block_updateAssociatedServiceTypeCompletionHandler completion);

    /**
     * This method is used to change the name of the service.
     * 
     * The new name is stored in HomeKit and not on the accessory.
     * 
     * @param name New name for the service.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("updateName:completionHandler:")
    public native void updateNameCompletionHandler(String name,
            @ObjCBlock(name = "call_updateNameCompletionHandler") Block_updateNameCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateAssociatedServiceTypeCompletionHandler {
        @Generated
        void call_updateAssociatedServiceTypeCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(NSError error);
    }
}
