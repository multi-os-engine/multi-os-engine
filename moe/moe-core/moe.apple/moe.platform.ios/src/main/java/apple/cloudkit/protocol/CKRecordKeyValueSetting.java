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
    Object objectForKey(String key);

    @Generated
    @Selector("objectForKeyedSubscript:")
    @MappedReturn(ObjCObjectMapper.class)
    Object objectForKeyedSubscript(String key);

    @Generated
    @Selector("setObject:forKey:")
    void setObjectForKey(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);

    @Generated
    @Selector("setObject:forKeyedSubscript:")
    void setObjectForKeyedSubscript(@Mapped(ObjCObjectMapper.class) CKRecordValue object, String key);
}