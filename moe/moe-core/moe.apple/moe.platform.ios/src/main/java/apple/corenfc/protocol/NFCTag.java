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
    NFCFeliCaTag asNFCFeliCaTag();

    @Generated
    @Selector("asNFCISO15693Tag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCISO15693Tag asNFCISO15693Tag();

    @Generated
    @Selector("asNFCISO7816Tag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCISO7816Tag asNFCISO7816Tag();

    @Generated
    @Selector("asNFCMiFareTag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCMiFareTag asNFCMiFareTag();

    @Generated
    @Selector("isAvailable")
    boolean isAvailable();

    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    NFCReaderSession session();

    @Generated
    @Selector("type")
    @NUInt
    long type();
}