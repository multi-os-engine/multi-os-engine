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
import apple.foundation.NSDate;

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
public class CKShareParticipant extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKShareParticipant(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKShareParticipant alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKShareParticipant allocWithZone(VoidPtr zone);

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
    public static native CKShareParticipant new_objc();

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
     * API-Since: 10.0
     */
    @Generated
    @Selector("acceptanceStatus")
    @NInt
    public native long acceptanceStatus();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native CKShareParticipant init();

    @Generated
    @Selector("initWithCoder:")
    public native CKShareParticipant initWithCoder(@NotNull NSCoder coder);

    /**
     * The default permission for a new participant is @c CKShareParticipantPermissionReadOnly.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("permission")
    @NInt
    public native long permission();

    /**
     * The default permission for a new participant is @c CKShareParticipantPermissionReadOnly.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPermission:")
    public native void setPermission(@NInt long value);

    /**
     * The default participant type is ``CloudKit/CKShareParticipantType/CKShareParticipantTypePrivateUser``.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("setType:")
    public native void setType(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The default participant type is ``CloudKit/CKShareParticipantType/CKShareParticipantTypePrivateUser``.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("userIdentity")
    public native CKUserIdentity userIdentity();

    /**
     * The default participant role is @c CKShareParticipantRolePrivateUser.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("role")
    @NInt
    public native long role();

    /**
     * The default participant role is @c CKShareParticipantRolePrivateUser.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setRole:")
    public native void setRole(@NInt long value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * A unique identifier for this participant.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("participantID")
    @NotNull
    public native String participantID();

    /**
     * The date and time when the participant was added to the share.
     * 
     * This timestamp is set when the share is successfully saved to the server.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dateAddedToShare")
    @Nullable
    public native NSDate dateAddedToShare();

    /**
     * Indicates whether the participant was originally a requester who was approved to join the share.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isApprovedRequester")
    public native boolean isApprovedRequester();

    /**
     * Generate a unique URL for inviting a participant without knowing their handle
     * 
     * When a participant's email address / phone number / userRecordID isn't known up-front, a
     * ``CKShareParticipant/oneTimeURLParticipant`` can be added
     * to the share. Once the share is saved, a custom invitation link or one-time URL is available for the added
     * participant via ``CKShare/oneTimeURLForParticipantID:``.
     * This custom link can be used by any recipient user to fetch share metadata and accept the share.
     * 
     * Note that a one-time URL participant in the ``ParticipantAcceptanceStatus/pending`` state has empty
     * ``CKUserIdentity/nameComponents``
     * and a nil ``CKUserIdentity/lookupInfo``.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("oneTimeURLParticipant")
    @NotNull
    public static native CKShareParticipant oneTimeURLParticipant();
}
