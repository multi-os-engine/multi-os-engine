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
public final class UIDatePickerMode {
    /**
     * Displays hour, minute, and optionally AM/PM designation depending on the locale setting (e.g. 6 | 53 | PM)
     */
    @Generated @NInt public static final long Time = 0x0000000000000000L;
    /**
     * Displays month, day, and year depending on the locale setting (e.g. November | 15 | 2007)
     */
    @Generated @NInt public static final long Date = 0x0000000000000001L;
    /**
     * Displays date, hour, minute, and optionally AM/PM designation depending on the locale setting (e.g. Wed Nov 15 | 6 | 53 | PM)
     */
    @Generated @NInt public static final long DateAndTime = 0x0000000000000002L;
    /**
     * Displays hour and minute (e.g. 1 | 53)
     */
    @Generated @NInt public static final long CountDownTimer = 0x0000000000000003L;

    @Generated
    private UIDatePickerMode() {
    }
}
