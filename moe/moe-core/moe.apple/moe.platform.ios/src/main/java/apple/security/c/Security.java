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

    @Generated
    @CFunction
    @NUInt
    public static native long SecCertificateGetTypeID();

    @Generated
    @CFunction
    public static native SecCertificateRef SecCertificateCreateWithData(CFAllocatorRef allocator, CFDataRef data);

    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopyData(SecCertificateRef certificate);

    @Generated
    @CFunction
    public static native CFStringRef SecCertificateCopySubjectSummary(SecCertificateRef certificate);

    @Generated
    @CFunction
    @NUInt
    public static native long SecIdentityGetTypeID();

    @Generated
    @CFunction
    public static native int SecIdentityCopyCertificate(SecIdentityRef identityRef,
            Ptr<SecCertificateRef> certificateRef);

    @Generated
    @CFunction
    public static native int SecIdentityCopyPrivateKey(SecIdentityRef identityRef, Ptr<SecKeyRef> privateKeyRef);

    @Generated
    @CFunction
    public static native int SecPKCS12Import(CFDataRef pkcs12_data, CFDictionaryRef options, Ptr<CFArrayRef> items);

    @Generated
    @CFunction
    @NUInt
    public static native long SecAccessControlGetTypeID();

    @Generated
    @CFunction
    public static native SecAccessControlRef SecAccessControlCreateWithFlags(CFAllocatorRef allocator,
            ConstVoidPtr protection, @NUInt long flags, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native int SecItemCopyMatching(CFDictionaryRef query, Ptr<ConstVoidPtr> result);

    @Generated
    @CFunction
    public static native int SecItemAdd(CFDictionaryRef attributes, Ptr<ConstVoidPtr> result);

    @Generated
    @CFunction
    public static native int SecItemUpdate(CFDictionaryRef query, CFDictionaryRef attributesToUpdate);

    @Generated
    @CFunction
    public static native int SecItemDelete(CFDictionaryRef query);

    @Generated
    @CFunction
    @NUInt
    public static native long SecKeyGetTypeID();

    @Generated
    @CFunction
    public static native int SecKeyGeneratePair(CFDictionaryRef parameters, Ptr<SecKeyRef> publicKey,
            Ptr<SecKeyRef> privateKey);

    @Generated
    @CFunction
    public static native int SecKeyRawSign(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String dataToSign,
            @NUInt long dataToSignLen, BytePtr sig, NUIntPtr sigLen);

    @Generated
    @CFunction
    public static native int SecKeyRawVerify(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String signedData,
            @NUInt long signedDataLen,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String sig,
            @NUInt long sigLen);

    @Generated
    @CFunction
    public static native int SecKeyEncrypt(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String plainText,
            @NUInt long plainTextLen, BytePtr cipherText, NUIntPtr cipherTextLen);

    @Generated
    @CFunction
    public static native int SecKeyDecrypt(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cipherText,
            @NUInt long cipherTextLen, BytePtr plainText, NUIntPtr plainTextLen);

    @Generated
    @CFunction
    @NUInt
    public static native long SecKeyGetBlockSize(SecKeyRef key);

    @Generated
    @CFunction
    public static native SecKeyRef SecKeyCreateRandomKey(CFDictionaryRef parameters, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native SecKeyRef SecKeyCreateWithData(CFDataRef keyData, CFDictionaryRef attributes,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDataRef SecKeyCopyExternalRepresentation(SecKeyRef key, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDictionaryRef SecKeyCopyAttributes(SecKeyRef key);

    @Generated
    @CFunction
    public static native SecKeyRef SecKeyCopyPublicKey(SecKeyRef key);

    @Generated
    @CFunction
    public static native CFDataRef SecKeyCreateSignature(SecKeyRef key, CFStringRef algorithm, CFDataRef dataToSign,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native byte SecKeyVerifySignature(SecKeyRef key, CFStringRef algorithm, CFDataRef signedData,
            CFDataRef signature, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDataRef SecKeyCreateEncryptedData(SecKeyRef key, CFStringRef algorithm, CFDataRef plaintext,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDataRef SecKeyCreateDecryptedData(SecKeyRef key, CFStringRef algorithm, CFDataRef ciphertext,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDataRef SecKeyCopyKeyExchangeResult(SecKeyRef privateKey, CFStringRef algorithm,
            SecKeyRef publicKey, CFDictionaryRef parameters, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native byte SecKeyIsAlgorithmSupported(SecKeyRef key, @NInt long operation, CFStringRef algorithm);

    @Generated
    @CFunction
    @NUInt
    public static native long SecPolicyGetTypeID();

    @Generated
    @CFunction
    public static native CFDictionaryRef SecPolicyCopyProperties(SecPolicyRef policyRef);

    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateBasicX509();

    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateSSL(byte server, CFStringRef hostname);

    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateRevocation(@NUInt long revocationFlags);

    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateWithProperties(ConstVoidPtr policyIdentifier,
            CFDictionaryRef properties);

    @Generated
    @CFunction
    public static native int SecRandomCopyBytes(SecRandomRef rnd, @NUInt long count, BytePtr bytes);

    @Generated
    @CFunction
    public static native void SecAddSharedWebCredential(CFStringRef fqdn, CFStringRef account, CFStringRef password,
            @ObjCBlock(name = "call_SecAddSharedWebCredential") Block_SecAddSharedWebCredential completionHandler);

    @Generated
    @CFunction
    public static native void SecRequestSharedWebCredential(CFStringRef fqdn, CFStringRef account,
            @ObjCBlock(name = "call_SecRequestSharedWebCredential") Block_SecRequestSharedWebCredential completionHandler);

    @Generated
    @CFunction
    public static native CFStringRef SecCreateSharedWebCredentialPassword();

    @Generated
    @CFunction
    @NUInt
    public static native long SecTrustGetTypeID();

    @Generated
    @CFunction
    public static native int SecTrustCreateWithCertificates(ConstVoidPtr certificates, ConstVoidPtr policies,
            Ptr<SecTrustRef> trust);

    @Generated
    @CFunction
    public static native int SecTrustSetPolicies(SecTrustRef trust, ConstVoidPtr policies);

    @Generated
    @CFunction
    public static native int SecTrustCopyPolicies(SecTrustRef trust, Ptr<CFArrayRef> policies);

    @Generated
    @CFunction
    public static native int SecTrustSetNetworkFetchAllowed(SecTrustRef trust, byte allowFetch);

    @Generated
    @CFunction
    public static native int SecTrustGetNetworkFetchAllowed(SecTrustRef trust, BytePtr allowFetch);

    @Generated
    @CFunction
    public static native int SecTrustSetAnchorCertificates(SecTrustRef trust, CFArrayRef anchorCertificates);

    @Generated
    @CFunction
    public static native int SecTrustSetAnchorCertificatesOnly(SecTrustRef trust, byte anchorCertificatesOnly);

    @Generated
    @CFunction
    public static native int SecTrustCopyCustomAnchorCertificates(SecTrustRef trust, Ptr<CFArrayRef> anchors);

    @Generated
    @CFunction
    public static native int SecTrustSetVerifyDate(SecTrustRef trust, CFDateRef verifyDate);

    @Generated
    @CFunction
    public static native double SecTrustGetVerifyTime(SecTrustRef trust);

    @Generated
    @CFunction
    public static native int SecTrustEvaluate(SecTrustRef trust, IntPtr result);

    @Generated
    @CFunction
    public static native int SecTrustEvaluateAsync(SecTrustRef trust, NSObject queue,
            @ObjCBlock(name = "call_SecTrustEvaluateAsync") Block_SecTrustEvaluateAsync result);

    @Generated
    @CFunction
    public static native int SecTrustGetTrustResult(SecTrustRef trust, IntPtr result);

    @Generated
    @CFunction
    public static native SecKeyRef SecTrustCopyPublicKey(SecTrustRef trust);

    @Generated
    @CFunction
    @NInt
    public static native long SecTrustGetCertificateCount(SecTrustRef trust);

    @Generated
    @CFunction
    public static native SecCertificateRef SecTrustGetCertificateAtIndex(SecTrustRef trust, @NInt long ix);

    @Generated
    @CFunction
    public static native CFDataRef SecTrustCopyExceptions(SecTrustRef trust);

    @Generated
    @CFunction
    public static native boolean SecTrustSetExceptions(SecTrustRef trust, CFDataRef exceptions);

    @Generated
    @CFunction
    public static native CFArrayRef SecTrustCopyProperties(SecTrustRef trust);

    @Generated
    @CFunction
    public static native CFDictionaryRef SecTrustCopyResult(SecTrustRef trust);

    @Generated
    @CFunction
    public static native int SecTrustSetOCSPResponse(SecTrustRef trust, ConstVoidPtr responseData);

    @Generated
    @CFunction
    @NUInt
    public static native long SSLContextGetTypeID();

    @Generated
    @CFunction
    public static native SSLContextRef SSLCreateContext(CFAllocatorRef alloc, int protocolSide, int connectionType);

    @Generated
    @CFunction
    public static native int SSLGetSessionState(SSLContextRef context, IntPtr state);

    @Generated
    @CFunction
    public static native int SSLSetSessionOption(SSLContextRef context, int option, byte value);

    @Generated
    @CFunction
    public static native int SSLGetSessionOption(SSLContextRef context, int option, BytePtr value);

    @Generated
    @CFunction
    public static native int SSLSetIOFuncs(SSLContextRef context,
            @FunctionPtr(name = "call_SSLSetIOFuncs_1") Function_SSLSetIOFuncs_1 readFunc,
            @FunctionPtr(name = "call_SSLSetIOFuncs_2") Function_SSLSetIOFuncs_2 writeFunc);

    @Generated
    @CFunction
    public static native int SSLSetSessionConfig(SSLContextRef context, CFStringRef config);

    @Generated
    @CFunction
    public static native int SSLSetProtocolVersionMin(SSLContextRef context, int minVersion);

    @Generated
    @CFunction
    public static native int SSLGetProtocolVersionMin(SSLContextRef context, IntPtr minVersion);

    @Generated
    @CFunction
    public static native int SSLSetProtocolVersionMax(SSLContextRef context, int maxVersion);

    @Generated
    @CFunction
    public static native int SSLGetProtocolVersionMax(SSLContextRef context, IntPtr maxVersion);

    @Generated
    @CFunction
    public static native int SSLSetCertificate(SSLContextRef context, CFArrayRef certRefs);

    @Generated
    @CFunction
    public static native int SSLSetConnection(SSLContextRef context, ConstVoidPtr connection);

    @Generated
    @CFunction
    public static native int SSLGetConnection(SSLContextRef context, Ptr<ConstVoidPtr> connection);

    @Generated
    @CFunction
    public static native int SSLSetPeerDomainName(SSLContextRef context,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String peerName,
            @NUInt long peerNameLen);

    @Generated
    @CFunction
    public static native int SSLGetPeerDomainNameLength(SSLContextRef context, NUIntPtr peerNameLen);

    @Generated
    @CFunction
    public static native int SSLGetPeerDomainName(SSLContextRef context, BytePtr peerName, NUIntPtr peerNameLen);

    @Generated
    @CFunction
    public static native int SSLCopyRequestedPeerName(SSLContextRef context, BytePtr peerName, NUIntPtr peerNameLen);

    @Generated
    @CFunction
    public static native int SSLCopyRequestedPeerNameLength(SSLContextRef ctx, NUIntPtr peerNameLen);

    @Generated
    @CFunction
    public static native int SSLSetDatagramHelloCookie(SSLContextRef dtlsContext, ConstVoidPtr cookie,
            @NUInt long cookieLen);

    @Generated
    @CFunction
    public static native int SSLSetMaxDatagramRecordSize(SSLContextRef dtlsContext, @NUInt long maxSize);

    @Generated
    @CFunction
    public static native int SSLGetMaxDatagramRecordSize(SSLContextRef dtlsContext, NUIntPtr maxSize);

    @Generated
    @CFunction
    public static native int SSLGetNegotiatedProtocolVersion(SSLContextRef context, IntPtr protocol);

    @Generated
    @CFunction
    public static native int SSLGetNumberSupportedCiphers(SSLContextRef context, NUIntPtr numCiphers);

    @Generated
    @CFunction
    public static native int SSLGetSupportedCiphers(SSLContextRef context, CharPtr ciphers, NUIntPtr numCiphers);

    @Generated
    @CFunction
    public static native int SSLSetEnabledCiphers(SSLContextRef context, ConstCharPtr ciphers, @NUInt long numCiphers);

    @Generated
    @CFunction
    public static native int SSLGetNumberEnabledCiphers(SSLContextRef context, NUIntPtr numCiphers);

    @Generated
    @CFunction
    public static native int SSLGetEnabledCiphers(SSLContextRef context, CharPtr ciphers, NUIntPtr numCiphers);

    @Generated
    @CFunction
    public static native int SSLCopyPeerTrust(SSLContextRef context, Ptr<SecTrustRef> trust);

    @Generated
    @CFunction
    public static native int SSLSetPeerID(SSLContextRef context, ConstVoidPtr peerID, @NUInt long peerIDLen);

    @Generated
    @CFunction
    public static native int SSLGetPeerID(SSLContextRef context, Ptr<ConstVoidPtr> peerID, NUIntPtr peerIDLen);

    @Generated
    @CFunction
    public static native int SSLGetNegotiatedCipher(SSLContextRef context, CharPtr cipherSuite);

    @Generated
    @Deprecated
    @CFunction
    public static native int SSLSetEncryptionCertificate(SSLContextRef context, CFArrayRef certRefs);

    @Generated
    @CFunction
    public static native int SSLSetClientSideAuthenticate(SSLContextRef context, int auth);

    @Generated
    @CFunction
    public static native int SSLAddDistinguishedName(SSLContextRef context, ConstVoidPtr derDN, @NUInt long derDNLen);

    @Generated
    @CFunction
    public static native int SSLCopyDistinguishedNames(SSLContextRef context, Ptr<CFArrayRef> names);

    @Generated
    @CFunction
    public static native int SSLGetClientCertificateState(SSLContextRef context, IntPtr clientState);

    @Generated
    @CFunction
    public static native int SSLHandshake(SSLContextRef context);

    @Generated
    @CFunction
    public static native int SSLReHandshake(SSLContextRef context);

    @Generated
    @CFunction
    public static native int SSLWrite(SSLContextRef context, ConstVoidPtr data, @NUInt long dataLength,
            NUIntPtr processed);

    @Generated
    @CFunction
    public static native int SSLRead(SSLContextRef context, VoidPtr data, @NUInt long dataLength, NUIntPtr processed);

    @Generated
    @CFunction
    public static native int SSLGetBufferedReadSize(SSLContextRef context, NUIntPtr bufSize);

    @Generated
    @CFunction
    public static native int SSLGetDatagramWriteSize(SSLContextRef dtlsContext, NUIntPtr bufSize);

    @Generated
    @CFunction
    public static native int SSLClose(SSLContextRef context);

    @Generated
    @CVariable()
    public static native CFStringRef kSecImportExportPassphrase();

    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemKeyID();

    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemTrust();

    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemCertChain();

    @Generated
    @CVariable()
    public static native CFStringRef kSecImportItemIdentity();

    @Generated
    @CVariable()
    public static native CFStringRef kSecClass();

    @Generated
    @CVariable()
    public static native CFStringRef kSecClassGenericPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kSecClassInternetPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kSecClassCertificate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecClassKey();

    @Generated
    @CVariable()
    public static native CFStringRef kSecClassIdentity();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessible();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessControl();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessGroup();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSynchronizable();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCreationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrModificationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrDescription();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrComment();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCreator();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrType();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsInvisible();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsNegative();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccount();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrService();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrGeneric();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSecurityDomain();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrServer();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocol();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationType();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPort();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPath();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSubject();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIssuer();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSerialNumber();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSubjectKeyID();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrPublicKeyHash();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCertificateType();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCertificateEncoding();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClass();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrApplicationLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrIsPermanent();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrApplicationTag();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyType();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeySizeInBits();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrEffectiveKeySize();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanEncrypt();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanDecrypt();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanDerive();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanSign();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanVerify();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanWrap();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrCanUnwrap();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSyncViewHint();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrTokenID();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleWhenUnlocked();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAfterFirstUnlock();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAlways();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleWhenUnlockedThisDeviceOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessibleAlwaysThisDeviceOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTPAccount();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIRC();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolNNTP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolPOP3();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSMTP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSOCKS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIMAP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolLDAP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolAppleTalk();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolAFP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolTelnet();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSSH();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTPS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTPS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTPProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolHTTPSProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolFTPProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolSMB();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolRTSP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolRTSPProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolDAAP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolEPPC();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIPP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolNNTPS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolLDAPS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolTelnetS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIMAPS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolIRCS();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrProtocolPOP3S();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeNTLM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeMSN();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeDPA();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeRPA();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeHTTPBasic();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeHTTPDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeHTMLForm();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAuthenticationTypeDefault();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClassPublic();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClassPrivate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyClassSymmetric();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyTypeRSA();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyTypeEC();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrKeyTypeECSECPrimeRandom();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSynchronizableAny();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchPolicy();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchItemList();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchSearchList();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchIssuers();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchEmailAddressIfPresent();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchSubjectContains();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchCaseInsensitive();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchTrustedOnly();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchValidOnDate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchLimit();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchLimitOne();

    @Generated
    @CVariable()
    public static native CFStringRef kSecMatchLimitAll();

    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnData();

    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnAttributes();

    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnRef();

    @Generated
    @CVariable()
    public static native CFStringRef kSecReturnPersistentRef();

    @Generated
    @CVariable()
    public static native CFStringRef kSecValueData();

    @Generated
    @CVariable()
    public static native CFStringRef kSecValueRef();

    @Generated
    @CVariable()
    public static native CFStringRef kSecValuePersistentRef();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseItemList();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseOperationPrompt();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseNoAuthenticationUI();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUI();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationContext();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUIAllow();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUIFail();

    @Generated
    @CVariable()
    public static native CFStringRef kSecUseAuthenticationUISkip();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrTokenIDSecureEnclave();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrAccessGroupToken();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPrivateKeyAttrs();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPublicKeyAttrs();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureRaw();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15Raw();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureRFC4754();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureDigestX962SHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDSASignatureMessageX962SHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionRaw();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionPKCS1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA1AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA224AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA256AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA384AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmRSAEncryptionOAEPSHA512AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA1AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA224AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA256AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA384AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionStandardX963SHA512AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA1AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA224AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA256AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA384AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECIESEncryptionCofactorX963SHA512AESGCM();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandard();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactor();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA1();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA224();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA256();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA384();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA512();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyKeyExchangeParameterRequestedSize();

    @Generated
    @CVariable()
    public static native CFStringRef kSecKeyKeyExchangeParameterSharedInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleX509Basic();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleSSL();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleSMIME();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleEAP();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleIPsec();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleCodeSigning();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyMacAppStoreReceipt();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleIDValidation();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleTimeStamping();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleRevocation();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyApplePassbookSigning();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyApplePayIssuerEncryption();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyOid();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyName();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyClient();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyRevocationFlags();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyTeamIdentifier();

    @Generated
    @CVariable()
    public static native SecRandomRef kSecRandomDefault();

    @Generated
    @CVariable()
    public static native CFStringRef kSecSharedPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPropertyTypeTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPropertyTypeError();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustEvaluationDate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustExtendedValidation();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustOrganizationName();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustResultValue();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustRevocationChecked();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustRevocationValidUntilDate();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustCertificateTransparency();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustCertificateTransparencyWhiteList();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_default();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_ATSv1();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_ATSv1_noPFS();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_standard();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_RC4_fallback();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_TLSv1_fallback();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_TLSv1_RC4_fallback();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_legacy();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_legacy_DHE();

    @Generated
    @CVariable()
    public static native CFStringRef kSSLSessionConfig_anonymous();

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
        void call_SecTrustEvaluateAsync(SecTrustRef arg0, int arg1);
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
}
