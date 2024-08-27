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

package apple.cloudkit;

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
 * This class should not be subclassed. If it is, Sendable may no longer apply.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKDatabase extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKDatabase(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKDatabase alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKDatabase allocWithZone(VoidPtr zone);

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
    public static native CKDatabase new_objc();

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
    @Selector("addOperation:")
    public native void addOperation(@NotNull CKDatabaseOperation operation);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("databaseScope")
    @NInt
    public native long databaseScope();

    @Generated
    @Selector("deleteRecordWithID:completionHandler:")
    public native void deleteRecordWithIDCompletionHandler(@NotNull CKRecordID recordID,
            @NotNull @ObjCBlock(name = "call_deleteRecordWithIDCompletionHandler") Block_deleteRecordWithIDCompletionHandler completionHandler);

    @Generated
    @Selector("deleteRecordZoneWithID:completionHandler:")
    public native void deleteRecordZoneWithIDCompletionHandler(@NotNull CKRecordZoneID zoneID,
            @NotNull @ObjCBlock(name = "call_deleteRecordZoneWithIDCompletionHandler") Block_deleteRecordZoneWithIDCompletionHandler completionHandler);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("deleteSubscriptionWithID:completionHandler:")
    public native void deleteSubscriptionWithIDCompletionHandler(@NotNull String subscriptionID,
            @NotNull @ObjCBlock(name = "call_deleteSubscriptionWithIDCompletionHandler") Block_deleteSubscriptionWithIDCompletionHandler completionHandler);

    /**
     * [@c] CKFetchRecordZonesOperation and @c CKModifyRecordZonesOperation are the more configurable, @c CKOperation
     * -based alternatives to these methods
     */
    @Generated
    @Selector("fetchAllRecordZonesWithCompletionHandler:")
    public native void fetchAllRecordZonesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_fetchAllRecordZonesWithCompletionHandler") Block_fetchAllRecordZonesWithCompletionHandler completionHandler);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("fetchAllSubscriptionsWithCompletionHandler:")
    public native void fetchAllSubscriptionsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_fetchAllSubscriptionsWithCompletionHandler") Block_fetchAllSubscriptionsWithCompletionHandler completionHandler);

    /**
     * [@c] CKFetchRecordsOperation and @c CKModifyRecordsOperation are the more configurable, @c CKOperation -based
     * alternatives to these methods
     */
    @Generated
    @Selector("fetchRecordWithID:completionHandler:")
    public native void fetchRecordWithIDCompletionHandler(@NotNull CKRecordID recordID,
            @NotNull @ObjCBlock(name = "call_fetchRecordWithIDCompletionHandler") Block_fetchRecordWithIDCompletionHandler completionHandler);

    @Generated
    @Selector("fetchRecordZoneWithID:completionHandler:")
    public native void fetchRecordZoneWithIDCompletionHandler(@NotNull CKRecordZoneID zoneID,
            @NotNull @ObjCBlock(name = "call_fetchRecordZoneWithIDCompletionHandler") Block_fetchRecordZoneWithIDCompletionHandler completionHandler);

    /**
     * [@c] CKFetchSubscriptionsOperation and @c CKModifySubscriptionsOperation are the more configurable, @c
     * CKOperation -based alternative to these methods
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("fetchSubscriptionWithID:completionHandler:")
    public native void fetchSubscriptionWithIDCompletionHandler(@NotNull String subscriptionID,
            @NotNull @ObjCBlock(name = "call_fetchSubscriptionWithIDCompletionHandler") Block_fetchSubscriptionWithIDCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native CKDatabase init();

    /**
     * [@c] CKQueryOperation is the more configurable, @c CKOperation -based alternative to this method
     * Queries can potentially return a large number of records, and the server will return those records in batches.
     * This convenience API will only fetch the first batch of results (equivalent to using @c
     * CKQueryOperationMaximumResults).
     * If you would like to fetch all results, use @c CKQueryOperation and its @c CKQueryCursor instead.
     * Queries invoked within a @c sharedCloudDatabase must specify a @c zoneID. Cross-zone queries are not supported in
     * a @c sharedCloudDatabase
     * Queries that do not specify a @c zoneID will perform a query across all zones in the database.
     */
    @Generated
    @Selector("performQuery:inZoneWithID:completionHandler:")
    public native void performQueryInZoneWithIDCompletionHandler(@NotNull CKQuery query,
            @Nullable CKRecordZoneID zoneID,
            @NotNull @ObjCBlock(name = "call_performQueryInZoneWithIDCompletionHandler") Block_performQueryInZoneWithIDCompletionHandler completionHandler);

    @Generated
    @Selector("saveRecord:completionHandler:")
    public native void saveRecordCompletionHandler(@NotNull CKRecord record,
            @NotNull @ObjCBlock(name = "call_saveRecordCompletionHandler") Block_saveRecordCompletionHandler completionHandler);

    @Generated
    @Selector("saveRecordZone:completionHandler:")
    public native void saveRecordZoneCompletionHandler(@NotNull CKRecordZone zone,
            @NotNull @ObjCBlock(name = "call_saveRecordZoneCompletionHandler") Block_saveRecordZoneCompletionHandler completionHandler);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("saveSubscription:completionHandler:")
    public native void saveSubscriptionCompletionHandler(@NotNull CKSubscription subscription,
            @NotNull @ObjCBlock(name = "call_saveSubscriptionCompletionHandler") Block_saveSubscriptionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteRecordWithIDCompletionHandler {
        @Generated
        void call_deleteRecordWithIDCompletionHandler(@Nullable CKRecordID recordID, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteRecordZoneWithIDCompletionHandler {
        @Generated
        void call_deleteRecordZoneWithIDCompletionHandler(@Nullable CKRecordZoneID zoneID, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSubscriptionWithIDCompletionHandler {
        @Generated
        void call_deleteSubscriptionWithIDCompletionHandler(@Nullable String subscriptionID, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllRecordZonesWithCompletionHandler {
        @Generated
        void call_fetchAllRecordZonesWithCompletionHandler(@Nullable NSArray<? extends CKRecordZone> zones,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllSubscriptionsWithCompletionHandler {
        @Generated
        void call_fetchAllSubscriptionsWithCompletionHandler(@Nullable NSArray<? extends CKSubscription> subscriptions,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordWithIDCompletionHandler {
        @Generated
        void call_fetchRecordWithIDCompletionHandler(@Nullable CKRecord record, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordZoneWithIDCompletionHandler {
        @Generated
        void call_fetchRecordZoneWithIDCompletionHandler(@Nullable CKRecordZone zone, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchSubscriptionWithIDCompletionHandler {
        @Generated
        void call_fetchSubscriptionWithIDCompletionHandler(@Nullable CKSubscription subscription,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performQueryInZoneWithIDCompletionHandler {
        @Generated
        void call_performQueryInZoneWithIDCompletionHandler(@Nullable NSArray<? extends CKRecord> results,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveRecordCompletionHandler {
        @Generated
        void call_saveRecordCompletionHandler(@Nullable CKRecord record, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveRecordZoneCompletionHandler {
        @Generated
        void call_saveRecordZoneCompletionHandler(@Nullable CKRecordZone zone, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveSubscriptionCompletionHandler {
        @Generated
        void call_saveSubscriptionCompletionHandler(@Nullable CKSubscription subscription, @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
