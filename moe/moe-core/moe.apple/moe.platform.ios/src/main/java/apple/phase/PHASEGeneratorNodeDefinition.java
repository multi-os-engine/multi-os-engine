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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] PHASEGeneratorNodeDefinition
 * 
 * An object for defining a generator node when building a sound event.
 * 
 * API-Since: 15.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEGeneratorNodeDefinition allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] calibrationMode
     * 
     * The generator's calibration mode. The default value is PHASECalibrationModeNone.
     */
    @Generated
    @Selector("calibrationMode")
    @NInt
    public native long calibrationMode();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
     * 
     * Optionally attach a metaparameter definition here to enable dynamic control of the gain during playback.
     */
    @Nullable
    @Generated
    @Selector("gainMetaParameterDefinition")
    public native PHASENumberMetaParameterDefinition gainMetaParameterDefinition();

    /**
     * [@property] group
     * 
     * The PHASEGroup object this generator should be associated with for gain and rate control.
     */
    @Nullable
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] level
     * 
     * The generator's level. The default value is 1.
     * [@note] The level's underlying unit and range are dependent on the calibrationMode.
     */
    @Generated
    @Selector("level")
    public native double level();

    /**
     * [@property] mixerDefinition
     * 
     * The readonly property that returns the PHASEMixerDefinition this generator was created with and assigned to.
     */
    @NotNull
    @Generated
    @Selector("mixerDefinition")
    public native PHASEMixerDefinition mixerDefinition();

    @Generated
    @Owned
    @Selector("new")
    public static native PHASEGeneratorNodeDefinition new_objc();

    /**
     * [@property] rate
     * 
     * Linear rate scalar.
     * [@note]
     * Values are clamped to the range [0.25, 4]. Default value is 1.
     */
    @Generated
    @Selector("rate")
    public native double rate();

    /**
     * [@property] rateMetaParameterDefinition
     * 
     * Optionally attach a metaparameter definition here to enable dynamic control of the rate during playback.
     */
    @Nullable
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
     * 
     * Set the generator's calibration mode and level.
     * [@note]
     * The level, including its underlying unit and range, are dependent on the calibration mode.
     * 
     * @param calibrationMode
     *                        The calibration mode.
     * @param level
     *                        The level.
     */
    @Generated
    @Selector("setCalibrationMode:level:")
    public native void setCalibrationModeLevel(@NInt long calibrationMode, double level);

    /**
     * [@property] gainMetaParameterDefinition
     * 
     * Optionally attach a metaparameter definition here to enable dynamic control of the gain during playback.
     */
    @Generated
    @Selector("setGainMetaParameterDefinition:")
    public native void setGainMetaParameterDefinition(@Nullable PHASENumberMetaParameterDefinition value);

    /**
     * [@property] group
     * 
     * The PHASEGroup object this generator should be associated with for gain and rate control.
     */
    @Generated
    @Selector("setGroup:")
    public native void setGroup_unsafe(@Nullable PHASEGroup value);

    /**
     * [@property] group
     * 
     * The PHASEGroup object this generator should be associated with for gain and rate control.
     */
    @Generated
    public void setGroup(@Nullable PHASEGroup value) {
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
     * 
     * Linear rate scalar.
     * [@note]
     * Values are clamped to the range [0.25, 4]. Default value is 1.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(double value);

    /**
     * [@property] rateMetaParameterDefinition
     * 
     * Optionally attach a metaparameter definition here to enable dynamic control of the rate during playback.
     */
    @Generated
    @Selector("setRateMetaParameterDefinition:")
    public native void setRateMetaParameterDefinition(@Nullable PHASENumberMetaParameterDefinition value);

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
