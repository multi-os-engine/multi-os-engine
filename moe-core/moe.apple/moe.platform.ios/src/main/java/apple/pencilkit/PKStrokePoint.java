package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A point value stores all the attributes of a PKStroke at a specific point.
 * `PKStrokePoint` stores its properties compressed, the value read for a property may not
 * exactly equal the value set for a property.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKStrokePoint extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PKStrokePoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKStrokePoint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKStrokePoint allocWithZone(VoidPtr zone);

    /**
     * Altitude used to create this point in radians, 0.0-π/2 radians
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("altitude")
    @NFloat
    public native double altitude();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Azimuth of the point in radians, 0.0-2π radians
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("azimuth")
    @NFloat
    public native double azimuth();

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

    /**
     * Force used to create this point.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("force")
    @NFloat
    public native double force();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKStrokePoint init();

    /**
     * Create a new point with the provided properties.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithLocation:timeOffset:size:opacity:force:azimuth:altitude:")
    public native PKStrokePoint initWithLocationTimeOffsetSizeOpacityForceAzimuthAltitude(@ByValue CGPoint location,
            double timeOffset, @ByValue CGSize size, @NFloat double opacity, @NFloat double force,
            @NFloat double azimuth, @NFloat double altitude);

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

    /**
     * Location of the point.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("location")
    @ByValue
    public native CGPoint location();

    @Generated
    @Owned
    @Selector("new")
    public static native PKStrokePoint new_objc();

    /**
     * Opacity of the point 0-2.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("opacity")
    @NFloat
    public native double opacity();

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
     * Size of the point.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Time offset since the start of the stroke path in seconds.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Create a new point with the provided properties.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithLocation:timeOffset:size:opacity:force:azimuth:altitude:secondaryScale:")
    public native PKStrokePoint initWithLocationTimeOffsetSizeOpacityForceAzimuthAltitudeSecondaryScale(
            @ByValue CGPoint location, double timeOffset, @ByValue CGSize size, @NFloat double opacity,
            @NFloat double force, @NFloat double azimuth, @NFloat double altitude, @NFloat double secondaryScale);

    /**
     * The scaling of the point for secondary effects.
     * 
     * For example the scaling of the pigment in the watercolor ink.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("secondaryScale")
    @NFloat
    public native double secondaryScale();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Create a new point with the provided properties.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithLocation:timeOffset:size:opacity:force:azimuth:altitude:secondaryScale:threshold:")
    public native PKStrokePoint initWithLocationTimeOffsetSizeOpacityForceAzimuthAltitudeSecondaryScaleThreshold(
            @ByValue CGPoint location, double timeOffset, @ByValue CGSize size, @NFloat double opacity,
            @NFloat double force, @NFloat double azimuth, @NFloat double altitude, @NFloat double secondaryScale,
            @NFloat double threshold);

    /**
     * The threshold for clipping the stroke rendering.
     * 
     * When rendering only pixels with an alpha greater than the threshold are drawn. A threshold of 0 has no affect on
     * rendering,
     * a threshold of 1 does not draw anything. Thresholds are only used for some inks, eg. `PKInkIdentifierReed`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("threshold")
    @NFloat
    public native double threshold();
}
