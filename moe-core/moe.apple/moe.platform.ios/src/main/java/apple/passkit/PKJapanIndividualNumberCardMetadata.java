package apple.passkit;

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
 * API-Since: 18.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKJapanIndividualNumberCardMetadata extends PKIdentityDocumentMetadata {
    static {
        NatJ.register();
    }

    @Generated
    protected PKJapanIndividualNumberCardMetadata(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKJapanIndividualNumberCardMetadata alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKJapanIndividualNumberCardMetadata allocWithZone(VoidPtr zone);

    /**
     * Raw authentication password used to protect authentication functionality.
     * If configured in the pass, this functionality allows users to present their identity credentials to external
     * parties.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authenticationPassword")
    @Nullable
    public native String authenticationPassword();

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
    public native PKJapanIndividualNumberCardMetadata init();

    /**
     * Initialize with parameters configured by issuer's server to indicate the specific product instance to provision.
     * - Properties:
     * - provisioningCredentialIdentifier: Identifies this user's instance for provisioning.
     * - sharingInstanceIdentifier: A short lived token to prevent replay-ability.
     * - cardConfigurationIdentifier: An identifier for a product on our Apple Pay servers.
     * - preview: Object containing information to represent the pass to provision in our UI.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:preview:")
    public native PKJapanIndividualNumberCardMetadata initWithProvisioningCredentialIdentifierSharingInstanceIdentifierCardConfigurationIdentifierPreview(
            @NotNull String credentialIdentifier, @NotNull String sharingInstanceIdentifier,
            @NotNull String templateIdentifier, @NotNull PKAddPassMetadataPreview preview);

    /**
     * Initialize with parameters configured by issuer's server to indicate the specific product instance to provision.
     * - Properties:
     * - provisioningCredentialIdentifier: Identifies this user's instance for provisioning.
     * - sharingInstanceIdentifier: A short lived token to prevent replay-ability.
     * - cardTemplateIdentifier: An identifier for a legacy product on our Apple Pay servers.
     * - preview: Object containing information to represent the pass to provision in our UI.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:preview:")
    public native PKJapanIndividualNumberCardMetadata initWithProvisioningCredentialIdentifierSharingInstanceIdentifierCardTemplateIdentifierPreview(
            @NotNull String credentialIdentifier, @NotNull String sharingInstanceIdentifier,
            @NotNull String templateIdentifier, @NotNull PKAddPassMetadataPreview preview);

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
    public static native PKJapanIndividualNumberCardMetadata new_objc();

    /**
     * preview: A preview object containing the necessary information to represent the pass during provisioning.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("preview")
    @NotNull
    public native PKAddPassMetadataPreview preview();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Raw authentication password used to protect authentication functionality.
     * If configured in the pass, this functionality allows users to present their identity credentials to external
     * parties.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAuthenticationPassword:")
    public native void setAuthenticationPassword(@Nullable String value);

    /**
     * preview: A preview object containing the necessary information to represent the pass during provisioning.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setPreview:")
    public native void setPreview(@NotNull PKAddPassMetadataPreview value);

    /**
     * Raw signing password used to protect signing functionality.
     * If configured in the pass, this functionality allows users to digitally sign with external parties or print
     * officially signed documents.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setSigningPassword:")
    public native void setSigningPassword(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Raw signing password used to protect signing functionality.
     * If configured in the pass, this functionality allows users to digitally sign with external parties or print
     * officially signed documents.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("signingPassword")
    @Nullable
    public native String signingPassword();

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