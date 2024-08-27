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

package apple.usernotificationsui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Constants indicating the type of media button to display.
 * 
 * API-Since: 10.0
 */
@Generated
public final class UNNotificationContentExtensionMediaPlayPauseButtonType {
    /**
     * No media button.
     * 
     * Specify this option when you don't want a media button. This is the
     * default option.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * A standard play/pause button.
     * 
     * This button is always visible. When tapped, its appearance changes
     * between the play and pause icons and triggers the appropriate play and
     * pause actions.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000001L;
    /**
     * A partially transparent play/pause button that is layered on top of your
     * media content.
     * 
     * This button draws a play icon over the content initially. When playback
     * begins, the button disappears. Tapping the content again pauses playback and
     * displays the play button again.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Overlay = 0x0000000000000002L;

    @Generated
    private UNNotificationContentExtensionMediaPlayPauseButtonType() {
    }
}
