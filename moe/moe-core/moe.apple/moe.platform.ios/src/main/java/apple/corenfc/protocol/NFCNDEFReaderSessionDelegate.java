package apple.corenfc.protocol;

import apple.corenfc.NFCNDEFMessage;
import apple.corenfc.NFCNDEFReaderSession;
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
@ObjCProtocolName("NFCNDEFReaderSessionDelegate")
public interface NFCNDEFReaderSessionDelegate {
    @Generated
    @Selector("readerSession:didDetectNDEFs:")
    void readerSessionDidDetectNDEFs(NFCNDEFReaderSession session, NSArray<? extends NFCNDEFMessage> messages);

    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(NFCNDEFReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(NFCNDEFReaderSession session, NSError error);

    @Generated
    @IsOptional
    @Selector("readerSessionDidBecomeActive:")
    default void readerSessionDidBecomeActive(NFCNDEFReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}