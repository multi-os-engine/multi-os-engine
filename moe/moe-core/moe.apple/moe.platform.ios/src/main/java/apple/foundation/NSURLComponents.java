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
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLComponents extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLComponents(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLComponents alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLComponents allocWithZone(VoidPtr zone);

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

    /**
     * Initializes and returns a newly created NSURLComponents with a URL string. If the URLString is malformed, nil is
     * returned.
     */
    @Generated
    @Selector("componentsWithString:")
    public static native NSURLComponents componentsWithString(@NotNull String URLString);

    /**
     * Initializes and returns a newly created NSURLComponents with the components of a URL. If resolvingAgainstBaseURL
     * is YES and url is a relative URL, the components of [url absoluteURL] are used. If the url string from the NSURL
     * is malformed, nil is returned.
     */
    @Generated
    @Selector("componentsWithURL:resolvingAgainstBaseURL:")
    public static native NSURLComponents componentsWithURLResolvingAgainstBaseURL(@NotNull NSURL url, boolean resolve);

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
    public static native NSURLComponents new_objc();

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
     * Returns a URL created from the NSURLComponents. If the NSURLComponents has an authority component (user,
     * password, host or port) and a path component, then the path must either begin with "/" or be an empty string. If
     * the NSURLComponents does not have an authority component (user, password, host or port) and has a path component,
     * the path component must not start with "//". If those requirements are not met, nil is returned.
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * Returns a URL created from the NSURLComponents relative to a base URL. If the NSURLComponents has an authority
     * component (user, password, host or port) and a path component, then the path must either begin with "/" or be an
     * empty string. If the NSURLComponents does not have an authority component (user, password, host or port) and has
     * a path component, the path component must not start with "//". If those requirements are not met, nil is
     * returned.
     */
    @Nullable
    @Generated
    @Selector("URLRelativeToURL:")
    public native NSURL URLRelativeToURL(@Nullable NSURL baseURL);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("fragment")
    public native String fragment();

    @Nullable
    @Generated
    @Selector("host")
    public native String host();

    /**
     * Initialize a NSURLComponents with all components undefined. Designated initializer.
     */
    @Generated
    @Selector("init")
    public native NSURLComponents init();

    /**
     * Initialize a NSURLComponents with a URL string. If the URLString is malformed, nil is returned.
     */
    @Generated
    @Selector("initWithString:")
    public native NSURLComponents initWithString(@NotNull String URLString);

    /**
     * Initialize a NSURLComponents with the components of a URL. If resolvingAgainstBaseURL is YES and url is a
     * relative URL, the components of [url absoluteURL] are used. If the url string from the NSURL is malformed, nil is
     * returned.
     */
    @Generated
    @Selector("initWithURL:resolvingAgainstBaseURL:")
    public native NSURLComponents initWithURLResolvingAgainstBaseURL(@NotNull NSURL url, boolean resolve);

    @Nullable
    @Generated
    @Selector("password")
    public native String password();

    @Nullable
    @Generated
    @Selector("path")
    public native String path();

    @Nullable
    @Generated
    @Selector("percentEncodedFragment")
    public native String percentEncodedFragment();

    /**
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use encodedHost instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("percentEncodedHost")
    public native String percentEncodedHost();

    @Nullable
    @Generated
    @Selector("percentEncodedPassword")
    public native String percentEncodedPassword();

    @Nullable
    @Generated
    @Selector("percentEncodedPath")
    public native String percentEncodedPath();

    @Nullable
    @Generated
    @Selector("percentEncodedQuery")
    public native String percentEncodedQuery();

    /**
     * Getting these properties retains any percent encoding these components may have. Setting these properties assumes
     * the component string is already correctly percent encoded. Attempting to set an incorrectly percent encoded
     * string will cause an exception. Although ';' is a legal path character, it is recommended that it be
     * percent-encoded for best compatibility with NSURL (-stringByAddingPercentEncodingWithAllowedCharacters: will
     * percent-encode any ';' characters if you pass the URLPathAllowedCharacterSet).
     */
    @Nullable
    @Generated
    @Selector("percentEncodedUser")
    public native String percentEncodedUser();

    /**
     * Attempting to set a negative port number will cause an exception.
     */
    @Nullable
    @Generated
    @Selector("port")
    public native NSNumber port();

    @Nullable
    @Generated
    @Selector("query")
    public native String query();

    /**
     * The query component as an array of NSURLQueryItems for this NSURLComponents.
     * 
     * Each NSURLQueryItem represents a single key-value pair,
     * 
     * Note that a name may appear more than once in a single query string, so the name values are not guaranteed to be
     * unique. If the NSURLComponents has an empty query component, returns an empty array. If the NSURLComponents has
     * no query component, returns nil.
     * 
     * The queryItems getter returns an array of NSURLQueryItems in the order in which they appear in the original query
     * string. Any percent-encoding in a NSURLQueryItem name or value is removed.
     * 
     * The queryItems setter combines an array containing any number of NSURLQueryItems, each of which represents a
     * single key-value pair, into a query string and sets the NSURLComponents query property. If the NSURLQueryItems
     * name or value strings contain any characters not allowed in a URL's query component, those characters are
     * percent-encoded. In addition, any '&' and '=' characters in a NSURLQueryItem name are percent-encoded. Passing an
     * empty array sets the query component of the NSURLComponents to an empty string. Passing nil removes the query
     * component of the NSURLComponents.
     * 
     * - note: If a NSURLQueryItem name-value pair is empty (i.e. the query string starts with '&', ends with '&', or
     * has "&&" within it), you get a NSURLQueryItem with a zero-length name and a nil value. If a NSURLQueryItem
     * name-value pair has nothing before the equals sign, you get a zero-length name. If a NSURLQueryItem name-value
     * pair has nothing after the equals sign, you get a zero-length value. If a NSURLQueryItem name-value pair has no
     * equals sign, the NSURLQueryItem name-value pair string is the name and you get a nil value.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("queryItems")
    public native NSArray<? extends NSURLQueryItem> queryItems();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfFragment")
    @ByValue
    public native NSRange rangeOfFragment();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfHost")
    @ByValue
    public native NSRange rangeOfHost();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfPassword")
    @ByValue
    public native NSRange rangeOfPassword();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfPath")
    @ByValue
    public native NSRange rangeOfPath();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfPort")
    @ByValue
    public native NSRange rangeOfPort();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfQuery")
    @ByValue
    public native NSRange rangeOfQuery();

    /**
     * These properties return the character range of a component in the URL string returned by -[NSURLComponents
     * string]. If the component does not exist in the NSURLComponents object, {NSNotFound, 0} is returned. Note: Zero
     * length components are legal. For example, the URL string "scheme://:@/?#" has a zero length user, password, host,
     * query and fragment; the URL strings "scheme:" and "" both have a zero length path.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfScheme")
    @ByValue
    public native NSRange rangeOfScheme();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rangeOfUser")
    @ByValue
    public native NSRange rangeOfUser();

    /**
     * Attempting to set the scheme with an invalid scheme string will cause an exception.
     */
    @Nullable
    @Generated
    @Selector("scheme")
    public native String scheme();

    @Generated
    @Selector("setFragment:")
    public native void setFragment(@Nullable String value);

    @Generated
    @Selector("setHost:")
    public native void setHost(@Nullable String value);

    @Generated
    @Selector("setPassword:")
    public native void setPassword(@Nullable String value);

    @Generated
    @Selector("setPath:")
    public native void setPath(@Nullable String value);

    @Generated
    @Selector("setPercentEncodedFragment:")
    public native void setPercentEncodedFragment(@Nullable String value);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use encodedHost instead
     */
    @Deprecated
    @Generated
    @Selector("setPercentEncodedHost:")
    public native void setPercentEncodedHost(@Nullable String value);

    @Generated
    @Selector("setPercentEncodedPassword:")
    public native void setPercentEncodedPassword(@Nullable String value);

    @Generated
    @Selector("setPercentEncodedPath:")
    public native void setPercentEncodedPath(@Nullable String value);

    @Generated
    @Selector("setPercentEncodedQuery:")
    public native void setPercentEncodedQuery(@Nullable String value);

    /**
     * Getting these properties retains any percent encoding these components may have. Setting these properties assumes
     * the component string is already correctly percent encoded. Attempting to set an incorrectly percent encoded
     * string will cause an exception. Although ';' is a legal path character, it is recommended that it be
     * percent-encoded for best compatibility with NSURL (-stringByAddingPercentEncodingWithAllowedCharacters: will
     * percent-encode any ';' characters if you pass the URLPathAllowedCharacterSet).
     */
    @Generated
    @Selector("setPercentEncodedUser:")
    public native void setPercentEncodedUser(@Nullable String value);

    /**
     * Attempting to set a negative port number will cause an exception.
     */
    @Generated
    @Selector("setPort:")
    public native void setPort(@Nullable NSNumber value);

    @Generated
    @Selector("setQuery:")
    public native void setQuery(@Nullable String value);

    /**
     * The query component as an array of NSURLQueryItems for this NSURLComponents.
     * 
     * Each NSURLQueryItem represents a single key-value pair,
     * 
     * Note that a name may appear more than once in a single query string, so the name values are not guaranteed to be
     * unique. If the NSURLComponents has an empty query component, returns an empty array. If the NSURLComponents has
     * no query component, returns nil.
     * 
     * The queryItems getter returns an array of NSURLQueryItems in the order in which they appear in the original query
     * string. Any percent-encoding in a NSURLQueryItem name or value is removed.
     * 
     * The queryItems setter combines an array containing any number of NSURLQueryItems, each of which represents a
     * single key-value pair, into a query string and sets the NSURLComponents query property. If the NSURLQueryItems
     * name or value strings contain any characters not allowed in a URL's query component, those characters are
     * percent-encoded. In addition, any '&' and '=' characters in a NSURLQueryItem name are percent-encoded. Passing an
     * empty array sets the query component of the NSURLComponents to an empty string. Passing nil removes the query
     * component of the NSURLComponents.
     * 
     * - note: If a NSURLQueryItem name-value pair is empty (i.e. the query string starts with '&', ends with '&', or
     * has "&&" within it), you get a NSURLQueryItem with a zero-length name and a nil value. If a NSURLQueryItem
     * name-value pair has nothing before the equals sign, you get a zero-length name. If a NSURLQueryItem name-value
     * pair has nothing after the equals sign, you get a zero-length value. If a NSURLQueryItem name-value pair has no
     * equals sign, the NSURLQueryItem name-value pair string is the name and you get a nil value.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setQueryItems:")
    public native void setQueryItems(@Nullable NSArray<? extends NSURLQueryItem> value);

    /**
     * Attempting to set the scheme with an invalid scheme string will cause an exception.
     */
    @Generated
    @Selector("setScheme:")
    public native void setScheme(@Nullable String value);

    @Generated
    @Selector("setUser:")
    public native void setUser(@Nullable String value);

    /**
     * Returns a URL string created from the NSURLComponents. If the NSURLComponents has an authority component (user,
     * password, host or port) and a path component, then the path must either begin with "/" or be an empty string. If
     * the NSURLComponents does not have an authority component (user, password, host or port) and has a path component,
     * the path component must not start with "//". If those requirements are not met, nil is returned.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("string")
    public native String string();

    @Nullable
    @Generated
    @Selector("user")
    public native String user();

    /**
     * The percentEncodedQueryItems getter returns an array of NSURLQueryItems in the order in which they appear in the
     * original query string. Any percent-encoding in a NSURLQueryItem name or value is retained.
     * 
     * The percentEncodedQueryItems setter combines an array containing any number of NSURLQueryItems, each of which
     * represents a single key-value pair, into a query string and sets the NSURLComponents query property. This
     * property assumes the NSURLQueryItem names and values are already correctly percent-encoded, and that the
     * NSURLQueryItem names do not contain the query item delimiter characters '&' and '='. Attempting to set an
     * incorrectly percent-encoded NSURLQueryItem or a NSURLQueryItem name with the query item delimiter characters '&'
     * and '=' will cause an exception.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("percentEncodedQueryItems")
    public native NSArray<? extends NSURLQueryItem> percentEncodedQueryItems();

    /**
     * The percentEncodedQueryItems getter returns an array of NSURLQueryItems in the order in which they appear in the
     * original query string. Any percent-encoding in a NSURLQueryItem name or value is retained.
     * 
     * The percentEncodedQueryItems setter combines an array containing any number of NSURLQueryItems, each of which
     * represents a single key-value pair, into a query string and sets the NSURLComponents query property. This
     * property assumes the NSURLQueryItem names and values are already correctly percent-encoded, and that the
     * NSURLQueryItem names do not contain the query item delimiter characters '&' and '='. Attempting to set an
     * incorrectly percent-encoded NSURLQueryItem or a NSURLQueryItem name with the query item delimiter characters '&'
     * and '=' will cause an exception.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPercentEncodedQueryItems:")
    public native void setPercentEncodedQueryItems(@Nullable NSArray<? extends NSURLQueryItem> value);

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("encodedHost")
    public native String encodedHost();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setEncodedHost:")
    public native void setEncodedHost(@Nullable String value);
}
