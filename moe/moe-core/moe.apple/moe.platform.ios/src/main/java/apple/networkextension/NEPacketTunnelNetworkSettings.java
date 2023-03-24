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
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEPacketTunnelNetworkSettings
 * 
 * The NEPacketTunnelNetworkSettings class declares the programmatic interface for an object that contains IP network
 * settings.
 * 
 * NEPacketTunnelNetworkSettings is used by NEPacketTunnelProviders to communicate the desired IP network settings for
 * the packet tunnel to the framework. The framework takes care of applying the contained settings to the system.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEPacketTunnelNetworkSettings extends NETunnelNetworkSettings {
    static {
        NatJ.register();
    }

    @Generated
    protected NEPacketTunnelNetworkSettings(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEPacketTunnelNetworkSettings alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEPacketTunnelNetworkSettings allocWithZone(VoidPtr zone);

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
    public static native NEPacketTunnelNetworkSettings new_objc();

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
     * [@property] IPv4Settings
     * 
     * An NEIPv4Settings object that contains the desired tunnel IPv4 settings.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("IPv4Settings")
    public native NEIPv4Settings IPv4Settings();

    /**
     * [@property] IPv6Settings
     * 
     * An NEIPv6Settings object that contains the desired tunnel IPv6 settings.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("IPv6Settings")
    public native NEIPv6Settings IPv6Settings();

    /**
     * [@property] MTU
     * 
     * An NSNumber object containing the Maximum Transmission Unit (MTU) size in bytes to assign to the TUN interface.
     * If this property is set, the tunnelOverheadBytes property is ignored.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("MTU")
    public native NSNumber MTU();

    @Generated
    @Selector("init")
    public native NEPacketTunnelNetworkSettings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEPacketTunnelNetworkSettings initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithTunnelRemoteAddress:")
    public native NEPacketTunnelNetworkSettings initWithTunnelRemoteAddress(@NotNull String address);

    /**
     * [@property] IPv4Settings
     * 
     * An NEIPv4Settings object that contains the desired tunnel IPv4 settings.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setIPv4Settings:")
    public native void setIPv4Settings(@Nullable NEIPv4Settings value);

    /**
     * [@property] IPv6Settings
     * 
     * An NEIPv6Settings object that contains the desired tunnel IPv6 settings.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setIPv6Settings:")
    public native void setIPv6Settings(@Nullable NEIPv6Settings value);

    /**
     * [@property] MTU
     * 
     * An NSNumber object containing the Maximum Transmission Unit (MTU) size in bytes to assign to the TUN interface.
     * If this property is set, the tunnelOverheadBytes property is ignored.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setMTU:")
    public native void setMTU(@Nullable NSNumber value);

    /**
     * [@property] tunnelOverheadBytes
     * 
     * An NSNumber object containing the number of bytes of overhead appended to each outbound packet through the
     * tunnel. The MTU for the TUN interface is computed by subtracting this value from the MTU of the primary physical
     * interface.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setTunnelOverheadBytes:")
    public native void setTunnelOverheadBytes(@Nullable NSNumber value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] tunnelOverheadBytes
     * 
     * An NSNumber object containing the number of bytes of overhead appended to each outbound packet through the
     * tunnel. The MTU for the TUN interface is computed by subtracting this value from the MTU of the primary physical
     * interface.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("tunnelOverheadBytes")
    public native NSNumber tunnelOverheadBytes();
}
