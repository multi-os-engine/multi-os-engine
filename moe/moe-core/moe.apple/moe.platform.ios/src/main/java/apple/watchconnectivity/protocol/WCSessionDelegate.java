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

package apple.watchconnectivity.protocol;

import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.watchconnectivity.WCSession;
import apple.watchconnectivity.WCSessionFile;
import apple.watchconnectivity.WCSessionFileTransfer;
import apple.watchconnectivity.WCSessionUserInfoTransfer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("WatchConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WCSessionDelegate")
public interface WCSessionDelegate {
    @Generated
    @Selector("session:activationDidCompleteWithState:error:")
    void sessionActivationDidCompleteWithStateError(WCSession session, @NInt long activationState, NSError error);

    @Generated
    @IsOptional
    @Selector("session:didFinishFileTransfer:error:")
    default void sessionDidFinishFileTransferError(WCSession session, WCSessionFileTransfer fileTransfer,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didFinishUserInfoTransfer:error:")
    default void sessionDidFinishUserInfoTransferError(WCSession session, WCSessionUserInfoTransfer userInfoTransfer,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveApplicationContext:")
    default void sessionDidReceiveApplicationContext(WCSession session, NSDictionary<String, ?> applicationContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveFile:")
    default void sessionDidReceiveFile(WCSession session, WCSessionFile file) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveMessage:")
    default void sessionDidReceiveMessage(WCSession session, NSDictionary<String, ?> message) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveMessage:replyHandler:")
    default void sessionDidReceiveMessageReplyHandler(WCSession session, NSDictionary<String, ?> message,
            @ObjCBlock(name = "call_sessionDidReceiveMessageReplyHandler") Block_sessionDidReceiveMessageReplyHandler replyHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveMessageData:")
    default void sessionDidReceiveMessageData(WCSession session, NSData messageData) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveMessageData:replyHandler:")
    default void sessionDidReceiveMessageDataReplyHandler(WCSession session, NSData messageData,
            @ObjCBlock(name = "call_sessionDidReceiveMessageDataReplyHandler") Block_sessionDidReceiveMessageDataReplyHandler replyHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("session:didReceiveUserInfo:")
    default void sessionDidReceiveUserInfo(WCSession session, NSDictionary<String, ?> userInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("sessionDidBecomeInactive:")
    void sessionDidBecomeInactive(WCSession session);

    @Generated
    @Selector("sessionDidDeactivate:")
    void sessionDidDeactivate(WCSession session);

    @Generated
    @IsOptional
    @Selector("sessionReachabilityDidChange:")
    default void sessionReachabilityDidChange(WCSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sessionWatchStateDidChange:")
    default void sessionWatchStateDidChange(WCSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionDidReceiveMessageReplyHandler {
        @Generated
        void call_sessionDidReceiveMessageReplyHandler(NSDictionary<String, ?> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionDidReceiveMessageDataReplyHandler {
        @Generated
        void call_sessionDidReceiveMessageDataReplyHandler(NSData arg0);
    }
}
