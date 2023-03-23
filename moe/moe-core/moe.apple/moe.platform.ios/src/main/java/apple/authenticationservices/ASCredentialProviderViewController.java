package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
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

/**
 * API-Since: 12.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASCredentialProviderViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected ASCredentialProviderViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASCredentialProviderViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASCredentialProviderViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("extensionContext")
    public native ASCredentialProviderExtensionContext extensionContext();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASCredentialProviderViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native ASCredentialProviderViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ASCredentialProviderViewController initWithNibNameBundle(String nibNameOrNil,
            NSBundle nibBundleOrNil);

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
    public static native ASCredentialProviderViewController new_objc();

    /**
     * Prepare the view controller to show a list of credentials.
     * 
     * This method is called by the system to prepare the extension's view controller to present the list of
     * credentials.
     * A service identifier array is passed which can be used to filter or prioritize the credentials that closely match
     * each service.
     * The service identifier array could have zero or more items. If there are more than one item in the array, items
     * with lower indexes
     * represent more specific identifiers for which a credential is being requested. For example, the array could
     * contain identifiers
     * [m.example.com, example.com] with the first item representing the more specifc service that requires a
     * credential.
     * If the array of service identifiers is empty, it is expected that the credential list should still show
     * credentials that the user can pick from.
     * 
     * @param serviceIdentifiers the array of service identifiers.
     */
    @Generated
    @Selector("prepareCredentialListForServiceIdentifiers:")
    public native void prepareCredentialListForServiceIdentifiers(
            NSArray<? extends ASCredentialServiceIdentifier> serviceIdentifiers);

    /**
     * Prepare the view controller to show user interface when the user enables your extension.
     * 
     * The system calls this method after your extension is enabled by the user in Settings. You can
     * use this method to give the user a chance to configure the extension or to provide credential identities
     * to the system. After the configuration is done, call -[ASCredentialProviderExtensionContext
     * completeExtensionConfigurationRequest].
     * [@note] This method only gets called if your extension supports this functionality by specifying
     * "ASCredentialProviderExtensionShowsConfigurationUI": YES in its extension attributes.
     */
    @Generated
    @Selector("prepareInterfaceForExtensionConfiguration")
    public native void prepareInterfaceForExtensionConfiguration();

    /**
     * Prepare the view controller to show user interface for providing the user-requested credential.
     * 
     * The system calls this method when your extension cannot provide the requested credential without user
     * interaction.
     * Set up the view controller for any user interaction required to provide the requested credential only. The user
     * interaction should
     * be limited in nature to operations required for providing the requested credential. An example is showing an
     * authentication UI to
     * unlock the user's passwords database.
     * Call -[ASCredentialProviderExtensionContext completeRequestWithSelectedCredential:completionHandler:] to provide
     * the credential.
     * If an error occurs, call -[ASCredentialProviderExtensionContext cancelRequestWithError:] and pass an error with
     * domain
     * ASExtensionErrorDomain and an appropriate error code from ASExtensionErrorCode. For example, if the credential
     * identity cannot
     * be found in the database, pass an error with code ASExtensionErrorCodeCredentialIdentityNotFound.
     * 
     * @param credentialIdentity the credential identity for which a credential should be provided.
     */
    @Generated
    @Selector("prepareInterfaceToProvideCredentialForIdentity:")
    public native void prepareInterfaceToProvideCredentialForIdentity(ASPasswordCredentialIdentity credentialIdentity);

    /**
     * Attempt to provide the user-requested credential without any user interaction.
     * 
     * After the user selects a credential identity, the system may ask your extension to provide the credential without
     * showing any
     * user interface if possible to enhance the user experience. If your extension can accomplish this (for example,
     * the user’s passwords database is
     * still unlocked from a recent interaction), call -[ASCredentialProviderExtensionContext
     * completeRequestWithSelectedCredential:completionHandler:]
     * to provide the credential.
     * If an error occurs, call -[ASCredentialProviderExtensionContext cancelRequestWithError:] and pass an error with
     * domain
     * ASExtensionErrorDomain and an appropriate error code from ASExtensionErrorCode. For example, if your extension
     * requires user interaction
     * because the passwords database needs to be unlocked, pass an error with code
     * ASExtensionErrorCodeUserInteractionRequired.
     * [@note] When this method is called, your extension's view controller is not present on the screen. Do not attempt
     * or expect to show any user
     * interface in this method.
     * 
     * @param credentialIdentity the credential identity for which a credential should be provided.
     */
    @Generated
    @Selector("provideCredentialWithoutUserInteractionForIdentity:")
    public native void provideCredentialWithoutUserInteractionForIdentity(
            ASPasswordCredentialIdentity credentialIdentity);

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
