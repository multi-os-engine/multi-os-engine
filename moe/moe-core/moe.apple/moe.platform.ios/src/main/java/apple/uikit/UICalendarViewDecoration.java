package apple.uikit;

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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICalendarViewDecoration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UICalendarViewDecoration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICalendarViewDecoration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UICalendarViewDecoration allocWithZone(VoidPtr zone);

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

    /**
     * Creates a default image accessory with a circle image, and the specified color and size.
     */
    @Generated
    @Selector("decorationWithColor:size:")
    public static native UICalendarViewDecoration decorationWithColorSize(@Nullable UIColor color, @NInt long size);

    /**
     * Creates a new custom view decoration using the specified custom view provider. The provider will be called once
     * when the decoration view is first loaded. The decoration will be clipped to its parent's bounds, and cannot have
     * user interaction.
     */
    @Generated
    @Selector("decorationWithCustomViewProvider:")
    public static native UICalendarViewDecoration decorationWithCustomViewProvider(
            @NotNull @ObjCBlock(name = "call_decorationWithCustomViewProvider") Block_decorationWithCustomViewProvider customViewProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_decorationWithCustomViewProvider {
        @NotNull
        @Generated
        UIView call_decorationWithCustomViewProvider();
    }

    /**
     * Creates an accessory with the specified image, and default color, and size.
     */
    @Generated
    @Selector("decorationWithImage:")
    public static native UICalendarViewDecoration decorationWithImage(@Nullable UIImage image);

    /**
     * Creates an accessory with the specified image, color, and size.
     */
    @Generated
    @Selector("decorationWithImage:color:size:")
    public static native UICalendarViewDecoration decorationWithImageColorSize(@Nullable UIImage image,
            @Nullable UIColor color, @NInt long size);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a default decoration with a circle image.
     */
    @Generated
    @Selector("init")
    public native UICalendarViewDecoration init();

    /**
     * Creates a new custom view decoration using the provided view provider. The provider will
     * be called once when the decoration view is first loaded. The decoration will be clipped to
     * its parent's bounds, and cannot have interaction.
     */
    @Generated
    @Selector("initWithCustomViewProvider:")
    public native UICalendarViewDecoration initWithCustomViewProvider(
            @NotNull @ObjCBlock(name = "call_initWithCustomViewProvider") Block_initWithCustomViewProvider customViewProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCustomViewProvider {
        @NotNull
        @Generated
        UIView call_initWithCustomViewProvider();
    }

    /**
     * Creates a new image-based decoration with the specified image, color, and size.
     * 
     * @param image The image of the decoration, defaults to @c circlebadge.fill if nil.
     * @param color The color of the the decoration. defaults to @c UIColor.systemFillColor if nil.
     * @param size  The preferred size of the decoration. The default is UICalendarViewDecorationSizeMedium
     */
    @Generated
    @Selector("initWithImage:color:size:")
    public native UICalendarViewDecoration initWithImageColorSize(@Nullable UIImage image, @Nullable UIColor color,
            @NInt long size);

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
    public static native UICalendarViewDecoration new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();
}