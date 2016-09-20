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
    @Owned
    @Selector("alloc")
    public static native NSURLComponents alloc();

    /**
     * componentsWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/clm/NSURLComponents/componentsWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsWithString:")
    public static native NSURLComponents componentsWithString(String URLString);

    /**
     * componentsWithURL:resolvingAgainstBaseURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/clm/NSURLComponents/componentsWithURL:resolvingAgainstBaseURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("componentsWithURL:resolvingAgainstBaseURL:")
    public static native NSURLComponents componentsWithURLResolvingAgainstBaseURL(NSURL url, boolean resolve);

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * URL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/URL">iOS Dev Center</a>
     */
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * URLRelativeToURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instm/NSURLComponents/URLRelativeToURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("URLRelativeToURL:")
    public native NSURL URLRelativeToURL(NSURL baseURL);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * fragment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/fragment">iOS Dev Center</a>
     */
    @Generated
    @Selector("fragment")
    public native String fragment();

    /**
     * host</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/host">iOS Dev Center</a>
     */
    @Generated
    @Selector("host")
    public native String host();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instm/NSURLComponents/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native NSURLComponents init();

    /**
     * initWithString:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instm/NSURLComponents/initWithString:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithString:")
    public native NSURLComponents initWithString(String URLString);

    /**
     * initWithURL:resolvingAgainstBaseURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instm/NSURLComponents/initWithURL:resolvingAgainstBaseURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:resolvingAgainstBaseURL:")
    public native NSURLComponents initWithURLResolvingAgainstBaseURL(NSURL url, boolean resolve);

    /**
     * password</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/password">iOS Dev Center</a>
     */
    @Generated
    @Selector("password")
    public native String password();

    /**
     * path</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/path">iOS Dev Center</a>
     */
    @Generated
    @Selector("path")
    public native String path();

    /**
     * percentEncodedFragment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedFragment">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentEncodedFragment")
    public native String percentEncodedFragment();

    /**
     * percentEncodedHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedHost">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentEncodedHost")
    public native String percentEncodedHost();

    /**
     * percentEncodedPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedPassword">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentEncodedPassword")
    public native String percentEncodedPassword();

    /**
     * percentEncodedPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentEncodedPath")
    public native String percentEncodedPath();

    /**
     * percentEncodedQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentEncodedQuery")
    public native String percentEncodedQuery();

    /**
     * percentEncodedUser</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedUser">iOS Dev Center</a>
     */
    @Generated
    @Selector("percentEncodedUser")
    public native String percentEncodedUser();

    /**
     * port</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/port">iOS Dev Center</a>
     */
    @Generated
    @Selector("port")
    public native NSNumber port();

    /**
     * query</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/query">iOS Dev Center</a>
     */
    @Generated
    @Selector("query")
    public native String query();

    /**
     * queryItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/queryItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("queryItems")
    public native NSArray<? extends NSURLQueryItem> queryItems();

    /**
     * scheme</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/scheme">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheme")
    public native String scheme();

    /**
     * fragment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/fragment">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFragment:")
    public native void setFragment(String value);

    /**
     * host</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/host">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHost:")
    public native void setHost(String value);

    /**
     * password</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/password">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPassword:")
    public native void setPassword(String value);

    /**
     * path</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/path">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(String value);

    /**
     * percentEncodedFragment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedFragment">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentEncodedFragment:")
    public native void setPercentEncodedFragment(String value);

    /**
     * percentEncodedHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedHost">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentEncodedHost:")
    public native void setPercentEncodedHost(String value);

    /**
     * percentEncodedPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedPassword">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentEncodedPassword:")
    public native void setPercentEncodedPassword(String value);

    /**
     * percentEncodedPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedPath">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentEncodedPath:")
    public native void setPercentEncodedPath(String value);

    /**
     * percentEncodedQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentEncodedQuery:")
    public native void setPercentEncodedQuery(String value);

    /**
     * percentEncodedUser</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/percentEncodedUser">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPercentEncodedUser:")
    public native void setPercentEncodedUser(String value);

    /**
     * port</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/port">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPort:")
    public native void setPort(NSNumber value);

    /**
     * query</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/query">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQuery:")
    public native void setQuery(String value);

    /**
     * queryItems</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/queryItems">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQueryItems:")
    public native void setQueryItems(NSArray<? extends NSURLQueryItem> value);

    /**
     * scheme</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/scheme">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScheme:")
    public native void setScheme(String value);

    /**
     * user</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/user">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUser:")
    public native void setUser(String value);

    /**
     * string</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/string">iOS Dev Center</a>
     */
    @Generated
    @Selector("string")
    public native String string();

    /**
     * user</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLComponents_class/index.html#//apple_ref/occ/instp/NSURLComponents/user">iOS Dev Center</a>
     */
    @Generated
    @Selector("user")
    public native String user();

    @Generated
    @Selector("rangeOfFragment")
    @ByValue
    public native NSRange rangeOfFragment();

    @Generated
    @Selector("rangeOfHost")
    @ByValue
    public native NSRange rangeOfHost();

    @Generated
    @Selector("rangeOfPassword")
    @ByValue
    public native NSRange rangeOfPassword();

    @Generated
    @Selector("rangeOfPath")
    @ByValue
    public native NSRange rangeOfPath();

    @Generated
    @Selector("rangeOfPort")
    @ByValue
    public native NSRange rangeOfPort();

    @Generated
    @Selector("rangeOfQuery")
    @ByValue
    public native NSRange rangeOfQuery();

    @Generated
    @Selector("rangeOfScheme")
    @ByValue
    public native NSRange rangeOfScheme();

    @Generated
    @Selector("rangeOfUser")
    @ByValue
    public native NSRange rangeOfUser();
}
