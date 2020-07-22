package apple.corenfc.protocol;

import apple.corenfc.NFCISO7816APDU;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCMiFareTag")
public interface NFCMiFareTag extends NFCTag, NFCNDEFTag {
    @Generated
    @Selector("historicalBytes")
    NSData historicalBytes();

    @Generated
    @Selector("identifier")
    NSData identifier();

    @Generated
    @Selector("mifareFamily")
    @NUInt
    long mifareFamily();

    @Generated
    @Selector("sendMiFareCommand:completionHandler:")
    void sendMiFareCommandCompletionHandler(NSData command,
            @ObjCBlock(name = "call_sendMiFareCommandCompletionHandler") Block_sendMiFareCommandCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMiFareCommandCompletionHandler {
        @Generated
        void call_sendMiFareCommandCompletionHandler(NSData response, NSError error);
    }

    @Generated
    @Selector("sendMiFareISO7816Command:completionHandler:")
    void sendMiFareISO7816CommandCompletionHandler(NFCISO7816APDU apdu,
            @ObjCBlock(name = "call_sendMiFareISO7816CommandCompletionHandler") Block_sendMiFareISO7816CommandCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMiFareISO7816CommandCompletionHandler {
        @Generated
        void call_sendMiFareISO7816CommandCompletionHandler(NSData responseData, byte sw1, byte sw2, NSError error);
    }
}