package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKIssuerProvisioningExtensionHandler extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKIssuerProvisioningExtensionHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKIssuerProvisioningExtensionHandler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKIssuerProvisioningExtensionHandler allocWithZone(VoidPtr zone);

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

    /**
     * Certificates is an array of NSData, each a DER encoded X.509 certificate, with the leaf first and root last.
     * The continuation handler must be called within 20 seconds or an error will be displayed.
     * Subsequent to timeout, the continuation handler is invalid and invocations will be ignored.
     */
    @Generated
    @Selector("generateAddPaymentPassRequestForPassEntryWithIdentifier:configuration:certificateChain:nonce:nonceSignature:completionHandler:")
    public native void generateAddPaymentPassRequestForPassEntryWithIdentifierConfigurationCertificateChainNonceNonceSignatureCompletionHandler(
            @NotNull String identifier, @NotNull PKAddPaymentPassRequestConfiguration configuration,
            @NotNull NSArray<? extends NSData> certificates, @NotNull NSData nonce, @NotNull NSData nonceSignature,
            @NotNull @ObjCBlock(name = "call_generateAddPaymentPassRequestForPassEntryWithIdentifierConfigurationCertificateChainNonceNonceSignatureCompletionHandler") Block_generateAddPaymentPassRequestForPassEntryWithIdentifierConfigurationCertificateChainNonceNonceSignatureCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateAddPaymentPassRequestForPassEntryWithIdentifierConfigurationCertificateChainNonceNonceSignatureCompletionHandler {
        @Generated
        void call_generateAddPaymentPassRequestForPassEntryWithIdentifierConfigurationCertificateChainNonceNonceSignatureCompletionHandler(
                @Nullable PKAddPaymentPassRequest request);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PKIssuerProvisioningExtensionHandler init();

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
    public static native PKIssuerProvisioningExtensionHandler new_objc();

    @Generated
    @Selector("passEntriesWithCompletion:")
    public native void passEntriesWithCompletion(
            @NotNull @ObjCBlock(name = "call_passEntriesWithCompletion") Block_passEntriesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_passEntriesWithCompletion {
        @Generated
        void call_passEntriesWithCompletion(@NotNull NSArray<? extends PKIssuerProvisioningExtensionPassEntry> entries);
    }

    @Generated
    @Selector("remotePassEntriesWithCompletion:")
    public native void remotePassEntriesWithCompletion(
            @NotNull @ObjCBlock(name = "call_remotePassEntriesWithCompletion") Block_remotePassEntriesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_remotePassEntriesWithCompletion {
        @Generated
        void call_remotePassEntriesWithCompletion(
                @NotNull NSArray<? extends PKIssuerProvisioningExtensionPassEntry> entries);
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
    @Selector("statusWithCompletion:")
    public native void statusWithCompletion(
            @NotNull @ObjCBlock(name = "call_statusWithCompletion") Block_statusWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_statusWithCompletion {
        @Generated
        void call_statusWithCompletion(@NotNull PKIssuerProvisioningExtensionStatus status);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
