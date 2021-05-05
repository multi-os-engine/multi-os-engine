package apple.corenfc.protocol;

import apple.corenfc.NFCVASReaderSession;
import apple.corenfc.NFCVASResponse;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]    NFCVASReaderSessionDelegate
 * 
 * Value Added Service (VAS) reader session callbacks.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCVASReaderSessionDelegate")
public interface NFCVASReaderSessionDelegate {
    /**
     * readerSession:didInvalidateWithError:
     * 
     * Gets called when a session becomes invalid.  At this point the client is expected to discard
     *                  the returned session object.
     * 
     * @param session   The session object that is invalidated.
     * @param error     The error indicates the invalidation reason.
     */
    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(NFCVASReaderSession session, NSError error);

    /**
     * readerSession:didReceiveVASResponses:
     * 
     * Gets called when the reader completes the requested VAS transaction.  Polling
     *                  is automatically restarted once the detected tag is removed from the reader's read range.
     * 
     * @param session   The session object used for tag detection.
     * @param responses Array of @link NFCVASResponse @link/ objects.  The order of the response objects follows the
     *                  sequence of GET VAS DATA sent by the reader session.
     */
    @Generated
    @Selector("readerSession:didReceiveVASResponses:")
    void readerSessionDidReceiveVASResponses(NFCVASReaderSession session, NSArray<? extends NFCVASResponse> responses);

    /**
     * readerSessionDidBecomeActive:
     * 
     * Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for VAS tags.
     *                  The @link readerSession:didReceiveVASResponses: @link/ will be called when a VAS transaction is completed.
     * 
     * @param session   The session object in the active state.
     */
    @Generated
    @IsOptional
    @Selector("readerSessionDidBecomeActive:")
    default void readerSessionDidBecomeActive(NFCVASReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}