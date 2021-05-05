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

package apple.corespotlight;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("CoreSpotlight")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CSSearchQuery extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CSSearchQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSSearchQuery alloc();

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
    @Selector("cancel")
    public native void cancel();

    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    /**
     * The query will update the count before each foundItemsHandler invocation to reflect
     * the number of items found so far; if foundItemsHandler is nil then the count will
     * contain the total number of found items when the query completes.
     */
    @Generated
    @Selector("foundItemCount")
    @NUInt
    public native long foundItemCount();

    /**
     * The foundItemsHandler will be invoked repeatedly with a new batch of searchable items.
     * The query serializes all the foundItemsHandler invocations.
     */
    @Generated
    @Selector("foundItemsHandler")
    @ObjCBlock(name = "call_foundItemsHandler_ret")
    public native Block_foundItemsHandler_ret foundItemsHandler();

    @Generated
    @Selector("init")
    public native CSSearchQuery init();

    /**
     * queryString: The query string (e.g., 'contentType == "public.email-message" && subject != "Re:*"')
     * attributes: The attributes to be fetched for the searchable items
     */
    @Generated
    @Selector("initWithQueryString:attributes:")
    public native CSSearchQuery initWithQueryStringAttributes(String queryString, NSArray<String> attributes);

    @Generated
    @Selector("isCancelled")
    public native boolean isCancelled();

    /**
     * An array of NSFileProtectionComplete, NSFileProtectionCompleteUnlessOpen,
     * or NSFileProtectionCompleteUntilFirstUserAuthentication.
     * By default the data protection will be read from the "com.apple.developer.default-data-protection"
     * entitlement if any or NSFileProtectionCompleteUntilFirstUserAuthentication will be used otherwise.
     */
    @Generated
    @Selector("protectionClasses")
    public native NSArray<String> protectionClasses();

    @Generated
    @Selector("setCompletionHandler:")
    public native void setCompletionHandler(
            @ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    /**
     * The foundItemsHandler will be invoked repeatedly with a new batch of searchable items.
     * The query serializes all the foundItemsHandler invocations.
     */
    @Generated
    @Selector("setFoundItemsHandler:")
    public native void setFoundItemsHandler(
            @ObjCBlock(name = "call_setFoundItemsHandler") Block_setFoundItemsHandler value);

    /**
     * An array of NSFileProtectionComplete, NSFileProtectionCompleteUnlessOpen,
     * or NSFileProtectionCompleteUntilFirstUserAuthentication.
     * By default the data protection will be read from the "com.apple.developer.default-data-protection"
     * entitlement if any or NSFileProtectionCompleteUntilFirstUserAuthentication will be used otherwise.
     */
    @Generated
    @Selector("setProtectionClasses:")
    public native void setProtectionClasses(NSArray<String> value);

    @Generated
    @Selector("start")
    public native void start();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_foundItemsHandler_ret {
        @Generated
        void call_foundItemsHandler_ret(NSArray<? extends CSSearchableItem> arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFoundItemsHandler {
        @Generated
        void call_setFoundItemsHandler(NSArray<? extends CSSearchableItem> arg0);
    }
}
