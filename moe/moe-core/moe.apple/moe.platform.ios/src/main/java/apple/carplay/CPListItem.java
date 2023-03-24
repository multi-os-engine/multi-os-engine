package apple.carplay;

import apple.NSObject;
import apple.carplay.protocol.CPSelectableListItem;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPListItem describes a single object appearing in a list template.
 * Each @c CPListItem is displayed as a single cell in the list.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPListItem extends NSObject implements CPSelectableListItem {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPListItem allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Any extra text displayed below the primary text in a cell displaying this list item.
     */
    @Nullable
    @Generated
    @Selector("detailText")
    public native String detailText();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * An image displayed on the leading side of a cell displaying this list item.
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     * To properly size your list images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native CPListItem init();

    /**
     * Initialize a list item with text and detail text.
     */
    @Generated
    @Selector("initWithText:detailText:")
    public native CPListItem initWithTextDetailText(@Nullable String text, @Nullable String detailText);

    /**
     * Initialize a list item with text, detail text, and an image.
     * 
     * Your app should provide a @c UIImage that is display-ready, containing
     * two @c UIImageAssets, corresponding to night and day mode.
     * 
     * [@note] The maximum size of the image is given by +[CPListItem maximumImageSize].
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * To properly size your list images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     */
    @Generated
    @Selector("initWithText:detailText:image:")
    public native CPListItem initWithTextDetailTextImage(@Nullable String text, @Nullable String detailText,
            @Nullable UIImage image);

    /**
     * Initialize a list item with text, detailtext, an image, and a disclosure indicator.
     * 
     * [@note] The maximum size of the image is given by +[CPListItem maximumImageSize].
     * 
     * To properly size your list images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("initWithText:detailText:image:showsDisclosureIndicator:")
    public native CPListItem initWithTextDetailTextImageShowsDisclosureIndicator(@Nullable String text,
            @Nullable String detailText, @Nullable UIImage image, boolean showsDisclosureIndicator);

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
    public static native CPListItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * If YES, a cell displaying this list item will render with a disclosure indicator
     * in the trailing side of the cell.
     * 
     * [@note] If set, this property takes precedence over showsCloudLabel.
     * 
     * Defaults to NO.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("showsDisclosureIndicator")
    public native boolean showsDisclosureIndicator();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Nullable
    @Generated
    @Selector("text")
    public native String text();

    @Nullable
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An image displayed on the trailing side of a cell displaying this list item.
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     * 
     * [@note] If set, this property takes precedence over the @c accessoryType.
     */
    @Nullable
    @Generated
    @Selector("accessoryImage")
    public native UIImage accessoryImage();

    /**
     * An accessory image type to display in the trailing portion of this list item.
     * 
     * [@note] If you specify a custom accessoryImage, it will take priority over one of the
     * built-in accessory types specified here.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("accessoryType")
    @NInt
    public native long accessoryType();

    @Nullable
    @Generated
    @Selector("handler")
    @ObjCBlock(name = "call_handler_ret")
    public native CPSelectableListItem.Block_handler_ret handler();

    /**
     * Initialize a list item with text, detailtext, an image, an accessory type, and an accessory image.
     * 
     * [@note] The maximum size of the image is given by +[CPListItem maximumImageSize].
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * If you specify an @c accessoryImage, your @c accessoryType will be set to @c CPListItemAccessoryTypeNone.
     * 
     * To properly size your list images, your app should consider the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithText:detailText:image:accessoryImage:accessoryType:")
    public native CPListItem initWithTextDetailTextImageAccessoryImageAccessoryType(@Nullable String text,
            @Nullable String detailText, @Nullable UIImage image, @Nullable UIImage accessoryImage,
            @NInt long accessoryType);

    /**
     * If YES, a cell displaying this list item will render with an explicit indicator to the trailing edge of the text
     * 
     * Defaults to NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isExplicitContent")
    public native boolean isExplicitContent();

    /**
     * Indicate that this list item represents content that is currently playing. This list item
     * will render with an icon indicating that this item is playing.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    /**
     * The expected image size for your @c CPListItem.
     * 
     * To properly size your list images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("maximumImageSize")
    @ByValue
    public static native CGSize maximumImageSize();

    /**
     * Set a fractional value between 0 and 1 to display a progress bar on this list item.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("playbackProgress")
    @NFloat
    public native double playbackProgress();

    /**
     * Specify the location in the list item for the now playing indicator.
     * 
     * Defaults to CPListItemPlayingIndicatorLocationLeading.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("playingIndicatorLocation")
    @NInt
    public native long playingIndicatorLocation();

    /**
     * Update the accessory image in this list item, reloading this item in the table if needed.
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAccessoryImage:")
    public native void setAccessoryImage(@Nullable UIImage accessoryImage);

    /**
     * An accessory image type to display in the trailing portion of this list item.
     * 
     * [@note] If you specify a custom accessoryImage, it will take priority over one of the
     * built-in accessory types specified here.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAccessoryType:")
    public native void setAccessoryType(@NInt long value);

    /**
     * Update the detail text in this list item, reloading this item in the table if needed.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDetailText:")
    public native void setDetailText(@Nullable String detailText);

    /**
     * If YES, a cell displaying this list item will render with an explicit indicator to the trailing edge of the text
     * 
     * Defaults to NO.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setExplicitContent:")
    public native void setExplicitContent(boolean value);

    @Generated
    @Selector("setHandler:")
    public native void setHandler(
            @Nullable @ObjCBlock(name = "call_setHandler") CPSelectableListItem.Block_setHandler value);

    /**
     * Update the image in this list item, reloading this item in the table if needed.
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage image);

    /**
     * Set a fractional value between 0 and 1 to display a progress bar on this list item.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPlaybackProgress:")
    public native void setPlaybackProgress(@NFloat double value);

    /**
     * Indicate that this list item represents content that is currently playing. This list item
     * will render with an icon indicating that this item is playing.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPlaying:")
    public native void setPlaying(boolean value);

    /**
     * Specify the location in the list item for the now playing indicator.
     * 
     * Defaults to CPListItemPlayingIndicatorLocationLeading.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPlayingIndicatorLocation:")
    public native void setPlayingIndicatorLocation(@NInt long value);

    /**
     * If YES, a cell displaying this list item will render with an explicit label to the trailing edge of the text
     * 
     * Defaults to NO.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("setShowsExplicitLabel:")
    public native void setShowsExplicitLabel(boolean value);

    /**
     * Assign a new text label to this list item, automatically reloading this item in its list template.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setText:")
    public native void setText(@NotNull String text);

    /**
     * If YES, a cell displaying this list item will render with an explicit label to the trailing edge of the text
     * 
     * Defaults to NO.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("showsExplicitLabel")
    public native boolean showsExplicitLabel();

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);
}
