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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class should not be subclassed. If it is, Sendable may no longer apply.
 * 
 * API-Since: 8.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKContainer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Obtain a CKContainer for the given containerIdentifier
     * 
     * If the application is in production mode (aka, @c com.apple.developer.icloud-container-environment is set to
     * Production in your entitlements plist, and you have no override in @c
     * com.apple.developer.icloud-container-development-container-identifiers), then the production environment is used.
     */
    @NotNull
    @Generated
    @Selector("containerWithIdentifier:")
    public static native CKContainer containerWithIdentifier(@NotNull String containerIdentifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Convenience method that uses the calling process' "iCloud.\(application-identifier)" as the container identifier
     * 
     * application-identifier is the calling process' @c application-identifier entitlement on iOS / tvOS / watchOS.
     * application-identifier is the calling process' @c com.apple.application-identifier entitlement on macOS.
     * On all OSes, if an @c com.apple.developer.associated-application-identifier entitlement is present, its value
     * will be preferred over the @c application-identifier variants.
     */
    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

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

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("acceptShareMetadata:completionHandler:")
    public native void acceptShareMetadataCompletionHandler(@NotNull CKShareMetadata metadata,
            @NotNull @ObjCBlock(name = "call_acceptShareMetadataCompletionHandler") Block_acceptShareMetadataCompletionHandler completionHandler);

    @Generated
    @Selector("accountStatusWithCompletionHandler:")
    public native void accountStatusWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_accountStatusWithCompletionHandler") Block_accountStatusWithCompletionHandler completionHandler);

    @Generated
    @Selector("addOperation:")
    public native void addOperation(@NotNull CKOperation operation);

    @Nullable
    @Generated
    @Selector("containerIdentifier")
    public native String containerIdentifier();

    /**
     * Convenience methods
     * 
     * @return a database that's pointer-equal to one of the above properties@enum
     * 
     *         API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("databaseWithDatabaseScope:")
    public native CKDatabase databaseWithDatabaseScope(@NInt long databaseScope);

    /**
     * Fetches all user identities that match an entry in the user's contacts database.
     * 
     * [@c] CKDiscoverAllUserIdentitiesOperation is the more configurable, @c CKOperation -based alternative to this
     * methods
     * 
     * API-Since: 10.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated
    @Generated
    @Selector("discoverAllIdentitiesWithCompletionHandler:")
    public native void discoverAllIdentitiesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_discoverAllIdentitiesWithCompletionHandler") Block_discoverAllIdentitiesWithCompletionHandler completionHandler);

    /**
     * Fetches the user identity that corresponds to the given email address.
     * 
     * Only users who have opted-in to user discoverability will have their identities returned by this method. If a
     * user with the inputted email exists in iCloud, but has not opted-in to user discoverability, this method
     * completes with a nil @c userInfo. @c CKDiscoverUserIdentitiesOperation is the more configurable, @c CKOperation
     * -based alternative to this method
     * 
     * API-Since: 10.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated
    @Generated
    @Selector("discoverUserIdentityWithEmailAddress:completionHandler:")
    public native void discoverUserIdentityWithEmailAddressCompletionHandler(@NotNull String email,
            @NotNull @ObjCBlock(name = "call_discoverUserIdentityWithEmailAddressCompletionHandler") Block_discoverUserIdentityWithEmailAddressCompletionHandler completionHandler);

    /**
     * Fetches the user identity that corresponds to the given phone number.
     * 
     * Only users who have opted-in to user discoverability will have their identities returned by this method. If a
     * user with the inputted phone number exists in iCloud, but has not opted-in to user discoverability, this method
     * completes with a nil @c userInfo. @c CKDiscoverUserIdentitiesOperation is the more configurable, @c CKOperation
     * -based alternative to this method
     * 
     * API-Since: 10.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated
    @Generated
    @Selector("discoverUserIdentityWithPhoneNumber:completionHandler:")
    public native void discoverUserIdentityWithPhoneNumberCompletionHandler(@NotNull String phoneNumber,
            @NotNull @ObjCBlock(name = "call_discoverUserIdentityWithPhoneNumberCompletionHandler") Block_discoverUserIdentityWithPhoneNumberCompletionHandler completionHandler);

    /**
     * Fetches the user identity that corresponds to the given user record id.
     * 
     * Only users who have opted-in to user discoverability will have their identities returned by this method. If a
     * user has not opted-in to user discoverability, this method completes with a nil @c userInfo. @c
     * CKDiscoverUserIdentitiesOperation is the more configurable, @c CKOperation -based alternative to this method
     * 
     * API-Since: 10.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated
    @Generated
    @Selector("discoverUserIdentityWithUserRecordID:completionHandler:")
    public native void discoverUserIdentityWithUserRecordIDCompletionHandler(@NotNull CKRecordID userRecordID,
            @NotNull @ObjCBlock(name = "call_discoverUserIdentityWithUserRecordIDCompletionHandler") Block_discoverUserIdentityWithUserRecordIDCompletionHandler completionHandler);

    /**
     * Long lived CKOperations returned by this call must be started on an operation queue.
     * Remember to set the callback blocks before starting the operation.
     * If an operation has already completed against the server, and is subsequently resumed, that operation will replay
     * all of its callbacks from the start of the operation, but the request will not be re-sent to the server.
     * If a long lived operation is cancelled or finishes completely it is no longer returned by these calls.
     * 
     * API-Since: 9.3
     */
    @Generated
    @Selector("fetchAllLongLivedOperationIDsWithCompletionHandler:")
    public native void fetchAllLongLivedOperationIDsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_fetchAllLongLivedOperationIDsWithCompletionHandler") Block_fetchAllLongLivedOperationIDsWithCompletionHandler completionHandler);

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("fetchLongLivedOperationWithID:completionHandler:")
    public native void fetchLongLivedOperationWithIDCompletionHandler(@NotNull String operationID,
            @NotNull @ObjCBlock(name = "call_fetchLongLivedOperationWithIDCompletionHandler") Block_fetchLongLivedOperationWithIDCompletionHandler completionHandler);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("fetchShareMetadataWithURL:completionHandler:")
    public native void fetchShareMetadataWithURLCompletionHandler(@NotNull NSURL url,
            @NotNull @ObjCBlock(name = "call_fetchShareMetadataWithURLCompletionHandler") Block_fetchShareMetadataWithURLCompletionHandler completionHandler);

    /**
     * Fetches share participants matching the provided info.
     * 
     * [@c] CKFetchShareParticipantsOperation is the more configurable, @c CKOperation -based alternative to these
     * methods.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("fetchShareParticipantWithEmailAddress:completionHandler:")
    public native void fetchShareParticipantWithEmailAddressCompletionHandler(@NotNull String emailAddress,
            @NotNull @ObjCBlock(name = "call_fetchShareParticipantWithEmailAddressCompletionHandler") Block_fetchShareParticipantWithEmailAddressCompletionHandler completionHandler);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("fetchShareParticipantWithPhoneNumber:completionHandler:")
    public native void fetchShareParticipantWithPhoneNumberCompletionHandler(@NotNull String phoneNumber,
            @NotNull @ObjCBlock(name = "call_fetchShareParticipantWithPhoneNumberCompletionHandler") Block_fetchShareParticipantWithPhoneNumberCompletionHandler completionHandler);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("fetchShareParticipantWithUserRecordID:completionHandler:")
    public native void fetchShareParticipantWithUserRecordIDCompletionHandler(@NotNull CKRecordID userRecordID,
            @NotNull @ObjCBlock(name = "call_fetchShareParticipantWithUserRecordIDCompletionHandler") Block_fetchShareParticipantWithUserRecordIDCompletionHandler completionHandler);

    /**
     * If there is no iCloud account configured, or if access is restricted, a @c CKErrorNotAuthenticated error will be
     * returned.
     * 
     * This work is treated as having @c NSQualityOfServiceUserInitiated quality of service.
     */
    @Generated
    @Selector("fetchUserRecordIDWithCompletionHandler:")
    public native void fetchUserRecordIDWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_fetchUserRecordIDWithCompletionHandler") Block_fetchUserRecordIDWithCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native CKContainer init();

    @NotNull
    @Generated
    @Selector("privateCloudDatabase")
    public native CKDatabase privateCloudDatabase();

    @NotNull
    @Generated
    @Selector("publicCloudDatabase")
    public native CKDatabase publicCloudDatabase();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated
    @Generated
    @Selector("requestApplicationPermission:completionHandler:")
    public native void requestApplicationPermissionCompletionHandler(@NUInt long applicationPermission,
            @NotNull @ObjCBlock(name = "call_requestApplicationPermissionCompletionHandler") Block_requestApplicationPermissionCompletionHandler completionHandler);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("sharedCloudDatabase")
    public native CKDatabase sharedCloudDatabase();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated
    @Generated
    @Selector("statusForApplicationPermission:completionHandler:")
    public native void statusForApplicationPermissionCompletionHandler(@NUInt long applicationPermission,
            @NotNull @ObjCBlock(name = "call_statusForApplicationPermissionCompletionHandler") Block_statusForApplicationPermissionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_acceptShareMetadataCompletionHandler {
        @Generated
        void call_acceptShareMetadataCompletionHandler(@Nullable CKShare acceptedShare, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_accountStatusWithCompletionHandler {
        @Generated
        void call_accountStatusWithCompletionHandler(@NInt long accountStatus, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverAllIdentitiesWithCompletionHandler {
        @Generated
        void call_discoverAllIdentitiesWithCompletionHandler(@Nullable NSArray<? extends CKUserIdentity> userIdentities,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithEmailAddressCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithEmailAddressCompletionHandler(@Nullable CKUserIdentity userInfo,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithPhoneNumberCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithPhoneNumberCompletionHandler(@Nullable CKUserIdentity userInfo,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_discoverUserIdentityWithUserRecordIDCompletionHandler {
        @Generated
        void call_discoverUserIdentityWithUserRecordIDCompletionHandler(@Nullable CKUserIdentity userInfo,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchAllLongLivedOperationIDsWithCompletionHandler {
        @Generated
        void call_fetchAllLongLivedOperationIDsWithCompletionHandler(@Nullable NSArray<String> outstandingOperationIDs,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchLongLivedOperationWithIDCompletionHandler {
        @Generated
        void call_fetchLongLivedOperationWithIDCompletionHandler(@Nullable CKOperation outstandingOperation,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareMetadataWithURLCompletionHandler {
        @Generated
        void call_fetchShareMetadataWithURLCompletionHandler(@Nullable CKShareMetadata metadata,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithEmailAddressCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithEmailAddressCompletionHandler(@Nullable CKShareParticipant shareParticipant,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithPhoneNumberCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithPhoneNumberCompletionHandler(@Nullable CKShareParticipant shareParticipant,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchShareParticipantWithUserRecordIDCompletionHandler {
        @Generated
        void call_fetchShareParticipantWithUserRecordIDCompletionHandler(@Nullable CKShareParticipant shareParticipant,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchUserRecordIDWithCompletionHandler {
        @Generated
        void call_fetchUserRecordIDWithCompletionHandler(@Nullable CKRecordID recordID, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestApplicationPermissionCompletionHandler {
        @Generated
        void call_requestApplicationPermissionCompletionHandler(@NInt long applicationPermissionStatus,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_statusForApplicationPermissionCompletionHandler {
        @Generated
        void call_statusForApplicationPermissionCompletionHandler(@NInt long applicationPermissionStatus,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
