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
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOutputStream;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.multipeerconnectivity.protocol.MCSessionDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MCSession
 * 
 * A MCSession facilitates communication among all peers in a multipeer
 * session.
 * 
 * To start a multipeer session with remote peers, a MCPeerID that
 * represents the local peer needs to be supplied to the init method.
 * 
 * Once a peer is added to the session on both sides, the delegate
 * callback -session:peer:didChangeState: will be called with
 * MCSessionStateConnected state for the remote peer.
 * 
 * Data messages can be sent to a connected peer with the -sendData:
 * toPeers:withMode:error: method.
 * 
 * The receiver of data messages will receive a delegate callback
 * -session:didReceiveData:fromPeer:.
 * 
 * Resources referenced by NSURL (e.g. a file) can be sent to a connected
 * peer with the -sendResourceAtURL:toPeer:withTimeout:completionHandler:
 * method. The completionHandler will be called when the resource is fully
 * received by the remote peer, or if an error occurred during
 * transmission. The receiver of data messages will receive a delegate
 * callbacks -session:didStartReceivingResourceWithName:fromPeer:
 * withProgress: when it starts receiving the resource and -session:
 * didFinishReceivingResourceWithName:fromPeer:atURL:withError:
 * when the resource has been fully received.
 * 
 * A byte stream can be sent to a connected peer with the
 * -startStreamWithName:toPeer:error: method. On success, an
 * NSOutputStream object is returned, and can be used to send bytes to
 * the remote peer once the stream is properly set up. The receiver of the
 * byte stream will receive a delegate callback -session:didReceiveStream:
 * withName:fromPeer:
 * 
 * Delegate calls occur on a private serial queue. If your app needs to
 * perform an action on a particular run loop or operation queue, its
 * delegate method should explicitly dispatch or schedule that work.
 * 
 * 
 * API-Since: 7.0
 */
@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MCSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MCSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MCSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MCSession allocWithZone(VoidPtr zone);

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
    public static native MCSession new_objc();

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
     * Cancel connection attempt with a peer.
     */
    @Generated
    @Selector("cancelConnectPeer:")
    public native void cancelConnectPeer(MCPeerID peerID);

    /**
     * Connect a peer to the session once connection data is received.
     */
    @Generated
    @Selector("connectPeer:withNearbyConnectionData:")
    public native void connectPeerWithNearbyConnectionData(MCPeerID peerID, NSData data);

    @Generated
    @Selector("connectedPeers")
    public native NSArray<? extends MCPeerID> connectedPeers();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MCSessionDelegate delegate();

    /**
     * Disconnect from the session.
     */
    @Generated
    @Selector("disconnect")
    public native void disconnect();

    @Generated
    @Selector("encryptionPreference")
    @NInt
    public native long encryptionPreference();

    @Generated
    @Selector("init")
    public native MCSession init();

    /**
     * Create a session with an MCPeerID for the local peer.
     */
    @Generated
    @Selector("initWithPeer:")
    public native MCSession initWithPeer(MCPeerID myPeerID);

    /**
     * Create a session with a security configuration. The securityIdentity argument is an array of
     * [ SecIdentityRef, [ zero or more additional certs ] ].
     */
    @Generated
    @Selector("initWithPeer:securityIdentity:encryptionPreference:")
    public native MCSession initWithPeerSecurityIdentityEncryptionPreference(MCPeerID myPeerID, NSArray<?> identity,
            @NInt long encryptionPreference);

    @Generated
    @Selector("myPeerID")
    public native MCPeerID myPeerID();

    /**
     * Gets the connection data for a remote peer.
     */
    @Generated
    @Selector("nearbyConnectionDataForPeer:withCompletionHandler:")
    public native void nearbyConnectionDataForPeerWithCompletionHandler(MCPeerID peerID,
            @ObjCBlock(name = "call_nearbyConnectionDataForPeerWithCompletionHandler") Block_nearbyConnectionDataForPeerWithCompletionHandler completionHandler);

    @Generated
    @Selector("securityIdentity")
    public native NSArray<?> securityIdentity();

    /**
     * Send a data message to a list of destination peers.
     */
    @Generated
    @Selector("sendData:toPeers:withMode:error:")
    public native boolean sendDataToPeersWithModeError(NSData data, NSArray<? extends MCPeerID> peerIDs,
            @NInt long mode, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Send a resource referenced by an NSURL to a remote peer. The resource
     * can be a file or an HTTP document. The completionHandler is called when
     * the resource is received by the remote peer or if an error occurred.
     * The remote peer will get a -session:didStartReceivingResourceWithName:
     * fromPeer:withProgress callback when it starts receiving the resource and
     * a -session:didFinishReceivingResourceWithName:fromPeer:atURL:withError:
     * when the resource has been fully received.
     * 
     * The primary mechanism for observing progress of the send should be to
     * create an NSProgress using +progressWithTotalUnitCount,
     * -becomeCurrentWithPendingUnitCount:, invoking this method, then calling
     * -resignCurrent. This is described in the NSProgress documentation.
     * Alternatively, if you wish to observe the progress directly instead
     * of incorporating it into a larger operation, you may observe the
     * NSProgress returned from this method.
     */
    @Generated
    @Selector("sendResourceAtURL:withName:toPeer:withCompletionHandler:")
    public native NSProgress sendResourceAtURLWithNameToPeerWithCompletionHandler(NSURL resourceURL,
            String resourceName, MCPeerID peerID,
            @ObjCBlock(name = "call_sendResourceAtURLWithNameToPeerWithCompletionHandler") Block_sendResourceAtURLWithNameToPeerWithCompletionHandler completionHandler);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) MCSessionDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) MCSessionDelegate value) {
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
     * Start a named byte stream with the remote peer.
     */
    @Generated
    @Selector("startStreamWithName:toPeer:error:")
    public native NSOutputStream startStreamWithNameToPeerError(String streamName, MCPeerID peerID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_nearbyConnectionDataForPeerWithCompletionHandler {
        @Generated
        void call_nearbyConnectionDataForPeerWithCompletionHandler(NSData connectionData, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendResourceAtURLWithNameToPeerWithCompletionHandler {
        @Generated
        void call_sendResourceAtURLWithNameToPeerWithCompletionHandler(NSError error);
    }
}
