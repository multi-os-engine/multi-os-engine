package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.protocol.UIConfigurationState;
import apple.uikit.protocol.UIContentConfiguration;
import apple.uikit.struct.NSDirectionalEdgeInsets;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIContentUnavailableConfiguration extends NSObject implements UIContentConfiguration, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIContentUnavailableConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The alignment of the image, text and buttons.
     */
    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIContentUnavailableConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIContentUnavailableConfiguration allocWithZone(VoidPtr zone);

    /**
     * An attributed variant of the primary text, which supersedes the `text` and some properties of the
     * `textProperties` if set.
     */
    @Generated
    @Selector("attributedText")
    @Nullable
    public native NSAttributedString attributedText();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Whether the content view will preserve inherited layout margins from its superview on the horizontal and/or
     * vertical axes.
     */
    @Generated
    @Selector("axesPreservingSuperviewLayoutMargins")
    @NUInt
    public native long axesPreservingSuperviewLayoutMargins();

    /**
     * The background configuration.
     */
    @Generated
    @Selector("background")
    @NotNull
    public native UIBackgroundConfiguration background();

    /**
     * The primary button.
     */
    @Generated
    @Selector("button")
    @NotNull
    public native UIButtonConfiguration button();

    /**
     * Additional properties to configure the primary button.
     */
    @Generated
    @Selector("buttonProperties")
    @NotNull
    public native UIContentUnavailableButtonProperties buttonProperties();

    /**
     * Padding between the button and secondary button. Only applies when there is both a button and a secondary button.
     */
    @Generated
    @Selector("buttonToSecondaryButtonPadding")
    @NFloat
    public native double buttonToSecondaryButtonPadding();

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
     * The margins for the content to the edges of the content view. (When preserving superview layout margins on one or
     * both axes, these are just minimum margins, as inherited margins may be larger.)
     */
    @Generated
    @Selector("directionalLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets directionalLayoutMargins();

    /**
     * Returns the default configuration for unavailable content.
     */
    @Generated
    @Selector("emptyConfiguration")
    @NotNull
    public static native UIContentUnavailableConfiguration emptyConfiguration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The image to display.
     */
    @Generated
    @Selector("image")
    @Nullable
    public native UIImage image();

    /**
     * Additional properties to configure the image. When adopting the loading configuration, relevant properties are
     * applied to the activity indicator.
     */
    @Generated
    @Selector("imageProperties")
    @NotNull
    public native UIContentUnavailableImageProperties imageProperties();

    /**
     * Padding between the image and text. Only applies when there is both an image and text.
     */
    @Generated
    @Selector("imageToTextPadding")
    @NFloat
    public native double imageToTextPadding();

    @Generated
    @Selector("init")
    public native UIContentUnavailableConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIContentUnavailableConfiguration initWithCoder(@NotNull NSCoder coder);

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

    /**
     * Returns the default configuration for content which is loading.
     */
    @Generated
    @Selector("loadingConfiguration")
    @NotNull
    public static native UIContentUnavailableConfiguration loadingConfiguration();

    @Generated
    @Selector("makeContentView")
    @NotNull
    public native UIView makeContentView();

    @Generated
    @Owned
    @Selector("new")
    public static native UIContentUnavailableConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the default configuration for searches which return no results.
     */
    @Generated
    @Selector("searchConfiguration")
    @NotNull
    public static native UIContentUnavailableConfiguration searchConfiguration();

    /**
     * An attributed variant of the secondary text, which supersedes the `secondaryText` and some properties of the
     * `secondaryTextProperties` if set.
     */
    @Generated
    @Selector("secondaryAttributedText")
    @Nullable
    public native NSAttributedString secondaryAttributedText();

    /**
     * The secondary button.
     */
    @Generated
    @Selector("secondaryButton")
    @NotNull
    public native UIButtonConfiguration secondaryButton();

    /**
     * Additional properties to configure the secondary button.
     */
    @Generated
    @Selector("secondaryButtonProperties")
    @NotNull
    public native UIContentUnavailableButtonProperties secondaryButtonProperties();

    /**
     * The secondary text.
     */
    @Generated
    @Selector("secondaryText")
    @Nullable
    public native String secondaryText();

    /**
     * Additional properties to configure the secondary text.
     */
    @Generated
    @Selector("secondaryTextProperties")
    @NotNull
    public native UIContentUnavailableTextProperties secondaryTextProperties();

    /**
     * The alignment of the image, text and buttons.
     */
    @Generated
    @Selector("setAlignment:")
    public native void setAlignment(@NInt long value);

    /**
     * An attributed variant of the primary text, which supersedes the `text` and some properties of the
     * `textProperties` if set.
     */
    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(@Nullable NSAttributedString value);

    /**
     * Whether the content view will preserve inherited layout margins from its superview on the horizontal and/or
     * vertical axes.
     */
    @Generated
    @Selector("setAxesPreservingSuperviewLayoutMargins:")
    public native void setAxesPreservingSuperviewLayoutMargins(@NUInt long value);

    /**
     * The background configuration.
     */
    @Generated
    @Selector("setBackground:")
    public native void setBackground(@NotNull UIBackgroundConfiguration value);

    /**
     * The primary button.
     */
    @Generated
    @Selector("setButton:")
    public native void setButton(@NotNull UIButtonConfiguration value);

    /**
     * Padding between the button and secondary button. Only applies when there is both a button and a secondary button.
     */
    @Generated
    @Selector("setButtonToSecondaryButtonPadding:")
    public native void setButtonToSecondaryButtonPadding(@NFloat double value);

    /**
     * The margins for the content to the edges of the content view. (When preserving superview layout margins on one or
     * both axes, these are just minimum margins, as inherited margins may be larger.)
     */
    @Generated
    @Selector("setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The image to display.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * Padding between the image and text. Only applies when there is both an image and text.
     */
    @Generated
    @Selector("setImageToTextPadding:")
    public native void setImageToTextPadding(@NFloat double value);

    /**
     * An attributed variant of the secondary text, which supersedes the `secondaryText` and some properties of the
     * `secondaryTextProperties` if set.
     */
    @Generated
    @Selector("setSecondaryAttributedText:")
    public native void setSecondaryAttributedText(@Nullable NSAttributedString value);

    /**
     * The secondary button.
     */
    @Generated
    @Selector("setSecondaryButton:")
    public native void setSecondaryButton(@NotNull UIButtonConfiguration value);

    /**
     * The secondary text.
     */
    @Generated
    @Selector("setSecondaryText:")
    public native void setSecondaryText(@Nullable String value);

    /**
     * The primary text.
     */
    @Generated
    @Selector("setText:")
    public native void setText(@Nullable String value);

    /**
     * Padding between the button and text. Only applies when there is both a button and text.
     */
    @Generated
    @Selector("setTextToButtonPadding:")
    public native void setTextToButtonPadding(@NFloat double value);

    /**
     * Padding between the text and secondary text. Only applies when there is both text and secondary text.
     */
    @Generated
    @Selector("setTextToSecondaryTextPadding:")
    public native void setTextToSecondaryTextPadding(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
     * The primary text.
     */
    @Generated
    @Selector("text")
    @Nullable
    public native String text();

    /**
     * Additional properties to configure the primary text.
     */
    @Generated
    @Selector("textProperties")
    @NotNull
    public native UIContentUnavailableTextProperties textProperties();

    /**
     * Padding between the button and text. Only applies when there is both a button and text.
     */
    @Generated
    @Selector("textToButtonPadding")
    @NFloat
    public native double textToButtonPadding();

    /**
     * Padding between the text and secondary text. Only applies when there is both text and secondary text.
     */
    @Generated
    @Selector("textToSecondaryTextPadding")
    @NFloat
    public native double textToSecondaryTextPadding();

    @Generated
    @Selector("updatedConfigurationForState:")
    @NotNull
    public native UIContentUnavailableConfiguration updatedConfigurationForState(
            @Mapped(ObjCObjectMapper.class) @NotNull UIConfigurationState state);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}