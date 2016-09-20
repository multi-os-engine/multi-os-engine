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

    /**
     * SecCertificateGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecCertificateGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecCertificateGetTypeID();

    /**
     * SecCertificateCreateWithData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecCertificateCreateWithData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native SecCertificateRef SecCertificateCreateWithData(CFAllocatorRef allocator, CFDataRef data);

    /**
     * SecCertificateCopyData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecCertificateCopyData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef SecCertificateCopyData(SecCertificateRef certificate);

    /**
     * SecCertificateCopySubjectSummary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecCertificateCopySubjectSummary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef SecCertificateCopySubjectSummary(SecCertificateRef certificate);

    /**
     * SecIdentityGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecIdentityGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecIdentityGetTypeID();

    /**
     * SecIdentityCopyCertificate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecIdentityCopyCertificate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecIdentityCopyCertificate(SecIdentityRef identityRef,
            Ptr<SecCertificateRef> certificateRef);

    /**
     * SecIdentityCopyPrivateKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecIdentityCopyPrivateKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecIdentityCopyPrivateKey(SecIdentityRef identityRef, Ptr<SecKeyRef> privateKeyRef);

    /**
     * SecPKCS12Import</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecPKCS12Import">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecPKCS12Import(CFDataRef pkcs12_data, CFDictionaryRef options, Ptr<CFArrayRef> items);

    @Generated
    @CFunction
    @NUInt
    public static native long SecAccessControlGetTypeID();

    /**
     * SecAccessControlCreateWithFlags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/keychainservices/index.html#//apple_ref/c/func/SecAccessControlCreateWithFlags">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native SecAccessControlRef SecAccessControlCreateWithFlags(CFAllocatorRef allocator,
            ConstVoidPtr protection, @NInt long flags, Ptr<CFErrorRef> error);

    /**
     * SecItemCopyMatching</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/keychainservices/index.html#//apple_ref/c/func/SecItemCopyMatching">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecItemCopyMatching(CFDictionaryRef query, Ptr<ConstVoidPtr> result);

    /**
     * SecItemAdd</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/keychainservices/index.html#//apple_ref/c/func/SecItemAdd">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecItemAdd(CFDictionaryRef attributes, Ptr<ConstVoidPtr> result);

    /**
     * SecItemUpdate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/keychainservices/index.html#//apple_ref/c/func/SecItemUpdate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecItemUpdate(CFDictionaryRef query, CFDictionaryRef attributesToUpdate);

    /**
     * SecItemDelete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/keychainservices/index.html#//apple_ref/c/func/SecItemDelete">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecItemDelete(CFDictionaryRef query);

    /**
     * SecKeyGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecKeyGetTypeID();

    /**
     * SecKeyGeneratePair</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyGeneratePair">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecKeyGeneratePair(CFDictionaryRef parameters, Ptr<SecKeyRef> publicKey,
            Ptr<SecKeyRef> privateKey);

    /**
     * SecKeyRawSign</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyRawSign">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecKeyRawSign(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String dataToSign,
            @NUInt long dataToSignLen, BytePtr sig, NUIntPtr sigLen);

    /**
     * SecKeyRawVerify</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyRawVerify">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecKeyRawVerify(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String signedData,
            @NUInt long signedDataLen,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String sig,
            @NUInt long sigLen);

    /**
     * SecKeyEncrypt</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyEncrypt">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecKeyEncrypt(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String plainText,
            @NUInt long plainTextLen, BytePtr cipherText, NUIntPtr cipherTextLen);

    /**
     * SecKeyDecrypt</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyDecrypt">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecKeyDecrypt(SecKeyRef key, int padding,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cipherText,
            @NUInt long cipherTextLen, BytePtr plainText, NUIntPtr plainTextLen);

    /**
     * SecKeyGetBlockSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecKeyGetBlockSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecKeyGetBlockSize(SecKeyRef key);

    /**
     * SecPolicyGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecPolicyGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecPolicyGetTypeID();

    /**
     * SecPolicyCopyProperties</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecPolicyCopyProperties">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef SecPolicyCopyProperties(SecPolicyRef policyRef);

    /**
     * SecPolicyCreateBasicX509</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecPolicyCreateBasicX509">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native SecPolicyRef SecPolicyCreateBasicX509();

    /**
     * SecPolicyCreateSSL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecPolicyCreateSSL">iOS Dev Center</a>
     */
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

    /**
     * SecRandomCopyBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/RandomizationReference/index.html#//apple_ref/c/func/SecRandomCopyBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecRandomCopyBytes(SecRandomRef rnd, @NUInt long count, BytePtr bytes);

    /**
     * SecAddSharedWebCredential</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/SharedWebCredentialsRef/index.html#//apple_ref/c/func/SecAddSharedWebCredential">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void SecAddSharedWebCredential(CFStringRef fqdn, CFStringRef account, CFStringRef password,
            @ObjCBlock(name = "call_SecAddSharedWebCredential") Block_SecAddSharedWebCredential completionHandler);

    /**
     * SecRequestSharedWebCredential</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/SharedWebCredentialsRef/index.html#//apple_ref/c/func/SecRequestSharedWebCredential">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void SecRequestSharedWebCredential(CFStringRef fqdn, CFStringRef account,
            @ObjCBlock(name = "call_SecRequestSharedWebCredential") Block_SecRequestSharedWebCredential completionHandler);

    /**
     * SecCreateSharedWebCredentialPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/SharedWebCredentialsRef/index.html#//apple_ref/c/func/SecCreateSharedWebCredentialPassword">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef SecCreateSharedWebCredentialPassword();

    /**
     * SecTrustGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SecTrustGetTypeID();

    /**
     * SecTrustCreateWithCertificates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustCreateWithCertificates">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustCreateWithCertificates(ConstVoidPtr certificates, ConstVoidPtr policies,
            Ptr<SecTrustRef> trust);

    /**
     * SecTrustSetPolicies</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustSetPolicies">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustSetPolicies(SecTrustRef trust, ConstVoidPtr policies);

    /**
     * SecTrustCopyPolicies</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustCopyPolicies">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustCopyPolicies(SecTrustRef trust, Ptr<CFArrayRef> policies);

    @Generated
    @CFunction
    public static native int SecTrustSetNetworkFetchAllowed(SecTrustRef trust, byte allowFetch);

    @Generated
    @CFunction
    public static native int SecTrustGetNetworkFetchAllowed(SecTrustRef trust, BytePtr allowFetch);

    /**
     * SecTrustSetAnchorCertificates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustSetAnchorCertificates">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustSetAnchorCertificates(SecTrustRef trust, CFArrayRef anchorCertificates);

    /**
     * SecTrustSetAnchorCertificatesOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustSetAnchorCertificatesOnly">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustSetAnchorCertificatesOnly(SecTrustRef trust, byte anchorCertificatesOnly);

    /**
     * SecTrustCopyCustomAnchorCertificates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustCopyCustomAnchorCertificates">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustCopyCustomAnchorCertificates(SecTrustRef trust, Ptr<CFArrayRef> anchors);

    /**
     * SecTrustSetVerifyDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustSetVerifyDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustSetVerifyDate(SecTrustRef trust, CFDateRef verifyDate);

    /**
     * SecTrustGetVerifyTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustGetVerifyTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double SecTrustGetVerifyTime(SecTrustRef trust);

    /**
     * SecTrustEvaluate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustEvaluate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustEvaluate(SecTrustRef trust, IntPtr result);

    /**
     * SecTrustEvaluateAsync</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustEvaluateAsync">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustEvaluateAsync(SecTrustRef trust, NSObject queue,
            @ObjCBlock(name = "call_SecTrustEvaluateAsync") Block_SecTrustEvaluateAsync result);

    /**
     * SecTrustGetTrustResult</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustGetTrustResult">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SecTrustGetTrustResult(SecTrustRef trust, IntPtr result);

    /**
     * SecTrustCopyPublicKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustCopyPublicKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native SecKeyRef SecTrustCopyPublicKey(SecTrustRef trust);

    /**
     * SecTrustGetCertificateCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustGetCertificateCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long SecTrustGetCertificateCount(SecTrustRef trust);

    /**
     * SecTrustGetCertificateAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustGetCertificateAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native SecCertificateRef SecTrustGetCertificateAtIndex(SecTrustRef trust, @NInt long ix);

    /**
     * SecTrustCopyExceptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustCopyExceptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef SecTrustCopyExceptions(SecTrustRef trust);

    /**
     * SecTrustSetExceptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustSetExceptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean SecTrustSetExceptions(SecTrustRef trust, CFDataRef exceptions);

    /**
     * SecTrustCopyProperties</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/certifkeytrustservices/index.html#//apple_ref/c/func/SecTrustCopyProperties">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef SecTrustCopyProperties(SecTrustRef trust);

    @Generated
    @CFunction
    public static native CFDictionaryRef SecTrustCopyResult(SecTrustRef trust);

    @Generated
    @CFunction
    public static native int SecTrustSetOCSPResponse(SecTrustRef trust, ConstVoidPtr responseData);

    /**
     * SSLContextGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLContextGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long SSLContextGetTypeID();

    /**
     * SSLCreateContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLCreateContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native SSLContextRef SSLCreateContext(CFAllocatorRef alloc, int protocolSide, int connectionType);

    /**
     * SSLGetSessionState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetSessionState">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetSessionState(SSLContextRef context, IntPtr state);

    /**
     * SSLSetSessionOption</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetSessionOption">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetSessionOption(SSLContextRef context, int option, byte value);

    /**
     * SSLGetSessionOption</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetSessionOption">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetSessionOption(SSLContextRef context, int option, BytePtr value);

    /**
     * SSLSetIOFuncs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetIOFuncs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetIOFuncs(SSLContextRef context,
            @FunctionPtr(name = "call_SSLSetIOFuncs_1") Function_SSLSetIOFuncs_1 readFunc,
            @FunctionPtr(name = "call_SSLSetIOFuncs_2") Function_SSLSetIOFuncs_2 writeFunc);

    /**
     * SSLSetProtocolVersionMin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetProtocolVersionMin">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetProtocolVersionMin(SSLContextRef context, int minVersion);

    /**
     * SSLGetProtocolVersionMin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetProtocolVersionMin">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetProtocolVersionMin(SSLContextRef context, IntPtr minVersion);

    /**
     * SSLSetProtocolVersionMax</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetProtocolVersionMax">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetProtocolVersionMax(SSLContextRef context, int maxVersion);

    /**
     * SSLGetProtocolVersionMax</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetProtocolVersionMax">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetProtocolVersionMax(SSLContextRef context, IntPtr maxVersion);

    /**
     * SSLSetCertificate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetCertificate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetCertificate(SSLContextRef context, CFArrayRef certRefs);

    /**
     * SSLSetConnection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetConnection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetConnection(SSLContextRef context, ConstVoidPtr connection);

    /**
     * SSLGetConnection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetConnection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetConnection(SSLContextRef context, Ptr<ConstVoidPtr> connection);

    /**
     * SSLSetPeerDomainName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetPeerDomainName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetPeerDomainName(SSLContextRef context,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String peerName,
            @NUInt long peerNameLen);

    /**
     * SSLGetPeerDomainNameLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetPeerDomainNameLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetPeerDomainNameLength(SSLContextRef context, NUIntPtr peerNameLen);

    /**
     * SSLGetPeerDomainName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetPeerDomainName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetPeerDomainName(SSLContextRef context, BytePtr peerName, NUIntPtr peerNameLen);

    /**
     * SSLSetDatagramHelloCookie</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetDatagramHelloCookie">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetDatagramHelloCookie(SSLContextRef dtlsContext, ConstVoidPtr cookie,
            @NUInt long cookieLen);

    /**
     * SSLSetMaxDatagramRecordSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetMaxDatagramRecordSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetMaxDatagramRecordSize(SSLContextRef dtlsContext, @NUInt long maxSize);

    /**
     * SSLGetMaxDatagramRecordSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetMaxDatagramRecordSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetMaxDatagramRecordSize(SSLContextRef dtlsContext, NUIntPtr maxSize);

    /**
     * SSLGetNegotiatedProtocolVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetNegotiatedProtocolVersion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetNegotiatedProtocolVersion(SSLContextRef context, IntPtr protocol);

    /**
     * SSLGetNumberSupportedCiphers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetNumberSupportedCiphers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetNumberSupportedCiphers(SSLContextRef context, NUIntPtr numCiphers);

    /**
     * SSLGetSupportedCiphers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetSupportedCiphers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetSupportedCiphers(SSLContextRef context, CharPtr ciphers, NUIntPtr numCiphers);

    /**
     * SSLSetEnabledCiphers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetEnabledCiphers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetEnabledCiphers(SSLContextRef context, ConstCharPtr ciphers, @NUInt long numCiphers);

    /**
     * SSLGetNumberEnabledCiphers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetNumberEnabledCiphers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetNumberEnabledCiphers(SSLContextRef context, NUIntPtr numCiphers);

    /**
     * SSLGetEnabledCiphers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetEnabledCiphers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetEnabledCiphers(SSLContextRef context, CharPtr ciphers, NUIntPtr numCiphers);

    /**
     * SSLCopyPeerTrust</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLCopyPeerTrust">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLCopyPeerTrust(SSLContextRef context, Ptr<SecTrustRef> trust);

    /**
     * SSLSetPeerID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetPeerID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetPeerID(SSLContextRef context, ConstVoidPtr peerID, @NUInt long peerIDLen);

    /**
     * SSLGetPeerID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetPeerID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetPeerID(SSLContextRef context, Ptr<ConstVoidPtr> peerID, NUIntPtr peerIDLen);

    /**
     * SSLGetNegotiatedCipher</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetNegotiatedCipher">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetNegotiatedCipher(SSLContextRef context, CharPtr cipherSuite);

    /**
     * SSLSetEncryptionCertificate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetEncryptionCertificate">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int SSLSetEncryptionCertificate(SSLContextRef context, CFArrayRef certRefs);

    /**
     * SSLSetClientSideAuthenticate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLSetClientSideAuthenticate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLSetClientSideAuthenticate(SSLContextRef context, int auth);

    /**
     * SSLAddDistinguishedName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLAddDistinguishedName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLAddDistinguishedName(SSLContextRef context, ConstVoidPtr derDN, @NUInt long derDNLen);

    /**
     * SSLCopyDistinguishedNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLCopyDistinguishedNames">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLCopyDistinguishedNames(SSLContextRef context, Ptr<CFArrayRef> names);

    /**
     * SSLGetClientCertificateState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetClientCertificateState">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetClientCertificateState(SSLContextRef context, IntPtr clientState);

    /**
     * SSLHandshake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLHandshake">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLHandshake(SSLContextRef context);

    /**
     * SSLWrite</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLWrite">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLWrite(SSLContextRef context, ConstVoidPtr data, @NUInt long dataLength,
            NUIntPtr processed);

    /**
     * SSLRead</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLRead">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLRead(SSLContextRef context, VoidPtr data, @NUInt long dataLength, NUIntPtr processed);

    /**
     * SSLGetBufferedReadSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetBufferedReadSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetBufferedReadSize(SSLContextRef context, NUIntPtr bufSize);

    /**
     * SSLGetDatagramWriteSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLGetDatagramWriteSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int SSLGetDatagramWriteSize(SSLContextRef dtlsContext, NUIntPtr bufSize);

    /**
     * SSLClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Security/Reference/secureTransportRef/index.html#//apple_ref/c/func/SSLClose">iOS Dev Center</a>
     */
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
    public static native CFStringRef kSecAttrSynchronizableAny();

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
    public static native CFStringRef kSecPrivateKeyAttrs();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPublicKeyAttrs();

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
    public static native CFStringRef kSecPolicyAppleIDValidation();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleTimeStamping();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyAppleRevocation();

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
    @CFunction
    public static native int SSLSetSessionStrengthPolicy(SSLContextRef context, int policyStrength);

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrSyncViewHint();

    @Generated
    @CVariable()
    public static native CFStringRef kSecAttrTokenID();

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
    public static native CFStringRef kSecPolicyMacAppStoreReceipt();

    @Generated
    @CVariable()
    public static native CFStringRef kSecPolicyApplePayIssuerEncryption();

    @Generated
    @CVariable()
    public static native CFStringRef kSecTrustCertificateTransparency();

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
