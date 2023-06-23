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

package apple.multipeerconnectivity;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.multipeerconnectivity.protocol.MCNearbyServiceAdvertiserDelegate;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MCNearbyServiceAdvertiser
 * 
 * MCNearbyServiceAdvertiser advertises availability of the local peer,
 * and handles invitations from nearby peers.
 * 
 * To create the MCNearbyServiceAdvertiser object and start advertising
 * to nearby peers, a new MCPeerID should be created to
 * represent the local peer, and a service type needs to be specified.
 * 
 * The serviceType parameter is a short text string used to describe the
 * app's networking protocol. It should be in the same format as a
 * Bonjour service type: up to 15 characters long and valid characters
 * include ASCII lowercase letters, numbers, and the hyphen. A short
 * name that distinguishes itself from unrelated services is recommended;
 * for example, a text chat app made by ABC company could use the service
 * type "abc-txtchat". For more detailed information about service type
 * restrictions, see RFC 6335, Section 5.1.
 * 
 * The discoveryInfo parameter is a dictionary of string key/value pairs
 * that will be advertised for browsers to see. Both keys and values must
 * be NSString objects. The content of discoveryInfo will be advertised
 * within Bonjour TXT records, and keeping the dictionary small is good
 * for keeping network traffic low.
 * 
 * MCNearbyServiceAdvertiser must be initialized with an MCPeerID object
 * and a valid service type. The discoveryInfo parameter is optional and
 * may be nil.
 * 
 * A delegate that conforms to the MCNearbyServiceAdvertiserDelegate protocol
 * must be provided. No assumption should be made as to which queue the
 * callbacks are called on.
 * 
 * See Bonjour APIs https://developer.apple.com/bonjour/ for more
 * information about service types.
 * 
 * 
 * API-Since: 7.0
 */
@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MCNearbyServiceAdvertiser extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MCNearbyServiceAdvertiser(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MCNearbyServiceAdvertiser alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MCNearbyServiceAdvertiser allocWithZone(VoidPtr zone);

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
    public static native MCNearbyServiceAdvertiser new_objc();

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MCNearbyServiceAdvertiserDelegate delegate();

    @Nullable
    @Generated
    @Selector("discoveryInfo")
    public native NSDictionary<String, String> discoveryInfo();

    @Generated
    @Selector("init")
    public native MCNearbyServiceAdvertiser init();

    @Generated
    @Selector("initWithPeer:discoveryInfo:serviceType:")
    public native MCNearbyServiceAdvertiser initWithPeerDiscoveryInfoServiceType(@NotNull MCPeerID myPeerID,
            @Nullable NSDictionary<String, String> info, @NotNull String serviceType);

    @NotNull
    @Generated
    @Selector("myPeerID")
    public native MCPeerID myPeerID();

    @NotNull
    @Generated
    @Selector("serviceType")
    public native String serviceType();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) MCNearbyServiceAdvertiserDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) MCNearbyServiceAdvertiserDelegate value) {
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
     * The methods -startAdvertisingPeer and -stopAdvertisingPeer are used to
     * start and stop announcing presence to nearby browsing peers.
     */
    @Generated
    @Selector("startAdvertisingPeer")
    public native void startAdvertisingPeer();

    @Generated
    @Selector("stopAdvertisingPeer")
    public native void stopAdvertisingPeer();
}
