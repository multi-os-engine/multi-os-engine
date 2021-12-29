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

/**
 * CKFetchRecordChangesOperation
 * <p>
 * Use CKFetchRecordZoneChangesOperation instead of this class.
 * <p>
 * Any serverChangeTokens saved from a CKFetchRecordChangesOperation are usable as a serverRecordZoneChangeToken in CKFetchRecordZoneChangesOperation
 * <p>
 * This operation will fetch records changes in the given record zone.
 * <p>
 * If a change token from a previous @c CKFetchRecordChangesOperation is passed in, only the records that have changed since that token will be fetched.
 * If this is your first fetch or if you wish to re-fetch all records, pass nil for the change token.
 * Change tokens are opaque tokens and clients should not infer any behavior based on their content
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchRecordChangesOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchRecordChangesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchRecordChangesOperation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchRecordChangesOperation allocWithZone(VoidPtr zone);

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
    public static native CKFetchRecordChangesOperation new_objc();

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
     * Declares which user-defined keys should be fetched and added to the resulting CKRecords.
     * <p>
     * If nil, declares the entire record should be downloaded. If set to an empty array, declares that no user fields should be downloaded.
     * Defaults to @c nil.
     */
    @Generated
    @Selector("desiredKeys")
    public native NSArray<String> desiredKeys();

    /**
     * This block is called when the operation completes.
     * <p>
     * Clients are responsible for saving the change token at the end of the operation and passing it in to the next call to @c CKFetchRecordChangesOperation.
     * Note that a fetch can fail partway. If that happens, an updated change token may be returned in the completion block so that already fetched records don't need to be re-downloaded on a subsequent operation.
     * The @c clientChangeTokenData from the most recent @c CKModifyRecordsOperation is also returned, or nil if none was provided.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old and the client should toss its local cache and re-fetch the changes in this record zone starting with a nil @c previousServerChangeToken.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("fetchRecordChangesCompletionBlock")
    @ObjCBlock(name = "call_fetchRecordChangesCompletionBlock_ret")
    public native Block_fetchRecordChangesCompletionBlock_ret fetchRecordChangesCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchRecordChangesOperation init();

    @Generated
    @Selector("initWithRecordZoneID:previousServerChangeToken:")
    public native CKFetchRecordChangesOperation initWithRecordZoneIDPreviousServerChangeToken(
            CKRecordZoneID recordZoneID, CKServerChangeToken previousServerChangeToken);

    /**
     * If true, then the server wasn't able to return all the changes in this response.
     * <p>
     * Will be set before fetchRecordChangesCompletionBlock is called.
     * Another CKFetchRecordChangesOperation operation should be run with the updated serverChangeToken token from this operation.
     */
    @Generated
    @Selector("moreComing")
    public native boolean moreComing();

    @Generated
    @Selector("previousServerChangeToken")
    public native CKServerChangeToken previousServerChangeToken();

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("recordChangedBlock")
    @ObjCBlock(name = "call_recordChangedBlock_ret")
    public native Block_recordChangedBlock_ret recordChangedBlock();

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("recordWithIDWasDeletedBlock")
    @ObjCBlock(name = "call_recordWithIDWasDeletedBlock_ret")
    public native Block_recordWithIDWasDeletedBlock_ret recordWithIDWasDeletedBlock();

    @Generated
    @Selector("recordZoneID")
    public native CKRecordZoneID recordZoneID();

    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    /**
     * Declares which user-defined keys should be fetched and added to the resulting CKRecords.
     * <p>
     * If nil, declares the entire record should be downloaded. If set to an empty array, declares that no user fields should be downloaded.
     * Defaults to @c nil.
     */
    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(NSArray<String> value);

    /**
     * This block is called when the operation completes.
     * <p>
     * Clients are responsible for saving the change token at the end of the operation and passing it in to the next call to @c CKFetchRecordChangesOperation.
     * Note that a fetch can fail partway. If that happens, an updated change token may be returned in the completion block so that already fetched records don't need to be re-downloaded on a subsequent operation.
     * The @c clientChangeTokenData from the most recent @c CKModifyRecordsOperation is also returned, or nil if none was provided.
     * If the server returns a @c CKErrorChangeTokenExpired error, the @c previousServerChangeToken value was too old and the client should toss its local cache and re-fetch the changes in this record zone starting with a nil @c previousServerChangeToken.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setFetchRecordChangesCompletionBlock:")
    public native void setFetchRecordChangesCompletionBlock(
            @ObjCBlock(name = "call_setFetchRecordChangesCompletionBlock") Block_setFetchRecordChangesCompletionBlock value);

    @Generated
    @Selector("setPreviousServerChangeToken:")
    public native void setPreviousServerChangeToken(CKServerChangeToken value);

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setRecordChangedBlock:")
    public native void setRecordChangedBlock(
            @ObjCBlock(name = "call_setRecordChangedBlock") Block_setRecordChangedBlock value);

    /**
     * ! @discussion Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setRecordWithIDWasDeletedBlock:")
    public native void setRecordWithIDWasDeletedBlock(
            @ObjCBlock(name = "call_setRecordWithIDWasDeletedBlock") Block_setRecordWithIDWasDeletedBlock value);

    @Generated
    @Selector("setRecordZoneID:")
    public native void setRecordZoneID(CKRecordZoneID value);

    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordChangesCompletionBlock_ret {
        @Generated
        void call_fetchRecordChangesCompletionBlock_ret(CKServerChangeToken arg0, NSData arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordChangedBlock_ret {
        @Generated
        void call_recordChangedBlock_ret(CKRecord arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordWithIDWasDeletedBlock_ret {
        @Generated
        void call_recordWithIDWasDeletedBlock_ret(CKRecordID arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchRecordChangesCompletionBlock {
        @Generated
        void call_setFetchRecordChangesCompletionBlock(CKServerChangeToken arg0, NSData arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordChangedBlock {
        @Generated
        void call_setRecordChangedBlock(CKRecord arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordWithIDWasDeletedBlock {
        @Generated
        void call_setRecordWithIDWasDeletedBlock(CKRecordID arg0);
    }
}
