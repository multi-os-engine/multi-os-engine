package apple.corenfc.protocol;

import apple.corenfc.NFCVASReaderSession;
import apple.corenfc.NFCVASResponse;
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
@ObjCProtocolName("NFCVASReaderSessionDelegate")
public interface NFCVASReaderSessionDelegate {
    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(NFCVASReaderSession session, NSError error);

    @Generated
    @Selector("readerSession:didReceiveVASResponses:")
    void readerSessionDidReceiveVASResponses(NFCVASReaderSession session, NSArray<? extends NFCVASResponse> responses);

    @Generated
    @IsOptional
    @Selector("readerSessionDidBecomeActive:")
    default void readerSessionDidBecomeActive(NFCVASReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}