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
 * An object you use to configure additional tasks or animations to
 * run alongside the Writing Tools animations.
 * 
 * When Writing Tools replaces text in one of your context objects,
 * it provides a `UIWritingToolsCoordinator.AnimationParameters` object for
 * you to use to configure any additional animations. During a Writing
 * Tools session, you hide the text under evaluation and provide a
 * targeted preview of your content. Writing Tools animations changes
 * to that preview, but you might need to provide additional animations
 * for other parts of your view’s content. For example, you might
 * need to animate any layout changes caused by the insertion or
 * removal of text in other parts of your view. Use this object to
 * configure those animations.
 * 
 * You don’t create a `UIWritingToolsCoordinator.AnimationParameters`
 * object directly. Instead, the system creates one and passes it to the
 * ``UIWritingToolsCoordinator/writingToolsCoordinator(_:replaceRange:inContext:proposedText:reason:animationParameters:completion:)``
 * method of your ``UIWritingToolsCoordinatorDelegate`` object. Use that
 * object to specify the blocks to run during and after the system animations.
 * 
 * API-Since: 18.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIWritingToolsCoordinatorAnimationParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWritingToolsCoordinatorAnimationParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIWritingToolsCoordinatorAnimationParameters alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIWritingToolsCoordinatorAnimationParameters allocWithZone(VoidPtr zone);

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
     * A custom block to run when the system animations finish.
     * 
     * Set this property to a block that you want the system to run when any
     * animations finish. The block you provide must have no return value
     * and no parameters. The system executes this block once when the current
     * animation finish.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    @Nullable
    public native Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret();
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The number of seconds the system waits before starting its animations.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("delay")
    @NFloat
    public native double delay();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The number of seconds it takes the system animations to run.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("duration")
    @NFloat
    public native double duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIWritingToolsCoordinatorAnimationParameters init();

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
    public static native UIWritingToolsCoordinatorAnimationParameters new_objc();

    /**
     * A custom block that runs at the same time as the system animations.
     * 
     * If you have animations you want to run at the same time as the system
     * animations, assign a block to this property and use it to run your
     * animations. The block you provide must have no return value and take
     * a floating-point value as a parameter. The parameter indicates the
     * current progress of the animations as a percentage value between
     * `0.0` to `1.0`. The system executes your block multiple times during
     * the course of the animations, providing an updated completion value each time.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("progressHandler")
    @ObjCBlock(name = "call_progressHandler_ret")
    @Nullable
    public native Block_progressHandler_ret progressHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_progressHandler_ret {
        @Generated
        void call_progressHandler_ret(float arg0);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A custom block to run when the system animations finish.
     * 
     * Set this property to a block that you want the system to run when any
     * animations finish. The block you provide must have no return value
     * and no parameters. The system executes this block once when the current
     * animation finish.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setCompletionHandler:")
    public native void setCompletionHandler(
            @ObjCBlock(name = "call_setCompletionHandler") @Nullable Block_setCompletionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler();
    }

    /**
     * A custom block that runs at the same time as the system animations.
     * 
     * If you have animations you want to run at the same time as the system
     * animations, assign a block to this property and use it to run your
     * animations. The block you provide must have no return value and take
     * a floating-point value as a parameter. The parameter indicates the
     * current progress of the animations as a percentage value between
     * `0.0` to `1.0`. The system executes your block multiple times during
     * the course of the animations, providing an updated completion value each time.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("setProgressHandler:")
    public native void setProgressHandler(
            @ObjCBlock(name = "call_setProgressHandler") @Nullable Block_setProgressHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setProgressHandler {
        @Generated
        void call_setProgressHandler(float arg0);
    }

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