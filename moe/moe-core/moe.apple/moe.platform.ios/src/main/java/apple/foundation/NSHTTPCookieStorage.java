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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Owned
    @Selector("alloc")
    public static native NSHTTPCookieStorage alloc();

    /**
     * cookieAcceptPolicy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instp/NSHTTPCookieStorage/cookieAcceptPolicy">iOS Dev Center</a>
     */
    @Generated
    @Selector("cookieAcceptPolicy")
    @NUInt
    public native long cookieAcceptPolicy();

    /**
     * cookies</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instp/NSHTTPCookieStorage/cookies">iOS Dev Center</a>
     */
    @Generated
    @Selector("cookies")
    public native NSArray<? extends NSHTTPCookie> cookies();

    /**
     * cookiesForURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instm/NSHTTPCookieStorage/cookiesForURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cookiesForURL:")
    public native NSArray<? extends NSHTTPCookie> cookiesForURL(NSURL URL);

    /**
     * deleteCookie:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instm/NSHTTPCookieStorage/deleteCookie:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteCookie:")
    public native void deleteCookie(NSHTTPCookie cookie);

    @Generated
    @Selector("getCookiesForTask:completionHandler:")
    public native void getCookiesForTaskCompletionHandler(NSURLSessionTask task,
            @ObjCBlock(name = "call_getCookiesForTaskCompletionHandler") Block_getCookiesForTaskCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCookiesForTaskCompletionHandler {
        @Generated
        void call_getCookiesForTaskCompletionHandler(NSArray<? extends NSHTTPCookie> arg0);
    }

    @Generated
    @Selector("init")
    public native NSHTTPCookieStorage init();

    @Generated
    @Selector("removeCookiesSinceDate:")
    public native void removeCookiesSinceDate(NSDate date);

    /**
     * setCookie:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instm/NSHTTPCookieStorage/setCookie:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCookie:")
    public native void setCookie(NSHTTPCookie cookie);

    /**
     * cookieAcceptPolicy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instp/NSHTTPCookieStorage/cookieAcceptPolicy">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCookieAcceptPolicy:")
    public native void setCookieAcceptPolicy(@NUInt long value);

    /**
     * setCookies:forURL:mainDocumentURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instm/NSHTTPCookieStorage/setCookies:forURL:mainDocumentURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCookies:forURL:mainDocumentURL:")
    public native void setCookiesForURLMainDocumentURL(NSArray<? extends NSHTTPCookie> cookies, NSURL URL,
            NSURL mainDocumentURL);

    /**
     * sharedHTTPCookieStorage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/clm/NSHTTPCookieStorage/sharedHTTPCookieStorage">iOS Dev Center</a>
     */
    @Generated
    @Selector("sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage sharedHTTPCookieStorage();

    /**
     * sortedCookiesUsingDescriptors:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSHTTPCookieStorage_Class/index.html#//apple_ref/occ/instm/NSHTTPCookieStorage/sortedCookiesUsingDescriptors:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortedCookiesUsingDescriptors:")
    public native NSArray<? extends NSHTTPCookie> sortedCookiesUsingDescriptors(
            NSArray<? extends NSSortDescriptor> sortOrder);

    @Generated
    @Selector("storeCookies:forTask:")
    public native void storeCookiesForTask(NSArray<? extends NSHTTPCookie> cookies, NSURLSessionTask task);

    @Generated
    @Selector("sharedCookieStorageForGroupContainerIdentifier:")
    public static native NSHTTPCookieStorage sharedCookieStorageForGroupContainerIdentifier(String identifier);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
