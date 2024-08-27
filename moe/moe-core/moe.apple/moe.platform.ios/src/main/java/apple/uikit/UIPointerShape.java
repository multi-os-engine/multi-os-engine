package apple.uikit;

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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.4
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPointerShape extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPointerShape(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPointerShape alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPointerShape allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Morphs the pointer to a beam with the given length and axis.
     * 
     * @param length The beam's length. Limited to the region's width or height, depending on the beam's axis.
     * @param axis   The axis along which to draw the beam. Axis must be either UIAxisVertical or UIAxisHorizontal.
     */
    @NotNull
    @Generated
    @Selector("beamWithPreferredLength:axis:")
    public static native UIPointerShape beamWithPreferredLengthAxis(@NFloat double length, @NUInt long axis);

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
    public native UIPointerShape init();

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
    public static native UIPointerShape new_objc();

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
     * UIBezierPath describing the pointer's shape. If used alongside a content effect, the shape must be
     * in the effect's preview's container view's coordinate space. When used as a standalone shape,
     * The path's bounds' origin corresponds to the pointer's physical location.
     */
    @Generated
    @Selector("shapeWithPath:")
    public static native UIPointerShape shapeWithPath(@NotNull UIBezierPath path);

    /**
     * Morphs the pointer to a rounded rectangle with the provided rect and the standard system corner radius.
     * 
     * @param rect CGRect describing the pointer's frame. If used alongside a content effect, this rect must be in the
     *             effect's
     *             preview's container view's coordinate space. Otherwise, it is centered about the pointer's current
     *             location
     *             and the rect's origin is interpreted as an offset.
     */
    @Generated
    @Selector("shapeWithRoundedRect:")
    public static native UIPointerShape shapeWithRoundedRect(@ByValue CGRect rect);

    /**
     * Morphs the pointer to a rounded rectangle with the provided rect and cornerRadius.
     * 
     * @param rect         CGRect describing the pointer's frame. If used alongside a content effect, this rect must be
     *                     in
     *                     the effect's preview's container view's coordinate space. Otherwise, it is centered about the
     *                     pointer's current location and the rect's origin is interpreted as an offset.
     * @param cornerRadius Corner radius to apply to the pointer.
     */
    @Generated
    @Selector("shapeWithRoundedRect:cornerRadius:")
    public static native UIPointerShape shapeWithRoundedRectCornerRadius(@ByValue CGRect rect,
            @NFloat double cornerRadius);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
