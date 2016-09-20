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
public class CKRecord extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKRecord(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKRecord alloc();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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

    /**
     * allKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/allKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("allKeys")
    public native NSArray<String> allKeys();

    /**
     * allTokens</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/allTokens">iOS Dev Center</a>
     */
    @Generated
    @Selector("allTokens")
    public native NSArray<String> allTokens();

    /**
     * changedKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/changedKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("changedKeys")
    public native NSArray<String> changedKeys();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * creationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/creationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * creatorUserRecordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/creatorUserRecordID">iOS Dev Center</a>
     */
    @Generated
    @Selector("creatorUserRecordID")
    public native CKRecordID creatorUserRecordID();

    /**
     * encodeSystemFieldsWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/encodeSystemFieldsWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeSystemFieldsWithCoder:")
    public native void encodeSystemFieldsWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native CKRecord init();

    @Generated
    @Selector("initWithCoder:")
    public native CKRecord initWithCoder(NSCoder aDecoder);

    /**
     * initWithRecordType:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/initWithRecordType:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRecordType:")
    public native CKRecord initWithRecordType(String recordType);

    /**
     * initWithRecordType:recordID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/initWithRecordType:recordID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRecordType:recordID:")
    public native CKRecord initWithRecordTypeRecordID(String recordType, CKRecordID recordID);

    /**
     * initWithRecordType:zoneID:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/initWithRecordType:zoneID:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRecordType:zoneID:")
    public native CKRecord initWithRecordTypeZoneID(String recordType, CKRecordZoneID zoneID);

    /**
     * lastModifiedUserRecordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/lastModifiedUserRecordID">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastModifiedUserRecordID")
    public native CKRecordID lastModifiedUserRecordID();

    /**
     * modificationDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/modificationDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    /**
     * objectForKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/objectForKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordValue objectForKey(String key);

    /**
     * objectForKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/objectForKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CKRecordValue objectForKeyedSubscript(String key);

    /**
     * recordChangeTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/recordChangeTag">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordChangeTag")
    public native String recordChangeTag();

    /**
     * recordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/recordID">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordID")
    public native CKRecordID recordID();

    /**
     * recordType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instp/CKRecord/recordType">iOS Dev Center</a>
     */
    @Generated
    @Selector("recordType")
    public native String recordType();

    /**
     * setObject:forKey:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/setObject:forKey:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKey:")
    public native void setObjectForKey(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);

    /**
     * setObject:forKeyedSubscript:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKRecord_class/index.html#//apple_ref/occ/instm/CKRecord/setObject:forKeyedSubscript:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
