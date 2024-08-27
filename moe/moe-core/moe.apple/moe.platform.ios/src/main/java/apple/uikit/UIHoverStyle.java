package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.protocol.UIHoverEffect;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * The hover style to apply to a view, including an effect and a shape to use
 * for displaying that effect.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIHoverStyle extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIHoverStyle(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIHoverStyle alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIHoverStyle allocWithZone(VoidPtr zone);

    /**
     * Creates a hover style with the default shape and a `UIHoverAutomaticEffect`.
     */
    @Generated
    @Selector("automaticStyle")
    @NotNull
    public static native UIHoverStyle automaticStyle();

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

    /**
     * The effect to apply to the view with this style. Use `UIHoverAutomaticEffect`
     * to apply a system-default effect to the view.
     */
    @Generated
    @Selector("effect")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native UIHoverEffect effect();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIHoverStyle init();

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

    /**
     * Whether the effect to apply to the view with this style is enabled.
     * Use this property to temporarily disable a view's hover effect without
     * removing it from the view entirely.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

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
    public static native UIHoverStyle new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The effect to apply to the view with this style. Use `UIHoverAutomaticEffect`
     * to apply a system-default effect to the view.
     */
    @Generated
    @Selector("setEffect:")
    public native void setEffect(@Mapped(ObjCObjectMapper.class) @NotNull UIHoverEffect value);

    /**
     * Whether the effect to apply to the view with this style is enabled.
     * Use this property to temporarily disable a view's hover effect without
     * removing it from the view entirely.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * The shape to use for the hover effect. If a `nil` shape is used, a
     * system-default shape will be chosen based on the view.
     */
    @Generated
    @Selector("setShape:")
    public native void setShape(@Nullable UIShape value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The shape to use for the hover effect. If a `nil` shape is used, a
     * system-default shape will be chosen based on the view.
     */
    @Generated
    @Selector("shape")
    @Nullable
    public native UIShape shape();

    /**
     * Creates a hover style with the provided effect and shape.
     */
    @Generated
    @Selector("styleWithEffect:shape:")
    public static native UIHoverStyle styleWithEffectShape(
            @Mapped(ObjCObjectMapper.class) @NotNull UIHoverEffect effect, @Nullable UIShape shape);

    /**
     * Creates a hover style with the provided shape and a `UIHoverAutomaticEffect`.
     */
    @Generated
    @Selector("styleWithShape:")
    public static native UIHoverStyle styleWithShape(@Nullable UIShape shape);

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