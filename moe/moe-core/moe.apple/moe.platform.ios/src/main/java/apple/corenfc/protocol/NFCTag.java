package apple.corenfc.protocol;

import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCTag")
public interface NFCTag extends NSSecureCoding, NSCopying {
    @Generated
    @Selector("asNFCFeliCaTag")
    @MappedReturn(ObjCObjectMapper.class)
    Object asNFCFeliCaTag();

    @Generated
    @Selector("asNFCISO15693Tag")
    @MappedReturn(ObjCObjectMapper.class)
    Object asNFCISO15693Tag();

    @Generated
    @Selector("asNFCISO7816Tag")
    @MappedReturn(ObjCObjectMapper.class)
    Object asNFCISO7816Tag();

    @Generated
    @Selector("asNFCMiFareTag")
    @MappedReturn(ObjCObjectMapper.class)
    Object asNFCMiFareTag();

    @Generated
    @Selector("isAvailable")
    boolean isAvailable();

    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    Object session();

    @Generated
    @Selector("type")
    @NUInt
    long type();
}