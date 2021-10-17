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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSHTTPURLResponse
 * <p>
 * An NSHTTPURLResponse object represents a response to an
 * HTTP URL load. It is a specialization of NSURLResponse which
 * provides conveniences for accessing information specific to HTTP
 * protocol responses.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHTTPURLResponse extends NSURLResponse {
    static {
        NatJ.register();
    }

    @Generated
    protected NSHTTPURLResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSHTTPURLResponse alloc();

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

    /**
     * localizedStringForStatusCode:
     * <p>
     * Convenience method which returns a localized string
     * corresponding to the status code for this response.
     *
     * @param statusCode the status code to use to produce a localized string.
     * @return A localized string corresponding to the given status code.
     */
    @Generated
    @Selector("localizedStringForStatusCode:")
    public static native String localizedStringForStatusCode(@NInt long statusCode);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns a dictionary containing all the HTTP header fields
     * of the receiver.
     * <p>
     * By examining this header dictionary, clients can see
     * the "raw" header information which was reported to the protocol
     * implementation by the HTTP server. This may be of use to
     * sophisticated or special-purpose HTTP clients.
     *
     * @return A dictionary containing all the HTTP header fields of the
     * receiver.
     */
    @Generated
    @Selector("allHeaderFields")
    public native NSDictionary<?, ?> allHeaderFields();

    @Generated
    @Selector("init")
    public native NSHTTPURLResponse init();

    @Generated
    @Selector("initWithCoder:")
    public native NSHTTPURLResponse initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithURL:MIMEType:expectedContentLength:textEncodingName:")
    public native NSHTTPURLResponse initWithURLMIMETypeExpectedContentLengthTextEncodingName(NSURL URL, String MIMEType,
            @NInt long length, String name);

    /**
     * initWithURL:statusCode:HTTPVersion:headerFields:
     * <p>
     * initializer for NSHTTPURLResponse objects.
     * <p>
     * This API was introduced in Mac OS X 10.7.2 and iOS 5.0 and is not available prior to those releases.
     *
     * @param url          the URL from which the response was generated.
     * @param headerFields A dictionary representing the header keys and values of the server response.
     * @return the instance of the object, or NULL if an error occurred during initialization.
     * @param    statusCode an HTTP status code.
     * @param    HTTPVersion The version of the HTTP response as represented by the server.  This is typically represented as "HTTP/1.1".
     */
    @Generated
    @Selector("initWithURL:statusCode:HTTPVersion:headerFields:")
    public native NSHTTPURLResponse initWithURLStatusCodeHTTPVersionHeaderFields(NSURL url, @NInt long statusCode,
            String HTTPVersion, NSDictionary<String, String> headerFields);

    /**
     * Returns the HTTP status code of the receiver.
     *
     * @return The HTTP status code of the receiver.
     */
    @Generated
    @Selector("statusCode")
    @NInt
    public native long statusCode();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * valueForHTTPHeaderField:
     * <p>
     * Returns the value which corresponds to the given header
     * field. Note that, in keeping with the HTTP RFC, HTTP header field
     * names are case-insensitive.
     *
     * @param field the header field name to use for the lookup
     *              (case-insensitive).
     * @return the value associated with the given header field, or nil if
     * there is no value associated with the given header field.
     */
    @Generated
    @Selector("valueForHTTPHeaderField:")
    public native String valueForHTTPHeaderField(String field);
}
