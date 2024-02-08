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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * All clients will need to implement this protocol
 * 
 * API-Since: 3.0
 * Deprecated-Since: 7.0
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKVoiceChatClient")
public interface GKVoiceChatClient {
    /**
     * must be sent within some reasonble period of time and should accept at least 512 bytes.
     */
    @NotNull
    @Generated
    @Selector("participantID")
    String participantID();

    @Generated
    @IsOptional
    @Selector("voiceChatService:didNotStartWithParticipantID:error:")
    default void voiceChatServiceDidNotStartWithParticipantIDError(@NotNull GKVoiceChatService voiceChatService,
            @NotNull String participantID, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("voiceChatService:didReceiveInvitationFromParticipantID:callID:")
    default void voiceChatServiceDidReceiveInvitationFromParticipantIDCallID(
            @NotNull GKVoiceChatService voiceChatService, @NotNull String participantID, @NInt long callID) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("voiceChatService:didStartWithParticipantID:")
    default void voiceChatServiceDidStartWithParticipantID(@NotNull GKVoiceChatService voiceChatService,
            @NotNull String participantID) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("voiceChatService:didStopWithParticipantID:error:")
    default void voiceChatServiceDidStopWithParticipantIDError(@NotNull GKVoiceChatService voiceChatService,
            @NotNull String participantID, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * this channel will only be used to setup voice chat, and not to send audio data. The only requirement is that
     * messages are sent and received within a few (1-2) seconds time.
     */
    @Generated
    @Selector("voiceChatService:sendData:toParticipantID:")
    void voiceChatServiceSendDataToParticipantID(@NotNull GKVoiceChatService voiceChatService, @NotNull NSData data,
            @NotNull String participantID);

    /**
     * should be sent immediately with no delay on a UDP peer-to-peer connection.
     * If this method is implemented, then the Voice Chat Service will not attempt to set up a peer-to-peer connection.
     * And will rely on this one. To transmit audio.
     */
    @Generated
    @IsOptional
    @Selector("voiceChatService:sendRealTimeData:toParticipantID:")
    default void voiceChatServiceSendRealTimeDataToParticipantID(@NotNull GKVoiceChatService voiceChatService,
            @NotNull NSData data, @NotNull String participantID) {
        throw new java.lang.UnsupportedOperationException();
    }
}
