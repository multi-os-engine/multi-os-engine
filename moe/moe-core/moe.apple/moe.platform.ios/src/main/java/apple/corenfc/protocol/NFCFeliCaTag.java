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

/**
 * [@protocol] NFCFeliCaTag
 * 
 * A @link NFCTagReaderSession @link/ reader session returns an instance conforming to this protocol
 * when a FeliCa tag is detected. Unless it is specified all block completion handlers are dispatched on the
 * session work queue that is associated with the tag. Your process requires to include the
 * "com.apple.developer.nfc.readersession.formats" entitlement and the
 * "com.apple.developer.nfc.readersession.felica.systemcodes"
 * key in the application's Info.plist to receive this tag object from the @link NFCTagReaderSessionDelegate @link/
 * delegate.
 * [@link] NFCReaderErrorSecurityViolation @link/ will be returned from the @link NFCTagReaderSessionDelegate @link/
 * invalidation
 * method if the required entitlement is missing or "com.apple.developer.nfc.readersession.felica.systemcodes" does not
 * contain
 * at least one valid entry.
 * When the reader discovers a FeliCa tag it automatically performs a Polling command using the system code values
 * provided in the
 * "com.apple.developer.nfc.readersession.felica.systemcodes" in the specified array order. System code
 * specified in the array must not contain a wildcard value (0xFF) in the upper or the lower byte, i.e. full
 * matching value is required. The tag is returned from the [NFCTagReaderSessionDelegate readerSession:didDetectTags:]
 * call
 * on the first successful Polling command matching one of the system codes. Tag will not be returned
 * to the NFCTagReaderSessionDelegate if no matching system is found based on entries listed in the Info.plist.
 * Tag must be in the connected state for NFCNDEFTag protocol properties and methods to work correctly.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCFeliCaTag")
public interface NFCFeliCaTag extends NFCTag, NFCNDEFTag {
    /**
     * [@property] currentIDm Manufacturer ID of the currently selected system. Value is updated on each Polling command
     * execution.
     * It will be empty if system selection fails.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("currentIDm")
    NSData currentIDm();

    /**
     * [@property] currentSystemCode The system code most recently selected by the reader using the Polling command.
     * This will match one of the entries in the "com.apple.developer.nfc.readersession.felica.systemcodes"
     * in the Info.plist.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("currentSystemCode")
    NSData currentSystemCode();

    /**
     * pollingWithSystemCode:requestCode:timeSlot:completionHandler:
     * 
     * Polling command defined by FeliCa card specification. Refer to the FeliCa specification for details.
     * System code must be one of the provided values in the "com.apple.developer.nfc.readersession.felica.systemcodes"
     * in the Info.plist; @link NFCReaderErrorSecurityViolation @link/ will be returned when an invalid system code is
     * used.
     * Polling with wildcard value in the upper or lower byte is not supported.
     * 
     * API-Since: 13.0
     * 
     * @param systemCode        Designation of System Code. Wildcard value (0xFF) in the upper or the lower byte is not
     *                          supported.
     * @param requestCode       Designation of Requset Data output.
     * @param timeSlot          Maximum number of slots possible to respond.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation
     *                          succeeds, else all other return values shall be ignored. Non-zero length requestData is
     *                          return when
     *                          requestCode is a non-zero parameter and feature is supported by the tag. The @link
     *                          currentIDM @link/ property will be updated
     *                          on each execution, except when an invalid systemCode is provided and the existing
     *                          selected system will stay selected.
     */
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

    /**
     * readWithoutEncryptionWithServiceCodeList:blockList:completionHandler:
     * 
     * Read Without Encrypton command defined by FeliCa card specification. Refer to the FeliCa specification for
     * details.
     * 
     * API-Since: 13.0
     * 
     * @param serviceCodeList   Service Code list represented in a NSArray of NSData objects. Number of nodes specified
     *                          should be between 1 to 16 inclusive.
     *                          Each service code should be 2 bytes stored in Little Endian format.
     * @param blockList         Block List represent in a NSArray of NSData objects. 2-Byte or 3-Byte block list element
     *                          is supported.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored. Valid read data blocks (block length of
     *                          16 bytes)
     *                          are returned in NSArray of NSData objects when Status Flag 1 equals zero.
     */
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

    /**
     * requestResponseWithCompletionHandler:
     * 
     * Request Response command defined by FeliCa card specification. Refer to the FeliCa specification for details.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored. Valid mode value ranges from 0 to 3
     *                          inclusively.
     */
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

    /**
     * requestServiceV2WithNodeCodeList:completionHandler:
     * 
     * Request Service V2 command defined by FeliCa card specification. Refer to the FeliCa specification for details.
     * 
     * API-Since: 13.0
     * 
     * @param nodeCodeList      Node Code list represent in a NSArray of NSData. Number of nodes specified should be
     *                          between 1 to 32 inclusive.
     *                          Each node code should be 2 bytes stored in Little Endian format.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored. encryptionIdentifier value shall be
     *                          ignored if Status Flag 1 value indicates an error.
     *                          nodeKeyVerionListAES and nodeKeyVersionListDES may be empty depending on the Status Flag
     *                          1 value and the Encryption Identifier value.
     *                          The 2 bytes node key version (AES and DES) is in Little Endian format.
     */
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

    /**
     * requestServiceWithNodeCodeList:completionHandler:
     * 
     * Request Service command defined by FeliCa card specification. Refer to the FeliCa specification for details.
     * 
     * API-Since: 13.0
     * 
     * @param nodeCodeList      Node Code list represented in a NSArray of NSData objects. Number of nodes specified
     *                          should be between 1 to 32 inclusive.
     *                          Each node code should be 2 bytes stored in Little Endian format.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored. Node key version list is return as
     *                          NSArray of NSData objects,
     *                          and each data object is stored in Little Endian format per FeliCa specification.
     */
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

    /**
     * requestSpecificationVersionWithCompletionHandler:
     * 
     * Request Specification Verison command defined by FeliCa card specification. This command supports response format
     * version `00`h.
     * Refer to the FeliCa specification for details.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored. basicVersion and optionVersion may be
     *                          empty depending on the Status Flag 1 value
     *                          and if the tag supports AES/DES.
     */
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

    /**
     * requestSystemCodeWithCompletionHandler:
     * 
     * Request System Code command defined by FeliCa card specification. Refer to the FeliCa specification for details.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored. Each system code is 2 bytes stored in
     *                          Little Endian format.
     */
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

    /**
     * resetModeWithCompletionHandler:
     * 
     * Reset Mode command defined by FeliCa card specification. Refer to the FeliCa specification for details.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored.
     */
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

    /**
     * sendFeliCaCommandPacket:completionHandler:
     * 
     * Transmission of FeliCa Command Packet Data at the applicaiton layer. Refer to the FeliCa specification for
     * details.
     * Manufacturer ID (IDm) of the currently selected system can be read from the currentIDm property.
     * 
     * API-Since: 13.0
     * 
     * @param commandPacket     Command packet send to the FeliCa card. Maximum packet length is 254. Data length (LEN)
     *                          byte and CRC bytes are calculated and inserted
     *                          automatically to the provided packet data frame.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if operation
     *                          succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with
     *                          the tag.
     */
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

    /**
     * writeWithoutEncryptionWithServiceCodeList:blockList:blockData:completionHandler:
     * 
     * Write Without Encrypton command defined by FeliCa card specification. Refer to the FeliCa specification for
     * details.
     * 
     * API-Since: 13.0
     * 
     * @param serviceCodeList   Service Code list represented in a NSArray of NSData objects. Number of nodes specified
     *                          should be between 1 to 16 inclusive.
     *                          Each service code should be 2 bytes stored in Little Endian format.
     * @param blockList         Block List represent in a NSArray of NSData objects. Total blockList items and blockData
     *                          items should match.
     *                          2-Byte or 3-Byte block list element is supported.
     * @param blockData         Block data represent in a NSArray of NSData objects. Total blockList items and blockData
     *                          items should match.
     *                          Data block should be 16 bytes in length.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if the
     *                          contactless transceive operation succeeds,
     *                          else all other return values shall be ignored.
     */
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
