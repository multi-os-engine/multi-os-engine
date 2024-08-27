package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.mapkit.MKMapItem;
import apple.uikit.UIImage;
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
import apple.corefoundation.struct.CGSize;
import org.moe.natj.general.ann.ByValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPPointOfInterest extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPPointOfInterest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPPointOfInterest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPPointOfInterest allocWithZone(VoidPtr zone);

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
     * Subtitle to be used when POI detail card is visible.
     * 
     * [@note] If not provided, the point of interest will fall back to displaying @c subtitle.
     */
    @Nullable
    @Generated
    @Selector("detailSubtitle")
    public native String detailSubtitle();

    /**
     * Summary text to be used when POI detail card is visible.
     * 
     * [@note] If not provided, the point of interest will fall back to displaying @c summary.
     */
    @Nullable
    @Generated
    @Selector("detailSummary")
    public native String detailSummary();

    /**
     * Title to be used when POI detail card is visible.
     * 
     * [@note] If not provided, the point of interest will fall back to displaying @c title.
     */
    @Nullable
    @Generated
    @Selector("detailTitle")
    public native String detailTitle();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPPointOfInterest init();

    @Generated
    @Selector("initWithCoder:")
    public native CPPointOfInterest initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a point of interest to be used with @c CPPointOfInterestTemplate.
     * 
     * [@note] When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the
     * image, provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * CPPointOfInterest instances appear on the Point of Interest map view as both selectable items in the table view
     * overlay and as map annotations.
     * 
     * To properly size your pin images, your app should size them to the display scale of the car screen. See
     * -[CPInterfaceController carTraitCollection].
     * 
     * @param location       Location indicator use by map annotations.
     * @param title          Primary title for this point of interest.
     * @param subtitle       Optional: Secondary title for this point of interest.
     * @param summary        Optional: Summary text for this point of interest.
     * @param detailTitle    Optional: Title to be used when POI detail card is visible.
     * @param detailSubtitle Optional: Subtitle to be used when POI detail card is visible.
     * @param detailSummary  Optional: Summary text to be used when POI detail card is visible.
     * @param pinImage       Optional: a custom map annotation image.
     */
    @Generated
    @Selector("initWithLocation:title:subtitle:summary:detailTitle:detailSubtitle:detailSummary:pinImage:")
    public native CPPointOfInterest initWithLocationTitleSubtitleSummaryDetailTitleDetailSubtitleDetailSummaryPinImage(
            @NotNull MKMapItem location, @NotNull String title, @Nullable String subtitle, @Nullable String summary,
            @Nullable String detailTitle, @Nullable String detailSubtitle, @Nullable String detailSummary,
            @Nullable UIImage pinImage);

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
     * Location associated with this point of interest.
     */
    @NotNull
    @Generated
    @Selector("location")
    public native MKMapItem location();

    @Generated
    @Owned
    @Selector("new")
    public static native CPPointOfInterest new_objc();

    /**
     * Image used for map view unselected annotations.
     * 
     * To properly size your pin image, your app should size them to the display scale of the car screen. See
     * -[CPInterfaceController carTraitCollection].
     */
    @Nullable
    @Generated
    @Selector("pinImage")
    public native UIImage pinImage();

    /**
     * Point of Interest detail card buttons.
     */
    @Nullable
    @Generated
    @Selector("primaryButton")
    public native CPTextButton primaryButton();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("secondaryButton")
    public native CPTextButton secondaryButton();

    /**
     * Subtitle to be used when POI detail card is visible.
     * 
     * [@note] If not provided, the point of interest will fall back to displaying @c subtitle.
     */
    @Generated
    @Selector("setDetailSubtitle:")
    public native void setDetailSubtitle(@Nullable String value);

    /**
     * Summary text to be used when POI detail card is visible.
     * 
     * [@note] If not provided, the point of interest will fall back to displaying @c summary.
     */
    @Generated
    @Selector("setDetailSummary:")
    public native void setDetailSummary(@Nullable String value);

    /**
     * Title to be used when POI detail card is visible.
     * 
     * [@note] If not provided, the point of interest will fall back to displaying @c title.
     */
    @Generated
    @Selector("setDetailTitle:")
    public native void setDetailTitle(@Nullable String value);

    /**
     * Location associated with this point of interest.
     */
    @Generated
    @Selector("setLocation:")
    public native void setLocation(@NotNull MKMapItem value);

    /**
     * Image used for map view unselected annotations.
     * 
     * To properly size your pin image, your app should size them to the display scale of the car screen. See
     * -[CPInterfaceController carTraitCollection].
     */
    @Generated
    @Selector("setPinImage:")
    public native void setPinImage(@Nullable UIImage value);

    /**
     * Point of Interest detail card buttons.
     */
    @Generated
    @Selector("setPrimaryButton:")
    public native void setPrimaryButton(@Nullable CPTextButton value);

    @Generated
    @Selector("setSecondaryButton:")
    public native void setSecondaryButton(@Nullable CPTextButton value);

    /**
     * Subtitle for this point of interest.
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@Nullable String value);

    /**
     * Summary text for this point of interest.
     */
    @Generated
    @Selector("setSummary:")
    public native void setSummary(@Nullable String value);

    /**
     * Primary title for this point of interest.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@NotNull String value);

    /**
     * Any custom data or an object associated with this Point of Interest.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Subtitle for this point of interest.
     */
    @Nullable
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * Summary text for this point of interest.
     */
    @Nullable
    @Generated
    @Selector("summary")
    public native String summary();

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
     * Primary title for this point of interest.
     */
    @NotNull
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Any custom data or an object associated with this Point of Interest.
     */
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
     * Initializes a point of interest to be used with @c CPPointOfInterestTemplate .
     * 
     * [@note] When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the
     * image, provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * 
     * CPPointOfInterest instances appear on the Point of Interest map view as both selectable items in the table view
     * overlay and as map annotations.
     * 
     * To properly size your pin images, your app should size them to the display scale of the car screen. See
     * -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 16.0
     * 
     * @param location         Location indicator use by map annotations.
     * @param title            Primary title for this point of interest.
     * @param subtitle         Optional: Secondary title for this point of interest.
     * @param summary          Optional: Summary text for this point of interest.
     * @param detailTitle      Optional: Title to be used when POI detail card is visible.
     * @param detailSubtitle   Optional: Subtitle to be used when POI detail card is visible.
     * @param detailSummary    Optional: Summary text to be used when POI detail card is visible.
     * @param pinImage         Optional: a custom unselected map annotation image.
     * @param selectedPinImage Optional: a custom selected map annotation image.
     */
    @Generated
    @Selector("initWithLocation:title:subtitle:summary:detailTitle:detailSubtitle:detailSummary:pinImage:selectedPinImage:")
    public native CPPointOfInterest initWithLocationTitleSubtitleSummaryDetailTitleDetailSubtitleDetailSummaryPinImageSelectedPinImage(
            @NotNull MKMapItem location, @NotNull String title, @Nullable String subtitle, @Nullable String summary,
            @Nullable String detailTitle, @Nullable String detailSubtitle, @Nullable String detailSummary,
            @Nullable UIImage pinImage, @Nullable UIImage selectedPinImage);

    /**
     * If you provide a custom image for this point of interest, the unselected image must be this size. Any image
     * larger than this size will be resized.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("pinImageSize")
    @ByValue
    public static native CGSize pinImageSize();

    /**
     * Image used for map view selected annotation.
     * 
     * To properly size your pin image, your app should size them to the display scale of the car screen. See
     * -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("selectedPinImage")
    public native UIImage selectedPinImage();

    /**
     * If you provide a custom image for this point of interest, the selected image must be this size. Any image larger
     * than this size will be resized.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("selectedPinImageSize")
    @ByValue
    public static native CGSize selectedPinImageSize();

    /**
     * Image used for map view selected annotation.
     * 
     * To properly size your pin image, your app should size them to the display scale of the car screen. See
     * -[CPInterfaceController carTraitCollection].
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSelectedPinImage:")
    public native void setSelectedPinImage(@Nullable UIImage value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
