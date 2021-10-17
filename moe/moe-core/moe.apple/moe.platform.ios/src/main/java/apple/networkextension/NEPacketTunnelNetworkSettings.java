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

/**
 * [@interface] NEPacketTunnelNetworkSettings
 * <p>
 * The NEPacketTunnelNetworkSettings class declares the programmatic interface for an object that contains IP network settings.
 * <p>
 * NEPacketTunnelNetworkSettings is used by NEPacketTunnelProviders to communicate the desired IP network settings for the packet tunnel to the framework. The framework takes care of applying the contained settings to the system.
 * <p>
 * Instances of this class are thread safe.
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

    @Generated
    @Selector("allocWithZone:")
    public static native NEPacketTunnelNetworkSettings allocWithZone(VoidPtr zone);

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
     * <p>
     * An NEIPv4Settings object that contains the desired tunnel IPv4 settings.
     */
    @Generated
    @Selector("IPv4Settings")
    public native NEIPv4Settings IPv4Settings();

    /**
     * [@property] IPv6Settings
     * <p>
     * An NEIPv6Settings object that contains the desired tunnel IPv6 settings.
     */
    @Generated
    @Selector("IPv6Settings")
    public native NEIPv6Settings IPv6Settings();

    /**
     * [@property] MTU
     * <p>
     * An NSNumber object containing the Maximum Transmission Unit (MTU) size in bytes to assign to the TUN interface. If this property is set, the tunnelOverheadBytes property is ignored.
     */
    @Generated
    @Selector("MTU")
    public native NSNumber MTU();

    @Generated
    @Selector("init")
    public native NEPacketTunnelNetworkSettings init();

    @Generated
    @Selector("initWithCoder:")
    public native NEPacketTunnelNetworkSettings initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithTunnelRemoteAddress:")
    public native NEPacketTunnelNetworkSettings initWithTunnelRemoteAddress(String address);

    /**
     * [@property] IPv4Settings
     * <p>
     * An NEIPv4Settings object that contains the desired tunnel IPv4 settings.
     */
    @Generated
    @Selector("setIPv4Settings:")
    public native void setIPv4Settings(NEIPv4Settings value);

    /**
     * [@property] IPv6Settings
     * <p>
     * An NEIPv6Settings object that contains the desired tunnel IPv6 settings.
     */
    @Generated
    @Selector("setIPv6Settings:")
    public native void setIPv6Settings(NEIPv6Settings value);

    /**
     * [@property] MTU
     * <p>
     * An NSNumber object containing the Maximum Transmission Unit (MTU) size in bytes to assign to the TUN interface. If this property is set, the tunnelOverheadBytes property is ignored.
     */
    @Generated
    @Selector("setMTU:")
    public native void setMTU(NSNumber value);

    /**
     * [@property] tunnelOverheadBytes
     * <p>
     * An NSNumber object containing the number of bytes of overhead appended to each outbound packet through the tunnel. The MTU for the TUN interface is computed by subtracting this value from the MTU of the primary physical interface.
     */
    @Generated
    @Selector("setTunnelOverheadBytes:")
    public native void setTunnelOverheadBytes(NSNumber value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] tunnelOverheadBytes
     * <p>
     * An NSNumber object containing the number of bytes of overhead appended to each outbound packet through the tunnel. The MTU for the TUN interface is computed by subtracting this value from the MTU of the primary physical interface.
     */
    @Generated
    @Selector("tunnelOverheadBytes")
    public native NSNumber tunnelOverheadBytes();
}
