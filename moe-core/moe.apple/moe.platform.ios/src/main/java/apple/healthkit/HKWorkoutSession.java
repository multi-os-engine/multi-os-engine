package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.healthkit.protocol.HKWorkoutSessionDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * HKWorkoutSession
 * 
 * An HKWorkoutSession is an object describing the properties of a workout activity session.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKWorkoutSession extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected HKWorkoutSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] activityType
     * 
     * Indicates the type of workout that will be performed during the session.
     */
    @Generated
    @Selector("activityType")
    @NUInt
    public native long activityType();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKWorkoutSession alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKWorkoutSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * beginNewActivityWithConfiguration:date:metadata:
     * 
     * Begins a new workout activity for this session.
     * 
     * This method will asynchronously begin the workout activity. The delegate for this session would be
     * informed once the activity effectively begins. Sensor algorithms to generate data would be updated
     * to match the new activity.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("beginNewActivityWithConfiguration:date:metadata:")
    public native void beginNewActivityWithConfigurationDateMetadata(
            @NotNull HKWorkoutConfiguration workoutConfiguration, @NotNull NSDate date,
            @Nullable NSDictionary<String, ?> metadata);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] currentActivity
     * 
     * The current workout activity.
     * 
     * This returns a copy of the session's current workout activity. It will return
     * a copy of the main workout activity if no new activity has begun. Changes made
     * to the returned object have no impact on the HKWorkoutSession.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("currentActivity")
    @NotNull
    public native HKWorkoutActivity currentActivity();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * The session delegate, which receives
     * 
     * The session delegate object is the one implementing the methods that get called when the session
     * state changes or a failure occurs in the session.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native HKWorkoutSessionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * end
     * 
     * Ends the workout session.
     * 
     * This method will end the session if it is currently running or stopped. The state of the workout session will
     * transition to HKWorkoutSessionStateEnded. Once a workout session is ended, it cannot be reused to start a new
     * workout session. Sensor algorithms will be stopped, no new data will be generated for this session, and the
     * system will exit session mode.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("end")
    public native void end();

    /**
     * endCurrentActivityOnDate:
     * 
     * Ends the current workout activity.
     * 
     * This method will end the current activity, reverting to the main session activity. The delegate for this session
     * would be informed once the activity effectively ends. Sensor algorithms to generate data would be updated to
     * match the main session activity.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("endCurrentActivityOnDate:")
    public native void endCurrentActivityOnDate(@NotNull NSDate date);

    /**
     * [@property] endDate
     * 
     * Indicates the date when the workout session ended.
     * 
     * This value is nil when a workout session is initialized. It is set when the workout session state
     * changes to HKWorkoutSessionStateEnded.
     */
    @Generated
    @Selector("endDate")
    @Nullable
    public native NSDate endDate();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKWorkoutSession init();

    @Generated
    @Selector("initWithCoder:")
    public native HKWorkoutSession initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] locationType
     * 
     * Indicates the type of location (indoors vs. outdoors) where the workout will take place.
     * 
     * Knowing the location type allows for more accurate measurements and better performance.
     */
    @Generated
    @Selector("locationType")
    @NInt
    public native long locationType();

    @Generated
    @Owned
    @Selector("new")
    public static native HKWorkoutSession new_objc();

    /**
     * pause
     * 
     * Pauses the workout session.
     * 
     * This method will pause the session if it is currently running. The state of the workout session
     * will transition to HKWorkoutSessionStatePaused. An HKWorkoutEventTypePause will be generated and
     * delivered to the workout session's delegate.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * prepare
     * 
     * Prepares the workout session for starting.
     * 
     * This method will asynchronously prepare the workout session for starting. The state of the workout session
     * will transition to HKWorkoutSessionStatePrepared. A prepared session will put the system in session mode,
     * but will not start the session activity.
     * You might call this methods, for example, prior to displaying a countdown on your application while waiting
     * for the activity to start.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("prepare")
    public native void prepare();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * resume
     * 
     * Resumes the workout session.
     * 
     * This method will resume the session if it is currently paused. The state of the workout session
     * will transition to HKWorkoutSessionStateRunning. An HKWorkoutEventTypeResume will be generated and
     * delivered to the workout session's delegate.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * sendDataToRemoteWorkoutSession:completion:
     * 
     * Sends an NSData object to the connected remote workout session.
     * 
     * This method can be called to send data from a primary session to its mirrored counterpart and vice-versa.
     * It's only intended to be used for data that describes the current state of the workout, such as accumulated
     * metrics, and any
     * data needed to keep your app on both devices in sync.
     * The maximum amount of data that can be sent is 100 KB in any given 10-second time window.
     * If this limit is exceeded, an error will be returned in the completion handler.
     * An error will also be returned if the session is not mirroring.
     * The completion handler will be executed on an arbitrary background queue.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("sendDataToRemoteWorkoutSession:completion:")
    public native void sendDataToRemoteWorkoutSessionCompletion(@NotNull NSData data,
            @ObjCBlock(name = "call_sendDataToRemoteWorkoutSessionCompletion") @NotNull Block_sendDataToRemoteWorkoutSessionCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendDataToRemoteWorkoutSessionCompletion {
        @Generated
        void call_sendDataToRemoteWorkoutSessionCompletion(boolean success, @Nullable NSError error);
    }

    /**
     * [@property] delegate
     * 
     * The session delegate, which receives
     * 
     * The session delegate object is the one implementing the methods that get called when the session
     * state changes or a failure occurs in the session.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable HKWorkoutSessionDelegate value);

    /**
     * [@property] delegate
     * 
     * The session delegate, which receives
     * 
     * The session delegate object is the one implementing the methods that get called when the session
     * state changes or a failure occurs in the session.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable HKWorkoutSessionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startActivityWithDate:
     * 
     * Starts the workout session activity.
     * 
     * This method will asynchronously begin the workout session activity. The state of the workout session will
     * transition to HKWorkoutSessionStateRunning. Once a session activity is started the system will be in session
     * mode and sensor algorithms will be applied to generate data for the workout activity.
     * 
     * API-Since: 17.0
     * 
     * @param date Start date for the workout session activity
     */
    @Generated
    @Selector("startActivityWithDate:")
    public native void startActivityWithDate(@Nullable NSDate date);

    /**
     * [@property] startDate
     * 
     * Indicates the date when the workout session started running.
     * 
     * This value is nil when a workout session is initialized. It is set when the workout session state
     * changes to HKWorkoutSessionStateRunning.
     */
    @Generated
    @Selector("startDate")
    @Nullable
    public native NSDate startDate();

    /**
     * [@property] state
     * 
     * Indicates the current state of the workout session.
     * 
     * Each time this value is updated, the delegate method workoutSession:didChangeToState:fromState:date:
     * will be called.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * stopActivityWithDate:
     * 
     * Stops the workout session activity.
     * 
     * This method will asynchronously stop the session activity if it is currently running. The state of the workout
     * session will transition to HKWorkoutSessionStateStopped. Once a workout session is stopped, it cannot be reused
     * to
     * start a new workout session. Sensor algorithms will be stopped and no new data will be generated for this
     * session.
     * However, the system will remain in session mode.
     * 
     * API-Since: 17.0
     * 
     * @param date Stop date for the workout session activity
     */
    @Generated
    @Selector("stopActivityWithDate:")
    public native void stopActivityWithDate(@Nullable NSDate date);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] type
     * 
     * Indicates the type of the workout session.
     * 
     * A workout session created using an initializer will be primary, while a session retrieved with
     * the `HKHealthStore` `workoutSessionMirroringStartHandler` property will be mirrored.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] workoutConfiguration
     * 
     * The configuration object describing the workout.
     * 
     * This returns a copy of the configuration passed when creating the HKWorkoutSession. Changes made to
     * the returned object have no impact on the HKWorkoutSession.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("workoutConfiguration")
    @NotNull
    public native HKWorkoutConfiguration workoutConfiguration();
}