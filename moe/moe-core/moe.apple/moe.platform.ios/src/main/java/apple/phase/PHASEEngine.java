package apple.phase;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] PHASEEngine
 * <p>
 * PHASE engine instance.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEEngine extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEEngine(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * [@property] activeGroupPreset
     * <p>
     * The active group mixer preset in the system
     * <p>
     * Returns nil if there are no active group presets in the engine. Activate or Deactivate the preset via [PHASEGroupPreset activate] and [PHASEGroupPreset deactivate]
     */
    @Generated
    @Selector("activeGroupPreset")
    public native PHASEGroupPreset activeGroupPreset();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEEngine alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * [@property] assetRegistry
     * <p>
     * A registry for assets available to the engine
     */
    @Generated
    @Selector("assetRegistry")
    public native PHASEAssetRegistry assetRegistry();

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

    /**
     * [@property] defaultMedium
     * <p>
     * The default medium in the engine.
     * <p>
     * The default value is PHASEMediumPresetAir.
     */
    @Generated
    @Selector("defaultMedium")
    public native PHASEMedium defaultMedium();

    /**
     * [@property] defaultReverbPreset
     * <p>
     * The default reverb preset in the engine.
     * <p>
     * The default value is PHASEReverbPresetNone.
     */
    @Generated
    @Selector("defaultReverbPreset")
    @NInt
    public native long defaultReverbPreset();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] duckers
     * <p>
     * An array of the ducker objects in the system
     * <p>
     * Returns a dictionary of the ducker objects at the time it is retrieved.
     */
    @Generated
    @Selector("duckers")
    public native NSArray<? extends PHASEDucker> duckers();

    /**
     * [@property] groups
     * <p>
     * A dictionary of the groups in the system
     * <p>
     * Returns a dictionary of the groups at the time it is retrieved.
     */
    @Generated
    @Selector("groups")
    public native NSDictionary<String, ? extends PHASEGroup> groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEEngine init();

    /**
     * initWithUpdateMode:
     * <p>
     * Initialize a new engine with an update mode.
     *
     * @param updateMode Defines how the engine will be updated.
     */
    @Generated
    @Selector("initWithUpdateMode:")
    public native PHASEEngine initWithUpdateMode(@NInt long updateMode);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * [@property] outputSpatializationMode
     * <p>
     * When set to a value other than PHASESpatializationModeAutomatic,
     * overrides the default output spatializer and uses the specified one instead.
     */
    @Generated
    @Selector("outputSpatializationMode")
    @NInt
    public native long outputSpatializationMode();

    /**
     * pause
     * <p>
     * Pause the engine.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * [@property] renderingState
     * <p>
     * The engine's current rendering state.
     */
    @Generated
    @Selector("renderingState")
    @NInt
    public native long renderingState();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] rootObject
     * <p>
     * The root object of the engine's scene graph.
     * <p>
     * Attach objects to the engine's rootObject or one of its children to make them active within the engine's scene graph.
     * This will ensure they take part in the simulation.
     * [@note]
     * The rootObject is created and owned by the engine.
     * The rootObject may not be set as the child of another object. This will cause an error to be thrown.
     * The rootObject's transform may not be changed. This will cause an error to be thrown.
     * The rootObject may not be copied. This will cause an error to be thrown.
     */
    @Generated
    @Selector("rootObject")
    public native PHASEObject rootObject();

    /**
     * [@property] defaultMedium
     * <p>
     * The default medium in the engine.
     * <p>
     * The default value is PHASEMediumPresetAir.
     */
    @Generated
    @Selector("setDefaultMedium:")
    public native void setDefaultMedium(PHASEMedium value);

    /**
     * [@property] defaultReverbPreset
     * <p>
     * The default reverb preset in the engine.
     * <p>
     * The default value is PHASEReverbPresetNone.
     */
    @Generated
    @Selector("setDefaultReverbPreset:")
    public native void setDefaultReverbPreset(@NInt long value);

    /**
     * [@property] outputSpatializationMode
     * <p>
     * When set to a value other than PHASESpatializationModeAutomatic,
     * overrides the default output spatializer and uses the specified one instead.
     */
    @Generated
    @Selector("setOutputSpatializationMode:")
    public native void setOutputSpatializationMode(@NInt long value);

    /**
     * [@property] unitsPerMeter
     * <p>
     * The number of units in a meter.
     * <p>
     * The unitsPerMeter is used internally to scale metric values passed to the API.
     * This allows clients to pass metric values in their own native spatial scale.
     * [@note]
     * Values are clamped to the range (0, inf]. Default value is 1.
     */
    @Generated
    @Selector("setUnitsPerMeter:")
    public native void setUnitsPerMeter(double value);

    /**
     * [@property] unitsPerSecond
     * <p>
     * The number of units in a second.
     * <p>
     * The unitsPerSecond is used internally to scale time/duration values passed to the API.
     * This allows clients to pass time/duration values in their own native time scale.
     * [@note]
     * Values are clamped to the range (0, inf]. Default value is 1.
     */
    @Generated
    @Selector("setUnitsPerSecond:")
    public native void setUnitsPerSecond(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] soundEvents
     * <p>
     * An array of the active sound event objects in the system
     * <p>
     * Returns a dictionary of the sound events at the time it is retrieved. This includes all sound events that are registered with the engine, including those that are preparing, playing, paused or stopping.
     */
    @Generated
    @Selector("soundEvents")
    public native NSArray<? extends PHASESoundEvent> soundEvents();

    /**
     * startAndReturnError:
     * <p>
     * Start or resume the engine.
     *
     * @return YES for success.
     */
    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * stop
     * <p>
     * Stop the engine.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] unitsPerMeter
     * <p>
     * The number of units in a meter.
     * <p>
     * The unitsPerMeter is used internally to scale metric values passed to the API.
     * This allows clients to pass metric values in their own native spatial scale.
     * [@note]
     * Values are clamped to the range (0, inf]. Default value is 1.
     */
    @Generated
    @Selector("unitsPerMeter")
    public native double unitsPerMeter();

    /**
     * [@property] unitsPerSecond
     * <p>
     * The number of units in a second.
     * <p>
     * The unitsPerSecond is used internally to scale time/duration values passed to the API.
     * This allows clients to pass time/duration values in their own native time scale.
     * [@note]
     * Values are clamped to the range (0, inf]. Default value is 1.
     */
    @Generated
    @Selector("unitsPerSecond")
    public native double unitsPerSecond();

    /**
     * update:
     * <p>
     * Manually update the engine instance on the calling thread.
     * <p>
     * This will kick off all of the API commands called since the last call to update,
     * update any systems and objects that need to be kept current, and call any registered handlers.
     * [@note]
     * This function has no effect if the engine's update mode is PHASEUpdateModeAutomatic.
     */
    @Generated
    @Selector("update")
    public native void update();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
