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
import apple.foundation.NSURL;
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKContainer alloc();

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
    @Selector("containerWithIdentifier:")
    public static native CKContainer containerWithIdentifier(String containerIdentifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultContainer")
    public static native CKContainer defaultContainer();

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

    @Generated
    @Selector("acceptShareMetadata:completionHandler:")
    public native void acceptShareMetadataCompletionHandler(CKShareMetadata metadata,
            @ObjCBlock(name = "call_acceptShareMetadataCompletionHandler") Block_acceptShareMetadataCompletionHandler completionHandler);

    @Generated
    @Selector("accountStatusWithCompletionHandler:")
    public native void accountStatusWithCompletionHandler(
            @ObjCBlock(name = "call_accountStatusWithCompletionHandler") Block_accountStatusWithCompletionHandler completionHandler);

    @Generated
    @Selector("addOperation:")
    public native void addOperation(CKOperation operation);

    @Generated
    @Selector("containerIdentifier")
    public native String containerIdentifier();

    @Generated
    @Selector("databaseWithDatabaseScope:")
    public native CKDatabase databaseWithDatabaseScope(@NInt long databaseScope);

    @Generated
    @Selector("discoverAllContactUserInfosWithCompletionHandler:")
    public native void discoverAllContactUserInfosWithCompletionHandler(
            @ObjCBlock(name = "call_discoverAllContactUserInfosWithCompletionHandler") Block_discoverAllContactUserInfosWithCompletionHandler completionHandler);

    @Generated
    @Selector("discoverAllIdentitiesWithCompletionHandler:")
    public native void discoverAllIdentitiesWithCompletionHandler(
            @ObjCBlock(name = "call_discoverAllIdentitiesWithCompletionHandler") Block_discoverAllIdentitiesWithCompletionHandler completionHandler);

    @Generated
    @Selector("discoverUserIdentityWithEmailAddress:completionHandler:")
    public native void discoverUserIdentityWithEmailAddressCompletionHandler(String email,
            @ObjCBlock(name = "call_discoverUserIdentityWithEmailAddressCompletionHandler") Block_discoverUserIdentityWithEmailAddressCompletionHandler completionHandler);

    @Generated
    @Selector("discoverUserIdentityWithPhoneNumber:completionHandler:")
    public native void discoverUserIdentityWithPhoneNumberCompletionHandler(String phoneNumber,
            @ObjCBlock(name = "call_discoverUserIdentityWithPhoneNumberCompletionHandler") Block_discoverUserIdentityWithPhoneNumberCompletionHandler completionHandler);

    @Generated
    @Selector("discoverUserIdentityWithUserRecordID:completionHandler:")
    public native void discoverUserIdentityWithUserRecordIDCompletionHandler(CKRecordID userRecordID,
            @ObjCBlock(name = "call_discoverUserIdentityWithUserRecordIDCompletionHandler") Block_discoverUserIdentityWithUserRecordIDCompletionHandler completionHandler);

    @Generated
    @Selector("discoverUserInfoWithEmailAddress:completionHandler:")
    public native void discoverUserInfoWithEmailAddressCompletionHandler(String email,
            @ObjCBlock(name = "call_discoverUserInfoWithEmailAddressCompletionHandler") Block_discoverUserInfoWithEmailAddressCompletionHandler completionHandler);

    @Generated
    @Selector("discoverUserInfoWithUserRecordID:completionHandler:")
    public native void discoverUserInfoWithUserRecordIDCompletionHandler(CKRecordID userRecordID,
            @ObjCBlock(name = "call_discoverUserInfoWithUserRecordIDCompletionHandler") Block_discoverUserInfoWithUserRecordIDCompletionHandler completionHandler);

    @Generated
    @Selector("fetchAllLongLivedOperationIDsWithCompletionHandler:")
    public native void fetchAllLongLivedOperationIDsWithCompletionHandler(
            @ObjCBlock(name = "call_fetchAllLongLivedOperationIDsWithCompletionHandler") Block_fetchAllLongLivedOperationIDsWithCompletionHandler completionHandler);

    @Generated
    @Selector("fetchLongLivedOperationWithID:completionHandler:")
    public native void fetchLongLivedOperationWithIDCompletionHandler(String operationID,
            @ObjCBlock(name = "call_fetchLongLivedOperationWithIDCompletionHandler") Block_fetchLongLivedOperationWithIDCompletionHandler completionHandler);

    @Generated
    @Selector("fetchShareMetadataWithURL:completionHandler:")
    public native void fetchShareMetadataWithURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_fetchShareMetadataWithURLCompletionHandler") Block_fetchShareMetadataWithURLCompletionHandler completionHandler);

    @Generated
    @Selector("fetchShareParticipantWithEmailAddress:completionHandler:")
    public native void fetchShareParticipantWithEmailAddressCompletionHandler(String emailAddress,
            @ObjCBlock(name = "call_fetchShareParticipantWithEmailAddressCompletionHandler") Block_fetchShareParticipantWithEmailAddressCompletionHandler completionHandler);

    @Generated
    @Selector("fetchShareParticipantWithPhoneNumber:completionHandler:")
    public native void fetchShareParticipantWithPhoneNumberCompletionHandler(String phoneNumber,
            @ObjCBlock(name = "call_fetchShareParticipantWithPhoneNumberCompletionHandler") Block_fetchShareParticipantWithPhoneNumberCompletionHandler completionHandler);

    @Generated
    @Selector("fetchShareParticipantWithUserRecordID:completionHandler:")
    public native void fetchShareParticipantWithUserRecordIDCompletionHandler(CKRecordID userRecordID,
            @ObjCBlock(name = "call_fetchShareParticipantWithUserRecordIDCompletionHandler") Block_fetchShareParticipantWithUserRecordIDCompletionHandler completionHandler);

    @Generated
    @Selector("fetchUserRecordIDWithCompletionHandler:")
    public native void fetchUserRecordIDWithCompletionHandler(
            @ObjCBlock(name = "call_fetchUserRecordIDWithCompletionHandler") Block_fetchUserRecordIDWithCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native CKContainer init();

    @Generated
    @Selector("privateCloudDatabase")
    public native CKDatabase privateCloudDatabase();

    @Generated
    @Selector("publicCloudDatabase")
    public native CKDatabase publicCloudDatabase();

    @Generated
    @Selector("requestApplicationPermission:completionHandler:")
    public native void requestApplicationPermissionCompletionHandler(@NUInt long applicationPermission,
            @ObjCBlock(name = "call_requestApplicationPermissionCompletionHandler") Block_requestApplicationPermissionCompletionHandler completionHandler);

    @Generated
    @Selector("sharedCloudDatabase")
    public native CKDatabase sharedCloudDatabase();

    @Generated
    @Selector("statusForApplicationPermission:completionHandler:")
    public native void statusForApplicationPermissionCompletionHandler(@NUInt long applicationPermission,
            @ObjCBlock(name = "call_statusForApplicationPermissionCompletionHandler") Block_statusForApplicationPermissionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_acceptShareMetadataCompletionHandler {
        @Generated
        void call_acceptShareMetadataCompletionHandler(CKShare arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accountStatusWithCompletionHandler {
        @Generated
        void call_accountStatusWithCompletionHandler(@NInt long arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverAllContactUserInfosWithCompletionHandler {
        @Generated
        void call_discoverAllContactUserInfosWithCompletionHandler(NSArray<? extends CKDiscoveredUserInfo> arg0,
                NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverAllIdentitiesWithCompletionHandler {
        @Generated
        void call_discoverAllIdentitiesWithCompletionHandler(NSArray<? extends CKUserIdentity> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithEmailAddressCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithEmailAddressCompletionHandler(CKUserIdentity arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithPhoneNumberCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithPhoneNumberCompletionHandler(CKUserIdentity arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithUserRecordIDCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithUserRecordIDCompletionHandler(CKUserIdentity arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserInfoWithEmailAddressCompletionHandler {
        @Generated
        void call_discoverUserInfoWithEmailAddressCompletionHandler(CKDiscoveredUserInfo arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserInfoWithUserRecordIDCompletionHandler {
        @Generated
        void call_discoverUserInfoWithUserRecordIDCompletionHandler(CKDiscoveredUserInfo arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllLongLivedOperationIDsWithCompletionHandler {
        @Generated
        void call_fetchAllLongLivedOperationIDsWithCompletionHandler(NSArray<String> arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchLongLivedOperationWithIDCompletionHandler {
        @Generated
        void call_fetchLongLivedOperationWithIDCompletionHandler(CKOperation arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareMetadataWithURLCompletionHandler {
        @Generated
        void call_fetchShareMetadataWithURLCompletionHandler(CKShareMetadata arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithEmailAddressCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithEmailAddressCompletionHandler(CKShareParticipant arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithPhoneNumberCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithPhoneNumberCompletionHandler(CKShareParticipant arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithUserRecordIDCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithUserRecordIDCompletionHandler(CKShareParticipant arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchUserRecordIDWithCompletionHandler {
        @Generated
        void call_fetchUserRecordIDWithCompletionHandler(CKRecordID arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestApplicationPermissionCompletionHandler {
        @Generated
        void call_requestApplicationPermissionCompletionHandler(@NInt long arg0, NSError arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_statusForApplicationPermissionCompletionHandler {
        @Generated
        void call_statusForApplicationPermissionCompletionHandler(@NInt long arg0, NSError arg1);
    }
}
