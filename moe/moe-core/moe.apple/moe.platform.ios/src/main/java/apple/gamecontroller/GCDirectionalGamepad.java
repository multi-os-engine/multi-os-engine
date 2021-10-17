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
 * Directional Gamepad profile.
 * <p>
 * All controller profiles provide a base level of information about the controller they belong to. A directional gamepad
 * features a subset of the possible inputs on a micro gamepad. It guarantees:
 * - The gamepad does not support motion, meaning
 * - -[GCController motion] is always nil
 * - -[GCDirectionalGamepad allowsRotation] is always NO
 * <p>
 * Additionally, the gamepad may have a digital or analog dpad.
 * - -[GCDirectionalGamepad dpad].analog may be YES or NO
 * - If -[GCDirectionalGamepad dpad].analog is NO, then -[GCDirectionalGamepad reportsAbsoluteDpadValues] is always YES
 * <p>
 * A profile maps the hardware notion of a controller into a logical controller. One that a developer can design for
 * and depend on, no matter the underlying hardware. If your game supports GCMicroGamepad, but does not need
 * the motion and analog dpad functionality of GCMicroGamepad, be sure to add Directional Gamepad to your project's
 * supported Game Controller capabilities.
 * <p>
 * [@note] If you want to use the additional functionality of GCDirectionalGamepad, you should set GCSupportsMultipleMicroGamepads to YES and handle microgamepad connections separately.
 * <p>
 * [@note] This profile represents the 2021 2nd generation Siri Remote. Make sure you set GCSupportsMultipleMicroGamepads to YES to properly support the remote.
 *
 * @see GCMicroGamepad
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCDirectionalGamepad extends GCMicroGamepad {
    static {
        NatJ.register();
    }

    @Generated
    protected GCDirectionalGamepad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCDirectionalGamepad alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native GCDirectionalGamepad allocWithZone(VoidPtr zone);

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
    public native GCDirectionalGamepad init();

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
    public static native GCDirectionalGamepad new_objc();

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
}
