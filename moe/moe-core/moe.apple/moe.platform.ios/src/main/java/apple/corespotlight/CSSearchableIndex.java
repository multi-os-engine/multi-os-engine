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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CSSearchableIndex alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CSSearchableIndex allocWithZone(VoidPtr zone);

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
    @Selector("defaultSearchableIndex")
    public static native CSSearchableIndex defaultSearchableIndex();

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

    /**
     * Not all devices support indexing.  Call this method to check if indexing is supported on the current device.
     */
    @Generated
    @Selector("isIndexingAvailable")
    public static native boolean isIndexingAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CSSearchableIndex new_objc();

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
     * Begin a batch of index adds, updates, or deletes.
     */
    @Generated
    @Selector("beginIndexBatch")
    public native void beginIndexBatch();

    /**
     * Call this method to delete all searchable items from the index.
     */
    @Generated
    @Selector("deleteAllSearchableItemsWithCompletionHandler:")
    public native void deleteAllSearchableItemsWithCompletionHandler(
            @ObjCBlock(name = "call_deleteAllSearchableItemsWithCompletionHandler") Block_deleteAllSearchableItemsWithCompletionHandler completionHandler);

    /**
     * Call this method on the index to remove any items from the index with the given domain identifiers.
     * The delete is recursive so if domain identifiers are of the form <account-id>.<mailbox-id>, for example,
     * calling delete with <account-id> will delete all the searchable items with that account and any mailbox.
     */
    @Generated
    @Selector("deleteSearchableItemsWithDomainIdentifiers:completionHandler:")
    public native void deleteSearchableItemsWithDomainIdentifiersCompletionHandler(NSArray<String> domainIdentifiers,
            @ObjCBlock(name = "call_deleteSearchableItemsWithDomainIdentifiersCompletionHandler") Block_deleteSearchableItemsWithDomainIdentifiersCompletionHandler completionHandler);

    /**
     * Call this method to remove items with the given identifiers from the index.
     * Completion handlers will be called once the data has been journaled by the index.  If the completion handler returns an error, the client should retry, as it was not journaled correctly.
     * reindexSearchableItemsWithIdentifiers will be called if the journaling completed successfully but the data was not able to be indexed for some reason.
     */
    @Generated
    @Selector("deleteSearchableItemsWithIdentifiers:completionHandler:")
    public native void deleteSearchableItemsWithIdentifiersCompletionHandler(NSArray<String> identifiers,
            @ObjCBlock(name = "call_deleteSearchableItemsWithIdentifiersCompletionHandler") Block_deleteSearchableItemsWithIdentifiersCompletionHandler completionHandler);

    /**
     * End a batch passing in client state information to be persisted in the index.  The completion handler will be called once the client state has been persisted.
     */
    @Generated
    @Selector("endIndexBatchWithClientState:completionHandler:")
    public native void endIndexBatchWithClientStateCompletionHandler(NSData clientState,
            @ObjCBlock(name = "call_endIndexBatchWithClientStateCompletionHandler") Block_endIndexBatchWithClientStateCompletionHandler completionHandler);

    /**
     * Async fetches the app's last stored client state information.
     */
    @Generated
    @Selector("fetchLastClientStateWithCompletionHandler:")
    public native void fetchLastClientStateWithCompletionHandler(
            @ObjCBlock(name = "call_fetchLastClientStateWithCompletionHandler") Block_fetchLastClientStateWithCompletionHandler completionHandler);

    @Generated
    @Selector("indexDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CSSearchableIndexDelegate indexDelegate();

    /**
     * Call this method to add or update items in the index.
     * Completion handlers will be called once the data has been journaled by the index.  If the completion handler returns an error, the client should retry, as it was not journaled correctly.
     * reindexSearchableItemsWithIdentifiers will be called if the journaling completed successfully but the data was not able to be indexed for some reason.
     */
    @Generated
    @Selector("indexSearchableItems:completionHandler:")
    public native void indexSearchableItemsCompletionHandler(NSArray<? extends CSSearchableItem> items,
            @ObjCBlock(name = "call_indexSearchableItemsCompletionHandler") Block_indexSearchableItemsCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native CSSearchableIndex init();

    /**
     * Apps can set a name for the index instance. This name is used as a handle for the client state used with the batch API, allowing a single client to have multiple client states; you have to retrieve the client state for an index instance with the same name as you used when setting the client state.
     */
    @Generated
    @Selector("initWithName:")
    public native CSSearchableIndex initWithName(String name);

    /**
     * Apps can set a default protection class for items in their entitlements.  You can alternately create an instance with a custom protection class to use on iOS.  It should be one of NSFileProtectionComplete, NSFileProtectionCompleteUnlessOpen, or NSFileProtectionCompleteUntilFirstUserAuthentication.
     */
    @Generated
    @Selector("initWithName:protectionClass:")
    public native CSSearchableIndex initWithNameProtectionClass(String name, String protectionClass);

    @Generated
    @Selector("setIndexDelegate:")
    public native void setIndexDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CSSearchableIndexDelegate value);

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
        void call_deleteAllSearchableItemsWithCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSearchableItemsWithDomainIdentifiersCompletionHandler {
        @Generated
        void call_deleteSearchableItemsWithDomainIdentifiersCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSearchableItemsWithIdentifiersCompletionHandler {
        @Generated
        void call_deleteSearchableItemsWithIdentifiersCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_endIndexBatchWithClientStateCompletionHandler {
        @Generated
        void call_endIndexBatchWithClientStateCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchLastClientStateWithCompletionHandler {
        @Generated
        void call_fetchLastClientStateWithCompletionHandler(NSData clientState, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_indexSearchableItemsCompletionHandler {
        @Generated
        void call_indexSearchableItemsCompletionHandler(NSError error);
    }
}
