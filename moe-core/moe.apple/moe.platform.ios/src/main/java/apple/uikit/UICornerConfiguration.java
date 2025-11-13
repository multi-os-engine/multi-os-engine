package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * Defines how corner radii are mapped to the corners of a rectangle.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICornerConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UICornerConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICornerConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UICornerConfiguration allocWithZone(VoidPtr zone);

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
     * A configuration that rounds the corners into a capsule shape, scaling with the view's size.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("capsuleConfiguration")
    @NotNull
    public static native UICornerConfiguration capsuleConfiguration();

    /**
     * A configuration that rounds the corners into a capsule shape, scaling with the view's size and clamped to the
     * `maximumRadius`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("capsuleConfigurationWithMaximumRadius:")
    @NotNull
    public static native UICornerConfiguration capsuleConfigurationWithMaximumRadius(@NFloat double maximumRadius);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * A configuration that applies the given radius independently to all corners.
     * 
     * When used with a container concentric radius, this allows each individual
     * corner to resolve to different radii.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithRadius:")
    public static native UICornerConfiguration configurationWithRadius(@NotNull UICornerRadius radius);

    /**
     * A configuration with independent radii for each corner.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithTopLeftRadius:topRightRadius:bottomLeftRadius:bottomRightRadius:")
    public static native UICornerConfiguration configurationWithTopLeftRadiusTopRightRadiusBottomLeftRadiusBottomRightRadius(
            @Nullable UICornerRadius topLeftRadius, @Nullable UICornerRadius topRightRadius,
            @Nullable UICornerRadius bottomLeftRadius, @Nullable UICornerRadius bottomRightRadius);

    /**
     * A configuration that applies the `bottomRadius` uniformly to the bottom-left and bottom-right corners, with
     * optional independent radii for the top-left and top-right corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformBottomRadius:topLeftRadius:topRightRadius:")
    public static native UICornerConfiguration configurationWithUniformBottomRadiusTopLeftRadiusTopRightRadius(
            @NotNull UICornerRadius bottomRadius, @Nullable UICornerRadius topLeftRadius,
            @Nullable UICornerRadius topRightRadius);

    /**
     * A configuration that applies the `leftRadius` uniformly to the top-left and bottom-left corners, with optional
     * independent radii for the top-right and bottom-right corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformLeftRadius:topRightRadius:bottomRightRadius:")
    public static native UICornerConfiguration configurationWithUniformLeftRadiusTopRightRadiusBottomRightRadius(
            @NotNull UICornerRadius leftRadius, @Nullable UICornerRadius topRightRadius,
            @Nullable UICornerRadius bottomRightRadius);

    /**
     * A configuration that applies the `leftRadius` uniformly to the top-left and bottom-left corners, and the
     * `rightRadius` uniformly to the top-right and bottom-right corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformLeftRadius:uniformRightRadius:")
    public static native UICornerConfiguration configurationWithUniformLeftRadiusUniformRightRadius(
            @NotNull UICornerRadius leftRadius, @NotNull UICornerRadius rightRadius);

    /**
     * A configuration that applies the given radius uniformly to all corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformRadius:")
    public static native UICornerConfiguration configurationWithUniformRadius(@NotNull UICornerRadius radius);

    /**
     * A configuration that applies the `rightRadius` uniformly to the top-right and bottom-right corners, with optional
     * independent radii for the top-left and bottom-left corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformRightRadius:topLeftRadius:bottomLeftRadius:")
    public static native UICornerConfiguration configurationWithUniformRightRadiusTopLeftRadiusBottomLeftRadius(
            @NotNull UICornerRadius rightRadius, @Nullable UICornerRadius topLeftRadius,
            @Nullable UICornerRadius bottomLeftRadius);

    /**
     * A configuration that applies the `topRadius` uniformly to the top-left and top-right corners, with optional
     * independent radii for the bottom-left and bottom-right corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformTopRadius:bottomLeftRadius:bottomRightRadius:")
    public static native UICornerConfiguration configurationWithUniformTopRadiusBottomLeftRadiusBottomRightRadius(
            @NotNull UICornerRadius topRadius, @Nullable UICornerRadius bottomLeftRadius,
            @Nullable UICornerRadius bottomRightRadius);

    /**
     * A configuration that applies the `topRadius` uniformly to the top-left and top-right corners, and the
     * `bottomRadius` uniformly to the bottom-left and bottom-right corners.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("configurationWithUniformTopRadius:uniformBottomRadius:")
    public static native UICornerConfiguration configurationWithUniformTopRadiusUniformBottomRadius(
            @NotNull UICornerRadius topRadius, @NotNull UICornerRadius bottomRadius);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UICornerConfiguration init();

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
    public static native UICornerConfiguration new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}