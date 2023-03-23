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

package apple.mediaplayer.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 7.1
 */
@Generated
public final class MPRemoteCommandHandlerStatus {
    /**
     * There was no error executing the requested command.
     * 
     * API-Since: 7.1
     */
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    /**
     * The command could not be executed because the requested content does not
     * exist in the current application state.
     * 
     * API-Since: 7.1
     */
    @Generated @NInt public static final long NoSuchContent = 0x0000000000000064L;
    /**
     * The command could not be executed because there is no now playing item
     * available that is required for this command. As an example, an
     * application would return this error code if an "enable language option"
     * command is received, but nothing is currently playing.
     * 
     * API-Since: 9.1
     */
    @Generated @NInt public static final long NoActionableNowPlayingItem = 0x000000000000006EL;
    /**
     * The command could not be executed for another reason.
     * 
     * API-Since: 7.1
     */
    @Generated @NInt public static final long CommandFailed = 0x00000000000000C8L;

    @Generated
    private MPRemoteCommandHandlerStatus() {
    }

    /**
     * The command could not be executed because a device required
     * is not available. For instance, if headphones are required, or if a watch
     * app realizes that it needs the companion to fulfull a request.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long DeviceNotFound = 0x0000000000000078L;
}
