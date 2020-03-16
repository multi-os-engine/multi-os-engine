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
public final class UIModalPresentationStyle {
    @Generated @NInt public static final long FullScreen = 0x0000000000000000L;
    @Generated @NInt public static final long PageSheet = 0x0000000000000001L;
    @Generated @NInt public static final long FormSheet = 0x0000000000000002L;
    @Generated @NInt public static final long CurrentContext = 0x0000000000000003L;
    @Generated @NInt public static final long Custom = 0x0000000000000004L;
    @Generated @NInt public static final long OverFullScreen = 0x0000000000000005L;
    @Generated @NInt public static final long OverCurrentContext = 0x0000000000000006L;
    @Generated @NInt public static final long Popover = 0x0000000000000007L;
    @Generated @NInt public static final long None = 0xFFFFFFFFFFFFFFFFL;

    @Generated
    private UIModalPresentationStyle() {
    }

    @Generated @NInt public static final long Automatic = 0xFFFFFFFFFFFFFFFEL;
}
