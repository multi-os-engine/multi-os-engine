package apple.avkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import apple.uikit.protocol.UIInteraction;
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
 * [@interface] AVCaptureEventInteraction
 * 
 * A UIInteraction used to register actions triggered by system capture events.
 * 
 * Events may or may not be sent to applications based on the current system state. Backgrounded applications will not
 * receive events, additionally events will only be sent to applications that are actively using the camera.
 * AVCaptureEventInteraction should be attached to views in the responder chain.
 * 
 * This API is for media capture use cases only.
 * 
 * API-Since: 17.2
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureEventInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureEventInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureEventInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCaptureEventInteraction allocWithZone(VoidPtr zone);

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
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCaptureEventInteraction init();

    /**
     * initWithEventHandler:
     * [@returns] An AVCaptureEventInteraction.
     * 
     * Initializer for an AVCaptureEventInteraction.
     * 
     * @param handler
     *                An event handler called when either the primary or secondary events are triggered.
     */
    @Generated
    @Selector("initWithEventHandler:")
    public native AVCaptureEventInteraction initWithEventHandler(
            @ObjCBlock(name = "call_initWithEventHandler") @NotNull Block_initWithEventHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithEventHandler {
        @Generated
        void call_initWithEventHandler(@NotNull AVCaptureEvent event);
    }

    /**
     * initWithPrimaryEventHandler:secondaryEventHandler:
     * [@returns] An AVCaptureEventInteraction.
     * 
     * Initializer for an AVCaptureEventInteraction.
     * 
     * @param primaryHandler
     *                         An event handler called when a primary capture event is triggered.
     * @param secondaryHandler
     *                         An event handler called when a secondary capture event is triggered.
     */
    @Generated
    @Selector("initWithPrimaryEventHandler:secondaryEventHandler:")
    public native AVCaptureEventInteraction initWithPrimaryEventHandlerSecondaryEventHandler(
            @ObjCBlock(name = "call_initWithPrimaryEventHandlerSecondaryEventHandler_0") @NotNull Block_initWithPrimaryEventHandlerSecondaryEventHandler_0 primaryHandler,
            @ObjCBlock(name = "call_initWithPrimaryEventHandlerSecondaryEventHandler_1") @NotNull Block_initWithPrimaryEventHandlerSecondaryEventHandler_1 secondaryHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithPrimaryEventHandlerSecondaryEventHandler_0 {
        @Generated
        void call_initWithPrimaryEventHandlerSecondaryEventHandler_0(@NotNull AVCaptureEvent event);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithPrimaryEventHandlerSecondaryEventHandler_1 {
        @Generated
        void call_initWithPrimaryEventHandlerSecondaryEventHandler_1(@NotNull AVCaptureEvent event);
    }

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
     * [@property] enabled
     * 
     * A boolean value indicating whether this capture event interaction is active or not.
     * 
     * Set this value to NO when your application cannot or will not respond to the action callbacks to avoid
     * non-interactive buttons or UI elements.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

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
    public static native AVCaptureEventInteraction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] enabled
     * 
     * A boolean value indicating whether this capture event interaction is active or not.
     * 
     * Set this value to NO when your application cannot or will not respond to the action callbacks to avoid
     * non-interactive buttons or UI elements.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

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

    @Generated
    @Selector("view")
    @Nullable
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);
}