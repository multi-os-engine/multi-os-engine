package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] PHASEGroup
 * <p>
 * A PHASEGroup allows clients to group generator nodes for shared processing.
 * Clients can set the gain and playback rate, as well as mute and solo the generator nodes in a group.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEGroup extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEGroup allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * fadeGain:duration:curveType:
     * <p>
     * Fade the gain of this group over a specified duration and curve.
     * [@note]
     * The fade gain is applied on top of the base gain of the group.
     *
     * @param gain      A target linear gain scalar. Values are clamped to the range [0, 1].
     * @param duration  The duration over which to ramp to the target linear gain scalar. Values must be >= 0.
     *                  The duration is scaled by unitsPerSecond internally, so can be provided at the client's native
     *                  time scale.
     * @param curveType The type of curve function that is applied during the fade.
     */
    @Generated
    @Selector("fadeGain:duration:curveType:")
    public native void fadeGainDurationCurveType(double gain, double duration, @NInt long curveType);

    /**
     * fadeRate:duration:curveType:
     * <p>
     * Fade the playback rate of this group over a specified duration and curve.
     * [@note]
     * The fade gain is applied on top of the base gain of the group.
     *
     * @param rate      A target linear rate scalar. Values are clamped to the range [0.25, 4.0].
     * @param duration  The duration over which to ramp to the target linear rate scalar. Values must be >= 0.
     *                  The duration is scaled by unitsPerSecond internally, so can be provided at the client's native
     *                  time scale.
     * @param curveType The type of curve function that is applied during the fade.
     */
    @Generated
    @Selector("fadeRate:duration:curveType:")
    public native void fadeRateDurationCurveType(double rate, double duration, @NInt long curveType);

    /**
     * [@property] gain
     * <p>
     * Linear gain scalar.
     * [@note]
     * Values are clamped to the range [0, 1]. Default value is 1.
     */
    @Generated
    @Selector("gain")
    public native double gain();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] identifier
     * <p>
     * The identifier that uniquely represents this group.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native PHASEGroup init();

    /**
     * initWithIdentifier:
     * <p>
     * Create a new group.
     *
     * @param identifier The identifier that uniquely represents this group.
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native PHASEGroup initWithIdentifier(String identifier);

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

    /**
     * [@property] muted
     * <p>
     * Whether or not this group is muted.
     */
    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    /**
     * [@property] soloed
     * <p>
     * Whether or not this group is soloed.
     */
    @Generated
    @Selector("isSoloed")
    public native boolean isSoloed();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * mute
     * <p>
     * Mute the group.
     */
    @Generated
    @Selector("mute")
    public native void mute();

    @Generated
    @Owned
    @Selector("new")
    public static native PHASEGroup new_objc();

    /**
     * [@property] rate
     * <p>
     * Linear rate scalar.
     * [@note]
     * Values are clamped to the range [0.25, 4]. Default value is 1.
     */
    @Generated
    @Selector("rate")
    public native double rate();

    /**
     * registerWithEngine
     * <p>
     * Registers a group with a particular engine so that referenced assets can find it.
     * [@note]
     * An exception will be thrown if the engine is invalid or the group already exists.
     *
     * @param engine An engine object to associate this group with.
     */
    @Generated
    @Selector("registerWithEngine:")
    public native void registerWithEngine(PHASEEngine engine);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] gain
     * <p>
     * Linear gain scalar.
     * [@note]
     * Values are clamped to the range [0, 1]. Default value is 1.
     */
    @Generated
    @Selector("setGain:")
    public native void setGain(double value);

    /**
     * [@property] rate
     * <p>
     * Linear rate scalar.
     * [@note]
     * Values are clamped to the range [0.25, 4]. Default value is 1.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * solo
     * <p>
     * Solo the group.
     */
    @Generated
    @Selector("solo")
    public native void solo();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * unmute
     * <p>
     * Unmute the group.
     */
    @Generated
    @Selector("unmute")
    public native void unmute();

    /**
     * unregisterFromEngine
     * <p>
     * Unregister the group from a particular engine.
     */
    @Generated
    @Selector("unregisterFromEngine")
    public native void unregisterFromEngine();

    /**
     * unsolo
     * <p>
     * Unsolo the group.
     */
    @Generated
    @Selector("unsolo")
    public native void unsolo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
