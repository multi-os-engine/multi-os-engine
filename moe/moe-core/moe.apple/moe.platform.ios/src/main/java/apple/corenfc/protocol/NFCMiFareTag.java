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

/**
 * [@protocol] NFCMiFareTag
 * 
 * A @link NFCTagReaderSession @link/ reader session returns an instance conforming to this protocol when a MiFare tag
 * is detected. Unless it is specified
 * all block completion handlers are dispatched on the session work queue that is associated with the tag. Your process
 * requires to include the
 * "com.apple.developer.nfc.readersession.formats" entitlement to receive this tag object from the @link
 * NFCTagReaderSessionDelegate @link/ delegate.
 * Tag must be in the connected state for NFCNDEFTag protocol properties and methods to work correctly.
 * [@link] NFCReaderErrorSecurityViolation @link/ will be returned from the @link NFCTagReaderSessionDelegate @link/
 * invalidation method if the required entitlement
 * is missing when session is started.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCMiFareTag")
public interface NFCMiFareTag extends NFCTag, NFCNDEFTag {
    /**
     * The optional historical bytes extracted from the Answer To Select response.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("historicalBytes")
    NSData historicalBytes();

    /**
     * The hardware UID of the tag.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("identifier")
    NSData identifier();

    /**
     * [@property] mifareFamily MiFare product type identifier.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("mifareFamily")
    @NUInt
    long mifareFamily();

    /**
     * sendMiFareCommand:completionHandler:
     * 
     * Send native MIFARE command to a tag. Support MIFARE UltraLight, Plus, and DESFire products.
     * Crypto1 protocol is not supported. Command chainning is handled internally by the method and the full response
     * composed of the
     * individual fragment is returned in the completion handler.
     * 
     * API-Since: 13.0
     * 
     * @param command           The complete MiFare command. CRC bytes are calculated and inserted automatically to the
     *                          provided packet data frame.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if operation
     *                          succeeds. A @link NFCErrorDomain @link/ error
     *                          is returned when there is a communication issue with the tag. Successfully read data
     *                          blocks will be returned from the NSData object.
     */
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

    /**
     * sendMiFareISO7816Command:completionHandler:
     * 
     * Send a ISO7816 command APDU to the tag and receives a response APDU. Only available when @link
     * mifareFamily @link/ returns NFCMiFarePlus, NFCMiFareDESFire.
     * 
     * API-Since: 13.0
     * 
     * @param apdu              The ISO7816-4 command APDU object.
     * @param completionHandler Completion handler called when the operation is completed. error is nil if operation
     *                          succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with
     *                          the tag or tag does not support ISO7816-4 commands,
     *                          and all other parameters should be ignore.
     */
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
