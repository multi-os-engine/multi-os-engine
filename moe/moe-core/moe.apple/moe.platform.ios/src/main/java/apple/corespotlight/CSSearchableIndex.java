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
import apple.corespotlight.protocol.CSSearchableIndexDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
public class CSSearchableIndex extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CSSearchableIndex(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSSearchableIndex alloc();

    /**
     * defaultSearchableIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/clm/CSSearchableIndex/defaultSearchableIndex">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultSearchableIndex")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultSearchableIndex();

    /**
     * isIndexingAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/clm/CSSearchableIndex/isIndexingAvailable">iOS Dev Center</a>
     */
    @Generated
    @Selector("isIndexingAvailable")
    public static native boolean isIndexingAvailable();

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
     * beginIndexBatch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/beginIndexBatch">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginIndexBatch")
    public native void beginIndexBatch();

    /**
     * deleteAllSearchableItemsWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/deleteAllSearchableItemsWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteAllSearchableItemsWithCompletionHandler:")
    public native void deleteAllSearchableItemsWithCompletionHandler(
            @ObjCBlock(name = "call_deleteAllSearchableItemsWithCompletionHandler") Block_deleteAllSearchableItemsWithCompletionHandler completionHandler);

    /**
     * deleteSearchableItemsWithDomainIdentifiers:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/deleteSearchableItemsWithDomainIdentifiers:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteSearchableItemsWithDomainIdentifiers:completionHandler:")
    public native void deleteSearchableItemsWithDomainIdentifiersCompletionHandler(NSArray<String> domainIdentifiers,
            @ObjCBlock(name = "call_deleteSearchableItemsWithDomainIdentifiersCompletionHandler") Block_deleteSearchableItemsWithDomainIdentifiersCompletionHandler completionHandler);

    /**
     * deleteSearchableItemsWithIdentifiers:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/deleteSearchableItemsWithIdentifiers:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteSearchableItemsWithIdentifiers:completionHandler:")
    public native void deleteSearchableItemsWithIdentifiersCompletionHandler(NSArray<String> identifiers,
            @ObjCBlock(name = "call_deleteSearchableItemsWithIdentifiersCompletionHandler") Block_deleteSearchableItemsWithIdentifiersCompletionHandler completionHandler);

    /**
     * endIndexBatchWithClientState:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/endIndexBatchWithClientState:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("endIndexBatchWithClientState:completionHandler:")
    public native void endIndexBatchWithClientStateCompletionHandler(NSData clientState,
            @ObjCBlock(name = "call_endIndexBatchWithClientStateCompletionHandler") Block_endIndexBatchWithClientStateCompletionHandler completionHandler);

    /**
     * fetchLastClientStateWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/fetchLastClientStateWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchLastClientStateWithCompletionHandler:")
    public native void fetchLastClientStateWithCompletionHandler(
            @ObjCBlock(name = "call_fetchLastClientStateWithCompletionHandler") Block_fetchLastClientStateWithCompletionHandler completionHandler);

    /**
     * indexDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instp/CSSearchableIndex/indexDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CSSearchableIndexDelegate indexDelegate();

    /**
     * indexSearchableItems:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/indexSearchableItems:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexSearchableItems:completionHandler:")
    public native void indexSearchableItemsCompletionHandler(NSArray<? extends CSSearchableItem> items,
            @ObjCBlock(name = "call_indexSearchableItemsCompletionHandler") Block_indexSearchableItemsCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native CSSearchableIndex init();

    /**
     * initWithName:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/initWithName:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithName:")
    public native CSSearchableIndex initWithName(String name);

    /**
     * initWithName:protectionClass:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instm/CSSearchableIndex/initWithName:protectionClass:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithName:protectionClass:")
    public native CSSearchableIndex initWithNameProtectionClass(String name, String protectionClass);

    /**
     * indexDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instp/CSSearchableIndex/indexDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIndexDelegate:")
    public native void setIndexDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CSSearchableIndexDelegate value);

    /**
     * indexDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreSpotlight/Reference/CSSearchableIndex_Class/index.html#//apple_ref/occ/instp/CSSearchableIndex/indexDelegate">iOS Dev Center</a>
     */
    @Generated
    public void setIndexDelegate(@Mapped(ObjCObjectMapper.class) CSSearchableIndexDelegate value) {
        Object __old = indexDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setIndexDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteAllSearchableItemsWithCompletionHandler {
        @Generated
        void call_deleteAllSearchableItemsWithCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSearchableItemsWithDomainIdentifiersCompletionHandler {
        @Generated
        void call_deleteSearchableItemsWithDomainIdentifiersCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSearchableItemsWithIdentifiersCompletionHandler {
        @Generated
        void call_deleteSearchableItemsWithIdentifiersCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endIndexBatchWithClientStateCompletionHandler {
        @Generated
        void call_endIndexBatchWithClientStateCompletionHandler(NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchLastClientStateWithCompletionHandler {
        @Generated
        void call_fetchLastClientStateWithCompletionHandler(NSData arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexSearchableItemsCompletionHandler {
        @Generated
        void call_indexSearchableItemsCompletionHandler(NSError arg0);
    }
}
