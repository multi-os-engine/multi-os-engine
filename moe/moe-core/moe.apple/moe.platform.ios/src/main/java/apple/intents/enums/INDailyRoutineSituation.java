package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A relevant daily routine situation.
 * 
 * @see INDailyRoutineRelevanceProvider
 */
@Generated
public final class INDailyRoutineSituation {
    @Generated
    private INDailyRoutineSituation() {
    }

    /**
     * A situation that occurs in the morning, around the time the user wakes up.
     */
    @Generated @NInt public static final long Morning = 0x0000000000000000L;
    /**
     * A situation that occurs in the evening, around the time the user goes to bed.
     */
    @Generated @NInt public static final long Evening = 0x0000000000000001L;
    /**
     * A situation that occurs when the user is at home.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     */
    @Generated @NInt public static final long Home = 0x0000000000000002L;
    /**
     * A situation that occurs when the user is at work.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     */
    @Generated @NInt public static final long Work = 0x0000000000000003L;
    /**
     * A situation that occurs when the user is at school.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     */
    @Generated @NInt public static final long School = 0x0000000000000004L;
    /**
     * A situation that occurs when the user is at the gym.
     * [@note] Your app needs Always location authorization to use this situation.
     * 
     * @see CLLocationManager
     */
    @Generated @NInt public static final long Gym = 0x0000000000000005L;
    /**
     * A situation that occurs when the user is commuting, for example driving into work.
     */
    @Generated @NInt public static final long Commute = 0x0000000000000006L;
    /**
     * A situation that occurs when the user connects headphones.
     */
    @Generated @NInt public static final long HeadphonesConnected = 0x0000000000000007L;
    /**
     * A situation that occurs when the user is currently in a workout.
     */
    @Generated @NInt public static final long ActiveWorkout = 0x0000000000000008L;
    /**
     * A situation that occurs when the user is expected to perform more physical activity during the day.
     */
    @Generated @NInt public static final long PhysicalActivityIncomplete = 0x0000000000000009L;
}