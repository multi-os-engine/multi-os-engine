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
 * [@interface] PHASEBlendNodeDefinition
 * <p>
 * An object for defining a blend sound event node when building a sound event.
 * <p>
 * A blend node blends between its children based on a numeric parameter.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEBlendNodeDefinition extends PHASESoundEventNodeDefinition {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEBlendNodeDefinition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addRangeForInputValuesAbove:fullGainAtValue:fadeCurveType:subtree
     * <p>
     * Create a blend range that is active for all values above a given threshold.
     *
     * @param value           The value for which the range will be active if the blend node's input value is above this threshold.
     * @param fullGainAtValue This value defines a threshold for which a fade curve will be applied to the gain, when the input value is between "value" and "fullGainAtValue".
     * @param fadeCurveType   A curve type that defines which kind of fade curve to apply.
     * @param subtree         A PHASESoundEventNodeDefinition subtree that will be active for this range.
     */
    @Generated
    @Selector("addRangeForInputValuesAbove:fullGainAtValue:fadeCurveType:subtree:")
    public native void addRangeForInputValuesAboveFullGainAtValueFadeCurveTypeSubtree(double value,
            double fullGainAtValue, @NInt long fadeCurveType, PHASESoundEventNodeDefinition subtree);

    /**
     * addRangeForInputValuesBelow:fullGainAtValue:fadeCurveType:subtree
     * <p>
     * Create a blend range that is active for all values below a given threshold.
     *
     * @param value           The value for which the range will be active if the blend node's input value is below this threshold.
     * @param fullGainAtValue This value defines a threshold for which a fade curve will be applied to the gain, when the input value is between "value" and "fullGainAtValue".
     * @param fadeCurveType   A curve type that defines which kind of fade curve to apply.
     * @param subtree         A PHASESoundEventNodeDefinition subtree that will be active for this range.
     */
    @Generated
    @Selector("addRangeForInputValuesBelow:fullGainAtValue:fadeCurveType:subtree:")
    public native void addRangeForInputValuesBelowFullGainAtValueFadeCurveTypeSubtree(double value,
            double fullGainAtValue, @NInt long fadeCurveType, PHASESoundEventNodeDefinition subtree);

    /**
     * addRangeForInputValuesBetween:highValue:fullGainAtLowValue:fullGainAtHighValue:lowFadeCurveType:highFadeCurveType:subtree
     * <p>
     * Create a blend range that is active for all input values between lowValue and highValue
     *
     * @param lowValue            The lower bound for which this range is active.
     * @param highValue           The upper bound for which this range is active.
     * @param fullGainAtLowValue  The threshold for which a fade curve defined by lowFadeCurveType will be applied to the gain when the input value is between lowValue and fullGainAtLowValue
     * @param fullGainAtHighValue The threshold for which a fade curve defined by highFadeCurveType will be applied to the gain when the input value is between highValue and fullGainAtHighValue
     * @param lowFadeCurveType    A curve type that defines which kind of fade curve to apply for the low fade range.
     * @param highFadeCurveType   A curve type that defines which kind of fade curve to apply for the high fade range..
     * @param subtree             A PHASESoundEventNodeDefinition subtree that will be active for this range.
     */
    @Generated
    @Selector("addRangeForInputValuesBetween:highValue:fullGainAtLowValue:fullGainAtHighValue:lowFadeCurveType:highFadeCurveType:subtree:")
    public native void addRangeForInputValuesBetweenHighValueFullGainAtLowValueFullGainAtHighValueLowFadeCurveTypeHighFadeCurveTypeSubtree(
            double lowValue, double highValue, double fullGainAtLowValue, double fullGainAtHighValue,
            @NInt long lowFadeCurveType, @NInt long highFadeCurveType, PHASESoundEventNodeDefinition subtree);

    /**
     * addRangeWithEnvelope:subtree
     * <p>
     * Create a blend range defined by a PHASEEnvelope object.
     *
     * @param envelope The PHASEEnvelope object that defines the output gain for a range.
     * @param subtree  A PHASESoundEventNodeDefinition subtree that will be active for this range.
     */
    @Generated
    @Selector("addRangeWithEnvelope:subtree:")
    public native void addRangeWithEnvelopeSubtree(PHASEEnvelope envelope, PHASESoundEventNodeDefinition subtree);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEBlendNodeDefinition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASEBlendNodeDefinition allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] blendParameterDefinition
     * <p>
     * The readonly property that returns the PHASENumberMetaParameterDefinition this blend node was created with and assigned to.
     */
    @Generated
    @Selector("blendParameterDefinition")
    public native PHASENumberMetaParameterDefinition blendParameterDefinition();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEBlendNodeDefinition init();

    /**
     * initDistanceBlendWithSpatialMixerDefinition
     * <p>
     * Create a blend node definition
     *
     * @param spatialMixerDefinition A PHASESpatialMixerDefinition that will bind the blend parameter to the distance between the source and listener.
     * @return A new PHASEBlendNodeDefinition object
     */
    @Generated
    @Selector("initDistanceBlendWithSpatialMixerDefinition:")
    public native PHASEBlendNodeDefinition initDistanceBlendWithSpatialMixerDefinition(
            PHASESpatialMixerDefinition spatialMixerDefinition);

    /**
     * initDistanceBlendWithSpatialMixerDefinition:identifier
     * <p>
     * Create a blend node definition
     *
     * @param spatialMixerDefinition A PHASESpatialMixerDefinition that will bind the blend parameter to the distance between the source and listener.
     * @param identifier             An optional custom identifier to give to this object
     * @return A new PHASEBlendNodeDefinition object
     */
    @Generated
    @Selector("initDistanceBlendWithSpatialMixerDefinition:identifier:")
    public native PHASEBlendNodeDefinition initDistanceBlendWithSpatialMixerDefinitionIdentifier(
            PHASESpatialMixerDefinition spatialMixerDefinition, String identifier);

    /**
     * initWithBlendMetaParameterDefinition
     * <p>
     * Create a blend node definition
     *
     * @param blendMetaParameterDefinition A metaparameter definition that wil be used to control the parameter of the blend node at runtime.
     * @return A new PHASEBlendNodeDefinition object
     */
    @Generated
    @Selector("initWithBlendMetaParameterDefinition:")
    public native PHASEBlendNodeDefinition initWithBlendMetaParameterDefinition(
            PHASENumberMetaParameterDefinition blendMetaParameterDefinition);

    /**
     * initWithBlendMetaParameterDefinition:identifier
     * <p>
     * Create a blend node definition
     *
     * @param blendMetaParameterDefinition A metaparameter definition that wil be used to control the parameter of the blend node at runtime.
     * @param identifier                   An optional custom identifier to give to this object
     * @return A new PHASEBlendNodeDefinition object
     */
    @Generated
    @Selector("initWithBlendMetaParameterDefinition:identifier:")
    public native PHASEBlendNodeDefinition initWithBlendMetaParameterDefinitionIdentifier(
            PHASENumberMetaParameterDefinition blendMetaParameterDefinition, String identifier);

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
    public static native PHASEBlendNodeDefinition new_objc();

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
     * [@property] distanceSpatialMixerDefinition
     * <p>
     * The readonly property that returns the PHASESpatialMixerDefinition this blend node was created with and assigned to.
     */
    @Generated
    @Selector("spatialMixerDefinitionForDistance")
    public native PHASESpatialMixerDefinition spatialMixerDefinitionForDistance();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
