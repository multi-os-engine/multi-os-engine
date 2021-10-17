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

/**
 * [@protocol] NFCISO15693Tag
 * <p>
 * A @link NFCISO15693ReaderSession @link/ or @link NFCTagReaderSession @link/ reader session returns an instance conforming
 * to this protocol when an ISO15693 tag is detected.  Unless it is specified all block completion handlers are dispatched on the
 * reader session work queue that is associated with the tag.  Your process requires to include the "com.apple.developer.nfc.readersession.formats"
 * entitlement to receive this tag object from the @link NFCReaderSessionDelegate @link/ delegate.
 * [@link] NFCReaderErrorSecurityViolation @link/ will be returned from the @link NFCTagReaderSessionDelegate @link/ invalidation method if the required
 * entitlement is missing when session is started.
 * Tag must be in the connected state for NFCNDEFTag protocol properties and methods to work correctly.  Each data frame send out by the reader may not
 * exceed 256 bytes total.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCISO15693Tag")
public interface NFCISO15693Tag extends NFCTag, NFCNDEFTag {
    /**
     * customCommandWithRequestFlag:customCommandCode:customRequestParameters:completionHandler:
     * <p>
     * Custom command (0xA0 to 0xDF command code) as defined in ISO15693-3 specification.  IC manufacturer code from the tag is
     * automatically inserted after the command byte before appending the custom request parameters in forming the packet.
     *
     * @param flags                   Request flags.
     * @param customCommandCode       Custom command code defined by the IC manufacturer.  Valid range is 0xA0 to 0xDF inclusively.
     * @param customRequestParameters Custom request parameters defined by the command.
     * @param completionHandler       Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                                A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                                A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                                responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                                The custom reponse parameters are returned on success.
     */
    @Generated
    @Selector("customCommandWithRequestFlag:customCommandCode:customRequestParameters:completionHandler:")
    void customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler(byte flags,
            @NInt long customCommandCode, NSData customRequestParameters,
            @ObjCBlock(name = "call_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler") Block_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler {
        @Generated
        void call_customCommandWithRequestFlagCustomCommandCodeCustomRequestParametersCompletionHandler(
                NSData customResponseParameters, NSError error);
    }

    /**
     * extendedLockBlockWithRequestFlags:blockNumber:completionHandler:
     * <p>
     * Extende lock single block command (0x32 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockNumber       2 bytes block number, valid range from 0 to 65535 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("extendedLockBlockWithRequestFlags:blockNumber:completionHandler:")
    void extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, @NInt long blockNumber,
            @ObjCBlock(name = "call_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler") Block_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_extendedLockBlockWithRequestFlagsBlockNumberCompletionHandler(NSError error);
    }

    /**
     * extendedReadMultipleBlocksWithRequestFlags:blockRange:completionHandler:
     * <p>
     * Extended read multiple block command (0x33 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 65535 inclusively.  Valid length is 1 to 65536 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully read data blocks will be returned from NSData object.  If Option flag in the request flags is set,
     *                          then first byte of each returned data blocks will contain the associated block security status.
     */
    @Generated
    @Selector("extendedReadMultipleBlocksWithRequestFlags:blockRange:completionHandler:")
    void extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(byte flags, @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler") Block_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler {
        @Generated
        void call_extendedReadMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(
                NSArray<? extends NSData> dataBlocks, NSError error);
    }

    /**
     * extendedReadSingleBlockWithRequestFlags:blockNumber:completionHandler:
     * <p>
     * Extended read single block command (0x30 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockNumber       2 bytes block number, valid range from 0 to 65535 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          If Option flag in the request flags is set, then first byte of the returned data block will contain the associated block security status.
     */
    @Generated
    @Selector("extendedReadSingleBlockWithRequestFlags:blockNumber:completionHandler:")
    void extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, @NInt long blockNumber,
            @ObjCBlock(name = "call_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler") Block_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_extendedReadSingleBlockWithRequestFlagsBlockNumberCompletionHandler(NSData data, NSError error);
    }

    /**
     * extendedWriteSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:
     * <p>
     * Extended write single block command (0x31 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockNumber       2 bytes block number, valid range from 0 to 65535 inclusively.
     * @param dataBlock         A single block of data.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("extendedWriteSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:")
    void extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(byte flags,
            @NInt long blockNumber, NSData dataBlock,
            @ObjCBlock(name = "call_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler") Block_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler {
        @Generated
        void call_extendedWriteSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(NSError error);
    }

    /**
     * getMultipleBlockSecurityStatusWithRequestFlag:blockRange:completionHandler:
     * <p>
     * Get multiple block security status command (0x2C command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 255 inclusively.  Valid length is 1 to 256 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          The 8 bits security status of the requested blocks are returned in NSArray; the array will be empty when error occurs.
     */
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
                NSArray<? extends NSNumber> securityStatus, NSError error);
    }

    /**
     * getSystemInfoWithRequestFlag:completionHandler:
     * <p>
     * Use the replacement -getSystemInfoAndUIDWithRequestFlag:completionHandler:.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Value of -1 will be returned from dsfid, afi, blockSize, blockCount, or icReference if tag response does not contain the information.
     *                          blockSize returns the actual block size in bytes ranged from 1 to 32.  blockCount returns the actual number of blocks
     *                          ranged from 1 to 256 blocks.
     */
    @Generated
    @Selector("getSystemInfoWithRequestFlag:completionHandler:")
    void getSystemInfoWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_getSystemInfoWithRequestFlagCompletionHandler") Block_getSystemInfoWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSystemInfoWithRequestFlagCompletionHandler {
        @Generated
        void call_getSystemInfoWithRequestFlagCompletionHandler(@NInt long dsfid, @NInt long afi, @NInt long blockSize,
                @NInt long blockCount, @NInt long icReference, NSError error);
    }

    /**
     * The IC manufacturer code (bits 56 – 49) in UID according to ISO/IEC 7816-6:2004.
     */
    @Generated
    @Selector("icManufacturerCode")
    @NUInt
    long icManufacturerCode();

    /**
     * The IC serial number (bits 48 – 1) in UID assigned by the manufacturer.  Data is in Big Endian byte order.
     */
    @Generated
    @Selector("icSerialNumber")
    NSData icSerialNumber();

    /**
     * The 64 bit hardware UID of the tag. Data is in Big Endian byte order.
     */
    @Generated
    @Selector("identifier")
    NSData identifier();

    /**
     * lockAFIWithRequestFlag:completionHandler:
     * <p>
     * Lock AFI command (0x28 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("lockAFIWithRequestFlag:completionHandler:")
    void lockAFIWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_lockAFIWithRequestFlagCompletionHandler") Block_lockAFIWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockAFIWithRequestFlagCompletionHandler {
        @Generated
        void call_lockAFIWithRequestFlagCompletionHandler(NSError error);
    }

    /**
     * lockBlockWithRequestFlags:blockNumber:completionHandler:
     * <p>
     * Lock block command (0x22 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockNumber       Block number. Blocks are numbered from 0 to 255 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully read data blocks will be returned from NSData object.
     */
    @Generated
    @Selector("lockBlockWithRequestFlags:blockNumber:completionHandler:")
    void lockBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, byte blockNumber,
            @ObjCBlock(name = "call_lockBlockWithRequestFlagsBlockNumberCompletionHandler") Block_lockBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_lockBlockWithRequestFlagsBlockNumberCompletionHandler(NSError error);
    }

    /**
     * lockDFSIDWithRequestFlag:completionHandler:
     * <p>
     * Use the replacement -lockDSFIDWithRequestFlag:completionHandler:.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("lockDFSIDWithRequestFlag:completionHandler:")
    void lockDFSIDWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_lockDFSIDWithRequestFlagCompletionHandler") Block_lockDFSIDWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDFSIDWithRequestFlagCompletionHandler {
        @Generated
        void call_lockDFSIDWithRequestFlagCompletionHandler(NSError error);
    }

    /**
     * readMultipleBlocksWithConfiguration:completionHandler:
     * <p>
     * Performs read operation using Read Multiple Blocks command (0x23 command code) as defined in ISO15693-3 specification.
     * Multiple Read Multiple Blocks commands will be sent if necessary to complete the operation.
     *
     * @param readConfiguration Configuration For the Read Multiple Blocks command.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully read data blocks will be returned from NSData object.  All blocks are concatenated into the NSData object.
     */
    @Generated
    @Selector("readMultipleBlocksWithConfiguration:completionHandler:")
    void readMultipleBlocksWithConfigurationCompletionHandler(
            NFCISO15693ReadMultipleBlocksConfiguration readConfiguration,
            @ObjCBlock(name = "call_readMultipleBlocksWithConfigurationCompletionHandler") Block_readMultipleBlocksWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readMultipleBlocksWithConfigurationCompletionHandler {
        @Generated
        void call_readMultipleBlocksWithConfigurationCompletionHandler(NSData data, NSError error);
    }

    /**
     * readMultipleBlocksWithRequestFlags:blockRange:completionHandler:
     * <p>
     * Read multiple blocks command (0x23 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 255 inclusively.  Valid length is 1 to 256 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully read data blocks will be returned from NSArray of NSData object. If Option flag in the request flags is set,
     *                          then first byte of each returned data block will contain the associated block security status.  Each data block element
     *                          would have identical size.
     */
    @Generated
    @Selector("readMultipleBlocksWithRequestFlags:blockRange:completionHandler:")
    void readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(byte flags, @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler") Block_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler {
        @Generated
        void call_readMultipleBlocksWithRequestFlagsBlockRangeCompletionHandler(NSArray<? extends NSData> dataBlocks,
                NSError error);
    }

    /**
     * readSingleBlockWithRequestFlags:blockNumber:completionHandler:
     * <p>
     * Read single block command (0x20 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockNumber       Block number. Blocks are numbered from 0 to 255 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully read data blocks will be returned from NSData object. If Option flag in the request flags is set,
     *                          then first byte of data block will contain the associated block security status.
     */
    @Generated
    @Selector("readSingleBlockWithRequestFlags:blockNumber:completionHandler:")
    void readSingleBlockWithRequestFlagsBlockNumberCompletionHandler(byte flags, byte blockNumber,
            @ObjCBlock(name = "call_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler") Block_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler {
        @Generated
        void call_readSingleBlockWithRequestFlagsBlockNumberCompletionHandler(NSData data, NSError error);
    }

    /**
     * resetToReadyWithRequestFlags:completionHandler:
     * <p>
     * Reset To Ready command (0x26 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("resetToReadyWithRequestFlags:completionHandler:")
    void resetToReadyWithRequestFlagsCompletionHandler(byte flags,
            @ObjCBlock(name = "call_resetToReadyWithRequestFlagsCompletionHandler") Block_resetToReadyWithRequestFlagsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetToReadyWithRequestFlagsCompletionHandler {
        @Generated
        void call_resetToReadyWithRequestFlagsCompletionHandler(NSError error);
    }

    /**
     * selectWithRequestFlags:completionHandler:
     * <p>
     * Select command (0x25 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("selectWithRequestFlags:completionHandler:")
    void selectWithRequestFlagsCompletionHandler(byte flags,
            @ObjCBlock(name = "call_selectWithRequestFlagsCompletionHandler") Block_selectWithRequestFlagsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selectWithRequestFlagsCompletionHandler {
        @Generated
        void call_selectWithRequestFlagsCompletionHandler(NSError error);
    }

    /**
     * sendCustomCommandWithConfiguration:completionHandler:
     * <p>
     * Send a manufacturer dependent custom command using command code range from 0xA0 to 0xDF.  Refer to ISO15693-3
     * specification for details.
     *
     * @param commandConfiguration Configuration for the Manufacturer Custom Command.
     * @param completionHandler    Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                             A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                             responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("sendCustomCommandWithConfiguration:completionHandler:")
    void sendCustomCommandWithConfigurationCompletionHandler(NFCISO15693CustomCommandConfiguration commandConfiguration,
            @ObjCBlock(name = "call_sendCustomCommandWithConfigurationCompletionHandler") Block_sendCustomCommandWithConfigurationCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendCustomCommandWithConfigurationCompletionHandler {
        @Generated
        void call_sendCustomCommandWithConfigurationCompletionHandler(NSData customResponseParameters, NSError error);
    }

    /**
     * stayQuietWithCompletionHandler:
     * <p>
     * Stay quiet command (0x02 command code) as defined in ISO15693-3 specification.
     *
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("stayQuietWithCompletionHandler:")
    void stayQuietWithCompletionHandler(
            @ObjCBlock(name = "call_stayQuietWithCompletionHandler") Block_stayQuietWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stayQuietWithCompletionHandler {
        @Generated
        void call_stayQuietWithCompletionHandler(NSError error);
    }

    /**
     * writeAFIWithRequestFlag:afi:completionHandler:
     * <p>
     * Write AFI command (0x27 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param afi               Application Family Identifier.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("writeAFIWithRequestFlag:afi:completionHandler:")
    void writeAFIWithRequestFlagAfiCompletionHandler(byte flags, byte afi,
            @ObjCBlock(name = "call_writeAFIWithRequestFlagAfiCompletionHandler") Block_writeAFIWithRequestFlagAfiCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAFIWithRequestFlagAfiCompletionHandler {
        @Generated
        void call_writeAFIWithRequestFlagAfiCompletionHandler(NSError error);
    }

    /**
     * writeDSFIDWithRequestFlag:dsfid:completionHandler:
     * <p>
     * Write DSFID command (0x29 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param dsfid             Data Storage Format Identifier.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("writeDSFIDWithRequestFlag:dsfid:completionHandler:")
    void writeDSFIDWithRequestFlagDsfidCompletionHandler(byte flags, byte dsfid,
            @ObjCBlock(name = "call_writeDSFIDWithRequestFlagDsfidCompletionHandler") Block_writeDSFIDWithRequestFlagDsfidCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeDSFIDWithRequestFlagDsfidCompletionHandler {
        @Generated
        void call_writeDSFIDWithRequestFlagDsfidCompletionHandler(NSError error);
    }

    /**
     * writeMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:
     * <p>
     * Write multiple blocks command (0x24 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 255 inclusively.  Valid length is 1 to 256 inclusively.
     * @param dataBlocks        Blocks of data represent in NSArray of NSData.  The number of blocks shall match the length value of the blockRange parameter.
     *                          Each block element should have identical size and should match the physical block size of the tag.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("writeMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:")
    void writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler(byte flags,
            @ByValue NSRange blockRange, NSArray<? extends NSData> dataBlocks,
            @ObjCBlock(name = "call_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler") Block_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler {
        @Generated
        void call_writeMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler(NSError error);
    }

    /**
     * writeSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:
     * <p>
     * Write single block command (0x21 command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockNumber       Block number. Blocks are numbered from 0 to 255 inclusively.
     * @param dataBlock         A single block of data.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("writeSingleBlockWithRequestFlags:blockNumber:dataBlock:completionHandler:")
    void writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(byte flags, byte blockNumber,
            NSData dataBlock,
            @ObjCBlock(name = "call_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler") Block_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler {
        @Generated
        void call_writeSingleBlockWithRequestFlagsBlockNumberDataBlockCompletionHandler(NSError error);
    }

    /**
     * authenticateWithRequestFlags:cryptoSuiteIdentifier:message:completionHandler:
     * <p>
     * Authenticate command (0x35 command code) as defined in ISO15693-3 specification.  Please note that in-process reply is returned to the caller without any processing.
     *
     * @param flags                 Request flags.
     * @param cryptoSuiteIdentifier 8 bits Crypto Suite Indicator as defined in ISO/IEC 29167 specification.
     * @param message               Content of the Authenticate command as dictated by the Crypto Suite Indicator.
     * @param completionHandler     Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                              A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                              A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                              responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                              Successfully command response will be return as NSData object excluding the 8 bits response flag.
     */
    @Generated
    @Selector("authenticateWithRequestFlags:cryptoSuiteIdentifier:message:completionHandler:")
    void authenticateWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler(byte flags,
            @NInt long cryptoSuiteIdentifier, NSData message,
            @ObjCBlock(name = "call_authenticateWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler") Block_authenticateWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_authenticateWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler {
        @Generated
        void call_authenticateWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler(byte responseFlag,
                NSData response, NSError error);
    }

    /**
     * challengeWithRequestFlags:message:completionHandler:
     * <p>
     * Challenge command (0x39 command code) as defined in ISO15693-3 specification.
     *
     * @param flags                 Request flags.
     * @param cryptoSuiteIdentifier 8 bits Crypto Suite Indicator as defined in ISO/IEC 29167 specification.
     * @param message               Content of the Key Update command as dictated by the Crypto Suite Indicator used in Authenticate.
     * @param completionHandler     Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                              A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                              A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                              responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("challengeWithRequestFlags:cryptoSuiteIdentifier:message:completionHandler:")
    void challengeWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler(byte flags,
            @NInt long cryptoSuiteIdentifier, NSData message,
            @ObjCBlock(name = "call_challengeWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler") Block_challengeWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_challengeWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler {
        @Generated
        void call_challengeWithRequestFlagsCryptoSuiteIdentifierMessageCompletionHandler(NSError error);
    }

    /**
     * extendedFastReadMultipleBlocksWithRequestFlag:blockRange:completionHandler:
     * <p>
     * Fast read multiple blocks command (0x3D command code) as defined in ISO15693-3 specification.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     */
    @Generated
    @Selector("extendedFastReadMultipleBlocksWithRequestFlag:blockRange:completionHandler:")
    void extendedFastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler(byte flags,
            @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_extendedFastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler") Block_extendedFastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedFastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler {
        @Generated
        void call_extendedFastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler(
                NSArray<? extends NSData> dataBlocks, NSError error);
    }

    /**
     * extendedGetMultipleBlockSecurityStatusWithRequestFlag:blockRange:completionHandler:
     * <p>
     * Get multiple block security status command (0x3C command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 255 inclusively.  Valid length is 1 to 256 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          The 8 bits security status of the requested blocks are returned in NSArray; the array will be empty when error occurs.
     */
    @Generated
    @Selector("extendedGetMultipleBlockSecurityStatusWithRequestFlag:blockRange:completionHandler:")
    void extendedGetMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler(byte flags,
            @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_extendedGetMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler") Block_extendedGetMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedGetMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler {
        @Generated
        void call_extendedGetMultipleBlockSecurityStatusWithRequestFlagBlockRangeCompletionHandler(
                NSArray<? extends NSNumber> securityStatus, NSError error);
    }

    /**
     * extendedWriteMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:
     * <p>
     * Extended write multiple block command (0x34 command code) as defined in ISO15693-3 specification. Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 65535 inclusively.  Valid length is 1 to 65536 inclusively.
     * @param dataBlocks        Blocks of data represented in NSArray of NSData.  The number of blocks shall match the length value of the blockRange parameter.
     *                          Each block element should have identical size and should match the physical block size of the tag.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("extendedWriteMultipleBlocksWithRequestFlags:blockRange:dataBlocks:completionHandler:")
    void extendedWriteMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler(byte flags,
            @ByValue NSRange blockRange, NSArray<? extends NSData> dataBlocks,
            @ObjCBlock(name = "call_extendedWriteMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler") Block_extendedWriteMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_extendedWriteMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler {
        @Generated
        void call_extendedWriteMultipleBlocksWithRequestFlagsBlockRangeDataBlocksCompletionHandler(NSError error);
    }

    /**
     * fastReadMultipleBlocksWithRequestFlag:blockRange:completionHandler:
     * <p>
     * Fast read multiple blocks command (0x2D command code) as defined in ISO15693-3 specification.
     *
     * @param flags             Request flags.
     * @param blockRange        The range of blocks.  Valid start index range is 0 to 255 inclusively.  Valid length is 1 to 256 inclusively.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     */
    @Generated
    @Selector("fastReadMultipleBlocksWithRequestFlag:blockRange:completionHandler:")
    void fastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler(byte flags, @ByValue NSRange blockRange,
            @ObjCBlock(name = "call_fastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler") Block_fastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler {
        @Generated
        void call_fastReadMultipleBlocksWithRequestFlagBlockRangeCompletionHandler(NSArray<? extends NSData> dataBlocks,
                NSError error);
    }

    /**
     * getSystemInfoAndUIDWithRequestFlag:completionHandler:
     * <p>
     * Get system information command (0x2B command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Value of -1 will be returned from dsfid, afi, blockSize, blockCount, or icReference, and a nil UID value if tag response does not contain the information.
     *                          blockSize returns the actual block size in bytes ranged from 1 to 32.  blockCount returns the actual number of blocks
     *                          ranged from 1 to 256 blocks.  64bits UID value in little endian byte order from the response packet is returned.
     */
    @Generated
    @Selector("getSystemInfoAndUIDWithRequestFlag:completionHandler:")
    void getSystemInfoAndUIDWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_getSystemInfoAndUIDWithRequestFlagCompletionHandler") Block_getSystemInfoAndUIDWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getSystemInfoAndUIDWithRequestFlagCompletionHandler {
        @Generated
        void call_getSystemInfoAndUIDWithRequestFlagCompletionHandler(NSData uid, @NInt long dsfid, @NInt long afi,
                @NInt long blockSize, @NInt long blockCount, @NInt long icReference, NSError error);
    }

    /**
     * keyUpdateWithRequestFlags:message:completionHandler:
     * <p>
     * Key update command (0x36 command code) as defined in ISO15693-3 specification.  Please note that in-process reply is returned to the caller without any processing.
     *
     * @param flags             Request flags.
     * @param keyIdentifier     8 bits key identifier
     * @param message           Content of the Key Update command as dictated by the Crypto Suite Indicator used in Authenticate.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully command response will be return as NSData object excluding the 8 bits response flag.
     */
    @Generated
    @Selector("keyUpdateWithRequestFlags:keyIdentifier:message:completionHandler:")
    void keyUpdateWithRequestFlagsKeyIdentifierMessageCompletionHandler(byte flags, @NInt long keyIdentifier,
            NSData message,
            @ObjCBlock(name = "call_keyUpdateWithRequestFlagsKeyIdentifierMessageCompletionHandler") Block_keyUpdateWithRequestFlagsKeyIdentifierMessageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_keyUpdateWithRequestFlagsKeyIdentifierMessageCompletionHandler {
        @Generated
        void call_keyUpdateWithRequestFlagsKeyIdentifierMessageCompletionHandler(byte responseFlag, NSData response,
                NSError error);
    }

    /**
     * lockDSFIDWithRequestFlag:completionHandler:
     * <p>
     * Lock DSFID command (0x2A command code) as defined in ISO15693-3 specification.  Address flag is automatically
     * enforced by default and the tag's UID is sent with the command; setting RequestFlagSelect to flags will disable the Address flag.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     */
    @Generated
    @Selector("lockDSFIDWithRequestFlag:completionHandler:")
    void lockDSFIDWithRequestFlagCompletionHandler(byte flags,
            @ObjCBlock(name = "call_lockDSFIDWithRequestFlagCompletionHandler") Block_lockDSFIDWithRequestFlagCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDSFIDWithRequestFlagCompletionHandler {
        @Generated
        void call_lockDSFIDWithRequestFlagCompletionHandler(NSError error);
    }

    /**
     * readBufferWithRequestFlags:completionHandler:
     * <p>
     * Read buffer command (0x3A command code) as defined in ISO15693-3 specification.
     *
     * @param flags             Request flags.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.
     *                          A @link NFCISO15693TagResponseErrorKey @link/ in NSError userInfo dictionary is returned when the tag
     *                          responded to the command with an error, and the error code value is defined in ISO15693-3 specification.
     *                          Successfully command response will be return as NSData object excluding the 8 bits response flag.
     */
    @Generated
    @Selector("readBufferWithRequestFlags:completionHandler:")
    void readBufferWithRequestFlagsCompletionHandler(byte flags,
            @ObjCBlock(name = "call_readBufferWithRequestFlagsCompletionHandler") Block_readBufferWithRequestFlagsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readBufferWithRequestFlagsCompletionHandler {
        @Generated
        void call_readBufferWithRequestFlagsCompletionHandler(byte responseFlag, NSData data, NSError error);
    }

    /**
     * sendRequestWithFlag:commandCode:parameters:data:completionHandler:
     * <p>
     * Send a command according to the ISO15693-3 specification.  The request data frame is concatenation of 8 bits request flag, 8 bits command code, and optional data.
     * Total length of the data frame cannot exceed 256 bytes.  The 8 bits response flag and the data are returned in the completion handler.
     *
     * @param flags             Request flags.
     * @param commandCode       8 bits command code.
     * @param data              Data follows after the command code.
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     */
    @Generated
    @Selector("sendRequestWithFlag:commandCode:data:completionHandler:")
    void sendRequestWithFlagCommandCodeDataCompletionHandler(@NInt long flags, @NInt long commandCode, NSData data,
            @ObjCBlock(name = "call_sendRequestWithFlagCommandCodeDataCompletionHandler") Block_sendRequestWithFlagCommandCodeDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendRequestWithFlagCommandCodeDataCompletionHandler {
        @Generated
        void call_sendRequestWithFlagCommandCodeDataCompletionHandler(byte responseFlag, NSData _Nullable_result);
    }
}
