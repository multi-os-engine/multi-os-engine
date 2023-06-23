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
import apple.cloudkit.protocol.CKRecordKeyValueSetting;
import apple.cloudkit.protocol.CKRecordValue;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
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

/**
 * API-Since: 8.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKRecord extends NSObject implements NSSecureCoding, NSCopying, CKRecordKeyValueSetting {
    static {
        NatJ.register();
    }

    @Generated
    protected CKRecord(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKRecord alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKRecord allocWithZone(VoidPtr zone);

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
    public static native CKRecord new_objc();

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

    @NotNull
    @Generated
    @Selector("allKeys")
    public native NSArray<String> allKeys();

    /**
     * A special property that returns an array of token generated from all the string field values in the record.
     * 
     * These tokens have been normalized for the current locale, so they are suitable for performing full-text searches.
     */
    @NotNull
    @Generated
    @Selector("allTokens")
    public native NSArray<String> allTokens();

    @NotNull
    @Generated
    @Selector("changedKeys")
    public native NSArray<String> changedKeys();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Nullable
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * This is a User Record recordID, identifying the user that created this record.
     */
    @Nullable
    @Generated
    @Selector("creatorUserRecordID")
    public native CKRecordID creatorUserRecordID();

    /**
     * [@c] CKRecord supports @c NSSecureCoding. When you invoke @c encodeWithCoder: on a @c CKRecord, it encodes all
     * its values. Including the record values you've set.
     * If you want to store a @c CKRecord instance locally, AND you're already storing the record values locally, that's
     * overkill. In that case, you can use @c encodeSystemFieldsWithCoder:. This will encode all parts of a @c CKRecord
     * except the record keys / values you have access to via the @c changedKeys and @c objectForKey: methods.
     * If you use @c initWithCoder: to reconstitute a @c CKRecord you encoded via @c encodeSystemFieldsWithCoder:, then
     * be aware that
     * - any record values you had set on the original instance, but had not saved, will be lost
     * - the reconstituted CKRecord's @c changedKeys will be empty
     */
    @Generated
    @Selector("encodeSystemFieldsWithCoder:")
    public native void encodeSystemFieldsWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native CKRecord init();

    @Generated
    @Selector("initWithCoder:")
    public native CKRecord initWithCoder(@NotNull NSCoder coder);

    /**
     * This creates the record in the default zone.
     */
    @Generated
    @Selector("initWithRecordType:")
    public native CKRecord initWithRecordType(@NotNull String recordType);

    @Generated
    @Selector("initWithRecordType:recordID:")
    public native CKRecord initWithRecordTypeRecordID(@NotNull String recordType, @NotNull CKRecordID recordID);

    @Generated
    @Selector("initWithRecordType:zoneID:")
    public native CKRecord initWithRecordTypeZoneID(@NotNull String recordType, @NotNull CKRecordZoneID zoneID);

    /**
     * This is a User Record recordID, identifying the user that last modified this record.
     */
    @Nullable
    @Generated
    @Selector("lastModifiedUserRecordID")
    public native CKRecordID lastModifiedUserRecordID();

    @Nullable
    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Nullable
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordValue objectForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordValue objectForKeyedSubscript(@NotNull String key);

    /**
     * Use a parent reference to teach CloudKit about the hierarchy of your records.
     * 
     * When a record is shared, all children of that record are also shared.
     * 
     * A parent record reference must have @c CKReferenceActionNone set. You can create a separate reference with @c
     * CKReferenceActionDeleteSelf if you would like your hierarchy cleaned up when the parent record is deleted.
     * 
     * The target of a parent reference must exist at save time - either already on the server, or part of the same @c
     * CKModifyRecordsOperation batch.
     * 
     * You are encouraged to set up the @c parent relationships as part of normal record saves, even if you're not
     * planning on sharing records at this time.
     * This allows you to share and unshare a hierarchy of records at a later date by only modifying the "top level"
     * record, setting or clearing its @c share reference.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("parent")
    public native CKReference parent();

    /**
     * Change tags are updated by the server to a unique value every time a record is modified. A different change tag
     * necessarily means that the contents of the record are different.
     */
    @Nullable
    @Generated
    @Selector("recordChangeTag")
    public native String recordChangeTag();

    @NotNull
    @Generated
    @Selector("recordID")
    public native CKRecordID recordID();

    @NotNull
    @Generated
    @Selector("recordType")
    public native String recordType();

    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Nullable @Mapped(ObjCObjectMapper.class) CKRecordValue object,
            @NotNull String key);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Nullable @Mapped(ObjCObjectMapper.class) CKRecordValue object,
            @NotNull String key);

    /**
     * Use a parent reference to teach CloudKit about the hierarchy of your records.
     * 
     * When a record is shared, all children of that record are also shared.
     * 
     * A parent record reference must have @c CKReferenceActionNone set. You can create a separate reference with @c
     * CKReferenceActionDeleteSelf if you would like your hierarchy cleaned up when the parent record is deleted.
     * 
     * The target of a parent reference must exist at save time - either already on the server, or part of the same @c
     * CKModifyRecordsOperation batch.
     * 
     * You are encouraged to set up the @c parent relationships as part of normal record saves, even if you're not
     * planning on sharing records at this time.
     * This allows you to share and unshare a hierarchy of records at a later date by only modifying the "top level"
     * record, setting or clearing its @c share reference.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setParent:")
    public native void setParent(@Nullable CKReference value);

    /**
     * Convenience wrappers around creating a @c CKReference to a parent record. The resulting @c CKReference will
     * have @code referenceAction = CKReferenceActionNone @endcode
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setParentReferenceFromRecord:")
    public native void setParentReferenceFromRecord(@Nullable CKRecord parentRecord);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setParentReferenceFromRecordID:")
    public native void setParentReferenceFromRecordID(@Nullable CKRecordID parentRecordID);

    /**
     * The share property on a record can be set by creating a share using @code -[CKShare
     * initWithRootRecord:] @endcode.
     * 
     * The share property on a record will be removed when the corresponding CKShare is deleted from the server. Send
     * this record in the same batch as the share delete and this record's share property will be updated.
     * 
     * Sharing is only supported in zones with the @c CKRecordZoneCapabilitySharing capability. The default zone does
     * not support sharing.
     * 
     * If any records have a parent reference to this record, they are implicitly shared alongside this record.
     * 
     * Note that records in a parent chain must only exist within one share. If a child record already has a share
     * reference set then you will get a @c CKErrorAlreadyShared error if you try to share any of that record's parents.
     * 
     * Child records can be shared independently, even if they have a common parent. For example:
     * Record A has two child records, Record B and Record C.
     * A
     * / \
     * B C
     * 
     * These configurations are supported:
     * - Record A part of Share 1, or
     * - Record B part of Share 1, or
     * - Record C part of Share 1, or
     * - Record B part of Share 1, Record C part of Share 2
     * 
     * These configurations are not supported:
     * Record A part of Share 1, Record B part of Share 2, or
     * -- This is not allowed because Record B would then be in two shares; Share 1 by being Record A's child, and Share
     * 2
     * Record A part of Share 1, Record C part of Share 2, or
     * -- This is not allowed because Record C would then be in two shares; Share 1 by being Record A's child, and Share
     * 2
     * Record A part of Share 1, Record B part of Share 2, Record C part of Share 3
     * -- This is not allowed because both Record B and Record C would then each be in two shares.
     * 
     * Whenever possible, it is suggested that you construct your parent hierarchies such that you will only need to
     * share the topmost record of that hierarchy.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("share")
    public native CKReference share();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Any values set here will be locally encrypted before being saved to the server and locally decrypted when fetched
     * from the server. Encryption and decryption is handled by the CloudKit framework.
     * Key material necessary for decryption are available to the owner of the record, as well as any users that can
     * access this record via a CKShare.
     * All CKRecordValue types can be set here except CKAsset and CKReference.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("encryptedValues")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordKeyValueSetting encryptedValues();
}
