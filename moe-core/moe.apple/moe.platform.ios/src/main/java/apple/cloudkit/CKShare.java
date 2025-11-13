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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This class should not be subclassed. If it is, Sendable may no longer apply.
 * NS_SWIFT_SENDABLE on macos(14.0), ios(17.0), tvos(17.0), watchos(10.0)
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKShare extends CKRecord implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKShare(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKShare alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKShare allocWithZone(VoidPtr zone);

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
    public static native CKShare new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A URL that can be used to invite participants to this share.
     * 
     * Only available after share record has been saved to the server. This url is stable, and is tied to the
     * rootRecord. That is, if you share a rootRecord, delete the share, and re-share the same rootRecord via a newly
     * created share, that newly created share's url will be identical to the prior share's url
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * If a participant with a matching userIdentity already exists, then that existing participant's properties will be
     * updated; no new participant will be added.
     * A ``CKShareParticipant`` instance that has already been added to one ``CKShare`` cannot be added to another,
     * unless it is removed from the first ``CKShare`` through `removeParticipant`.
     * In order to modify the list of participants, a share must have publicPermission set to @c
     * CKShareParticipantPermissionNone. That is, you cannot mix-and-match private users and public users in the same
     * share.
     * 
     * @see CKShareParticipantRole
     * 
     *      API-Since: 10.0
     */
    @Generated
    @Selector("addParticipant:")
    public native void addParticipant(@NotNull CKShareParticipant participant);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("currentUserParticipant")
    public native CKShareParticipant currentUserParticipant();

    @Generated
    @Selector("init")
    public native CKShare init();

    @Generated
    @Selector("initWithCoder:")
    public native CKShare initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithRecordType:")
    public native CKShare initWithRecordType(@NotNull String recordType);

    @Generated
    @Selector("initWithRecordType:recordID:")
    public native CKShare initWithRecordTypeRecordID(@NotNull String recordType, @NotNull CKRecordID recordID);

    @Generated
    @Selector("initWithRecordType:zoneID:")
    public native CKShare initWithRecordTypeZoneID(@NotNull String recordType, @NotNull CKRecordZoneID zoneID);

    /**
     * When saving a newly created CKShare, you must save the share and its rootRecord in the same
     * CKModifyRecordsOperation batch.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithRootRecord:")
    public native CKShare initWithRootRecord(@NotNull CKRecord rootRecord);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithRootRecord:shareID:")
    public native CKShare initWithRootRecordShareID(@NotNull CKRecord rootRecord, @NotNull CKRecordID shareID);

    /**
     * Convenience methods for fetching special users from the participant array
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("owner")
    public native CKShareParticipant owner();

    /**
     * All participants on the share that the current user has permissions to see.
     * 
     * At the minimum that will include the owner and the current user.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("participants")
    public native NSArray<? extends CKShareParticipant> participants();

    /**
     * Defines what permission a user has when not explicitly added to the share.
     * 
     * Shares with @c publicPermission more permissive than @c CKShareParticipantPermissionNone can be joined by any
     * user with access to the share's shareURL.
     * By default, public permission is @c CKShareParticipantPermissionNone.
     * Changing the public permission to @c CKShareParticipantPermissionReadOnly or @c
     * CKShareParticipantPermissionReadWrite will result in all pending participants being removed. Already-accepted
     * participants will remain on the share.
     * Changing the public permission to @c CKShareParticipantPermissionNone will result in all participants being
     * removed from the share. You may subsequently choose to call @c addParticipant: before saving the share, those
     * participants will be added to the share.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("publicPermission")
    @NInt
    public native long publicPermission();

    /**
     * It's not allowed to call `removeParticipant` on a ``CKShare`` with a ``CKShareParticipant`` that has never been
     * added to that share through `addParticipant`.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("removeParticipant:")
    public native void removeParticipant(@NotNull CKShareParticipant participant);

    /**
     * Defines what permission a user has when not explicitly added to the share.
     * 
     * Shares with @c publicPermission more permissive than @c CKShareParticipantPermissionNone can be joined by any
     * user with access to the share's shareURL.
     * By default, public permission is @c CKShareParticipantPermissionNone.
     * Changing the public permission to @c CKShareParticipantPermissionReadOnly or @c
     * CKShareParticipantPermissionReadWrite will result in all pending participants being removed. Already-accepted
     * participants will remain on the share.
     * Changing the public permission to @c CKShareParticipantPermissionNone will result in all participants being
     * removed from the share. You may subsequently choose to call @c addParticipant: before saving the share, those
     * participants will be added to the share.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPublicPermission:")
    public native void setPublicPermission(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Creates a zone-wide @c CKShare. A zone-wide @c CKShare can only exist in a zone with sharing capability @c
     * CKRecordZoneCapabilityZoneWideSharing.
     * Only one such share can exist in a zone at a time.
     * 
     * All records in this zone will appear in a participant's @c CKFetchRecordZoneChangesOperation results in the
     * shared database after the
     * share has been accepted by the participant.
     * 
     * Since these shares do not have an associated root record, @c shouldFetchRootRecord and @c rootRecordDesiredKeys
     * are always ignored when
     * running a @c CKFetchShareMetadataOperation on a zone-wide share URL. Additionally, @c rootRecordID on the
     * resulting @c CKShareMetadata is
     * always absent.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithRecordZoneID:")
    public native CKShare initWithRecordZoneID(@NotNull CKRecordZoneID recordZoneID);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Indicates whether uninvited users can request access to this share.
     * 
     * By default, this property is set to `NO`. When set to `YES`, uninvited users can request
     * access to the share if they discover the share URL. When set to `NO`, the server prevents uninvited users
     * from requesting access and does not indicate whether the share exists.
     * 
     * Only the share owner or an administrator can modify this property. Attempts by other participants
     * to modify this property result in an exception.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("allowsAccessRequests")
    public native boolean allowsAccessRequests();

    /**
     * Blocks specified users from requesting access to this share.
     * 
     * Blocking prevents users from submitting future access requests and removes existing participants from the share.
     * Blocked requesters appear in the ``CloudKit/CKShare/blockedIdentities`` array.
     * 
     * To persist this change, save the share to the server after calling this method.
     * 
     * Only the share owner or an administrator can invoke this method. Attempts by other participants
     * result in an exception.
     * 
     * - Parameter requesters: An array of ``CKShareAccessRequester`` objects to block.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("blockRequesters:")
    public native void blockRequesters(@NotNull NSArray<? extends CKShareAccessRequester> requesters);

    /**
     * A list of users blocked from requesting access to this share.
     * 
     * Identities remain in this list until an owner or administrator calls ``CloudKit/CKShare/unblockIdentities:``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("blockedIdentities")
    @NotNull
    public native NSArray<? extends CKShareBlockedIdentity> blockedIdentities();

    /**
     * Denies access requests from specified users.
     * 
     * Use this method to deny pending access requests from uninvited users. Denied requesters are removed
     * from the ``CloudKit/CKShare/requesters`` array. To persist the changes, save the share to the server
     * after calling this method.
     * 
     * After denial, requesters can still submit new access requests unless explicitly blocked using
     * ``CloudKit/CKShare/blockRequesters:``.
     * 
     * Only the share owner or an administrator can invoke this method. Attempts by other participants
     * result in an exception.
     * 
     * - Parameter requesters: An array of ``CKShareAccessRequester`` objects to deny.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("denyRequesters:")
    public native void denyRequesters(@NotNull NSArray<? extends CKShareAccessRequester> requesters);

    /**
     * Invitation URLs that can be used by any receiver to claim the associated participantID and join the share.
     * 
     * Only available after a share record has been saved to the server for participants created via
     * ``CKShareParticipant/oneTimeURLParticipant``.
     * One-time URLs are stable, and tied to the associated participantIDs as long as the participant is part of the
     * share.
     * Typically, a recipient user invited via their handle is provided a ``URL`` directly by the share's owner.
     * However, any user can also use a one-time URL in the same manner to fetch share metadata and accept the share.
     * After share acceptance, the one-time URL becomes functionally equivalent to the regular ``URL``.
     * 
     * - Parameters:
     * - participantID: The ``CKShareParticipant/participantID`` corresponding to the
     * ``CKShareParticipant/oneTimeURLParticipant`` added to the share.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("oneTimeURLForParticipantID:")
    @Nullable
    public native NSURL oneTimeURLForParticipantID(@NotNull String participantID);

    /**
     * A list of all uninvited users who have requested access to this share.
     * 
     * When share access requests are allowed, uninvited users can request to join the share.
     * All pending access requests appear in this array. Each requester is returned with name components
     * and either an email or phone number.
     * 
     * Either share owners or administrators can respond to these access requests.
     * 
     * ### Responding to Access Requests:
     * 
     * - **Approve Requesters:**
     * - Fetch the participant information by running ``CKFetchShareParticipantsOperation`` with
     * the requester's ``CKShareAccessRequester/participantLookupInfo``.
     * - Add the resulting participant to the share.
     * 
     * - **Deny Requesters:**
     * - Use ``CloudKit/CKShare/denyRequesters:`` to remove the requester from the requesters list.
     * 
     * - **Block Requesters:**
     * - Use ``CloudKit/CKShare/blockRequesters:`` to block requesters.
     * - Blocking a requester prevents them from sending future access requests to the share.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requesters")
    @NotNull
    public native NSArray<? extends CKShareAccessRequester> requesters();

    /**
     * Indicates whether uninvited users can request access to this share.
     * 
     * By default, this property is set to `NO`. When set to `YES`, uninvited users can request
     * access to the share if they discover the share URL. When set to `NO`, the server prevents uninvited users
     * from requesting access and does not indicate whether the share exists.
     * 
     * Only the share owner or an administrator can modify this property. Attempts by other participants
     * to modify this property result in an exception.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAllowsAccessRequests:")
    public native void setAllowsAccessRequests(boolean value);

    /**
     * Unblocks previously blocked users, allowing them to request access again.
     * 
     * Use this method to remove specified identities from the ``CloudKit/CKShare/blockedIdentities`` array.
     * Unblocked identities can request access again if access requests are enabled.
     * 
     * To persist this change, save the share to the server after calling this method.
     * 
     * Only the share owner or an administrator can invoke this method. Attempts by other participants
     * result in an exception.
     * 
     * - Parameter blockedIdentities: An array of ``CKShareBlockedIdentity`` objects to unblock.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("unblockIdentities:")
    public native void unblockIdentities(@NotNull NSArray<? extends CKShareBlockedIdentity> blockedIdentities);
}
