package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIInteraction;
import apple.uikit.protocol.UITextInput;
import apple.uikit.protocol.UITextSelectionDisplayInteractionDelegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * [@c] UITextSelectionDisplayInteraction
 * 
 * Manages a collection of selection views (cursor, highlight, range adjustment) for a particular UITextInput object.
 * 
 * This is the component that @c UITextInteraction generally talks to in order to accomplish all selection display
 * using a collection of "managed subviews", i.e., selection view components that actually manage the display of the
 * selection
 * and the various affordances for changing the selection.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextSelectionDisplayInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextSelectionDisplayInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextSelectionDisplayInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITextSelectionDisplayInteraction allocWithZone(VoidPtr zone);

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
     * The cursor view (also known as "caret" view). Shown when the selection is not ranged.
     */
    @Generated
    @Selector("cursorView")
    @NotNull
    public native UIView cursorView();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * See @c UITextSelectionDisplayInteractionDelegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UITextSelectionDisplayInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    /**
     * The selection handles, shown adjacent to the highlight view's @c selectionRects when the selection is ranged.
     * 
     * If you are replacing these system-provided handle views with your own, you must provide exactly two handle views,
     * one to be used as the leading handle,
     * and another to be used as the trailing handle.
     */
    @Generated
    @Selector("handleViews")
    @NotNull
    public native NSArray<? extends UIView> handleViews();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The highlight view. This is the blue/tinted highlight drawn behind the rendered text.
     */
    @Generated
    @Selector("highlightView")
    @NotNull
    public native UIView highlightView();

    @Generated
    @Selector("init")
    public native UITextSelectionDisplayInteraction init();

    /**
     * Creates a UITextSelectionDisplayInteractionDelegate for a given object that implements the UITextInput protocol.
     * `textInput` may be the same as the view this interaction is installed onto.
     */
    @Generated
    @Selector("initWithTextInput:delegate:")
    public native UITextSelectionDisplayInteraction initWithTextInputDelegate(
            @Mapped(ObjCObjectMapper.class) @NotNull UITextInput textInput,
            @Mapped(ObjCObjectMapper.class) @NotNull UITextSelectionDisplayInteractionDelegate delegate);

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
     * Controls both the hidden sate of contained selection views as well as interactions that follow.
     */
    @Generated
    @Selector("isActivated")
    public native boolean isActivated();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Loads the selection from `-[UITextInput selectedTextRange]` and applies the selection to all managed subviews.
     */
    @Generated
    @Selector("layoutManagedSubviews")
    public native void layoutManagedSubviews();

    @Generated
    @Owned
    @Selector("new")
    public static native UITextSelectionDisplayInteraction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Controls both the hidden sate of contained selection views as well as interactions that follow.
     */
    @Generated
    @Selector("setActivated:")
    public native void setActivated(boolean value);

    /**
     * The cursor view (also known as "caret" view). Shown when the selection is not ranged.
     */
    @Generated
    @Selector("setCursorView:")
    public native void setCursorView(@NotNull UIView value);

    /**
     * The selection handles, shown adjacent to the highlight view's @c selectionRects when the selection is ranged.
     * 
     * If you are replacing these system-provided handle views with your own, you must provide exactly two handle views,
     * one to be used as the leading handle,
     * and another to be used as the trailing handle.
     */
    @Generated
    @Selector("setHandleViews:")
    public native void setHandleViews(@NotNull NSArray<? extends UIView> value);

    /**
     * The highlight view. This is the blue/tinted highlight drawn behind the rendered text.
     */
    @Generated
    @Selector("setHighlightView:")
    public native void setHighlightView(@NotNull UIView value);

    /**
     * Call this whenever the selection changes, or needs to be re-laid out.
     */
    @Generated
    @Selector("setNeedsSelectionUpdate")
    public native void setNeedsSelectionUpdate();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The object the selection is being managed for.
     */
    @Generated
    @Selector("textInput")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native UITextInput textInput();

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