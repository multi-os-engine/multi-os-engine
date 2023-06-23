package apple.soundanalysis;

import apple.NSObject;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * Constrains CMTime durations to a subset of legal values.
 * 
 * `SNTimeDurationConstraint` is a union type, which, based on the value of its `type` property, may assume one of
 * several forms. Instance properties may be used to extract information from an object, but certain properties are only
 * valid to exercise under certain circumstances. Before accessing a particular property, refer to its documentation to
 * understand what `type` value is required in order for that property to be valid.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SNTimeDurationConstraint extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SNTimeDurationConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SNTimeDurationConstraint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SNTimeDurationConstraint allocWithZone(VoidPtr zone);

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
     * If the constraint type is range, then the range of allowable window durations.
     * 
     * The `type` property should be queried before this property is accessed. This property will only yield meaningful
     * values if the constraint type is considered to be 'range'. The constraint type is considered to be 'range' if the
     * `type` property is equal to `SNTimeDurationConstraintTypeRange`.
     * 
     * @return If the constraint type is range, a CMTimeRange representing the range of allowable window durations. If
     *         the constraint type is not range, `kCMTimeRangeInvalid`.
     */
    @Generated
    @Selector("durationRange")
    @ByValue
    public native CMTimeRange durationRange();

    /**
     * If the constraint type is enumerated, then the set of discrete allowable time durations.
     * 
     * The `type` property should be queried before this property is accessed. This property will only yield meaningful
     * values if the constraint type is considered to be 'enumerated'. The constraint type is considered to be
     * 'enumerated' if the `type` property is equal to `SNTimeDurationConstraintTypeEnumerated`.
     * 
     * @return If the constraint type is enumerated, an array of CMTime structures (boxed in NSValue instances)
     *         representing the set of allowable time durations. The durations will always be provided sorted in order
     *         of ascending time. If the constraint type is not enumerated, an empty array will be returned.
     */
    @NotNull
    @Generated
    @Selector("enumeratedDurations")
    public native NSArray<? extends NSValue> enumeratedDurations();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SNTimeDurationConstraint init();

    /**
     * Initializes a range-type constraint.
     * 
     * @param durationRange A continuous range of duration values (represented as CMTime values) permitted by this
     *                      constraint.
     * @return An instance whose `type` is `SNTimeDurationConstraintTypeRange`, and which constrains durations values to
     *         the provided range.
     */
    @Generated
    @Selector("initWithDurationRange:")
    public native SNTimeDurationConstraint initWithDurationRange(@ByValue CMTimeRange durationRange);

    /**
     * Initializes an enumerated-type constraint.
     * 
     * @param enumeratedDurations A discrete set of duration values (represented as CMTime values boxed in NSValue
     *                            instances) permitted by this constraint.
     * @return An instance whose `type` is `SNTimeDurationConstraintTypeEnumerated`, and which constrains duration
     *         values to the provided set of discrete values.
     */
    @Generated
    @Selector("initWithEnumeratedDurations:")
    public native SNTimeDurationConstraint initWithEnumeratedDurations(
            @NotNull NSArray<? extends NSValue> enumeratedDurations);

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
    public static native SNTimeDurationConstraint new_objc();

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

    /**
     * The time constraint type.
     * 
     * The value of this property dictates whether or not other properties associated with this class can be validly
     * accessed. Please refer to the documentation of other individual properties to understand their relationship to
     * this one. This property is always valid to access.
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
