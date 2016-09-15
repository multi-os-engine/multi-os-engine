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

package apple.gamekit.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.gamekit.GKVoiceChatService;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKVoiceChatClient")
public interface GKVoiceChatClient {
    /**
     * participantID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/participantID">iOS Dev Center</a>
     */
    @Generated
    @Selector("participantID")
    String participantID();

    /**
     * voiceChatService:didNotStartWithParticipantID:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/voiceChatService:didNotStartWithParticipantID:error:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("voiceChatService:didNotStartWithParticipantID:error:")
    default void voiceChatServiceDidNotStartWithParticipantIDError(GKVoiceChatService voiceChatService,
            String participantID, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * voiceChatService:didReceiveInvitationFromParticipantID:callID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/voiceChatService:didReceiveInvitationFromParticipantID:callID:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("voiceChatService:didReceiveInvitationFromParticipantID:callID:")
    default void voiceChatServiceDidReceiveInvitationFromParticipantIDCallID(GKVoiceChatService voiceChatService,
            String participantID, @NInt long callID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * voiceChatService:didStartWithParticipantID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/voiceChatService:didStartWithParticipantID:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("voiceChatService:didStartWithParticipantID:")
    default void voiceChatServiceDidStartWithParticipantID(GKVoiceChatService voiceChatService, String participantID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * voiceChatService:didStopWithParticipantID:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/voiceChatService:didStopWithParticipantID:error:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("voiceChatService:didStopWithParticipantID:error:")
    default void voiceChatServiceDidStopWithParticipantIDError(GKVoiceChatService voiceChatService,
            String participantID, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * voiceChatService:sendData:toParticipantID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/voiceChatService:sendData:toParticipantID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("voiceChatService:sendData:toParticipantID:")
    void voiceChatServiceSendDataToParticipantID(GKVoiceChatService voiceChatService, NSData data,
            String participantID);

    /**
     * voiceChatService:sendRealTimeData:toParticipantID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GameKit/Reference/GKVoiceChatClient_Protocol/index.html#//apple_ref/occ/intfm/GKVoiceChatClient/voiceChatService:sendRealTimeData:toParticipantID:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("voiceChatService:sendRealTimeData:toParticipantID:")
    default void voiceChatServiceSendRealTimeDataToParticipantID(GKVoiceChatService voiceChatService, NSData data,
            String participantID) {
        throw new java.lang.UnsupportedOperationException();
    }
}
