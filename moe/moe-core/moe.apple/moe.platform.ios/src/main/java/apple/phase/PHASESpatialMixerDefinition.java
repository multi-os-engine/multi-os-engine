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
 * [@interface] PHASESpatialMixerDefinition
 * <p>
 * Spatial mixer definition.
 * <p>
 * Spatial mixers render audio with spatialization and environmental effects.
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

    @Generated
    @Selector("allocWithZone:")
    public static native PHASESpatialMixerDefinition allocWithZone(VoidPtr zone);

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
     * [@property] distanceModelParameters
     * <p>
     * Distance model parameters (optional).
     */
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
     * <p>
     * Create a new PHASESpatialMixerDefinition
     *
     * @param spatialPipeline A spatial pipeline.
     * @return A new PHASESpatialMixerDefinition object
     */
    @Generated
    @Selector("initWithSpatialPipeline:")
    public native PHASESpatialMixerDefinition initWithSpatialPipeline(PHASESpatialPipeline spatialPipeline);

    /**
     * initWithSpatialPipeline:identifier
     * <p>
     * Create a new PHASESpatialMixerDefinition
     *
     * @param spatialPipeline A spatial pipeline.
     * @param identifier      An optional custom identifier to give to this object
     * @return A new PHASESpatialMixerDefinition object
     */
    @Generated
    @Selector("initWithSpatialPipeline:identifier:")
    public native PHASESpatialMixerDefinition initWithSpatialPipelineIdentifier(PHASESpatialPipeline spatialPipeline,
            String identifier);

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
     * [@property] listenerDirectivityModelParameters
     * <p>
     * Listener directivity model parameters (optional).
     */
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
     * <p>
     * Distance model parameters (optional).
     */
    @Generated
    @Selector("setDistanceModelParameters:")
    public native void setDistanceModelParameters(PHASEDistanceModelParameters value);

    /**
     * [@property] listenerDirectivityModelParameters
     * <p>
     * Listener directivity model parameters (optional).
     */
    @Generated
    @Selector("setListenerDirectivityModelParameters:")
    public native void setListenerDirectivityModelParameters(PHASEDirectivityModelParameters value);

    /**
     * [@property] sourceDirectivityModelParameters
     * <p>
     * Source directivity model parameters (optional).
     */
    @Generated
    @Selector("setSourceDirectivityModelParameters:")
    public native void setSourceDirectivityModelParameters(PHASEDirectivityModelParameters value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourceDirectivityModelParameters
     * <p>
     * Source directivity model parameters (optional).
     */
    @Generated
    @Selector("sourceDirectivityModelParameters")
    public native PHASEDirectivityModelParameters sourceDirectivityModelParameters();

    /**
     * [@property] spatialPipeline
     * <p>
     * Spatial Pipeline.
     */
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
}
