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
public class CKContainer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKContainer(Pointer peer) {
        super(peer);
    }

    /**
     * accountStatusWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/accountStatusWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("accountStatusWithCompletionHandler:")
    public native void accountStatusWithCompletionHandler(
            @ObjCBlock(name = "call_accountStatusWithCompletionHandler") Block_accountStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accountStatusWithCompletionHandler {
        @Generated
        void call_accountStatusWithCompletionHandler(@NInt long arg0, NSError arg1);
    }

    /**
     * addOperation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/addOperation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOperation:")
    public native void addOperation(CKOperation operation);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKContainer alloc();

    /**
     * containerIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instp/CKContainer/containerIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("containerIdentifier")
    public native String containerIdentifier();

    /**
     * containerWithIdentifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/clm/CKContainer/containerWithIdentifier:">iOS Dev Center</a>
     */
    @Generated
    @Selector("containerWithIdentifier:")
    public static native CKContainer containerWithIdentifier(String containerIdentifier);

    /**
     * defaultContainer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/clm/CKContainer/defaultContainer">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultContainer")
    public static native CKContainer defaultContainer();

    /**
     * discoverAllContactUserInfosWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/discoverAllContactUserInfosWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverAllContactUserInfosWithCompletionHandler:")
    public native void discoverAllContactUserInfosWithCompletionHandler(
            @ObjCBlock(name = "call_discoverAllContactUserInfosWithCompletionHandler") Block_discoverAllContactUserInfosWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverAllContactUserInfosWithCompletionHandler {
        @Generated
        void call_discoverAllContactUserInfosWithCompletionHandler(NSArray<? extends CKDiscoveredUserInfo> arg0,
                NSError arg1);
    }

    /**
     * discoverUserInfoWithEmailAddress:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/discoverUserInfoWithEmailAddress:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverUserInfoWithEmailAddress:completionHandler:")
    public native void discoverUserInfoWithEmailAddressCompletionHandler(String email,
            @ObjCBlock(name = "call_discoverUserInfoWithEmailAddressCompletionHandler") Block_discoverUserInfoWithEmailAddressCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserInfoWithEmailAddressCompletionHandler {
        @Generated
        void call_discoverUserInfoWithEmailAddressCompletionHandler(CKDiscoveredUserInfo arg0, NSError arg1);
    }

    /**
     * discoverUserInfoWithUserRecordID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/discoverUserInfoWithUserRecordID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("discoverUserInfoWithUserRecordID:completionHandler:")
    public native void discoverUserInfoWithUserRecordIDCompletionHandler(CKRecordID userRecordID,
            @ObjCBlock(name = "call_discoverUserInfoWithUserRecordIDCompletionHandler") Block_discoverUserInfoWithUserRecordIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserInfoWithUserRecordIDCompletionHandler {
        @Generated
        void call_discoverUserInfoWithUserRecordIDCompletionHandler(CKDiscoveredUserInfo arg0, NSError arg1);
    }

    /**
     * fetchUserRecordIDWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/fetchUserRecordIDWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchUserRecordIDWithCompletionHandler:")
    public native void fetchUserRecordIDWithCompletionHandler(
            @ObjCBlock(name = "call_fetchUserRecordIDWithCompletionHandler") Block_fetchUserRecordIDWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchUserRecordIDWithCompletionHandler {
        @Generated
        void call_fetchUserRecordIDWithCompletionHandler(CKRecordID arg0, NSError arg1);
    }

    @Generated
    @Selector("init")
    public native CKContainer init();

    /**
     * privateCloudDatabase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instp/CKContainer/privateCloudDatabase">iOS Dev Center</a>
     */
    @Generated
    @Selector("privateCloudDatabase")
    public native CKDatabase privateCloudDatabase();

    /**
     * publicCloudDatabase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instp/CKContainer/publicCloudDatabase">iOS Dev Center</a>
     */
    @Generated
    @Selector("publicCloudDatabase")
    public native CKDatabase publicCloudDatabase();

    /**
     * requestApplicationPermission:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/requestApplicationPermission:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestApplicationPermission:completionHandler:")
    public native void requestApplicationPermissionCompletionHandler(@NUInt long applicationPermission,
            @ObjCBlock(name = "call_requestApplicationPermissionCompletionHandler") Block_requestApplicationPermissionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestApplicationPermissionCompletionHandler {
        @Generated
        void call_requestApplicationPermissionCompletionHandler(@NInt long arg0, NSError arg1);
    }

    /**
     * statusForApplicationPermission:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/statusForApplicationPermission:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("statusForApplicationPermission:completionHandler:")
    public native void statusForApplicationPermissionCompletionHandler(@NUInt long applicationPermission,
            @ObjCBlock(name = "call_statusForApplicationPermissionCompletionHandler") Block_statusForApplicationPermissionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_statusForApplicationPermissionCompletionHandler {
        @Generated
        void call_statusForApplicationPermissionCompletionHandler(@NInt long arg0, NSError arg1);
    }

    /**
     * fetchAllLongLivedOperationIDsWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/fetchAllLongLivedOperationIDsWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchAllLongLivedOperationIDsWithCompletionHandler:")
    public native void fetchAllLongLivedOperationIDsWithCompletionHandler(
            @ObjCBlock(name = "call_fetchAllLongLivedOperationIDsWithCompletionHandler") Block_fetchAllLongLivedOperationIDsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllLongLivedOperationIDsWithCompletionHandler {
        @Generated
        void call_fetchAllLongLivedOperationIDsWithCompletionHandler(NSArray<String> arg0, NSError arg1);
    }

    /**
     * fetchLongLivedOperationWithID:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKContainer_class/index.html#//apple_ref/occ/instm/CKContainer/fetchLongLivedOperationWithID:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("fetchLongLivedOperationWithID:completionHandler:")
    public native void fetchLongLivedOperationWithIDCompletionHandler(String operationID,
            @ObjCBlock(name = "call_fetchLongLivedOperationWithIDCompletionHandler") Block_fetchLongLivedOperationWithIDCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchLongLivedOperationWithIDCompletionHandler {
        @Generated
        void call_fetchLongLivedOperationWithIDCompletionHandler(CKOperation arg0, NSError arg1);
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
