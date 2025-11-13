package apple.carplay;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
public class CPListImageRowItemCondensedElement extends CPListImageRowItemElement {
    static {
        NatJ.register();
    }

    @Generated
    protected CPListImageRowItemCondensedElement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The name of the system symbol image to use as accessory.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("accessorySymbolName")
    @Nullable
    public native String accessorySymbolName();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPListImageRowItemCondensedElement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPListImageRowItemCondensedElement allocWithZone(VoidPtr zone);

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

    /**
     * Shape used to draw the image of the element.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("imageShape")
    @NInt
    public native long imageShape();

    @Generated
    @Selector("init")
    public native CPListImageRowItemCondensedElement init();

    /**
     * Initialize a list image row condensed element with an image, an image shape, a title, subtitle and a system
     * symbol name.
     * 
     * @param image               The image associated to the element.
     * @param imageShape          The @c CPListImageRowItemCondensedElementShape shape being applied on the image.
     * @param title               The title of the element.
     * @param subtitle            The subtitle of the element.
     * @param accessorySymbolName The system symbol used as an accessory view.
     * 
     *                            API-Since: 26.0
     */
    @Generated
    @Selector("initWithImage:imageShape:title:subtitle:accessorySymbolName:")
    public native CPListImageRowItemCondensedElement initWithImageImageShapeTitleSubtitleAccessorySymbolName(
            @NotNull UIImage image, @NInt long imageShape, @NotNull String title, @Nullable String subtitle,
            @Nullable String accessorySymbolName);

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

    @Generated
    @Selector("maximumImageSize")
    @ByValue
    public static native CGSize maximumImageSize();

    @Generated
    @Owned
    @Selector("new")
    public static native CPListImageRowItemCondensedElement new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The name of the system symbol image to use as accessory.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAccessorySymbolName:")
    public native void setAccessorySymbolName(@Nullable String value);

    /**
     * The subtitle associated with this element.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(@Nullable String value);

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