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

package ios.multipeerconnectivity;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.foundation.NSOutputStream;
import ios.foundation.NSProgress;
import ios.foundation.NSURL;
import ios.multipeerconnectivity.protocol.MCSessionDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native MCSession alloc();

	/**
	 * cancelConnectPeer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/cancelConnectPeer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelConnectPeer:")
	public native void cancelConnectPeer(MCPeerID peerID);

	/**
	 * connectPeer:withNearbyConnectionData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/connectPeer:withNearbyConnectionData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectPeer:withNearbyConnectionData:")
	public native void connectPeerWithNearbyConnectionData(MCPeerID peerID,
			NSData data);

	/**
	 * connectedPeers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/connectedPeers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectedPeers")
	public native NSArray<? extends MCPeerID> connectedPeers();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MCSessionDelegate delegate();

	/**
	 * disconnect</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/disconnect">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disconnect")
	public native void disconnect();

	/**
	 * encryptionPreference</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/encryptionPreference">iOS Dev Center</a>
	 */
	@Generated
	@Selector("encryptionPreference")
	@NInt
	public native long encryptionPreference();

	@Generated
	@Selector("init")
	public native MCSession init();

	/**
	 * initWithPeer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/initWithPeer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPeer:")
	public native MCSession initWithPeer(MCPeerID myPeerID);

	/**
	 * initWithPeer:securityIdentity:encryptionPreference:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/initWithPeer:securityIdentity:encryptionPreference:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPeer:securityIdentity:encryptionPreference:")
	public native MCSession initWithPeerSecurityIdentityEncryptionPreference(
			MCPeerID myPeerID, NSArray<?> identity, @NInt long encryptionPreference);

	/**
	 * myPeerID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/myPeerID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("myPeerID")
	public native MCPeerID myPeerID();

	/**
	 * nearbyConnectionDataForPeer:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/nearbyConnectionDataForPeer:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nearbyConnectionDataForPeer:withCompletionHandler:")
	public native void nearbyConnectionDataForPeerWithCompletionHandler(
			MCPeerID peerID,
			@ObjCBlock(name = "call_nearbyConnectionDataForPeerWithCompletionHandler") Block_nearbyConnectionDataForPeerWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_nearbyConnectionDataForPeerWithCompletionHandler {
		@Generated
		void call_nearbyConnectionDataForPeerWithCompletionHandler(
				NSData arg0, NSError arg1);
	}

	/**
	 * securityIdentity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/securityIdentity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("securityIdentity")
	public native NSArray<?> securityIdentity();

	/**
	 * sendData:toPeers:withMode:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/sendData:toPeers:withMode:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendData:toPeers:withMode:error:")
	public native boolean sendDataToPeersWithModeError(NSData data,
			NSArray<? extends MCPeerID> peerIDs, @NInt long mode, Ptr<NSError> error);

	/**
	 * sendResourceAtURL:withName:toPeer:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/sendResourceAtURL:withName:toPeer:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendResourceAtURL:withName:toPeer:withCompletionHandler:")
	public native NSProgress sendResourceAtURLWithNameToPeerWithCompletionHandler(
			NSURL resourceURL,
			String resourceName,
			MCPeerID peerID,
			@ObjCBlock(name = "call_sendResourceAtURLWithNameToPeerWithCompletionHandler") Block_sendResourceAtURLWithNameToPeerWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendResourceAtURLWithNameToPeerWithCompletionHandler {
		@Generated
		void call_sendResourceAtURLWithNameToPeerWithCompletionHandler(
				NSError arg0);
	}

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MCSessionDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instp/MCSession/delegate">iOS Dev Center</a>
	 */
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
	 * startStreamWithName:toPeer:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCSessionClassRef/index.html#//apple_ref/occ/instm/MCSession/startStreamWithName:toPeer:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startStreamWithName:toPeer:error:")
	public native NSOutputStream startStreamWithNameToPeerError(
			String streamName, MCPeerID peerID, Ptr<NSError> error);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
}
