package apple.localauthentication;

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
 * Builds requirements that can be used for protecting a @c LARight
 * 
 * API-Since: 16.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LAAuthenticationRequirement extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LAAuthenticationRequirement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LAAuthenticationRequirement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LAAuthenticationRequirement allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Requires user authentication with the current biometric set
     * 
     * The authorization will fail if:
     * [@li] • Biometry is not available in the current device
     * [@li] • There are no biometric enrollments
     * [@li] • There is a change in the enrollment database -e.g a new TouchID finger is enrolled.
     * 
     * @return @c LAAuthenticationRequirement instance
     */
    @Generated
    @Selector("biometryCurrentSetRequirement")
    public static native LAAuthenticationRequirement biometryCurrentSetRequirement();

    /**
     * Requires biometric authentication
     * 
     * The authorization will fail if:
     * [@li] • Biometry is not available in the current device
     * [@li] • There are no biometric enrollments
     * 
     * @return @c LAAuthenticationRequirement instance
     */
    @Generated
    @Selector("biometryRequirement")
    public static native LAAuthenticationRequirement biometryRequirement();

    /**
     * Requires biometric authentication or the given fallback method.
     * 
     * @param fallback Fallback used in case biometry authentication fails, is not available or
     *                 not preferred by the user.
     * @return @c LAAuthenticationRequirement instance
     */
    @Generated
    @Selector("biometryRequirementWithFallback:")
    public static native LAAuthenticationRequirement biometryRequirementWithFallback(
            LABiometryFallbackRequirement fallback);

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

    /**
     * Requires user authentication
     * 
     * @return @c LAAuthenticationRequirement instance
     */
    @Generated
    @Selector("defaultRequirement")
    public static native LAAuthenticationRequirement defaultRequirement();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native LAAuthenticationRequirement init();

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
    public static native LAAuthenticationRequirement new_objc();

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