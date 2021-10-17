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
 * [@interface] PHASEGroupPresetSetting
 * <p>
 * A PHASEGroupPresetSetting is an object that holds settings that can be applied to a PHASEGroup object.
 * <p>
 * These can be either be manually created and added to a PHASEGroupPreset object, or created inline using PHASEGroupPreset addGroup.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEGroupPresetSetting extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEGroupPresetSetting(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEGroupPresetSetting alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PHASEGroupPresetSetting allocWithZone(VoidPtr zone);

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
     * [@property] gain
     * <p>
     * Linear gain scalar.
     * [@note]
     * Values are clamped to the range [0, 1]. Default value is 1.
     */
    @Generated
    @Selector("gain")
    public native double gain();

    /**
     * [@property] gainCurveType
     * <p>
     * The type of curve to apply to the gain as the preset changes to this new setting.
     */
    @Generated
    @Selector("gainCurveType")
    @NInt
    public native long gainCurveType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEGroupPresetSetting init();

    /**
     * initWithGain:rate:gainCurveType:rateCurveType
     * <p>
     * Initialize the PHASEGroupPresetSetting object with an existing PHASEGroup object.
     *
     * @param gain          The main gain setting to apply to the group. Values are clamped to the range [0, 1]. Default value is 1.
     * @param rate          The playback rate setting to apply to the group. Values are clamped to the range [0.25, 4]. Default value is 1.
     * @param gainCurveType The type of curve to apply to the gain as the preset changes to this new setting.
     * @param rateCurveType The type of curve to apply to the rate as the preset changes to this new setting.
     */
    @Generated
    @Selector("initWithGain:rate:gainCurveType:rateCurveType:")
    public native PHASEGroupPresetSetting initWithGainRateGainCurveTypeRateCurveType(double gain, double rate,
            @NInt long gainCurveType, @NInt long rateCurveType);

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
    public static native PHASEGroupPresetSetting new_objc();

    /**
     * [@property] rate
     * <p>
     * Linear rate scalar.
     */
    @Generated
    @Selector("rate")
    public native double rate();

    /**
     * [@property] rateCurveType
     * <p>
     * The type of curve to apply to the rate as the preset changes to this new setting.
     */
    @Generated
    @Selector("rateCurveType")
    @NInt
    public native long rateCurveType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
