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
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
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
 * This operation will fetch records changes across the given record zones
 * 
 * For each @c previousServerChangeToken passed in with a @c CKFetchRecordZoneChangesConfiguration, only records that
 * have changed since that anchor will be fetched.
 * If this is your first fetch of a zone or if you wish to re-fetch all records within a zone, do not include a @c
 * previousServerChangeToken.
 * Change tokens are opaque tokens and clients should not infer any behavior based on their content.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchRecordZoneChangesOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchRecordZoneChangesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchRecordZoneChangesOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchRecordZoneChangesOperation allocWithZone(VoidPtr zone);

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
    public static native CKFetchRecordZoneChangesOperation new_objc();

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
     * Determines if the operation should fetch all changes from the server before completing.
     * 
     * When set to YES, this operation will send repeated requests to the server until all record changes have been
     * fetched. @c recordZoneChangeTokensUpdatedBlock will be invoked periodically, to give clients an updated change
     * token so that already-fetched record changes don't need to be re-fetched on a subsequent operation. @c
     * recordZoneFetchCompletionBlock will only be called once and @c moreComing will always be NO.
     * 
     * When set to NO, it is the responsibility of the caller to issue subsequent fetch-changes operations when @c
     * moreComing is YES in a @c recordZoneFetchCompletionBlock invocation.
     * 
     * [@c] fetchAllChanges is YES by default
     */
    @Generated
    @Selector("fetchAllChanges")
    public native boolean fetchAllChanges();

    /**
     * This block is called when the operation completes.
     * 
     * [@c] serverChangeToken-s previously returned via a @c recordZoneChangeTokensUpdatedBlock or @c
     * recordZoneFetchCompletionBlock invocation, along with the record changes that preceded it, are valid even if
     * there is a subsequent @c operationError
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs and
     * zoneIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Nullable
    @Generated
    @Selector("fetchRecordZoneChangesCompletionBlock")
    @ObjCBlock(name = "call_fetchRecordZoneChangesCompletionBlock_ret")
    public native Block_fetchRecordZoneChangesCompletionBlock_ret fetchRecordZoneChangesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchRecordZoneChangesOperation init();

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("initWithRecordZoneIDs:optionsByRecordZoneID:")
    public native CKFetchRecordZoneChangesOperation initWithRecordZoneIDsOptionsByRecordZoneID(
            @NotNull NSArray<? extends CKRecordZoneID> recordZoneIDs,
            @Nullable NSDictionary<? extends CKRecordZoneID, ? extends CKFetchRecordZoneChangesOptions> optionsByRecordZoneID);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("optionsByRecordZoneID")
    public native NSDictionary<? extends CKRecordZoneID, ? extends CKFetchRecordZoneChangesOptions> optionsByRecordZoneID();

    /**
     * If the replacement callback @c recordWasChangedBlock is set, this callback block is ignored.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use recordWasChangedBlock instead, which surfaces per-record errors
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("recordChangedBlock")
    @ObjCBlock(name = "call_recordChangedBlock_ret")
    public native Block_recordChangedBlock_ret recordChangedBlock();

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Nullable
    @Generated
    @Selector("recordWithIDWasDeletedBlock")
    @ObjCBlock(name = "call_recordWithIDWasDeletedBlock_ret")
    public native Block_recordWithIDWasDeletedBlock_ret recordWithIDWasDeletedBlock();

    /**
     * Clients are responsible for saving this per-recordZone @c serverChangeToken and passing it in to the next call
     * to @c CKFetchRecordZoneChangesOperation.
     * Note that a fetch can fail partway. If that happens, an updated change token may be returned in this block so
     * that already fetched records don't need to be re-downloaded on a subsequent operation.
     * [@c] recordZoneChangeTokensUpdatedBlock will not be called after the last batch of changes in a zone; the @c
     * recordZoneFetchCompletionBlock block will be called instead.
     * The @c clientChangeTokenData from the most recent @c CKModifyRecordsOperation issued on this zone is also
     * returned, or nil if none was provided.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c serverChangeToken used for this record zone
     * when initting this operation was too old and the client should toss its local cache and re-fetch the changes in
     * this record zone starting with a nil @c serverChangeToken.
     * [@c] recordZoneChangeTokensUpdatedBlock will not be called if @c fetchAllChanges is NO.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Nullable
    @Generated
    @Selector("recordZoneChangeTokensUpdatedBlock")
    @ObjCBlock(name = "call_recordZoneChangeTokensUpdatedBlock_ret")
    public native Block_recordZoneChangeTokensUpdatedBlock_ret recordZoneChangeTokensUpdatedBlock();

    @Nullable
    @Generated
    @Selector("recordZoneFetchCompletionBlock")
    @ObjCBlock(name = "call_recordZoneFetchCompletionBlock_ret")
    public native Block_recordZoneFetchCompletionBlock_ret recordZoneFetchCompletionBlock();

    @Nullable
    @Generated
    @Selector("recordZoneIDs")
    public native NSArray<? extends CKRecordZoneID> recordZoneIDs();

    /**
     * Determines if the operation should fetch all changes from the server before completing.
     * 
     * When set to YES, this operation will send repeated requests to the server until all record changes have been
     * fetched. @c recordZoneChangeTokensUpdatedBlock will be invoked periodically, to give clients an updated change
     * token so that already-fetched record changes don't need to be re-fetched on a subsequent operation. @c
     * recordZoneFetchCompletionBlock will only be called once and @c moreComing will always be NO.
     * 
     * When set to NO, it is the responsibility of the caller to issue subsequent fetch-changes operations when @c
     * moreComing is YES in a @c recordZoneFetchCompletionBlock invocation.
     * 
     * [@c] fetchAllChanges is YES by default
     */
    @Generated
    @Selector("setFetchAllChanges:")
    public native void setFetchAllChanges(boolean value);

    /**
     * This block is called when the operation completes.
     * 
     * [@c] serverChangeToken-s previously returned via a @c recordZoneChangeTokensUpdatedBlock or @c
     * recordZoneFetchCompletionBlock invocation, along with the record changes that preceded it, are valid even if
     * there is a subsequent @c operationError
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs and
     * zoneIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setFetchRecordZoneChangesCompletionBlock:")
    public native void setFetchRecordZoneChangesCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setFetchRecordZoneChangesCompletionBlock") Block_setFetchRecordZoneChangesCompletionBlock value);

    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("setOptionsByRecordZoneID:")
    public native void setOptionsByRecordZoneID(
            @Nullable NSDictionary<? extends CKRecordZoneID, ? extends CKFetchRecordZoneChangesOptions> value);

    /**
     * If the replacement callback @c recordWasChangedBlock is set, this callback block is ignored.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Use recordWasChangedBlock instead, which surfaces per-record errors
     */
    @Deprecated
    @Generated
    @Selector("setRecordChangedBlock:")
    public native void setRecordChangedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordChangedBlock") Block_setRecordChangedBlock value);

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Generated
    @Selector("setRecordWithIDWasDeletedBlock:")
    public native void setRecordWithIDWasDeletedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordWithIDWasDeletedBlock") Block_setRecordWithIDWasDeletedBlock value);

    /**
     * Clients are responsible for saving this per-recordZone @c serverChangeToken and passing it in to the next call
     * to @c CKFetchRecordZoneChangesOperation.
     * Note that a fetch can fail partway. If that happens, an updated change token may be returned in this block so
     * that already fetched records don't need to be re-downloaded on a subsequent operation.
     * [@c] recordZoneChangeTokensUpdatedBlock will not be called after the last batch of changes in a zone; the @c
     * recordZoneFetchCompletionBlock block will be called instead.
     * The @c clientChangeTokenData from the most recent @c CKModifyRecordsOperation issued on this zone is also
     * returned, or nil if none was provided.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c serverChangeToken used for this record zone
     * when initting this operation was too old and the client should toss its local cache and re-fetch the changes in
     * this record zone starting with a nil @c serverChangeToken.
     * [@c] recordZoneChangeTokensUpdatedBlock will not be called if @c fetchAllChanges is NO.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setRecordZoneChangeTokensUpdatedBlock:")
    public native void setRecordZoneChangeTokensUpdatedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordZoneChangeTokensUpdatedBlock") Block_setRecordZoneChangeTokensUpdatedBlock value);

    @Generated
    @Selector("setRecordZoneFetchCompletionBlock:")
    public native void setRecordZoneFetchCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setRecordZoneFetchCompletionBlock") Block_setRecordZoneFetchCompletionBlock value);

    @Generated
    @Selector("setRecordZoneIDs:")
    public native void setRecordZoneIDs(@Nullable NSArray<? extends CKRecordZoneID> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordZoneChangesCompletionBlock_ret {
        @Generated
        void call_fetchRecordZoneChangesCompletionBlock_ret(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordChangedBlock_ret {
        @Generated
        void call_recordChangedBlock_ret(@NotNull CKRecord arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordWithIDWasDeletedBlock_ret {
        @Generated
        void call_recordWithIDWasDeletedBlock_ret(@NotNull CKRecordID arg0, @NotNull String arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneChangeTokensUpdatedBlock_ret {
        @Generated
        void call_recordZoneChangeTokensUpdatedBlock_ret(@NotNull CKRecordZoneID arg0,
                @Nullable CKServerChangeToken arg1, @Nullable NSData arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneFetchCompletionBlock_ret {
        @Generated
        void call_recordZoneFetchCompletionBlock_ret(@NotNull CKRecordZoneID arg0, @Nullable CKServerChangeToken arg1,
                @Nullable NSData arg2, boolean arg3, @Nullable NSError arg4);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchRecordZoneChangesCompletionBlock {
        @Generated
        void call_setFetchRecordZoneChangesCompletionBlock(@Nullable NSError arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordChangedBlock {
        @Generated
        void call_setRecordChangedBlock(@NotNull CKRecord arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordWithIDWasDeletedBlock {
        @Generated
        void call_setRecordWithIDWasDeletedBlock(@NotNull CKRecordID arg0, @NotNull String arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneChangeTokensUpdatedBlock {
        @Generated
        void call_setRecordZoneChangeTokensUpdatedBlock(@NotNull CKRecordZoneID arg0,
                @Nullable CKServerChangeToken arg1, @Nullable NSData arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneFetchCompletionBlock {
        @Generated
        void call_setRecordZoneFetchCompletionBlock(@NotNull CKRecordZoneID arg0, @Nullable CKServerChangeToken arg1,
                @Nullable NSData arg2, boolean arg3, @Nullable NSError arg4);
    }

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("configurationsByRecordZoneID")
    public native NSDictionary<? extends CKRecordZoneID, ? extends CKFetchRecordZoneChangesConfiguration> configurationsByRecordZoneID();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("initWithRecordZoneIDs:configurationsByRecordZoneID:")
    public native CKFetchRecordZoneChangesOperation initWithRecordZoneIDsConfigurationsByRecordZoneID(
            @NotNull NSArray<? extends CKRecordZoneID> recordZoneIDs,
            @Nullable NSDictionary<? extends CKRecordZoneID, ? extends CKFetchRecordZoneChangesConfiguration> configurationsByRecordZoneID);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setConfigurationsByRecordZoneID:")
    public native void setConfigurationsByRecordZoneID(
            @Nullable NSDictionary<? extends CKRecordZoneID, ? extends CKFetchRecordZoneChangesConfiguration> value);

    /**
     * If a record fails in post-processing (say, a network failure materializing a @c CKAsset record field), the
     * per-record error will be passed here.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("recordWasChangedBlock")
    @ObjCBlock(name = "call_recordWasChangedBlock_ret")
    public native Block_recordWasChangedBlock_ret recordWasChangedBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordWasChangedBlock_ret {
        @Generated
        void call_recordWasChangedBlock_ret(@NotNull CKRecordID arg0, @Nullable CKRecord arg1, @Nullable NSError arg2);
    }

    /**
     * If a record fails in post-processing (say, a network failure materializing a @c CKAsset record field), the
     * per-record error will be passed here.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setRecordWasChangedBlock:")
    public native void setRecordWasChangedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordWasChangedBlock") Block_setRecordWasChangedBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordWasChangedBlock {
        @Generated
        void call_setRecordWasChangedBlock(@NotNull CKRecordID arg0, @Nullable CKRecord arg1, @Nullable NSError arg2);
    }
}
