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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPDashboardButton extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPDashboardButton(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPDashboardButton alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPDashboardButton allocWithZone(VoidPtr zone);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The image displayed on the button. Maximum supported size is 30x30 points.
     * 
     * Animated images are not supported. If an animated image is assigned, only the first image will be used.
     */
    @NotNull
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native CPDashboardButton init();

    @Generated
    @Selector("initWithCoder:")
    public native CPDashboardButton initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize a button with title variants, optional subtitle variants, and image.
     * 
     * @param titleVariants    An array of title variants for this button, arranged from longest to shortest. You must
     *                         provide at least one title.
     * @param subtitleVariants An array of subtitle variants for this button, arranged from longest to shortest.
     * @param image            The image displayed on the button. It must be non-nil for the button to be displayed.
     * @param handler          A block to execute when the user selects the button. The block has no return value and
     *                         takes the selected button as its only parameter.
     *                         The image must be non-nil and the title must be a non-zero length string for the button
     *                         to be displayed.
     */
    @Generated
    @Selector("initWithTitleVariants:subtitleVariants:image:handler:")
    public native CPDashboardButton initWithTitleVariantsSubtitleVariantsImageHandler(
            @NotNull NSArray<String> titleVariants, @NotNull NSArray<String> subtitleVariants, @NotNull UIImage image,
            @Nullable @ObjCBlock(name = "call_initWithTitleVariantsSubtitleVariantsImageHandler") Block_initWithTitleVariantsSubtitleVariantsImageHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTitleVariantsSubtitleVariantsImageHandler {
        @Generated
        void call_initWithTitleVariantsSubtitleVariantsImageHandler(@NotNull CPDashboardButton barButton);
    }

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
    public static native CPDashboardButton new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An array of subtitle variants for this button, arranged from most to least preferred.
     * The system will select a title from your list of provided variants that fits the available space.
     * The variant strings should be provided as localized, displayable content.
     */
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

    /**
     * An array of title variants for this button, arranged from most to least preferred.
     * The system will select a title from your list of provided variants that fits the available space.
     * The variant strings should be provided as localized, displayable content.
     */
    @NotNull
    @Generated
    @Selector("titleVariants")
    public native NSArray<String> titleVariants();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
