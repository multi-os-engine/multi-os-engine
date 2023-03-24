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
 * CKFetchDatabaseChangesOperation
 * 
 * This operation will fetch changes to record zones within a database
 * 
 * If a change anchor from a previous @c CKFetchDatabaseChangesOperation is passed in, only the zones that have changed
 * since that anchor will be returned.
 * This per-database @c serverChangeToken is not to be confused with the per-recordZone @c serverChangeToken from @c
 * CKFetchRecordZoneChangesOperation.
 * If this is your first fetch or if you wish to re-fetch all zones, pass nil for the change token.
 * Change token are opaque tokens and clients should not infer any behavior based on their content.
 * [@c] CKFetchDatabaseChangesOperation is supported in a @c privateCloudDatabase and @c sharedCloudDatabase
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchDatabaseChangesOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchDatabaseChangesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchDatabaseChangesOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchDatabaseChangesOperation allocWithZone(VoidPtr zone);

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
    public static native CKFetchDatabaseChangesOperation new_objc();

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
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Nullable
    @Generated
    @Selector("changeTokenUpdatedBlock")
    @ObjCBlock(name = "call_changeTokenUpdatedBlock_ret")
    public native Block_changeTokenUpdatedBlock_ret changeTokenUpdatedBlock();

    /**
     * When set to YES, this operation will send repeated requests to the server until all record zone changes have been
     * fetched.
     * 
     * [@c] changeTokenUpdatedBlock will be invoked periodically, to give clients an updated change token so that
     * already-fetched record zone changes don't need to be re-fetched on a subsequent operation.
     * When set to NO, it is the responsibility of the caller to issue subsequent fetch-changes operations when
     * moreComing is YES in a @c fetchDatabaseChangesCompletionBlock invocation.
     * [@c] fetchAllChanges is @c YES by default
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("fetchAllChanges")
    public native boolean fetchAllChanges();

    /**
     * This block is called when the operation completes.
     * 
     * Clients are responsible for saving the change token at the end of the operation and passing it in to the next
     * call to @c CKFetchDatabaseChangesOperation.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old
     * and the client should toss its local cache and re-fetch the changes in this record zone starting with a nil @c
     * previousServerChangeToken.
     * If @c moreComing is true then the server wasn't able to return all the changes in this response. Another @c
     * CKFetchDatabaseChangesOperation operation should be run with the @c previousServerChangeToken token from this
     * operation.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Nullable
    @Generated
    @Selector("fetchDatabaseChangesCompletionBlock")
    @ObjCBlock(name = "call_fetchDatabaseChangesCompletionBlock_ret")
    public native Block_fetchDatabaseChangesCompletionBlock_ret fetchDatabaseChangesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchDatabaseChangesOperation init();

    @Generated
    @Selector("initWithPreviousServerChangeToken:")
    public native CKFetchDatabaseChangesOperation initWithPreviousServerChangeToken(
            @Nullable CKServerChangeToken previousServerChangeToken);

    @Nullable
    @Generated
    @Selector("previousServerChangeToken")
    public native CKServerChangeToken previousServerChangeToken();

    @Nullable
    @Generated
    @Selector("recordZoneWithIDChangedBlock")
    @ObjCBlock(name = "call_recordZoneWithIDChangedBlock_ret")
    public native Block_recordZoneWithIDChangedBlock_ret recordZoneWithIDChangedBlock();

    @Nullable
    @Generated
    @Selector("recordZoneWithIDWasDeletedBlock")
    @ObjCBlock(name = "call_recordZoneWithIDWasDeletedBlock_ret")
    public native Block_recordZoneWithIDWasDeletedBlock_ret recordZoneWithIDWasDeletedBlock();

    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block
     * invocations.
     */
    @Generated
    @Selector("setChangeTokenUpdatedBlock:")
    public native void setChangeTokenUpdatedBlock(
            @Nullable @ObjCBlock(name = "call_setChangeTokenUpdatedBlock") Block_setChangeTokenUpdatedBlock value);

    /**
     * When set to YES, this operation will send repeated requests to the server until all record zone changes have been
     * fetched.
     * 
     * [@c] changeTokenUpdatedBlock will be invoked periodically, to give clients an updated change token so that
     * already-fetched record zone changes don't need to be re-fetched on a subsequent operation.
     * When set to NO, it is the responsibility of the caller to issue subsequent fetch-changes operations when
     * moreComing is YES in a @c fetchDatabaseChangesCompletionBlock invocation.
     * [@c] fetchAllChanges is @c YES by default
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("setFetchAllChanges:")
    public native void setFetchAllChanges(boolean value);

    /**
     * This block is called when the operation completes.
     * 
     * Clients are responsible for saving the change token at the end of the operation and passing it in to the next
     * call to @c CKFetchDatabaseChangesOperation.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old
     * and the client should toss its local cache and re-fetch the changes in this record zone starting with a nil @c
     * previousServerChangeToken.
     * If @c moreComing is true then the server wasn't able to return all the changes in this response. Another @c
     * CKFetchDatabaseChangesOperation operation should be run with the @c previousServerChangeToken token from this
     * operation.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("setFetchDatabaseChangesCompletionBlock:")
    public native void setFetchDatabaseChangesCompletionBlock(
            @Nullable @ObjCBlock(name = "call_setFetchDatabaseChangesCompletionBlock") Block_setFetchDatabaseChangesCompletionBlock value);

    @Generated
    @Selector("setPreviousServerChangeToken:")
    public native void setPreviousServerChangeToken(@Nullable CKServerChangeToken value);

    @Generated
    @Selector("setRecordZoneWithIDChangedBlock:")
    public native void setRecordZoneWithIDChangedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordZoneWithIDChangedBlock") Block_setRecordZoneWithIDChangedBlock value);

    @Generated
    @Selector("setRecordZoneWithIDWasDeletedBlock:")
    public native void setRecordZoneWithIDWasDeletedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordZoneWithIDWasDeletedBlock") Block_setRecordZoneWithIDWasDeletedBlock value);

    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_changeTokenUpdatedBlock_ret {
        @Generated
        void call_changeTokenUpdatedBlock_ret(@NotNull CKServerChangeToken arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchDatabaseChangesCompletionBlock_ret {
        @Generated
        void call_fetchDatabaseChangesCompletionBlock_ret(@Nullable CKServerChangeToken arg0, boolean arg1,
                @Nullable NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDChangedBlock_ret {
        @Generated
        void call_recordZoneWithIDChangedBlock_ret(@NotNull CKRecordZoneID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDWasDeletedBlock_ret {
        @Generated
        void call_recordZoneWithIDWasDeletedBlock_ret(@NotNull CKRecordZoneID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setChangeTokenUpdatedBlock {
        @Generated
        void call_setChangeTokenUpdatedBlock(@NotNull CKServerChangeToken arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchDatabaseChangesCompletionBlock {
        @Generated
        void call_setFetchDatabaseChangesCompletionBlock(@Nullable CKServerChangeToken arg0, boolean arg1,
                @Nullable NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDChangedBlock {
        @Generated
        void call_setRecordZoneWithIDChangedBlock(@NotNull CKRecordZoneID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDWasDeletedBlock {
        @Generated
        void call_setRecordZoneWithIDWasDeletedBlock(@NotNull CKRecordZoneID arg0);
    }

    /**
     * If this block is set it will be called instead of @c recordZoneWithIDWasDeletedBlock if the user deleted this
     * zone via the iCloud storage UI.
     * 
     * This is an indication that the user wanted all data deleted, so local cached data should be wiped and not
     * re-uploaded to the server.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("recordZoneWithIDWasPurgedBlock")
    @ObjCBlock(name = "call_recordZoneWithIDWasPurgedBlock_ret")
    public native Block_recordZoneWithIDWasPurgedBlock_ret recordZoneWithIDWasPurgedBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDWasPurgedBlock_ret {
        @Generated
        void call_recordZoneWithIDWasPurgedBlock_ret(@NotNull CKRecordZoneID arg0);
    }

    /**
     * If this block is set it will be called instead of @c recordZoneWithIDWasDeletedBlock if the user deleted this
     * zone via the iCloud storage UI.
     * 
     * This is an indication that the user wanted all data deleted, so local cached data should be wiped and not
     * re-uploaded to the server.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRecordZoneWithIDWasPurgedBlock:")
    public native void setRecordZoneWithIDWasPurgedBlock(
            @Nullable @ObjCBlock(name = "call_setRecordZoneWithIDWasPurgedBlock") Block_setRecordZoneWithIDWasPurgedBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDWasPurgedBlock {
        @Generated
        void call_setRecordZoneWithIDWasPurgedBlock(@NotNull CKRecordZoneID arg0);
    }

    /**
     * If this block is set it will be called instead of @c recordZoneWithIDWasDeletedBlock if the user chose to reset
     * all encrypted data for their account.
     * 
     * This is an indication that the user had to reset encrypted data during account recovery, so local cached data
     * should be re-uploaded to the server to minimize data loss.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("recordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock")
    @ObjCBlock(name = "call_recordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock_ret")
    public native Block_recordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock_ret recordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock_ret {
        @Generated
        void call_recordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock_ret(@NotNull CKRecordZoneID arg0);
    }

    /**
     * If this block is set it will be called instead of @c recordZoneWithIDWasDeletedBlock if the user chose to reset
     * all encrypted data for their account.
     * 
     * This is an indication that the user had to reset encrypted data during account recovery, so local cached data
     * should be re-uploaded to the server to minimize data loss.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setRecordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock:")
    public native void setRecordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock(
            @Nullable @ObjCBlock(name = "call_setRecordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock") Block_setRecordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock {
        @Generated
        void call_setRecordZoneWithIDWasDeletedDueToUserEncryptedDataResetBlock(@NotNull CKRecordZoneID arg0);
    }
}
