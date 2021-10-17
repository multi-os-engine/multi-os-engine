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

/**
 * [@protocol] NFCTag
 * <p>
 * A NFC / RFID tag object conforms to this protocol.  The NFCReaderSession returns an instance of this type when a tag is detected.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCTag")
public interface NFCTag extends NSSecureCoding, NSCopying {
    /**
     * [@property] asNFCFeliCaTag
     * <p>
     * Returns nil if tag does not conform to NFCFeliCaTag.
     */
    @Generated
    @Selector("asNFCFeliCaTag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCFeliCaTag asNFCFeliCaTag();

    /**
     * asNFCISO15693Tag
     *
     * @return Returns self if it conforms to the NFCISO15693Tag protocol; else returns nil.
     */
    @Generated
    @Selector("asNFCISO15693Tag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCISO15693Tag asNFCISO15693Tag();

    /**
     * asNFCISO7816Tag
     *
     * @return Returns self if it conforms to the NFCISO7816Tag protocol; else returns nil.
     */
    @Generated
    @Selector("asNFCISO7816Tag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCISO7816Tag asNFCISO7816Tag();

    /**
     * [@property] asNFCMiFareTag
     * <p>
     * Returns nil if tag does not conform to NFCMiFareTag.
     */
    @Generated
    @Selector("asNFCMiFareTag")
    @MappedReturn(ObjCObjectMapper.class)
    NFCMiFareTag asNFCMiFareTag();

    /**
     * [@property] available:
     * <p>
     * Check whether a detected tag is available.
     *
     * @return <i>YES</i> if tag is available in the current reader session.  A tag remove from the RF field will become
     * unavailable.  Tag in disconnected state will return NO.
     */
    @Generated
    @Selector("isAvailable")
    boolean isAvailable();

    /**
     * [@property]    session
     * <p>
     * Session that provides this tag.
     */
    @Generated
    @Selector("session")
    @MappedReturn(ObjCObjectMapper.class)
    NFCReaderSession session();

    /**
     * [@property] type
     * <p>
     * See @link CNFCTagType @link/
     */
    @Generated
    @Selector("type")
    @NUInt
    long type();
}
