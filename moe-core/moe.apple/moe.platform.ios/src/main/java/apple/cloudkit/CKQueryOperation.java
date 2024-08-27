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
 * API-Since: 8.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKQueryOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKQueryOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKQueryOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKQueryOperation allocWithZone(VoidPtr zone);

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
    public static native CKQueryOperation new_objc();

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

    @Nullable
    @Generated
    @Selector("cursor")
    public native CKQueryCursor cursor();

    /**
     * Declares which user-defined keys should be fetched and added to the resulting CKRecords.
     * 
     * If nil, declares the entire record should be downloaded. If set to an empty array, declares that no user fields
     * should be downloaded.
     * Defaults to @c nil.
     */
    @Nullable
    @Generated
    @Selector("desiredKeys")
    public native NSArray<String> desiredKeys();

    /**
     * Queries invoked within a sharedCloudDatabase must specify a zoneID. Cross-zone queries are not supported in a
     * sharedCloudDatabase
     */
    @Generated
    @Selector("init")
    public native CKQueryOperation init();

    @Generated
    @Selector("initWithCursor:")
    public native CKQueryOperation initWithCursor(@NotNull CKQueryCursor cursor);

    @Generated
    @Selector("initWithQuery:")
    public native CKQueryOperation initWithQuery(@NotNull CKQuery query);

    @Nullable
    @Generated
    @Selector("query")
    public native CKQuery query();

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs to
     * errors keyed off of @c CKPartialErrorsByItemIDKey. These errors are repeats of those sent back in previous @c
     * recordMatchedBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Nullable
    @Generated
    @Selector("queryCompletionBlock")
    @ObjCBlock(name = "call_queryCompletionBlock_ret")
    public native Block_queryCompletionBlock_ret queryCompletionBlock();

    /**
     * This block will be called once for every record that is returned as a result of the query.
     * 
     * The callbacks will happen in the order that the results were sorted in.
     * If the replacement callback @c recordMatchedBlock is set, this callback block is ignored.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use recordMatchedBlock instead, which surfaces per-record errors
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("recordFetchedBlock")
    @ObjCBlock(name = "call_recordFetchedBlock_ret")
    public native Block_recordFetchedBlock_ret recordFetchedBlock();

    /**
     * Defaults to @c CKQueryOperationMaximumResults.
     * Queries may return fewer than @c resultsLimit in some scenarios:
     * - There are legitimately fewer than @c resultsLimit number of records matching the query (and visible to the
     * current user).
     * - During the process of querying and fetching the results, some records were deleted, or became un-readable by
     * the current user.
     * When determining if there are more records to fetch, always check for the presence of a cursor in @c
     * queryCompletionBlock.
     */
    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    @Generated
    @Selector("setCursor:")
    public native void setCursor(@Nullable CKQueryCursor value);

    /**
     * Declares which user-defined keys should be fetched and added to the resulting CKRecords.
     * 
     * If nil, declares the entire record should be downloaded. If set to an empty array, declares that no user fields
     * should be downloaded.
     * Defaults to @c nil.
     */
    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(@Nullable NSArray<String> value);

    @Generated
    @Selector("setQuery:")
    public native void setQuery(@Nullable CKQuery value);

    /**
     * This block is called when the operation completes.
     * 
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs to
     * errors keyed off of @c CKPartialErrorsByItemIDKey. These errors are repeats of those sent back in previous @c
     * recordMatchedBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     */
    @Generated
    @Selector("setQueryCompletionBlock:")
    public native void setQueryCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setQueryCompletionBlock") Block_setQueryCompletionBlock value);

    /**
     * This block will be called once for every record that is returned as a result of the query.
     * 
     * The callbacks will happen in the order that the results were sorted in.
     * If the replacement callback @c recordMatchedBlock is set, this callback block is ignored.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use recordMatchedBlock instead, which surfaces per-record errors
     */
    @Deprecated
    @Generated
    @Selector("setRecordFetchedBlock:")
    public native void setRecordFetchedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordFetchedBlock") Block_setRecordFetchedBlock value);

    /**
     * Defaults to @c CKQueryOperationMaximumResults.
     * Queries may return fewer than @c resultsLimit in some scenarios:
     * - There are legitimately fewer than @c resultsLimit number of records matching the query (and visible to the
     * current user).
     * - During the process of querying and fetching the results, some records were deleted, or became un-readable by
     * the current user.
     * When determining if there are more records to fetch, always check for the presence of a cursor in @c
     * queryCompletionBlock.
     */
    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    /**
     * Indicates which record zone to query.
     * 
     * For query operations constructed using a cursor, this property is ignored and instead will be evaluated in the
     * record zone in which the cursor was originally created.
     * Queries that do not specify a @c zoneID will perform a query across all zones in the database.
     */
    @Generated
    @Selector("setZoneID:")
    public native void setZoneID(@Nullable CKRecordZoneID value);

    /**
     * Indicates which record zone to query.
     * 
     * For query operations constructed using a cursor, this property is ignored and instead will be evaluated in the
     * record zone in which the cursor was originally created.
     * Queries that do not specify a @c zoneID will perform a query across all zones in the database.
     */
    @Nullable
    @Generated
    @Selector("zoneID")
    public native CKRecordZoneID zoneID();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryCompletionBlock_ret {
        @Generated
        void call_queryCompletionBlock_ret(@Nullable CKQueryCursor arg0, @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordFetchedBlock_ret {
        @Generated
        void call_recordFetchedBlock_ret(@NotNull CKRecord arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setQueryCompletionBlock {
        @Generated
        void call_setQueryCompletionBlock(@Nullable CKQueryCursor arg0, @Nullable NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordFetchedBlock {
        @Generated
        void call_setRecordFetchedBlock(@NotNull CKRecord arg0);
    }

    /**
     * This block will be called once for every record that is returned as a result of the query.
     * 
     * The callbacks will happen in the order that the results were sorted in. If a record fails in post-processing
     * (say, a network failure materializing a @c CKAsset record field), the per-record error will be passed here.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("recordMatchedBlock")
    @ObjCBlock(name = "call_recordMatchedBlock_ret")
    public native Block_recordMatchedBlock_ret recordMatchedBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordMatchedBlock_ret {
        @Generated
        void call_recordMatchedBlock_ret(@NotNull CKRecordID arg0, @Nullable CKRecord arg1, @Nullable NSError arg2);
    }

    /**
     * This block will be called once for every record that is returned as a result of the query.
     * 
     * The callbacks will happen in the order that the results were sorted in. If a record fails in post-processing
     * (say, a network failure materializing a @c CKAsset record field), the per-record error will be passed here.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * This block may share mutable state with other blocks assigned to this operation, but any such mutable state
     * should not be concurrently used outside of blocks assigned to this operation.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setRecordMatchedBlock:")
    public native void setRecordMatchedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordMatchedBlock") Block_setRecordMatchedBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordMatchedBlock {
        @Generated
        void call_setRecordMatchedBlock(@NotNull CKRecordID arg0, @Nullable CKRecord arg1, @Nullable NSError arg2);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
