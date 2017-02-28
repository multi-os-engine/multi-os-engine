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

package apple.cfnetwork.c;

import apple.cfnetwork.opaque.CFHTTPAuthenticationRef;
import apple.cfnetwork.opaque.CFHTTPMessageRef;
import apple.cfnetwork.opaque.CFHostRef;
import apple.cfnetwork.opaque.CFNetDiagnosticRef;
import apple.cfnetwork.opaque.CFNetServiceBrowserRef;
import apple.cfnetwork.opaque.CFNetServiceMonitorRef;
import apple.cfnetwork.opaque.CFNetServiceRef;
import apple.cfnetwork.struct.CFHostClientContext;
import apple.cfnetwork.struct.CFNetServiceClientContext;
import apple.corefoundation.opaque.CFAllocatorRef;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFReadStreamRef;
import apple.corefoundation.opaque.CFRunLoopRef;
import apple.corefoundation.opaque.CFRunLoopSourceRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.corefoundation.opaque.CFWriteStreamRef;
import apple.corefoundation.struct.CFStreamClientContext;
import apple.corefoundation.struct.CFStreamError;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Library("CFNetwork")
@Runtime(CRuntime.class)
public final class CFNetwork {
    static {
        NatJ.register();
    }

    @Generated
    private CFNetwork() {
    }

    @Generated
    @CFunction
    @NUInt
    public static native long CFHostGetTypeID();

    @Generated
    @CFunction
    public static native CFHostRef CFHostCreateWithName(CFAllocatorRef allocator, CFStringRef hostname);

    @Generated
    @CFunction
    public static native CFHostRef CFHostCreateWithAddress(CFAllocatorRef allocator, CFDataRef addr);

    @Generated
    @CFunction
    public static native CFHostRef CFHostCreateCopy(CFAllocatorRef alloc, CFHostRef host);

