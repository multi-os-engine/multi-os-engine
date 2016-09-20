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

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKModifyRecordZonesOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKModifyRecordZonesOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKModifyRecordZonesOperation alloc();

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

    @Generated
    @Selector("init")
    public native CKModifyRecordZonesOperation init();

    /**
     * initWithRecordZonesToSave:recordZoneIDsToDelete:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instm/CKModifyRecordZonesOperation/initWithRecordZonesToSave:recordZoneIDsToDelete:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRecordZonesToSave:recordZoneIDsToDelete:")
    public native CKModifyRecordZonesOperation initWithRecordZonesToSaveRecordZoneIDsToDelete(
            NSArray<? extends CKRecordZone> recordZonesToSave, NSArray<? extends CKRecordZoneID> recordZoneIDsToDelete);

    /**
     * recordZoneIDsToDelete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordZonesOperation/recordZoneIDsToDelete">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordZoneIDsToDelete")
    public native NSArray<? extends CKRecordZoneID> recordZoneIDsToDelete();

    /**
     * recordZonesToSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordZonesOperation/recordZonesToSave">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordZonesToSave")
    public native NSArray<? extends CKRecordZone> recordZonesToSave();

    /**
     * modifyRecordZonesCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordZonesOperation/modifyRecordZonesCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setModifyRecordZonesCompletionBlock:")
    public native void setModifyRecordZonesCompletionBlock(
            @ObjCBlock(name = "call_setModifyRecordZonesCompletionBlock") Block_setModifyRecordZonesCompletionBlock value);

    /**
     * recordZoneIDsToDelete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordZonesOperation/recordZoneIDsToDelete">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordZoneIDsToDelete:")
    public native void setRecordZoneIDsToDelete(NSArray<? extends CKRecordZoneID> value);

    /**
     * recordZonesToSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordZonesOperation/recordZonesToSave">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordZonesToSave:")
    public native void setRecordZonesToSave(NSArray<? extends CKRecordZone> value);

    /**
     * modifyRecordZonesCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKModifyRecordZonesOperation_class/index.html#//apple_ref/occ/instp/CKModifyRecordZonesOperation/modifyRecordZonesCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("modifyRecordZonesCompletionBlock")
    @ObjCBlock(name = "call_modifyRecordZonesCompletionBlock_ret")
    public native Block_modifyRecordZonesCompletionBlock_ret modifyRecordZonesCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setModifyRecordZonesCompletionBlock {
        @Generated
        void call_setModifyRecordZonesCompletionBlock(NSArray<? extends CKRecordZone> arg0,
                NSArray<? extends CKRecordZoneID> arg1, NSError arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyRecordZonesCompletionBlock_ret {
        @Generated
        void call_modifyRecordZonesCompletionBlock_ret(NSArray<? extends CKRecordZone> arg0,
                NSArray<? extends CKRecordZoneID> arg1, NSError arg2);
    }
}
