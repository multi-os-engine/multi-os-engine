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
 * [@interface] PHASECardioidDirectivityModelSubbandParameters
 * <p>
 * Cardioid directivity model subband parameters.
 */
@Generated
@Library("PHASE")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHASECardioidDirectivityModelSubbandParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHASECardioidDirectivityModelSubbandParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHASECardioidDirectivityModelSubbandParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHASECardioidDirectivityModelSubbandParameters allocWithZone(VoidPtr zone);

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
     * Values are clamped to the range [20.0, 20000.0]. Default value is 1000.0.
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
    public native PHASECardioidDirectivityModelSubbandParameters init();

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
    public static native PHASECardioidDirectivityModelSubbandParameters new_objc();

    /**
     * [@property] pattern
     * <p>
     * The directivity pattern.
     * [@note]
     * Values are clamped to the range [0.0, 1.0]. Default value is 0.0. 0.0 is omnidirectional. 0.5 is cardioid. 1.0 is
     * dipole.
     */
    @Generated
    @Selector("pattern")
    public native double pattern();

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
     * Values are clamped to the range [20.0, 20000.0]. Default value is 1000.0.
     */
    @Generated
    @Selector("setFrequency:")
    public native void setFrequency(double value);

    /**
     * [@property] pattern
     * <p>
     * The directivity pattern.
     * [@note]
     * Values are clamped to the range [0.0, 1.0]. Default value is 0.0. 0.0 is omnidirectional. 0.5 is cardioid. 1.0 is
     * dipole.
     */
    @Generated
    @Selector("setPattern:")
    public native void setPattern(double value);

    /**
     * [@property] sharpness
     * <p>
     * The sharpness of the directivity pattern.
     * [@note]
     * Values are clamped to the range [1.0, DBL_MAX]. Default value is 1.0. Values > 1.0 increase sharpness.
     */
    @Generated
    @Selector("setSharpness:")
    public native void setSharpness(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sharpness
     * <p>
     * The sharpness of the directivity pattern.
     * [@note]
     * Values are clamped to the range [1.0, DBL_MAX]. Default value is 1.0. Values > 1.0 increase sharpness.
     */
    @Generated
    @Selector("sharpness")
    public native double sharpness();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
