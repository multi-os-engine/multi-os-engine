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

package apple.foundation;

import apple.NSObject;
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
 * This class defines the performance metrics collected for a request/response transaction during the task execution.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionTaskTransactionMetrics extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLSessionTaskTransactionMetrics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSessionTaskTransactionMetrics alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * connectEndDate is the time immediately after the user agent finished establishing the connection to the server, including completion of security-related and other handshakes.
     */
    @Generated
    @Selector("connectEndDate")
    public native NSDate connectEndDate();

    /**
     * connectStartDate is the time immediately before the user agent started establishing the connection to the server.
     * 
     * For example, this would correspond to the time immediately before the user agent started trying to establish the TCP connection.
     */
    @Generated
    @Selector("connectStartDate")
    public native NSDate connectStartDate();

    /**
     * domainLookupEndDate returns the time after the name lookup was completed.
     */
    @Generated
    @Selector("domainLookupEndDate")
    public native NSDate domainLookupEndDate();

    /**
     * domainLookupStartDate returns the time immediately before the user agent started the name lookup for the resource.
     */
    @Generated
    @Selector("domainLookupStartDate")
    public native NSDate domainLookupStartDate();

    /**
     * fetchStartDate returns the time when the user agent started fetching the resource, whether or not the resource was retrieved from the server or local resources.
     * 
     * The following metrics will be set to nil, if a persistent connection was used or the resource was retrieved from local resources:
     * 
     *   domainLookupStartDate
     *   domainLookupEndDate
     *   connectStartDate
     *   connectEndDate
     *   secureConnectionStartDate
     *   secureConnectionEndDate
     */
    @Generated
    @Selector("fetchStartDate")
    public native NSDate fetchStartDate();

    @Generated
    @Selector("init")
    public native NSURLSessionTaskTransactionMetrics init();

    /**
     * This property is set to YES if a proxy connection was used to fetch the resource.
     */
    @Generated
    @Selector("isProxyConnection")
    public native boolean isProxyConnection();

    /**
     * This property is set to YES if a persistent connection was used to fetch the resource.
     */
    @Generated
    @Selector("isReusedConnection")
    public native boolean isReusedConnection();

    /**
     * The network protocol used to fetch the resource, as identified by the ALPN Protocol ID Identification Sequence [RFC7301].
     * E.g., h2, http/1.1, spdy/3.1.
     * 
     * When a proxy is configured AND a tunnel connection is established, then this attribute returns the value for the tunneled protocol.
     * 
     * For example:
     * If no proxy were used, and HTTP/2 was negotiated, then h2 would be returned.
     * If HTTP/1.1 were used to the proxy, and the tunneled connection was HTTP/2, then h2 would be returned.
     * If HTTP/1.1 were used to the proxy, and there were no tunnel, then http/1.1 would be returned.
     */
    @Generated
    @Selector("networkProtocolName")
    public native String networkProtocolName();

    /**
     * Represents the transaction request.
     */
    @Generated
    @Selector("request")
    public native NSURLRequest request();

    /**
     * requestEndDate is the time immediately after the user agent finished requesting the source, regardless of whether the resource was retrieved from the server or local resources.
     * 
     * For example, this would correspond to the time immediately after the user agent finished sending the last byte of the request.
     */
    @Generated
    @Selector("requestEndDate")
    public native NSDate requestEndDate();

    /**
     * requestStartDate is the time immediately before the user agent started requesting the source, regardless of whether the resource was retrieved from the server or local resources.
     * 
     * For example, this would correspond to the time immediately before the user agent sent an HTTP GET request.
     */
    @Generated
    @Selector("requestStartDate")
    public native NSDate requestStartDate();

    /**
     * Indicates whether the resource was loaded, pushed or retrieved from the local cache.
     */
    @Generated
    @Selector("resourceFetchType")
    @NInt
    public native long resourceFetchType();

    /**
     * Represents the transaction response. Can be nil if error occurred and no response was generated.
     */
    @Generated
    @Selector("response")
    public native NSURLResponse response();

    /**
     * responseEndDate is the time immediately after the user agent received the last byte of the resource.
     */
    @Generated
    @Selector("responseEndDate")
    public native NSDate responseEndDate();

    /**
     * responseStartDate is the time immediately after the user agent received the first byte of the response from the server or from local resources.
     * 
     * For example, this would correspond to the time immediately after the user agent received the first byte of an HTTP response.
     */
    @Generated
    @Selector("responseStartDate")
    public native NSDate responseStartDate();

    /**
     * If an encrypted connection was used, secureConnectionEndDate is the time immediately after the security handshake completed.
     * 
     * If an encrypted connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("secureConnectionEndDate")
    public native NSDate secureConnectionEndDate();

    /**
     * If an encrypted connection was used, secureConnectionStartDate is the time immediately before the user agent started the security handshake to secure the current connection.
     * 
     * For example, this would correspond to the time immediately before the user agent started the TLS handshake.
     * 
     * If an encrypted connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("secureConnectionStartDate")
    public native NSDate secureConnectionStartDate();

    /**
     * countOfRequestBodyBytesBeforeEncoding is the size of upload body data, file, or stream.
     */
    @Generated
    @Selector("countOfRequestBodyBytesBeforeEncoding")
    public native long countOfRequestBodyBytesBeforeEncoding();

    /**
     * countOfRequestBodyBytesSent is the number of bytes transferred for request body.
     * It includes protocol-specific framing, transfer encoding, and content encoding.
     */
    @Generated
    @Selector("countOfRequestBodyBytesSent")
    public native long countOfRequestBodyBytesSent();

    /**
     * countOfRequestHeaderBytesSent is the number of bytes transferred for request header.
     */
    @Generated
    @Selector("countOfRequestHeaderBytesSent")
    public native long countOfRequestHeaderBytesSent();

    /**
     * countOfResponseBodyBytesAfterDecoding is the size of data delivered to your delegate or completion handler.
     */
    @Generated
    @Selector("countOfResponseBodyBytesAfterDecoding")
    public native long countOfResponseBodyBytesAfterDecoding();

    /**
     * countOfResponseBodyBytesReceived is the number of bytes transferred for response header.
     * It includes protocol-specific framing, transfer encoding, and content encoding.
     */
    @Generated
    @Selector("countOfResponseBodyBytesReceived")
    public native long countOfResponseBodyBytesReceived();

    /**
     * countOfResponseHeaderBytesReceived is the number of bytes transferred for response header.
     */
    @Generated
    @Selector("countOfResponseHeaderBytesReceived")
    public native long countOfResponseHeaderBytesReceived();

    /**
     * Whether the connection is established over a cellular interface.
     */
    @Generated
    @Selector("isCellular")
    public native boolean isCellular();

    /**
     * Whether the connection is established over a constrained interface.
     */
    @Generated
    @Selector("isConstrained")
    public native boolean isConstrained();

    /**
     * Whether the connection is established over an expensive interface.
     */
    @Generated
    @Selector("isExpensive")
    public native boolean isExpensive();

    /**
     * Whether a multipath protocol is successfully negotiated for the connection.
     */
    @Generated
    @Selector("isMultipath")
    public native boolean isMultipath();

    /**
     * localAddress is the IP address string of the local interface for the connection.
     * 
     * For multipath protocols, this is the local address of the initial flow.
     * 
     * If a connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("localAddress")
    public native String localAddress();

    /**
     * localPort is the port number of the local interface for the connection.
     * 
     * For multipath protocols, this is the local port of the initial flow.
     * 
     * If a connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("localPort")
    public native NSNumber localPort();

    /**
     * negotiatedTLSCipherSuite is the TLS cipher suite negotiated for the connection.
     * It is a 2-byte sequence in host byte order.
     * 
     * Please refer to tls_ciphersuite_t enum in Security/SecProtocolTypes.h
     * 
     * If an encrypted connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("negotiatedTLSCipherSuite")
    public native NSNumber negotiatedTLSCipherSuite();

    /**
     * negotiatedTLSProtocolVersion is the TLS protocol version negotiated for the connection.
     * It is a 2-byte sequence in host byte order.
     * 
     * Please refer to tls_protocol_version_t enum in Security/SecProtocolTypes.h
     * 
     * If an encrypted connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("negotiatedTLSProtocolVersion")
    public native NSNumber negotiatedTLSProtocolVersion();

    /**
     * remoteAddress is the IP address string of the remote interface for the connection.
     * 
     * For multipath protocols, this is the remote address of the initial flow.
     * 
     * If a connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("remoteAddress")
    public native String remoteAddress();

    /**
     * remotePort is the port number of the remote interface for the connection.
     * 
     * For multipath protocols, this is the remote port of the initial flow.
     * 
     * If a connection was not used, this attribute is set to nil.
     */
    @Generated
    @Selector("remotePort")
    public native NSNumber remotePort();

    /**
     * DNS protocol used for domain resolution.
     */
    @Generated
    @Selector("domainResolutionProtocol")
    @NInt
    public native long domainResolutionProtocol();
}
