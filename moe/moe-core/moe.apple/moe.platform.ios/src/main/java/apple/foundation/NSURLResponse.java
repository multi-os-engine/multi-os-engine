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
 * NSURLResponse
 * <p>
 * An NSURLResponse object represents a URL load response in a
 * manner independent of protocol and URL scheme.
 * <p>
 * NSURLResponse encapsulates the metadata associated
 * with a URL load. Note that NSURLResponse objects do not contain
 * the actual bytes representing the content of a URL. See
 * NSURLConnection and NSURLConnectionDelegate for more information
 * about receiving the content data for a URL load.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLResponse extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLResponse alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLResponse allocWithZone(VoidPtr zone);

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
    public static native NSURLResponse new_objc();

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
     * Returns the MIME type of the receiver.
     * <p>
     * The MIME type is based on the information provided
     * from an origin source. However, that value may be changed or
     * corrected by a protocol implementation if it can be determined
     * that the origin server or source reported the information
     * incorrectly or imprecisely. An attempt to guess the MIME type may
     * be made if the origin source did not report any such information.
     *
     * @return The MIME type of the receiver.
     */
    @Generated
    @Selector("MIMEType")
    public native String MIMEType();

    /**
     * Returns the URL of the receiver.
     *
     * @return The URL of the receiver.
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Returns the expected content length of the receiver.
     * <p>
     * Some protocol implementations report a content length
     * as part of delivering load metadata, but not all protocols
     * guarantee the amount of data that will be delivered in actuality.
     * Hence, this method returns an expected amount. Clients should use
     * this value as an advisory, and should be prepared to deal with
     * either more or less data.
     *
     * @return The expected content length of the receiver, or -1 if
     * there is no expectation that can be arrived at regarding expected
     * content length.
     */
    @Generated
    @Selector("expectedContentLength")
    public native long expectedContentLength();

    @Generated
    @Selector("init")
    public native NSURLResponse init();

    @Generated
    @Selector("initWithCoder:")
    public native NSURLResponse initWithCoder(NSCoder coder);

    /**
     * initWithURL:MIMEType:expectedContentLength:textEncodingName:
     * <p>
     * Initialize an NSURLResponse with the provided values.
     * <p>
     * This is the designated initializer for NSURLResponse.
     *
     * @param URL      the URL
     * @param MIMEType the MIME content type of the response
     * @param length   the expected content length of the associated data
     * @param name     the name of the text encoding for the associated data, if applicable, else nil
     * @return The initialized NSURLResponse.
     */
    @Generated
    @Selector("initWithURL:MIMEType:expectedContentLength:textEncodingName:")
    public native NSURLResponse initWithURLMIMETypeExpectedContentLengthTextEncodingName(NSURL URL, String MIMEType,
            @NInt long length, String name);

    /**
     * Returns a suggested filename if the resource were saved to disk.
     * <p>
     * The method first checks if the server has specified a filename using the
     * content disposition header. If no valid filename is specified using that mechanism,
     * this method checks the last path component of the URL. If no valid filename can be
     * obtained using the last path component, this method uses the URL's host as the filename.
     * If the URL's host can't be converted to a valid filename, the filename "unknown" is used.
     * In mose cases, this method appends the proper file extension based on the MIME type.
     * This method always returns a valid filename.
     *
     * @return A suggested filename to use if saving the resource to disk.
     */
    @Generated
    @Selector("suggestedFilename")
    public native String suggestedFilename();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Returns the name of the text encoding of the receiver.
     * <p>
     * This name will be the actual string reported by the
     * origin source during the course of performing a protocol-specific
     * URL load. Clients can inspect this string and convert it to an
     * NSStringEncoding or CFStringEncoding using the methods and
     * functions made available in the appropriate framework.
     *
     * @return The name of the text encoding of the receiver, or nil if no
     * text encoding was specified.
     */
    @Generated
    @Selector("textEncodingName")
    public native String textEncodingName();
}
