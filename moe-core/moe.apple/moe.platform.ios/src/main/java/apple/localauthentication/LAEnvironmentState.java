package apple.localauthentication;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * API-Since: 18.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LAEnvironmentState extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected LAEnvironmentState(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Information about all authentication mechanisms.
     * 
     * This property aggregates @c biometry, @c userPassword, @c companions and any future
     * authentication mechanisms.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allMechanisms")
    @NotNull
    public native NSArray<? extends LAEnvironmentMechanism> allMechanisms();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LAEnvironmentState alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LAEnvironmentState allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Information about biometric authentication (Touch ID, Face ID or Optic ID).
     * 
     * [@c] nil if biometry is not supported by this device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("biometry")
    @Nullable
    public native LAEnvironmentMechanismBiometry biometry();

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
     * Companion authentication mechanisms.
     * 
     * Companion mechanisms such as Apple Watch can appear and disappear as they get in and out of reach, but
     * this property enumerates paired companions, even if they are not reachable at the moment. Check @c isUsable
     * property to determine if a particular companion type is available for use.
     * Note that items in this array represent paired companion types, not individual devices. Therefore, even if the
     * user
     * has paired multiple Apple Watch devices for companion authentication, the array will contain only one
     * [@c] LAEnvironmentMechanimsCompanion instance of type @c LACompanionTypeWatch.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("companions")
    @NotNull
    public native NSArray<? extends LAEnvironmentMechanismCompanion> companions();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    public native LAEnvironmentState init();

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
    public static native LAEnvironmentState new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Information about local user password (on macOS) or passcode (on embedded platforms).
     * 
     * [@c] nil if user password or passcode is not supported by this device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("userPassword")
    @Nullable
    public native LAEnvironmentMechanismUserPassword userPassword();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}