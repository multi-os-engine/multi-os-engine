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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKSessionDelegate;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 3.0
 * Deprecated-Since: 7.0
 * Deprecated-Message: Use MCSession from the MultipeerConnectivity framework instead
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKSession allocWithZone(VoidPtr zone);

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
    public static native GKSession new_objc();

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
     * errors: cancelled, or timeout
     */
    @Generated
    @Selector("acceptConnectionFromPeer:error:")
    public native boolean acceptConnectionFromPeerError(String peerID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("cancelConnectToPeer:")
    public native void cancelConnectToPeer(String peerID);

    /**
     * Attempt connection to a remote peer. Remote peer gets a callback to
     * -session:didReceiveConnectionRequestFromPeer:.
     * 
     * Success results in a call to delegate -session:peer:didChangeState: GKPeerStateConnected
     * Failure results in a call to delegate -session:connectionWithPeerFailed:withError:
     */
    @Generated
    @Selector("connectToPeer:withTimeout:")
    public native void connectToPeerWithTimeout(String peerID, double timeout);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKSessionDelegate delegate();

    @Generated
    @Selector("denyConnectionFromPeer:")
    public native void denyConnectionFromPeer(String peerID);

    /**
     * Disconnect local peer
     */
    @Generated
    @Selector("disconnectFromAllPeers")
    public native void disconnectFromAllPeers();

    /**
     * Disconnect a peer from the session (the peer gets disconnected from all connected peers).
     */
    @Generated
    @Selector("disconnectPeerFromAllPeers:")
    public native void disconnectPeerFromAllPeers(String peerID);

    /**
     * default is 20 seconds
     */
    @Generated
    @Selector("disconnectTimeout")
    public native double disconnectTimeout();

    @Generated
    @Selector("displayName")
    public native String displayName();

    /**
     * Return the application chosen name of a specific peer
     */
    @Generated
    @Selector("displayNameForPeer:")
    public native String displayNameForPeer(String peerID);

    @Generated
    @Selector("init")
    public native GKSession init();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("initWithSessionID:displayName:sessionMode:")
    public native GKSession initWithSessionIDDisplayNameSessionMode(String sessionID, String name, int mode);

    /**
     * Toggle availability on the network based on session mode and search criteria. Delegate will get a callback
     * -session:didReceiveConnectionRequestFromPeer: when a peer attempts a connection.
     */
    @Generated
    @Selector("isAvailable")
    public native boolean isAvailable();

    /**
     * Toggle availability on the network based on session mode and search criteria. Delegate will get a callback
     * -session:didReceiveConnectionRequestFromPeer: when a peer attempts a connection.
     */
    @Generated
    @Selector("setAvailable:")
    public native void setAvailable(boolean value);

    /**
     * session's peerID
     */
    @Generated
    @Selector("peerID")
    public native String peerID();

    /**
     * Returns peers according to connection state
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("peersWithConnectionState:")
    public native NSArray<?> peersWithConnectionState(int state);

    /**
     * Asynchronous delivery of data to one or more peers. Returns YES if delivery started, NO if unable to start
     * sending, and error will be set. Delivery will be reliable or unreliable as set by mode.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sendData:toPeers:withDataMode:error:")
    public native boolean sendDataToPeersWithDataModeError(NSData data, NSArray<?> peers, int mode,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * errors: buffer full, data too big
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sendDataToAllPeers:withDataMode:error:")
    public native boolean sendDataToAllPeersWithDataModeError(NSData data, int mode,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("sessionID")
    public native String sessionID();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sessionMode")
    public native int sessionMode();

    /**
     * SEL = -receiveData:fromPeer:inSession:context:
     */
    @Generated
    @Selector("setDataReceiveHandler:withContext:")
    public native void setDataReceiveHandlerWithContext(@Mapped(ObjCObjectMapper.class) Object handler,
            VoidPtr context);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) GKSessionDelegate value);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) GKSessionDelegate value) {
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
     * default is 20 seconds
     */
    @Generated
    @Selector("setDisconnectTimeout:")
    public native void setDisconnectTimeout(double value);
}
