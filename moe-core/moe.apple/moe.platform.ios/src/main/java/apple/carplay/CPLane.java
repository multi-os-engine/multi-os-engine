package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitAngle;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * [@c] CPLane represents information about a single lane.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPLane extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPLane(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPLane alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPLane allocWithZone(VoidPtr zone);

    /**
     * [@c] angles is a list of the remaining angles of this lane guidance. If @c highlightedAngle is set, that angle
     * must not be included in @c angles
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("angles")
    @NotNull
    public native NSArray<? extends NSMeasurement<NSUnitAngle>> angles();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@c] highlightedAngle is the angle to be highlighted. If @c highlightedAngle is present it can not be included
     * in @c angles. @c highlightedAngle must not be set if status is @c CPLaneStatusNotGood
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("highlightedAngle")
    @Nullable
    public native NSMeasurement<NSUnitAngle> highlightedAngle();

    /**
     * API-Since: 17.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: -[CPLane initWithAngles:] or -[CPLane initWithHighlightedAngle:angles:isPreferred:]
     */
    @Generated
    @Deprecated
    @Selector("init")
    public native CPLane init();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithAngles:")
    public native CPLane initWithAngles(@NotNull NSArray<? extends NSMeasurement<NSUnitAngle>> angles);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithAngles:highlightedAngle:isPreferred:")
    public native CPLane initWithAnglesHighlightedAngleIsPreferred(
            @NotNull NSArray<? extends NSMeasurement<NSUnitAngle>> angles,
            @NotNull NSMeasurement<NSUnitAngle> highlightedAngle, boolean preferred);

    @Generated
    @Selector("initWithCoder:")
    public native CPLane initWithCoder(@NotNull NSCoder coder);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPLane new_objc();

    /**
     * primaryAngle is the angle to be highlighted if this lane is preferred or good. If primaryAngle is present it can
     * not be included in secondaryAngles.
     * 
     * API-Since: 17.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use highlightedAngle to get value, use -[CPLane initAngles:highlightedAngle:isPreferred:] to
     * create a CPLane with highlightedAngle set
     */
    @Generated
    @Deprecated
    @Selector("primaryAngle")
    @NotNull
    public native NSMeasurement<NSUnitAngle> primaryAngle();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * secondaryAngles is a list of the remaining angles of this lane guidance.
     * 
     * API-Since: 17.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use angles to get value, Use -[CPLane initWithAngles:] or -[CPLane
     * initAngles:highlightedAngle:isPreferred:] to create a CPLane with angles
     */
    @Generated
    @Deprecated
    @Selector("secondaryAngles")
    @NotNull
    public native NSArray<? extends NSMeasurement<NSUnitAngle>> secondaryAngles();

    /**
     * primaryAngle is the angle to be highlighted if this lane is preferred or good. If primaryAngle is present it can
     * not be included in secondaryAngles.
     * 
     * API-Since: 17.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use highlightedAngle to get value, use -[CPLane initAngles:highlightedAngle:isPreferred:] to
     * create a CPLane with highlightedAngle set
     */
    @Generated
    @Deprecated
    @Selector("setPrimaryAngle:")
    public native void setPrimaryAngle(@NotNull NSMeasurement<NSUnitAngle> value);

    /**
     * secondaryAngles is a list of the remaining angles of this lane guidance.
     * 
     * API-Since: 17.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use angles to get value, Use -[CPLane initWithAngles:] or -[CPLane
     * initAngles:highlightedAngle:isPreferred:] to create a CPLane with angles
     */
    @Generated
    @Deprecated
    @Selector("setSecondaryAngles:")
    public native void setSecondaryAngles(@NotNull NSArray<? extends NSMeasurement<NSUnitAngle>> value);

    /**
     * API-Since: 17.4
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use -[CPLane initWithAngles:] to create a CPLane with CPLaneStatusNotGood, use -[CPLane
     * initAngles:highlightedAngle:isPreferred:] to create a CPLane with status CPLaneStatusGood or
     * CPLaneStatusPreferred
     */
    @Generated
    @Deprecated
    @Selector("setStatus:")
    public native void setStatus(@NInt long status);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * status is a @c CPLaneStatus representing the status of this lane.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}