package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@c] UITextCursorDropPositionAnimator
 * 
 * Provides a mechanism for displaying and animating a temporary text cursor to indicate a drop location.
 * 
 * For custom text view implementations that implement drag and drop functionality, use this animator providing either
 * your own UITextCursorView
 * implementation or a concrete implementation to indicate at which point in your document the dropped item will be
 * inserted. Using this animator provides
 * you with all of the default system animations for how the text cursor would behave.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITextCursorDropPositionAnimator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UITextCursorDropPositionAnimator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITextCursorDropPositionAnimator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UITextCursorDropPositionAnimator allocWithZone(VoidPtr zone);

    /**
     * Optionally, provide an animation block or completion block to run alongside cursor appearance or position update
     * animations.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("animateAlongsideChanges:completion:")
    public native void animateAlongsideChangesCompletion(
            @ObjCBlock(name = "call_animateAlongsideChangesCompletion_0") @Nullable Block_animateAlongsideChangesCompletion_0 animation,
            @ObjCBlock(name = "call_animateAlongsideChangesCompletion_1") @Nullable Block_animateAlongsideChangesCompletion_1 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideChangesCompletion_0 {
        @Generated
        void call_animateAlongsideChangesCompletion_0();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideChangesCompletion_1 {
        @Generated
        void call_animateAlongsideChangesCompletion_1();
    }

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
     * The cursor view to be animated.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("cursorView")
    public native UIView cursorView();

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
    public native UITextCursorDropPositionAnimator init();

    /**
     * Creates an animator for the given text cursor view implementation, and the document object that implements the
     * UITextInput protocol.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithTextCursorView:textInput:")
    public native UITextCursorDropPositionAnimator initWithTextCursorViewTextInput(UIView cursorView, UIView textInput);

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
    public static native UITextCursorDropPositionAnimator new_objc();

    /**
     * Controls the placement of the cursor, using @c textInput and @c position to compute the final frame for the
     * cursor view.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("placeCursorAtPosition:animated:")
    public native void placeCursorAtPositionAnimated(UITextPosition position, boolean animated);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Controls the visibility of the cursor.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setCursorVisible:animated:")
    public native void setCursorVisibleAnimated(boolean visible, boolean animated);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The object that implements the UITextInput protocol, used to query for geometry information regarding cursor
     * placement.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("textInput")
    public native UIView textInput();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}