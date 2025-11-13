package apple.accessorysetupkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A picker display item created from customizing a discovered accessory.
 * 
 * Use this type when your app's picker uses the ``ASPickerDisplaySettings/Options/filterDiscoveryResults`` option.
 * With this option enabled, your discovery session receives ``ASAccessoryEventType/accessoryDiscovered`` events with
 * discovered accessories.
 * To include a discovered accessory in the picker, create an instance of this class, optionally using the Bluetooth
 * properties of the event's ``ASDiscoveredAccessory`` to provide a more specific name or product image.
 * Then send the `ASDiscoveredDisplayItem` to the picker with the session's
 * ``ASAccessorySession/updatePicker(showing:completionHandler:)`` method.
 * 
 * API-Since: 26.1
 */
@Generated
@Library("AccessorySetupKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASDiscoveredDisplayItem extends ASPickerDisplayItem {
    static {
        NatJ.register();
    }

    @Generated
    protected ASDiscoveredDisplayItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASDiscoveredDisplayItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASDiscoveredDisplayItem allocWithZone(VoidPtr zone);

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
    public native ASDiscoveredDisplayItem init();

    /**
     * Creates a discovered picker display item with a name and image to display and a descriptor to match discovered
     * accessories.
     * - Parameters:
     * - name: The accessory name to display in the picker.
     * - productImage: An image of the accessory to display in the picker.
     * - accessory: App filtered accessory to display in the picker.
     * 
     * API-Since: 26.1
     */
    @Generated
    @Selector("initWithName:productImage:accessory:")
    public native ASDiscoveredDisplayItem initWithNameProductImageAccessory(@NotNull String name,
            @NotNull UIImage productImage, @NotNull ASDiscoveredAccessory accessory);

    @Generated
    @Selector("initWithName:productImage:descriptor:")
    public native ASDiscoveredDisplayItem initWithNameProductImageDescriptor(@NotNull String name,
            @NotNull UIImage productImage, @NotNull ASDiscoveryDescriptor descriptor);

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
    @Owned
    @Selector("new")
    public static native ASDiscoveredDisplayItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}