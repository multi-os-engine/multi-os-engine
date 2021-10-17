package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.security.opaque.SecCertificateRef;
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
 * [@interface] TKTokenKeychainKey
 * <p>
 * Interface for propagation token's keys into the keychain.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKTokenKeychainKey extends TKTokenKeychainItem {
    static {
        NatJ.register();
    }

    @Generated
    protected TKTokenKeychainKey(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKTokenKeychainKey alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native TKTokenKeychainKey allocWithZone(VoidPtr zone);

    /**
     * Represents private tag data.  The property is an equivalent to kSecAttrApplicationTag in SecItem.h
     */
    @Generated
    @Selector("applicationTag")
    public native NSData applicationTag();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Indicates whether this key can be used to decrypt data.  The property is an equivalent to kSecAttrCanDecrypt in SecItem.h
     */
    @Generated
    @Selector("canDecrypt")
    public native boolean canDecrypt();

    /**
     * Indicates whether this key can be used to perform Diffie-Hellman style cryptographic key exchange.
     */
    @Generated
    @Selector("canPerformKeyExchange")
    public native boolean canPerformKeyExchange();

    /**
     * Indicates whether this key can be used to create a digital signature.  The property is an equivalent to kSecAttrCanSign in SecItem.h
     */
    @Generated
    @Selector("canSign")
    public native boolean canSign();

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
    public native TKTokenKeychainKey init();

    /**
     * Initialize TKTokenKeychainKey with informations from SecCertificateRef associated with the key.  Use SecCertificateCreateWithData to obtain SecCertificateRef.  If NULL is passed instead of certificate, all properties of created instance must be initialized manually.
     */
    @Generated
    @Selector("initWithCertificate:objectID:")
    public native TKTokenKeychainKey initWithCertificateObjectID(SecCertificateRef certificateRef,
            @Mapped(ObjCObjectMapper.class) Object objectID);

    @Generated
    @Selector("initWithObjectID:")
    public native TKTokenKeychainKey initWithObjectID(@Mapped(ObjCObjectMapper.class) Object objectID);

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
     * Indicates whether this key can be used for login in to the system.
     */
    @Generated
    @Selector("isSuitableForLogin")
    public native boolean isSuitableForLogin();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Indicates the number of bits in this key.  The property is an equivalent to kSecAttrKeySizeInBits in SecItem.h
     */
    @Generated
    @Selector("keySizeInBits")
    @NInt
    public native long keySizeInBits();

    /**
     * Type of the key, currently kSecAttrKeyTypeRSA and kSecAttrKeyTypeECSECPrimeRandom is supported).  The property is an equivalent to kSecAttrKeyType in SecItem.h
     */
    @Generated
    @Selector("keyType")
    public native String keyType();

    @Generated
    @Owned
    @Selector("new")
    public static native TKTokenKeychainKey new_objc();

    /**
     * Contains raw public key data for this private key.
     */
    @Generated
    @Selector("publicKeyData")
    public native NSData publicKeyData();

    /**
     * SHA1 hash of the raw public key.  The property is an equivalent to kSecAttrApplicationLabel in SecItem.h
     */
    @Generated
    @Selector("publicKeyHash")
    public native NSData publicKeyHash();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Represents private tag data.  The property is an equivalent to kSecAttrApplicationTag in SecItem.h
     */
    @Generated
    @Selector("setApplicationTag:")
    public native void setApplicationTag(NSData value);

    /**
     * Indicates whether this key can be used to decrypt data.  The property is an equivalent to kSecAttrCanDecrypt in SecItem.h
     */
    @Generated
    @Selector("setCanDecrypt:")
    public native void setCanDecrypt(boolean value);

    /**
     * Indicates whether this key can be used to perform Diffie-Hellman style cryptographic key exchange.
     */
    @Generated
    @Selector("setCanPerformKeyExchange:")
    public native void setCanPerformKeyExchange(boolean value);

    /**
     * Indicates whether this key can be used to create a digital signature.  The property is an equivalent to kSecAttrCanSign in SecItem.h
     */
    @Generated
    @Selector("setCanSign:")
    public native void setCanSign(boolean value);

    /**
     * Indicates the number of bits in this key.  The property is an equivalent to kSecAttrKeySizeInBits in SecItem.h
     */
    @Generated
    @Selector("setKeySizeInBits:")
    public native void setKeySizeInBits(@NInt long value);

    /**
     * Type of the key, currently kSecAttrKeyTypeRSA and kSecAttrKeyTypeECSECPrimeRandom is supported).  The property is an equivalent to kSecAttrKeyType in SecItem.h
     */
    @Generated
    @Selector("setKeyType:")
    public native void setKeyType(String value);

    /**
     * Contains raw public key data for this private key.
     */
    @Generated
    @Selector("setPublicKeyData:")
    public native void setPublicKeyData(NSData value);

    /**
     * SHA1 hash of the raw public key.  The property is an equivalent to kSecAttrApplicationLabel in SecItem.h
     */
    @Generated
    @Selector("setPublicKeyHash:")
    public native void setPublicKeyHash(NSData value);

    /**
     * Indicates whether this key can be used for login in to the system.
     */
    @Generated
    @Selector("setSuitableForLogin:")
    public native void setSuitableForLogin(boolean value);

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
