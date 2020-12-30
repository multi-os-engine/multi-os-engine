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

/**
 * @protocol NFCISO7816Tag
 * 
 * @discussion  A @link NFCTagReaderSession @link/ reader session returns an instance conforming to this protocol
 *              when an ISO7816 compatible tag is detected.  Unless it is specified all block completion handlers are dispatched on the
 *              session work queue that is associated with the tag.  Your process requires to include the
 *              "com.apple.developer.nfc.readersession.formats" entitlement and the "com.apple.developer.nfc.readersession.iso7816.select-identifiers"
 *              key in the application's Info.plist to receive this tag object from the @link NFCTagReaderSessionDelegate @link/ delegate.
 *              @link NFCReaderErrorSecurityViolation @link/ will be returned from the @link NFCTagReaderSessionDelegate @link/ invalidation
 *              method if the required entitlement is missing or "com.apple.developer.nfc.readersession.iso7816.select-identifiers" does not contain
 *              at least one valid entry.
 *              When the reader discovered a compatible ISO7816 tag it automatically performs a SELECT command (by DF name) using the values provided in
 *              "com.apple.developer.nfc.readersession.iso7816.select-identifiers" in the specified array order.  The tag is
 *              returned from the [NFCTagReaderSessionDelegate readerSession:didDetectTags:] call on the first successful SELECT command.
 *              The initialSelectedAID property returns the application identifier of the selected application.  Tag will not be returned
 *              to the NFCTagReaderSessionDelegate if no application described in "com.apple.developer.nfc.readersession.iso7816.select-identifiers"
 *              is found.  Tag must be in the connected state for NFCNDEFTag protocol properties and methods to work correctly.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCISO7816Tag")
public interface NFCISO7816Tag extends NFCTag, NFCNDEFTag {
    /**
     * @discussion The optional Application Data bytes extracted from the Type B Answer To Request response.
     */
    @Generated
    @Selector("applicationData")
    NSData applicationData();

    /**
     * @discussion The optional historical bytes extracted from the Type A Answer To Select response.
     */
    @Generated
    @Selector("historicalBytes")
    NSData historicalBytes();

    /**
     * @discussion The hardware UID of the tag.
     */
    @Generated
    @Selector("identifier")
    NSData identifier();

    /**
     * @property initialSelectedAID The Hex string of the application identifier (DF name) selected by the reader when the tag is discovered.
     *                              This will match one of the entries in the "com.apple.developer.nfc.readersession.iso7816.select-identifiers"
     *                              in the Info.plist.
     */
    @Generated
    @Selector("initialSelectedAID")
    String initialSelectedAID();

    /**
     * @discussion Indicates if @link applicationData @link/ follows proprietary data coding.  If false, the format of the application data is
     *             defined in the ISO14443-3 specification.
     */
    @Generated
    @Selector("proprietaryApplicationDataCoding")
    boolean proprietaryApplicationDataCoding();

    /**
     * @method sendCommandAPDU:completionHandler:
     * 
     * @param apdu              The command APDU object
     * @param completionHandler Completion handler called when the operation is completed.  error is nil if operation succeeds.
     *                          A @link NFCErrorDomain @link/ error is returned when there is a communication issue with the tag.  responseData may be
     *                          empty.  Command processing status bytes (SW1-SW2) are always valid.
     * 
     * @discussion  Send a command APDU to the tag and receives a response APDU.  Note that a SELECT command with a P1 value of 0x04 (seelction by DF name)
     *              will be checked against the values listed in the "com.apple.developer.nfc.readersession.iso7816.select-identifiers" in the Info.plist.
     *              Selecting an application outside of the permissible list will result in a NFCReaderErrorSecurityViolation error.
     */
    @Generated
    @Selector("sendCommandAPDU:completionHandler:")
    void sendCommandAPDUCompletionHandler(NFCISO7816APDU apdu,
            @ObjCBlock(name = "call_sendCommandAPDUCompletionHandler") Block_sendCommandAPDUCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendCommandAPDUCompletionHandler {
        @Generated
        void call_sendCommandAPDUCompletionHandler(NSData responseData, byte sw1, byte sw2, NSError error);
    }
}