    @Generated
    @CFunction
    public static native byte CFHostStartInfoResolution(CFHostRef theHost, int info,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native CFArrayRef CFHostGetAddressing(CFHostRef theHost, BytePtr hasBeenResolved);

    @Generated
    @CFunction
    public static native CFArrayRef CFHostGetNames(CFHostRef theHost, BytePtr hasBeenResolved);

    @Generated
    @CFunction
    public static native CFDataRef CFHostGetReachability(CFHostRef theHost, BytePtr hasBeenResolved);

    @Generated
    @CFunction
    public static native void CFHostCancelInfoResolution(CFHostRef theHost, int info);

    @Generated
    @CFunction
    public static native byte CFHostSetClient(CFHostRef theHost,
            @FunctionPtr(name = "call_CFHostSetClient") Function_CFHostSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFHostClientContext clientContext);

    @Generated
    @CFunction
    public static native void CFHostScheduleWithRunLoop(CFHostRef theHost, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFHostUnscheduleFromRunLoop(CFHostRef theHost, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNetServiceGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CFNetServiceMonitorGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CFNetServiceBrowserGetTypeID();

    @Generated
    @CFunction
    public static native CFNetServiceRef CFNetServiceCreate(CFAllocatorRef alloc, CFStringRef domain,
            CFStringRef serviceType, CFStringRef name, int port);

    @Generated
    @CFunction
    public static native CFNetServiceRef CFNetServiceCreateCopy(CFAllocatorRef alloc, CFNetServiceRef service);

    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetDomain(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetType(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetName(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native byte CFNetServiceRegisterWithOptions(CFNetServiceRef theService, @NUInt long options,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native byte CFNetServiceResolveWithTimeout(CFNetServiceRef theService, double timeout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native void CFNetServiceCancel(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native CFStringRef CFNetServiceGetTargetHost(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native int CFNetServiceGetPortNumber(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native CFArrayRef CFNetServiceGetAddressing(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native CFDataRef CFNetServiceGetTXTData(CFNetServiceRef theService);

    @Generated
    @CFunction
    public static native byte CFNetServiceSetTXTData(CFNetServiceRef theService, CFDataRef txtRecord);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFNetServiceCreateDictionaryWithTXTData(CFAllocatorRef alloc,
            CFDataRef txtRecord);

    @Generated
    @CFunction
    public static native CFDataRef CFNetServiceCreateTXTDataWithDictionary(CFAllocatorRef alloc,
            CFDictionaryRef keyValuePairs);

    @Generated
    @CFunction
    public static native byte CFNetServiceSetClient(CFNetServiceRef theService,
            @FunctionPtr(name = "call_CFNetServiceSetClient") Function_CFNetServiceSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

    @Generated
    @CFunction
    public static native void CFNetServiceScheduleWithRunLoop(CFNetServiceRef theService, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFNetServiceUnscheduleFromRunLoop(CFNetServiceRef theService, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native CFNetServiceMonitorRef CFNetServiceMonitorCreate(CFAllocatorRef alloc,
            CFNetServiceRef theService,
            @FunctionPtr(name = "call_CFNetServiceMonitorCreate") Function_CFNetServiceMonitorCreate clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

    @Generated
    @CFunction
    public static native void CFNetServiceMonitorInvalidate(CFNetServiceMonitorRef monitor);

    @Generated
    @CFunction
    public static native byte CFNetServiceMonitorStart(CFNetServiceMonitorRef monitor, int recordType,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native void CFNetServiceMonitorStop(CFNetServiceMonitorRef monitor,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native void CFNetServiceMonitorScheduleWithRunLoop(CFNetServiceMonitorRef monitor,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFNetServiceMonitorUnscheduleFromRunLoop(CFNetServiceMonitorRef monitor,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native CFNetServiceBrowserRef CFNetServiceBrowserCreate(CFAllocatorRef alloc,
            @FunctionPtr(name = "call_CFNetServiceBrowserCreate") Function_CFNetServiceBrowserCreate clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFNetServiceClientContext clientContext);

    @Generated
    @CFunction
    public static native void CFNetServiceBrowserInvalidate(CFNetServiceBrowserRef browser);

    @Generated
    @CFunction
    public static native byte CFNetServiceBrowserSearchForDomains(CFNetServiceBrowserRef browser,
            byte registrationDomains,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native byte CFNetServiceBrowserSearchForServices(CFNetServiceBrowserRef browser, CFStringRef domain,
            CFStringRef serviceType,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native void CFNetServiceBrowserStopSearch(CFNetServiceBrowserRef browser,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native void CFNetServiceBrowserScheduleWithRunLoop(CFNetServiceBrowserRef browser,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFNetServiceBrowserUnscheduleFromRunLoop(CFNetServiceBrowserRef browser,
            CFRunLoopRef runLoop, CFStringRef runLoopMode);

    @Generated
    @Inline
    @CFunction
    public static native int CFSocketStreamSOCKSGetErrorSubdomain(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @Inline
    @CFunction
    public static native int CFSocketStreamSOCKSGetError(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToCFHost(CFAllocatorRef alloc, CFHostRef host, int port,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToNetService(CFAllocatorRef alloc, CFNetServiceRef service,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    @Generated
    @Deprecated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithFTPURL(CFAllocatorRef alloc, CFURLRef ftpURL);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long CFFTPCreateParsedResourceListing(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufferLength, Ptr<CFDictionaryRef> parsed);

    @Generated
    @Deprecated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithFTPURL(CFAllocatorRef alloc, CFURLRef ftpURL);

    @Generated
    @CFunction
    @NUInt
    public static native long CFHTTPMessageGetTypeID();

    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateRequest(CFAllocatorRef alloc, CFStringRef requestMethod,
            CFURLRef url, CFStringRef httpVersion);

    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateResponse(CFAllocatorRef alloc, @NInt long statusCode,
            CFStringRef statusDescription, CFStringRef httpVersion);

    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateEmpty(CFAllocatorRef alloc, byte isRequest);

    @Generated
    @CFunction
    public static native CFHTTPMessageRef CFHTTPMessageCreateCopy(CFAllocatorRef alloc, CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native byte CFHTTPMessageIsRequest(CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyVersion(CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native CFDataRef CFHTTPMessageCopyBody(CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native void CFHTTPMessageSetBody(CFHTTPMessageRef message, CFDataRef bodyData);

    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyHeaderFieldValue(CFHTTPMessageRef message,
            CFStringRef headerField);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFHTTPMessageCopyAllHeaderFields(CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native void CFHTTPMessageSetHeaderFieldValue(CFHTTPMessageRef message, CFStringRef headerField,
            CFStringRef value);

    @Generated
    @CFunction
    public static native byte CFHTTPMessageAppendBytes(CFHTTPMessageRef message,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String newBytes,
            @NInt long numBytes);

    @Generated
    @CFunction
    public static native byte CFHTTPMessageIsHeaderComplete(CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native CFDataRef CFHTTPMessageCopySerializedMessage(CFHTTPMessageRef message);

    @Generated
    @CFunction
    public static native CFURLRef CFHTTPMessageCopyRequestURL(CFHTTPMessageRef request);

    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyRequestMethod(CFHTTPMessageRef request);

    @Generated
    @CFunction
    public static native byte CFHTTPMessageAddAuthentication(CFHTTPMessageRef request,
            CFHTTPMessageRef authenticationFailureResponse, CFStringRef username, CFStringRef password,
            CFStringRef authenticationScheme, byte forProxy);

    @Generated
    @CFunction
    @NInt
    public static native long CFHTTPMessageGetResponseStatusCode(CFHTTPMessageRef response);

    @Generated
    @CFunction
    public static native CFStringRef CFHTTPMessageCopyResponseStatusLine(CFHTTPMessageRef response);

    @Generated
    @Deprecated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateForHTTPRequest(CFAllocatorRef alloc,
            CFHTTPMessageRef request);

    @Generated
    @Deprecated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateForStreamedHTTPRequest(CFAllocatorRef alloc,
            CFHTTPMessageRef requestHeaders, CFReadStreamRef requestBody);

    @Generated
    @CFunction
    @NUInt
    public static native long CFHTTPAuthenticationGetTypeID();

    @Generated
    @CFunction
    public static native CFHTTPAuthenticationRef CFHTTPAuthenticationCreateFromResponse(CFAllocatorRef alloc,
            CFHTTPMessageRef response);

    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationIsValid(CFHTTPAuthenticationRef auth,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationAppliesToRequest(CFHTTPAuthenticationRef auth,
            CFHTTPMessageRef request);

    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationRequiresOrderedRequests(CFHTTPAuthenticationRef auth);

    @Generated
    @CFunction
    public static native byte CFHTTPMessageApplyCredentials(CFHTTPMessageRef request, CFHTTPAuthenticationRef auth,
            CFStringRef username, CFStringRef password,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native byte CFHTTPMessageApplyCredentialDictionary(CFHTTPMessageRef request,
            CFHTTPAuthenticationRef auth, CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError error);

    @Generated
    @CFunction
    public static native CFStringRef CFHTTPAuthenticationCopyRealm(CFHTTPAuthenticationRef auth);

    @Generated
    @CFunction
    public static native CFArrayRef CFHTTPAuthenticationCopyDomains(CFHTTPAuthenticationRef auth);

    @Generated
    @CFunction
    public static native CFStringRef CFHTTPAuthenticationCopyMethod(CFHTTPAuthenticationRef auth);

    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationRequiresUserNameAndPassword(CFHTTPAuthenticationRef auth);

    @Generated
    @CFunction
    public static native byte CFHTTPAuthenticationRequiresAccountDomain(CFHTTPAuthenticationRef auth);

    @Generated
    @CFunction
    public static native CFNetDiagnosticRef CFNetDiagnosticCreateWithStreams(CFAllocatorRef alloc,
            CFReadStreamRef readStream, CFWriteStreamRef writeStream);

    @Generated
    @CFunction
    public static native CFNetDiagnosticRef CFNetDiagnosticCreateWithURL(CFAllocatorRef alloc, CFURLRef url);

    @Generated
    @CFunction
    public static native void CFNetDiagnosticSetName(CFNetDiagnosticRef details, CFStringRef name);

    @Generated
    @CFunction
    @NInt
    public static native long CFNetDiagnosticDiagnoseProblemInteractively(CFNetDiagnosticRef details);

    @Generated
    @CFunction
    @NInt
    public static native long CFNetDiagnosticCopyNetworkStatusPassively(CFNetDiagnosticRef details,
            Ptr<CFStringRef> description);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFNetworkCopySystemProxySettings();

    @Generated
    @CFunction
    public static native CFArrayRef CFNetworkCopyProxiesForURL(CFURLRef url, CFDictionaryRef proxySettings);

    @Generated
    @CFunction
    public static native CFArrayRef CFNetworkCopyProxiesForAutoConfigurationScript(
            CFStringRef proxyAutoConfigurationScript, CFURLRef targetURL, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFNetworkExecuteProxyAutoConfigurationScript(
            CFStringRef proxyAutoConfigurationScript, CFURLRef targetURL,
            @FunctionPtr(name = "call_CFNetworkExecuteProxyAutoConfigurationScript") Function_CFNetworkExecuteProxyAutoConfigurationScript cb,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFNetworkExecuteProxyAutoConfigurationURL(CFURLRef proxyAutoConfigURL,
            CFURLRef targetURL,
            @FunctionPtr(name = "call_CFNetworkExecuteProxyAutoConfigurationURL") Function_CFNetworkExecuteProxyAutoConfigurationURL cb,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCFNetwork();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainWinSock();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLErrorFailingURLErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLErrorFailingURLStringErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFGetAddrInfoFailureKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSOCKSStatusCodeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSOCKSVersionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSOCKSNegotiationMethodKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDNSServiceFailureKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPStatusCodeKey();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainNetDB();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainSystemConfiguration();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainMach();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainNetServices();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLContext();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLPeerTrust();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLValidatesCertificateChain();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLSettings();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLPeerName();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLCertificates();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLIsServer();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceType();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeVideo();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeVoice();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeBackground();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeCallSignaling();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamNetworkServiceTypeVoIP();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyNoCellular();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyConnectionIsCellular();

    @Generated
    @CVariable()
    @NInt
    public static native long kCFStreamErrorDomainWinSock();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainSOCKS();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSProxyHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSProxyPort();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSOCKSVersion4();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSOCKSVersion5();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSUser();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySOCKSPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyProxyLocalBypass();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainSSL();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketSecurityLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelNone();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelSSLv2();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelSSLv3();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelTLSv1();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSocketSecurityLevelNegotiatedSSL();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyShouldCloseNativeSocket();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemoteHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemoteNetService();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketExtendedBackgroundIdleMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySSLPeerCertificates();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLAllowsExpiredCertificates();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLAllowsExpiredRoots();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamSSLAllowsAnyRoot();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainFTP();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPUserName();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPUsePassiveMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPResourceSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPFetchResourceInfo();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPFileTransferOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPAttemptPersistentConnection();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyPort();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyUser();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFTPProxyPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceName();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceOwner();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceGroup();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceType();

    @Generated
    @CVariable()
    public static native CFStringRef kCFFTPResourceModDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion1_0();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion1_1();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPVersion2_0();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeBasic();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeDigest();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeNTLM();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeKerberos();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeNegotiate();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeNegotiate2();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeXMobileMeAuthToken();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationSchemeOAuth1();

    @Generated
    @CVariable()
    public static native int kCFStreamErrorDomainHTTP();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPResponseHeader();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPFinalURL();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPFinalRequest();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPProxyHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPProxyPort();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPSProxyHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPSProxyPort();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPShouldAutoredirect();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPAttemptPersistentConnection();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyHTTPRequestBytesWrittenCount();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationUsername();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHTTPAuthenticationAccountDomain();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyHostNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyPortNumberKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyAutoConfigurationURLKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyAutoConfigurationJavaScriptKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyUsernameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyPasswordKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeNone();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeHTTP();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeHTTPS();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeSOCKS();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeFTP();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeAutoConfigurationURL();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyTypeAutoConfigurationJavaScript();

    @Generated
    @CVariable()
    public static native CFStringRef kCFProxyAutoConfigurationHTTPResponseKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesHTTPEnable();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesHTTPPort();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesHTTPProxy();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesProxyAutoConfigEnable();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesProxyAutoConfigURLString();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNetworkProxiesProxyAutoConfigJavaScript();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFHostSetClient {
        @Generated
        void call_CFHostSetClient(CFHostRef arg0, int arg1,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetServiceSetClient {
        @Generated
        void call_CFNetServiceSetClient(CFNetServiceRef arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetServiceMonitorCreate {
        @Generated
        void call_CFNetServiceMonitorCreate(CFNetServiceMonitorRef arg0, CFNetServiceRef arg1, int arg2, CFDataRef arg3,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg4, VoidPtr arg5);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetServiceBrowserCreate {
        @Generated
        void call_CFNetServiceBrowserCreate(CFNetServiceBrowserRef arg0, @NUInt long arg1, ConstVoidPtr arg2,
                @UncertainArgument("Options: reference, array Fallback: reference") CFStreamError arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetworkExecuteProxyAutoConfigurationScript {
        @Generated
        void call_CFNetworkExecuteProxyAutoConfigurationScript(VoidPtr arg0, CFArrayRef arg1, CFErrorRef arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNetworkExecuteProxyAutoConfigurationURL {
        @Generated
        void call_CFNetworkExecuteProxyAutoConfigurationURL(VoidPtr arg0, CFArrayRef arg1, CFErrorRef arg2);
    }
}
