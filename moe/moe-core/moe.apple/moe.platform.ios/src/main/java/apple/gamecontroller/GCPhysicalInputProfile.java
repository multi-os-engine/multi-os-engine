package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.protocol.GCDevice;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A game controller profile representing physical buttons, thumbsticks, dpads, etc... on a controller.
 * 
 * All controller profiles provide a base level of information about the controller they belong to.
 * 
 * A profile maps the hardware notion of a controller into a logical controller. One that a developer can design for
 * and depend on, no matter the underlying hardware.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCPhysicalInputProfile extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GCPhysicalInputProfile(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("allAxes")
    public native NSSet<? extends GCControllerAxisInput> allAxes();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("allButtons")
    public native NSSet<? extends GCControllerButtonInput> allButtons();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("allDpads")
    public native NSSet<? extends GCControllerDirectionPad> allDpads();

    /**
     * The following properties allow for dynamic querying of the input elements available on a profile.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("allElements")
    public native NSSet<? extends GCControllerElement> allElements();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCPhysicalInputProfile alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCPhysicalInputProfile allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("axes")
    public native NSDictionary<String, ? extends GCControllerAxisInput> axes();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("buttons")
    public native NSDictionary<String, ? extends GCControllerButtonInput> buttons();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Polls the state vector of the physical input input and saves it to a new and writable instance of
     * GCPhysicalInputProfile.
     * 
     * If your application is heavily multithreaded this may also be useful to guarantee atomicity of input handling as
     * a snapshot will not change based on user input once it is taken.
     * 
     * @see snapshot
     * @return A new physical input profile with the duplicated state vector of the current physical input
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("capture")
    public native GCPhysicalInputProfile capture();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A profile keeps a reference to the device that this profile is mapping input from
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native GCDevice device();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dpads")
    public native NSDictionary<String, ? extends GCControllerDirectionPad> dpads();

    /**
     * The following properties allow for runtime lookup of any input element on a profile, when provided with a valid
     * alias.
     * 
     * [@example] extendedGamepad.elements["Button A"] == extendedGamepad.buttonA // YES
     * [@example] extendedGamepad.dpads["Left Thumbstick"] == extendedGamepad.leftThumbstick // YES
     * [@example] extendedGamepad.dpads["Button B"] // returns nil, "Button B" is not a GCControllerDirectionPad
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("elements")
    public native NSDictionary<String, ? extends GCControllerElement> elements();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GCPhysicalInputProfile init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The last time elements of this profile were updated.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("lastEventTimestamp")
    public native double lastEventTimestamp();

    @Generated
    @Owned
    @Selector("new")
    public static native GCPhysicalInputProfile new_objc();

    /**
     * Profile elements can be accessed using keyed subscript notation, with a valid alias of its inputs.
     * 
     * [@example] extendedGamepad["Button A"] == extendedGamepad.buttonA // YES
     * [@example] microGamepad["Button X"] == microGamepad.buttonX // YES
     * [@note] Equivalent to -elements
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native GCControllerElement objectForKeyedSubscript(@NotNull String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the state vector of the physical input profile to a copy of the passed in physical input profile's state
     * vector.
     * 
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     * 
     * @see GCController.snapshot
     * 
     *      API-Since: 14.0
     */
    @Generated
    @Selector("setStateFromPhysicalInput:")
    public native void setStateFromPhysicalInput(@NotNull GCPhysicalInputProfile physicalInput);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("allTouchpads")
    public native NSSet<? extends GCControllerTouchpad> allTouchpads();

    /**
     * Whether the user has remapped their physical input controls for this profile at the system level.
     * 
     * On iOS and tvOS, users can remap their game controller inputs in Settings.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("hasRemappedElements")
    public native boolean hasRemappedElements();

    /**
     * Returns the primary alias of the GCControllerElement that a given physical input maps to.
     * 
     * If the user were to map a physical press of the A button of their game controller to the B button, then
     * -[GCPhysicalInputProfile mappedElementAliasForPhysicalInputName: GCInputButtonA] would return GCInputButtonB.
     * Note that mappings can change anytime your app is backgrounded, so make sure you update any relevant visuals when
     * returning to foreground.
     * 
     * [@returns] A GCInput string corresponding to the primary alias of the GCControllerElement that a given physical
     * button maps to, or nil if there is no mapping.
     * 
     * API-Since: 15.0
     * 
     * @param inputName A GCInput string corresponding to the physical button you want the mapped element alias for.
     */
    @NotNull
    @Generated
    @Selector("mappedElementAliasForPhysicalInputName:")
    public native String mappedElementAliasForPhysicalInputName(@NotNull String inputName);

    /**
     * Returns a set of GCInput strings corresponding to physical inputs that are mapped to a given GCControllerElement.
     * 
     * If the user mapped the physical press of the A button, the B button, and the X button to the B button, then
     * -[GCPhysicalInputProfile mappedPhysicalInputNamesForElementAlias: GCInputButtonB] would return [GCInputButtonA,
     * GCInputButtonB, GCInputButtonX].
     * Note that mappings can change anytime your app is backgrounded, so make sure you update any relevant visuals when
     * returning to foreground.
     * 
     * [@returns] A set of GCInput strings corresponding to physical inputs that are mapped to a given
     * GCControllerElement, or an empty set if there are no mappings.
     * 
     * API-Since: 15.0
     * 
     * @param elementAlias A GCInput string corresponding to an alias of the GCControllerElement you want the physical
     *                     buttons for.
     */
    @NotNull
    @Generated
    @Selector("mappedPhysicalInputNamesForElementAlias:")
    public native NSSet<String> mappedPhysicalInputNamesForElementAlias(@NotNull String elementAlias);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("touchpads")
    public native NSDictionary<String, ? extends GCControllerTouchpad> touchpads();

    /**
     * Set this block if you want to be notified when a value on a element changed. If multiple elements have changed
     * this block will be called
     * for each element that changed.
     * 
     * @param profile this profile that is being used to map the raw input data into logical values on controller
     *                elements such as the dpad or the buttons.
     * @param element the element that has been modified.
     * 
     *                API-Since: 16.0
     */
    @Generated
    @Selector("setValueDidChangeHandler:")
    public native void setValueDidChangeHandler(
            @Nullable @ObjCBlock(name = "call_setValueDidChangeHandler") Block_setValueDidChangeHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueDidChangeHandler {
        @Generated
        void call_setValueDidChangeHandler(@NotNull GCPhysicalInputProfile arg0, @NotNull GCControllerElement arg1);
    }

    /**
     * Set this block if you want to be notified when a value on a element changed. If multiple elements have changed
     * this block will be called
     * for each element that changed.
     * 
     * @param profile this profile that is being used to map the raw input data into logical values on controller
     *                elements such as the dpad or the buttons.
     * @param element the element that has been modified.
     * 
     *                API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("valueDidChangeHandler")
    @ObjCBlock(name = "call_valueDidChangeHandler_ret")
    public native Block_valueDidChangeHandler_ret valueDidChangeHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueDidChangeHandler_ret {
        @Generated
        void call_valueDidChangeHandler_ret(@NotNull GCPhysicalInputProfile arg0, @NotNull GCControllerElement arg1);
    }
}
