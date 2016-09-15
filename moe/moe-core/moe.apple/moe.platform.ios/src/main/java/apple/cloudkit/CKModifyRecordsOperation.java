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
public class CKModifyRecordsOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKModifyRecordsOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKModifyRecordsOperation alloc();

    /**
     * atomic</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/atomic">iOS Dev Center</a>
     */
    @Generated
    @Selector("atomic")
    public native boolean atomic();

    /**
     * clientChangeTokenData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/clientChangeTokenData">iOS Dev Center</a>
     */
    @Generated
    @Selector("clientChangeTokenData")
    public native NSData clientChangeTokenData();

    @Generated
    @Selector("init")
    public native CKModifyRecordsOperation init();

    /**
     * initWithRecordsToSave:recordIDsToDelete:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instm/CKModifyRecordsOperation/initWithRecordsToSave:recordIDsToDelete:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRecordsToSave:recordIDsToDelete:")
    public native CKModifyRecordsOperation initWithRecordsToSaveRecordIDsToDelete(NSArray<? extends CKRecord> records,
            NSArray<? extends CKRecordID> recordIDs);

    /**
     * recordIDsToDelete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/recordIDsToDelete">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordIDsToDelete")
    public native NSArray<? extends CKRecordID> recordIDsToDelete();

    /**
     * recordsToSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/recordsToSave">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordsToSave")
    public native NSArray<? extends CKRecord> recordsToSave();

    /**
     * savePolicy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/savePolicy">iOS Dev Center</a>
     */
    @Generated
    @Selector("savePolicy")
    @NInt
    public native long savePolicy();

    /**
     * atomic</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/atomic">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAtomic:")
    public native void setAtomic(boolean value);

    /**
     * clientChangeTokenData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/clientChangeTokenData">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClientChangeTokenData:")
    public native void setClientChangeTokenData(NSData value);

    /**
     * modifyRecordsCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/modifyRecordsCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setModifyRecordsCompletionBlock:")
    public native void setModifyRecordsCompletionBlock(
            @ObjCBlock(name = "call_setModifyRecordsCompletionBlock") Block_setModifyRecordsCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setModifyRecordsCompletionBlock {
        @Generated
        void call_setModifyRecordsCompletionBlock(NSArray<? extends CKRecord> arg0, NSArray<? extends CKRecordID> arg1,
                NSError arg2);
    }

    /**
     * perRecordCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/perRecordCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPerRecordCompletionBlock:")
    public native void setPerRecordCompletionBlock(
            @ObjCBlock(name = "call_setPerRecordCompletionBlock") Block_setPerRecordCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordCompletionBlock {
        @Generated
        void call_setPerRecordCompletionBlock(CKRecord arg0, NSError arg1);
    }

    /**
     * perRecordProgressBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/perRecordProgressBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPerRecordProgressBlock:")
    public native void setPerRecordProgressBlock(
            @ObjCBlock(name = "call_setPerRecordProgressBlock") Block_setPerRecordProgressBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPerRecordProgressBlock {
        @Generated
        void call_setPerRecordProgressBlock(CKRecord arg0, double arg1);
    }

    /**
     * recordIDsToDelete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/recordIDsToDelete">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordIDsToDelete:")
    public native void setRecordIDsToDelete(NSArray<? extends CKRecordID> value);

    /**
     * recordsToSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/recordsToSave">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordsToSave:")
    public native void setRecordsToSave(NSArray<? extends CKRecord> value);

    /**
     * savePolicy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/savePolicy">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSavePolicy:")
    public native void setSavePolicy(@NInt long value);

    /**
     * modifyRecordsCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/modifyRecordsCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("modifyRecordsCompletionBlock")
    @ObjCBlock(name = "call_modifyRecordsCompletionBlock_ret")
    public native Block_modifyRecordsCompletionBlock_ret modifyRecordsCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyRecordsCompletionBlock_ret {
        @Generated
        void call_modifyRecordsCompletionBlock_ret(NSArray<? extends CKRecord> arg0, NSArray<? extends CKRecordID> arg1,
                NSError arg2);
    }

    /**
     * perRecordCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/perRecordCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("perRecordCompletionBlock")
    @ObjCBlock(name = "call_perRecordCompletionBlock_ret")
    public native Block_perRecordCompletionBlock_ret perRecordCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordCompletionBlock_ret {
        @Generated
        void call_perRecordCompletionBlock_ret(CKRecord arg0, NSError arg1);
    }

    /**
     * perRecordProgressBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordsOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordsOperation/perRecordProgressBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("perRecordProgressBlock")
    @ObjCBlock(name = "call_perRecordProgressBlock_ret")
    public native Block_perRecordProgressBlock_ret perRecordProgressBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_perRecordProgressBlock_ret {
        @Generated
        void call_perRecordProgressBlock_ret(CKRecord arg0, double arg1);
    }

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
}
