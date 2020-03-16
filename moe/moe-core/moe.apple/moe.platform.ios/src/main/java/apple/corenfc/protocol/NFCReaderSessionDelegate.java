package apple.corenfc.protocol;

import apple.corenfc.NFCReaderSession;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCReaderSessionDelegate")
public interface NFCReaderSessionDelegate {
    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(NFCReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(NFCReaderSession session, NSError error);

    @Generated
    @Selector("readerSessionDidBecomeActive:")
    void readerSessionDidBecomeActive(NFCReaderSession session);
}