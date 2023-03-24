package apple.passkit;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKShareablePassMetadata extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKShareablePassMetadata(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKShareablePassMetadata alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKShareablePassMetadata allocWithZone(VoidPtr zone);

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
    @Selector("cardConfigurationIdentifier")
    public native String cardConfigurationIdentifier();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * A unique identifier for provisioning credential data.
     */
    @NotNull
    @Generated
    @Selector("credentialIdentifier")
    public native String credentialIdentifier();

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
    public native PKShareablePassMetadata init();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use
     * initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:passPreviewMetadata:
     */
    @Deprecated
    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:cardConfigurationIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:")
    public native PKShareablePassMetadata initWithProvisioningCredentialIdentifierCardConfigurationIdentifierSharingInstanceIdentifierPassThumbnailImageOwnerDisplayNameLocalizedDescription(
            @NotNull String credentialIdentifier, @NotNull String cardConfigurationIdentifier,
            @NotNull String sharingInstanceIdentifier, @NotNull CGImageRef passThumbnailImage,
            @NotNull String ownerDisplayName, @NotNull String localizedDescription);

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

    /**
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    @Generated
    @Owned
    @Selector("new")
    public static native PKShareablePassMetadata new_objc();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("ownerDisplayName")
    public native String ownerDisplayName();

    /**
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("passThumbnailImage")
    public native CGImageRef passThumbnailImage();

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
     * A unique identifier that refers to an instance of sharing of credentials to a user's device initiated from
     * another user, device, or web.
     */
    @NotNull
    @Generated
    @Selector("sharingInstanceIdentifier")
    public native String sharingInstanceIdentifier();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * An identifier representing an entity that uses a FIDO protocol to directly authenticate users.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("accountHash")
    public native String accountHash();

    /**
     * API-Since: 15.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use
     * initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:passPreviewMetadata:
     */
    @Deprecated
    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:passThumbnailImage:ownerDisplayName:localizedDescription:accountHash:templateIdentifier:relyingPartyIdentifier:requiresUnifiedAccessCapableDevice:")
    public native PKShareablePassMetadata initWithProvisioningCredentialIdentifierSharingInstanceIdentifierPassThumbnailImageOwnerDisplayNameLocalizedDescriptionAccountHashTemplateIdentifierRelyingPartyIdentifierRequiresUnifiedAccessCapableDevice(
            @NotNull String credentialIdentifier, @NotNull String sharingInstanceIdentifier,
            @NotNull CGImageRef passThumbnailImage, @NotNull String ownerDisplayName,
            @NotNull String localizedDescription, @NotNull String accountHash, @NotNull String templateIdentifier,
            @NotNull String relyingPartyIdentifier, boolean requiresUnifiedAccessCapableDevice);

    /**
     * Unique accountHash representing the external account in partner's system. This value needs to be the same for all
     * the provisionings pointing to the same user account.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("relyingPartyIdentifier")
    public native String relyingPartyIdentifier();

    /**
     * Specify that the passes to provision require a unified access capable device.
     * This is primarily used when provisioning a pass that uses an ISO18013-5 payload.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("requiresUnifiedAccessCapableDevice")
    public native boolean requiresUnifiedAccessCapableDevice();

    /**
     * Identifier referencing a card template registered in portal - identifies a combination of cardProfileIdentifier,
     * cardConfigurationIdentifier, and cardArtBundleName.
     * 
     * API-Since: 15.0
     * Deprecated-Since: 16.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("templateIdentifier")
    public native String templateIdentifier();

    /**
     * Identifier referencing a card template registered in portal - identifies a combination of cardProfileIdentifier,
     * cardConfigurationIdentifier, and cardArtBundleName.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("cardTemplateIdentifier")
    public native String cardTemplateIdentifier();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardConfigurationIdentifier:preview:")
    public native PKShareablePassMetadata initWithProvisioningCredentialIdentifierSharingInstanceIdentifierCardConfigurationIdentifierPreview(
            @NotNull String credentialIdentifier, @NotNull String sharingInstanceIdentifier,
            @NotNull String templateIdentifier, @NotNull PKShareablePassMetadataPreview preview);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithProvisioningCredentialIdentifier:sharingInstanceIdentifier:cardTemplateIdentifier:preview:")
    public native PKShareablePassMetadata initWithProvisioningCredentialIdentifierSharingInstanceIdentifierCardTemplateIdentifierPreview(
            @NotNull String credentialIdentifier, @NotNull String sharingInstanceIdentifier,
            @NotNull String templateIdentifier, @NotNull PKShareablePassMetadataPreview preview);

    /**
     * Display Properties
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("preview")
    public native PKShareablePassMetadataPreview preview();

    /**
     * Identifer referencing the target server environment Apple Pay servers should reach
     * out to to provision this pass.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("serverEnvironmentIdentifier")
    public native String serverEnvironmentIdentifier();

    /**
     * An identifier representing an entity that uses a FIDO protocol to directly authenticate users.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAccountHash:")
    public native void setAccountHash(@NotNull String value);

    /**
     * Unique accountHash representing the external account in partner's system. This value needs to be the same for all
     * the provisionings pointing to the same user account.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setRelyingPartyIdentifier:")
    public native void setRelyingPartyIdentifier(@NotNull String value);

    /**
     * Specify that the passes to provision require a unified access capable device.
     * This is primarily used when provisioning a pass that uses an ISO18013-5 payload.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setRequiresUnifiedAccessCapableDevice:")
    public native void setRequiresUnifiedAccessCapableDevice(boolean value);

    /**
     * Identifer referencing the target server environment Apple Pay servers should reach
     * out to to provision this pass.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setServerEnvironmentIdentifier:")
    public native void setServerEnvironmentIdentifier(@NotNull String value);
}
