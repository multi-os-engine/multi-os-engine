package apple.devicecheck;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * API-Since: 14.0
 */
@Generated
@Library("DeviceCheck")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class DCAppAttestService extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected DCAppAttestService(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native DCAppAttestService alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native DCAppAttestService allocWithZone(VoidPtr zone);

    /**
     * Attest the key by keyId. The same key may be attested more than once, provided that the key has
     * not been used for generating assertions.
     * 
     * @param keyId
     *                          The key identifier to be attested
     * @param clientDataHash
     *                          An arbitrary byte (up to 32 bytes) to be supplied by caller. It will be used to compute
     *                          a nonce to be embedded into the certificate that certifies the key.
     * @param completionHandler
     *                          The completion callback, returning the attestationObject upon success, or an error
     */
    @Generated
    @Selector("attestKey:clientDataHash:completionHandler:")
    public native void attestKeyClientDataHashCompletionHandler(@NotNull String keyId, @NotNull NSData clientDataHash,
            @NotNull @ObjCBlock(name = "call_attestKeyClientDataHashCompletionHandler") Block_attestKeyClientDataHashCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_attestKeyClientDataHashCompletionHandler {
        @Generated
        void call_attestKeyClientDataHashCompletionHandler(@Nullable NSData attestationObject, @Nullable NSError error);
    }

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
     * Attest the key by keyId. The same key may be attested more than once, provided that the key has
     * not been used for generating assertions.
     * 
     * @param keyId
     *                          The key identifier to the key to generate assertions with
     * @param clientDataHash
     *                          An arbitrary byte (up to 32 bytes) to be supplied by caller. It will be used to compute
     *                          a nonce to be embedded into the certificate that certifies the key.
     * @param completionHandler
     *                          The completion callback, returning the assertionObject upon success, or an error
     */
    @Generated
    @Selector("generateAssertion:clientDataHash:completionHandler:")
    public native void generateAssertionClientDataHashCompletionHandler(@NotNull String keyId,
            @NotNull NSData clientDataHash,
            @NotNull @ObjCBlock(name = "call_generateAssertionClientDataHashCompletionHandler") Block_generateAssertionClientDataHashCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateAssertionClientDataHashCompletionHandler {
        @Generated
        void call_generateAssertionClientDataHashCompletionHandler(@Nullable NSData assertionObject,
                @Nullable NSError error);
    }

    /**
     * Generate a new unattested key. This call generates a new
     * key every time. the key identifier keyId is returned.
     * 
     * @param completionHandler
     *                          The key identifier (KeyId) for the newly generated unattested key upon success, or an
     *                          error
     */
    @Generated
    @Selector("generateKeyWithCompletionHandler:")
    public native void generateKeyWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_generateKeyWithCompletionHandler") Block_generateKeyWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateKeyWithCompletionHandler {
        @Generated
        void call_generateKeyWithCompletionHandler(@Nullable String keyId, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native DCAppAttestService init();

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

    /**
     * Check if this API is supported on the current device for this application instance
     */
    @Generated
    @Selector("isSupported")
    public native boolean isSupported();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native DCAppAttestService new_objc();

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
     * The shared service instance
     */
    @NotNull
    @Generated
    @Selector("sharedService")
    public static native DCAppAttestService sharedService();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
