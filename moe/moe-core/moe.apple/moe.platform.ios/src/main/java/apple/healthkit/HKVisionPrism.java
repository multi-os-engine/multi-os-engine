package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * HKVisionPrism
 * 
 * An object subclass representing prism vision fields used in eye glasses to correct double vision.
 * The prism aligns the two images so only one is seen.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKVisionPrism extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKVisionPrism(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKVisionPrism alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKVisionPrism allocWithZone(VoidPtr zone);

    /**
     * [@property] amount
     * 
     * The compensation in prism diopters to correct eye misalignment [polar coordinates]
     */
    @NotNull
    @Generated
    @Selector("amount")
    public native HKQuantity amount();

    /**
     * [@property] angle
     * 
     * The direction of the prism base [polar coordinates]
     */
    @NotNull
    @Generated
    @Selector("angle")
    public native HKQuantity angle();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] eye
     * 
     * Which eye (left or right)
     */
    @Generated
    @Selector("eye")
    @NInt
    public native long eye();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] horizontalAmount
     * 
     * The horizontal component of compensation in prism diopters [rectangular coordinates]
     */
    @NotNull
    @Generated
    @Selector("horizontalAmount")
    public native HKQuantity horizontalAmount();

    /**
     * [@property] horizontalBase
     * 
     * The direction of the prism base relative to the horizontal axis of the lens;
     * base in (toward the nose) or base out (away from the nose). [rectangular coordinates]
     */
    @Generated
    @Selector("horizontalBase")
    @NInt
    public native long horizontalBase();

    @Generated
    @Selector("init")
    public native HKVisionPrism init();

    /**
     * initWithAmount:angle:eye
     * 
     * @param amount The compensation for amount eye misalignment
     * @param angle  The angle of the lens required to correct diplopia
     * @param eye    The eye associated with the prism values
     */
    @Generated
    @Selector("initWithAmount:angle:eye:")
    public native HKVisionPrism initWithAmountAngleEye(@NotNull HKQuantity amount, @NotNull HKQuantity angle,
            @NInt long eye);

    @Generated
    @Selector("initWithCoder:")
    public native HKVisionPrism initWithCoder(@NotNull NSCoder coder);

    /**
     * initWithVerticalAmount:verticalBase:horizontalAmount:horizontalBase:eye
     * 
     * @param verticalAmount   The vertical component of compensation in prism diopters
     * @param verticalBase     The direction of the prism base relative to the vertical axis of the lens;
     *                         base up or base down.
     * @param horizontalAmount The horizontal component of compensation in prism diopters
     * @param horizontalBase   The direction of the prism base relative to the horizontal axis of the lens;
     *                         base in (toward the nose) or base out (away from the nose).
     * @param eye              The eye associated with the prism values
     */
    @Generated
    @Selector("initWithVerticalAmount:verticalBase:horizontalAmount:horizontalBase:eye:")
    public native HKVisionPrism initWithVerticalAmountVerticalBaseHorizontalAmountHorizontalBaseEye(
            @NotNull HKQuantity verticalAmount, @NInt long verticalBase, @NotNull HKQuantity horizontalAmount,
            @NInt long horizontalBase, @NInt long eye);

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
    public static native HKVisionPrism new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] verticalAmount
     * 
     * The vertical component of compensation in prism diopters [rectangular coordinates]
     */
    @NotNull
    @Generated
    @Selector("verticalAmount")
    public native HKQuantity verticalAmount();

    /**
     * [@property] verticalBase
     * 
     * The direction of the prism base relative to the vertical axis of the lens;
     * base up or base down. [rectangular coordinates]
     */
    @Generated
    @Selector("verticalBase")
    @NInt
    public native long verticalBase();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}