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

package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEIPv4Settings
 * 
 * The NEIPv4Settings class declares the programmatic interface for an object that contains IPv4 settings.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEIPv4Settings extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEIPv4Settings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEIPv4Settings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEIPv4Settings allocWithZone(VoidPtr zone);

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
    public static native NEIPv4Settings new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] addresses
     * 
     * An array of IPv4 addresses represented as dotted decimal strings. These addresses will be set on the virtual
     * interface used by the VPN tunnel.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("addresses")
    public native NSArray<String> addresses();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] excludedRoutes
     * 
     * An array of NEIPv4Route objects. Traffic matching these routes will be routed through the current primary
     * physical interface of the device.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("excludedRoutes")
    public native NSArray<? extends NEIPv4Route> excludedRoutes();

    /**
     * [@property] includedRoutes
     * 
     * An array of NEIPv4Route objects. Traffic matching these routes will be routed through the virtual interface used
     * by the VPN tunnel.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("includedRoutes")
    public native NSArray<? extends NEIPv4Route> includedRoutes();

    @Generated
    @Selector("init")
    public native NEIPv4Settings init();

    /**
     * initWithAddresses:subnetMasks:
     * 
     * Initialize a newly-allocated NEIPv4Settings object.
     * 
     * @param addresses   An array of IPv4 addresses represented as dotted decimal strings.
     * @param subnetMasks An array of IPv4 subnet masks represented as dotted decimal strings.
     * @return The initialized object.
     * 
     *         API-Since: 9.0
     */
    @Generated
    @Selector("initWithAddresses:subnetMasks:")
    public native NEIPv4Settings initWithAddressesSubnetMasks(@NotNull NSArray<String> addresses,
            @NotNull NSArray<String> subnetMasks);

    @Generated
    @Selector("initWithCoder:")
    public native NEIPv4Settings initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] excludedRoutes
     * 
     * An array of NEIPv4Route objects. Traffic matching these routes will be routed through the current primary
     * physical interface of the device.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setExcludedRoutes:")
    public native void setExcludedRoutes(@Nullable NSArray<? extends NEIPv4Route> value);

    /**
     * [@property] includedRoutes
     * 
     * An array of NEIPv4Route objects. Traffic matching these routes will be routed through the virtual interface used
     * by the VPN tunnel.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setIncludedRoutes:")
    public native void setIncludedRoutes(@Nullable NSArray<? extends NEIPv4Route> value);

    /**
     * [@property] subnetMasks
     * 
     * An array of IPv4 subnet masks represented as dotted decimal strings. These subnet masks will be set along with
     * their corresponding addresses from the addresses array on the virtual interface used by the VPN tunnel.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("subnetMasks")
    public native NSArray<String> subnetMasks();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
