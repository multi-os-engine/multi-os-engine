package apple.corenfc.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCFeliCaTag")
public interface NFCFeliCaTag extends NFCTag, NFCNDEFTag {
    @Generated
    @Selector("currentIDm")
    NSData currentIDm();

    @Generated
    @Selector("currentSystemCode")
    NSData currentSystemCode();

    @Generated
    @Selector("pollingWithSystemCode:requestCode:timeSlot:completionHandler:")
    void pollingWithSystemCodeRequestCodeTimeSlotCompletionHandler(NSData systemCode, @NInt long requestCode,
            @NInt long timeSlot,
            @ObjCBlock(name = "call_pollingWithSystemCodeRequestCodeTimeSlotCompletionHandler") Block_pollingWithSystemCodeRequestCodeTimeSlotCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pollingWithSystemCodeRequestCodeTimeSlotCompletionHandler {
        @Generated
        void call_pollingWithSystemCodeRequestCodeTimeSlotCompletionHandler(NSData pmm, NSData requestData,
                NSError error);
    }

    @Generated
    @Selector("readWithoutEncryptionWithServiceCodeList:blockList:completionHandler:")
    void readWithoutEncryptionWithServiceCodeListBlockListCompletionHandler(NSArray<? extends NSData> serviceCodeList,
            NSArray<? extends NSData> blockList,
            @ObjCBlock(name = "call_readWithoutEncryptionWithServiceCodeListBlockListCompletionHandler") Block_readWithoutEncryptionWithServiceCodeListBlockListCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readWithoutEncryptionWithServiceCodeListBlockListCompletionHandler {
        @Generated
        void call_readWithoutEncryptionWithServiceCodeListBlockListCompletionHandler(@NInt long statusFlag1,
                @NInt long statusFlag2, NSArray<? extends NSData> blockData, NSError error);
    }

    @Generated
    @Selector("requestResponseWithCompletionHandler:")
    void requestResponseWithCompletionHandler(
            @ObjCBlock(name = "call_requestResponseWithCompletionHandler") Block_requestResponseWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestResponseWithCompletionHandler {
        @Generated
        void call_requestResponseWithCompletionHandler(@NInt long mode, NSError error);
    }

    @Generated
    @Selector("requestServiceV2WithNodeCodeList:completionHandler:")
    void requestServiceV2WithNodeCodeListCompletionHandler(NSArray<? extends NSData> nodeCodeList,
            @ObjCBlock(name = "call_requestServiceV2WithNodeCodeListCompletionHandler") Block_requestServiceV2WithNodeCodeListCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestServiceV2WithNodeCodeListCompletionHandler {
        @Generated
        void call_requestServiceV2WithNodeCodeListCompletionHandler(@NInt long statusFlag1, @NInt long statusFlag2,
                @NInt long encryptionIdentifier, NSArray<? extends NSData> nodeKeyVersionListAES,
                NSArray<? extends NSData> nodeKeyVersionListDES, NSError error);
    }

    @Generated
    @Selector("requestServiceWithNodeCodeList:completionHandler:")
    void requestServiceWithNodeCodeListCompletionHandler(NSArray<? extends NSData> nodeCodeList,
            @ObjCBlock(name = "call_requestServiceWithNodeCodeListCompletionHandler") Block_requestServiceWithNodeCodeListCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestServiceWithNodeCodeListCompletionHandler {
        @Generated
        void call_requestServiceWithNodeCodeListCompletionHandler(NSArray<? extends NSData> nodeKeyVersionList,
                NSError error);
    }

    @Generated
    @Selector("requestSpecificationVersionWithCompletionHandler:")
    void requestSpecificationVersionWithCompletionHandler(
            @ObjCBlock(name = "call_requestSpecificationVersionWithCompletionHandler") Block_requestSpecificationVersionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSpecificationVersionWithCompletionHandler {
        @Generated
        void call_requestSpecificationVersionWithCompletionHandler(@NInt long statusFlag1, @NInt long statusFlag2,
                NSData basicVersion, NSData optionVersion, NSError error);
    }

    @Generated
    @Selector("requestSystemCodeWithCompletionHandler:")
    void requestSystemCodeWithCompletionHandler(
            @ObjCBlock(name = "call_requestSystemCodeWithCompletionHandler") Block_requestSystemCodeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestSystemCodeWithCompletionHandler {
        @Generated
        void call_requestSystemCodeWithCompletionHandler(NSArray<? extends NSData> systemCodeList, NSError error);
    }

    @Generated
    @Selector("resetModeWithCompletionHandler:")
    void resetModeWithCompletionHandler(
            @ObjCBlock(name = "call_resetModeWithCompletionHandler") Block_resetModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetModeWithCompletionHandler {
        @Generated
        void call_resetModeWithCompletionHandler(@NInt long statusFlag1, @NInt long statusFlag2, NSError error);
    }

    @Generated
    @Selector("sendFeliCaCommandPacket:completionHandler:")
    void sendFeliCaCommandPacketCompletionHandler(NSData commandPacket,
            @ObjCBlock(name = "call_sendFeliCaCommandPacketCompletionHandler") Block_sendFeliCaCommandPacketCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendFeliCaCommandPacketCompletionHandler {
        @Generated
        void call_sendFeliCaCommandPacketCompletionHandler(NSData responsePacket, NSError error);
    }

    @Generated
    @Selector("writeWithoutEncryptionWithServiceCodeList:blockList:blockData:completionHandler:")
    void writeWithoutEncryptionWithServiceCodeListBlockListBlockDataCompletionHandler(
            NSArray<? extends NSData> serviceCodeList, NSArray<? extends NSData> blockList,
            NSArray<? extends NSData> blockData,
            @ObjCBlock(name = "call_writeWithoutEncryptionWithServiceCodeListBlockListBlockDataCompletionHandler") Block_writeWithoutEncryptionWithServiceCodeListBlockListBlockDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeWithoutEncryptionWithServiceCodeListBlockListBlockDataCompletionHandler {
        @Generated
        void call_writeWithoutEncryptionWithServiceCodeListBlockListBlockDataCompletionHandler(@NInt long statusFlag1,
                @NInt long statusFlag2, NSError error);
    }
}