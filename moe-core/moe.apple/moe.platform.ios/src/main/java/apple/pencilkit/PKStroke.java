package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.UIBezierPath;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The data model value representing a stroke in a `PKDrawing`.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKStroke extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PKStroke(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKStroke alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKStroke allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKStroke init();

    @Generated
    @Selector("initWithInk:strokePath:transform:mask:")
    public native PKStroke initWithInkStrokePathTransformMask(@NotNull PKInk ink, @NotNull PKStrokePath strokePath,
            @ByValue CGAffineTransform transform, @Nullable UIBezierPath mask);

    /**
     * The ink used to render this stroke.
     */
    @NotNull
    @Generated
    @Selector("ink")
    public native PKInk ink();

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

    @Nullable
    @Generated
    @Selector("mask")
    public native UIBezierPath mask();

    /**
     * These are the parametric parameter ranges of points in `strokePath`
     * that intersect the stroke's mask.
     */
    @NotNull
    @Generated
    @Selector("maskedPathRanges")
    public native NSArray<? extends PKFloatRange> maskedPathRanges();

    @Generated
    @Owned
    @Selector("new")
    public static native PKStroke new_objc();

    /**
     * The B-spline path that describes this stroke.
     */
    @NotNull
    @Generated
    @Selector("path")
    public native PKStrokePath path();

    /**
     * The bounds of the rendered stroke.
     * This includes the width & ink of the stroke after the transform
     * is applied.
     */
    @Generated
    @Selector("renderBounds")
    @ByValue
    public native CGRect renderBounds();

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
     * The affine transform of the stroke when rendered.
     */
    @Generated
    @Selector("transform")
    @ByValue
    public native CGAffineTransform transform();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithInk:strokePath:transform:mask:randomSeed:")
    public native PKStroke initWithInkStrokePathTransformMaskRandomSeed(@NotNull PKInk ink,
            @NotNull PKStrokePath strokePath, @ByValue CGAffineTransform transform, @Nullable UIBezierPath mask,
            int randomSeed);

    /**
     * The random seed for drawing strokes that use randomized effects.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("randomSeed")
    public native int randomSeed();

    /**
     * The PencilKit version required to use this stroke.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("requiredContentVersion")
    @NInt
    public native long requiredContentVersion();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
