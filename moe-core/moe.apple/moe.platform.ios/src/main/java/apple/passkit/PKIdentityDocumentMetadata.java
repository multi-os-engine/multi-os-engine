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
public class PKIdentityDocumentMetadata extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKIdentityDocumentMetadata(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKIdentityDocumentMetadata alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native PKIdentityDocumentMetadata allocWithZone(VoidPtr zone);

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

    /**
     * cardConfigurationIdentifier: Identifier referencing a card configuration registered by developers.
     * Returns empty string if no identifier is set.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("cardConfigurationIdentifier")
    @NotNull
    public native String cardConfigurationIdentifier();

    /**
     * cardTemplateIdentifier: Identifier referencing a card template registered by developers in web portal -
     * identifies a combination of cardProfileIdentifier, cardConfigurationIdentifier, and cardArtBundleName.
     * Returns empty string if no identifier is set.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("cardTemplateIdentifier")
    @NotNull
    public native String cardTemplateIdentifier();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    /**
     * credentialIdentifier: A unique identifier for provisioning credential data.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("credentialIdentifier")
    @NotNull
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
    public native PKIdentityDocumentMetadata init();

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
    public static native PKIdentityDocumentMetadata new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * serverEnvironmentIdentifier: Identifier referencing the target server environment Apple Pay servers should reach
     * out to to provision this pass.
     * If not present, the default Apply Pay server environment will be used and an empty string will be returned.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("serverEnvironmentIdentifier")
    @NotNull
    public native String serverEnvironmentIdentifier();

    /**
     * serverEnvironmentIdentifier: Identifier referencing the target server environment Apple Pay servers should reach
     * out to to provision this pass.
     * If not present, the default Apply Pay server environment will be used and an empty string will be returned.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setServerEnvironmentIdentifier:")
    public native void setServerEnvironmentIdentifier(@NotNull String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * sharingInstanceIdentifier: A unique identifier that refers to an instance of sharing of credentials to a user's
     * device initiated from another user, device, or web.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("sharingInstanceIdentifier")
    @NotNull
    public native String sharingInstanceIdentifier();

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
     * identityDocumentType: identifies the type of the identity document
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("documentType")
    @NInt
    public native long documentType();

    /**
     * issuingCountryCode: identifies the issuing country of the identity document
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("issuingCountryCode")
    @NotNull
    public native String issuingCountryCode();
}