package apple.localauthentication;

import apple.NSObject;
import apple.corefoundation.opaque.CFStringRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
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
 * Managed Private Key.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LAPrivateKey extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LAPrivateKey(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LAPrivateKey alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LAPrivateKey allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Checks if the the provided algorithm can be used for decryption
     * 
     * @param algorithm Cryptographic algorithm
     * @return @c YES in case the key supports the provided algorithm with the specified operation.
     */
    @Generated
    @Selector("canDecryptUsingSecKeyAlgorithm:")
    public native boolean canDecryptUsingSecKeyAlgorithm(@NotNull CFStringRef algorithm);

    /**
     * Checks if the the provided algorithm can be used for performing key exchanges
     * 
     * @param algorithm Cryptographic algorithm
     * @return @c YES in case the key supports the provided algorithm with the specified operation.
     */
    @Generated
    @Selector("canExchangeKeysUsingSecKeyAlgorithm:")
    public native boolean canExchangeKeysUsingSecKeyAlgorithm(@NotNull CFStringRef algorithm);

    /**
     * Checks if the the provided algorithm can be used for signing data
     * 
     * @param algorithm Cryptographic algorithm
     * @return @c YES in case the key supports the provided algorithm with the specified operation.
     */
    @Generated
    @Selector("canSignUsingSecKeyAlgorithm:")
    public native boolean canSignUsingSecKeyAlgorithm(@NotNull CFStringRef algorithm);

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

    /**
     * Decrypts the given ciphertext
     * 
     * @param data      The data to decrypt. The length and format of the data must conform to chosen algorithm,
     *                  typically be less or equal to the value returned by SecKeyGetBlockSize().
     * @param algorithm A @c SecKeyAlgorithm suitable for decrypting data with this key –e.g: @c
     *                  kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA256AESGCM
     * @param handler   Completion handler with plaintext or an error on failure.
     */
    @Generated
    @Selector("decryptData:secKeyAlgorithm:completion:")
    public native void decryptDataSecKeyAlgorithmCompletion(@NotNull NSData data, @NotNull CFStringRef algorithm,
            @NotNull @ObjCBlock(name = "call_decryptDataSecKeyAlgorithmCompletion") Block_decryptDataSecKeyAlgorithmCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_decryptDataSecKeyAlgorithmCompletion {
        @Generated
        void call_decryptDataSecKeyAlgorithmCompletion(@Nullable NSData arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Performs a Diffie-Hellman style key exchange operation
     * 
     * @param publicKey  Remote party's public key.
     * @param algorithm  A @c SecKeyAlgorithm suitable for performing a key exchange with this key –e.g: @c
     *                   kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA256
     * @param parameters Dictionary with parameters, see @c SecKeyKeyExchangeParameter constants. Used algorithm
     *                   determines the set of required and optional parameters to be used.
     * @param handler    Completion handler with the result of the key exchange or an error on failure.
     */
    @Generated
    @Selector("exchangeKeysWithPublicKey:secKeyAlgorithm:secKeyParameters:completion:")
    public native void exchangeKeysWithPublicKeySecKeyAlgorithmSecKeyParametersCompletion(@NotNull NSData publicKey,
            @NotNull CFStringRef algorithm, @NotNull NSDictionary<?, ?> parameters,
            @NotNull @ObjCBlock(name = "call_exchangeKeysWithPublicKeySecKeyAlgorithmSecKeyParametersCompletion") Block_exchangeKeysWithPublicKeySecKeyAlgorithmSecKeyParametersCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exchangeKeysWithPublicKeySecKeyAlgorithmSecKeyParametersCompletion {
        @Generated
        void call_exchangeKeysWithPublicKeySecKeyAlgorithmSecKeyParametersCompletion(@Nullable NSData arg0,
                @Nullable NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native LAPrivateKey init();

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
    public static native LAPrivateKey new_objc();

    /**
     * Offers the public key counterpart of a @c LAPrivateKey instance
     */
    @NotNull
    @Generated
    @Selector("publicKey")
    public native LAPublicKey publicKey();

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
     * Generates a digital signature for the given data.
     * 
     * @param data      The data to be signed, typically the digest of the actual data.
     * @param algorithm A @c SecKeyAlgorithm suitable for generating signatures with this key – e.g: @c
     *                  kSecKeyAlgorithmECDSASignatureMessageX962SHA256
     * @param handler   Completion handler with the signature of given data or an error on failure.
     */
    @Generated
    @Selector("signData:secKeyAlgorithm:completion:")
    public native void signDataSecKeyAlgorithmCompletion(@NotNull NSData data, @NotNull CFStringRef algorithm,
            @NotNull @ObjCBlock(name = "call_signDataSecKeyAlgorithmCompletion") Block_signDataSecKeyAlgorithmCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_signDataSecKeyAlgorithmCompletion {
        @Generated
        void call_signDataSecKeyAlgorithmCompletion(@Nullable NSData arg0, @Nullable NSError arg1);
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