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

package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A WKWebsiteDataStore represents various types of data that a website might
 * make use of. This includes cookies, disk and memory caches, and persistent data such as WebSQL,
 * IndexedDB databases, and local storage.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebsiteDataStore extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebsiteDataStore(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Returns a set of all available website data types.
     */
    @Generated
    @Selector("allWebsiteDataTypes")
    public static native NSSet<String> allWebsiteDataTypes();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebsiteDataStore alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native WKWebsiteDataStore allocWithZone(VoidPtr zone);

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

    /**
     * Returns the default data store.
     */
    @Generated
    @Selector("defaultDataStore")
    public static native WKWebsiteDataStore defaultDataStore();

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
    public static native WKWebsiteDataStore new_objc();

    /**
     * Returns a new non-persistent data store.
     * <p>
     * If a WKWebView is associated with a non-persistent data store, no data will
     * be written to the file system. This is useful for implementing "private browsing" in a web view.
     */
    @Generated
    @Selector("nonPersistentDataStore")
    public static native WKWebsiteDataStore nonPersistentDataStore();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Fetches data records containing the given website data types.
     *
     * @param dataTypes         The website data types to fetch records for.
     * @param completionHandler A block to invoke when the data records have been fetched.
     */
    @Generated
    @Selector("fetchDataRecordsOfTypes:completionHandler:")
    public native void fetchDataRecordsOfTypesCompletionHandler(NSSet<String> dataTypes,
            @ObjCBlock(name = "call_fetchDataRecordsOfTypesCompletionHandler") Block_fetchDataRecordsOfTypesCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native WKWebsiteDataStore init();

    @Generated
    @Selector("initWithCoder:")
    public native WKWebsiteDataStore initWithCoder(NSCoder coder);

    /**
     * Whether the data store is persistent or not.
     */
    @Generated
    @Selector("isPersistent")
    public native boolean isPersistent();

    /**
     * Removes website data of the given types for the given data records.
     *
     * @param dataTypes         The website data types that should be removed.
     * @param dataRecords       The website data records to delete website data for.
     * @param completionHandler A block to invoke when the website data for the records has been removed.
     */
    @Generated
    @Selector("removeDataOfTypes:forDataRecords:completionHandler:")
    public native void removeDataOfTypesForDataRecordsCompletionHandler(NSSet<String> dataTypes,
            NSArray<? extends WKWebsiteDataRecord> dataRecords,
            @ObjCBlock(name = "call_removeDataOfTypesForDataRecordsCompletionHandler") Block_removeDataOfTypesForDataRecordsCompletionHandler completionHandler);

    /**
     * Removes all website data of the given types that has been modified since the given date.
     *
     * @param dataTypes         The website data types that should be removed.
     * @param date              A date. All website data modified after this date will be removed.
     * @param completionHandler A block to invoke when the website data has been removed.
     */
    @Generated
    @Selector("removeDataOfTypes:modifiedSince:completionHandler:")
    public native void removeDataOfTypesModifiedSinceCompletionHandler(NSSet<String> dataTypes, NSDate date,
            @ObjCBlock(name = "call_removeDataOfTypesModifiedSinceCompletionHandler") Block_removeDataOfTypesModifiedSinceCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchDataRecordsOfTypesCompletionHandler {
        @Generated
        void call_fetchDataRecordsOfTypesCompletionHandler(NSArray<? extends WKWebsiteDataRecord> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeDataOfTypesForDataRecordsCompletionHandler {
        @Generated
        void call_removeDataOfTypesForDataRecordsCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeDataOfTypesModifiedSinceCompletionHandler {
        @Generated
        void call_removeDataOfTypesModifiedSinceCompletionHandler();
    }

    /**
     * Returns the cookie store representing HTTP cookies in this website data store.
     */
    @Generated
    @Selector("httpCookieStore")
    public native WKHTTPCookieStore httpCookieStore();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
