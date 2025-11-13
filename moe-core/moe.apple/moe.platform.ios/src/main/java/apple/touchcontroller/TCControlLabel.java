package apple.touchcontroller;

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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A label you associate with a touch control and provides a semantic description.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCControlLabel extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TCControlLabel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCControlLabel alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCControlLabel allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Creates a pre-configured label for the "A" button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonA")
    @NotNull
    public static native TCControlLabel buttonA();

    /**
     * Creates a pre-configured label for the "B" button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonB")
    @NotNull
    public static native TCControlLabel buttonB();

    /**
     * Creates a pre-configured label for the left shoulder button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonLeftShoulder")
    @NotNull
    public static native TCControlLabel buttonLeftShoulder();

    /**
     * Creates a pre-configured label for the left trigger button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonLeftTrigger")
    @NotNull
    public static native TCControlLabel buttonLeftTrigger();

    /**
     * Creates a pre-configured label for the "Menu" button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonMenu")
    @NotNull
    public static native TCControlLabel buttonMenu();

    /**
     * Creates a pre-configured label for the "Options" button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonOptions")
    @NotNull
    public static native TCControlLabel buttonOptions();

    /**
     * Creates a pre-configured label for the right shoulder button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonRightShoulder")
    @NotNull
    public static native TCControlLabel buttonRightShoulder();

    /**
     * Creates a pre-configured label for the right trigger button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonRightTrigger")
    @NotNull
    public static native TCControlLabel buttonRightTrigger();

    /**
     * Creates a pre-configured label for the "X" button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonX")
    @NotNull
    public static native TCControlLabel buttonX();

    /**
     * Creates a pre-configured label for the "Y" button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buttonY")
    @NotNull
    public static native TCControlLabel buttonY();

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

    /**
     * Creates a pre-configured label for the direction pad.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("directionPad")
    @NotNull
    public static native TCControlLabel directionPad();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TCControlLabel init();

    /**
     * Creates a new instance with the provided name and type.
     * 
     * - Parameters:
     * - name: The name of the control label. Corresponds to the input name on the game controller's physical input
     * profile.
     * - role: The role of the control label. Corresponds to the type of the `GCControllerElement`on the `GCController`.
     * - Returns: A new `TCControlLabel` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithName:role:")
    public native TCControlLabel initWithNameRole(@NotNull String name, @NInt long role);

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

    /**
     * Creates a pre-configured label for the left thumbstick.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("leftThumbstick")
    @NotNull
    public static native TCControlLabel leftThumbstick();

    /**
     * Creates a pre-configured label for the left thumbstick button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("leftThumbstickButton")
    @NotNull
    public static native TCControlLabel leftThumbstickButton();

    /**
     * The name of the control label that you use for lookup on a game controller instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native TCControlLabel new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Creates a pre-configured label for the right thumbstick.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rightThumbstick")
    @NotNull
    public static native TCControlLabel rightThumbstick();

    /**
     * Creates a pre-configured label for the right thumbstick button.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("rightThumbstickButton")
    @NotNull
    public static native TCControlLabel rightThumbstickButton();

    /**
     * The type of the control label.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("role")
    @NInt
    public native long role();

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