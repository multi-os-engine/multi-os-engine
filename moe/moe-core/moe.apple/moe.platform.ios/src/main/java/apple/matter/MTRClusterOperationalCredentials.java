package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Operational Credentials
 * This cluster is used to add or remove Operational Credentials on a Commissionee or Node, as well as manage the
 * associated Fabrics.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterOperationalCredentials extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterOperationalCredentials(Pointer peer) {
        super(peer);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("CSRRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterCSRRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterCSRResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use CSRRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("CSRRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterCSRRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_CSRRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterCSRResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addNOCWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addNOCWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterAddNOCParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use addNOCWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addNOCWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterAddNOCParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("addTrustedRootCertificateWithParams:expectedValues:expectedValueInterval:completion:")
    public native void addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterAddTrustedRootCertificateParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * addTrustedRootCertificateWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("addTrustedRootCertificateWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterAddTrustedRootCertificateParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_addTrustedRootCertificateWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterOperationalCredentials alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterOperationalCredentials allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("attestationRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterAttestationRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterAttestationResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use attestationRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("attestationRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterAttestationRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_attestationRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterAttestationResponseParams data, @Nullable NSError error);
    }

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("certificateChainRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterCertificateChainRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterCertificateChainResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use certificateChainRequestWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("certificateChainRequestWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterCertificateChainRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_certificateChainRequestWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterCertificateChainResponseParams data, @Nullable NSError error);
    }

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
    public native MTRClusterOperationalCredentials init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterOperationalCredentials initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterOperationalCredentials initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    public static native MTRClusterOperationalCredentials new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCommissionedFabricsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCommissionedFabricsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCurrentFabricIndexWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentFabricIndexWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFabricsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFabricsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNOCsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNOCsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSupportedFabricsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSupportedFabricsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTrustedRootCertificatesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTrustedRootCertificatesWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("removeFabricWithParams:expectedValues:expectedValueInterval:completion:")
    public native void removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterRemoveFabricParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use removeFabricWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("removeFabricWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterRemoveFabricParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_removeFabricWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
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
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("updateFabricLabelWithParams:expectedValues:expectedValueInterval:completion:")
    public native void updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterUpdateFabricLabelParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use updateFabricLabelWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("updateFabricLabelWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterUpdateFabricLabelParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_updateFabricLabelWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("updateNOCWithParams:expectedValues:expectedValueInterval:completion:")
    public native void updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTROperationalCredentialsClusterUpdateNOCParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use updateNOCWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("updateNOCWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTROperationalCredentialsClusterUpdateNOCParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_updateNOCWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTROperationalCredentialsClusterNOCResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}