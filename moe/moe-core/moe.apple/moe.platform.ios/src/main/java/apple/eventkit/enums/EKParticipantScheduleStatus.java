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
 * [@enum]       EKParticipantScheduleStatus
 * 
 * Value representing the status of a meeting invite.
 * 
 * [@constant]   EKParticipantScheduleStatusNone                     Default value. Indicates that no
 *                                                                 invitation has been sent yet.
 * [@constant]   EKParticipantScheduleStatusPending                  The invitation is in the process of being
 *                                                                 sent.
 * [@constant]   EKParticipantScheduleStatusSent                     The invitation has been sent, but we have
 *                                                                 no way of determing if it was successfully
 *                                                                 delivered.
 * [@constant]   EKParticipantScheduleStatusDelivered                The invitation has been sent and
 *                                                                 successfully delivered.
 * [@constant]   EKParticipantScheduleStatusRecipientNotRecognized   The invitation wasn't delivered because we
 *                                                                 source doesn't recognize the recipient.
 * [@constant]   EKParticipantScheduleStatusNoPrivileges             The invitation wasn't delivered because of
 *                                                                 insufficient privileges.
 * [@constant]   EKParticipantScheduleStatusDeliveryFailed           The invitation wasn't delivered most
 *                                                                 likely due to a temporary failure.
 * [@constant]   EKParticipantScheduleStatusCannotDeliver            The invitation wasn't delivered because
 *                                                                 we're unsure how to deliver it. This is a
 *                                                                 permanent failure.
 * [@constant]   EKParticipantScheduleStatusRecipientNotAllowed      The invitation wasn't delivered because
 *                                                                 scheduling with the participant isn't
 *                                                                 allowed. This is a permanent failure.
 */
@Generated
public final class EKParticipantScheduleStatus {
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Pending = 0x0000000000000001L;
    @Generated @NInt public static final long Sent = 0x0000000000000002L;
    @Generated @NInt public static final long Delivered = 0x0000000000000003L;
    @Generated @NInt public static final long RecipientNotRecognized = 0x0000000000000004L;
    @Generated @NInt public static final long NoPrivileges = 0x0000000000000005L;
    @Generated @NInt public static final long DeliveryFailed = 0x0000000000000006L;
    @Generated @NInt public static final long CannotDeliver = 0x0000000000000007L;
    @Generated @NInt public static final long RecipientNotAllowed = 0x0000000000000008L;

    @Generated
    private EKParticipantScheduleStatus() {
    }
}
