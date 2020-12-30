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
import apple.homekit.protocol.HMAccessoryDelegate;
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
 * @abstract Represent an accessory in the home.
 * 
 * @discussion This class represents an accessory in the home. There is a one to
 *             one relationship between a physical accessory and an object of this
 *             class. An accessory is composed of one or more services.
 */
@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMAccessory extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected HMAccessory(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HMAccessory alloc();

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
     * @brief Returns array of camera profiles implemented by the accessory.
     * 
     * @discussion An accessory can contain one or more cameras. Each camera is represented as a
     *             an HMCameraProfile object. If the accessory does not contain a camera, this property
     *             will be nil.
     */
    @Generated
    @Selector("cameraProfiles")
    public native NSArray<? extends HMCameraProfile> cameraProfiles();

    /**
     * @brief Category information for the accessory.
     */
    @Generated
    @Selector("category")
    public native HMAccessoryCategory category();

    /**
     * @brief Delegate object that receives updates on the state of the accessory.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native HMAccessoryDelegate delegate();

    /**
     * @brief A unique identifier for the accessory.
     * 
     * @discussion Use uniqueIdentifier to obtain the identifier for this object.
     */
    @Generated
    @Deprecated
    @Selector("identifier")
    public native NSUUID identifier();

    /**
     * @brief If this accessory is a bridge, this property is an array of NSUUID objects that,
     *        each of which represents the 'uniqueIdentifier' of the accessory vended by the bridge.
     * 
     * @discussion Use uniqueIdentifiersForBridgedAccessories to obtain the identifiers for the
     *             bridged accessories.
     */
    @Generated
    @Deprecated
    @Selector("identifiersForBridgedAccessories")
    public native NSArray<? extends NSUUID> identifiersForBridgedAccessories();

    /**
     * @brief This method is used to have an accessory identify itself.
     * 
     * @param completion Block that is invoked once the request is processed.
     *                   The NSError provides more information on the status of the request, error
     *                   will be nil on success.
     */
    @Generated
    @Selector("identifyWithCompletionHandler:")
    public native void identifyWithCompletionHandler(
            @ObjCBlock(name = "call_identifyWithCompletionHandler") Block_identifyWithCompletionHandler completion);

    @Generated
    @Selector("init")
    public native HMAccessory init();

    /**
     * @brief TRUE if the accessory is blocked, FALSE otherwise.
     */
    @Generated
    @Selector("isBlocked")
    public native boolean isBlocked();

    /**
     * @brief This property indicates whether this accessory is behind a bridge. If it is TRUE,
     *        the accessory cannot be removed from the home directly. Only the bridge that owns
     *        this accessory can be removed and removing the bridge will remove this accessory
     *        from the home.
     */
    @Generated
    @Selector("isBridged")
    public native boolean isBridged();

    /**
     * @brief TRUE if the accessory is currently reachable, FALSE otherwise.
     */
    @Generated
    @Selector("isReachable")
    public native boolean isReachable();

    /**
     * @brief The name of the accessory.
     * 
     * @discussion Returns the accessory's name that is associated with HomeKit. The initial value is the name
     *             provided by the accessory information service of the accessory.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @brief Room containing the accessory.
     */
    @Generated
    @Selector("room")
    public native HMRoom room();

    /**
     * @brief Array of HMService objects that represent all the services provided by the accessory.
     */
    @Generated
    @Selector("services")
    public native NSArray<? extends HMService> services();

    /**
     * @brief Delegate object that receives updates on the state of the accessory.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) HMAccessoryDelegate value);

    /**
     * @brief Delegate object that receives updates on the state of the accessory.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) HMAccessoryDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * @brief A unique identifier for the accessory.
     */
    @Generated
    @Selector("uniqueIdentifier")
    public native NSUUID uniqueIdentifier();

    /**
     * @brief If this accessory is a bridge, this property is an array of NSUUID objects that,
     *        each of which represents the 'uniqueIdentifier' of the accessory vended by the bridge.
     * 
     * @discussion An accessory can be standalone, a bridge, or hosted behind a bridge.
     *                  - A standalone accessory would have its 'bridged' property set to FALSE and
     *                    its 'uniqueIdentifiersForBridgedAccessories' property set to nil.
     *                  - An accessory that is a bridge would have its 'bridged' property set to FALSE,
     *                    but have a non-empty 'uniqueIdentifiersForBridgedAccessories' property.
     *                  - An accessory behind a bridge would have its 'bridged' property set to TRUE and
     *                    its 'uniqueIdentifiersForBridgedAccessories' property set to nil.
     */
    @Generated
    @Selector("uniqueIdentifiersForBridgedAccessories")
    public native NSArray<? extends NSUUID> uniqueIdentifiersForBridgedAccessories();

    /**
     * @brief This method is used to change the name of the accessory.
     * 
     * @param name New name for the accessory.
     * 
     * @discussion The new name is stored in HomeKit and not on the accessory.
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
    public interface Block_identifyWithCompletionHandler {
        @Generated
        void call_identifyWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNameCompletionHandler {
        @Generated
        void call_updateNameCompletionHandler(NSError error);
    }

    /**
     * @abstract   Accessory's firmware version.
     */
    @Generated
    @Selector("firmwareVersion")
    public native String firmwareVersion();

    /**
     * @abstract   Manufacturer of the accessory.
     */
    @Generated
    @Selector("manufacturer")
    public native String manufacturer();

    /**
     * @abstract   Model of the accessory.
     */
    @Generated
    @Selector("model")
    public native String model();

    /**
     * @abstract   Accessory profiles of the receiver.
     */
    @Generated
    @Selector("profiles")
    public native NSArray<? extends HMAccessoryProfile> profiles();

    /**
     * @abstract   Indicates if the accessory supports the identify action.
     */
    @Generated
    @Selector("supportsIdentify")
    public native boolean supportsIdentify();
}
