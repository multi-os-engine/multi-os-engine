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

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKFetchRecordsOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKFetchRecordsOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKFetchRecordsOperation alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CKFetchRecordsOperation allocWithZone(VoidPtr zone);

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
    @Selector("fetchCurrentUserRecordOperation")
    public static native CKFetchRecordsOperation fetchCurrentUserRecordOperation();

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
    public static native CKFetchRecordsOperation new_objc();

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
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] recordsByRecordID and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent back in previous @c perRecordCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("fetchRecordsCompletionBlock")
    @ObjCBlock(name = "call_fetchRecordsCompletionBlock_ret")
    public native Block_fetchRecordsCompletionBlock_ret fetchRecordsCompletionBlock();

    @Generated
    @Selector("init")
    public native CKFetchRecordsOperation init();

    @Generated
    @Selector("initWithRecordIDs:")
    public native CKFetchRecordsOperation initWithRecordIDs(NSArray<? extends CKRecordID> recordIDs);

    /**
     * Called on success or failure for each record.
     * <p>
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("perRecordCompletionBlock")
    @ObjCBlock(name = "call_perRecordCompletionBlock_ret")
    public native Block_perRecordCompletionBlock_ret perRecordCompletionBlock();

    /**
     * Indicates the progress for each record.
     * <p>
     * This method is called at least once with a progress of 1.0 for every record. Intermediate progress is only reported for records that contain assets.
     * It is possible for progress to regress when a retry is automatically triggered.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("perRecordProgressBlock")
    @ObjCBlock(name = "call_perRecordProgressBlock_ret")
    public native Block_perRecordProgressBlock_ret perRecordProgressBlock();

    @Generated
    @Selector("recordIDs")
    public native NSArray<? extends CKRecordID> recordIDs();

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
     * The @code -[NSOperation completionBlock] @endcode will also be called if both are set.
     * If the error is @c CKErrorPartialFailure, the error's userInfo dictionary contains a dictionary of recordIDs to errors keyed off of @c CKPartialErrorsByItemIDKey.
     * [@c] recordsByRecordID and any @c CKPartialErrorsByItemIDKey errors are repeats of the data sent back in previous @c perRecordCompletionBlock invocations
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setFetchRecordsCompletionBlock:")
    public native void setFetchRecordsCompletionBlock(
            @ObjCBlock(name = "call_setFetchRecordsCompletionBlock") Block_setFetchRecordsCompletionBlock value);

    /**
     * Called on success or failure for each record.
     * <p>
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setPerRecordCompletionBlock:")
    public native void setPerRecordCompletionBlock(
            @ObjCBlock(name = "call_setPerRecordCompletionBlock") Block_setPerRecordCompletionBlock value);

    /**
     * Indicates the progress for each record.
     * <p>
     * This method is called at least once with a progress of 1.0 for every record. Intermediate progress is only reported for records that contain assets.
     * It is possible for progress to regress when a retry is automatically triggered.
     * Each @c CKOperation instance has a private serial queue. This queue is used for all callback block invocations.
     */
    @Generated
    @Selector("setPerRecordProgressBlock:")
    public native void setPerRecordProgressBlock(
            @ObjCBlock(name = "call_setPerRecordProgressBlock") Block_setPerRecordProgressBlock value);

    @Generated
    @Selector("setRecordIDs:")
    public native void setRecordIDs(NSArray<? extends CKRecordID> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordsCompletionBlock_ret {
        @Generated
        void call_fetchRecordsCompletionBlock_ret(NSDictionary<? extends CKRecordID, ? extends CKRecord> arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordCompletionBlock_ret {
        @Generated
        void call_perRecordCompletionBlock_ret(CKRecord arg0, CKRecordID arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordProgressBlock_ret {
        @Generated
        void call_perRecordProgressBlock_ret(CKRecordID arg0, double arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFetchRecordsCompletionBlock {
        @Generated
        void call_setFetchRecordsCompletionBlock(NSDictionary<? extends CKRecordID, ? extends CKRecord> arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordCompletionBlock {
        @Generated
        void call_setPerRecordCompletionBlock(CKRecord arg0, CKRecordID arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordProgressBlock {
        @Generated
        void call_setPerRecordProgressBlock(CKRecordID arg0, double arg1);
    }
}
