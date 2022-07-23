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

/**
 * ----------------------------- WCSessionDelegate -----------------------------
 * The session calls the delegate methods when content is received and session
 * state changes. All delegate methods will be called on the same queue. The
 * delegate queue is a non-main serial queue. It is the client's responsibility
 * to dispatch to another queue if neccessary.
 */
@Generated
@Library("WatchConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WCSessionDelegate")
public interface WCSessionDelegate {
    /**
     * Called when the session has completed activation. If session state is WCSessionActivationStateNotActivated there
     * will be an error with more details.
     */
    @Generated
    @Selector("session:activationDidCompleteWithState:error:")
    void sessionActivationDidCompleteWithStateError(WCSession session, @NInt long activationState, NSError error);

    /**
     * Called on the sending side after the file transfer has successfully completed or failed with an error. Will be
     * called on next launch if the sender was not running when the transfer finished.
     */
    @Generated
    @IsOptional
    @Selector("session:didFinishFileTransfer:error:")
    default void sessionDidFinishFileTransferError(WCSession session, WCSessionFileTransfer fileTransfer,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the sending side after the user info transfer has successfully completed or failed with an error. Will
     * be called on next launch if the sender was not running when the user info finished.
     */
    @Generated
    @IsOptional
    @Selector("session:didFinishUserInfoTransfer:error:")
    default void sessionDidFinishUserInfoTransferError(WCSession session, WCSessionUserInfoTransfer userInfoTransfer,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver. Will be called on startup if an applicationContext is available.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveApplicationContext:")
    default void sessionDidReceiveApplicationContext(WCSession session, NSDictionary<String, ?> applicationContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver. Will be called on startup if the file finished transferring when the
     * receiver was not running. The incoming file will be located in the Documents/Inbox/ folder when being delivered.
     * The receiver must take ownership of the file by moving it to another location. The system will remove any content
     * that has not been moved when this delegate method returns.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveFile:")
    default void sessionDidReceiveFile(WCSession session, WCSessionFile file) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver. Will be called on startup if the incoming message caused the receiver to
     * launch.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveMessage:")
    default void sessionDidReceiveMessage(WCSession session, NSDictionary<String, ?> message) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver when the sender sends a message that expects a reply. Will be called on
     * startup if the incoming message caused the receiver to launch.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveMessage:replyHandler:")
    default void sessionDidReceiveMessageReplyHandler(WCSession session, NSDictionary<String, ?> message,
            @ObjCBlock(name = "call_sessionDidReceiveMessageReplyHandler") Block_sessionDidReceiveMessageReplyHandler replyHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver. Will be called on startup if the incoming message data caused the
     * receiver to launch.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveMessageData:")
    default void sessionDidReceiveMessageData(WCSession session, NSData messageData) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver when the sender sends message data that expects a reply. Will be called on
     * startup if the incoming message data caused the receiver to launch.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveMessageData:replyHandler:")
    default void sessionDidReceiveMessageDataReplyHandler(WCSession session, NSData messageData,
            @ObjCBlock(name = "call_sessionDidReceiveMessageDataReplyHandler") Block_sessionDidReceiveMessageDataReplyHandler replyHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called on the delegate of the receiver. Will be called on startup if the user info finished transferring when the
     * receiver was not running.
     */
    @Generated
    @IsOptional
    @Selector("session:didReceiveUserInfo:")
    default void sessionDidReceiveUserInfo(WCSession session, NSDictionary<String, ?> userInfo) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the session can no longer be used to modify or add any new transfers and, all interactive messages
     * will be cancelled, but delegate callbacks for background transfers can still occur. This will happen when the
     * selected watch is being changed.
     */
    @Generated
    @Selector("sessionDidBecomeInactive:")
    void sessionDidBecomeInactive(WCSession session);

    /**
     * Called when all delegate callbacks for the previously selected watch has occurred. The session can be
     * re-activated for the now selected watch using activateSession.
     */
    @Generated
    @Selector("sessionDidDeactivate:")
    void sessionDidDeactivate(WCSession session);

    /**
     * Called when the reachable state of the counterpart app changes. The receiver should check the reachable property
     * on receiving this delegate callback.
     */
    @Generated
    @IsOptional
    @Selector("sessionReachabilityDidChange:")
    default void sessionReachabilityDidChange(WCSession session) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when any of the Watch state properties change.
     */
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
        void call_sessionDidReceiveMessageReplyHandler(NSDictionary<String, ?> replyMessage);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sessionDidReceiveMessageDataReplyHandler {
        @Generated
        void call_sessionDidReceiveMessageDataReplyHandler(NSData replyMessageData);
    }
}
