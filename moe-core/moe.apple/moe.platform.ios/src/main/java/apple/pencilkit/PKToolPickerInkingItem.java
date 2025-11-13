package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * A user interface for an inking tool item in PKToolPicker.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKToolPickerInkingItem extends PKToolPickerItem {
    static {
        NatJ.register();
    }

    @Generated
    protected PKToolPickerInkingItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKToolPickerInkingItem alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKToolPickerInkingItem allocWithZone(VoidPtr zone);

    /**
     * Present color selection UI to the user.
     * Default value is YES.
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
    public native PKToolPickerInkingItem init();

    /**
     * Create a new tool picker item with a `PKInkType`.
     * 
     * @param inkType The ink type for the tool.
     * 
     *                API-Since: 18.0
     */
    @Generated
    @Selector("initWithInkType:")
    public native PKToolPickerInkingItem initWithInkType(@NotNull String inkType);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithInkType:color:")
    public native PKToolPickerInkingItem initWithInkTypeColor(@NotNull String inkType, @NotNull UIColor color);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithInkType:color:width:")
    public native PKToolPickerInkingItem initWithInkTypeColorWidth(@NotNull String inkType, @NotNull UIColor color,
            @NFloat double width);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithInkType:color:width:identifier:")
    public native PKToolPickerInkingItem initWithInkTypeColorWidthIdentifier(@NotNull String inkType,
            @NotNull UIColor color, @NFloat double width, @Nullable String identifier);

    /**
     * Create a new tool picker item with a `PKInkType`.
     * 
     * @param inkType The ink type for the tool.
     * @param width   The width for the tool.
     * 
     *                API-Since: 18.0
     */
    @Generated
    @Selector("initWithInkType:width:")
    public native PKToolPickerInkingItem initWithInkTypeWidth(@NotNull String inkType, @NFloat double width);

    /**
     * A tool for drawing on a `PKCanvasView`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("inkingTool")
    @NotNull
    public native PKInkingTool inkingTool();

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
    public static native PKToolPickerInkingItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Present color selection UI to the user.
     * Default value is YES.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAllowsColorSelection:")
    public native void setAllowsColorSelection(boolean value);

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

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithInkType:color:width:azimuth:identifier:")
    public native PKToolPickerInkingItem initWithInkTypeColorWidthAzimuthIdentifier(@NotNull String inkType,
            @NotNull UIColor color, @NFloat double width, @NFloat double azimuth, @Nullable String identifier);
}