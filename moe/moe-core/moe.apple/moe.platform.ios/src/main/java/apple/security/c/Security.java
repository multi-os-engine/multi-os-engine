/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.security.c;

import apple.NSObject;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDateRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.security.opaque.SSLContextRef;
import apple.security.opaque.SecAccessControlRef;
import apple.security.opaque.SecCertificateRef;
import apple.security.opaque.SecIdentityRef;
import apple.security.opaque.SecKeyRef;
import apple.security.opaque.SecPolicyRef;
import apple.security.opaque.SecRandomRef;
import apple.security.opaque.SecTrustRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("Security")
@Runtime(CRuntime.class)
public final class Security {
    static {
        NatJ.register();
    }

    @Generated
    private Security() {
    }

    /**
     * [@function] SecCertificateGetTypeID
     * 
     * Returns the type identifier of SecCertificate instances.
     * 
     * @return The CFTypeID of SecCertificate instances.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecCertificateGetTypeID();

    /**
     * [@function] SecCertificateCreateWithData
     * 
     * Create a certificate given it's DER representation as a CFData.
     * 
     * @param allocator CFAllocator to allocate the certificate with.
     * @param data      DER encoded X.509 certificate.
     * @return Return NULL if the passed-in data is not a valid DER-encoded
     *         X.509 certificate, return a SecCertificateRef otherwise.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native SecCertificateRef SecCertificateCreateWithData(CFAllocatorRef allocator, CFDataRef data);

    /**
     * [@function] SecCertificateCopyData
     * 
     * Return the DER representation of an X.509 certificate.
     * 
     * @param certificate SecCertificate object created with
     *                    SecCertificateCreateWithData().
     * @return DER encoded X.509 certificate.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopyData(SecCertificateRef certificate);

    /**
     * [@function] SecCertificateCopySubjectSummary
     * 
     * Return a simple string which hopefully represents a human
     * understandable summary.
     * 
     * All the data in this string comes from the certificate itself
     * and thus it's in whatever language the certificate itself is in.
     * 
     * @param certificate A reference to the certificate from which to derive
     *                    the subject summary string.
     * @return A CFStringRef which the caller should CFRelease() once it's no
     *         longer needed.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native CFStringRef SecCertificateCopySubjectSummary(SecCertificateRef certificate);

    /**
     * [@function] SecIdentityGetTypeID
     * 
     * Returns the type identifier of SecIdentity instances.
     * 
     * @return The CFTypeID of SecIdentity instances.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecIdentityGetTypeID();

    /**
     * [@function] SecIdentityCopyCertificate
     * 
     * Returns a reference to a certificate for the given identity
     * reference.
     * 
     * @param identityRef    An identity reference.
     * @param certificateRef On return, a pointer to the found certificate
     *                       reference. You are responsible for releasing this reference by calling
     *                       the CFRelease function.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int SecIdentityCopyCertificate(SecIdentityRef identityRef,
            Ptr<SecCertificateRef> certificateRef);

    /**
     * [@function] SecIdentityCopyPrivateKey
     * 
     * Returns the private key associated with an identity.
     * 
     * @param identityRef   An identity reference.
     * @param privateKeyRef On return, a pointer to the private key for the given
     *                      identity. On iOS, the private key must be of class type kSecAppleKeyItemClass.
     *                      You are responsible for releasing this reference by calling the CFRelease function.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int SecIdentityCopyPrivateKey(SecIdentityRef identityRef, Ptr<SecKeyRef> privateKeyRef);

    /**
     * [@function] SecPKCS12Import
     * 
     * Imports the contents of a PKCS12 formatted blob.
     * 
     * @param pkcs12_data The PKCS#12 formatted data to be imported.
     * @param options     A dictionary containing import options. A
     *                    kSecImportExportPassphrase entry is required at minimum. Only password-based
     *                    PKCS12 blobs are currently supported.
     * @param items       On return, an array containing a dictionary for every item
     *                    extracted. Use kSecImportItem constants to access specific elements of
     *                    these dictionaries. Your code must CFRelease the array when it is no longer
     *                    needed.
     * @return errSecSuccess in case of success. errSecDecode means either the
     *         blob can't be read or it is malformed. errSecAuthFailed means an
     *         incorrect password was supplied, or data in the container is damaged.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int SecPKCS12Import(CFDataRef pkcs12_data, CFDictionaryRef options, Ptr<CFArrayRef> items);

    /**
     * [@function] SecAccessControlGetTypeID
     * 
     * Returns the type identifier of SecAccessControl instances.
     * 
     * @return The CFTypeID of SecAccessControl instances.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecAccessControlGetTypeID();

    /**
     * [@function] SecAccessControlCreateWithFlags
     * 
     * Creates new access control object based on protection type and additional flags.
     * 
     * Created access control object should be used as a value for kSecAttrAccessControl attribute in SecItemAdd,
     * SecItemUpdate or SecKeyGeneratePair functions. Accessing keychain items or performing operations on keys which
     * are
     * protected by access control objects can block the execution because of UI which can appear to satisfy the access
     * control
     * conditions, therefore it is recommended to either move those potentially blocking operations out of the main
     * application thread or use combination of kSecUseAuthenticationContext and kSecUseAuthenticationUI attributes to
     * control
     * where the UI interaction can appear.
     * 
     * @param allocator  Allocator to be used by this instance.
     * @param protection Protection class to be used for the item. One of kSecAttrAccessible constants.
     * @param flags      If no flags are set then all operations are allowed.
     * @param error      Additional error information filled in case of failure.
     * @return Newly created access control object.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native SecAccessControlRef SecAccessControlCreateWithFlags(CFAllocatorRef allocator,
            ConstVoidPtr protection, @NUInt long flags, Ptr<CFErrorRef> error);

    /**
     * [@function] SecItemCopyMatching
     * 
     * Returns one or more items which match a search query.
     * 
     * Attributes defining a search are specified by adding key/value
     * pairs to the query dictionary.
     * 
     * A typical query consists of:
     * 
     * * a kSecClass key, whose value is a constant from the Class
     * Constants section that specifies the class of item(s) to be searched
     * * one or more keys from the "Attribute Key Constants" section, whose value
     * is the attribute data to be matched
     * * one or more keys from the "Search Constants" section, whose value is
     * used to further refine the search
     * * a key from the "Return Type Key Constants" section, specifying the type of
     * results desired
     * 
     * Result types are specified as follows:
     * 
     * * To obtain the data of a matching item (CFDataRef), specify
     * kSecReturnData with a value of kCFBooleanTrue.
     * * To obtain the attributes of a matching item (CFDictionaryRef), specify
     * kSecReturnAttributes with a value of kCFBooleanTrue.
     * * To obtain a reference to a matching item (SecKeychainItemRef,
     * SecKeyRef, SecCertificateRef, or SecIdentityRef), specify kSecReturnRef
     * with a value of kCFBooleanTrue.
     * * To obtain a persistent reference to a matching item (CFDataRef),
     * specify kSecReturnPersistentRef with a value of kCFBooleanTrue. Note
     * that unlike normal references, a persistent reference may be stored
     * on disk or passed between processes.
     * * If more than one of these result types is specified, the result is
     * returned as a CFDictionaryRef containing all the requested data.
     * * If a result type is not specified, no results are returned.
     * 
     * By default, this function returns only the first match found. To obtain
     * more than one matching item at a time, specify kSecMatchLimit with a value
     * greater than 1. The result will be a CFArrayRef containing up to that
     * number of matching items; the items' types are described above.
     * 
     * To filter a provided list of items down to those matching the query,
     * specify a kSecMatchItemList whose value is a CFArray of SecKeychainItemRef,
     * SecKeyRef, SecCertificateRef, or SecIdentityRef items. The objects in the
     * provided array must be of the same type.
     * 
     * On iOS, to convert from a persistent item reference to a normal item reference,
     * specify a kSecValuePersistentRef whose value a CFDataRef (the persistent
     * reference), and a kSecReturnRef whose value is kCFBooleanTrue.
     * 
     * On OSX, to convert from persistent item references to normal item references,
     * specify a kSecMatchItemList whose value is a CFArray containing one or
     * more CFDataRef elements (the persistent reference), and a kSecReturnRef
     * whose value is kCFBooleanTrue. The objects in the provided array must be
     * of the same type.
     * 
     * API-Since: 2.0
     * 
     * @param query  A dictionary containing an item class specification and
     *               optional attributes for controlling the search. See the "Keychain
     *               Search Attributes" section for a description of currently defined
     *               search attributes.
     * @param result On return, a CFTypeRef reference to the found item(s). The
     *               exact type of the result is based on the search attributes supplied
     *               in the query, as discussed below.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecItemCopyMatching(CFDictionaryRef query, Ptr<ConstVoidPtr> result);

    /**
     * [@function] SecItemAdd
     * 
     * Add one or more items to a keychain.
     * 
     * Attributes defining an item are specified by adding key/value
     * pairs to the attributes dictionary. To add multiple items to a keychain
     * at once use the kSecUseItemList key with an array of items as its value.
     * This is currently only supported for non password items.
     * 
     * On OSX, To add an item to a particular keychain, supply kSecUseKeychain
     * with a SecKeychainRef as its value.
     * 
     * Result types are specified as follows:
     * 
     * * To obtain the data of the added item (CFDataRef), specify
     * kSecReturnData with a value of kCFBooleanTrue.
     * * To obtain all the attributes of the added item (CFDictionaryRef),
     * specify kSecReturnAttributes with a value of kCFBooleanTrue.
     * * To obtain a reference to the added item (SecKeychainItemRef, SecKeyRef,
     * SecCertiicateRef, or SecIdentityRef), specify kSecReturnRef with a
     * value of kCFBooleanTrue.
     * * To obtain a persistent reference to the added item (CFDataRef), specify
     * kSecReturnPersistentRef with a value of kCFBooleanTrue. Note that
     * unlike normal references, a persistent reference may be stored on disk
     * or passed between processes.
     * * If more than one of these result types is specified, the result is
     * returned as a CFDictionaryRef containing all the requested data.
     * * On iOS, if a result type is not specified, no results are returned.
     * On OSX, the added item is returned.
     * 
     * API-Since: 2.0
     * 
     * @param attributes A dictionary containing an item class specification and
     *                   optional entries specifying the item's attribute values. See the
     *                   "Attribute Key Constants" section for a description of currently defined
     *                   attributes.
     * @param result     On return, a CFTypeRef reference to the newly added item(s).
     *                   The exact type of the result is based on the values supplied
     *                   in attributes, as discussed below. Pass NULL if this result is not
     *                   required.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecItemAdd(CFDictionaryRef attributes, Ptr<ConstVoidPtr> result);

    /**
     * [@function] SecItemUpdate
     * 
     * Modify zero or more items which match a search query.
     * 
     * Attributes defining a search are specified by adding key/value
     * pairs to the query dictionary.
     * 
     * API-Since: 2.0
     * 
     * @param query              A dictionary containing an item class specification and
     *                           optional attributes for controlling the search. See the "Attribute
     *                           Constants" and "Search Constants" sections for a description of
     *                           currently defined search attributes.
     * @param attributesToUpdate A dictionary containing one or more attributes
     *                           whose values should be set to the ones specified. Only real keychain
     *                           attributes are permitted in this dictionary (no "meta" attributes are
     *                           allowed.) See the "Attribute Key Constants" section for a description of
     *                           currently defined value attributes.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecItemUpdate(CFDictionaryRef query, CFDictionaryRef attributesToUpdate);

    /**
     * [@function] SecItemDelete
     * 
     * Delete zero or more items which match a search query.
     * 
     * Attributes defining a search are specified by adding key/value
     * pairs to the query dictionary.
     * 
     * By default, this function deletes all items matching the specified query.
     * You can change this behavior by specifying one of the follow keys:
     * 
     * * To delete an item identified by a transient reference, on iOS, specify
     * kSecValueRef with a item reference. On OS X, give a kSecMatchItemList
     * containing an item reference.
     * * To delete an item identified by a persistent reference, on iOS, specify
     * kSecValuePersistentRef with a persistent reference returned by
     * using the kSecReturnPersistentRef key to SecItemCopyMatching or
     * SecItemAdd. on OSX, use kSecMatchItemList with a persistent reference
     * returned by using the kSecReturnPersistentRef key with
     * SecItemCopyMatching or SecItemAdd.
     * * To delete multiple items specify kSecMatchItemList with an array
     * of references.
     * * If more than one of these result keys is specified, the behavior is
     * undefined.
     * 
     * API-Since: 2.0
     * 
     * @param query A dictionary containing an item class specification and
     *              optional attributes for controlling the search. See the "Attribute
     *              Constants" and "Search Constants" sections for a description of
     *              currently defined search attributes.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecItemDelete(CFDictionaryRef query);

    /**
     * [@function] SecKeyGetTypeID
     * 
     * Returns the type identifier of SecKey instances.
     * 
     * @return The CFTypeID of SecKey instances.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecKeyGetTypeID();

    /**
     * [@function] SecKeyGeneratePair
     * 
     * Generate a private/public keypair.
     * 
     * In order to generate a keypair the parameters dictionary must
     * at least contain the following keys:
     * 
     * * kSecAttrKeyType with a value of kSecAttrKeyTypeRSA or any other
     * kSecAttrKeyType defined in SecItem.h
     * * kSecAttrKeySizeInBits with a value being a CFNumberRef containing
     * the requested key size in bits. Example sizes for RSA keys are:
     * 512, 768, 1024, 2048.
     * 
     * The values below may be set either in the top-level dictionary or in a
     * dictionary that is the value of the kSecPrivateKeyAttrs or
     * kSecPublicKeyAttrs key in the top-level dictionary. Setting these
     * attributes explicitly will override the defaults below. See SecItem.h
     * for detailed information on these attributes including the types of
     * the values.
     * 
     * * kSecAttrLabel default NULL
     * * kSecUseKeychain default NULL, which specifies the default keychain
     * * kSecAttrIsPermanent default false
     * if this key is present and has a Boolean value of true, the key or
     * key pair will be added to the keychain.
     * * kSecAttrTokenID default NULL
     * The CFStringRef ID of the token to generate the key or keypair on. This
     * attribute can contain CFStringRef and can be present only in the top-level
     * parameters dictionary.
     * * kSecAttrApplicationTag default NULL
     * * kSecAttrEffectiveKeySize default NULL same as kSecAttrKeySizeInBits
     * * kSecAttrCanEncrypt default false for private keys, true for public keys
     * * kSecAttrCanDecrypt default true for private keys, false for public keys
     * * kSecAttrCanDerive default true
     * * kSecAttrCanSign default true for private keys, false for public keys
     * * kSecAttrCanVerify default false for private keys, true for public keys
     * * kSecAttrCanWrap default false for private keys, true for public keys
     * * kSecAttrCanUnwrap default true for private keys, false for public keys
     * 
     * NOTE: The function always saves keys in the keychain on macOS and as such attribute
     * kSecAttrIsPermanent is ignored. The function respects attribute kSecAttrIsPermanent
     * on iOS, tvOS and watchOS.
     * It is recommended to use SecKeyCreateRandomKey() which respects kSecAttrIsPermanent
     * on all platforms.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use SecKeyCreateRandomKey
     * 
     * @param parameters A dictionary containing one or more key-value pairs.
     *                   See the discussion sections below for a complete overview of options.
     * @param publicKey  On return, a SecKeyRef reference to the public key.
     * @param privateKey On return, a SecKeyRef reference to the private key.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecKeyGeneratePair(CFDictionaryRef parameters, Ptr<SecKeyRef> publicKey,
            Ptr<SecKeyRef> privateKey);

    /**
     * [@function] SecKeyRawSign
     * 
     * Given a private key and data to sign, generate a digital
     * signature.
     * 
     * If the padding argument is kSecPaddingPKCS1, PKCS1 padding
     * will be performed prior to signing. If this argument is kSecPaddingNone,
     * the incoming data will be signed "as is".
     * 
     * When PKCS1 padding is performed, the maximum length of data that can
     * be signed is the value returned by SecKeyGetBlockSize() - 11.
     * 
     * NOTE: The behavior this function with kSecPaddingNone is undefined if the
     * first byte of dataToSign is zero; there is no way to verify leading zeroes
     * as they are discarded during the calculation.
     * 
     * If you want to generate a proper PKCS1 style signature with DER encoding
     * of the digest type - and the dataToSign is a SHA1 digest - use
     * kSecPaddingPKCS1SHA1.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use SecKeyCreateSignature
     * 
     * @param key           Private key with which to sign.
     * @param padding       See Padding Types above, typically kSecPaddingPKCS1SHA1.
     * @param dataToSign    The data to be signed, typically the digest of the
     *                      actual data.
     * @param dataToSignLen Length of dataToSign in bytes.
     * @param sig           Pointer to buffer in which the signature will be returned.
     * @param sigLen        IN/OUT maximum length of sig buffer on input, actualy
     *                      length of sig on output.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecKeyRawSign(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String dataToSign,
            @NUInt long dataToSignLen, BytePtr sig, NUIntPtr sigLen);

    /**
     * [@function] SecKeyRawVerify
     * 
     * Given a public key, data which has been signed, and a signature,
     * verify the signature.
     * 
     * If the padding argument is kSecPaddingPKCS1, PKCS1 padding
     * will be checked during verification. If this argument is kSecPaddingNone,
     * the incoming data will be compared directly to sig.
     * 
     * If you are verifying a proper PKCS1-style signature, with DER encoding
     * of the digest type - and the signedData is a SHA1 digest - use
     * kSecPaddingPKCS1SHA1.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use SecKeyVerifySignature
     * 
     * @param key           Public key with which to verify the signature.
     * @param padding       See Padding Types above, typically kSecPaddingPKCS1SHA1.
     * @param signedData    The data over which sig is being verified, typically
     *                      the digest of the actual data.
     * @param signedDataLen Length of signedData in bytes.
     * @param sig           Pointer to the signature to verify.
     * @param sigLen        Length of sig in bytes.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecKeyRawVerify(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String signedData,
            @NUInt long signedDataLen,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String sig,
            @NUInt long sigLen);

    /**
     * [@function] SecKeyEncrypt
     * 
     * Encrypt a block of plaintext.
     * 
     * If the padding argument is kSecPaddingPKCS1 or kSecPaddingOAEP,
     * PKCS1 (respectively kSecPaddingOAEP) padding will be performed prior to encryption.
     * If this argument is kSecPaddingNone, the incoming data will be encrypted "as is".
     * kSecPaddingOAEP is the recommended value. Other value are not recommended
     * for security reason (Padding attack or malleability).
     * 
     * When PKCS1 padding is performed, the maximum length of data that can
     * be encrypted is the value returned by SecKeyGetBlockSize() - 11.
     * 
     * When memory usage is a critical issue, note that the input buffer
     * (plainText) can be the same as the output buffer (cipherText).
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use SecKeyCreateEncryptedData
     * 
     * @param key           Public key with which to encrypt the data.
     * @param padding       See Padding Types above, typically kSecPaddingPKCS1.
     * @param plainText     The data to encrypt.
     * @param plainTextLen  Length of plainText in bytes, this must be less
     *                      or equal to the value returned by SecKeyGetBlockSize().
     * @param cipherText    Pointer to the output buffer.
     * @param cipherTextLen On input, specifies how much space is available at
     *                      cipherText; on return, it is the actual number of cipherText bytes written.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecKeyEncrypt(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String plainText,
            @NUInt long plainTextLen, BytePtr cipherText, NUIntPtr cipherTextLen);

    /**
     * [@function] SecKeyDecrypt
     * 
     * Decrypt a block of ciphertext.
     * 
     * If the padding argument is kSecPaddingPKCS1 or kSecPaddingOAEP,
     * the corresponding padding will be removed after decryption.
     * If this argument is kSecPaddingNone, the decrypted data will be returned "as is".
     * 
     * When memory usage is a critical issue, note that the input buffer
     * (plainText) can be the same as the output buffer (cipherText).
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use SecKeyCreateDecryptedData
     * 
     * @param key           Private key with which to decrypt the data.
     * @param padding       See Padding Types above, typically kSecPaddingPKCS1.
     * @param cipherText    The data to decrypt.
     * @param cipherTextLen Length of cipherText in bytes, this must be less
     *                      or equal to the value returned by SecKeyGetBlockSize().
     * @param plainText     Pointer to the output buffer.
     * @param plainTextLen  On input, specifies how much space is available at
     *                      plainText; on return, it is the actual number of plainText bytes written.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecKeyDecrypt(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cipherText,
            @NUInt long cipherTextLen, BytePtr plainText, NUIntPtr plainTextLen);

    /**
     * [@function] SecKeyGetBlockSize
     * 
     * Returns block length of the key in bytes.
     * 
     * If for example key is an RSA key the value returned by
     * this function is the size of the modulus.
     * 
     * API-Since: 2.0
     * 
     * @param key The key for which the block length is requested.
     * @return The block length of the key in bytes.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecKeyGetBlockSize(SecKeyRef key);

    /**
     * [@function] SecKeyCreateRandomKey
     * 
     * Generates a new public/private key pair.
     * 
     * In order to generate a keypair the parameters dictionary must
     * at least contain the following keys:
     * 
     * * kSecAttrKeyType with a value being kSecAttrKeyTypeRSA or any other
     * kSecAttrKeyType defined in SecItem.h
     * * kSecAttrKeySizeInBits with a value being a CFNumberRef or CFStringRef
     * containing the requested key size in bits. Example sizes for RSA
     * keys are: 512, 768, 1024, 2048.
     * 
     * The values below may be set either in the top-level dictionary or in a
     * dictionary that is the value of the kSecPrivateKeyAttrs or
     * kSecPublicKeyAttrs key in the top-level dictionary. Setting these
     * attributes explicitly will override the defaults below. See SecItem.h
     * for detailed information on these attributes including the types of
     * the values.
     * 
     * * kSecAttrLabel default NULL
     * * kSecAttrIsPermanent if this key is present and has a Boolean value of true,
     * the key or key pair will be added to the default keychain.
     * * kSecAttrTokenID if this key should be generated on specified token. This
     * attribute can contain CFStringRef and can be present only in the top-level
     * parameters dictionary.
     * * kSecAttrApplicationTag default NULL
     * * kSecAttrEffectiveKeySize default NULL same as kSecAttrKeySizeInBits
     * * kSecAttrCanEncrypt default false for private keys, true for public keys
     * * kSecAttrCanDecrypt default true for private keys, false for public keys
     * * kSecAttrCanDerive default true
     * * kSecAttrCanSign default true for private keys, false for public keys
     * * kSecAttrCanVerify default false for private keys, true for public keys
     * * kSecAttrCanWrap default false for private keys, true for public keys
     * * kSecAttrCanUnwrap default true for private keys, false for public keys
     * 
     * API-Since: 10.0
     * 
     * @param parameters A dictionary containing one or more key-value pairs.
     *                   See the discussion sections below for a complete overview of options.
     * @param error      On error, will be populated with an error object describing the failure.
     *                   See "Security Error Codes" (SecBase.h).
     * @return Newly generated private key. To get associated public key, use SecKeyCopyPublicKey().
     */
    @Generated
    @CFunction
    public static native SecKeyRef SecKeyCreateRandomKey(CFDictionaryRef parameters, Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyCreateWithData
     * 
     * Create a SecKey from a well-defined external representation.
     * 
     * This function does not add keys to any keychain, but the SecKey object it returns can be added
     * to keychain using the SecItemAdd function.
     * The requested data format depend on the type of key (kSecAttrKeyType) being created:
     * * kSecAttrKeyTypeRSA PKCS#1 format, public key can be also in x509 public key format
     * * kSecAttrKeyTypeECSECPrimeRandom ANSI X9.63 format (04 || X || Y [ || K])
     * 
     * API-Since: 10.0
     * 
     * @param keyData    CFData representing the key. The format of the data depends on the type of key being created.
     * @param attributes Dictionary containing attributes describing the key to be imported. The keys in this dictionary
     *                   are kSecAttr* constants from SecItem.h. Mandatory attributes are:
     *                   * kSecAttrKeyType
     *                   * kSecAttrKeyClass
     * @param error      On error, will be populated with an error object describing the failure.
     *                   See "Security Error Codes" (SecBase.h).
     * @return A SecKey object representing the key, or NULL on failure.
     */
    @Generated
    @CFunction
    public static native SecKeyRef SecKeyCreateWithData(CFDataRef keyData, CFDictionaryRef attributes,
            Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyCopyExternalRepresentation
     * 
     * Create an external representation for the given key suitable for the key's type.
     * 
     * This function may fail if the key is not exportable (e.g., bound to a smart card or Secure Enclave).
     * The format in which the key will be exported depends on the type of key:
     * * kSecAttrKeyTypeRSA PKCS#1 format
     * * kSecAttrKeyTypeECSECPrimeRandom ANSI X9.63 format (04 || X || Y [ || K])
     * 
     * API-Since: 10.0
     * 
     * @param key   The key to be exported.
     * @param error On error, will be populated with an error object describing the failure.
     *              See "Security Error Codes" (SecBase.h).
     * @return A CFData representing the key in a format suitable for that key type.
     */
    @Generated
    @CFunction
    public static native CFDataRef SecKeyCopyExternalRepresentation(SecKeyRef key, Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyCopyAttributes
     * 
     * Retrieve keychain attributes of a key.
     * 
     * The attributes provided by this function are:
     * * kSecAttrCanEncrypt
     * * kSecAttrCanDecrypt
     * * kSecAttrCanDerive
     * * kSecAttrCanSign
     * * kSecAttrCanVerify
     * * kSecAttrKeyClass
     * * kSecAttrKeyType
     * * kSecAttrKeySizeInBits
     * * kSecAttrTokenID
     * * kSecAttrApplicationLabel
     * The set of values is not fixed. Future versions may return more values in this dictionary.
     * 
     * API-Since: 10.0
     * 
     * @param key The key whose attributes are to be retrieved.
     * @return Dictionary containing attributes of the key. The keys that populate this dictionary are defined
     *         and discussed in SecItem.h.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef SecKeyCopyAttributes(SecKeyRef key);

    /**
     * [@function] SecKeyCopyPublicKey
     * 
     * Retrieve the public key from a key pair or private key.
     * 
     * Fails if key does not contain a public key or no public key can be computed from it.
     * 
     * API-Since: 10.0
     * 
     * @param key The key from which to retrieve a public key.
     * @return The public key or NULL if public key is not available for specified key.
     */
    @Generated
    @CFunction
    public static native SecKeyRef SecKeyCopyPublicKey(SecKeyRef key);

    /**
     * [@function] SecKeyCreateSignature
     * 
     * Given a private key and data to sign, generate a digital signature.
     * 
     * Computes digital signature using specified key over input data. The operation algorithm
     * further defines the exact format of input data, operation to be performed and output signature.
     * 
     * API-Since: 10.0
     * 
     * @param key        Private key with which to sign.
     * @param algorithm  One of SecKeyAlgorithm constants suitable to generate signature with this key.
     * @param dataToSign The data to be signed, typically the digest of the actual data.
     * @param error      On error, will be populated with an error object describing the failure.
     *                   See "Security Error Codes" (SecBase.h).
     * @return The signature over dataToSign represented as a CFData, or NULL on failure.
     */
    @Generated
    @CFunction
    public static native CFDataRef SecKeyCreateSignature(SecKeyRef key, CFStringRef algorithm, CFDataRef dataToSign,
            Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyVerifySignature
     * 
     * Given a public key, data which has been signed, and a signature, verify the signature.
     * 
     * Verifies digital signature operation using specified key and signed data. The operation algorithm
     * further defines the exact format of input data, signature and operation to be performed.
     * 
     * API-Since: 10.0
     * 
     * @param key        Public key with which to verify the signature.
     * @param algorithm  One of SecKeyAlgorithm constants suitable to verify signature with this key.
     * @param signedData The data over which sig is being verified, typically the digest of the actual data.
     * @param signature  The signature to verify.
     * @param error      On error, will be populated with an error object describing the failure.
     *                   See "Security Error Codes" (SecBase.h).
     * @return True if the signature was valid, False otherwise.
     */
    @Generated
    @CFunction
    public static native byte SecKeyVerifySignature(SecKeyRef key, CFStringRef algorithm, CFDataRef signedData,
            CFDataRef signature, Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyCreateEncryptedData
     * 
     * Encrypt a block of plaintext.
     * 
     * Encrypts plaintext data using specified key. The exact type of the operation including the format
     * of input and output data is specified by encryption algorithm.
     * 
     * API-Since: 10.0
     * 
     * @param key       Public key with which to encrypt the data.
     * @param algorithm One of SecKeyAlgorithm constants suitable to perform encryption with this key.
     * @param plaintext The data to encrypt. The length and format of the data must conform to chosen algorithm,
     *                  typically be less or equal to the value returned by SecKeyGetBlockSize().
     * @param error     On error, will be populated with an error object describing the failure.
     *                  See "Security Error Codes" (SecBase.h).
     * @return The ciphertext represented as a CFData, or NULL on failure.
     */
    @Generated
    @CFunction
    public static native CFDataRef SecKeyCreateEncryptedData(SecKeyRef key, CFStringRef algorithm, CFDataRef plaintext,
            Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyCreateDecryptedData
     * 
     * Decrypt a block of ciphertext.
     * 
     * Decrypts ciphertext data using specified key. The exact type of the operation including the format
     * of input and output data is specified by decryption algorithm.
     * 
     * API-Since: 10.0
     * 
     * @param key        Private key with which to decrypt the data.
     * @param algorithm  One of SecKeyAlgorithm constants suitable to perform decryption with this key.
     * @param ciphertext The data to decrypt. The length and format of the data must conform to chosen algorithm,
     *                   typically be less or equal to the value returned by SecKeyGetBlockSize().
     * @param error      On error, will be populated with an error object describing the failure.
     *                   See "Security Error Codes" (SecBase.h).
     * @return The plaintext represented as a CFData, or NULL on failure.
     */
    @Generated
    @CFunction
    public static native CFDataRef SecKeyCreateDecryptedData(SecKeyRef key, CFStringRef algorithm, CFDataRef ciphertext,
            Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyCopyKeyExchangeResult
     * 
     * Perform Diffie-Hellman style of key exchange operation, optionally with additional key-derivation steps.
     * 
     * @param algorithm  One of SecKeyAlgorithm constants suitable to perform this operation.
     * @param publicKey  Remote party's public key.
     * @param parameters Dictionary with parameters, see SecKeyKeyExchangeParameter constants. Used algorithm
     *                   determines the set of required and optional parameters to be used.
     * @param error      Pointer to an error object on failure.
     *                   See "Security Error Codes" (SecBase.h).
     * @return Result of key exchange operation as a CFDataRef, or NULL on failure.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native CFDataRef SecKeyCopyKeyExchangeResult(SecKeyRef privateKey, CFStringRef algorithm,
            SecKeyRef publicKey, CFDictionaryRef parameters, Ptr<CFErrorRef> error);

    /**
     * [@function] SecKeyIsAlgorithmSupported
     * 
     * Checks whether key supports specified algorithm for specified operation.
     * 
     * @param key       Key to query
     * @param operation Operation type for which the key is queried
     * @param algorithm Algorithm which is queried
     * @return True if key supports specified algorithm for specified operation, False otherwise.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native byte SecKeyIsAlgorithmSupported(SecKeyRef key, @NInt long operation, CFStringRef algorithm);

    /**
     * [@function] SecPolicyGetTypeID
     * 
     * Returns the type identifier of SecPolicy instances.
     * 
     * @return The CFTypeID of SecPolicy instances.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecPolicyGetTypeID();

    /**
     * [@function] SecPolicyCopyProperties
     * 
     * Returns a dictionary of this policy's properties.
     * 
     * This function returns the properties for a policy, as set by the
     * policy's construction function or by a prior call to SecPolicySetProperties.
     * 
     * API-Since: 7.0
     * 
     * @param policyRef A policy reference.
     * @return A properties dictionary. See "Policy Value Constants" for a list
     *         of currently defined property keys. It is the caller's responsibility to
     *         CFRelease this reference when it is no longer needed.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef SecPolicyCopyProperties(SecPolicyRef policyRef);

    /**
     * [@function] SecPolicyCreateBasicX509
     * 
     * Returns a policy object for the default X.509 policy.
     * 
     * @return A policy object. The caller is responsible for calling CFRelease
     *         on this when it is no longer needed.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateBasicX509();

    /**
     * [@function] SecPolicyCreateSSL
     * 
     * Returns a policy object for evaluating SSL certificate chains.
     * 
     * @param server   Passing true for this parameter creates a policy for SSL
     *                 server certificates.
     * @param hostname (Optional) If present, the policy will require the specified
     *                 hostname to match the hostname in the leaf certificate.
     * @return A policy object. The caller is responsible for calling CFRelease
     *         on this when it is no longer needed.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateSSL(byte server, CFStringRef hostname);

    /**
     * [@function] SecPolicyCreateRevocation
     * 
     * Returns a policy object for checking revocation of certificates.
     * 
     * Use this function to create a revocation policy with behavior
     * specified by revocationFlags. See the "Revocation Policy Constants" section
     * for a description of these flags. Note: it is usually not necessary to
     * create a revocation policy yourself unless you wish to override default
     * system behavior (e.g. to force a particular method, or to disable
     * revocation checking entirely.)
     * 
     * API-Since: 7.0
     * 
     * @return A policy object. The caller is responsible for calling CFRelease
     *         on this when it is no longer needed.
     * @param revocationFlags Flags to specify revocation checking options.
     */
    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateRevocation(@NUInt long revocationFlags);

    /**
     * [@function] SecPolicyCreateWithProperties
     * 
     * Returns a policy object based on an object identifier for the
     * policy type. See the "Policy Constants" section for a list of defined
     * policy object identifiers.
     * 
     * @param policyIdentifier The identifier for the desired policy type.
     * @param properties       (Optional) A properties dictionary. See "Policy Value
     *                         Constants" for a list of currently defined property keys.
     * @return The returned policy reference, or NULL if the policy could not be
     *         created.
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateWithProperties(ConstVoidPtr policyIdentifier,
            CFDictionaryRef properties);

    /**
     * [@function] SecRandomCopyBytes
     * 
     * Return count random bytes in *bytes, allocated by the caller. It
     * is critical to check the return value for error.
     * 
     * If @p rnd is unrecognized or unsupported, @p kSecRandomDefault is
     * used.
     * 
     * API-Since: 2.0
     * 
     * @param rnd
     *              Only @p kSecRandomDefault is supported.
     * 
     * @param count
     *              The number of bytes to generate.
     * 
     * @param bytes
     *              A buffer to fill with random output.
     * 
     * @return Return 0 on success, any other value on failure.
     */
    @Generated
    @CFunction
    public static native int SecRandomCopyBytes(SecRandomRef rnd, @NUInt long count, VoidPtr bytes);

    /**
     * [@function] SecAddSharedWebCredential
     * 
     * Asynchronously store (or update) a shared password for a website.
     * 
     * This function adds a shared password item which will be accessible by Safari and applications that have the
     * specified fully-qualified domain name in their 'com.apple.developer.associated-domains' entitlement. If a shared
     * password item already exists for the specified website and account, it will be updated with the provided
     * password. To remove a password, pass NULL for the password parameter.
     * 
     * Note: since a request involving shared web credentials may potentially require user interaction or other
     * verification to be approved, this function is dispatched asynchronously; your code provides a completion handler
     * that will be called once the results (if any) are available.
     * 
     * API-Since: 8.0
     * 
     * @param fqdn              The fully qualified domain name of the website requiring the password.
     * @param account           The account name associated with this password.
     * @param password          The password to be stored. Pass NULL to remove a shared password if it exists.
     * @param completionHandler A block which will be invoked when the function has completed. If the shared password
     *                          was successfully added (or removed), the CFErrorRef parameter passed to the block will
     *                          be NULL. If the error parameter is non-NULL, an error occurred and the error reference
     *                          will hold the result. Note: the error reference will be automatically released after
     *                          this handler is called, though you may optionally retain it for as long as needed.
     */
    @Generated
    @CFunction
    public static native void SecAddSharedWebCredential(CFStringRef fqdn, CFStringRef account, CFStringRef password,
            @ObjCBlock(name = "call_SecAddSharedWebCredential") Block_SecAddSharedWebCredential completionHandler);

    /**
     * [@function] SecRequestSharedWebCredential
     * 
     * Asynchronously obtain one or more shared passwords for a website.
     * 
     * This function requests one or more shared passwords for a given website, depending on whether the optional
     * account parameter is supplied. To obtain results, the website specified in the fqdn parameter must be one which
     * matches an entry in the calling application's 'com.apple.developer.associated-domains' entitlement.
     * 
     * If matching shared password items are found, the credentials provided to the completionHandler will be a
     * CFArrayRef containing CFDictionaryRef entries. Each dictionary entry will contain the following pairs (see
     * Security/SecItem.h):
     * key: kSecAttrServer value: CFStringRef (the website)
     * key: kSecAttrAccount value: CFStringRef (the account)
     * key: kSecSharedPassword value: CFStringRef (the password)
     * 
     * If the found item specifies a non-standard port number (i.e. other than 443 for https), the following key may
     * also be present:
     * key: kSecAttrPort value: CFNumberRef (the port number)
     * 
     * Note: since a request involving shared web credentials may potentially require user interaction or other
     * verification to be approved, this function is dispatched asynchronously; your code provides a completion handler
     * that will be called once the results (if any) are available.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use ASAuthorizationController to make an ASAuthorizationPasswordRequest
     * (AuthenticationServices framework)
     * 
     * @param fqdn              (Optional) Fully qualified domain name of the website for which passwords are being
     *                          requested. If NULL is passed in this argument, the domain name(s) listed in the calling
     *                          application's 'com.apple.developer.associated-domains' entitlement are searched
     *                          implicitly.
     * @param account           (Optional) Account name for which passwords are being requested. The account may be NULL
     *                          to request all shared credentials which are available for the site, allowing the caller
     *                          to discover an existing account.
     * @param completionHandler A block which will be called to deliver the requested credentials. If no matching items
     *                          were found, the credentials array will be empty, and the CFErrorRef parameter will
     *                          provide the error result. Note: the credentials and error references will be
     *                          automatically released after this handler is called, though you may optionally retain
     *                          either for as long as needed.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void SecRequestSharedWebCredential(CFStringRef fqdn, CFStringRef account,
            @ObjCBlock(name = "call_SecRequestSharedWebCredential") Block_SecRequestSharedWebCredential completionHandler);

    /**
     * [@function] SecCreateSharedWebCredentialPassword
     * 
     * Returns a randomly generated password.
     * 
     * @return CFStringRef password in the form xxx-xxx-xxx-xxx where x is taken from the sets "abcdefghkmnopqrstuvwxy",
     *         "ABCDEFGHJKLMNPQRSTUVWXYZ", "3456789" with at least one character from each set being present.
     * 
     *         API-Since: 8.0
     */
    @Generated
    @CFunction
    public static native CFStringRef SecCreateSharedWebCredentialPassword();

    /**
     * [@function] SecTrustGetTypeID
     * 
     * Returns the type identifier of SecTrust instances.
     * 
     * @return The CFTypeID of SecTrust instances.
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecTrustGetTypeID();

    /**
     * [@function] SecTrustCreateWithCertificates
     * 
     * Creates a trust object based on the given certificates and
     * policies.
     * 
     * If multiple policies are passed in, all policies must verify
     * for the chain to be considered valid.
     * 
     * API-Since: 2.0
     * 
     * @param certificates The group of certificates to verify. This can either
     *                     be a CFArrayRef of SecCertificateRef objects or a single SecCertificateRef
     * @param policies     An array of one or more policies. You may pass a
     *                     SecPolicyRef to represent a single policy.
     * @param trust        On return, a pointer to the trust management reference.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustCreateWithCertificates(ConstVoidPtr certificates, ConstVoidPtr policies,
            Ptr<SecTrustRef> trust);

    /**
     * [@function] SecTrustSetPolicies
     * 
     * Set the policies for which trust should be verified.
     * 
     * This function will invalidate the existing trust result,
     * requiring a fresh evaluation for the newly-set policies.
     * 
     * API-Since: 6.0
     * 
     * @param trust    A trust reference.
     * @param policies An array of one or more policies. You may pass a
     *                 SecPolicyRef to represent a single policy.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustSetPolicies(SecTrustRef trust, ConstVoidPtr policies);

    /**
     * [@function] SecTrustCopyPolicies
     * 
     * Returns an array of policies used for this evaluation.
     * 
     * @param trust    A reference to a trust object.
     * @param policies On return, an array of policies used by this trust.
     *                 Call the CFRelease function to release this reference.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int SecTrustCopyPolicies(SecTrustRef trust, Ptr<CFArrayRef> policies);

    /**
     * [@function] SecTrustSetNetworkFetchAllowed
     * 
     * Specifies whether a trust evaluation is permitted to fetch missing
     * intermediate certificates from the network.
     * 
     * By default, network fetch of missing certificates is enabled if
     * the trust evaluation includes the SSL policy, otherwise it is disabled.
     * 
     * API-Since: 7.0
     * 
     * @param trust      A trust reference.
     * @param allowFetch If true, and a certificate's issuer is not present in the
     *                   trust reference but its network location is known, the evaluation is permitted
     *                   to attempt to download it automatically. Pass false to disable network fetch
     *                   for this trust evaluation.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustSetNetworkFetchAllowed(SecTrustRef trust, byte allowFetch);

    /**
     * [@function] SecTrustGetNetworkFetchAllowed
     * 
     * Returns whether a trust evaluation is permitted to fetch missing
     * intermediate certificates from the network.
     * 
     * By default, network fetch of missing certificates is enabled if
     * the trust evaluation includes the SSL policy, otherwise it is disabled.
     * 
     * API-Since: 7.0
     * 
     * @param trust      A trust reference.
     * @param allowFetch On return, the boolean pointed to by this parameter is
     *                   set to true if the evaluation is permitted to download missing certificates.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustGetNetworkFetchAllowed(SecTrustRef trust, BytePtr allowFetch);

    /**
     * [@function] SecTrustSetAnchorCertificates
     * 
     * Sets the anchor certificates for a given trust.
     * 
     * Calling this function without also calling
     * SecTrustSetAnchorCertificatesOnly() will disable trusting any
     * anchors other than the ones in anchorCertificates.
     * 
     * API-Since: 2.0
     * 
     * @param trust              A reference to a trust object.
     * @param anchorCertificates An array of anchor certificates.
     *                           Pass NULL to restore the default set of anchor certificates.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustSetAnchorCertificates(SecTrustRef trust, CFArrayRef anchorCertificates);

    /**
     * [@function] SecTrustSetAnchorCertificatesOnly
     * 
     * Reenables trusting anchor certificates in addition to those
     * passed in via the SecTrustSetAnchorCertificates API.
     * 
     * @param trust                  A reference to a trust object.
     * @param anchorCertificatesOnly If true, disables trusting any anchors other
     *                               than the ones passed in via SecTrustSetAnchorCertificates(). If false,
     *                               the built in anchor certificates are also trusted.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int SecTrustSetAnchorCertificatesOnly(SecTrustRef trust, byte anchorCertificatesOnly);

    /**
     * [@function] SecTrustCopyCustomAnchorCertificates
     * 
     * Returns an array of custom anchor certificates used by a given
     * trust, as set by a prior call to SecTrustSetAnchorCertificates, or NULL if
     * no custom anchors have been specified.
     * 
     * @param trust   A reference to a trust object.
     * @param anchors On return, an array of custom anchor certificates (roots)
     *                used by this trust, or NULL if no custom anchors have been specified. Call
     *                the CFRelease function to release this reference.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native int SecTrustCopyCustomAnchorCertificates(SecTrustRef trust, Ptr<CFArrayRef> anchors);

    /**
     * [@function] SecTrustSetVerifyDate
     * 
     * Set the date for which the trust should be verified.
     * 
     * This function lets you evaluate certificate validity for a
     * given date (for example, to determine if a signature was valid on the date
     * it was signed, even if the certificate has since expired.) If this function
     * is not called, the time at which SecTrustEvaluate() is called is used
     * implicitly as the verification time.
     * 
     * API-Since: 2.0
     * 
     * @param trust      A reference to a trust object.
     * @param verifyDate The date for which to verify trust.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustSetVerifyDate(SecTrustRef trust, CFDateRef verifyDate);

    /**
     * [@function] SecTrustGetVerifyTime
     * 
     * Returns the verify time.
     * 
     * This function retrieves the verification time for the given
     * trust reference, as set by a prior call to SecTrustSetVerifyDate(). If the
     * verification time has not been set, this function returns a value of 0,
     * indicating that the current date/time is implicitly used for verification.
     * 
     * API-Since: 2.0
     * 
     * @param trust A reference to the trust object being verified.
     * @return A CFAbsoluteTime value representing the time at which certificates
     *         should be checked for validity.
     */
    @Generated
    @CFunction
    public static native double SecTrustGetVerifyTime(SecTrustRef trust);

    /**
     * [@function] SecTrustEvaluate
     * 
     * Evaluates a trust reference synchronously.
     * 
     * This function will completely evaluate trust before returning,
     * possibly including network access to fetch intermediate certificates or to
     * perform revocation checking. Since this function can block during those
     * operations, you should call it from within a function that is placed on a
     * dispatch queue, or in a separate thread from your application's main
     * run loop. Alternatively, you can use the SecTrustEvaluateAsync function.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * 
     * @param trust  A reference to the trust object to evaluate.
     * @param result A pointer to a result type.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecTrustEvaluate(SecTrustRef trust, IntPtr result);

    /**
     * [@function] SecTrustEvaluateAsync
     * 
     * Evaluates a trust reference asynchronously.
     * 
     * @param trust  A reference to the trust object to evaluate.
     * @param queue  A dispatch queue on which the result callback should be
     *               executed. Pass NULL to use the current dispatch queue.
     * @param result A SecTrustCallback block which will be executed when the
     *               trust evaluation is complete.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 7.0
     *         Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SecTrustEvaluateAsync(SecTrustRef trust, NSObject queue,
            @ObjCBlock(name = "call_SecTrustEvaluateAsync") Block_SecTrustEvaluateAsync result);

    /**
     * [@function] SecTrustGetTrustResult
     * 
     * This function replaces SecTrustGetResult for the purpose of
     * obtaining the current evaluation result of a given trust reference.
     * 
     * API-Since: 7.0
     * 
     * @param trust  A reference to a trust object.
     * @param result A pointer to the result from the most recent call to
     *               SecTrustEvaluate for this trust reference. If SecTrustEvaluate has not been
     *               called or trust parameters have changed, the result is kSecTrustResultInvalid.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustGetTrustResult(SecTrustRef trust, IntPtr result);

    /**
     * [@function] SecTrustCopyPublicKey
     * 
     * Return the public key for a leaf certificate after it has
     * been evaluated.
     * 
     * @param trust A reference to the trust object which has been evaluated.
     * @return The certificate's public key, or NULL if it the public key could
     *         not be extracted (this can happen if the public key algorithm is not
     *         supported). The caller is responsible for calling CFRelease on the
     *         returned key when it is no longer needed.
     * 
     *         API-Since: 2.0
     *         Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native SecKeyRef SecTrustCopyPublicKey(SecTrustRef trust);

    /**
     * [@function] SecTrustGetCertificateCount
     * 
     * Returns the number of certificates in an evaluated certificate
     * chain.
     * 
     * Important: if the trust reference has not yet been evaluated,
     * this function will evaluate it first before returning. If speed is critical,
     * you may want to call SecTrustGetTrustResult first to make sure that a
     * result other than kSecTrustResultInvalid is present for the trust object.
     * 
     * API-Since: 2.0
     * 
     * @param trust A reference to a trust object.
     * @return The number of certificates in the trust chain, including the anchor.
     */
    @Generated
    @CFunction
    @NInt
    public static native long SecTrustGetCertificateCount(SecTrustRef trust);

    /**
     * [@function] SecTrustGetCertificateAtIndex
     * 
     * Returns a certificate from the trust chain.
     * 
     * This API is fundamentally not thread-safe -- other threads using the same
     * trust object may trigger trust evaluations that release the returned certificate or change the
     * certificate chain as a thread is iterating through the certificate chain. The replacement function
     * SecTrustCopyCertificateChain provides thread-safe results.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * 
     * @param trust Reference to a trust object.
     * @param ix    The index of the requested certificate. Indices run from 0
     *              (leaf) to the anchor (or last certificate found if no anchor was found).
     *              The leaf cert (index 0) is always present regardless of whether the trust
     *              reference has been evaluated or not.
     * @return A SecCertificateRef for the requested certificate.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native SecCertificateRef SecTrustGetCertificateAtIndex(SecTrustRef trust, @NInt long ix);

    /**
     * [@function] SecTrustCopyExceptions
     * 
     * Returns an opaque cookie which will allow future evaluations
     * of the current certificate to succeed.
     * 
     * Normally this API should only be called once the errors have
     * been presented to the user and the user decided to trust the current
     * certificate chain regardless of the errors being presented, for the
     * current application/server/protocol combination.
     * 
     * API-Since: 4.0
     * 
     * @param trust A reference to an evaluated trust object.
     * @return An opaque cookie which when passed to SecTrustSetExceptions() will
     *         cause a call to SecTrustEvaluate() return kSecTrustResultProceed. This
     *         will happen upon subsequent evaluation of the current certificate unless
     *         some new error starts happening that wasn't being reported when the cookie
     *         was returned from this function (for example, if the certificate expires
     *         then evaluation will start failing again until a new cookie is obtained.)
     */
    @Generated
    @CFunction
    public static native CFDataRef SecTrustCopyExceptions(SecTrustRef trust);

    /**
     * [@function] SecTrustSetExceptions
     * 
     * Set a trust cookie to be used for evaluating this certificate chain.
     * 
     * Clients of this interface will need to establish the context of this
     * exception to later decide when this exception cookie is to be used.
     * Examples of this context would be the server we are connecting to, the ssid
     * of the wireless network for which this cert is needed, the account for which
     * this cert should be considered valid, and so on.
     * 
     * API-Since: 4.0
     * 
     * @param trust      A reference to a trust object.
     * @param exceptions An exceptions cookie as returned by a call to
     *                   SecTrustCopyExceptions() in the past. You may pass NULL to clear any
     *                   exceptions which have been previously set on this trust reference.
     * @return Upon calling SecTrustEvaluate(), any failures that were present at the
     *         time the exceptions object was created are ignored, and instead of returning
     *         kSecTrustResultRecoverableTrustFailure, kSecTrustResultProceed will be returned
     *         (if the certificate for which exceptions was created matches the current leaf
     *         certificate).
     * @return Returns true if the exceptions cookies was valid and matches the current
     *         leaf certificate, false otherwise. This function will invalidate the existing
     *         trust result, requiring a subsequent evaluation for the newly-set exceptions.
     *         Note that this function returning true doesn't mean the caller can skip calling
     *         SecTrustEvaluate, as there may be new errors since the exceptions cookie was
     *         created (for example, a certificate may have subsequently expired.)
     */
    @Generated
    @CFunction
    public static native boolean SecTrustSetExceptions(SecTrustRef trust, CFDataRef exceptions);

    /**
     * [@function] SecTrustCopyProperties
     * 
     * Return a property array for this trust evaluation.
     * 
     * On macOS, this function returns an ordered array of CFDictionaryRef
     * instances for each certificate in the chain. Indices run from 0 (leaf) to
     * the anchor (or last certificate found if no anchor was found.)
     * On other platforms, this function returns an unordered array of CFDictionary instances.
     * See the "Trust Property Constants" section for a list of currently defined keys.
     * The error information conveyed via this interface is also conveyed via the
     * returned error of SecTrustEvaluateWithError.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * 
     * @param trust A reference to a trust object. If the trust has not been
     *              evaluated, the returned property array will be empty.
     * @return A property array. It is the caller's responsibility to CFRelease
     *         the returned array when it is no longer needed.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef SecTrustCopyProperties(SecTrustRef trust);

    /**
     * [@function] SecTrustCopyResult
     * 
     * Returns a dictionary containing information about the
     * evaluated certificate chain for use by clients.
     * 
     * Returns a dictionary for the overall trust evaluation. See the
     * "Trust Result Constants" section for a list of currently defined keys.
     * 
     * API-Since: 7.0
     * 
     * @param trust A reference to a trust object.
     * @return A dictionary with various fields that can be displayed to the user,
     *         or NULL if no additional info is available or the trust has not yet been
     *         validated. The caller is responsible for calling CFRelease on the value
     *         returned when it is no longer needed.
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef SecTrustCopyResult(SecTrustRef trust);

    /**
     * [@function] SecTrustSetOCSPResponse
     * 
     * Attach OCSPResponse data to a trust object.
     * 
     * Allows the caller to provide OCSPResponse data (which may be
     * obtained during a TLS/SSL handshake, per RFC 3546) as input to a trust
     * evaluation. If this data is available, it can obviate the need to contact
     * an OCSP server for current revocation information.
     * 
     * API-Since: 7.0
     * 
     * @param trust        A reference to a trust object.
     * @param responseData This may be either a CFData object containing a single
     *                     DER-encoded OCSPResponse (per RFC 2560), or a CFArray of these.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustSetOCSPResponse(SecTrustRef trust, ConstVoidPtr responseData);

    /**
     * [@function] SSLContextGetTypeID
     * 
     * Return the CFTypeID for SSLContext objects.
     * 
     * @return CFTypeId for SSLContext objects.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    @NUInt
    public static native long SSLContextGetTypeID();

    /**
     * [@function] SSLCreateContext
     * 
     * Create a new instance of an SSLContextRef using the specified allocator.
     * 
     * @param alloc          Allocator to use for memory.
     * @param protooclSide   Client or server indication.
     * @param connectionType Type of connection.
     * @return A newly allocated SSLContextRef, or NULL on error.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native SSLContextRef SSLCreateContext(CFAllocatorRef alloc, int protocolSide, int connectionType);

    /**
     * [@function] SSLGetSessionState
     * 
     * Determine the state of an SSL/DTLS session.
     * 
     * @param context A valid SSLContextRef.
     * @param state   Output pointer to store the SSLSessionState.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetSessionState(SSLContextRef context, IntPtr state);

    /**
     * [@function] SSLSetSessionOption
     * 
     * Set options for an SSL session. Must be called prior to SSLHandshake();
     * subsequently cannot be called while session is active.
     * 
     * @param context A valid SSLContextRef.
     * @param option  An option enumeration value.
     * @param value   Value of the SSLSessionOption.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetSessionOption(SSLContextRef context, int option, byte value);

    /**
     * [@function] SSLGetSessionOption
     * 
     * Determine current value for the specified option in a given SSL session.
     * 
     * @param context A valid SSLContextRef.
     * @param option  An option enumeration value.
     * @param value   Pointer to a Boolean where the SSLSessionOption value is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetSessionOption(SSLContextRef context, int option, BytePtr value);

    /**
     * [@function] SSLSetIOFuncs
     * 
     * Specify functions which do the network I/O. Must be called prior
     * to SSLHandshake(); subsequently cannot be called while a session is
     * active.
     * 
     * @param context   A valid SSLContextRef.
     * @param readFunc  Pointer to a SSLReadFunc.
     * @param writeFunc Pointer to a SSLWriteFunc.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetIOFuncs(SSLContextRef context,
            @FunctionPtr(name = "call_SSLSetIOFuncs_1") Function_SSLSetIOFuncs_1 readFunc,
            @FunctionPtr(name = "call_SSLSetIOFuncs_2") Function_SSLSetIOFuncs_2 writeFunc);

    /**
     * [@function] SSLSetSessionConfig
     * [@absttact] Set a predefined configuration for the SSL Session
     * [@note] This currently affect enabled protocol versions,
     * enabled ciphersuites, and the kSSLSessionOptionFallback
     * session option.
     * 
     * @param context A valid SSLContextRef.
     * @param config  String name of constant TLS handshake configuration, e.g., kSSLSessionConfig_standard.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 10.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetSessionConfig(SSLContextRef context, CFStringRef config);

    /**
     * [@function] SSLSetProtocolVersionMin
     * 
     * Set the minimum SSL protocol version allowed. Optional.
     * The default is the lower supported protocol.
     * [@note] This can only be called when no session is active.
     * 
     * For TLS contexts, legal values for minVersion are :
     * kSSLProtocol3
     * kTLSProtocol1
     * kTLSProtocol11
     * kTLSProtocol12
     * 
     * For DTLS contexts, legal values for minVersion are :
     * kDTLSProtocol1
     * 
     * @param context    A valid SSLContextRef.
     * @param minVersion Minimum TLS protocol version.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetProtocolVersionMin(SSLContextRef context, int minVersion);

    /**
     * [@function] SSLGetProtocolVersionMin
     * 
     * Get minimum protocol version allowed
     * 
     * @param context    A valid SSLContextRef.
     * @param minVersion Pointer to SSLProtocol value where the minimum protocol version is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetProtocolVersionMin(SSLContextRef context, IntPtr minVersion);

    /**
     * [@function] SSLSetProtocolVersionMax
     * 
     * Set the maximum SSL protocol version allowed. Optional.
     * The default is the highest supported protocol.
     * [@note]
     * This can only be called when no session is active.
     * 
     * For TLS contexts, legal values for maxVersion are :
     * kSSLProtocol3
     * kTLSProtocol1
     * kTLSProtocol11
     * kTLSProtocol12
     * 
     * For DTLS contexts, legal values for maxVersion are :
     * kDTLSProtocol1
     * 
     * @param context    A valid SSLContextRef.
     * @param maxVersion Maximum TLS protocol version.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetProtocolVersionMax(SSLContextRef context, int maxVersion);

    /**
     * [@function] SSLGetProtocolVersionMax
     * 
     * Get maximum protocol version allowed
     * 
     * @param context    A valid SSLContextRef.
     * @param maxVersion Pointer to SSLProtocol value where the maximum protocol version is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetProtocolVersionMax(SSLContextRef context, IntPtr maxVersion);

    /**
     * [@function] SSLSetCertificate
     * 
     * Specify this connection's certificate(s).
     * 
     * This is mandatory for server connections,and optional for
     * clients. Specifying a certificate for a client enables SSL client-side
     * authentication. The end-entity cert is in certRefs[0]. Specifying a root
     * cert is optional; if it's not specified, the root cert which verifies the
     * cert chain specified here must be present in the system-wide set of trusted
     * anchor certs.
     * 
     * The certRefs argument is a CFArray containing SecCertificateRefs,
     * except for certRefs[0], which is a SecIdentityRef.
     * 
     * Must be called prior to SSLHandshake(), or immediately after
     * SSLHandshake has returned errSSLClientCertRequested (i.e. before the
     * handshake is resumed by calling SSLHandshake again.)
     * 
     * SecureTransport assumes the following:
     * 
     * -- The certRef references remain valid for the lifetime of the session.
     * -- The certificate specified in certRefs[0] is capable of signing.
     * -- The required capabilities of the certRef[0], and of the optional cert
     * specified in SSLSetEncryptionCertificate (see below), are highly
     * dependent on the application. For example, to work as a server with
     * Netscape clients, the cert specified here must be capable of both
     * signing and encrypting.
     * 
     * @param context  A valid SSLContextRef.
     * @param certRefs An array of SecCertificateRef instances.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetCertificate(SSLContextRef context, CFArrayRef certRefs);

    /**
     * [@function] SSLSetConnection
     * 
     * Specify I/O connection - a socket, endpoint, etc., which is
     * managed by caller.
     * 
     * On the client side, it's assumed that communication
     * has been established with the desired server on this connection.
     * On the server side, it's assumed that an incoming client request
     * has been established.
     * 
     * Must be called prior to SSLHandshake(); subsequently can only be
     * called when no session is active.
     * 
     * @param context    A valid SSLContextRef.
     * @param connection A SSLConnectionRef.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetConnection(SSLContextRef context, ConstVoidPtr connection);

    /**
     * [@function] SSLGetConnection
     * 
     * Retrieve the I/O connection managed managed by the caller.
     * 
     * @param context    A valid SSLContextRef.
     * @param connection A SSLConnectionRef pointer.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetConnection(SSLContextRef context, Ptr<ConstVoidPtr> connection);

    /**
     * [@function] SSLSetPeerDomainName
     * 
     * Specify the fully qualified doman name of the peer, e.g., "store.apple.com."
     * 
     * Optional; used to verify the common name field in peer's certificate.
     * Name is in the form of a C string; NULL termination optional, i.e.,
     * peerName[peerNameLen+1] may or may not have a NULL. In any case peerNameLen
     * is the number of bytes of the peer domain name.
     * 
     * @param context     A valid SSLContextRef.
     * @param peerName    A C string carrying the peer domain name.
     * @param peerNameLen Length of the peer domain name string.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetPeerDomainName(SSLContextRef context,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String peerName,
            @NUInt long peerNameLen);

    /**
     * [@function] SSLGetPeerDomainNameLength
     * 
     * Determine the buffer size needed for SSLGetPeerDomainName().
     * 
     * @param context     A valid SSLContextRef.
     * @param peerNameLen Pointer to where the length of the peer domain name string is stored
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetPeerDomainNameLength(SSLContextRef context, NUIntPtr peerNameLen);

    /**
     * [@function] SSLGetPeerDomainName
     * 
     * Obtain the value specified in SSLSetPeerDomainName().
     * 
     * @param context     A valid SSLContextRef.
     * @param peerName    Pointer to where the peer domain name is stored.
     * @param peerNameLen Pointer to where the length of the peer domain name string is stored,
     *                    up to the length specified by peerNameLen (on input).
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetPeerDomainName(SSLContextRef context, BytePtr peerName, NUIntPtr peerNameLen);

    /**
     * [@function] SSLCopyRequestedPeerName
     * 
     * Determine the buffer size needed for SSLCopyRequestedPeerNameLength().
     * 
     * @param context     A valid SSLContextRef.
     * @param peerName    Pointer to where the requested peer domain name is stored.
     * @param peerNameLen Pointer to where the length of the requested peer domain name string
     *                    is stored, up to the length specified by peerNameLen (on input).
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLCopyRequestedPeerName(SSLContextRef context, BytePtr peerName, NUIntPtr peerNameLen);

    /**
     * [@function] SSLCopyRequestedPeerNameLength
     * 
     * [Server Only] obtain the hostname specified by the client in the ServerName extension (SNI)
     * 
     * @param context     A valid SSLContextRef.
     * @param peerNameLen Pointer to where the length of the requested peer domain name string
     *                    is stored, up to the length specified by peerNameLen (on input).
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 9.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLCopyRequestedPeerNameLength(SSLContextRef ctx, NUIntPtr peerNameLen);

    /**
     * [@function] SSLSetDatagramHelloCookie
     * 
     * Specify the Datagram TLS Hello Cookie.
     * 
     * This is to be called for server side only and is optional.
     * The default is a zero len cookie. The maximum cookieLen is 32 bytes.
     * 
     * @param context   A valid SSLContextRef.
     * @param cookie    Pointer to opaque cookie data.
     * @param cookieLen Length of cookie data.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetDatagramHelloCookie(SSLContextRef dtlsContext, ConstVoidPtr cookie,
            @NUInt long cookieLen);

    /**
     * [@function] SSLSetMaxDatagramRecordSize
     * 
     * Specify the maximum record size, including all DTLS record headers.
     * 
     * This should be set appropriately to avoid fragmentation
     * of Datagrams during handshake, as fragmented datagrams may
     * be dropped by some network.
     * [@note] This is for Datagram TLS only
     * 
     * @param context A valid SSLContextRef.
     * @param maxSize Maximum size of datagram record(s).
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetMaxDatagramRecordSize(SSLContextRef dtlsContext, @NUInt long maxSize);

    /**
     * [@function] SSLGetMaxDatagramRecordSize
     * 
     * Get the maximum record size, including all Datagram TLS record headers.
     * [@note] This is for Datagram TLS only
     * 
     * @param context A valid SSLContextRef.
     * @param maxSize Pointer where maximum size of datagram record(s) is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetMaxDatagramRecordSize(SSLContextRef dtlsContext, NUIntPtr maxSize);

    /**
     * [@function] SSLGetNegotiatedProtocolVersion
     * 
     * Obtain the actual negotiated protocol version of the active
     * session, which may be different that the value specified in
     * SSLSetProtocolVersion(). Returns kSSLProtocolUnknown if no
     * SSL session is in progress.
     * 
     * @param context  A valid SSLContextRef.
     * @param protocol Pointer where negotiated SSLProtocol is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetNegotiatedProtocolVersion(SSLContextRef context, IntPtr protocol);

    /**
     * [@function] SSLGetNumberSupportedCiphers
     * 
     * Determine number and values of all of the SSLCipherSuites we support.
     * Caller allocates output buffer for SSLGetSupportedCiphers() and passes in
     * its size in *numCiphers. If supplied buffer is too small, errSSLBufferOverflow
     * will be returned.
     * 
     * @param context    A valid SSLContextRef.
     * @param numCiphers Pointer where number of supported ciphers is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetNumberSupportedCiphers(SSLContextRef context, NUIntPtr numCiphers);

    /**
     * [@function] SSLGetSupportedCiphers
     * 
     * Get the supported ciphers.
     * 
     * @param context    A valid SSLContextRef.
     * @param ciphers    Pointer to array of SSLCipherSuite values where supported ciphersuites
     *                   are stored. This array size is specified by the input value of numCiphers.
     * @param numCiphers Pointer where number of supported ciphers is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetSupportedCiphers(SSLContextRef context, CharPtr ciphers, NUIntPtr numCiphers);

    /**
     * [@function] SSLSetEnabledCiphers
     * 
     * Specify a (typically) restricted set of SSLCipherSuites to be enabled by
     * the current SSLContext. Can only be called when no session is active. Default
     * set of enabled SSLCipherSuites is the same as the complete set of supported
     * SSLCipherSuites as obtained by SSLGetSupportedCiphers().
     * 
     * @param context    A valid SSLContextRef.
     * @param ciphers    Array of enabled SSLCipherSuite values. This array size is specified
     *                   by the input value of numCiphers.
     * @param numCiphers Pointer where number of enabled ciphers is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetEnabledCiphers(SSLContextRef context, ConstCharPtr ciphers, @NUInt long numCiphers);

    /**
     * [@function] SSLGetNumberEnabledCiphers
     * 
     * Determine number and values of all of the SSLCipherSuites currently enabled.
     * Caller allocates output buffer for SSLGetEnabledCiphers() and passes in
     * its size in *numCiphers. If supplied buffer is too small, errSSLBufferOverflow
     * will be returned.
     * 
     * @param context    A valid SSLContextRef.
     * @param numCiphers Pointer where number of enabled ciphers is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetNumberEnabledCiphers(SSLContextRef context, NUIntPtr numCiphers);

    /**
     * [@function] SSLGetEnabledCiphers
     * 
     * Get the set of supported ciphersuites.
     * 
     * @param context    A valid SSLContextRef.
     * @param ciphers    Pointer to array of SSLCipherSuite values where enabled ciphersuites
     *                   are stored. This array size is specified by the input value of numCiphers.
     * @param numCiphers Pointer where number of enabled ciphers is stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetEnabledCiphers(SSLContextRef context, CharPtr ciphers, NUIntPtr numCiphers);

    /**
     * [@function] SSLCopyPeerTrust
     * 
     * Obtain a SecTrustRef representing peer certificates. Valid anytime,
     * subsequent to a handshake attempt. Caller must CFRelease the returned
     * trust reference.
     * 
     * The returned trust reference will have already been evaluated for
     * you, unless one of the following is true:
     * - Your code has disabled automatic certificate verification, by calling
     * SSLSetSessionOption to set kSSLSessionOptionBreakOnServerAuth to true.
     * - Your code has called SSLSetPeerID, and this session has been resumed
     * from an earlier cached session.
     * 
     * In these cases, your code should call SecTrustEvaluate prior to
     * examining the peer certificate chain or trust results (see SecTrust.h).
     * 
     * [@note] If you have not called SSLHandshake at least once prior to
     * calling this function, the returned trust reference will be NULL.
     * 
     * @param context A valid SSLContextRef.
     * @param trust   Pointer to SecTrustRef where peer's SecTrustRef is copied (retained).
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLCopyPeerTrust(SSLContextRef context, Ptr<SecTrustRef> trust);

    /**
     * [@function] SSLSetPeerID
     * 
     * Specify some data, opaque to this library, which is sufficient
     * to uniquely identify the peer of the current session. An example
     * would be IP address and port, stored in some caller-private manner.
     * To be optionally called prior to SSLHandshake for the current
     * session. This is mandatory if this session is to be resumable.
     * 
     * SecureTransport allocates its own copy of the incoming peerID. The
     * data provided in *peerID, while opaque to SecureTransport, is used
     * in a byte-for-byte compare to other previous peerID values set by the
     * current application. Matching peerID blobs result in SecureTransport
     * attempting to resume an SSL session with the same parameters as used
     * in the previous session which specified the same peerID bytes.
     * 
     * @param context   A valid SSLContextRef.
     * @param peerID    Opaque peer ID.
     * @param peerIDLen Length of opaque peer ID.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetPeerID(SSLContextRef context, ConstVoidPtr peerID, @NUInt long peerIDLen);

    /**
     * [@function] SSLGetPeerID
     * 
     * Obtain current PeerID. Returns NULL pointer, zero length if
     * SSLSetPeerID has not been called for this context.
     * 
     * @param context   A valid SSLContextRef.
     * @param peerID    Pointer to storage for the peer ID.
     * @param peerIDLen Pointer to storage for the peer ID length.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetPeerID(SSLContextRef context, Ptr<ConstVoidPtr> peerID, NUIntPtr peerIDLen);

    /**
     * [@function] SSLGetNegotiatedCipher
     * 
     * Obtain the SSLCipherSuite (e.g., SSL_RSA_WITH_DES_CBC_SHA) negotiated
     * for this session. Only valid when a session is active.
     * 
     * @param context     A valid SSLContextRef.
     * @param cipherSuite Pointer to storage for negotiated SSLCipherSuite.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetNegotiatedCipher(SSLContextRef context, CharPtr cipherSuite);

    /**
     * [@function] SSLSetEncryptionCertificate
     * 
     * This function is deprecated in OSX 10.11 and iOS 9.0 and
     * has no effect on the TLS handshake since OSX 10.10 and
     * iOS 8.0. Using separate RSA certificates for encryption
     * and signing is no longer supported.
     * 
     * @param context  A valid SSLContextRef.
     * @param certRefs Array of certificates.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 9.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int SSLSetEncryptionCertificate(SSLContextRef context, CFArrayRef certRefs);

    /**
     * [@function] SSLSetClientSideAuthenticate
     * 
     * Specify requirements for client-side authentication.
     * 
     * @param context A valid SSLContextRef.
     * @param auth    A SSLAuthenticate enumeration value.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetClientSideAuthenticate(SSLContextRef context, int auth);

    /**
     * [@function] SSLAddDistinguishedName
     * 
     * Add a DER-encoded distinguished name to list of acceptable names
     * to be specified in requests for client certificates.
     * 
     * @param context  A valid SSLContextRef.
     * @param derDN    A DER-encoded Distinguished Name blob.
     * @param derDNLen Length of the Distinguished Name blob.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLAddDistinguishedName(SSLContextRef context, ConstVoidPtr derDN, @NUInt long derDNLen);

    /**
     * [@function] SSLCopyDistinguishedNames
     * 
     * Obtain the list of acceptable distinguished names as provided by
     * a server (if the SSLContextRef is configured as a client), or as
     * specified by SSLSetCertificateAuthorities (if the SSLContextRef
     * is configured as a server).
     * 
     * The returned array contains CFDataRefs, each of which represents
     * one DER-encoded RDN. Caller must CFRelease the returned array.
     * 
     * @param context A valid SSLContextRef.
     * @param names   Pointer to CFArrayRef storage for retained copy of Distinguished Names.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLCopyDistinguishedNames(SSLContextRef context, Ptr<CFArrayRef> names);

    /**
     * [@function] SSLGetClientCertificateState
     * 
     * Obtain client certificate exchange status.
     * 
     * Can be called any time.
     * Reflects the *last* client certificate state change;
     * subsequent to a renegotiation attempt by either peer, the state
     * is reset to kSSLClientCertNone.
     * 
     * @param context     A valid SSLContextRef.
     * @param clientState Pointer to SSLClientCertificateState storage.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetClientCertificateState(SSLContextRef context, IntPtr clientState);

    /**
     * [@function] SSLHandshake
     * 
     * Perform the SSL handshake.
     * 
     * On successful return, session is ready for normal secure application
     * I/O via SSLWrite and SSLRead.
     * 
     * Interesting error returns:
     * 
     * errSSLUnknownRootCert: Peer had a valid cert chain, but the root of
     * the chain is unknown.
     * 
     * errSSLNoRootCert: Peer had a cert chain which did not end in a root.
     * 
     * errSSLCertExpired: Peer's cert chain had one or more expired certs.
     * 
     * errSSLXCertChainInvalid: Peer had an invalid cert chain (i.e.,
     * signature verification within the chain failed, or no certs
     * were found).
     * 
     * In all of the above errors, the handshake was aborted; the peer's
     * cert chain is available via SSLCopyPeerTrust or SSLCopyPeerCertificates.
     * 
     * Other interesting result codes:
     * 
     * errSSLPeerAuthCompleted: Peer's cert chain is valid, or was ignored if
     * cert verification was disabled via SSLSetEnableCertVerify. The application
     * may decide to continue with the handshake (by calling SSLHandshake
     * again), or close the connection at this point.
     * 
     * errSSLClientCertRequested: The server has requested a client certificate.
     * The client may choose to examine the server's certificate and
     * distinguished name list, then optionally call SSLSetCertificate prior
     * to resuming the handshake by calling SSLHandshake again.
     * 
     * A return value of errSSLWouldBlock indicates that SSLHandshake has to be
     * called again (and again and again until something else is returned).
     * 
     * @param context A valid SSLContextRef.
     * @return errSecSuccess on success, alternative error on failure or incomplete state.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLHandshake(SSLContextRef context);

    /**
     * [@function] SSLReHandshake
     * 
     * Server Only: Request renegotation.
     * 
     * This will return an error if the server is already renegotiating, or if the session is closed.
     * After this return without error, the application should call SSLHandshake() and/or SSLRead() as
     * for the original handshake.
     * 
     * @param context A valid SSLContextRef.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 10.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLReHandshake(SSLContextRef context);

    /**
     * [@function] SSLWrite
     * 
     * Normal application-level write.
     * 
     * On both of these, a errSSLWouldBlock return and a partially completed
     * transfer - or even zero bytes transferred - are NOT mutually exclusive.
     * 
     * @param context    A valid SSLContextRef.
     * @param data       Pointer to data to write.
     * @param dataLength Length of data to write.
     * @param processed  Pointer to storage indicating how much data was written.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLWrite(SSLContextRef context, ConstVoidPtr data, @NUInt long dataLength,
            NUIntPtr processed);

    /**
     * [@function] SSLRead
     * 
     * * @abstract Normal application-level write.
     * 
     * Data is mallocd by caller; available size specified in
     * dataLength; actual number of bytes read returned in
     * *processed.
     * 
     * @param context    A valid SSLContextRef.
     * @param data       Pointer to storage where data can be read.
     * @param dataLength Length of data storage.
     * @param processed  Pointer to storage indicating how much data was read.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLRead(SSLContextRef context, VoidPtr data, @NUInt long dataLength, NUIntPtr processed);

    /**
     * [@function] SSLGetBufferedReadSize
     * 
     * Determine how much data the client can be guaranteed to
     * obtain via SSLRead() without blocking or causing any low-level
     * read operations to occur.
     * 
     * @param context    A valid SSLContextRef.
     * @param bufferSize Pointer to store the amount of buffered data to be read.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetBufferedReadSize(SSLContextRef context, NUIntPtr bufferSize);

    /**
     * [@function] SSLGetDatagramWriteSize
     * 
     * Determine how much data the application can be guaranteed to write
     * with SSLWrite() without causing fragmentation. The value is based on
     * the maximum Datagram Record size defined by the application with
     * SSLSetMaxDatagramRecordSize(), minus the DTLS Record header size.
     * 
     * @param context    A valid SSLContextRef (for DTLS).
     * @param bufferSize Pointer to store the amount of data that can be written.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLGetDatagramWriteSize(SSLContextRef dtlsContext, NUIntPtr bufSize);

    /**
     * [@function] SSLClose
     * 
     * Terminate current SSL session.
     * 
     * @param context A valid SSLContextRef.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 5.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLClose(SSLContextRef context);

    /**
     * [@enum] Import/Export options
     * 
     * Predefined key constants used when passing dictionary-based arguments to import/export functions.
     * [@constant] kSecImportExportPassphrase Specifies a passphrase represented by a CFStringRef to be used when
     * exporting to (or importing from) PKCS#12 format.
     * [@constant] kSecImportExportKeychain On OSX, specifies a keychain represented by a SecKeychainRef to be used as
     * the target when importing from PKCS#12 format.
     * [@constant] kSecImportExportAccess On OSX, specifies an access represented by a SecAccessRef for the initial
     * access (ACL) of a key imported from PKCS#12 format.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecImportExportPassphrase();

    /**
     * [@enum] Import/Export item description
     * 
     * Predefined key constants used to pass back a CFArray with a
     * CFDictionary per item.
     * 
     * [@constant] kSecImportItemLabel a CFStringRef representing the item label.
     * This implementation specific identifier cannot be expected to have
     * any format.
     * [@constant] kSecImportItemKeyID a CFDataRef representing the key id. Often
     * the SHA-1 digest of the public key.
     * [@constant] kSecImportItemIdentity a SecIdentityRef representing the identity.
     * [@constant] kSecImportItemTrust a SecTrustRef set up with all relevant
     * certificates. Not guaranteed to succesfully evaluate.
     * [@constant] kSecImportItemCertChain a CFArrayRef holding all relevant
     * certificates for this item's identity
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemLabel();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemKeyID();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemTrust();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemCertChain();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemIdentity();

    /**
     * [@enum] Class Key Constant
     * 
     * Predefined key constant used to get or set item class values in
     * a dictionary. Its value is one of the constants defined in the Value
     * Constants for kSecClass.
     * [@constant] kSecClass Specifies a dictionary key whose value is the item's
     * class code. You use this key to get or set a value of type CFTypeRef
     * that contains the item class code.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecClass();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecClassGenericPassword();

    /**
     * [@enum] Class Value Constants
     * 
     * Predefined item class constants used to get or set values in
     * a dictionary. The kSecClass constant is the key and its value is one
     * of the constants defined here. Note: on Mac OS X 10.6, only items
     * of class kSecClassInternetPassword are supported.
     * [@constant] kSecClassInternetPassword Specifies Internet password items.
     * [@constant] kSecClassGenericPassword Specifies generic password items.
     * [@constant] kSecClassCertificate Specifies certificate items.
     * [@constant] kSecClassKey Specifies key items.
     * [@constant] kSecClassIdentity Specifies identity items.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecClassInternetPassword();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecClassCertificate();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecClassKey();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecClassIdentity();

    /**
     * [@enum] Attribute Key Constants
     * 
     * Predefined item attribute keys used to get or set values in a
     * dictionary. Not all attributes apply to each item class. The table
     * below lists the currently defined attributes for each item class:
     * 
     * kSecClassGenericPassword item attributes:
     * kSecAttrAccess (OS X only)
     * kSecAttrAccessControl
     * kSecAttrAccessGroup (iOS; also OS X if kSecAttrSynchronizable and/or kSecUseDataProtectionKeychain set)
     * kSecAttrAccessible (iOS; also OS X if kSecAttrSynchronizable and/or kSecUseDataProtectionKeychain set)
     * kSecAttrCreationDate
     * kSecAttrModificationDate
     * kSecAttrDescription
     * kSecAttrComment
     * kSecAttrCreator
     * kSecAttrType
     * kSecAttrLabel
     * kSecAttrIsInvisible
     * kSecAttrIsNegative
     * kSecAttrAccount
     * kSecAttrService
     * kSecAttrGeneric
     * kSecAttrSynchronizable
     * 
     * kSecClassInternetPassword item attributes:
     * kSecAttrAccess (OS X only)
     * kSecAttrAccessControl
     * kSecAttrAccessGroup (iOS; also OS X if kSecAttrSynchronizable and/or kSecUseDataProtectionKeychain set)
     * kSecAttrAccessible (iOS; also OS X if kSecAttrSynchronizable and/or kSecUseDataProtectionKeychain set)
     * kSecAttrCreationDate
     * kSecAttrModificationDate
     * kSecAttrDescription
     * kSecAttrComment
     * kSecAttrCreator
     * kSecAttrType
     * kSecAttrLabel
     * kSecAttrIsInvisible
     * kSecAttrIsNegative
     * kSecAttrAccount
     * kSecAttrSecurityDomain
     * kSecAttrServer
     * kSecAttrProtocol
     * kSecAttrAuthenticationType
     * kSecAttrPort
     * kSecAttrPath
     * kSecAttrSynchronizable
     * 
     * kSecClassCertificate item attributes:
     * kSecAttrAccessible (iOS only)
     * kSecAttrAccessControl (iOS only)
     * kSecAttrAccessGroup (iOS only)
     * kSecAttrCertificateType
     * kSecAttrCertificateEncoding
     * kSecAttrLabel
     * kSecAttrSubject
     * kSecAttrIssuer
     * kSecAttrSerialNumber
     * kSecAttrSubjectKeyID
     * kSecAttrPublicKeyHash
     * kSecAttrSynchronizable
     * 
     * kSecClassKey item attributes:
     * kSecAttrAccess (OS X only)
     * kSecAttrAccessControl
     * kSecAttrAccessGroup (iOS; also OS X if kSecAttrSynchronizable and/or kSecUseDataProtectionKeychain set)
     * kSecAttrAccessible (iOS; also OS X if kSecAttrSynchronizable and/or kSecUseDataProtectionKeychain set)
     * kSecAttrKeyClass
     * kSecAttrLabel
     * kSecAttrApplicationLabel
     * kSecAttrIsPermanent
     * kSecAttrApplicationTag
     * kSecAttrKeyType
     * kSecAttrPRF (OS X only)
     * kSecAttrSalt (OS X only)
     * kSecAttrRounds (OS X only)
     * kSecAttrKeySizeInBits
     * kSecAttrEffectiveKeySize
     * kSecAttrCanEncrypt
     * kSecAttrCanDecrypt
     * kSecAttrCanDerive
     * kSecAttrCanSign
     * kSecAttrCanVerify
     * kSecAttrCanWrap
     * kSecAttrCanUnwrap
     * kSecAttrSynchronizable
     * 
     * Note that the attributes kSecAttrCan* describe attributes of the
     * key itself at relatively high level. Some of these attributes are
     * mathematical -- for example, a DSA key cannot encrypt. Others are
     * key-level policy issues -- for example, it is good cryptographic
     * hygiene to use an RSA key either for encryption or signing but not
     * both. Compare these to the certificate-level policy values in
     * SecPolicy.h.
     * 
     * kSecClassIdentity item attributes:
     * Since an identity is the combination of a private key and a
     * certificate, this class shares attributes of both kSecClassKey and
     * kSecClassCertificate.
     * 
     * [@constant] kSecAttrAccessible Specifies a dictionary key whose value
     * indicates when your application needs access to an item's data. You
     * should choose the most restrictive option that meets your application's
     * needs to allow the system to protect that item in the best way possible.
     * See the "kSecAttrAccessible Value Constants" section for a list of
     * values which can be specified.
     * IMPORTANT: This attribute is currently not supported for OS X keychain
     * items, unless the kSecAttrSynchronizable attribute is also present. If
     * both attributes are specified on either OS X or iOS, the value for the
     * kSecAttrAccessible key may only be one whose name does not end with
     * "ThisDeviceOnly", as those cannot sync to another device.
     * 
     * [@constant] kSecAttrAccessControl Specifies a dictionary key whose value
     * is SecAccessControl instance which contains access control conditions
     * for item.
     * IMPORTANT: This attribute is mutually exclusive with kSecAttrAccess
     * attribute.
     * 
     * [@constant] kSecAttrAccess Specifies a dictionary key whose value
     * is a SecAccessRef describing the access control settings for this item.
     * This key is available on OS X only.
     * 
     * [@constant] kSecAttrAccessGroup Specifies a dictionary key whose value is
     * a CFStringRef indicating which access group a item is in. The access
     * groups that a particular application has membership in are determined by
     * two entitlements for that application. The application-identifier
     * entitlement contains the application's single access group, unless
     * there is a keychain-access-groups entitlement present. The latter
     * has as its value a list of access groups; the first item in this list
     * is the default access group. Unless a specific access group is provided
     * as the value of kSecAttrAccessGroup when SecItemAdd is called, new items
     * are created in the application's default access group. Specifying this
     * attribute in SecItemCopyMatching, SecItemUpdate, or SecItemDelete calls
     * limits the search to the specified access group (of which the calling
     * application must be a member to obtain matching results.) To share
     * keychain items between multiple applications, each application must have
     * a common group listed in its keychain-access-groups entitlement, and each
     * must specify this shared access group name as the value for the
     * kSecAttrAccessGroup key in the dictionary passed to SecItem functions.
     * 
     * [@constant] kSecAttrSynchronizable Specifies a dictionary key whose value is
     * a CFBooleanRef indicating whether the item in question can be synchronized.
     * To add a new item which can be synced to other devices, or to obtain
     * synchronizable results from a query, supply this key with a value of
     * kCFBooleanTrue. If the key is not supplied, or has a value of
     * kCFBooleanFalse, then no synchronizable items will be added or returned.
     * A predefined value, kSecAttrSynchronizableAny, may be provided instead of
     * kCFBooleanTrue if both synchronizable and non-synchronizable results are
     * desired.
     * 
     * IMPORTANT: Specifying the kSecAttrSynchronizable key has several caveats:
     * 
     * - Updating or deleting items using the kSecAttrSynchronizable key will
     * affect all copies of the item, not just the one on your local device.
     * Be sure that it makes sense to use the same password on all devices
     * before deciding to make a password synchronizable.
     * - Only password items can currently be synchronized. Keychain syncing
     * is not supported for certificates or cryptographic keys.
     * - Items stored or obtained using the kSecAttrSynchronizable key cannot
     * specify SecAccessRef-based access control with kSecAttrAccess. If a
     * password is intended to be shared between multiple applications, the
     * kSecAttrAccessGroup key must be specified, and each application
     * using this password must have a 'keychain-access-groups' entitlement
     * with the specified access group value.
     * - Items stored or obtained using the kSecAttrSynchronizable key may
     * not also specify a kSecAttrAccessible value which is incompatible
     * with syncing (namely, those whose names end with "ThisDeviceOnly".)
     * - Items stored or obtained using the kSecAttrSynchronizable key cannot
     * be specified by reference. You must pass kSecReturnAttributes and/or
     * kSecReturnData to retrieve results; kSecReturnRef is currently not
     * supported for synchronizable items.
     * - Persistent references to synchronizable items should be avoided;
     * while they may work locally, they cannot be moved between devices,
     * and may not resolve if the item is modified on some other device.
     * - When specifying a query that uses the kSecAttrSynchronizable key,
     * search keys are limited to the item's class and attributes.
     * The only search constant which may be used is kSecMatchLimit; other
     * constants using the kSecMatch prefix are not supported at this time.
     * 
     * [@constant] kSecAttrSynchronizableAny Specifies that both synchronizable and
     * non-synchronizable results should be returned from this query. This may be
     * used as a value for the kSecAttrSynchronizable dictionary key in a call to
     * SecItemCopyMatching, SecItemUpdate, or SecItemDelete.
     * 
     * [@constant] kSecAttrCreationDate (read-only) Specifies a dictionary key whose
     * value is the item's creation date. You use this key to get a value
     * of type CFDateRef that represents the date the item was created.
     * [@constant] kSecAttrModificationDate (read-only) Specifies a dictionary key
     * whose value is the item's modification date. You use this key to get
     * a value of type CFDateRef that represents the last time the item was
     * updated.
     * [@constant] kSecAttrDescription Specifies a dictionary key whose value is
     * the item's description attribute. You use this key to set or get a
     * value of type CFStringRef that represents a user-visible string
     * describing this particular kind of item (e.g., "disk image password").
     * [@constant] kSecAttrComment Specifies a dictionary key whose value is the
     * item's comment attribute. You use this key to set or get a value of
     * type CFStringRef containing the user-editable comment for this item.
     * [@constant] kSecAttrCreator Specifies a dictionary key whose value is the
     * item's creator attribute. You use this key to set or get a value of
     * type CFNumberRef that represents the item's creator. This number is
     * the unsigned integer representation of a four-character code (e.g.,
     * 'aCrt').
     * [@constant] kSecAttrType Specifies a dictionary key whose value is the item's
     * type attribute. You use this key to set or get a value of type
     * CFNumberRef that represents the item's type. This number is the
     * unsigned integer representation of a four-character code (e.g.,
     * 'aTyp').
     * [@constant] kSecAttrLabel Specifies a dictionary key whose value is the
     * item's label attribute. You use this key to set or get a value of
     * type CFStringRef containing the user-visible label for this item.
     * [@constant] kSecAttrIsInvisible Specifies a dictionary key whose value is the
     * item's invisible attribute. You use this key to set or get a value
     * of type CFBooleanRef that indicates whether the item is invisible
     * (i.e., should not be displayed.)
     * [@constant] kSecAttrIsNegative Specifies a dictionary key whose value is the
     * item's negative attribute. You use this key to set or get a value of
     * type CFBooleanRef that indicates whether there is a valid password
     * associated with this keychain item. This is useful if your application
     * doesn't want a password for some particular service to be stored in
     * the keychain, but prefers that it always be entered by the user.
     * [@constant] kSecAttrAccount Specifies a dictionary key whose value is the
     * item's account attribute. You use this key to set or get a CFStringRef
     * that contains an account name. (Items of class
     * kSecClassGenericPassword, kSecClassInternetPassword have this
     * attribute.)
     * [@constant] kSecAttrService Specifies a dictionary key whose value is the
     * item's service attribute. You use this key to set or get a CFStringRef
     * that represents the service associated with this item. (Items of class
     * kSecClassGenericPassword have this attribute.)
     * [@constant] kSecAttrGeneric Specifies a dictionary key whose value is the
     * item's generic attribute. You use this key to set or get a value of
     * CFDataRef that contains a user-defined attribute. (Items of class
     * kSecClassGenericPassword have this attribute.)
     * [@constant] kSecAttrSecurityDomain Specifies a dictionary key whose value
     * is the item's security domain attribute. You use this key to set or
     * get a CFStringRef value that represents the Internet security domain.
     * (Items of class kSecClassInternetPassword have this attribute.)
     * [@constant] kSecAttrServer Specifies a dictionary key whose value is the
     * item's server attribute. You use this key to set or get a value of
     * type CFStringRef that contains the server's domain name or IP address.
     * (Items of class kSecClassInternetPassword have this attribute.)
     * [@constant] kSecAttrProtocol Specifies a dictionary key whose value is the
     * item's protocol attribute. You use this key to set or get a value of
     * type CFNumberRef that denotes the protocol for this item (see the
     * SecProtocolType enum in SecKeychainItem.h). (Items of class
     * kSecClassInternetPassword have this attribute.)
     * [@constant] kSecAttrAuthenticationType Specifies a dictionary key whose value
     * is the item's authentication type attribute. You use this key to set
     * or get a value of type CFNumberRef that denotes the authentication
     * scheme for this item (see the kSecAttrAuthenticationType value
     * constants below).
     * [@constant] kSecAttrPort Specifies a dictionary key whose value is the item's
     * port attribute. You use this key to set or get a CFNumberRef value
     * that represents an Internet port number. (Items of class
     * kSecClassInternetPassword have this attribute.)
     * [@constant] kSecAttrPath Specifies a dictionary key whose value is the item's
     * path attribute, typically this is the path component of the URL. You use
     * this key to set or get a CFStringRef value that represents a path. (Items
     * of class kSecClassInternetPassword have this attribute.)
     * [@constant] kSecAttrSubject (read-only) Specifies a dictionary key whose
     * value is the item's subject. You use this key to get a value of type
     * CFDataRef that contains the X.500 subject name of a certificate.
     * (Items of class kSecClassCertificate have this attribute.)
     * [@constant] kSecAttrIssuer (read-only) Specifies a dictionary key whose value
     * is the item's issuer. You use this key to get a value of type
     * CFDataRef that contains the X.500 issuer name of a certificate. (Items
     * of class kSecClassCertificate have this attribute.)
     * [@constant] kSecAttrSerialNumber (read-only) Specifies a dictionary key whose
     * value is the item's serial number. You use this key to get a value
     * of type CFDataRef that contains the serial number data of a
     * certificate. (Items of class kSecClassCertificate have this
     * attribute.)
     * [@constant] kSecAttrSubjectKeyID (read-only) Specifies a dictionary key whose
     * value is the item's subject key ID. You use this key to get a value
     * of type CFDataRef that contains the subject key ID of a certificate.
     * (Items of class kSecClassCertificate have this attribute.)
     * [@constant] kSecAttrPublicKeyHash (read-only) Specifies a dictionary key
     * whose value is the item's public key hash. You use this key to get a
     * value of type CFDataRef that contains the hash of a certificate's
     * public key. (Items of class kSecClassCertificate have this attribute.)
     * [@constant] kSecAttrCertificateType (read-only) Specifies a dictionary key
     * whose value is the item's certificate type. You use this key to get
     * a value of type CFNumberRef that denotes the certificate type
     * (On iOS, currently the value of this attribute must be equal to the
     * version of the X509 certificate. So, 1 for v1, 2 for v2, and 3 for v3
     * certificates). (On OSX, see the CSSM_CERT_TYPE enum in cssmtype.h).
     * Only items of class kSecClassCertificate have this attribute.
     * [@constant] kSecAttrCertificateEncoding (read-only) Specifies a dictionary
     * key whose value is the item's certificate encoding. You use this key
     * to get a value of type CFNumberRef that denotes the certificate
     * encoding (On iOS, currently only the value 3 meaning
     * kSecAttrCertificateEncodingDER is supported). On OSX, see the
     * CSSM_CERT_ENCODING enum in cssmtype.h. Only items of class
     * kSecClassCertificate have this attribute.
     * [@constant] kSecAttrKeyClass (read only) Specifies a dictionary key whose
     * value is one of kSecAttrKeyClassPublic, kSecAttrKeyClassPrivate or
     * kSecAttrKeyClassSymmetric.
     * [@constant] kSecAttrApplicationLabel Specifies a dictionary key whose value
     * is the key's application label attribute. This is different from the
     * kSecAttrLabel (which is intended to be human-readable). This attribute
     * is used to look up a key programmatically; in particular, for keys of
     * class kSecAttrKeyClassPublic and kSecAttrKeyClassPrivate, the value of
     * this attribute is the hash of the public key. This item is a type of CFDataRef.
     * Legacy keys may contain a UUID in this field as a CFStringRef.
     * [@constant] kSecAttrIsPermanent Specifies a dictionary key whose value is a
     * CFBooleanRef indicating whether the key in question will be stored
     * permanently.
     * [@constant] kSecAttrIsSensitive Specifies a dictionary key whose value is a
     * CFBooleanRef indicating that the key in question can only be exported
     * in a wrapped (encrypted) format. OS X only.
     * [@constant] kSecAttrIsExtractable Specifies a dictionary key whose value is a
     * CFBooleanRef indicating whether the key in question can be exported from
     * its keychain container. OS X only.
     * [@constant] kSecAttrApplicationTag Specifies a dictionary key whose value is a
     * CFDataRef containing private tag data.
     * [@constant] kSecAttrKeyType Specifies a dictionary key whose value is a
     * CFNumberRef indicating the algorithm associated with this key
     * (On iOS, currently only the value 42 is supported, alternatively you can use
     * kSecAttrKeyTypeRSA). (On OSX, see the CSSM_ALGORITHMS enum in cssmtype.h).
     * 
     * [@constant] kSecAttrPRF Specifies a dictionary key whose value is the PRF
     * (pseudo-random function) for this key (see "kSecAttrPRF Value Constants".)
     * OS X only.
     * [@constant] kSecAttrSalt Specifies a dictionary key whose value is a
     * CFData containing the salt to use for this key. OS X only.
     * [@constant] kSecAttrRounds Specifies a dictionary key whose value is the
     * number of rounds for the pseudo-random function specified by kSecAttrPRF.
     * OS X only.
     * [@constant] kSecAttrKeySizeInBits Specifies a dictionary key whose value
     * is a CFNumberRef indicating the number of bits in this key.
     * [@constant] kSecAttrEffectiveKeySize Specifies a dictionary key whose value
     * is a CFNumberRef indicating the effective number of bits in this key.
     * For example, a DES key has a kSecAttrKeySizeInBits of 64, but a
     * kSecAttrEffectiveKeySize of 56 bits.
     * [@constant] kSecAttrCanEncrypt Specifies a dictionary key whole value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * encrypt data.
     * [@constant] kSecAttrCanDecrypt Specifies a dictionary key whose value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * decrypt data.
     * [@constant] kSecAttrCanDerive Specifies a dictionary key whole value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * derive another key.
     * [@constant] kSecAttrCanSign Specifies a dictionary key whole value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * create a digital signature.
     * [@constant] kSecAttrCanVerify Specifies a dictionary key whole value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * verify a digital signature.
     * [@constant] kSecAttrCanWrap Specifies a dictionary key whole value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * wrap another key.
     * [@constant] kSecAttrCanUnwrap Specifies a dictionary key whole value is a
     * CFBooleanRef indicating whether the key in question can be used to
     * unwrap another key.
     * [@constant] kSecAttrSyncViewHint Specifies a dictionary key whose value is
     * a CFStringRef. This value is part of the primary key of each item, and
     * can be used to help distiguish Sync Views when defining their
     * queries. iOS and sychronizable items only.
     * [@constant] kSecAttrTokenID Specifies a dictionary key whose presence
     * indicates that item is backed by external token. Value of this attribute
     * is CFStringRef uniquely identifying containing token. When this attribute
     * is not present, item is stored in internal keychain database.
     * Note that once item is created, this attribute cannot be changed - in other
     * words it is not possible to migrate existing items to, from or between tokens.
     * Currently the only available value for this attribute is
     * kSecAttrTokenIDSecureEnclave, which indicates that item (private key) is
     * backed by device's Secure Enclave.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessible();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessControl();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessGroup();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSynchronizable();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCreationDate();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrModificationDate();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrDescription();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrComment();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCreator();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrType();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrLabel();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsInvisible();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsNegative();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccount();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrService();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrGeneric();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSecurityDomain();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrServer();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocol();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationType();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPort();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPath();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSubject();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIssuer();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSerialNumber();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSubjectKeyID();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPublicKeyHash();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCertificateType();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCertificateEncoding();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClass();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrApplicationLabel();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsPermanent();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrApplicationTag();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyType();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeySizeInBits();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrEffectiveKeySize();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanEncrypt();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanDecrypt();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanDerive();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanSign();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanVerify();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanWrap();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanUnwrap();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSyncViewHint();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrTokenID();

    /**
     * [@enum] kSecAttrAccessible Value Constants
     * 
     * Predefined item attribute constants used to get or set values
     * in a dictionary. The kSecAttrAccessible constant is the key and its
     * value is one of the constants defined here.
     * When asking SecItemCopyMatching to return the item's data, the error
     * errSecInteractionNotAllowed will be returned if the item's data is not
     * available until a device unlock occurs.
     * [@constant] kSecAttrAccessibleWhenUnlocked Item data can only be accessed
     * while the device is unlocked. This is recommended for items that only
     * need be accesible while the application is in the foreground. Items
     * with this attribute will migrate to a new device when using encrypted
     * backups.
     * [@constant] kSecAttrAccessibleAfterFirstUnlock Item data can only be
     * accessed once the device has been unlocked after a restart. This is
     * recommended for items that need to be accesible by background
     * applications. Items with this attribute will migrate to a new device
     * when using encrypted backups.
     * [@constant] kSecAttrAccessibleAlways Item data can always be accessed
     * regardless of the lock state of the device. This is not recommended
     * for anything except system use. Items with this attribute will migrate
     * to a new device when using encrypted backups.
     * [@constant] kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly Item data can
     * only be accessed while the device is unlocked. This is recommended for
     * items that only need to be accessible while the application is in the
     * foreground and requires a passcode to be set on the device. Items with
     * this attribute will never migrate to a new device, so after a backup
     * is restored to a new device, these items will be missing. This
     * attribute will not be available on devices without a passcode. Disabling
     * the device passcode will cause all previously protected items to
     * be deleted.
     * [@constant] kSecAttrAccessibleWhenUnlockedThisDeviceOnly Item data can only
     * be accessed while the device is unlocked. This is recommended for items
     * that only need be accesible while the application is in the foreground.
     * Items with this attribute will never migrate to a new device, so after
     * a backup is restored to a new device, these items will be missing.
     * [@constant] kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly Item data can
     * only be accessed once the device has been unlocked after a restart.
     * This is recommended for items that need to be accessible by background
     * applications. Items with this attribute will never migrate to a new
     * device, so after a backup is restored to a new device these items will
     * be missing.
     * [@constant] kSecAttrAccessibleAlwaysThisDeviceOnly Item data can always
     * be accessed regardless of the lock state of the device. This option
     * is not recommended for anything except system use. Items with this
     * attribute will never migrate to a new device, so after a backup is
     * restored to a new device, these items will be missing.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleWhenUnlocked();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAfterFirstUnlock();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use an accessibility level that provides some user protection, such as
     * kSecAttrAccessibleAfterFirstUnlock
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAlways();

    /**
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleWhenUnlockedThisDeviceOnly();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Use an accessibility level that provides some user protection, such as
     * kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAlwaysThisDeviceOnly();

    /**
     * [@enum] kSecAttrProtocol Value Constants
     * 
     * Predefined item attribute constants used to get or set values
     * in a dictionary. The kSecAttrProtocol constant is the key and its
     * value is one of the constants defined here.
     * [@constant] kSecAttrProtocolFTP.
     * [@constant] kSecAttrProtocolFTPAccount.
     * [@constant] kSecAttrProtocolHTTP.
     * [@constant] kSecAttrProtocolIRC.
     * [@constant] kSecAttrProtocolNNTP.
     * [@constant] kSecAttrProtocolPOP3.
     * [@constant] kSecAttrProtocolSMTP.
     * [@constant] kSecAttrProtocolSOCKS.
     * [@constant] kSecAttrProtocolIMAP.
     * [@constant] kSecAttrProtocolLDAP.
     * [@constant] kSecAttrProtocolAppleTalk.
     * [@constant] kSecAttrProtocolAFP.
     * [@constant] kSecAttrProtocolTelnet.
     * [@constant] kSecAttrProtocolSSH.
     * [@constant] kSecAttrProtocolFTPS.
     * [@constant] kSecAttrProtocolHTTPS.
     * [@constant] kSecAttrProtocolHTTPProxy.
     * [@constant] kSecAttrProtocolHTTPSProxy.
     * [@constant] kSecAttrProtocolFTPProxy.
     * [@constant] kSecAttrProtocolSMB.
     * [@constant] kSecAttrProtocolRTSP.
     * [@constant] kSecAttrProtocolRTSPProxy.
     * [@constant] kSecAttrProtocolDAAP.
     * [@constant] kSecAttrProtocolEPPC.
     * [@constant] kSecAttrProtocolIPP.
     * [@constant] kSecAttrProtocolNNTPS.
     * [@constant] kSecAttrProtocolLDAPS.
     * [@constant] kSecAttrProtocolTelnetS.
     * [@constant] kSecAttrProtocolIMAPS.
     * [@constant] kSecAttrProtocolIRCS.
     * [@constant] kSecAttrProtocolPOP3S.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTPAccount();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIRC();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolNNTP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolPOP3();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSMTP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSOCKS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIMAP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolLDAP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolAppleTalk();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolAFP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolTelnet();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSSH();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTPS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTPS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTPProxy();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTPSProxy();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTPProxy();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSMB();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolRTSP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolRTSPProxy();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolDAAP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolEPPC();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIPP();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolNNTPS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolLDAPS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolTelnetS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIMAPS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIRCS();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolPOP3S();

    /**
     * [@enum] kSecAttrAuthenticationType Value Constants
     * 
     * Predefined item attribute constants used to get or set values
     * in a dictionary. The kSecAttrAuthenticationType constant is the key
     * and its value is one of the constants defined here.
     * [@constant] kSecAttrAuthenticationTypeNTLM.
     * [@constant] kSecAttrAuthenticationTypeMSN.
     * [@constant] kSecAttrAuthenticationTypeDPA.
     * [@constant] kSecAttrAuthenticationTypeRPA.
     * [@constant] kSecAttrAuthenticationTypeHTTPBasic.
     * [@constant] kSecAttrAuthenticationTypeHTTPDigest.
     * [@constant] kSecAttrAuthenticationTypeHTMLForm.
     * [@constant] kSecAttrAuthenticationTypeDefault.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeNTLM();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeMSN();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeDPA();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeRPA();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeHTTPBasic();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeHTTPDigest();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeHTMLForm();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeDefault();

    /**
     * [@enum] kSecAttrKeyClass Value Constants
     * 
     * Predefined item attribute constants used to get or set values
     * in a dictionary. The kSecAttrKeyClass constant is the key
     * and its value is one of the constants defined here.
     * [@constant] kSecAttrKeyClassPublic.
     * [@constant] kSecAttrKeyClassPrivate.
     * [@constant] kSecAttrKeyClassSymmetric.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClassPublic();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClassPrivate();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClassSymmetric();

    /**
     * [@enum] kSecAttrKeyType Value Constants
     * 
     * Predefined item attribute constants used to get or set values
     * in a dictionary. The kSecAttrKeyType constant is the key
     * and its value is one of the constants defined here.
     * [@constant] kSecAttrKeyTypeECSECPrimeRandom. The used curve is P-192, P-256, P-384 or P-521.
     * The size is specified by kSecAttrKeySizeInBits attribute. Curves are defined in FIPS PUB 186-4 standard.
     * [@constant] kSecAttrKeyTypeEC This is the legacy name for kSecAttrKeyTypeECSECPrimeRandom, new applications
     * should not use it.
     * [@constant] kSecAttrKeyTypeDSA (OSX only)
     * [@constant] kSecAttrKeyTypeAES (OSX only)
     * [@constant] kSecAttrKeyType3DES (OSX only)
     * [@constant] kSecAttrKeyTypeRC4 (OSX only)
     * [@constant] kSecAttrKeyTypeRC2 (OSX only)
     * [@constant] kSecAttrKeyTypeCAST (OSX only)
     * [@constant] kSecAttrKeyTypeECDSA (deprecated; use kSecAttrKeyTypeECSECPrimeRandom instead.) (OSX only)
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyTypeRSA();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyTypeEC();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyTypeECSECPrimeRandom();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSynchronizableAny();

    /**
     * [@enum] Search Constants
     * 
     * Predefined search constants used to set values in a query
     * dictionary. You can specify a combination of search attributes and
     * item attributes when looking for matching items with the
     * SecItemCopyMatching function.
     * [@constant] kSecMatchPolicy Specifies a dictionary key whose value is a
     * SecPolicyRef. If provided, returned certificates or identities must
     * verify with this policy.
     * [@constant] kSecMatchItemList OS X only. Specifies a dictionary key whose value is a
     * CFArray of SecKeychainItemRef items. If provided, returned items will be
     * limited to the subset which are contained in this list.
     * [@constant] kSecMatchSearchList Specifies a dictionary key whose value is a
     * CFArray of SecKeychainRef items. If provided, the search will be limited
     * to the keychains contained in this list.
     * [@constant] kSecMatchIssuers Specifies a dictionary key whose value is a
     * CFArray of X.500 names (of type CFDataRef). If provided, returned
     * certificates or identities will be limited to those whose
     * certificate chain contains one of the issuers provided in this list.
     * [@constant] kSecMatchEmailAddressIfPresent Specifies a dictionary key whose
     * value is a CFStringRef containing an RFC822 email address. If
     * provided, returned certificates or identities will be limited to those
     * that contain the address, or do not contain any email address.
     * [@constant] kSecMatchSubjectContains Specifies a dictionary key whose value
     * is a CFStringRef. If provided, returned certificates or identities
     * will be limited to those containing this string in the subject.
     * [@constant] kSecMatchSubjectStartsWith OS X only. Specifies a dictionary key whose value
     * is a CFStringRef. If provided, returned certificates or identities
     * will be limited to those with subject names that start with this string.
     * [@constant] kSecMatchSubjectEndsWith OS X only. Specifies a dictionary key whose value
     * is a CFStringRef. If provided, returned certificates or identities
     * will be limited to those with subject names that end with this string.
     * [@constant] kSecMatchSubjectWholeString OS X only. Specifies a dictionary key whose
     * value is a CFStringRef. If provided, returned certificates or identities
     * will be limited to those matching this string exactly in the subject.
     * [@constant] kSecMatchCaseInsensitive Specifies a dictionary key whose value
     * is a CFBooleanRef. If this value is kCFBooleanFalse, or is not
     * provided, then case-sensitive string matching is performed.
     * [@constant] kSecMatchDiacriticInsensitive OS X only. Specifies a dictionary key whose
     * value is a CFBooleanRef. If this value is kCFBooleanFalse, or is not
     * provided, then diacritic-sensitive string matching is performed.
     * [@constant] kSecMatchWidthInsensitive OS X only. Specifies a dictionary key whose
     * value is a CFBooleanRef. If this value is kCFBooleanFalse, or is not
     * provided, then string matching is width-sensitive (e.g. 'a' != 0xFF41).
     * [@constant] kSecMatchTrustedOnly Specifies a dictionary key whose value is
     * a CFBooleanRef. If provided with a value of kCFBooleanTrue, only
     * certificates which can be verified back to a trusted anchor will be
     * returned. If this value is kCFBooleanFalse, or is not provided, then
     * both trusted and untrusted certificates may be returned.
     * [@constant] kSecMatchValidOnDate Specifies a dictionary key whose value is
     * of type CFDateRef. If provided, returned keys, certificates or
     * identities will be limited to those which are valid for the given date.
     * Pass a value of kCFNull to indicate the current date.
     * [@constant] kSecMatchLimit Specifies a dictionary key whose value is a
     * CFNumberRef. If provided, this value specifies the maximum number of
     * results to return. If not provided, results are limited to the first
     * item found. Predefined values are provided for a single item
     * (kSecMatchLimitOne) and all matching items (kSecMatchLimitAll).
     * [@constant] kSecMatchLimitOne Specifies that results are limited to the first
     * item found; used as a value for the kSecMatchLimit dictionary key.
     * [@constant] kSecMatchLimitAll Specifies that an unlimited number of results
     * may be returned; used as a value for the kSecMatchLimit dictionary
     * key.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchPolicy();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchItemList();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchSearchList();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchIssuers();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchEmailAddressIfPresent();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchSubjectContains();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchCaseInsensitive();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchTrustedOnly();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchValidOnDate();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchLimit();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchLimitOne();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchLimitAll();

    /**
     * [@enum] Return Type Key Constants
     * 
     * Predefined return type keys used to set values in a dictionary.
     * You use these keys to specify the type of results which should be
     * returned by the SecItemCopyMatching or SecItemAdd function. You can
     * specify zero or more of these return types. If more than one of these
     * result types is specified, the result is returned as a CFDictionaryRef
     * whose keys are the result types and values are the requested data.
     * [@constant] kSecReturnData Specifies a dictionary key whose value is of type
     * CFBooleanRef. A value of kCFBooleanTrue indicates that the data of
     * an item (CFDataRef) should be returned. For keys and password
     * items, data is secret (encrypted) and may require the user to enter
     * a password for access.
     * [@constant] kSecReturnAttributes Specifies a dictionary key whose value is
     * of type CFBooleanRef. A value of kCFBooleanTrue indicates that the
     * (non-encrypted) attributes of an item (CFDictionaryRef) should be
     * returned.
     * [@constant] kSecReturnRef Specifies a dictionary key whose value is a
     * CFBooleanRef. A value of kCFBooleanTrue indicates that a reference
     * should be returned. Depending on the item class requested, the
     * returned reference(s) may be of type SecKeychainItemRef, SecKeyRef,
     * SecCertificateRef, or SecIdentityRef.
     * [@constant] kSecReturnPersistentRef Specifies a dictionary key whose value
     * is of type CFBooleanRef. A value of kCFBooleanTrue indicates that a
     * persistent reference to an item (CFDataRef) should be returned.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnData();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnAttributes();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnRef();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnPersistentRef();

    /**
     * [@enum] Value Type Key Constants
     * 
     * Predefined value type keys used to pass values in a dictionary.
     * You can specify zero or more of these types depending on the function
     * you are calling. For SecItemCopyMatching or SecItemAdd these are
     * used as keys in the results dictionary.
     * [@constant] kSecValueData Specifies a dictionary key whose value is of type
     * CFDataRef. For keys and password items, data is secret (encrypted)
     * and may require the user to enter a password for access.
     * [@constant] kSecValueRef Specifies a dictionary key whose value, depending
     * on the item class requested, is of type SecKeychainItemRef, SecKeyRef,
     * SecCertificateRef, or SecIdentityRef.
     * [@constant] kSecValuePersistentRef Specifies a dictionary key whose value
     * is of type CFDataRef. The bytes in this CFDataRef can be stored by
     * the caller and used on a subsequent invocation of the application (or
     * even a different application) to retrieve the item referenced by it.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecValueData();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecValueRef();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecValuePersistentRef();

    /**
     * [@enum] Other Constants
     * 
     * Predefined constants used to set values in a dictionary.
     * [@constant] kSecUseItemList Specifies a dictionary key whose value is a
     * CFArray of items. If provided, this array is treated as the set of
     * all possible items to search, or add if the API being called is
     * SecItemAdd. The items in this array may be of type SecKeyRef,
     * SecCertificateRef, SecIdentityRef, or CFDataRef (for a persistent
     * item reference.) The items in the array must all be of the same
     * type. When this attribute is provided, no keychains are searched.
     * [@constant] kSecUseKeychain OS X only. Specifies a dictionary key whose value is a
     * keychain reference. You use this key to specify a value of type
     * SecKeychainRef to which SecItemAdd will add the provided item(s).
     * [@constant] kSecUseOperationPrompt Specifies a dictionary key whose value
     * is a CFStringRef that represents a user-visible string describing
     * the operation for which the application is attempting to authenticate.
     * The application is responsible for the text localization.
     * [@constant] kSecUseNoAuthenticationUI OS X only. Specifies a dictionary key whose value
     * is a CFBooleanRef. If provided with a value of kCFBooleanTrue, the error
     * errSecInteractionNotAllowed will be returned if the item is attempting
     * to authenticate with UI.
     * [@constant] kSecUseAuthenticationUI Specifies a dictionary key whose value
     * is one of kSecUseAuthenticationUIAllow, kSecUseAuthenticationUIFail, kSecUseAuthenticationUISkip.
     * [@constant] kSecUseAuthenticationContext Specifies a dictionary key whose value
     * is LAContext to be used for keychain item authentication.
     * * If the item requires authentication and this key is omitted, a new context
     * will be created just for the purpose of the single call.
     * * If the specified context has been previously authenticated, the operation
     * will succeed without asking user for authentication.
     * * If the specified context has not been previously authenticated, the new
     * authentication will be started on this context, allowing caller to
     * eventually reuse the successfully authenticated context in subsequent
     * keychain operations.
     * [@constant] kSecUseDataProtectionKeychain Specifies a dictionary key whose value
     * is a CFBooleanRef. Set to kCFBooleanTrue to use kSecAttrAccessGroup and/or
     * kSecAttrAccessible on macOS without requiring the item to be marked synchronizable.
     * [@constant] kSecUseUserIndependentKeychain Specifies a dctionary key whose value is a CFBooleanRef
     * indicating whether the item is shared with other personas on the system.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: Not implemented on this platform
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseItemList();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use kSecUseAuthenticationContext and set LAContext.localizedReason property
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseOperationPrompt();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use kSecUseAuthenticationUI instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseNoAuthenticationUI();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUI();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationContext();

    /**
     * [@enum] kSecUseAuthenticationUI Value Constants
     * 
     * Predefined item attribute constants used to get or set values
     * in a dictionary. The kSecUseAuthenticationUI constant is the key and its
     * value is one of the constants defined here.
     * If the key kSecUseAuthenticationUI not provided then kSecUseAuthenticationUIAllow
     * is used as default.
     * [@constant] kSecUseAuthenticationUIAllow Specifies that authenticate UI can appear.
     * [@constant] kSecUseAuthenticationUIFail Specifies that the error
     * errSecInteractionNotAllowed will be returned if an item needs
     * to authenticate with UI
     * [@constant] kSecUseAuthenticationUIAllowSkip Specifies that all items which need
     * to authenticate with UI will be silently skipped. This value can be used
     * only with SecItemCopyMatching.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Instead of kSecUseAuthenticationUI, use kSecUseAuthenticationContext and set
     * LAContext.interactionNotAllowed property
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUIAllow();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Instead of kSecUseAuthenticationUI, use kSecUseAuthenticationContext and set
     * LAContext.interactionNotAllowed property
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUIFail();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUISkip();

    /**
     * [@enum] kSecAttrTokenID Value Constants
     * 
     * Predefined item attribute constant used to get or set values
     * in a dictionary. The kSecAttrTokenID constant is the key and its value
     * can be kSecAttrTokenIDSecureEnclave.
     * [@constant] kSecAttrTokenIDSecureEnclave Specifies well-known identifier of the
     * token implemented using device's Secure Enclave. The only keychain items
     * supported by the Secure Enclave token are 256-bit elliptic curve keys
     * (kSecAttrKeyTypeECSecPrimeRandom). Keys must be generated on the secure enclave using
     * SecKeyGenerateKeyPair call with kSecAttrTokenID set to
     * kSecAttrTokenIDSecureEnclave in the parameters dictionary, it is not
     * possible to import pregenerated keys to kSecAttrTokenIDSecureEnclave token.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrTokenIDSecureEnclave();

    /**
     * [@enum] kSecAttrAccessGroup Value Constants
     * [@constant] kSecAttrAccessGroupToken Represents well-known access group
     * which contains items provided by external token (typically smart card).
     * This may be used as a value for kSecAttrAccessGroup attribute. Every
     * application has access to this access group so it is not needed to
     * explicitly list it in keychain-access-groups entitlement, but application
     * must explicitly state this access group in keychain queries in order to
     * be able to access items from external tokens.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessGroupToken();

    /**
     * [@enum] Key Parameter Constants
     * 
     * Predefined key constants used to get or set values in a dictionary.
     * These are used to provide explicit parameters to key generation functions
     * when non-default values are desired. See the description of the
     * SecKeyGeneratePair API for usage information.
     * [@constant] kSecPrivateKeyAttrs The value for this key is a CFDictionaryRef
     * containing attributes specific for the private key to be generated.
     * [@constant] kSecPublicKeyAttrs The value for this key is a CFDictionaryRef
     * containing attributes specific for the public key to be generated.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPrivateKeyAttrs();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPublicKeyAttrs();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureRaw();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15Raw();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureRFC4754();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionRaw();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionPKCS1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA1AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA224AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA256AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA384AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA512AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA1AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA224AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA256AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA384AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA512AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA1AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA224AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA256AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA384AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA512AESGCM();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandard();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactor();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA1();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA224();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA256();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA384();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA512();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyKeyExchangeParameterRequestedSize();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyKeyExchangeParameterSharedInfo();

    /**
     * [@enum] Policy Constants
     * 
     * Predefined constants used to specify a policy.
     * [@constant] kSecPolicyAppleX509Basic
     * [@constant] kSecPolicyAppleSSL
     * [@constant] kSecPolicyAppleSMIME
     * [@constant] kSecPolicyAppleEAP
     * [@constant] kSecPolicyAppleiChat
     * [@constant] kSecPolicyAppleIPsec
     * [@constant] kSecPolicyApplePKINITClient
     * [@constant] kSecPolicyApplePKINITServer
     * [@constant] kSecPolicyAppleCodeSigning
     * [@constant] kSecPolicyMacAppStoreReceipt
     * [@constant] kSecPolicyAppleIDValidation
     * [@constant] kSecPolicyAppleTimeStamping
     * [@constant] kSecPolicyAppleRevocation
     * [@constant] kSecPolicyApplePassbookSigning
     * [@constant] kSecPolicyApplePayIssuerEncryption
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleX509Basic();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleSSL();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleSMIME();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleEAP();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleIPsec();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleCodeSigning();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyMacAppStoreReceipt();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleIDValidation();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleTimeStamping();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleRevocation();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyApplePassbookSigning();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyApplePayIssuerEncryption();

    /**
     * [@enum] Policy Value Constants
     * 
     * Predefined property key constants used to get or set values in
     * a dictionary for a policy instance.
     * 
     * All policies will have the following read-only value:
     * kSecPolicyOid (the policy object identifier)
     * 
     * Additional policy values which your code can optionally set:
     * kSecPolicyName (name which must be matched)
     * kSecPolicyClient (evaluate for client, rather than server)
     * kSecPolicyRevocationFlags (only valid for a revocation policy)
     * kSecPolicyTeamIdentifier (only valid for a Passbook signing policy)
     * 
     * [@constant] kSecPolicyOid Specifies the policy OID (value is a CFStringRef)
     * [@constant] kSecPolicyName Specifies a CFStringRef (or CFArrayRef of same)
     * containing a name which must be matched in the certificate to satisfy
     * this policy. For SSL/TLS, EAP, and IPSec policies, this specifies the
     * server name which must match the common name of the certificate.
     * For S/MIME, this specifies the RFC822 email address. For Passbook
     * signing, this specifies the pass signer.
     * [@constant] kSecPolicyClient Specifies a CFBooleanRef value that indicates
     * this evaluation should be for a client certificate. If not set (or
     * false), the policy evaluates the certificate as a server certificate.
     * [@constant] kSecPolicyRevocationFlags Specifies a CFNumberRef that holds a
     * kCFNumberCFIndexType bitmask value. See "Revocation Policy Constants"
     * for a description of individual bits in this value.
     * [@constant] kSecPolicyTeamIdentifier Specifies a CFStringRef containing a
     * team identifier which must be matched in the certificate to satisfy
     * this policy. For the Passbook signing policy, this string must match
     * the Organizational Unit field of the certificate subject.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyOid();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyName();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyClient();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyRevocationFlags();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyTeamIdentifier();

    /**
     * This is a synonym for NULL, if you'd rather use a named constant. This
     * refers to a cryptographically secure random number generator.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native SecRandomRef kSecRandomDefault();

    /**
     * [@enum] Credential Key Constants
     * 
     * Predefined key constants used to get values in a dictionary
     * of credentials returned by SecRequestWebCredential.
     * [@constant] kSecSharedPassword Specifies a dictionary key whose value is a
     * shared password. You use this key to get a value of type CFStringRef
     * that contains a password.
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecSharedPassword();

    /**
     * [@enum] Trust Property Constants
     * 
     * Predefined key constants used to obtain values in a
     * per-certificate dictionary of trust evaluation results,
     * as retrieved from a call to SecTrustCopyProperties.
     * [@constant] kSecPropertyTypeTitle Specifies a key whose value is a
     * CFStringRef containing the title (display name) of this certificate.
     * [@constant] kSecPropertyTypeError Specifies a key whose value is a
     * CFStringRef containing the reason for a trust evaluation failure.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPropertyTypeTitle();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecPropertyTypeError();

    /**
     * [@enum] Trust Result Constants
     * 
     * Predefined key constants used to obtain values in a
     * dictionary of trust evaluation results for a certificate chain,
     * as retrieved from a call to SecTrustCopyResult.
     * [@constant] kSecTrustEvaluationDate
     * This key will be present if a trust evaluation has been performed
     * and results are available. Its value is a CFDateRef representing
     * when the evaluation for this trust object took place.
     * [@constant] kSecTrustExtendedValidation
     * This key will be present and have a value of kCFBooleanTrue
     * if this chain was validated for EV.
     * [@constant] kSecTrustOrganizationName
     * Organization name field of subject of leaf certificate. This
     * field is meant to be displayed to the user as the validated
     * name of the company or entity that owns the certificate if the
     * kSecTrustExtendedValidation key is present.
     * [@constant] kSecTrustResultValue
     * This key will be present if a trust evaluation has been performed.
     * Its value is a CFNumberRef representing the SecTrustResultType result
     * for the evaluation.
     * [@constant] kSecTrustRevocationChecked
     * This key will be present iff this chain had its revocation checked.
     * The value will be a kCFBooleanTrue if revocation checking was
     * successful and none of the certificates in the chain were revoked.
     * The value will be kCFBooleanFalse if no current revocation status
     * could be obtained for one or more certificates in the chain due
     * to connection problems or timeouts. This is a hint to a client
     * to retry revocation checking at a later time.
     * [@constant] kSecTrustRevocationValidUntilDate
     * This key will be present iff kSecTrustRevocationChecked has a
     * value of kCFBooleanTrue. The value will be a CFDateRef representing
     * the earliest date at which the revocation info for one of the
     * certificates in this chain might change.
     * [@constant] kSecTrustCertificateTransparency
     * This key will be present and have a value of kCFBooleanTrue
     * if this chain is CT qualified.
     * [@constant] kSecTrustCertificateTransparencyWhiteList
     * This key will be present and have a value of kCFBooleanTrue
     * if this chain is EV, but not CT qualified, and is permitted
     * as an exception to CT policy requirements.
     * Note: in macOS 10.12 and iOS 10, previously-issued EV certificates
     * were considered exempt from the CT requirement. As those certificates
     * expired, exempting them was no longer needed. This key is deprecated
     * in macOS 10.13 and iOS 11, and is no longer returned in the trust
     * results dictionary as of those releases.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustEvaluationDate();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustExtendedValidation();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustOrganizationName();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustResultValue();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustRevocationChecked();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustRevocationValidUntilDate();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustCertificateTransparency();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustCertificateTransparencyWhiteList();

    /**
     * Default configuration (has 3DES, no RC4)
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_default();

    /**
     * ATS v1 Config: TLS v1.2, only PFS ciphersuites
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_ATSv1();

    /**
     * ATS v1 Config without PFS: TLS v1.2, include non PFS ciphersuites
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_ATSv1_noPFS();

    /**
     * TLS v1.2 to TLS v1.0, with default ciphersuites (no 3DES, no RC4)
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_standard();

    /**
     * TLS v1.2 to TLS v1.0, with default ciphersuites + RC4 + 3DES
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_RC4_fallback();

    /**
     * TLS v1.0 only, with default ciphersuites + fallback SCSV
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_TLSv1_fallback();

    /**
     * TLS v1.0, with default ciphersuites + RC4 + 3DES + fallback SCSV
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_TLSv1_RC4_fallback();

    /**
     * TLS v1.2 to TLS v1.0, defaults + RC4 + DHE ciphersuites
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_legacy();

    /**
     * TLS v1.2 to TLS v1.0, default + RC4 + DHE ciphersuites
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_legacy_DHE();

    /**
     * TLS v1.2, anonymous ciphersuites only
     * 
     * API-Since: 5.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_anonymous();

    /**
     * TLS v1.2 to TLS v1.0, has 3DES, no RC4
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_3DES_fallback();

    /**
     * TLS v1.0, with default ciphersuites + 3DES, no RC4
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_TLSv1_3DES_fallback();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_SecAddSharedWebCredential {
        @Generated
        void call_SecAddSharedWebCredential(CFErrorRef arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_SecRequestSharedWebCredential {
        @Generated
        void call_SecRequestSharedWebCredential(CFArrayRef arg0, CFErrorRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_SecTrustEvaluateAsync {
        @Generated
        void call_SecTrustEvaluateAsync(SecTrustRef trustRef, int trustResult);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_SSLSetIOFuncs_1 {
        @Generated
        int call_SSLSetIOFuncs_1(ConstVoidPtr arg0, VoidPtr arg1, NUIntPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_SSLSetIOFuncs_2 {
        @Generated
        int call_SSLSetIOFuncs_2(ConstVoidPtr arg0, ConstVoidPtr arg1, NUIntPtr arg2);
    }

    /**
     * [@function] SecCertificateCopyCommonName
     * 
     * Retrieves the common name of the subject of a given certificate.
     * 
     * All the data in this string comes from the certificate itself, and thus it's in whatever language the certificate
     * itself is in.
     * Note that the certificate's common name field may not be present, or may be inadequate to describe the
     * certificate; for display purposes,
     * you should consider using SecCertificateCopySubjectSummary instead of this function.
     * 
     * API-Since: 10.3
     * 
     * @param certificate A reference to the certificate from which to retrieve the common name.
     * @param commonName  On return, a reference to the common name. Your code must release this reference by calling
     *                    the CFRelease function.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecCertificateCopyCommonName(SecCertificateRef certificate, Ptr<CFStringRef> commonName);

    /**
     * [@function] SecCertificateCopyEmailAddresses
     * 
     * Returns an array of zero or more email addresses for the subject of a given certificate.
     * 
     * @param certificate    A reference to the certificate from which to retrieve the email addresses.
     * @param emailAddresses On return, an array of zero or more CFStringRef elements corresponding to each email
     *                       address found.
     *                       Your code must release this array reference by calling the CFRelease function.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     * 
     *         API-Since: 10.3
     */
    @Generated
    @CFunction
    public static native int SecCertificateCopyEmailAddresses(SecCertificateRef certificate,
            Ptr<CFArrayRef> emailAddresses);

    /**
     * [@function] SecCertificateCopyNormalizedIssuerSequence
     * 
     * Return the certificate's normalized issuer
     * 
     * The issuer is a sequence in the format used by SecItemCopyMatching. The content returned is a DER-encoded X.509
     * distinguished name. For a display version of the issuer, call SecCertificateCopyValues. The caller must CFRelease
     * the value returned.
     * 
     * API-Since: 10.3
     * 
     * @param certificate The certificate from which to get values
     */
    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopyNormalizedIssuerSequence(SecCertificateRef certificate);

    /**
     * [@function] SecCertificateCopyNormalizedSubjectSequence
     * 
     * Return the certificate's normalized subject
     * 
     * The subject is a sequence in the format used by SecItemCopyMatching. The content returned is a DER-encoded X.509
     * distinguished name. For a display version of the subject, call SecCertificateCopyValues. The caller must
     * CFRelease the value returned.
     * 
     * API-Since: 10.3
     * 
     * @param certificate The certificate from which to get values
     */
    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopyNormalizedSubjectSequence(SecCertificateRef certificate);

    /**
     * [@function] SecCertificateCopyPublicKey
     * 
     * Retrieves the public key for a given certificate.
     * 
     * NOTE: Deprecated in iOS 12.0; use SecCertificateCopyKey instead for cross-platform availability.
     * 
     * API-Since: 10.3
     * Deprecated-Since: 12.0
     * 
     * @param certificate A reference to the certificate from which to retrieve the public key.
     * @return A reference to the public key for the specified certificate. Your code must release this reference by
     *         calling the CFRelease function.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native SecKeyRef SecCertificateCopyPublicKey(SecCertificateRef certificate);

    /**
     * [@function] SecCertificateCopySerialNumberData
     * 
     * Return the certificate's serial number.
     * 
     * Return the content of a DER-encoded integer (without the tag and length fields) for this certificate's serial
     * number. The caller must CFRelease the value returned.
     * 
     * API-Since: 11.0
     * 
     * @param certificate The certificate from which to get values.
     * @param error       An optional pointer to a CFErrorRef which will be set on return from the function if an error
     *                    occurred. If not NULL, the caller is responsible for releasing the CFErrorRef.
     */
    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopySerialNumberData(SecCertificateRef certificate,
            Ptr<CFErrorRef> error);

    /**
     * [@function] SecCertificateCopySerialNumber
     * 
     * Return the certificate's serial number.
     * 
     * Return the content of a DER-encoded integer (without the tag and length fields) for this certificate's serial
     * number. The caller must CFRelease the value returned. NOTE: Deprecated in iOS 11.0; use
     * SecCertificateCopySerialNumberData instead for cross-platform availability.
     * 
     * API-Since: 10.3
     * Deprecated-Since: 11.0
     * 
     * @param certificate The certificate from which to get values.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopySerialNumber(SecCertificateRef certificate);

    /**
     * [@function] SSLSetSessionTicketsEnabled
     * 
     * Forcibly enable or disable session ticket resumption.
     * [@note] By default, session tickets are disabled.
     * 
     * @param context A valid SSLContextRef.
     * @param enabled Boolean indicating if ticket support is enabled (true) or not (false).
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetSessionTicketsEnabled(SSLContextRef context, byte enabled);

    /**
     * [@function] SSLSetALPNProtocols
     * 
     * Set the ALPN protocols to be passed in the ALPN negotiation.
     * 
     * This is the list of supported application-layer protocols supported.
     * 
     * The protocols parameter must be an array of CFStringRef values
     * with ASCII-encoded reprensetations of the supported protocols, e.g., "http/1.1".
     * 
     * [@note] See RFC 7301 for more information.
     * 
     * @param context   A valid SSLContextRef.
     * @param protocols Array of CFStringRefs carrying application protocols.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetALPNProtocols(SSLContextRef context, CFArrayRef protocols);

    /**
     * [@function] SSLCopyALPNProtocols
     * 
     * Get the ALPN protocols associated with this SSL context.
     * 
     * This is the list of supported application-layer protocols supported.
     * 
     * The resultant protocols array will contain CFStringRef values containing
     * ASCII-encoded representations of the supported protocols, e.g., "http/1.1".
     * 
     * See RFC 7301 for more information.
     * 
     * [@note] The `protocols` pointer must be NULL, otherwise the copy will fail.
     * This function will allocate memory for the CFArrayRef container
     * if there is data to provide. Otherwise, the pointer will remain NULL.
     * 
     * @param context   A valid SSLContextRef.
     * @param protocols Pointer to a CFArrayRef where peer ALPN protocols are stored.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLCopyALPNProtocols(SSLContextRef context, Ptr<CFArrayRef> protocols);

    /**
     * [@function] SSLSetOCSPResponse
     * 
     * Set the OCSP response for the given SSL session.
     * 
     * The response parameter must be a non-NULL CFDataRef containing the
     * bytes of the OCSP response.
     * 
     * @param context  A valid SSLContextRef.
     * @param response CFDataRef carrying OCSP response.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetOCSPResponse(SSLContextRef context, CFDataRef response);

    /**
     * [@function] SSLSetError
     * 
     * Set the status of a SSLContextRef.
     * 
     * This is to be done after handling steps of the SSL handshake such
     * as server certificate validation.
     * 
     * @param context A valid SSLContextRef.
     * @param status  Error status to set internally, which will be translated to an alert.
     * @return errSecSuccess on success, alternative error on failure.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 13.0
     *         Deprecated-Message: No longer supported. Use Network.framework.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetError(SSLContextRef context, int status);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsSensitive();

    /**
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsExtractable();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPersistantReference();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPersistentReference();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPSSSHA1();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPSSSHA224();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPSSSHA256();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPSSSHA384();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPSSSHA512();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePSSSHA1();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePSSSHA224();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePSSSHA256();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePSSSHA384();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePSSSHA512();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA224AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA256AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA384AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA512AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA224AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA256AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA384AESGCM();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA512AESGCM();

    /**
     * [@function] SecCopyErrorMessageString
     * 
     * Returns a string describing the specified error result code.
     * [@reserved] Reserved for future use. Your code should pass NULL in this parameter.
     * 
     * @param status An error result code of type OSStatus or CSSM_RETURN, as returned by a Security or CSSM function.
     * @return A reference to an error string, or NULL if no error string is available for the specified result code.
     *         Your code must release this reference by calling the CFRelease function.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @CFunction
    public static native CFStringRef SecCopyErrorMessageString(int status, VoidPtr reserved);

    /**
     * [@function] SecCertificateCopyKey
     * 
     * Retrieves the public key for a given certificate.
     * 
     * RSA and ECDSA public keys are supported. All other public key algorithms are unsupported.
     * 
     * API-Since: 12.0
     * 
     * @param certificate A reference to the certificate from which to retrieve the public key.
     * @return A reference to the public key for the specified certificate. Your code must release this reference by
     *         calling the CFRelease function. If the public key has an encoding issue or uses an unsupported algorithm,
     *         the returned reference will be null.
     */
    @Generated
    @CFunction
    public static native SecKeyRef SecCertificateCopyKey(SecCertificateRef certificate);

    /**
     * [@function] SecTrustEvaluateWithError
     * 
     * Evaluates a trust reference synchronously.
     * 
     * This function will completely evaluate trust before returning,
     * possibly including network access to fetch intermediate certificates or to
     * perform revocation checking. Since this function can block during those
     * operations, you should call it from within a function that is placed on a
     * dispatch queue, or in a separate thread from your application's main
     * run loop.
     * If the certificate is trusted and the result is true, the error will be set to NULL.
     * If the certificate is not trusted or the evaluation was unable to complete, the result
     * will be false and the error will be set with a description of the failure.
     * The error contains a code for the most serious error encountered (if multiple trust
     * failures occurred). The localized description indicates the certificate with the most
     * serious problem and the type of error. The underlying error contains a localized
     * description of each certificate in the chain that had an error and all errors found
     * with that certificate.
     * 
     * API-Since: 12.0
     * 
     * @param trust A reference to the trust object to evaluate.
     * @param error A pointer to an error object
     * @return A boolean value indicating whether the certificate is trusted
     */
    @Generated
    @CFunction
    public static native boolean SecTrustEvaluateWithError(SecTrustRef trust, Ptr<CFErrorRef> error);

    /**
     * [@function] SecTrustEvaluateAsyncWithError
     * 
     * Evaluates a trust reference asynchronously.
     * 
     * If the certificate is trusted, the callback will return a result parameter of true
     * and the error will be set to NULL.
     * If the certificate is not trusted or the evaluation was unable to complete, the result parameter
     * will be false and the error will be set with a description of the failure. The error contains a
     * code for the most serious error encountered (if multiple trust failures occurred). The localized
     * description indicates the certificate with the most serious problem and the type of error. The
     * underlying error contains a localized description of each certificate in the chain that had an
     * error and all errors found with that certificate.
     * 
     * API-Since: 13.0
     * 
     * @param trust  A reference to the trust object to evaluate.
     * @param queue  A dispatch queue on which the result callback will be executed. Note that this
     *               function MUST be called from that queue.
     * @param result A SecTrustWithErrorCallback block which will be executed when the trust evaluation
     *               is complete.
     *               The block is guaranteed to be called exactly once when the result code is errSecSuccess, and not
     *               called otherwise. Note that this block may be called synchronously inline if no asynchronous
     *               operations are required.
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustEvaluateAsyncWithError(SecTrustRef trust, NSObject queue,
            @ObjCBlock(name = "call_SecTrustEvaluateAsyncWithError") Block_SecTrustEvaluateAsyncWithError result);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_SecTrustEvaluateAsyncWithError {
        @Generated
        void call_SecTrustEvaluateAsyncWithError(SecTrustRef trustRef, boolean result, CFErrorRef error);
    }

    /**
     * [@function] SecTrustSignedCertificateTimestamps
     * 
     * Attach SignedCertificateTimestamp data to a trust object.
     * 
     * Allows the caller to provide SCT data (which may be
     * obtained during a TLS/SSL handshake, per RFC 6962) as input to a trust
     * evaluation.
     * 
     * API-Since: 12.1.1
     * 
     * @param trust    A reference to a trust object.
     * @param sctArray is a CFArray of CFData objects each containing a SCT (per RFC 6962).
     * @return A result code. See "Security Error Codes" (SecBase.h).
     */
    @Generated
    @CFunction
    public static native int SecTrustSetSignedCertificateTimestamps(SecTrustRef trust, CFArrayRef sctArray);

    /**
     * [@function] sec_trust_create
     * 
     * Create an ARC-able `sec_trust_t` instance from a `SecTrustRef`.
     * 
     * @param trust
     *              A `SecTrustRef` instance.
     * 
     * @return a `sec_trust_t` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_trust_create(SecTrustRef trust);

    /**
     * [@function] sec_trust_copy_ref
     * 
     * Copy a retained reference to the underlying `SecTrustRef` instance.
     * 
     * @param trust
     *              A `sec_trust_t` instance.
     * 
     * @return The underlying `SecTrustRef` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native SecTrustRef sec_trust_copy_ref(NSObject trust);

    /**
     * [@function] sec_identity_create
     * 
     * Create an ARC-able `sec_identity_t` instance from a `SecIdentityRef`.
     * 
     * @param identity
     *                 A `SecIdentityRef` instance.
     * 
     * @return a `sec_identity_t` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_identity_create(SecIdentityRef identity);

    /**
     * [@function] sec_identity_create_with_certificates
     * 
     * Create an ARC-able `sec_identity_t` instance from a `SecIdentityRef` and
     * array of SecCertificateRef instances.
     * 
     * @param identity
     *                     A `SecIdentityRef` instance.
     * 
     * @param certificates
     *                     An array of `SecCertificateRef` instances.
     * 
     * @return a `sec_identity_t` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_identity_create_with_certificates(SecIdentityRef identity,
            CFArrayRef certificates);

    /**
     * [@function] sec_identity_access_certificates
     * 
     * Access the certificates associated with the `sec_identity_t` instance.
     * 
     * @param identity
     *                 A `sec_identity_t` instance.
     * 
     * @param handler
     *                 A block to invoke one or more times with `sec_certificate_t` instances.
     * 
     * @return Returns true if the peer certificates were accessible, false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean sec_identity_access_certificates(NSObject identity,
            @ObjCBlock(name = "call_sec_identity_access_certificates") Block_sec_identity_access_certificates handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_identity_access_certificates {
        @Generated
        void call_sec_identity_access_certificates(NSObject arg0);
    }

    /**
     * [@function] sec_identity_copy_ref
     * 
     * Copy a retained reference to the underlying `SecIdentityRef` instance.
     * 
     * @param identity
     *                 A `sec_identity_t` instance.
     * 
     * @return The underlying `SecIdentityRef` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native SecIdentityRef sec_identity_copy_ref(NSObject identity);

    /**
     * [@function] sec_identity_copy_certificates_ref
     * 
     * Copy a retained reference to the underlying `CFArrayRef` container of `SecCertificateRef` types.
     * 
     * @param identity
     *                 A `sec_identity_t` instance.
     * 
     * @return The underlying `CFArrayRef` container with `SecCertificateRef` instances.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native CFArrayRef sec_identity_copy_certificates_ref(NSObject identity);

    /**
     * [@function] sec_certificate_create
     * 
     * Create an ARC-able `sec_certificate_t` instance from a `SecCertificateRef`.
     * 
     * @param certificate
     *                    A `SecCertificateRef` instance.
     * 
     * @return a `sec_certificate_t` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_certificate_create(SecCertificateRef certificate);

    /**
     * [@function] sec_certificate_copy_ref
     * 
     * Copy a retained reference to the underlying `SecCertificateRef` instance.
     * 
     * @param certificate
     *                    A `sec_certificate_t` instance.
     * 
     * @return The underlying `SecCertificateRef` instance.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native SecCertificateRef sec_certificate_copy_ref(NSObject certificate);

    /**
     * [@function] sec_protocol_metadata_get_negotiated_protocol
     * 
     * Get the application protocol negotiated, e.g., via the TLS ALPN extension.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A NULL-terminated string carrying the negotiated protocol.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String sec_protocol_metadata_get_negotiated_protocol(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_copy_peer_public_key
     * 
     * Get the protocol instance peer's public key.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A `dispatch_data_t` containing the peer's raw public key.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_protocol_metadata_copy_peer_public_key(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_get_negotiated_tls_protocol_version
     * 
     * Get the negotiated TLS version.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A `tls_protocol_version_t` value.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native short sec_protocol_metadata_get_negotiated_tls_protocol_version(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_get_negotiated_protocol_version
     * 
     * Get the negotiated TLS version.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A SSLProtocol enum of the TLS version.
     * 
     *         API-Since: 12.0
     *         Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int sec_protocol_metadata_get_negotiated_protocol_version(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_get_negotiated_tls_ciphersuite
     * 
     * Get the negotiated TLS ciphersuite.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A `tls_ciphersuite_t`.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native short sec_protocol_metadata_get_negotiated_tls_ciphersuite(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_get_negotiated_ciphersuite
     * 
     * Get the negotiated TLS ciphersuite.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A SSLCipherSuite.
     * 
     *         API-Since: 12.0
     *         Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native char sec_protocol_metadata_get_negotiated_ciphersuite(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_get_early_data_accepted
     * 
     * Determine if early data was accepted by the peer.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return A bool indicating if early data was accepted.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_get_early_data_accepted(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_access_peer_certificate_chain
     * 
     * Get the certificate chain of the protocol instance peer.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @param handler
     *                 A block to invoke one or more times with sec_certificate_t objects
     * 
     * @return Returns true if the peer certificates were accessible, false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_access_peer_certificate_chain(NSObject metadata,
            @ObjCBlock(name = "call_sec_protocol_metadata_access_peer_certificate_chain") Block_sec_protocol_metadata_access_peer_certificate_chain handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_metadata_access_peer_certificate_chain {
        @Generated
        void call_sec_protocol_metadata_access_peer_certificate_chain(NSObject arg0);
    }

    /**
     * [@function] sec_protocol_metadata_copy_ocsp_response
     * 
     * Get the OCSP response from the protocol instance peer.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @param handler
     *                 A block to invoke one or more times with OCSP data
     * 
     * @return Returns true if the OSCP response was accessible, false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_access_ocsp_response(NSObject metadata,
            @ObjCBlock(name = "call_sec_protocol_metadata_access_ocsp_response") Block_sec_protocol_metadata_access_ocsp_response handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_metadata_access_ocsp_response {
        @Generated
        void call_sec_protocol_metadata_access_ocsp_response(NSObject arg0);
    }

    /**
     * [@function] sec_protocol_metadata_access_supported_signature_algorithms
     * 
     * Get the signature algorithms supported by the peer. Clients may call this
     * in response to a challenge block.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @param handler
     *                 A block to invoke one or more times with OCSP data
     * 
     * @return Returns true if the supported signature list was accessible, false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_access_supported_signature_algorithms(NSObject metadata,
            @ObjCBlock(name = "call_sec_protocol_metadata_access_supported_signature_algorithms") Block_sec_protocol_metadata_access_supported_signature_algorithms handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_metadata_access_supported_signature_algorithms {
        @Generated
        void call_sec_protocol_metadata_access_supported_signature_algorithms(char arg0);
    }

    /**
     * [@function] sec_protocol_metadata_access_distinguished_names
     * 
     * Get the X.509 Distinguished Names from the protocol instance peer.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @param handler
     *                 A block to invoke one or more times with distinguished_name data
     * 
     * @return Returns true if the distinguished names were accessible, false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_access_distinguished_names(NSObject metadata,
            @ObjCBlock(name = "call_sec_protocol_metadata_access_distinguished_names") Block_sec_protocol_metadata_access_distinguished_names handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_metadata_access_distinguished_names {
        @Generated
        void call_sec_protocol_metadata_access_distinguished_names(NSObject arg0);
    }

    /**
     * [@function] sec_protocol_metadata_access_pre_shared_keys
     * 
     * Get the PSKs supported by the local instance.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @param handler
     *                 A block to invoke one or more times with tuples of dispatch_data_t objects carrying PSKs and
     *                 their corresponding identities.
     * 
     * @return Returns true if the PSKs were accessible, false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_access_pre_shared_keys(NSObject metadata,
            @ObjCBlock(name = "call_sec_protocol_metadata_access_pre_shared_keys") Block_sec_protocol_metadata_access_pre_shared_keys handler);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_metadata_access_pre_shared_keys {
        @Generated
        void call_sec_protocol_metadata_access_pre_shared_keys(NSObject arg0, NSObject arg1);
    }

    /**
     * [@function] sec_protocol_metadata_get_server_name
     * 
     * Obtain the server name offered by a client or server during
     * connection establishmet. This is the value commonly carried
     * in the TLS SNI extesion.
     * 
     * @param metadata
     *                 A `sec_protocol_metadata_t` instance.
     * 
     * @return Returns A NULL-terminated string carrying the server name, or NULL
     *         if none was provided.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String sec_protocol_metadata_get_server_name(NSObject metadata);

    /**
     * [@function] sec_protocol_metadata_peers_are_equal
     * 
     * Compare peer information for two `sec_protocol_metadata` instances.
     * This comparison does not include protocol configuration options, e.g., ciphersuites.
     * 
     * @param metadataA
     *                  A `sec_protocol_metadata_t` instance.
     * 
     * @param metadataB
     *                  A `sec_protocol_metadata_t` instance.
     * 
     * @return Returns true if both metadata values refer to the same peer, and false otherwise.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_peers_are_equal(NSObject metadataA, NSObject metadataB);

    /**
     * [@function] sec_protocol_metadata_challenge_parameters_are_equal
     * 
     * Compare challenge-relevant information for two `sec_protocol_metadata` instances.
     * 
     * This comparison includes all information relevant to a challenge request, including:
     * distinguished names, signature algorithms, and supported certificate types.
     * See Section 7.4.4 of RFC5246 for more details.
     * 
     * @param metadataA
     *                  A `sec_protocol_metadata_t` instance.
     * 
     * @param metadataB
     *                  A `sec_protocol_metadata_t` instance.
     * 
     * @return Returns true if both metadata values have the same challenge parameters.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_metadata_challenge_parameters_are_equal(NSObject metadataA,
            NSObject metadataB);

    /**
     * [@function] sec_protocol_metadata_create_secret
     * 
     * Export a secret, e.g., a cryptographic key, derived from the protocol metadata using a label string.
     * 
     * @param metadata
     *                        A `sec_protocol_metadata_t` instance.
     * 
     * @param label_len
     *                        Length of the KDF label string.
     * 
     * @param label
     *                        KDF label string.
     * 
     * @param exporter_length
     *                        Length of the secret to be exported.
     * 
     * @return Returns a dispatch_data_t object carrying the exported secret.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_protocol_metadata_create_secret(NSObject metadata, @NUInt long label_len,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            @NUInt long exporter_length);

    /**
     * [@function] sec_protocol_metadata_create_secret_with_context
     * 
     * Export a secret, e.g., a cryptographic key, derived from the protocol metadata using a label and context string.
     * 
     * @param metadata
     *                        A `sec_protocol_metadata_t` instance.
     * 
     * @param label_len
     *                        Length of the KDF label string.
     * 
     * @param label
     *                        KDF label string.
     * 
     * @param context_len
     *                        Length of the KDF context string.
     * 
     * @param context
     *                        Constant opaque context value
     * 
     * @param exporter_length
     *                        Length of the secret to be exported.
     * 
     * @return Returns a dispatch_data_t object carrying the exported secret.
     * 
     *         API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native NSObject sec_protocol_metadata_create_secret_with_context(NSObject metadata,
            @NUInt long label_len,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            @NUInt long context_len,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String context,
            @NUInt long exporter_length);

    /**
     * [@function] sec_protocol_options_are_equal
     * 
     * Compare two `sec_protocol_options_t` instances.
     * 
     * @param optionsA
     *                 A `sec_protocol_options_t` instance.
     * 
     * @param optionsB
     *                 A `sec_protocol_options_t` instance.
     * 
     * @return True if equal, and false otherwise.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native boolean sec_protocol_options_are_equal(NSObject optionsA, NSObject optionsB);

    /**
     * [@function] sec_protocol_options_set_local_identity
     * 
     * Set the local identity to be used for this protocol instance.
     * 
     * @param options
     *                 A `sec_protocol_options_t` instance.
     * 
     * @param identity
     *                 A `sec_identity_t` instance carrying the private key and certificate.
     * 
     *                 API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_local_identity(NSObject options, NSObject identity);

    /**
     * [@function] sec_protocol_options_append_tls_ciphersuite
     * 
     * Append a TLS ciphersuite to the set of enabled ciphersuites.
     * 
     * @param options
     *                    A `sec_protocol_options_t` instance.
     * 
     * @param ciphersuite
     *                    A `tls_ciphersuite_t` value.
     * 
     *                    API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_append_tls_ciphersuite(NSObject options, short ciphersuite);

    /**
     * [@function] sec_protocol_options_add_tls_ciphersuite
     * 
     * Add a TLS ciphersuite to the set of enabled ciphersuites.
     * 
     * @param options
     *                    A `sec_protocol_options_t` instance.
     * 
     * @param ciphersuite
     *                    A SSLCipherSuite value.
     * 
     *                    API-Since: 12.0
     *                    Deprecated-Since: 13.0
     *                    Deprecated-Message: Use sec_protocol_options_append_tls_ciphersuite
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void sec_protocol_options_add_tls_ciphersuite(NSObject options, char ciphersuite);

    /**
     * [@function] sec_protocol_options_append_tls_ciphersuite_group
     * 
     * Append a TLS ciphersuite group to the set of enabled ciphersuites.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param group
     *                A tls_ciphersuite_group_t value.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_append_tls_ciphersuite_group(NSObject options, short group);

    /**
     * [@function] sec_protocol_options_add_tls_ciphersuite_group
     * 
     * Add a TLS ciphersuite group to the set of enabled ciphersuites.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param group
     *                A SSLCipherSuiteGroup value.
     * 
     *                API-Since: 12.0
     *                Deprecated-Since: 13.0
     *                Deprecated-Message: Use sec_protocol_options_append_tls_ciphersuite_group
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void sec_protocol_options_add_tls_ciphersuite_group(NSObject options, int group);

    /**
     * [@function] sec_protocol_options_set_tls_min_version
     * 
     * Set the minimum support TLS version.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param version
     *                A SSLProtocol enum value.
     * 
     *                API-Since: 12.0
     *                Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_min_version(NSObject options, int version);

    /**
     * [@function] sec_protocol_options_set_min_tls_protocol_version
     * 
     * Set the minimum support TLS version.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param version
     *                A tls_protocol_version_t enum value.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_min_tls_protocol_version(NSObject options, short version);

    /**
     * [@function] sec_protocol_options_get_default_min_tls_protocol_version
     * 
     * Get the system default minimum TLS protocol version.
     * 
     * @return The default minimum TLS version.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native short sec_protocol_options_get_default_min_tls_protocol_version();

    /**
     * [@function] sec_protocol_options_get_default_min_dtls_protocol_version
     * 
     * Get the system default minimum DTLS protocol version.
     * 
     * @return The default minimum DTLS version.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native short sec_protocol_options_get_default_min_dtls_protocol_version();

    /**
     * [@function] sec_protocol_options_set_tls_max_version
     * 
     * Set the maximum support TLS version.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param version
     *                A SSLProtocol enum value.
     * 
     *                API-Since: 12.0
     *                Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_max_version(NSObject options, int version);

    /**
     * [@function] sec_protocol_options_set_max_tls_protocol_version
     * 
     * Set the maximum support TLS version.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param version
     *                A tls_protocol_version_t enum value.
     * 
     *                API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_max_tls_protocol_version(NSObject options, short version);

    /**
     * [@function] sec_protocol_options_get_default_max_tls_protocol_version
     * 
     * Get the system default maximum TLS protocol version.
     * 
     * @return The default maximum TLS version.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native short sec_protocol_options_get_default_max_tls_protocol_version();

    /**
     * [@function] sec_protocol_options_get_default_max_tls_protocol_version
     * 
     * Get the system default maximum DTLS protocol version.
     * 
     * @return The default maximum DTLS version.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native short sec_protocol_options_get_default_max_dtls_protocol_version();

    /**
     * [@function] sec_protocol_options_add_tls_application_protocol
     * 
     * Add an application protocol supported by clients of this protocol instance.
     * 
     * @param options
     *                             A `sec_protocol_options_t` instance.
     * 
     * @param application_protocol
     *                             A NULL-terminated string defining the application protocol.
     * 
     *                             API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_add_tls_application_protocol(NSObject options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String application_protocol);

    /**
     * [@function] sec_protocol_options_set_tls_server_name
     * 
     * Set the server name to be used when verifying the peer's certificate. This will override
     * the server name obtained from the endpoint.
     * 
     * @param options
     *                    A `sec_protocol_options_t` instance.
     * 
     * @param server_name
     *                    A NULL-terminated string carrying the server name.
     * 
     *                    API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_server_name(NSObject options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String server_name);

    /**
     * [@function] sec_protocol_options_set_tls_diffie_hellman_parameters
     * 
     * Set the supported Diffie-Hellman parameters.
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     * 
     * @param params
     *                A dispatch_data_t containing legacy Diffie-Hellman parameters.
     * 
     *                API-Since: 12.0
     *                Deprecated-Since: 13.0
     *                Deprecated-Message: DHE ciphersuites are no longer supported
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_diffie_hellman_parameters(NSObject options, NSObject params);

    /**
     * [@function] sec_protocol_options_add_pre_shared_key
     * 
     * Add a pre-shared key (PSK) and its identity to the options.
     * 
     * @param options
     *                     A `sec_protocol_options_t` instance.
     * 
     * @param psk
     *                     A dispatch_data_t containing a PSK blob.
     * 
     * @param psk_identity
     *                     A dispatch_data_t containing a PSK identity blob.
     * 
     *                     API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_add_pre_shared_key(NSObject options, NSObject psk,
            NSObject psk_identity);

    /**
     * [@function] sec_protocol_options_set_tls_pre_shared_key_identity_hint
     * 
     * Set the PSK identity hint to use by servers when negotiating a PSK ciphersuite.
     * See https://tools.ietf.org/html/rfc4279 for more details.
     * 
     * @param options
     *                          A `sec_protocol_options_t` instance.
     * 
     * @param psk_identity_hint
     *                          A dispatch_data_t containing a PSK identity hint.
     * 
     *                          API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_pre_shared_key_identity_hint(NSObject options,
            NSObject psk_identity_hint);

    /**
     * [@function] sec_protocol_options_set_tls_tickets_enabled
     * 
     * Enable or disable TLS session ticket support.
     * 
     * @param options
     *                        A `sec_protocol_options_t` instance.
     * 
     * @param tickets_enabled
     *                        Flag to enable or disable TLS session ticket support.
     * 
     *                        API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_tickets_enabled(NSObject options, boolean tickets_enabled);

    /**
     * [@function] sec_protocol_options_set_tls_is_fallback_attempt
     * 
     * Signal if this is a TLS fallback attempt.
     * 
     * A fallback attempt is one following a previously failed TLS connection
     * due to version or parameter incompatibility, e.g., when speaking to a server
     * that does not support a client-offered ciphersuite.
     * 
     * Clients MUST NOT enable fallback for fresh connections.
     * 
     * @param options
     *                            A `sec_protocol_options_t` instance.
     * 
     * @param is_fallback_attempt
     *                            Set a flag indicating that this is a TLS fallback attempt.
     * 
     *                            API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_is_fallback_attempt(NSObject options,
            boolean is_fallback_attempt);

    /**
     * [@function] sec_protocol_options_set_tls_resumption_enabled
     * 
     * Enable or disable TLS session resumption.
     * 
     * @param options
     *                           A `sec_protocol_options_t` instance.
     * 
     * @param resumption_enabled
     *                           Flag to enable or disable TLS session resumption.
     * 
     *                           API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_resumption_enabled(NSObject options,
            boolean resumption_enabled);

    /**
     * [@function] sec_protocol_options_set_tls_false_start_enabled
     * 
     * Enable or disable TLS False Start.
     * 
     * @param options
     *                            A `sec_protocol_options_t` instance.
     * 
     * @param false_start_enabled
     *                            Flag to enable or disable TLS False Start.
     * 
     *                            API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_false_start_enabled(NSObject options,
            boolean false_start_enabled);

    /**
     * [@function] nw_protocol_options_set_tls_ocsp_enabled
     * 
     * Enable or disable OCSP support.
     * 
     * @param options
     *                     A `sec_protocol_options_t` instance.
     * 
     * @param ocsp_enabled
     *                     Flag to enable or disable OCSP support.
     * 
     *                     API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_ocsp_enabled(NSObject options, boolean ocsp_enabled);

    /**
     * [@function] sec_protocol_options_set_tls_sct_enabled
     * 
     * Enable or disable SCT (signed certificate timestamp) support.
     * 
     * @param options
     *                    A `sec_protocol_options_t` instance.
     * 
     * @param sct_enabled
     *                    Flag to enable or disable SCT support.
     * 
     *                    API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_sct_enabled(NSObject options, boolean sct_enabled);

    /**
     * [@function] sec_protocol_options_set_tls_renegotiation_enabled
     * 
     * Enable or disable TLS (1.2 and prior) session renegotiation. This defaults to `true`.
     * 
     * @param options
     *                              A `sec_protocol_options_t` instance.
     * 
     * @param renegotiation_enabled
     *                              Flag to enable or disable TLS (1.2 and prior) session renegotiation.
     * 
     *                              API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_tls_renegotiation_enabled(NSObject options,
            boolean renegotiation_enabled);

    /**
     * [@function] sec_protocol_options_set_peer_authentication_required
     * 
     * Enable or disable peer authentication. Clients default to true, whereas servers default to false.
     * 
     * @param options
     *                                     A `sec_protocol_options_t` instance.
     * 
     * @param peer_authentication_required
     *                                     Flag to enable or disable mandatory peer authentication.
     * 
     *                                     API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_peer_authentication_required(NSObject options,
            boolean peer_authentication_required);

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    public static native CFStringRef kSecUseDataProtectionKeychain();

    /**
     * [@function] sec_protocol_options_set_pre_shared_key_selection_block
     * 
     * Set the PSK selection block.
     * 
     * [@params] psk_selection_queue
     * A `dispatch_queue_t` on which the PSK selection block should be called.
     * 
     * API-Since: 13.0
     * 
     * @param options
     *                            A `sec_protocol_options_t` instance.
     * 
     * @param psk_selection_block
     *                            A `sec_protocol_pre_shared_key_selection_t` block.
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_pre_shared_key_selection_block(NSObject options,
            @ObjCBlock(name = "call_sec_protocol_options_set_pre_shared_key_selection_block") Block_sec_protocol_options_set_pre_shared_key_selection_block psk_selection_block,
            NSObject psk_selection_queue);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_options_set_pre_shared_key_selection_block {
        @Runtime(CRuntime.class)
        @Generated
        public interface Block_Block_sec_protocol_options_set_pre_shared_key_selection_block {
            @Generated
            void call_Block_sec_protocol_options_set_pre_shared_key_selection_block(NSObject psk_identity);
        }

        @Generated
        void call_sec_protocol_options_set_pre_shared_key_selection_block(NSObject metadata, NSObject psk_identity_hint,
                @ObjCBlock(name = "call_Block_sec_protocol_options_set_pre_shared_key_selection_block") Block_Block_sec_protocol_options_set_pre_shared_key_selection_block complete);
    }

    /**
     * [@function] sec_protocol_options_set_key_update_block
     * 
     * Set the key update block.
     * 
     * [@params] key_update_queue
     * A `dispatch_queue_t` on which the key update block should be called.
     * 
     * API-Since: 12.0
     * 
     * @param options
     *                         A `sec_protocol_options_t` instance.
     * 
     * @param key_update_block
     *                         A `sec_protocol_key_update_t` block.
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_key_update_block(NSObject options,
            @ObjCBlock(name = "call_sec_protocol_options_set_key_update_block") Block_sec_protocol_options_set_key_update_block key_update_block,
            NSObject key_update_queue);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_options_set_key_update_block {
        @Runtime(CRuntime.class)
        @Generated
        public interface Block_Block_sec_protocol_options_set_key_update_block {
            @Generated
            void call_Block_sec_protocol_options_set_key_update_block();
        }

        @Generated
        void call_sec_protocol_options_set_key_update_block(NSObject metadata,
                @ObjCBlock(name = "call_Block_sec_protocol_options_set_key_update_block") Block_Block_sec_protocol_options_set_key_update_block complete);
    }

    /**
     * [@function] sec_protocol_options_set_challenge_block
     * 
     * Set the challenge block.
     * 
     * [@params] challenge_block
     * A `sec_protocol_challenge_t` block.
     * 
     * [@params] challenge_queue
     * A `dispatch_queue_t` on which the challenge block should be called.
     * 
     * API-Since: 12.0
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_challenge_block(NSObject options,
            @ObjCBlock(name = "call_sec_protocol_options_set_challenge_block") Block_sec_protocol_options_set_challenge_block challenge_block,
            NSObject challenge_queue);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_options_set_challenge_block {
        @Runtime(CRuntime.class)
        @Generated
        public interface Block_Block_sec_protocol_options_set_challenge_block {
            @Generated
            void call_Block_sec_protocol_options_set_challenge_block(NSObject identity);
        }

        @Generated
        void call_sec_protocol_options_set_challenge_block(NSObject metadata,
                @ObjCBlock(name = "call_Block_sec_protocol_options_set_challenge_block") Block_Block_sec_protocol_options_set_challenge_block complete);
    }

    /**
     * [@function] sec_protocol_options_set_verify_block
     * 
     * Set the verify block.
     * 
     * [@params] verify_block
     * A `sec_protocol_verify_t` block.
     * 
     * [@params] verify_block_queue
     * A `dispatch_queue_t` on which the verify block should be called.
     * 
     * API-Since: 12.0
     * 
     * @param options
     *                A `sec_protocol_options_t` instance.
     */
    @Generated
    @CFunction
    public static native void sec_protocol_options_set_verify_block(NSObject options,
            @ObjCBlock(name = "call_sec_protocol_options_set_verify_block") Block_sec_protocol_options_set_verify_block verify_block,
            NSObject verify_block_queue);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_sec_protocol_options_set_verify_block {
        @Runtime(CRuntime.class)
        @Generated
        public interface Block_Block_sec_protocol_options_set_verify_block {
            @Generated
            void call_Block_sec_protocol_options_set_verify_block(boolean result);
        }

        @Generated
        void call_sec_protocol_options_set_verify_block(NSObject metadata, NSObject trust_ref,
                @ObjCBlock(name = "call_Block_sec_protocol_options_set_verify_block") Block_Block_sec_protocol_options_set_verify_block complete);
    }

    /**
     * [@function] SecTrustCopyKey
     * 
     * Return the public key for a leaf certificate after it has
     * been evaluated.
     * 
     * RSA and ECDSA public keys are supported. All other public key algorithms are unsupported.
     * 
     * API-Since: 14.0
     * 
     * @param trust A reference to the trust object which has been evaluated.
     * @return The certificate's public key, or NULL if it the public key could
     *         not be extracted (this can happen if the public key algorithm is not
     *         supported). The caller is responsible for calling CFRelease on the
     *         returned key when it is no longer needed.
     */
    @Generated
    @CFunction
    public static native SecKeyRef SecTrustCopyKey(SecTrustRef trust);

    /**
     * [@function] SecTrustCopyCertificateChain
     * 
     * Returns the certificate trust chain
     * 
     * @param trust Reference to a trust object.
     * @return A CFArray of the SecCertificateRefs for the resulting certificate chain
     * 
     *         API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native CFArrayRef SecTrustCopyCertificateChain(SecTrustRef trust);
}
