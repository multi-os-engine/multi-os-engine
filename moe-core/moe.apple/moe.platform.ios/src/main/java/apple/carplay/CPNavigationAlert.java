package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@c] CPNavigationAlert is a banner alert that can display map or navigation-related information to the user.
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPNavigationAlert extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPNavigationAlert(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPNavigationAlert alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPNavigationAlert allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Nullable
    @Generated
    @Selector("imageSet")
    public native CPImageSet imageSet();

    @Generated
    @Selector("init")
    public native CPNavigationAlert init();

    @Generated
    @Selector("initWithCoder:")
    public native CPNavigationAlert initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithTitleVariants:subtitleVariants:image:primaryAction:secondaryAction:duration:")
    public native CPNavigationAlert initWithTitleVariantsSubtitleVariantsImagePrimaryActionSecondaryActionDuration(
            @NotNull NSArray<String> titleVariants, @Nullable NSArray<String> subtitleVariants, @Nullable UIImage image,
            @NotNull CPAlertAction primaryAction, @Nullable CPAlertAction secondaryAction, double duration);

    /**
     * Fully specify a @c CPNavigationAlert with a title, image, primary and secondary action,
     * and duration.
     * 
     * @param titleVariants    An array of titles. The system will select a title that fits in the available space. The
     *                         variant strings should be provided as localized, displayable content.
     * 
     * @param subtitleVariants An array of subtitles. The system will select a subtitle that fits in the available
     *                         space. The variant strings should be provided as localized, displayable content.
     * 
     * @param imageSet         An optional @c CPImageSet to display in this navigation alert. Animated images are not
     *                         supported.
     *                         If an animated image is provided, only the first image from each image set will be used.
     * 
     * @param primaryAction    The alert must include at least one action button.
     * 
     * @param secondaryAction  An optional secondary button to display on the trailing edge of this alert.
     * 
     * @param duration         The duration for which this alert should be visible. Specify 0 for an alert
     *                         that displays indefinitely.
     * 
     * @return an initialized @c CPNavigationAlert.
     * 
     *         API-Since: 12.0
     *         Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("initWithTitleVariants:subtitleVariants:imageSet:primaryAction:secondaryAction:duration:")
    public native CPNavigationAlert initWithTitleVariantsSubtitleVariantsImageSetPrimaryActionSecondaryActionDuration(
            @NotNull NSArray<String> titleVariants, @Nullable NSArray<String> subtitleVariants,
            @Nullable CPImageSet imageSet, @NotNull CPAlertAction primaryAction,
            @Nullable CPAlertAction secondaryAction, double duration);

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
    public static native CPNavigationAlert new_objc();

    @NotNull
    @Generated
    @Selector("primaryAction")
    public native CPAlertAction primaryAction();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("secondaryAction")
    public native CPAlertAction secondaryAction();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("subtitleVariants")
    public native NSArray<String> subtitleVariants();

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

    @NotNull
    @Generated
    @Selector("titleVariants")
    public native NSArray<String> titleVariants();

    /**
     * The navigation alert may be updated with new title and subtitle variants, either
     * after it has already been displayed on screen, or before its initial presentation on screen.
     * 
     * Updating an alert that has been already been dismissed has no effect.
     * 
     * @param newTitleVariants    an updated array of title variants
     * @param newSubtitleVariants an updated array of subtitle variants
     */
    @Generated
    @Selector("updateTitleVariants:subtitleVariants:")
    public native void updateTitleVariantsSubtitleVariants(@NotNull NSArray<String> newTitleVariants,
            @NotNull NSArray<String> newSubtitleVariants);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
