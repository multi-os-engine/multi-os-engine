package apple.corenfc.protocol;

import apple.corenfc.NFCISO15693CustomCommandConfiguration;
import apple.corenfc.NFCISO15693ReadMultipleBlocksConfiguration;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCISO15693Tag")
public interface NFCISO15693Tag extends NFCTag, NFCNDEFTag {
    @Generated
    @Selector("customCommandWithRequestFlag:customCommandCode:customRequestParameters:completionHandler:")
    void customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler(byte flags,
            @NInt long customCommandCode, NSData customRequestParameters,
            @ObjCBlock(name = "call_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler") Block_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler {
        @Generated
        void call_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler(NSData arg0,
                NSError arg1);
    }

    @Generated
    @Selector("extendedLockBlockWithRequestFlags:blockNumber:completionHandler:")
    void extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, @NInt long blockNumber,
            @ObjCBlock(name = "call_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler") Block_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("extendedReadMultipleBlocksWithRequestFlags:blockRange:completionHandler:")
    void extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(byte flags, @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler") Block_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler {
        @Generated
        void call_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(NSArray<? extends NSData> arg0,
                NSError arg1);
    }

    @Generated
    @Selector("extendedReadSingleBlockWithRequestFlags:blockNumber:completionHandler:")
    void extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, @NInt long blockNumber,
            @ObjCBlock(name = "call_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler") Block_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("extendedWriteSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:")
    void extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(byte flags,
            @NInt long blockNumber, NSData dataBlock,
            @ObjCBlock(name = "call_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler") Block_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler {
        @Generated
        void call_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("getMultipleBlockSecurityStatusWithRequestFlag:blockRange:completionHandler:")
    void getMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler(byte flags,
            @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_getMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler") Block_getMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler {
        @Generated
        void call_getMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler(
                NSArray<? extends NSNumber> arg0, NSError arg1);
    }

    @Generated
    @Selector("getSystemInfoWithRequestFlag:completionHandler:")
    void getSystemInfoWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_getSystemInfoWithRequestFlagCompletionHandler") Block_getSystemInfoWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSystemInfoWithRequestFlagCompletionHandler {
        @Generated
        void call_getSystemInfoWithRequestFlagCompletionHandler(@NInt long arg0, @NInt long arg1, @NInt long arg2,
                @NInt long arg3, @NInt long arg4, NSError arg5);
    }

    @Generated
    @Selector("icManufacturerCode")
    @NUInt
    long icManufacturerCode();

    @Generated
    @Selector("icSerialNumber")
    NSData icSerialNumber();

    @Generated
    @Selector("identifier")
    NSData identifier();

    @Generated
    @Selector("lockAFIWithRequestFlag:completionHandler:")
    void lockAFIWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_lockAFIWithRequestFlagCompletionHandler") Block_lockAFIWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockAFIWithRequestFlagCompletionHandler {
        @Generated
        void call_lockAFIWithRequestFlagCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("lockBlockWithRequestFlags:blockNumber:completionHandler:")
    void lockBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, byte blockNumber,
            @ObjCBlock(name = "call_lockBlockWithRequestFlagsBlockNumberCompletionHandler") Block_lockBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_lockBlockWithRequestFlagsBlockNumberCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("lockDFSIDWithRequestFlag:completionHandler:")
    void lockDFSIDWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_lockDFSIDWithRequestFlagCompletionHandler") Block_lockDFSIDWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDFSIDWithRequestFlagCompletionHandler {
        @Generated
        void call_lockDFSIDWithRequestFlagCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("readMultipleBlocksWithConfiguration:completionHandler:")
    void readMultipleBlocksWithConfigurationCompletionHandler(
            NFCISO15693ReadMultipleBlocksConfiguration readConfiguration,
            @ObjCBlock(name = "call_readMultipleBlocksWithConfigurationCompletionHandler") Block_readMultipleBlocksWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readMultipleBlocksWithConfigurationCompletionHandler {
        @Generated
        void call_readMultipleBlocksWithConfigurationCompletionHandler(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("readMultipleBlocksWithRequestFlags:blockRange:completionHandler:")
    void readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(byte flags, @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler") Block_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler {
        @Generated
        void call_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(NSArray<? extends NSData> arg0,
                NSError arg1);
    }

    @Generated
    @Selector("readSingleBlockWithRequestFlags:blockNumber:completionHandler:")
    void readSingleBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, byte blockNumber,
            @ObjCBlock(name = "call_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler") Block_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("resetToReadyWithRequestFlags:completionHandler:")
    void resetToReadyWithRequestFlagsCompletionHandler(byte flags,
            @ObjCBlock(name = "call_resetToReadyWithRequestFlagsCompletionHandler") Block_resetToReadyWithRequestFlagsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetToReadyWithRequestFlagsCompletionHandler {
        @Generated
        void call_resetToReadyWithRequestFlagsCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("selectWithRequestFlags:completionHandler:")
    void selectWithRequestFlagsCompletionHandler(byte flags,
            @ObjCBlock(name = "call_selectWithRequestFlagsCompletionHandler") Block_selectWithRequestFlagsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectWithRequestFlagsCompletionHandler {
        @Generated
        void call_selectWithRequestFlagsCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("sendCustomCommandWithConfiguration:completionHandler:")
    void sendCustomCommandWithConfigurationCompletionHandler(NFCISO15693CustomCommandConfiguration commandConfiguration,
            @ObjCBlock(name = "call_sendCustomCommandWithConfigurationCompletionHandler") Block_sendCustomCommandWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendCustomCommandWithConfigurationCompletionHandler {
        @Generated
        void call_sendCustomCommandWithConfigurationCompletionHandler(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("stayQuietWithCompletionHandler:")
    void stayQuietWithCompletionHandler(
            @ObjCBlock(name = "call_stayQuietWithCompletionHandler") Block_stayQuietWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stayQuietWithCompletionHandler {
        @Generated
        void call_stayQuietWithCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("writeAFIWithRequestFlag:afi:completionHandler:")
    void writeAFIWithRequestFlagAfiCompletionHandler(byte flags, byte afi,
            @ObjCBlock(name = "call_writeAFIWithRequestFlagAfiCompletionHandler") Block_writeAFIWithRequestFlagAfiCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAFIWithRequestFlagAfiCompletionHandler {
        @Generated
        void call_writeAFIWithRequestFlagAfiCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("writeDSFIDWithRequestFlag:dsfid:completionHandler:")
    void writeDSFIDWithRequestFlagDsfidCompletionHandler(byte flags, byte dsfid,
            @ObjCBlock(name = "call_writeDSFIDWithRequestFlagDsfidCompletionHandler") Block_writeDSFIDWithRequestFlagDsfidCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDSFIDWithRequestFlagDsfidCompletionHandler {
        @Generated
        void call_writeDSFIDWithRequestFlagDsfidCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("writeMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:")
    void writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler(byte flags,
            @ByValue NSRange blockRange, NSArray<? extends NSData> dataBlocks,
            @ObjCBlock(name = "call_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler") Block_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler {
        @Generated
        void call_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler(NSError arg0);
    }

    @Generated
    @Selector("writeSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:")
    void writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(byte flags, byte blockNumber,
            NSData dataBlock,
            @ObjCBlock(name = "call_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler") Block_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler {
        @Generated
        void call_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(NSError arg0);
    }
}