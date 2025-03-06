package apple.corelocation;

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
 * CLUpdate
 * 
 * Discussion:
 * Contains a possible location and related metadata. Delivered by
 * CLLocationUpdater to its handler block.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLUpdate extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLUpdate(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLUpdate alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CLUpdate allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CLUpdate init();

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
     * isStationary
     * 
     * Discussion:
     * Deprecated. See -stationary.
     * 
     * 
     * API-Since: 17.0
     * Deprecated-Since: 17.0
     */
    @Deprecated
    @Generated
    @Selector("isStationary")
    public native boolean isStationary();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("location")
    @Nullable
    public native CLLocation location();

    @Generated
    @Owned
    @Selector("new")
    public static native CLUpdate new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * accuracyLimited
     * 
     * Discussion:
     * True if further updates will be suspended for some time while the app is
     * subject to accuracy limitation.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("accuracyLimited")
    public native boolean accuracyLimited();

    /**
     * authorizationDenied
     * 
     * Discussion:
     * True if updates will be suspended while the app has been denied
     * location authorization.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationDenied")
    public native boolean authorizationDenied();

    /**
     * authorizationDeniedGlobally
     * 
     * Discussion:
     * True if updates will be suspended while the user has disabled Location
     * Services system-wide.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationDeniedGlobally")
    public native boolean authorizationDeniedGlobally();

    /**
     * authorizationRequestInProgress
     * 
     * Discussion:
     * True if the system is requesting authorization from the user on behalf of the app, but no response has been
     * received yet.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationRequestInProgress")
    public native boolean authorizationRequestInProgress();

    /**
     * authorizationRestricted
     * 
     * Discussion:
     * True if updates will be suspended while the app lacks authorization,
     * and authorization changes are prevented by parental restrictions,
     * MDM configuration, or other factors.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationRestricted")
    public native boolean authorizationRestricted();

    /**
     * insufficientlyInUse
     * 
     * Discussion:
     * True if updates will be suspended while the app is not sufficiently
     * in-use.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("insufficientlyInUse")
    public native boolean insufficientlyInUse();

    /**
     * locationUnavailable
     * 
     * Discussion:
     * True if updates will be suspended while the device's location can no
     * longer be determined.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("locationUnavailable")
    public native boolean locationUnavailable();

    /**
     * serviceSessionRequired
     * 
     * Discussion:
     * True if LocationServices are disabled because the app has adopted CLRequireExplicitServiceSession
     * info.plist key but no CLServiceSession requiring authorization is outstanding yet.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("serviceSessionRequired")
    public native boolean serviceSessionRequired();

    /**
     * stationary
     * 
     * Discussion:
     * Updates may stop flowing temporarily for many reasons such as
     * the app is no longer authorized for locations or if its
     * location becomes unknown. If CoreLocation stops
     * delivering updates because the device is stationary, then
     * stationary will be set to YES. Otherwise it will be NO.
     * 
     * If stationary is YES, then updates may be suspended until
     * the user next moves, or their location becomes unknown.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stationary")
    public native boolean stationary();
}