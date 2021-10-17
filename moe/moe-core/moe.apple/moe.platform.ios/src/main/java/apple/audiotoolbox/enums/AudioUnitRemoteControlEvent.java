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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]			AudioUnitRemoteControlEvent
 * <p>
 * In inter-app audio, messages to control the host's transport state.
 */
@Generated
public final class AudioUnitRemoteControlEvent {
    @Generated public static final int TogglePlayPause = 0x00000001;
    @Generated public static final int ToggleRecord = 0x00000002;
    @Generated public static final int Rewind = 0x00000003;

    @Generated
    private AudioUnitRemoteControlEvent() {
    }
}
