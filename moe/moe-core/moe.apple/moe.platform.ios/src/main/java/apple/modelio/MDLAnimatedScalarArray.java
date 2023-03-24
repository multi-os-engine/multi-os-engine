package apple.modelio;

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
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
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
 * AUTO-GENERATED FROM CodeGenArray.h
 * 
 * API-Since: 11.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLAnimatedScalarArray extends MDLAnimatedValue {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLAnimatedScalarArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLAnimatedScalarArray alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLAnimatedScalarArray allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("elementCount")
    @NUInt
    public native long elementCount();

    @Generated
    @Selector("getDoubleArray:maxCount:")
    @NUInt
    public native long getDoubleArrayMaxCount(@NotNull DoublePtr valuesArray, @NUInt long maxCount);

    @Generated
    @Selector("getDoubleArray:maxCount:atTime:")
    @NUInt
    public native long getDoubleArrayMaxCountAtTime(@NotNull DoublePtr array, @NUInt long maxCount, double time);

    @Generated
    @Selector("getFloatArray:maxCount:")
    @NUInt
    public native long getFloatArrayMaxCount(@NotNull FloatPtr valuesArray, @NUInt long maxCount);

    @Generated
    @Selector("getFloatArray:maxCount:atTime:")
    @NUInt
    public native long getFloatArrayMaxCountAtTime(@NotNull FloatPtr array, @NUInt long maxCount, double time);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MDLAnimatedScalarArray init();

    @Generated
    @Selector("initWithElementCount:")
    public native MDLAnimatedScalarArray initWithElementCount(@NUInt long arrayElementCount);

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

    @Generated
    @Owned
    @Selector("new")
    public static native MDLAnimatedScalarArray new_objc();

    @Generated
    @Selector("resetWithDoubleArray:count:atTimes:count:")
    public native void resetWithDoubleArrayCountAtTimesCount(@NotNull ConstDoublePtr valuesArray,
            @NUInt long valuesCount, @NotNull ConstDoublePtr timesArray, @NUInt long timesCount);

    @Generated
    @Selector("resetWithFloatArray:count:atTimes:count:")
    public native void resetWithFloatArrayCountAtTimesCount(@NotNull ConstFloatPtr valuesArray, @NUInt long valuesCount,
            @NotNull ConstDoublePtr timesArray, @NUInt long timesCount);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setDoubleArray:count:atTime:")
    public native void setDoubleArrayCountAtTime(@NotNull ConstDoublePtr array, @NUInt long count, double time);

    @Generated
    @Selector("setFloatArray:count:atTime:")
    public native void setFloatArrayCountAtTime(@NotNull ConstFloatPtr array, @NUInt long count, double time);

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
