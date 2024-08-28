package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.protocol.UIShapeProvider;
import apple.uikit.struct.UIEdgeInsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * An abstract representation of a shape.
 * 
 * A `UIShape` can represent a simple shape such as a rectangle or circle that
 * are later "resolved" into a concrete shape based on context like a size and
 * position for the shape. A `UIShape` can also represent more complex shapes
 * like paths and even "dynamic" shapes that are resolved using a custom
 * closure.
 * 
 * You typically use a `UIShape` with APIs like `UIHoverStyle` to represent the
 * shape of an effect.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIShape extends NSObject implements UIShapeProvider, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIShape(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIShape alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIShape allocWithZone(VoidPtr zone);

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

    /**
     * A capsule shape, equivalent to a rounded rectangle where the corner
     * radius is chosen as half the length of the rectangle’s smallest edge.
     */
    @Generated
    @Selector("capsuleShape")
    @NotNull
    public static native UIShape capsuleShape();

    /**
     * A circular shape, with a radius equals half the length of the frame
     * rectangle’s smallest edge.
     */
    @Generated
    @Selector("circleShape")
    @NotNull
    public static native UIShape circleShape();

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

    /**
     * A fixed rectangle shape using `rect` as its shape, regardless of the
     * frame in which it is contained.
     */
    @Generated
    @Selector("fixedRectShapeWithRect:")
    @NotNull
    public static native UIShape fixedRectShapeWithRect(@ByValue CGRect rect);

    /**
     * A fixed rectangle shape using `rect` as its shape, regardless of the
     * frame in which it is contained, with rounded corners using `cornerRadius`.
     */
    @Generated
    @Selector("fixedRectShapeWithRect:cornerRadius:")
    @NotNull
    public static native UIShape fixedRectShapeWithRectCornerRadius(@ByValue CGRect rect, @NFloat double cornerRadius);

    /**
     * A fixed rectangle shape using `rect` as its shape, regardless of the
     * frame in which it is contained, with rounded corners using `cornerRadius`.
     */
    @Generated
    @Selector("fixedRectShapeWithRect:cornerRadius:cornerCurve:maskedCorners:")
    @NotNull
    public static native UIShape fixedRectShapeWithRectCornerRadiusCornerCurveMaskedCorners(@ByValue CGRect rect,
            @NFloat double cornerRadius, @NInt long cornerCurve, @NUInt long maskedCorners);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIShape init();

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
    public static native UIShape new_objc();

    /**
     * A rectangular shape.
     */
    @Generated
    @Selector("rectShape")
    @NotNull
    public static native UIShape rectShape();

    /**
     * A rectangular shape with rounded corners, aligned inside the frame of
     * in which it is contained.
     */
    @Generated
    @Selector("rectShapeWithCornerRadius:")
    @NotNull
    public static native UIShape rectShapeWithCornerRadius(@NFloat double cornerRadius);

    /**
     * A rectangular shape with rounded corners, aligned inside the frame of
     * in which it is contained.
     */
    @Generated
    @Selector("rectShapeWithCornerRadius:cornerCurve:")
    @NotNull
    public static native UIShape rectShapeWithCornerRadiusCornerCurve(@NFloat double cornerRadius,
            @NInt long cornerCurve);

    /**
     * A rectangular shape with rounded corners, aligned inside the frame of
     * in which it is contained.
     */
    @Generated
    @Selector("rectShapeWithCornerRadius:cornerCurve:maskedCorners:")
    @NotNull
    public static native UIShape rectShapeWithCornerRadiusCornerCurveMaskedCorners(@NFloat double cornerRadius,
            @NInt long cornerCurve, @NUInt long maskedCorners);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resolvedShapeInContext:")
    @NotNull
    public native UIResolvedShape resolvedShapeInContext(@NotNull UIShapeResolutionContext context);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Insets this shape by the provided `inset`, returning a new modified
     * shape.
     * 
     * Negative values can be used to add inner padding to a shape. If this
     * shape is not insettable (e.g., if it is a custom path), this has no
     * effect. For some shapes like rounded rectangles, this can also modify
     * the corner radii of the shape to ensure the resulting corners are
     * concentric.
     */
    @Generated
    @Selector("shapeByApplyingInset:")
    @NotNull
    public native UIShape shapeByApplyingInset(@NFloat double inset);

    /**
     * Insets this shape by the provided `insets`, returning a new modified
     * shape.
     * 
     * Negative values can be used to add inner padding to a shape. If this
     * shape is not insettable (e.g., if it is a custom path), this has no
     * effect. For some shapes like rounded rectangles, this can also modify
     * the corner radii of the shape to ensure the resulting corners are
     * concentric.
     */
    @Generated
    @Selector("shapeByApplyingInsets:")
    @NotNull
    public native UIShape shapeByApplyingInsets(@ByValue UIEdgeInsets insets);

    /**
     * A shape with a custom bezier path.
     */
    @Generated
    @Selector("shapeWithBezierPath:")
    public static native UIShape shapeWithBezierPath(@NotNull UIBezierPath path);

    /**
     * Creates a dynamic shape that can be resolved using the provided
     * `UIShapeProvider` based on context like its containing rect.
     */
    @Generated
    @Selector("shapeWithProvider:")
    public static native UIShape shapeWithProvider(@Mapped(ObjCObjectMapper.class) @NotNull UIShapeProvider provider);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}