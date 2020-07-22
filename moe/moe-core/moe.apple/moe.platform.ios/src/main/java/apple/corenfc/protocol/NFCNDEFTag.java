package apple.corenfc.protocol;

import apple.corenfc.NFCNDEFMessage;
import apple.foundation.NSError;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
@ObjCProtocolName("NFCNDEFTag")
public interface NFCNDEFTag extends NSSecureCoding, NSCopying {
    @Generated
    @Selector("isAvailable")
    boolean isAvailable();

    @Generated
    @Selector("queryNDEFStatusWithCompletionHandler:")
    void queryNDEFStatusWithCompletionHandler(
            @ObjCBlock(name = "call_queryNDEFStatusWithCompletionHandler") Block_queryNDEFStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryNDEFStatusWithCompletionHandler {
        @Generated
        void call_queryNDEFStatusWithCompletionHandler(@NUInt long status, @NUInt long capacity, NSError error);
    }

    @Generated
    @Selector("readNDEFWithCompletionHandler:")
    void readNDEFWithCompletionHandler(
            @ObjCBlock(name = "call_readNDEFWithCompletionHandler") Block_readNDEFWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readNDEFWithCompletionHandler {
        @Generated
        void call_readNDEFWithCompletionHandler(NFCNDEFMessage arg0, NSError arg1);
    }

    @Generated
    @Selector("writeLockWithCompletionHandler:")
    void writeLockWithCompletionHandler(
            @ObjCBlock(name = "call_writeLockWithCompletionHandler") Block_writeLockWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeLockWithCompletionHandler {
        @Generated
        void call_writeLockWithCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("writeNDEF:completionHandler:")
    void writeNDEFCompletionHandler(NFCNDEFMessage ndefMessage,
            @ObjCBlock(name = "call_writeNDEFCompletionHandler") Block_writeNDEFCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeNDEFCompletionHandler {
        @Generated
        void call_writeNDEFCompletionHandler(NSError arg0);
    }
}