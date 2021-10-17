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

package apple.watchconnectivity;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.watchconnectivity.protocol.WCSessionDelegate;
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
 * -------------------------------- WCSession --------------------------------
 * The default session is used to communicate between two counterpart apps
 * (i.e. iOS app and its native WatchKit extension). The session provides
 * methods for sending, receiving, and tracking state.
 * <p>
 * On start up an app should set a delegate on the default session and call
 * activate. This will allow the system to populate the state properties and
 * deliver any outstanding background transfers.
 */
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WCSession alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native WCSession allocWithZone(VoidPtr zone);

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

    /**
     * Use the default session for all transferring of content and state monitoring.
     */
    @Generated
    @Selector("defaultSession")
    public static native WCSession defaultSession();

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

    /**
     * Check if session is supported on this iOS device. Session is always available on WatchOS
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native WCSession new_objc();

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
     * The default session must be activated on startup before the session's properties contain correct values and will begin receiving delegate callbacks. Calling activate without a delegate set is undefined. If the WCSessionDelegate session:activationDidCompleteWithState:error: is implemented this method becomes an asynchronous call.
     */
    @Generated
    @Selector("activateSession")
    public native void activateSession();

    /**
     * The state of the current session
     */
    @Generated
    @Selector("activationState")
    @NInt
    public native long activationState();

    /**
     * Setting the applicationContext is a way to transfer the latest state of an app. After updating the applicationContext, the system initiates the data transfer at an appropriate time, which can occur after the app exits. The counterpart app will receive a delegate callback on next launch if the applicationContext has successfully arrived. If there is no app context, it should be updated with an empty dictionary. The applicationContext dictionary can only accept the property list types.
     */
    @Generated
    @Selector("applicationContext")
    public native NSDictionary<String, ?> applicationContext();

    /**
     * A delegate must exist before the session will allow sends.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native WCSessionDelegate delegate();

    /**
     * Whether or not there is more content for the session to deliver
     */
    @Generated
    @Selector("hasContentPending")
    public native boolean hasContentPending();

    @Generated
    @Selector("init")
    public native WCSession init();

    /**
     * Check if the user has the Watch app's complication enabled
     */
    @Generated
    @Selector("isComplicationEnabled")
    public native boolean isComplicationEnabled();

    /**
     * Check if iOS device is paired to a watch
     */
    @Generated
    @Selector("isPaired")
    public native boolean isPaired();

    /**
     * The counterpart app must be reachable for a send message to succeed.
     */
    @Generated
    @Selector("isReachable")
    public native boolean isReachable();

    /**
     * Check if the user has the Watch app installed
     */
    @Generated
    @Selector("isWatchAppInstalled")
    public native boolean isWatchAppInstalled();

    /**
     * Returns an array of file transfers that are still transferring (i.e. have not been cancelled, failed, or been received by the counterpart app).
     */
    @Generated
    @Selector("outstandingFileTransfers")
    public native NSArray<? extends WCSessionFileTransfer> outstandingFileTransfers();

    /**
     * Returns an array of user info transfers that are still transferring (i.e. have not been cancelled, failed, or been received by the counterpart app).
     */
    @Generated
    @Selector("outstandingUserInfoTransfers")
    public native NSArray<? extends WCSessionUserInfoTransfer> outstandingUserInfoTransfers();

    /**
     * Stores the most recently received applicationContext from the counterpart app.
     */
    @Generated
    @Selector("receivedApplicationContext")
    public native NSDictionary<String, ?> receivedApplicationContext();

    /**
     * The number of calls remaining to transferCurrentComplicationUserInfo: before the system starts transferring the complicationUserInfo as regular userInfos. If this is 0, the complicationUserInfo will be transferred as regular userInfos. Count will be 0 whenever the complication is not enabled
     */
    @Generated
    @Selector("remainingComplicationUserInfoTransfers")
    @NUInt
    public native long remainingComplicationUserInfoTransfers();

    /**
     * Clients can use this method to send messages to the counterpart app. Clients wishing to receive a reply to a particular message should pass in a replyHandler block. If the message cannot be sent or if the reply could not be received, the errorHandler block will be invoked with an error. If both a replyHandler and an errorHandler are specified, then exactly one of them will be invoked. Messages can only be sent while the sending app is running. If the sending app exits before the message is dispatched the send will fail. If the counterpart app is not running the counterpart app will be launched upon receiving the message (iOS counterpart app only). The message dictionary can only accept the property list types.
     */
    @Generated
    @Selector("sendMessage:replyHandler:errorHandler:")
    public native void sendMessageReplyHandlerErrorHandler(NSDictionary<String, ?> message,
            @ObjCBlock(name = "call_sendMessageReplyHandlerErrorHandler_1") Block_sendMessageReplyHandlerErrorHandler_1 replyHandler,
            @ObjCBlock(name = "call_sendMessageReplyHandlerErrorHandler_2") Block_sendMessageReplyHandlerErrorHandler_2 errorHandler);

    /**
     * Clients can use this method to send message data. All the policies of send message apply to send message data. Send message data is meant for clients that have an existing transfer format and do not need the convenience of the send message dictionary.
     */
    @Generated
    @Selector("sendMessageData:replyHandler:errorHandler:")
    public native void sendMessageDataReplyHandlerErrorHandler(NSData data,
            @ObjCBlock(name = "call_sendMessageDataReplyHandlerErrorHandler_1") Block_sendMessageDataReplyHandlerErrorHandler_1 replyHandler,
            @ObjCBlock(name = "call_sendMessageDataReplyHandlerErrorHandler_2") Block_sendMessageDataReplyHandlerErrorHandler_2 errorHandler);

    /**
     * A delegate must exist before the session will allow sends.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) WCSessionDelegate value);

    /**
     * A delegate must exist before the session will allow sends.
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
     * Enqueues a user info dictionary containing the most current information for an enabled complication. If the app's complication is enabled the system will try to transfer this user info immediately. Once a current complication user info is received the system will launch the Watch App Extension in the background and allow it to update the complication content. If the current user info cannot be transferred (i.e. devices disconnected, out of background launch budget, etc.) it will wait in the outstandingUserInfoTransfers queue until next opportune time. There can only be one current complication user info in the outstandingUserInfoTransfers queue. If a current complication user info is outstanding (waiting to transfer) and -transferCurrentComplicationUserInfo: is called again with new user info, the new user info will be tagged as current and the previously current user info will be untagged. The previous user info will however stay in the queue of outstanding transfers.
     */
    @Generated
    @Selector("transferCurrentComplicationUserInfo:")
    public native WCSessionUserInfoTransfer transferCurrentComplicationUserInfo(NSDictionary<String, ?> userInfo);

    /**
     * The system will enqueue the file and transfer it to the counterpart app at an opportune time. The transfer of a file will continue after the sending app has exited. The counterpart app will receive a delegate callback on next launch if the file has successfully arrived. The metadata dictionary can only accept the property list types.
     */
    @Generated
    @Selector("transferFile:metadata:")
    public native WCSessionFileTransfer transferFileMetadata(NSURL file, NSDictionary<String, ?> metadata);

    /**
     * The system will enqueue the user info dictionary and transfer it to the counterpart app at an opportune time. The transfer of user info will continue after the sending app has exited. The counterpart app will receive a delegate callback on next launch if the file has successfully arrived. The userInfo dictionary can only accept the property list types.
     */
    @Generated
    @Selector("transferUserInfo:")
    public native WCSessionUserInfoTransfer transferUserInfo(NSDictionary<String, ?> userInfo);

    @Generated
    @Selector("updateApplicationContext:error:")
    public native boolean updateApplicationContextError(NSDictionary<String, ?> applicationContext,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Use this directory to persist any data specific to the selected Watch. The location of the URL will change when the selected Watch changes. This directory will be deleted upon next launch if the watch app is uninstalled for the selected Watch, or that Watch is unpaired. If the watch app is not installed for the selected Watch the value will be nil.
     */
    @Generated
    @Selector("watchDirectoryURL")
    public native NSURL watchDirectoryURL();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageReplyHandlerErrorHandler_1 {
        @Generated
        void call_sendMessageReplyHandlerErrorHandler_1(NSDictionary<String, ?> replyMessage);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageReplyHandlerErrorHandler_2 {
        @Generated
        void call_sendMessageReplyHandlerErrorHandler_2(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageDataReplyHandlerErrorHandler_1 {
        @Generated
        void call_sendMessageDataReplyHandlerErrorHandler_1(NSData replyMessageData);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageDataReplyHandlerErrorHandler_2 {
        @Generated
        void call_sendMessageDataReplyHandlerErrorHandler_2(NSError error);
    }
}
