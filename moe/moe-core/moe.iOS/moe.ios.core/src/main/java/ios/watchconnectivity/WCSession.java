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

package ios.watchconnectivity;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.watchconnectivity.protocol.WCSessionDelegate;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("WatchConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WCSession extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected WCSession(Pointer peer) {
		super(peer);
	}

	/**
	 * activateSession</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/activateSession">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activateSession")
	public native void activateSession();

	@Generated
	@Owned
	@Selector("alloc")
	public static native WCSession alloc();

	/**
	 * applicationContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/applicationContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applicationContext")
	public native NSDictionary<String, ?> applicationContext();

	/**
	 * defaultSession</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/clm/WCSession/defaultSession">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultSession")
	public static native WCSession defaultSession();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native WCSessionDelegate delegate();

	@Generated
	@Selector("init")
	public native WCSession init();

	/**
	 * complicationEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/complicationEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isComplicationEnabled")
	public native boolean isComplicationEnabled();

	/**
	 * paired</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/paired">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPaired")
	public native boolean isPaired();

	/**
	 * reachable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/reachable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isReachable")
	public native boolean isReachable();

	/**
	 * isSupported</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/clm/WCSession/isSupported">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSupported")
	public static native boolean isSupported();

	/**
	 * watchAppInstalled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/watchAppInstalled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isWatchAppInstalled")
	public native boolean isWatchAppInstalled();

	/**
	 * outstandingFileTransfers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/outstandingFileTransfers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outstandingFileTransfers")
	public native NSArray<? extends WCSessionFileTransfer> outstandingFileTransfers();

	/**
	 * outstandingUserInfoTransfers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/outstandingUserInfoTransfers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outstandingUserInfoTransfers")
	public native NSArray<? extends WCSessionUserInfoTransfer> outstandingUserInfoTransfers();

	/**
	 * receivedApplicationContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/receivedApplicationContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("receivedApplicationContext")
	public native NSDictionary<String, ?> receivedApplicationContext();

	/**
	 * sendMessage:replyHandler:errorHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/sendMessage:replyHandler:errorHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendMessage:replyHandler:errorHandler:")
	public native void sendMessageReplyHandlerErrorHandler(NSDictionary<String, ?> message,
			@ObjCBlock(name = "call_sendMessageReplyHandlerErrorHandler_1") Block_sendMessageReplyHandlerErrorHandler_1 replyHandler,
			@ObjCBlock(name = "call_sendMessageReplyHandlerErrorHandler_2") Block_sendMessageReplyHandlerErrorHandler_2 errorHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendMessageReplyHandlerErrorHandler_1 {
		@Generated
		void call_sendMessageReplyHandlerErrorHandler_1(NSDictionary<String, ?> arg0);
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendMessageReplyHandlerErrorHandler_2 {
		@Generated
		void call_sendMessageReplyHandlerErrorHandler_2(NSError arg0);
	}

	/**
	 * sendMessageData:replyHandler:errorHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/sendMessageData:replyHandler:errorHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sendMessageData:replyHandler:errorHandler:")
	public native void sendMessageDataReplyHandlerErrorHandler(NSData data,
			@ObjCBlock(name = "call_sendMessageDataReplyHandlerErrorHandler_1") Block_sendMessageDataReplyHandlerErrorHandler_1 replyHandler,
			@ObjCBlock(name = "call_sendMessageDataReplyHandlerErrorHandler_2") Block_sendMessageDataReplyHandlerErrorHandler_2 errorHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendMessageDataReplyHandlerErrorHandler_1 {
		@Generated
		void call_sendMessageDataReplyHandlerErrorHandler_1(NSData arg0);
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_sendMessageDataReplyHandlerErrorHandler_2 {
		@Generated
		void call_sendMessageDataReplyHandlerErrorHandler_2(NSError arg0);
	}

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) WCSessionDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) WCSessionDelegate value) {
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
	 * transferCurrentComplicationUserInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/transferCurrentComplicationUserInfo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transferCurrentComplicationUserInfo:")
	public native WCSessionUserInfoTransfer transferCurrentComplicationUserInfo(NSDictionary<String, ?> userInfo);

	/**
	 * transferFile:metadata:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/transferFile:metadata:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transferFile:metadata:")
	public native WCSessionFileTransfer transferFileMetadata(NSURL file, NSDictionary<String, ?> metadata);

	/**
	 * transferUserInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/transferUserInfo:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transferUserInfo:")
	public native WCSessionUserInfoTransfer transferUserInfo(NSDictionary<String, ?> userInfo);

	/**
	 * updateApplicationContext:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instm/WCSession/updateApplicationContext:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateApplicationContext:error:")
	public native boolean updateApplicationContextError(NSDictionary<String, ?> applicationContext, Ptr<NSError> error);

	/**
	 * watchDirectoryURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/watchDirectoryURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("watchDirectoryURL")
	public native NSURL watchDirectoryURL();

	/**
	 * activationState</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WatchConnectivity/Reference/WCSession_class/index.html#//apple_ref/occ/instp/WCSession/activationState">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activationState")
	@NInt
	public native long activationState();

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
