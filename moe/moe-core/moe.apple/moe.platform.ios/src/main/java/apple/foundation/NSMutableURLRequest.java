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
import apple.networkextension.NEHotspotHelperCommand;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSMutableURLRequest
 * 
 * An NSMutableURLRequest object represents a mutable URL load
 * request in a manner independent of protocol and URL scheme.
 * 
 * This specialization of NSURLRequest is provided to aid
 * developers who may find it more convenient to mutate a single request
 * object for a series of URL loads instead of creating an immutable
 * NSURLRequest for each load. This programming model is supported by
 * the following contract stipulation between NSMutableURLRequest and
 * NSURLConnection: NSURLConnection makes a deep copy of each
 * NSMutableURLRequest object passed to one of its initializers.
 * <p>NSMutableURLRequest is designed to be extended to support
 * protocol-specific data by adding categories to access a property
 * object provided in an interface targeted at protocol implementors.
 * <ul>
 * <li>Protocol implementors should direct their attention to the
 * NSMutableURLRequestExtensibility category on
 * NSMutableURLRequest for more information on how to provide
 * extensions on NSMutableURLRequest to support protocol-specific
 * request information.
 * <li>Clients of this API who wish to create NSMutableURLRequest
 * objects to load URL content should consult the protocol-specific
 * NSMutableURLRequest categories that are available. The
 * NSMutableHTTPURLRequest category on NSMutableURLRequest is an
 * example.
 * </ul>
 * 
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableURLRequest extends NSURLRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableURLRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableURLRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableURLRequest allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSMutableURLRequest new_objc();

    @Generated
    @Selector("requestWithURL:")
    public static native NSMutableURLRequest requestWithURL(@NotNull NSURL URL);

    @Generated
    @Selector("requestWithURL:cachePolicy:timeoutInterval:")
    public static native NSMutableURLRequest requestWithURLCachePolicyTimeoutInterval(@NotNull NSURL URL,
            @NUInt long cachePolicy, double timeoutInterval);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Sets the request body data of the receiver.
     * 
     * This data is sent as the message body of the request, as
     * in done in an HTTP POST request.
     */
    @Nullable
    @Generated
    @Selector("HTTPBody")
    public native NSData HTTPBody();

    /**
     * Sets the request body to be the contents of the given stream.
     * 
     * The provided stream should be unopened; the request will take
     * over the stream's delegate. The entire stream's contents will be
     * transmitted as the HTTP body of the request. Note that the body stream
     * and the body data (set by setHTTPBody:, above) are mutually exclusive
     * - setting one will clear the other.
     */
    @Nullable
    @Generated
    @Selector("HTTPBodyStream")
    public native NSInputStream HTTPBodyStream();

    /**
     * Sets the HTTP request method of the receiver.
     */
    @NotNull
    @Generated
    @Selector("HTTPMethod")
    public native String HTTPMethod();

    /**
     * Decide whether default cookie handling will happen for
     * this request (YES if cookies should be sent with and set for this request;
     * otherwise NO).
     * 
     * The default is YES - in other words, cookies are sent from and
     * stored to the cookie manager by default.
     * NOTE: In releases prior to 10.3, this value is ignored
     */
    @Generated
    @Selector("HTTPShouldHandleCookies")
    public native boolean HTTPShouldHandleCookies();

    /**
     * Sets whether the request should not wait for the previous response
     * before transmitting (YES if the receiver should transmit before the previous response is
     * received. NO to wait for the previous response before transmitting)
     * 
     * Calling this method with a YES value does not guarantee HTTP
     * pipelining behavior. This method may have no effect if an HTTP proxy is
     * configured, or if the HTTP request uses an unsafe request method (e.g., POST
     * requests will not pipeline). Pipelining behavior also may not begin until
     * the second request on a given TCP connection. There may be other situations
     * where pipelining does not occur even though YES was set.
     * HTTP 1.1 allows the client to send multiple requests to the server without
     * waiting for a response. Though HTTP 1.1 requires support for pipelining,
     * some servers report themselves as being HTTP 1.1 but do not support
     * pipelining (disconnecting, sending resources misordered, omitting part of
     * a resource, etc.).
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("HTTPShouldUsePipelining")
    public native boolean HTTPShouldUsePipelining();

    /**
     * The URL of the receiver.
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * addValue:forHTTPHeaderField:
     * 
     * Adds an HTTP header field in the current header
     * dictionary.
     * 
     * This method provides a way to add values to header
     * fields incrementally. If a value was previously set for the given
     * header field, the given value is appended to the previously-existing
     * value. The appropriate field delimiter, a comma in the case of HTTP,
     * is added by the implementation, and should not be added to the given
     * value by the caller. Note that, in keeping with the HTTP RFC, HTTP
     * header field names are case-insensitive.
     * 
     * @param value the header field value.
     * @param field the header field name (case-insensitive).
     */
    @Generated
    @Selector("addValue:forHTTPHeaderField:")
    public native void addValueForHTTPHeaderField(@NotNull String value, @NotNull String field);

    /**
     * Sets the HTTP header fields of the receiver to the given
     * dictionary.
     * 
     * This method replaces all header fields that may have
     * existed before this method call.
     * <p>Since HTTP header fields must be string values, each object and
     * key in the dictionary passed to this method must answer YES when
     * sent an <tt>-isKindOfClass:[NSString class]</tt> message. If either
     * the key or value for a key-value pair answers NO when sent this
     * message, the key-value pair is skipped.
     */
    @Nullable
    @Generated
    @Selector("allHTTPHeaderFields")
    public native NSDictionary<String, String> allHTTPHeaderFields();

    /**
     * sets whether a connection created with this request is allowed to use
     * the built in cellular radios (if present).
     * 
     * NO if the receiver should not be allowed to use the built in
     * cellular radios to satisfy the request, YES otherwise. The default is YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

    /**
     * bindToHotspotHelperCommand:
     * 
     * Binds the NSMutableURLRequest to the network interface associated with
     * the NEHotspotHelperCommand object.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("bindToHotspotHelperCommand:")
    public native void bindToHotspotHelperCommand(@NotNull NEHotspotHelperCommand command);

    /**
     * The cache policy of the receiver.
     */
    @Generated
    @Selector("cachePolicy")
    @NUInt
    public native long cachePolicy();

    @Generated
    @Selector("init")
    public native NSMutableURLRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableURLRequest initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithURL:")
    public native NSMutableURLRequest initWithURL(@NotNull NSURL URL);

    @Generated
    @Selector("initWithURL:cachePolicy:timeoutInterval:")
    public native NSMutableURLRequest initWithURLCachePolicyTimeoutInterval(@NotNull NSURL URL, @NUInt long cachePolicy,
            double timeoutInterval);

    /**
     * Sets the main document URL
     * 
     * The caller should pass the URL for an appropriate main
     * document, if known. For example, when loading a web page, the URL
     * of the main html document for the top-level frame should be
     * passed. This main document is used to implement the cookie "only
     * from same domain as main document" policy, attributing this request
     * as a sub-resource of a user-specified URL, and possibly other things
     * in the future.
     */
    @Nullable
    @Generated
    @Selector("mainDocumentURL")
    public native NSURL mainDocumentURL();

    /**
     * Sets the NSURLRequestNetworkServiceType to associate with this request
     * 
     * This method is used to provide the network layers with a hint as to the purpose
     * of the request. Most clients should not need to use this method.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("networkServiceType")
    @NUInt
    public native long networkServiceType();

    /**
     * Sets the HTTP header fields of the receiver to the given
     * dictionary.
     * 
     * This method replaces all header fields that may have
     * existed before this method call.
     * <p>Since HTTP header fields must be string values, each object and
     * key in the dictionary passed to this method must answer YES when
     * sent an <tt>-isKindOfClass:[NSString class]</tt> message. If either
     * the key or value for a key-value pair answers NO when sent this
     * message, the key-value pair is skipped.
     */
    @Generated
    @Selector("setAllHTTPHeaderFields:")
    public native void setAllHTTPHeaderFields(@Nullable NSDictionary<String, String> value);

    /**
     * sets whether a connection created with this request is allowed to use
     * the built in cellular radios (if present).
     * 
     * NO if the receiver should not be allowed to use the built in
     * cellular radios to satisfy the request, YES otherwise. The default is YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean value);

    /**
     * The cache policy of the receiver.
     */
    @Generated
    @Selector("setCachePolicy:")
    public native void setCachePolicy(@NUInt long value);

    /**
     * Sets the request body data of the receiver.
     * 
     * This data is sent as the message body of the request, as
     * in done in an HTTP POST request.
     */
    @Generated
    @Selector("setHTTPBody:")
    public native void setHTTPBody(@Nullable NSData value);

    /**
     * Sets the request body to be the contents of the given stream.
     * 
     * The provided stream should be unopened; the request will take
     * over the stream's delegate. The entire stream's contents will be
     * transmitted as the HTTP body of the request. Note that the body stream
     * and the body data (set by setHTTPBody:, above) are mutually exclusive
     * - setting one will clear the other.
     */
    @Generated
    @Selector("setHTTPBodyStream:")
    public native void setHTTPBodyStream(@Nullable NSInputStream value);

    /**
     * Sets the HTTP request method of the receiver.
     */
    @Generated
    @Selector("setHTTPMethod:")
    public native void setHTTPMethod(@NotNull String value);

    /**
     * Decide whether default cookie handling will happen for
     * this request (YES if cookies should be sent with and set for this request;
     * otherwise NO).
     * 
     * The default is YES - in other words, cookies are sent from and
     * stored to the cookie manager by default.
     * NOTE: In releases prior to 10.3, this value is ignored
     */
    @Generated
    @Selector("setHTTPShouldHandleCookies:")
    public native void setHTTPShouldHandleCookies(boolean value);

    /**
     * Sets whether the request should not wait for the previous response
     * before transmitting (YES if the receiver should transmit before the previous response is
     * received. NO to wait for the previous response before transmitting)
     * 
     * Calling this method with a YES value does not guarantee HTTP
     * pipelining behavior. This method may have no effect if an HTTP proxy is
     * configured, or if the HTTP request uses an unsafe request method (e.g., POST
     * requests will not pipeline). Pipelining behavior also may not begin until
     * the second request on a given TCP connection. There may be other situations
     * where pipelining does not occur even though YES was set.
     * HTTP 1.1 allows the client to send multiple requests to the server without
     * waiting for a response. Though HTTP 1.1 requires support for pipelining,
     * some servers report themselves as being HTTP 1.1 but do not support
     * pipelining (disconnecting, sending resources misordered, omitting part of
     * a resource, etc.).
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setHTTPShouldUsePipelining:")
    public native void setHTTPShouldUsePipelining(boolean value);

    /**
     * Sets the main document URL
     * 
     * The caller should pass the URL for an appropriate main
     * document, if known. For example, when loading a web page, the URL
     * of the main html document for the top-level frame should be
     * passed. This main document is used to implement the cookie "only
     * from same domain as main document" policy, attributing this request
     * as a sub-resource of a user-specified URL, and possibly other things
     * in the future.
     */
    @Generated
    @Selector("setMainDocumentURL:")
    public native void setMainDocumentURL(@Nullable NSURL value);

    /**
     * Sets the NSURLRequestNetworkServiceType to associate with this request
     * 
     * This method is used to provide the network layers with a hint as to the purpose
     * of the request. Most clients should not need to use this method.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setNetworkServiceType:")
    public native void setNetworkServiceType(@NUInt long value);

    /**
     * Sets the timeout interval of the receiver.
     * 
     * The timeout interval specifies the limit on the idle
     * interval allotted to a request in the process of loading. The "idle
     * interval" is defined as the period of time that has passed since the
     * last instance of load activity occurred for a request that is in the
     * process of loading. Hence, when an instance of load activity occurs
     * (e.g. bytes are received from the network for a request), the idle
     * interval for a request is reset to 0. If the idle interval ever
     * becomes greater than or equal to the timeout interval, the request
     * is considered to have timed out. This timeout interval is measured
     * in seconds.
     */
    @Generated
    @Selector("setTimeoutInterval:")
    public native void setTimeoutInterval(double value);

    /**
     * The URL of the receiver.
     */
    @Generated
    @Selector("setURL:")
    public native void setURL(@Nullable NSURL value);

    /**
     * setValue:forHTTPHeaderField:
     * 
     * Sets the value of the given HTTP header field.
     * 
     * If a value was previously set for the given header
     * field, that value is replaced with the given value. Note that, in
     * keeping with the HTTP RFC, HTTP header field names are
     * case-insensitive.
     * 
     * @param value the header field value.
     * @param field the header field name (case-insensitive).
     */
    @Generated
    @Selector("setValue:forHTTPHeaderField:")
    public native void setValueForHTTPHeaderField(@Nullable String value, @NotNull String field);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Sets the timeout interval of the receiver.
     * 
     * The timeout interval specifies the limit on the idle
     * interval allotted to a request in the process of loading. The "idle
     * interval" is defined as the period of time that has passed since the
     * last instance of load activity occurred for a request that is in the
     * process of loading. Hence, when an instance of load activity occurs
     * (e.g. bytes are received from the network for a request), the idle
     * interval for a request is reset to 0. If the idle interval ever
     * becomes greater than or equal to the timeout interval, the request
     * is considered to have timed out. This timeout interval is measured
     * in seconds.
     */
    @Generated
    @Selector("timeoutInterval")
    public native double timeoutInterval();

    /**
     * sets whether a connection created with this request is allowed to use
     * network interfaces which have been marked as constrained.
     * 
     * NO if the receiver should not be allowed to use an interface marked as constrained to
     * satisfy the request, YES otherwise.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("allowsConstrainedNetworkAccess")
    public native boolean allowsConstrainedNetworkAccess();

    /**
     * sets whether a connection created with this request is allowed to use
     * network interfaces which have been marked as expensive.
     * 
     * NO if the receiver should not be allowed to use an interface marked as expensive to
     * satisfy the request, YES otherwise.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("allowsExpensiveNetworkAccess")
    public native boolean allowsExpensiveNetworkAccess();

    /**
     * sets whether a connection created with this request is allowed to use
     * network interfaces which have been marked as constrained.
     * 
     * NO if the receiver should not be allowed to use an interface marked as constrained to
     * satisfy the request, YES otherwise.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAllowsConstrainedNetworkAccess:")
    public native void setAllowsConstrainedNetworkAccess(boolean value);

    /**
     * sets whether a connection created with this request is allowed to use
     * network interfaces which have been marked as expensive.
     * 
     * NO if the receiver should not be allowed to use an interface marked as expensive to
     * satisfy the request, YES otherwise.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAllowsExpensiveNetworkAccess:")
    public native void setAllowsExpensiveNetworkAccess(boolean value);

    /**
     * returns whether we assume that server supports HTTP/3. Enables QUIC
     * racing without HTTP/3 service discovery.
     * 
     * @return YES if server endpoint is known to support HTTP/3. Defaults to NO.
     *         The default may be YES in a future OS update.
     * 
     *         API-Since: 14.5
     */
    @Generated
    @Selector("assumesHTTP3Capable")
    public native boolean assumesHTTP3Capable();

    /**
     * Sets the NSURLRequestAttribution to associate with this request.
     * 
     * Set to NSURLRequestAttributionUser if the URL was specified by the
     * user. Defaults to NSURLRequestAttributionDeveloper.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("attribution")
    @NUInt
    public native long attribution();

    /**
     * returns whether we assume that server supports HTTP/3. Enables QUIC
     * racing without HTTP/3 service discovery.
     * 
     * @return YES if server endpoint is known to support HTTP/3. Defaults to NO.
     *         The default may be YES in a future OS update.
     * 
     *         API-Since: 14.5
     */
    @Generated
    @Selector("setAssumesHTTP3Capable:")
    public native void setAssumesHTTP3Capable(boolean value);

    /**
     * Sets the NSURLRequestAttribution to associate with this request.
     * 
     * Set to NSURLRequestAttributionUser if the URL was specified by the
     * user. Defaults to NSURLRequestAttributionDeveloper.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAttribution:")
    public native void setAttribution(@NUInt long value);

    /**
     * sets whether a request is required to do DNSSEC validation during DNS lookup.
     * 
     * YES, if the DNS lookup for this request should require DNSSEC validation,
     * No otherwise. Defaults to NO.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("requiresDNSSECValidation")
    public native boolean requiresDNSSECValidation();

    /**
     * sets whether a request is required to do DNSSEC validation during DNS lookup.
     * 
     * YES, if the DNS lookup for this request should require DNSSEC validation,
     * No otherwise. Defaults to NO.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("setRequiresDNSSECValidation:")
    public native void setRequiresDNSSECValidation(boolean value);
}
