package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * The GCXboxGamepad profile represents any supported Xbox controller.
 *
 * @see GCExtendedGamepad
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCXboxGamepad extends GCExtendedGamepad {
    static {
        NatJ.register();
    }

    @Generated
    protected GCXboxGamepad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCXboxGamepad alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCXboxGamepad allocWithZone(VoidPtr zone);

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
    public native GCXboxGamepad init();

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native GCXboxGamepad new_objc();

    /**
     * Some Xbox controller variants can support up to four additional buttons.
     * <p>
     * [@example] The standard Bluetooth-enabled Xbox Wireless Controller does not have paddle buttons
     * [@example] The Xbox Elite Wireless Controller has four extra digital buttons.
     * <p>
     * [@note] The four extra digital buttons on the Xbox Elite Wireless Controller are only directly addressable when
     * the controller
     * is on its default mapping profile. Otherwise, the paddle buttons are directly bound to other inputs on the
     * controller.
     */
    @Generated
    @Selector("paddleButton1")
    public native GCControllerButtonInput paddleButton1();

    @Generated
    @Selector("paddleButton2")
    public native GCControllerButtonInput paddleButton2();

    @Generated
    @Selector("paddleButton3")
    public native GCControllerButtonInput paddleButton3();

    @Generated
    @Selector("paddleButton4")
    public native GCControllerButtonInput paddleButton4();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
     * Some Xbox controller variants feature a Share button.
     * <p>
     * [@example] The Bluetooth-enabled Xbox Wireless Controller introduced with the Xbox Series X and Xbox Series S in
     * 2020
     * has a Share button.
     * <p>
     * [@note] The Share button is reserved by the system for screenshot and video recording gestures. If you wish to
     * disable these
     * gestures in your app and take control of the Share button, set buttonShare.preferredSystemGestureState to
     * GCSystemGestureStateDisabled.
     */
    @Generated
    @Selector("buttonShare")
    public native GCControllerButtonInput buttonShare();
}
