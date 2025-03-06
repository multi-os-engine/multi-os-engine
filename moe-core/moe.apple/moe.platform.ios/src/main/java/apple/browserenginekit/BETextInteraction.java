package apple.browserenginekit;

import apple.NSObject;
import apple.browserenginekit.protocol.BETextInteractionDelegate;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.struct.NSRange;
import apple.uikit.UIContextMenuInteraction;
import apple.uikit.UITextSelectionDisplayInteraction;
import apple.uikit.UIView;
import apple.uikit.protocol.UIContextMenuInteractionDelegate;
import apple.uikit.protocol.UIInteraction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BETextInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected BETextInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Presents a sheet to add a text replacement shortcut to the keyboard dictionary
     * 
     * Generally used for IME languages, such as Chinese/Japanese
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("addShortcutForText:fromRect:")
    public native void addShortcutForTextFromRect(@NotNull String text, @ByValue CGRect presentationRect);

    @Generated
    @Owned
    @Selector("alloc")
    public static native BETextInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BETextInteraction allocWithZone(VoidPtr zone);

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

    /**
     * Returns a UIContextMenuInteraction object whose delegate methods will be invoked
     * on `contextMenuInteractionDelegate`
     */
    @Generated
    @Selector("contextMenuInteraction")
    @NotNull
    public native UIContextMenuInteraction contextMenuInteraction();

    /**
     * Set a delegate to receive callbacks for the context menu interaction
     */
    @Generated
    @Selector("contextMenuInteractionDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UIContextMenuInteractionDelegate contextMenuInteractionDelegate();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Assign a delegate to this object to receive callback information
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native BETextInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    /**
     * Dismisses an edit menu for the current text selection
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("dismissEditMenuForSelection")
    public native void dismissEditMenuForSelection();

    /**
     * Tells the system that the document's editability status has changed.
     * 
     * In response, the system refreshes the text interaction gestures, depending on the value of `isEditable`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("editabilityChanged")
    public native void editabilityChanged();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BETextInteraction init();

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
    public static native BETextInteraction new_objc();

    /**
     * Presents an edit menu for the current text selection
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("presentEditMenuForSelection")
    public native void presentEditMenuForSelection();

    /**
     * Tells the system to refresh the keyboard UI.
     * 
     * This lightweight method refreshes the selection UI. For example, this could be invoked in response to
     * programmatic text selection changes, independent of text interaction gestures
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("refreshKeyboardUI")
    public native void refreshKeyboardUI();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Tells the system the selection adjustment has been handled for the given `point` and touch
     * 
     * Should be invoked in response to:
     * -[BETextInput adjustSelectionBoundaryToPoint:touchPhase:baseIsStart:flags:]
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectionBoundaryAdjustedToPoint:touchPhase:flags:")
    public native void selectionBoundaryAdjustedToPointTouchPhaseFlags(@ByValue CGPoint point, @NInt long touch,
            @NUInt long flags);

    /**
     * Tells the system that the selection change has been handled for the given `point` and gesture.
     * 
     * Should be invoked in response to:
     * -[BETextInput updateCurrentSelectionTo:fromGesture:inState:]
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("selectionChangedWithGestureAtPoint:gesture:state:flags:")
    public native void selectionChangedWithGestureAtPointGestureStateFlags(@ByValue CGPoint point,
            @NInt long gestureType, @NInt long gestureState, @NUInt long flags);

    /**
     * Set a delegate to receive callbacks for the context menu interaction
     */
    @Generated
    @Selector("setContextMenuInteractionDelegate:")
    public native void setContextMenuInteractionDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) @Nullable UIContextMenuInteractionDelegate value);

    /**
     * Set a delegate to receive callbacks for the context menu interaction
     */
    @Generated
    public void setContextMenuInteractionDelegate(
            @Mapped(ObjCObjectMapper.class) @Nullable UIContextMenuInteractionDelegate value) {
        Object __old = contextMenuInteractionDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setContextMenuInteractionDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Assign a delegate to this object to receive callback information
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable BETextInteractionDelegate value);

    /**
     * Assign a delegate to this object to receive callback information
     * 
     * API-Since: 17.4
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable BETextInteractionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Presents a share sheet for the `text` positioned relative to the `presentationRect`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("shareText:fromRect:")
    public native void shareTextFromRect(@NotNull String text, @ByValue CGRect presentationRect);

    /**
     * Presents a dictionary definition view for the `textWithContext` positioned relative to the `presentationRect`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("showDictionaryForTextInContext:definingTextInRange:fromRect:")
    public native void showDictionaryForTextInContextDefiningTextInRangeFromRect(@NotNull String textWithContext,
            @ByValue NSRange range, @ByValue CGRect presentationRect);

    /**
     * Displays the inline text replacement UI for the current selection.
     * For example, inline text replacements are displayed in response to the "Replace..." option in the edit menu.
     * 
     * Could be invoked when handling `promptForReplace:` action
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("showReplacementsForText:")
    public native void showReplacementsForText(@NotNull String text);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Returns a UITextSelectionDisplayInteraction that manages selection UI
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textSelectionDisplayInteraction")
    @NotNull
    public native UITextSelectionDisplayInteraction textSelectionDisplayInteraction();

    /**
     * Presents a translation view for the `text` positioned relative to the `presentationRect`
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("translateText:fromRect:")
    public native void translateTextFromRect(@NotNull String text, @ByValue CGRect presentationRect);

    /**
     * Converts the text selection between traditional and simplified Chinese
     * 
     * Could be invoked when handling `transliterateChinese` action
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("transliterateChineseForText:")
    public native void transliterateChineseForText(@NotNull String text);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("view")
    @Nullable
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);
}