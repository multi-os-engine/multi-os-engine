package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASAccountAuthenticationModificationViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected ASAccountAuthenticationModificationViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASAccountAuthenticationModificationViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASAccountAuthenticationModificationViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
     * This method will be called when the user taps the system-provided "Cancel" button shown above extension UI.
     * 
     * Extension UI will be dismissed as soon as this method is called. The default
     * implementation simply cancels the request with the ASExtensionErrorCodeUserCanceled error code.
     * Override this method to do any cleanup work before the request is canceled. The implementation of this
     * method should still cancel the request with the ASExtensionErrorCodeUserCanceled error code once the
     * cleanup work is completed. If the request is not canceled in 10 seconds, the system will cancel the request.
     */
    @Generated
    @Selector("cancelRequest")
    public native void cancelRequest();

    /**
     * This method will be called when a user initiates a strong password upgrade request.
     * 
     * Password rules for generating the newPassword parameter can be specified
     * with the ASAccountAuthenticationModificationSupportsUpgradeToSignInWithApple key in the
     * extension's Info.plist. This method will be called to begin a strong password upgrade request and
     * will not present any extension UI. If extension UI needs to be shown, this initial request should be
     * canceled with the ASExtensionErrorCodeUserCanceled error code. The existingCredential parameter
     * will have an empty password for in-app upgrades. The extension should check if a user is already
     * logged in by checking a data container shared with its containing app.
     * 
     * @param serviceIdentifier  The service identifier of the credential the user wishes to upgrade.
     * @param existingCredential The current password-based credential of the account for the upgrade.
     * @param newPassword        A strong password generated by the system to be used for the upgrade.
     * @param userInfo           For upgrades invoked within the extension's containing app, any
     *                           information the app wants to pass to the extension, most likely to help authorize the
     *                           upgrade.
     */
    @Generated
    @Selector("changePasswordWithoutUserInteractionForServiceIdentifier:existingCredential:newPassword:userInfo:")
    public native void changePasswordWithoutUserInteractionForServiceIdentifierExistingCredentialNewPasswordUserInfo(
            @NotNull ASCredentialServiceIdentifier serviceIdentifier, @NotNull ASPasswordCredential existingCredential,
            @NotNull String newPassword, @Nullable NSDictionary<?, ?> userInfo);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    /**
     * This method will be called when a user initiates a Sign in with Apple upgrade request.
     * 
     * This method will be called to begin a Sign in with Apple upgrade request and will not
     * present any extension UI. If extension UI needs to be shown, this initial request should be canceled
     * with the ASExtensionErrorCodeUserCanceled error code. The existingCredential parameter will have
     * an empty password for in-app upgrades. The extension should check if a user is already logged in by
     * checking a data container shared with its containing app.
     * 
     * @param serviceIdentifier  The service identifier of the credential the user wishes to upgrade.
     * @param existingCredential The current password-based credential of the account for the upgrade.
     * @param userInfo           For upgrades invoked within the extension's containing app, any
     *                           information the app wants to pass to the extension, most likely to help authorize the
     *                           upgrade.
     */
    @Generated
    @Selector("convertAccountToSignInWithAppleWithoutUserInteractionForServiceIdentifier:existingCredential:userInfo:")
    public native void convertAccountToSignInWithAppleWithoutUserInteractionForServiceIdentifierExistingCredentialUserInfo(
            @NotNull ASCredentialServiceIdentifier serviceIdentifier, @NotNull ASPasswordCredential existingCredential,
            @Nullable NSDictionary<?, ?> userInfo);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("extensionContext")
    public native ASAccountAuthenticationModificationExtensionContext extensionContext();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASAccountAuthenticationModificationViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native ASAccountAuthenticationModificationViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ASAccountAuthenticationModificationViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

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
    public static native ASAccountAuthenticationModificationViewController new_objc();

    /**
     * This method will be called when a strong password upgrade request requires user interaction.
     * 
     * This method will be called when the initial request is canceled with the
     * ASExtensionErrorCodeUserCanceled error code. The implementation of this method should do
     * any work necessary to prepare to present the extension UI. Once it finishes, the system will present
     * the extension UI. Password rules for generating the newPassword parameter can be specified
     * with the ASAccountAuthenticationModificationSupportsUpgradeToSignInWithApple key in the
     * extension's Info.plist. The existingCredential parameter will have an empty password for in-app upgrades.
     * The extension should check if a user is already logged in by checking state in a data container shared
     * with its containing app.
     * 
     * @param serviceIdentifier  The service identifier of the credential the user wishes to upgrade.
     * @param existingCredential The current password-based credential of the account for the upgrade.
     * @param newPassword        A strong password generated by the system to be used for the upgrade.
     * @param userInfo           For upgrades invoked within the extension's containing app, any
     *                           information the app wants to pass to the extension, most likely to help authorize the
     *                           upgrade.
     */
    @Generated
    @Selector("prepareInterfaceToChangePasswordForServiceIdentifier:existingCredential:newPassword:userInfo:")
    public native void prepareInterfaceToChangePasswordForServiceIdentifierExistingCredentialNewPasswordUserInfo(
            @NotNull ASCredentialServiceIdentifier serviceIdentifier, @NotNull ASPasswordCredential existingCredential,
            @NotNull String newPassword, @Nullable NSDictionary<?, ?> userInfo);

    /**
     * This method will be called when a Sign in with Apple upgrade request requires user interaction.
     * 
     * This method will be called when the initial request is canceled with the
     * ASExtensionErrorCodeUserCanceled error code. The implementation of this method should do any
     * work necessary to prepare to present the extension UI. Once it finishes, the system will present the
     * extension UI. The existingCredential parameter will have an empty password for in-app upgrades. The
     * extension should check if a user is already logged in by checking state in a data container shared
     * with its containing app.
     * 
     * @param serviceIdentifier  The service identifier of the credential the user wishes to upgrade.
     * @param existingCredential The current password-based credential of the account for the upgrade.
     * @param userInfo           For upgrades invoked within the extension's containing app, any
     *                           information the app wants to pass to the extension, most likely to help authorize the
     *                           upgrade.
     */
    @Generated
    @Selector("prepareInterfaceToConvertAccountToSignInWithAppleForServiceIdentifier:existingCredential:userInfo:")
    public native void prepareInterfaceToConvertAccountToSignInWithAppleForServiceIdentifierExistingCredentialUserInfo(
            @NotNull ASCredentialServiceIdentifier serviceIdentifier, @NotNull ASPasswordCredential existingCredential,
            @Nullable NSDictionary<?, ?> userInfo);

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
