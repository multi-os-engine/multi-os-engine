package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUserActivity;
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
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISceneSessionActivationRequest extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UISceneSessionActivationRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISceneSessionActivationRequest alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UISceneSessionActivationRequest allocWithZone(VoidPtr zone);

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
    public native UISceneSessionActivationRequest init();

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
    public static native UISceneSessionActivationRequest new_objc();

    /**
     * Optional parameters used for further customizing the request.
     */
    @Generated
    @Selector("options")
    @Nullable
    public native UISceneActivationRequestOptions options();

    /**
     * Creates a request for activating a session with the role of `UIWindowSceneSessionRoleApplication`.
     */
    @Generated
    @Selector("request")
    public static native UISceneSessionActivationRequest request();

    /**
     * Creates a request for activating a session with the specified `role`.
     * - Parameter role: The requested scene session role.
     */
    @Generated
    @Selector("requestWithRole:")
    public static native UISceneSessionActivationRequest requestWithRole(@NotNull String role);

    /**
     * Creates a request for activating an existing scene session.
     * - Parameter session: The existing session to activate.
     */
    @Generated
    @Selector("requestWithSession:")
    public static native UISceneSessionActivationRequest requestWithSession(@NotNull UISceneSession session);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The role to request. If the request was created using `requestWithSession:`, this reflects
     * the role of the `session`.
     */
    @Generated
    @Selector("role")
    @NotNull
    public native String role();

    /**
     * The specific scene session that should be activated, if provided when creating the request.
     */
    @Generated
    @Selector("session")
    @Nullable
    public native UISceneSession session();

    /**
     * Optional parameters used for further customizing the request.
     */
    @Generated
    @Selector("setOptions:")
    public native void setOptions(@Nullable UISceneActivationRequestOptions value);

    /**
     * An optional user activity to send to the newly activated scene.
     * 
     * Only sessions with a matching `role` will have their `activationConditions` evaluated
     * against the user activity's `targetContentIdentifier`.
     */
    @Generated
    @Selector("setUserActivity:")
    public native void setUserActivity(@Nullable NSUserActivity value);

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
     * An optional user activity to send to the newly activated scene.
     * 
     * Only sessions with a matching `role` will have their `activationConditions` evaluated
     * against the user activity's `targetContentIdentifier`.
     */
    @Generated
    @Selector("userActivity")
    @Nullable
    public native NSUserActivity userActivity();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}