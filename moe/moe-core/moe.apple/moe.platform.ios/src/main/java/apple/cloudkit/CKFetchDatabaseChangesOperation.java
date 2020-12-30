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

/**
 * @class CKFetchDatabaseChangesOperation
 * 
 * @abstract This operation will fetch changes to record zones within a database
 * 
 * @discussion If a change anchor from a previous @c CKFetchDatabaseChangesOperation is passed in, only the zones that have changed since that anchor will be returned.
 * This per-database @c serverChangeToken is not to be confused with the per-recordZone @c serverChangeToken from @c CKFetchRecordZoneChangesOperation.
 * If this is your first fetch or if you wish to re-fetch all zones, pass nil for the change token.
 * Change token are opaque tokens and clients should not infer any behavior based on their content.
 * @c CKFetchDatabaseChangesOperation is supported in a @c privateCloudDatabase and @c sharedCloudDatabase
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

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("changeTokenUpdatedBlock")
    @ObjCBlock(name = "call_changeTokenUpdatedBlock_ret")
    public native Block_changeTokenUpdatedBlock_ret changeTokenUpdatedBlock();

    /**
     * @discussion When set to YES, this operation will send repeated requests to the server until all record zone changes have been fetched.
     * 
     * @c changeTokenUpdatedBlock will be invoked periodically, to give clients an updated change token so that already-fetched record zone changes don't need to be re-fetched on a subsequent operation.
     * When set to NO, it is the responsibility of the caller to issue subsequent fetch-changes operations when moreComing is YES in a @c fetchDatabaseChangesCompletionBlock invocation.
     * @c fetchAllChanges is @c YES by default
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("fetchAllChanges")
    public native boolean fetchAllChanges();

    /**
     * @abstract This block is called when the operation completes.
     * 
     * @discussion Clients are responsible for saving the change token at the end of the operation and passing it in to the next call to @c CKFetchDatabaseChangesOperation.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old and the client should toss its local cache and re-fetch the changes in this record zone starting with a nil @c previousServerChangeToken.
     * If @c moreComing is true then the server wasn't able to return all the changes in this response. Another @c CKFetchDatabaseChangesOperation operation should be run with the @c previousServerChangeToken token from this operation.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
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
            CKServerChangeToken previousServerChangeToken);

    @Generated
    @Selector("previousServerChangeToken")
    public native CKServerChangeToken previousServerChangeToken();

    @Generated
    @Selector("recordZoneWithIDChangedBlock")
    @ObjCBlock(name = "call_recordZoneWithIDChangedBlock_ret")
    public native Block_recordZoneWithIDChangedBlock_ret recordZoneWithIDChangedBlock();

    @Generated
    @Selector("recordZoneWithIDWasDeletedBlock")
    @ObjCBlock(name = "call_recordZoneWithIDWasDeletedBlock_ret")
    public native Block_recordZoneWithIDWasDeletedBlock_ret recordZoneWithIDWasDeletedBlock();

    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setChangeTokenUpdatedBlock:")
    public native void setChangeTokenUpdatedBlock(
            @ObjCBlock(name = "call_setChangeTokenUpdatedBlock") Block_setChangeTokenUpdatedBlock value);

    /**
     * @discussion When set to YES, this operation will send repeated requests to the server until all record zone changes have been fetched.
     * 
     * @c changeTokenUpdatedBlock will be invoked periodically, to give clients an updated change token so that already-fetched record zone changes don't need to be re-fetched on a subsequent operation.
     * When set to NO, it is the responsibility of the caller to issue subsequent fetch-changes operations when moreComing is YES in a @c fetchDatabaseChangesCompletionBlock invocation.
     * @c fetchAllChanges is @c YES by default
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("setFetchAllChanges:")
    public native void setFetchAllChanges(boolean value);

    /**
     * @abstract This block is called when the operation completes.
     * 
     * @discussion Clients are responsible for saving the change token at the end of the operation and passing it in to the next call to @c CKFetchDatabaseChangesOperation.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old and the client should toss its local cache and re-fetch the changes in this record zone starting with a nil @c previousServerChangeToken.
     * If @c moreComing is true then the server wasn't able to return all the changes in this response. Another @c CKFetchDatabaseChangesOperation operation should be run with the @c previousServerChangeToken token from this operation.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("setFetchDatabaseChangesCompletionBlock:")
    public native void setFetchDatabaseChangesCompletionBlock(
            @ObjCBlock(name = "call_setFetchDatabaseChangesCompletionBlock") Block_setFetchDatabaseChangesCompletionBlock value);

    @Generated
    @Selector("setPreviousServerChangeToken:")
    public native void setPreviousServerChangeToken(CKServerChangeToken value);

    @Generated
    @Selector("setRecordZoneWithIDChangedBlock:")
    public native void setRecordZoneWithIDChangedBlock(
            @ObjCBlock(name = "call_setRecordZoneWithIDChangedBlock") Block_setRecordZoneWithIDChangedBlock value);

    @Generated
    @Selector("setRecordZoneWithIDWasDeletedBlock:")
    public native void setRecordZoneWithIDWasDeletedBlock(
            @ObjCBlock(name = "call_setRecordZoneWithIDWasDeletedBlock") Block_setRecordZoneWithIDWasDeletedBlock value);

    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_changeTokenUpdatedBlock_ret {
        @Generated
        void call_changeTokenUpdatedBlock_ret(CKServerChangeToken arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchDatabaseChangesCompletionBlock_ret {
        @Generated
        void call_fetchDatabaseChangesCompletionBlock_ret(CKServerChangeToken arg0, boolean arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDChangedBlock_ret {
        @Generated
        void call_recordZoneWithIDChangedBlock_ret(CKRecordZoneID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDWasDeletedBlock_ret {
        @Generated
        void call_recordZoneWithIDWasDeletedBlock_ret(CKRecordZoneID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setChangeTokenUpdatedBlock {
        @Generated
        void call_setChangeTokenUpdatedBlock(CKServerChangeToken arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchDatabaseChangesCompletionBlock {
        @Generated
        void call_setFetchDatabaseChangesCompletionBlock(CKServerChangeToken arg0, boolean arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDChangedBlock {
        @Generated
        void call_setRecordZoneWithIDChangedBlock(CKRecordZoneID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDWasDeletedBlock {
        @Generated
        void call_setRecordZoneWithIDWasDeletedBlock(CKRecordZoneID arg0);
    }

    /**
     * @abstract If this block is set it will be called instead of @c recordZoneWithIDWasDeletedBlock if the user deleted this zone via the iCloud storage UI.
     * 
     * @discussion This is an indication that the user wanted all data deleted, so local cached data should be wiped and not re-uploaded to the server.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("recordZoneWithIDWasPurgedBlock")
    @ObjCBlock(name = "call_recordZoneWithIDWasPurgedBlock_ret")
    public native Block_recordZoneWithIDWasPurgedBlock_ret recordZoneWithIDWasPurgedBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordZoneWithIDWasPurgedBlock_ret {
        @Generated
        void call_recordZoneWithIDWasPurgedBlock_ret(CKRecordZoneID arg0);
    }

    /**
     * @abstract If this block is set it will be called instead of @c recordZoneWithIDWasDeletedBlock if the user deleted this zone via the iCloud storage UI.
     * 
     * @discussion This is an indication that the user wanted all data deleted, so local cached data should be wiped and not re-uploaded to the server.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations
     */
    @Generated
    @Selector("setRecordZoneWithIDWasPurgedBlock:")
    public native void setRecordZoneWithIDWasPurgedBlock(
            @ObjCBlock(name = "call_setRecordZoneWithIDWasPurgedBlock") Block_setRecordZoneWithIDWasPurgedBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordZoneWithIDWasPurgedBlock {
        @Generated
        void call_setRecordZoneWithIDWasPurgedBlock(CKRecordZoneID arg0);
    }
}
