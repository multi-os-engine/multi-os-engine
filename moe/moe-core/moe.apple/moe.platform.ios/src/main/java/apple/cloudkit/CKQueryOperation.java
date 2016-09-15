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
public class CKQueryOperation extends CKDatabaseOperation {
    static {
        NatJ.register();
    }

    @Generated
    protected CKQueryOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKQueryOperation alloc();

    /**
     * cursor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/cursor">iOS Dev Center</a>
     */
    @Generated
    @Selector("cursor")
    public native CKQueryCursor cursor();

    /**
     * desiredKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/desiredKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("desiredKeys")
    public native NSArray<String> desiredKeys();

    @Generated
    @Selector("init")
    public native CKQueryOperation init();

    /**
     * initWithCursor:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instm/CKQueryOperation/initWithCursor:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCursor:")
    public native CKQueryOperation initWithCursor(CKQueryCursor cursor);

    /**
     * initWithQuery:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instm/CKQueryOperation/initWithQuery:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithQuery:")
    public native CKQueryOperation initWithQuery(CKQuery query);

    /**
     * query</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/query">iOS Dev Center</a>
     */
    @Generated
    @Selector("query")
    public native CKQuery query();

    /**
     * resultsLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/resultsLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("resultsLimit")
    @NUInt
    public native long resultsLimit();

    /**
     * cursor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/cursor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCursor:")
    public native void setCursor(CKQueryCursor value);

    /**
     * desiredKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/desiredKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDesiredKeys:")
    public native void setDesiredKeys(NSArray<String> value);

    /**
     * query</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/query">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQuery:")
    public native void setQuery(CKQuery value);

    /**
     * queryCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/queryCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQueryCompletionBlock:")
    public native void setQueryCompletionBlock(
            @ObjCBlock(name = "call_setQueryCompletionBlock") Block_setQueryCompletionBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setQueryCompletionBlock {
        @Generated
        void call_setQueryCompletionBlock(CKQueryCursor arg0, NSError arg1);
    }

    /**
     * recordFetchedBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/recordFetchedBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRecordFetchedBlock:")
    public native void setRecordFetchedBlock(
            @ObjCBlock(name = "call_setRecordFetchedBlock") Block_setRecordFetchedBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setRecordFetchedBlock {
        @Generated
        void call_setRecordFetchedBlock(CKRecord arg0);
    }

    /**
     * resultsLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/resultsLimit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setResultsLimit:")
    public native void setResultsLimit(@NUInt long value);

    /**
     * zoneID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/zoneID">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZoneID:")
    public native void setZoneID(CKRecordZoneID value);

    /**
     * zoneID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/zoneID">iOS Dev Center</a>
     */
    @Generated
    @Selector("zoneID")
    public native CKRecordZoneID zoneID();

    /**
     * queryCompletionBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/queryCompletionBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("queryCompletionBlock")
    @ObjCBlock(name = "call_queryCompletionBlock_ret")
    public native Block_queryCompletionBlock_ret queryCompletionBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryCompletionBlock_ret {
        @Generated
        void call_queryCompletionBlock_ret(CKQueryCursor arg0, NSError arg1);
    }

    /**
     * recordFetchedBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKQueryOperation_class/index.html#//apple_ref/occ/instp/CKQueryOperation/recordFetchedBlock">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordFetchedBlock")
    @ObjCBlock(name = "call_recordFetchedBlock_ret")
    public native Block_recordFetchedBlock_ret recordFetchedBlock();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_recordFetchedBlock_ret {
        @Generated
        void call_recordFetchedBlock_ret(CKRecord arg0);
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
