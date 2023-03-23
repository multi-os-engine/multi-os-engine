package apple.corehaptics;

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
 * CHHapticDynamicParameter
 * 
 * A CHHapticDynamicParameter contains a CHHapticDynamicParameterID/value pair which will modify (modulate) the ongoing
 * character
 * of a haptic or audio event.
 * 
 * CHHapticDynamicParameters have a relative time property to allow specifying the time relationship between parameters
 * in a pattern.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHHapticDynamicParameter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHHapticDynamicParameter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHHapticDynamicParameter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHHapticDynamicParameter allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHHapticDynamicParameter init();

    /**
     * initWithParameterID:value:relativeTime
     * 
     * Initialize a CHHapticDynamicParameter with a parameter ID, value, and relative time.
     * 
     * @param parameterID
     *                    The CHHapticDynamicParameterID for the desired parameter change.
     * @param value
     *                    The value for that parameter.
     * @param time
     *                    The time at which this parameter should be applied, relative to the start time of the pattern.
     */
    @Generated
    @Selector("initWithParameterID:value:relativeTime:")
    public native CHHapticDynamicParameter initWithParameterIDValueRelativeTime(String parameterID, float value,
            double time);

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
    public static native CHHapticDynamicParameter new_objc();

    /**
     * [@property] parameterID
     * The ID of the dynamic parameter to use.
     */
    @Generated
    @Selector("parameterID")
    public native String parameterID();

    /**
     * [@property] relativeTime
     * The time at which the parameter should be applied, relative to the start time for the pattern.
     */
    @Generated
    @Selector("relativeTime")
    public native double relativeTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] relativeTime
     * The time at which the parameter should be applied, relative to the start time for the pattern.
     */
    @Generated
    @Selector("setRelativeTime:")
    public native void setRelativeTime(double value);

    /**
     * [@property] value
     * The value of the parameter.
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] value
     * The value of the parameter.
     */
    @Generated
    @Selector("value")
    public native float value();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
