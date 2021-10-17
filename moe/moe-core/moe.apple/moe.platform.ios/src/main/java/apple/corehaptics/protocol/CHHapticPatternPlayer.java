package apple.corehaptics.protocol;

import apple.corehaptics.CHHapticDynamicParameter;
import apple.corehaptics.CHHapticParameterCurve;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] CHHapticPatternPlayer
 * <p>
 * A protocol which defines operations for starting, stopping, and sending parameters to a pattern player.
 * <p>
 * Instances of these objects are created via the factory methods such as
 * `CHHapticEngine(createPlayerWithPattern:error)`.
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticPatternPlayer")
public interface CHHapticPatternPlayer {
    /**
     * cancelAndReturnError:
     * <p>
     * Removes all pending commands and stops the player as soon as possible.
     */
    @Generated
    @Selector("cancelAndReturnError:")
    boolean cancelAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] isMuted
     * <p>
     * When set to YES, the player's audio and haptic output will be silenced.
     */
    @Generated
    @Selector("isMuted")
    boolean isMuted();

    /**
     * scheduleParameterCurve:atTime:error
     * <p>
     * Schedule a CHHapticParameterCurve, starting at the specified time (see `CHHapticEngine(currentTime)`).
     * If 'time' is set to `CHHapticTimeImmediate`, the parameter curve is scheduled as soon as possible.
     * <p>
     * This method overrides the relativeTime property of the passed-in CHHapticParameterCurve,
     * setting it to this method's 'time' argument. All the curve's control point times will then be
     * calculated relative to that time.
     */
    @Generated
    @Selector("scheduleParameterCurve:atTime:error:")
    boolean scheduleParameterCurveAtTimeError(CHHapticParameterCurve parameterCurve, double time,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * sendParameters:atTime:error
     * <p>
     * Send an array of CHHapticDynamicParameters, starting at the specified time (see `CHHapticEngine(currentTime)`).
     * If 'time' is set to `CHHapticTimeImmediate`, the parameters are sent as soon as possible.
     */
    @Generated
    @Selector("sendParameters:atTime:error:")
    boolean sendParametersAtTimeError(NSArray<? extends CHHapticDynamicParameter> parameters, double time,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] isMuted
     * <p>
     * When set to YES, the player's audio and haptic output will be silenced.
     */
    @Generated
    @Selector("setIsMuted:")
    void setIsMuted(boolean value);

    /**
     * startAtTime:error
     * <p>
     * Start playing the pattern at the specified time (see `CHHapticEngine(currentTime)`).
     * If 'time' is set to `CHHapticTimeImmediate`, the pattern is started as soon as possible.
     */
    @Generated
    @Selector("startAtTime:error:")
    boolean startAtTimeError(double time, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * stopAtTime:error
     * <p>
     * Stop playing the pattern at the specified time (see `CHHapticEngine(currentTime)`).
     * If 'time' is set to `CHHapticTimeImmediate`, the pattern is stopped as soon as possible.
     */
    @Generated
    @Selector("stopAtTime:error:")
    boolean stopAtTimeError(double time, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);
}
