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

    @Generated
    @Selector("allKeys")
    public native NSArray<String> allKeys();

    /**
     * A special property that returns an array of token generated from all the string field values in the record.
     * <p>
     * These tokens have been normalized for the current locale, so they are suitable for performing full-text searches.
     */
    @Generated
    @Selector("allTokens")
    public native NSArray<String> allTokens();

    @Generated
    @Selector("changedKeys")
    public native NSArray<String> changedKeys();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * This is a User Record recordID, identifying the user that created this record.
     */
    @Generated
    @Selector("creatorUserRecordID")
    public native CKRecordID creatorUserRecordID();

    /**
     * [@c] CKRecord supports @c NSSecureCoding.  When you invoke @c encodeWithCoder: on a @c CKRecord, it encodes all its values.  Including the record values you've set.
     * If you want to store a @c CKRecord instance locally, AND you're already storing the record values locally, that's overkill.  In that case, you can use @c encodeSystemFieldsWithCoder:.  This will encode all parts of a @c CKRecord except the record keys / values you have access to via the @c changedKeys and @c objectForKey: methods.
     * If you use @c initWithCoder: to reconstitute a @c CKRecord you encoded via @c encodeSystemFieldsWithCoder:, then be aware that
     * - any record values you had set on the original instance, but had not saved, will be lost
     * - the reconstituted CKRecord's @c changedKeys will be empty
     */
    @Generated
    @Selector("encodeSystemFieldsWithCoder:")
    public native void encodeSystemFieldsWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native CKRecord init();

    @Generated
    @Selector("initWithCoder:")
    public native CKRecord initWithCoder(NSCoder coder);

    /**
     * This creates the record in the default zone.
     */
    @Generated
    @Selector("initWithRecordType:")
    public native CKRecord initWithRecordType(String recordType);

    @Generated
    @Selector("initWithRecordType:recordID:")
    public native CKRecord initWithRecordTypeRecordID(String recordType, CKRecordID recordID);

    @Generated
    @Selector("initWithRecordType:zoneID:")
    public native CKRecord initWithRecordTypeZoneID(String recordType, CKRecordZoneID zoneID);

    /**
     * This is a User Record recordID, identifying the user that last modified this record.
     */
    @Generated
    @Selector("lastModifiedUserRecordID")
    public native CKRecordID lastModifiedUserRecordID();

    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordValue objectForKey(String key);

    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordValue objectForKeyedSubscript(String key);

    /**
     * Use a parent reference to teach CloudKit about the hierarchy of your records.
     * <p>
     * When a record is shared, all children of that record are also shared.
     * <p>
     * A parent record reference must have @c CKReferenceActionNone set. You can create a separate reference with @c CKReferenceActionDeleteSelf if you would like your hierarchy cleaned up when the parent record is deleted.
     * <p>
     * The target of a parent reference must exist at save time - either already on the server, or part of the same @c CKModifyRecordsOperation batch.
     * <p>
     * You are encouraged to set up the @c parent relationships as part of normal record saves, even if you're not planning on sharing records at this time.
     * This allows you to share and unshare a hierarchy of records at a later date by only modifying the "top level" record, setting or clearing its @c share reference.
     */
    @Generated
    @Selector("parent")
    public native CKReference parent();

    /**
     * Change tags are updated by the server to a unique value every time a record is modified.  A different change tag necessarily means that the contents of the record are different.
     */
    @Generated
    @Selector("recordChangeTag")
    public native String recordChangeTag();

    @Generated
    @Selector("recordID")
    public native CKRecordID recordID();

    @Generated
    @Selector("recordType")
    public native String recordType();

    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);

    /**
     * Use a parent reference to teach CloudKit about the hierarchy of your records.
     * <p>
     * When a record is shared, all children of that record are also shared.
     * <p>
     * A parent record reference must have @c CKReferenceActionNone set. You can create a separate reference with @c CKReferenceActionDeleteSelf if you would like your hierarchy cleaned up when the parent record is deleted.
     * <p>
     * The target of a parent reference must exist at save time - either already on the server, or part of the same @c CKModifyRecordsOperation batch.
     * <p>
     * You are encouraged to set up the @c parent relationships as part of normal record saves, even if you're not planning on sharing records at this time.
     * This allows you to share and unshare a hierarchy of records at a later date by only modifying the "top level" record, setting or clearing its @c share reference.
     */
    @Generated
    @Selector("setParent:")
    public native void setParent(CKReference value);

    /**
     * Convenience wrappers around creating a @c CKReference to a parent record. The resulting @c CKReference will have @code referenceAction = CKReferenceActionNone @endcode
     */
    @Generated
    @Selector("setParentReferenceFromRecord:")
    public native void setParentReferenceFromRecord(CKRecord parentRecord);

    @Generated
    @Selector("setParentReferenceFromRecordID:")
    public native void setParentReferenceFromRecordID(CKRecordID parentRecordID);

    /**
     * The share property on a record can be set by creating a share using @code -[CKShare initWithRootRecord:] @endcode.
     * <p>
     * The share property on a record will be removed when the corresponding CKShare is deleted from the server. Send this record in the same batch as the share delete and this record's share property will be updated.
     * <p>
     * Sharing is only supported in zones with the @c CKRecordZoneCapabilitySharing capability. The default zone does not support sharing.
     * <p>
     * If any records have a parent reference to this record, they are implicitly shared alongside this record.
     * <p>
     * Note that records in a parent chain must only exist within one share. If a child record already has a share reference set then you will get a @c CKErrorAlreadyShared error if you try to share any of that record's parents.
     * <p>
     * Child records can be shared independently, even if they have a common parent.  For example:
     * Record A has two child records, Record B and Record C.
     * A
     * / \
     * B   C
     * <p>
     * These configurations are supported:
     * - Record A part of Share 1, or
     * - Record B part of Share 1, or
     * - Record C part of Share 1, or
     * - Record B part of Share 1, Record C part of Share 2
     * <p>
     * These configurations are not supported:
     * Record A part of Share 1, Record B part of Share 2, or
     * -- This is not allowed because Record B would then be in two shares; Share 1 by being Record A's child, and Share 2
     * Record A part of Share 1, Record C part of Share 2, or
     * -- This is not allowed because Record C would then be in two shares; Share 1 by being Record A's child, and Share 2
     * Record A part of Share 1, Record B part of Share 2, Record C part of Share 3
     * -- This is not allowed because both Record B and Record C would then each be in two shares.
     * <p>
     * Whenever possible, it is suggested that you construct your parent hierarchies such that you will only need to share the topmost record of that hierarchy.
     */
    @Generated
    @Selector("share")
    public native CKReference share();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Any values set here will be locally encrypted before being saved to the server and locally decrypted when fetched from the server. Encryption and decryption is handled by the CloudKit framework.
     * Key material necessary for decryption are available to the owner of the record, as well as any users that can access this record via a CKShare.
     * All CKRecordValue types can be set here except CKAsset and CKReference.
     */
    @Generated
    @Selector("encryptedValues")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordKeyValueSetting encryptedValues();
}
