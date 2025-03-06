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
 * API-Since: 18.0
 */
@Generated
@Library("AccessorySetupKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASPickerDisplayItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ASPickerDisplayItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASPickerDisplayItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native ASPickerDisplayItem allocWithZone(VoidPtr zone);

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

    /**
     * A descriptor that the picker uses to determine which discovered accessories to display.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("descriptor")
    @NotNull
    public native ASDiscoveryDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASPickerDisplayItem init();

    /**
     * Creates a picker display item with a name and image to display and a descriptor to match discovered accessories.
     * - Parameters:
     * - name: The accessory name to display in the picker.
     * - productImage: An image of the accessory to display in the picker.
     * - descriptor: A descriptor that the picker uses to determine which discovered accessories to display.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithName:productImage:descriptor:")
    public native ASPickerDisplayItem initWithNameProductImageDescriptor(@NotNull String name,
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

    /**
     * The accessory name to display in the picker.
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
    public static native ASPickerDisplayItem new_objc();

    /**
     * An image of the accessory to display in the picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("productImage")
    @NotNull
    public native UIImage productImage();

    /**
     * Options to allow renaming a matched accessory.
     * 
     * To permit renaming, include ``SetupOptions-swift.struct/rename`` in the ``setupOptions-c.property``
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("renameOptions")
    @NUInt
    public native long renameOptions();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Options to allow renaming a matched accessory.
     * 
     * To permit renaming, include ``SetupOptions-swift.struct/rename`` in the ``setupOptions-c.property``
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setRenameOptions:")
    public native void setRenameOptions(@NUInt long value);

    /**
     * Custom setup options for the accessory.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSetupOptions:")
    public native void setSetupOptions(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Custom setup options for the accessory.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setupOptions")
    @NUInt
    public native long setupOptions();

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