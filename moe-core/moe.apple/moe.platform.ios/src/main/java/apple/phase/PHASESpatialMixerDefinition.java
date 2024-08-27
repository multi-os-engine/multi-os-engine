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
 * [@interface] PHASESpatialMixerDefinition
 * 
 * Spatial mixer definition.
 * 
 * Spatial mixers render audio with spatialization and environmental effects.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASESpatialMixerDefinition extends PHASEMixerDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASESpatialMixerDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASESpatialMixerDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASESpatialMixerDefinition allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
     * [@property] distanceModelParameters
     * 
     * Distance model parameters (optional).
     */
    @Nullable
    @Generated
    @Selector("distanceModelParameters")
    public native PHASEDistanceModelParameters distanceModelParameters();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASESpatialMixerDefinition init();

    /**
     * initWithSpatialPipeline
     * 
     * Create a new PHASESpatialMixerDefinition
     * 
     * @param spatialPipeline
     *                        A spatial pipeline.
     * @return
     *         A new PHASESpatialMixerDefinition object
     */
    @Generated
    @Selector("initWithSpatialPipeline:")
    public native PHASESpatialMixerDefinition initWithSpatialPipeline(@NotNull PHASESpatialPipeline spatialPipeline);

    /**
     * initWithSpatialPipeline:identifier
     * 
     * Create a new PHASESpatialMixerDefinition
     * 
     * @param spatialPipeline
     *                        A spatial pipeline.
     * @param identifier
     *                        An optional custom identifier to give to this object
     * @return
     *         A new PHASESpatialMixerDefinition object
     */
    @Generated
    @Selector("initWithSpatialPipeline:identifier:")
    public native PHASESpatialMixerDefinition initWithSpatialPipelineIdentifier(
            @NotNull PHASESpatialPipeline spatialPipeline, @NotNull String identifier);

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
     * [@property] listenerDirectivityModelParameters
     * 
     * Listener directivity model parameters (optional).
     */
    @Nullable
    @Generated
    @Selector("listenerDirectivityModelParameters")
    public native PHASEDirectivityModelParameters listenerDirectivityModelParameters();

    @Generated
    @Owned
    @Selector("new")
    public static native PHASESpatialMixerDefinition new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] distanceModelParameters
     * 
     * Distance model parameters (optional).
     */
    @Generated
    @Selector("setDistanceModelParameters:")
    public native void setDistanceModelParameters(@Nullable PHASEDistanceModelParameters value);

    /**
     * [@property] listenerDirectivityModelParameters
     * 
     * Listener directivity model parameters (optional).
     */
    @Generated
    @Selector("setListenerDirectivityModelParameters:")
    public native void setListenerDirectivityModelParameters(@Nullable PHASEDirectivityModelParameters value);

    /**
     * [@property] sourceDirectivityModelParameters
     * 
     * Source directivity model parameters (optional).
     */
    @Generated
    @Selector("setSourceDirectivityModelParameters:")
    public native void setSourceDirectivityModelParameters(@Nullable PHASEDirectivityModelParameters value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourceDirectivityModelParameters
     * 
     * Source directivity model parameters (optional).
     */
    @Nullable
    @Generated
    @Selector("sourceDirectivityModelParameters")
    public native PHASEDirectivityModelParameters sourceDirectivityModelParameters();

    /**
     * [@property] spatialPipeline
     * 
     * Spatial Pipeline.
     */
    @NotNull
    @Generated
    @Selector("spatialPipeline")
    public native PHASESpatialPipeline spatialPipeline();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
