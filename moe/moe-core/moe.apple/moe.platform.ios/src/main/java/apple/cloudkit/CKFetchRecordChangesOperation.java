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
    @Owned
    @Selector("alloc")
    public static native CKFetchRecordChangesOperation alloc();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * desiredKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/desiredKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("desiredKeys")
    public native NSArray<String> desiredKeys();

    @Generated
    @Selector("init")
    public native CKFetchRecordChangesOperation init();

    /**
     * initWithRecordZoneID:previousServerChangeToken:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instm/CKFetchRecordChangesOperation/initWithRecordZoneID:previousServerChangeToken:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRecordZoneID:previousServerChangeToken:")
    public native CKFetchRecordChangesOperation initWithRecordZoneIDPreviousServerChangeToken(
            CKRecordZoneID recordZoneID, CKServerChangeToken previousServerChangeToken);

    /**
     * moreComing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/moreComing">iOS Dev Center</a>
     */
    @Generated
    @Selector("moreComing")
    public native boolean moreComing();

    /**
     * previousServerChangeToken</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/previousServerChangeToken">iOS Dev Center</a>
     */
    @Generated
    @Selector("previousServerChangeToken")
    public native CKServerChangeToken previousServerChangeToken();

    /**
     * recordZoneID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/recordZoneID">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordZoneID")
    public native CKRecordZoneID recordZoneID();

    /**
     * resultsLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/resultsLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    /**
     * desiredKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/desiredKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(NSArray<String> value);

    /**
     * fetchRecordChangesCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/fetchRecordChangesCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFetchRecordChangesCompletionBlock:")
    public native void setFetchRecordChangesCompletionBlock(
            @ObjCBlock(name = "call_setFetchRecordChangesCompletionBlock") Block_setFetchRecordChangesCompletionBlock value);

    /**
     * previousServerChangeToken</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/previousServerChangeToken">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreviousServerChangeToken:")
    public native void setPreviousServerChangeToken(CKServerChangeToken value);

    /**
     * recordChangedBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/recordChangedBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordChangedBlock:")
    public native void setRecordChangedBlock(
            @ObjCBlock(name = "call_setRecordChangedBlock") Block_setRecordChangedBlock value);

    /**
     * recordWithIDWasDeletedBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/recordWithIDWasDeletedBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordWithIDWasDeletedBlock:")
    public native void setRecordWithIDWasDeletedBlock(
            @ObjCBlock(name = "call_setRecordWithIDWasDeletedBlock") Block_setRecordWithIDWasDeletedBlock value);

    /**
     * recordZoneID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/recordZoneID">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordZoneID:")
    public native void setRecordZoneID(CKRecordZoneID value);

    /**
     * resultsLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/resultsLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    /**
     * fetchRecordChangesCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/fetchRecordChangesCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchRecordChangesCompletionBlock")
    @ObjCBlock(name = "call_fetchRecordChangesCompletionBlock_ret")
    public native Block_fetchRecordChangesCompletionBlock_ret fetchRecordChangesCompletionBlock();

    /**
     * recordChangedBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/recordChangedBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordChangedBlock")
    @ObjCBlock(name = "call_recordChangedBlock_ret")
    public native Block_recordChangedBlock_ret recordChangedBlock();

    /**
     * recordWithIDWasDeletedBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKFetchRecordChangesOperation_class/index.html#//apple_ref/occ/instp/CKFetchRecordChangesOperation/recordWithIDWasDeletedBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordWithIDWasDeletedBlock")
    @ObjCBlock(name = "call_recordWithIDWasDeletedBlock_ret")
    public native Block_recordWithIDWasDeletedBlock_ret recordWithIDWasDeletedBlock();

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
}
