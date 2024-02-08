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

package apple.corebluetooth;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CBMutableCharacteristic
 * 
 * Used to create a local characteristic, which can be added to the local database via <code>CBPeripheralManager</code>.
 * Once a characteristic
 * is published, it is cached and can no longer be changed.
 * If a characteristic value is specified, it will be cached and marked <code>CBCharacteristicPropertyRead</code> and
 * <code>CBAttributePermissionsReadable</code>. If a characteristic value needs to be writeable, or may change during
 * the lifetime of the
 * published <code>CBService</code>, it is considered a dynamic value and will be requested on-demand. Dynamic values
 * are identified by a
 * <i>value</i> of <i>nil</i>.
 */
@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CBMutableCharacteristic extends CBCharacteristic {
    static {
        NatJ.register();
    }

    @Generated
    protected CBMutableCharacteristic(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CBMutableCharacteristic alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CBMutableCharacteristic allocWithZone(VoidPtr zone);

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
    public static native CBMutableCharacteristic new_objc();

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

    @Nullable
    @Generated
    @Selector("descriptors")
    public native NSArray<? extends CBDescriptor> descriptors();

    @Generated
    @Selector("init")
    public native CBMutableCharacteristic init();

    /**
     * initWithType:properties:value:permissions
     * 
     * Returns an initialized characteristic.
     * 
     * 
     * API-Since: 6.0
     * 
     * @param UUID        The Bluetooth UUID of the characteristic.
     * @param properties  The properties of the characteristic.
     * @param value       The characteristic value to be cached. If <i>nil</i>, the value will be dynamic and requested
     *                    on-demand.
     * @param permissions The permissions of the characteristic value.
     */
    @Generated
    @Selector("initWithType:properties:value:permissions:")
    public native CBMutableCharacteristic initWithTypePropertiesValuePermissions(@NotNull CBUUID UUID,
            @NUInt long properties, @Nullable NSData value, @NUInt long permissions);

    /**
     * [@property] permissions
     * 
     * The permissions of the characteristic value.
     * 
     * @see CBAttributePermissions
     */
    @Generated
    @Selector("permissions")
    @NUInt
    public native long permissions();

    @Generated
    @Selector("properties")
    @NUInt
    public native long properties();

    @Generated
    @Selector("setDescriptors:")
    public native void setDescriptors(@Nullable NSArray<? extends CBDescriptor> value);

    /**
     * [@property] permissions
     * 
     * The permissions of the characteristic value.
     * 
     * @see CBAttributePermissions
     */
    @Generated
    @Selector("setPermissions:")
    public native void setPermissions(@NUInt long value);

    @Generated
    @Selector("setProperties:")
    public native void setProperties(@NUInt long value);

    @Generated
    @Selector("setValue:")
    public native void setValue(@Nullable NSData value);

    /**
     * [@property] subscribedCentrals
     * 
     * For notifying characteristics, the set of currently subscribed centrals.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("subscribedCentrals")
    public native NSArray<? extends CBCentral> subscribedCentrals();

    @Nullable
    @Generated
    @Selector("value")
    public native NSData value();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
