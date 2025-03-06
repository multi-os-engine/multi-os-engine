package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.UIConfigurationState;
import apple.uikit.struct.NSDirectionalEdgeInsets;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBackgroundConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBackgroundConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBackgroundConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIBackgroundConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Configures the color of the background. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * Optional color transformer that is used to resolve the background color. A nil value means the `backgroundColor`
     * is used as-is.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("backgroundColorTransformer")
    @ObjCBlock(name = "call_backgroundColorTransformer_ret")
    public native Block_backgroundColorTransformer_ret backgroundColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_backgroundColorTransformer_ret {
        @NotNull
        @Generated
        UIColor call_backgroundColorTransformer_ret(@NotNull UIColor color);
    }

    /**
     * Insets (or outsets, if negative) for the background and stroke, relative to the edges of the containing view.
     * These also apply to the custom view. Default is NSDirectionalEdgeInsetsZero.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("backgroundInsets")
    @ByValue
    public native NSDirectionalEdgeInsets backgroundInsets();

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
     * Returns a clear configuration, with no default styling.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("clearConfiguration")
    public static native UIBackgroundConfiguration clearConfiguration();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The preferred corner radius (using a continuous corner curve) for the background and stroke. This is also applied
     * to the custom view. Default is 0.
     * If the view is too small to fit the requested radius, the corner curve and radius will be adjusted to fit.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("cornerRadius")
    @NFloat
    public native double cornerRadius();

    /**
     * A custom view for the background. The custom view must have translatesAutoresizingMaskIntoConstraints
     * enabled, but may use auto layout constraints internally for layout of subviews.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("customView")
    public native UIView customView();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The edges on which the containing view's layout margins are added to the `backgroundInsets`, effectively making
     * the `backgroundInsets` values relative
     * to the containing view's layout margins for these edges. Default is NSDirectionalRectEdgeNone.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("edgesAddingLayoutMarginsToBackgroundInsets")
    @NUInt
    public native long edgesAddingLayoutMarginsToBackgroundInsets();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIBackgroundConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBackgroundConfiguration initWithCoder(@NotNull NSCoder coder);

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
     * Returns the default configuration for an accompanied sidebar list cell.
     */
    @NotNull
    @Generated
    @Selector("listAccompaniedSidebarCellConfiguration")
    public static native UIBackgroundConfiguration listAccompaniedSidebarCellConfiguration();

    /**
     * Returns the default configuration for a grouped list cell.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 18.0
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("listGroupedCellConfiguration")
    public static native UIBackgroundConfiguration listGroupedCellConfiguration();

    /**
     * Returns the default configuration for a grouped list header or footer.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use +listHeaderConfiguration or +listFooterConfiguration
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("listGroupedHeaderFooterConfiguration")
    public static native UIBackgroundConfiguration listGroupedHeaderFooterConfiguration();

    /**
     * Returns the default configuration for a plain list cell.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 18.0
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("listPlainCellConfiguration")
    public static native UIBackgroundConfiguration listPlainCellConfiguration();

    /**
     * Returns the default configuration for a plain list header or footer.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use +listHeaderConfiguration or +listFooterConfiguration
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("listPlainHeaderFooterConfiguration")
    public static native UIBackgroundConfiguration listPlainHeaderFooterConfiguration();

    /**
     * Returns the default configuration for a sidebar list cell.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 18.0
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("listSidebarCellConfiguration")
    public static native UIBackgroundConfiguration listSidebarCellConfiguration();

    /**
     * Returns the default configuration for a sidebar list header.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use +listHeaderConfiguration or +listFooterConfiguration
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("listSidebarHeaderConfiguration")
    public static native UIBackgroundConfiguration listSidebarHeaderConfiguration();

    @Generated
    @Owned
    @Selector("new")
    public static native UIBackgroundConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the resolved background color for the specified tint color, based on the `backgroundColor` and
     * `backgroundColorTransformer`.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("resolvedBackgroundColorForTintColor:")
    public native UIColor resolvedBackgroundColorForTintColor(@NotNull UIColor tintColor);

    /**
     * Returns the resolved stroke color for the specified tint color, based on the `strokeColor` and
     * `strokeColorTransformer`.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("resolvedStrokeColorForTintColor:")
    public native UIColor resolvedStrokeColorForTintColor(@NotNull UIColor tintColor);

    /**
     * Configures the color of the background. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(@Nullable UIColor value);

    /**
     * Optional color transformer that is used to resolve the background color. A nil value means the `backgroundColor`
     * is used as-is.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackgroundColorTransformer:")
    public native void setBackgroundColorTransformer(
            @Nullable @ObjCBlock(name = "call_setBackgroundColorTransformer") Block_setBackgroundColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setBackgroundColorTransformer {
        @NotNull
        @Generated
        UIColor call_setBackgroundColorTransformer(@NotNull UIColor color);
    }

    /**
     * Insets (or outsets, if negative) for the background and stroke, relative to the edges of the containing view.
     * These also apply to the custom view. Default is NSDirectionalEdgeInsetsZero.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackgroundInsets:")
    public native void setBackgroundInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The preferred corner radius (using a continuous corner curve) for the background and stroke. This is also applied
     * to the custom view. Default is 0.
     * If the view is too small to fit the requested radius, the corner curve and radius will be adjusted to fit.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setCornerRadius:")
    public native void setCornerRadius(@NFloat double value);

    /**
     * A custom view for the background. The custom view must have translatesAutoresizingMaskIntoConstraints
     * enabled, but may use auto layout constraints internally for layout of subviews.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setCustomView:")
    public native void setCustomView(@Nullable UIView value);

    /**
     * The edges on which the containing view's layout margins are added to the `backgroundInsets`, effectively making
     * the `backgroundInsets` values relative
     * to the containing view's layout margins for these edges. Default is NSDirectionalRectEdgeNone.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setEdgesAddingLayoutMarginsToBackgroundInsets:")
    public native void setEdgesAddingLayoutMarginsToBackgroundInsets(@NUInt long value);

    /**
     * Configures the color of the stroke. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(@Nullable UIColor value);

    /**
     * Optional color transformer that is used to resolve the stroke color. A nil value means the `strokeColor` is used
     * as-is.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStrokeColorTransformer:")
    public native void setStrokeColorTransformer(
            @Nullable @ObjCBlock(name = "call_setStrokeColorTransformer") Block_setStrokeColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setStrokeColorTransformer {
        @NotNull
        @Generated
        UIColor call_setStrokeColorTransformer(@NotNull UIColor color);
    }

    /**
     * Outset (or inset, if negative) for the stroke, relative to the background (including any backgroundInsets).
     * Default is 0.
     * The corner radius of the stroke is adjusted for any outset to remain concentric with the background.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStrokeOutset:")
    public native void setStrokeOutset(@NFloat double value);

    /**
     * The width of the stroke. Default is 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStrokeWidth:")
    public native void setStrokeWidth(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The visual effect to apply to the background. Default is nil.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setVisualEffect:")
    public native void setVisualEffect(@Nullable UIVisualEffect value);

    /**
     * Configures the color of the stroke. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    /**
     * Optional color transformer that is used to resolve the stroke color. A nil value means the `strokeColor` is used
     * as-is.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("strokeColorTransformer")
    @ObjCBlock(name = "call_strokeColorTransformer_ret")
    public native Block_strokeColorTransformer_ret strokeColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_strokeColorTransformer_ret {
        @NotNull
        @Generated
        UIColor call_strokeColorTransformer_ret(@NotNull UIColor color);
    }

    /**
     * Outset (or inset, if negative) for the stroke, relative to the background (including any backgroundInsets).
     * Default is 0.
     * The corner radius of the stroke is adjusted for any outset to remain concentric with the background.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("strokeOutset")
    @NFloat
    public native double strokeOutset();

    /**
     * The width of the stroke. Default is 0.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("strokeWidth")
    @NFloat
    public native double strokeWidth();

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

    /**
     * Returns a copy of the configuration updated for the specified state, by applying the configuration's default
     * values for that state to any properties that have not been customized.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("updatedConfigurationForState:")
    public native UIBackgroundConfiguration updatedConfigurationForState(
            @NotNull @Mapped(ObjCObjectMapper.class) UIConfigurationState state);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The visual effect to apply to the background. Default is nil.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("visualEffect")
    public native UIVisualEffect visualEffect();

    /**
     * The image to use. Default is nil.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * The content mode to use when rendering the image. Default is UIViewContentModeScaleToFill.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("imageContentMode")
    @NInt
    public native long imageContentMode();

    /**
     * The image to use. Default is nil.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * The content mode to use when rendering the image. Default is UIViewContentModeScaleToFill.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImageContentMode:")
    public native void setImageContentMode(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Represents a generic cell background configuration that automatically adopts the style of a containing list when
     * updated for a
     * new configuration state, by reading the `listEnvironment` trait from the state's trait collection.
     * Defaults to the background configuration for a cell in a plain-style list.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("listCellConfiguration")
    @NotNull
    public static native UIBackgroundConfiguration listCellConfiguration();

    /**
     * Represents a generic footer background configuration that automatically adopts the style of a containing list
     * when updated for a
     * new configuration state, by reading the `listEnvironment` trait from the state's trait collection.
     * Defaults to the background configuration for a footer in a plain-style list.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("listFooterConfiguration")
    @NotNull
    public static native UIBackgroundConfiguration listFooterConfiguration();

    /**
     * Represents a generic header background configuration that automatically adopts the style of a containing list
     * when updated for a
     * new configuration state, by reading the `listEnvironment` trait from the state's trait collection.
     * Defaults to the background configuration for a header in a plain-style list.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("listHeaderConfiguration")
    @NotNull
    public static native UIBackgroundConfiguration listHeaderConfiguration();

    /**
     * Describes a shadow applied by the background.
     * Defaults to no shadow (i.e. a shadow with an opacity of 0.0).
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("shadowProperties")
    @NotNull
    public native UIShadowProperties shadowProperties();
}
