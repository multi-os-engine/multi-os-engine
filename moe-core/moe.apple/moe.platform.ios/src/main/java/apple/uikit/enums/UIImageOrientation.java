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
public final class UIImageOrientation {
    /**
     * default orientation
     */
    @Generated @NInt public static final long Up = 0x0000000000000000L;
    /**
     * 180 deg rotation
     */
    @Generated @NInt public static final long Down = 0x0000000000000001L;
    /**
     * 90 deg CCW
     */
    @Generated @NInt public static final long Left = 0x0000000000000002L;
    /**
     * 90 deg CW
     */
    @Generated @NInt public static final long Right = 0x0000000000000003L;
    /**
     * as above but image mirrored along other axis. horizontal flip
     */
    @Generated @NInt public static final long UpMirrored = 0x0000000000000004L;
    /**
     * horizontal flip
     */
    @Generated @NInt public static final long DownMirrored = 0x0000000000000005L;
    /**
     * vertical flip
     */
    @Generated @NInt public static final long LeftMirrored = 0x0000000000000006L;
    /**
     * vertical flip
     */
    @Generated @NInt public static final long RightMirrored = 0x0000000000000007L;

    @Generated
    private UIImageOrientation() {
    }
}
