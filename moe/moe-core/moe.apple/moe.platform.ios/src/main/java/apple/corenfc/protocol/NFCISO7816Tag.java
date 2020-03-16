package apple.corenfc.protocol;

import apple.corenfc.NFCISO7816APDU;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCISO7816Tag")
public interface NFCISO7816Tag extends NFCTag, NFCNDEFTag {
    @Generated
    @Selector("applicationData")
    NSData applicationData();

    @Generated
    @Selector("historicalBytes")
    NSData historicalBytes();

    @Generated
    @Selector("identifier")
    NSData identifier();

    @Generated
    @Selector("initialSelectedAID")
    String initialSelectedAID();

    @Generated
    @Selector("proprietaryApplicationDataCoding")
    boolean proprietaryApplicationDataCoding();

    @Generated
    @Selector("sendCommandAPDU:completionHandler:")
    void sendCommandAPDUCompletionHandler(NFCISO7816APDU apdu,
            @ObjCBlock(name = "call_sendCommandAPDUCompletionHandler") Block_sendCommandAPDUCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendCommandAPDUCompletionHandler {
        @Generated
        void call_sendCommandAPDUCompletionHandler(NSData arg0, byte arg1, byte arg2, NSError arg3);
    }
}