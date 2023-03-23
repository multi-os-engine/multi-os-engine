package apple.cloudkit.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Formalizes a protocol for getting and setting keys on a CKRecord. Not intended to be used directly by client code
 * 
 * API-Since: 9.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CKRecordKeyValueSetting")
public interface CKRecordKeyValueSetting {
    @Generated
    @Selector("allKeys")
    NSArray<String> allKeys();

    @Generated
    @Selector("changedKeys")
    NSArray<String> changedKeys();

    @Generated
    @Selector("objectForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    CKRecordValue objectForKey(String key);

    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    CKRecordValue objectForKeyedSubscript(String key);

    @Generated
    @Selector("setObject:forKey:")
    void setObjectForKey(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);
}