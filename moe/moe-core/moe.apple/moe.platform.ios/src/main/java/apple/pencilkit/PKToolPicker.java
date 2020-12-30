package apple.pencilkit;

import apple.NSObject;
import apple.coregraphics.struct.CGRect;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A user interface for selecting a PKTool.
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
     */
    @Generated
    @Selector("addObserver:")
    public native void addObserver(@Mapped(ObjCObjectMapper.class) PKToolPickerObserver observer);

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKToolPicker alloc();

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

    /**
     * Set `colorUserInterfaceStyle` to cause this tool picker to create colors for a canvas view of the
     * specified user interface style. If this tool picker is used for selecting tools for canvas views that
     * have different user interface styles, `colorUserInterfaceStyle` should be set to the canvas's user
     * interface style.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
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
     * `CGRectNull` if no rect is obscured, or the tool picker is movable.
     */
    @Generated
    @Selector("frameObscuredInView:")
    @ByValue
    public native CGRect frameObscuredInView(UIView view);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Returns a new `PKToolPicker` instance.
     * 
     * If two tool pickers are visible for the same first responder, or the same tool picker is visible in two windows
     * the result is deterministic, but undefined.
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
     */
    @Generated
    @Selector("isRulerActive")
    public native boolean isRulerActive();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Is the tool picker visible.
     */
    @Generated
    @Selector("isVisible")
    public native boolean isVisible();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Set `overrideUserInterfaceStyle` to cause this tool picker UI to have a specific user interface style.
     * Consider if you need to set `colorUserInterfaceStyle` if you set this property.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
     */
    @Generated
    @Selector("overrideUserInterfaceStyle")
    @NInt
    public native long overrideUserInterfaceStyle();

    /**
     * Remove an observer for a tool picker changes.
     */
    @Generated
    @Selector("removeObserver:")
    public native void removeObserver(@Mapped(ObjCObjectMapper.class) PKToolPickerObserver observer);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The currently selected tool.
     */
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
     */
    @Generated
    @Selector("setColorUserInterfaceStyle:")
    public native void setColorUserInterfaceStyle(@NInt long value);

    /**
     * Set `overrideUserInterfaceStyle` to cause this tool picker UI to have a specific user interface style.
     * Consider if you need to set `colorUserInterfaceStyle` if you set this property.
     * 
     * By default this is `UIUserInterfaceStyleUnspecified`.
     */
    @Generated
    @Selector("setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(@NInt long value);

    /**
     * Is the ruler toggled such that it should be active on canvases.
     */
    @Generated
    @Selector("setRulerActive:")
    public native void setRulerActive(boolean value);

    /**
     * The currently selected tool.
     */
    @Generated
    @Selector("setSelectedTool:")
    public native void setSelectedTool(PKTool value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Sets when this tool picker should be visible.
     * 
     * @param visible  The visible state of this tool picker.
     * @param responder  The first responder for which this visible state applies.
     */
    @Generated
    @Selector("setVisible:forFirstResponder:")
    public native void setVisibleForFirstResponder(boolean visible, UIResponder responder);

    /**
     * Returns the shared `PKToolPicker` instance for a window.
     * The returned tool picker object is typically shared between windows in the same UIWindowScene.
     */
    @Generated
    @Selector("sharedToolPickerForWindow:")
    public static native PKToolPicker sharedToolPickerForWindow(UIWindow window);

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
     */
    @Generated
    @Selector("setShowsDrawingPolicyControls:")
    public native void setShowsDrawingPolicyControls(boolean value);

    /**
     * The name used to automatically save the tool picker's state in the defaults system.
     */
    @Generated
    @Selector("setStateAutosaveName:")
    public native void setStateAutosaveName(String value);

    /**
     * If this is true the tool picker will show UI that allows the default drawing policy to be changed.
     * 
     * By default this is true.
     */
    @Generated
    @Selector("showsDrawingPolicyControls")
    public native boolean showsDrawingPolicyControls();

    /**
     * The name used to automatically save the tool picker's state in the defaults system.
     */
    @Generated
    @Selector("stateAutosaveName")
    public native String stateAutosaveName();
}