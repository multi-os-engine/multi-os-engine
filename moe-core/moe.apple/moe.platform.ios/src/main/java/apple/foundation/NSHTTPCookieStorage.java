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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * NSHTTPCookieStorage
 * 
 * NSHTTPCookieStorage implements a singleton object (shared
 * instance) which manages the shared cookie store. It has methods
 * to allow clients to set and remove cookies, and get the current
 * set of cookies. It also has convenience methods to parse and
 * generate cookie-related HTTP header fields.
 * 
 * API-Since: 2.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHTTPCookieStorage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSHTTPCookieStorage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSHTTPCookieStorage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSHTTPCookieStorage allocWithZone(VoidPtr zone);

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
    public static native NSHTTPCookieStorage new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * sharedCookieStorageForGroupContainerIdentifier:
     * 
     * Get the cookie storage for the container associated with the specified application group identifier
     * 
     * By default, applications and associated app extensions have different data containers, which means
     * that the sharedHTTPCookieStorage singleton will refer to different persistent cookie stores in an application and
     * any app extensions that it contains. This method allows clients to create a persistent cookie storage that can be
     * shared among all applications and extensions with access to the same application group. Subsequent calls to this
     * method with the same identifier will return the same cookie storage instance.
     * 
     * API-Since: 9.0
     * 
     * @param identifier The application group identifier
     * @return A cookie storage with a persistent store in the application group container
     */
    @NotNull
    @Generated
    @Selector("sharedCookieStorageForGroupContainerIdentifier:")
    public static native NSHTTPCookieStorage sharedCookieStorageForGroupContainerIdentifier(@NotNull String identifier);

    /**
     * [@property] sharedHTTPCookieStorage
     * 
     * Get the shared cookie storage in the default location.
     * 
     * Starting in OS X 10.11, each app has its own sharedHTTPCookieStorage singleton,
     * which will not be shared with other applications.
     * 
     * @return The shared cookie storage
     */
    @NotNull
    @Generated
    @Selector("sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage sharedHTTPCookieStorage();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * The cookie accept policy preference of the
     * receiver.
     */
    @Generated
    @Selector("cookieAcceptPolicy")
    @NUInt
    public native long cookieAcceptPolicy();

    /**
     * Get all the cookies
     * 
     * @return An NSArray of NSHTTPCookies
     */
    @Nullable
    @Generated
    @Selector("cookies")
    public native NSArray<? extends NSHTTPCookie> cookies();

    /**
     * cookiesForURL:
     * 
     * Returns an array of cookies to send to the given URL.
     * 
     * The cookie manager examines the cookies it stores and
     * includes those which should be sent to the given URL. You can use
     * <tt>+[NSCookie requestHeaderFieldsWithCookies:]</tt> to turn this array
     * into a set of header fields to add to a request.
     * 
     * @param URL The URL for which to get cookies.
     * @return an NSArray of NSHTTPCookie objects.
     */
    @Nullable
    @Generated
    @Selector("cookiesForURL:")
    public native NSArray<? extends NSHTTPCookie> cookiesForURL(@NotNull NSURL URL);

    /**
     * deleteCookie:
     * 
     * Delete the specified cookie
     */
    @Generated
    @Selector("deleteCookie:")
    public native void deleteCookie(@NotNull NSHTTPCookie cookie);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("getCookiesForTask:completionHandler:")
    public native void getCookiesForTaskCompletionHandler(@NotNull NSURLSessionTask task,
            @NotNull @ObjCBlock(name = "call_getCookiesForTaskCompletionHandler") Block_getCookiesForTaskCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NSHTTPCookieStorage init();

    /**
     * removeCookiesSince:
     * 
     * Delete all cookies from the cookie storage since the provided date.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("removeCookiesSinceDate:")
    public native void removeCookiesSinceDate(@NotNull NSDate date);

    /**
     * setCookie:
     * 
     * Set a cookie
     * 
     * The cookie will override an existing cookie with the
     * same name, domain and path, if any.
     */
    @Generated
    @Selector("setCookie:")
    public native void setCookie(@NotNull NSHTTPCookie cookie);

    /**
     * The cookie accept policy preference of the
     * receiver.
     */
    @Generated
    @Selector("setCookieAcceptPolicy:")
    public native void setCookieAcceptPolicy(@NUInt long value);

    /**
     * setCookies:forURL:mainDocumentURL:
     * 
     * Adds an array cookies to the cookie store, following the
     * cookie accept policy.
     * 
     * For mainDocumentURL, the caller should pass the URL for
     * an appropriate main document, if known. For example, when loading
     * a web page, the URL of the main html document for the top-level
     * frame should be passed. To save cookies based on a set of response
     * headers, you can use <tt>+[NSCookie
     * cookiesWithResponseHeaderFields:forURL:]</tt> on a header field
     * dictionary and then use this method to store the resulting cookies
     * in accordance with policy settings.
     * 
     * @param cookies         The cookies to set.
     * @param URL             The URL from which the cookies were sent.
     * @param mainDocumentURL The main document URL to be used as a base for the "same
     *                        domain as main document" policy.
     */
    @Generated
    @Selector("setCookies:forURL:mainDocumentURL:")
    public native void setCookiesForURLMainDocumentURL(@NotNull NSArray<? extends NSHTTPCookie> cookies,
            @Nullable NSURL URL, @Nullable NSURL mainDocumentURL);

    /**
     * sortedCookiesUsingDescriptors:
     * 
     * Returns an array of all cookies in the store, sorted according to the key value and sorting direction of the
     * NSSortDescriptors specified in the parameter.
     * 
     * proper sorting of cookies may require extensive string conversion, which can be avoided by allowing the system to
     * perform the sorting. This API is to be preferred over the more generic -[NSHTTPCookieStorage cookies] API, if
     * sorting is going to be performed.
     * 
     * API-Since: 5.0
     * 
     * @param sortOrder an array of NSSortDescriptors which represent the preferred sort order of the resulting array.
     */
    @NotNull
    @Generated
    @Selector("sortedCookiesUsingDescriptors:")
    public native NSArray<? extends NSHTTPCookie> sortedCookiesUsingDescriptors(
            @NotNull NSArray<? extends NSSortDescriptor> sortOrder);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("storeCookies:forTask:")
    public native void storeCookiesForTask(@NotNull NSArray<? extends NSHTTPCookie> cookies,
            @NotNull NSURLSessionTask task);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCookiesForTaskCompletionHandler {
        @Generated
        void call_getCookiesForTaskCompletionHandler(@Nullable NSArray<? extends NSHTTPCookie> cookies);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
