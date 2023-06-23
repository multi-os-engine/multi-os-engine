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
 * [@interface] NEIPv6Route
 * 
 * The NEIPv6Route class declares the programmatic interface for an object that contains settings for an IPv6 route.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEIPv6Route extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NEIPv6Route(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEIPv6Route alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEIPv6Route allocWithZone(VoidPtr zone);

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

    /**
     * defaultRoute
     * 
     * @return A route object that represents the IPv6 default route.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("defaultRoute")
    public static native NEIPv6Route defaultRoute();

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
    public static native NEIPv6Route new_objc();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] destinationAddress
     * 
     * An IPv6 address represented as a string.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("destinationAddress")
    public native String destinationAddress();

    /**
     * [@property] destinationNetworkPrefixLength
     * 
     * A number containing the length in bits of the network prefix of the destination network. This prefix in
     * combination with the destinationAddress property is used to determine the destination network of the route.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("destinationNetworkPrefixLength")
    public native NSNumber destinationNetworkPrefixLength();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] gatewayAddress
     * 
     * The IPv6 address of the route's gateway. If this property is nil then the route's gateway will be set to the
     * tunnel's virtual interface.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("gatewayAddress")
    public native String gatewayAddress();

    @Generated
    @Selector("init")
    public native NEIPv6Route init();

    @Generated
    @Selector("initWithCoder:")
    public native NEIPv6Route initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithDestinationAddress:networkPrefixLength:
     * 
     * Initialize a newly-allocated NEIPv6Route.
     * 
     * @param address             The IPv6 address of the destination network.
     * @param networkPrefixLength A number containing the length in bits of the network prefix of the destination
     *                            network.
     * @return The initialized NEIPv6Route.
     * 
     *         API-Since: 9.0
     */
    @Generated
    @Selector("initWithDestinationAddress:networkPrefixLength:")
    public native NEIPv6Route initWithDestinationAddressNetworkPrefixLength(@NotNull String address,
            @NotNull NSNumber networkPrefixLength);

    /**
     * [@property] gatewayAddress
     * 
     * The IPv6 address of the route's gateway. If this property is nil then the route's gateway will be set to the
     * tunnel's virtual interface.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setGatewayAddress:")
    public native void setGatewayAddress(@Nullable String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
