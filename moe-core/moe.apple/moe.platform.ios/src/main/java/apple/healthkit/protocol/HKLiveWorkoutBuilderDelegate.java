package apple.healthkit.protocol;

import apple.foundation.NSSet;
import apple.healthkit.HKLiveWorkoutBuilder;
import apple.healthkit.HKSampleType;
import apple.healthkit.HKWorkoutActivity;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 26.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HKLiveWorkoutBuilderDelegate")
public interface HKLiveWorkoutBuilderDelegate {
    /**
     * workoutBuilder:didBeginActivity:
     * 
     * Called every time new activity is started and added to the workout builder.
     * 
     * @param workoutBuilder  The workout builder to which the activity was added to.
     * @param workoutActivity The activity that was added.
     * 
     *                        API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("workoutBuilder:didBeginActivity:")
    default void workoutBuilderDidBeginActivity(@NotNull HKLiveWorkoutBuilder workoutBuilder,
            @NotNull HKWorkoutActivity workoutActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * workoutBuilder:didCollectDataOfTypes:
     * 
     * Called every time new samples are added to the workout builder.
     * 
     * With new samples added, statistics for the collectedTypes may have changed and should be read again
     * 
     * @param workoutBuilder The workout builder to which samples were added.
     * @param collectedTypes The sample types that were added.
     * 
     *                       API-Since: 26.0
     */
    @Generated
    @Selector("workoutBuilder:didCollectDataOfTypes:")
    void workoutBuilderDidCollectDataOfTypes(@NotNull HKLiveWorkoutBuilder workoutBuilder,
            @NotNull NSSet<? extends HKSampleType> collectedTypes);

    /**
     * workoutBuilder:didEndActivity:
     * 
     * Called every time the end date is set on an activity in the workout builder.
     * 
     * @param workoutBuilder  The workout builder to which the activity belongs to
     * @param workoutActivity The activity that was ended.
     * 
     *                        API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("workoutBuilder:didEndActivity:")
    default void workoutBuilderDidEndActivity(@NotNull HKLiveWorkoutBuilder workoutBuilder,
            @NotNull HKWorkoutActivity workoutActivity) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * workoutBuilderDidCollectEvent:
     * 
     * Called every time a new event is added to the workout builder.
     * 
     * @param workoutBuilder The workout builder to which an event was added.
     * 
     *                       API-Since: 26.0
     */
    @Generated
    @Selector("workoutBuilderDidCollectEvent:")
    void workoutBuilderDidCollectEvent(@NotNull HKLiveWorkoutBuilder workoutBuilder);
}