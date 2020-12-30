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

/**
 * @enum       EKCalendarType
 * @abstract   An enum representing the type of a calendar.
 * 
 * @constant   EKCalendarTypeLocal        This calendar is sync'd from either Mobile Me or tethered.
 * @constant   EKCalendarTypeCalDAV       This calendar is from a CalDAV server.
 * @constant   EKCalendarTypeExchange     This calendar comes from an Exchange server.
 * @constant   EKCalendarTypeSubscription This is a locally subscribed calendar.
 * @constant   EKCalendarTypeBirthday     This is the built-in birthday calendar.
 */
@Generated
public final class EKCalendarType {
    @Generated @NInt public static final long Local = 0x0000000000000000L;
    @Generated @NInt public static final long CalDAV = 0x0000000000000001L;
    @Generated @NInt public static final long Exchange = 0x0000000000000002L;
    @Generated @NInt public static final long Subscription = 0x0000000000000003L;
    @Generated @NInt public static final long Birthday = 0x0000000000000004L;

    @Generated
    private EKCalendarType() {
    }
}
