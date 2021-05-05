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

package apple.usernotifications.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UNNotificationCategoryOptions {
    /**
     * Whether dismiss action should be sent to the UNUserNotificationCenter delegate
     */
    @Generated @NUInt public static final long CustomDismissAction = 0x0000000000000001L;
    /**
     * Whether notifications of this category should be allowed in CarPlay
     */
    @Generated @NUInt public static final long AllowInCarPlay = 0x0000000000000002L;

    @Generated
    private UNNotificationCategoryOptions() {
    }

    /**
     * Whether the title should be shown if the user has previews off
     */
    @Generated @NUInt public static final long HiddenPreviewsShowTitle = 0x0000000000000004L;
    /**
     * Whether the subtitle should be shown if the user has previews off
     */
    @Generated @NUInt public static final long HiddenPreviewsShowSubtitle = 0x0000000000000008L;
    /**
     * Whether notifications of this category should be allowed for announcing notifications
     */
    @Generated @NUInt public static final long AllowAnnouncement = 0x0000000000000010L;
}
