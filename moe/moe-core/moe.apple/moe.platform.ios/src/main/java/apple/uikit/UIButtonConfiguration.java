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

    @Generated
    @Selector("activityIndicatorColorTransformer")
    @ObjCBlock(name = "call_activityIndicatorColorTransformer_ret")
    public native Block_activityIndicatorColorTransformer_ret activityIndicatorColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_activityIndicatorColorTransformer_ret {
        @Generated
        UIColor call_activityIndicatorColorTransformer_ret(UIColor color);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIButtonConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIButtonConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attributedSubtitle")
    public native NSAttributedString attributedSubtitle();

    @Generated
    @Selector("attributedTitle")
    public native NSAttributedString attributedTitle();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * If the style should automatically update when the button is selected. Default varies by style. Disable to customize selection behavior.
     */
    @Generated
    @Selector("automaticallyUpdateForSelection")
    public native boolean automaticallyUpdateForSelection();

    /**
     * A UIBackgroundConfiguration describing the button's background. UIKit provides a value by default with values appropriate for a UIButton.
     */
    @Generated
    @Selector("background")
    public native UIBackgroundConfiguration background();

    /**
     * The base color to use for background elements. This color may be modified before being passed to a transformer, and finally applied to specific elements. Setting nil will cede full control to the configuration to select a color appropriate to the style.
     */
    @Generated
    @Selector("baseBackgroundColor")
    public native UIColor baseBackgroundColor();

    /**
     * The base color to use for foreground elements. This color may be modified before being passed to a transformer, and finally applied to specific elements. Setting nil will cede full control to the configuration to select a color appropriate to the style.
     */
    @Generated
    @Selector("baseForegroundColor")
    public native UIColor baseForegroundColor();

    @Generated
    @Selector("borderedButtonConfiguration")
    public static native UIButtonConfiguration borderedButtonConfiguration();

    @Generated
    @Selector("borderedProminentButtonConfiguration")
    public static native UIButtonConfiguration borderedProminentButtonConfiguration();

    @Generated
    @Selector("borderedTintedButtonConfiguration")
    public static native UIButtonConfiguration borderedTintedButtonConfiguration();

    @Generated
    @Selector("borderlessButtonConfiguration")
    public static native UIButtonConfiguration borderlessButtonConfiguration();

    /**
     * Determines the metrics and ideal size of the button. Clients may resize the button arbitrarily regardless of this value.
     */
    @Generated
    @Selector("buttonSize")
    @NInt
    public native long buttonSize();

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
     * Insets from the bounds of the button to create the content region. Defaults styles provide insets based on the button size.
     */
    @Generated
    @Selector("contentInsets")
    @ByValue
    public native NSDirectionalEdgeInsets contentInsets();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The corner style controls how background.cornerRadius is interpreted by the button. Defaults to `Dynamic`.
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
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("filledButtonConfiguration")
    public static native UIButtonConfiguration filledButtonConfiguration();

    @Generated
    @Selector("grayButtonConfiguration")
    public static native UIButtonConfiguration grayButtonConfiguration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("imageColorTransformer")
    @ObjCBlock(name = "call_imageColorTransformer_ret")
    public native Block_imageColorTransformer_ret imageColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_imageColorTransformer_ret {
        @Generated
        UIColor call_imageColorTransformer_ret(UIColor color);
    }

    /**
     * When a button has both image and text content, this value is the padding between the image and the text.
     */
    @Generated
    @Selector("imagePadding")
    @NFloat
    public native double imagePadding();

    /**
     * Defaults to Leading, only single edge values (top/leading/bottom/trailing) are supported.
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
    public native UIButtonConfiguration initWithCoder(NSCoder coder);

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
     * Button style to use when running under the Mac idiom.
     */
    @Generated
    @Selector("macIdiomStyle")
    @NInt
    public native long macIdiomStyle();

    @Generated
    @Owned
    @Selector("new")
    public static native UIButtonConfiguration new_objc();

    @Generated
    @Selector("plainButtonConfiguration")
    public static native UIButtonConfiguration plainButtonConfiguration();

    @Generated
    @Selector("preferredSymbolConfigurationForImage")
    public native UIImageSymbolConfiguration preferredSymbolConfigurationForImage();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setActivityIndicatorColorTransformer:")
    public native void setActivityIndicatorColorTransformer(
            @ObjCBlock(name = "call_setActivityIndicatorColorTransformer") Block_setActivityIndicatorColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActivityIndicatorColorTransformer {
        @Generated
        UIColor call_setActivityIndicatorColorTransformer(UIColor color);
    }

    @Generated
    @Selector("setAttributedSubtitle:")
    public native void setAttributedSubtitle(NSAttributedString value);

    @Generated
    @Selector("setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString value);

    /**
     * If the style should automatically update when the button is selected. Default varies by style. Disable to customize selection behavior.
     */
    @Generated
    @Selector("setAutomaticallyUpdateForSelection:")
    public native void setAutomaticallyUpdateForSelection(boolean value);

    /**
     * A UIBackgroundConfiguration describing the button's background. UIKit provides a value by default with values appropriate for a UIButton.
     */
    @Generated
    @Selector("setBackground:")
    public native void setBackground(UIBackgroundConfiguration value);

    /**
     * The base color to use for background elements. This color may be modified before being passed to a transformer, and finally applied to specific elements. Setting nil will cede full control to the configuration to select a color appropriate to the style.
     */
    @Generated
    @Selector("setBaseBackgroundColor:")
    public native void setBaseBackgroundColor(UIColor value);

    /**
     * The base color to use for foreground elements. This color may be modified before being passed to a transformer, and finally applied to specific elements. Setting nil will cede full control to the configuration to select a color appropriate to the style.
     */
    @Generated
    @Selector("setBaseForegroundColor:")
    public native void setBaseForegroundColor(UIColor value);

    /**
     * Determines the metrics and ideal size of the button. Clients may resize the button arbitrarily regardless of this value.
     */
    @Generated
    @Selector("setButtonSize:")
    public native void setButtonSize(@NInt long value);

    /**
     * Insets from the bounds of the button to create the content region. Defaults styles provide insets based on the button size.
     */
    @Generated
    @Selector("setContentInsets:")
    public native void setContentInsets(@ByValue NSDirectionalEdgeInsets value);

    /**
     * The corner style controls how background.cornerRadius is interpreted by the button. Defaults to `Dynamic`.
     */
    @Generated
    @Selector("setCornerStyle:")
    public native void setCornerStyle(@NInt long value);

    /**
     * Restore the default content insets.
     */
    @Generated
    @Selector("setDefaultContentInsets")
    public native void setDefaultContentInsets();

    @Generated
    @Selector("setImage:")
    public native void setImage(UIImage value);

    @Generated
    @Selector("setImageColorTransformer:")
    public native void setImageColorTransformer(
            @ObjCBlock(name = "call_setImageColorTransformer") Block_setImageColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImageColorTransformer {
        @Generated
        UIColor call_setImageColorTransformer(UIColor color);
    }

    /**
     * When a button has both image and text content, this value is the padding between the image and the text.
     */
    @Generated
    @Selector("setImagePadding:")
    public native void setImagePadding(@NFloat double value);

    /**
     * Defaults to Leading, only single edge values (top/leading/bottom/trailing) are supported.
     */
    @Generated
    @Selector("setImagePlacement:")
    public native void setImagePlacement(@NUInt long value);

    /**
     * Button style to use when running under the Mac idiom.
     */
    @Generated
    @Selector("setMacIdiomStyle:")
    public native void setMacIdiomStyle(@NInt long value);

    @Generated
    @Selector("setPreferredSymbolConfigurationForImage:")
    public native void setPreferredSymbolConfigurationForImage(UIImageSymbolConfiguration value);

    /**
     * Shows an activity indicator in place of an image. Its placement is controlled by the imagePlacement property.
     */
    @Generated
    @Selector("setShowsActivityIndicator:")
    public native void setShowsActivityIndicator(boolean value);

    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    @Generated
    @Selector("setSubtitleTextAttributesTransformer:")
    public native void setSubtitleTextAttributesTransformer(
            @ObjCBlock(name = "call_setSubtitleTextAttributesTransformer") Block_setSubtitleTextAttributesTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSubtitleTextAttributesTransformer {
        @Generated
        NSDictionary<String, ?> call_setSubtitleTextAttributesTransformer(NSDictionary<String, ?> textAttributes);
    }

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * The alignment to use for relative layout between title & subtitle.
     */
    @Generated
    @Selector("setTitleAlignment:")
    public native void setTitleAlignment(@NInt long value);

    /**
     * When a button has both a title & subtitle, this value is the padding between those titles.
     */
    @Generated
    @Selector("setTitlePadding:")
    public native void setTitlePadding(@NFloat double value);

    @Generated
    @Selector("setTitleTextAttributesTransformer:")
    public native void setTitleTextAttributesTransformer(
            @ObjCBlock(name = "call_setTitleTextAttributesTransformer") Block_setTitleTextAttributesTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTitleTextAttributesTransformer {
        @Generated
        NSDictionary<String, ?> call_setTitleTextAttributesTransformer(NSDictionary<String, ?> textAttributes);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Shows an activity indicator in place of an image. Its placement is controlled by the imagePlacement property.
     */
    @Generated
    @Selector("showsActivityIndicator")
    public native boolean showsActivityIndicator();

    @Generated
    @Selector("subtitle")
    public native String subtitle();

    @Generated
    @Selector("subtitleTextAttributesTransformer")
    @ObjCBlock(name = "call_subtitleTextAttributesTransformer_ret")
    public native Block_subtitleTextAttributesTransformer_ret subtitleTextAttributesTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subtitleTextAttributesTransformer_ret {
        @Generated
        NSDictionary<String, ?> call_subtitleTextAttributesTransformer_ret(NSDictionary<String, ?> textAttributes);
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

    @Generated
    @Selector("tintedButtonConfiguration")
    public static native UIButtonConfiguration tintedButtonConfiguration();

    @Generated
    @Selector("title")
    public native String title();

    /**
     * The alignment to use for relative layout between title & subtitle.
     */
    @Generated
    @Selector("titleAlignment")
    @NInt
    public native long titleAlignment();

    /**
     * When a button has both a title & subtitle, this value is the padding between those titles.
     */
    @Generated
    @Selector("titlePadding")
    @NFloat
    public native double titlePadding();

    @Generated
    @Selector("titleTextAttributesTransformer")
    @ObjCBlock(name = "call_titleTextAttributesTransformer_ret")
    public native Block_titleTextAttributesTransformer_ret titleTextAttributesTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_titleTextAttributesTransformer_ret {
        @Generated
        NSDictionary<String, ?> call_titleTextAttributesTransformer_ret(NSDictionary<String, ?> textAttributes);
    }

    /**
     * Returns a copy of the configuration updated based on the given button, by applying the configuration's default values for that button's state to any properties that have not been customized.
     */
    @Generated
    @Selector("updatedConfigurationForButton:")
    public native UIButtonConfiguration updatedConfigurationForButton(UIButton button);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
