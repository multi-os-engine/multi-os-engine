package apple.pencilkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.pencilkit.protocol.PKToolPickerObserver;
import apple.uikit.UIResponder;
import apple.uikit.UIView;
import apple.uikit.UIWindow;
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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.pencilkit.protocol.PKToolPickerDelegate;
import apple.uikit.UIBarButtonItem;
import org.moe.natj.general.ann.MappedReturn;

/**
 * A user interface for selecting a PKTool.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("PencilKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKToolPicker extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKToolPicker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add an observer for a tool picker changes.
     * 
     * Adding a `PKCanvasView` as an observer, will also set its initial state.
     * Observers are held weakly.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("addObserver:")
    public native void addObserver(@NotNull @Mapped(ObjCObjectMapper.class) PKToolPickerObserver observer);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKToolPicker alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKToolPicker allocWithZone(VoidPtr zone);

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

    /**
     * Set `colorUserInterfaceStyle` to cause this tool picker to create colors for a canvas view of the
     * specified user interface style. If this tool picker is used for selecting tools for canvas views that
     * have different user interface styles, `colorUserInterfaceStyle` should be set to the canvas's user
     * interface style.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("colorUserInterfaceStyle")
    @NInt
    public native long colorUserInterfaceStyle();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The frame within a specific view that the tool picker covers.
     * 
     * @param view The view in which to return the frame to avoid.
     * @return The rect in `view` that the tool picker obscures. Will return
     *         `CGRectNull` if no rect is obscured, or the tool picker is movable.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("frameObscuredInView:")
    @ByValue
    public native CGRect frameObscuredInView(@NotNull UIView view);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Returns a new `PKToolPicker` instance.
     * 
     * If two tool pickers are visible for the same first responder, or the same tool picker is visible in two windows
     * the result is deterministic, but undefined.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("init")
    public native PKToolPicker init();

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

    /**
     * Is the ruler toggled such that it should be active on canvases.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isRulerActive")
    public native boolean isRulerActive();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Is the tool picker visible.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isVisible")
    public native boolean isVisible();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PKToolPicker new_objc();

    /**
     * Set `overrideUserInterfaceStyle` to cause this tool picker UI to have a specific user interface style.
     * Consider if you need to set `colorUserInterfaceStyle` if you set this property.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("overrideUserInterfaceStyle")
    @NInt
    public native long overrideUserInterfaceStyle();

    /**
     * Remove an observer for a tool picker changes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("removeObserver:")
    public native void removeObserver(@NotNull @Mapped(ObjCObjectMapper.class) PKToolPickerObserver observer);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The currently selected tool.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use selectedToolItem instead.
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("selectedTool")
    public native PKTool selectedTool();

    /**
     * Set `colorUserInterfaceStyle` to cause this tool picker to create colors for a canvas view of the
     * specified user interface style. If this tool picker is used for selecting tools for canvas views that
     * have different user interface styles, `colorUserInterfaceStyle` should be set to the canvas's user
     * interface style.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setColorUserInterfaceStyle:")
    public native void setColorUserInterfaceStyle(@NInt long value);

    /**
     * Set `overrideUserInterfaceStyle` to cause this tool picker UI to have a specific user interface style.
     * Consider if you need to set `colorUserInterfaceStyle` if you set this property.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(@NInt long value);

    /**
     * Is the ruler toggled such that it should be active on canvases.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setRulerActive:")
    public native void setRulerActive(boolean value);

    /**
     * The currently selected tool.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use selectedToolItem instead.
     */
    @Deprecated
    @Generated
    @Selector("setSelectedTool:")
    public native void setSelectedTool(@NotNull PKTool value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Sets when this tool picker should be visible.
     * 
     * @param visible   The visible state of this tool picker.
     * @param responder The first responder for which this visible state applies.
     * 
     *                  API-Since: 13.0
     */
    @Generated
    @Selector("setVisible:forFirstResponder:")
    public native void setVisibleForFirstResponder(boolean visible, @NotNull UIResponder responder);

    /**
     * Returns the shared `PKToolPicker` instance for a window.
     * The returned tool picker object is typically shared between windows in the same UIWindowScene.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Create individual instances instead.
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("sharedToolPickerForWindow:")
    public static native PKToolPicker sharedToolPickerForWindow(@NotNull UIWindow window);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * If this is true the tool picker will show UI that allows the default drawing policy to be changed.
     * 
     * By default this is true.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setShowsDrawingPolicyControls:")
    public native void setShowsDrawingPolicyControls(boolean value);

    /**
     * The name used to automatically save the tool picker's state in the defaults system.
     * As of iOS 18.0 and visionOS 2.0, setting the value to nil disables auto-save.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setStateAutosaveName:")
    public native void setStateAutosaveName(@Nullable String value);

    /**
     * If this is true the tool picker will show UI that allows the default drawing policy to be changed.
     * 
     * By default this is true.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("showsDrawingPolicyControls")
    public native boolean showsDrawingPolicyControls();

    /**
     * The name used to automatically save the tool picker's state in the defaults system.
     * As of iOS 18.0 and visionOS 2.0, setting the value to nil disables auto-save.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("stateAutosaveName")
    public native String stateAutosaveName();

    /**
     * The maximum supported PencilKit content version.
     * 
     * Setting this to less than `.latest` limits the tools that are available to select so that they are compatible
     * with the
     * specified version. If setting this property, also set it on `PKCanvasView`.
     * 
     * Defaults to `.latest`.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("maximumSupportedContentVersion")
    @NInt
    public native long maximumSupportedContentVersion();

    /**
     * The maximum supported PencilKit content version.
     * 
     * Setting this to less than `.latest` limits the tools that are available to select so that they are compatible
     * with the
     * specified version. If setting this property, also set it on `PKCanvasView`.
     * 
     * Defaults to `.latest`.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setMaximumSupportedContentVersion:")
    public native void setMaximumSupportedContentVersion(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * If this is non-nil, the tool picker will display this item when the tool picker is displayed in supported
     * expanded configurations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("accessoryItem")
    @Nullable
    public native UIBarButtonItem accessoryItem();

    /**
     * The delegate for the tool picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native PKToolPickerDelegate delegate();

    /**
     * Returns a new `PKToolPicker` instance with the given picker items.
     * 
     * @param items the items in desired order that are used to set up the picker. At least one item is required.
     *              If `items` contains tools with the same identifier, only the first item is used to create the
     *              picker.
     * 
     *              API-Since: 18.0
     */
    @Generated
    @Selector("initWithToolItems:")
    public native PKToolPicker initWithToolItems(@NotNull NSArray<? extends PKToolPickerItem> items);

    /**
     * The currently selected tool item.
     * Updating this property will select the tool with the matching identifier without altering the item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("selectedToolItem")
    @NotNull
    public native PKToolPickerItem selectedToolItem();

    /**
     * The identifier of the selected tool item.
     * Setting it to an identifier without a matching item in this picker has no effect.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("selectedToolItemIdentifier")
    @NotNull
    public native String selectedToolItemIdentifier();

    /**
     * If this is non-nil, the tool picker will display this item when the tool picker is displayed in supported
     * expanded configurations.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAccessoryItem:")
    public native void setAccessoryItem(@Nullable UIBarButtonItem value);

    /**
     * The delegate for the tool picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable PKToolPickerDelegate value);

    /**
     * The delegate for the tool picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable PKToolPickerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The currently selected tool item.
     * Updating this property will select the tool with the matching identifier without altering the item.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSelectedToolItem:")
    public native void setSelectedToolItem(@NotNull PKToolPickerItem value);

    /**
     * The identifier of the selected tool item.
     * Setting it to an identifier without a matching item in this picker has no effect.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSelectedToolItemIdentifier:")
    public native void setSelectedToolItemIdentifier(@NotNull String value);

    /**
     * All tool items within the picker.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("toolItems")
    @NotNull
    public native NSArray<? extends PKToolPickerItem> toolItems();
}
