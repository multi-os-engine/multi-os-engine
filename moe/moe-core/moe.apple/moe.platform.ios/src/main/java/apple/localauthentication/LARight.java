package apple.localauthentication;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import apple.uikit.UIWindow;

/**
 * Groups a set of requirements that need to be satisfied in order to grant access to certain resource or operation
 * 
 * API-Since: 16.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LARight extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LARight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LARight alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LARight allocWithZone(VoidPtr zone);

    /**
     * Tries to authorize the right.
     * 
     * @param localizedReason Localized explanation for the authorization. Appears in the UI presented to the user.
     * @param handler         Completion handler called after the authorization finishes. Returns an error when the
     *                        authorization fails.
     */
    @Generated
    @Selector("authorizeWithLocalizedReason:completion:")
    public native void authorizeWithLocalizedReasonCompletion(@NotNull String localizedReason,
            @NotNull @ObjCBlock(name = "call_authorizeWithLocalizedReasonCompletion") Block_authorizeWithLocalizedReasonCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authorizeWithLocalizedReasonCompletion {
        @Generated
        void call_authorizeWithLocalizedReasonCompletion(@Nullable NSError error);
    }

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

    /**
     * Checks whether the client can eventually be granted the right.
     * 
     * @param handler Completion handler. Returns @c nil if the right can be authorized or an error otherwise.
     */
    @Generated
    @Selector("checkCanAuthorizeWithCompletion:")
    public native void checkCanAuthorizeWithCompletion(
            @NotNull @ObjCBlock(name = "call_checkCanAuthorizeWithCompletion") Block_checkCanAuthorizeWithCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_checkCanAuthorizeWithCompletion {
        @Generated
        void call_checkCanAuthorizeWithCompletion(@Nullable NSError error);
    }

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Invalidates a previously authorized right.
     * 
     * @param handler Completion handler called after the right is deauthorized.
     */
    @Generated
    @Selector("deauthorizeWithCompletion:")
    public native void deauthorizeWithCompletion(
            @NotNull @ObjCBlock(name = "call_deauthorizeWithCompletion") Block_deauthorizeWithCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deauthorizeWithCompletion {
        @Generated
        void call_deauthorizeWithCompletion();
    }

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

    /**
     * Constructs a right using default authorization requirements
     * 
     * For authorizing a right with default requirements a user will be asked to authenticate using biometry or the
     * device passcode.
     * 
     * @return @c LARight instance
     */
    @Generated
    @Selector("init")
    public native LARight init();

    /**
     * Constructs a right that will be granted only when the given @c LAAuthenticationRequirement is statisfied.
     * 
     * @param requirement Requirement that needs to be satisfied to authorize the right
     * @return @c LARight instance
     */
    @Generated
    @Selector("initWithRequirement:")
    public native LARight initWithRequirement(@NotNull LAAuthenticationRequirement requirement);

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
    public static native LARight new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An application-supplied integer that can be used to identify right intances. The default value is @c 0.
     */
    @Generated
    @Selector("setTag:")
    public native void setTag(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Provides the current authorization state of the @c LARight instance
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * An application-supplied integer that can be used to identify right intances. The default value is @c 0.
     */
    @Generated
    @Selector("tag")
    @NInt
    public native long tag();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Tries to authorize the right.
     * 
     * @param localizedReason     Localized explanation for the authorization. Appears in the UI presented to the user.
     * @param presentationContext Container where the authorization UI will be presented.
     * @param handler             Completion handler called after the authorization finishses. Returns an error when the
     *                            authorization fails.
     */
    @Generated
    @Selector("authorizeWithLocalizedReason:inPresentationContext:completion:")
    public native void authorizeWithLocalizedReasonInPresentationContextCompletion(@NotNull String localizedReason,
            @NotNull UIWindow presentationContext,
            @ObjCBlock(name = "call_authorizeWithLocalizedReasonInPresentationContextCompletion") @NotNull Block_authorizeWithLocalizedReasonInPresentationContextCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authorizeWithLocalizedReasonInPresentationContextCompletion {
        @Generated
        void call_authorizeWithLocalizedReasonInPresentationContextCompletion(@Nullable NSError arg0);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}