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
 * 
 * PHASE engine instance.
 * 
 * API-Since: 15.0
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
     * 
     * The active group mixer preset in the system
     * 
     * Returns nil if there are no active group presets in the engine. Activate or Deactivate the preset via
     * [PHASEGroupPreset activate] and [PHASEGroupPreset deactivate]
     */
    @Generated
    @Selector("activeGroupPreset")
    public native PHASEGroupPreset activeGroupPreset();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEEngine alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEEngine allocWithZone(VoidPtr zone);

    /**
     * [@property] assetRegistry
     * 
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
     * 
     * The default medium in the engine.
     * 
     * The default value is PHASEMediumPresetAir.
     */
    @Generated
    @Selector("defaultMedium")
    public native PHASEMedium defaultMedium();

    /**
     * [@property] defaultReverbPreset
     * 
     * The default reverb preset in the engine.
     * 
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
     * 
     * An array of the ducker objects in the system
     * 
     * Returns a dictionary of the ducker objects at the time it is retrieved.
     */
    @Generated
    @Selector("duckers")
    public native NSArray<? extends PHASEDucker> duckers();

    /**
     * [@property] groups
     * 
     * A dictionary of the groups in the system
     * 
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
     * 
     * Initialize a new engine with an update mode.
     * 
     * @param updateMode
     *                   Defines how the engine will be updated.
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
    public static native PHASEEngine new_objc();

    /**
     * [@property] outputSpatializationMode
     * 
     * When set to a value other than PHASESpatializationModeAutomatic,
     * overrides the default output spatializer and uses the specified one instead.
     */
    @Generated
    @Selector("outputSpatializationMode")
    @NInt
    public native long outputSpatializationMode();

    /**
     * pause
     * 
     * Pause the engine.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * [@property] renderingState
     * 
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
     * 
     * The root object of the engine's scene graph.
     * 
     * Attach objects to the engine's rootObject or one of its children to make them active within the engine's scene
     * graph.
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
     * 
     * The default medium in the engine.
     * 
     * The default value is PHASEMediumPresetAir.
     */
    @Generated
    @Selector("setDefaultMedium:")
    public native void setDefaultMedium(PHASEMedium value);

    /**
     * [@property] defaultReverbPreset
     * 
     * The default reverb preset in the engine.
     * 
     * The default value is PHASEReverbPresetNone.
     */
    @Generated
    @Selector("setDefaultReverbPreset:")
    public native void setDefaultReverbPreset(@NInt long value);

    /**
     * [@property] outputSpatializationMode
     * 
     * When set to a value other than PHASESpatializationModeAutomatic,
     * overrides the default output spatializer and uses the specified one instead.
     */
    @Generated
    @Selector("setOutputSpatializationMode:")
    public native void setOutputSpatializationMode(@NInt long value);

    /**
     * [@property] unitsPerMeter
     * 
     * The number of units in a meter.
     * 
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
     * 
     * The number of units in a second.
     * 
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
     * 
     * An array of the active sound event objects in the system
     * 
     * Returns a dictionary of the sound events at the time it is retrieved. This includes all sound events that are
     * registered with the engine, including those that are preparing, playing, paused or stopping.
     */
    @Generated
    @Selector("soundEvents")
    public native NSArray<? extends PHASESoundEvent> soundEvents();

    /**
     * startAndReturnError:
     * 
     * Start or resume the engine.
     * 
     * @return
     *         YES for success.
     */
    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * stop
     * 
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
     * 
     * The number of units in a meter.
     * 
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
     * 
     * The number of units in a second.
     * 
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
     * 
     * Manually update the engine instance on the calling thread.
     * 
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
