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
 * [@enum] EKSpan
 * <p>
 * Values for controlling what occurrences to affect in a recurring event.
 * <p>
 * This enumerated type is used to indicate the scope of a change being made to a repeating event. EKSpanThisEvent
 * indicates the changes should apply only to this event, EKSpanFutureEvents indicates the changes should apply to
 * this event and all future events in the pattern.
 * [@constant] EKSpanThisEvent Affect this event only.
 * [@constant] EKSpanFutureEvents Affect this event and all after it.
 */
@Generated
public final class EKSpan {
    @Generated @NInt public static final long ThisEvent = 0x0000000000000000L;
    @Generated @NInt public static final long FutureEvents = 0x0000000000000001L;

    @Generated
    private EKSpan() {
    }
}
