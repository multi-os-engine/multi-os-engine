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
import org.moe.natj.general.ann.MappedReturn;
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
 * [@interface] PHASEGeneratorNodeDefinition
 * <p>
 * An object for defining a generator node when building a sound event.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEGeneratorNodeDefinition extends PHASESoundEventNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEGeneratorNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEGeneratorNodeDefinition alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] calibrationMode
     * <p>
     * The generator's calibration mode. The default value is PHASECalibrationModeNone.
     */
    @Generated
    @Selector("calibrationMode")
    @NInt
    public native long calibrationMode();

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
     * [@property] gainMetaParameterDefinition
     * <p>
     * Optionally attach a metaparameter definition here to enable dynamic control of the gain during playback.
     */
    @Generated
    @Selector("gainMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition gainMetaParameterDefinition();

    /**
     * [@property] group
     * <p>
     * The PHASEGroup object this generator should be associated with for gain and rate control.
     */
    @Generated
    @Selector("group")
    public native PHASEGroup group();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEGeneratorNodeDefinition init();

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

    /**
     * [@property] level
     * <p>
     * The generator's level. The default value is 1.
     * [@note] The level's underlying unit and range are dependent on the calibrationMode.
     */
    @Generated
    @Selector("level")
    public native double level();

    /**
     * [@property] mixerDefinition
     * <p>
     * The readonly property that returns the PHASEMixerDefinition this generator was created with and assigned to.
     */
    @Generated
    @Selector("mixerDefinition")
    public native PHASEMixerDefinition mixerDefinition();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * [@property] rateMetaParameterDefinition
     * <p>
     * Optionally attach a metaparameter definition here to enable dynamic control of the rate during playback.
     */
    @Generated
    @Selector("rateMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition rateMetaParameterDefinition();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setCalibrationMode:level
     * <p>
     * Set the generator's calibration mode and level.
     * [@note]
     * The level, including its underlying unit and range, are dependent on the calibration mode.
     *
     * @param calibrationMode The calibration mode.
     * @param level           The level.
     */
    @Generated
    @Selector("setCalibrationMode:level:")
    public native void setCalibrationModeLevel(@NInt long calibrationMode, double level);

    /**
     * [@property] gainMetaParameterDefinition
     * <p>
     * Optionally attach a metaparameter definition here to enable dynamic control of the gain during playback.
     */
    @Generated
    @Selector("setGainMetaParameterDefinition:")
    public native void setGainMetaParameterDefinition(PHASENumberMetaParameterDefinition value);

    /**
     * [@property] group
     * <p>
     * The PHASEGroup object this generator should be associated with for gain and rate control.
     */
    @Generated
    @Selector("setGroup:")
    public native void setGroup_unsafe(PHASEGroup value);

    /**
     * [@property] group
     * <p>
     * The PHASEGroup object this generator should be associated with for gain and rate control.
     */
    @Generated
    public void setGroup(PHASEGroup value) {
        Object __old = group();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setGroup_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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

    /**
     * [@property] rateMetaParameterDefinition
     * <p>
     * Optionally attach a metaparameter definition here to enable dynamic control of the rate during playback.
     */
    @Generated
    @Selector("setRateMetaParameterDefinition:")
    public native void setRateMetaParameterDefinition(PHASENumberMetaParameterDefinition value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
