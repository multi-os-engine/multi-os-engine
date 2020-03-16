package apple.corenfc.protocol;

import apple.corenfc.NFCTagReaderSession;
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
@ObjCProtocolName("NFCTagReaderSessionDelegate")
public interface NFCTagReaderSessionDelegate {
    @Generated
    @IsOptional
    @Selector("tagReaderSession:didDetectTags:")
    default void tagReaderSessionDidDetectTags(NFCTagReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("tagReaderSession:didInvalidateWithError:")
    void tagReaderSessionDidInvalidateWithError(NFCTagReaderSession session, NSError error);

    @Generated
    @IsOptional
    @Selector("tagReaderSessionDidBecomeActive:")
    default void tagReaderSessionDidBecomeActive(NFCTagReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}