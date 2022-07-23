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
 * NSHTTPCookie
 * <p>
 * NSHTTPCookie represents an http cookie.
 * <p>
 * A NSHTTPCookie instance represents a single http cookie. It is
 * an immutable object initialized from a dictionary that contains
 * the various cookie attributes. It has accessors to get the various
 * attributes of a cookie.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHTTPCookie extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSHTTPCookie(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSHTTPCookie alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSHTTPCookie allocWithZone(VoidPtr zone);

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

    /**
     * cookieWithProperties:
     * <p>
     * Allocates and initializes an NSHTTPCookie with the given
     * dictionary.
     * <p>
     * See the NSHTTPCookie <tt>-initWithProperties:</tt>
     * method for more information on the constraints imposed on the
     * dictionary, and for descriptions of the supported keys and values.
     *
     * @param properties The dictionary to use to initialize this cookie.
     * @return A newly-created and autoreleased NSHTTPCookie instance, or
     *         nil if the set of dictionary keys is invalid, for example because
     *         a required key is missing, or a recognized key maps to an illegal
     *         value.
     */
    @Generated
    @Selector("cookieWithProperties:")
    public static native NSHTTPCookie cookieWithProperties(NSDictionary<String, ?> properties);

    /**
     * cookiesWithResponseHeaderFields:forURL:
     * <p>
     * Return an array of cookies parsed from the specified response header fields and URL.
     * <p>
     * This method will ignore irrelevant header fields so
     * you can pass a dictionary containing data other than cookie data.
     *
     * @param headerFields The response header fields to check for cookies.
     * @param URL          The URL that the cookies came from - relevant to how the cookies are interpeted.
     * @return An NSArray of NSHTTPCookie objects
     */
    @Generated
    @Selector("cookiesWithResponseHeaderFields:forURL:")
    public static native NSArray<? extends NSHTTPCookie> cookiesWithResponseHeaderFieldsForURL(
            NSDictionary<String, String> headerFields, NSURL URL);

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
    public static native NSHTTPCookie new_objc();

    /**
     * requestHeaderFieldsWithCookies:
     * <p>
     * Return a dictionary of header fields that can be used to add the
     * specified cookies to the request.
     *
     * @param cookies The cookies to turn into request headers.
     * @return An NSDictionary where the keys are header field names, and the values
     *         are the corresponding header field values.
     */
    @Generated
    @Selector("requestHeaderFieldsWithCookies:")
    public static native NSDictionary<String, String> requestHeaderFieldsWithCookies(
            NSArray<? extends NSHTTPCookie> cookies);

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
     * Returns the comment of the receiver.
     * <p>
     * This value specifies a string which is suitable for
     * presentation to the user explaining the contents and purpose of this
     * cookie. It may be nil.
     *
     * @return The comment of the receiver, or nil if the receiver has no
     *         comment.
     */
    @Generated
    @Selector("comment")
    public native String comment();

    /**
     * Returns the comment URL of the receiver.
     * <p>
     * This value specifies a URL which is suitable for
     * presentation to the user as a link for further information about
     * this cookie. It may be nil.
     *
     * @return The comment URL of the receiver, or nil if the receiver
     *         has no comment URL.
     */
    @Generated
    @Selector("commentURL")
    public native NSURL commentURL();

    /**
     * Returns the domain of the receiver.
     * <p>
     * This value specifies URL domain to which the cookie
     * should be sent. A domain with a leading dot means the cookie
     * should be sent to subdomains as well, assuming certain other
     * restrictions are valid. See RFC 2965 for more detail.
     *
     * @return The domain of the receiver.
     */
    @Generated
    @Selector("domain")
    public native String domain();

    /**
     * Returns the expires date of the receiver.
     * <p>
     * The expires date is the date when the cookie should be
     * deleted. The result will be nil if there is no specific expires
     * date. This will be the case only for "session-only" cookies.
     *
     * @return the expires date of the receiver.
     * @return The expires date of the receiver.
     */
    @Generated
    @Selector("expiresDate")
    public native NSDate expiresDate();

    @Generated
    @Selector("init")
    public native NSHTTPCookie init();

    /**
     * initWithProperties:
     * <p>
     * Initialize a NSHTTPCookie object with a dictionary of
     * parameters
     * <p>
     * Supported dictionary keys and value types for the
     * given dictionary are as follows.
     * <p>
     * All properties can handle an NSString value, but some can also
     * handle other types.
     *
     * <table border="1" cellspacing="2" cellpadding="4">
     * <tr>
     * <th>Property key constant</th>
     * <th>Type of value</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieComment</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>Comment for the cookie. Only valid for version 1 cookies and
     * later. Default is nil.</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieCommentURL</td>
     * <td>NSURL or NSString</td>
     * <td>NO</td>
     * <td>Comment URL for the cookie. Only valid for version 1 cookies
     * and later. Default is nil.</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieDomain</td>
     * <td>NSString</td>
     * <td>Special, a value for either NSHTTPCookieOriginURL or
     * NSHTTPCookieDomain must be specified.</td>
     * <td>Domain for the cookie. Inferred from the value for
     * NSHTTPCookieOriginURL if not provided.</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieDiscard</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>A string stating whether the cookie should be discarded at
     * the end of the session. String value must be either "TRUE" or
     * "FALSE". Default is "FALSE", unless this is cookie is version
     * 1 or greater and a value for NSHTTPCookieMaximumAge is not
     * specified, in which case it is assumed "TRUE".</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieExpires</td>
     * <td>NSDate or NSString</td>
     * <td>NO</td>
     * <td>Expiration date for the cookie. Used only for version 0
     * cookies. Ignored for version 1 or greater.</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieMaximumAge</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>A string containing an integer value stating how long in
     * seconds the cookie should be kept, at most. Only valid for
     * version 1 cookies and later. Default is "0".</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieName</td>
     * <td>NSString</td>
     * <td>YES</td>
     * <td>Name of the cookie</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieOriginURL</td>
     * <td>NSURL or NSString</td>
     * <td>Special, a value for either NSHTTPCookieOriginURL or
     * NSHTTPCookieDomain must be specified.</td>
     * <td>URL that set this cookie. Used as default for other fields
     * as noted.</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookiePath</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>Path for the cookie. Inferred from the value for
     * NSHTTPCookieOriginURL if not provided. Default is "/".</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookiePort</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>comma-separated integer values specifying the ports for the
     * cookie. Only valid for version 1 cookies and later. Default is
     * empty string ("").</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieSecure</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>A string stating whether the cookie should be transmitted
     * only over secure channels. String value must be either "TRUE"
     * or "FALSE". Default is "FALSE".</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieValue</td>
     * <td>NSString</td>
     * <td>YES</td>
     * <td>Value of the cookie</td>
     * </tr>
     * <tr>
     * <td>NSHTTPCookieVersion</td>
     * <td>NSString</td>
     * <td>NO</td>
     * <td>Specifies the version of the cookie. Must be either "0" or
     * "1". Default is "0".</td>
     * </tr>
     * </table>
     * <p>
     * All other keys are ignored.
     *
     * @param properties The dictionary of properties to be used to
     *                   initialize this cookie.
     * @return An initialized NSHTTPCookie, or nil if the set of
     *         dictionary keys is invalid, for example because a required key is
     *         missing, or a recognized key maps to an illegal value.
     */
    @Generated
    @Selector("initWithProperties:")
    public native NSHTTPCookie initWithProperties(NSDictionary<String, ?> properties);

    /**
     * Returns whether the receiver should only be sent to HTTP servers
     * per RFC 2965
     * <p>
     * Cookies may be marked as HTTPOnly by a server (or by a javascript).
     * Cookies marked as such must only be sent via HTTP Headers in HTTP Requests
     * for URL's that match both the path and domain of the respective Cookies.
     * Specifically these cookies should not be delivered to any javascript
     * applications to prevent cross-site scripting vulnerabilities.
     *
     * @return YES if this cookie should only be sent via HTTP headers,
     *         NO otherwise.
     */
    @Generated
    @Selector("isHTTPOnly")
    public native boolean isHTTPOnly();

    /**
     * Returns whether the receiver should be sent only over
     * secure channels
     * <p>
     * Cookies may be marked secure by a server (or by a javascript).
     * Cookies marked as such must only be sent via an encrypted connection to
     * trusted servers (i.e. via SSL or TLS), and should not be delievered to any
     * javascript applications to prevent cross-site scripting vulnerabilities.
     *
     * @return YES if this cookie should be sent only over secure channels,
     *         NO otherwise.
     */
    @Generated
    @Selector("isSecure")
    public native boolean isSecure();

    /**
     * Returns whether the receiver is session-only.
     *
     * @return YES if this receiver should be discarded at the end of the
     *         session (regardless of expiration date), NO if receiver need not
     *         be discarded at the end of the session.
     */
    @Generated
    @Selector("isSessionOnly")
    public native boolean isSessionOnly();

    /**
     * Returns the name of the receiver.
     *
     * @return the name of the receiver.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * Returns the path of the receiver.
     * <p>
     * This value specifies the URL path under the cookie's
     * domain for which this cookie should be sent. The cookie will also
     * be sent for children of that path, so "/" is the most general.
     *
     * @return The path of the receiver.
     */
    @Generated
    @Selector("path")
    public native String path();

    /**
     * Returns the list ports to which the receiver should be
     * sent.
     * <p>
     * This value specifies an NSArray of NSNumbers
     * (containing integers) which specify the only ports to which this
     * cookie should be sent.
     *
     * @return The list ports to which the receiver should be sent. The
     *         array may be nil, in which case this cookie can be sent to any
     *         port.
     */
    @Generated
    @Selector("portList")
    public native NSArray<? extends NSNumber> portList();

    /**
     * Returns a dictionary representation of the receiver.
     * <p>
     * This method returns a dictionary representation of the
     * NSHTTPCookie which can be saved and passed to
     * <tt>-initWithProperties:</tt> or <tt>+cookieWithProperties:</tt>
     * later to reconstitute an equivalent cookie.
     * <p>See the NSHTTPCookie <tt>-initWithProperties:</tt> method for
     * more information on the constraints imposed on the dictionary, and
     * for descriptions of the supported keys and values.
     *
     * @return The dictionary representation of the receiver.
     */
    @Generated
    @Selector("properties")
    public native NSDictionary<String, ?> properties();

    /**
     * Returns the value of the receiver.
     *
     * @return the value of the receiver.
     */
    @Generated
    @Selector("value")
    public native String value();

    /**
     * Returns the version of the receiver.
     * <p>
     * Version 0 maps to "old-style" Netscape cookies.
     * Version 1 maps to RFC2965 cookies. There may be future versions.
     *
     * @return the version of the receiver.
     */
    @Generated
    @Selector("version")
    @NUInt
    public native long version();

    /**
     * Returns the value of the same site attribute on the cookie.
     * <p>
     * Cookies can be marked with an attribute Strict or Lax.
     * Cookies marked with "strict" (NSHTTPCookieSameSiteStrict) are not sent along with cross-site requests.
     * Cookies marked with "lax" (NSHTTPCookieSameSiteLax) sent along cross-site requests provided the
     * cross-site requests are top-level-requests (one that changes the url in the address bar).
     * The attribute value is canonicalized and stored. Any value other than the default (strict and lax) will be
     * ignored.
     *
     * @return strict or lax. The result could also be nil, in which case the
     *         cookie will be sent along with all cross-site requests.
     */
    @Generated
    @Selector("sameSitePolicy")
    public native String sameSitePolicy();
}
