package apple.safetykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.safetykit.protocol.SACrashDetectionDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SACrashDetectionManager
 * 
 * Use SACrashDetectionManager to receive information about Vehicular Crash Detection events.
 * Not all phone models support Crash Detection, check for availability before creating an instance of
 * SACrashDetectionManager.
 * Set the delegate immediately after creating an instance of SACrashDetectionManager. Creating multiple instances of
 * SACrashDetectionManager is not supported and should be avoided.
 * 
 * SACrashDetectionManager requires an entitlement from Apple. To apply for the entitlement, see Crash Detection
 * Entitlement Request.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SafetyKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SACrashDetectionManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SACrashDetectionManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SACrashDetectionManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native SACrashDetectionManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * 
     * Returns a value indicating whether the user has authorized the app to receive Crash Detection updates
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public native long authorizationStatus();

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

    /**
     * delegate
     * 
     * The delegate object to receive Crash Detection events.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native SACrashDetectionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SACrashDetectionManager init();

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
     * available
     * 
     * Returns a value indicating whether the current device supports Crash Detection.
     */
    @Generated
    @Selector("isAvailable")
    public static native boolean isAvailable();

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
    public static native SACrashDetectionManager new_objc();

    /**
     * Requests the user’s permission to access Crash Detection information.
     * 
     * @param handler
     *                Completion handler invoked with the status of the authorization request.
     */
    @Generated
    @Selector("requestAuthorizationWithCompletionHandler:")
    public native void requestAuthorizationWithCompletionHandler(
            @ObjCBlock(name = "call_requestAuthorizationWithCompletionHandler") @NotNull Block_requestAuthorizationWithCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationWithCompletionHandler {
        @Generated
        void call_requestAuthorizationWithCompletionHandler(@NInt long status, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * delegate
     * 
     * The delegate object to receive Crash Detection events.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable SACrashDetectionDelegate value);

    /**
     * delegate
     * 
     * The delegate object to receive Crash Detection events.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable SACrashDetectionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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