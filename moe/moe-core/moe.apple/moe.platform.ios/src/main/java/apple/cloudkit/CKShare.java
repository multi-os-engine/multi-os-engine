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
 * CKShare
 * 
 * Like CKRecords, CKShares can store arbitrary key-value pairs. They are modified and fetched in the same manner.
 * A share, its root record, and its root record's children records will only appear in a participant's
 * CKFetchRecordChangesOperation's results after the share has been accepted by that participant.
 * Clients have access to the share (and optionally the root record) before accepting a share, via the CKShareMetadata
 * object. Note that in order to access a root record before accepting a share, you must run a
 * CKFetchShareMetadataOperation requesting the root record.
 * A CKShare will appear in a CKFetchRecordChangesOperation's results set whenever the participant list is updated. For
 * that reason, you shouldn't place heavy key-value pairs in it.
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
     */
    @Nullable
    @Generated
    @Selector("URL")
    public native NSURL URL();

    /**
     * If a participant with a matching userIdentity already exists, then that existing participant's properties will be
     * updated; no new participant will be added.
     * In order to modify the list of participants, a share must have publicPermission set to @c
     * CKShareParticipantPermissionNone. That is, you cannot mix-and-match private users and public users in the same
     * share.
     * Only certain participant types may be added via this API
     * 
     * @see CKShareParticipantRole
     */
    @Generated
    @Selector("addParticipant:")
    public native void addParticipant(@NotNull CKShareParticipant participant);

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
     */
    @Generated
    @Selector("initWithRootRecord:")
    public native CKShare initWithRootRecord(@NotNull CKRecord rootRecord);

    @Generated
    @Selector("initWithRootRecord:shareID:")
    public native CKShare initWithRootRecordShareID(@NotNull CKRecord rootRecord, @NotNull CKRecordID shareID);

    /**
     * Convenience methods for fetching special users from the participant array
     */
    @NotNull
    @Generated
    @Selector("owner")
    public native CKShareParticipant owner();

    /**
     * All participants on the share that the current user has permissions to see.
     * 
     * At the minimum that will include the owner and the current user.
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
     */
    @Generated
    @Selector("publicPermission")
    @NInt
    public native long publicPermission();

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
}
