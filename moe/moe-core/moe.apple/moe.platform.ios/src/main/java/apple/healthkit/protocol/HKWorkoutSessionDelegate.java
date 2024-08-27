package apple.healthkit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.healthkit.HKWorkoutConfiguration;
import apple.healthkit.HKWorkoutEvent;
import apple.healthkit.HKWorkoutSession;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@enum] HKWorkoutSessionStateDelegate
 * 
 * This protocol should be implemented to be notified when a workout session's state changes.
 * 
 * The methods on this protocol are called on an anonymous serial background queue.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("HKWorkoutSessionDelegate")
public interface HKWorkoutSessionDelegate {
    /**
     * workoutSession:didBeginActivityWithConfiguration:date:
     * 
     * This method is called whenever a new activity begins.
     * 
     * Whenever a new workout activity begins, the new configuration would be passed to the session delegate
     * via this method. Clients may use this data to create a workout activity to save when building an HKWorkout
     * object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("workoutSession:didBeginActivityWithConfiguration:date:")
    default void workoutSessionDidBeginActivityWithConfigurationDate(@NotNull HKWorkoutSession workoutSession,
            @NotNull HKWorkoutConfiguration workoutConfiguration, @NotNull NSDate date) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * workoutSession:didChangeToState:fromState:date:
     * 
     * This method is called when a workout session transitions to a new state.
     * 
     * The date is provided to indicate when the state change actually happened. If your application is
     * suspended then the delegate will receive this call once the application resumes, which may be much later
     * than when the original state change ocurred.
     */
    @Generated
    @Selector("workoutSession:didChangeToState:fromState:date:")
    void workoutSessionDidChangeToStateFromStateDate(@NotNull HKWorkoutSession workoutSession, @NInt long toState,
            @NInt long fromState, @NotNull NSDate date);

    /**
     * workoutSession:didDisconnectFromRemoteDeviceWithError:
     * 
     * This method is called when the session is disconnected from its remote counterpart.
     * 
     * After this method is called for a mirrored workout session, it is no longer considered valid.
     * 
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("workoutSession:didDisconnectFromRemoteDeviceWithError:")
    default void workoutSessionDidDisconnectFromRemoteDeviceWithError(@NotNull HKWorkoutSession workoutSession,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * workoutSession:didEndActivityWithConfiguration:date:
     * 
     * This method is called whenever the current workout activity ends.
     * 
     * Whenever a new workout activity ends, the new configuration would be passed to the session delegate
     * via this method. Clients may use this data to create a workout activity to save when building an HKWorkout
     * object.
     * 
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("workoutSession:didEndActivityWithConfiguration:date:")
    default void workoutSessionDidEndActivityWithConfigurationDate(@NotNull HKWorkoutSession workoutSession,
            @NotNull HKWorkoutConfiguration workoutConfiguration, @NotNull NSDate date) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * workoutSession:didFailWithError:
     * 
     * This method is called when an error occurs that stops a workout session.
     * 
     * When the state of the workout session changes due to an error occurring, this method is always called
     * before workoutSession:didChangeToState:fromState:date:.
     */
    @Generated
    @Selector("workoutSession:didFailWithError:")
    void workoutSessionDidFailWithError(@NotNull HKWorkoutSession workoutSession, @NotNull NSError error);

    /**
     * workoutSession:didGenerateEvent:
     * 
     * This method is called whenever the system generates a workout event.
     * 
     * Whenever a workout event is generated, such as pause or resume detection, the event will be passed
     * to the session delegate via this method. Clients may save the generated events to use when creating an
     * HKWorkout object.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("workoutSession:didGenerateEvent:")
    default void workoutSessionDidGenerateEvent(@NotNull HKWorkoutSession workoutSession,
            @NotNull HKWorkoutEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * workoutSession:didReceiveDataFromRemoteWorkoutSession:
     * 
     * This method is called when the session receives data from its remote counterpart.
     * 
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("workoutSession:didReceiveDataFromRemoteWorkoutSession:")
    default void workoutSessionDidReceiveDataFromRemoteWorkoutSession(@NotNull HKWorkoutSession workoutSession,
            @NotNull NSArray<? extends NSData> data) {
        throw new java.lang.UnsupportedOperationException();
    }
}