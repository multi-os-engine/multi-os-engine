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
 * An object that registers handlers to respond to capture events from system hardware buttons.
 * 
 * The system Camera app allows people to perform capture functions by pressing hardware buttons on their iOS device.
 * UIKit apps can add similar functionality by using this type to register handlers that respond to interactions from
 * device hardware.
 * 
 * > Note:
 * > In SwiftUI, respond to capture events from hardware buttons using
 * <doc://com.apple.documentation/documentation/swiftui/view/oncameracaptureevent(isenabled:action:)> and
 * <doc://com.apple.documentation/documentation/swiftui/view/oncameracaptureevent(isenabled:primaryaction:secondaryaction:)>
 * instead.
 * 
 * The following example shows how to add a handler that captures a photo when a user presses a hardware button on their
 * device.
 * 
 * ```swift
 * class CameraViewController: UIViewController {
 * 
 * /// An object that manages the camera functionality.
 * private let camera = CameraModel()
 * 
 * /// A capture event interaction to handle hardware button presses.
 * private var eventInteraction: AVCaptureEventInteraction?
 * 
 * override func viewDidLoad() {
 * super.viewDidLoad()
 * // Configure the app to take a photo on hardware button press.
 * configureHardwareInteraction()
 * }
 * 
 * private func configureHardwareInteraction() {
 * // Create a new capture event interaction with a handler that captures a photo.
 * let interaction = AVCaptureEventInteraction { [weak self] event in
 * // Capture a photo on "press up" of a hardware button.
 * if event.phase == .ended {
 * self?.camera.capturePhoto()
 * }
 * }
 * // Add the interaction to the view controller's view.
 * view.addInteraction(interaction)
 * eventInteraction = interaction
 * }
 * }
 * ```
 * 
 * 
 * The event handler queries the capture event to determine its phase, and when the interaction ends, captures a photo.
 * 
 * > Important:
 * > You can only use this API for capture use cases. The system sends capture events only to apps that actively use the
 * camera. Backgrounded capture apps, and apps not performing capture, don't receive events.
 * >
 * > Adopting this API overrides default hardware button behavior, so apps must always respond appropriately to any
 * events received. Failing to handle events results in a nonfunctional button that provides a poor user experience. If
 * your app is temporarily unable to handle events, disable the interaction by setting its ``isEnabled`` property to
 * `false`, which restores the system button behavior.
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
     * Creates a capture event interaction with a handler that responds to presses of hardware buttons.
     * 
     * - Parameter handler: An event handler the system calls when a person performs a primary or secondary capture
     * event.
     * 
     * API-Since: 17.2
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
     * Creates a capture event interaction with handlers that respond independently to presses of hardware buttons.
     * 
     * - Parameter primaryHandler: An event handler the system calls when a person performs a primary capture event.
     * - Parameter secondaryHandler: An event handler the system calls when a person performs a secondary capture event.
     * 
     * API-Since: 17.2
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
     * A Boolean value that indicates whether this capture event interaction is in an enabled state.
     * 
     * Set this value to `false` when your app can’t or won’t respond to the action callbacks to avoid non-interactive
     * buttons or UI elements.
     * 
     * API-Since: 17.2
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
     * A Boolean value that indicates whether this capture event interaction is in an enabled state.
     * 
     * Set this value to `false` when your app can’t or won’t respond to the action callbacks to avoid non-interactive
     * buttons or UI elements.
     * 
     * API-Since: 17.2
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

    /**
     * A Boolean value that indicates whether the default sound is in a disabled state.
     * 
     * If `true`, you must handle sound playback for capture events manually using the ``AVCaptureEvent/playSound:``
     * method.
     * 
     * > Important: To use AirPods Camera Control, it must be available in your country or region. AirPods Camera
     * Control is not currently available in the European Union.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("defaultCaptureSoundDisabled")
    public static native boolean defaultCaptureSoundDisabled();

    /**
     * A Boolean value that indicates whether the default sound is in a disabled state.
     * 
     * If `true`, you must handle sound playback for capture events manually using the ``AVCaptureEvent/playSound:``
     * method.
     * 
     * > Important: To use AirPods Camera Control, it must be available in your country or region. AirPods Camera
     * Control is not currently available in the European Union.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDefaultCaptureSoundDisabled:")
    public static native void setDefaultCaptureSoundDisabled(boolean value);
}