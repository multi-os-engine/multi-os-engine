package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.matter.protocol.MTROTAProviderDelegate;
import apple.matter.protocol.MTRStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceControllerFactoryParams extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceControllerFactoryParams(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceControllerFactoryParams alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceControllerFactoryParams allocWithZone(VoidPtr zone);

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
     * The Certification Declaration certificates whose public keys correspond to
     * private keys that are trusted to sign certification declarations. Defaults
     * to nil.
     * 
     * These certificates are used in addition to, not replacing, the default set of
     * well-known certification declaration signing keys.
     */
    @Generated
    @Selector("certificationDeclarationCertificates")
    @Nullable
    public native NSArray<? extends NSData> certificationDeclarationCertificates();

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
    public native MTRDeviceControllerFactoryParams init();

    /**
     * Initialize the device controller factory with storage. In this mode, the
     * storage will be used to store various information needed by the Matter
     * framework.
     */
    @Generated
    @Selector("initWithStorage:")
    public native MTRDeviceControllerFactoryParams initWithStorage(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRStorage storage);

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
    public static native MTRDeviceControllerFactoryParams new_objc();

    /**
     * OTA Provider delegate to be called when an OTA Requestor is requesting a software update.
     * Defaults to nil.
     * 
     * Calls to this delegate can happen on an arbitrary thread, but will not happen
     * concurrently.
     */
    @Generated
    @Selector("otaProviderDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTROTAProviderDelegate otaProviderDelegate();

    /**
     * The network port to bind to. If not specified, an ephemeral port will be
     * used.
     */
    @Generated
    @Selector("port")
    @Nullable
    public native NSNumber port();

    /**
     * The Product Attestation Authority certificates that are trusted to sign
     * device attestation information (and in particular to sign Product Attestation
     * Intermediate certificates, which then sign Device Attestation Certificates).
     * 
     * Defaults to nil.
     */
    @Generated
    @Selector("productAttestationAuthorityCertificates")
    @Nullable
    public native NSArray<? extends NSData> productAttestationAuthorityCertificates();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The Certification Declaration certificates whose public keys correspond to
     * private keys that are trusted to sign certification declarations. Defaults
     * to nil.
     * 
     * These certificates are used in addition to, not replacing, the default set of
     * well-known certification declaration signing keys.
     */
    @Generated
    @Selector("setCertificationDeclarationCertificates:")
    public native void setCertificationDeclarationCertificates(@Nullable NSArray<? extends NSData> value);

    /**
     * OTA Provider delegate to be called when an OTA Requestor is requesting a software update.
     * Defaults to nil.
     * 
     * Calls to this delegate can happen on an arbitrary thread, but will not happen
     * concurrently.
     */
    @Generated
    @Selector("setOtaProviderDelegate:")
    public native void setOtaProviderDelegate(@Mapped(ObjCObjectMapper.class) @Nullable MTROTAProviderDelegate value);

    /**
     * The network port to bind to. If not specified, an ephemeral port will be
     * used.
     */
    @Generated
    @Selector("setPort:")
    public native void setPort(@Nullable NSNumber value);

    /**
     * The Product Attestation Authority certificates that are trusted to sign
     * device attestation information (and in particular to sign Product Attestation
     * Intermediate certificates, which then sign Device Attestation Certificates).
     * 
     * Defaults to nil.
     */
    @Generated
    @Selector("setProductAttestationAuthorityCertificates:")
    public native void setProductAttestationAuthorityCertificates(@Nullable NSArray<? extends NSData> value);

    /**
     * Whether to run a server capable of accepting incoming CASE
     * connections. Defaults to NO.
     */
    @Generated
    @Selector("setShouldStartServer:")
    public native void setShouldStartServer(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Whether to run a server capable of accepting incoming CASE
     * connections. Defaults to NO.
     */
    @Generated
    @Selector("shouldStartServer")
    public native boolean shouldStartServer();

    /**
     * Storage used to store persistent information for the fabrics the
     * controllers ends up interacting with. This is only used if "initWithStorage"
     * is used to initialize the MTRDeviceControllerFactoryParams. If "init" is
     * used, this property will contain a dummy storage that will not be used for
     * anything.
     */
    @Generated
    @Selector("storage")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native MTRStorage storage();

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