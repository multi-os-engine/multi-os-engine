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
 * [@interface] PHASEDucker
 * <p>
 * A PHASEDucker is used to describe ducking behavior across different groups.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEDucker extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEDucker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * activate
     * <p>
     * Activates the ducker
     */
    @Generated
    @Selector("activate")
    public native void activate();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEDucker alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PHASEDucker allocWithZone(VoidPtr zone);

    /**
     * [@property] attackCurve
     * <p>
     * The type of curve function to use during the attack phase of gain reduction.
     */
    @Generated
    @Selector("attackCurve")
    @NInt
    public native long attackCurve();

    /**
     * [@property] attackTime
     * <p>
     * The time for the attenuation gain to ramp into effect.
     * [@note]
     * The attack time is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     */
    @Generated
    @Selector("attackTime")
    public native double attackTime();

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

    /**
     * deactivate
     * <p>
     * Deactivates the ducker
     */
    @Generated
    @Selector("deactivate")
    public native void deactivate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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
     * The identifier that uniquely represents this ducker.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native PHASEDucker init();

    /**
     * initWithSourceGroups:targetGroups:attenuation:attackTime:releaseTime:
     * <p>
     * Whenever a generator node from any source group plays, all the generator nodes in the target groups will be
     * ducked by the given gain using the given attack and release times.
     * [@note]
     * The ducker is initialially inactive. The client must call activate() to make it active.
     * Once a ducker is active, it will listen for generator nodes to start playback in source groups. Once triggered, it will duck its target groups.
     * Deactivating a ducker will make it stop listening. Furthermore, it will enter the release phase if it has been previously triggered.
     * Dealloc'ing a ducker will force the ducker into its release phase if it is actively ducking and remove it from the system when it finishes.
     *
     * @param engine       The engine to register this ducker with.
     * @param sourceGroups The source groups that will trigger the ducker when a sound in one of the source groups starts playback.
     * @param targetGroups The target groups that will be ducked when a sound in one of the source groups triggers the ducker.
     * @param gain         The linear gain scalar to apply when the ducker is engaged. 0 means full attenuation. 1 is no attenuation. Values are clamped to the range [0, 1].
     * @param attackTime   The time for the attenuation gain to ramp into effect.
     *                     This value is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     * @param releaseTime  The time for the ducked sounds to ramp back to their original level.
     *                     This value is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     * @param attackCurve  The type of curve function to use during the attack phase of gain reduction.
     * @param releaseCurve The type of curve function to use during the release phase of gain reduction.
     */
    @Generated
    @Selector("initWithEngine:sourceGroups:targetGroups:gain:attackTime:releaseTime:attackCurve:releaseCurve:")
    public native PHASEDucker initWithEngineSourceGroupsTargetGroupsGainAttackTimeReleaseTimeAttackCurveReleaseCurve(
            PHASEEngine engine, NSSet<? extends PHASEGroup> sourceGroups, NSSet<? extends PHASEGroup> targetGroups,
            double gain, double attackTime, double releaseTime, @NInt long attackCurve, @NInt long releaseCurve);

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
     * [@property] active
     * <p>
     * YES if the ducker is active; otherwise, NO.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHASEDucker new_objc();

    /**
     * [@property] releaseCurve
     * <p>
     * The type of curve function to use during the release phase of gain reduction.
     */
    @Generated
    @Selector("releaseCurve")
    @NInt
    public native long releaseCurve();

    /**
     * [@property] releaseTime
     * <p>
     * The time for the ducked sounds to ramp back to their original level.
     * [@note]
     * The release time is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     */
    @Generated
    @Selector("releaseTime")
    public native double releaseTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourceGroups
     * <p>
     * The source groups that will trigger the ducker when a sound in one of the source groups starts playback.
     */
    @Generated
    @Selector("sourceGroups")
    public native NSSet<? extends PHASEGroup> sourceGroups();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] targetGroups
     * <p>
     * The target groups that will be ducked when a sound in one of the source groups triggers the ducker.
     */
    @Generated
    @Selector("targetGroups")
    public native NSSet<? extends PHASEGroup> targetGroups();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
