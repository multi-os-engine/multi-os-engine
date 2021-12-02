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
 * CKContainer
 * <p>
 * A CKContainer, and its CKDatabases, are the main entry points into the CloudKit framework.
 * <p>
 * Several methods in CloudKit accept completion handlers to indicate when they're completed.
 * All CKOperation subclasses include progress and completion blocks to report significant events in their lifecycles.
 * Each of these handlers and blocks is invoked on a non-main serial queue.  The receiver is responsible for handling the message on a different queue or thread if it is required.
 */
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
    public static native CKContainer allocWithZone(VoidPtr zone);

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

    /**
     * Obtain a CKContainer for the given containerIdentifier
     * <p>
     * If the application is in production mode (aka, @c com.apple.developer.icloud-container-environment is set to Production in your entitlements plist, and you have no override in @c com.apple.developer.icloud-container-development-container-identifiers), then the production environment is used.
     */
    @Generated
    @Selector("containerWithIdentifier:")
    public static native CKContainer containerWithIdentifier(String containerIdentifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Convenience method that uses the calling process' "iCloud.\(application-identifier)" as the container identifier
     * <p>
     * application-identifier is the calling process' @c application-identifier entitlement on iOS / tvOS / watchOS.
     * application-identifier is the calling process' @c com.apple.application-identifier entitlement on macOS.
     * On all OSes, if an @c com.apple.developer.associated-application-identifier entitlement is present, its value will be preferred over the @c application-identifier variants.
     */
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
    public static native CKContainer new_objc();

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

    /**
     * Convenience methods
     *
     * @return a database that's pointer-equal to one of the above properties@enum
     */
    @Generated
    @Selector("databaseWithDatabaseScope:")
    public native CKDatabase databaseWithDatabaseScope(@NInt long databaseScope);

    /**
     * Fetches all user identities that match an entry in the user's contacts database.
     * <p>
     * [@c] CKDiscoverAllUserIdentitiesOperation is the more configurable, @c CKOperation -based alternative to this methods
     */
    @Generated
    @Selector("discoverAllIdentitiesWithCompletionHandler:")
    public native void discoverAllIdentitiesWithCompletionHandler(
            @ObjCBlock(name = "call_discoverAllIdentitiesWithCompletionHandler") Block_discoverAllIdentitiesWithCompletionHandler completionHandler);

    /**
     * Fetches the user identity that corresponds to the given email address.
     * <p>
     * Only users who have opted-in to user discoverability will have their identities returned by this method.  If a user with the inputted email exists in iCloud, but has not opted-in to user discoverability, this method completes with a nil @c userInfo.  @c CKDiscoverUserIdentitiesOperation is the more configurable, @c CKOperation -based alternative to this method
     */
    @Generated
    @Selector("discoverUserIdentityWithEmailAddress:completionHandler:")
    public native void discoverUserIdentityWithEmailAddressCompletionHandler(String email,
            @ObjCBlock(name = "call_discoverUserIdentityWithEmailAddressCompletionHandler") Block_discoverUserIdentityWithEmailAddressCompletionHandler completionHandler);

    /**
     * Fetches the user identity that corresponds to the given phone number.
     * <p>
     * Only users who have opted-in to user discoverability will have their identities returned by this method.  If a user with the inputted phone number exists in iCloud, but has not opted-in to user discoverability, this method completes with a nil @c userInfo.  @c CKDiscoverUserIdentitiesOperation is the more configurable, @c CKOperation -based alternative to this method
     */
    @Generated
    @Selector("discoverUserIdentityWithPhoneNumber:completionHandler:")
    public native void discoverUserIdentityWithPhoneNumberCompletionHandler(String phoneNumber,
            @ObjCBlock(name = "call_discoverUserIdentityWithPhoneNumberCompletionHandler") Block_discoverUserIdentityWithPhoneNumberCompletionHandler completionHandler);

    /**
     * Fetches the user identity that corresponds to the given user record id.
     * <p>
     * Only users who have opted-in to user discoverability will have their identities returned by this method.  If a user has not opted-in to user discoverability, this method completes with a nil @c userInfo.  @c CKDiscoverUserIdentitiesOperation is the more configurable, @c CKOperation -based alternative to this method
     */
    @Generated
    @Selector("discoverUserIdentityWithUserRecordID:completionHandler:")
    public native void discoverUserIdentityWithUserRecordIDCompletionHandler(CKRecordID userRecordID,
            @ObjCBlock(name = "call_discoverUserIdentityWithUserRecordIDCompletionHandler") Block_discoverUserIdentityWithUserRecordIDCompletionHandler completionHandler);

    /**
     * Long lived CKOperations returned by this call must be started on an operation queue.
     * Remember to set the callback blocks before starting the operation.
     * If an operation has already completed against the server, and is subsequently resumed, that operation will replay all of its callbacks from the start of the operation, but the request will not be re-sent to the server.
     * If a long lived operation is cancelled or finishes completely it is no longer returned by these calls.
     */
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

    /**
     * Fetches share participants matching the provided info.
     * <p>
     * [@c] CKFetchShareParticipantsOperation is the more configurable, @c CKOperation -based alternative to these methods.
     */
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

    /**
     * If there is no iCloud account configured, or if access is restricted, a @c CKErrorNotAuthenticated error will be returned.
     * <p>
     * This work is treated as having @c NSQualityOfServiceUserInitiated quality of service.
     */
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
        void call_acceptShareMetadataCompletionHandler(CKShare acceptedShare, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accountStatusWithCompletionHandler {
        @Generated
        void call_accountStatusWithCompletionHandler(@NInt long accountStatus, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverAllIdentitiesWithCompletionHandler {
        @Generated
        void call_discoverAllIdentitiesWithCompletionHandler(NSArray<? extends CKUserIdentity> userIdentities,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithEmailAddressCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithEmailAddressCompletionHandler(CKUserIdentity userInfo, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithPhoneNumberCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithPhoneNumberCompletionHandler(CKUserIdentity userInfo, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithUserRecordIDCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithUserRecordIDCompletionHandler(CKUserIdentity userInfo, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllLongLivedOperationIDsWithCompletionHandler {
        @Generated
        void call_fetchAllLongLivedOperationIDsWithCompletionHandler(NSArray<String> outstandingOperationIDs,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchLongLivedOperationWithIDCompletionHandler {
        @Generated
        void call_fetchLongLivedOperationWithIDCompletionHandler(CKOperation outstandingOperation, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareMetadataWithURLCompletionHandler {
        @Generated
        void call_fetchShareMetadataWithURLCompletionHandler(CKShareMetadata metadata, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithEmailAddressCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithEmailAddressCompletionHandler(CKShareParticipant shareParticipant,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithPhoneNumberCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithPhoneNumberCompletionHandler(CKShareParticipant shareParticipant,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithUserRecordIDCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithUserRecordIDCompletionHandler(CKShareParticipant shareParticipant,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchUserRecordIDWithCompletionHandler {
        @Generated
        void call_fetchUserRecordIDWithCompletionHandler(CKRecordID recordID, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestApplicationPermissionCompletionHandler {
        @Generated
        void call_requestApplicationPermissionCompletionHandler(@NInt long applicationPermissionStatus, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_statusForApplicationPermissionCompletionHandler {
        @Generated
        void call_statusForApplicationPermissionCompletionHandler(@NInt long applicationPermissionStatus,
                NSError error);
    }
}
