package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFocusHaloEffect extends UIFocusEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFocusHaloEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFocusHaloEffect alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFocusHaloEffect allocWithZone(VoidPtr zone);

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

    /**
     * Container view in which to place the effect. When not set, the container is determined automatically
     * from the focus item that provided this effect and the @c referenceView (if present).
     */
    @Nullable
    @Generated
    @Selector("containerView")
    public native UIView containerView();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("effect")
    public static native UIFocusHaloEffect effect();

    /**
     * Creates a halo with the given bezier path.
     */
    @Generated
    @Selector("effectWithPath:")
    public static native UIFocusHaloEffect effectWithPath(@NotNull UIBezierPath bezierPath);

    /**
     * Creates a rectangular halo.
     */
    @Generated
    @Selector("effectWithRect:")
    public static native UIFocusHaloEffect effectWithRect(@ByValue CGRect rect);

    /**
     * Creates a rounded rect halo using the specified corner radius and corner curve.
     */
    @Generated
    @Selector("effectWithRoundedRect:cornerRadius:curve:")
    public static native UIFocusHaloEffect effectWithRoundedRectCornerRadiusCurve(@ByValue CGRect rect,
            @NFloat double cornerRadius, @NotNull String curve);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIFocusHaloEffect init();

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
    public static native UIFocusHaloEffect new_objc();

    /**
     * Position of the halo relative to the specified shape. Defaults to @c UIFocusHaloEffectPositionAutomatic.
     */
    @Generated
    @Selector("position")
    @NInt
    public native long position();

    /**
     * When set, the halo is placed above this view. If a @c containerView is also set, the @c referenceView must be a
     * descendant
     * of the @c containerView. The system will ensure that the halo is in the container but visually above the @c
     * referenceView.
     */
    @Nullable
    @Generated
    @Selector("referenceView")
    public native UIView referenceView();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Container view in which to place the effect. When not set, the container is determined automatically
     * from the focus item that provided this effect and the @c referenceView (if present).
     */
    @Generated
    @Selector("setContainerView:")
    public native void setContainerView_unsafe(@Nullable UIView value);

    /**
     * Container view in which to place the effect. When not set, the container is determined automatically
     * from the focus item that provided this effect and the @c referenceView (if present).
     */
    @Generated
    public void setContainerView(@Nullable UIView value) {
        Object __old = containerView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setContainerView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Position of the halo relative to the specified shape. Defaults to @c UIFocusHaloEffectPositionAutomatic.
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@NInt long value);

    /**
     * When set, the halo is placed above this view. If a @c containerView is also set, the @c referenceView must be a
     * descendant
     * of the @c containerView. The system will ensure that the halo is in the container but visually above the @c
     * referenceView.
     */
    @Generated
    @Selector("setReferenceView:")
    public native void setReferenceView_unsafe(@Nullable UIView value);

    /**
     * When set, the halo is placed above this view. If a @c containerView is also set, the @c referenceView must be a
     * descendant
     * of the @c containerView. The system will ensure that the halo is in the container but visually above the @c
     * referenceView.
     */
    @Generated
    public void setReferenceView(@Nullable UIView value) {
        Object __old = referenceView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setReferenceView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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
