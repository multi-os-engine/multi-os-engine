package apple.localauthentication;

import apple.NSObject;
import apple.corefoundation.opaque.CFStringRef;
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
 * The public part of an asymmetric key pair
 * 
 * API-Since: 16.0
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LAPublicKey extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LAPublicKey(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LAPublicKey alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native LAPublicKey allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Checks if the the provided algorithm can be used for encryption with the key.
     * 
     * @param algorithm Cryptographic algorithm
     * @return @c YES in case the key supports the provided algorithm with the specified operation.
     */
    @Generated
    @Selector("canEncryptUsingSecKeyAlgorithm:")
    public native boolean canEncryptUsingSecKeyAlgorithm(@NotNull CFStringRef algorithm);

    /**
     * Checks if the the provided algorithm can be used for verifying signatures with the key.
     * 
     * @param algorithm Cryptographic algorithm
     * @return @c YES in case the key supports the provided algorithm with the specified operation.
     */
    @Generated
    @Selector("canVerifyUsingSecKeyAlgorithm:")
    public native boolean canVerifyUsingSecKeyAlgorithm(@NotNull CFStringRef algorithm);

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
     * Encrypts the given data
     * 
     * @param data      The data to encrypt.
     * @param algorithm A @c SecKeyAlgorithm suitable for encrypting with this key –e.g: @c
     *                  kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA256AESGCM .
     * @param handler   Completion handler with the ciphertext or an error on failure.
     */
    @Generated
    @Selector("encryptData:secKeyAlgorithm:completion:")
    public native void encryptDataSecKeyAlgorithmCompletion(@NotNull NSData data, @NotNull CFStringRef algorithm,
            @NotNull @ObjCBlock(name = "call_encryptDataSecKeyAlgorithmCompletion") Block_encryptDataSecKeyAlgorithmCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_encryptDataSecKeyAlgorithmCompletion {
        @Generated
        void call_encryptDataSecKeyAlgorithmCompletion(@Nullable NSData arg0, @Nullable NSError arg1);
    }

    /**
     * Exports public key bytes.
     * 
     * @param handler Completion handler with the raw bytes of the public key or an error on failure
     */
    @Generated
    @Selector("exportBytesWithCompletion:")
    public native void exportBytesWithCompletion(
            @NotNull @ObjCBlock(name = "call_exportBytesWithCompletion") Block_exportBytesWithCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_exportBytesWithCompletion {
        @Generated
        void call_exportBytesWithCompletion(@Nullable NSData arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native LAPublicKey init();

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
    public static native LAPublicKey new_objc();

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
     * Verifies a digital signature for the given data.
     * 
     * @param signedData The signed data.
     * @param signature  The signature of the given data.
     * @param algorithm  One of @c SecKeyAlgorithm suitable for verifying signatures with this key –e.g: @c
     *                   kSecKeyAlgorithmECDSASignatureMessageX962SHA256
     * @param handler    Completion hadnler with the signature of given data or an error on failure.
     */
    @Generated
    @Selector("verifyData:signature:secKeyAlgorithm:completion:")
    public native void verifyDataSignatureSecKeyAlgorithmCompletion(@NotNull NSData signedData,
            @NotNull NSData signature, @NotNull CFStringRef algorithm,
            @NotNull @ObjCBlock(name = "call_verifyDataSignatureSecKeyAlgorithmCompletion") Block_verifyDataSignatureSecKeyAlgorithmCompletion handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_verifyDataSignatureSecKeyAlgorithmCompletion {
        @Generated
        void call_verifyDataSignatureSecKeyAlgorithmCompletion(@Nullable NSError arg0);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}