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

package apple.eventkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]       EKReminderPriority
 * <p>
 * A priority for a reminder.
 * <p>
 * RFC 5545 allows priority to be specified with an integer in the range of 0-9,
 * with 0 representing an undefined priority, 1 the highest priority, and 9 the lowest priority.
 * Clients are encouraged to use these values when setting a reminders's priority,
 * but is is possible to specify any integer value from 0 to 9.
 * <p>
 * [@constant]   EKReminderPriorityNone          The reminder has no priority set.
 * [@constant]   EKReminderPriorityHigh          The reminder is high priority.
 * [@constant]   EKReminderPriorityMedium        The reminder is medium priority.
 * [@constant]   EKReminderPriorityLow           The reminder is low priority.
 */
@Generated
public final class EKReminderPriority {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long High = 0x0000000000000001L;
    @Generated @NUInt public static final long Medium = 0x0000000000000005L;
    @Generated @NUInt public static final long Low = 0x0000000000000009L;

    @Generated
    private EKReminderPriority() {
    }
}
