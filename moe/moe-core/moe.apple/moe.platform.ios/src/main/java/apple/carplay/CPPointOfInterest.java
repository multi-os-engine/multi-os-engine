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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Subtitle to be used when POI detail card is visible
     * <p>
     * [@note] If not provided, the point of interest will fall back to displaying @c subtitle
     */
    @Generated
    @Selector("detailSubtitle")
    public native String detailSubtitle();

    /**
     * Summary text to be used when POI detail card is visible.
     * <p>
     * [@note] If not provided, the point of interest will fall back to displaying @c summary
     */
    @Generated
    @Selector("detailSummary")
    public native String detailSummary();

    /**
     * Title to be used when POI detail card is visible
     * <p>
     * [@note] If not provided, the point of interest will fall back to displaying @c title
     */
    @Generated
    @Selector("detailTitle")
    public native String detailTitle();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPPointOfInterest init();

    @Generated
    @Selector("initWithCoder:")
    public native CPPointOfInterest initWithCoder(NSCoder coder);

    /**
     * Initializes a point of interest to be used with @c CPPointOfInterestTemplate
     * <p>
     * [@note] When providing an image, your app should provide a @c UIImage that is display-ready. If necessary for the image, provide
     * light and dark styles by using an asset from your asset catalog, prepared with light and dark styles
     * or by using @c UIImageAsset to combine two @c UIImage instances into a single image with
     * both styles.
     * <p>
     * CPPointOfInterest instances appear on the Point of Interest map view as both selectable items in the table view overlay and as map annotations.
     *
     * @param location       Location indicator use by map annotations.
     * @param title          Primary title for this point of interest
     * @param subtitle       Optional: Secondary title for this point of interest
     * @param summary        Optional: Summary text for this point of interest
     * @param detailTitle    Optional: Title to be used when POI detail card is visible
     * @param detailSubtitle Optional: Subtitle to be used when POI detail card is visible
     * @param detailSummary  Optional: Summary text to be used when POI detail card is visible
     * @param pinImage       Optional: a custom map annotation image
     */
    @Generated
    @Selector("initWithLocation:title:subtitle:summary:detailTitle:detailSubtitle:detailSummary:pinImage:")
    public native CPPointOfInterest initWithLocationTitleSubtitleSummaryDetailTitleDetailSubtitleDetailSummaryPinImage(
            MKMapItem location, String title, String subtitle, String summary, String detailTitle,
            String detailSubtitle, String detailSummary, UIImage pinImage);

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
     * Location associated with this point of interest
     */
    @Generated
    @Selector("location")
    public native MKMapItem location();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Image used for map view annotations
     */
    @Generated
    @Selector("pinImage")
    public native UIImage pinImage();

    /**
     * Point of Interest detail card buttons
     */
    @Generated
    @Selector("primaryButton")
    public native CPTextButton primaryButton();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("secondaryButton")
    public native CPTextButton secondaryButton();

    /**
     * Subtitle to be used when POI detail card is visible
     * <p>
     * [@note] If not provided, the point of interest will fall back to displaying @c subtitle
     */
    @Generated
    @Selector("setDetailSubtitle:")
    public native void setDetailSubtitle(String value);

    /**
     * Summary text to be used when POI detail card is visible.
     * <p>
     * [@note] If not provided, the point of interest will fall back to displaying @c summary
     */
    @Generated
    @Selector("setDetailSummary:")
    public native void setDetailSummary(String value);

    /**
     * Title to be used when POI detail card is visible
     * <p>
     * [@note] If not provided, the point of interest will fall back to displaying @c title
     */
    @Generated
    @Selector("setDetailTitle:")
    public native void setDetailTitle(String value);

    /**
     * Location associated with this point of interest
     */
    @Generated
    @Selector("setLocation:")
    public native void setLocation(MKMapItem value);

    /**
     * Image used for map view annotations
     */
    @Generated
    @Selector("setPinImage:")
    public native void setPinImage(UIImage value);

    /**
     * Point of Interest detail card buttons
     */
    @Generated
    @Selector("setPrimaryButton:")
    public native void setPrimaryButton(CPTextButton value);

    @Generated
    @Selector("setSecondaryButton:")
    public native void setSecondaryButton(CPTextButton value);

    /**
     * Subtitle for this point of interest
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    /**
     * Summary text for this point of interest
     */
    @Generated
    @Selector("setSummary:")
    public native void setSummary(String value);

    /**
     * Primary title for this point of interest
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * Any custom data or an object associated with this Point of Interest.
     */
    @Generated
    @Selector("setUserInfo:")
    public native void setUserInfo(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Subtitle for this point of interest
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * Summary text for this point of interest
     */
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
     * Primary title for this point of interest
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * Any custom data or an object associated with this Point of Interest.
     */
    @Generated
    @Selector("userInfo")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
