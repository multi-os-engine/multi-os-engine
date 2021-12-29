package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
 * [@interface] PHASEGroupPreset
 * <p>
 * A PHASEGroupPreset holds a collection of PHASEGroupPresetSetting objects and other parameters to be applied all at once during playback.
 * <p>
 * Initialize beforehand, and use activate or deactivate to switch to the new preset during playback.
 * Activating a preset will automatically deactivate the current one.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEGroupPreset extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEGroupPreset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * activate
     * <p>
     * Activate this preset in the PHASEEngine object it was initialized with. The internal timeToTarget value is used.
     * The current preset will be deactivated automatically.
     */
    @Generated
    @Selector("activate")
    public native void activate();

    /**
     * activateWithTimeToTargetOverride
     * <p>
     * Activate this preset in the PHASEEngine object it was initialized with.
     * The current preset will be deactivated automatically.
     * [@note]
     * The timeToTargetOverride is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     *
     * @param timeToTargetOverride Override the timeToTarget value in the preset with this value.
     */
    @Generated
    @Selector("activateWithTimeToTargetOverride:")
    public native void activateWithTimeToTargetOverride(double timeToTargetOverride);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEGroupPreset alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEGroupPreset allocWithZone(VoidPtr zone);

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
     * Deactivate this preset and return the system to default unity values. The internal timeToReset value is used.
     */
    @Generated
    @Selector("deactivate")
    public native void deactivate();

    /**
     * deactivateWithTimeToResetOverride
     * <p>
     * Deactivate this preset and return the system to default unity values.
     * [@note]
     * The timeToResetOverride is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     *
     * @param timeToResetOverride Override the timeToReset value in the preset with this value.
     */
    @Generated
    @Selector("deactivateWithTimeToResetOverride:")
    public native void deactivateWithTimeToResetOverride(double timeToResetOverride);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEGroupPreset init();

    /**
     * initWithEngine
     * <p>
     * Create a new PHASEGroupPreset object with a given PHASEEngine object.
     * [@note]
     * The timeToTarget and timeToReset are scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     *
     * @param engine       The PHASEEngine object to register this preset with.
     * @param settings     A dictionary containing PHASEGroupPresetSetting objects paired with PHASEGroup objects as keys.
     * @param timeToTarget The time interval that all group settings in this preset will take to gradually fade to the new value
     * @param timeToReset  The time interval that all group settings in this preset will take to gradually fade to the unity value
     */
    @Generated
    @Selector("initWithEngine:settings:timeToTarget:timeToReset:")
    public native PHASEGroupPreset initWithEngineSettingsTimeToTargetTimeToReset(PHASEEngine engine,
            NSDictionary<String, ? extends PHASEGroupPresetSetting> settings, double timeToTarget, double timeToReset);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHASEGroupPreset new_objc();

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
     * [@property] settings
     * <p>
     * The collection of PHASEGroupPresetSetting objects to apply when this preset is activated.
     */
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ? extends PHASEGroupPresetSetting> settings();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] timeToReset
     * <p>
     * The time interval that all group settings in this preset will take to gradually fade to the unity value
     * [@note]
     * The timeToReset is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     */
    @Generated
    @Selector("timeToReset")
    public native double timeToReset();

    /**
     * [@property] timeToTarget
     * <p>
     * The time interval that all group settings in this preset will take to gradually fade to the new value
     * [@note]
     * The timeToTarget is scaled by unitsPerSecond internally, so can be provided at the client's native time scale.
     */
    @Generated
    @Selector("timeToTarget")
    public native double timeToTarget();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
