package apple.localauthentication;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * API-Since: 18.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LAEnvironmentMechanismBiometry extends LAEnvironmentMechanism {
    static {
        NatJ.register();
    }

    @Generated
    protected LAEnvironmentMechanismBiometry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LAEnvironmentMechanismBiometry alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LAEnvironmentMechanismBiometry allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Type of biometry supported by the device.
     * 
     * This property does not indicate whether biometry is available or not. It always reads the type of biometry
     * supported by device hardware. You should check @c isUsable property to see if it is available for use.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("biometryType")
    @NInt
    public native long biometryType();

    /**
     * Whether the built in biometric sensor is inaccessible in the current configuration, preventing the use of
     * biometry.
     * 
     * Currently, the only example of this is a Clamshell Mode on macOS. The user will be not able to use Touch ID
     * if the MacBook lid is closed while connected to external monitor and keyboard, unless the external keyboard
     * has Touch ID.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("builtInSensorInaccessible")
    public native boolean builtInSensorInaccessible();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native LAEnvironmentMechanismBiometry init();

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
     * Whether the user has enrolled this biometry.
     * 
     * Even if biometry is enrolled, it does not necessarily mean that it can be used. You should check @c isUsable
     * property to see if it is available for use.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isEnrolled")
    public native boolean isEnrolled();

    /**
     * Whether biometry is locked out.
     * 
     * The system might lock the user out of biometry for various reasons. For example, with Face ID, the user is
     * locked out after 5 failed match attempts in row. To recover from bio lockout, users need to enter their passcode
     * (e.g. during device ulock).
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isLockedOut")
    public native boolean isLockedOut();

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
    public static native LAEnvironmentMechanismBiometry new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The application specific state of the biometric enrollment as returned by @c
     * LAContext.domainState.biometry.stateHash
     * 
     * This value represents the state of the enrollment and changes whenever the biometric enrollment is changed.
     * It does not directly map to the enrolled templates, e.g. if a finger is added to Touch ID enrollement and then
     * removed, the final state would be different.
     * It also returns different values to different apps to prevent tracking of user identity.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stateHash")
    @NotNull
    public native NSData stateHash();

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