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
public class CKDatabase extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKDatabase(Pointer peer) {
        super(peer);
    }

    /**
     * addOperation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/addOperation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOperation:")
    public native void addOperation(CKDatabaseOperation operation);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKDatabase alloc();

    /**
     * deleteRecordWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/deleteRecordWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteRecordWithID:completionHandler:")
    public native void deleteRecordWithIDCompletionHandler(CKRecordID recordID,
            @ObjCBlock(name = "call_deleteRecordWithIDCompletionHandler") Block_deleteRecordWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteRecordWithIDCompletionHandler {
        @Generated
        void call_deleteRecordWithIDCompletionHandler(CKRecordID arg0, NSError arg1);
    }

    /**
     * deleteRecordZoneWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/deleteRecordZoneWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteRecordZoneWithID:completionHandler:")
    public native void deleteRecordZoneWithIDCompletionHandler(CKRecordZoneID zoneID,
            @ObjCBlock(name = "call_deleteRecordZoneWithIDCompletionHandler") Block_deleteRecordZoneWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteRecordZoneWithIDCompletionHandler {
        @Generated
        void call_deleteRecordZoneWithIDCompletionHandler(CKRecordZoneID arg0, NSError arg1);
    }

    /**
     * deleteSubscriptionWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/deleteSubscriptionWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("deleteSubscriptionWithID:completionHandler:")
    public native void deleteSubscriptionWithIDCompletionHandler(String subscriptionID,
            @ObjCBlock(name = "call_deleteSubscriptionWithIDCompletionHandler") Block_deleteSubscriptionWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteSubscriptionWithIDCompletionHandler {
        @Generated
        void call_deleteSubscriptionWithIDCompletionHandler(String arg0, NSError arg1);
    }

    /**
     * fetchAllRecordZonesWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/fetchAllRecordZonesWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchAllRecordZonesWithCompletionHandler:")
    public native void fetchAllRecordZonesWithCompletionHandler(
            @ObjCBlock(name = "call_fetchAllRecordZonesWithCompletionHandler") Block_fetchAllRecordZonesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllRecordZonesWithCompletionHandler {
        @Generated
        void call_fetchAllRecordZonesWithCompletionHandler(NSArray<? extends CKRecordZone> arg0, NSError arg1);
    }

    /**
     * fetchAllSubscriptionsWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/fetchAllSubscriptionsWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchAllSubscriptionsWithCompletionHandler:")
    public native void fetchAllSubscriptionsWithCompletionHandler(
            @ObjCBlock(name = "call_fetchAllSubscriptionsWithCompletionHandler") Block_fetchAllSubscriptionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllSubscriptionsWithCompletionHandler {
        @Generated
        void call_fetchAllSubscriptionsWithCompletionHandler(NSArray<? extends CKSubscription> arg0, NSError arg1);
    }

    /**
     * fetchRecordWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/fetchRecordWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchRecordWithID:completionHandler:")
    public native void fetchRecordWithIDCompletionHandler(CKRecordID recordID,
            @ObjCBlock(name = "call_fetchRecordWithIDCompletionHandler") Block_fetchRecordWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordWithIDCompletionHandler {
        @Generated
        void call_fetchRecordWithIDCompletionHandler(CKRecord arg0, NSError arg1);
    }

    /**
     * fetchRecordZoneWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/fetchRecordZoneWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchRecordZoneWithID:completionHandler:")
    public native void fetchRecordZoneWithIDCompletionHandler(CKRecordZoneID zoneID,
            @ObjCBlock(name = "call_fetchRecordZoneWithIDCompletionHandler") Block_fetchRecordZoneWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchRecordZoneWithIDCompletionHandler {
        @Generated
        void call_fetchRecordZoneWithIDCompletionHandler(CKRecordZone arg0, NSError arg1);
    }

    /**
     * fetchSubscriptionWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/fetchSubscriptionWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchSubscriptionWithID:completionHandler:")
    public native void fetchSubscriptionWithIDCompletionHandler(String subscriptionID,
            @ObjCBlock(name = "call_fetchSubscriptionWithIDCompletionHandler") Block_fetchSubscriptionWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchSubscriptionWithIDCompletionHandler {
        @Generated
        void call_fetchSubscriptionWithIDCompletionHandler(CKSubscription arg0, NSError arg1);
    }

    @Generated
    @Selector("init")
    public native CKDatabase init();

    /**
     * performQuery:inZoneWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/performQuery:inZoneWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performQuery:inZoneWithID:completionHandler:")
    public native void performQueryInZoneWithIDCompletionHandler(CKQuery query, CKRecordZoneID zoneID,
            @ObjCBlock(name = "call_performQueryInZoneWithIDCompletionHandler") Block_performQueryInZoneWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performQueryInZoneWithIDCompletionHandler {
        @Generated
        void call_performQueryInZoneWithIDCompletionHandler(NSArray<? extends CKRecord> arg0, NSError arg1);
    }

    /**
     * saveRecord:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/saveRecord:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("saveRecord:completionHandler:")
    public native void saveRecordCompletionHandler(CKRecord record,
            @ObjCBlock(name = "call_saveRecordCompletionHandler") Block_saveRecordCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveRecordCompletionHandler {
        @Generated
        void call_saveRecordCompletionHandler(CKRecord arg0, NSError arg1);
    }

    /**
     * saveRecordZone:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/saveRecordZone:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("saveRecordZone:completionHandler:")
    public native void saveRecordZoneCompletionHandler(CKRecordZone zone,
            @ObjCBlock(name = "call_saveRecordZoneCompletionHandler") Block_saveRecordZoneCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveRecordZoneCompletionHandler {
        @Generated
        void call_saveRecordZoneCompletionHandler(CKRecordZone arg0, NSError arg1);
    }

    /**
     * saveSubscription:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKDatabase_class/index.html#//apple_ref/occ/instm/CKDatabase/saveSubscription:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("saveSubscription:completionHandler:")
    public native void saveSubscriptionCompletionHandler(CKSubscription subscription,
            @ObjCBlock(name = "call_saveSubscriptionCompletionHandler") Block_saveSubscriptionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveSubscriptionCompletionHandler {
        @Generated
        void call_saveSubscriptionCompletionHandler(CKSubscription arg0, NSError arg1);
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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
