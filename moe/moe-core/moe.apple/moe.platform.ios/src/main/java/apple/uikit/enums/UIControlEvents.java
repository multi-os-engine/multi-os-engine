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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UIControlEvents {
    @Generated
    private UIControlEvents() {
    }

    @Generated @NUInt public static final long TouchDown = 0x0000000000000001L;
    @Generated @NUInt public static final long TouchDownRepeat = 0x0000000000000002L;
    @Generated @NUInt public static final long TouchDragInside = 0x0000000000000004L;
    @Generated @NUInt public static final long TouchDragOutside = 0x0000000000000008L;
    @Generated @NUInt public static final long TouchDragEnter = 0x0000000000000010L;
    @Generated @NUInt public static final long TouchDragExit = 0x0000000000000020L;
    @Generated @NUInt public static final long TouchUpInside = 0x0000000000000040L;
    @Generated @NUInt public static final long TouchUpOutside = 0x0000000000000080L;
    @Generated @NUInt public static final long TouchCancel = 0x0000000000000100L;
    @Generated @NUInt public static final long ValueChanged = 0x0000000000001000L;
    @Generated @NUInt public static final long EditingDidBegin = 0x0000000000010000L;
    @Generated @NUInt public static final long EditingChanged = 0x0000000000020000L;
    @Generated @NUInt public static final long EditingDidEnd = 0x0000000000040000L;
    @Generated @NUInt public static final long EditingDidEndOnExit = 0x0000000000080000L;
    @Generated @NUInt public static final long AllTouchEvents = 0x0000000000000FFFL;
    @Generated @NUInt public static final long AllEditingEvents = 0x00000000000F0000L;
    @Generated @NUInt public static final long ApplicationReserved = 0x000000000F000000L;
    @Generated @NUInt public static final long SystemReserved = 0x00000000F0000000L;
    @Generated @NUInt public static final long AllEvents = 0x00000000FFFFFFFFL;
    @Generated @NUInt public static final long PrimaryActionTriggered = 0x0000000000002000L;
}
