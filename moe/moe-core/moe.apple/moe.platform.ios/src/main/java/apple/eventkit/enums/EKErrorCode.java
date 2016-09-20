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
import org.moe.natj.general.ann.NInt;

@Generated
public final class EKErrorCode {
    @NInt @Generated public static final long EventNotMutable = 0x0000000000000000L;
    @NInt @Generated public static final long NoCalendar = 0x0000000000000001L;
    @NInt @Generated public static final long NoStartDate = 0x0000000000000002L;
    @NInt @Generated public static final long NoEndDate = 0x0000000000000003L;
    @NInt @Generated public static final long DatesInverted = 0x0000000000000004L;
    @NInt @Generated public static final long InternalFailure = 0x0000000000000005L;
    @NInt @Generated public static final long CalendarReadOnly = 0x0000000000000006L;
    @NInt @Generated public static final long DurationGreaterThanRecurrence = 0x0000000000000007L;
    @NInt @Generated public static final long AlarmGreaterThanRecurrence = 0x0000000000000008L;
    @NInt @Generated public static final long StartDateTooFarInFuture = 0x0000000000000009L;
    @NInt @Generated public static final long StartDateCollidesWithOtherOccurrence = 0x000000000000000AL;
    @NInt @Generated public static final long ObjectBelongsToDifferentStore = 0x000000000000000BL;
    @NInt @Generated public static final long InvitesCannotBeMoved = 0x000000000000000CL;
    @NInt @Generated public static final long InvalidSpan = 0x000000000000000DL;
    @NInt @Generated public static final long CalendarHasNoSource = 0x000000000000000EL;
    @NInt @Generated public static final long CalendarSourceCannotBeModified = 0x000000000000000FL;
    @NInt @Generated public static final long CalendarIsImmutable = 0x0000000000000010L;
    @NInt @Generated public static final long SourceDoesNotAllowCalendarAddDelete = 0x0000000000000011L;
    @NInt @Generated public static final long RecurringReminderRequiresDueDate = 0x0000000000000012L;
    @NInt @Generated public static final long StructuredLocationsNotSupported = 0x0000000000000013L;
    @NInt @Generated public static final long ReminderLocationsNotSupported = 0x0000000000000014L;
    @NInt @Generated public static final long AlarmProximityNotSupported = 0x0000000000000015L;
    @NInt @Generated public static final long CalendarDoesNotAllowEvents = 0x0000000000000016L;
    @NInt @Generated public static final long CalendarDoesNotAllowReminders = 0x0000000000000017L;
    @NInt @Generated public static final long SourceDoesNotAllowReminders = 0x0000000000000018L;
    @NInt @Generated public static final long PriorityIsInvalid = 0x000000000000001AL;
    @NInt @Generated public static final long InvalidEntityType = 0x000000000000001BL;
    @NInt @Generated public static final long Last = 0x000000000000001FL;
    @Generated @NInt public static final long SourceDoesNotAllowEvents = 0x0000000000000019L;
    @Generated @NInt public static final long ProcedureAlarmsNotMutable = 0x000000000000001CL;
    @Generated @NInt public static final long EventStoreNotAuthorized = 0x000000000000001DL;
    @Generated @NInt public static final long OSNotSupported = 0x000000000000001EL;

    @Generated
    private EKErrorCode() {
    }
}
