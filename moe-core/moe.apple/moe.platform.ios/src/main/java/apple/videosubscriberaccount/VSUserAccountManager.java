package apple.videosubscriberaccount;

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

/**
 * API-Since: 16.4
 */
@Generated
@Library("VideoSubscriberAccount")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VSUserAccountManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VSUserAccountManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VSUserAccountManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VSUserAccountManager allocWithZone(VoidPtr zone);

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
    public native VSUserAccountManager init();

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
    public static native VSUserAccountManager new_objc();

    /**
     * Query the registered VSUserAccounts for your application.
     * By default, this will return VSUserAccounts registered by your application on the current
     * device only. To query the VSUserAccounts registered on all of the devices signed into the
     * users iCloud account, use the query flag VSUserAccountQueryAllDevices.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("queryUserAccountsWithOptions:completion:")
    public native void queryUserAccountsWithOptionsCompletion(@NInt long options,
            @NotNull @ObjCBlock(name = "call_queryUserAccountsWithOptionsCompletion") Block_queryUserAccountsWithOptionsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryUserAccountsWithOptionsCompletion {
        @Generated
        void call_queryUserAccountsWithOptionsCompletion(@Nullable NSArray<? extends VSUserAccount> accounts,
                @Nullable NSError error);
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

    /**
     * API-Since: 16.4
     */
    @NotNull
    @Generated
    @Selector("sharedUserAccountManager")
    public static native VSUserAccountManager sharedUserAccountManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Register a new VSUserAccount.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("updateUserAccount:completion:")
    public native void updateUserAccountCompletion(@NotNull VSUserAccount account,
            @Nullable @ObjCBlock(name = "call_updateUserAccountCompletion") Block_updateUserAccountCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateUserAccountCompletion {
        @Generated
        void call_updateUserAccountCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Deletes the auto sign in token.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("deleteAutoSignInTokenWithCompletionHandler:")
    public native void deleteAutoSignInTokenWithCompletionHandler(
            @ObjCBlock(name = "call_deleteAutoSignInTokenWithCompletionHandler") @NotNull Block_deleteAutoSignInTokenWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteAutoSignInTokenWithCompletionHandler {
        @Generated
        void call_deleteAutoSignInTokenWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Query the auto sign in token and authorization state.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("queryAutoSignInTokenWithCompletionHandler:")
    public native void queryAutoSignInTokenWithCompletionHandler(
            @ObjCBlock(name = "call_queryAutoSignInTokenWithCompletionHandler") @NotNull Block_queryAutoSignInTokenWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryAutoSignInTokenWithCompletionHandler {
        @Generated
        void call_queryAutoSignInTokenWithCompletionHandler(@Nullable VSAutoSignInToken token, @Nullable NSError error);
    }

    /**
     * Request user authorization to store and use an auto sign in token. An UI prompt will be shown to the user to
     * confirm this action.
     * Make sure to only call this method after your app is signed in:
     * - If the app is already authenticated, check the authorization status by calling
     * `queryAutoSignInTokenWithCompletionHandler:` and only request
     * authorization if the authorization value is `VSAutoSignInAuthorizationNotDetermined`.
     * - If the user is signing in for the first time, or after going through the manual sign in flow again, you should
     * always request authorization.
     * 
     * @return A `VSAutoSignInTokenUpdateContext` that you pass to
     *         `updateAutoSignInToken:updateContext:completionHandler:`.
     * 
     *         API-Since: 26.0
     */
    @Generated
    @Selector("requestAutoSignInAuthorizationWithCompletionHandler:")
    public native void requestAutoSignInAuthorizationWithCompletionHandler(
            @ObjCBlock(name = "call_requestAutoSignInAuthorizationWithCompletionHandler") @NotNull Block_requestAutoSignInAuthorizationWithCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAutoSignInAuthorizationWithCompletionHandler {
        @Generated
        void call_requestAutoSignInAuthorizationWithCompletionHandler(
                @Nullable VSAutoSignInTokenUpdateContext updateContext, @Nullable NSError error);
    }

    /**
     * Sets the auto sign in token.
     * You're in full control of your token, it doesn't have any implied expiration dates. Use
     * `-[VSUserAccountManager deleteAutoSignInTokenWithCompletionHandler:]` if you need to remove an old token.
     * 
     * Before calling this method you have to obtain an update context object using
     * `-[VSUserAccountManager requestAutoSignInAuthorizationWithCompletionHandler:]`. Updating the token will fail if
     * the user hasn't
     * granted authorization.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("updateAutoSignInToken:updateContext:completionHandler:")
    public native void updateAutoSignInTokenUpdateContextCompletionHandler(@NotNull String autoSignInToken,
            @NotNull VSAutoSignInTokenUpdateContext context,
            @ObjCBlock(name = "call_updateAutoSignInTokenUpdateContextCompletionHandler") @NotNull Block_updateAutoSignInTokenUpdateContextCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateAutoSignInTokenUpdateContextCompletionHandler {
        @Generated
        void call_updateAutoSignInTokenUpdateContextCompletionHandler(@Nullable NSError error);
    }
}