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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIListContentConfiguration extends NSObject implements UIContentConfiguration, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIListContentConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Returns the default configuration for an accompanied sidebar list cell.
     */
    @NotNull
    @Generated
    @Selector("accompaniedSidebarCellConfiguration")
    public static native UIListContentConfiguration accompaniedSidebarCellConfiguration();

    /**
     * Returns the default configuration for an accompanied sidebar list cell with subtitle text.
     */
    @NotNull
    @Generated
    @Selector("accompaniedSidebarSubtitleCellConfiguration")
    public static native UIListContentConfiguration accompaniedSidebarSubtitleCellConfiguration();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIListContentConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIListContentConfiguration allocWithZone(VoidPtr zone);

    /**
     * An attributed variant of the primary text, which supersedes the `text` and some properties of the
     * `textProperties` if set.
     */
    @Nullable
    @Generated
    @Selector("attributedText")
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

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Returns the default configuration for a list cell.
     */
    @NotNull
    @Generated
    @Selector("cellConfiguration")
    public static native UIListContentConfiguration cellConfiguration();

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

    /**
     * The margins for the content to the edges of the content view. (When preserving superview layout margins on one or
     * both axes, these are just minimum margins, as inherited margins may be larger.)
     */
    @Generated
    @Selector("directionalLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets directionalLayoutMargins();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * Returns the default configuration for a grouped list footer.
     */
    @NotNull
    @Generated
    @Selector("groupedFooterConfiguration")
    public static native UIListContentConfiguration groupedFooterConfiguration();

    /**
     * Returns the default configuration for a grouped list header.
     */
    @NotNull
    @Generated
    @Selector("groupedHeaderConfiguration")
    public static native UIListContentConfiguration groupedHeaderConfiguration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The image to display.
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * Additional properties to configure the image.
     */
    @NotNull
    @Generated
    @Selector("imageProperties")
    public native UIListContentImageProperties imageProperties();

    /**
     * Padding between the image and text. Only applies when there is both an image and text.
     */
    @Generated
    @Selector("imageToTextPadding")
    @NFloat
    public native double imageToTextPadding();

    @Generated
    @Selector("init")
    public native UIListContentConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native UIListContentConfiguration initWithCoder(@NotNull NSCoder coder);

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

    @NotNull
    @Generated
    @Selector("makeContentView")
    public native UIView makeContentView();

    @Generated
    @Owned
    @Selector("new")
    public static native UIListContentConfiguration new_objc();

    /**
     * Returns the default configuration for a plain list footer.
     */
    @NotNull
    @Generated
    @Selector("plainFooterConfiguration")
    public static native UIListContentConfiguration plainFooterConfiguration();

    /**
     * Returns the default configuration for a plain list header.
     */
    @NotNull
    @Generated
    @Selector("plainHeaderConfiguration")
    public static native UIListContentConfiguration plainHeaderConfiguration();

    /**
     * When YES, the text and secondary text will be positioned side-by-side if there is sufficient space. Otherwise,
     * the text will be stacked in a vertical layout.
     */
    @Generated
    @Selector("prefersSideBySideTextAndSecondaryText")
    public native boolean prefersSideBySideTextAndSecondaryText();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An attributed variant of the secondary text, which supersedes the `secondaryText` and some properties of the
     * `secondaryTextProperties` if set.
     */
    @Nullable
    @Generated
    @Selector("secondaryAttributedText")
    public native NSAttributedString secondaryAttributedText();

    /**
     * The secondary text.
     */
    @Nullable
    @Generated
    @Selector("secondaryText")
    public native String secondaryText();

    /**
     * Additional properties to configure the secondary text.
     */
    @NotNull
    @Generated
    @Selector("secondaryTextProperties")
    public native UIListContentTextProperties secondaryTextProperties();

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
     * When YES, the text and secondary text will be positioned side-by-side if there is sufficient space. Otherwise,
     * the text will be stacked in a vertical layout.
     */
    @Generated
    @Selector("setPrefersSideBySideTextAndSecondaryText:")
    public native void setPrefersSideBySideTextAndSecondaryText(boolean value);

    /**
     * An attributed variant of the secondary text, which supersedes the `secondaryText` and some properties of the
     * `secondaryTextProperties` if set.
     */
    @Generated
    @Selector("setSecondaryAttributedText:")
    public native void setSecondaryAttributedText(@Nullable NSAttributedString value);

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
     * Horizontal (minimum) padding between the text and secondary text. Only applies when there is both text and
     * secondary text, and they are in a side-by-side layout.
     */
    @Generated
    @Selector("setTextToSecondaryTextHorizontalPadding:")
    public native void setTextToSecondaryTextHorizontalPadding(@NFloat double value);

    /**
     * Vertical padding between the text and secondary text. Only applies when there is both text and secondary text,
     * and they are in a stacked layout.
     */
    @Generated
    @Selector("setTextToSecondaryTextVerticalPadding:")
    public native void setTextToSecondaryTextVerticalPadding(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Returns the default configuration for a sidebar list cell.
     */
    @NotNull
    @Generated
    @Selector("sidebarCellConfiguration")
    public static native UIListContentConfiguration sidebarCellConfiguration();

    /**
     * Returns the default configuration for a sidebar list header.
     */
    @NotNull
    @Generated
    @Selector("sidebarHeaderConfiguration")
    public static native UIListContentConfiguration sidebarHeaderConfiguration();

    /**
     * Returns the default configuration for a sidebar list cell with subtitle text.
     */
    @NotNull
    @Generated
    @Selector("sidebarSubtitleCellConfiguration")
    public static native UIListContentConfiguration sidebarSubtitleCellConfiguration();

    /**
     * Returns the default configuration for a list cell with subtitle text.
     */
    @NotNull
    @Generated
    @Selector("subtitleCellConfiguration")
    public static native UIListContentConfiguration subtitleCellConfiguration();

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
    @Nullable
    @Generated
    @Selector("text")
    public native String text();

    /**
     * Additional properties to configure the primary text.
     */
    @NotNull
    @Generated
    @Selector("textProperties")
    public native UIListContentTextProperties textProperties();

    /**
     * Horizontal (minimum) padding between the text and secondary text. Only applies when there is both text and
     * secondary text, and they are in a side-by-side layout.
     */
    @Generated
    @Selector("textToSecondaryTextHorizontalPadding")
    @NFloat
    public native double textToSecondaryTextHorizontalPadding();

    /**
     * Vertical padding between the text and secondary text. Only applies when there is both text and secondary text,
     * and they are in a stacked layout.
     */
    @Generated
    @Selector("textToSecondaryTextVerticalPadding")
    @NFloat
    public native double textToSecondaryTextVerticalPadding();

    @NotNull
    @Generated
    @Selector("updatedConfigurationForState:")
    public native UIListContentConfiguration updatedConfigurationForState(
            @NotNull @Mapped(ObjCObjectMapper.class) UIConfigurationState state);

    /**
     * Returns the default configuration for a list cell with side-by-side value text.
     */
    @NotNull
    @Generated
    @Selector("valueCellConfiguration")
    public static native UIListContentConfiguration valueCellConfiguration();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns the default configuration for an extra prominent inset grouped list header.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("extraProminentInsetGroupedHeaderConfiguration")
    public static native UIListContentConfiguration extraProminentInsetGroupedHeaderConfiguration();

    /**
     * Returns the default configuration for a prominent inset grouped list header.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("prominentInsetGroupedHeaderConfiguration")
    public static native UIListContentConfiguration prominentInsetGroupedHeaderConfiguration();
}
