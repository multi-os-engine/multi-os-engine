package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIButtonConfiguration extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIButtonConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("activityIndicatorColorTransformer")
    @ObjCBlock(name = "call_activityIndicatorColorTransformer_ret")
    public native Block_activityIndicatorColorTransformer_ret activityIndicatorColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activityIndicatorColorTransformer_ret {
        @NotNull
        @Generated
        UIColor call_activityIndicatorColorTransformer_ret(@NotNull UIColor color);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIButtonConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIButtonConfiguration allocWithZone(VoidPtr zone);

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("attributedSubtitle")
    public native NSAttributedString attributedSubtitle();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("attributedTitle")
    public native NSAttributedString attributedTitle();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * If the style should automatically update when the button is selected. Default varies by style. Disable to
     * customize selection behavior.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("automaticallyUpdateForSelection")
    public native boolean automaticallyUpdateForSelection();

    /**
     * A UIBackgroundConfiguration describing the button's background. UIKit provides a value by default with values
     * appropriate for a UIButton.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("background")
    public native UIBackgroundConfiguration background();

    /**
     * The base color to use for background elements. This color may be modified before being passed to a transformer,
     * and finally applied to specific elements. Setting nil will cede full control to the configuration to select a
     * color appropriate to the style.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("baseBackgroundColor")
    public native UIColor baseBackgroundColor();

    /**
     * The base color to use for foreground elements. This color may be modified before being passed to a transformer,
     * and finally applied to specific elements. Setting nil will cede full control to the configuration to select a
     * color appropriate to the style.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("baseForegroundColor")
    public native UIColor baseForegroundColor();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("borderedButtonConfiguration")
    public static native UIButtonConfiguration borderedButtonConfiguration();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("borderedProminentButtonConfiguration")
    public static native UIButtonConfiguration borderedProminentButtonConfiguration();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("borderedTintedButtonConfiguration")
    public static native UIButtonConfiguration borderedTintedButtonConfiguration();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("borderlessButtonConfiguration")
    public static native UIButtonConfiguration borderlessButtonConfiguration();

    /**
     * Determines the metrics and ideal size of the button. Clients may resize the button arbitrarily regardless of this
     * value.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("buttonSize")
    @NInt
    public native long buttonSize();

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
     * Insets from the bounds of the button to create the content region. Defaults styles provide insets based on the
     * button size.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("contentInsets")
    @ByValue
    public native NSDirectionalEdgeInsets contentInsets();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The corner style controls how background.cornerRadius is interpreted by the button. Defaults to `Dynamic`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("cornerStyle")
    @NInt
    public native long cornerStyle();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("filledButtonConfiguration")
    public static native UIButtonConfiguration filledButtonConfiguration();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("grayButtonConfiguration")
    public static native UIButtonConfiguration grayButtonConfiguration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("imageColorTransformer")
    @ObjCBlock(name = "call_imageColorTransformer_ret")
    public native Block_imageColorTransformer_ret imageColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_imageColorTransformer_ret {
        @NotNull
        @Generated
        UIColor call_imageColorTransformer_ret(@NotNull UIColor color);
    }

    /**
     * When a button has both image and text content, this value is the padding between the image and the text.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("imagePadding")
    @NFloat
    public native double imagePadding();

    /**
     * Defaults to Leading, only single edge values (top/leading/bottom/trailing) are supported.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("imagePlacement")
    @NUInt
    public native long imagePlacement();

    @Generated
    @Selector("init")
    public native UIButtonConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIButtonConfiguration initWithCoder(@NotNull NSCoder coder);

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
     * Button style to use when running under the Mac idiom.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("macIdiomStyle")
    @NInt
    public native long macIdiomStyle();

    @Generated
    @Owned
    @Selector("new")
    public static native UIButtonConfiguration new_objc();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("plainButtonConfiguration")
    public static native UIButtonConfiguration plainButtonConfiguration();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("preferredSymbolConfigurationForImage")
    public native UIImageSymbolConfiguration preferredSymbolConfigurationForImage();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setActivityIndicatorColorTransformer:")
    public native void setActivityIndicatorColorTransformer(
            @Nullable @ObjCBlock(name = "call_setActivityIndicatorColorTransformer") Block_setActivityIndicatorColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActivityIndicatorColorTransformer {
        @NotNull
        @Generated
        UIColor call_setActivityIndicatorColorTransformer(@NotNull UIColor color);
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAttributedSubtitle:")
    public native void setAttributedSubtitle(@Nullable NSAttributedString value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAttributedTitle:")
    public native void setAttributedTitle(@Nullable NSAttributedString value);

    /**
     * If the style should automatically update when the button is selected. Default varies by style. Disable to
     * customize selection behavior.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAutomaticallyUpdateForSelection:")
    public native void setAutomaticallyUpdateForSelection(boolean value);

    /**
     * A UIBackgroundConfiguration describing the button's background. UIKit provides a value by default with values
     * appropriate for a UIButton.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setBackground:")
    public native void setBackground(@NotNull UIBackgroundConfiguration value);

    /**
     * The base color to use for background elements. This color may be modified before being passed to a transformer,
     * and finally applied to specific elements. Setting nil will cede full control to the configuration to select a
     * color appropriate to the style.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setBaseBackgroundColor:")
    public native void setBaseBackgroundColor(@Nullable UIColor value);

    /**
     * The base color to use for foreground elements. This color may be modified before being passed to a transformer,
     * and finally applied to specific elements. Setting nil will cede full control to the configuration to select a
     * color appropriate to the style.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setBaseForegroundColor:")
    public native void setBaseForegroundColor(@Nullable UIColor value);

    /**
     * Determines the metrics and ideal size of the button. Clients may resize the button arbitrarily regardless of this
     * value.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setButtonSize:")
    public native void setButtonSize(@NInt long value);

    /**
     * Insets from the bounds of the button to create the content region. Defaults styles provide insets based on the
     * button size.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setContentInsets:")
    public native void setContentInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The corner style controls how background.cornerRadius is interpreted by the button. Defaults to `Dynamic`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCornerStyle:")
    public native void setCornerStyle(@NInt long value);

    /**
     * Restore the default content insets.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setDefaultContentInsets")
    public native void setDefaultContentInsets();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImageColorTransformer:")
    public native void setImageColorTransformer(
            @Nullable @ObjCBlock(name = "call_setImageColorTransformer") Block_setImageColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImageColorTransformer {
        @NotNull
        @Generated
        UIColor call_setImageColorTransformer(@NotNull UIColor color);
    }

    /**
     * When a button has both image and text content, this value is the padding between the image and the text.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImagePadding:")
    public native void setImagePadding(@NFloat double value);

    /**
     * Defaults to Leading, only single edge values (top/leading/bottom/trailing) are supported.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setImagePlacement:")
    public native void setImagePlacement(@NUInt long value);

    /**
     * Button style to use when running under the Mac idiom.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMacIdiomStyle:")
    public native void setMacIdiomStyle(@NInt long value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreferredSymbolConfigurationForImage:")
    public native void setPreferredSymbolConfigurationForImage(@Nullable UIImageSymbolConfiguration value);

    /**
     * Shows an activity indicator in place of an image. Its placement is controlled by the imagePlacement property.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setShowsActivityIndicator:")
    public native void setShowsActivityIndicator(boolean value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@Nullable String value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSubtitleTextAttributesTransformer:")
    public native void setSubtitleTextAttributesTransformer(
            @Nullable @ObjCBlock(name = "call_setSubtitleTextAttributesTransformer") Block_setSubtitleTextAttributesTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSubtitleTextAttributesTransformer {
        @NotNull
        @Generated
        NSDictionary<String, ?> call_setSubtitleTextAttributesTransformer(
                @NotNull NSDictionary<String, ?> textAttributes);
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    /**
     * The alignment to use for relative layout between title & subtitle.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTitleAlignment:")
    public native void setTitleAlignment(@NInt long value);

    /**
     * When a button has both a title & subtitle, this value is the padding between those titles.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTitlePadding:")
    public native void setTitlePadding(@NFloat double value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTitleTextAttributesTransformer:")
    public native void setTitleTextAttributesTransformer(
            @Nullable @ObjCBlock(name = "call_setTitleTextAttributesTransformer") Block_setTitleTextAttributesTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTitleTextAttributesTransformer {
        @NotNull
        @Generated
        NSDictionary<String, ?> call_setTitleTextAttributesTransformer(@NotNull NSDictionary<String, ?> textAttributes);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Shows an activity indicator in place of an image. Its placement is controlled by the imagePlacement property.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("showsActivityIndicator")
    public native boolean showsActivityIndicator();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("subtitleTextAttributesTransformer")
    @ObjCBlock(name = "call_subtitleTextAttributesTransformer_ret")
    public native Block_subtitleTextAttributesTransformer_ret subtitleTextAttributesTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subtitleTextAttributesTransformer_ret {
        @NotNull
        @Generated
        NSDictionary<String, ?> call_subtitleTextAttributesTransformer_ret(
                @NotNull NSDictionary<String, ?> textAttributes);
    }

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
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("tintedButtonConfiguration")
    public static native UIButtonConfiguration tintedButtonConfiguration();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    /**
     * The alignment to use for relative layout between title & subtitle.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("titleAlignment")
    @NInt
    public native long titleAlignment();

    /**
     * When a button has both a title & subtitle, this value is the padding between those titles.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("titlePadding")
    @NFloat
    public native double titlePadding();

    /**
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("titleTextAttributesTransformer")
    @ObjCBlock(name = "call_titleTextAttributesTransformer_ret")
    public native Block_titleTextAttributesTransformer_ret titleTextAttributesTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_titleTextAttributesTransformer_ret {
        @NotNull
        @Generated
        NSDictionary<String, ?> call_titleTextAttributesTransformer_ret(
                @NotNull NSDictionary<String, ?> textAttributes);
    }

    /**
     * Returns a copy of the configuration updated based on the given button, by applying the configuration's default
     * values for that button's state to any properties that have not been customized.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("updatedConfigurationForButton:")
    public native UIButtonConfiguration updatedConfigurationForButton(@NotNull UIButton button);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * What kind of indicator should the button show. Default value is .automatic.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("indicator")
    @NInt
    public native long indicator();

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("indicatorColorTransformer")
    @ObjCBlock(name = "call_indicatorColorTransformer_ret")
    public native Block_indicatorColorTransformer_ret indicatorColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indicatorColorTransformer_ret {
        @NotNull
        @Generated
        UIColor call_indicatorColorTransformer_ret(@NotNull UIColor color);
    }

    /**
     * What kind of indicator should the button show. Default value is .automatic.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setIndicator:")
    public native void setIndicator(@NInt long value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setIndicatorColorTransformer:")
    public native void setIndicatorColorTransformer(
            @Nullable @ObjCBlock(name = "call_setIndicatorColorTransformer") Block_setIndicatorColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setIndicatorColorTransformer {
        @NotNull
        @Generated
        UIColor call_setIndicatorColorTransformer(@NotNull UIColor color);
    }

    /**
     * Default is WordWrapping. WordWrapping and CharWrapping both allow for multi-line text, other modes will restrict
     * the subtitle to a single line of text.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSubtitleLineBreakMode:")
    public native void setSubtitleLineBreakMode(@NInt long value);

    /**
     * Default is WordWrapping. WordWrapping and CharWrapping both allow for multi-line text, other modes will restrict
     * the title to a single line of text.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTitleLineBreakMode:")
    public native void setTitleLineBreakMode(@NInt long value);

    /**
     * Default is WordWrapping. WordWrapping and CharWrapping both allow for multi-line text, other modes will restrict
     * the subtitle to a single line of text.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("subtitleLineBreakMode")
    @NInt
    public native long subtitleLineBreakMode();

    /**
     * Default is WordWrapping. WordWrapping and CharWrapping both allow for multi-line text, other modes will restrict
     * the title to a single line of text.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("titleLineBreakMode")
    @NInt
    public native long titleLineBreakMode();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("clearGlassButtonConfiguration")
    @NotNull
    public static native UIButtonConfiguration clearGlassButtonConfiguration();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("glassButtonConfiguration")
    @NotNull
    public static native UIButtonConfiguration glassButtonConfiguration();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("prominentClearGlassButtonConfiguration")
    @NotNull
    public static native UIButtonConfiguration prominentClearGlassButtonConfiguration();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("prominentGlassButtonConfiguration")
    @NotNull
    public static native UIButtonConfiguration prominentGlassButtonConfiguration();

    /**
     * The symbol content transition to use when transitioning across symbol images.
     * Defaults to `nil`, meaning no symbol content transition should occur.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSymbolContentTransition:")
    public native void setSymbolContentTransition(@Nullable UISymbolContentTransition value);

    /**
     * The symbol content transition to use when transitioning across symbol images.
     * Defaults to `nil`, meaning no symbol content transition should occur.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("symbolContentTransition")
    @Nullable
    public native UISymbolContentTransition symbolContentTransition();
}
