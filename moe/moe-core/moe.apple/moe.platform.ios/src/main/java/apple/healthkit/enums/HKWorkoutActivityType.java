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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] HKWorkoutActivityType
 * 
 * Represents a particular type of workout or exercise
 * 
 * API-Since: 8.0
 */
@Generated
public final class HKWorkoutActivityType {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long AmericanFootball = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Archery = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long AustralianFootball = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Badminton = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Baseball = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Basketball = 0x0000000000000006L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Bowling = 0x0000000000000007L;
    /**
     * See also HKWorkoutActivityTypeKickboxing.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Boxing = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Climbing = 0x0000000000000009L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Cricket = 0x000000000000000AL;
    /**
     * Any mix of cardio and/or strength training. See also HKWorkoutActivityTypeCoreTraining and
     * HKWorkoutActivityTypeFlexibility.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long CrossTraining = 0x000000000000000BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Curling = 0x000000000000000CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Cycling = 0x000000000000000DL;
    /**
     * This enum remains available to access older data.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use HKWorkoutActivityTypeSocialDance or HKWorkoutActivityTypeCardioDance
     */
    @Deprecated @Generated @NUInt public static final long Dance = 0x000000000000000EL;
    /**
     * This enum remains available to access older data.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use HKWorkoutActivityTypeSocialDance, HKWorkoutActivityTypeCardioDance,
     * HKWorkoutActivityTypeBarre or HKWorkoutActivityTypePilates
     */
    @Deprecated @Generated @NUInt public static final long DanceInspiredTraining = 0x000000000000000FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Elliptical = 0x0000000000000010L;
    /**
     * Polo, Horse Racing, Horse Riding, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long EquestrianSports = 0x0000000000000011L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Fencing = 0x0000000000000012L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Fishing = 0x0000000000000013L;
    /**
     * Primarily free weights and/or body weight and/or accessories
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long FunctionalStrengthTraining = 0x0000000000000014L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Golf = 0x0000000000000015L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Gymnastics = 0x0000000000000016L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Handball = 0x0000000000000017L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Hiking = 0x0000000000000018L;
    /**
     * Ice Hockey, Field Hockey, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Hockey = 0x0000000000000019L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Hunting = 0x000000000000001AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Lacrosse = 0x000000000000001BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long MartialArts = 0x000000000000001CL;
    /**
     * Qigong, meditation, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long MindAndBody = 0x000000000000001DL;
    /**
     * This enum remains available to access older data.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use HKWorkoutActivityTypeMixedCardio or HKWorkoutActivityTypeHighIntensityIntervalTraining
     */
    @Deprecated @Generated @NUInt public static final long MixedMetabolicCardioTraining = 0x000000000000001EL;
    /**
     * Canoeing, Kayaking, Outrigger, Stand Up Paddle Board, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PaddleSports = 0x000000000000001FL;
    /**
     * Dodge Ball, Hopscotch, Tetherball, Jungle Gym, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Play = 0x0000000000000020L;
    /**
     * Therapeutic activities like foam rolling, self massage and flexibility moves.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PreparationAndRecovery = 0x0000000000000021L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Racquetball = 0x0000000000000022L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Rowing = 0x0000000000000023L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Rugby = 0x0000000000000024L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Running = 0x0000000000000025L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Sailing = 0x0000000000000026L;
    /**
     * Ice Skating, Speed Skating, Inline Skating, Skateboarding, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long SkatingSports = 0x0000000000000027L;
    /**
     * Sledding, Snowmobiling, Building a Snowman, etc. See also HKWorkoutActivityTypeCrossCountrySkiing,
     * HKWorkoutActivityTypeSnowboarding, and HKWorkoutActivityTypeDownhillSkiing.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long SnowSports = 0x0000000000000028L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Soccer = 0x0000000000000029L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Softball = 0x000000000000002AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Squash = 0x000000000000002BL;
    /**
     * See also HKWorkoutActivityTypeStairs and HKWorkoutActivityTypeStepTraining.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long StairClimbing = 0x000000000000002CL;
    /**
     * Traditional Surfing, Kite Surfing, Wind Surfing, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long SurfingSports = 0x000000000000002DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Swimming = 0x000000000000002EL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long TableTennis = 0x000000000000002FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Tennis = 0x0000000000000030L;
    /**
     * Shot Put, Javelin, Pole Vaulting, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long TrackAndField = 0x0000000000000031L;
    /**
     * Primarily machines and/or free weights
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long TraditionalStrengthTraining = 0x0000000000000032L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Volleyball = 0x0000000000000033L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Walking = 0x0000000000000034L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long WaterFitness = 0x0000000000000035L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long WaterPolo = 0x0000000000000036L;
    /**
     * Water Skiing, Wake Boarding, etc.
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long WaterSports = 0x0000000000000037L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Wrestling = 0x0000000000000038L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Yoga = 0x0000000000000039L;
    /**
     * HKWorkoutActivityTypeDanceInspiredTraining
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Barre = 0x000000000000003AL;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long CoreTraining = 0x000000000000003BL;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long CrossCountrySkiing = 0x000000000000003CL;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long DownhillSkiing = 0x000000000000003DL;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Flexibility = 0x000000000000003EL;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long HighIntensityIntervalTraining = 0x000000000000003FL;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long JumpRope = 0x0000000000000040L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Kickboxing = 0x0000000000000041L;
    /**
     * HKWorkoutActivityTypeDanceInspiredTraining
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Pilates = 0x0000000000000042L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Snowboarding = 0x0000000000000043L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Stairs = 0x0000000000000044L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long StepTraining = 0x0000000000000045L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long WheelchairWalkPace = 0x0000000000000046L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long WheelchairRunPace = 0x0000000000000047L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Other = 0x0000000000000BB8L;

    @Generated
    private HKWorkoutActivityType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long TaiChi = 0x0000000000000048L;
    /**
     * HKWorkoutActivityTypeMixedMetabolicCardioTraining
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long MixedCardio = 0x0000000000000049L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long HandCycling = 0x000000000000004AL;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long DiscSports = 0x000000000000004BL;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long FitnessGaming = 0x000000000000004CL;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long CardioDance = 0x000000000000004DL;
    /**
     * Dances done in social settings like swing, salsa and folk dances from different world regions.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long SocialDance = 0x000000000000004EL;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Pickleball = 0x000000000000004FL;
    /**
     * Low intensity stretching and mobility exercises following a more vigorous workout type
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Cooldown = 0x0000000000000050L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long SwimBikeRun = 0x0000000000000052L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Transition = 0x0000000000000053L;
}
