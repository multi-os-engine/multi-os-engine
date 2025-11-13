package apple.carplay;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 26.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPListImageRowItemCardElement extends CPListImageRowItemElement {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListImageRowItemCardElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListImageRowItemCardElement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPListImageRowItemCardElement allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

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
    public native CPListImageRowItemCardElement init();

    /**
     * Initialize an element that is constituted of an image, boolean to entirely cover the element with the image,
     * title, subtitle and a tint color.
     * 
     * When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image,
     * provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * UIImageAsset is used to combine multiple UIImages with different trait collections into a single UIImage.
     * 
     * [@note] The expected image size is given by +[CPListImageRowItemCardElement maximumImageSize] or by
     * +[CPListImageRowItemCardElement maximumFullHeightImageSize] if @c showsImageFullHeight is true. Images provided
     * will be resized to this size if necessary.
     * 
     * To properly size your images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * @param image                The image associated to the element.
     * @param showsImageFullHeight Determines if the image should entirely cover the card
     * @param title                The title of the element.
     * @param subtitle             The subtitle of the element.
     * @param tintColor            The color used as background if @c showsImageFullHeight is true, part of the gradient
     *                             color at the bottom of the card otherwise.
     * 
     *                             API-Since: 26.0
     */
    @Generated
    @Selector("initWithImage:showsImageFullHeight:title:subtitle:tintColor:")
    public native CPListImageRowItemCardElement initWithImageShowsImageFullHeightTitleSubtitleTintColor(
            @NotNull UIImage image, boolean showsImageFullHeight, @Nullable String title, @Nullable String subtitle,
            @Nullable UIColor tintColor);

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
     * The expected image size for the image in your @c CPListImageRowItemCardElement when @c showsImageFullHeight is
     * true. Images provided
     * will be resized to this size.
     * 
     * To properly size your images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maximumFullHeightImageSize")
    @ByValue
    public static native CGSize maximumFullHeightImageSize();

    /**
     * The expected image size for the image in your @c CPListImageRowItemCardElement when @c showsImageFullHeight is
     * false. Images provided
     * will be resized to this size.
     * 
     * To properly size your images, your app should size them to the display scale of the car screen.
     * See -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("maximumImageSize")
    @ByValue
    public static native CGSize maximumImageSize();

    @Generated
    @Owned
    @Selector("new")
    public static native CPListImageRowItemCardElement new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The subtitle associated with this element.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@Nullable String value);

    /**
     * A UIColor used to tint the element. When @c showsImageFullHeight is true, the tint color is applied behind the
     * labels at the bottom of the card. Otherwise, this color is part of the gradient color at the bottom of the card.
     * 
     * If this value is nil, iOS will use secondarySystemBackground color.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(@Nullable UIColor value);

    /**
     * The title associated with this element.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A Boolean value indicating whether the element should be fill with the image.
     * 
     * Set the value of this property to @c YES to fill the element with the image or @c NO to use a rounded square
     * image that does not fill the card.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("showsImageFullHeight")
    public native boolean showsImageFullHeight();

    /**
     * The subtitle associated with this element.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("subtitle")
    @Nullable
    public native String subtitle();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A UIColor used to tint the element. When @c showsImageFullHeight is true, the tint color is applied behind the
     * labels at the bottom of the card. Otherwise, this color is part of the gradient color at the bottom of the card.
     * 
     * If this value is nil, iOS will use secondarySystemBackground color.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tintColor")
    @Nullable
    public native UIColor tintColor();

    /**
     * The title associated with this element.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("title")
    @NotNull
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}