package apple.apptrackingtransparency;

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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("AppTrackingTransparency")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ATTrackingManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ATTrackingManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ATTrackingManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ATTrackingManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ATTrackingManager init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native ATTrackingManager new_objc();

    /**
     * requestTrackingAuthorizationWithCompletionHandler:completion:
     * 
     * Request user tracking authorization with a completion handler returning the user's authorization status.
     * Users are able to grant or deny developers tracking privileges on a per-app basis.
     * This method allows developers to determine if access has been granted. On first use, this method will prompt the
     * user to grant or deny access.
     * 
     * The completion handler will be called with the result of the user's decision for granting or denying permission
     * to use application tracking.
     * The completion handler will be called immediately if access to request authorization is restricted.
     */
    @Generated
    @Selector("requestTrackingAuthorizationWithCompletionHandler:")
    public static native void requestTrackingAuthorizationWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_requestTrackingAuthorizationWithCompletionHandler") Block_requestTrackingAuthorizationWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTrackingAuthorizationWithCompletionHandler {
        @Generated
        void call_requestTrackingAuthorizationWithCompletionHandler(@NUInt long status);
    }

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

    /**
     * [@property] trackingAuthorizationStatus
     * 
     * Returns information about your application’s tracking authorization status.
     * Users are able to grant or deny developers tracking privileges on a per-app basis.
     * Application developers must call `requestTrackingAuthorizationWithCompletionHandler:` for the ability to track
     * users.
     * 
     * @return
     *         The current authorization status. If the user has not yet been prompted to approve access, the return
     *         value will either be
     *         ATTrackingManagerAuthorizationStatusNotDetermined, or ATTrackingManagerAuthorizationStatusRestricted if
     *         this value is managed.
     *         Once the user has been prompted, the return value will be either
     *         ATTrackingManagerAuthorizationStatusDenied or ATTrackingManagerAuthorizationStatusAuthorized.
     */
    @Generated
    @Selector("trackingAuthorizationStatus")
    @NUInt
    public static native long trackingAuthorizationStatus();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
