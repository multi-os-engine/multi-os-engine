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
 * Constants that describe the game result for a given participant who has reached the done state. The developer is free
 * to use these constants or add additional ones
 * 
 * API-Since: 5.0
 */
@Generated
public final class GKTurnBasedMatchOutcome {
    /**
     * Participants who are not done with a match have this state
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Participant quit
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Quit = 0x0000000000000001L;
    /**
     * Participant won
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Won = 0x0000000000000002L;
    /**
     * Participant lost
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Lost = 0x0000000000000003L;
    /**
     * Participant tied
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Tied = 0x0000000000000004L;
    /**
     * Game ended due to time running out
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long TimeExpired = 0x0000000000000005L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long First = 0x0000000000000006L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Second = 0x0000000000000007L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Third = 0x0000000000000008L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Fourth = 0x0000000000000009L;
    /**
     * game result range available for custom app use
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long CustomRange = 0x0000000000FF0000L;

    @Generated
    private GKTurnBasedMatchOutcome() {
    }
}
