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
import org.moe.natj.general.ann.NInt;

@Generated
public final class UITableViewRowAnimation {
    @Generated @NInt public static final long Fade = 0x0000000000000000L;
    /**
     * slide in from right (or out to right)
     */
    @Generated @NInt public static final long Right = 0x0000000000000001L;
    @Generated @NInt public static final long Left = 0x0000000000000002L;
    @Generated @NInt public static final long Top = 0x0000000000000003L;
    @Generated @NInt public static final long Bottom = 0x0000000000000004L;
    /**
     * available in iOS 3.0
     */
    @Generated @NInt public static final long None = 0x0000000000000005L;
    /**
     * available in iOS 3.2.  attempts to keep cell centered in the space it will/did occupy
     */
    @Generated @NInt public static final long Middle = 0x0000000000000006L;
    /**
     * available in iOS 5.0.  chooses an appropriate animation style for you
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000064L;

    @Generated
    private UITableViewRowAnimation() {
    }
}
