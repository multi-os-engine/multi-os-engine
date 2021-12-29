package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSExtensionContext;
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

@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAccountAuthenticationModificationExtensionContext extends NSExtensionContext {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAccountAuthenticationModificationExtensionContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAccountAuthenticationModificationExtensionContext alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAccountAuthenticationModificationExtensionContext allocWithZone(VoidPtr zone);

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

    /**
     * Used to either ask for user interaction in a request or to fail a request.
     */
    @Generated
    @Selector("cancelRequestWithError:")
    public native void cancelRequestWithError(NSError error);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Confirms successful completion of a strong password upgrade.
     *
     * @param updatedCredential contains the account username and new password.
     * @param userInfo          For upgrades invoked within the extension's containing app, any
     *                          information the extension wants to pass back to the app.
     */
    @Generated
    @Selector("completeChangePasswordRequestWithUpdatedCredential:userInfo:")
    public native void completeChangePasswordRequestWithUpdatedCredentialUserInfo(
            ASPasswordCredential updatedCredential, NSDictionary<?, ?> userInfo);

    /**
     * Confirms successful completion of a Sign in with Apple upgrade.
     * <p>
     * Once a Sign in with Apple upgrade is completed, the system will delete
     * the password-based credential from the Keychain, if it is saved there.
     *
     * @param userInfo For upgrades invoked within the extension's containing app, any
     *                 information the extension wants to pass back to the app.
     */
    @Generated
    @Selector("completeUpgradeToSignInWithAppleWithUserInfo:")
    public native void completeUpgradeToSignInWithAppleWithUserInfo(NSDictionary<?, ?> userInfo);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Retrieves a Sign in with Apple credential from the system.
     * <p>
     * Calling this method will cause the system Sign in with Apple upgrade sheet
     * to appear. If extension UI is showing when this method is called, the extension UI will be
     * dismissed before the sheet is presented.
     *
     * @param state Can be specified to enhance security. State is returned in the ASAuthorizationAppleIDCredential.
     * @param nonce Can be specified to enhance security. The returned identityToken on the ASAuthorizationAppleIDCredential can be exchanged with the server for the nonce.
     */
    @Generated
    @Selector("getSignInWithAppleUpgradeAuthorizationWithState:nonce:completionHandler:")
    public native void getSignInWithAppleUpgradeAuthorizationWithStateNonceCompletionHandler(String state, String nonce,
            @ObjCBlock(name = "call_getSignInWithAppleUpgradeAuthorizationWithStateNonceCompletionHandler") Block_getSignInWithAppleUpgradeAuthorizationWithStateNonceCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSignInWithAppleUpgradeAuthorizationWithStateNonceCompletionHandler {
        @Generated
        void call_getSignInWithAppleUpgradeAuthorizationWithStateNonceCompletionHandler(
                ASAuthorizationAppleIDCredential authorization, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASAccountAuthenticationModificationExtensionContext init();

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
    public static native ASAccountAuthenticationModificationExtensionContext new_objc();

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
