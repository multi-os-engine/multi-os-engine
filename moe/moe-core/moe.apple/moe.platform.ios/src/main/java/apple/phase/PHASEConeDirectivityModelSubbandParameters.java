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
 * [@interface] PHASEConeDirectivityModelSubbandParameters
 * <p>
 * Cone directivity model subband parameters.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASEConeDirectivityModelSubbandParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASEConeDirectivityModelSubbandParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASEConeDirectivityModelSubbandParameters alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native PHASEConeDirectivityModelSubbandParameters allocWithZone(VoidPtr zone);

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
     * [@property] frequency
     * <p>
     * The frequency of the subband, in hertz.
     * [@note]
     * Default value is 1000.0.
     */
    @Generated
    @Selector("frequency")
    public native double frequency();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PHASEConeDirectivityModelSubbandParameters init();

    /**
     * [@property] innerAngle
     * <p>
     * The inner angle, in degrees.
     * [@note]
     * Default value is 360.0.
     */
    @Generated
    @Selector("innerAngle")
    public native double innerAngle();

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
    public static native PHASEConeDirectivityModelSubbandParameters new_objc();

    /**
     * [@property] outerAngle
     * <p>
     * The outer angle, in degrees.
     * [@note]
     * Default value is 360.0.
     */
    @Generated
    @Selector("outerAngle")
    public native double outerAngle();

    /**
     * [@property] outerGain
     * <p>
     * The outer gain.
     * [@note]
     * Values are clamped to the range [0.0, 1.0]. Default value is 1.0.
     */
    @Generated
    @Selector("outerGain")
    public native double outerGain();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] frequency
     * <p>
     * The frequency of the subband, in hertz.
     * [@note]
     * Default value is 1000.0.
     */
    @Generated
    @Selector("setFrequency:")
    public native void setFrequency(double value);

    /**
     * setInnerAngle:outerAngle
     * <p>
     * Set the innerAngle and outerAngle of the Cone Directivity Model Subband
     * [@note] The default value for each angle is 360.0. outerAngle must be >= innerAngle.
     *
     * @param innerAngle The inner angle of the cone directivity model, must be less than or equal to outer angle.
     * @param outerAngle The outer angle of the cone directivity model, must be greater than or equal to inner angle.
     */
    @Generated
    @Selector("setInnerAngle:outerAngle:")
    public native void setInnerAngleOuterAngle(double innerAngle, double outerAngle);

    /**
     * [@property] outerGain
     * <p>
     * The outer gain.
     * [@note]
     * Values are clamped to the range [0.0, 1.0]. Default value is 1.0.
     */
    @Generated
    @Selector("setOuterGain:")
    public native void setOuterGain(double value);

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
