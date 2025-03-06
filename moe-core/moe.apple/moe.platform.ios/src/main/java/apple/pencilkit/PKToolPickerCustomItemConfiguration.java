package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.UIColor;
import apple.uikit.UIImage;
import apple.uikit.UIViewController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * A configuration that specifies the appearance and behavior of a item and its contents.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKToolPickerCustomItemConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected PKToolPickerCustomItemConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKToolPickerCustomItemConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKToolPickerCustomItemConfiguration allocWithZone(VoidPtr zone);

    /**
     * Present color selection UI to the user.
     * Note that the custom item has a mutable version of this property. This property provides its initial value.
     * Default value is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allowsColorSelection")
    public native boolean allowsColorSelection();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Default color for the tool.
     * Default value is black.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("defaultColor")
    @NotNull
    public native UIColor defaultColor();

    /**
     * Default width for the tool.
     * Default value is 0.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("defaultWidth")
    @NFloat
    public native double defaultWidth();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A string that identifies the item in the picker.
     * For example, com.example.myapp.toolpicker.pencil.
     * If multiple items with the same identifier are used to create the picker, only the first instance is used.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native String identifier();

    /**
     * A block to provide an image representing the given tool item.
     * Return an image at least 150 points tall to avoid the bottom of the item showing during animations.
     * By default, PencilKit uses `name` to label the tool item for accessibility.
     * To override this, set the `accessibilityLabel` of the image returned from this block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("imageProvider")
    @ObjCBlock(name = "call_imageProvider_ret")
    @Nullable
    public native Block_imageProvider_ret imageProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_imageProvider_ret {
        @Generated
        @NotNull
        UIImage call_imageProvider_ret(@NotNull PKToolPickerCustomItem arg0);
    }

    @Generated
    @Selector("init")
    public native PKToolPickerCustomItemConfiguration init();

    /**
     * Create a new eraser tool item with a width.
     * 
     * @param identifier The identifier for the tool item.
     * @param name       The name for the tool item.
     * 
     *                   API-Since: 18.0
     */
    @Generated
    @Selector("initWithIdentifier:name:")
    public native PKToolPickerCustomItemConfiguration initWithIdentifierName(@NotNull String identifier,
            @NotNull String name);

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
     * A short string suitable for presentation to users as the name of the tool.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native PKToolPickerCustomItemConfiguration new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Present color selection UI to the user.
     * Note that the custom item has a mutable version of this property. This property provides its initial value.
     * Default value is NO.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAllowsColorSelection:")
    public native void setAllowsColorSelection(boolean value);

    /**
     * Default color for the tool.
     * Default value is black.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDefaultColor:")
    public native void setDefaultColor(@NotNull UIColor value);

    /**
     * Default width for the tool.
     * Default value is 0.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDefaultWidth:")
    public native void setDefaultWidth(@NFloat double value);

    /**
     * A string that identifies the item in the picker.
     * For example, com.example.myapp.toolpicker.pencil.
     * If multiple items with the same identifier are used to create the picker, only the first instance is used.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(@NotNull String value);

    /**
     * A block to provide an image representing the given tool item.
     * Return an image at least 150 points tall to avoid the bottom of the item showing during animations.
     * By default, PencilKit uses `name` to label the tool item for accessibility.
     * To override this, set the `accessibilityLabel` of the image returned from this block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setImageProvider:")
    public native void setImageProvider(
            @ObjCBlock(name = "call_setImageProvider") @Nullable Block_setImageProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImageProvider {
        @Generated
        @NotNull
        UIImage call_setImageProvider(@NotNull PKToolPickerCustomItem arg0);
    }

    /**
     * A short string suitable for presentation to users as the name of the tool.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    /**
     * Defines which attribute controls are available to be presented in UI such as the tool attributes popover, or
     * inline in the picker presented from a pencil squeeze.
     * Controls for properties which the tool item does not support will not be presented. Excluding a control here does
     * not hide all UI for adjusting that value.
     * For example, excluding the opacity control here will not remove it from the color picker, if the color picker is
     * otherwise available.
     * Defaults to all controls.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setToolAttributeControls:")
    public native void setToolAttributeControls(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A block to provide a view controller above the system controls in the tool attributes popover.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setViewControllerProvider:")
    public native void setViewControllerProvider(
            @ObjCBlock(name = "call_setViewControllerProvider") @Nullable Block_setViewControllerProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setViewControllerProvider {
        @Generated
        @NotNull
        UIViewController call_setViewControllerProvider(@NotNull PKToolPickerCustomItem arg0);
    }

    /**
     * A dictionary representing the UI options for choosing width variants, with each element containing its width
     * value paired with its corresponding image.
     * A dictionary with fewer than 2 elements means no selection UI is available for users to adjust the width value.
     * A dictionary with 2 or more elements means that users can adjust the width value using the selection UI.
     * Provide square images with a size of at least 32pts by 32pts.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setWidthVariants:")
    public native void setWidthVariants(@NotNull NSDictionary<? extends NSNumber, ? extends UIImage> value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Defines which attribute controls are available to be presented in UI such as the tool attributes popover, or
     * inline in the picker presented from a pencil squeeze.
     * Controls for properties which the tool item does not support will not be presented. Excluding a control here does
     * not hide all UI for adjusting that value.
     * For example, excluding the opacity control here will not remove it from the color picker, if the color picker is
     * otherwise available.
     * Defaults to all controls.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("toolAttributeControls")
    @NUInt
    public native long toolAttributeControls();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A block to provide a view controller above the system controls in the tool attributes popover.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("viewControllerProvider")
    @ObjCBlock(name = "call_viewControllerProvider_ret")
    @Nullable
    public native Block_viewControllerProvider_ret viewControllerProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_viewControllerProvider_ret {
        @Generated
        @NotNull
        UIViewController call_viewControllerProvider_ret(@NotNull PKToolPickerCustomItem arg0);
    }

    /**
     * A dictionary representing the UI options for choosing width variants, with each element containing its width
     * value paired with its corresponding image.
     * A dictionary with fewer than 2 elements means no selection UI is available for users to adjust the width value.
     * A dictionary with 2 or more elements means that users can adjust the width value using the selection UI.
     * Provide square images with a size of at least 32pts by 32pts.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("widthVariants")
    @NotNull
    public native NSDictionary<? extends NSNumber, ? extends UIImage> widthVariants();
}