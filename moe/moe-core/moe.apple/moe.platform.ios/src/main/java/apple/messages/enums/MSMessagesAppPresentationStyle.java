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

package apple.messages.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MSMessagesAppPresentationStyle
 * <p>
 * Describes how the extension is presented in Messages.
 * [@constant] MSMessagesAppPresentationStyleCompact The extension's UI is presented compact in the keyboard area.
 * [@constant] MSMessagesAppPresentationStyleExpanded The extension's UI is presented expanded taking up most of the
 * screen.
 * [@constant] MSMessagesAppPresentationStyleTranscript The extension's UI is presented in the transcript of the
 * conversation in Messages.
 */
@Generated
public final class MSMessagesAppPresentationStyle {
    @Generated @NUInt public static final long Compact = 0x0000000000000000L;
    @Generated @NUInt public static final long Expanded = 0x0000000000000001L;

    @Generated
    private MSMessagesAppPresentationStyle() {
    }

    @Generated @NUInt public static final long Transcript = 0x0000000000000002L;
}
