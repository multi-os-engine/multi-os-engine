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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class NSURLRequest
 * 
 * @abstract An NSURLRequest object represents a URL load request in a
 * manner independent of protocol and URL scheme.
 * 
 * @discussion NSURLRequest encapsulates two basic data elements about
 * a URL load request:
 * <ul>
 * <li>The URL to load.
 * <li>The policy to use when consulting the URL content cache made
 * available by the implementation.
 * </ul>
 * In addition, NSURLRequest is designed to be extended to support
 * protocol-specific data by adding categories to access a property
 * object provided in an interface targeted at protocol implementors.
 * <ul>
 * <li>Protocol implementors should direct their attention to the
 * NSURLRequestExtensibility category on NSURLRequest for more
 * information on how to provide extensions on NSURLRequest to
 * support protocol-specific request information.
 * <li>Clients of this API who wish to create NSURLRequest objects to
 * load URL content should consult the protocol-specific NSURLRequest
 * categories that are available. The NSHTTPURLRequest category on
 * NSURLRequest is an example.
 * </ul>
 * <p>
 * Objects of this class are used to create NSURLConnection instances,
 * which can are used to perform the load of a URL, or as input to the
 * NSURLConnection class method which performs synchronous loads.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLRequest extends NSObject implements NSSecureCoding, NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLRequest alloc();

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

    /**
     * @method requestWithURL:
     * @abstract Allocates and initializes an NSURLRequest with the given
     * URL.
     * @discussion Default values are used for cache policy
     * (NSURLRequestUseProtocolCachePolicy) and timeout interval (60
     * seconds).
     * @param URL The URL for the request.
     * @result A newly-created and autoreleased NSURLRequest instance.
     */
    @Generated
    @Selector("requestWithURL:")
    public static native NSURLRequest requestWithURL(NSURL URL);

    /**
     * @method requestWithURL:cachePolicy:timeoutInterval:
     * @abstract Allocates and initializes a NSURLRequest with the given
     * URL and cache policy.
     * @param URL The URL for the request. 
     * @param cachePolicy The cache policy for the request. 
     * @param timeoutInterval The timeout interval for the request. See the
     * commentary for the <tt>timeoutInterval</tt> for more information on
     * timeout intervals.
     * @result A newly-created and autoreleased NSURLRequest instance. 
     */
    @Generated
    @Selector("requestWithURL:cachePolicy:timeoutInterval:")
    public static native NSURLRequest requestWithURLCachePolicyTimeoutInterval(NSURL URL, @NUInt long cachePolicy,
            double timeoutInterval);

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
     * @abstract Returns the request body data of the receiver. 
     * @discussion This data is sent as the message body of the request, as
     * in done in an HTTP POST request.
     * @result The request body data of the receiver. 
     */
    @Generated
    @Selector("HTTPBody")
    public native NSData HTTPBody();

    /**
     * @abstract Returns the request body stream of the receiver
     * if any has been set
     * @discussion The stream is returned for examination only; it is
     * not safe for the caller to manipulate the stream in any way.  Also
     * note that the HTTPBodyStream and HTTPBody are mutually exclusive - only
     * one can be set on a given request.  Also note that the body stream is
     * preserved across copies, but is LOST when the request is coded via the 
     * NSCoding protocol
     * @result The request body stream of the receiver.
     */
    @Generated
    @Selector("HTTPBodyStream")
    public native NSInputStream HTTPBodyStream();

    /**
     * @abstract Returns the HTTP request method of the receiver. 
     * @result the HTTP request method of the receiver. 
     */
    @Generated
    @Selector("HTTPMethod")
    public native String HTTPMethod();

    /**
     * @abstract Determine whether default cookie handling will happen for 
     * this request.
     * @discussion NOTE: This value is not used prior to 10.3
     * @result YES if cookies will be sent with and set for this request; 
     * otherwise NO.
     */
    @Generated
    @Selector("HTTPShouldHandleCookies")
    public native boolean HTTPShouldHandleCookies();

    /**
     * @abstract Reports whether the receiver is not expected to wait for the
     * previous response before transmitting.
     * @result YES if the receiver should transmit before the previous response
     * is received.  NO if the receiver should wait for the previous response
     * before transmitting.
     */
    @Generated
    @Selector("HTTPShouldUsePipelining")
    public native boolean HTTPShouldUsePipelining();

    /**
     * @abstract Returns the URL of the receiver. 
     * @result The URL of the receiver. 
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * @abstract Returns a dictionary containing all the HTTP header fields
     * of the receiver.
     * @result a dictionary containing all the HTTP header fields of the
     * receiver.
     */
    @Generated
    @Selector("allHTTPHeaderFields")
    public native NSDictionary<String, String> allHTTPHeaderFields();

    /**
     * @abstract returns whether a connection created with this request is allowed to use
     * the built in cellular radios (if present).
     * @result YES if the receiver is allowed to use the built in cellular radios to
     * satify the request, NO otherwise.
     */
    @Generated
    @Selector("allowsCellularAccess")
    public native boolean allowsCellularAccess();

    /**
     * @abstract Returns the cache policy of the receiver.
     * @result The cache policy of the receiver. 
     */
    @Generated
    @Selector("cachePolicy")
    @NUInt
    public native long cachePolicy();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NSURLRequest init();

    @Generated
    @Selector("initWithCoder:")
    public native NSURLRequest initWithCoder(NSCoder coder);

    /**
     * @method initWithURL:
     * @abstract Initializes an NSURLRequest with the given URL. 
     * @discussion Default values are used for cache policy
     * (NSURLRequestUseProtocolCachePolicy) and timeout interval (60
     * seconds).
     * @param URL The URL for the request. 
     * @result An initialized NSURLRequest. 
     */
    @Generated
    @Selector("initWithURL:")
    public native NSURLRequest initWithURL(NSURL URL);

    /**
     * @method initWithURL:
     * @abstract Initializes an NSURLRequest with the given URL and
     * cache policy.
     * @discussion This is the designated initializer for the 
     * NSURLRequest class.
     * @param URL The URL for the request. 
     * @param cachePolicy The cache policy for the request. 
     * @param timeoutInterval The timeout interval for the request. See the
     * commentary for the <tt>timeoutInterval</tt> for more information on
     * timeout intervals.
     * @result An initialized NSURLRequest. 
     */
    @Generated
    @Selector("initWithURL:cachePolicy:timeoutInterval:")
    public native NSURLRequest initWithURLCachePolicyTimeoutInterval(NSURL URL, @NUInt long cachePolicy,
            double timeoutInterval);

    /**
     * @abstract The main document URL associated with this load.
     * @discussion This URL is used for the cookie "same domain as main
     * document" policy. There may also be other future uses.
     * See setMainDocumentURL:
     * NOTE: In the current implementation, this value is unused by the
     * framework. A fully functional version of this method will be available 
     * in the future. 
     * @result The main document URL.
     */
    @Generated
    @Selector("mainDocumentURL")
    public native NSURL mainDocumentURL();

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * @abstract Returns the NSURLRequestNetworkServiceType associated with this request.
     * @discussion  This will return NSURLNetworkServiceTypeDefault for requests that have
     * not explicitly set a networkServiceType (using the setNetworkServiceType method).
     * @result The NSURLRequestNetworkServiceType associated with this request.
     */
    @Generated
    @Selector("networkServiceType")
    @NUInt
    public native long networkServiceType();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * @abstract Returns the timeout interval of the receiver.
     * @discussion The timeout interval specifies the limit on the idle
     * interval alloted to a request in the process of loading. The "idle
     * interval" is defined as the period of time that has passed since the
     * last instance of load activity occurred for a request that is in the
     * process of loading. Hence, when an instance of load activity occurs
     * (e.g. bytes are received from the network for a request), the idle
     * interval for a request is reset to 0. If the idle interval ever
     * becomes greater than or equal to the timeout interval, the request
     * is considered to have timed out. This timeout interval is measured
     * in seconds.
     * @result The timeout interval of the receiver. 
     */
    @Generated
    @Selector("timeoutInterval")
    public native double timeoutInterval();

    /**
     * @method valueForHTTPHeaderField:
     * @abstract Returns the value which corresponds to the given header
     * field. Note that, in keeping with the HTTP RFC, HTTP header field
     * names are case-insensitive.
     * @param field the header field name to use for the lookup
     * (case-insensitive).
     * @result the value associated with the given header field, or nil if
     * there is no value associated with the given header field.
     */
    @Generated
    @Selector("valueForHTTPHeaderField:")
    public native String valueForHTTPHeaderField(String field);

    /**
     * @abstract returns whether a connection created with this request is allowed to use
     * network interfaces which have been marked as constrained.
     * @result YES if the receiver is allowed to use an interface marked as constrained to
     * satify the request, NO otherwise.
     */
    @Generated
    @Selector("allowsConstrainedNetworkAccess")
    public native boolean allowsConstrainedNetworkAccess();

    /**
     * @abstract returns whether a connection created with this request is allowed to use
     * network interfaces which have been marked as expensive.
     * @result YES if the receiver is allowed to use an interface marked as expensive to
     * satify the request, NO otherwise.
     */
    @Generated
    @Selector("allowsExpensiveNetworkAccess")
    public native boolean allowsExpensiveNetworkAccess();
}
