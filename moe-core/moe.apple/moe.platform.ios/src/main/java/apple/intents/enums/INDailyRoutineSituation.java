package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A relevant daily routine situation.
 * 
 * @see INDailyRoutineRelevanceProvider
 * 
 *      API-Since: 12.0
 */
@Generated
public final class INDailyRoutineSituation {
    @Generated
    private INDailyRoutineSituation() {
    }

    /**
     * A situation that occurs in the morning, around the time the user wakes up.
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Morning = 0x0000000000000000L;
    /**
     * A situation that occurs in the evening, around the time the user goes to bed.
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Evening = 0x0000000000000001L;
    /**
     * A situation that occurs when the user is at home.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     * 
     *      API-Since: 12.0
     */
    @Generated @NInt public static final long Home = 0x0000000000000002L;
    /**
     * A situation that occurs when the user is at work.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     * 
     *      API-Since: 12.0
     */
    @Generated @NInt public static final long Work = 0x0000000000000003L;
    /**
     * A situation that occurs when the user is at school.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     * 
     *      API-Since: 12.0
     */
    @Generated @NInt public static final long School = 0x0000000000000004L;
    /**
     * A situation that occurs when the user is at the gym.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     * 
     *      API-Since: 12.0
     */
    @Generated @NInt public static final long Gym = 0x0000000000000005L;
    /**
     * A situation that occurs when the user is commuting, for example driving into work.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Commute = 0x0000000000000006L;
    /**
     * A situation that occurs when the user connects headphones.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long HeadphonesConnected = 0x0000000000000007L;
    /**
     * A situation that occurs when the user is currently in a workout.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ActiveWorkout = 0x0000000000000008L;
    /**
     * A situation that occurs when the user is expected to perform more physical activity during the day.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long PhysicalActivityIncomplete = 0x0000000000000009L;
}
