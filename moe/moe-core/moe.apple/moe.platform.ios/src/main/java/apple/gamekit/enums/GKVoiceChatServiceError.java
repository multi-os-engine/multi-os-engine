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

package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class GKVoiceChatServiceError {
    @Generated public static final int InternalError = 0x00007D00;
    @Generated public static final int NoRemotePacketsError = 0x00007D01;
    @Generated public static final int UnableToConnectError = 0x00007D02;
    @Generated public static final int RemoteParticipantHangupError = 0x00007D03;
    @Generated public static final int InvalidCallIDError = 0x00007D04;
    @Generated public static final int AudioUnavailableError = 0x00007D05;
    @Generated public static final int UninitializedClientError = 0x00007D06;
    @Generated public static final int ClientMissingRequiredMethodsError = 0x00007D07;
    @Generated public static final int RemoteParticipantBusyError = 0x00007D08;
    @Generated public static final int RemoteParticipantCancelledError = 0x00007D09;
    @Generated public static final int RemoteParticipantResponseInvalidError = 0x00007D0A;
    @Generated public static final int RemoteParticipantDeclinedInviteError = 0x00007D0B;
    @Generated public static final int MethodCurrentlyInvalidError = 0x00007D0C;
    @Generated public static final int NetworkConfigurationError = 0x00007D0D;
    @Generated public static final int UnsupportedRemoteVersionError = 0x00007D0E;
    @Generated public static final int OutOfMemoryError = 0x00007D0F;
    @Generated public static final int InvalidParameterError = 0x00007D10;

    @Generated
    private GKVoiceChatServiceError() {
    }
}
