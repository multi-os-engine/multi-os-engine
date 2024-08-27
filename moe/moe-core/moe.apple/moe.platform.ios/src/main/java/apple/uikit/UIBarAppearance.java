package apple.uikit;

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
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarAppearance extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarAppearance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarAppearance alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIBarAppearance allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * A color to use for the bar background. This color is composited over backgroundEffects.
     */
    @Nullable
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * A specific blur effect to use for the bar background. This effect is composited first when constructing the bar's
     * background.
     */
    @Nullable
    @Generated
    @Selector("backgroundEffect")
    public native UIBlurEffect backgroundEffect();

    /**
     * An image to use for the bar background. This image is composited over the backgroundColor, and resized per the
     * backgroundImageContentMode.
     */
    @Nullable
    @Generated
    @Selector("backgroundImage")
    public native UIImage backgroundImage();

    /**
     * The content mode to use when rendering the backgroundImage. Defaults to UIViewContentModeScaleToFill.
     * UIViewContentModeRedraw will be reinterpreted as UIViewContentModeScaleToFill.
     */
    @Generated
    @Selector("backgroundImageContentMode")
    @NInt
    public native long backgroundImageContentMode();

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
     * Reset background and shadow properties to their defaults.
     */
    @Generated
    @Selector("configureWithDefaultBackground")
    public native void configureWithDefaultBackground();

    /**
     * Reset background and shadow properties to display theme-appropriate opaque colors.
     */
    @Generated
    @Selector("configureWithOpaqueBackground")
    public native void configureWithOpaqueBackground();

    /**
     * Reset background and shadow properties to be transparent.
     */
    @Generated
    @Selector("configureWithTransparentBackground")
    public native void configureWithTransparentBackground();

    @NotNull
    @Generated
    @Owned
    @Selector("copy")
    public native UIBarAppearance copy();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The idiom that this appearance object targets.
     */
    @Generated
    @Selector("idiom")
    @NInt
    public native long idiom();

    /**
     * Constructs a new bar appearance, configured with default values and targeting the device idiom.
     */
    @Generated
    @Selector("init")
    public native UIBarAppearance init();

    /**
     * Constructs a new bar appearance, copying all relevant properties from the given appearance object. This
     * initializer is useful for migrating configuration between UIBarAppearance subclasses. For example, you can
     * initialize a UINavigationBarAppearance with a UIToolbarAppearance instance, and shared attributes will be
     * identical between the two.
     */
    @Generated
    @Selector("initWithBarAppearance:")
    public native UIBarAppearance initWithBarAppearance(@NotNull UIBarAppearance barAppearance);

    @Generated
    @Selector("initWithCoder:")
    public native UIBarAppearance initWithCoder(@NotNull NSCoder coder);

    /**
     * Constructs a new bar appearance, targeting the passed-in idiom as a hint. Not all platforms support all available
     * idioms. See the idiom property to determine the resolved idiom.
     */
    @Generated
    @Selector("initWithIdiom:")
    public native UIBarAppearance initWithIdiom(@NInt long idiom);

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
    public static native UIBarAppearance new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A color to use for the bar background. This color is composited over backgroundEffects.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(@Nullable UIColor value);

    /**
     * A specific blur effect to use for the bar background. This effect is composited first when constructing the bar's
     * background.
     */
    @Generated
    @Selector("setBackgroundEffect:")
    public native void setBackgroundEffect(@Nullable UIBlurEffect value);

    /**
     * An image to use for the bar background. This image is composited over the backgroundColor, and resized per the
     * backgroundImageContentMode.
     */
    @Generated
    @Selector("setBackgroundImage:")
    public native void setBackgroundImage(@Nullable UIImage value);

    /**
     * The content mode to use when rendering the backgroundImage. Defaults to UIViewContentModeScaleToFill.
     * UIViewContentModeRedraw will be reinterpreted as UIViewContentModeScaleToFill.
     */
    @Generated
    @Selector("setBackgroundImageContentMode:")
    public native void setBackgroundImageContentMode(@NInt long value);

    /**
     * A color to use for the shadow. Its specific behavior depends on the value of shadowImage. If shadowImage is nil,
     * then the shadowColor is used to color the bar's default shadow; a nil or clearColor shadowColor will result in no
     * shadow. If shadowImage is a template image, then the shadowColor is used to tint the image; a nil or clearColor
     * shadowColor will also result in no shadow. If the shadowImage is not a template image, then it will be rendered
     * regardless of the value of shadowColor.
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@Nullable UIColor value);

    /**
     * Use an image for the shadow. See shadowColor for how they interact.
     */
    @Generated
    @Selector("setShadowImage:")
    public native void setShadowImage(@Nullable UIImage value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A color to use for the shadow. Its specific behavior depends on the value of shadowImage. If shadowImage is nil,
     * then the shadowColor is used to color the bar's default shadow; a nil or clearColor shadowColor will result in no
     * shadow. If shadowImage is a template image, then the shadowColor is used to tint the image; a nil or clearColor
     * shadowColor will also result in no shadow. If the shadowImage is not a template image, then it will be rendered
     * regardless of the value of shadowColor.
     */
    @Nullable
    @Generated
    @Selector("shadowColor")
    public native UIColor shadowColor();

    /**
     * Use an image for the shadow. See shadowColor for how they interact.
     */
    @Nullable
    @Generated
    @Selector("shadowImage")
    public native UIImage shadowImage();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
