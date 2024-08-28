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

package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants that describe the state of individual participants in the match
 */
@Generated
public final class GKTurnBasedParticipantStatus {
    /**
     * Statuses that are set by GameKit
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * a participant has been invited but not yet responded
     */
    @Generated @NInt public static final long Invited = 0x0000000000000001L;
    /**
     * a participant that has declined an invite to this match
     */
    @Generated @NInt public static final long Declined = 0x0000000000000002L;
    /**
     * a participant that is waiting to be matched
     */
    @Generated @NInt public static final long Matching = 0x0000000000000003L;
    /**
     * a participant that is active in this match
     */
    @Generated @NInt public static final long Active = 0x0000000000000004L;
    /**
     * a participant is done with this session
     */
    @Generated @NInt public static final long Done = 0x0000000000000005L;

    @Generated
    private GKTurnBasedParticipantStatus() {
    }
}
