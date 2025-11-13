package apple.touchcontroller;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.GCController;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLRenderCommandEncoder;
import apple.touchcontroller.protocol.TCControl;
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
 * An object that allows you to create and customize on-screen touch controls for a game that uses Metal.
 * 
 * The controller exposes controls through a <doc://com.apple.documentation/documentation/gamecontroller/gccontroller>
 * instance, and enables seamless integration with the <doc://com.apple.documentation/documentation/gamecontroller>
 * framework.
 * 
 * This class manages the lifecycle of touch controls, handles user interaction, renders the controls using Metal,
 * and provides a `GCController` instance that reflects the state of the on-screen controls.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCTouchController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TCTouchController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Creates a new button control with the provided descriptor, and adds it to the touch controller.
     * 
     * - Parameters:
     * - descriptor: The `TCButtonDescriptor` containing the configuration for the button.
     * - Returns: A new `TCButton` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addButtonWithDescriptor:")
    @NotNull
    public native TCButton addButtonWithDescriptor(@NotNull TCButtonDescriptor descriptor);

    /**
     * Creates a new direction pad control with the provided descriptor, and adds it to the touch controller.
     * 
     * - Parameters:
     * - descriptor: The `TCDirectionPadDescriptor` containing the configuration for the direction pad.
     * - Returns: A new `TCDirectionPad` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addDirectionPadWithDescriptor:")
    @NotNull
    public native TCDirectionPad addDirectionPadWithDescriptor(@NotNull TCDirectionPadDescriptor descriptor);

    /**
     * Creates a new switch control with the provided descriptor, and adds it to the touch controller.
     * 
     * - Parameters:
     * - descriptor: The `TCSwitchDescriptor` containing the configuration for the switch.
     * - Returns: A new `TCSwitch` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addSwitchWithDescriptor:")
    @NotNull
    public native TCSwitch addSwitchWithDescriptor(@NotNull TCSwitchDescriptor descriptor);

    /**
     * Creates a new throttle control with the provided descriptor, and adds it to the touch controller.
     * 
     * - Parameters:
     * - descriptor: The `TCThrottleDescriptor` containing the configuration for the throttle.
     * - Returns: A new `TCThrottle` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addThrottleWithDescriptor:")
    @NotNull
    public native TCThrottle addThrottleWithDescriptor(@NotNull TCThrottleDescriptor descriptor);

    /**
     * Creates a new thumbstick control with the provided descriptor, and adds it to the touch controller.
     * 
     * - Parameters:
     * - descriptor: The `TCThumbstickDescriptor` containing the configuration for the thumbstick.
     * - Returns: A new `TCThumbstick` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addThumbstickWithDescriptor:")
    @NotNull
    public native TCThumbstick addThumbstickWithDescriptor(@NotNull TCThumbstickDescriptor descriptor);

    /**
     * Creates a new touchpad control with the provided descriptor, and adds it to the touch controller.
     * 
     * - Parameters:
     * - descriptor: The `TCTouchpadDescriptor` containing the configuration for the touchpad.
     * - Returns: A new `TCTouchpad` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addTouchpadWithDescriptor:")
    @NotNull
    public native TCTouchpad addTouchpadWithDescriptor(@NotNull TCTouchpadDescriptor descriptor);

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCTouchController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCTouchController allocWithZone(VoidPtr zone);

    /**
     * Automatically lays out the provided control labels, creating them if needed.
     * 
     * - Parameters:
     * - labels: An array of `TCControlLabel` objects to be laid out.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("automaticallyLayoutControlsForLabels:")
    public native void automaticallyLayoutControlsForLabels(@NotNull NSArray<? extends TCControlLabel> labels);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * An array containing all the button controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttons")
    @NotNull
    public native NSArray<? extends TCButton> buttons();

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
     * Connects the touch controller to the app, allowing its controls to be drawn and an associated `GCController` to
     * be created.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("connect")
    public native void connect();

    /**
     * The control at the specified point, if any.
     * 
     * - Parameters:
     * - point: The point to check for a control.
     * - Returns: The control at the specified point, or `nil` if no control is found.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controlAtPoint:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native TCControl controlAtPoint(@ByValue CGPoint point);

    /**
     * The game controller instance associated with this touch controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controller")
    @NotNull
    public native GCController controller();

    /**
     * An array containing all the touch controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("controls")
    @NotNull
    public native NSArray<?> controls();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The Metal device the touch control uses for rendering the touch controls.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native MTLDevice device();

    /**
     * An array containing all the direction pad controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("directionPads")
    @NotNull
    public native NSArray<? extends TCDirectionPad> directionPads();

    /**
     * Disconnects the touch controller from the app, preventing its controls from being drawn.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("disconnect")
    public native void disconnect();

    /**
     * The size of the drawable to which the touch controller's contents be drawn, in native pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("drawableSize")
    @ByValue
    public native CGSize drawableSize();

    /**
     * Handles a touch began event at the specified point.
     * 
     * - Parameters:
     * - point: The point where the touch began.
     * - index: An integer representing a unique index for the touch
     * - Returns: `YES` if the touch was handled by a control; otherwise `NO`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("handleTouchBeganAtPoint:index:")
    public native boolean handleTouchBeganAtPointIndex(@ByValue CGPoint point, @NInt long index);

    /**
     * Handles a touch ended event at the specified point.
     * 
     * - Parameters:
     * - point: The point where the touch ended.
     * - index: An integer representing a unique index for the touch
     * - Returns: `YES` if the touch was handled by a control, `NO` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("handleTouchEndedAtPoint:index:")
    public native boolean handleTouchEndedAtPointIndex(@ByValue CGPoint point, @NInt long index);

    /**
     * Handles a touch moved event at the specified point.
     * 
     * - Parameters:
     * - point: The point where the touch moved to.
     * - index: An integer representing a unique index for the touch
     * - Returns: `YES` if the touch was handled by a control, `NO` otherwise.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("handleTouchMovedAtPoint:index:")
    public native boolean handleTouchMovedAtPointIndex(@ByValue CGPoint point, @NInt long index);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TCTouchController init();

    /**
     * Creates a new instance with the provided descriptor.
     * 
     * - Parameters:
     * - descriptor: The `TCTouchControllerDescriptor` containing the configuration for the touch controller.
     * - Returns: A new `TCTouchController` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithDescriptor:")
    public native TCTouchController initWithDescriptor(@NotNull TCTouchControllerDescriptor descriptor);

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
     * A Boolean value that indicates whether the touch controller is connected to the Game Controller framework.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isConnected")
    public native boolean isConnected();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Whether touch controllers are supported for the device.
     * 
     * Attempting to create a touch controller on an unsupported device will result in a fatal error.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native TCTouchController new_objc();

    /**
     * Removes all controls from the touch controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeAllControls")
    public native void removeAllControls();

    /**
     * Removes the control from the touch controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeControl:")
    public native void removeControl(@Mapped(ObjCObjectMapper.class) @NotNull TCControl control);

    /**
     * Renders the touch controls using the provided Metal render command encoder.
     * 
     * - Parameters:
     * - encoder: The `MTLRenderCommandEncoder` to use for rendering.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("renderUsingRenderCommandEncoder:")
    public native void renderUsingRenderCommandEncoder(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLRenderCommandEncoder encoder);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The size of the drawable to which the touch controller's contents be drawn, in native pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDrawableSize:")
    public native void setDrawableSize(@ByValue CGSize value);

    /**
     * The size of the view the touch controller's drawable is embedded in, in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The size of the view the touch controller's drawable is embedded in, in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * An array containing all the switch controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("switches")
    @NotNull
    public native NSArray<? extends TCSwitch> switches();

    /**
     * An array containing all the throttle controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("throttles")
    @NotNull
    public native NSArray<? extends TCThrottle> throttles();

    /**
     * An array containing all the thumbstick controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("thumbsticks")
    @NotNull
    public native NSArray<? extends TCThumbstick> thumbsticks();

    /**
     * An array containing all the touchpad controls managed by this controller.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("touchpads")
    @NotNull
    public native NSArray<? extends TCTouchpad> touchpads();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}