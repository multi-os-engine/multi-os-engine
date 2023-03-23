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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Configures the color of the background. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * Optional color transformer that is used to resolve the background color. A nil value means the `backgroundColor`
     * is used as-is.
     */
    @Generated
    @Selector("backgroundColorTransformer")
    @ObjCBlock(name = "call_backgroundColorTransformer_ret")
    public native Block_backgroundColorTransformer_ret backgroundColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_backgroundColorTransformer_ret {
        @Generated
        UIColor call_backgroundColorTransformer_ret(UIColor color);
    }

    /**
     * Insets (or outsets, if negative) for the background and stroke, relative to the edges of the containing view.
     * These also apply to the custom view. Default is NSDirectionalEdgeInsetsZero.
     */
    @Generated
    @Selector("backgroundInsets")
    @ByValue
    public native NSDirectionalEdgeInsets backgroundInsets();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Returns a clear configuration, with no default styling.
     */
    @Generated
    @Selector("clearConfiguration")
    public static native UIBackgroundConfiguration clearConfiguration();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The preferred corner radius (using a continuous corner curve) for the background and stroke. This is also applied
     * to the custom view. Default is 0.
     * If the view is too small to fit the requested radius, the corner curve and radius will be adjusted to fit.
     */
    @Generated
    @Selector("cornerRadius")
    @NFloat
    public native double cornerRadius();

    /**
     * A custom view for the background. The custom view must have translatesAutoresizingMaskIntoConstraints
     * enabled, but may use auto layout constraints internally for layout of subviews.
     */
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
     */
    @Generated
    @Selector("edgesAddingLayoutMarginsToBackgroundInsets")
    @NUInt
    public native long edgesAddingLayoutMarginsToBackgroundInsets();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIBackgroundConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBackgroundConfiguration initWithCoder(NSCoder coder);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Returns the default configuration for an accompanied sidebar list cell.
     */
    @Generated
    @Selector("listAccompaniedSidebarCellConfiguration")
    public static native UIBackgroundConfiguration listAccompaniedSidebarCellConfiguration();

    /**
     * Returns the default configuration for a grouped list cell.
     */
    @Generated
    @Selector("listGroupedCellConfiguration")
    public static native UIBackgroundConfiguration listGroupedCellConfiguration();

    /**
     * Returns the default configuration for a grouped list header or footer.
     */
    @Generated
    @Selector("listGroupedHeaderFooterConfiguration")
    public static native UIBackgroundConfiguration listGroupedHeaderFooterConfiguration();

    /**
     * Returns the default configuration for a plain list cell.
     */
    @Generated
    @Selector("listPlainCellConfiguration")
    public static native UIBackgroundConfiguration listPlainCellConfiguration();

    /**
     * Returns the default configuration for a plain list header or footer.
     */
    @Generated
    @Selector("listPlainHeaderFooterConfiguration")
    public static native UIBackgroundConfiguration listPlainHeaderFooterConfiguration();

    /**
     * Returns the default configuration for a sidebar list cell.
     */
    @Generated
    @Selector("listSidebarCellConfiguration")
    public static native UIBackgroundConfiguration listSidebarCellConfiguration();

    /**
     * Returns the default configuration for a sidebar list header.
     */
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
     */
    @Generated
    @Selector("resolvedBackgroundColorForTintColor:")
    public native UIColor resolvedBackgroundColorForTintColor(UIColor tintColor);

    /**
     * Returns the resolved stroke color for the specified tint color, based on the `strokeColor` and
     * `strokeColorTransformer`.
     */
    @Generated
    @Selector("resolvedStrokeColorForTintColor:")
    public native UIColor resolvedStrokeColorForTintColor(UIColor tintColor);

    /**
     * Configures the color of the background. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * Optional color transformer that is used to resolve the background color. A nil value means the `backgroundColor`
     * is used as-is.
     */
    @Generated
    @Selector("setBackgroundColorTransformer:")
    public native void setBackgroundColorTransformer(
            @ObjCBlock(name = "call_setBackgroundColorTransformer") Block_setBackgroundColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setBackgroundColorTransformer {
        @Generated
        UIColor call_setBackgroundColorTransformer(UIColor color);
    }

    /**
     * Insets (or outsets, if negative) for the background and stroke, relative to the edges of the containing view.
     * These also apply to the custom view. Default is NSDirectionalEdgeInsetsZero.
     */
    @Generated
    @Selector("setBackgroundInsets:")
    public native void setBackgroundInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The preferred corner radius (using a continuous corner curve) for the background and stroke. This is also applied
     * to the custom view. Default is 0.
     * If the view is too small to fit the requested radius, the corner curve and radius will be adjusted to fit.
     */
    @Generated
    @Selector("setCornerRadius:")
    public native void setCornerRadius(@NFloat double value);

    /**
     * A custom view for the background. The custom view must have translatesAutoresizingMaskIntoConstraints
     * enabled, but may use auto layout constraints internally for layout of subviews.
     */
    @Generated
    @Selector("setCustomView:")
    public native void setCustomView(UIView value);

    /**
     * The edges on which the containing view's layout margins are added to the `backgroundInsets`, effectively making
     * the `backgroundInsets` values relative
     * to the containing view's layout margins for these edges. Default is NSDirectionalRectEdgeNone.
     */
    @Generated
    @Selector("setEdgesAddingLayoutMarginsToBackgroundInsets:")
    public native void setEdgesAddingLayoutMarginsToBackgroundInsets(@NUInt long value);

    /**
     * Configures the color of the stroke. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     */
    @Generated
    @Selector("setStrokeColor:")
    public native void setStrokeColor(UIColor value);

    /**
     * Optional color transformer that is used to resolve the stroke color. A nil value means the `strokeColor` is used
     * as-is.
     */
    @Generated
    @Selector("setStrokeColorTransformer:")
    public native void setStrokeColorTransformer(
            @ObjCBlock(name = "call_setStrokeColorTransformer") Block_setStrokeColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setStrokeColorTransformer {
        @Generated
        UIColor call_setStrokeColorTransformer(UIColor color);
    }

    /**
     * Outset (or inset, if negative) for the stroke, relative to the background (including any backgroundInsets).
     * Default is 0.
     * The corner radius of the stroke is adjusted for any outset to remain concentric with the background.
     */
    @Generated
    @Selector("setStrokeOutset:")
    public native void setStrokeOutset(@NFloat double value);

    /**
     * The width of the stroke. Default is 0.
     */
    @Generated
    @Selector("setStrokeWidth:")
    public native void setStrokeWidth(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The visual effect to apply to the background. Default is nil.
     */
    @Generated
    @Selector("setVisualEffect:")
    public native void setVisualEffect(UIVisualEffect value);

    /**
     * Configures the color of the stroke. A nil value uses the view's tint color; use `clearColor` for no color
     * (transparent).
     */
    @Generated
    @Selector("strokeColor")
    public native UIColor strokeColor();

    /**
     * Optional color transformer that is used to resolve the stroke color. A nil value means the `strokeColor` is used
     * as-is.
     */
    @Generated
    @Selector("strokeColorTransformer")
    @ObjCBlock(name = "call_strokeColorTransformer_ret")
    public native Block_strokeColorTransformer_ret strokeColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_strokeColorTransformer_ret {
        @Generated
        UIColor call_strokeColorTransformer_ret(UIColor color);
    }

    /**
     * Outset (or inset, if negative) for the stroke, relative to the background (including any backgroundInsets).
     * Default is 0.
     * The corner radius of the stroke is adjusted for any outset to remain concentric with the background.
     */
    @Generated
    @Selector("strokeOutset")
    @NFloat
    public native double strokeOutset();

    /**
     * The width of the stroke. Default is 0.
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
     */
    @Generated
    @Selector("updatedConfigurationForState:")
    public native UIBackgroundConfiguration updatedConfigurationForState(
            @Mapped(ObjCObjectMapper.class) UIConfigurationState state);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The visual effect to apply to the background. Default is nil.
     */
    @Generated
    @Selector("visualEffect")
    public native UIVisualEffect visualEffect();

    /**
     * The image to use. Default is nil.
     * 
     * API-Since: 15.0
     */
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
    public native void setImage(UIImage value);

    /**
     * The content mode to use when rendering the image. Default is UIViewContentModeScaleToFill.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImageContentMode:")
    public native void setImageContentMode(@NInt long value);
}
